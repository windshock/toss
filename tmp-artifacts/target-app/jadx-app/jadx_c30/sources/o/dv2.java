package o;

import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv2 {
    public static dv18 onWarmupCompleted(dv4... dv4VarArr) {
        return onWarmupCompleted((List<? extends dv4>) Arrays.asList(dv4VarArr));
    }

    public static dv18 onWarmupCompleted(List<? extends dv4> list) {
        return new dv82(list);
    }
}
