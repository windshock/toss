package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class sjd {
    private final boolean IAuthTabCallback;
    private final boolean onExtraCallback;
    public static final sjd onNavigationEvent = new sjd(false, false);
    public static final sjd onExtraCallbackWithResult = new sjd(true, true);

    public boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public boolean onNavigationEvent() {
        return this.onExtraCallback;
    }

    public sjd(boolean z, boolean z2) {
        this.IAuthTabCallback = z;
        this.onExtraCallback = z2;
    }

    public String IAuthTabCallback(String str) {
        String strTrim = str.trim();
        return !this.IAuthTabCallback ? oiz.onExtraCallbackWithResult(strTrim) : strTrim;
    }

    public String onExtraCallbackWithResult(String str) {
        String strTrim = str.trim();
        return !this.onExtraCallback ? oiz.onExtraCallbackWithResult(strTrim) : strTrim;
    }

    om onExtraCallbackWithResult(om omVar) {
        if (omVar != null && !this.onExtraCallback) {
            omVar.IAuthTabCallback();
        }
        return omVar;
    }

    static String onNavigationEvent(String str) {
        return oiz.onExtraCallbackWithResult(str.trim());
    }
}
