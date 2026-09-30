package im.toss.appsintoss.iap;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import im.toss.appsintoss.iap.InAppPurchaseHistoryActivity$;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.ACPayResult;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirksExternalSyntheticBackport0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.access8100;
import o.b0a;
import o.dequeImageProxy;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getHostnameVerifierokhttp;
import o.getWrite;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.toMetersPerSecond;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InAppPurchaseHistoryActivity extends Hilt_InAppPurchaseHistoryActivity implements b0a {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static long IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int access100 = 0;
    public static final int asBinder;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private final Lazy onTransact = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(InAppPurchaseHistoryViewModel.class), new onExtraCallbackWithResult(this), new IAuthTabCallback(this), new onNavigationEvent(null, this));

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onExtraCallback();
        Companion = new onWarmupCompleted(null);
        asBinder = 8;
        int i = access100 + 13;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = (InAppPurchaseHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(inAppPurchaseHistoryActivity);
        int i4 = asInterface + 39;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(inAppPurchaseHistoryActivity);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = asInterface + 33;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {inAppPurchaseHistoryActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
        if (i4 != 0) {
            return (Unit) onExtraCallbackWithResult(objArr, -497474912, iOnWarmupCompleted, iOnWarmupCompleted3, 497474916, iOnWarmupCompleted4, iOnWarmupCompleted2);
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(inAppPurchaseHistoryActivity, setDetectableSize);
        }
        onNavigationEvent(inAppPurchaseHistoryActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(inAppPurchaseHistoryActivity, str, str2, str3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(inAppPurchaseHistoryActivity, str, str2, str3);
        int i3 = IAuthTabCallbackStub + 27;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 57;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(inAppPurchaseHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(inAppPurchaseHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity, setDetectableSize}, 1237362158, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1237362157, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
        int i3 = asInterface + 85;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = (InAppPurchaseHistoryActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {inAppPurchaseHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
        if (i3 != 0) {
            return (Unit) onExtraCallbackWithResult(objArr2, 681704154, iOnWarmupCompleted, iOnWarmupCompleted3, -681704151, iOnWarmupCompleted4, iOnWarmupCompleted2);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i;
        int i8 = ~(i7 | i4 | i2);
        int i9 = (~((~i2) | i4)) | (~(i4 | i));
        int i10 = i4 + i + i6 + (32217706 * i3) + (238734613 * i5);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i4) - 528416768) + (677943110 * i) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i6) + ((-154927104) * i3) + ((-131989504) * i5) + ((-1876361216) * i11);
        int i13 = ((i4 * 1127137324) - 440746823) + (i * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i6 * 1127136485) + (i3 * 976419026) + (i5 * 1106960329) + (i11 * 279773184);
        switch (i12 + (i13 * i13 * (-1943076864))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                String str3 = (String) objArr[2];
                InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = (InAppPurchaseHistoryActivity) objArr[3];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[4];
                int i14 = 2 % 2;
                int i15 = asInterface + 47;
                IAuthTabCallbackStub = i15 % 128;
                int i16 = i15 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, str3, inAppPurchaseHistoryActivity, setDetectableSize);
                int i17 = asInterface + 69;
                IAuthTabCallbackStub = i17 % 128;
                int i18 = i17 % 2;
                return unitOnWarmupCompleted;
            case 6:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(inAppPurchaseHistoryActivity, str, str2, str3);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        int i5 = asInterface + 3;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(inAppPurchaseHistoryActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = asInterface + 69;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(inAppPurchaseHistoryActivity);
        int i4 = IAuthTabCallbackStub + 81;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, String str3, InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, str3, inAppPurchaseHistoryActivity, setDetectableSize);
        int i4 = asInterface + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(inAppPurchaseHistoryActivity);
        int i4 = IAuthTabCallbackStub + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 39;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
        }
        int i5 = i2 + 7;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return 1639068L;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 99;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 101;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    private final InAppPurchaseHistoryViewModel IAuthTabCallback() {
        InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            inAppPurchaseHistoryViewModel = (InAppPurchaseHistoryViewModel) this.onTransact.getValue();
            int i3 = 73 / 0;
        } else {
            inAppPurchaseHistoryViewModel = (InAppPurchaseHistoryViewModel) this.onTransact.getValue();
        }
        int i4 = IAuthTabCallbackStub + 49;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return inAppPurchaseHistoryViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("saved_instance_state_exists", Boolean.valueOf(bundle != null));
        Object obj = null;
        Object[] objArr = new Object[1];
        a(new char[]{55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) + 14434, objArr);
        IAuthTabCallback("on_create", (Map<String, ? extends Object>) access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), getReferrer()), getWrite.IAuthTabCallback("mini_app_name", getIntent().getStringExtra("miniAppName")), getWrite.IAuthTabCallback("category", getIntent().getStringExtra("category")), getWrite.IAuthTabCallback("deployment_id", getIntent().getStringExtra("deploymentId"))}));
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(63000295, true, new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda0(this))), 1, (Object) null);
        int i4 = asInterface + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        inAppPurchaseHistoryActivity.onExtraCallback(str, str2, str3);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 67;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        inAppPurchaseHistoryActivity.onWarmupCompleted(str, str2, str3);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            inAppPurchaseHistoryActivity.ICustomTabsServiceDefault();
            int i3 = 12 / 0;
            return Unit.INSTANCE;
        }
        inAppPurchaseHistoryActivity.ICustomTabsServiceDefault();
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            inAppPurchaseHistoryActivity.validateRelationship();
            unit = Unit.INSTANCE;
            int i3 = 30 / 0;
        } else {
            inAppPurchaseHistoryActivity.validateRelationship();
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStub + 17;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity}, -1807025868, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1807025874, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
            Unit unit = Unit.INSTANCE;
            int i3 = asInterface + 75;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity}, -1807025868, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1807025874, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    public static final class IAuthTabCallback implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public IAuthTabCallback(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onWarmupCompleted2 = onWarmupCompleted();
            int i4 = IAuthTabCallback + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return onWarmupCompleted2;
        }

        public final ViewModelProvider.onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onNavigationEvent.getDefaultViewModelProviderFactory();
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 35 / 0;
            }
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object obj;
        int i;
        InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = (InAppPurchaseHistoryActivity) objArr[0];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i3 = asInterface + 103;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            Object obj2 = null;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = asInterface + 11;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(872961089, iIntValue, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryActivity.kt:49)");
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(872961089, iIntValue, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryActivity.kt:49)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0);
            InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModelIAuthTabCallback = inAppPurchaseHistoryActivity.IAuthTabCallback();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i6 = IAuthTabCallbackStub + 67;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                Object obj3 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    InAppPurchaseHistoryActivity$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda6(inAppPurchaseHistoryActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                    obj3 = externalSyntheticLambda6;
                }
                getBacktraceNote getbacktracenote = (getBacktraceNote) obj3;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryActivity);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback2) {
                    int i7 = IAuthTabCallbackStub + 17;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    Object obj4 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        InAppPurchaseHistoryActivity$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda7(inAppPurchaseHistoryActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                        obj4 = externalSyntheticLambda7;
                    }
                    getBacktraceNote getbacktracenote2 = (getBacktraceNote) obj4;
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryActivity);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback3) {
                        int i9 = asInterface + 119;
                        IAuthTabCallbackStub = i9 % 128;
                        if (i9 % 2 == 0) {
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            throw null;
                        }
                        Object obj5 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            InAppPurchaseHistoryActivity$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda8(inAppPurchaseHistoryActivity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                            obj5 = externalSyntheticLambda8;
                        }
                        Function0 function0 = (Function0) obj5;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryActivity);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback4) {
                            Object obj6 = objOnMinimized4;
                            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                InAppPurchaseHistoryActivity$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda9(inAppPurchaseHistoryActivity);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                                obj6 = externalSyntheticLambda9;
                            }
                            Function0 function02 = (Function0) obj6;
                            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryActivity);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnExtraCallback5) {
                                Object obj7 = objOnMinimized5;
                                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    InAppPurchaseHistoryActivity$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda10(inAppPurchaseHistoryActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                                    obj7 = externalSyntheticLambda10;
                                }
                                Function0 function03 = (Function0) obj7;
                                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryActivity);
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnExtraCallback6) {
                                    int i10 = IAuthTabCallbackStub + 113;
                                    asInterface = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        int i11 = 21 / 0;
                                        obj = objOnMinimized6;
                                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            InAppPurchaseHistoryActivity$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda11(inAppPurchaseHistoryActivity);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                            int i12 = asInterface + 71;
                                            IAuthTabCallbackStub = i12 % 128;
                                            int i13 = i12 % 2;
                                            obj = externalSyntheticLambda11;
                                        }
                                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, inAppPurchaseHistoryViewModelIAuthTabCallback, false, getbacktracenote, getbacktracenote2, function0, function02, function03, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 384, 0);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i14 = asInterface + 87;
                                            IAuthTabCallbackStub = i14 % 128;
                                            int i15 = i14 % 2;
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                    } else {
                                        obj = objOnMinimized6;
                                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        }
                                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, inAppPurchaseHistoryViewModelIAuthTabCallback, false, getbacktracenote, getbacktracenote2, function0, function02, function03, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 384, 0);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackStub + 99;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallbackStub + 61;
            asInterface = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1866883009, i, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryActivity.onCreate.<anonymous>.<anonymous> (InAppPurchaseHistoryActivity.kt:46)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(872961089, true, new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda5(inAppPurchaseHistoryActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6, 12582912, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStub + 95;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
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

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z = false;
        InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = (InAppPurchaseHistoryActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 109;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0 ? (iIntValue & 3) != 2 : (iIntValue & 2) != 3) {
            int i4 = i2 + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = IAuthTabCallbackStub + 117;
            asInterface = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(63000295, iIntValue, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryActivity.onCreate.<anonymous> (InAppPurchaseHistoryActivity.kt:45)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1866883009, true, new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda3(inAppPurchaseHistoryActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asInterface + 87;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
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

    public static final class onExtraCallbackWithResult implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public onExtraCallbackWithResult(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.onNavigationEvent.getViewModelStore();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onNavigationEvent.getViewModelStore();
            int i3 = onWarmupCompleted + 109;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 61 / 0;
            }
            return viewModelStore;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 115;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), View.resolveSizeAndState(0, 0, 0) + 24, 19627 - TextUtils.getTrimmedLength(""), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackDefault ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 59 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 121;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 59 - Color.green(0), 6383 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $11 + 19;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    public static final class onNavigationEvent implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity onExtraCallback;
        final /* synthetic */ Function0 onExtraCallbackWithResult;

        public onNavigationEvent(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = function0;
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Function0 function0 = this.onExtraCallbackWithResult;
            if (function0 != null) {
                int i5 = i2 + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.onExtraCallback.getDefaultViewModelCreationExtras();
            int i7 = IAuthTabCallback + 119;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asInterface = i2 % 128;
        String str4 = null;
        if (i2 % 2 == 0) {
            String stringExtra = getIntent().getStringExtra("deploymentId");
            if (stringExtra != null) {
                str4 = "&deploymentId=" + stringExtra;
            } else {
                int i3 = asInterface + 7;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
            if (str4 == null) {
                int i5 = asInterface + 15;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                str4 = "";
            }
            Uri referrer = getReferrer();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{55878, 62541, 34399, 20599, 25203, 15360, 52756, 38941, 43566, 17530, 5784, 8341, 62152, 36076, 24307, 26757, 15048, 54401, 59057, 45295, 17221, 7499, 12120, 63853, 35618, 42265, 30473, 327, 54072, 60732, 49091, 18827, 7141, 13805, 51197, 37265, 41865, 32181, 4008, 55723, 59410, 47696, 21602, 26216, 12394, 49684, 39938, 44581, 30752, 2661, 9431, 63179, 32994, 21232, 27876, 16012, 51348, 39677, 46243, 18095, 4429, 9037, 64890, 36714, 22858, 27402, 1290, 55092, 57636, 46022, 19913, 8139, 10735, 64445}, 11789 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(referrer);
            sb.append("&orderId=");
            sb.append(str);
            sb.append("&miniAppName=");
            sb.append(str3);
            sb.append(str4);
            SessionTrackerb.IAuthTabCallback(onNavigationEvent(), this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1639070L, false, null, null, new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda1(str3, str2, str, this), 14, null);
            return;
        }
        getIntent().getStringExtra("deploymentId");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(String str, String str2, String str3, InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", str);
        setDetectableSize.onExtraCallback("product_id", str2);
        setDetectableSize.onExtraCallback("order_id", str3);
        Object[] objArr = new Object[1];
        a(new char[]{55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420}, (KeyEvent.getMaxKeyCode() >> 16) + 14549, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), inAppPurchaseHistoryActivity.getReferrer());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onWarmupCompleted(String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1639724L, false, null, null, new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda2(str3, str2, str, this), 14, null);
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(String str, String str2, String str3, InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", str);
        setDetectableSize.onExtraCallback("product_id", str2);
        setDetectableSize.onExtraCallback("order_id", str3);
        Object[] objArr = new Object[1];
        a(new char[]{55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420}, 14549 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), inAppPurchaseHistoryActivity.getReferrer());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 31;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return unit;
    }

    private final void validateRelationship() throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1644004L, false, null, null, new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda13(this), 14, null);
        int i2 = asInterface + 111;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420}, 20456 >>> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420}, 14550 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), inAppPurchaseHistoryActivity.getReferrer());
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 29;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1644002L, false, null, null, new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda4((InAppPurchaseHistoryActivity) objArr[0]), 14, null);
        int i2 = IAuthTabCallbackStub + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        getHostnameVerifierokhttp gethostnameverifierokhttp = (InAppPurchaseHistoryActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420}, 14549 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), gethostnameverifierokhttp.getReferrer());
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() throws Throwable {
        int i = 2 % 2;
        startActivity(InAppPurchaseHistoryDisclaimerActivity.Companion.IAuthTabCallback(this));
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1644000L, false, null, null, new InAppPurchaseHistoryActivity$.ExternalSyntheticLambda12(this), 14, null);
        int i2 = IAuthTabCallbackStub + 57;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420}, 13816 - Color.alpha(1), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420}, 14549 - Color.alpha(0), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), inAppPurchaseHistoryActivity.getReferrer());
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asInterface = i2 % 128;
        char[] cArr = {55879, 57989, 44025, 28719, 14611, 50798, 36526, 22420};
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(cArr, 29022 - View.MeasureSpec.getMode(1), objArr);
            return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), getReferrer())});
        }
        Object[] objArr2 = new Object[1];
        a(cArr, View.MeasureSpec.getMode(0) + 14549, objArr2);
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), getReferrer())});
    }

    private final void IAuthTabCallback(String str, Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "apps_in_toss_purchase_history", (String) null, access8100.onWarmupCompleted(access8100.onNavigationEvent(getWrite.IAuthTabCallback("event", str)), map), (String) null, false, (String) null, 44, (Object) null);
        } else {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "apps_in_toss_purchase_history", (String) null, access8100.onWarmupCompleted(access8100.onNavigationEvent(getWrite.IAuthTabCallback("event", str)), map), (String) null, false, (String) null, 58, (Object) null);
        }
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) InAppPurchaseHistoryActivity.class);
            if (str != null) {
                int i2 = onWarmupCompleted + 109;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                intent.putExtra("miniAppName", str);
                int i4 = onExtraCallback + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            if (str2 != null) {
                intent.putExtra("category", str2);
            }
            if (str3 != null) {
                int i6 = onWarmupCompleted + 111;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                intent.putExtra("deploymentId", str3);
            }
            return intent;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) {
        return (Unit) onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity}, -1715699267, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1715699269, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 999975058, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -999975058, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(new Object[]{str, str2, str3, inAppPurchaseHistoryActivity, setDetectableSize}, -21890321, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 21890326, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    private final void setEngagementSignalsCallback() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, -1807025868, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1807025874, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity, setDetectableSize}, 1237362158, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1237362157, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 681704154, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -681704151, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -497474912, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 497474916, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStub + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asInterface + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 75;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asInterface + 89;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onExtraCallback() {
        IAuthTabCallbackDefault = 6559091747430883074L;
    }
}
