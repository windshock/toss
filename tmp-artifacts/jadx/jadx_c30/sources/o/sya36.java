package o;

import java.util.Optional;
import o.sya43;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya36 extends sya43 {
    private final boolean IAuthTabCallback;

    public sya36(boolean z, Optional<sya8> optional, Optional<sya8> optional2) {
        super(optional, optional2);
        this.IAuthTabCallback = z;
    }

    public boolean onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public sya43.IAuthTabCallback onNavigationEvent() {
        return sya43.IAuthTabCallback.DocumentEnd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("-DOC");
        if (onExtraCallback()) {
            sb.append(" ...");
        }
        return sb.toString();
    }
}
