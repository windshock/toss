package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Resource;
import o.SaversKtExternalSyntheticLambda29;
import o.Savers_androidKtExternalSyntheticLambda5;
import o.applyConstraintsFromLayoutParams;
import o.setUpdateBlock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BitmapTransformation implements SaversKtExternalSyntheticLambda29<Bitmap> {
    protected abstract Bitmap transform(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, int i2, int i3);

    @Override // o.SaversKtExternalSyntheticLambda29
    public final Resource<Bitmap> transform(@NonNull Context context, @NonNull Resource<Bitmap> resource, int i2, int i3) {
        if (!applyConstraintsFromLayoutParams.onExtraCallback(i2, i3)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5OnNavigationEvent = Glide.onNavigationEvent(context).onNavigationEvent();
        Bitmap bitmapIAuthTabCallback = resource.IAuthTabCallback();
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmapIAuthTabCallback.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmapIAuthTabCallback.getHeight();
        }
        Bitmap bitmapTransform = transform(savers_androidKtExternalSyntheticLambda5OnNavigationEvent, bitmapIAuthTabCallback, i2, i3);
        return bitmapIAuthTabCallback.equals(bitmapTransform) ? resource : setUpdateBlock.onWarmupCompleted(bitmapTransform, savers_androidKtExternalSyntheticLambda5OnNavigationEvent);
    }
}
