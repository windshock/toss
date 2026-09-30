package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManagerExternalSyntheticLambda14 {
    public static final SelectionManagerExternalSyntheticLambda14 onNavigationEvent = new onNavigationEvent().onExtraCallbackWithResult();
    public final boolean IAuthTabCallback;
    public final boolean onExtraCallback;
    public final boolean onWarmupCompleted;

    public static final class onNavigationEvent {
        private boolean onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private boolean onNavigationEvent;

        public onNavigationEvent IAuthTabCallback(boolean z) {
            this.onNavigationEvent = z;
            return this;
        }

        public onNavigationEvent onNavigationEvent(boolean z) {
            this.onExtraCallbackWithResult = z;
            return this;
        }

        public onNavigationEvent onExtraCallbackWithResult(boolean z) {
            this.onExtraCallback = z;
            return this;
        }

        public SelectionManagerExternalSyntheticLambda14 onExtraCallbackWithResult() {
            if (!this.onNavigationEvent && (this.onExtraCallbackWithResult || this.onExtraCallback)) {
                throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
            }
            return new SelectionManagerExternalSyntheticLambda14(this);
        }
    }

    private SelectionManagerExternalSyntheticLambda14(onNavigationEvent onnavigationevent) {
        this.onWarmupCompleted = onnavigationevent.onNavigationEvent;
        this.IAuthTabCallback = onnavigationevent.onExtraCallbackWithResult;
        this.onExtraCallback = onnavigationevent.onExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectionManagerExternalSyntheticLambda14.class != obj.getClass()) {
            return false;
        }
        SelectionManagerExternalSyntheticLambda14 selectionManagerExternalSyntheticLambda14 = (SelectionManagerExternalSyntheticLambda14) obj;
        return this.onWarmupCompleted == selectionManagerExternalSyntheticLambda14.onWarmupCompleted && this.IAuthTabCallback == selectionManagerExternalSyntheticLambda14.IAuthTabCallback && this.onExtraCallback == selectionManagerExternalSyntheticLambda14.onExtraCallback;
    }

    public int hashCode() {
        return ((this.onWarmupCompleted ? 1 : 0) << 2) + ((this.IAuthTabCallback ? 1 : 0) << 1) + (this.onExtraCallback ? 1 : 0);
    }
}
