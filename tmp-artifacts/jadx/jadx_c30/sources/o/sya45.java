package o;

import java.util.Optional;
import o.sya43;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya45 extends sya38 {
    public sya45(Optional<sya18> optional, Optional<String> optional2, boolean z, sya19 sya19Var, Optional<sya8> optional3, Optional<sya8> optional4) {
        super(optional, optional2, z, sya19Var, optional3, optional4);
    }

    public sya43.IAuthTabCallback onNavigationEvent() {
        return sya43.IAuthTabCallback.MappingStart;
    }

    @Override // o.sya38
    public String toString() {
        StringBuilder sb = new StringBuilder("+MAP");
        if (IAuthTabCallback() == sya19.FLOW) {
            sb.append(" {}");
        }
        sb.append(super.toString());
        return sb.toString();
    }
}
