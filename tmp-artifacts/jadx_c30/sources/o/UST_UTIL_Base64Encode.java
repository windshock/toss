package o;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.SetDetectableSize;
import o.UST_UTIL_Base64Encode;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_UTIL_Base64Encode {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final UST_UTIL_Base64Encode IAuthTabCallback;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;

    static {
        onNavigationEvent();
        IAuthTabCallback = new UST_UTIL_Base64Encode();
        int i = asBinder + 1;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CRLDistPoint cRLDistPoint, UST_CERT_VerifyEnvelopeVID uST_CERT_VerifyEnvelopeVID, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cRLDistPoint, uST_CERT_VerifyEnvelopeVID, setDetectableSize);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        int i5 = onExtraCallback + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private UST_UTIL_Base64Encode() {
    }

    public final void onNavigationEvent(@NotNull final UST_CERT_VerifyEnvelopeVID uST_CERT_VerifyEnvelopeVID, @NotNull final CRLDistPoint cRLDistPoint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uST_CERT_VerifyEnvelopeVID, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(cRLDistPoint, BuildConfig.FLAVOR);
        ConvertByteArrayToFloatArray.onWarmupCompleted("credential_deleted", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.dashboard.util.DashboardLogger$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UST_UTIL_Base64Encode.IAuthTabCallback(cRLDistPoint, uST_CERT_VerifyEnvelopeVID, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
    }

    private static final Unit onWarmupCompleted(CRLDistPoint cRLDistPoint, UST_CERT_VerifyEnvelopeVID uST_CERT_VerifyEnvelopeVID, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 6, 128, 5}, true, new byte[]{1, 0, 0, 0, 1, 0}, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), cRLDistPoint.onNavigationEvent());
        setDetectableSize.onExtraCallback().put("error_message", cRLDistPoint.IAuthTabCallback());
        setDetectableSize.onExtraCallback().put(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_METHOD, uST_CERT_VerifyEnvelopeVID.onWarmupCompleted());
        setDetectableSize.onExtraCallback().put("vendor_type", uST_CERT_VerifyEnvelopeVID.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback().put("vendor_code", Integer.valueOf(uST_CERT_VerifyEnvelopeVID.onExtraCallback()));
        setDetectableSize.onExtraCallback().put("execution_id", cRLDistPoint.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 35283), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 36, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i8 = $10 + 77;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64, (ViewConfiguration.getLongPressTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), 29 - ExpandableListView.getPackedPositionType(0L), AndroidCharacter.getMirror('0') + 17609, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49466), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 71, 12487 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i12 = $11 + 83;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            int i15 = $11 + 31;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i17 = $11 + 35;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i19 = $11 + 91;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{27193, 27327, 27300, 27309, 27301, 27326};
    }
}
