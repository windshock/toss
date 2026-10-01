package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class createOpenAdLoader extends createNativeAdLoader {
    byte IAuthTabCallbackStub;
    protected int onExtraCallback;

    createOpenAdLoader(byte b, int i) {
        this.IAuthTabCallbackStub = b;
        this.onExtraCallback = i;
    }

    public int onNavigationEvent() {
        return this.onExtraCallback;
    }
}
