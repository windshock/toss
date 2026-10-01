package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class htf4 extends jc2 {
    private final String IAuthTabCallback;

    public htf4(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Value can not be null");
        }
        this.IAuthTabCallback = str;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.SYMBOL;
    }

    public String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.IAuthTabCallback.equals(((htf4) obj).IAuthTabCallback);
    }

    public int hashCode() {
        return this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        return this.IAuthTabCallback;
    }
}
