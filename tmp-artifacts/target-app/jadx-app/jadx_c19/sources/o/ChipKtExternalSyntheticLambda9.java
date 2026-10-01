package o;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import java.util.Arrays;
import java.util.Objects;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ChipKtExternalSyntheticLambda9 extends ComposableSingletonsAppBarKtExternalSyntheticLambda0 {
    private onNavigationEvent IAuthTabCallback;

    protected abstract Pair<RendererConfiguration[], ColorsKtExternalSyntheticLambda0[]> onExtraCallback(onNavigationEvent onnavigationevent, int[][][] iArr, int[] iArr2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    public static final class onNavigationEvent {
        private final int[] IAuthTabCallback;
        private final BottomSheetScaffoldKtExternalSyntheticLambda11 IAuthTabCallbackDefault;
        private final BottomSheetScaffoldKtExternalSyntheticLambda11[] onExtraCallback;
        private final int[][][] onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final int[] onTransact;
        private final String[] onWarmupCompleted;

        onNavigationEvent(String[] strArr, int[] iArr, BottomSheetScaffoldKtExternalSyntheticLambda11[] bottomSheetScaffoldKtExternalSyntheticLambda11Arr, int[] iArr2, int[][][] iArr3, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11) {
            this.onWarmupCompleted = strArr;
            this.onTransact = iArr;
            this.onExtraCallback = bottomSheetScaffoldKtExternalSyntheticLambda11Arr;
            this.onExtraCallbackWithResult = iArr3;
            this.IAuthTabCallback = iArr2;
            this.IAuthTabCallbackDefault = bottomSheetScaffoldKtExternalSyntheticLambda11;
            this.onNavigationEvent = iArr.length;
        }

        public int IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public int onNavigationEvent(int i2) {
            return this.onTransact[i2];
        }

        public BottomSheetScaffoldKtExternalSyntheticLambda11 onExtraCallbackWithResult(int i2) {
            return this.onExtraCallback[i2];
        }

        public int onWarmupCompleted(int i2, int i3, int i4) {
            return this.onExtraCallbackWithResult[i2][i3][i4];
        }

        public int IAuthTabCallback(int i2, int i3, int i4) {
            return RendererCapabilities.onExtraCallbackWithResult(onWarmupCompleted(i2, i3, i4));
        }

        public int onNavigationEvent(int i2, int i3, boolean z) {
            int i4 = this.onExtraCallback[i2].onWarmupCompleted(i3).onWarmupCompleted;
            int[] iArr = new int[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                int iIAuthTabCallback = IAuthTabCallback(i2, i3, i6);
                if (iIAuthTabCallback == 4 || (z && iIAuthTabCallback == 3)) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            return onExtraCallbackWithResult(i2, i3, Arrays.copyOf(iArr, i5));
        }

        public int onExtraCallbackWithResult(int i2, int i3, int[] iArr) {
            int i4 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i5 = 0;
            while (i4 < iArr.length) {
                String str2 = this.onExtraCallback[i2].onWarmupCompleted(i3).IAuthTabCallback(iArr[i4]).isEngagementSignalsApiAvailable;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, RendererCapabilities.onWarmupCompleted(this.onExtraCallbackWithResult[i2][i3][i4]));
                i4++;
                i5++;
            }
            return z ? Math.min(iMin, this.IAuthTabCallback[i2]) : iMin;
        }

        public BottomSheetScaffoldKtExternalSyntheticLambda11 onExtraCallbackWithResult() {
            return this.IAuthTabCallbackDefault;
        }
    }

    public final onNavigationEvent asInterface() {
        return this.IAuthTabCallback;
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0
    public final void onNavigationEvent(@Nullable Object obj) {
        this.IAuthTabCallback = (onNavigationEvent) obj;
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0
    public final ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 onNavigationEvent(RendererCapabilities[] rendererCapabilitiesArr, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int[] iArrOnWarmupCompleted;
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[][] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[length][];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = bottomSheetScaffoldKtExternalSyntheticLambda11.onExtraCallbackWithResult;
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i2] = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[i3];
            iArr2[i2] = new int[i3][];
        }
        int[] iArrIAuthTabCallback = IAuthTabCallback(rendererCapabilitiesArr);
        for (int i4 = 0; i4 < bottomSheetScaffoldKtExternalSyntheticLambda11.onExtraCallbackWithResult; i4++) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted = bottomSheetScaffoldKtExternalSyntheticLambda11.onWarmupCompleted(i4);
            int iOnNavigationEvent = onNavigationEvent(rendererCapabilitiesArr, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted, iArr, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onExtraCallback == 5);
            if (iOnNavigationEvent == rendererCapabilitiesArr.length) {
                iArrOnWarmupCompleted = new int[coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted];
            } else {
                iArrOnWarmupCompleted = onWarmupCompleted(rendererCapabilitiesArr[iOnNavigationEvent], coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted);
            }
            int i5 = iArr[iOnNavigationEvent];
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[iOnNavigationEvent][i5] = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted;
            iArr2[iOnNavigationEvent][i5] = iArrOnWarmupCompleted;
            iArr[iOnNavigationEvent] = i5 + 1;
        }
        BottomSheetScaffoldKtExternalSyntheticLambda11[] bottomSheetScaffoldKtExternalSyntheticLambda11Arr = new BottomSheetScaffoldKtExternalSyntheticLambda11[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i6 = 0; i6 < rendererCapabilitiesArr.length; i6++) {
            int i7 = iArr[i6];
            bottomSheetScaffoldKtExternalSyntheticLambda11Arr[i6] = new BottomSheetScaffoldKtExternalSyntheticLambda11((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i6], i7));
            iArr2[i6] = (int[][]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(iArr2[i6], i7);
            strArr[i6] = rendererCapabilitiesArr[i6].extraCommand();
            iArr3[i6] = rendererCapabilitiesArr[i6].ICustomTabsCallback();
        }
        onNavigationEvent onnavigationevent = new onNavigationEvent(strArr, iArr3, bottomSheetScaffoldKtExternalSyntheticLambda11Arr, iArrIAuthTabCallback, iArr2, new BottomSheetScaffoldKtExternalSyntheticLambda11((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], ColorsKtExternalSyntheticLambda0[]> pairOnExtraCallback = onExtraCallback(onnavigationevent, iArr2, iArrIAuthTabCallback, onextracallbackwithresult, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        return new ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0((RendererConfiguration[]) pairOnExtraCallback.first, (ColorsKtExternalSyntheticLambda0[]) pairOnExtraCallback.second, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult(onnavigationevent, (ComposableSingletonsAppBarKtExternalSyntheticLambda1[]) pairOnExtraCallback.second), onnavigationevent);
    }

    private static int onNavigationEvent(RendererCapabilities[] rendererCapabilitiesArr, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int length = rendererCapabilitiesArr.length;
        int i2 = 0;
        boolean z2 = true;
        for (int i3 = 0; i3 < rendererCapabilitiesArr.length; i3++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i3];
            int iMax = 0;
            for (int i4 = 0; i4 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted; i4++) {
                iMax = Math.max(iMax, RendererCapabilities.onExtraCallbackWithResult(rendererCapabilities.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.IAuthTabCallback(i4))));
            }
            boolean z3 = iArr[i3] == 0;
            if (iMax > i2 || (iMax == i2 && z && !z2 && z3)) {
                length = i3;
                z2 = z3;
                i2 = iMax;
            }
        }
        return length;
    }

    private static int[] onWarmupCompleted(RendererCapabilities rendererCapabilities, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int[] iArr = new int[coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted];
        for (int i2 = 0; i2 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted; i2++) {
            iArr[i2] = rendererCapabilities.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.IAuthTabCallback(i2));
        }
        return iArr;
    }

    private static int[] IAuthTabCallback(RendererCapabilities[] rendererCapabilitiesArr) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = rendererCapabilitiesArr[i2].isEngagementSignalsApiAvailable();
        }
        return iArr;
    }
}
