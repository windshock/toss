package o;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getExpectExpressWidth implements Serializable {
    private static final long serialVersionUID = 7902997490338209467L;
    private final byte[] data;
    private final byte type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getExpectExpressWidth getexpectexpresswidth = (getExpectExpressWidth) obj;
        return this.type == getexpectexpresswidth.type && Arrays.equals(this.data, getexpectexpresswidth.data);
    }

    public int hashCode() {
        return (this.type * 31) + Arrays.hashCode(this.data);
    }
}
