package im.toss.tds.foundation.anim.rally;

import android.view.View;
import android.view.animation.Interpolator;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AppLovinSdkConfiguration;
import o.AppLovinSdkConfigurationConsentFlowUserGeography;
import o.AppLovinSdkSettings;
import o.AppLovinWebViewActivity;
import o.AppLovinWebViewActivityEventListener;
import o.AppLovinWebViewActivityaExternalSyntheticLambda0;
import o.deprecated_dns;
import o.getAvailableMediatedNetworks;
import o.getCmpService;
import o.getExtraParameters;
import o.getUserIdentifier;
import o.isCreativeDebuggerEnabled;
import o.isFireOS;
import o.pxToDp;
import o.runOnUiThread;
import o.runOnUiThreadDelayed;
import o.setCreativeDebuggerEnabled;
import o.setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallysKt {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        isCreativeDebuggerEnabled iscreativedebuggerenabled = (isCreativeDebuggerEnabled) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        isCreativeDebuggerEnabled iscreativedebuggerenabled = (isCreativeDebuggerEnabled) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Float f = (Float) onWarmupCompleted(new Object[]{iscreativedebuggerenabled}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1036295122, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1036295122);
        int i3 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return f;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = ~i4;
        int i11 = ~(i8 | i10 | i3);
        int i12 = (~(i4 | i7)) | i8 | (~(i10 | i3));
        int i13 = i3 + i6 + i5 + (325770565 * i) + ((-1284996642) * i2);
        int i14 = i13 * i13;
        int i15 = (i3 * (-1991011123)) + 595473426 + (i6 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + ((-1991010217) * i5) + ((-1223611789) * i) + ((-291900814) * i2) + (i14 * (-1931083776));
        int i16 = ((789042555 * i3) - 1205338112) + ((-1364710777) * i6) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i5) + ((-667418624) * i) + ((-145752064) * i2) + (1116340224 * i14) + (i15 * i15 * (-1558839296));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i16 != 4) {
            return onExtraCallback(objArr);
        }
        shouldFailAdDisplayIfDontKeepActivitiesIsEnabled shouldfailaddisplayifdontkeepactivitiesisenabled = (shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) objArr[0];
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        getExtraParameters getextraparameters = (getExtraParameters) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        Interpolator interpolator = (Interpolator) objArr[5];
        Integer num = (Integer) objArr[6];
        Boolean bool = (Boolean) objArr[7];
        int iIntValue3 = ((Number) objArr[8]).intValue();
        long jLongValue = ((Number) objArr[9]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[10]).booleanValue();
        int i17 = 2 % 2;
        int i18 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(shouldfailaddisplayifdontkeepactivitiesisenabled, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Rally rallyIAuthTabCallback = IAuthTabCallback(shouldfailaddisplayifdontkeepactivitiesisenabled, onNavigationEvent(appLovinSdkSettings), iIntValue, getextraparameters, iIntValue2, interpolator, num, bool, iIntValue3, jLongValue, zBooleanValue);
        int i20 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i20 % 128;
        int i21 = i20 % 2;
        return rallyIAuthTabCallback;
    }

    public static /* synthetic */ runOnUiThreadDelayed onWarmupCompleted(View view, pxToDp pxtodp, List list, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        View view2;
        int i5;
        getExtraParameters getextraparameters2;
        Integer num2;
        int i6;
        long j2;
        int i7 = 2 % 2;
        Object obj2 = null;
        if ((i4 & 1) != 0) {
            int i8 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            view2 = null;
        } else {
            view2 = view;
        }
        if ((i4 & 8) != 0) {
            int i9 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i5 = 1;
        } else {
            i5 = i;
        }
        if ((i4 & 16) != 0) {
            int i11 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 == 0) {
                getExtraParameters getextraparameters3 = getExtraParameters.Alternate;
                obj2.hashCode();
                throw null;
            }
            getextraparameters2 = getExtraParameters.Alternate;
        } else {
            getextraparameters2 = getextraparameters;
        }
        int i12 = (i4 & 32) != 0 ? 0 : i2;
        Interpolator interpolator2 = (i4 & 64) != 0 ? null : interpolator;
        if ((i4 & 128) != 0) {
            int i13 = onExtraCallbackWithResult + 21;
            int i14 = i13 % 128;
            IAuthTabCallback = i14;
            int i15 = i13 % 2;
            int i16 = i14 + 121;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        Boolean bool2 = (i4 & 256) != 0 ? null : bool;
        if ((i4 & 512) != 0) {
            int i18 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            i6 = 0;
        } else {
            i6 = i3;
        }
        if ((i4 & 1024) != 0) {
            int i20 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i20 % 128;
            int i21 = i20 % 2;
            j2 = -1;
        } else {
            j2 = j;
        }
        return IAuthTabCallback(view2, pxtodp, list, i5, getextraparameters2, i12, interpolator2, num2, bool2, i6, j2, (i4 & 2048) != 0 ? false : z);
    }

    public static final runOnUiThreadDelayed IAuthTabCallback(@Nullable View view, @NotNull pxToDp pxtodp, @NotNull List<? extends isFireOS<?>> list, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(pxtodp, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        runOnUiThreadDelayed runonuithreaddelayed = new runOnUiThreadDelayed(pxtodp);
        runonuithreaddelayed.onNavigationEvent(getextraparameters);
        runonuithreaddelayed.onExtraCallbackWithResult(i);
        runonuithreaddelayed.onWarmupCompleted(i2);
        runonuithreaddelayed.onExtraCallbackWithResult(interpolator);
        runonuithreaddelayed.IAuthTabCallback(num);
        runonuithreaddelayed.onExtraCallback(bool);
        Object[] objArr = {runonuithreaddelayed, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        isFireOS.onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -368425803, iOnExtraCallbackWithResult, 368425806);
        runonuithreaddelayed.IAuthTabCallback(CollectionsKt.toList(list));
        if (view == null) {
            int i5 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return runonuithreaddelayed;
        }
        onExtraCallback(runonuithreaddelayed, new AppLovinWebViewActivity(view), j, z);
        int i7 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return runonuithreaddelayed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Rally onExtraCallbackWithResult(setCreativeDebuggerEnabled setcreativedebuggerenabled, List list, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        int i5;
        getExtraParameters getextraparameters2;
        int i6;
        long j2;
        int i7 = 2 % 2;
        if ((i4 & 4) != 0) {
            int i8 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i5 = 1;
        } else {
            i5 = i;
        }
        if ((i4 & 8) != 0) {
            int i10 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            getextraparameters2 = getExtraParameters.Alternate;
        } else {
            getextraparameters2 = getextraparameters;
        }
        boolean z2 = false;
        if ((i4 & 16) != 0) {
            int i12 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            i6 = 0;
        } else {
            i6 = i2;
        }
        Interpolator interpolator2 = (i4 & 32) != 0 ? null : interpolator;
        Integer num2 = (i4 & 64) != 0 ? null : num;
        Boolean bool2 = (i4 & 128) != 0 ? null : bool;
        int i14 = (i4 & 256) != 0 ? 0 : i3;
        if ((i4 & 512) != 0) {
            int i15 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            j2 = -1;
        } else {
            j2 = j;
        }
        if ((i4 & 1024) != 0) {
            int i16 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
        } else {
            z2 = z;
        }
        return IAuthTabCallback((setCreativeDebuggerEnabled<?>) setcreativedebuggerenabled, (List<AppLovinSdkSettings>) list, i5, getextraparameters2, i6, interpolator2, num2, bool2, i14, j2, z2);
    }

    public static final Rally IAuthTabCallback(@NotNull setCreativeDebuggerEnabled<?> setcreativedebuggerenabled, @NotNull List<AppLovinSdkSettings> list, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(setcreativedebuggerenabled, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Rally rallyOnExtraCallback = Rally.Companion.onExtraCallback(setcreativedebuggerenabled);
        rallyOnExtraCallback.onNavigationEvent(getextraparameters);
        rallyOnExtraCallback.onExtraCallbackWithResult(i);
        rallyOnExtraCallback.onWarmupCompleted(i2);
        rallyOnExtraCallback.onExtraCallbackWithResult(interpolator);
        rallyOnExtraCallback.IAuthTabCallback(num);
        rallyOnExtraCallback.onExtraCallback(bool);
        Object[] objArr = {rallyOnExtraCallback, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        isFireOS.onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -368425803, iOnExtraCallbackWithResult, 368425806);
        rallyOnExtraCallback.onNavigationEvent(list);
        onExtraCallback(rallyOnExtraCallback, setcreativedebuggerenabled, j, z);
        int i7 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return rallyOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Rally onExtraCallback(setCreativeDebuggerEnabled setcreativedebuggerenabled, AppLovinSdkSettings appLovinSdkSettings, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        getExtraParameters getextraparameters2;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult;
        int i7 = i6 + 35;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 1;
        int i10 = (i4 & 4) != 0 ? 1 : i;
        Boolean bool2 = null;
        if ((i4 & 8) != 0) {
            int i11 = i6 + 49;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                getExtraParameters getextraparameters3 = getExtraParameters.Alternate;
                bool2.hashCode();
                throw null;
            }
            getextraparameters2 = getExtraParameters.Alternate;
        } else {
            getextraparameters2 = getextraparameters;
        }
        if ((i4 & 16) != 0) {
            int i12 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                i9 = 0;
            }
        } else {
            i9 = i2;
        }
        Interpolator interpolator2 = (i4 & 32) != 0 ? null : interpolator;
        Integer num2 = (i4 & 64) != 0 ? null : num;
        if ((i4 & 128) != 0) {
            int i13 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 65 / 0;
            }
        } else {
            bool2 = bool;
        }
        return onWarmupCompleted((setCreativeDebuggerEnabled<?>) setcreativedebuggerenabled, appLovinSdkSettings, i10, getextraparameters2, i9, interpolator2, num2, bool2, (i4 & 256) != 0 ? 0 : i3, (i4 & 512) != 0 ? -1L : j, (i4 & 1024) == 0 ? z : false);
    }

    public static final Rally onWarmupCompleted(@NotNull setCreativeDebuggerEnabled<?> setcreativedebuggerenabled, @NotNull AppLovinSdkSettings appLovinSdkSettings, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(setcreativedebuggerenabled, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Rally rallyOnExtraCallback = Rally.Companion.onExtraCallback(setcreativedebuggerenabled);
        rallyOnExtraCallback.onNavigationEvent(getextraparameters);
        rallyOnExtraCallback.onExtraCallbackWithResult(i);
        rallyOnExtraCallback.onWarmupCompleted(i2);
        rallyOnExtraCallback.onExtraCallbackWithResult(interpolator);
        rallyOnExtraCallback.IAuthTabCallback(num);
        rallyOnExtraCallback.onExtraCallback(bool);
        Object[] objArr = {rallyOnExtraCallback, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        isFireOS.onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -368425803, iOnExtraCallbackWithResult, 368425806);
        rallyOnExtraCallback.onWarmupCompleted(appLovinSdkSettings);
        onExtraCallback(rallyOnExtraCallback, setcreativedebuggerenabled, j, z);
        int i7 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return rallyOnExtraCallback;
    }

    public static /* synthetic */ Rally onWarmupCompleted(RallyCanvas rallyCanvas, List list, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        Interpolator interpolator2;
        int i5;
        long j2;
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i7 % 128;
        int i8 = (i7 % 2 == 0 ? (i4 & 4) == 0 : (i4 & 2) == 0) ? i : 1;
        getExtraParameters getextraparameters2 = (i4 & 8) != 0 ? getExtraParameters.Alternate : getextraparameters;
        int i9 = (i4 & 16) != 0 ? 0 : i2;
        if ((i4 & 32) != 0) {
            int i10 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            interpolator2 = null;
        } else {
            interpolator2 = interpolator;
        }
        Integer num2 = (i4 & 64) != 0 ? null : num;
        Boolean bool2 = (i4 & 128) == 0 ? bool : null;
        if ((i4 & 256) != 0) {
            int i12 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            i5 = 0;
        } else {
            i5 = i3;
        }
        if ((i4 & 512) != 0) {
            int i14 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            j2 = -1;
        } else {
            j2 = j;
        }
        return IAuthTabCallback(rallyCanvas, (List<AppLovinSdkSettings>) list, i8, getextraparameters2, i9, interpolator2, num2, bool2, i5, j2, (i4 & 1024) == 0 ? z : false);
    }

    public static final Rally IAuthTabCallback(@NotNull RallyCanvas rallyCanvas, @NotNull List<AppLovinSdkSettings> list, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rallyCanvas, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Rally rallyIAuthTabCallback = IAuthTabCallback(new AppLovinSdkConfigurationConsentFlowUserGeography(rallyCanvas), list, i, getextraparameters, i2, interpolator, num, bool, i3, j, z);
        int i5 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rallyIAuthTabCallback;
    }

    public static /* synthetic */ Rally onWarmupCompleted(View view, List list, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        Interpolator interpolator2;
        long j2;
        int i5 = 2 % 2;
        int i6 = (i4 & 4) != 0 ? 1 : i;
        getExtraParameters getextraparameters2 = (i4 & 8) != 0 ? getExtraParameters.Alternate : getextraparameters;
        int i7 = (i4 & 16) != 0 ? 0 : i2;
        if ((i4 & 32) != 0) {
            int i8 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            interpolator2 = null;
        } else {
            interpolator2 = interpolator;
        }
        Integer num2 = (i4 & 64) != 0 ? null : num;
        Boolean bool2 = (i4 & 128) == 0 ? bool : null;
        int i10 = (i4 & 256) != 0 ? 0 : i3;
        if ((i4 & 512) != 0) {
            int i11 = onExtraCallbackWithResult + 19;
            int i12 = i11 % 128;
            IAuthTabCallback = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 75;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            j2 = -1;
        } else {
            j2 = j;
        }
        return onExtraCallbackWithResult(view, (List<AppLovinSdkSettings>) list, i6, getextraparameters2, i7, interpolator2, num2, bool2, i10, j2, (i4 & 1024) == 0 ? z : false);
    }

    public static final Rally onExtraCallbackWithResult(@NotNull View view, @NotNull List<AppLovinSdkSettings> list, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Rally rallyIAuthTabCallback = IAuthTabCallback(new AppLovinWebViewActivity(view), list, i, getextraparameters, i2, interpolator, num, bool, i3, j, z);
        int i5 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rallyIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        View view = (View) objArr[0];
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        getExtraParameters getextraparameters = (getExtraParameters) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        Interpolator interpolator = (Interpolator) objArr[5];
        Integer num = (Integer) objArr[6];
        Boolean bool = (Boolean) objArr[7];
        int iIntValue3 = ((Number) objArr[8]).intValue();
        long jLongValue = ((Number) objArr[9]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[10]).booleanValue();
        int iIntValue4 = ((Number) objArr[11]).intValue();
        Object obj = objArr[12];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = (i3 % 2 != 0 ? (iIntValue4 & 4) == 0 : (iIntValue4 & 3) == 0) ? iIntValue : 1;
        getExtraParameters getextraparameters2 = (iIntValue4 & 8) != 0 ? getExtraParameters.Alternate : getextraparameters;
        int i5 = (iIntValue4 & 16) != 0 ? 0 : iIntValue2;
        if ((iIntValue4 & 32) != 0) {
            int i6 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                i = 0;
                int i7 = 44 / 0;
            } else {
                i = 0;
            }
            interpolator = null;
        } else {
            i = 0;
        }
        if ((iIntValue4 & 64) != 0) {
            num = null;
        }
        if ((iIntValue4 & 128) != 0) {
            bool = null;
        }
        if ((iIntValue4 & 256) != 0) {
            iIntValue3 = i;
        }
        if ((iIntValue4 & 512) != 0) {
            int i8 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            jLongValue = -1;
        }
        int i10 = zBooleanValue;
        if ((iIntValue4 & 1024) != 0) {
            i10 = i;
        }
        return onWarmupCompleted(view, appLovinSdkSettings, i4, getextraparameters2, i5, interpolator, num, bool, iIntValue3, jLongValue, (boolean) i10);
    }

    public static final Rally onWarmupCompleted(@NotNull View view, @NotNull AppLovinSdkSettings appLovinSdkSettings, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Rally rallyOnExtraCallbackWithResult = onExtraCallbackWithResult(view, onNavigationEvent(appLovinSdkSettings), i, getextraparameters, i2, interpolator, num, bool, i3, j, z);
        int i7 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 24 / 0;
        }
        return rallyOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Rally IAuthTabCallback(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled shouldfailaddisplayifdontkeepactivitiesisenabled, AppLovinSdkSettings appLovinSdkSettings, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        Interpolator interpolator2;
        Boolean bool2;
        long j2;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i6 % 128;
        int i7 = (i6 % 2 == 0 ? (i4 & 4) == 0 : (i4 & 5) == 0) ? i : 1;
        getExtraParameters getextraparameters2 = (i4 & 8) != 0 ? getExtraParameters.Alternate : getextraparameters;
        int i8 = (i4 & 16) != 0 ? 0 : i2;
        Object obj2 = null;
        if ((i4 & 32) != 0) {
            int i9 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 83 / 0;
            }
            interpolator2 = null;
        } else {
            interpolator2 = interpolator;
        }
        Integer num2 = (i4 & 64) != 0 ? null : num;
        if ((i4 & 128) != 0) {
            int i11 = onExtraCallbackWithResult + 63;
            int i12 = i11 % 128;
            IAuthTabCallback = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 103;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            bool2 = null;
        } else {
            bool2 = bool;
        }
        int i16 = (i4 & 256) != 0 ? 0 : i3;
        if ((i4 & 512) != 0) {
            int i17 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i17 % 128;
            if (i17 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            j2 = -1;
        } else {
            j2 = j;
        }
        return (Rally) onWarmupCompleted(new Object[]{shouldfailaddisplayifdontkeepactivitiesisenabled, appLovinSdkSettings, Integer.valueOf(i7), getextraparameters2, Integer.valueOf(i8), interpolator2, num2, bool2, Integer.valueOf(i16), Long.valueOf(j2), Boolean.valueOf((i4 & 1024) == 0 ? z : false)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1809886061, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1809886065);
    }

    public static final Rally IAuthTabCallback(@NotNull shouldFailAdDisplayIfDontKeepActivitiesIsEnabled shouldfailaddisplayifdontkeepactivitiesisenabled, @NotNull List<AppLovinSdkSettings> list, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(shouldfailaddisplayifdontkeepactivitiesisenabled, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Rally rallyIAuthTabCallback = IAuthTabCallback(new AppLovinWebViewActivityEventListener(shouldfailaddisplayifdontkeepactivitiesisenabled), list, i, getextraparameters, i2, interpolator, num, bool, i3, j, z);
        int i5 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return rallyIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if ((r11 instanceof o.getAvailableMediatedNetworks) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if ((!(r11 instanceof o.getAvailableMediatedNetworks)) != true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r3 = r3 + 27;
        im.toss.tds.foundation.anim.rally.RallysKt.IAuthTabCallback = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if ((r3 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        ((o.getAvailableMediatedNetworks) r11).getAnimationStore().onExtraCallbackWithResult(r4, r10, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        ((o.getAvailableMediatedNetworks) r11).getAnimationStore().onExtraCallbackWithResult(r4, r10, r12, r14);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r11 = o.PaddingKtExternalSyntheticLambda0.onExtraCallbackWithResult(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if ((r11 instanceof o.getAvailableMediatedNetworks) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        r1 = im.toss.tds.foundation.anim.rally.RallysKt.IAuthTabCallback + 105;
        im.toss.tds.foundation.anim.rally.RallysKt.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        r2 = (o.getAvailableMediatedNetworks) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r11 = im.toss.tds.foundation.anim.rally.RallysKt.onExtraCallbackWithResult + 47;
        im.toss.tds.foundation.anim.rally.RallysKt.IAuthTabCallback = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if ((r11 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r2.getAnimationStore().onExtraCallbackWithResult(r4, r10, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        r10 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        r2.getAnimationStore().onExtraCallbackWithResult(r4, r10, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(isFireOS<?> isfireos, setCreativeDebuggerEnabled<?> setcreativedebuggerenabled, long j, boolean z) {
        View view;
        View viewOnExtraCallback;
        int i = 2 % 2;
        getAvailableMediatedNetworks getavailablemediatednetworks = null;
        if (setcreativedebuggerenabled instanceof AppLovinWebViewActivity) {
            viewOnExtraCallback = ((AppLovinWebViewActivity) setcreativedebuggerenabled).ICustomTabsCallback();
        } else if (setcreativedebuggerenabled instanceof AppLovinSdkConfigurationConsentFlowUserGeography) {
            viewOnExtraCallback = (View) RallyCanvas.onWarmupCompleted(new Object[]{((AppLovinSdkConfigurationConsentFlowUserGeography) setcreativedebuggerenabled).ICustomTabsCallback()}, 776567273, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -776567268, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
        } else if (setcreativedebuggerenabled instanceof runOnUiThread) {
            viewOnExtraCallback = ((runOnUiThread) setcreativedebuggerenabled).onExtraCallback();
        } else {
            view = null;
            if (view != null || (r11 = view.getContext()) == null) {
            }
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                int i4 = 71 / 0;
            }
        }
        view = viewOnExtraCallback;
        if (view != null) {
        }
    }

    public static /* synthetic */ Rally onNavigationEvent(Function2 function2, List list, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, Function1 function1, int i4, Object obj) {
        int i5;
        Interpolator interpolator2;
        int i6 = 2 % 2;
        int i7 = (i4 & 4) != 0 ? 1 : i;
        getExtraParameters getextraparameters2 = (i4 & 8) != 0 ? getExtraParameters.Alternate : getextraparameters;
        if ((i4 & 16) != 0) {
            int i8 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i5 = 0;
        } else {
            i5 = i2;
        }
        Object obj2 = null;
        if ((i4 & 32) != 0) {
            int i10 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            interpolator2 = null;
        } else {
            interpolator2 = interpolator;
        }
        Rally rallyOnNavigationEvent = onNavigationEvent(function2, list, i7, getextraparameters2, i5, interpolator2, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : bool, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? new Function1() { // from class: im.toss.tds.foundation.anim.rally.RallysKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj3) {
                int i11 = 2 % 2;
                int i12 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                Float f = (Float) RallysKt.onWarmupCompleted(new Object[]{(isCreativeDebuggerEnabled) obj3}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -895537892, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 895537893);
                int i14 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 == 0) {
                    return f;
                }
                throw null;
            }
        } : function1);
        int i11 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 == 0) {
            return rallyOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }

    public static final Rally onNavigationEvent(@NotNull Function2<? super setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled, ? super Float, Unit> function2, @NotNull List<AppLovinSdkSettings> list, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, @NotNull Function1<? super isCreativeDebuggerEnabled, Float> function1) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Rally rallyOnExtraCallbackWithResult = onExtraCallbackWithResult(new AppLovinSdkConfiguration(function1, function2), list, i, getextraparameters, i2, interpolator, num, bool, i3, 0L, false, 1536, null);
        int i5 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rallyOnExtraCallbackWithResult;
    }

    public static final AppLovinSdkSettings onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback(Address.onNavigationEvent.asBinder(), i);
        int i5 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return appLovinSdkSettingsOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        deprecated_dns deprecated_dnsVar = (deprecated_dns) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_dnsVar, "");
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback(deprecated_dnsVar, deprecated_dnsVar.IAuthTabCallback());
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinSdkSettingsOnExtraCallback;
        }
        throw null;
    }

    public static final AppLovinSdkSettings IAuthTabCallback(@NotNull AppLovinWebViewActivityaExternalSyntheticLambda0 appLovinWebViewActivityaExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinWebViewActivityaExternalSyntheticLambda0, "");
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback(appLovinWebViewActivityaExternalSyntheticLambda0, 1000);
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return appLovinSdkSettingsOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull Interpolator interpolator, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(interpolator, "");
        Object[] objArr = {new AppLovinSdkSettings().onWarmupCompleted(interpolator), Integer.valueOf(i)};
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, objArr, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        int i3 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return appLovinSdkSettings;
    }

    public static final <T extends getCmpService> List<AppLovinSdkSettings> onNavigationEvent(@NotNull T... tArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tArr, "");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 67;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = tArr[i2] instanceof AppLovinSdkSettings;
                throw null;
            }
            T t = tArr[i2];
            if (t instanceof AppLovinSdkSettings) {
                int i5 = i3 + 93;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(t);
            } else if (!(!(t instanceof getUserIdentifier))) {
                int i7 = i3 + 73;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                arrayList.addAll(((getUserIdentifier) t).onNavigationEvent());
                int i9 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Rally onExtraCallback(View view, AppLovinSdkSettings appLovinSdkSettings, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        Interpolator interpolator2;
        int i5;
        int i6 = 2 % 2;
        boolean z2 = true;
        int i7 = (i4 & 2) != 0 ? 1 : i;
        getExtraParameters getextraparameters2 = (i4 & 4) != 0 ? getExtraParameters.Alternate : getextraparameters;
        int i8 = (i4 & 8) != 0 ? 0 : i2;
        Boolean bool2 = null;
        if ((i4 & 16) != 0) {
            int i9 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 53 / 0;
            }
            interpolator2 = null;
        } else {
            interpolator2 = interpolator;
        }
        Integer num2 = (i4 & 32) != 0 ? null : num;
        if ((i4 & 64) != 0) {
            int i11 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        } else {
            bool2 = bool;
        }
        if ((i4 & 128) != 0) {
            int i13 = IAuthTabCallback;
            int i14 = i13 + 95;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 31;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            i5 = 0;
        } else {
            i5 = i3;
        }
        long j2 = (i4 & 256) != 0 ? -1L : j;
        if ((i4 & 512) != 0) {
            int i18 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i18 % 128;
            if (i18 % 2 == 0) {
                z2 = false;
            }
        } else {
            z2 = z;
        }
        return onExtraCallbackWithResult(view, appLovinSdkSettings, i7, getextraparameters2, i8, interpolator2, num2, bool2, i5, j2, z2);
    }

    public static final Rally onExtraCallbackWithResult(@NotNull View view, @NotNull AppLovinSdkSettings appLovinSdkSettings, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            Intrinsics.checkNotNullParameter(getextraparameters, "");
            return onWarmupCompleted(view, appLovinSdkSettings, i, getextraparameters, i2, interpolator, num, bool, i3, j, z);
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        onWarmupCompleted(view, appLovinSdkSettings, i, getextraparameters, i2, interpolator, num, bool, i3, j, z);
        throw null;
    }

    public static /* synthetic */ Rally IAuthTabCallback(View view, AppLovinSdkSettings appLovinSdkSettings, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        int i5;
        int i6;
        long j2;
        int i7 = 2 % 2;
        boolean z2 = true;
        int i8 = (i4 & 2) != 0 ? 1 : i;
        getExtraParameters getextraparameters2 = (i4 & 4) != 0 ? getExtraParameters.Alternate : getextraparameters;
        if ((i4 & 8) != 0) {
            int i9 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i9 % 128;
            i5 = i9 % 2 != 0 ? 1 : 0;
        } else {
            i5 = i2;
        }
        Interpolator interpolator2 = (i4 & 16) != 0 ? null : interpolator;
        Integer num2 = (i4 & 32) != 0 ? null : num;
        Boolean bool2 = (i4 & 64) == 0 ? bool : null;
        if ((i4 & 128) != 0) {
            int i10 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            i6 = 0;
        } else {
            i6 = i3;
        }
        if ((i4 & 256) != 0) {
            int i12 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            j2 = -1;
        } else {
            j2 = j;
        }
        if ((i4 & 512) != 0) {
            int i14 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 != 0) {
                z2 = false;
            }
        } else {
            z2 = z;
        }
        return onNavigationEvent(view, appLovinSdkSettings, i8, getextraparameters2, i5, interpolator2, num2, bool2, i6, j2, z2);
    }

    public static final Rally onNavigationEvent(@NotNull View view, @NotNull AppLovinSdkSettings appLovinSdkSettings, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(getextraparameters, "");
        Rally rallyOnExtraCallbackWithResult = onExtraCallbackWithResult(view, appLovinSdkSettings, i, getextraparameters, i2, interpolator, num, bool, i3, j, z);
        isFireOS.onExtraCallbackWithResult(rallyOnExtraCallbackWithResult, false, 1, null);
        int i7 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return rallyOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Float onNavigationEvent(isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        return (Float) onWarmupCompleted(new Object[]{iscreativedebuggerenabled}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -895537892, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 895537893);
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull deprecated_dns deprecated_dnsVar) {
        return (AppLovinSdkSettings) onWarmupCompleted(new Object[]{deprecated_dnsVar}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
    }

    public static final Rally onNavigationEvent(@NotNull shouldFailAdDisplayIfDontKeepActivitiesIsEnabled shouldfailaddisplayifdontkeepactivitiesisenabled, @NotNull AppLovinSdkSettings appLovinSdkSettings, int i, @NotNull getExtraParameters getextraparameters, int i2, @Nullable Interpolator interpolator, @Nullable Integer num, @Nullable Boolean bool, int i3, long j, boolean z) {
        return (Rally) onWarmupCompleted(new Object[]{shouldfailaddisplayifdontkeepactivitiesisenabled, appLovinSdkSettings, Integer.valueOf(i), getextraparameters, Integer.valueOf(i2), interpolator, num, bool, Integer.valueOf(i3), Long.valueOf(j), Boolean.valueOf(z)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1809886061, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1809886065);
    }

    public static /* synthetic */ Rally onNavigationEvent(View view, AppLovinSdkSettings appLovinSdkSettings, int i, getExtraParameters getextraparameters, int i2, Interpolator interpolator, Integer num, Boolean bool, int i3, long j, boolean z, int i4, Object obj) {
        return (Rally) onWarmupCompleted(new Object[]{view, appLovinSdkSettings, Integer.valueOf(i), getextraparameters, Integer.valueOf(i2), interpolator, num, bool, Integer.valueOf(i3), Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i4), obj}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
    }

    private static final Float IAuthTabCallback(isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        return (Float) onWarmupCompleted(new Object[]{iscreativedebuggerenabled}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1036295122, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1036295122);
    }
}
