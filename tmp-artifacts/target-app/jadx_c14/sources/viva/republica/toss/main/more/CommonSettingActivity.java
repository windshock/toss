package viva.republica.toss.main.more;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.gms.internal.ads.zziea;
import im.toss.base.BaseActivity;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirksExternalSyntheticBackport0;
import o.SetDetectableSize;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.clearValueCallback;
import o.getViewTypeCount;
import o.matches;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.w4;
import o.w5a;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.CommonSettingActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CommonSettingActivity extends Hilt_CommonSettingActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private static char[] onTransact = {64967, 64986, 64982, 64991};
    private static char asBinder = 51243;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CommonSettingActivity commonSettingActivity = (CommonSettingActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(commonSettingActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = asInterface + 119;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CommonSettingActivity commonSettingActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(commonSettingActivity);
        int i4 = asInterface + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CommonSettingActivity commonSettingActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 95;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallbackStub(commonSettingActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(commonSettingActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 109;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(CommonSettingActivity commonSettingActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(commonSettingActivity);
        int i4 = IAuthTabCallbackStub + 113;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CommonSettingActivity commonSettingActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(commonSettingActivity, setDetectableSize);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(commonSettingActivity, setDetectableSize);
        int i3 = IAuthTabCallbackStub + 71;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~(i5 | i7);
        int i11 = i | i10 | (~(i8 | i2));
        int i12 = i + i2 + i4 + ((-393945980) * i6) + (1728320405 * i3);
        int i13 = i12 * i12;
        int i14 = ((-1552544754) * i) + 1566572544 + ((-1100352524) * i2) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i4) + (2076180480 * i6) + ((-877658112) * i3) + (214302720 * i13);
        int i15 = ((i * (-252835662)) - 192251156) + (i2 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + (i4 * (-252835169)) + (i6 * 1574575612) + (i3 * 147979147) + (i13 * (-1426456576));
        int i16 = i14 + (i15 * i15 * 2075787264);
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }
        BaseActivity baseActivity = (CommonSettingActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i17 = 2 % 2;
        int i18 = asInterface + 89;
        IAuthTabCallbackStub = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{1, 0, 1, 2, 13889}, (byte) (66 - Color.green(0)), TextUtils.getOffsetAfter("", 0) + 5, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), baseActivity.getString(R.string.setting_display));
        Unit unit = Unit.INSTANCE;
        int i20 = asInterface + 57;
        IAuthTabCallbackStub = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CommonSettingActivity commonSettingActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = matches.onExtraCallback();
            int iOnExtraCallback2 = matches.onExtraCallback();
            int iOnExtraCallback3 = matches.onExtraCallback();
            return (Unit) onExtraCallbackWithResult(1103478931, -1103478928, matches.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{commonSettingActivity}, iOnExtraCallback3);
        }
        int iOnExtraCallback4 = matches.onExtraCallback();
        int iOnExtraCallback5 = matches.onExtraCallback();
        int iOnExtraCallback6 = matches.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CommonSettingActivity commonSettingActivity, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 87;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return onNavigationEvent(commonSettingActivity, str, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(commonSettingActivity, str, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CommonSettingActivity commonSettingActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = matches.onExtraCallback();
            int iOnExtraCallback2 = matches.onExtraCallback();
            int iOnExtraCallback3 = matches.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback4 = matches.onExtraCallback();
        int iOnExtraCallback5 = matches.onExtraCallback();
        int iOnExtraCallback6 = matches.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(-1415491334, 1415491336, matches.onExtraCallback(), iOnExtraCallback5, iOnExtraCallback4, new Object[]{commonSettingActivity, setDetectableSize}, iOnExtraCallback6);
        int i3 = asInterface + 73;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(CommonSettingActivity commonSettingActivity, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 109;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        commonSettingActivity.onWarmupCompleted(str, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(CommonSettingActivity commonSettingActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(commonSettingActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 15;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CommonSettingActivity commonSettingActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {commonSettingActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = matches.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(475494223, -475494222, matches.onExtraCallback(), matches.onExtraCallback(), iOnExtraCallback, objArr, matches.onExtraCallback());
        int i5 = asInterface + 27;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 15 / 0;
        }
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return 1230631L;
        }
        throw null;
    }

    @Override // viva.republica.toss.main.more.Hilt_CommonSettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-2141347502, true, new CommonSettingActivity$.ExternalSyntheticLambda2(this))), 1, (Object) null);
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    private static final Unit onWarmupCompleted(CommonSettingActivity commonSettingActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        commonSettingActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallbackStub(viva.republica.toss.main.more.CommonSettingActivity r14, o.CameraCaptureResultEmptyCameraCaptureResult r15, int r16) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.CommonSettingActivity.IAuthTabCallbackStub(viva.republica.toss.main.more.CommonSettingActivity, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CommonSettingActivity commonSettingActivity) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1230633L, false, (String) null, (Map) null, new CommonSettingActivity$.ExternalSyntheticLambda1(commonSettingActivity), 14, (Object) null);
        commonSettingActivity.startActivity(DisplaySettingActivity.Companion.onExtraCallback(commonSettingActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CommonSettingActivity commonSettingActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{1, 0, 1, 2, 13889}, (byte) (67 >> (ViewConfiguration.getWindowTouchSlop() * 126)), 3 >> (ViewConfiguration.getKeyRepeatDelay() / 19), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{1, 0, 1, 2, 13889}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 66), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 5, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), commonSettingActivity.getString(R.string.setting_haptic));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.content.Context, viva.republica.toss.main.more.CommonSettingActivity] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ?? r12 = (CommonSettingActivity) objArr[0];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1230633L, false, (String) null, (Map) null, new CommonSettingActivity$.ExternalSyntheticLambda7((CommonSettingActivity) r12), 14, (Object) null);
        r12.startActivity(HapticSettingActivity.Companion.IAuthTabCallback(r12));
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r24) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.CommonSettingActivity.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit onExtraCallback(CommonSettingActivity commonSettingActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = IAuthTabCallbackStub + 53;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1528275706, i, -1, "viva.republica.toss.main.more.CommonSettingActivity.onCreate.<anonymous>.<anonymous> (CommonSettingActivity.kt:44)");
            }
            clearValueCallback.onWarmupCompleted(new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, ForwardingCameraControl.onExtraCallback(-298639578, true, new CommonSettingActivity$.ExternalSyntheticLambda5(commonSettingActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(709176467, true, new CommonSettingActivity$.ExternalSyntheticLambda6(commonSettingActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 390, 48, 2042}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 25;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = IAuthTabCallbackStub + 119;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(CommonSettingActivity commonSettingActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = IAuthTabCallbackStub + 105;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = IAuthTabCallbackStub + 103;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2141347502, i, -1, "viva.republica.toss.main.more.CommonSettingActivity.onCreate.<anonymous> (CommonSettingActivity.kt:43)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1528275706, true, new CommonSettingActivity$.ExternalSyntheticLambda10(commonSettingActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = asInterface + 107;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(java.lang.String r39, o.w5a r40, o.CameraCaptureResultEmptyCameraCaptureResult r41, int r42) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.CommonSettingActivity.onExtraCallback(java.lang.String, o.w5a, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private final void onWarmupCompleted(String str, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2009875324);
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallbackStub + 37;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i7 = asInterface + 57;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i9 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 19) != 18, i9 & 1)) {
            int i10 = asInterface + 87;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2009875324, i9, -1, "viva.republica.toss.main.more.CommonSettingActivity.ItemList (CommonSettingActivity.kt:108)");
            }
            getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{ForwardingCameraControl.onExtraCallback(298698041, true, new CommonSettingActivity$.ExternalSyntheticLambda3(str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), true, null, null, onnavigationevent.onNavigationEvent(), null, null, onnavigationevent.onNavigationEvent(), null, Float.valueOf(0.0f), null, null, null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), null, function0, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 12607542, Integer.valueOf(((i9 << 12) & 458752) | 3072), 221036}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = asInterface + 115;
                IAuthTabCallbackStub = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CommonSettingActivity$.ExternalSyntheticLambda4(this, str, function0, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r32, byte r33, int r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.CommonSettingActivity.a(char[], byte, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Unit onWarmupCompleted(CommonSettingActivity commonSettingActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {commonSettingActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = matches.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(139932319, -139932319, matches.onExtraCallback(), matches.onExtraCallback(), iOnExtraCallback, objArr, matches.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(CommonSettingActivity commonSettingActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {commonSettingActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = matches.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(475494223, -475494222, matches.onExtraCallback(), matches.onExtraCallback(), iOnExtraCallback, objArr, matches.onExtraCallback());
    }

    private static final Unit onNavigationEvent(CommonSettingActivity commonSettingActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(-1415491334, 1415491336, matches.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{commonSettingActivity, setDetectableSize}, iOnExtraCallback3);
    }

    private static final Unit asInterface(CommonSettingActivity commonSettingActivity) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(1103478931, -1103478928, matches.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{commonSettingActivity}, iOnExtraCallback3);
    }

    @Override // viva.republica.toss.main.more.Hilt_CommonSettingActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStub + 51;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    @Override // viva.republica.toss.main.more.Hilt_CommonSettingActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.main.more.Hilt_CommonSettingActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStub + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.main.more.Hilt_CommonSettingActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asInterface + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
