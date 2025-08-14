package com.fininfra;

// one good example of proxy is image gallery
// only thumbnail is loaded and shown. The actual high resolution image is loaded
// only when the user clicks on it. THe proxy image is created to hold the thumbnail
// This is an example of lazy loading. Used in case of intense memory usage.

import com.fininfra.youtube.ProxyYouTube;
import com.fininfra.youtube.Video;
import com.fininfra.youtube.YouTubeService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProxyPattern {
    private static final Logger logger = Logger.getLogger(ProxyPattern.class.getName());

    public static void run() {

        logger.log(Level.INFO, "Running Proxy Pattern...");

        YouTubeService proxyService = new ProxyYouTube();
        proxyService.uploadVideo(new Video("1", "Sample Video", "This is a sample video content.", "sampleUser"));
        proxyService.uploadVideo(new Video("2", "Another Video", "This is another video content.", "sampleUser"));

        proxyService.getVideo("1");
        proxyService.getVideo("2");

        // Adding a third video to test cache eviction
        proxyService.uploadVideo(new Video("3", "Third Video", "This is the third video content.", "sampleUser"));
        // Attempting to retrieve the first video, which should now be fetched from the real service
        proxyService.getVideo("1");
        proxyService.getVideo("2");

        proxyService.updateVideo(new Video("2", "Updated Video", "This is an updated video content.", "sampleUser"));
        proxyService.getVideo("2");
        proxyService.getVideo("3");

        logger.log(Level.INFO, "Running Proxy Pattern...");

    }
}