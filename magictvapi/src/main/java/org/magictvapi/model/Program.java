package org.magictvapi.model;

import org.magictvapi.Callback;

import java.util.List;

/**
 * Created by thomas on 11/03/2016.
 *
 * A program have a list of videos like Game of thrones
 */
public abstract class Program extends Tile {

    /**
     * load videos and return the video list
     *
     * @param callback the async callback method
     */
    public abstract void getVideos(Callback<List<Video>> callback);
}
