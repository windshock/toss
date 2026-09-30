package o;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DismissStateCompanionExternalSyntheticLambda1 {
    private boolean IAuthTabCallbackStub;
    private int onExtraCallback;
    private boolean onNavigationEvent;
    private onExtraCallback onWarmupCompleted = new onExtraCallback();
    private onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
    private long IAuthTabCallback = -9223372036854775807L;

    public void asBinder() {
        this.onWarmupCompleted.IAuthTabCallback();
        this.onExtraCallbackWithResult.IAuthTabCallback();
        this.onNavigationEvent = false;
        this.IAuthTabCallback = -9223372036854775807L;
        this.onExtraCallback = 0;
    }

    public void onNavigationEvent(long j) {
        this.onWarmupCompleted.onWarmupCompleted(j);
        if (this.onWarmupCompleted.onNavigationEvent() && !this.IAuthTabCallbackStub) {
            this.onNavigationEvent = false;
        } else if (this.IAuthTabCallback != -9223372036854775807L) {
            if (!this.onNavigationEvent || this.onExtraCallbackWithResult.onExtraCallback()) {
                this.onExtraCallbackWithResult.IAuthTabCallback();
                this.onExtraCallbackWithResult.onWarmupCompleted(this.IAuthTabCallback);
            }
            this.onNavigationEvent = true;
            this.onExtraCallbackWithResult.onWarmupCompleted(j);
        }
        if (this.onNavigationEvent && this.onExtraCallbackWithResult.onNavigationEvent()) {
            onExtraCallback onextracallback = this.onWarmupCompleted;
            this.onWarmupCompleted = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = onextracallback;
            this.onNavigationEvent = false;
            this.IAuthTabCallbackStub = false;
        }
        this.IAuthTabCallback = j;
        this.onExtraCallback = this.onWarmupCompleted.onNavigationEvent() ? 0 : this.onExtraCallback + 1;
    }

    public boolean onExtraCallback() {
        return this.onWarmupCompleted.onNavigationEvent();
    }

    public int IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public long onWarmupCompleted() {
        if (onExtraCallback()) {
            return this.onWarmupCompleted.onWarmupCompleted();
        }
        return -9223372036854775807L;
    }

    public long onNavigationEvent() {
        if (onExtraCallback()) {
            return this.onWarmupCompleted.onExtraCallbackWithResult();
        }
        return -9223372036854775807L;
    }

    public float onExtraCallbackWithResult() {
        if (onExtraCallback()) {
            return (float) (1.0E9d / this.onWarmupCompleted.onExtraCallbackWithResult());
        }
        return -1.0f;
    }

    static final class onExtraCallback {
        private long IAuthTabCallback;
        private final boolean[] IAuthTabCallbackDefault = new boolean[15];
        private int IAuthTabCallbackStub;
        private long asBinder;
        private long onExtraCallback;
        private long onExtraCallbackWithResult;
        private long onNavigationEvent;
        private long onWarmupCompleted;

        public void IAuthTabCallback() {
            this.onNavigationEvent = 0L;
            this.onExtraCallbackWithResult = 0L;
            this.asBinder = 0L;
            this.IAuthTabCallbackStub = 0;
            Arrays.fill(this.IAuthTabCallbackDefault, false);
        }

        public boolean onNavigationEvent() {
            return this.onNavigationEvent > 15 && this.IAuthTabCallbackStub == 0;
        }

        public boolean onExtraCallback() {
            long j = this.onNavigationEvent;
            if (j == 0) {
                return false;
            }
            return this.IAuthTabCallbackDefault[IAuthTabCallback(j - 1)];
        }

        public long onWarmupCompleted() {
            return this.asBinder;
        }

        public long onExtraCallbackWithResult() {
            long j = this.onExtraCallbackWithResult;
            if (j == 0) {
                return 0L;
            }
            return this.asBinder / j;
        }

        public void onWarmupCompleted(long j) {
            long j2 = this.onNavigationEvent;
            if (j2 == 0) {
                this.IAuthTabCallback = j;
            } else if (j2 == 1) {
                long j3 = j - this.IAuthTabCallback;
                this.onWarmupCompleted = j3;
                this.asBinder = j3;
                this.onExtraCallbackWithResult = 1L;
            } else {
                long j4 = j - this.onExtraCallback;
                int iIAuthTabCallback = IAuthTabCallback(j2);
                if (Math.abs(j4 - this.onWarmupCompleted) <= 1000000) {
                    this.onExtraCallbackWithResult++;
                    this.asBinder += j4;
                    boolean[] zArr = this.IAuthTabCallbackDefault;
                    if (zArr[iIAuthTabCallback]) {
                        zArr[iIAuthTabCallback] = false;
                        this.IAuthTabCallbackStub--;
                    }
                } else {
                    boolean[] zArr2 = this.IAuthTabCallbackDefault;
                    if (!zArr2[iIAuthTabCallback]) {
                        zArr2[iIAuthTabCallback] = true;
                        this.IAuthTabCallbackStub++;
                    }
                }
            }
            this.onNavigationEvent++;
            this.onExtraCallback = j;
        }

        private static int IAuthTabCallback(long j) {
            return (int) (j % 15);
        }
    }
}
