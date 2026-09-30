package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class wie4 extends jc2 {
    private final String IAuthTabCallback;

    public wie4(String str) {
        this.IAuthTabCallback = str;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.JAVASCRIPT;
    }

    public String onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.IAuthTabCallback.equals(((wie4) obj).IAuthTabCallback);
    }

    public int hashCode() {
        return this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        return "BsonJavaScript{code='" + this.IAuthTabCallback + "'}";
    }
}
