package o;

import android.view.animation.Interpolator;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.common.collect.Synchronized;
import im.toss.feature.credit.uikit.compose.R;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxAppOpenAd;
import o.QuirksExternalSyntheticBackport0;
import o.RuntimeEnvironmentListener;
import o.getSwitchMinWidth;
import o.getViewTypeCount;
import o.isContainerClickable;
import o.removeAdapter;
import o.toPreviewOnlyRange;
import o.w3b;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RuntimeEnvironmentListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i4 = onNavigationEvent + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(removeadapter);
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getsupportedhighspeedresolutionsfor, z);
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = i4 | i7 | i8;
        int i10 = ~(i3 | i7);
        int i11 = (~(i7 | i8)) | (~i4);
        int i12 = i4 + i5 + i2 + ((-1537480081) * i6) + ((-1176924877) * i);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i4) - 1179058176) + ((-1443770816) * i5) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i2) + (1226178560 * i6) + ((-1044512768) * i) + (1201733632 * i13);
        int i15 = (i4 * 1018573086) + 1206756779 + (i5 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i2 * 1018572655) + (i6 * (-758184159)) + (i * (-595421667)) + (i13 * (-1647378432));
        int i16 = i14 + (i15 * i15 * 1518272512);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        onNavigationEvent(str, str2, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        Unit unit = (Unit) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, -1928293404, 1928293405, objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        int i5 = onWarmupCompleted + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0);
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(maxAppOpenAd);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(maxAppOpenAd);
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(removeadapter);
        }
        onWarmupCompleted(removeadapter);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        Function0 function02 = (Function0) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        isContainerClickable iscontainerclickable = (isContainerClickable) objArr[4];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function0, function02, str, str2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, function02, str, str2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onWarmupCompleted + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr = {str, str2, function0, function02, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {str, str2, function0, function02, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -712169611, 712169613, objArr2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        int i5 = onNavigationEvent + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $bannerState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$bannerState$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$bannerState$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            RuntimeEnvironmentListener.IAuthTabCallback(this.$bannerState$delegate, true);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit onExtraCallback(removeAdapter removeadapter) {
        getMediaContentViewGroup getmediacontentviewgroup;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = AuthenticatorCompanion.onWarmupCompleted(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.DOWN, (AuthenticatorCompanionAuthenticatorNone) null, false, (Function1) null, 28, (Object) null);
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        Interpolator interpolatorIAuthTabCallback_Parcel = appLovinSdkSettingsOnWarmupCompleted.IAuthTabCallback_Parcel();
        if (interpolatorIAuthTabCallback_Parcel != null) {
            getMediaContentViewGroup getmediacontentviewgroup2 = new getMediaContentViewGroup(interpolatorIAuthTabCallback_Parcel);
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getmediacontentviewgroup = getmediacontentviewgroup2;
        } else {
            getmediacontentviewgroup = null;
        }
        removeAdapter.IAuthTabCallback(1516033057, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1516033053, new Object[]{removeadapter, appLovinSdkSettingsOnWarmupCompleted.access100(), null, getmediacontentviewgroup, Float.valueOf(fIAuthTabCallback), 2, null}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        Interpolator interpolatorIAuthTabCallback_Parcel2 = appLovinSdkSettingsOnWarmupCompleted.IAuthTabCallback_Parcel();
        removeAdapter.IAuthTabCallback(removeadapter, appLovinSdkSettingsOnWarmupCompleted.access100(), (Integer) null, interpolatorIAuthTabCallback_Parcel2 != null ? new getMediaContentViewGroup(interpolatorIAuthTabCallback_Parcel2) : null, 1.0f, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 107;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(removeAdapter removeadapter) {
        Integer num;
        setOnQueryTextListener setonquerytextlistener;
        Integer num2;
        float f;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(removeadapter, "");
            num = null;
            setonquerytextlistener = null;
            Object[] objArr = {removeadapter, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-20.0f)), 109, null};
            removeAdapter.IAuthTabCallback(1516033057, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1516033053, objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
            num2 = null;
            f = 0.0f;
            i = 8;
        } else {
            Intrinsics.checkNotNullParameter(removeadapter, "");
            num = null;
            setonquerytextlistener = null;
            Object[] objArr2 = {removeadapter, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-20.0f)), 7, null};
            removeAdapter.IAuthTabCallback(1516033057, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1516033053, objArr2, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
            num2 = null;
            f = 0.0f;
            i = 7;
        }
        removeAdapter.IAuthTabCallback(removeadapter, num2, num, setonquerytextlistener, f, i, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.TRUE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = RuntimeEnvironmentListener.IAuthTabCallback((removeAdapter) obj);
                int i5 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.FALSE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 25;
                onExtraCallback = i3 % 128;
                removeAdapter removeadapter = (removeAdapter) obj;
                if (i3 % 2 != 0) {
                    return RuntimeEnvironmentListener.onExtraCallbackWithResult(removeadapter);
                }
                RuntimeEnvironmentListener.onExtraCallbackWithResult(removeadapter);
                throw null;
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        String str = (String) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((iIntValue & 57) != 82) {
                int i3 = onNavigationEvent + 1;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((iIntValue & 17) != 16) {
            }
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onWarmupCompleted + 125;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-525000209, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerSection.<anonymous>.<anonymous>.<anonymous> (CreditChangeTopBanner.kt:83)");
                int i6 = onNavigationEvent + 21;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            AppLovinNativeAdImplc.onExtraCallbackWithResult(str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.alert_image, cameraCaptureResultEmptyCameraCaptureResult, 0), cameraCaptureResultEmptyCameraCaptureResult, 48, 252);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 119;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = onWarmupCompleted + 35;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 17) != 16) {
            int i5 = onNavigationEvent + 57;
            onWarmupCompleted = i5 % 128;
            z = i5 % 2 != 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(371528037, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerSection.<anonymous>.<anonymous>.<anonymous> (CreditChangeTopBanner.kt:91)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResult, 48, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final Function0 function0, final Function0 function02, final String str, final String str2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        long jOnNavigationEvent;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable))) {
                int i6 = onWarmupCompleted + 77;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onWarmupCompleted + 111;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                int i10 = onWarmupCompleted + 33;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            int i12 = onWarmupCompleted + 41;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onWarmupCompleted + 37;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-153324312, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerSection.<anonymous>.<anonymous> (CreditChangeTopBanner.kt:54)");
                    int i15 = 28 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-153324312, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerSection.<anonymous>.<anonymous> (CreditChangeTopBanner.kt:54)");
                }
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda4
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i16 = 2 % 2;
                        int i17 = onWarmupCompleted + 81;
                        onExtraCallbackWithResult = i17 % 128;
                        MaxAppOpenAd maxAppOpenAd = (MaxAppOpenAd) obj;
                        if (i17 % 2 == 0) {
                            return RuntimeEnvironmentListener.onExtraCallbackWithResult(maxAppOpenAd);
                        }
                        RuntimeEnvironmentListener.onExtraCallbackWithResult(maxAppOpenAd);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = iscontainerclickable.onExtraCallback(onextracallback, getswitchminwidth, (Function1) objOnMinimized);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda5
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i16 = 2 % 2;
                            int i17 = onWarmupCompleted + 77;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            Object[] objArr = {function0};
                            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                            Unit unit = (Unit) RuntimeEnvironmentListener.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, 430327516, -430327516, objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                            int i19 = onExtraCallbackWithResult + 9;
                            onWarmupCompleted = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i20 = 44 / 0;
                            }
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function03);
                    obj = function03;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, 0.0f, null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 3);
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
                    int i16 = onNavigationEvent + 81;
                    onWarmupCompleted = i16 % 128;
                    if (i16 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1315737252);
                        jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 91).onWarmupCompleted();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1315737252);
                        jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onWarmupCompleted();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1315735751);
                    jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted, jOnNavigationEvent, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f))), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)));
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(371528037, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i17 = 2 % 2;
                        int i18 = onExtraCallback + 95;
                        IAuthTabCallback = i18 % 128;
                        Object obj5 = null;
                        if (i18 % 2 != 0) {
                            RuntimeEnvironmentListener.onExtraCallback(str, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            obj5.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallback = RuntimeEnvironmentListener.onExtraCallback(str, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i19 = onExtraCallback + 125;
                        IAuthTabCallback = i19 % 128;
                        if (i19 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-525000209, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda7
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i17 = 2 % 2;
                        int i18 = onNavigationEvent + 95;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        Unit unitOnExtraCallback = RuntimeEnvironmentListener.onExtraCallback(str2, (w3b) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i20 = onNavigationEvent + 27;
                        onWarmupCompleted = i20 % 128;
                        int i21 = i20 % 2;
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent2) {
                    int i17 = onNavigationEvent + 23;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    Object obj2 = objOnMinimized3;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        Function0 function04 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda8
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i19 = 2 % 2;
                                int i20 = onExtraCallbackWithResult + 87;
                                onWarmupCompleted = i20 % 128;
                                int i21 = i20 % 2;
                                Function0 function05 = function02;
                                if (i21 != 0) {
                                    return RuntimeEnvironmentListener.onExtraCallbackWithResult(function05);
                                }
                                RuntimeEnvironmentListener.onExtraCallbackWithResult(function05);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function04);
                        obj2 = function04;
                    }
                    w4.onWarmupCompleted(encoderProfilesProxyVideoProfileProxyOnExtraCallback, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, true, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, 0.0f, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) obj2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 24966, 0, 114656);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@NotNull final String str, @NotNull final String str2, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(392533892);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = onWarmupCompleted + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                int i6 = onWarmupCompleted + 105;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i2 & 1171) == 1170), i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(392533892, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerSection (CreditChangeTopBanner.kt:39)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
                int i8 = onWarmupCompleted + 25;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Boolean bool = Boolean.TRUE;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallback(getsupportedhighspeedresolutionsfor, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(bool, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{Boolean.valueOf(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)), null, 0, 0, ForwardingCameraControl.onExtraCallback(-153324312, true, new setTaggedAddrCtrl() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Unit unit;
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 1;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        Object[] objArr = {function0, function02, str, str2, (isContainerClickable) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        unit = (Unit) RuntimeEnvironmentListener.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, 1776675356, -1776675353, objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                        int i12 = 90 / 0;
                    } else {
                        Object[] objArr2 = {function0, function02, str, str2, (isContainerClickable) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        unit = (Unit) RuntimeEnvironmentListener.onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, 1776675356, -1776675353, objArr2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                    }
                    int i13 = onExtraCallbackWithResult + 71;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditChangeTopBannerKt$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 85;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 == 0) {
                        RuntimeEnvironmentListener.onNavigationEvent(str, str2, function0, function02, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnNavigationEvent = RuntimeEnvironmentListener.onNavigationEvent(str, str2, function0, function02, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = IAuthTabCallback + 57;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 78 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            });
            int i10 = onNavigationEvent + 25;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, 430327516, -430327516, new Object[]{function0}, iOnExtraCallback3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, Function0 function02, String str, String str2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function0, function02, str, str2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, 1776675356, -1776675353, objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    private static final Unit onNavigationEvent(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, -1928293404, 1928293405, objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    private static final Unit onWarmupCompleted(String str, String str2, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, str2, function0, function02, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onExtraCallback(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, -712169611, 712169613, objArr, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }
}
