package im.toss.tosssecurities.widget.watchlist.setting.watchlist;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.securities.widget.common.ui.BaseWidgetSettingActivity;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity$;
import im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity$onCreate$1$1$2$2$2$1$1$;
import im.toss.tosssecurities.widget.watchlist.small.setting.SmallWidgetWatchlistSelectActivity;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AFj1gSDK;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
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
import o.GraphicDeviceInfo;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o._string;
import o.access13800;
import o.access14100;
import o.component5;
import o.findResAndMsg;
import o.getAwbState;
import o.getBacktraceNote;
import o.getSubtitle;
import o.getSupportedHighSpeedResolutionsFor;
import o.isZslDisabledByByUserCaseConfig;
import o.onLoadStarted;
import o.onSessionEnded;
import o.q8ExternalSyntheticLambda3;
import o.r0a;
import o.rExternalSyntheticLambda0;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u4;
import o.x4ExternalSyntheticLambda3;
import o.x4ExternalSyntheticLambda4;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class BaseWidgetWatchlistSelectActivity extends BaseWidgetSettingActivity {
    private static final byte[] $$a = {48, -22, 122, 126};
    private static final int $$b = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int access000 = 1;
    private static int onTransact = 478309049;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackStub = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new onSessionEnded() { // from class: im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity$$ExternalSyntheticLambda6
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            BaseWidgetWatchlistSelectActivity.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            int i4 = onWarmupCompleted + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 67 / 0;
            }
        }
    });
    private final Lazy IAuthTabCallbackDefault = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(WidgetWatchlistSelectViewModel.class), new onExtraCallbackWithResult(this), new IAuthTabCallback(this), new onWarmupCompleted(null, this));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2;
        int i3;
        int i4 = 4 - (b * 3);
        int i5 = 1 - (b2 * 4);
        byte[] bArr = $$a;
        int i6 = (s * 3) + 105;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i2 = i4;
            int i7 = i5;
            i3 = 0;
            i4 += -i7;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i2];
            i4 += -i7;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i2 = i4;
            i4 = i6;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity = (BaseWidgetWatchlistSelectActivity) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 15;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(getsupportedhighspeedresolutionsfor, baseWidgetWatchlistSelectActivity);
        }
        onExtraCallback(getsupportedhighspeedresolutionsfor, baseWidgetWatchlistSelectActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, DisplaySetting displaySetting) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {baseWidgetWatchlistSelectActivity, displaySetting};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -408421713, _string.onNavigationEvent.IAuthTabCallback(), 408421715, iIAuthTabCallback, objArr);
        int i4 = access000 + 27;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i3));
        int i11 = (~(i6 | i3)) | (~((~i3) | i7 | i9));
        int i12 = i7 | i3 | i9;
        int i13 = i3 + i5 + i2 + (1362283521 * i4) + ((-853422242) * i);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i3) - 1228931072) + ((-782767794) * i5) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i2 * 465567744) + (465567744 * i4) + (1887436800 * i) + ((-1154482176) * i14);
        int i16 = ((i3 * 722868660) - 41817558) + (i5 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i2 * 722869185) + (i4 * 1172694977) + (i * (-747618338)) + (i14 * 791674880);
        switch (i15 + (i16 * i16 * 751828992)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity = (BaseWidgetWatchlistSelectActivity) objArr[0];
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i17 = 2 % 2;
                int i18 = access000 + 71;
                asBinder = i18 % 128;
                int i19 = i18 % 2;
                Object[] objArr2 = {baseWidgetWatchlistSelectActivity, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
                Unit unit = (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -22591011, _string.onNavigationEvent.IAuthTabCallback(), 22591011, _string.onNavigationEvent.IAuthTabCallback(), objArr2);
                int i20 = access000 + 11;
                asBinder = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(baseWidgetWatchlistSelectActivity);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(baseWidgetWatchlistSelectActivity);
        int i3 = access000 + 35;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, long j) {
        int i = 2 % 2;
        int i2 = access000 + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(baseWidgetWatchlistSelectActivity, j);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 49;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(baseWidgetWatchlistSelectActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(baseWidgetWatchlistSelectActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 5;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {baseWidgetWatchlistSelectActivity, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1485555166, _string.onNavigationEvent.IAuthTabCallback(), -1485555161, iIAuthTabCallback, objArr);
        int i5 = access000 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback4, iIAuthTabCallback2, -1544653352, iIAuthTabCallback3, 1544653358, iIAuthTabCallback, objArr);
        int i4 = asBinder + 95;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 63;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 99;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(baseWidgetWatchlistSelectActivity, iEngagementSignalsCallbackDefault);
        int i4 = access000 + 119;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, long j) {
        int i = 2 % 2;
        int i2 = access000 + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(baseWidgetWatchlistSelectActivity, j);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        int i5 = asBinder + 33;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = access000 + Imgproc.COLOR_YUV2RGBA_YVYU;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(getsupportedhighspeedresolutionsfor);
        }
        IAuthTabCallback(getsupportedhighspeedresolutionsfor);
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62) {
        int i = 2 % 2;
        int i2 = access000 + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda62);
        int i4 = asBinder + 1;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(baseWidgetWatchlistSelectActivity, f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(baseWidgetWatchlistSelectActivity, f);
        int i3 = access000 + 7;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(baseWidgetWatchlistSelectActivity, cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = access000 + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = asBinder + 105;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return zIAuthTabCallback;
    }

    public abstract Intent IAuthTabCallback(long j);

    public abstract q8ExternalSyntheticLambda3 ICustomTabsServiceDefault();

    public abstract void ICustomTabsServiceStub();

    public abstract float validateRelationship();

    public static final /* synthetic */ WidgetWatchlistSelectViewModel IAuthTabCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity) {
        int i = 2 % 2;
        int i2 = access000 + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModelUpdateVisuals = baseWidgetWatchlistSelectActivity.updateVisuals();
        int i4 = access000 + 73;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return widgetWatchlistSelectViewModelUpdateVisuals;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onNavigationEvent(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = baseWidgetWatchlistSelectActivity.IAuthTabCallbackStub;
        int i5 = i3 + 79;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return iEngagementSignalsCallback_Parcel;
    }

    private static final void IAuthTabCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = asBinder + 73;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            baseWidgetWatchlistSelectActivity.access200();
            int i4 = asBinder + 63;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = access000 + 89;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private final WidgetWatchlistSelectViewModel updateVisuals() {
        WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel;
        int i = 2 % 2;
        int i2 = access000 + 57;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) this.IAuthTabCallbackDefault.getValue();
            int i3 = 11 / 0;
        } else {
            widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) this.IAuthTabCallbackDefault.getValue();
        }
        int i4 = access000 + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return widgetWatchlistSelectViewModel;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (!onNavigationEvent()) {
            requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1452628850, true, new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda11(this))), 1, (Object) null);
            return;
        }
        int i4 = access000 + 115;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
    }

    public static final class IAuthTabCallback implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public IAuthTabCallback(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ ViewModelProvider.onWarmupCompleted invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return onwarmupcompletedOnExtraCallbackWithResult;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                defaultViewModelProviderFactory = this.onNavigationEvent.getDefaultViewModelProviderFactory();
                int i3 = 52 / 0;
            } else {
                defaultViewModelProviderFactory = this.onNavigationEvent.getDefaultViewModelProviderFactory();
            }
            int i4 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return defaultViewModelProviderFactory;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity onExtraCallback;

        public onExtraCallbackWithResult(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 IAuthTabCallback() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                viewModelStore = this.onExtraCallback.getViewModelStore();
                int i3 = 74 / 0;
            } else {
                viewModelStore = this.onExtraCallback.getViewModelStore();
            }
            int i4 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity onExtraCallback;
        final /* synthetic */ Function0 onNavigationEvent;

        public onWarmupCompleted(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.onExtraCallback = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Function0 function0 = this.onNavigationEvent;
            if (function0 != null) {
                int i5 = i2 + 59;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (i6 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            return this.onExtraCallback.getDefaultViewModelCreationExtras();
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.TRUE);
        if (i3 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x4externalsyntheticlambda4) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = asBinder + 109;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = access000 + 23;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(78961474, i2, -1, "im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseWidgetWatchlistSelectActivity.kt:78)");
                int i8 = access000 + Imgproc.COLOR_YUV2RGBA_YVYU;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
            }
            boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda7(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            int i10 = (i2 << 9) & 7168;
            x4externalsyntheticlambda4.onExtraCallback("그룹 선택", zBooleanValue, (Function0) objOnMinimized, (QuirksExternalSyntheticBackport0) null, false, false, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (getBacktraceNote) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, i10, 8184);
            boolean zBooleanValue2 = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda8(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            x4externalsyntheticlambda4.onExtraCallback("배경 설정", !zBooleanValue2, (Function0) objOnMinimized2, (QuirksExternalSyntheticBackport0) null, false, false, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (getBacktraceNote) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, i10, 8184);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = access000 + 55;
        asBinder = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, long j) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 91;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            baseWidgetWatchlistSelectActivity.IAuthTabCallbackStub.onNavigationEvent(baseWidgetWatchlistSelectActivity.IAuthTabCallback(j));
            unit = Unit.INSTANCE;
            int i3 = 0 / 0;
        } else {
            baseWidgetWatchlistSelectActivity.IAuthTabCallbackStub.onNavigationEvent(baseWidgetWatchlistSelectActivity.IAuthTabCallback(j));
            unit = Unit.INSTANCE;
        }
        int i4 = asBinder + 13;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, long j) {
        int i = 2 % 2;
        Object[] objArr = {baseWidgetWatchlistSelectActivity.updateVisuals(), Long.valueOf(j), false, new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda10(baseWidgetWatchlistSelectActivity, j), 2, null};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        WidgetWatchlistSelectViewModel.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 744568176, objArr, -744568175, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity = (BaseWidgetWatchlistSelectActivity) objArr[0];
        DisplaySetting displaySetting = (DisplaySetting) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(displaySetting, "");
        baseWidgetWatchlistSelectActivity.updateVisuals().onWarmupCompleted(displaySetting);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 87;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        baseWidgetWatchlistSelectActivity.updateVisuals().onExtraCallbackWithResult(f);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 35;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62) {
        int i = 2 % 2;
        int i2 = access000 + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue()) {
            return false;
        }
        int i4 = access000 + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if (((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue()) {
            int i6 = access000 + 15;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            if (!((Boolean) cameraPresenceProviderExternalSyntheticLambda62.onExtraCallbackWithResult()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 13;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (Process.myPid() >> 22)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, 10277 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12842), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, 2167 - Drawable.resolveOpacity(0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i9 = $11 + 119;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0) + 12844), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c) + 56, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                    c = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue() || ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue()) {
            return false;
        }
        int i4 = asBinder + 55;
        access000 = i4 % 128;
        return i4 % 2 != 0;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity) {
        int i = 2 % 2;
        if (((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue()) {
            int i2 = asBinder + 63;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {baseWidgetWatchlistSelectActivity.updateVisuals()};
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                WidgetWatchlistSelectViewModel.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -784260812, objArr, 784260812, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i3 = 53 / 0;
            } else {
                Object[] objArr2 = {baseWidgetWatchlistSelectActivity.updateVisuals()};
                int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                WidgetWatchlistSelectViewModel.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -784260812, objArr2, 784260812, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
            int i4 = asBinder + 15;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onNavigationEvent(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, Long l) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(baseWidgetWatchlistSelectActivity, l);
            if (i3 == 0) {
                int i4 = 63 / 0;
            }
            int i5 = IAuthTabCallback + 53;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = BaseWidgetWatchlistSelectActivity.this.new onNavigationEvent(access13800Var);
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i4 = onNavigationEvent + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        private static final Unit onExtraCallbackWithResult(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, Long l) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BaseWidgetWatchlistSelectActivity.onNavigationEvent(baseWidgetWatchlistSelectActivity).onNavigationEvent(baseWidgetWatchlistSelectActivity.IAuthTabCallback(l.longValue()));
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                access14100.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModelIAuthTabCallback = BaseWidgetWatchlistSelectActivity.IAuthTabCallback(BaseWidgetWatchlistSelectActivity.this);
                this.label = 1;
                obj = widgetWatchlistSelectViewModelIAuthTabCallback.onExtraCallback(this);
                if (obj == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onNavigationEvent + 75;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            Long l = (Long) obj;
            if (l != null) {
                BaseWidgetWatchlistSelectActivity.IAuthTabCallback(BaseWidgetWatchlistSelectActivity.this).onExtraCallbackWithResult((Function0<Unit>) new BaseWidgetWatchlistSelectActivity$onCreate$1$1$2$2$2$1$1$.ExternalSyntheticLambda0(BaseWidgetWatchlistSelectActivity.this, l));
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        baseWidgetWatchlistSelectActivity.access200();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 95;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = access000 + 119;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            if (onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6)) {
                onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseWidgetWatchlistSelectActivity), null, null, baseWidgetWatchlistSelectActivity.new onNavigationEvent(null), 3, null);
                int i3 = asBinder + 1;
                access000 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                baseWidgetWatchlistSelectActivity.updateVisuals().onExtraCallbackWithResult((Function0<Unit>) new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda0(baseWidgetWatchlistSelectActivity));
                int i5 = access000 + 79;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
        onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        boolean z;
        int i;
        String strIntern;
        Object obj;
        BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity = (BaseWidgetWatchlistSelectActivity) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        u4 u4Var = (u4) objArr[3];
        int i2 = 4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i3 = 2 % 2;
        int i4 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i6 = asBinder + 61;
                access000 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                i2 = 2;
            }
            iIntValue |= i2;
        }
        int i8 = iIntValue;
        if ((i8 & 19) != 18) {
            int i9 = access000 + Imgproc.COLOR_YUV2RGBA_YVYU;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i8 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = asBinder + 13;
                access000 = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1349476553, i8, -1, "im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseWidgetWatchlistSelectActivity.kt:121)");
                    int i12 = 35 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1349476553, i8, -1, "im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseWidgetWatchlistSelectActivity.kt:121)");
                }
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(baseWidgetWatchlistSelectActivity.updateVisuals().onWarmupCompleted(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(baseWidgetWatchlistSelectActivity.updateVisuals().asInterface(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda12(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent3 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda13(getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2;
            if (onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda63)) {
                strIntern = "종목 선택하기";
            } else {
                Object[] objArr2 = new Object[1];
                a(View.getDefaultSize(0, 0) + 2, (ViewConfiguration.getTapTimeout() >> 16) + 2, new char[]{63634, 1903}, true, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 53111, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            boolean zBooleanValue = ((Boolean) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 375571527, _string.onNavigationEvent.IAuthTabCallback(), -375571523, iIAuthTabCallback, new Object[]{cameraPresenceProviderExternalSyntheticLambda62})).booleanValue();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseWidgetWatchlistSelectActivity);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj2 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda14(getsupportedhighspeedresolutionsfor, baseWidgetWatchlistSelectActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                    obj2 = externalSyntheticLambda14;
                }
                Function0 function0 = (Function0) obj2;
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda63);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseWidgetWatchlistSelectActivity);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent4 || zOnExtraCallback2) {
                    BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda15(baseWidgetWatchlistSelectActivity, cameraPresenceProviderExternalSyntheticLambda63);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda15);
                    obj = externalSyntheticLambda15;
                    u4Var.onNavigationEvent(strIntern, (QuirksExternalSyntheticBackport0) null, function0, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, zBooleanValue, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i8 & 14, 754);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    i = 2;
                } else {
                    int i13 = asBinder + 119;
                    access000 = i13 % 128;
                    int i14 = i13 % 2;
                    obj = objOnMinimized4;
                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    u4Var.onNavigationEvent(strIntern, (QuirksExternalSyntheticBackport0) null, function0, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, zBooleanValue, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i8 & 14, 754);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    i = 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i15 = asBinder + 11;
            access000 = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i17 = asBinder + 67;
        access000 = i17 % 128;
        int i18 = i17 % i;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity = (BaseWidgetWatchlistSelectActivity) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((iIntValue & 19) == 18), iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i2 = access000 + 125;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-579035612, iIntValue, -1, "im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity.onCreate.<anonymous>.<anonymous> (BaseWidgetWatchlistSelectActivity.kt:53)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-579035612, iIntValue, -1, "im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity.onCreate.<anonymous>.<anonymous> (BaseWidgetWatchlistSelectActivity.kt:53)");
            }
            View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModelUpdateVisuals = baseWidgetWatchlistSelectActivity.updateVisuals();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseWidgetWatchlistSelectActivity);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2)) {
                int i3 = access000 + 99;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onExtraCallback(baseWidgetWatchlistSelectActivity, view, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(widgetWatchlistSelectViewModelUpdateVisuals, view, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
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
                    int i5 = access000 + 105;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
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
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
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
                x4ExternalSyntheticLambda3.onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(!((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue() ? 1 : 0), null, null, null, null, null, 0L, null, ForwardingCameraControl.onExtraCallback(78961474, true, new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda1(getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 100663296, 254}, -1567613975, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1567613981, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                if (((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue()) {
                    int i7 = asBinder + 61;
                    access000 = i7 % 128;
                    int i8 = i7 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1994578703);
                    WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModelUpdateVisuals2 = baseWidgetWatchlistSelectActivity.updateVisuals();
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseWidgetWatchlistSelectActivity);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback3 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda2(baseWidgetWatchlistSelectActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    AFj1gSDK.onExtraCallback(widgetWatchlistSelectViewModelUpdateVisuals2, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1994211756);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        int i9 = access000 + 15;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        objOnMinimized4 = baseWidgetWatchlistSelectActivity.ICustomTabsServiceDefault();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    q8ExternalSyntheticLambda3 q8externalsyntheticlambda3 = (q8ExternalSyntheticLambda3) objOnMinimized4;
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = Float.valueOf(baseWidgetWatchlistSelectActivity.validateRelationship());
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    }
                    float fFloatValue = ((Number) objOnMinimized5).floatValue();
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized6 = Float.valueOf(baseWidgetWatchlistSelectActivity instanceof SmallWidgetWatchlistSelectActivity ? 0.55f : 0.9f);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                    }
                    float fFloatValue2 = ((Number) objOnMinimized6).floatValue();
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(baseWidgetWatchlistSelectActivity.updateVisuals().IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseWidgetWatchlistSelectActivity);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback4) {
                        Object obj2 = objOnMinimized7;
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda3(baseWidgetWatchlistSelectActivity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                            obj2 = externalSyntheticLambda3;
                        }
                        Function1 function1 = (Function1) obj2;
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(baseWidgetWatchlistSelectActivity.updateVisuals().onExtraCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(baseWidgetWatchlistSelectActivity);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback5) {
                            Object obj3 = objOnMinimized8;
                            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda4(baseWidgetWatchlistSelectActivity);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                                obj3 = externalSyntheticLambda4;
                            }
                            rExternalSyntheticLambda0.IAuthTabCallback(q8externalsyntheticlambda3, fFloatValue, fFloatValue2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, function1, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, 438);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), (u2) null, ForwardingCameraControl.onExtraCallback(-1349476553, true, new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda5(baseWidgetWatchlistSelectActivity, AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(baseWidgetWatchlistSelectActivity.updateVisuals().IAuthTabCallbackStubProxy(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7), getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4090);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = asBinder + 101;
                    access000 = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i13 = asBinder + 23;
                    access000 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 3 / 3;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = access000 + 35;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = asBinder + 49;
                access000 = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1452628850, i, -1, "im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity.onCreate.<anonymous> (BaseWidgetWatchlistSelectActivity.kt:52)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1452628850, i, -1, "im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity.onCreate.<anonymous> (BaseWidgetWatchlistSelectActivity.kt:52)");
            }
            r0a.onWarmupCompleted(ForwardingCameraControl.onExtraCallback(-579035612, true, new BaseWidgetWatchlistSelectActivity$.ExternalSyntheticLambda9(baseWidgetWatchlistSelectActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asBinder + 21;
                access000 = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 60 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void access200() {
        int i = 2 % 2;
        ICustomTabsServiceStub();
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
        int i2 = access000 + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return Boolean.valueOf(bool.booleanValue());
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = access000 + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {baseWidgetWatchlistSelectActivity, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 31690519, _string.onNavigationEvent.IAuthTabCallback(), -31690516, iIAuthTabCallback, objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, 410042555, iIAuthTabCallback3, -410042554, iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor, baseWidgetWatchlistSelectActivity});
    }

    private static final Unit onExtraCallbackWithResult(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {baseWidgetWatchlistSelectActivity, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -22591011, _string.onNavigationEvent.IAuthTabCallback(), 22591011, iIAuthTabCallback, objArr);
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, -1544653352, iIAuthTabCallback3, 1544653358, iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor});
    }

    private static final Unit onExtraCallbackWithResult(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, DisplaySetting displaySetting) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, -408421713, iIAuthTabCallback3, 408421715, iIAuthTabCallback, new Object[]{baseWidgetWatchlistSelectActivity, displaySetting});
    }

    private static final Unit IAuthTabCallback(BaseWidgetWatchlistSelectActivity baseWidgetWatchlistSelectActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {baseWidgetWatchlistSelectActivity, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1485555166, _string.onNavigationEvent.IAuthTabCallback(), -1485555161, iIAuthTabCallback, objArr);
    }

    private static final boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return ((Boolean) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, 375571527, iIAuthTabCallback3, -375571523, iIAuthTabCallback, new Object[]{cameraPresenceProviderExternalSyntheticLambda6})).booleanValue();
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        int i5 = asBinder + 47;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access000 + Imgproc.COLOR_YUV2RGBA_YVYU;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asBinder + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }
}
