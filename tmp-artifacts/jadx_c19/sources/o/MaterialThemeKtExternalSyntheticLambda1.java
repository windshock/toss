package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MaterialThemeKtExternalSyntheticLambda1 {
    public final long onExtraCallbackWithResult;
    public final List<onWarmupCompleted> onNavigationEvent;

    public static final class onWarmupCompleted {
        public final String IAuthTabCallback;
        public final long onExtraCallback;
        public final String onNavigationEvent;
        public final long onWarmupCompleted;

        public onWarmupCompleted(String str, String str2, long j, long j2) {
            this.IAuthTabCallback = str;
            this.onNavigationEvent = str2;
            this.onWarmupCompleted = j;
            this.onExtraCallback = j2;
        }
    }

    public MaterialThemeKtExternalSyntheticLambda1(long j, List<onWarmupCompleted> list) {
        this.onExtraCallbackWithResult = j;
        this.onNavigationEvent = list;
    }

    public ModalBottomSheetStateExternalSyntheticLambda2 onExtraCallback(long j) {
        long j2;
        if (this.onNavigationEvent.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.onNavigationEvent.size() - 1; size >= 0; size--) {
            onWarmupCompleted onwarmupcompleted = this.onNavigationEvent.get(size);
            boolean zEquals = "video/mp4".equals(onwarmupcompleted.IAuthTabCallback) | z;
            if (size == 0) {
                j3 -= onwarmupcompleted.onExtraCallback;
                j2 = 0;
            } else {
                j2 = j3 - onwarmupcompleted.onWarmupCompleted;
            }
            long j8 = j3;
            j3 = j2;
            if (!zEquals || j3 == j8) {
                z = zEquals;
            } else {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new ModalBottomSheetStateExternalSyntheticLambda2(j4, j5, this.onExtraCallbackWithResult, j6, j7);
    }
}
