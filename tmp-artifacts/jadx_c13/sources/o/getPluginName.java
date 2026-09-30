package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import io.fincube.ocrsdk.OcrConfigSDK;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getPluginName {
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static boolean onExtraCallbackWithResult;
    private static int onTransact;
    public static final getPluginName onExtraCallback = new getPluginName();
    private static getRawResponse onNavigationEvent = getRawResponse.Companion.onExtraCallback();
    public static final int onWarmupCompleted = 8;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i6);
        int i12 = (~(i6 | i4)) | (~(i7 | i9)) | i8;
        int i13 = i5 + i4 + i3 + (62936680 * i2) + ((-2032430997) * i);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i5) + 797966336 + (1756943451 * i4) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i3) + ((-264241152) * i2) + ((-222822400) * i) + (2040594432 * i14);
        int i16 = ((i5 * 1175661207) - 43826732) + (i4 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i3 * 1175660433) + (i2 * 1188219112) + (i * (-816965221)) + (i14 * 1798373376);
        int i17 = i15 + (i16 * i16 * 914292736);
        return i17 != 1 ? i17 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private getPluginName() {
    }

    static {
        int i = asInterface + 77;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull Context context, @NotNull getRawResponse getrawresponse) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        boolean z = false;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(getrawresponse, "");
            onNavigationEvent = getrawresponse;
            onExtraCallbackWithResult = IAuthTabCallbackDefault(context);
            int i3 = 34 / 0;
            if (!getrawresponse.IAuthTabCallbackStub()) {
                if (onWarmupCompleted()) {
                    z = true;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(getrawresponse, "");
            onNavigationEvent = getrawresponse;
            onExtraCallbackWithResult = IAuthTabCallbackDefault(context);
            if (!getrawresponse.IAuthTabCallbackStub()) {
            }
        }
        IAuthTabCallback = z;
        if (onExtraCallbackWithResult) {
            int i4 = asBinder + 119;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossDisplayScaler", "enabled", access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("originalDpi", Integer.valueOf(context.getResources().getConfiguration().densityDpi)), getWrite.IAuthTabCallback("scaledDpi", Integer.valueOf(onNavigationEvent(context)))), (String) null, false, (String) null, 56, (Object) null);
        }
        if (IAuthTabCallback) {
            int i6 = asBinder + 91;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossDisplayScaler", "force fontScale", access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("originalFontScale", Float.valueOf(context.getResources().getConfiguration().fontScale)), getWrite.IAuthTabCallback("forcedFontScale", Float.valueOf(getrawresponse.onWarmupCompleted()))), (String) null, false, (String) null, 56, (Object) null);
        }
    }

    public final Context IAuthTabCallback(@NotNull Context context) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        if (onExtraCallbackWithResult) {
            configuration.densityDpi = onNavigationEvent(context);
            z = true;
        } else {
            z = false;
        }
        if (!IAuthTabCallback) {
            if (onNavigationEvent.onExtraCallbackWithResult() > 0.0f && context.getResources().getConfiguration().fontScale < onNavigationEvent.onExtraCallbackWithResult()) {
                int i2 = IAuthTabCallbackDefault + 49;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    configuration.fontScale = onNavigationEvent.onExtraCallbackWithResult();
                } else {
                    configuration.fontScale = onNavigationEvent.onExtraCallbackWithResult();
                }
            } else if (z) {
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            displayMetrics.scaledDensity = onExtraCallback.IAuthTabCallback(displayMetrics.density, AFj1rSDK.onExtraCallback.onNavigationEvent().getResources().getDisplayMetrics().scaledDensity);
            Intrinsics.checkNotNull(context);
            return context;
        }
        configuration.fontScale = onNavigationEvent.onWarmupCompleted();
        int i3 = asBinder + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = IAuthTabCallbackDefault + 11;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            context = context.createConfigurationContext(configuration);
            int i6 = 62 / 0;
        } else {
            context = context.createConfigurationContext(configuration);
        }
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        displayMetrics2.scaledDensity = onExtraCallback.IAuthTabCallback(displayMetrics2.density, AFj1rSDK.onExtraCallback.onNavigationEvent().getResources().getDisplayMetrics().scaledDensity);
        Intrinsics.checkNotNull(context);
        return context;
    }

    private final float IAuthTabCallback(float f, float f2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 41;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f2 > f) {
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            float fMin = Math.min(f2 - f, f) / f;
            return f + (decelerateInterpolator.getInterpolation(fMin) * f * (0.6f - ((1.0f - fMin) * 0.1f)));
        }
        int i4 = i2 + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return f2;
    }

    public final int onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        DisplayMetrics displayMetricsOnWarmupCompleted = onWarmupCompleted(context);
        Object[] objArr = {this, Integer.valueOf(displayMetricsOnWarmupCompleted.widthPixels), Integer.valueOf(displayMetricsOnWarmupCompleted.heightPixels), Float.valueOf(displayMetricsOnWarmupCompleted.xdpi), Float.valueOf(displayMetricsOnWarmupCompleted.ydpi)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        BigDecimal bigDecimalMultiply = ((BigDecimal) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1916836353, 1916836354, objArr, iOnWarmupCompleted)).multiply(IAuthTabCallback());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(bigDecimalMultiply);
        int i4 = asBinder + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r5
      0x002d: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v11 java.lang.Object) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DisplayMetrics onWarmupCompleted(@NotNull Context context) {
        Object systemService;
        WindowManager windowManager;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            systemService = context.getSystemService("window");
            int i3 = 39 / 0;
            if (systemService instanceof WindowManager) {
                int i4 = IAuthTabCallbackDefault + 69;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                windowManager = (WindowManager) systemService;
            } else {
                windowManager = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            systemService = context.getSystemService("window");
            if (systemService instanceof WindowManager) {
            }
        }
        if (windowManager == null) {
            throw new IllegalStateException("error");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i6 = asBinder + 73;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return displayMetrics;
    }

    public final int onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            return onWarmupCompleted(context).densityDpi;
        }
        Intrinsics.checkNotNullParameter(context, "");
        int i3 = onWarmupCompleted(context).densityDpi;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = DisplayMetrics.DENSITY_DEVICE_STABLE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = DisplayMetrics.DENSITY_DEVICE_STABLE;
        int i5 = asBinder + 31;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private final boolean IAuthTabCallbackDefault(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent.onNavigationEvent();
            throw null;
        }
        if (!onNavigationEvent.onNavigationEvent()) {
            int i3 = IAuthTabCallbackDefault + 33;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (onNavigationEvent.IAuthTabCallback()) {
            int i5 = IAuthTabCallbackDefault + 17;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!onExtraCallback(420, 450, 480)) {
            int i7 = IAuthTabCallbackDefault + 107;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        if (!((Boolean) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 1144171686, -1144171686, new Object[]{this, context}, iOnWarmupCompleted)).booleanValue()) {
            int i9 = asBinder + 103;
            IAuthTabCallbackDefault = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!asBinder(context)) {
            int i10 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = IAuthTabCallbackDefault + 59;
        asBinder = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 13 / 0;
        }
        return true;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getRawResponse getrawresponse = onNavigationEvent;
        if (i3 != 0) {
            return Boolean.valueOf(getrawresponse.IAuthTabCallbackStub());
        }
        getrawresponse.IAuthTabCallbackStub();
        throw null;
    }

    public final boolean onWarmupCompleted() {
        List listEmptyList;
        int i = 2 % 2;
        int i2 = Calendar.getInstance().get(7);
        try {
            listEmptyList = StringsKt__StringsKt.split$default((CharSequence) onNavigationEvent.onExtraCallback(), new String[]{","}, false, 0, 6, (Object) null);
        } catch (Throwable unused) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (onNavigationEvent.onWarmupCompleted() <= 0.0f || !listEmptyList.contains(String.valueOf(i2))) {
            return false;
        }
        int i3 = asBinder + 45;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 43;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private final boolean onExtraCallback(int... iArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = ArraysKt___ArraysKt.contains(iArr, DisplayMetrics.DENSITY_DEVICE_STABLE);
        int i4 = asBinder + 29;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return zContains;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getPluginName getpluginname = (getPluginName) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (getpluginname.onNavigationEvent() == getpluginname.onExtraCallbackWithResult(context)) {
            return true;
        }
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final boolean asBinder(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (onNavigationEvent(context) >= onExtraCallbackWithResult(context)) {
            return false;
        }
        int i4 = asBinder + 75;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getPluginName getpluginname = (getPluginName) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        float fFloatValue2 = ((Number) objArr[4]).floatValue();
        int i = 2 % 2;
        MathContext mathContext = new MathContext(50);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(fFloatValue));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(fFloatValue2));
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iIntValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(iIntValue2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "");
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimal, mathContext);
        BigDecimal bigDecimalDivide2 = bigDecimalValueOf2.divide(bigDecimal2, mathContext);
        BigDecimal bigDecimalPow = bigDecimalDivide.pow(2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "");
        BigDecimal bigDecimalPow2 = bigDecimalDivide2.pow(2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow2, "");
        BigDecimal bigDecimalAdd = bigDecimalPow.add(bigDecimalPow2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
        BigDecimal bigDecimalOnNavigationEvent = onNavigationEvent(getpluginname, bigDecimalAdd, 0, 1, null);
        BigDecimal bigDecimalPow3 = bigDecimalValueOf.pow(2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow3, "");
        BigDecimal bigDecimalPow4 = bigDecimalValueOf2.pow(2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow4, "");
        BigDecimal bigDecimalAdd2 = bigDecimalPow3.add(bigDecimalPow4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "");
        BigDecimal bigDecimalDivide3 = onNavigationEvent(getpluginname, bigDecimalAdd2, 0, 1, null).divide(bigDecimalOnNavigationEvent, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide3, "");
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return bigDecimalDivide3;
        }
        throw null;
    }

    static /* synthetic */ BigDecimal onNavigationEvent(getPluginName getpluginname, BigDecimal bigDecimal, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 43;
        asBinder = i4 % 128;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            i = 50;
        }
        BigDecimal bigDecimalOnWarmupCompleted = getpluginname.onWarmupCompleted(bigDecimal, i);
        int i5 = asBinder + 47;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return bigDecimalOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final BigDecimal onWarmupCompleted(BigDecimal bigDecimal, int i) {
        int i2 = 2 % 2;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(Math.sqrt(bigDecimal.doubleValue())));
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(2L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "");
        int i3 = IAuthTabCallbackDefault + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        while (!Intrinsics.areEqual(bigDecimalValueOf, bigDecimal2)) {
            int i5 = IAuthTabCallbackDefault + 5;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, i, roundingMode);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
            BigDecimal bigDecimalAdd = bigDecimalDivide.add(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
            BigDecimal bigDecimalDivide2 = bigDecimalAdd.divide(bigDecimalValueOf2, i, roundingMode);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "");
            BigDecimal bigDecimal3 = bigDecimal2;
            bigDecimal2 = bigDecimalDivide2;
            bigDecimalValueOf = bigDecimal3;
        }
        return bigDecimal2;
    }

    private final int onExtraCallbackWithResult(BigDecimal bigDecimal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = bigDecimal.setScale(0, RoundingMode.HALF_UP).intValue();
        int i4 = IAuthTabCallbackDefault + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    private final BigDecimal onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, Integer.valueOf(OcrConfigSDK.DEFAULT_PREVIEW_HEIGHT), 2340, Float.valueOf(428.625f), Float.valueOf(424.542f)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        BigDecimal bigDecimal = (BigDecimal) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1916836353, 1916836354, objArr, iOnWarmupCompleted);
        int i4 = IAuthTabCallbackDefault + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return bigDecimal;
    }

    private final BigDecimal IAuthTabCallback() {
        int i = 2 % 2;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(450L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(onExtraCallbackWithResult(), new MathContext(50));
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
        int i2 = IAuthTabCallbackDefault + 61;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
        return bigDecimalDivide;
    }

    private final BigDecimal IAuthTabCallback(int i, int i2, float f, float f2) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return (BigDecimal) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1916836353, 1916836354, objArr, iOnWarmupCompleted);
    }

    private final boolean onExtraCallback(Context context) {
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 1144171686, -1144171686, new Object[]{this, context}, iOnWarmupCompleted)).booleanValue();
    }

    public final boolean onExtraCallback() {
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 1528479821, -1528479819, new Object[]{this}, iOnWarmupCompleted)).booleanValue();
    }
}
