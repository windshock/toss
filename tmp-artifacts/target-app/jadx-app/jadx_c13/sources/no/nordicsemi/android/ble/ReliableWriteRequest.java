package no.nordicsemi.android.ble;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.TTAdConstant;
import o.TTC;
import o.getPA;
import o.isUseTextureView;
import o.setIsSelected;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReliableWriteRequest extends RequestQueue {
    private boolean onActivityResized;
    private boolean readTypedObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // no.nordicsemi.android.ble.RequestQueue, o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ReliableWriteRequest onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.RequestQueue, o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ReliableWriteRequest onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.RequestQueue
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ReliableWriteRequest onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.RequestQueue, no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ReliableWriteRequest onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.RequestQueue, no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ReliableWriteRequest onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.RequestQueue, no.nordicsemi.android.ble.Request
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ReliableWriteRequest onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.RequestQueue
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ReliableWriteRequest onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // no.nordicsemi.android.ble.RequestQueue
    public Request onExtraCallback() {
        if (!this.onActivityResized) {
            this.onActivityResized = true;
            return Request.getInterfaceDescriptor();
        }
        if (super.onWarmupCompleted()) {
            this.readTypedObject = true;
            if (this.extraCallbackWithResult) {
                return Request.onTransact();
            }
            return Request.access100();
        }
        return super.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // no.nordicsemi.android.ble.RequestQueue
    public boolean IAuthTabCallback() {
        if (!this.onActivityResized) {
            return super.IAuthTabCallback();
        }
        return !this.readTypedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // no.nordicsemi.android.ble.RequestQueue
    public void onExtraCallbackWithResult() {
        this.extraCallbackWithResult = true;
        super.onExtraCallbackWithResult();
    }
}
