package viva.republica.toss.guest.certify;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.gms.internal.ads.zziea;
import im.toss.base.BaseActivity;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.SetDetectableSize;
import o.access13800;
import o.clearValueCallback;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.maybeUpdateAnimatable;
import o.onSessionEnded;
import o.readType;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setAutoCaptured;
import o.setRandomHost;
import o.u3;
import o.u4;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.guest.certify.CertifyGuestOcrActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CertifyGuestOcrActivity extends Hilt_CertifyGuestOcrActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackDefault = 20089;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char IAuthTabCallback_Parcel = 31876;
    private static int access000 = 0;
    private static char access100 = 4681;
    private static char getInterfaceDescriptor = 59602;

    @Inject
    public readType ocrIntent;
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda8
        public final Object invoke() {
            return CertifyGuestOcrActivity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda9
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
            return (String) CertifyGuestOcrActivity.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -399901178, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), objArr, 399901182);
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda10
        public final Object invoke() {
            return Long.valueOf(CertifyGuestOcrActivity.IAuthTabCallback(this.f$0));
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackStub = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new onSessionEnded() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda11
        public final void onActivityResult(Object obj) {
            CertifyGuestOcrActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    public static /* synthetic */ long IAuthTabCallback(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        long jAsInterface = asInterface(certifyGuestOcrActivity);
        int i4 = IAuthTabCallbackStubProxy + 15;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return jAsInterface;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CertifyGuestOcrActivity certifyGuestOcrActivity = (CertifyGuestOcrActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(certifyGuestOcrActivity);
        int i4 = IAuthTabCallbackStubProxy + 57;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access000 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1527465291, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{str, str2, setDetectableSize}, -1527465291);
            int i3 = 67 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = setAutoCaptured.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = setAutoCaptured.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1527465291, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{str, str2, setDetectableSize}, -1527465291);
        }
        int i4 = access000 + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ String onExtraCallback(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        int i = 2 % 2;
        int i2 = access000 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
            return (String) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 597397621, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{certifyGuestOcrActivity}, -597397619);
        }
        int iOnExtraCallbackWithResult3 = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = setAutoCaptured.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, CertifyGuestOcrActivity certifyGuestOcrActivity, findResAndMsg findresandmsg, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 109;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, certifyGuestOcrActivity, findresandmsg, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(CertifyGuestOcrActivity certifyGuestOcrActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(certifyGuestOcrActivity, str);
        int i4 = access000 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CertifyGuestOcrActivity certifyGuestOcrActivity, String str, findResAndMsg findresandmsg) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(certifyGuestOcrActivity, str, findresandmsg);
        int i4 = IAuthTabCallbackStubProxy + 15;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CertifyGuestOcrActivity certifyGuestOcrActivity = (CertifyGuestOcrActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(certifyGuestOcrActivity);
            throw null;
        }
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(certifyGuestOcrActivity);
        int i3 = IAuthTabCallbackStubProxy + 81;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, CertifyGuestOcrActivity certifyGuestOcrActivity, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 47;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {str, certifyGuestOcrActivity, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1881625814, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), objArr, -1881625811);
        int i5 = IAuthTabCallbackStubProxy + 55;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CertifyGuestOcrActivity certifyGuestOcrActivity, String str) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1702006752, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{certifyGuestOcrActivity, str}, -1702006745);
        int i4 = access000 + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CertifyGuestOcrActivity certifyGuestOcrActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 47;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(certifyGuestOcrActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CertifyGuestOcrActivity certifyGuestOcrActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 121;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return onWarmupCompleted(certifyGuestOcrActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(certifyGuestOcrActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CertifyGuestOcrActivity certifyGuestOcrActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 83;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {certifyGuestOcrActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = setAutoCaptured.onExtraCallbackWithResult();
        if (i4 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult3, -946874085, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, objArr, 946874086);
        int i5 = IAuthTabCallbackStubProxy + 45;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(CertifyGuestOcrActivity certifyGuestOcrActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(certifyGuestOcrActivity, iEngagementSignalsCallbackDefault);
        int i4 = access000 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CertifyGuestOcrActivity certifyGuestOcrActivity = (CertifyGuestOcrActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(certifyGuestOcrActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackStubProxy + 43;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(CertifyGuestOcrActivity certifyGuestOcrActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 101;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        certifyGuestOcrActivity.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = access000 + 31;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CertifyGuestOcrActivity certifyGuestOcrActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallbackStub(certifyGuestOcrActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(certifyGuestOcrActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = access000 + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CertifyGuestOcrActivity certifyGuestOcrActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 77;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(certifyGuestOcrActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 121;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return 1566739L;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onNavigationEvent(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = certifyGuestOcrActivity.IAuthTabCallbackStub;
        if (i4 == 0) {
            int i5 = 15 / 0;
        }
        int i6 = i2 + 61;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return iEngagementSignalsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final readType IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 15;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        readType readtype = this.ocrIntent;
        if (readtype == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return readtype;
    }

    private final String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asBinder.getValue();
        int i4 = access000 + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final String validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.asInterface.getValue();
        int i3 = access000 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallbackStub(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = certifyGuestOcrActivity.getIntent();
        if (i3 != 0) {
            intent.getStringExtra("requester_code");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String stringExtra = intent.getStringExtra("requester_code");
        if (stringExtra == null) {
            int i4 = access000 + 21;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "";
        }
        int i6 = access000 + 111;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return stringExtra;
    }

    private final long onNavigationEvent() {
        long jLongValue;
        int i = 2 % 2;
        int i2 = access000 + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            jLongValue = ((Number) this.onTransact.getValue()).longValue();
            int i3 = 27 / 0;
        } else {
            jLongValue = ((Number) this.onTransact.getValue()).longValue();
        }
        int i4 = IAuthTabCallbackStubProxy + 59;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long asInterface(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = certifyGuestOcrActivity.getIntent();
        if (i3 != 0) {
            return intent.getLongExtra("session_id", -1L);
        }
        long longExtra = intent.getLongExtra("session_id", -1L);
        int i4 = 79 / 0;
        return longExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(CertifyGuestOcrActivity certifyGuestOcrActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        certifyGuestOcrActivity.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            certifyGuestOcrActivity.finish();
            int i2 = IAuthTabCallbackStubProxy + 55;
            access000 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = access000 + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object[] objArr = new Object[1];
        a(new char[]{22565, 30687, 60114, 39068, 36360, 22301, 5730, 32390}, 8 - Color.alpha(0), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), setEngagementSignalsCallback());
        linkedHashMap.put("requester_code", validateRelationship());
        Object[] objArr2 = new Object[1];
        a(new char[]{44758, 62766, 42378, 10045, 59325, 14852, 23191, 48663, 7934, 54850, 30914, 51616, 46288, 16145, 27618, 65167}, TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), Long.valueOf(onNavigationEvent()));
        int i2 = access000 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestOcrActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-665213366, true, new CertifyGuestOcrActivity$.ExternalSyntheticLambda7(this))), 1, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit asBinder(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access000 + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            certifyGuestOcrActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
            unit = Unit.INSTANCE;
            int i3 = 36 / 0;
        } else {
            certifyGuestOcrActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
            unit = Unit.INSTANCE;
        }
        int i4 = access000 + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onTransact(final viva.republica.toss.guest.certify.CertifyGuestOcrActivity r13, o.CameraCaptureResultEmptyCameraCaptureResult r14, int r15) {
        /*
            r2 = 2
            int r3 = r2 % r2
            r3 = r15 & 3
            if (r3 == r2) goto L9
            r3 = 1
            goto L17
        L9:
            int r3 = viva.republica.toss.guest.certify.CertifyGuestOcrActivity.IAuthTabCallbackStubProxy
            int r3 = r3 + 51
            int r4 = r3 % 128
            viva.republica.toss.guest.certify.CertifyGuestOcrActivity.access000 = r4
            int r3 = r3 % r2
            if (r3 == 0) goto L16
            r3 = 5
            int r3 = r3 / r2
        L16:
            r3 = 0
        L17:
            r4 = r15 & 1
            boolean r3 = r14.onWarmupCompleted(r3, r4)
            if (r3 == 0) goto L77
            int r3 = viva.republica.toss.guest.certify.CertifyGuestOcrActivity.access000
            int r3 = r3 + 67
            int r4 = r3 % 128
            viva.republica.toss.guest.certify.CertifyGuestOcrActivity.IAuthTabCallbackStubProxy = r4
            int r3 = r3 % r2
            boolean r3 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r3 == 0) goto L40
            int r3 = viva.republica.toss.guest.certify.CertifyGuestOcrActivity.access000
            int r3 = r3 + 81
            int r4 = r3 % 128
            viva.republica.toss.guest.certify.CertifyGuestOcrActivity.IAuthTabCallbackStubProxy = r4
            int r3 = r3 % r2
            r2 = -1
            java.lang.String r3 = "viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CertifyGuestOcrActivity.kt:91)"
            r4 = 75308486(0x47d1dc6, float:2.9753678E-36)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r4, r15, r2, r3)
        L40:
            boolean r1 = r14.onExtraCallback(r13)
            java.lang.Object r2 = r14.onMinimized()
            if (r1 != 0) goto L52
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r1 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r1 = r1.onExtraCallback()
            if (r2 != r1) goto L5a
        L52:
            viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda2 r2 = new viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda2
            r2.<init>()
            r14.onWarmupCompleted(r2)
        L5a:
            r0 = r2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 254(0xfe, float:3.56E-43)
            r10 = r14
            o.MaxAdViewAdapterListener.onWarmupCompleted(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto L7a
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto L7a
        L77:
            r14.ICustomTabsCallbackStubProxy()
        L7a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onTransact(viva.republica.toss.guest.certify.CertifyGuestOcrActivity, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit IAuthTabCallbackStub(final CertifyGuestOcrActivity certifyGuestOcrActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = access000 + 63;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 75;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = IAuthTabCallbackStubProxy + 101;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-737275874, i, -1, "viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CertifyGuestOcrActivity.kt:90)");
                int i10 = IAuthTabCallbackStubProxy + 23;
                access000 = i10 % 128;
                int i11 = i10 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(75308486, true, new Function2() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return CertifyGuestOcrActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i12 = IAuthTabCallbackStubProxy + 29;
        access000 = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CertifyGuestOcrActivity certifyGuestOcrActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallbackStubProxy + 91;
                access000 = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2028363915, i, -1, "viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CertifyGuestOcrActivity.kt:99)");
                    int i4 = 40 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2028363915, i, -1, "viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CertifyGuestOcrActivity.kt:99)");
                }
            }
            certifyGuestOcrActivity.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = IAuthTabCallbackStubProxy + 89;
            access000 = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final CertifyGuestOcrActivity certifyGuestOcrActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = access000 + 117;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = access000 + 117;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-665213366, i, -1, "viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onCreate.<anonymous> (CertifyGuestOcrActivity.kt:87)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-362053646, true, new Function2() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return CertifyGuestOcrActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = access000 + 69;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 9;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent << 1];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i5 = 58224;
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $10 + 49;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallback_Parcel ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int i11 = (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)) + 10;
                        int iRed = 12434 - Color.red(i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, i11, iRed, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(access100)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 12434 - View.MeasureSpec.makeMeasureSpec(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i12 = $11 + 45;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16013), 14 - (ViewConfiguration.getScrollBarSize() >> 8), 19901 - KeyEvent.keyCodeFromString(""), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CertifyGuestOcrActivity certifyGuestOcrActivity, String str) throws Throwable {
        int i = 2 % 2;
        certifyGuestOcrActivity.IAuthTabCallback("not_mine", str);
        Object[] objArr = new Object[1];
        a(new char[]{14040, 46672, 51471, 41152, 64461, 7213, 10475, 38409, 42896, 33147, 400, 58651, 4407, 12328, 54829, 40961, 16792, 22394, 7934, 54850, 4422, 44884, 29093, 16572, 20483, 35092, 58420, 41777, 50114, 52200, 24098, 31599}, View.resolveSizeAndState(0, 0, 0) + 31, objArr);
        certifyGuestOcrActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String) objArr[0]).intern())));
        certifyGuestOcrActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return unit;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CertifyGuestOcrActivity.this.new onExtraCallback(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelOnNavigationEvent = CertifyGuestOcrActivity.onNavigationEvent(CertifyGuestOcrActivity.this);
            Intent intentPutExtra = readType.onWarmupCompleted(CertifyGuestOcrActivity.this.IAuthTabCallback(), CertifyGuestOcrActivity.this, false, false, (Float) null, (Float) null, (Float) null, (Float) null, (Long) null, (Float) null, (Long) null, (HashMap) null, false, false, false, false, (Boolean) null, (String) null, (Long) null, "onboarding", false, 0, (String) null, 3932158, (Object) null).putExtra("returnBaseInfo", true);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            iEngagementSignalsCallback_ParcelOnNavigationEvent.onNavigationEvent(intentPutExtra);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(CertifyGuestOcrActivity certifyGuestOcrActivity, String str, findResAndMsg findresandmsg) {
        int i = 2 % 2;
        certifyGuestOcrActivity.IAuthTabCallback("retry_by_ocr", str);
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, certifyGuestOcrActivity.new onExtraCallback(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(final java.lang.String r17, final viva.republica.toss.guest.certify.CertifyGuestOcrActivity r18, final o.findResAndMsg r19, o.u4 r20, o.CameraCaptureResultEmptyCameraCaptureResult r21, int r22) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestOcrActivity.IAuthTabCallback(java.lang.String, viva.republica.toss.guest.certify.CertifyGuestOcrActivity, o.findResAndMsg, o.u4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CertifyGuestOcrActivity certifyGuestOcrActivity = (CertifyGuestOcrActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            certifyGuestOcrActivity.IAuthTabCallback("retry_by_manual", str);
            certifyGuestOcrActivity.finish();
            return Unit.INSTANCE;
        }
        certifyGuestOcrActivity.IAuthTabCallback("retry_by_manual", str);
        certifyGuestOcrActivity.finish();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r1
      0x0033: PHI (r1v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(o.CameraCaptureResultEmptyCameraCaptureResult r38, final int r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onNavigationEvent(o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    private final void IAuthTabCallback(final String str, final String str2) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1566741L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CertifyGuestOcrActivity.IAuthTabCallback(str, str2, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = access000 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Object obj;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", str);
            Object[] objArr2 = new Object[1];
            a(new char[]{43221, 53998, 32433, 29895, 63581, 34733, 44036, 60115, 38087, 60816, 18721, 22103}, 30 - (PointF.length(2.0f, 0.0f) > 0.0f ? 1 : (PointF.length(2.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            obj = objArr2[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", str);
            Object[] objArr3 = new Object[1];
            a(new char[]{43221, 53998, 32433, 29895, 63581, 34733, 44036, 60115, 38087, 60816, 18721, 22103}, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            obj = objArr3[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), str2);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 49;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i6;
        int i8 = i7 | i2;
        int i9 = (~i8) | (~(i7 | i4));
        int i10 = (~((~i4) | i7 | (~i2))) | (~(i6 | i2));
        int i11 = i6 + i2 + i3 + ((-540997959) * i) + (162607451 * i5);
        int i12 = i11 * i11;
        int i13 = (i6 * 228155117) + 240245784 + (i2 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (228155391 * i3) + ((-329950905) * i) + ((-2026639707) * i5) + (i12 * 159186944);
        switch (((-612843245) * i6) + 1723858944 + (1667710703 * i2) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i3) + ((-672137216) * i) + (483393536 * i5) + (377683968 * i12) + (i13 * i13 * (-1451425792))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                final CertifyGuestOcrActivity certifyGuestOcrActivity = (CertifyGuestOcrActivity) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i14 = 2 % 2;
                int i15 = IAuthTabCallbackStubProxy + 83;
                access000 = i15 % 128;
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i15 % 2 == 0 ? (iIntValue & 3) != 2 : (iIntValue & 3) != 2, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i16 = access000 + 47;
                        IAuthTabCallbackStubProxy = i16 % 128;
                        int i17 = i16 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-362053646, iIntValue, -1, "viva.republica.toss.guest.certify.CertifyGuestOcrActivity.onCreate.<anonymous>.<anonymous> (CertifyGuestOcrActivity.kt:88)");
                    }
                    clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(-737275874, true, new Function2() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda4
                        public final Object invoke(Object obj, Object obj2) {
                            return CertifyGuestOcrActivity.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(2028363915, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.CertifyGuestOcrActivity$$ExternalSyntheticLambda5
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return CertifyGuestOcrActivity.onWarmupCompleted(this.f$0, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i18 = IAuthTabCallbackStubProxy + 51;
                        access000 = i18 % 128;
                        int i19 = i18 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    int i20 = access000 + 11;
                    IAuthTabCallbackStubProxy = i20 % 128;
                    int i21 = i20 % 2;
                }
                return Unit.INSTANCE;
            case 2:
                BaseActivity baseActivity = (CertifyGuestOcrActivity) objArr[0];
                int i22 = 2 % 2;
                int i23 = access000 + 25;
                IAuthTabCallbackStubProxy = i23 % 128;
                int i24 = i23 % 2;
                Intent intent = baseActivity.getIntent();
                Object[] objArr2 = new Object[1];
                a(new char[]{22565, 30687, 60114, 39068, 36360, 22301, 5730, 32390}, Color.argb(0, 0, 0, 0) + 8, objArr2);
                String stringExtra = intent.getStringExtra(((String) objArr2[0]).intern());
                if (stringExtra == null) {
                    int i25 = IAuthTabCallbackStubProxy + 35;
                    access000 = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i26 = 3 / 4;
                    }
                    stringExtra = "";
                }
                int i27 = IAuthTabCallbackStubProxy + 39;
                access000 = i27 % 128;
                int i28 = i27 % 2;
                return stringExtra;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ String onWarmupCompleted(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (String) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -399901178, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{certifyGuestOcrActivity}, 399901182);
    }

    public static /* synthetic */ Unit onExtraCallback(CertifyGuestOcrActivity certifyGuestOcrActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {certifyGuestOcrActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1068350558, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), objArr, -1068350553);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1698142220, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{certifyGuestOcrActivity}, 1698142226);
    }

    private static final Unit onNavigationEvent(String str, CertifyGuestOcrActivity certifyGuestOcrActivity, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, certifyGuestOcrActivity, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1881625814, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), objArr, -1881625811);
    }

    private static final Unit onWarmupCompleted(CertifyGuestOcrActivity certifyGuestOcrActivity, String str) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1702006752, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{certifyGuestOcrActivity, str}, -1702006745);
    }

    private static final Unit onExtraCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1527465291, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{str, str2, setDetectableSize}, -1527465291);
    }

    private static final Unit asInterface(CertifyGuestOcrActivity certifyGuestOcrActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {certifyGuestOcrActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -946874085, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), objArr, 946874086);
    }

    private static final String onTransact(CertifyGuestOcrActivity certifyGuestOcrActivity) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (String) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 597397621, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), new Object[]{certifyGuestOcrActivity}, -597397619);
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestOcrActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestOcrActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestOcrActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access000 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestOcrActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }
}
