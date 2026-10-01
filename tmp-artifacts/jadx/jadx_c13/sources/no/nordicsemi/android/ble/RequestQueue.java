package no.nordicsemi.android.ble;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Deque;
import java.util.LinkedList;
import no.nordicsemi.android.ble.Request;
import o.TTAdConstant;
import o.TTC;
import o.getIsSelected;
import o.getPA;
import o.isUseTextureView;
import o.setIsSelected;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RequestQueue extends getIsSelected {
    private final Deque<Request> readTypedObject;

    RequestQueue() {
        super(Request.Type.SET);
        this.readTypedObject = new LinkedList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public RequestQueue onNavigationEvent(@NonNull RequestHandler requestHandler) {
        super.onNavigationEvent(requestHandler);
        return this;
    }

    @Override // o.getIsSelected, no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public RequestQueue onExtraCallbackWithResult(@Nullable Handler handler) {
        super.onExtraCallbackWithResult(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public RequestQueue onExtraCallbackWithResult(@NonNull TTC ttc) {
        super.onExtraCallbackWithResult(ttc);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public RequestQueue onNavigationEvent(@NonNull TTAdConstant tTAdConstant) {
        super.onNavigationEvent(tTAdConstant);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public RequestQueue onExtraCallbackWithResult(@NonNull isUseTextureView isusetextureview) {
        super.onExtraCallbackWithResult(isusetextureview);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public RequestQueue onWarmupCompleted(@NonNull setIsSelected setisselected) {
        super.onWarmupCompleted(setisselected);
        return this;
    }

    @Override // no.nordicsemi.android.ble.Request
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public RequestQueue onExtraCallback(@NonNull getPA getpa) {
        super.onExtraCallback(getpa);
        return this;
    }

    public void IAuthTabCallback(@NonNull Request request) {
        this.readTypedObject.addFirst(request);
    }

    public boolean onWarmupCompleted() {
        return this.readTypedObject.isEmpty();
    }

    @Override // o.getIsSelected
    public void cw_() {
        onExtraCallbackWithResult();
        super.cw_();
    }

    public Request onExtraCallback() {
        try {
            return this.readTypedObject.remove();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean IAuthTabCallback() {
        return (this.onTransact || this.readTypedObject.isEmpty()) ? false : true;
    }

    public void onExtraCallbackWithResult() {
        this.readTypedObject.clear();
    }
}
