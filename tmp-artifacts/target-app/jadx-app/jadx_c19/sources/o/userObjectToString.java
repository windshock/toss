package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class userObjectToString implements ResourceDecoder<ParcelFileDescriptor, Bitmap> {
    private final Api33ImplExternalSyntheticLambda0 onExtraCallbackWithResult;

    public userObjectToString(Api33ImplExternalSyntheticLambda0 api33ImplExternalSyntheticLambda0) {
        this.onExtraCallbackWithResult = api33ImplExternalSyntheticLambda0;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return onExtraCallbackWithResult(parcelFileDescriptor) && this.onExtraCallbackWithResult.onExtraCallback(parcelFileDescriptor);
    }

    private boolean onExtraCallbackWithResult(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Resource<Bitmap> onNavigationEvent(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return this.onExtraCallbackWithResult.onWarmupCompleted(parcelFileDescriptor, i2, i3, saversKtExternalSyntheticLambda30);
    }
}
