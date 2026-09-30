package com.tnkfactory.ad.off;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.data.AdListVo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AdEventListener {
    void onComplete(@NotNull AdListVo adListVo, boolean z);

    void onError(@NotNull TnkError tnkError);
}
