package o;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.uikit.widget.TdsTooltipV1View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.RealImageLoaderexecute2;
import o.RealImageLoaderexecute2job1;
import o.RealImageLoaderexecuteresult1;
import o.createCameraCaptureCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderexecuteresult1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[RealImageLoaderexecute2.IAuthTabCallback.values().length];
            try {
                iArr[RealImageLoaderexecute2.IAuthTabCallback.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RealImageLoaderexecute2.IAuthTabCallback.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RealImageLoaderexecute2.IAuthTabCallback.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RealImageLoaderexecute2.IAuthTabCallback.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[RealImageLoaderexecute2.onWarmupCompleted.values().length];
            try {
                iArr2[RealImageLoaderexecute2.onWarmupCompleted.NONE.ordinal()] = 1;
                int i = IAuthTabCallbackStub + 35;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RealImageLoaderexecute2.onWarmupCompleted.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RealImageLoaderexecute2.onWarmupCompleted.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            onNavigationEvent = iArr2;
            int[] iArr3 = new int[RealImageLoaderexecute2.onExtraCallbackWithResult.values().length];
            try {
                iArr3[RealImageLoaderexecute2.onExtraCallbackWithResult.SMALL.ordinal()] = 1;
                int i4 = IAuthTabCallbackStub + 5;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[RealImageLoaderexecute2.onExtraCallbackWithResult.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[RealImageLoaderexecute2.onExtraCallbackWithResult.LARGE.ordinal()] = 3;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            onWarmupCompleted = iArr3;
            int[] iArr4 = new int[RealImageLoaderexecute2.onExtraCallback.values().length];
            try {
                iArr4[RealImageLoaderexecute2.onExtraCallback.SHOW.ordinal()] = 1;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[RealImageLoaderexecute2.onExtraCallback.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[RealImageLoaderexecute2.onExtraCallback.NONE.ordinal()] = 3;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused13) {
            }
            onExtraCallback = iArr4;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(RealImageLoaderexecute2.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallback);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = onExtraCallback + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CharSequence charSequence = (CharSequence) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        RealImageLoaderexecute2job1 realImageLoaderexecute2job1 = (RealImageLoaderexecute2job1) objArr[2];
        RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult = (RealImageLoaderexecute2.onExtraCallbackWithResult) objArr[3];
        RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback = (RealImageLoaderexecute2.IAuthTabCallback) objArr[4];
        RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted = (RealImageLoaderexecute2.onWarmupCompleted) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        Float f = (Float) objArr[9];
        Float f2 = (Float) objArr[10];
        boolean zBooleanValue2 = ((Boolean) objArr[11]).booleanValue();
        int iIntValue3 = ((Number) objArr[12]).intValue();
        int iIntValue4 = ((Number) objArr[13]).intValue();
        int iIntValue5 = ((Number) objArr[14]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[15];
        int iIntValue6 = ((Number) objArr[16]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(charSequence, quirksExternalSyntheticBackport0, realImageLoaderexecute2job1, onextracallbackwithresult, iAuthTabCallback, onwarmupcompleted, iIntValue, zBooleanValue, iIntValue2, f, f2, zBooleanValue2, iIntValue3, iIntValue4, iIntValue5, cameraCaptureResultEmptyCameraCaptureResult, iIntValue6);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(charSequence, quirksExternalSyntheticBackport0, realImageLoaderexecute2job1, onextracallbackwithresult, iAuthTabCallback, onwarmupcompleted, iIntValue, zBooleanValue, iIntValue2, f, f2, zBooleanValue2, iIntValue3, iIntValue4, iIntValue5, cameraCaptureResultEmptyCameraCaptureResult, iIntValue6);
        int i3 = onExtraCallback + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CharSequence charSequence, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RealImageLoaderexecute2job1 realImageLoaderexecute2job1, RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult, RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback, RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted, int i, boolean z, int i2, Float f, Float f2, boolean z2, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        int i7 = 2 % 2;
        int i8 = onExtraCallback + 111;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        onExtraCallback(charSequence, quirksExternalSyntheticBackport0, realImageLoaderexecute2job1, onextracallbackwithresult, iAuthTabCallback, onwarmupcompleted, i, z, i2, f, f2, z2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        Unit unit = Unit.INSTANCE;
        int i10 = onWarmupCompleted + 33;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    public static /* synthetic */ TdsTooltipV1View onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsTooltipV1View tdsTooltipV1ViewOnWarmupCompleted = onWarmupCompleted(context);
        int i4 = onWarmupCompleted + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsTooltipV1ViewOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CharSequence charSequence, RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback, RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted, boolean z, int i, int i2, RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult, Float f, Float f2, RealImageLoaderexecute2job1 realImageLoaderexecute2job1, boolean z2, TdsTooltipV1View tdsTooltipV1View) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(charSequence, iAuthTabCallback, onwarmupcompleted, z, i, i2, onextracallbackwithresult, f, f2, realImageLoaderexecute2job1, z2, tdsTooltipV1View);
        }
        onExtraCallbackWithResult(charSequence, iAuthTabCallback, onwarmupcompleted, z, i, i2, onextracallbackwithresult, f, f2, realImageLoaderexecute2job1, z2, tdsTooltipV1View);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(RealImageLoaderexecute2job1 realImageLoaderexecute2job1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(realImageLoaderexecute2job1);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(realImageLoaderexecute2job1);
        int i3 = onExtraCallback + 103;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RealImageLoaderexecute2job1 realImageLoaderexecute2job1 = (RealImageLoaderexecute2job1) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(realImageLoaderexecute2job1);
        }
        IAuthTabCallback(realImageLoaderexecute2job1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i;
        int i10 = i8 | i;
        int i11 = (~((~i) | i4)) | (~i10);
        int i12 = (~(i3 | i7 | i)) | (~(i10 | i4));
        int i13 = i + i4 + i2 + (528639218 * i5) + ((-532493036) * i6);
        int i14 = i13 * i13;
        int i15 = ((i * 873666089) - 1460666368) + (873666089 * i4) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i2) + (1819279360 * i5) + ((-1621098496) * i6) + (586088448 * i14);
        int i16 = (i * (-1573143961)) + 2078511484 + (i4 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i2 * (-1573143025)) + (i5 * 123045422) + (i6 * (-1548035028)) + (i14 * 1845559296);
        return i15 + ((i16 * i16) * 1848705024) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static final Unit onWarmupCompleted(RealImageLoaderexecute2.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    public static final RealImageLoaderexecute2job1 onExtraCallback(@Nullable Function1<? super RealImageLoaderexecute2.onExtraCallback, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallback + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.components.compose.extensions.ToolTipKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 17;
                        onExtraCallback = i7 % 128;
                        RealImageLoaderexecute2.onExtraCallback onextracallback = (RealImageLoaderexecute2.onExtraCallback) obj;
                        if (i7 % 2 == 0) {
                            return RealImageLoaderexecuteresult1.IAuthTabCallback(onextracallback);
                        }
                        RealImageLoaderexecuteresult1.IAuthTabCallback(onextracallback);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function1 = (Function1) objOnMinimized;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1933314178, i, -1, "im.toss.components.compose.extensions.rememberTdsTooltipV1State (ToolTip.kt:40)");
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new RealImageLoaderexecute2job1(function1);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        RealImageLoaderexecute2job1 realImageLoaderexecute2job1 = (RealImageLoaderexecute2job1) objOnMinimized2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 51;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                int i8 = 5 / 0;
            }
        }
        return realImageLoaderexecute2job1;
    }

    private static final TdsTooltipV1View onWarmupCompleted(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TdsTooltipV1View tdsTooltipV1View = new TdsTooltipV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return tdsTooltipV1View;
    }

    private static final Unit onExtraCallback(RealImageLoaderexecute2job1 realImageLoaderexecute2job1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<RealImageLoaderexecute2.onExtraCallback, Unit> function1OnExtraCallbackWithResult = realImageLoaderexecute2job1.onExtraCallbackWithResult();
        if (i3 == 0) {
            function1OnExtraCallbackWithResult.invoke(RealImageLoaderexecute2.onExtraCallback.SHOW);
            unit = Unit.INSTANCE;
            int i4 = 26 / 0;
        } else {
            function1OnExtraCallbackWithResult.invoke(RealImageLoaderexecute2.onExtraCallback.SHOW);
            unit = Unit.INSTANCE;
        }
        int i5 = onWarmupCompleted + 51;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(RealImageLoaderexecute2job1 realImageLoaderexecute2job1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        realImageLoaderexecute2job1.onExtraCallbackWithResult().invoke(RealImageLoaderexecute2.onExtraCallback.HIDE);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(CharSequence charSequence, RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback, RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted, boolean z, int i, int i2, RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult, Float f, Float f2, final RealImageLoaderexecute2job1 realImageLoaderexecute2job1, boolean z2, TdsTooltipV1View tdsTooltipV1View) throws NoWhenBranchMatchedException {
        TdsTooltipV1View.IAuthTabCallback iAuthTabCallback2;
        TdsTooltipV1View.onExtraCallback onextracallback;
        Layout.Alignment alignment;
        TdsTooltipV1View.onNavigationEvent onnavigationevent;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(tdsTooltipV1View, "");
        tdsTooltipV1View.setText(charSequence);
        int i6 = onWarmupCompleted.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i6 == 1) {
            iAuthTabCallback2 = TdsTooltipV1View.IAuthTabCallback.LEFT;
        } else if (i6 != 2) {
            int i7 = onExtraCallback + 109;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0 ? i6 == 3 : i6 == 4) {
                iAuthTabCallback2 = TdsTooltipV1View.IAuthTabCallback.RIGHT;
            } else {
                if (i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                iAuthTabCallback2 = TdsTooltipV1View.IAuthTabCallback.BOTTOM;
            }
        } else {
            iAuthTabCallback2 = TdsTooltipV1View.IAuthTabCallback.TOP;
            int i8 = onExtraCallback + 3;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        tdsTooltipV1View.setTail(iAuthTabCallback2);
        int i10 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
        if (i10 == 1) {
            onextracallback = TdsTooltipV1View.onExtraCallback.NONE;
        } else if (i10 != 2) {
            int i11 = onExtraCallback + 117;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0 ? i10 != 3 : i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            onextracallback = TdsTooltipV1View.onExtraCallback.RIGHT;
        } else {
            onextracallback = TdsTooltipV1View.onExtraCallback.LEFT;
        }
        tdsTooltipV1View.setTailClipToEnd(onextracallback);
        tdsTooltipV1View.setDropShadow(z);
        createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback3 = createCameraCaptureCallback.Companion;
        if (createCameraCaptureCallback.onExtraCallbackWithResult(i, iAuthTabCallback3.onTransact())) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int i12 = onExtraCallback + 109;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            if (!createCameraCaptureCallback.onExtraCallbackWithResult(i, iAuthTabCallback3.onExtraCallbackWithResult())) {
                if (!createCameraCaptureCallback.onExtraCallbackWithResult(i, iAuthTabCallback3.onExtraCallback())) {
                    int i14 = onWarmupCompleted + 93;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    alignment = !createCameraCaptureCallback.onExtraCallbackWithResult(i, iAuthTabCallback3.onNavigationEvent()) ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
        }
        tdsTooltipV1View.setAlignment(alignment);
        tdsTooltipV1View.setMaxWidth(i2);
        int i16 = onWarmupCompleted.onWarmupCompleted[onextracallbackwithresult.ordinal()];
        if (i16 == 1) {
            onnavigationevent = TdsTooltipV1View.onNavigationEvent.SMALL;
        } else if (i16 != 2) {
            int i17 = onExtraCallback + 61;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            if (i16 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onnavigationevent = TdsTooltipV1View.onNavigationEvent.LARGE;
        } else {
            onnavigationevent = TdsTooltipV1View.onNavigationEvent.MEDIUM;
        }
        tdsTooltipV1View.setSize(onnavigationevent);
        if (f != null) {
            tdsTooltipV1View.setOffset(f.floatValue(), z2);
        }
        if (f2 != null) {
            tdsTooltipV1View.setCrossAxisOffset(f2.floatValue());
        }
        int i19 = onWarmupCompleted.onExtraCallback[realImageLoaderexecute2job1.onExtraCallback().ordinal()];
        if (i19 == 1) {
            TdsTooltipV1View.IAuthTabCallback(tdsTooltipV1View, false, new Function0() { // from class: im.toss.components.compose.extensions.ToolTipKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i20 = 2 % 2;
                    int i21 = onExtraCallback + 13;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    RealImageLoaderexecute2job1 realImageLoaderexecute2job12 = realImageLoaderexecute2job1;
                    if (i22 == 0) {
                        return RealImageLoaderexecuteresult1.onNavigationEvent(realImageLoaderexecute2job12);
                    }
                    RealImageLoaderexecuteresult1.onNavigationEvent(realImageLoaderexecute2job12);
                    throw null;
                }
            }, 0, 5, (Object) null);
        } else if (i19 == 2) {
            TdsTooltipV1View.onWarmupCompleted(tdsTooltipV1View, 0, new Function0() { // from class: im.toss.components.compose.extensions.ToolTipKt$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i20 = 2 % 2;
                    int i21 = onExtraCallbackWithResult + 123;
                    onNavigationEvent = i21 % 128;
                    Object obj = null;
                    if (i21 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    Unit unit = (Unit) RealImageLoaderexecuteresult1.onWarmupCompleted(new Object[]{realImageLoaderexecute2job1}, 555881442, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -555881442, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                    int i22 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i22 % 128;
                    if (i22 % 2 == 0) {
                        return unit;
                    }
                    obj.hashCode();
                    throw null;
                }
            }, 1, (Object) null);
        } else if (i19 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final CharSequence charSequence, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable RealImageLoaderexecute2job1 realImageLoaderexecute2job1, @Nullable RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult, @Nullable RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback, @Nullable RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted, int i, boolean z, int i2, @Nullable Float f, @Nullable Float f2, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final RealImageLoaderexecute2job1 realImageLoaderexecute2job12;
        final RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult2;
        final RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback2;
        final RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted2;
        final int i16;
        final boolean z4;
        final int i17;
        final Float f3;
        final Float f4;
        final boolean z5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z6;
        RealImageLoaderexecute2job1 realImageLoaderexecute2job1OnExtraCallback;
        RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult3;
        RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback3;
        RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted3;
        int iIAuthTabCallback;
        boolean z7;
        int i18;
        Float f5;
        boolean z8;
        int i19;
        Float f6;
        RealImageLoaderexecute2job1 realImageLoaderexecute2job13;
        int i20;
        int i21 = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2080403717);
        if ((i3 & 6) == 0) {
            i6 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(charSequence) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i22 = i5 & 2;
        if (i22 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i6 |= ((i5 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(realImageLoaderexecute2job1)) ? 256 : 128;
            }
            i7 = i5 & 8;
            int iOrdinal = -1;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 2048 : 1024;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback == null ? -1 : iAuthTabCallback.ordinal()) ? 16384 : 8192;
            }
            i9 = i5 & 32;
            if (i9 == 0) {
                i6 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (onwarmupcompleted == null) {
                    int i23 = onWarmupCompleted + 75;
                    onExtraCallback = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    iOrdinal = onwarmupcompleted.ordinal();
                }
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 131072 : 65536;
            }
            if ((i3 & 1572864) == 0) {
                if ((i5 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                    int i25 = onExtraCallback + 75;
                    onWarmupCompleted = i25 % 128;
                    int i26 = i25 % 2;
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i6 |= i20;
            }
            i10 = i5 & 128;
            if (i10 != 0) {
                if ((12582912 & i3) == 0) {
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 8388608 : 4194304;
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 67108864 : 33554432;
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    int i27 = i6 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(f) ? 536870912 : 268435456);
                    int i28 = onWarmupCompleted + 91;
                    onExtraCallback = i28 % 128;
                    int i29 = i28 % 2;
                    i6 = i27;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    i14 = i4 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(f2) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 48) == 0) {
                    int i30 = onWarmupCompleted + 55;
                    onExtraCallback = i30 % 128;
                    if (i30 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2);
                        throw null;
                    }
                    i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
                }
                int i31 = i14;
                if ((306783379 & i6) == 306783378 && (i31 & 19) == 18) {
                    int i32 = onExtraCallback + 33;
                    onWarmupCompleted = i32 % 128;
                    int i33 = i32 % 2;
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
                    int i34 = onWarmupCompleted + 75;
                    onExtraCallback = i34 % 128;
                    int i35 = i34 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i3 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        quirksExternalSyntheticBackport03 = i22 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        if ((i5 & 4) != 0) {
                            z6 = false;
                            realImageLoaderexecute2job1OnExtraCallback = onExtraCallback(null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                            i6 &= -897;
                        } else {
                            z6 = false;
                            realImageLoaderexecute2job1OnExtraCallback = realImageLoaderexecute2job1;
                        }
                        if (i7 != 0) {
                            int i36 = onExtraCallback + 65;
                            onWarmupCompleted = i36 % 128;
                            int i37 = i36 % 2;
                            onextracallbackwithresult3 = RealImageLoaderexecute2.onExtraCallbackWithResult.MEDIUM;
                        } else {
                            onextracallbackwithresult3 = onextracallbackwithresult;
                        }
                        if (i8 != 0) {
                            int i38 = onWarmupCompleted + 61;
                            onExtraCallback = i38 % 128;
                            int i39 = i38 % 2;
                            iAuthTabCallback3 = RealImageLoaderexecute2.IAuthTabCallback.BOTTOM;
                        } else {
                            iAuthTabCallback3 = iAuthTabCallback;
                        }
                        onwarmupcompleted3 = i9 != 0 ? RealImageLoaderexecute2.onWarmupCompleted.NONE : onwarmupcompleted;
                        if ((i5 & 64) != 0) {
                            iIAuthTabCallback = createCameraCaptureCallback.Companion.IAuthTabCallback();
                            i6 &= -3670017;
                        } else {
                            iIAuthTabCallback = i;
                        }
                        z7 = i10 != 0 ? true : z;
                        i18 = i11 != 0 ? Integer.MAX_VALUE : i2;
                        Float f7 = i12 != 0 ? null : f;
                        f5 = i13 != 0 ? null : f2;
                        if (i15 != 0) {
                            i19 = i6;
                            z8 = z6;
                        } else {
                            z8 = z2;
                            i19 = i6;
                        }
                        f6 = f7;
                        realImageLoaderexecute2job13 = realImageLoaderexecute2job1OnExtraCallback;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i5 & 4) != 0) {
                            i6 &= -897;
                        }
                        if ((i5 & 64) != 0) {
                            i6 &= -3670017;
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                        realImageLoaderexecute2job13 = realImageLoaderexecute2job1;
                        onextracallbackwithresult3 = onextracallbackwithresult;
                        iAuthTabCallback3 = iAuthTabCallback;
                        onwarmupcompleted3 = onwarmupcompleted;
                        iIAuthTabCallback = i;
                        z7 = z;
                        i18 = i2;
                        f5 = f2;
                        z8 = z2;
                        i19 = i6;
                        f6 = f;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2080403717, i19, i31, "im.toss.components.compose.extensions.TdsTooltipV1 (ToolTip.kt:78)");
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted4 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted4.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.components.compose.extensions.ToolTipKt$$ExternalSyntheticLambda0
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj) {
                                int i40 = 2 % 2;
                                int i41 = onNavigationEvent + 87;
                                onExtraCallback = i41 % 128;
                                int i42 = i41 % 2;
                                TdsTooltipV1View tdsTooltipV1ViewOnNavigationEvent = RealImageLoaderexecuteresult1.onNavigationEvent((Context) obj);
                                int i43 = onExtraCallback + 13;
                                onNavigationEvent = i43 % 128;
                                if (i43 % 2 != 0) {
                                    return tdsTooltipV1ViewOnNavigationEvent;
                                }
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    Function1 function1 = (Function1) objOnMinimized;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(charSequence);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                    boolean z9 = (i19 & 57344) == 16384;
                    boolean z10 = (458752 & i19) == 131072;
                    final boolean z11 = z8;
                    boolean z12 = (29360128 & i19) == 8388608;
                    final Float f8 = f6;
                    boolean z13 = (((3670016 & i19) ^ 1572864) > 1048576 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIAuthTabCallback)) || (i19 & 1572864) == 1048576;
                    onextracallbackwithresult2 = onextracallbackwithresult3;
                    boolean z14 = (234881024 & i19) == 67108864;
                    final int i40 = i18;
                    boolean z15 = (i19 & 7168) == 2048;
                    final int i41 = iIAuthTabCallback;
                    boolean z16 = (1879048192 & i19) == 536870912;
                    final boolean z17 = z7;
                    boolean z18 = (i31 & 112) == 32;
                    boolean z19 = (i31 & 14) == 4;
                    final RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted5 = onwarmupcompleted3;
                    boolean z20 = (((i19 & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(realImageLoaderexecute2job13)) || (i19 & 384) == 256;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback | z9 | z10 | z12 | z13 | z14 | z15 | z16 | z18 | z19 | z20)) {
                        Object obj = objOnMinimized2;
                        if (objOnMinimized2 == onwarmupcompleted4.onExtraCallback()) {
                            final RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback3;
                            final Float f9 = f5;
                            final RealImageLoaderexecute2job1 realImageLoaderexecute2job14 = realImageLoaderexecute2job13;
                            Function1 function12 = new Function1() { // from class: im.toss.components.compose.extensions.ToolTipKt$$ExternalSyntheticLambda1
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj2) throws NoWhenBranchMatchedException {
                                    int i42 = 2 % 2;
                                    int i43 = onExtraCallbackWithResult + 115;
                                    onExtraCallback = i43 % 128;
                                    int i44 = i43 % 2;
                                    Unit unitOnNavigationEvent = RealImageLoaderexecuteresult1.onNavigationEvent(charSequence, iAuthTabCallback4, onwarmupcompleted5, z17, i41, i40, onextracallbackwithresult2, f8, f9, realImageLoaderexecute2job14, z11, (TdsTooltipV1View) obj2);
                                    int i45 = onExtraCallback + 83;
                                    onExtraCallbackWithResult = i45 % 128;
                                    int i46 = i45 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                            obj = function12;
                        }
                        CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function1, quirksExternalSyntheticBackport04, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i19 & 112) | 6, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i42 = onExtraCallback + 123;
                            onWarmupCompleted = i42 % 128;
                            int i43 = i42 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        realImageLoaderexecute2job12 = realImageLoaderexecute2job13;
                        iAuthTabCallback2 = iAuthTabCallback3;
                        onwarmupcompleted2 = onwarmupcompleted5;
                        i16 = i41;
                        i17 = i40;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        f4 = f5;
                        z5 = z11;
                        f3 = f8;
                        z4 = z17;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    realImageLoaderexecute2job12 = realImageLoaderexecute2job1;
                    onextracallbackwithresult2 = onextracallbackwithresult;
                    iAuthTabCallback2 = iAuthTabCallback;
                    onwarmupcompleted2 = onwarmupcompleted;
                    i16 = i;
                    z4 = z;
                    i17 = i2;
                    f3 = f;
                    f4 = f2;
                    z5 = z2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.ToolTipKt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i44 = 2 % 2;
                            int i45 = onExtraCallback + 13;
                            IAuthTabCallback = i45 % 128;
                            int i46 = i45 % 2;
                            CharSequence charSequence2 = charSequence;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                            RealImageLoaderexecute2job1 realImageLoaderexecute2job15 = realImageLoaderexecute2job12;
                            RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult4;
                            RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback5 = iAuthTabCallback2;
                            RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted6 = onwarmupcompleted2;
                            int i47 = i16;
                            boolean z21 = z4;
                            int i48 = i17;
                            Float f10 = f3;
                            Float f11 = f4;
                            boolean z22 = z5;
                            int i49 = i3;
                            int i50 = i4;
                            int i51 = i5;
                            int iIntValue = ((Integer) obj3).intValue();
                            Unit unit = (Unit) RealImageLoaderexecuteresult1.onWarmupCompleted(new Object[]{charSequence2, quirksExternalSyntheticBackport05, realImageLoaderexecute2job15, onextracallbackwithresult5, iAuthTabCallback5, onwarmupcompleted6, Integer.valueOf(i47), Boolean.valueOf(z21), Integer.valueOf(i48), f10, f11, Boolean.valueOf(z22), Integer.valueOf(i49), Integer.valueOf(i50), Integer.valueOf(i51), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)}, 614603544, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -614603543, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                            int i52 = IAuthTabCallback + 73;
                            onExtraCallback = i52 % 128;
                            int i53 = i52 % 2;
                            return unit;
                        }
                    });
                    return;
                }
                return;
            }
            int i44 = onWarmupCompleted + 69;
            onExtraCallback = i44 % 128;
            if (i44 % 2 == 0) {
                throw null;
            }
            i6 |= 12582912;
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            int i312 = i14;
            if ((306783379 & i6) == 306783378) {
                z3 = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i3 & 384) == 0) {
        }
        i7 = i5 & 8;
        int iOrdinal2 = -1;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        int i3122 = i14;
        if ((306783379 & i6) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CharSequence charSequence, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RealImageLoaderexecute2job1 realImageLoaderexecute2job1, RealImageLoaderexecute2.onExtraCallbackWithResult onextracallbackwithresult, RealImageLoaderexecute2.IAuthTabCallback iAuthTabCallback, RealImageLoaderexecute2.onWarmupCompleted onwarmupcompleted, int i, boolean z, int i2, Float f, Float f2, boolean z2, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        return (Unit) onWarmupCompleted(new Object[]{charSequence, quirksExternalSyntheticBackport0, realImageLoaderexecute2job1, onextracallbackwithresult, iAuthTabCallback, onwarmupcompleted, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), f, f2, Boolean.valueOf(z2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i6)}, 614603544, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -614603543, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(RealImageLoaderexecute2job1 realImageLoaderexecute2job1) {
        return (Unit) onWarmupCompleted(new Object[]{realImageLoaderexecute2job1}, 555881442, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -555881442, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }
}
