package o;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda26<V> {
    private V[] IAuthTabCallback;
    private long[] onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onWarmupCompleted;

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda26() {
        this(10);
    }

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda26(int i2) {
        this.onExtraCallback = new long[i2];
        this.IAuthTabCallback = (V[]) onWarmupCompleted(i2);
    }

    public void onWarmupCompleted(long j, V v) {
        synchronized (this) {
            onNavigationEvent(j);
            IAuthTabCallback();
            onExtraCallbackWithResult(j, (long) v);
        }
    }

    public void onNavigationEvent() {
        synchronized (this) {
            this.onExtraCallbackWithResult = 0;
            this.onWarmupCompleted = 0;
            Arrays.fill(this.IAuthTabCallback, (Object) null);
        }
    }

    public int onWarmupCompleted() {
        int i2;
        synchronized (this) {
            i2 = this.onWarmupCompleted;
        }
        return i2;
    }

    public V onExtraCallback() {
        V vOnExtraCallbackWithResult;
        synchronized (this) {
            vOnExtraCallbackWithResult = this.onWarmupCompleted == 0 ? null : onExtraCallbackWithResult();
        }
        return vOnExtraCallbackWithResult;
    }

    public V onExtraCallbackWithResult(long j) {
        V vOnExtraCallbackWithResult;
        synchronized (this) {
            vOnExtraCallbackWithResult = onExtraCallbackWithResult(j, true);
        }
        return vOnExtraCallbackWithResult;
    }

    public V onExtraCallback(long j) {
        V vOnExtraCallbackWithResult;
        synchronized (this) {
            vOnExtraCallbackWithResult = onExtraCallbackWithResult(j, false);
        }
        return vOnExtraCallbackWithResult;
    }

    private V onExtraCallbackWithResult(long j, boolean z) {
        V vOnExtraCallbackWithResult = null;
        long j2 = Long.MAX_VALUE;
        while (this.onWarmupCompleted > 0) {
            long j3 = j - this.onExtraCallback[this.onExtraCallbackWithResult];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vOnExtraCallbackWithResult = onExtraCallbackWithResult();
            j2 = j3;
        }
        return vOnExtraCallbackWithResult;
    }

    private V onExtraCallbackWithResult() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted > 0);
        V[] vArr = this.IAuthTabCallback;
        int i2 = this.onExtraCallbackWithResult;
        V v = vArr[i2];
        vArr[i2] = null;
        this.onExtraCallbackWithResult = (i2 + 1) % vArr.length;
        this.onWarmupCompleted--;
        return v;
    }

    private void onNavigationEvent(long j) {
        if (this.onWarmupCompleted > 0) {
            int i2 = this.onExtraCallbackWithResult;
            if (j <= this.onExtraCallback[((i2 + r0) - 1) % this.IAuthTabCallback.length]) {
                onNavigationEvent();
            }
        }
    }

    private void IAuthTabCallback() {
        int length = this.IAuthTabCallback.length;
        if (this.onWarmupCompleted < length) {
            return;
        }
        int i2 = length << 1;
        long[] jArr = new long[i2];
        V[] vArr = (V[]) onWarmupCompleted(i2);
        int i3 = this.onExtraCallbackWithResult;
        int i4 = length - i3;
        System.arraycopy(this.onExtraCallback, i3, jArr, 0, i4);
        System.arraycopy(this.IAuthTabCallback, this.onExtraCallbackWithResult, vArr, 0, i4);
        int i5 = this.onExtraCallbackWithResult;
        if (i5 > 0) {
            System.arraycopy(this.onExtraCallback, 0, jArr, i4, i5);
            System.arraycopy(this.IAuthTabCallback, 0, vArr, i4, this.onExtraCallbackWithResult);
        }
        this.onExtraCallback = jArr;
        this.IAuthTabCallback = vArr;
        this.onExtraCallbackWithResult = 0;
    }

    private void onExtraCallbackWithResult(long j, V v) {
        int i2 = this.onExtraCallbackWithResult;
        int i3 = this.onWarmupCompleted;
        V[] vArr = this.IAuthTabCallback;
        int length = (i2 + i3) % vArr.length;
        this.onExtraCallback[length] = j;
        vArr[length] = v;
        this.onWarmupCompleted = i3 + 1;
    }

    private static <V> V[] onWarmupCompleted(int i2) {
        return (V[]) new Object[i2];
    }
}
