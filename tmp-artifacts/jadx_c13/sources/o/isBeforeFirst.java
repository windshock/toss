package o;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class isBeforeFirst extends isLast {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final sz1 IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private int errorCode;
    private String text;

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.text;
        int i4 = i3 + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        onExtraCallback();
        sz1 sz1Var = new sz1("EDNS Extended Error Codes", 1);
        IAuthTabCallback = sz1Var;
        sz1Var.onNavigationEvent(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        sz1Var.onWarmupCompleted("EDE");
        sz1Var.IAuthTabCallback(0, "OTHER");
        sz1Var.IAuthTabCallback(1, "UNSUPPORTED_DNSKEY_ALGORITHM");
        sz1Var.IAuthTabCallback(2, "UNSUPPORTED_DS_DIGEST_TYPE");
        sz1Var.IAuthTabCallback(3, "STALE_ANSWER");
        sz1Var.IAuthTabCallback(4, "FORGED_ANSWER");
        sz1Var.IAuthTabCallback(5, "DNSSEC_INDETERMINATE");
        sz1Var.IAuthTabCallback(6, "DNSSEC_BOGUS");
        sz1Var.IAuthTabCallback(7, "SIGNATURE_EXPIRED");
        sz1Var.IAuthTabCallback(8, "SIGNATURE_NOT_YET_VALID");
        sz1Var.IAuthTabCallback(9, "DNSKEY_MISSING");
        sz1Var.IAuthTabCallback(10, "RRSIGS_MISSING");
        sz1Var.IAuthTabCallback(11, "NO_ZONE_KEY_BIT_SET");
        sz1Var.IAuthTabCallback(12, "NSEC_MISSING");
        sz1Var.IAuthTabCallback(13, "CACHED_ERROR");
        sz1Var.IAuthTabCallback(14, "NOT_READY");
        sz1Var.IAuthTabCallback(15, "BLOCKED");
        sz1Var.IAuthTabCallback(16, "CENSORED");
        sz1Var.IAuthTabCallback(17, "FILTERED");
        sz1Var.IAuthTabCallback(18, "PROHIBITED");
        sz1Var.IAuthTabCallback(19, "STALE_NXDOMAIN_ANSWER");
        sz1Var.IAuthTabCallback(20, "NOT_AUTHORITATIVE");
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 4, 0, 6, 3, '\t', 13867, 13867, 5, '\n', 3, 6, 13887}, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 96), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, objArr);
        sz1Var.IAuthTabCallback(21, ((String) objArr[0]).intern());
        sz1Var.IAuthTabCallback(22, "NO_REACHABLE_AUTHORITY");
        sz1Var.IAuthTabCallback(23, "NETWORK_ERROR");
        sz1Var.IAuthTabCallback(24, "INVALID_DATA");
        sz1Var.IAuthTabCallback(25, "SIGNATURE_EXPIRED_BEFORE_VALID");
        sz1Var.IAuthTabCallback(26, "TOO_EARLY");
        sz1Var.IAuthTabCallback(27, "UNSUPPORTED_NSEC3_ITERATIONS_VALUE");
        sz1Var.IAuthTabCallback(28, "UNABLE_TO_CONFORM_TO_POLICY");
        sz1Var.IAuthTabCallback(29, "SYNTHESIZED");
        sz1Var.IAuthTabCallback(30, "INVALID_QUERY_TYPE");
        int i = onNavigationEvent + 43;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    isBeforeFirst() {
        super(15);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 61;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 26, View.MeasureSpec.makeMeasureSpec(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                f = 0.0f;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        char c = '0';
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 1), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 27, 23139 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i6 = $11 + 91;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0) + 24825), 74 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0) + 31, (ViewConfiguration.getEdgeSlop() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i11 = $10 + Imgproc.COLOR_YUV2RGBA_YVYU;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                c = '0';
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public isBeforeFirst(int i, String str) {
        super(15);
        this.errorCode = i;
        this.text = str;
    }

    @Override // o.isLast
    void onWarmupCompleted(getBlob getblob) throws IOException {
        int i = 2 % 2;
        this.errorCode = getblob.onExtraCallbackWithResult();
        if (getblob.IAuthTabCallbackDefault() > 0) {
            int i2 = IAuthTabCallbackDefault + 5;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            byte[] bArrOnExtraCallback = getblob.onExtraCallback();
            int length = bArrOnExtraCallback.length;
            if (bArrOnExtraCallback[bArrOnExtraCallback.length - 1] == 0) {
                length--;
            }
            this.text = new String(bArrOnExtraCallback, 0, length, StandardCharsets.UTF_8);
            int i4 = asInterface + 109;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 3;
            }
        }
    }

    @Override // o.isLast
    void onNavigationEvent(deactivate deactivateVar) {
        int i = 2 % 2;
        deactivateVar.IAuthTabCallback(this.errorCode);
        String str = this.text;
        if (str == null || str.isEmpty()) {
            return;
        }
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        deactivateVar.onNavigationEvent(this.text.getBytes(StandardCharsets.UTF_8));
        int i4 = IAuthTabCallbackDefault + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.isLast
    String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.text != null) {
            String str = IAuthTabCallback.IAuthTabCallback(this.errorCode) + ": " + this.text;
            int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
        int i6 = i3 + 27;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            IAuthTabCallback.IAuthTabCallback(this.errorCode);
            throw null;
        }
        String strIAuthTabCallback = IAuthTabCallback.IAuthTabCallback(this.errorCode);
        int i7 = asInterface + 103;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{51247, 64992, 64999, 51245, 65004, 51243, 65020, 65014, 65021, 64993, 65015, 64998, 51244, 51240, 51242, 64995};
        onWarmupCompleted = (char) 51245;
    }
}
