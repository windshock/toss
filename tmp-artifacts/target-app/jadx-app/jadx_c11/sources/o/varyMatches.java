package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class varyMatches {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i6)) | i2;
        int i9 = (~(i7 | (~i6))) | (~((~i2) | i7)) | (~(i2 | i | i6));
        int i10 = ~(i6 | i2);
        int i11 = i2 + i + i3 + ((-813770285) * i5) + (135932771 * i4);
        int i12 = i11 * i11;
        int i13 = (526900465 * i2) + 74317824 + ((-1745228167) * i) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i3) + (1331953664 * i5) + ((-366739456) * i4) + ((-1308753920) * i12);
        int i14 = (i2 * 1149714451) + 247108311 + (i * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i3 * 1149713731) + (i5 * 1918847289) + (i4 * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static final int onNavigationEvent(@NotNull Number number, @NotNull DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(displayMetrics, "");
        int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(onWarmupCompleted(number, displayMetrics));
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return iOnExtraCallback;
    }

    public static final float onWarmupCompleted(@NotNull Number number, @NotNull DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(displayMetrics, "");
        float fFloatValue = number.floatValue();
        if (fFloatValue == 0.0f) {
            return 0.0f;
        }
        float fCoerceAtLeast = RangesKt.coerceAtLeast(TypedValue.applyDimension(1, Math.abs(fFloatValue), displayMetrics), 1.0f) * Math.signum(fFloatValue);
        int i4 = IAuthTabCallback + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return fCoerceAtLeast;
        }
        throw null;
    }

    public static final int IAuthTabCallback(@NotNull Number number, @NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return onNavigationEvent(number, displayMetrics);
        }
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(context, "");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent = onNavigationEvent(number, displayMetrics2);
        int i3 = 53 / 0;
        return iOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iOnNavigationEvent;
        Context context = (Context) objArr[0];
        Number number = (Number) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(number, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            iOnNavigationEvent = onNavigationEvent(number, displayMetrics);
            int i3 = 60 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(number, "");
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            iOnNavigationEvent = onNavigationEvent(number, displayMetrics2);
        }
        return Integer.valueOf(iOnNavigationEvent);
    }

    public static final int IAuthTabCallback(@NotNull View view, @NotNull Number number) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(number, "");
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return onNavigationEvent(number, displayMetrics);
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        onNavigationEvent(number, displayMetrics2);
        throw null;
    }

    public static final float onNavigationEvent(@NotNull Number number, @NotNull Context context) {
        float fOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            fOnWarmupCompleted = onWarmupCompleted(number, displayMetrics);
            int i3 = 13 / 0;
        } else {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            fOnWarmupCompleted = onWarmupCompleted(number, displayMetrics2);
        }
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnWarmupCompleted;
    }

    public static final float IAuthTabCallback(@NotNull Context context, @NotNull Number number) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(number, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return onWarmupCompleted(number, displayMetrics);
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        float fOnWarmupCompleted = onWarmupCompleted(number, displayMetrics2);
        int i3 = 38 / 0;
        return fOnWarmupCompleted;
    }

    public static final float onNavigationEvent(@NotNull View view, @NotNull Number number) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(number, "");
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return onWarmupCompleted(number, displayMetrics);
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        onWarmupCompleted(number, displayMetrics2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int onExtraCallbackWithResult(@NotNull Number number, @NotNull DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(displayMetrics, "");
        int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(asBinder(number, displayMetrics));
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return iOnExtraCallback;
    }

    public static final float asBinder(@NotNull Number number, @NotNull DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(displayMetrics, "");
        float fOnWarmupCompleted = onWarmupCompleted(Float.valueOf(getTcfVendorConsentStatus.Companion.asBinder().onNavigationEvent(displayMetrics.scaledDensity / displayMetrics.density).onNavigationEvent(number.floatValue())), displayMetrics);
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int onExtraCallbackWithResult(@NotNull Number number, @NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(context, "");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(number, displayMetrics);
        int i4 = IAuthTabCallback + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return iOnExtraCallbackWithResult;
    }

    public static final int onExtraCallback(@NotNull Context context, @NotNull Number number) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(number, displayMetrics);
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return iOnExtraCallbackWithResult;
    }

    public static final int onTransact(@NotNull View view, @NotNull Number number) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(number, "");
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            onExtraCallbackWithResult(number, displayMetrics);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(number, displayMetrics2);
        int i3 = IAuthTabCallback + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallbackWithResult;
    }

    public static final int onExtraCallback(@NotNull View view, @NotNull Number number) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(number, displayMetrics);
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Context context = (Context) objArr[0];
        Number number = (Number) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(number, displayMetrics);
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iOnExtraCallbackWithResult);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Number number = (Number) objArr[0];
        DisplayMetrics displayMetrics = (DisplayMetrics) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(displayMetrics, "");
        } else {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(displayMetrics, "");
        }
        float fFloatValue = number.floatValue() / displayMetrics.density;
        int i3 = IAuthTabCallback + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return Float.valueOf(fFloatValue);
    }

    public static final float onExtraCallback(@NotNull Number number, @NotNull Context context) {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            fFloatValue = ((Float) onNavigationEvent(1845166571, -1845166568, new Object[]{number, displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
            int i3 = 61 / 0;
        } else {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            fFloatValue = ((Float) onNavigationEvent(1845166571, -1845166568, new Object[]{number, displayMetrics2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2)).floatValue();
        }
        int i4 = IAuthTabCallback + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public static final float onExtraCallbackWithResult(@NotNull Context context, @NotNull Number number) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(number, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            return ((Float) onNavigationEvent(1845166571, -1845166568, new Object[]{number, displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        ((Float) onNavigationEvent(1845166571, -1845166568, new Object[]{number, displayMetrics2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2)).floatValue();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View view = (View) objArr[0];
        Number number = (Number) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        float fFloatValue = ((Float) onNavigationEvent(1845166571, -1845166568, new Object[]{number, displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fFloatValue);
    }

    public static final float onExtraCallback(@NotNull Number number, @NotNull DisplayMetrics displayMetrics) {
        getORDER_BY_NAMEokhttp getorder_by_nameokhttpOnNavigationEvent;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            getorder_by_nameokhttpOnNavigationEvent = getTcfVendorConsentStatus.Companion.asBinder().onNavigationEvent(displayMetrics.scaledDensity % displayMetrics.density);
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            objOnNavigationEvent = onNavigationEvent(1845166571, -1845166568, new Object[]{number, displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback);
        } else {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            getorder_by_nameokhttpOnNavigationEvent = getTcfVendorConsentStatus.Companion.asBinder().onNavigationEvent(displayMetrics.scaledDensity / displayMetrics.density);
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            objOnNavigationEvent = onNavigationEvent(1845166571, -1845166568, new Object[]{number, displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2);
        }
        float fOnExtraCallback = getorder_by_nameokhttpOnNavigationEvent.onExtraCallback(((Float) objOnNavigationEvent).floatValue());
        int i3 = onExtraCallback + 19;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return fOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final float onWarmupCompleted(@NotNull View view, @NotNull Number number) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(number, "");
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return onExtraCallback(number, displayMetrics);
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(number, "");
        DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        float fOnExtraCallback = onExtraCallback(number, displayMetrics2);
        int i3 = 93 / 0;
        return fOnExtraCallback;
    }

    public static final int onWarmupCompleted(@NotNull Context context, @NotNull Number number) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Integer) onNavigationEvent(486882314, -486882312, new Object[]{context, number}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).intValue();
    }

    public static final int onNavigationEvent(@NotNull Context context, @NotNull Number number) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Integer) onNavigationEvent(1244314108, -1244314107, new Object[]{context, number}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).intValue();
    }

    public static final float onExtraCallbackWithResult(@NotNull View view, @NotNull Number number) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Float) onNavigationEvent(-1183862482, 1183862482, new Object[]{view, number}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
    }

    public static final float IAuthTabCallback(@NotNull Number number, @NotNull DisplayMetrics displayMetrics) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Float) onNavigationEvent(1845166571, -1845166568, new Object[]{number, displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
    }
}
