package org.magictvapi.channel.pluzz.model;

import org.magictvapi.Callback;
import org.magictvapi.channel.pluzz.loader.PluzzTvProgramLoader;
import org.magictvapi.model.Channel;
import org.magictvapi.model.Folder;
import org.magictvapi.model.TvProgram;
import org.magictvapi.channel.pluzz.loader.PluzzFolderLoader;

import java.util.List;

/**
 * Created by thomas on 19/03/2016.
 */
public class France4Channel extends Channel {
    @Override
    public void getFolders(Callback<List<Folder>> callback) {
        new PluzzFolderLoader("france4").onSuccess(callback).execute();
    }

    @Override
    public void getTvProgram(Callback<TvProgram> callback) {
        new PluzzTvProgramLoader("france4", "France_4").onSuccess(callback).execute();
    }
}
