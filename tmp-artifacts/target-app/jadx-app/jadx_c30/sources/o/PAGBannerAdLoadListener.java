package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGBannerAdLoadListener {
    protected String IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private String asBinder;
    private final int asInterface;
    protected String onExtraCallback;
    protected String onExtraCallbackWithResult;
    private int onTransact;
    private static final String[] onWarmupCompleted = new String[0];
    static final PAGBannerAdLoadListener[] onNavigationEvent = new PAGBannerAdLoadListener[0];

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        PAGBannerAdLoadListener pAGBannerAdLoadListener = (PAGBannerAdLoadListener) obj;
        return onNavigationEvent(this.onExtraCallback, pAGBannerAdLoadListener.onExtraCallback) && onNavigationEvent(this.onExtraCallbackWithResult, pAGBannerAdLoadListener.onExtraCallbackWithResult) && onNavigationEvent(this.IAuthTabCallback, pAGBannerAdLoadListener.IAuthTabCallback);
    }

    private void onNavigationEvent() {
        this.IAuthTabCallbackDefault = true;
        this.onTransact = 17;
        String str = this.onExtraCallback;
        if (str != null) {
            this.onTransact = str.hashCode();
        }
        String str2 = this.onExtraCallbackWithResult;
        if (str2 != null) {
            this.onTransact = str2.hashCode();
        }
        String str3 = this.IAuthTabCallback;
        if (str3 != null) {
            this.onTransact = str3.hashCode();
        }
    }

    public int onExtraCallback() {
        return this.asInterface;
    }

    public int hashCode() {
        if (!this.IAuthTabCallbackDefault) {
            onNavigationEvent();
        }
        return this.onTransact;
    }

    public boolean onNavigationEvent(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public String onWarmupCompleted() {
        return this.IAuthTabCallbackStub;
    }

    public String IAuthTabCallback() {
        return this.asBinder;
    }

    public String toString() {
        return "IcTuple (" + IAuthTabCallback() + " in " + onWarmupCompleted() + ')';
    }
}
