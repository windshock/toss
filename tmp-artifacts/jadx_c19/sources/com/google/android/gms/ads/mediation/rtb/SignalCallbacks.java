package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SignalCallbacks {
    void onFailure(@NonNull AdError adError);

    void onSuccess(@NonNull String str);
}
