package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class complete implements SaversKtExternalSyntheticLambda29<Drawable> {
    private final boolean onExtraCallback;
    private final SaversKtExternalSyntheticLambda29<Bitmap> onExtraCallbackWithResult;

    public SaversKtExternalSyntheticLambda29<BitmapDrawable> onExtraCallback() {
        return this;
    }

    public complete(SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29, boolean z) {
        this.onExtraCallbackWithResult = saversKtExternalSyntheticLambda29;
        this.onExtraCallback = z;
    }

    @Override // o.SaversKtExternalSyntheticLambda29
    public Resource<Drawable> transform(@NonNull Context context, @NonNull Resource<Drawable> resource, int i2, int i3) {
        Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5OnNavigationEvent = Glide.onNavigationEvent(context).onNavigationEvent();
        Drawable drawableIAuthTabCallback = resource.IAuthTabCallback();
        Resource<Bitmap> resourceOnExtraCallbackWithResult = executeListener.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda5OnNavigationEvent, drawableIAuthTabCallback, i2, i3);
        if (resourceOnExtraCallbackWithResult == null) {
            if (!this.onExtraCallback) {
                return resource;
            }
            throw new IllegalArgumentException("Unable to convert " + drawableIAuthTabCallback + " to a Bitmap");
        }
        Resource<Bitmap> resourceTransform = this.onExtraCallbackWithResult.transform(context, resourceOnExtraCallbackWithResult, i2, i3);
        if (resourceTransform.equals(resourceOnExtraCallbackWithResult)) {
            resourceTransform.asBinder();
            return resource;
        }
        return onNavigationEvent(context, resourceTransform);
    }

    private Resource<Drawable> onNavigationEvent(Context context, Resource<Bitmap> resource) {
        return removeWaiter.onExtraCallback(context.getResources(), resource);
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        if (obj instanceof complete) {
            return this.onExtraCallbackWithResult.equals(((complete) obj).onExtraCallbackWithResult);
        }
        return false;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.onExtraCallbackWithResult.updateDiskCacheKey(messageDigest);
    }
}
