package o;

import java.io.IOException;
import o.oq;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pks extends qye {
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

    public pks(String str) {
        this.onExtraCallbackWithResult = str;
    }

    @Override // o.qq
    public String onNavigationEvent() {
        return "#comment";
    }

    public String IAuthTabCallbackDefault() {
        return IAuthTabCallbackStub();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // o.qq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void IAuthTabCallback(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        if (onextracallback.onTransact()) {
            if (validateRelationship() == 0) {
                qq qqVar = this.IAuthTabCallback;
                if (!(qqVar instanceof qgr) || !((qgr) qqVar).ICustomTabsCallback_Parcel().IAuthTabCallback()) {
                    if (onextracallback.IAuthTabCallback()) {
                        onExtraCallbackWithResult(appendable, i, onextracallback);
                    }
                }
            }
        }
        appendable.append("<!--").append(IAuthTabCallbackDefault()).append("-->");
    }

    @Override // o.qq
    public String toString() {
        return asInterface();
    }

    @Override // o.qq
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public pks clone() {
        return (pks) super.clone();
    }
}
