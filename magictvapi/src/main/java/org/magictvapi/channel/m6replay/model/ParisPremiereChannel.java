package org.magictvapi.channel.m6replay.model;

import org.magictvapi.Callback;
import org.magictvapi.channel.m6replay.loader.M6TvProgramLoader;
import org.magictvapi.model.Channel;
import org.magictvapi.model.Folder;
import org.magictvapi.model.TvProgram;
import org.magictvapi.channel.m6replay.loader.M6TvFolderLoader;

import java.util.List;

/**
 * Created by thomas on 11/03/2016.
 */
public class ParisPremiereChannel extends Channel {
    public static final String CHAIN_NAME = "ParisPremiere_Replay";

    @Override
    public void getFolders(Callback<List<Folder>> callback) {
        new M6TvFolderLoader(CHAIN_NAME).onSuccess(callback).execute();
    }

    @Override
    public void getTvProgram(Callback<TvProgram> callback) {
        M6TvProgramLoader tvProgramLoader = new M6TvProgramLoader(145, "paris_premiere", 6727);
        tvProgramLoader.onSuccess(callback);
        tvProgramLoader.execute();
    }
}
