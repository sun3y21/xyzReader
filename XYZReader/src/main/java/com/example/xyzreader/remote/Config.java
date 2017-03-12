package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            String urlString="https://gist.githubusercontent.com/AtomicSpider/12b731e3e2a41f336cc1bd7fc904efbb/raw/3e6da3480b132f6d0eb99ca3711da4a2c901627e/data.json";
            //url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
            url = new URL(urlString);
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
