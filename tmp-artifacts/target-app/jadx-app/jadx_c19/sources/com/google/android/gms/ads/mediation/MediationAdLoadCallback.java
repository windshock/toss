package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(@NonNull AdError adError);

    MediationAdCallbackT onSuccess(@NonNull MediationAdT mediationadt);
}
