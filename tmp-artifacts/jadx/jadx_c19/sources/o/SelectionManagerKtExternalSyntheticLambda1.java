package o;

import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import o.SelectionManagerExternalSyntheticLambda8;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManagerKtExternalSyntheticLambda1 implements SelectionManagerExternalSyntheticLambda8.IAuthTabCallback {
    protected final int IAuthTabCallback;
    protected final int IAuthTabCallbackDefault;
    protected final int asInterface;
    protected final int onExtraCallback;
    public final int onNavigationEvent;
    protected final int onTransact;
    public final int onWarmupCompleted;

    public static class onNavigationEvent {
        private int onNavigationEvent = 250000;
        private int onExtraCallbackWithResult = 750000;
        private int IAuthTabCallbackStub = 4;
        private int asBinder = 250000;
        private int IAuthTabCallback = 50000000;
        private int onWarmupCompleted = 2;
        private int onExtraCallback = 4;

        public SelectionManagerKtExternalSyntheticLambda1 onExtraCallbackWithResult() {
            return new SelectionManagerKtExternalSyntheticLambda1(this);
        }
    }

    protected SelectionManagerKtExternalSyntheticLambda1(onNavigationEvent onnavigationevent) {
        this.onExtraCallback = onnavigationevent.onNavigationEvent;
        this.IAuthTabCallback = onnavigationevent.onExtraCallbackWithResult;
        this.onTransact = onnavigationevent.IAuthTabCallbackStub;
        this.IAuthTabCallbackDefault = onnavigationevent.asBinder;
        this.asInterface = onnavigationevent.IAuthTabCallback;
        this.onWarmupCompleted = onnavigationevent.onWarmupCompleted;
        this.onNavigationEvent = onnavigationevent.onExtraCallback;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda8.IAuthTabCallback
    public int onExtraCallback(int i2, int i3, int i4, int i5, int i6, int i7, double d) {
        return (((Math.max(i2, (int) (onExtraCallback(i2, i3, i4, i5, i6, i7) * d)) + i5) - 1) / i5) * i5;
    }

    protected int onExtraCallback(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i4 == 0) {
            return onExtraCallbackWithResult(i2, i6, i5);
        }
        if (i4 == 1) {
            return onExtraCallbackWithResult(i3);
        }
        if (i4 == 2) {
            return onExtraCallbackWithResult(i3, i7);
        }
        throw new IllegalArgumentException();
    }

    protected int onExtraCallbackWithResult(int i2, int i3, int i4) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i2 * this.onTransact, onExtraCallback(this.onExtraCallback, i3, i4), onExtraCallback(this.IAuthTabCallback, i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int onExtraCallbackWithResult(int i2, int i3) {
        int i4;
        int iOnExtraCallback;
        int i5 = this.IAuthTabCallbackDefault;
        if (i2 == 5) {
            i4 = this.onWarmupCompleted;
        } else {
            if (i2 == 8) {
                i4 = this.onNavigationEvent;
            }
            if (i3 == -1) {
                iOnExtraCallback = IntMath.divide(i3, 8, RoundingMode.CEILING);
            } else {
                iOnExtraCallback = onExtraCallback(i2);
            }
            return Ints.checkedCast((i5 * iOnExtraCallback) / 1000000);
        }
        i5 *= i4;
        if (i3 == -1) {
        }
        return Ints.checkedCast((i5 * iOnExtraCallback) / 1000000);
    }

    protected int onExtraCallbackWithResult(int i2) {
        return Ints.checkedCast((this.asInterface * onExtraCallback(i2)) / 1000000);
    }

    protected static int onExtraCallback(int i2, int i3, int i4) {
        return Ints.checkedCast(((i2 * i3) * i4) / 1000000);
    }

    private static int onExtraCallback(int i2) {
        int iIAuthTabCallback = DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.IAuthTabCallback(i2);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(iIAuthTabCallback != -2147483647);
        return iIAuthTabCallback;
    }
}
