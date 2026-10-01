package com.google.firebase.appdistribution;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class UpdateTask extends Task<Void> {
    public abstract UpdateTask addOnProgressListener(@NonNull OnProgressListener onProgressListener);

    public abstract UpdateTask addOnProgressListener(@Nullable Executor executor, @NonNull OnProgressListener onProgressListener);
}
