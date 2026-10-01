package o;

import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ryzb {
    private static final AppSetIdAndScope1 IAuthTabCallback = ea10.onWarmupCompleted((Class<?>) ryzb.class);
    private final onWarmupCompleted[] onExtraCallbackWithResult = new onWarmupCompleted[17];

    static class onWarmupCompleted {
        onWarmupCompleted IAuthTabCallback;
        int onExtraCallbackWithResult;
        yzp2 onWarmupCompleted;

        private onWarmupCompleted() {
        }
    }

    public void onNavigationEvent(int i, yzp2 yzp2Var) {
        if (i > 16383) {
            return;
        }
        int iHashCode = (yzp2Var.hashCode() & IntCompanionObject.MAX_VALUE) % 17;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        onwarmupcompleted.onWarmupCompleted = yzp2Var;
        onwarmupcompleted.onExtraCallbackWithResult = i;
        onWarmupCompleted[] onwarmupcompletedArr = this.onExtraCallbackWithResult;
        onwarmupcompleted.IAuthTabCallback = onwarmupcompletedArr[iHashCode];
        onwarmupcompletedArr[iHashCode] = onwarmupcompleted;
    }

    public int onExtraCallback(yzp2 yzp2Var) {
        int i = -1;
        for (onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult[(yzp2Var.hashCode() & IntCompanionObject.MAX_VALUE) % 17]; onwarmupcompleted != null; onwarmupcompleted = onwarmupcompleted.IAuthTabCallback) {
            if (onwarmupcompleted.onWarmupCompleted.equals(yzp2Var)) {
                i = onwarmupcompleted.onExtraCallbackWithResult;
            }
        }
        return i;
    }
}
