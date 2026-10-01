package o;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.faceverify.impl.R;
import im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterScreenKt$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.WSConstant;
import o.getSurfaceSize;
import o.getViewTypeCount;
import o.oExternalSyntheticLambda0;
import o.setByteOrder;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class genMtopHead {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = onNavigationEvent(rally);
        int i4 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return appLovinSdkSettingsOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor(function1);
        }
        getInterfaceDescriptor(function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, WSConstant.onExtraCallback.asInterface asinterface, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    private static final Unit IAuthTabCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, WSConstant.onExtraCallback onextracallback, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, onextracallback, (Function1<? super WSConstant.onWarmupCompleted, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(WSConstant.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Unit unit;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {iAuthTabCallback, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            unit = (Unit) onNavigationEvent(-1830814120, setVisitUrl.onExtraCallbackWithResult(), 1830814127, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
            int i6 = 81 / 0;
        } else {
            Object[] objArr2 = {iAuthTabCallback, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            unit = (Unit) onNavigationEvent(-1830814120, setVisitUrl.onExtraCallbackWithResult(), 1830814127, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr2, setVisitUrl.onExtraCallbackWithResult());
        }
        int i7 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(WSConstant.onExtraCallback.asInterface asinterface, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(asinterface, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(boolean z, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(z, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(function1);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback_Parcel(function1);
            throw null;
        }
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(function1);
        int i3 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        String str = (String) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            access000(function1);
            obj.hashCode();
            throw null;
        }
        Unit unitAccess000 = access000(function1);
        int i3 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAccess000;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(-447610380, setVisitUrl.onExtraCallbackWithResult(), 447610386, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
        int i4 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 21 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, WSConstant.onExtraCallback.asInterface asinterface, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        } else {
            onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final /* synthetic */ void onExtraCallback(String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(str, str2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(function1);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(-617560309, setVisitUrl.onExtraCallbackWithResult(), 617560322, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = setVisitUrl.onExtraCallbackWithResult();
        int i3 = 66 / 0;
        return (Unit) onNavigationEvent(-617560309, setVisitUrl.onExtraCallbackWithResult(), 617560322, iOnExtraCallbackWithResult3, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult4);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
        int i6 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, WSConstant.onExtraCallback.asInterface asinterface, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, WSConstant.onExtraCallback onextracallback, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(highSpeedResolverExternalSyntheticLambda2, onextracallback, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 50 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(WSConstant.onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            onNavigationEvent(onextracallbackwithresult, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(onextracallbackwithresult, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0109 A[PHI: r8
      0x0109: PHI (r8v8 o.CameraCaptureResultEmptyCameraCaptureResult) = (r8v7 o.CameraCaptureResultEmptyCameraCaptureResult), (r8v11 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:16:0x0107, B:13:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0113 A[PHI: r8
      0x0113: PHI (r8v10 o.CameraCaptureResultEmptyCameraCaptureResult) = (r8v7 o.CameraCaptureResultEmptyCameraCaptureResult), (r8v11 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:16:0x0107, B:13:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i7;
        int i8;
        boolean z;
        long jOnExtraCallback;
        int i9 = ~i;
        int i10 = ~i4;
        int i11 = (~(i9 | i10)) | i3;
        int i12 = i4 | i9;
        int i13 = (~(i4 | i3)) | (~(i9 | (~i3) | i10)) | (~(i3 | i));
        int i14 = i3 + i + i6 + (764943627 * i2) + (189947931 * i5);
        int i15 = i14 * i14;
        int i16 = (i3 * 1860537600) + 224780607 + (i * 1860537600) + (i11 * 1034) + (i12 * (-517)) + (i13 * 517) + (1860538117 * i6) + ((-1861700041) * i2) + ((-831392377) * i5) + (i15 * 995229696);
        switch (((i3 * (-973936384)) - 801505280) + ((-973936384) * i) + (1838296578 * i11) + (1228335359 * i12) + ((-1228335359) * i13) + (2092695552 * i6) + ((-1475084288) * i2) + ((-1479278592) * i5) + ((-626393088) * i15) + (i16 * i16 * 1053163520)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                WSConstant.IAuthTabCallback iAuthTabCallback = (WSConstant.IAuthTabCallback) objArr[0];
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                ((Number) objArr[5]).intValue();
                int i17 = 2 % 2;
                int i18 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i18 % 128;
                if (i18 % 2 == 0) {
                    onNavigationEvent(143873983, setVisitUrl.onExtraCallbackWithResult(), -143873975, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue)), Integer.valueOf(iIntValue2)}, setVisitUrl.onExtraCallbackWithResult());
                } else {
                    onNavigationEvent(143873983, setVisitUrl.onExtraCallbackWithResult(), -143873975, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1)), Integer.valueOf(iIntValue2)}, setVisitUrl.onExtraCallbackWithResult());
                }
                return Unit.INSTANCE;
            case 8:
                WSConstant.IAuthTabCallback iAuthTabCallback2 = (WSConstant.IAuthTabCallback) objArr[0];
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int iIntValue4 = ((Number) objArr[4]).intValue();
                int i19 = 2 % 2;
                int i20 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i20 % 128;
                if (i20 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1614207194);
                    if ((iIntValue3 & 101) == 0) {
                        i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2) ? 4 : 2) | iIntValue3;
                    } else {
                        int i21 = onExtraCallbackWithResult + 115;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        i7 = iIntValue3;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1614207194);
                    if ((iIntValue3 & 6) == 0) {
                    }
                }
                int i23 = iIntValue4 & 2;
                if (i23 != 0) {
                    int i24 = onExtraCallbackWithResult + 53;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                    i7 |= 48;
                } else if ((iIntValue3 & 48) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                        int i26 = onExtraCallbackWithResult + 3;
                        IAuthTabCallback = i26 % 128;
                        int i27 = i26 % 2;
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & 19) != 18) {
                    int i28 = IAuthTabCallback + 39;
                    onExtraCallbackWithResult = i28 % 128;
                    int i29 = i28 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
                    if (i23 != 0) {
                        onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        int i30 = onExtraCallbackWithResult + 107;
                        IAuthTabCallback = i30 % 128;
                        int i31 = i30 % 2;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1614207194, i7, -1, "im.toss.features.faceverify.impl.ui.nudge.DebugOverlay (FacePassNudgeRegisterScreen.kt:341)");
                    }
                    int i32 = onExtraCallback.onWarmupCompleted[iAuthTabCallback2.onNavigationEvent().ordinal()];
                    if (i32 == 1) {
                        jOnExtraCallback = setByteOrder.Companion.onExtraCallback();
                    } else if (i32 == 2) {
                        jOnExtraCallback = setByteOrder.Companion.onExtraCallbackWithResult();
                    } else {
                        if (i32 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jOnExtraCallback = setByteOrder.Companion.asInterface();
                    }
                    long j = jOnExtraCallback;
                    setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(verifyDrawable.onExtraCallbackWithResult(onextracallback, setByteOrder.onExtraCallbackWithResult(onextracallbackwithresult.onNavigationEvent(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f));
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    String str = "● " + iAuthTabCallback2.IAuthTabCallback();
                    long jOnExtraCallback2 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(10);
                    getSurfaceSize.onWarmupCompleted onwarmupcompleted = getSurfaceSize.Companion;
                    CameraInfoUnavailableException.onNavigationEvent(str, (QuirksExternalSyntheticBackport0) null, new getHumanReadableName(j, jOnExtraCallback2, (GraphicDeviceInfo) null, (use) null, (delete) null, onwarmupcompleted.onExtraCallbackWithResult(), (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777180, (DefaultConstructorMarker) null), (Function1) null, 0, false, 0, 0, (skipBytes) null, (CameraX) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1018);
                    CameraInfoUnavailableException.onNavigationEvent(iAuthTabCallback2.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, new getHumanReadableName(onextracallbackwithresult.asBinder(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(10), (GraphicDeviceInfo) null, (use) null, (delete) null, onwarmupcompleted.onExtraCallbackWithResult(), (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777180, (DefaultConstructorMarker) null), (Function1) null, 0, false, 0, 0, (skipBytes) null, (CameraX) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1018);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    return null;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda4(iAuthTabCallback2, onextracallback, iIntValue3, iIntValue4));
                return null;
            case 9:
                return onTransact(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                WSConstant.onExtraCallback.asInterface asinterface = (WSConstant.onExtraCallback.asInterface) objArr[1];
                int i33 = 2 % 2;
                int i34 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i34 % 128;
                int i35 = i34 % 2;
                IAuthTabCallback((getSupportedHighSpeedResolutionsFor<WSConstant.onExtraCallback.asInterface>) getsupportedhighspeedresolutionsfor, asinterface);
                int i36 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 13:
                return access100(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(30532774, setVisitUrl.onExtraCallbackWithResult(), -30532769, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = setVisitUrl.onExtraCallbackWithResult();
        throw null;
    }

    private static final Unit onNavigationEvent(String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onNavigationEvent(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, WSConstant.onExtraCallback.asInterface asinterface, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(WSConstant.onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(onextracallbackwithresult, (Function1<? super WSConstant.onWarmupCompleted, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        Function0 function0 = (Function0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(zBooleanValue, function0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(zBooleanValue, function0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject(function1);
            throw null;
        }
        Unit typedObject = readTypedObject(function1);
        int i3 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IAuthTabCallback(function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(WSConstant.onExtraCallback.asInterface asinterface, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallback(asinterface, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(asinterface, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        onNavigationEvent(-1974291332, setVisitUrl.onExtraCallbackWithResult(), 1974291343, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(WSConstant.onWarmupCompleted.IAuthTabCallbackDefault.onWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit readTypedObject(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(WSConstant.onWarmupCompleted.access000.onNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull WSConstant.onExtraCallbackWithResult onextracallbackwithresult, @NotNull Function1<? super WSConstant.onWarmupCompleted, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(881664041);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        int i4 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 19) != 18, i4 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(881664041, i4, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterScreen (FacePassNudgeRegisterScreen.kt:59)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(881664041, i4, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterScreen (FacePassNudgeRegisterScreen.kt:59)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
                int i6 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i8 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            boolean zOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
            if ((onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.onTransact) || (onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.extraCallbackWithResult) || (onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.onMinimized)) {
                z = true;
                MtopBridgeExtention.onExtraCallback(zOnWarmupCompleted, z, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = YuvImageOnePixelShiftQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null));
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent3);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                int i10 = i4 & 112;
                z2 = i10 != 32;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z2) {
                    int i11 = IAuthTabCallback + 27;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda18(function1);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    MaxAdViewAdapterListener.onWarmupCompleted((Function0) objOnMinimized, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, setByteOrder.Companion.IAuthTabCallbackDefault(), (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24624, 236);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    WebSocketBridgeCallback.onNavigationEvent(-1499642578, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1499642587, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{onextracallbackwithresult, function1, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 1.0f, false, 2, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 0.0f, 13, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i4 & 126), 0});
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    onNavigationEvent((HighSpeedResolverExternalSyntheticLambda2) highSpeedResolverExternalSyntheticLambda1, onextracallbackwithresult.IAuthTabCallback(), function1, cameraCaptureResultEmptyCameraCaptureResult2, ((i4 << 3) & 896) | 6);
                    WSConstant.IAuthTabCallback iAuthTabCallbackOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                    if (iAuthTabCallbackOnExtraCallback == null) {
                        int i12 = onExtraCallbackWithResult + 101;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1313703449);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        z3 = true;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1313703448);
                        z3 = true;
                        onNavigationEvent(143873983, setVisitUrl.onExtraCallbackWithResult(), -143873975, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{iAuthTabCallbackOnExtraCallback, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult2.access100()), 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 8, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0, 0}, setVisitUrl.onExtraCallbackWithResult());
                        Unit unit = Unit.INSTANCE;
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    boolean zIAuthTabCallbackStub = onextracallbackwithresult.IAuthTabCallbackStub();
                    boolean z4 = i10 == 32 ? z3 : false;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (z4 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda19(function1);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    onExtraCallback(zIAuthTabCallbackStub, (Function0<Unit>) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                int i14 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                if ((onextracallbackwithresult.onWarmupCompleted() || !(onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.IAuthTabCallbackDefault)) && (!(onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.onActivityResized))) {
                    int i16 = IAuthTabCallback + 101;
                    onExtraCallbackWithResult = i16 % 128;
                    if (i16 % 2 == 0) {
                        boolean z5 = onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.onPostMessage;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.onPostMessage) && !(onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.asInterface) && !(onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.IAuthTabCallbackStub) && !(onextracallbackwithresult.IAuthTabCallback() instanceof WSConstant.onExtraCallback.extraCallback)) {
                        z = false;
                    }
                    MtopBridgeExtention.onExtraCallback(zOnWarmupCompleted, z, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent22 = YuvImageOnePixelShiftQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null));
                    component5 component5VarOnWarmupCompleted22 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                    int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent22);
                    Function0 function0IAuthTabCallback22 = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnWarmupCompleted22, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult3.onTransact());
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent32 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode32 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent32);
                    Function0 function0IAuthTabCallback32 = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, component5VarOnNavigationEvent2, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, Integer.valueOf(iHashCode32), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, quirksExternalSyntheticBackport0OnWarmupCompleted32, onextracallbackwithresult3.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    int i102 = i4 & 112;
                    if (i102 != 32) {
                    }
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z2) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda20(onextracallbackwithresult, function1, i));
        }
    }

    private static final AppLovinSdkSettings onNavigationEvent(Rally rally) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf2, fValueOf, null, 4, null};
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettings2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<WSConstant.onExtraCallback.asInterface> $lastShown$delegate;
        final /* synthetic */ WSConstant.onExtraCallback.asInterface $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(WSConstant.onExtraCallback.asInterface asinterface, getSupportedHighSpeedResolutionsFor<WSConstant.onExtraCallback.asInterface> getsupportedhighspeedresolutionsfor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = asinterface;
            this.$lastShown$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$lastShown$delegate, access13800Var);
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            WSConstant.onExtraCallback.asInterface asinterface = this.$state;
            if (asinterface != null) {
                int i7 = IAuthTabCallback + 29;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    Object[] objArr = {this.$lastShown$delegate, asinterface};
                    genMtopHead.onNavigationEvent(-1721465959, setVisitUrl.onExtraCallbackWithResult(), 1721465971, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
                    throw null;
                }
                Object[] objArr2 = {this.$lastShown$delegate, asinterface};
                genMtopHead.onNavigationEvent(-1721465959, setVisitUrl.onExtraCallbackWithResult(), 1721465971, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr2, setVisitUrl.onExtraCallbackWithResult());
            }
            Unit unit = Unit.INSTANCE;
            int i8 = IAuthTabCallback + 123;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Rally $exitRally;
        final /* synthetic */ WSConstant.onExtraCallback.asInterface $state;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $visible$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(WSConstant.onExtraCallback.asInterface asinterface, Rally rally, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = asinterface;
            this.$exitRally = rally;
            this.$visible$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$exitRally, this.$visible$delegate, access13800Var);
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$state != null) {
                    genMtopHead.onWarmupCompleted(this.$visible$delegate, true);
                } else if (!(!genMtopHead.onExtraCallbackWithResult(this.$visible$delegate))) {
                    isFireOS.onExtraCallbackWithResult(this.$exitRally, false, 1, (Object) null);
                    Rally rally = this.$exitRally;
                    this.label = 1;
                    if (RallyKt.onWarmupCompleted(rally, (Function2) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 37;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
            int i7 = onExtraCallback + 15;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0 ? i4 != 1 : i4 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            genMtopHead.onWarmupCompleted(this.$visible$delegate, false);
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(WSConstant.onWarmupCompleted.IAuthTabCallbackStub.onExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(WSConstant.onExtraCallback.asInterface asinterface, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 24) == 0) {
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    int i6 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 % 3;
                    }
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1588229225, i3, -1, "im.toss.features.faceverify.impl.ui.nudge.EntryNudgeCta.<anonymous> (FacePassNudgeRegisterScreen.kt:170)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.selfie_impl_register_nudge_next, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zIAuthTabCallback = asinterface.IAuthTabCallback();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i10 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda17(function1);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda17);
                    int i11 = IAuthTabCallback + 55;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    obj2 = externalSyntheticLambda17;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj2, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, zIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, i3 & 14, 502);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit access100(Function1 function1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(WSConstant.onWarmupCompleted.asInterface.IAuthTabCallback);
            unit = Unit.INSTANCE;
            int i3 = 43 / 0;
        } else {
            function1.invoke(WSConstant.onWarmupCompleted.asInterface.IAuthTabCallback);
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(WSConstant.onExtraCallback.asInterface asinterface, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i7 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(783487641, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.EntryNudgeCta.<anonymous> (FacePassNudgeRegisterScreen.kt:177)");
                int i13 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.selfie_impl_register_nudge_close, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            boolean zIAuthTabCallback = asinterface.IAuthTabCallback();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent)) {
                FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda6(function1);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                obj = externalSyntheticLambda6;
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, onwarmupcompleted, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, !zIAuthTabCallback, false, cameraCaptureResultEmptyCameraCaptureResult, 196608, i2 & 14, 726);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = onExtraCallbackWithResult + 53;
                    IAuthTabCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, onwarmupcompleted, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, !zIAuthTabCallback, false, cameraCaptureResultEmptyCameraCaptureResult, 196608, i2 & 14, 726);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, WSConstant.onExtraCallback.asInterface asinterface, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1<? super WSConstant.onWarmupCompleted, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda14;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z;
        boolean z2;
        WSConstant.onExtraCallback.asInterface asinterfaceOnExtraCallback;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1994631114);
        if ((i & 48) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(asinterface) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i6 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i8 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i10 & 1169) != 1168, i10 & 1)) {
            int i11 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1994631114, i10, -1, "im.toss.features.faceverify.impl.ui.nudge.EntryNudgeCta (FacePassNudgeRegisterScreen.kt:139)");
            }
            getMediaContentViewGroup getmediacontentviewgroup = new getMediaContentViewGroup(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda10();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Rally rallyOnExtraCallback = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, getmediacontentviewgroup, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 24576, 16375);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            Object obj = null;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                int i13 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(asinterface, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                int i15 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                int i17 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(asinterface != null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
            int i18 = i10 & 112;
            if (i18 == 32) {
                int i19 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z) {
                int i21 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i21 % 128;
                if (i21 % 2 != 0) {
                    onwarmupcompleted.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new onNavigationEvent(asinterface, getsupportedhighspeedresolutionsfor, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(asinterface, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 >> 3) & 14);
                if (asinterface != null) {
                    int i22 = IAuthTabCallback + 83;
                    onExtraCallbackWithResult = i22 % 128;
                    int i23 = i22 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z3 = i18 == 32;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z3 | zOnNavigationEvent) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new onWarmupCompleted(asinterface, rallyOnExtraCallback, getsupportedhighspeedresolutionsfor2, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z2), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if (asinterface == null) {
                    int i24 = IAuthTabCallback + 19;
                    onExtraCallbackWithResult = i24 % 128;
                    if (i24 % 2 == 0) {
                        onExtraCallback((getSupportedHighSpeedResolutionsFor<WSConstant.onExtraCallback.asInterface>) getsupportedhighspeedresolutionsfor);
                        obj.hashCode();
                        throw null;
                    }
                    asinterfaceOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<WSConstant.onExtraCallback.asInterface>) getsupportedhighspeedresolutionsfor);
                } else {
                    asinterfaceOnExtraCallback = asinterface;
                }
                if (!onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2) || asinterfaceOnExtraCallback == null) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        return;
                    } else {
                        externalSyntheticLambda14 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda11(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0, function1, i);
                    }
                } else {
                    u1.IAuthTabCallback(RallyModifierKt.IAuthTabCallback(quirksExternalSyntheticBackport0, rallyOnExtraCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 >> 6) & 14, 2), (u2) null, ForwardingCameraControl.onExtraCallback(-1588229225, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda12(asinterfaceOnExtraCallback, function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(783487641, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda13(asinterfaceOnExtraCallback, function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24960, 0, 4074);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda14);
        }
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            externalSyntheticLambda14 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda14(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0, function1, i);
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda14);
        }
    }

    private static final Unit getInterfaceDescriptor(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(WSConstant.onWarmupCompleted.asBinder.onWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function1 function1, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1503400535, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterBottomArea.<anonymous> (FacePassNudgeRegisterScreen.kt:208)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.selfie_impl_help_button_text, cameraCaptureResultEmptyCameraCaptureResult, 0);
            oExternalSyntheticLambda0.onExtraCallback onextracallbackOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallback.Companion.onNavigationEvent();
            oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda9(function1);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            u3Var.onExtraCallback(strOnExtraCallback, onextracallbackOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 24624, 44);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access000(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(WSConstant.onWarmupCompleted.access100.onExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var);
                throw null;
            }
            i2 = i | (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-389547741, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterBottomArea.<anonymous> (FacePassNudgeRegisterScreen.kt:216)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.selfie_impl_retry_button_text, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i5 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda15(function1);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda15);
                    obj = externalSyntheticLambda15;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(WSConstant.onWarmupCompleted.onWarmupCompleted.onExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        boolean z;
        Object obj;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 35) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    int i6 = IAuthTabCallback + 81;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i8 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-811770804, i3, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterBottomArea.<anonymous> (FacePassNudgeRegisterScreen.kt:228)");
                    int i11 = 32 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-811770804, i3, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterBottomArea.<anonymous> (FacePassNudgeRegisterScreen.kt:228)");
                }
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.selfie_impl_transfer_register_nudge_cta, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent) {
                FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda3(function1);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                obj = externalSyntheticLambda3;
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i3 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i12 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i3 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i14 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(WSConstant.onWarmupCompleted.onExtraCallback.onNavigationEvent);
        if (i3 == 0) {
            return Unit.INSTANCE;
        }
        int i4 = 62 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function1 function1, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i8 % 128;
            Object obj2 = null;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj2.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(431675347, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterBottomArea.<anonymous> (FacePassNudgeRegisterScreen.kt:234)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.selfie_impl_transfer_register_nudge_alternative, cameraCaptureResultEmptyCameraCaptureResult, 0);
            oExternalSyntheticLambda0.onExtraCallback onextracallbackOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallback.Companion.onNavigationEvent();
            oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent) {
                FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda5(function1);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                obj = externalSyntheticLambda5;
                u3Var.onExtraCallback(strOnExtraCallback, onextracallbackOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 24624, 44);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onExtraCallbackWithResult + 81;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj2.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i10 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u3Var.onExtraCallback(strOnExtraCallback, onextracallbackOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 24624, 44);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(WSConstant.onWarmupCompleted.onTransact.onWarmupCompleted);
        if (i3 != 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1204769749, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterBottomArea.<anonymous> (FacePassNudgeRegisterScreen.kt:254)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.selfie_impl_register_complete_guide_cta, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent) {
                FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda16(function1);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda16);
                obj = externalSyntheticLambda16;
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallback + 55;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function1 function1, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        function1.invoke(new WSConstant.onWarmupCompleted.IAuthTabCallbackStubProxy(r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, WSConstant.onExtraCallback onextracallback, Function1<? super WSConstant.onWarmupCompleted, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        Throwable th;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        WSConstant.onExtraCallback.asInterface asinterface;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-28526178);
        if ((i & 6) == 0) {
            int i5 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                int i7 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ^ true ? 128 : 256;
        }
        int i9 = i2;
        if ((i9 & 147) != 146) {
            int i10 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i10 % 128;
            z = i10 % 2 != 0;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i9 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-28526178, i9, -1, "im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterBottomArea (FacePassNudgeRegisterScreen.kt:191)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(onextracallback2, onextracallbackwithresult.onWarmupCompleted()), 0.0f, 1, (Object) null);
            if (!(onextracallback instanceof WSConstant.onExtraCallback.asInterface)) {
                asinterface = null;
            } else {
                int i11 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                asinterface = (WSConstant.onExtraCallback.asInterface) onextracallback;
            }
            th = null;
            onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, asinterface, quirksExternalSyntheticBackport0OnExtraCallback, function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i9 << 3) & 7168) | (i9 & 14));
            if (onextracallback instanceof WSConstant.onExtraCallback.ICustomTabsCallback) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(580622672);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                u1.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (u2) null, ForwardingCameraControl.onExtraCallback(-389547741, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda21(function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-1503400535, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda22(function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 1573248, 0, 4026);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                if (onextracallback instanceof WSConstant.onExtraCallback.onPostMessage) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(581387039);
                    u1.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (u2) null, ForwardingCameraControl.onExtraCallback(-811770804, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda23(function1), cameraCaptureResultEmptyCameraCaptureResult2, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(431675347, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda24(function1), cameraCaptureResultEmptyCameraCaptureResult2, 54), 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 12583296, 0, 3962);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else if (onextracallback instanceof WSConstant.onExtraCallback.IAuthTabCallback) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(582191954);
                    u1.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, t7a.onWarmupCompleted(false, (Function0) null, (Function0) null, 0.0f, new t7ExternalSyntheticLambda0.onExtraCallback.onWarmupCompleted(0.0f, 0.0f, false, (Integer) null, 1900, 15, (DefaultConstructorMarker) null), false, cameraCaptureResultEmptyCameraCaptureResult2, 0, 47), ForwardingCameraControl.onExtraCallback(-1204769749, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda25(function1), cameraCaptureResultEmptyCameraCaptureResult2, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 384, 0, 4088);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else if (onextracallback instanceof WSConstant.onExtraCallback.onActivityResized) {
                    int i12 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(582878945);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(onextracallback2, onextracallbackwithresult.onWarmupCompleted());
                    WSConstant.onExtraCallback.onActivityResized onactivityresized = (WSConstant.onExtraCallback.onActivityResized) onextracallback;
                    String strAsInterface = onactivityresized.asInterface();
                    String strIAuthTabCallbackStub = onactivityresized.IAuthTabCallbackStub();
                    String strIAuthTabCallbackDefault = onactivityresized.IAuthTabCallbackDefault();
                    Map mapIAuthTabCallback = onactivityresized.IAuthTabCallback();
                    if ((i9 & 896) == 256) {
                        int i14 = onExtraCallbackWithResult + 5;
                        IAuthTabCallback = i14 % 128;
                        boolean z2 = i14 % 2 == 0;
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (!z2) {
                            Object obj2 = objOnMinimized;
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda26 externalSyntheticLambda26 = new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda26(function1);
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda26);
                                obj2 = externalSyntheticLambda26;
                            }
                            hasVideoUrl.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted, strAsInterface, strIAuthTabCallbackStub, strIAuthTabCallbackDefault, (Long) null, mapIAuthTabCallback, (setHasShown) null, (StandardTermsV2CustomVariable[]) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, (Function1) obj2, (Float) null, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, (StandardTermsV2YouthRegisterParam) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getRawFullResponse) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 1046480);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1643751870);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            th = null;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda27(highSpeedResolverExternalSyntheticLambda2, onextracallback, function1, i));
        }
        int i15 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i15 % 128;
        if (i15 % 2 == 0) {
            throw th;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ v1 $sheetState;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, v1 v1Var, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$visible = z;
            this.$sheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$visible, this.$sheetState, access13800Var);
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        
            if (o.v1.IAuthTabCallback(r6, (o.u5b) null, r5, 1, (java.lang.Object) null) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        
            if (o.v1.onExtraCallback(r6, (o.x1) null, r5, 1, (java.lang.Object) null) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    int i4 = onExtraCallbackWithResult + 71;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0 ? i3 != 2 : i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (this.$visible) {
                    v1 v1Var = this.$sheetState;
                    this.label = 1;
                } else {
                    v1 v1Var2 = this.$sheetState;
                    this.label = 2;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ v1 $sheetState;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(v1 v1Var, boolean z, Function0<Unit> function0, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
            this.$visible = z;
            this.$onDismiss = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$sheetState, this.$visible, this.$onDismiss, access13800Var);
            int i2 = onNavigationEvent + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 19 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!this.$sheetState.IAuthTabCallback_Parcel()) {
                int i3 = onNavigationEvent + 123;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this.$visible) {
                    this.$onDismiss.invoke();
                }
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 17;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit onExtraCallback(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(730529876, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.FaceTransferHelpBottomSheet.<anonymous> (FacePassNudgeRegisterScreen.kt:295)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.uikit.R.string.uikit_confirm, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(boolean z, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2035550288);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 19) != 18) {
            int i5 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i5 % 128;
            z2 = i5 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2035550288, i4, -1, "im.toss.features.faceverify.impl.ui.nudge.FaceTransferHelpBottomSheet (FacePassNudgeRegisterScreen.kt:281)");
                int i6 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            v1 v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1023);
            int i8 = i4 & 14;
            boolean z3 = i8 == 4;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1VarOnExtraCallback);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            Object obj = null;
            if ((zOnNavigationEvent | z3) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallbackWithResult(z, v1VarOnExtraCallback, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8);
            boolean zIAuthTabCallback_Parcel = v1VarOnExtraCallback.IAuthTabCallback_Parcel();
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1VarOnExtraCallback);
            boolean z4 = i8 == 4;
            boolean z5 = (i4 & 112) == 32;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z5 | z4 | zOnNavigationEvent2)) {
                int i9 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new IAuthTabCallback(v1VarOnExtraCallback, z, function0, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zIAuthTabCallback_Parcel), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if (v1VarOnExtraCallback.IAuthTabCallback_Parcel()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(435817476);
                    TBAuthorizeBridgeExtension tBAuthorizeBridgeExtension = TBAuthorizeBridgeExtension.onNavigationEvent;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    u6a.IAuthTabCallback(v1VarOnExtraCallback, (setContentInsetsRelative) null, 0L, 0L, (Function2) null, tBAuthorizeBridgeExtension.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(730529876, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda7(function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, tBAuthorizeBridgeExtension.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult2, 1769472, 3072, 8094);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(436753490);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda8(z, function0, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) != 0) {
            i2 = i;
        } else if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar))) {
            int i6 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2 == 0 ? 2 : 4;
            i2 = i | i7;
        }
        if ((i2 & 19) != 18) {
            int i8 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1685672177, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.HelpInstructionRow.<anonymous> (FacePassNudgeRegisterScreen.kt:327)");
            }
            w3bVar.onExtraCallbackWithResult(deprecated_authenticator.onWarmupCompleted(str), getViewTypeCount.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.XSmall, (QuirksExternalSyntheticBackport0) null, 0L, 0L, 0, 0.0f, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 48, (i2 << 6) & 896, 4092);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
                if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                    int i6 = onExtraCallbackWithResult + 61;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1386137539, i, -1, "im.toss.features.faceverify.impl.ui.nudge.HelpInstructionRow.<anonymous> (FacePassNudgeRegisterScreen.kt:332)");
            }
            w5aVar.onExtraCallbackWithResult(str, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i9 != 0) {
                    int i10 = 97 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1476270298);
        if ((i & 6) == 0) {
            int i7 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i8 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            int i10 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i12 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1476270298, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.HelpInstructionRow (FacePassNudgeRegisterScreen.kt:324)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1476270298, i2, -1, "im.toss.features.faceverify.impl.ui.nudge.HelpInstructionRow (FacePassNudgeRegisterScreen.kt:324)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1386137539, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda0(str2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(1685672177, true, new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda1(str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 390, 384, 126970);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassNudgeRegisterScreenKt$.ExternalSyntheticLambda2(str, str2, i));
        }
    }

    private static final WSConstant.onExtraCallback.asInterface onExtraCallback(getSupportedHighSpeedResolutionsFor<WSConstant.onExtraCallback.asInterface> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        WSConstant.onExtraCallback.asInterface asinterface = (WSConstant.onExtraCallback.asInterface) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return asinterface;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<WSConstant.onExtraCallback.asInterface> getsupportedhighspeedresolutionsfor, WSConstant.onExtraCallback.asInterface asinterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(asinterface);
        int i4 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(-927490805, setVisitUrl.onExtraCallbackWithResult(), 927490815, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(1959834199, setVisitUrl.onExtraCallbackWithResult(), -1959834199, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(Rally rally) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (AppLovinSdkSettings) onNavigationEvent(295430907, setVisitUrl.onExtraCallbackWithResult(), -295430904, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{rally}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(-985194368, setVisitUrl.onExtraCallbackWithResult(), 985194372, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Boolean.valueOf(z), function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(-638843028, setVisitUrl.onExtraCallbackWithResult(), 638843037, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(1750414423, setVisitUrl.onExtraCallbackWithResult(), -1750414421, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Function1 function1) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-1748678381, setVisitUrl.onExtraCallbackWithResult(), 1748678382, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
    }

    private static final void onWarmupCompleted(WSConstant.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {iAuthTabCallback, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onNavigationEvent(143873983, setVisitUrl.onExtraCallbackWithResult(), -143873975, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(WSConstant.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {iAuthTabCallback, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onNavigationEvent(-1830814120, setVisitUrl.onExtraCallbackWithResult(), 1830814127, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
    }

    private static final Unit onTransact(Function1 function1) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-447610380, setVisitUrl.onExtraCallbackWithResult(), 447610386, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) throws NoWhenBranchMatchedException {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        onNavigationEvent(-1974291332, setVisitUrl.onExtraCallbackWithResult(), 1974291343, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallbackStubProxy(Function1 function1) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(30532774, setVisitUrl.onExtraCallbackWithResult(), -30532769, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
    }

    private static final Unit extraCallbackWithResult(Function1 function1) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-617560309, setVisitUrl.onExtraCallbackWithResult(), 617560322, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{function1}, iOnExtraCallbackWithResult2);
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, WSConstant.onExtraCallback.asInterface asinterface) throws NoWhenBranchMatchedException {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        onNavigationEvent(-1721465959, setVisitUrl.onExtraCallbackWithResult(), 1721465971, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, asinterface}, iOnExtraCallbackWithResult2);
    }
}
