package im.toss.securities.widget.overview.ui.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity$;
import im.toss.securities.widget.overview.ui.setting.model.AccountSections;
import im.toss.securities.widget.overview.ui.small.setting.OverviewSmallWidgetSettingActivity;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AFLogger4;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CameraProviderInitRetryPolicy1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RightClickGesturesKtonRightClickDown2;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.access13800;
import o.component5;
import o.getAwbState;
import o.getSupportedHighSpeedResolutionsFor;
import o.isZslDisabledByByUserCaseConfig;
import o.q8ExternalSyntheticLambda3;
import o.r0a;
import o.r8ExternalSyntheticLambda0;
import o.rExternalSyntheticLambda0;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setRubIn;
import o.toPreviewOnlyRange;
import o.u1;
import o.u4;
import o.x4ExternalSyntheticLambda3;
import o.x4ExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class BaseOverviewWidgetSettingActivity extends Hilt_BaseOverviewWidgetSettingActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final Lazy IAuthTabCallbackDefault = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(TossSecWidgetOverviewSettingViewModel.class), new onExtraCallbackWithResult(this), new IAuthTabCallback(this), new onWarmupCompleted(null, this));

    @Inject
    public AFLogger4 widgetNavigationPort;

    public static /* synthetic */ Unit IAuthTabCallback(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(baseOverviewWidgetSettingActivity, z);
        int i4 = onTransact + 109;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~(i | i6)) | i2;
        int i8 = ~i;
        int i9 = ~((~i2) | i8 | i6);
        int i10 = (~(i6 | i2)) | (~(i8 | (~i6)));
        int i11 = i + i2 + i3 + (1616745821 * i4) + (2077170981 * i5);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i) + 1587019776 + (806482222 * i2) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i3) + ((-395313152) * i4) + (904921088 * i5) + (345505792 * i12);
        int i14 = (i * (-1558553916)) + 318941677 + (i2 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i3 * (-1558553459)) + (i4 * 397062201) + (i5 * 609114465) + (i12 * (-138936320));
        int i15 = i13 + (i14 * i14 * 1630011392);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(baseOverviewWidgetSettingActivity, context, i);
        }
        IAuthTabCallback(baseOverviewWidgetSettingActivity, context, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, AccountSections.Account account) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(baseOverviewWidgetSettingActivity, account);
        }
        onWarmupCompleted(baseOverviewWidgetSettingActivity, account);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(168925510, -168925510, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{baseOverviewWidgetSettingActivity, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        int i5 = onTransact + 87;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity = (BaseOverviewWidgetSettingActivity) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(baseOverviewWidgetSettingActivity, fFloatValue);
        int i4 = IAuthTabCallbackStub + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(1903205756, -1903205753, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{baseOverviewWidgetSettingActivity, context, Integer.valueOf(i)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        int i5 = onTransact + 55;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, Context context, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 99;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(baseOverviewWidgetSettingActivity, context, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 19;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 41;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(baseOverviewWidgetSettingActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 69;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(getsupportedhighspeedresolutionsfor);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor);
        int i3 = onTransact + 3;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, DisplaySetting displaySetting) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(baseOverviewWidgetSettingActivity, displaySetting);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onTransact + 117;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor);
        int i4 = onTransact + 123;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract String ICustomTabsServiceDefault();

    public abstract void onWarmupCompleted(@NotNull Context context, int i);

    public abstract float updateVisuals();

    public abstract q8ExternalSyntheticLambda3 validateRelationship();

    public static final /* synthetic */ TossSecWidgetOverviewSettingViewModel onExtraCallbackWithResult(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModelICustomTabsServiceStub = baseOverviewWidgetSettingActivity.ICustomTabsServiceStub();
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return tossSecWidgetOverviewSettingViewModelICustomTabsServiceStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity = (BaseOverviewWidgetSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Object obj = null;
        AFLogger4 aFLogger4 = baseOverviewWidgetSettingActivity.widgetNavigationPort;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        if (aFLogger4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 19;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return aFLogger4;
    }

    private final TossSecWidgetOverviewSettingViewModel ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) this.IAuthTabCallbackDefault.getValue();
        int i4 = IAuthTabCallbackStub + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return tossSecWidgetOverviewSettingViewModel;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (!onNavigationEvent()) {
            requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(971364586, true, new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda10(this))), 1, (Object) null);
            return;
        }
        int i4 = onTransact + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public IAuthTabCallback(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.getDefaultViewModelProviderFactory();
                obj.hashCode();
                throw null;
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onExtraCallbackWithResult.getDefaultViewModelProviderFactory();
            int i3 = onWarmupCompleted + 117;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return defaultViewModelProviderFactory;
            }
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
            if (i3 != 0) {
                int i4 = 91 / 0;
            }
            return onwarmupcompletedIAuthTabCallback;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onExtraCallbackWithResult(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallback + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onWarmupCompleted.getViewModelStore();
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return viewModelStore;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ ComponentActivity onNavigationEvent;
        final /* synthetic */ Function0 onWarmupCompleted;

        public onWarmupCompleted(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            int i = 2 % 2;
            Function0 function0 = this.onWarmupCompleted;
            if (function0 != null) {
                int i2 = onExtraCallback + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = IAuthTabCallback + 49;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            return this.onNavigationEvent.getDefaultViewModelCreationExtras();
        }
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        onExtraCallback(-423413082, 423413084, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, true}, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 95;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(-423413082, 423413084, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, true}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        } else {
            onExtraCallback(-423413082, 423413084, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, false}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 101;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 73;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x4externalsyntheticlambda4)) {
                int i7 = IAuthTabCallbackStub + 109;
                onTransact = i7 % 128;
                i3 = i7 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = IAuthTabCallbackStub + 101;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 107;
                IAuthTabCallbackStub = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1508544698, i2, -1, "im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseOverviewWidgetSettingActivity.kt:99)");
                    int i11 = 57 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1508544698, i2, -1, "im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseOverviewWidgetSettingActivity.kt:99)");
                }
            }
            boolean zOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda6(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            int i12 = (i2 << 9) & 7168;
            x4externalsyntheticlambda4.onExtraCallback("계좌 설정", zOnNavigationEvent, (Function0) objOnMinimized, null, false, false, 0L, null, 0L, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 390, i12, 8184);
            boolean zOnNavigationEvent2 = onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                Object externalSyntheticLambda7 = new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda7(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                obj = externalSyntheticLambda7;
            } else {
                obj = objOnMinimized2;
            }
            x4externalsyntheticlambda4.onExtraCallback("배경 설정", !zOnNavigationEvent2, (Function0) obj, null, false, false, 0L, null, 0L, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 390, i12, 8184);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i13 = onTransact + 89;
        IAuthTabCallbackStub = i13 % 128;
        int i14 = i13 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            baseOverviewWidgetSettingActivity.ICustomTabsServiceStub().onExtraCallbackWithResult(z);
            int i3 = 36 / 0;
            return Unit.INSTANCE;
        }
        baseOverviewWidgetSettingActivity.ICustomTabsServiceStub().onExtraCallbackWithResult(z);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, AccountSections.Account account) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(account, "");
        baseOverviewWidgetSettingActivity.ICustomTabsServiceStub().onExtraCallback(account);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 29;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, DisplaySetting displaySetting) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(displaySetting, "");
        Object[] objArr = {baseOverviewWidgetSettingActivity.ICustomTabsServiceStub(), displaySetting};
        TossSecWidgetOverviewSettingViewModel.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 869030385, -869030384);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 73;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        baseOverviewWidgetSettingActivity.ICustomTabsServiceStub().onWarmupCompleted(f);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 105;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, Context context, int i) {
        int i2 = 2 % 2;
        baseOverviewWidgetSettingActivity.onWarmupCompleted(context, i);
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", i);
        Unit unit = Unit.INSTANCE;
        baseOverviewWidgetSettingActivity.setResult(-1, intent);
        baseOverviewWidgetSettingActivity.finish();
        int i3 = IAuthTabCallbackStub + 57;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity = (BaseOverviewWidgetSettingActivity) objArr[0];
        int i = 2 % 2;
        baseOverviewWidgetSettingActivity.ICustomTabsServiceStub().IAuthTabCallback((Function0<Unit>) new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda9(baseOverviewWidgetSettingActivity, (Context) objArr[1], ((Number) objArr[2]).intValue()));
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, Context context, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        boolean z = false;
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallbackStub + 115;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onTransact + 9;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i9 = IAuthTabCallbackStub + 111;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1426269137, i2, -1, "im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseOverviewWidgetSettingActivity.kt:150)");
            }
            int iIAuthTabCallback = baseOverviewWidgetSettingActivity.IAuthTabCallback();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseOverviewWidgetSettingActivity);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIAuthTabCallback);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Object externalSyntheticLambda8 = new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda8(baseOverviewWidgetSettingActivity, context, iIAuthTabCallback);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                    obj = externalSyntheticLambda8;
                }
                u4Var.onNavigationEvent("완료", null, null, (Function0) obj, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        boolean z;
        boolean zOnExtraCallback;
        Object objOnMinimized;
        Object objOnMinimized2;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        float f;
        BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity = (BaseOverviewWidgetSettingActivity) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i2 = IAuthTabCallbackStub + 29;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = onTransact + 5;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onTransact + 19;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1859774820, iIntValue, -1, "im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity.onCreate.<anonymous>.<anonymous> (BaseOverviewWidgetSettingActivity.kt:53)");
                }
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModelICustomTabsServiceStub = baseOverviewWidgetSettingActivity.ICustomTabsServiceStub();
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseOverviewWidgetSettingActivity);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onNavigationEvent(baseOverviewWidgetSettingActivity, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(tossSecWidgetOverviewSettingViewModelICustomTabsServiceStub, context, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, 0.0f, 1, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    int i8 = onTransact + 39;
                    IAuthTabCallbackStub = i8 % 128;
                    if (i8 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                x4ExternalSyntheticLambda3.onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(!onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? 1 : 0), null, null, null, null, null, 0L, null, ForwardingCameraControl.onExtraCallback(1508544698, true, new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda0(getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 100663296, 254}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1021152828);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        int i9 = IAuthTabCallbackStub + 107;
                        onTransact = i9 % 128;
                        int i10 = i9 % 2;
                        objOnMinimized3 = baseOverviewWidgetSettingActivity.validateRelationship();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    q8ExternalSyntheticLambda3 q8externalsyntheticlambda3 = (q8ExternalSyntheticLambda3) objOnMinimized3;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = Float.valueOf(baseOverviewWidgetSettingActivity.updateVisuals());
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    float fFloatValue = ((Number) objOnMinimized4).floatValue();
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        if (baseOverviewWidgetSettingActivity instanceof OverviewSmallWidgetSettingActivity) {
                            int i11 = IAuthTabCallbackStub + 37;
                            onTransact = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 3 % 5;
                            }
                            f = 0.56f;
                        } else {
                            f = 0.9f;
                        }
                        objOnMinimized5 = Float.valueOf(f);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    }
                    float fFloatValue2 = ((Number) objOnMinimized5).floatValue();
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) TossSecWidgetOverviewSettingViewModel.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{baseOverviewWidgetSettingActivity.ICustomTabsServiceStub()}, -252893336, 252893336), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseOverviewWidgetSettingActivity);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback2) {
                        Object obj = objOnMinimized6;
                        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda3(baseOverviewWidgetSettingActivity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                            obj = externalSyntheticLambda3;
                        }
                        Function1 function1 = (Function1) obj;
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(baseOverviewWidgetSettingActivity.ICustomTabsServiceStub().onExtraCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseOverviewWidgetSettingActivity);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback3) {
                            Object obj2 = objOnMinimized7;
                            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda4(baseOverviewWidgetSettingActivity);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                                obj2 = externalSyntheticLambda4;
                            }
                            rExternalSyntheticLambda0.IAuthTabCallback(q8externalsyntheticlambda3, fFloatValue, fFloatValue2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, function1, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 438);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1020223696);
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized8 = baseOverviewWidgetSettingActivity.ICustomTabsServiceDefault();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                    }
                    String str = (String) objOnMinimized8;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(baseOverviewWidgetSettingActivity.ICustomTabsServiceStub().IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback4 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(baseOverviewWidgetSettingActivity.ICustomTabsServiceStub().onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseOverviewWidgetSettingActivity);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback4) {
                        Object obj3 = objOnMinimized9;
                        if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                            BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda1(baseOverviewWidgetSettingActivity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                            obj3 = externalSyntheticLambda1;
                        }
                        Function1 function12 = (Function1) obj3;
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseOverviewWidgetSettingActivity);
                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback5) {
                            int i13 = IAuthTabCallbackStub + 63;
                            onTransact = i13 % 128;
                            int i14 = i13 % 2;
                            Object obj4 = objOnMinimized10;
                            if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda2(baseOverviewWidgetSettingActivity);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                                obj4 = externalSyntheticLambda2;
                            }
                            r8ExternalSyntheticLambda0.onWarmupCompleted(str, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, function12, (Function1) obj4, cameraCaptureResultEmptyCameraCaptureResult, 6);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), null, ForwardingCameraControl.onExtraCallback(-1426269137, true, new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda5(baseOverviewWidgetSettingActivity, context), cameraCaptureResultEmptyCameraCaptureResult, 54), null, null, null, null, null, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4090);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModelICustomTabsServiceStub2 = baseOverviewWidgetSettingActivity.ICustomTabsServiceStub();
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseOverviewWidgetSettingActivity);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    objOnMinimized = new onNavigationEvent(baseOverviewWidgetSettingActivity, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    isZslDisabledByByUserCaseConfig.onExtraCallback(tossSecWidgetOverviewSettingViewModelICustomTabsServiceStub2, context2, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.access100(), false);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult22.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult22.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult22.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult22.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult22.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult22.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    }
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult3.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback2);
                    Function0 function0IAuthTabCallback22 = onextracallbackwithresult22.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnNavigationEvent2, onextracallbackwithresult22.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult22.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult22.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult22.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult22.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    x4ExternalSyntheticLambda3.onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(!onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? 1 : 0), null, null, null, null, null, 0L, null, ForwardingCameraControl.onExtraCallback(1508544698, true, new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda0(getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 100663296, 254}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                    if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda12.onWarmupCompleted(onextracallback2, onextracallbackwithresult3.onWarmupCompleted()), null, ForwardingCameraControl.onExtraCallback(-1426269137, true, new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda5(baseOverviewWidgetSettingActivity, context2), cameraCaptureResultEmptyCameraCaptureResult, 54), null, null, null, null, null, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4090);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 91;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(971364586, i, -1, "im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity.onCreate.<anonymous> (BaseOverviewWidgetSettingActivity.kt:52)");
                int i8 = onTransact + 39;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
            }
            r0a.onWarmupCompleted(ForwardingCameraControl.onExtraCallback(-1859774820, true, new BaseOverviewWidgetSettingActivity$.ExternalSyntheticLambda11(baseOverviewWidgetSettingActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onTransact + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = IAuthTabCallbackStub + 107;
        onTransact = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, float f) {
        return (Unit) onExtraCallback(-1188325624, 1188325625, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{baseOverviewWidgetSettingActivity, Float.valueOf(f)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(168925510, -168925510, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{baseOverviewWidgetSettingActivity, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        onExtraCallback(-423413082, 423413084, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(BaseOverviewWidgetSettingActivity baseOverviewWidgetSettingActivity, Context context, int i) {
        return (Unit) onExtraCallback(1903205756, -1903205753, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{baseOverviewWidgetSettingActivity, context, Integer.valueOf(i)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    public final AFLogger4 ICustomTabsServiceStubProxy() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (AFLogger4) onExtraCallback(878679573, -878679569, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    @Override // im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
