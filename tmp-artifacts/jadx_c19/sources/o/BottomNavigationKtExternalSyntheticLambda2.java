package o;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o.BottomNavigationKtExternalSyntheticLambda3;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class BottomNavigationKtExternalSyntheticLambda2 {
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda3 IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private onWarmupCompleted asInterface;
    private onWarmupCompleted onExtraCallback;
    private onWarmupCompleted onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted;

    public BottomNavigationKtExternalSyntheticLambda2(ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3) {
        this.IAuthTabCallback = composableSingletonsScaffoldKtExternalSyntheticLambda3;
        int iOnExtraCallback = composableSingletonsScaffoldKtExternalSyntheticLambda3.onExtraCallback();
        this.onNavigationEvent = iOnExtraCallback;
        this.onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(32);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(0L, iOnExtraCallback);
        this.onExtraCallbackWithResult = onwarmupcompleted;
        this.onExtraCallback = onwarmupcompleted;
        this.asInterface = onwarmupcompleted;
    }

    public void onWarmupCompleted() {
        onNavigationEvent(this.onExtraCallbackWithResult);
        this.onExtraCallbackWithResult.onNavigationEvent(0L, this.onNavigationEvent);
        onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
        this.onExtraCallback = onwarmupcompleted;
        this.asInterface = onwarmupcompleted;
        this.IAuthTabCallbackDefault = 0L;
        this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult(long j) {
        RecordingInputConnection_androidKt.onNavigationEvent(j <= this.IAuthTabCallbackDefault);
        this.IAuthTabCallbackDefault = j;
        if (j != 0) {
            onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
            if (j != onwarmupcompleted.onExtraCallback) {
                while (this.IAuthTabCallbackDefault > onwarmupcompleted.IAuthTabCallback) {
                    onwarmupcompleted = onwarmupcompleted.onWarmupCompleted;
                }
                onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onwarmupcompleted.onWarmupCompleted);
                onNavigationEvent(onwarmupcompleted2);
                onWarmupCompleted onwarmupcompleted3 = new onWarmupCompleted(onwarmupcompleted.IAuthTabCallback, this.onNavigationEvent);
                onwarmupcompleted.onWarmupCompleted = onwarmupcompleted3;
                if (this.IAuthTabCallbackDefault == onwarmupcompleted.IAuthTabCallback) {
                    onwarmupcompleted = onwarmupcompleted3;
                }
                this.asInterface = onwarmupcompleted;
                if (this.onExtraCallback == onwarmupcompleted2) {
                    this.onExtraCallback = onwarmupcompleted3;
                    return;
                }
                return;
            }
        }
        onNavigationEvent(this.onExtraCallbackWithResult);
        onWarmupCompleted onwarmupcompleted4 = new onWarmupCompleted(this.IAuthTabCallbackDefault, this.onNavigationEvent);
        this.onExtraCallbackWithResult = onwarmupcompleted4;
        this.onExtraCallback = onwarmupcompleted4;
        this.asInterface = onwarmupcompleted4;
    }

    public void IAuthTabCallback() {
        this.onExtraCallback = this.onExtraCallbackWithResult;
    }

    public void IAuthTabCallback(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, BottomNavigationKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        this.onExtraCallback = onWarmupCompleted(this.onExtraCallback, selectionControllerExternalSyntheticLambda2, iAuthTabCallback, this.onWarmupCompleted);
    }

    public void onWarmupCompleted(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, BottomNavigationKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        onWarmupCompleted(this.onExtraCallback, selectionControllerExternalSyntheticLambda2, iAuthTabCallback, this.onWarmupCompleted);
    }

    public void onNavigationEvent(long j) {
        onWarmupCompleted onwarmupcompleted;
        if (j != -1) {
            while (true) {
                onwarmupcompleted = this.onExtraCallbackWithResult;
                if (j < onwarmupcompleted.IAuthTabCallback) {
                    break;
                }
                this.IAuthTabCallback.IAuthTabCallback(onwarmupcompleted.onExtraCallbackWithResult);
                this.onExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallback();
            }
            if (this.onExtraCallback.onExtraCallback < onwarmupcompleted.onExtraCallback) {
                this.onExtraCallback = onwarmupcompleted;
            }
        }
    }

    public long onExtraCallbackWithResult() {
        return this.IAuthTabCallbackDefault;
    }

    public int onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, int i2, boolean z) throws IOException {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2);
        onWarmupCompleted onwarmupcompleted = this.asInterface;
        int iOnWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda0.onWarmupCompleted(onwarmupcompleted.onExtraCallbackWithResult.onWarmupCompleted, onwarmupcompleted.onExtraCallbackWithResult(this.IAuthTabCallbackDefault), iOnExtraCallbackWithResult);
        if (iOnWarmupCompleted != -1) {
            IAuthTabCallback(iOnWarmupCompleted);
            return iOnWarmupCompleted;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        while (i2 > 0) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2);
            onWarmupCompleted onwarmupcompleted = this.asInterface;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(onwarmupcompleted.onExtraCallbackWithResult.onWarmupCompleted, onwarmupcompleted.onExtraCallbackWithResult(this.IAuthTabCallbackDefault), iOnExtraCallbackWithResult);
            i2 -= iOnExtraCallbackWithResult;
            IAuthTabCallback(iOnExtraCallbackWithResult);
        }
    }

    private void onNavigationEvent(onWarmupCompleted onwarmupcompleted) {
        if (onwarmupcompleted.onExtraCallbackWithResult == null) {
            return;
        }
        this.IAuthTabCallback.onWarmupCompleted(onwarmupcompleted);
        onwarmupcompleted.onExtraCallback();
    }

    private int onExtraCallbackWithResult(int i2) {
        onWarmupCompleted onwarmupcompleted = this.asInterface;
        if (onwarmupcompleted.onExtraCallbackWithResult == null) {
            onwarmupcompleted.onWarmupCompleted(this.IAuthTabCallback.IAuthTabCallback(), new onWarmupCompleted(this.asInterface.IAuthTabCallback, this.onNavigationEvent));
        }
        return Math.min(i2, (int) (this.asInterface.IAuthTabCallback - this.IAuthTabCallbackDefault));
    }

    private void IAuthTabCallback(int i2) {
        long j = this.IAuthTabCallbackDefault + i2;
        this.IAuthTabCallbackDefault = j;
        onWarmupCompleted onwarmupcompleted = this.asInterface;
        if (j == onwarmupcompleted.IAuthTabCallback) {
            this.asInterface = onwarmupcompleted.onWarmupCompleted;
        }
    }

    private static onWarmupCompleted onWarmupCompleted(onWarmupCompleted onwarmupcompleted, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, BottomNavigationKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (selectionControllerExternalSyntheticLambda2.onTransact()) {
            onwarmupcompleted = onNavigationEvent(onwarmupcompleted, selectionControllerExternalSyntheticLambda2, iAuthTabCallback, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        if (selectionControllerExternalSyntheticLambda2.onExtraCallback()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(4);
            onWarmupCompleted onWarmupCompleted2 = onWarmupCompleted(onwarmupcompleted, iAuthTabCallback.onExtraCallbackWithResult, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 4);
            int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            iAuthTabCallback.onExtraCallbackWithResult += 4;
            iAuthTabCallback.onNavigationEvent -= 4;
            selectionControllerExternalSyntheticLambda2.IAuthTabCallback(iICustomTabsCallbackDefault);
            onWarmupCompleted onWarmupCompleted3 = onWarmupCompleted(onWarmupCompleted2, iAuthTabCallback.onExtraCallbackWithResult, selectionControllerExternalSyntheticLambda2.onExtraCallback, iICustomTabsCallbackDefault);
            iAuthTabCallback.onExtraCallbackWithResult += iICustomTabsCallbackDefault;
            int i2 = iAuthTabCallback.onNavigationEvent - iICustomTabsCallbackDefault;
            iAuthTabCallback.onNavigationEvent = i2;
            selectionControllerExternalSyntheticLambda2.onExtraCallbackWithResult(i2);
            return onWarmupCompleted(onWarmupCompleted3, iAuthTabCallback.onExtraCallbackWithResult, selectionControllerExternalSyntheticLambda2.onNavigationEvent, iAuthTabCallback.onNavigationEvent);
        }
        selectionControllerExternalSyntheticLambda2.IAuthTabCallback(iAuthTabCallback.onNavigationEvent);
        return onWarmupCompleted(onwarmupcompleted, iAuthTabCallback.onExtraCallbackWithResult, selectionControllerExternalSyntheticLambda2.onExtraCallback, iAuthTabCallback.onNavigationEvent);
    }

    private static onWarmupCompleted onNavigationEvent(onWarmupCompleted onwarmupcompleted, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, BottomNavigationKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        long j = iAuthTabCallback.onExtraCallbackWithResult;
        int iOnUnminimized = 1;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(1);
        onWarmupCompleted onWarmupCompleted2 = onWarmupCompleted(onwarmupcompleted, j, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 1);
        long j2 = j + 1;
        byte b = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[0];
        boolean z = (b & 128) != 0;
        int i2 = b & Byte.MAX_VALUE;
        TextFieldSelectionState_androidKtExternalSyntheticLambda2 textFieldSelectionState_androidKtExternalSyntheticLambda2 = selectionControllerExternalSyntheticLambda2.IAuthTabCallback;
        byte[] bArr = textFieldSelectionState_androidKtExternalSyntheticLambda2.onWarmupCompleted;
        if (bArr == null) {
            textFieldSelectionState_androidKtExternalSyntheticLambda2.onWarmupCompleted = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        onWarmupCompleted onWarmupCompleted3 = onWarmupCompleted(onWarmupCompleted2, j2, textFieldSelectionState_androidKtExternalSyntheticLambda2.onWarmupCompleted, i2);
        long j3 = j2 + i2;
        if (z) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(2);
            onWarmupCompleted3 = onWarmupCompleted(onWarmupCompleted3, j3, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 2);
            j3 += 2;
            iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        }
        int i3 = iOnUnminimized;
        int[] iArr = textFieldSelectionState_androidKtExternalSyntheticLambda2.onTransact;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = textFieldSelectionState_androidKtExternalSyntheticLambda2.asInterface;
        if (iArr3 == null || iArr3.length < i3) {
            iArr3 = new int[i3];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i4 = i3 * 6;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(i4);
            onWarmupCompleted3 = onWarmupCompleted(onWarmupCompleted3, j3, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), i4);
            j3 += i4;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5] = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                iArr4[i5] = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = iAuthTabCallback.onNavigationEvent - ((int) (j3 - iAuthTabCallback.onExtraCallbackWithResult));
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback2 = (ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{iAuthTabCallback.onExtraCallback}, -1084655742);
        textFieldSelectionState_androidKtExternalSyntheticLambda2.IAuthTabCallback(i3, iArr2, iArr4, iAuthTabCallback2.onWarmupCompleted, textFieldSelectionState_androidKtExternalSyntheticLambda2.onWarmupCompleted, iAuthTabCallback2.IAuthTabCallback, iAuthTabCallback2.onExtraCallbackWithResult, iAuthTabCallback2.onNavigationEvent);
        long j4 = iAuthTabCallback.onExtraCallbackWithResult;
        int i6 = (int) (j3 - j4);
        iAuthTabCallback.onExtraCallbackWithResult = j4 + i6;
        iAuthTabCallback.onNavigationEvent -= i6;
        return onWarmupCompleted3;
    }

    private static onWarmupCompleted onWarmupCompleted(onWarmupCompleted onwarmupcompleted, long j, ByteBuffer byteBuffer, int i2) {
        onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback(onwarmupcompleted, j);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (onwarmupcompletedOnExtraCallback.IAuthTabCallback - j));
            byteBuffer.put(onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult.onWarmupCompleted, onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(j), iMin);
            i2 -= iMin;
            j += iMin;
            if (j == onwarmupcompletedOnExtraCallback.IAuthTabCallback) {
                onwarmupcompletedOnExtraCallback = onwarmupcompletedOnExtraCallback.onWarmupCompleted;
            }
        }
        return onwarmupcompletedOnExtraCallback;
    }

    private static onWarmupCompleted onWarmupCompleted(onWarmupCompleted onwarmupcompleted, long j, byte[] bArr, int i2) {
        onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback(onwarmupcompleted, j);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (onwarmupcompletedOnExtraCallback.IAuthTabCallback - j));
            System.arraycopy(onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult.onWarmupCompleted, onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(j), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j += iMin;
            if (j == onwarmupcompletedOnExtraCallback.IAuthTabCallback) {
                onwarmupcompletedOnExtraCallback = onwarmupcompletedOnExtraCallback.onWarmupCompleted;
            }
        }
        return onwarmupcompletedOnExtraCallback;
    }

    private static onWarmupCompleted onExtraCallback(onWarmupCompleted onwarmupcompleted, long j) {
        while (j >= onwarmupcompleted.IAuthTabCallback) {
            onwarmupcompleted = onwarmupcompleted.onWarmupCompleted;
        }
        return onwarmupcompleted;
    }

    static final class onWarmupCompleted implements ComposableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted {
        public long IAuthTabCallback;
        public long onExtraCallback;
        public ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 onExtraCallbackWithResult;
        public onWarmupCompleted onWarmupCompleted;

        public onWarmupCompleted(long j, int i2) {
            onNavigationEvent(j, i2);
        }

        public void onNavigationEvent(long j, int i2) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult == null);
            this.onExtraCallback = j;
            this.IAuthTabCallback = j + i2;
        }

        public void onWarmupCompleted(ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1, onWarmupCompleted onwarmupcompleted) {
            this.onExtraCallbackWithResult = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1;
            this.onWarmupCompleted = onwarmupcompleted;
        }

        public int onExtraCallbackWithResult(long j) {
            return ((int) (j - this.onExtraCallback)) + this.onExtraCallbackWithResult.onExtraCallback;
        }

        public onWarmupCompleted onExtraCallback() {
            this.onExtraCallbackWithResult = null;
            onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
            this.onWarmupCompleted = null;
            return onwarmupcompleted;
        }

        @Override // o.ComposableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted
        public ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1 onNavigationEvent() {
            return (ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        }

        @Override // o.ComposableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted
        public ComposableSingletonsScaffoldKtExternalSyntheticLambda3$onWarmupCompleted onWarmupCompleted() {
            onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
            if (onwarmupcompleted == null || onwarmupcompleted.onExtraCallbackWithResult == null) {
                return null;
            }
            return onwarmupcompleted;
        }
    }
}
