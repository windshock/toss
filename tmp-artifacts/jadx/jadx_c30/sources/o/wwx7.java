package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class wwx7<T> implements Serializable {
    private static final long serialVersionUID = 86241875189L;
    private T value;

    public wwx7() {
    }

    public wwx7(T t) {
        this.value = t;
    }

    public T onExtraCallbackWithResult() {
        return this.value;
    }

    public void onExtraCallback(T t) {
        this.value = t;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return this.value.equals(((wwx7) obj).value);
        }
        return false;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        T t = this.value;
        return t == null ? "null" : t.toString();
    }
}
