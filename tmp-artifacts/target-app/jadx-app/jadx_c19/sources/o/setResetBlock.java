package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setResetBlock extends BitmapTransformation {
    private static final byte[] onExtraCallbackWithResult = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(SaversKtExternalSyntheticLambda26.IAuthTabCallback);

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, int i2, int i3) {
        return maybePropagateCancellationTo.IAuthTabCallback(savers_androidKtExternalSyntheticLambda5, bitmap, i2, i3);
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        return obj instanceof setResetBlock;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(onExtraCallbackWithResult);
    }
}
