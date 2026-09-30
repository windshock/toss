package im.toss.tosssecurities.widget.watchlist.setting.product;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.securities.widget.common.ui.BaseWidgetSettingActivity;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import im.toss.tosssecurities.widget.watchlist.setting.product.BaseWidgetProductSelectActivity$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFi1wSDK;
import o.AFj1bSDK;
import o.AFj1dSDK;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5;
import o.AppLovinPostbackService;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ExifSpeedConverter;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.LongPressTextDragObserverKtExternalSyntheticLambda3;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SurfaceProcessorNode;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access13800;
import o.access14100;
import o.addCameraErrorListener;
import o.addFixedPosition;
import o.bindChildren;
import o.component5;
import o.createCameraCaptureCallback;
import o.delete;
import o.findResAndMsg;
import o.getAwbState;
import o.getBacktraceNote;
import o.getHighestSurfacePriority;
import o.getHumanReadableName;
import o.getParentMetadataCallback;
import o.getSubtitle;
import o.getSurfaceSize;
import o.hasMoreElements;
import o.hasProvider;
import o.hasVaryAll;
import o.intersect;
import o.isRepeatingEnabled;
import o.isZslDisabledByByUserCaseConfig;
import o.oExternalSyntheticLambda0;
import o.oExternalSyntheticLambda1;
import o.onLoadStarted;
import o.q8ExternalSyntheticLambda4;
import o.r0a;
import o.requestClose;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.setRubIn;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u4;
import o.u_;
import o.use;
import o.x2ExternalSyntheticLambda24;
import o.x2ExternalSyntheticLambda25;
import o.x2ExternalSyntheticLambda28;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda6;
import o.y1a;
import o.y3ExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class BaseWidgetProductSelectActivity extends Hilt_BaseWidgetProductSelectActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static char[] asBinder = null;
    private static int getInterfaceDescriptor = 1;
    public static final int onTransact;

    static {
        IEngagementSignalsCallback();
        onTransact = BaseWidgetSettingActivity.asInterface;
        int i = access000 + 69;
        access100 = i % 128;
        if (i % 2 == 0) {
            int i2 = 35 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        WidgetProductSelectViewModel widgetProductSelectViewModel = (WidgetProductSelectViewModel) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(widgetProductSelectViewModel, cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i, baseWidgetProductSelectActivity, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, WidgetProductSelectViewModel widgetProductSelectViewModel, int i, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(baseWidgetProductSelectActivity, widgetProductSelectViewModel, i, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 35 / 0;
        }
        int i7 = IAuthTabCallbackStub + 33;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ int onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return iIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        BaseWidgetProductSelectActivity baseWidgetProductSelectActivity = (BaseWidgetProductSelectActivity) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(iIntValue, baseWidgetProductSelectActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = IAuthTabCallbackStub + 61;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 57;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(str, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 29;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~((~i4) | i8);
        int i10 = i4 | i8;
        int i11 = i6 + i + i3 + ((-189913888) * i5) + ((-1809372279) * i2);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i6) - 1671495680) + (10634006 * i) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i3) + (952107008 * i5) + (1092222976 * i2) + ((-70844416) * i12);
        int i14 = (i6 * 986545540) + 223666697 + (i * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i3 * 986544659) + (i5 * 1843362976) + (i2 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        return i15 != 1 ? i15 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BaseWidgetProductSelectActivity baseWidgetProductSelectActivity = (BaseWidgetProductSelectActivity) objArr[0];
        WidgetProductSelectViewModel widgetProductSelectViewModel = (WidgetProductSelectViewModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(baseWidgetProductSelectActivity, widgetProductSelectViewModel, iIntValue);
        int i4 = getInterfaceDescriptor + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return unitIAuthTabCallback;
    }

    public abstract int ICustomTabsServiceDefault();

    public abstract q8ExternalSyntheticLambda4 updateVisuals();

    /* JADX WARN: Multi-variable type inference failed */
    public final long ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            getIntent().getLongExtra("watchlist_id_", -1L);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long longExtra = getIntent().getLongExtra("watchlist_id_", -1L);
        int i3 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return longExtra;
    }

    public String validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tosssecurities.widget.watchlist.setting.product.Hilt_BaseWidgetProductSelectActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        int iIAuthTabCallback = IAuthTabCallback();
        getIntent().putExtra("max_product_size", ICustomTabsServiceDefault());
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1097142708, true, new BaseWidgetProductSelectActivity$.ExternalSyntheticLambda5(iIAuthTabCallback, this))), 1, (Object) null);
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i5 = IAuthTabCallbackStub + 55;
                getInterfaceDescriptor = i5 % 128;
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
            int i7 = getInterfaceDescriptor + 5;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = IAuthTabCallbackStub + 27;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i11 = getInterfaceDescriptor + 81;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-66663578, i2, -1, "im.toss.tosssecurities.widget.watchlist.setting.product.BaseWidgetProductSelectActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseWidgetProductSelectActivity.kt:130)");
                    int i12 = 1 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-66663578, i2, -1, "im.toss.tosssecurities.widget.watchlist.setting.product.BaseWidgetProductSelectActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseWidgetProductSelectActivity.kt:130)");
                }
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, str, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 15) & 458752), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IAuthTabCallbackStub + 55;
                getInterfaceDescriptor = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final int IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int size = ((Set) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).size();
        int i4 = getInterfaceDescriptor + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    private static final Unit onExtraCallback(WidgetProductSelectViewModel widgetProductSelectViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        if (!(!onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6))) {
            int i2 = IAuthTabCallbackStub + 17;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            widgetProductSelectViewModel.asInterface();
        } else {
            widgetProductSelectViewModel.onTransact();
            int i4 = getInterfaceDescriptor + 41;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ WidgetProductSelectViewModel $viewModel;
        int label;
        final /* synthetic */ BaseWidgetProductSelectActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(WidgetProductSelectViewModel widgetProductSelectViewModel, BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, int i, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$viewModel = widgetProductSelectViewModel;
            this.this$0 = baseWidgetProductSelectActivity;
            this.$appWidgetId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$viewModel, this.this$0, this.$appWidgetId, access13800Var);
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallback.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallback.invokeSuspend(unit);
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 77;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                WidgetProductSelectViewModel widgetProductSelectViewModel = this.$viewModel;
                this.label = 1;
                obj = widgetProductSelectViewModel.onNavigationEvent(this);
                if (obj == objOnExtraCallback) {
                    int i5 = IAuthTabCallback + 25;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnExtraCallback;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                BaseWidgetSettingActivity baseWidgetSettingActivity = this.this$0;
                Intent intent = new Intent();
                intent.putExtra("appWidgetId", this.$appWidgetId);
                Unit unit = Unit.INSTANCE;
                baseWidgetSettingActivity.setResult(-1, intent);
                this.this$0.finish();
                int i7 = IAuthTabCallback + 69;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 / 5;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, WidgetProductSelectViewModel widgetProductSelectViewModel, int i) {
        int i2 = 2 % 2;
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseWidgetProductSelectActivity), null, null, new onExtraCallback(widgetProductSelectViewModel, baseWidgetProductSelectActivity, i, null), 3, null);
        Unit unit = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, WidgetProductSelectViewModel widgetProductSelectViewModel, int i, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        int i5 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(972803385, i3, -1, "im.toss.tosssecurities.widget.watchlist.setting.product.BaseWidgetProductSelectActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseWidgetProductSelectActivity.kt:227)");
            }
            boolean zOnWarmupCompleted = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseWidgetProductSelectActivity);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(widgetProductSelectViewModel);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    BaseWidgetProductSelectActivity$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new BaseWidgetProductSelectActivity$.ExternalSyntheticLambda6(baseWidgetProductSelectActivity, widgetProductSelectViewModel, i);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                    obj = externalSyntheticLambda6;
                }
                Object[] objArr = new Object[1];
                a(new char[]{2, 3}, (byte) (66 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2, objArr);
                u4Var.onNavigationEvent(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, !zOnWarmupCompleted, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i3 & 14, 758);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = IAuthTabCallbackStub + 113;
                    getInterfaceDescriptor = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0358  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(int i, BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int iICustomTabsServiceDefault;
        Integer numValueOf;
        String strValidateRelationship;
        getBacktraceNote getbacktracenoteIAuthTabCallback;
        WidgetProductSelectViewModel widgetProductSelectViewModel;
        boolean z;
        WidgetProductSelectViewModel widgetProductSelectViewModel2;
        Object obj;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jLongValue;
        hasProvider.IAuthTabCallback iAuthTabCallback;
        int iOnNavigationEvent;
        boolean zOnNavigationEvent;
        boolean zOnExtraCallback;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((i2 & 6) != 0) {
            i3 = i2;
        } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0)) {
            int i5 = IAuthTabCallbackStub + 101;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2 == 0 ? 2 : 4;
            i3 = i2 | i6;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-858209818, i3, -1, "im.toss.tosssecurities.widget.watchlist.setting.product.BaseWidgetProductSelectActivity.onCreate.<anonymous>.<anonymous> (BaseWidgetProductSelectActivity.kt:71)");
            }
            View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
            cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(1890788296);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onWarmupCompleted);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = LongPressTextDragObserverKtExternalSyntheticLambda3.IAuthTabCallback(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(1729797275);
            ViewModel viewModelIAuthTabCallback = DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.IAuthTabCallback(WidgetProductSelectViewModel.class, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, onwarmupcompletedIAuthTabCallback, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 36936, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
            WidgetProductSelectViewModel widgetProductSelectViewModel3 = (WidgetProductSelectViewModel) viewModelIAuthTabCallback;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(widgetProductSelectViewModel3);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseWidgetProductSelectActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!(zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallbackWithResult(widgetProductSelectViewModel3, view, baseWidgetProductSelectActivity, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(widgetProductSelectViewModel3, Integer.valueOf(i), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = IAuthTabCallbackStub + 23;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback((Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(widgetProductSelectViewModel3);
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(activityIAuthTabCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback5 | zOnExtraCallback6) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new IAuthTabCallback(widgetProductSelectViewModel3, activityIAuthTabCallback, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                int i9 = IAuthTabCallbackStub + 35;
                getInterfaceDescriptor = i9 % 128;
                int i10 = i9 % 2;
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(widgetProductSelectViewModel3, activityIAuthTabCallback, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            List list = (List) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(widgetProductSelectViewModel3.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7).onExtraCallbackWithResult();
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(widgetProductSelectViewModel3.onWarmupCompleted(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport02);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i11 = getInterfaceDescriptor + 59;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                int i12 = IAuthTabCallbackStub + 99;
                getInterfaceDescriptor = i12 % 128;
                int i13 = i12 % 2;
                objOnMinimized3 = Boolean.valueOf(baseWidgetProductSelectActivity.ICustomTabsServiceStub() == -1);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            boolean zBooleanValue = ((Boolean) objOnMinimized3).booleanValue();
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent2 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                if (baseWidgetProductSelectActivity.updateVisuals() == q8ExternalSyntheticLambda4.small) {
                    strValidateRelationship = baseWidgetProductSelectActivity.validateRelationship();
                } else {
                    String str = zBooleanValue ? "지수" : "종목";
                    if (!zBooleanValue) {
                        iICustomTabsServiceDefault = baseWidgetProductSelectActivity.ICustomTabsServiceDefault();
                    } else if (list != null) {
                        iICustomTabsServiceDefault = list.size();
                    } else {
                        numValueOf = null;
                        if (numValueOf != null) {
                            strValidateRelationship = "위젯에 노출할 " + str + u_.f7_.invoke(str) + " 선택해주세요";
                        } else {
                            strValidateRelationship = "위젯에 노출할 " + str + " 최대 " + numValueOf + "개를 선택해주세요";
                        }
                    }
                    numValueOf = Integer.valueOf(iICustomTabsServiceDefault);
                    if (numValueOf != null) {
                    }
                }
                objOnMinimized4 = strValidateRelationship;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            String str2 = (String) objOnMinimized4;
            y1ExternalSyntheticLambda0.onExtraCallbackWithResult onExtraCallbackWithResult = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
            if (zBooleanValue) {
                int i14 = getInterfaceDescriptor + 123;
                IAuthTabCallbackStub = i14 % 128;
                int i15 = i14 % 2;
                getbacktracenoteIAuthTabCallback = null;
            } else {
                getbacktracenoteIAuthTabCallback = AFi1wSDK.onExtraCallbackWithResult.IAuthTabCallback();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-66663578, true, new BaseWidgetProductSelectActivity$.ExternalSyntheticLambda0(str2), cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, getbacktracenoteIAuthTabCallback, onExtraCallbackWithResult, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 0, 16286);
            if (baseWidgetProductSelectActivity.updateVisuals() == q8ExternalSyntheticLambda4.medium) {
                int i16 = getInterfaceDescriptor + 47;
                IAuthTabCallbackStub = i16 % 128;
                int i17 = i16 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(84158371);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(widgetProductSelectViewModel3.onWarmupCompleted(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!zOnNavigationEvent3)) {
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new BaseWidgetProductSelectActivity$.ExternalSyntheticLambda1(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                    obj = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) obj;
                    cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) WidgetProductSelectViewModel.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1694380375, -1694380374, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{widgetProductSelectViewModel3}, TTVideoLandingPageActivity.onExtraCallbackWithResult()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f));
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 48);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted3);
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    String str3 = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6) + "/" + baseWidgetProductSelectActivity.ICustomTabsServiceDefault();
                    AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
                    y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1044457329);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -523958350, OverseasRrnInputTextField.IAuthTabCallback(), 523958365)).longValue();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1044458513);
                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).newAuthTabSession();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport03;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str3, null, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131058}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport03, 1.0f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                    iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65531, (DefaultConstructorMarker) null));
                    try {
                        iAuthTabCallback.IAuthTabCallback(!onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) ? "전체 해제" : "최대로 선택");
                        Unit unit = Unit.INSTANCE;
                        iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                        hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                        getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel2 = appLovinPostbackService.IAuthTabCallback_Parcel();
                        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = !onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) ? oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent() : oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback();
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(widgetProductSelectViewModel3);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent | zOnExtraCallback) {
                            int i18 = IAuthTabCallbackStub + 105;
                            getInterfaceDescriptor = i18 % 128;
                            int i19 = i18 % 2;
                            Object obj2 = objOnMinimized6;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                BaseWidgetProductSelectActivity$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new BaseWidgetProductSelectActivity$.ExternalSyntheticLambda2(widgetProductSelectViewModel3, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                                obj2 = externalSyntheticLambda2;
                            }
                            widgetProductSelectViewModel = widgetProductSelectViewModel3;
                            oExternalSyntheticLambda1.onWarmupCompleted(hasproviderOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, 0L, onextracallbackwithresultOnNavigationEvent, (oExternalSyntheticLambda0.IAuthTabCallback) null, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, gethumanreadablenameIAuthTabCallback_Parcel2, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0) obj2, (Role) null, (Function1) null, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 245494);
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    } catch (Throwable th) {
                        iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                        throw th;
                    }
                } else {
                    obj = objOnMinimized5;
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    }
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) obj;
                    cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) WidgetProductSelectViewModel.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1694380375, -1694380374, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{widgetProductSelectViewModel3}, TTVideoLandingPageActivity.onExtraCallbackWithResult()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f));
                    component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 48);
                    int iHashCode32 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted42 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted32);
                    Function0 function0IAuthTabCallback32 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, component5VarOnExtraCallback2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, Integer.valueOf(iHashCode32), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, quirksExternalSyntheticBackport0OnWarmupCompleted42, onextracallbackwithresult2.onTransact());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
                    String str32 = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62) + "/" + baseWidgetProductSelectActivity.ICustomTabsServiceDefault();
                    AppLovinPostbackService appLovinPostbackService2 = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel3 = appLovinPostbackService2.IAuthTabCallback_Parcel();
                    y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport03;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str32, null, gethumanreadablenameIAuthTabCallback_Parcel3, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131058}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(RowScope.onNavigationEvent(rowScopeInstance2, quirksExternalSyntheticBackport03, 1.0f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                    iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65531, (DefaultConstructorMarker) null));
                    iAuthTabCallback.IAuthTabCallback(!onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) ? "전체 해제" : "최대로 선택");
                    Unit unit2 = Unit.INSTANCE;
                    iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                    hasProvider hasproviderOnExtraCallbackWithResult2 = iAuthTabCallback.onExtraCallbackWithResult();
                    getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel22 = appLovinPostbackService2.IAuthTabCallback_Parcel();
                    oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = !onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) ? oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent() : oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback();
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(widgetProductSelectViewModel3);
                    Object objOnMinimized62 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent | zOnExtraCallback) {
                    }
                }
            } else {
                widgetProductSelectViewModel = widgetProductSelectViewModel3;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(86953920);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            int i20 = IAuthTabCallbackStub + 47;
            getInterfaceDescriptor = i20 % 128;
            int i21 = i20 % 2;
            if (list == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(87013440);
                z = true;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                x2ExternalSyntheticLambda24.onExtraCallback(x2ExternalSyntheticLambda25.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback, (QuirksExternalSyntheticBackport0) null, (x2ExternalSyntheticLambda28) null, (x2ExternalSyntheticLambda25.onExtraCallback) null, 0L, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 62);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                widgetProductSelectViewModel2 = widgetProductSelectViewModel;
            } else {
                z = true;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(87321022);
                List list2 = list;
                if (list2.isEmpty()) {
                    widgetProductSelectViewModel2 = widgetProductSelectViewModel;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(87985228);
                    AFj1bSDK.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(87375086);
                    int size = list2.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 >= size) {
                            widgetProductSelectViewModel2 = widgetProductSelectViewModel;
                            int i23 = IAuthTabCallbackStub + 85;
                            getInterfaceDescriptor = i23 % 128;
                            if (i23 % 2 == 0) {
                                int i24 = 4 % 5;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(87502372);
                            AFj1bSDK.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            if (!intersect.IAuthTabCallback(((WidgetWatchlists.WatchList.Item) list.get(i22)).IAuthTabCallback())) {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(87607679);
                                widgetProductSelectViewModel2 = widgetProductSelectViewModel;
                                AFj1dSDK.onExtraCallback(widgetProductSelectViewModel2, list, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                break;
                            }
                            i22++;
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, QuirkSettingsLoader.Companion.onWarmupCompleted()), (u2) null, ForwardingCameraControl.onExtraCallback(972803385, z, new BaseWidgetProductSelectActivity$.ExternalSyntheticLambda3(baseWidgetProductSelectActivity, widgetProductSelectViewModel2, i, AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(widgetProductSelectViewModel2.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7)), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4090);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(int i, BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = getInterfaceDescriptor + 17;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1097142708, i2, -1, "im.toss.tosssecurities.widget.watchlist.setting.product.BaseWidgetProductSelectActivity.onCreate.<anonymous> (BaseWidgetProductSelectActivity.kt:70)");
                    int i5 = 51 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1097142708, i2, -1, "im.toss.tosssecurities.widget.watchlist.setting.product.BaseWidgetProductSelectActivity.onCreate.<anonymous> (BaseWidgetProductSelectActivity.kt:70)");
                }
            }
            r0a.onWarmupCompleted(ForwardingCameraControl.onExtraCallback(-858209818, true, new BaseWidgetProductSelectActivity$.ExternalSyntheticLambda4(i, baseWidgetProductSelectActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = getInterfaceDescriptor + 31;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = IAuthTabCallbackStub + 125;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final int onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Integer> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            number.intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = number.intValue();
        int i4 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return iIntValue;
    }

    private static final boolean onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return zBooleanValue;
    }

    private static final boolean onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return zBooleanValue;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = asBinder;
        float f = 0.0f;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $11 + 5;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23140 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i3 = 2;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 26 - ExpandableListView.getPackedPositionGroup(0L), 23138 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $10 + 9;
            int i11 = i10 % 128;
            $11 = i11;
            if (i10 % 2 == 0) {
                i2 = i + 111;
                cArr4[i2] = (char) (cArr[i2] >> b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
            int i12 = i11 + 85;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16752392) - Color.rgb(0, 0, 0)), 74 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 8087 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i15 = $10 + 45;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        } else {
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                j = 0;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), baseWidgetProductSelectActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(472287681, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), -472287679);
    }

    public static /* synthetic */ Unit onExtraCallback(BaseWidgetProductSelectActivity baseWidgetProductSelectActivity, WidgetProductSelectViewModel widgetProductSelectViewModel, int i) {
        Object[] objArr = {baseWidgetProductSelectActivity, widgetProductSelectViewModel, Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(-823304215, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 823304216);
    }

    public static /* synthetic */ Unit IAuthTabCallback(WidgetProductSelectViewModel widgetProductSelectViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(1370584458, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{widgetProductSelectViewModel, cameraPresenceProviderExternalSyntheticLambda6}, iIAuthTabCallback, iIAuthTabCallback3, -1370584458);
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.product.Hilt_BaseWidgetProductSelectActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.product.Hilt_BaseWidgetProductSelectActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 53;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.product.Hilt_BaseWidgetProductSelectActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.product.Hilt_BaseWidgetProductSelectActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IEngagementSignalsCallback() {
        asBinder = new char[]{51243, 51240, 15051, 11238};
        IAuthTabCallbackDefault = (char) 51243;
    }
}
