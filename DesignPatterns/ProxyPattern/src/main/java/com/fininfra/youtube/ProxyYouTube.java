package com.fininfra.youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

public class ProxyYouTube implements YouTubeService {
    private final RealYouTube realYouTube;
    List<Video> cachedVideos;
    private static final int MAX_CACHE_SIZE = 2;
    public ProxyYouTube() {
        this.realYouTube = new RealYouTube();
        this.cachedVideos = new ArrayList<>(MAX_CACHE_SIZE);
    }

    @Override
    public void uploadVideo(Video video) {
        realYouTube.uploadVideo(video);
        addCache(video);
    }

    private void addCache(Video video){
        if (cachedVideos.size() >= MAX_CACHE_SIZE) {
            cachedVideos.removeFirst();
        }
        logger.log(Level.INFO,"Adding cache with video: {0}-{1} " , new Object[] {video.getId(),video.getName()});
        cachedVideos.add(video);
    }

    @Override
    public void updateVideo(Video video) {
        realYouTube.updateVideo(video);
        updateCache(video);
    }

    private void updateCache(Video video) {
        for (Video cachedVideo : cachedVideos) {
            if (cachedVideo.getId().equals(video.getId())) {
                logger.log(Level.INFO,"Delete Video already existing in cache: {0}" , video.getId());
                cachedVideos.remove(cachedVideo);
                break;
            }
        }
        if (cachedVideos.size() >= MAX_CACHE_SIZE) {
            cachedVideos.removeFirst();
        }
        logger.log(Level.INFO,"Updating cache with video: {0}-{1} " , new Object[] {video.getId(),video.getName()});
        cachedVideos.add(video);
    }

    @Override
    public Video getVideo(String videoId) {
        Optional<Video> video = cachedVideos.stream().filter(v -> v.getId().equals(videoId)).findFirst();
        if (video.isEmpty()) {
            return realYouTube.getVideo(videoId);
        } else {
            logger.log(Level.WARNING,"Return Video from cache: {0}", videoId);
            return video.get();
        }
    }

}
