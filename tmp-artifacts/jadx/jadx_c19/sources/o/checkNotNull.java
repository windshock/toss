package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class checkNotNull extends BitmapTransformation {
    private static final byte[] onNavigationEvent = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(SaversKtExternalSyntheticLambda26.IAuthTabCallback);

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, int i2, int i3) {
        return maybePropagateCancellationTo.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda5, bitmap, i2, i3);
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        return obj instanceof checkNotNull;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(onNavigationEvent);
    }
}
