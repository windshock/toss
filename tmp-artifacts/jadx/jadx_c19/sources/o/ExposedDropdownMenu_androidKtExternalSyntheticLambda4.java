package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
    long onExtraCallback();

    onNavigationEvent onExtraCallback(long j);

    boolean onNavigationEvent();

    public static class onExtraCallbackWithResult implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
        private final onNavigationEvent onExtraCallback;
        private final long onWarmupCompleted;

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public boolean onNavigationEvent() {
            return false;
        }

        public onExtraCallbackWithResult(long j) {
            this(j, 0L);
        }

        public onExtraCallbackWithResult(long j, long j2) {
            this.onWarmupCompleted = j;
            this.onExtraCallback = new onNavigationEvent(j2 == 0 ? ExposedDropdownMenu_androidKtExternalSyntheticLambda3.onWarmupCompleted : new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(0L, j2));
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public long onExtraCallback() {
            return this.onWarmupCompleted;
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public onNavigationEvent onExtraCallback(long j) {
            return this.onExtraCallback;
        }
    }

    public static final class onNavigationEvent {
        public final ExposedDropdownMenu_androidKtExternalSyntheticLambda3 IAuthTabCallback;
        public final ExposedDropdownMenu_androidKtExternalSyntheticLambda3 onWarmupCompleted;

        public onNavigationEvent(ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3) {
            this(exposedDropdownMenu_androidKtExternalSyntheticLambda3, exposedDropdownMenu_androidKtExternalSyntheticLambda3);
        }

        public onNavigationEvent(ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3, ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda32) {
            this.IAuthTabCallback = (ExposedDropdownMenu_androidKtExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(exposedDropdownMenu_androidKtExternalSyntheticLambda3);
            this.onWarmupCompleted = (ExposedDropdownMenu_androidKtExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(exposedDropdownMenu_androidKtExternalSyntheticLambda32);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.IAuthTabCallback);
            if (this.IAuthTabCallback.equals(this.onWarmupCompleted)) {
                str = "";
            } else {
                str = ", " + this.onWarmupCompleted;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || onNavigationEvent.class != obj.getClass()) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return this.IAuthTabCallback.equals(onnavigationevent.IAuthTabCallback) && this.onWarmupCompleted.equals(onnavigationevent.onWarmupCompleted);
        }

        public int hashCode() {
            return (this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        }
    }
}
