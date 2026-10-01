package o;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import o.SelectionManagerExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SelectionManagerExternalSyntheticLambda3 {
    private final onWarmupCompleted IAuthTabCallback;
    private int IAuthTabCallbackStub;
    private long asBinder;
    private final int asInterface;
    private long onExtraCallback;
    private long onExtraCallbackWithResult;
    private final SelectionManagerExternalSyntheticLambda6.onNavigationEvent onNavigationEvent;
    private long onTransact;
    private long onWarmupCompleted;

    public SelectionManagerExternalSyntheticLambda3(AudioTrack audioTrack, SelectionManagerExternalSyntheticLambda6.onNavigationEvent onnavigationevent) {
        this.IAuthTabCallback = new onWarmupCompleted(audioTrack);
        this.asInterface = audioTrack.getSampleRate();
        this.onNavigationEvent = onnavigationevent;
        onExtraCallback();
    }

    public void onNavigationEvent(long j, float f, long j2) {
        if (j - this.asBinder >= this.onTransact) {
            this.asBinder = j;
            boolean zOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
            if (zOnNavigationEvent) {
                IAuthTabCallback(j, f, j2);
            }
            int i2 = this.IAuthTabCallbackStub;
            if (i2 == 0) {
                if (!zOnNavigationEvent) {
                    if (j - this.onExtraCallback > 500000) {
                        onNavigationEvent(3);
                        return;
                    }
                    return;
                } else {
                    if (this.IAuthTabCallback.onExtraCallback() >= this.onExtraCallback) {
                        this.onWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
                        this.onExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallback();
                        onNavigationEvent(1);
                        return;
                    }
                    return;
                }
            }
            if (i2 == 1) {
                if (zOnNavigationEvent) {
                    if (IAuthTabCallback(j, f)) {
                        onNavigationEvent(2);
                        return;
                    } else if (j - this.onExtraCallback > 2000000) {
                        onNavigationEvent(3);
                        return;
                    } else {
                        this.onWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
                        this.onExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallback();
                        return;
                    }
                }
                onExtraCallback();
                return;
            }
            if (i2 == 2) {
                if (zOnNavigationEvent) {
                    return;
                }
                onExtraCallback();
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
            } else if (zOnNavigationEvent) {
                onExtraCallback();
            }
        }
    }

    public boolean onWarmupCompleted() {
        return this.IAuthTabCallbackStub == 2;
    }

    public boolean onExtraCallbackWithResult() {
        int i2 = this.IAuthTabCallbackStub;
        return i2 == 0 || i2 == 1;
    }

    public void onExtraCallback() {
        onNavigationEvent(0);
    }

    public long onExtraCallbackWithResult(long j, float f) {
        return onWarmupCompleted(j, f);
    }

    public void onNavigationEvent() {
        this.IAuthTabCallback.IAuthTabCallback();
    }

    private void onNavigationEvent(int i2) {
        this.IAuthTabCallbackStub = i2;
        if (i2 == 0) {
            this.asBinder = 0L;
            this.onWarmupCompleted = -1L;
            this.onExtraCallbackWithResult = -9223372036854775807L;
            this.onExtraCallback = System.nanoTime() / 1000;
            this.onTransact = 10000L;
            return;
        }
        if (i2 == 1) {
            this.onTransact = 10000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.onTransact = 10000000L;
        } else {
            if (i2 == 4) {
                this.onTransact = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    private boolean IAuthTabCallback(long j, float f) {
        long jOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
        long j2 = this.onWarmupCompleted;
        if (jOnWarmupCompleted <= j2) {
            return false;
        }
        return Math.abs(onWarmupCompleted(j, f) - IAuthTabCallback(j2, this.onExtraCallbackWithResult, j, f)) < 1000;
    }

    private long onWarmupCompleted(long j, float f) {
        return IAuthTabCallback(this.IAuthTabCallback.onWarmupCompleted(), this.IAuthTabCallback.onExtraCallback(), j, f);
    }

    private long IAuthTabCallback(long j, long j2, long j3, float f) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j, this.asInterface) + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j3 - j2, f);
    }

    private void IAuthTabCallback(long j, float f, long j2) {
        long jOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
        long jOnWarmupCompleted = onWarmupCompleted(j, f);
        if (Math.abs(jOnExtraCallback - j) > 5000000) {
            this.onNavigationEvent.onWarmupCompleted(this.IAuthTabCallback.onWarmupCompleted(), jOnExtraCallback, j, j2);
            onNavigationEvent(4);
        } else if (Math.abs(jOnWarmupCompleted - j2) > 5000000) {
            this.onNavigationEvent.IAuthTabCallback(this.IAuthTabCallback.onWarmupCompleted(), jOnExtraCallback, j, j2);
            onNavigationEvent(4);
        } else if (this.IAuthTabCallbackStub == 4) {
            onExtraCallback();
        }
    }

    static final class onWarmupCompleted {
        private final AudioTrack IAuthTabCallback;
        private long IAuthTabCallbackDefault;
        private long asBinder;
        private long onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private final AudioTimestamp onNavigationEvent = new AudioTimestamp();
        private long onWarmupCompleted;

        public onWarmupCompleted(AudioTrack audioTrack) {
            this.IAuthTabCallback = audioTrack;
        }

        public boolean onNavigationEvent() {
            boolean timestamp = this.IAuthTabCallback.getTimestamp(this.onNavigationEvent);
            if (timestamp) {
                long j = this.onNavigationEvent.framePosition;
                long j2 = this.asBinder;
                if (j2 > j) {
                    if (this.onExtraCallbackWithResult) {
                        this.onWarmupCompleted += j2;
                        this.onExtraCallbackWithResult = false;
                    } else {
                        this.IAuthTabCallbackDefault++;
                    }
                }
                this.asBinder = j;
                this.onExtraCallback = j + this.onWarmupCompleted + (this.IAuthTabCallbackDefault << 32);
            }
            return timestamp;
        }

        public long onExtraCallback() {
            return this.onNavigationEvent.nanoTime / 1000;
        }

        public long onWarmupCompleted() {
            return this.onExtraCallback;
        }

        public void IAuthTabCallback() {
            this.onExtraCallbackWithResult = true;
        }
    }
}
