package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CarouselExternalSyntheticLambda0 implements ResourceDecoder<SaversKtExternalSyntheticLambda15, Bitmap> {
    private final Savers_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult;

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda15 saversKtExternalSyntheticLambda15, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return true;
    }

    public CarouselExternalSyntheticLambda0(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) {
        this.onExtraCallbackWithResult = savers_androidKtExternalSyntheticLambda5;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Resource<Bitmap> onNavigationEvent(@NonNull SaversKtExternalSyntheticLambda15 saversKtExternalSyntheticLambda15, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return setUpdateBlock.onWarmupCompleted(saversKtExternalSyntheticLambda15.asBinder(), this.onExtraCallbackWithResult);
    }
}
