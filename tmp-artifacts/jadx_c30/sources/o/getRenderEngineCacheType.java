package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getRenderEngineCacheType implements Serializable {
    private static final long serialVersionUID = 475535263314046697L;
    private final String code;

    public String onExtraCallback() {
        return this.code;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.code.equals(((getRenderEngineCacheType) obj).code);
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public String toString() {
        return "Code{code='" + this.code + "'}";
    }
}
