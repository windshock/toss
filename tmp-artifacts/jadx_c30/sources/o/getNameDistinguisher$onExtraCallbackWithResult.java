package o;

import android.R;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.google.gson.JsonObject;
import com.horcrux.svg.SvgPackage;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RuntimeScheduler;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.ZslRingBuffer;
import o.getNameDistinguisher$onExtraCallbackWithResult;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getNameDistinguisher$onExtraCallbackWithResult implements RuntimeScheduler.IAuthTabCallback {
    private static short[] IAuthTabCallbackStub;
    final /* synthetic */ String IAuthTabCallback;
    final /* synthetic */ FragmentActivity onExtraCallbackWithResult;
    final /* synthetic */ String onNavigationEvent;
    final /* synthetic */ WebViewContentOwner onWarmupCompleted;
    private static final byte[] $$a = {1, ISOFileInfo.DATA_BYTES1, 109, ISOFileInfo.DATA_BYTES1};
    private static final int $$b = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int onExtraCallback = -13921551;
    private static int IAuthTabCallbackDefault = 417574264;
    private static int onTransact = -2058165423;
    private static byte[] asInterface = {-15, -16, 15, -1, -50, 1, 53, ISO7816.INS_READ_BINARY_STAMPED, 5, -15, 0, -2, 5, 17, -21, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, ISO7816.CLA_COMMAND_CHAINING, -18, -15, 13, -15, 7, -25, 7, 24, -26, -14, -12, -15, 0, 45, 41, 0, -92, ISO7816.INS_ERASE_BINARY, 1, -7, ISO7816.INS_ERASE_BINARY, -9, ISO7816.INS_CHANGE_CHV, ISO7816.INS_ENVELOPE, ISO7816.CLA_COMMAND_CHAINING, -3, -14, 5, -25, 47, -23, -9, ISO7816.INS_ERASE_BINARY, -3, 27, -4, -10, -13, -9, 60, 27, -8, ISO7816.INS_WRITE_RECORD, -9, 9, -13, -5, 15, -11, 10, 88, ISO7816.INS_READ_RECORD2, -16, 4, -5, 70, -71, 9, 58, 6, -63, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, ISO7816.CLA_COMMAND_CHAINING, -29, -11, 6, -6, -15, 0, -2, 5, 17, ISO7816.INS_WRITE_RECORD, -9, 73, ISO7816.INS_READ_BINARY_STAMPED, 5, -15, 0, -2, 5, 17, -21, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, ISO7816.CLA_COMMAND_CHAINING, -18, -15, 13, -15, 7, -25, 7, 24, -26, -14, -12, -15, 0, 45, 19, -49, -15, 13, -15, 7, -25, 7, -8, 26, -10, 61, ISO7816.INS_READ_RECORD2, 9, 5, -15, 0, -2, 5, -15, ISO7816.INS_INCREASE, -63, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, -16, 55, -60, -11, -26, 65, -56, -9, 10, 8, -10, 4, 61, ISO7816.INS_READ_RECORD2, 8, 12, -13, 78, -59, -10, -14, -11, 2, -27, 13, 3, -5, 76, -59, -29, 5, -5, -3, 11, -9, -16, -50, 1, 53, ISO7816.INS_READ_BINARY_STAMPED, 5, -15, 0, -2, 5, 17, -21, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, ISO7816.CLA_COMMAND_CHAINING, -18, -15, 13, -15, 7, -25, 7, 24, -26, -14, -12, -15, 0, 45, 41, 0, -22, -61, -10, ISO7816.INS_ERASE_BINARY, 10, -4, 3, -9, 9, 5, 45, 6, -8, -61, -10, ISO7816.INS_ERASE_BINARY, 10, -4, 3, -9, 9, 5, 45, 6, -65, 26, -12, 27, -43, ISO7816.CLA_COMMAND_CHAINING, -3, -14, 5, -25, 47, -41, -13, 13, 9, 23, -29, -7, 27, -12, -5, 7, 61, -8, ISO7816.INS_WRITE_RECORD, -9, 9, -13, -5, 15, -11, 10, 88, ISO7816.INS_READ_RECORD2, -16, 4, -5, 70, -71, 9, 58, 6, -63, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, ISO7816.CLA_COMMAND_CHAINING, -29, -11, 6, -6, -15, 0, -2, 5, 17, ISO7816.INS_WRITE_RECORD, -9, 73, ISO7816.INS_READ_BINARY_STAMPED, 5, -15, 0, -2, 5, 17, -21, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, ISO7816.CLA_COMMAND_CHAINING, -18, -15, 13, -15, 7, -25, 7, 24, -26, -14, -12, -15, 0, 45, 19, -49, -15, 13, -15, 7, -25, 7, -8, 26, -10, 61, ISO7816.INS_READ_RECORD2, 9, 5, -15, 0, -2, 5, -15, ISO7816.INS_INCREASE, -63, -10, ISO7816.INS_ERASE_BINARY, -26, 8, 6, -16, 55, -60, -11, -26, 65, -56, -9, 10, 8, -10, 4, 61, ISO7816.INS_READ_RECORD2, 8, 12, -13, 78, -59, -10, -14, -11, 2, -27, 13, 3, -5, 76, -59, -29, 5, -5, -14, 21, -23, ISO7816.INS_ERASE_BINARY, 1, -5, 8, -11, 26, 8, -1, 15, 70, ISOFileInfo.A5, 2, 65, -90, 5, -1, 13, 0, -27, ISO7816.INS_ERASE_BINARY, -9, ISO7816.INS_CHANGE_CHV, -60, 26, -12, 27, -4, -11, 6, -2, -10};
    private static long asBinder = 7606471145877042190L;
    private static int access100 = -1776194565;
    private static char access000 = 27643;

    private static String $$c(short s, int i, short s2) {
        byte[] bArr = $$a;
        int i2 = s + 109;
        int i3 = (i * 4) + 4;
        int i4 = s2 * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 += i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i3];
            i3++;
            i2 = b + i2;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        boolean z;
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~i3;
        int i11 = i9 | (~(i7 | i10 | i4));
        int i12 = (~(i3 | i8)) | i7 | (~(i10 | i4));
        int i13 = i2 + i4 + i6 + (1112421973 * i) + ((-1897213938) * i5);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i2) - 781189120) + ((-1395624931) * i4) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i6) + ((-1446510592) * i) + (892338176 * i5) + ((-1657864192) * i14);
        int i16 = (i2 * 2010092721) + 1217064380 + (i4 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i6 * 2010091741) + (i * (-1378896031)) + (i5 * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 2) {
            return onExtraCallback(objArr);
        }
        if (i17 == 3) {
            return onNavigationEvent(objArr);
        }
        Function2 function2 = (Function2) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i18 = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i19 = IAuthTabCallbackStubProxy + 93;
            IAuthTabCallback_Parcel = i19 % 128;
            z = i19 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i20 = IAuthTabCallback_Parcel + 41;
            IAuthTabCallbackStubProxy = i20 % 128;
            int i21 = i20 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i22 = IAuthTabCallback_Parcel + 119;
                IAuthTabCallbackStubProxy = i22 % 128;
                int i23 = i22 % 2;
                Object[] objArr2 = new Object[1];
                b(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (24110 - (Process.myTid() >> 22)), new char[]{34159, 25402, 3618, 20616, 58102, 31540, 60881, 35821, 12622, 14642, 40852, 29583, 20158, 52053, 45650, 37152, 36323, 1507, 19068, 39930, 45886, 46754, 7978, 55254, 38424, 11356, 34532, 30233, 65387, 15693, 12695, 21589, 26651, 25361, 63157, 26161, 37150, 48052, 10095, 64419, 24625, 20426, 12376, 62039, 30121, 40404, 13072, 4634, 56325, 35434, 1978, 55993, 6564, 44432, 46496, 17359, 59667, 33621, 57627, 46793, 17125, 10048, 5535, 29918, 50506, 41237, 16631, 44073, 51805, 25707, 49009, 18060, 31877, 54128, 40011, 47319, 35872, 11538, 37984, 43662, 37160, 9668, 3154, 11362, 3184, 60509, 36369, 44949, 27142, 64713, 32061, 38266, 31973, 12661, 35780, 60332, 11167, 7684, 49672, 44931, 13377, 41004, 29368, 27174, 22501, 59869, 33397, 44208, 1332, 47475, 22842, 47687, 36088, 51605, 24250, 48702, 28836, 45162, 33879, 15378, 54268, 34984, 59603, 54913, 19413, 2495, 30036, 10245, 3990, 39550, 21380, 33900, 8844, 19123, 33741, 18855, 19051, 31921, 40320, 12557, 24964, 40193, 47061, 49556, 18723, 44237, 20208, 3219, 24494, 60967, 13818, 41817, 53368, 25907, 7485, 65318, 47363, 31515, 22303, 21260, 40781, 53930, 31446, 41747, 61529, 10670, 64935, 19386, 32114, 10073, 18692, 21314, 44837, 28165, 23318, 40010, 15195, 37878, 22662, 24632, 34077, 51574, 34697, 56468, 44434, 16507, 43461, 17236, 19209, 1271, 8351, 7969, 32195, 27559, 29927, 32910, 5232, 62848, 27237, 63050, 39911, 43044, 41290, 33392, 29271, 17739, 20443, 12142, 8536, 45817, 23010, 4923}, new char[]{25586, 34797, 11984, 35422}, new char[]{8181, 16995, 37122, 1461}, objArr2);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1182424128, iIntValue, -1, ((String) objArr2[0]).intern());
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(function1);
        }
        onExtraCallbackWithResult(function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RuntimeScheduler runtimeScheduler, getNameDistinguisher$onExtraCallbackWithResult getnamedistinguisher_onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(runtimeScheduler, getnamedistinguisher_onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(runtimeScheduler, getnamedistinguisher_onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        JsonObject jsonObject = (JsonObject) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        startRunning startrunning = (startRunning) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(jsonObject, zBooleanValue, startrunning);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        importValues importvalues = (importValues) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(importvalues, str);
        }
        onExtraCallback(importvalues, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1);
        int i4 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(RuntimeScheduler runtimeScheduler, getNameDistinguisher$onExtraCallbackWithResult getnamedistinguisher_onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(runtimeScheduler, getnamedistinguisher_onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), 2028934308, SvgPackage.21.onExtraCallbackWithResult(), objArr, -2028934308, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
        int i5 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getNameDistinguisher$onExtraCallbackWithResult getnamedistinguisher_onextracallbackwithresult, String str, Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(getnamedistinguisher_onextracallbackwithresult, str, function1);
        }
        IAuthTabCallback(getnamedistinguisher_onextracallbackwithresult, str, function1);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Ref.ObjectRef objectRef, Function0 function0, Function0 function02, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(objectRef, function0, function02, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 == 0) {
            throw null;
        }
    }

    getNameDistinguisher$onExtraCallbackWithResult(WebViewContentOwner webViewContentOwner, String str, String str2, FragmentActivity fragmentActivity) {
        this.onWarmupCompleted = webViewContentOwner;
        this.onNavigationEvent = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallbackWithResult = fragmentActivity;
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 43;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i5, i5);
                    int iLastIndexOf = 42 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
                    int trimmedLength = TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1451;
                    byte b = $$a[i5];
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iLastIndexOf, trimmedLength, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c2 = (char) (49123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1494;
                    byte b3 = (byte) ($$a[i5] - 1);
                    byte b4 = b3;
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, i8, packedPositionGroup, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char cAlpha = (char) (23972 - Color.alpha(i5));
                    int iAlpha = Color.alpha(i5) + 50;
                    int size = View.MeasureSpec.getSize(i5) + 22939;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAlpha, iAlpha, size, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i10 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i10);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(i5) + 45848);
                    int maxKeyCode = 29 - (KeyEvent.getMaxKeyCode() >> 16);
                    int packedPositionType = 12577 - ExpandableListView.getPackedPositionType(0L);
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, maxKeyCode, packedPositionType, 1401536470, false, "l", clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (access100 ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asBinder ^ 7798559133331975163L))) ^ ((char) (access000 ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i11 = $10 + 77;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i3 = i2;
                i5 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public void IAuthTabCallback(WebView webView) throws Throwable {
        ViewGroup caWebViewContainer;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, BuildConfig.FLAVOR);
            throw null;
        }
        Intrinsics.checkNotNullParameter(webView, BuildConfig.FLAVOR);
        startApp startapp = this.onWarmupCompleted;
        if (startapp == null) {
            startapp = null;
        }
        if (startapp != null) {
            caWebViewContainer = startapp.getCaWebViewContainer();
            int i3 = IAuthTabCallbackStubProxy + 111;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            caWebViewContainer = null;
        }
        if (caWebViewContainer != null) {
            caWebViewContainer.addView(webView, new ViewGroup.LayoutParams(-1, -1));
            if (webView.getVisibility() == 0) {
                int i5 = IAuthTabCallbackStubProxy + 21;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                webView.setVisibility(8);
                return;
            }
            return;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        TossCoreWebView webView2 = this.onWarmupCompleted.getWebView();
        String strOnExtraCallbackWithResult = webView2 != null ? webView2.onExtraCallbackWithResult() : null;
        Object[] objArr = new Object[1];
        a((short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-1533823341) - (ViewConfiguration.getEdgeSlop() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 555039479, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1130072730, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strOnExtraCallbackWithResult);
        Object[] objArr2 = new Object[1];
        b(2135229593 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{59699, 44107, 19166, 61912, 63435, 26085, 22744, 8413, 54047}, new char[]{39216, 17668, 24447, 6252}, new char[]{8181, 16995, 37122, 1461}, objArr2);
        Pair[] pairArr = {pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), this.onNavigationEvent)};
        Object[] objArr3 = new Object[1];
        b((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (27660 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), new char[]{47496, 62232, 50372, 18271, 54650, 29460, 54349, 11690, 12081, 26790, 24588, 58639, 4937, 61608}, new char[]{49375, 60385, 3284, 4460}, new char[]{8181, 16995, 37122, 1461}, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-1533823332) - (ViewConfiguration.getTouchSlop() >> 8), (-555039477) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 1130072746, objArr4);
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult(convertFloatArrayToByteArray, strIntern, ((String) objArr4[0]).intern(), access8100.onWarmupCompleted(pairArr), false, (String) null, 24, (Object) null);
        int i7 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallback(final JsonObject jsonObject, final boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, BuildConfig.FLAVOR);
        TossCoreWebView webView = this.onWarmupCompleted.getWebView();
        if (webView != null) {
            Object[] objArr = {webView, this.IAuthTabCallback, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    JsonObject jsonObject2 = jsonObject;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
                    return (Unit) getNameDistinguisher$onExtraCallbackWithResult.IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), 451745505, iOnExtraCallbackWithResult, new Object[]{jsonObject2, boolValueOf, (startRunning) obj}, -451745504, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                }
            }};
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            setTopGuideFontSize.IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1755743382);
            int i4 = IAuthTabCallback_Parcel + 87;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(JsonObject jsonObject, boolean z, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, BuildConfig.FLAVOR);
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            startrunning.onNavigationEvent(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(startrunning, BuildConfig.FLAVOR);
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        startrunning.onNavigationEvent(Boolean.valueOf(z));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = {1128461532, 395750955, -780261741, -436172901, -490805142, -327111716, -1992079728, -170007830, 1064200204, -791650738, 1399811614, 1053452771, 958697410, -2144098607, -62766713, 1652237066, 1731709201, -202879794};
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Ref.ObjectRef<IEngagementSignalsCallback_Parcel<Intent>> $launcher;
        final /* synthetic */ String $standardTermsCode;
        final /* synthetic */ getDummyAd $standardTermsV2Intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getDummyAd getdummyad, FragmentActivity fragmentActivity, String str, Ref.ObjectRef<IEngagementSignalsCallback_Parcel<Intent>> objectRef, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$standardTermsV2Intent = getdummyad;
            this.$activity = fragmentActivity;
            this.$standardTermsCode = str;
            this.$launcher = objectRef;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$standardTermsV2Intent, this.$activity, this.$standardTermsCode, this.$launcher, access13800Var);
            int i2 = onExtraCallbackWithResult + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = IAuthTabCallback;
            int i3 = -1469660336;
            long j = 0;
            int i4 = 0;
            if (iArr3 != null) {
                int i5 = $11 + 107;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), View.resolveSize(0, 0) + 72, 8849 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i6++;
                        i3 = -1469660336;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = IAuthTabCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i7 = 0;
                while (i7 < length3) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i7]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)), Drawable.resolveOpacity(i4, i4) + 72, 8847 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i4, i4), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                    int i8 = $11 + 49;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 0;
                }
                iArr5 = iArr6;
            }
            int i10 = i4;
            System.arraycopy(iArr5, i10, iArr4, i10, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i11 = $10 + 41;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i13 = $10 + 97;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                for (int i15 = 0; i15 < 16; i15++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22251), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.resolveSize(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 78, 7397 - ExpandableListView.getPackedPositionChild(0L), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr2, 0, i);
            int i19 = $11 + 101;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            objArr[0] = str;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyad = this.$standardTermsV2Intent;
                FragmentActivity fragmentActivity = this.$activity;
                String str = this.$standardTermsCode;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyad, fragmentActivity, str, (String) null, (String) null, 0L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388604, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i3 = onExtraCallbackWithResult + 95;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 94 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{452446448, -1209921635, 1302897242, -1462270607, 25931987, 230348975, -736887891, 1875046949, -692202142, 378733793, -87510689, -795025064, 1282214726, 2040745586, -1060569532, 546092274, -1603967546, 538354842, 1417535658, -2078727076, -425757268, 1293431073, 1933177708, 1786998399}, 47 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = onExtraCallback + 109;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            SessionTrackera.Companion.onExtraCallback((IEngagementSignalsCallback_Parcel) this.$launcher.element).onNavigationEvent((Intent) objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    public void onExtraCallbackWithResult(RuntimeScheduler runtimeScheduler, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(runtimeScheduler, BuildConfig.FLAVOR);
        WebView webViewIAuthTabCallbackDefault = runtimeScheduler.IAuthTabCallbackDefault();
        if (webViewIAuthTabCallbackDefault == null) {
            return;
        }
        if (!(!z)) {
            i = 0;
        } else {
            int i5 = IAuthTabCallbackStubProxy + 37;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            i = 4;
        }
        webViewIAuthTabCallbackDefault.setVisibility(i);
        if (webViewIAuthTabCallbackDefault.getVisibility() == 0) {
            webViewIAuthTabCallbackDefault.setDownloadListener(new setBackgroundAlpha(webViewIAuthTabCallbackDefault, zzaj.onNavigationEvent().onUnminimized()));
        } else {
            webViewIAuthTabCallbackDefault.setDownloadListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 androidx.compose.ui.platform.ComposeView) = (r1v4 androidx.compose.ui.platform.ComposeView), (r1v6 androidx.compose.ui.platform.ComposeView) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(RuntimeScheduler runtimeScheduler) {
        ComposeView composeViewOnExtraCallbackWithResult;
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            composeViewOnExtraCallbackWithResult = runtimeScheduler.onExtraCallbackWithResult();
            int i3 = 72 / 0;
            if (composeViewOnExtraCallbackWithResult != null) {
                ViewParent parent = composeViewOnExtraCallbackWithResult.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                    int i4 = IAuthTabCallbackStubProxy + 33;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(composeViewOnExtraCallbackWithResult);
                }
            }
        } else {
            composeViewOnExtraCallbackWithResult = runtimeScheduler.onExtraCallbackWithResult();
            if (composeViewOnExtraCallbackWithResult != null) {
            }
        }
        runtimeScheduler.onNavigationEvent((ComposeView) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r1
      0x0064: PHI (r1v13 android.view.ViewGroup) = (r1v12 android.view.ViewGroup), (r1v15 android.view.ViewGroup) binds: [B:22:0x0062, B:19:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(RuntimeScheduler runtimeScheduler, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        KeyEvent.Callback decorView;
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        ViewGroup viewGroup2 = null;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.getWindow();
            throw null;
        }
        Window window = this.onExtraCallbackWithResult.getWindow();
        if (window != null) {
            int i3 = IAuthTabCallback_Parcel + 7;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        if (decorView instanceof ViewGroup) {
            int i5 = IAuthTabCallbackStubProxy + 69;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                viewGroup2.hashCode();
                throw null;
            }
            viewGroup2 = (ViewGroup) decorView;
        }
        if (viewGroup2 != null) {
            int i6 = IAuthTabCallback_Parcel + 47;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.content);
                int i7 = 10 / 0;
                if (viewGroup != null) {
                    ComposeView composeView = new ComposeView(this.onExtraCallbackWithResult, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    composeView.onNavigationEvent(ZslRingBuffer.onExtraCallbackWithResult.onExtraCallbackWithResult);
                    composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1182424128, true, new Function2() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda8
                        public final Object invoke(Object obj, Object obj2) {
                            return getNameDistinguisher$onExtraCallbackWithResult.onWarmupCompleted(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                    })));
                    runtimeScheduler.onNavigationEvent(composeView);
                    viewGroup.addView((View) runtimeScheduler.onExtraCallbackWithResult(), new ViewGroup.LayoutParams(-1, -1));
                }
            } else {
                viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.content);
                if (viewGroup != null) {
                }
            }
        }
        int i8 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        Object obj;
        Object obj2;
        boolean z = false;
        final getNameDistinguisher$onExtraCallbackWithResult getnamedistinguisher_onextracallbackwithresult = (getNameDistinguisher$onExtraCallbackWithResult) objArr[0];
        final importValues importvalues = (importValues) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr2 = new Object[1];
                a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1533823737) - View.getDefaultSize(0, 0), (-555039458) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 1130072908, objArr2);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(134269403, iIntValue, -1, ((String) objArr2[0]).intern());
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        RVFragment7 rVFragment7OnNavigationEvent = importvalues.onNavigationEvent();
        if (((iIntValue & 112) ^ 48) > 32) {
            int i4 = IAuthTabCallbackStubProxy + 9;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getnamedistinguisher_onextracallbackwithresult)) {
                if ((iIntValue & 48) == 32) {
                    z = true;
                } else {
                    int i6 = IAuthTabCallbackStubProxy + 5;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        Object obj3 = null;
        if (!z) {
            int i8 = IAuthTabCallbackStubProxy + 91;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj3.hashCode();
                throw null;
            }
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Function2 function2 = new Function2() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj4, Object obj5) {
                        return getNameDistinguisher$onExtraCallbackWithResult.onWarmupCompleted(this.f$0, (String) obj4, (Function1) obj5);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function2);
                obj = function2;
            }
        }
        Function2 function22 = (Function2) obj;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(importvalues);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            obj2 = objOnMinimized2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Function1 function1 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda6
                    public final Object invoke(Object obj4) {
                        Object[] objArr3 = {importvalues, (String) obj4};
                        return (Unit) getNameDistinguisher$onExtraCallbackWithResult.IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), -289873458, SvgPackage.21.onExtraCallbackWithResult(), objArr3, 289873461, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                int i9 = IAuthTabCallback_Parcel + 67;
                IAuthTabCallbackStubProxy = i9 % 128;
                obj2 = function1;
                if (i9 % 2 != 0) {
                    int i10 = 3 % 4;
                    obj2 = function1;
                }
            }
        }
        LoadingView.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{rVFragment7OnNavigationEvent, function22, (Function1) obj2, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RVFragment7.onNavigationEvent), 8}, 2012774481, -2012774477);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = IAuthTabCallbackStubProxy + 111;
            IAuthTabCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(getNameDistinguisher$onExtraCallbackWithResult getnamedistinguisher_onextracallbackwithresult, String str, final Function1 function1) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        getnamedistinguisher_onextracallbackwithresult.onNavigationEvent(str, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda2
            public final Object invoke() {
                return getNameDistinguisher$onExtraCallbackWithResult.IAuthTabCallback(function1);
            }
        }, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda3
            public final Object invoke() {
                return getNameDistinguisher$onExtraCallbackWithResult.onNavigationEvent(function1);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(importValues importvalues, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        WebView webViewIAuthTabCallbackDefault = importvalues.onWarmupCompleted().IAuthTabCallbackDefault();
        if (webViewIAuthTabCallbackDefault != null) {
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            setTopGuideFontSize.IAuthTabCallback(new Object[]{webViewIAuthTabCallbackDefault, str, null, 2, null}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 57251240, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -57251238);
            int i2 = IAuthTabCallbackStubProxy + 101;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onExtraCallbackWithResult(final RuntimeScheduler runtimeScheduler, RVFragment7 rVFragment7) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(runtimeScheduler, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(rVFragment7, BuildConfig.FLAVOR);
        if (runtimeScheduler.onExtraCallbackWithResult() == null) {
            onExtraCallbackWithResult(runtimeScheduler, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallbackWithResult(-480661192, true, new Function2() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return getNameDistinguisher$onExtraCallbackWithResult.onNavigationEvent(runtimeScheduler, this, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }));
        }
        int i4 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(RuntimeScheduler runtimeScheduler, getNameDistinguisher$onExtraCallbackWithResult getnamedistinguisher_onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        importValues importvaluesOnExtraCallback;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = IAuthTabCallbackStubProxy + 29;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 20 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    Object[] objArr = new Object[1];
                    b((-139098794) - View.resolveSize(0, 0), (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 53917), new char[]{25350, 41712, 10555, 55643, 45453, 46604, 29428, 31243, 1344, 12169, 44549, 5604, 64330, 43546, 3604, 2164, 62907, 40753, 10054, 23694, 47087, 25634, 42206, 5975, 10987, 628, 5735, 38809, 42297, 10053, 8773, 29330, 22749, 27793, 6492, 51909, 27381, 53247, 26105, 53364, 33652, 33641, 43976, 63507, 4467, 61822, 38776, 59130, 41426, 38307, 54458, 25999, 23844, 3368, 13969, 7545, 33292, 12364, 58826, 1037, 41056, 27568, 8893, 49716, 2672, 4964, 17135, 64565, 59568, 26737, 57562, 31391, 8314, 144, 44057, 15247, 13226, 63314, 34907, 53382, 4154, 8966, 30422, 54456, 44677, 13528, 18991, 59998, 6499, 55236, 905, 19976, 9109, 37110, 33751, 28355, 61845, 64343, 49763, 41344, 25724, 37778, 46520, 26369, 22380, 19792, 27347, 10266, 9112, 40148, 49709, 'V', 42939, 11727, 34035, 20034, 52102, 53175, 52677, 53590, 63703, 9152, 62984, 12363, 8774, 22451, 49898, 4690, 2080, 20911, 59176, 51087, 30371, 59111, 49262, 14435, 45443, 63964, 24030, 54736, 37341, 39215, 51931, 1928, 17723, 38778, 989, 64460, 36394, 11268, 46630, 18232, 26342, 59684, 59841, 18784, 25876, 1476, 46711, 55442, 2169, 29835, 6944, 56577, 14300, 48701, 34477, 10093, 32865, 60726, 51954, 49562, 45421, 5089, 6546, 2423, 6875, 12752, 681, 25448, 2603, 49559, 62450, 17619, 53316, 50930, 22293, 56227, 47940, 32636, 58138, 55266, 11865, 24908, 61232, 63553, 29646}, new char[]{22267, 46469, 40439, 44498}, new char[]{8181, 16995, 37122, 1461}, objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-480661192, i, -1, ((String) objArr[0]).intern());
                }
                Object obj = null;
                importvaluesOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<importValues>) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(runtimeScheduler.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7));
                if (importvaluesOnExtraCallback == null) {
                    int i5 = IAuthTabCallback_Parcel + 93;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    if (!Intrinsics.areEqual(importvaluesOnExtraCallback.onWarmupCompleted(), runtimeScheduler)) {
                        importvaluesOnExtraCallback = null;
                    }
                    if (importvaluesOnExtraCallback == null) {
                        int i7 = IAuthTabCallbackStubProxy + 61;
                        IAuthTabCallback_Parcel = i7 % 128;
                        int i8 = i7 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(43568089);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(43568090);
                        IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), -1511178019, SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamedistinguisher_onextracallbackwithresult, importvaluesOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0}, 1511178021, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i9 = IAuthTabCallback_Parcel + 91;
                        IAuthTabCallbackStubProxy = i9 % 128;
                        if (i9 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i10 = IAuthTabCallback_Parcel + 63;
                        IAuthTabCallbackStubProxy = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 4 % 3;
                        }
                    }
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                Object obj2 = null;
                importvaluesOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<importValues>) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(runtimeScheduler.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7));
                if (importvaluesOnExtraCallback == null) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public View IAuthTabCallback(final RuntimeScheduler runtimeScheduler) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(runtimeScheduler, BuildConfig.FLAVOR);
        ComposeView composeView = new ComposeView(this.onExtraCallbackWithResult, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onExtraCallbackWithResult.onExtraCallbackWithResult);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(729092473, true, new Function2() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda7
            public final Object invoke(Object obj, Object obj2) {
                return getNameDistinguisher$onExtraCallbackWithResult.onExtraCallback(runtimeScheduler, this, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })));
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return composeView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(RuntimeScheduler runtimeScheduler, getNameDistinguisher$onExtraCallbackWithResult getnamedistinguisher_onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback_Parcel + 53;
            IAuthTabCallbackStubProxy = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallbackStubProxy + 79;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                a((short) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1533823551) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), (-555039459) - View.MeasureSpec.makeMeasureSpec(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 1130072930, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(729092473, i, -1, ((String) objArr[0]).intern());
            }
            importValues importvaluesOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<importValues>) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(runtimeScheduler.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7));
            if (importvaluesOnNavigationEvent == null) {
                int i6 = IAuthTabCallbackStubProxy + 51;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(744385284);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(744385284);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(744385285);
                IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), -1511178019, SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getnamedistinguisher_onextracallbackwithresult, importvaluesOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 0}, 1511178021, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStubProxy + 101;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public void onExtraCallback(RuntimeScheduler runtimeScheduler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(runtimeScheduler, BuildConfig.FLAVOR);
        onNavigationEvent(runtimeScheduler);
        int i4 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019b A[PHI: r4
      0x019b: PHI (r4v4 int) = (r4v3 int), (r4v10 int) binds: [B:16:0x0082, B:34:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackDefault)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (Process.myPid() >> 22)), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 103;
                $10 = i8 % 128;
                if (i8 % 2 == 0) {
                    z = true;
                }
                if (!z) {
                    j = -4629411779493505016L;
                } else {
                    byte[] bArr2 = asInterface;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i9 = 0;
                        while (i9 < length2) {
                            int i10 = $10 + 69;
                            $11 = i10 % 128;
                            int i11 = i10 % i6;
                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) ($$a[0] - 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12843), View.resolveSizeAndState(0, 0, 0) + 55, 2167 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -299036574, false, $$c((byte) ($$b & 30), b2, b2), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            i6 = 2;
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = asInterface;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41, 22439 - (KeyEvent.getMaxKeyCode() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                            j = -4629411779493505016L;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (IAuthTabCallbackStub[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i12 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j));
                    if (z) {
                        int i13 = $10 + 103;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onTransact), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 86 - Gravity.getAbsoluteGravity(0, 0), KeyEvent.normalizeMetaState(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = asInterface;
                    if (bArr5 != null) {
                        int i15 = $11 + 105;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                            i5++;
                        }
                        bArr5 = bArr;
                    }
                    boolean z2 = bArr5 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i16 = $11 + 35;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        if (z2) {
                            byte[] bArr6 = asInterface;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            }
            int i18 = $10 + 43;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            z = false;
            if (!z) {
            }
            if (iIntValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final void onExtraCallbackWithResult(Ref.ObjectRef objectRef, Function0 function0, Function0 function02, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, BuildConfig.FLAVOR);
        r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d0IAuthTabCallback = r8lambda6v0yvgpvgcqzeji1gnetqsiyse.IAuthTabCallback();
        IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel = (IEngagementSignalsCallback_Parcel) objectRef.element;
        if (iEngagementSignalsCallback_Parcel != null) {
            int i2 = IAuthTabCallback_Parcel + 69;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            iEngagementSignalsCallback_Parcel.onWarmupCompleted();
        }
        if (r8lambdahekmogpxfnmskbbrjd3t2vn5d0IAuthTabCallback.isSucceed()) {
            function0.invoke();
            return;
        }
        function02.invoke();
        int i4 = IAuthTabCallback_Parcel + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onNavigationEvent(String str, final Function0<Unit> function0, final Function0<Unit> function02) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            int i5 = i2 + 77;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            function0.invoke();
            int i7 = IAuthTabCallback_Parcel + 45;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        getDummyAd getdummyadOnNavigationEvent = getDummyAd.Companion.onNavigationEvent(this.onExtraCallbackWithResult);
        UUID uuidRandomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 125), new char[]{33642, 60969, 28431, 51770, 7138, 38225, 13708, 17669, 2798, 32555, 24342, 61585, 25787, 37951, 26854, 20192, 60791, 15290}, new char[]{36230, 21882, 32221, 61952}, new char[]{8181, 16995, 37122, 1461}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(uuidRandomUUID);
        String string = sb.toString();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.onExtraCallbackWithResult.getActivityResultRegistry().onExtraCallback(string, AppLovinAdImpl.onExtraCallbackWithResult(), new onSessionEnded() { // from class: viva.republica.toss.common.web.message.handlers.cascraping.InvokeScrapingMessageHandler$onHandleWebMessage$3$$ExternalSyntheticLambda1
            public final void onActivityResult(Object obj) {
                getNameDistinguisher$onExtraCallbackWithResult.onWarmupCompleted(objectRef, function0, function02, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
            }
        });
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(getdummyadOnNavigationEvent, this.onExtraCallbackWithResult, str, objectRef, null), 3, (Object) null);
        int i9 = IAuthTabCallbackStubProxy + 43;
        IAuthTabCallback_Parcel = i9 % 128;
        int i10 = i9 % 2;
    }

    private static final importValues onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<importValues> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        importValues importvalues = (importValues) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return importvalues;
    }

    private static final importValues onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<importValues> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        importValues importvalues = (importValues) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return importvalues;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(importValues importvalues, String str) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), -289873458, iOnExtraCallbackWithResult, new Object[]{importvalues, str}, 289873461, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(JsonObject jsonObject, boolean z, startRunning startrunning) {
        Object[] objArr = {jsonObject, Boolean.valueOf(z), startrunning};
        return (Unit) IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), 451745505, SvgPackage.21.onExtraCallbackWithResult(), objArr, -451745504, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    private final void onExtraCallback(importValues importvalues, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object[] objArr = {this, importvalues, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), -1511178019, SvgPackage.21.onExtraCallbackWithResult(), objArr, 1511178021, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), 2028934308, SvgPackage.21.onExtraCallbackWithResult(), objArr, -2028934308, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }
}
