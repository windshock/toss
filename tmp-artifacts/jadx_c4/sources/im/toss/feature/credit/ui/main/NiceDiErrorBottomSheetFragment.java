package im.toss.feature.credit.ui.main;

import android.app.Dialog;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.FlowLineMeasurePolicyExternalSyntheticLambda0;
import o.PlayerErrorCode;
import o.RotationProvider1;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.initMonitorRunnable;
import o.r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NiceDiErrorBottomSheetFragment extends r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int[] onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static int onTransact;
    private initMonitorRunnable onExtraCallback;

    static {
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        onNavigationEvent = 8;
        int i = IAuthTabCallbackStub + 63;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, NiceDiErrorBottomSheetFragment niceDiErrorBottomSheetFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(str, str2, niceDiErrorBottomSheetFragment, setDetectableSize);
        }
        onExtraCallbackWithResult(str, str2, niceDiErrorBottomSheetFragment, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, setDetectableSize);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NiceDiErrorBottomSheetFragment niceDiErrorBottomSheetFragment, String str, String str2, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(niceDiErrorBottomSheetFragment, str, str2, view);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setupDialog(@NotNull Dialog dialog, int i) {
        initMonitorRunnable initmonitorrunnableOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 121;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialog, "");
            super/*androidx.appcompat.app.AppCompatDialogFragment*/.setupDialog(dialog, i);
            initmonitorrunnableOnExtraCallbackWithResult = initMonitorRunnable.onExtraCallbackWithResult(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(initmonitorrunnableOnExtraCallbackWithResult, "");
            this.onExtraCallback = initmonitorrunnableOnExtraCallbackWithResult;
            int i4 = 19 / 0;
            if (initmonitorrunnableOnExtraCallbackWithResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = IAuthTabCallback + 47;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                initmonitorrunnableOnExtraCallbackWithResult = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(dialog, "");
            super/*androidx.appcompat.app.AppCompatDialogFragment*/.setupDialog(dialog, i);
            initmonitorrunnableOnExtraCallbackWithResult = initMonitorRunnable.onExtraCallbackWithResult(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(initmonitorrunnableOnExtraCallbackWithResult, "");
            this.onExtraCallback = initmonitorrunnableOnExtraCallbackWithResult;
            if (initmonitorrunnableOnExtraCallbackWithResult == null) {
            }
        }
        dialog.setContentView((View) initmonitorrunnableOnExtraCallbackWithResult.onExtraCallbackWithResult());
        onExtraCallback();
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, NiceDiErrorBottomSheetFragment niceDiErrorBottomSheetFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("bottomsheet_title", str);
        setDetectableSize.onExtraCallback("bottomsheet_description", str2);
        Object[] objArr = new Object[1];
        a(new int[]{-1831713151, -2127100520, 1199299543, 410763810, -263057656, -2096868897}, 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), niceDiErrorBottomSheetFragment.getString(R.string.nice_di_bottom_sheet_cta));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 23;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(final NiceDiErrorBottomSheetFragment niceDiErrorBottomSheetFragment, final String str, final String str2, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1244737L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.NiceDiErrorBottomSheetFragment$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 39;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    NiceDiErrorBottomSheetFragment.IAuthTabCallback(str, str2, niceDiErrorBottomSheetFragment, (SetDetectableSize) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = NiceDiErrorBottomSheetFragment.IAuthTabCallback(str, str2, niceDiErrorBottomSheetFragment, (SetDetectableSize) obj);
                int i4 = onNavigationEvent + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 92 / 0;
                }
                return unitIAuthTabCallback;
            }
        }, 14, null);
        FlowLineMeasurePolicyExternalSyntheticLambda0.onNavigationEvent(niceDiErrorBottomSheetFragment, "NiceDiErrorBottomSheetFragment_RESULT_KEY", RotationProvider1.onWarmupCompleted());
        niceDiErrorBottomSheetFragment.dismissAllowingStateLoss();
        int i2 = IAuthTabCallbackDefault + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        final String string = requireContext().getString(R.string.nice_di_bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        final String string2 = requireContext().getString(R.string.format_nice_di_bottom_sheet_description, PlayerErrorCode.onPostMessage());
        Intrinsics.checkNotNullExpressionValue(string2, "");
        initMonitorRunnable initmonitorrunnable = this.onExtraCallback;
        initMonitorRunnable initmonitorrunnable2 = null;
        if (initmonitorrunnable == null) {
            int i2 = IAuthTabCallbackDefault + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = IAuthTabCallbackDefault + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            initmonitorrunnable = null;
        }
        BottomSheetHeader bottomSheetHeader = initmonitorrunnable.onExtraCallbackWithResult;
        bottomSheetHeader.setTitle(string);
        bottomSheetHeader.setDescription(string2);
        initMonitorRunnable initmonitorrunnable3 = this.onExtraCallback;
        if (initmonitorrunnable3 == null) {
            int i6 = IAuthTabCallback + 11;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            initmonitorrunnable3 = null;
        }
        initmonitorrunnable3.onWarmupCompleted.playAnimation();
        initMonitorRunnable initmonitorrunnable4 = this.onExtraCallback;
        if (initmonitorrunnable4 == null) {
            int i8 = IAuthTabCallbackDefault + 119;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                initmonitorrunnable2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            initmonitorrunnable2 = initmonitorrunnable4;
        }
        initmonitorrunnable2.onNavigationEvent.asInterface().setOnClickListener(new View.OnClickListener() { // from class: im.toss.feature.credit.ui.main.NiceDiErrorBottomSheetFragment$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                NiceDiErrorBottomSheetFragment.onExtraCallbackWithResult(this.f$0, string, string2, view);
                int i12 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }
        });
        ConvertByteArrayToFloatArray.onExtraCallback(1244735L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.NiceDiErrorBottomSheetFragment$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                Unit unitIAuthTabCallback = NiceDiErrorBottomSheetFragment.IAuthTabCallback(string, string2, (SetDetectableSize) obj);
                int i12 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
    }

    private static final Unit onWarmupCompleted(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("bottomsheet_title", str);
            setDetectableSize.onExtraCallback("bottomsheet_description", str2);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("bottomsheet_title", str);
        setDetectableSize.onExtraCallback("bottomsheet_description", str2);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i4 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 107;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 72 - (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        float f = 0.0f;
        if (iArr5 != null) {
            int i8 = $11 + 99;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 109;
                $11 = i11 % 128;
                if (i11 % i2 == 0) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getTapTimeout() >> 16) + 72, 8849 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i10 >>>= 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 72 - View.MeasureSpec.getSize(0), 8848 - View.getDefaultSize(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                }
                i2 = 2;
                f = 0.0f;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 22252), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, 10300 - TextUtils.lastIndexOf("", '0', 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 4033), Color.rgb(0, 0, 0) + 16777294, 7398 - View.resolveSize(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr2, 0, i);
        int i17 = $11 + 51;
        $10 = i17 % 128;
        int i18 = i17 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new int[]{635065869, 1184309684, 1236118145, -485175029, -282350885, 418280043, -1610499792, 418568194, 1436976659, 760102521, -575910187, 1977176982, -1260469765, 1048016619, 1892986436, 809828388, -611050573, 657664642};
    }
}
