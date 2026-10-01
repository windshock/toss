package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ea4 extends jc2 implements Comparable<ea4> {
    private final String IAuthTabCallback;

    public ea4(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Value can not be null");
        }
        this.IAuthTabCallback = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(ea4 ea4Var) {
        return this.IAuthTabCallback.compareTo(ea4Var.IAuthTabCallback);
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.STRING;
    }

    public String onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.IAuthTabCallback.equals(((ea4) obj).IAuthTabCallback);
    }

    public int hashCode() {
        return this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        return "BsonString{value='" + this.IAuthTabCallback + "'}";
    }
}
