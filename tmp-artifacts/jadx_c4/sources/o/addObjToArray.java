package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.feature.credit.ui.main.R;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.addObjToArray;
import o.getPrivacyDestinationUri;
import o.getViewTypeCount;
import o.h5ScreenShotObserverOnChangeOpt;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.w3b;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addObjToArray {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ class onNavigationEvent {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[getPerformance.values().length];
            try {
                iArr[getPerformance.QUIZ.ordinal()] = 1;
                int i = onExtraCallback + 115;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 5 / 2;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPerformance.MISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(MyQuizDetailsResponse myQuizDetailsResponse, enableAppModelOpt enableappmodelopt, Function1 function1, Function1 function12, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(myQuizDetailsResponse, enableappmodelopt, function1, function12, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 29 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(MyQuizDetailsResponse myQuizDetailsResponse, enableAppModelOpt enableappmodelopt, Function1 function1, Function1 function12, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 33;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onNavigationEvent(myQuizDetailsResponse, enableappmodelopt, function1, function12, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(myQuizDetailsResponse, enableappmodelopt, function1, function12, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i2);
        int i9 = ~i6;
        int i10 = (~(i9 | i4)) | i8;
        int i11 = ~i2;
        int i12 = i11 | i4;
        int i13 = i10 | (~i12);
        int i14 = i7 | i6;
        int i15 = i8 | (~i14);
        int i16 = (~(i2 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i6));
        int i17 = i4 + i6 + i + ((-1254723898) * i3) + ((-1667789834) * i5);
        int i18 = i17 * i17;
        int i19 = ((i4 * (-402395399)) - 1316031342) + (i6 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + ((-402393527) * i) + ((-1219896714) * i3) + ((-610841306) * i5) + (i18 * (-825819136));
        int i20 = ((-534547663) * i4) + 1379663872 + ((-481802647) * i6) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i) + ((-1033371648) * i3) + ((-106430464) * i5) + (1552875520 * i18) + (i19 * i19 * (-1063190528));
        boolean z = true;
        if (i20 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i20 != 2) {
            return i20 != 3 ? i20 != 4 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        String str = (String) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i21 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 17) == 16) {
            int i22 = onNavigationEvent + 21;
            IAuthTabCallback = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 5 % 2;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i24 = onNavigationEvent + 33;
            IAuthTabCallback = i24 % 128;
            int i25 = i24 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2088619323, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous>.<anonymous> (CreditHomeQuizDualBanner.kt:173)");
                int i26 = IAuthTabCallback + 55;
                onNavigationEvent = i26 % 128;
                int i27 = i26 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackStub()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i28 = onNavigationEvent + 121;
                IAuthTabCallback = i28 % 128;
                int i29 = i28 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2026367938, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2026367942);
        int i5 = IAuthTabCallback + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, getSharedPreferences getsharedpreferences) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, getsharedpreferences);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getPerformance getperformance, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getperformance, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getSharedPreferences getsharedpreferences = (getSharedPreferences) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, getsharedpreferences);
        int i4 = IAuthTabCallback + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(MyQuizDetailsResponse myQuizDetailsResponse, enableAppModelOpt enableappmodelopt, Function1 function1, Function1 function12, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 75;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(myQuizDetailsResponse, enableappmodelopt, function1, function12, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 115;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, Function1 function1, getSharedPreferences getsharedpreferences, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, function1, getsharedpreferences, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 17 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, String str, String str2, boolean z2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, str, str2, z2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        int i6 = onNavigationEvent + 55;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr2, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 30318750, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -30318748);
        int i4 = IAuthTabCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(MyQuizDetailsResponse myQuizDetailsResponse, enableAppModelOpt enableappmodelopt, Function1 function1, Function1 function12, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(myQuizDetailsResponse, enableappmodelopt, function1, function12, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 21;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 83 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 69;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getPerformance getperformance, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getperformance, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, Function1 function1, getSharedPreferences getsharedpreferences, String str, String str2, String str3, getPerformance getperformance, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {Boolean.valueOf(z), function1, getsharedpreferences, str, str2, str3, getperformance, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            return (Unit) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1976501348, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1976501351);
        }
        Object[] objArr2 = {Boolean.valueOf(z), function1, getsharedpreferences, str, str2, str3, getperformance, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSharedPreferences $bannerData;
        final /* synthetic */ Function1<getSharedPreferences, Unit> $onBannerImpression;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Function1<? super getSharedPreferences, Unit> function1, getSharedPreferences getsharedpreferences, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$onBannerImpression = function1;
            this.$bannerData = getsharedpreferences;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$onBannerImpression, this.$bannerData, access13800Var);
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 41 / 0;
            return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(200L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            this.$onBannerImpression.invoke(this.$bannerData);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallback(getPerformance getperformance, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        long jOnTransact;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                i3 = 4;
            } else {
                int i7 = IAuthTabCallback + 7;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = IAuthTabCallback + 31;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1016366122, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeQuizDualBanner.kt:123)");
            }
            deprecated_followRedirects deprecated_followredirectsOnExtraCallback = deprecated_encodedQuery.onExtraCallback(OkHttp.onExtraCallback);
            int i11 = onNavigationEvent.onNavigationEvent[getperformance.ordinal()];
            if (i11 == 1) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1770274545);
                jOnTransact = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onTransact();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                if (i11 != 2) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1770271562);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1770277050);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    int i12 = onNavigationEvent + 91;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1770278353);
                    jOnTransact = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1476501535, OverseasRrnInputTextField.IAuthTabCallback(), 1476501541)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1770279313);
                    jOnTransact = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).RemoteActionCompatParcelizer();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            AppLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 285911272, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{appLovinNativeAdImplExternalSyntheticLambda1, deprecated_followredirectsOnExtraCallback, null, Long.valueOf(jOnTransact), null, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 18) & 3670016), 58}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -285911271, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i14 = IAuthTabCallback + 65;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final getPerformance getperformance, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(256012918, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous>.<anonymous> (CreditHomeQuizDualBanner.kt:108)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 11, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onMessageChannelReady(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).mayLaunchUrl(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            setIconUri.IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, (String) null, ForwardingCameraControl.onExtraCallback(1016366122, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 21;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnWarmupCompleted = addObjToArray.onWarmupCompleted(getperformance, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i9 = onExtraCallback + 15;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 12585990, 118);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i2 = onNavigationEvent + 55;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1905785321, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous>.<anonymous>.<anonymous> (CreditHomeQuizDualBanner.kt:146)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1905785321, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous>.<anonymous>.<anonymous> (CreditHomeQuizDualBanner.kt:146)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i3 = IAuthTabCallback + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1146750793, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous>.<anonymous>.<anonymous> (CreditHomeQuizDualBanner.kt:158)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 9;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = IAuthTabCallback + 123;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(boolean z, final String str, String str2, boolean z2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 85) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i6 = onNavigationEvent + 63;
                    IAuthTabCallback = i6 % 128;
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
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-636551039, i3, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous>.<anonymous> (CreditHomeQuizDualBanner.kt:134)");
                int i8 = IAuthTabCallback + 105;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1211322497);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                EmbedWebviewLoadPoint.onExtraCallbackWithResult(str, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), str2, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackStub(), (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 16);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (z2) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1210964323);
                w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1905785321, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 45;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 == 0) {
                            addObjToArray.onExtraCallbackWithResult(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = addObjToArray.onExtraCallbackWithResult(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i12 = onNavigationEvent + 45;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 3) & 112) | 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i10 = onNavigationEvent + 81;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1210455365);
                w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1146750793, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallbackWithResult + 21;
                        onExtraCallback = i13 % 128;
                        Object obj4 = null;
                        if (i13 % 2 == 0) {
                            addObjToArray.onWarmupCompleted(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = addObjToArray.onWarmupCompleted(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i14 = onExtraCallback + 53;
                        onExtraCallbackWithResult = i14 % 128;
                        if (i14 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 3) & 112) | 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = IAuthTabCallback + 89;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function1 function1, getSharedPreferences getsharedpreferences) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(getsharedpreferences);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(String str, final Function1 function1, final getSharedPreferences getsharedpreferences, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(945564581, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous>.<anonymous> (CreditHomeQuizDualBanner.kt:183)");
            }
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsharedpreferences);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                int i3 = onNavigationEvent + 95;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i4 = 2 % 2;
                            int i5 = onExtraCallback + 23;
                            onNavigationEvent = i5 % 128;
                            Object obj3 = null;
                            if (i5 % 2 != 0) {
                                addObjToArray.onExtraCallbackWithResult(function1, getsharedpreferences);
                                throw null;
                            }
                            Unit unitOnExtraCallbackWithResult = addObjToArray.onExtraCallbackWithResult(function1, getsharedpreferences);
                            int i6 = onExtraCallback + 125;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj2 = function0;
                }
                setAdvertiser.onExtraCallbackWithResult(str, (QuirksExternalSyntheticBackport0) null, iAuthTabCallbackOnNavigationEvent, onwarmupcompleted, onextracallback, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, (Function0) obj2, false, false, cameraCaptureResultEmptyCameraCaptureResult, 28032, 0, 1762);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = IAuthTabCallback + 29;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i5 = 11 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function1 function1, getSharedPreferences getsharedpreferences) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(getsharedpreferences);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        getBacktraceNote getbacktracenoteOnExtraCallback;
        getBacktraceNote getbacktracenote;
        final boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        final Function1 function1 = (Function1) objArr[1];
        final getSharedPreferences getsharedpreferences = (getSharedPreferences) objArr[2];
        final String str = (String) objArr[3];
        final String str2 = (String) objArr[4];
        final String str3 = (String) objArr[5];
        final getPerformance getperformance = (getPerformance) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1317349346, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner.<anonymous> (CreditHomeQuizDualBanner.kt:97)");
            }
            if (zBooleanValue) {
                int i3 = IAuthTabCallback + 3;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1042634416);
                z = !getFixedPositions.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2038070235);
                z = false;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = IAuthTabCallback + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
                quirksExternalSyntheticBackport0OnExtraCallback = zBooleanValue ? QuirksExternalSyntheticBackport0.Companion : CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 5, (Object) null);
            } else if (!(!zBooleanValue)) {
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0OnExtraCallback;
            if (z) {
                int i7 = IAuthTabCallback + 45;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2035106817);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2035106817);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                getbacktracenote = null;
            } else {
                if (zBooleanValue) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2035062300);
                    getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-2088619323, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda3
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 47;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 == 0) {
                                throw null;
                            }
                            Unit unit = (Unit) addObjToArray.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{str, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -842865853, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 842865854);
                            int i10 = onNavigationEvent + 117;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2034684348);
                    getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(945564581, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda4
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallback + 55;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 != 0) {
                                return addObjToArray.onNavigationEvent(str2, function1, getsharedpreferences, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            }
                            addObjToArray.onNavigationEvent(str2, function1, getsharedpreferences, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                getbacktracenote = getbacktracenoteOnExtraCallback;
            }
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-636551039, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 9;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        return addObjToArray.onNavigationEvent(z, str3, str, zBooleanValue, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    addObjToArray.onNavigationEvent(z, str3, str, zBooleanValue, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(256012918, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 79;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallbackWithResult = addObjToArray.onExtraCallbackWithResult(getperformance, (w3b) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i11 = onExtraCallback + 53;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 77 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsharedpreferences);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallback + 51;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr2 = {function1, getsharedpreferences};
                            Unit unit = (Unit) addObjToArray.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr2, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1235042396, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1235042396);
                            int i11 = onExtraCallback + 25;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj2 = function0;
                }
                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, quirksExternalSyntheticBackport0, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, getbacktracenote, onextracallbackOnNavigationEvent, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) obj2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 12585990, 0, 57136);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = IAuthTabCallback + 87;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[PHI: r0 r4
      0x006b: PHI (r0v10 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v11 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0047, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r4v59 java.lang.Integer) = (r4v4 int), (r4v61 int) binds: [B:8:0x0047, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r0 r4
      0x0049: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v11 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0047, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r4v5 java.lang.Integer) = (r4v4 int), (r4v61 int) binds: [B:8:0x0047, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable final MyQuizDetailsResponse myQuizDetailsResponse, @Nullable final enableAppModelOpt enableappmodelopt, @NotNull final Function1<? super getSharedPreferences, Unit> function1, @NotNull final Function1<? super getSharedPreferences, Unit> function12, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        int i5;
        Integer num;
        boolean z2;
        final boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        getPerformance getperformance;
        getPerformance getperformance2;
        String strIAuthTabCallback;
        List listIAuthTabCallbackStub;
        boolean z4;
        int size;
        List listIAuthTabCallbackStub2;
        int i6;
        String str;
        Object obj;
        Object obj2;
        long jOnNavigationEvent;
        String strOnExtraCallbackWithResult;
        Long lOnExtraCallback;
        Integer numOnWarmupCompleted;
        int iIntValue;
        Integer numOnWarmupCompleted2;
        List listIAuthTabCallbackStub3;
        int i7 = 2 % 2;
        int i8 = IAuthTabCallback + 75;
        onNavigationEvent = i8 % 128;
        String strOnExtraCallbackWithResult2 = "";
        if (i8 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1262106159);
            i3 = 40;
            if ((i & 109) == 0) {
                int i9 = onNavigationEvent + 25;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 20 / 0;
                    i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(myQuizDetailsResponse) ? 4 : 2;
                } else if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(myQuizDetailsResponse))) {
                }
                i5 = i4 | i;
                num = i3;
            } else {
                num = i3;
                i5 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1262106159);
            i3 = 6;
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(enableappmodelopt) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
        }
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                int i12 = onNavigationEvent + 47;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                z2 = z;
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 16384 : 8192;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 9363) == 9362, i5 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                z3 = z2;
            } else {
                boolean z5 = i11 != 0 ? false : z2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1262106159, i5, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeQuizAndMissionBanner (CreditHomeQuizDualBanner.kt:44)");
                    int i14 = IAuthTabCallback + 57;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                }
                if (myQuizDetailsResponse != null && (listIAuthTabCallbackStub3 = myQuizDetailsResponse.IAuthTabCallbackStub()) != null && listIAuthTabCallbackStub3.size() > 0) {
                    int i16 = onNavigationEvent + 55;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    getperformance2 = getPerformance.QUIZ;
                } else if (enableappmodelopt == null || !Intrinsics.areEqual(enableappmodelopt.onNavigationEvent(), Boolean.FALSE)) {
                    getperformance = null;
                    if (getperformance != null) {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i18 = IAuthTabCallback + 51;
                            onNavigationEvent = i18 % 128;
                            if (i18 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final boolean z6 = z5;
                            function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda9
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                                    int i19 = 2 % 2;
                                    int i20 = onNavigationEvent + 77;
                                    onWarmupCompleted = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        return addObjToArray.onExtraCallback(myQuizDetailsResponse, enableappmodelopt, function1, function12, z6, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    }
                                    Unit unitOnExtraCallback = addObjToArray.onExtraCallback(myQuizDetailsResponse, enableappmodelopt, function1, function12, z6, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    int i21 = 82 / 0;
                                    return unitOnExtraCallback;
                                }
                            };
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                            return;
                        }
                        return;
                    }
                    int[] iArr = onNavigationEvent.onNavigationEvent;
                    int i19 = iArr[getperformance.ordinal()];
                    if (i19 != 1) {
                        int i20 = onNavigationEvent + 13;
                        IAuthTabCallback = i20 % 128;
                        if (i20 % 2 != 0 ? i19 != 2 : i19 != 2) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1703221987);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            throw new NoWhenBranchMatchedException();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1703215824);
                        if (z5) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1260072760);
                            int i21 = R.string.credit_home_variant_mission_menu_title;
                            if (enableappmodelopt == null || (numOnWarmupCompleted2 = enableappmodelopt.onWarmupCompleted()) == null) {
                                iIntValue = 0;
                            } else {
                                int i22 = IAuthTabCallback + 113;
                                onNavigationEvent = i22 % 128;
                                int i23 = i22 % 2;
                                iIntValue = numOnWarmupCompleted2.intValue();
                            }
                            strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(i21, new Object[]{Integer.valueOf(iIntValue)}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1259931152);
                            strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_home_mission_menu_title, new Object[]{Integer.valueOf((enableappmodelopt == null || (numOnWarmupCompleted = enableappmodelopt.onWarmupCompleted()) == null) ? 0 : numOnWarmupCompleted.intValue())}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1703220434);
                        strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_home_quiz_menu_title, new Object[]{Integer.valueOf((myQuizDetailsResponse == null || (listIAuthTabCallbackStub = myQuizDetailsResponse.IAuthTabCallbackStub()) == null) ? 0 : listIAuthTabCallbackStub.size())}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    final String str2 = strIAuthTabCallback;
                    int i24 = iArr[getperformance.ordinal()];
                    if (i24 != 1) {
                        int i25 = IAuthTabCallback + 61;
                        onNavigationEvent = i25 % 128;
                        int i26 = i25 % 2;
                        if (i24 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (enableappmodelopt != null && (lOnExtraCallback = enableappmodelopt.onExtraCallback()) != null) {
                            jIAuthTabCallbackDefault = lOnExtraCallback.longValue();
                        }
                        z4 = z5;
                    } else {
                        jIAuthTabCallbackDefault = myQuizDetailsResponse != null ? myQuizDetailsResponse.IAuthTabCallbackDefault() : 0L;
                        if (myQuizDetailsResponse == null || (listIAuthTabCallbackStub2 = myQuizDetailsResponse.IAuthTabCallbackStub()) == null) {
                            z4 = z5;
                            size = 0;
                        } else {
                            size = listIAuthTabCallbackStub2.size();
                            z4 = z5;
                        }
                        jIAuthTabCallbackDefault *= size;
                    }
                    final String strIAuthTabCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_home_reward_amount_button_text, new Object[]{Long.valueOf(jIAuthTabCallbackDefault)}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    final String strIAuthTabCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_home_reward_amount_text, new Object[]{Long.valueOf(jIAuthTabCallbackDefault)}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int i27 = iArr[getperformance.ordinal()];
                    if (i27 != 1) {
                        i6 = 2;
                        if (i27 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "mission";
                    } else {
                        i6 = 2;
                        str = "credit_quiz";
                    }
                    int i28 = iArr[getperformance.ordinal()];
                    if (i28 == 1) {
                        strOnExtraCallbackWithResult2 = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.onMinimized.IAuthTabCallback, false, "credit_main", false, null, 13, null);
                    } else {
                        if (i28 != i6) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (enableappmodelopt != null && (strOnExtraCallbackWithResult = enableappmodelopt.onExtraCallbackWithResult()) != null) {
                            strOnExtraCallbackWithResult2 = strOnExtraCallbackWithResult;
                        }
                    }
                    final getSharedPreferences getsharedpreferences = new getSharedPreferences(str2, str, strOnExtraCallbackWithResult2, strIAuthTabCallback2);
                    boolean z7 = (i5 & 896) == 256;
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsharedpreferences);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z7 || zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        obj = null;
                        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(function1, getsharedpreferences, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onextracallbackwithresult);
                        obj2 = onextracallbackwithresult;
                    } else {
                        obj = null;
                        obj2 = objOnMinimized;
                    }
                    isZslDisabledByByUserCaseConfig.IAuthTabCallback(getperformance, str2, strIAuthTabCallback2, (Function2) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    final boolean z8 = z4;
                    Integer num2 = num;
                    final getPerformance getperformance3 = getperformance;
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1317349346, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda10
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i29 = 2 % 2;
                            int i30 = onExtraCallback + 109;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            Unit unitOnWarmupCompleted = addObjToArray.onWarmupCompleted(z8, function12, getsharedpreferences, strIAuthTabCallback3, strIAuthTabCallback2, str2, getperformance3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i32 = onExtraCallback + 69;
                            IAuthTabCallback = i32 % 128;
                            if (i32 % 2 != 0) {
                                return unitOnWarmupCompleted;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    if (z4) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1254229384);
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, num2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1254186139);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
                        if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1703018683);
                            jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onWarmupCompleted();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1703017182);
                            jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jOnNavigationEvent, new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f))));
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
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
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, num2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    z3 = z4;
                } else {
                    int i29 = onNavigationEvent + 117;
                    IAuthTabCallback = i29 % 128;
                    int i30 = i29 % 2;
                    getperformance2 = getPerformance.MISSION;
                }
                getperformance = getperformance2;
                if (getperformance != null) {
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeQuizDualBannerKt$$ExternalSyntheticLambda11
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                        int i31 = 2 % 2;
                        int i32 = IAuthTabCallback + 95;
                        onNavigationEvent = i32 % 128;
                        int i33 = i32 % 2;
                        Unit unitIAuthTabCallback = addObjToArray.IAuthTabCallback(myQuizDetailsResponse, enableappmodelopt, function1, function12, z3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i34 = IAuthTabCallback + 75;
                        onNavigationEvent = i34 % 128;
                        if (i34 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                };
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                return;
            }
            return;
        }
        i5 |= 24576;
        z2 = z;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 9363) == 9362, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, getSharedPreferences getsharedpreferences) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, new Object[]{function1, getsharedpreferences}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1235042396, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1235042396);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -842865853, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 842865854);
    }

    private static final Unit onExtraCallback(boolean z, Function1 function1, getSharedPreferences getsharedpreferences, String str, String str2, String str3, getPerformance getperformance, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Boolean.valueOf(z), function1, getsharedpreferences, str, str2, str3, getperformance, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1976501348, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1976501351);
    }

    private static final Unit IAuthTabCallback(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 30318750, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -30318748);
    }

    private static final Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2026367938, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2026367942);
    }
}
