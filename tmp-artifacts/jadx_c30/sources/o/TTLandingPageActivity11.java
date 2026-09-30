package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class TTLandingPageActivity11 {
    protected Object onExtraCallback;
    protected Object onWarmupCompleted;

    protected TTLandingPageActivity11(Object obj, Object obj2) {
        this.onWarmupCompleted = obj;
        this.onExtraCallback = obj2;
    }

    public Object getKey() {
        return this.onWarmupCompleted;
    }

    public Object getValue() {
        return this.onExtraCallback;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getKey());
        stringBuffer.append('=');
        stringBuffer.append(getValue());
        return stringBuffer.toString();
    }
}
