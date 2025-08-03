package com.fininfra.impl.abstract_impl.file_system;

import com.fininfra.intf.abstract_intf.FileSystem;

import java.util.logging.Level;

public class WIndowsFileSystem implements FileSystem {
    public String readFile(String path){
        return "Reading file from Windows file system at " + path;
    }
    public void writeFile(String path, String content) {
        logger.log(Level.INFO, "Writing file to Windows file system at " + path + " with content: " + content);
    }
}
