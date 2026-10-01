package o;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.RequestHandler;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getICacheDir extends onInterstitialImpression<getAdxId> {
    private final int extraCallbackWithResult;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public getICacheDir onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getICacheDir onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getICacheDir onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getICacheDir onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getICacheDir onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public getICacheDir onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getICacheDir onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    @Override // o.onInterstitialImpression
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getICacheDir onExtraCallbackWithResult(@NonNull getAdxId getadxid) {
        super.onExtraCallbackWithResult((getICacheDir) getadxid);
        return this;
    }

    int IAuthTabCallback() {
        return this.extraCallbackWithResult;
    }
}
