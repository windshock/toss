package o;

import java.io.IOException;
import o.oq;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pj extends qye {
    @Override // o.qq
    void onWarmupCompleted(Appendable appendable, int i, oq.onExtraCallback onextracallback) {
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String IAuthTabCallback() {
        return super.IAuthTabCallback();
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ qq asBinder() {
        return super.asBinder();
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ int cz_() {
        return super.cz_();
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String onExtraCallback(String str) {
        return super.onExtraCallback(str);
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ boolean onExtraCallbackWithResult(String str) {
        return super.onExtraCallbackWithResult(str);
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String onNavigationEvent(String str) {
        return super.onNavigationEvent(str);
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ qq onNavigationEvent(String str, String str2) {
        return super.onNavigationEvent(str, str2);
    }

    public pj(String str) {
        this.onExtraCallbackWithResult = str;
    }

    @Override // o.qq
    public String onNavigationEvent() {
        return "#data";
    }

    public String onTransact() {
        return IAuthTabCallbackStub();
    }

    @Override // o.qq
    void IAuthTabCallback(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        appendable.append(onTransact());
    }

    @Override // o.qq
    public String toString() {
        return asInterface();
    }

    @Override // o.qq
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public pj clone() {
        return (pj) super.clone();
    }
}
