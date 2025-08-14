package com.fininfra.youtube;

import java.util.logging.Level;

public class RealYouTube implements YouTubeService{
    public RealYouTube() {
        logger.log(Level.INFO,"Real YouTube service initialized, connection done");
    }
    @Override
    public Video getVideo(String videoId) {
        logger.log(Level.INFO,"Fetching video from the real YouTube service... {0} ", videoId);
        return new Video(videoId, "Sample Video", "This is a sample video content.", "sampleUser");
    }
    @Override
    public void uploadVideo(Video video) {
        logger.log(Level.INFO,"Uploading video to the real YouTube service: {0}-{1} " , new Object[] {video.getId(),video.getName()});
    }
    @Override
    public void updateVideo(Video video) {
        logger.log(Level.INFO,"Updating video in the real YouTube service: {0}-{1} " , new Object[] {video.getId(),video.getName()});
    }
}
