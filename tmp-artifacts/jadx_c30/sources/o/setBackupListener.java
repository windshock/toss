package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class setBackupListener implements Serializable {
    private static final long serialVersionUID = 1326269319883146072L;
    private final String symbol;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.symbol.equals(((setBackupListener) obj).symbol);
    }

    public int hashCode() {
        return this.symbol.hashCode();
    }

    public String toString() {
        return this.symbol;
    }
}
