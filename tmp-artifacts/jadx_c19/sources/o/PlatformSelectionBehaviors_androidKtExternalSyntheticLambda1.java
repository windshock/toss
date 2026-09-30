package o;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 {
    public final long onExtraCallback;
    public final float onNavigationEvent;
    public final long onWarmupCompleted;

    public static final class IAuthTabCallback {
        private float onExtraCallback;
        private long onExtraCallbackWithResult;
        private long onNavigationEvent;

        public IAuthTabCallback() {
            this.onExtraCallbackWithResult = -9223372036854775807L;
            this.onExtraCallback = -3.4028235E38f;
            this.onNavigationEvent = -9223372036854775807L;
        }

        private IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
            this.onExtraCallbackWithResult = platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onWarmupCompleted;
            this.onExtraCallback = platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onNavigationEvent;
            this.onNavigationEvent = platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onExtraCallback;
        }

        public IAuthTabCallback onExtraCallback(long j) {
            this.onExtraCallbackWithResult = j;
            return this;
        }

        public IAuthTabCallback IAuthTabCallback(float f) {
            RecordingInputConnection_androidKt.onNavigationEvent(f > 0.0f || f == -3.4028235E38f);
            this.onExtraCallback = f;
            return this;
        }

        public IAuthTabCallback IAuthTabCallback(long j) {
            RecordingInputConnection_androidKt.onNavigationEvent(j >= 0 || j == -9223372036854775807L);
            this.onNavigationEvent = j;
            return this;
        }

        public PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 onExtraCallbackWithResult() {
            return new PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1(this);
        }
    }

    private PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1(IAuthTabCallback iAuthTabCallback) {
        this.onWarmupCompleted = iAuthTabCallback.onExtraCallbackWithResult;
        this.onNavigationEvent = iAuthTabCallback.onExtraCallback;
        this.onExtraCallback = iAuthTabCallback.onNavigationEvent;
    }

    public IAuthTabCallback onWarmupCompleted() {
        return new IAuthTabCallback();
    }

    public boolean onNavigationEvent(long j) {
        long j2 = this.onExtraCallback;
        return (j2 == -9223372036854775807L || j == -9223372036854775807L || j2 < j) ? false : true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1)) {
            return false;
        }
        PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1 = (PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1) obj;
        return this.onWarmupCompleted == platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onWarmupCompleted && this.onNavigationEvent == platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onNavigationEvent && this.onExtraCallback == platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onExtraCallback;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.onWarmupCompleted), Float.valueOf(this.onNavigationEvent), Long.valueOf(this.onExtraCallback));
    }
}
