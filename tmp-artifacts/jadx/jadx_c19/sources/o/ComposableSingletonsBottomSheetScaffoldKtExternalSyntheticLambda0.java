package o;

import android.graphics.Point;
import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import o.ChipKtExternalSyntheticLambda9;
import o.ColorsKtExternalSyntheticLambda0;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda0 {
    public static ColorsKtExternalSyntheticLambda0[] onExtraCallbackWithResult(ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onnavigationeventArr, onExtraCallback onextracallback) {
        ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr = new ColorsKtExternalSyntheticLambda0[onnavigationeventArr.length];
        boolean z = false;
        for (int i2 = 0; i2 < onnavigationeventArr.length; i2++) {
            ColorsKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent = onnavigationeventArr[i2];
            if (onnavigationevent != null) {
                int[] iArr = onnavigationevent.onNavigationEvent;
                if (iArr.length > 1 && !z) {
                    colorsKtExternalSyntheticLambda0Arr[i2] = onextracallback.createAdaptiveTrackSelection(onnavigationevent);
                    z = true;
                } else {
                    colorsKtExternalSyntheticLambda0Arr[i2] = new ChipKtExternalSyntheticLambda6(onnavigationevent.onWarmupCompleted, iArr[0], onnavigationevent.onExtraCallback);
                }
            }
        }
        return colorsKtExternalSyntheticLambda0Arr;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [o.ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onWarmupCompleted] */
    public static ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onWarmupCompleted onWarmupCompleted(ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final int iAccess100 = colorsKtExternalSyntheticLambda0.access100();
        final int i2 = 0;
        final int i3 = 0;
        for (int i4 = 0; i4 < iAccess100; i4++) {
            if (colorsKtExternalSyntheticLambda0.onWarmupCompleted(i4, jElapsedRealtime)) {
                i3++;
            }
        }
        final int i5 = 1;
        return new Object(i5, i2, iAccess100, i3) { // from class: o.ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onWarmupCompleted
            public final int IAuthTabCallback;
            public final int onExtraCallbackWithResult;
            public final int onNavigationEvent;
            public final int onWarmupCompleted;

            {
                this.onWarmupCompleted = i5;
                this.onExtraCallbackWithResult = i2;
                this.onNavigationEvent = iAccess100;
                this.IAuthTabCallback = i3;
            }

            public boolean onWarmupCompleted(int i6) {
                return i6 == 1 ? this.onWarmupCompleted - this.onExtraCallbackWithResult > 1 : this.onNavigationEvent - this.IAuthTabCallback > 1;
            }
        };
    }

    public static CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12 onExtraCallbackWithResult(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, ComposableSingletonsAppBarKtExternalSyntheticLambda1[] composableSingletonsAppBarKtExternalSyntheticLambda1Arr) {
        List[] listArr = new List[composableSingletonsAppBarKtExternalSyntheticLambda1Arr.length];
        for (int i2 = 0; i2 < composableSingletonsAppBarKtExternalSyntheticLambda1Arr.length; i2++) {
            ComposableSingletonsAppBarKtExternalSyntheticLambda1 composableSingletonsAppBarKtExternalSyntheticLambda1 = composableSingletonsAppBarKtExternalSyntheticLambda1Arr[i2];
            listArr[i2] = composableSingletonsAppBarKtExternalSyntheticLambda1 != null ? ImmutableList.of(composableSingletonsAppBarKtExternalSyntheticLambda1) : ImmutableList.of();
        }
        return onNavigationEvent(onnavigationevent, listArr);
    }

    public static CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12 onNavigationEvent(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, List<? extends ComposableSingletonsAppBarKtExternalSyntheticLambda1>[] listArr) {
        boolean z;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i2 = 0; i2 < onnavigationevent.IAuthTabCallback(); i2++) {
            BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult(i2);
            List<? extends ComposableSingletonsAppBarKtExternalSyntheticLambda1> list = listArr[i2];
            for (int i3 = 0; i3 < bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult.onExtraCallbackWithResult; i3++) {
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted = bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult.onWarmupCompleted(i3);
                boolean z2 = onnavigationevent.onNavigationEvent(i2, i3, false) != 0;
                int i4 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted;
                int[] iArr = new int[i4];
                boolean[] zArr = new boolean[i4];
                for (int i5 = 0; i5 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted; i5++) {
                    iArr[i5] = onnavigationevent.IAuthTabCallback(i2, i3, i5);
                    int i6 = 0;
                    while (true) {
                        if (i6 >= list.size()) {
                            z = false;
                            break;
                        }
                        ComposableSingletonsAppBarKtExternalSyntheticLambda1 composableSingletonsAppBarKtExternalSyntheticLambda1 = list.get(i6);
                        if (composableSingletonsAppBarKtExternalSyntheticLambda1.onExtraCallback().equals(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted) && composableSingletonsAppBarKtExternalSyntheticLambda1.onExtraCallbackWithResult(i5) != -1) {
                            z = true;
                            break;
                        }
                        i6++;
                    }
                    zArr[i5] = z;
                }
                builder.add(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12.onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted, z2, iArr, zArr));
            }
        }
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult2 = onnavigationevent.onExtraCallbackWithResult();
        for (int i7 = 0; i7 < bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult2.onExtraCallbackWithResult; i7++) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted2 = bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult2.onWarmupCompleted(i7);
            int[] iArr2 = new int[coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted2.onWarmupCompleted];
            Arrays.fill(iArr2, 0);
            builder.add(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12.onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted2, false, iArr2, new boolean[coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted2.onWarmupCompleted]));
        }
        return new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12(builder.build());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Point onExtraCallbackWithResult(boolean z, int i2, int i3, int i4, int i5) {
        if (z) {
            if ((i4 > i5) == (i2 > i3)) {
                i3 = i2;
                i2 = i3;
            }
        }
        int i6 = i4 * i2;
        int i7 = i5 * i3;
        if (i6 >= i7) {
            return new Point(i3, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(i7, i4));
        }
        return new Point(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(i6, i5), i2);
    }
}
