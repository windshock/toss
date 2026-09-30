package com.samsung.android.ssiframework.sdk;

import android.graphics.Bitmap;
import com.samsung.android.ssiframework.sdk.data.LivenessResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface AuthFromGovResultListenerV11 {
    void onError(int i, @Nullable String str);

    void onFail(int i, @Nullable String str);

    void onHelp(int i, @Nullable String str);

    void onPreview(@Nullable Bitmap bitmap, @NotNull LivenessResult livenessResult);

    void onSuccess(@Nullable String str);
}
