package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class rg {
    private String IAuthTabCallback;
    private int onExtraCallback;
    private String onNavigationEvent;

    rg(rdj rdjVar, String str) {
        this.onExtraCallback = rdjVar.onActivityResized();
        this.IAuthTabCallback = rdjVar.IAuthTabCallback_Parcel();
        this.onNavigationEvent = str;
    }

    rg(rdj rdjVar, String str, Object... objArr) {
        this.onExtraCallback = rdjVar.onActivityResized();
        this.IAuthTabCallback = rdjVar.IAuthTabCallback_Parcel();
        this.onNavigationEvent = String.format(str, objArr);
    }

    public String toString() {
        return "<" + this.IAuthTabCallback + ">: " + this.onNavigationEvent;
    }
}
