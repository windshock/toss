package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.enablePreparedTextLayout;
import o.handleNativeAdClick;
import o.x2ExternalSyntheticLambda8;
import o.x3a;
import o.y1ExternalSyntheticLambda3;
import o.y1a;
import org.bouncycastle.asn1.eac.CertificateBody;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class enablePreparedTextLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = null;
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault = null;
    private static getBacktraceNote<x2ExternalSyntheticLambda8, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy = null;
    private static getBacktraceNote<x2ExternalSyntheticLambda8, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel = null;
    private static boolean ICustomTabsCallback = false;
    private static int access000 = 0;
    private static getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100 = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface = null;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static char[] getInterfaceDescriptor = null;
    private static getBacktraceNote<x2ExternalSyntheticLambda8, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = null;
    private static getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = null;
    private static int onMessageChannelReady = 1;
    public static final enablePreparedTextLayout onNavigationEvent;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = null;
    private static int readTypedObject = 1;
    private static boolean writeTypedObject;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        x2ExternalSyntheticLambda8 x2externalsyntheticlambda8 = (x2ExternalSyntheticLambda8) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(x2externalsyntheticlambda8, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = extraCallbackWithResult + 13;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 41;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = readTypedObject + 79;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 63;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(x3aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(x3aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = extraCallbackWithResult + 43;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = readTypedObject + 29;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        x2ExternalSyntheticLambda8 x2externalsyntheticlambda8 = (x2ExternalSyntheticLambda8) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {x2externalsyntheticlambda8, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1184115938, -1184115935, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr2, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        int i4 = readTypedObject + 11;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 43;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 27;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = i5 | i7;
        int i11 = (~(i5 | i3)) | (~(i7 | (~i3) | i8)) | (~(i3 | i2));
        int i12 = i3 + i2 + i4 + (764943627 * i6) + (189947931 * i);
        int i13 = i12 * i12;
        int i14 = (i3 * 1860537600) + 224780607 + (i2 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (1860538117 * i4) + ((-1861700041) * i6) + ((-831392377) * i) + (i13 * 995229696);
        int i15 = ((i3 * (-973936384)) - 801505280) + ((-973936384) * i2) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i4) + ((-1475084288) * i6) + ((-1479278592) * i) + ((-626393088) * i13) + (i14 * i14 * 1053163520);
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        int i16 = 2;
        if (i15 == 2) {
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i17 = 2 % 2;
            int i18 = extraCallbackWithResult + 17;
            readTypedObject = i18 % 128;
            int i19 = i18 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-533810093, iIntValue, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-533810093.<anonymous> (VerifyForeignerCertIntroFragment.kt:166)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.toss_cert_verify_foreigner_intro_step_2_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            Unit unit = Unit.INSTANCE;
            int i20 = readTypedObject + 63;
            extraCallbackWithResult = i20 % 128;
            int i21 = i20 % 2;
            return unit;
        }
        if (i15 != 3) {
            return i15 != 4 ? i15 != 5 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }
        x2ExternalSyntheticLambda8 x2externalsyntheticlambda8 = (x2ExternalSyntheticLambda8) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i22 = 2 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda8, BuildConfig.FLAVOR);
        if ((iIntValue2 & 6) == 0) {
            int i23 = extraCallbackWithResult + 17;
            readTypedObject = i23 % 128;
            int i24 = i23 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x2externalsyntheticlambda8)) {
                int i25 = extraCallbackWithResult;
                int i26 = i25 + 115;
                readTypedObject = i26 % 128;
                int i27 = i26 % 2;
                int i28 = i25 + 21;
                readTypedObject = i28 % 128;
                int i29 = i28 % 2;
                i16 = 4;
            }
            iIntValue2 |= i16;
        }
        int i30 = iIntValue2;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i30 & 19) != 18, i30 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-404296264, i30, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-404296264.<anonymous> (VerifyForeignerCertIntroFragment.kt:175)");
            }
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Image;
            long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
            handleNativeAdClick.onExtraCallback.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.LCS_BYTE, -108, ISOFileInfo.FCI_EXT, ISOFileInfo.FILE_IDENTIFIER, -111, -109, -119, ISOFileInfo.FCI_EXT, -110, -111, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -119, -120, -122, -112, -113, -122, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FILE_IDENTIFIER, -122, -124, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -119, -120, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.LCS_BYTE, -124, -124, ISOFileInfo.SECURITY_ATTR_EXP, -126, ISOFileInfo.LCS_BYTE, -119, -120, -126, ISOFileInfo.FCI_EXT, -126, -124, -122, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, (KeyEvent.getMaxKeyCode() >> 16) + CertificateBody.profileType, objArr2);
            x2externalsyntheticlambda8.onWarmupCompleted(((String) objArr2[0]).intern(), deprecated_eventlistenerfactory, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, onwarmupcompletedOnExtraCallbackWithResult, false, (getSwitchMinWidth) null, (getSwitchMinWidth) null, (getBacktraceNote) null, jIAuthTabCallbackDefault, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult2, 14155830, ((i30 << 12) & 57344) | 48, 14140);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(x2ExternalSyntheticLambda8 x2externalsyntheticlambda8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 77;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(x2externalsyntheticlambda8, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 51;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 13;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(x3aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 45;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 61;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i2 + 5;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 75;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -971703116, 971703118, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        int i5 = readTypedObject + 53;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 69;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackStub(x3aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStub(x3aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 87;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = readTypedObject + 113;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 95;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        int i6 = extraCallbackWithResult + 57;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public final getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault;
        }
        throw null;
    }

    public final getBacktraceNote<x2ExternalSyntheticLambda8, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 87;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<x2ExternalSyntheticLambda8, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 97;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<x2ExternalSyntheticLambda8, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback_Parcel;
        int i5 = i2 + 39;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = access100;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        int i4 = i3 + 39;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<x2ExternalSyntheticLambda8, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 99;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<x2ExternalSyntheticLambda8, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        int i5 = i2 + 93;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            getbacktracenote = onTransact;
            int i4 = 84 / 0;
        } else {
            getbacktracenote = onTransact;
        }
        int i5 = i3 + 41;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return getbacktracenote;
    }

    static {
        onTransact();
        onNavigationEvent = new enablePreparedTextLayout();
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-1673789501, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return enablePreparedTextLayout.onWarmupCompleted((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-2134031294, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return enablePreparedTextLayout.onWarmupCompleted((y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(1337174576, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return enablePreparedTextLayout.onNavigationEvent((x2ExternalSyntheticLambda8) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(2050723403, false, new Function2() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda5
            public final Object invoke(Object obj, Object obj2) {
                Object[] objArr = {(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                return (Unit) enablePreparedTextLayout.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1875826061, 1875826065, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            }
        });
        access100 = ForwardingCameraControl.onExtraCallbackWithResult(1541709055, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return enablePreparedTextLayout.IAuthTabCallback((x3a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-11297319, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Object[] objArr = {(x2ExternalSyntheticLambda8) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                return (Unit) enablePreparedTextLayout.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 2129688208, -2129688207, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1485641932, false, new Function2() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda8
            public final Object invoke(Object obj, Object obj2) {
                return enablePreparedTextLayout.IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        });
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(-533810093, false, new Function2() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda9
            public final Object invoke(Object obj, Object obj2) {
                return enablePreparedTextLayout.onWarmupCompleted((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        });
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1022158616, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda10
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return enablePreparedTextLayout.onNavigationEvent((x3a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-404296264, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda11
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Object[] objArr = {(x2ExternalSyntheticLambda8) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                return (Unit) enablePreparedTextLayout.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1954073427, -1954073422, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            }
        });
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-1878640877, false, new Function2() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return enablePreparedTextLayout.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        });
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1415157561, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return enablePreparedTextLayout.onWarmupCompleted((x3a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        int i = extraCallback + 31;
        onMessageChannelReady = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, BuildConfig.FLAVOR);
        if ((i & 6) != 0) {
            i2 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
            int i4 = extraCallbackWithResult + 3;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2 == 0 ? 2 : 4;
            i2 = i5 | i;
        }
        if ((i2 & 19) != 18) {
            int i6 = readTypedObject + 75;
            extraCallbackWithResult = i6 % 128;
            z = i6 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = readTypedObject + 125;
                extraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1673789501, i2, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-1673789501.<anonymous> (VerifyForeignerCertIntroFragment.kt:82)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1673789501, i2, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-1673789501.<anonymous> (VerifyForeignerCertIntroFragment.kt:82)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.toss_cert_verify_foreigner_intro_title, new Object[]{PlayerErrorCode.onPostMessage()}, cameraCaptureResultEmptyCameraCaptureResult, 0), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1))) {
            int i4 = readTypedObject + 85;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = readTypedObject + 49;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2134031294, i2, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-2134031294.<anonymous> (VerifyForeignerCertIntroFragment.kt:93)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.toss_cert_verify_foreigner_intro_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 6}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(x2ExternalSyntheticLambda8 x2externalsyntheticlambda8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda8, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x2externalsyntheticlambda8)) {
                int i5 = extraCallbackWithResult + 119;
                readTypedObject = i5 % 128;
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
            int i7 = extraCallbackWithResult + 75;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = extraCallbackWithResult + 37;
            readTypedObject = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i11 = readTypedObject + 21;
            extraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1337174576, i2, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$1337174576.<anonymous> (VerifyForeignerCertIntroFragment.kt:132)");
            }
            x2externalsyntheticlambda8.onWarmupCompleted(getSchemeokhttp.IAuthTabCallback(OkHttp.onExtraCallback), deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)), false, (getSwitchMinWidth) null, (getSwitchMinWidth) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 1572912, ((i2 << 12) & 57344) | 48, 14268);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i13 = extraCallbackWithResult + 7;
                readTypedObject = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i15 = readTypedObject + 63;
            extraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 121;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = extraCallbackWithResult + 11;
                readTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2050723403, i, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$2050723403.<anonymous> (VerifyForeignerCertIntroFragment.kt:142)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2050723403, i, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$2050723403.<anonymous> (VerifyForeignerCertIntroFragment.kt:142)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.toss_cert_verify_foreigner_intro_step_1_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = readTypedObject + 19;
                extraCallbackWithResult = i6 % 128;
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

    private static final Unit onExtraCallbackWithResult(x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = readTypedObject + 21;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(x3aVar, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x3aVar) ^ true ? 2 : 4;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i5 = readTypedObject + 121;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = extraCallbackWithResult + 115;
                readTypedObject = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1541709055, i, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$1541709055.<anonymous> (VerifyForeignerCertIntroFragment.kt:140)");
            }
            x3aVar.onNavigationEvent(IAuthTabCallbackStubProxy, (Function2) null, (getSwitchMinWidth) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 6, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = readTypedObject + 85;
                extraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(x2ExternalSyntheticLambda8 x2externalsyntheticlambda8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = readTypedObject + 113;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda8, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x2externalsyntheticlambda8)) {
                int i7 = extraCallbackWithResult + 97;
                readTypedObject = i7 % 128;
                i3 = i7 % 2 == 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = readTypedObject + 45;
                extraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-11297319, i2, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-11297319.<anonymous> (VerifyForeignerCertIntroFragment.kt:151)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-11297319, i2, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-11297319.<anonymous> (VerifyForeignerCertIntroFragment.kt:151)");
            }
            x2externalsyntheticlambda8.onWarmupCompleted(queryParameterValues.onExtraCallbackWithResult(OkHttp.onExtraCallback), deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)), false, (getSwitchMinWidth) null, (getSwitchMinWidth) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 1572912, ((i2 << 12) & 57344) | 48, 14268);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = readTypedObject;
        int i4 = i3 + 97;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 39;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1485641932, i, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-1485641932.<anonymous> (VerifyForeignerCertIntroFragment.kt:161)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.toss_cert_verify_foreigner_intro_step_2_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = getInterfaceDescriptor;
        double d = 0.0d;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 77, 20952 - KeyEvent.normalizeMetaState(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    d = 0.0d;
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
        Object[] objArr3 = {Integer.valueOf(access000)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 75 - Color.alpha(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (ICustomTabsCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i4 = $11 + 105;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 63 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12214 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 64 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!writeTypedObject) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i5 = $11 + 3;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i7 = $11 + 81;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63, View.resolveSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(x3aVar, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            int i4 = extraCallbackWithResult + 77;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 48 / 0;
                i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x3aVar) ? 4 : 2;
            } else if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x3aVar))) {
            }
            i |= i2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1022158616, i, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-1022158616.<anonymous> (VerifyForeignerCertIntroFragment.kt:159)");
            }
            x3aVar.onNavigationEvent(onWarmupCompleted, asBinder, (getSwitchMinWidth) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 54, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = extraCallbackWithResult + 87;
                readTypedObject = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = readTypedObject + 101;
                extraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 9;
        extraCallbackWithResult = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 5) != 5, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = readTypedObject + 121;
                extraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1878640877, i, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-1878640877.<anonymous> (VerifyForeignerCertIntroFragment.kt:186)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1878640877, i, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-1878640877.<anonymous> (VerifyForeignerCertIntroFragment.kt:186)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.toss_cert_verify_foreigner_intro_step_3, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = readTypedObject + 99;
                extraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 13;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(x3aVar, BuildConfig.FLAVOR);
            if ((i & 95) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x3aVar)) {
                    int i5 = readTypedObject + 121;
                    extraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(x3aVar, BuildConfig.FLAVOR);
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1415157561, i, -1, "viva.republica.toss.verify.ComposableSingletons$VerifyForeignerCertIntroFragmentKt.lambda$-1415157561.<anonymous> (VerifyForeignerCertIntroFragment.kt:184)");
            }
            x3aVar.onNavigationEvent(asInterface, (Function2) null, (getSwitchMinWidth) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 6, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = extraCallbackWithResult + 11;
                readTypedObject = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 40 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = readTypedObject + 117;
        extraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda8 x2externalsyntheticlambda8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {x2externalsyntheticlambda8, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 2129688208, -2129688207, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1875826061, 1875826065, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x2ExternalSyntheticLambda8 x2externalsyntheticlambda8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {x2externalsyntheticlambda8, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1954073427, -1954073422, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    private static final Unit onTransact(x2ExternalSyntheticLambda8 x2externalsyntheticlambda8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {x2externalsyntheticlambda8, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1184115938, -1184115935, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    private static final Unit asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -971703116, 971703118, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    public final getBacktraceNote<x3a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (getBacktraceNote) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -2026822365, 2026822365, iOnNavigationEvent2, new Object[]{this}, iOnNavigationEvent, iOnNavigationEvent3);
    }

    static void onTransact() {
        getInterfaceDescriptor = new char[]{32538, 32534, 32530, 32535, 32712, 32723, 32737, 32537, 32743, 32732, 32531, 32541, 32540, 32539, 32726, 32522, 32733, 32740, 32741, 32521};
        access000 = -1184333950;
        writeTypedObject = true;
        ICustomTabsCallback = true;
    }
}
