package com.tnkfactory.ad;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface TnkResultListener {
    void onFail(@NotNull TnkError tnkError);

    void onSuccess();
}
