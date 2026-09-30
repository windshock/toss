package o;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class uh21 extends uh20<uh2> {
    private final List<uh2> onWarmupCompleted;

    public uh21(uh25 uh25Var, boolean z, List<uh2> list, sya19 sya19Var, Optional<sya8> optional, Optional<sya8> optional2) {
        super(uh25Var, sya19Var, optional, optional2);
        Objects.requireNonNull(list, "value in a Node is required.");
        this.onWarmupCompleted = list;
        this.IAuthTabCallback = z;
    }

    @Override // o.uh2
    public uh22 onExtraCallbackWithResult() {
        return uh22.SEQUENCE;
    }

    public List<uh2> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (uh2 uh2Var : onWarmupCompleted()) {
            if (uh2Var instanceof uh20) {
                sb.append(System.identityHashCode(uh2Var));
            } else {
                sb.append(uh2Var.toString());
            }
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return "<" + getClass().getName() + " (tag=" + onExtraCallback() + ", value=[" + ((Object) sb) + "])>";
    }
}
