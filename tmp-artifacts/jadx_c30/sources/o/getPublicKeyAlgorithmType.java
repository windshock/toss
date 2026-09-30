package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getPublicKeyAlgorithmType {
    private final String onExtraCallback;
    private final String onNavigationEvent;

    public getPublicKeyAlgorithmType(String str, String str2) {
        if (str2 == null) {
            throw new NullPointerException("Suffix must be provided.");
        }
        this.onNavigationEvent = str;
        this.onExtraCallback = str2;
    }

    public String onExtraCallback() {
        return this.onNavigationEvent;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallback;
    }
}
