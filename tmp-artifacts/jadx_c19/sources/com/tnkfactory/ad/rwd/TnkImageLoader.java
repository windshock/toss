package com.tnkfactory.ad.rwd;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.tnkfactory.ad.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkImageLoader {
    public static final TnkImageLoader INSTANCE = new TnkImageLoader();

    public final void loadImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        RequestManager requestManagerOnExtraCallbackWithResult = Glide.onExtraCallbackWithResult(imageView);
        RequestOptions requestOptions = new RequestOptions();
        int i2 = R.drawable.tnk_offerwall_pre_loading_bg;
        requestManagerOnExtraCallbackWithResult.onNavigationEvent(requestOptions.IAuthTabCallback(i2).onNavigationEvent(i2)).onExtraCallbackWithResult(str).onExtraCallback(imageView);
    }
}
