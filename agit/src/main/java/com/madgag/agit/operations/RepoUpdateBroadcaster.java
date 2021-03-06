package com.madgag.agit.operations;


import android.content.Context;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.io.File;

import static com.madgag.agit.GitIntents.broadcastIntentForRepoStateChange;

public class RepoUpdateBroadcaster {

    @Inject Context context;
    @Inject @Named("gitdir") File gitdir;

    public void broadcastUpdate() {
        context.sendBroadcast(broadcastIntentForRepoStateChange(gitdir));
    }
}
