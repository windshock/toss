package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.foreigner.home.R;
import im.toss.features.foreigner.home.ui.asset.ForeignerHomeTossBankPromotionKt$;
import im.toss.features.foreigner.home.ui.asset.ForeignerHomeTossBankPromotionKt$ForeignerHomeTossBankPromotion$1$1$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.hasProvider;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NativeBridge {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Unit IAuthTabCallback(newValue newvalue, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCallToAction.onExtraCallback onextracallback, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(newvalue, function0, quirksExternalSyntheticBackport0, onextracallback, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 46 / 0;
        }
        int i8 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(newValue newvalue, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCallToAction.onExtraCallback onextracallback, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            IAuthTabCallback(newvalue, function0, quirksExternalSyntheticBackport0, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            IAuthTabCallback(newvalue, function0, quirksExternalSyntheticBackport0, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $referrer;
        final /* synthetic */ newValue $tossbankReward;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(String str, newValue newvalue, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$referrer = str;
            this.$tossbankReward = newvalue;
        }

        public static /* synthetic */ Unit onWarmupCompleted(newValue newvalue, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(newvalue, setDetectableSize);
            int i4 = onExtraCallback + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$referrer, this.$tossbankReward, access13800Var);
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 35 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            setParams.onNavigationEvent(4701256L, this.$referrer, (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeTossBankPromotionKt$ForeignerHomeTossBankPromotion$1$1$.ExternalSyntheticLambda0(this.$tossbankReward));
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onExtraCallback(newValue newvalue, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setDetectableSize.onExtraCallback("tossbank_reward_yn", zzaz.onExtraCallbackWithResult(newvalue.onExtraCallbackWithResult()));
            setDetectableSize.onExtraCallback("button_type", "create_account");
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull newValue newvalue, @NotNull Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        int iOrdinal;
        ParamImpl paramImpl;
        getBacktraceNote getbacktracenoteIAuthTabCallback;
        hasProvider hasprovider;
        String strOnExtraCallback;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setCallToAction.onExtraCallback onextracallback2;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(newvalue, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1757017431);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(newvalue) ^ true ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i6 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i9 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (onextracallback == null) {
                int i11 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 5 / 0;
                }
                iOrdinal = -1;
            } else {
                iOrdinal = onextracallback.ordinal();
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 2048 : 1024;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            onextracallback2 = onextracallback;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            if (i8 != 0) {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            }
            setCallToAction.onExtraCallback onextracallback3 = i10 != 0 ? setCallToAction.onExtraCallback.Fill : onextracallback;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1757017431, i3, -1, "im.toss.features.foreigner.home.ui.asset.ForeignerHomeTossBankPromotion (ForeignerHomeTossBankPromotion.kt:29)");
            }
            String str = (String) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setParams.onWarmupCompleted());
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
            if ((i3 & 14) == 4) {
                int i13 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i13 % 128;
                boolean z = i13 % 2 != 0;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z || zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    paramImpl = null;
                    objOnMinimized = new onWarmupCompleted(str, newvalue, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                } else {
                    paramImpl = null;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                String strOnNavigationEvent = getLongName.onNavigationEvent(newvalue.IAuthTabCallback(), paramImpl, 1, paramImpl);
                String strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(newvalue.onExtraCallback() ? R.string.foreigner_home_asset_toss_bank_reward_title_random_amount : R.string.foreigner_home_asset_toss_bank_reward_title_fixed_amount, new Object[]{strOnNavigationEvent}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iIndexOf$default = StringsKt.indexOf$default(strIAuthTabCallback, strOnNavigationEvent, 0, false, 6, (Object) null);
                if (newvalue.onExtraCallbackWithResult()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(540778866);
                    hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                    iAuthTabCallback.IAuthTabCallback(strIAuthTabCallback);
                    iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, strOnNavigationEvent.length() + iIndexOf$default);
                    hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    hasprovider = hasproviderOnExtraCallbackWithResult;
                    getbacktracenoteIAuthTabCallback = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(541058889);
                    getbacktracenoteIAuthTabCallback = null;
                    hasProvider.IAuthTabCallback iAuthTabCallback2 = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                    iAuthTabCallback2.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_toss_bank_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    hasProvider hasproviderOnExtraCallbackWithResult2 = iAuthTabCallback2.onExtraCallbackWithResult();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    hasprovider = hasproviderOnExtraCallbackWithResult2;
                }
                if (newvalue.onExtraCallbackWithResult()) {
                    int i14 = onExtraCallbackWithResult + 41;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(541237201);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_toss_bank_reward_description, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(541332216);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_toss_bank_description, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                String str2 = strOnExtraCallback;
                String fillLogoImageUrl = checkNavigationBarByWindowManagerService.TOSS_BANK.getFillLogoImageUrl();
                String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_toss_bank_label, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                String strOnExtraCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_create_account, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if (newvalue.onExtraCallbackWithResult()) {
                    getbacktracenoteIAuthTabCallback = sendUserPermanentNotGrantPermission.IAuthTabCallback.IAuthTabCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                setExecuteTimeStamp.onExtraCallbackWithResult(fillLogoImageUrl, strOnExtraCallback2, hasprovider, str2, strOnExtraCallback3, function0, quirksExternalSyntheticBackport03, onextracallback3, getbacktracenoteIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 << 12) & android.R.attr.shouldUseDefaultUnfoldTransition, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                onextracallback2 = onextracallback3;
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeTossBankPromotionKt$.ExternalSyntheticLambda0(newvalue, function0, quirksExternalSyntheticBackport02, onextracallback2, i, i2));
        }
    }
}
