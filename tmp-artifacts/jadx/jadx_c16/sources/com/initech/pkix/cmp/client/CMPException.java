package com.initech.pkix.cmp.client;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CMPException extends Exception {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int CA_MESSAGE_CHECK_ERROR = 6;
    public static final short CLASS_CMPTransportFactory = 101;
    public static final short CLASS_HTTPCMPTransportCMP1999 = 102;
    public static final short CLASS_PKICMP_SignGate = 105;
    public static final short CLASS_PKICMP_SignKorea = 104;
    public static final short CLASS_PKICMP_YesSign = 100;
    public static final short CLASS_TCPCMPTransport = 103;
    public static final short ERROR_1000 = 1000;
    public static final short ERROR_1001 = 1001;
    public static final short ERROR_1002 = 1002;
    public static final short ERROR_1003 = 1003;
    public static final short ERROR_1004 = 1004;
    public static final short ERROR_1005 = 1005;
    public static final short ERROR_1006 = 1006;
    public static final short ERROR_1007 = 1007;
    public static final short ERROR_1008 = 1008;
    public static final short ERROR_1009 = 1009;
    public static final short ERROR_1010 = 1010;
    public static final short ERROR_1011 = 1011;
    public static final short ERROR_1012 = 1012;
    public static final short ERROR_2000 = 2000;
    public static final short ERROR_2001 = 2001;
    public static final short ERROR_2002 = 2002;
    public static final short ERROR_2003 = 2003;
    public static final short ERROR_2004 = 2004;
    public static final short ERROR_3000 = 3000;
    public static final short ERROR_3001 = 3001;
    public static final short ERROR_4000 = 4000;
    public static final short ERROR_4001 = 4001;
    public static final int INTERNAL_ERROR = 1;
    public static final int INVALIDPARAM_ERROR = 4;
    public static final int KEYSTORE_ERROR = 3;
    public static final short METHOD_PKICMP_SignGate = 101;
    public static final short METHOD_PKICMP_YesSign = 100;
    public static final short METHOD_checkMsg = 105;
    public static final short METHOD_checkPKIStatusInfo = 109;
    public static final short METHOD_getCMPTransport = 103;
    public static final short METHOD_loadPrivateKey = 112;
    public static final short METHOD_process = 104;
    public static final short METHOD_requestGENM = 102;
    public static final short METHOD_requestIR = 108;
    public static final short METHOD_requestKRR = 110;
    public static final short METHOD_requestKUR = 111;
    public static final short METHOD_setFromKeyStore = 107;
    public static final short METHOD_throwError = 106;
    public static final int TRANSPORT_ERROR = 2;
    public static final int UNKNOWN_ERROR = 5;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted = {27236, 27167, 27138, 27138, 27136, 27165, 27164, 27160, 27164, 27141, 27164, 27166, 27166};
    private int a;
    private short b;
    private short c;
    private short d;
    private String e;

    public CMPException() {
        this(5, "");
    }

    public CMPException(int i) {
        this(i, "");
    }

    public CMPException(String str) {
        this(5, str);
    }

    public CMPException(int i, String str) {
        this.b = (short) -1;
        this.c = (short) -1;
        this.d = (short) -1;
        if (i <= 0 || i > 6) {
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            i = 5;
        }
        this.a = i;
        this.e = str;
        int i5 = onExtraCallbackWithResult + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public CMPException(int i, short s, short s2, short s3, String str) {
        this.b = (short) -1;
        this.c = (short) -1;
        this.d = (short) -1;
        if (i <= 0 || i > 6) {
            int i2 = 2 % 2;
            i = 5;
        }
        this.a = i;
        Object obj = null;
        if (s != -1) {
            int i3 = onExtraCallback + 105;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (s2 != -1 && s3 != -1) {
                int i5 = i4 + 115;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    this.b = s;
                    this.c = s2;
                    this.d = s3;
                    throw null;
                }
                this.b = s;
                this.c = s2;
                this.d = s3;
                int i6 = 2 % 2;
            }
        }
        this.e = str;
        int i7 = onExtraCallbackWithResult + 101;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public int getErrorCategory() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.a;
        int i6 = i2 + 103;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.e;
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public short getErrorCode() {
        short s;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            s = this.b;
            int i4 = 54 / 0;
        } else {
            s = this.b;
        }
        int i5 = i2 + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return s;
    }

    public short getClassCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        short s = this.c;
        int i5 = i2 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return s;
    }

    public short getMethodCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        short s = this.d;
        int i4 = i2 + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return s;
        }
        throw null;
    }

    private static String a(int i) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        if (i == 1) {
            int i3 = onExtraCallbackWithResult + 93;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return "INTERNAL_ERROR";
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 63;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        if (i == 2) {
            return "TRANSPORT_ERROR";
        }
        int i7 = i5 + 123;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            if (i == 5) {
                return "KEYSTORE_ERROR";
            }
        } else if (i == 3) {
            return "KEYSTORE_ERROR";
        }
        if (i == 4) {
            return "INVALIDPARAM_ERROR";
        }
        int i8 = i5 + 99;
        int i9 = i8 % 128;
        onExtraCallbackWithResult = i9;
        int i10 = i8 % 2;
        if (i == 6) {
            return "CA_MESSAGE_ERROR";
        }
        int i11 = i9 + 71;
        onExtraCallback = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            f(new int[]{0, 13, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            f(new int[]{0, 13, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1}, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0180 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:26:0x009c, B:28:0x00b3, B:29:0x00e5, B:43:0x0173, B:45:0x0180, B:46:0x01b8, B:35:0x010a, B:37:0x0121, B:38:0x0151), top: B:71:0x009c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        Object objOnExtraCallback;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onWarmupCompleted;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getOffsetBefore("", 0)), 35 - (Process.myPid() >> 22), 14239 - View.resolveSize(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i7 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 10935), 64 - TextUtils.indexOf((CharSequence) "", '0'), ((byte) KeyEvent.getModifierMetaStateMask()) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i7] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr3)).charValue();
                        int i8 = $10 + 31;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 29, 17656 - ((byte) KeyEvent.getModifierMetaStateMask()), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr4)).charValue();
                    int i11 = $11 + 7;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 3 / 3;
                    }
                    char c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49467), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 69, 12487 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback).invoke(null, objArr5);
                    c = c2;
                }
                char c22 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr52 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback == null) {
                }
                ((Method) objOnExtraCallback).invoke(null, objArr52);
                c = c22;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i13 = $11 + 119;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 1, cArr5, 1, i3);
                System.arraycopy(cArr5, 1, cArr3, i3 * i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 1, i3 << i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i14 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i14, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i14);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i15 = $10 + 109;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        objArr[0] = str;
    }

    @Override // java.lang.Throwable
    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = new String("[" + a(this.a) + "]" + this.e);
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public String getGuideMessage() throws Throwable {
        int i = 2 % 2;
        String strA = a(this.a);
        if (this.b != -1) {
            String str = new String(this.e);
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
        String str2 = new String("[" + strA + "]" + this.e);
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }
}
