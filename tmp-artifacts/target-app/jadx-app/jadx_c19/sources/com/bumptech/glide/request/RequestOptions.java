package com.bumptech.glide.request;

import androidx.annotation.NonNull;
import o.SaversKtExternalSyntheticLambda26;
import o.SaversKtExternalSyntheticLambda58;
import o.setTranslationX;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RequestOptions extends setTranslationX<RequestOptions> {
    public static RequestOptions onExtraCallbackWithResult(@NonNull SaversKtExternalSyntheticLambda58 saversKtExternalSyntheticLambda58) {
        return new RequestOptions().IAuthTabCallback(saversKtExternalSyntheticLambda58);
    }

    public static RequestOptions onWarmupCompleted(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        return new RequestOptions().onExtraCallbackWithResult(saversKtExternalSyntheticLambda26);
    }

    public static RequestOptions onNavigationEvent(@NonNull Class<?> cls) {
        return new RequestOptions().IAuthTabCallback(cls);
    }
}
