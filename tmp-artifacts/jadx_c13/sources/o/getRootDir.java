package o;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import no.nordicsemi.android.ble.Request;
import no.nordicsemi.android.ble.RequestHandler;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRootDir extends getIsSelected {
    public getRootDir(@NonNull Request.Type type) {
        super(type);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public getRootDir onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getRootDir onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getRootDir onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public getRootDir onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public getRootDir onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getRootDir onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getRootDir onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }
}
