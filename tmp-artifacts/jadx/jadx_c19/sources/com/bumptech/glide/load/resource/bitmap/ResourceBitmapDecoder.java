package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import o.SaversKtExternalSyntheticLambda30;
import o.Savers_androidKtExternalSyntheticLambda5;
import o.executeListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ResourceBitmapDecoder implements ResourceDecoder<Uri, Bitmap> {
    private final Savers_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult;
    private final ResourceDrawableDecoder onNavigationEvent;

    public ResourceBitmapDecoder(ResourceDrawableDecoder resourceDrawableDecoder, Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) {
        this.onNavigationEvent = resourceDrawableDecoder;
        this.onExtraCallbackWithResult = savers_androidKtExternalSyntheticLambda5;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull Uri uri, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Resource<Bitmap> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        Resource<Drawable> resourceOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(uri, i2, i3, saversKtExternalSyntheticLambda30);
        if (resourceOnNavigationEvent == null) {
            return null;
        }
        return executeListener.onExtraCallbackWithResult(this.onExtraCallbackWithResult, resourceOnNavigationEvent.IAuthTabCallback(), i2, i3);
    }
}
