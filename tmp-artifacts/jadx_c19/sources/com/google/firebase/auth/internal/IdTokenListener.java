package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import com.google.firebase.internal.InternalTokenResult;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface IdTokenListener {
    void onIdTokenChanged(@NonNull InternalTokenResult internalTokenResult);
}
