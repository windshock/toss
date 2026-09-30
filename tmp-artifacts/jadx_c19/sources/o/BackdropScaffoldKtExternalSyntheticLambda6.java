package o;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BackdropScaffoldKtExternalSyntheticLambda6 implements BottomNavigationKtExternalSyntheticLambda8 {
    private long IAuthTabCallback;
    private final ImmutableList<onExtraCallbackWithResult> onExtraCallback;

    public BackdropScaffoldKtExternalSyntheticLambda6(List<? extends BottomNavigationKtExternalSyntheticLambda8> list, List<List<Integer>> list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        RecordingInputConnection_androidKt.onNavigationEvent(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            builder.add(new onExtraCallbackWithResult(list.get(i2), list2.get(i2)));
        }
        this.onExtraCallback = builder.build();
        this.IAuthTabCallback = -9223372036854775807L;
    }

    public long onWarmupCompleted() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) this.onExtraCallback.get(i2);
            long jOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
            if ((onextracallbackwithresult.onExtraCallbackWithResult().contains(1) || onextracallbackwithresult.onExtraCallbackWithResult().contains(2) || onextracallbackwithresult.onExtraCallbackWithResult().contains(4)) && jOnWarmupCompleted != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jOnWarmupCompleted);
            }
            if (jOnWarmupCompleted != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jOnWarmupCompleted);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.IAuthTabCallback = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.IAuthTabCallback;
        return j != -9223372036854775807L ? j : jMin2;
    }

    public long onExtraCallback() {
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
            long jOnExtraCallback = ((onExtraCallbackWithResult) this.onExtraCallback.get(i2)).onExtraCallback();
            if (jOnExtraCallback != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jOnExtraCallback);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    public void IAuthTabCallback(long j) {
        for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
            ((onExtraCallbackWithResult) this.onExtraCallback.get(i2)).IAuthTabCallback(j);
        }
    }

    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        boolean zIAuthTabCallback;
        boolean z = false;
        do {
            long jOnExtraCallback = onExtraCallback();
            if (jOnExtraCallback == Long.MIN_VALUE) {
                return z;
            }
            zIAuthTabCallback = false;
            for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
                long jOnExtraCallback2 = ((onExtraCallbackWithResult) this.onExtraCallback.get(i2)).onExtraCallback();
                boolean z2 = jOnExtraCallback2 != Long.MIN_VALUE && jOnExtraCallback2 <= platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onWarmupCompleted;
                if (jOnExtraCallback2 == jOnExtraCallback || z2) {
                    zIAuthTabCallback |= ((onExtraCallbackWithResult) this.onExtraCallback.get(i2)).IAuthTabCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1);
                }
            }
            z |= zIAuthTabCallback;
        } while (zIAuthTabCallback);
        return z;
    }

    public boolean IAuthTabCallback() {
        for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
            if (((onExtraCallbackWithResult) this.onExtraCallback.get(i2)).IAuthTabCallback()) {
                return true;
            }
        }
        return false;
    }

    static final class onExtraCallbackWithResult implements BottomNavigationKtExternalSyntheticLambda8 {
        private final ImmutableList<Integer> IAuthTabCallback;
        private final BottomNavigationKtExternalSyntheticLambda8 onWarmupCompleted;

        public onExtraCallbackWithResult(BottomNavigationKtExternalSyntheticLambda8 bottomNavigationKtExternalSyntheticLambda8, List<Integer> list) {
            this.onWarmupCompleted = bottomNavigationKtExternalSyntheticLambda8;
            this.IAuthTabCallback = ImmutableList.copyOf(list);
        }

        public ImmutableList<Integer> onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }

        public long onWarmupCompleted() {
            return this.onWarmupCompleted.onWarmupCompleted();
        }

        public long onExtraCallback() {
            return this.onWarmupCompleted.onExtraCallback();
        }

        public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
            return this.onWarmupCompleted.IAuthTabCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1);
        }

        public boolean IAuthTabCallback() {
            return this.onWarmupCompleted.IAuthTabCallback();
        }

        public void IAuthTabCallback(long j) {
            this.onWarmupCompleted.IAuthTabCallback(j);
        }
    }
}
