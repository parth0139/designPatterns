package com.fininfra.youtube;

import java.util.List;
import java.util.logging.Logger;

public interface YouTubeService {
    Logger logger = Logger.getLogger(YouTubeService.class.getName());
    void uploadVideo(Video video);
    void updateVideo(Video video);
    Video getVideo(String id);
}
