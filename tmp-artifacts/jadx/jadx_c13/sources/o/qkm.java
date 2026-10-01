package o;

import java.io.IOException;
import o.oq;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class qkm extends qye {
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

    public qkm(String str) {
        this.onExtraCallbackWithResult = str;
    }

    @Override // o.qq
    public String onNavigationEvent() {
        return "#text";
    }

    public String IAuthTabCallbackDefault() {
        return IAuthTabCallbackStub();
    }

    public boolean onTransact() {
        return nfe.onNavigationEvent(IAuthTabCallbackStub());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    @Override // o.qq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void IAuthTabCallback(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        boolean zOnTransact = onextracallback.onTransact();
        if (zOnTransact) {
            if (validateRelationship() == 0) {
                qq qqVar = this.IAuthTabCallback;
                if (!(qqVar instanceof qgr) || !((qgr) qqVar).ICustomTabsCallback_Parcel().IAuthTabCallback() || onTransact()) {
                    if (onextracallback.IAuthTabCallback() && ICustomTabsServiceStub().size() > 0 && !onTransact()) {
                        onExtraCallbackWithResult(appendable, i, onextracallback);
                    }
                }
            }
        }
        pvm.onWarmupCompleted(appendable, IAuthTabCallbackStub(), onextracallback, false, zOnTransact && !qgr.onNavigationEvent(this.IAuthTabCallback), zOnTransact && (this.IAuthTabCallback instanceof oq));
    }

    @Override // o.qq
    public String toString() {
        return asInterface();
    }

    @Override // o.qq
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public qkm clone() {
        return (qkm) super.clone();
    }

    static boolean onNavigationEvent(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }
}
