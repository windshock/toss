package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getOutline extends jc2 {
    private final getButtonTextForNewStyleBar onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public getOutline(String str, getButtonTextForNewStyleBar getbuttontextfornewstylebar) {
        if (str == null) {
            throw new IllegalArgumentException("code can not be null");
        }
        if (getbuttontextfornewstylebar == null) {
            throw new IllegalArgumentException("scope can not be null");
        }
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = getbuttontextfornewstylebar;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.JAVASCRIPT_WITH_SCOPE;
    }

    public String onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public getButtonTextForNewStyleBar onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getOutline getoutline = (getOutline) obj;
        return this.onNavigationEvent.equals(getoutline.onNavigationEvent) && this.onExtraCallbackWithResult.equals(getoutline.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "BsonJavaScriptWithScope{code=" + onNavigationEvent() + "scope=" + this.onExtraCallbackWithResult + '}';
    }

    static getOutline IAuthTabCallback(getOutline getoutline) {
        return new getOutline(getoutline.onNavigationEvent, getoutline.onExtraCallbackWithResult.clone());
    }
}
