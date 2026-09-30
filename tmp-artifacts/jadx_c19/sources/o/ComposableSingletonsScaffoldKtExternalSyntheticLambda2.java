package o;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletonsScaffoldKtExternalSyntheticLambda2 implements ComposableSingletonsScaffoldKtExternalSyntheticLambda3 {
    private final int IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private int asBinder;
    private int onExtraCallback;
    private final byte[] onExtraCallbackWithResult;
    private ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1[] onNavigationEvent;
    private int onWarmupCompleted;

    public ComposableSingletonsScaffoldKtExternalSyntheticLambda2(boolean z, int i2) {
        this(z, i2, 0);
    }

    public ComposableSingletonsScaffoldKtExternalSyntheticLambda2(boolean z, int i2, int i3) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 > 0);
        RecordingInputConnection_androidKt.onNavigationEvent(i3 >= 0);
        this.IAuthTabCallbackDefault = z;
        this.IAuthTabCallback = i2;
        this.onWarmupCompleted = i3;
        this.onNavigationEvent = new ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1[i3 + 100];
        if (i3 > 0) {
            this.onExtraCallbackWithResult = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.onNavigationEvent[i4] = new ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1(this.onExtraCallbackWithResult, i4 * i2);
            }
            return;
        }
        this.onExtraCallbackWithResult = null;
    }

    public void onNavigationEvent() {
        synchronized (this) {
            if (this.IAuthTabCallbackDefault) {
                IAuthTabCallback(0);
            }
        }
    }

    public void IAuthTabCallback(int i2) {
        synchronized (this) {
            boolean z = i2 < this.asBinder;
            this.asBinder = i2;
            if (z) {
                onExtraCallbackWithResult();
            }
        }
    }

    public ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 IAuthTabCallback() {
        ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1;
        synchronized (this) {
            this.onExtraCallback++;
            int i2 = this.onWarmupCompleted;
            if (i2 > 0) {
                ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1[] composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr = this.onNavigationEvent;
                int i3 = i2 - 1;
                this.onWarmupCompleted = i3;
                composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 = (ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr[i3]);
                this.onNavigationEvent[this.onWarmupCompleted] = null;
            } else {
                composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 = new ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1(new byte[this.IAuthTabCallback], 0);
                int i4 = this.onExtraCallback;
                ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1[] composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr2 = this.onNavigationEvent;
                if (i4 > composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr2.length) {
                    this.onNavigationEvent = (ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1[]) Arrays.copyOf(composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr2, composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr2.length << 1);
                }
            }
        }
        return composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1;
    }

    public void IAuthTabCallback(ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1) {
        synchronized (this) {
            ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1[] composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr = this.onNavigationEvent;
            int i2 = this.onWarmupCompleted;
            this.onWarmupCompleted = i2 + 1;
            composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr[i2] = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1;
            this.onExtraCallback--;
            notifyAll();
        }
    }

    public void onWarmupCompleted(@Nullable ComposableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted composableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted) {
        synchronized (this) {
            while (composableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted != null) {
                ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1[] composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr = this.onNavigationEvent;
                int i2 = this.onWarmupCompleted;
                this.onWarmupCompleted = i2 + 1;
                composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr[i2] = composableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted.onNavigationEvent();
                this.onExtraCallback--;
                composableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted = composableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted.onWarmupCompleted();
            }
            notifyAll();
        }
    }

    public void onExtraCallbackWithResult() {
        synchronized (this) {
            int i2 = 0;
            int iMax = Math.max(0, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.asBinder, this.IAuthTabCallback) - this.onExtraCallback);
            int i3 = this.onWarmupCompleted;
            if (iMax >= i3) {
                return;
            }
            if (this.onExtraCallbackWithResult != null) {
                loop0: while (true) {
                    i3--;
                    while (i2 <= i3) {
                        ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 = (ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent[i2]);
                        if (composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1.onWarmupCompleted != this.onExtraCallbackWithResult) {
                            ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda12 = (ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent[i3]);
                            if (composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda12.onWarmupCompleted != this.onExtraCallbackWithResult) {
                                break;
                            }
                            ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1[] composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr = this.onNavigationEvent;
                            composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr[i2] = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda12;
                            composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1Arr[i3] = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1;
                            i3--;
                        }
                        i2++;
                    }
                }
                iMax = Math.max(iMax, i2);
                if (iMax >= this.onWarmupCompleted) {
                    return;
                }
            }
            Arrays.fill(this.onNavigationEvent, iMax, this.onWarmupCompleted, (Object) null);
            this.onWarmupCompleted = iMax;
        }
    }

    public int onWarmupCompleted() {
        int i2;
        int i3;
        synchronized (this) {
            i2 = this.onExtraCallback;
            i3 = this.IAuthTabCallback;
        }
        return i2 * i3;
    }

    public int onExtraCallback() {
        return this.IAuthTabCallback;
    }
}
