package com.google.firebase.appcheck.interop;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface InteropAppCheckTokenProvider {
    void addAppCheckTokenListener(@NonNull AppCheckTokenListener appCheckTokenListener);

    Task<AppCheckTokenResult> getToken(boolean z);

    void removeAppCheckTokenListener(@NonNull AppCheckTokenListener appCheckTokenListener);
}
