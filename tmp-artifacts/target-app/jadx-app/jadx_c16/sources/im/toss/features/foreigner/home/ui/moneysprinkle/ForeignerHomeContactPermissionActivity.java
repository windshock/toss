package im.toss.features.foreigner.home.ui.moneysprinkle;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import im.toss.features.foreigner.home.ui.moneysprinkle.ForeignerHomeContactPermissionActivity$;
import im.toss.observability.instrumentation.memory.PssReader$;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinBroadcastManager;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.ForwardingCameraControl;
import o.IAuthTabCallbackStubProxy;
import o.ICustomTabsService;
import o.MaxRecyclerAdaptera;
import o.SetDetectableSize;
import o.accessgetCameraFactoryp;
import o.addFixedPosition;
import o.getBridgeId;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.y2;
import o.y4;
import o.y6;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ForeignerHomeContactPermissionActivity extends Hilt_ForeignerHomeContactPermissionActivity {
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;

    static {
        int i = asBinder + 89;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = i | i2;
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~(i2 | i8)) | (~(i9 | i));
        int i12 = i + i4 + i6 + (1389894630 * i3) + ((-1243605516) * i5);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i) + 1335230464 + (862422157 * i4) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i6) + (1607991296 * i3) + ((-548405248) * i5) + ((-1553596416) * i13);
        int i15 = ((i * (-88671125)) - 261777699) + (i4 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i6 * (-88671137)) + (i3 * (-349388198)) + (i5 * (-147040884)) + (i13 * 182059008);
        int i16 = i14 + (i15 * i15 * (-132513792));
        boolean z = false;
        if (i16 == 1) {
            SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
            int i17 = 2 % 2;
            int i18 = IAuthTabCallbackDefault + 5;
            IAuthTabCallbackStub = i18 % 128;
            int i19 = i18 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(setDetectableSize);
            int i20 = IAuthTabCallbackDefault + 75;
            IAuthTabCallbackStub = i20 % 128;
            int i21 = i20 % 2;
            return unitOnWarmupCompleted;
        }
        if (i16 != 2) {
            return onExtraCallback(objArr);
        }
        ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity = (ForeignerHomeContactPermissionActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i22 = 2 % 2;
        int i23 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i23 % 128;
        if (i23 % 2 != 0 ? (iIntValue & 3) != 2 : (iIntValue & 3) != 2) {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i24 = IAuthTabCallbackDefault + 91;
            IAuthTabCallbackStub = i24 % 128;
            int i25 = i24 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1576304868, iIntValue, -1, "im.toss.features.foreigner.home.ui.moneysprinkle.ForeignerHomeContactPermissionActivity.onCreate.<anonymous>.<anonymous> (ForeignerHomeContactPermissionActivity.kt:39)");
                int i26 = IAuthTabCallbackDefault + 89;
                IAuthTabCallbackStub = i26 % 128;
                int i27 = i26 % 2;
            }
            y4.onNavigationEvent((addFixedPosition) null, (MaxRecyclerAdaptera) null, (y2) null, (y6) null, ForwardingCameraControl.onExtraCallback(120786099, true, new ForeignerHomeContactPermissionActivity$.ExternalSyntheticLambda5(foreignerHomeContactPermissionActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 15);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i28 = IAuthTabCallbackStub + 95;
                IAuthTabCallbackDefault = i28 % 128;
                int i29 = i28 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
        int i3 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(foreignerHomeContactPermissionActivity);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(foreignerHomeContactPermissionActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(foreignerHomeContactPermissionActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(1829758851, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1829758851, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{foreignerHomeContactPermissionActivity}, iOnWarmupCompleted2);
        int i4 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(foreignerHomeContactPermissionActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        int i6 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {foreignerHomeContactPermissionActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) IAuthTabCallback(-123030589, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 123030591, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i5 = IAuthTabCallbackStub + 57;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return 5180822L;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.features.foreigner.home.ui.moneysprinkle.Hilt_ForeignerHomeContactPermissionActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        IAuthTabCallbackStubProxy.onWarmupCompleted(this, (ICustomTabsService) null, (ICustomTabsService) null, 3, (Object) null);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-570937310, true, new ForeignerHomeContactPermissionActivity$.ExternalSyntheticLambda6(this))), 1, (Object) null);
        int i2 = IAuthTabCallbackDefault + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "setting");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity = (ForeignerHomeContactPermissionActivity) objArr[0];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5180824L, false, (String) null, (Map) null, new ForeignerHomeContactPermissionActivity$.ExternalSyntheticLambda3(), 14, (Object) null);
        foreignerHomeContactPermissionActivity.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "later");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5180824L, false, (String) null, (Map) null, new ForeignerHomeContactPermissionActivity$.ExternalSyntheticLambda2(), 14, (Object) null);
        foreignerHomeContactPermissionActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackStub + 11;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 99;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(120786099, i, -1, "im.toss.features.foreigner.home.ui.moneysprinkle.ForeignerHomeContactPermissionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ForeignerHomeContactPermissionActivity.kt:40)");
                    int i6 = 77 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(120786099, i, -1, "im.toss.features.foreigner.home.ui.moneysprinkle.ForeignerHomeContactPermissionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ForeignerHomeContactPermissionActivity.kt:40)");
                }
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(foreignerHomeContactPermissionActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i7 = IAuthTabCallbackStub + 121;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new ForeignerHomeContactPermissionActivity$.ExternalSyntheticLambda0(foreignerHomeContactPermissionActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                Function0 function0 = (Function0) objOnMinimized;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(foreignerHomeContactPermissionActivity);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent2) {
                    int i8 = IAuthTabCallbackStub + 35;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new ForeignerHomeContactPermissionActivity$.ExternalSyntheticLambda1(foreignerHomeContactPermissionActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    getBridgeId.onExtraCallback(function0, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
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

    private static final Unit onExtraCallback(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1))) {
            int i5 = IAuthTabCallbackStub + 103;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackDefault + 71;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-570937310, i, -1, "im.toss.features.foreigner.home.ui.moneysprinkle.ForeignerHomeContactPermissionActivity.onCreate.<anonymous> (ForeignerHomeContactPermissionActivity.kt:38)");
                int i9 = IAuthTabCallbackStub + 77;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
            }
            AppLovinBroadcastManager.onExtraCallbackWithResult(new accessgetCameraFactoryp[0], ForwardingCameraControl.onExtraCallback(-1576304868, true, new ForeignerHomeContactPermissionActivity$.ExternalSyntheticLambda4(foreignerHomeContactPermissionActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() {
        int i = 2 % 2;
        startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + getPackageName())));
        finish();
        int i2 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) IAuthTabCallback(164147349, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -164147348, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{setDetectableSize}, iOnWarmupCompleted2);
    }

    private static final Unit IAuthTabCallback(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {foreignerHomeContactPermissionActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(-123030589, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 123030591, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(ForeignerHomeContactPermissionActivity foreignerHomeContactPermissionActivity) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) IAuthTabCallback(1829758851, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1829758851, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{foreignerHomeContactPermissionActivity}, iOnWarmupCompleted2);
    }

    @Override // im.toss.features.foreigner.home.ui.moneysprinkle.Hilt_ForeignerHomeContactPermissionActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.features.foreigner.home.ui.moneysprinkle.Hilt_ForeignerHomeContactPermissionActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.features.foreigner.home.ui.moneysprinkle.Hilt_ForeignerHomeContactPermissionActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.features.foreigner.home.ui.moneysprinkle.Hilt_ForeignerHomeContactPermissionActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
