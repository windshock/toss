package o;

import java.util.List;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class qye extends qq {
    Object onExtraCallbackWithResult;

    @Override // o.qq
    public qq asBinder() {
        return this;
    }

    @Override // o.qq
    protected void c_(String str) {
    }

    @Override // o.qq
    public int cz_() {
        return 0;
    }

    qye() {
    }

    @Override // o.qq
    protected final boolean readTypedObject() {
        return this.onExtraCallbackWithResult instanceof om;
    }

    @Override // o.qq
    public final om access000() {
        onExtraCallbackWithResult();
        return (om) this.onExtraCallbackWithResult;
    }

    private void onExtraCallbackWithResult() {
        if (readTypedObject()) {
            return;
        }
        Object obj = this.onExtraCallbackWithResult;
        om omVar = new om();
        this.onExtraCallbackWithResult = omVar;
        if (obj != null) {
            omVar.onExtraCallbackWithResult(onNavigationEvent(), (String) obj);
        }
    }

    String IAuthTabCallbackStub() {
        return onExtraCallback(onNavigationEvent());
    }

    @Override // o.qq
    public String onExtraCallback(String str) {
        oas.onExtraCallback(str);
        if (readTypedObject()) {
            return super.onExtraCallback(str);
        }
        return str.equals(onNavigationEvent()) ? (String) this.onExtraCallbackWithResult : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // o.qq
    public qq onNavigationEvent(String str, String str2) {
        if (!readTypedObject() && str.equals(onNavigationEvent())) {
            this.onExtraCallbackWithResult = str2;
            return this;
        }
        onExtraCallbackWithResult();
        super.onNavigationEvent(str, str2);
        return this;
    }

    @Override // o.qq
    public boolean onExtraCallbackWithResult(String str) {
        onExtraCallbackWithResult();
        return super.onExtraCallbackWithResult(str);
    }

    @Override // o.qq
    public String onNavigationEvent(String str) {
        onExtraCallbackWithResult();
        return super.onNavigationEvent(str);
    }

    @Override // o.qq
    public String IAuthTabCallback() {
        return prefetch() ? ICustomTabsCallbackDefault().IAuthTabCallback() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // o.qq
    protected List<qq> extraCallbackWithResult() {
        return qq.onExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.qq
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public qye onTransact(qq qqVar) {
        qye qyeVar = (qye) super.onTransact(qqVar);
        if (readTypedObject()) {
            qyeVar.onExtraCallbackWithResult = ((om) this.onExtraCallbackWithResult).clone();
        }
        return qyeVar;
    }
}
