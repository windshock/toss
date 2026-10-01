package o;

import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class hti implements goq {
    @Override // o.goq
    public boolean IAuthTabCallback(String str) {
        return true;
    }

    @Override // o.goq
    public boolean onWarmupCompleted(String str) {
        return true;
    }

    @Override // o.goq
    public void onExtraCallbackWithResult(hz hzVar) throws gjv {
        if (hzVar.asBinder() || hzVar.asInterface() || hzVar.onTransact()) {
            throw new gmd("bad rsv RSV1: " + hzVar.asBinder() + " RSV2: " + hzVar.asInterface() + " RSV3: " + hzVar.onTransact());
        }
    }

    @Override // o.goq
    public String onExtraCallback() {
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // o.goq
    public String onWarmupCompleted() {
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // o.goq
    public goq onNavigationEvent() {
        return new hti();
    }

    @Override // o.goq
    public String toString() {
        return getClass().getSimpleName();
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }
}
