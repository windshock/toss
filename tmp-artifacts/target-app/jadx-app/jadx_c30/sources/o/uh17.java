package o;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class uh17 extends uh20<uh24> {
    private List<uh24> onExtraCallbackWithResult;

    public uh17(uh25 uh25Var, boolean z, List<uh24> list, sya19 sya19Var, Optional<sya8> optional, Optional<sya8> optional2) {
        super(uh25Var, sya19Var, optional, optional2);
        Objects.requireNonNull(list);
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback = z;
    }

    @Override // o.uh2
    public uh22 onExtraCallbackWithResult() {
        return uh22.MAPPING;
    }

    public List<uh24> onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (uh24 uh24Var : onWarmupCompleted()) {
            sb.append("{ key=");
            sb.append(uh24Var.onExtraCallback());
            sb.append("; value=");
            if (uh24Var.onExtraCallbackWithResult() instanceof uh20) {
                sb.append(System.identityHashCode(uh24Var.onExtraCallbackWithResult()));
            } else {
                sb.append(uh24Var);
            }
            sb.append(" }");
        }
        return "<" + getClass().getName() + " (tag=" + onExtraCallback() + ", values=" + sb.toString() + ")>";
    }
}
