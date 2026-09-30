package com.initech.xsafe.iniplugin;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.initech.core.x509.x509CertificateInfo;
import com.initech.pkix.cmp.client.CMPException;
import com.initech.xsafe.util.mlog.IniSafeLog;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CMPResult {
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
    private static byte[] onExtraCallbackWithResult;
    public boolean a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public String f;
    public short g = -1;
    public short h = -1;
    public short i = -1;
    public Exception j;
    private static final byte[] $$a = {7, 80, 121, 38};
    private static final int $$b = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallback = -904626685;
    private static int onNavigationEvent = -1538804027;
    private static int onWarmupCompleted = 43595532;
    private static short[] onExtraCallback = {18756, 27413, -10161, -14242, -13520, 15760, -25146, 4619, 10952, -8410, 10131, -6557, 24727, -10421, -9946, 8491, -8257, -8072, 25015, -12277, -12062, 9800, -7933, -10110, -10143, 18756, -27380, -10158, 10323, 9417, 10414, -13317, -9083, 25458, -29658, 10926, 11082, 7770, -4273, 4213, -4101, 10169, 8038, -2318, -11998, -15598, 29537, -6317, 12031, -9671, 18755, -27424, 10166, 14263, 9325, 10306, -13281, -9095, 25494, -29734, 10818, 10990, 7614, -4445, 4265, -8161, 10077, 8090, -6466, 12051, -9763, 7922, 10099, 10132};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        byte[] bArr = $$a;
        int i2 = s2 * 4;
        int i3 = 4 - (s * 4);
        ?? r8 = (b * 3) + 115;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            byte b2 = r8;
            i = i3;
            i3 += -b2;
            i++;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            b2 = bArr[i];
            i3 += -b2;
            i++;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
            }
        } else {
            i = i3;
            i3 = r8;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
            }
        }
    }

    public short getClassCode() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        short s = this.h;
        int i5 = i3 + 23;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return s;
        }
        throw null;
    }

    public byte[] getEncPrivateKey() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public short getErrorCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        short s = this.g;
        int i5 = i3 + 21;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return s;
    }

    public Exception getEx() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Exception exc = this.j;
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return exc;
    }

    public byte[] getKmEncPrivateKey() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        byte[] bArr = this.e;
        int i5 = i3 + 95;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    public short getMethodCode() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 25;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        short s = this.i;
        int i5 = i2 + 71;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return s;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public byte[] getUserCert() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public byte[] getUserKmCert() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        byte[] bArr = this.d;
        int i5 = i3 + 49;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return bArr;
    }

    public boolean isSuccess() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 51;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.a;
        int i5 = i2 + 43;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setClassCode(short s) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.h = s;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setEncPrivateKey(byte[] bArr) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.c = bArr;
        int i5 = i3 + 99;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setErrorCode(short s) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.g = s;
        int i5 = i3 + 97;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setErrorMsg(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.f = str;
        int i5 = i3 + 33;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setEx(Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.j = exc;
        int i5 = i3 + 115;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setKmEncPrivateKey(byte[] bArr) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.e = bArr;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 65;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    public void setMethodCode(short s) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.i = s;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSuccess(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.a = z;
        int i5 = i2 + 47;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setUserCert(byte[] bArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.b = bArr;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 55;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setUserKmCert(byte[] bArr) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.d = bArr;
        int i5 = i3 + 65;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public X509Certificate getX509UserCert() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            X509Certificate x509CertificateLoadCertificate = x509CertificateInfo.loadCertificate(this.b);
            int i4 = asBinder + 57;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return x509CertificateLoadCertificate;
        } catch (Exception unused) {
            return null;
        }
    }

    public X509Certificate getX509UserKmCert() {
        X509Certificate x509CertificateLoadCertificate;
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                x509CertificateLoadCertificate = x509CertificateInfo.loadCertificate(this.d);
                int i3 = 18 / 0;
            } else {
                x509CertificateLoadCertificate = x509CertificateInfo.loadCertificate(this.d);
            }
            int i4 = IAuthTabCallbackDefault + 87;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return x509CertificateLoadCertificate;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String a(int i) {
        int i2 = 2 % 2;
        if (i == 1) {
            return "CMP 처리 오류";
        }
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            if (i == 2) {
                return "CMP 통신 오류";
            }
        } else if (i == 2) {
            return "CMP 통신 오류";
        }
        if (i == 3) {
            return "키 저장소 오류";
        }
        int i5 = i3 + 59;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            if (i == 4) {
                return "잘못된 값으로 인한 오류";
            }
        } else if (i == 4) {
            return "잘못된 값으로 인한 오류";
        }
        if (i == 6) {
            return "CA 메시지 오류";
        }
        int i6 = i3 + 103;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return "알 수 없는 오류";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getErrorMsg() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Exception exc = this.j;
        if (exc instanceof CMPException) {
            CMPException cMPException = (CMPException) exc;
            if (this.g != -1) {
                String str = "";
                if (cMPException.getErrorCategory() != 6) {
                    String str2 = this.f;
                    if (str2 != null) {
                        int i4 = IAuthTabCallbackDefault + 75;
                        asBinder = i4 % 128;
                        int i5 = i4 % 2;
                        if (!"".equals(str2)) {
                            IniSafeLog.debug("CMP 오류 메시지 : " + this.f);
                        }
                    }
                    return a(cMPException.getErrorCategory()) + " [" + ((int) this.g) + ((int) this.h) + ((int) this.i) + "]\n" + b(this.g);
                }
                String str3 = this.f;
                if (str3 != null && !"".equals(str3)) {
                    str = "\n\n" + this.f;
                }
                String str4 = a(cMPException.getErrorCategory()) + " [" + ((int) this.g) + ((int) this.h) + ((int) this.i) + "]\n" + b(this.g) + str;
                int i6 = asBinder + 79;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                return str4;
            }
        }
        return this.f;
    }

    public final String b(int i) throws Throwable {
        int i2 = 2 % 2;
        if (i == 3000) {
            Object[] objArr = new Object[1];
            k((short) (TextUtils.lastIndexOf("", '0', 0) + 90), (byte) (11 - View.getDefaultSize(0, 0)), (-1850975705) - (ViewConfiguration.getWindowTouchSlop() >> 8), 1495339327 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-28366) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
            return ((String) objArr[0]).intern();
        }
        if (i == 3001) {
            Object[] objArr2 = new Object[1];
            k((short) (MotionEvent.axisFromString("") + 30), (byte) (107 - View.getDefaultSize(0, 0)), (-1850975730) - Gravity.getAbsoluteGravity(0, 0), Color.rgb(0, 0, 0) + 1512167540, (-28365) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            return ((String) objArr2[0]).intern();
        }
        int i3 = asBinder;
        int i4 = i3 + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            if (i == 13527) {
                return "지원하지 않는 CMP 버전입니다.";
            }
        } else if (i == 4000) {
            return "지원하지 않는 CMP 버전입니다.";
        }
        if (i == 4001) {
            return "지원하지 않는 GENM 버전입니다.";
        }
        switch (i) {
            case 1000:
                return "네트워크 통신을 위한 초기화 작업 중 오류가 발생하였습니다.";
            case 1001:
                int i5 = i3 + 1;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return "요청 메시지를 준비하는 중 오류가 발생하였습니다.";
                }
                throw null;
            case 1002:
                return "수신된 메시지를 처리하는 중 오류가 발생하였습니다.";
            case 1003:
                return "수신된 메시지의 키 값 검증이 실패하였습니다.";
            case 1004:
                return "nonce값이 일치하지 않습니다.";
            case 1005:
                return "IR 요청 중 오류가 발생하였습니다.";
            case 1006:
                Object[] objArr3 = new Object[1];
                k((short) (TextUtils.getCapsMode("", 0, 0) - 103), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 4), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1850975756, 1495339327 - TextUtils.getTrimmedLength(""), (-28366) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
                return ((String) objArr3[0]).intern();
            case 1007:
                return "GENM 처리 중 오류가 발생하였습니다.";
            case 1008:
                return "PKIStatus 체크 중 오류가 발생하였습니다.";
            case 1009:
                return "KRR 처리 중 오류가 발생하였습니다.";
            case 1010:
                return "KUR 처리 중 오류가 발생하였습니다.";
            case 1011:
                return "수신된 메시지 체크 중 오류가 발생하였습니다.";
            case 1012:
                return "패스워드가 일치하지 않습니다.";
            default:
                switch (i) {
                    case 2000:
                        return "서버로부터 올바르지 않은 응답 코드가 전달되었습니다.(not 2xx)";
                    case 2001:
                        return "수신된 메시지의 ContentType이 정상적이지 않습니다.";
                    case 2002:
                        return "메시지 전송 처리 중 오류가 발생하였습니다.\n네트워크 연결 상태를 확인해주세요.";
                    case 2003:
                        return "서버로부터 오류 메시지가 수신되었습니다.";
                    case 2004:
                        return "예기치 못한 응답 메시지 오류입니다.";
                    default:
                        return "정의되지 않은 오류입니다.";
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 43424), 42 - ExpandableListView.getPackedPositionType(0L), 22439 - Color.blue(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 91;
                $10 = i6 % 128;
                z = i6 % 2 == 0;
            }
            if (z) {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 12843), (ViewConfiguration.getFadingEdgeLength() >> 16) + 55, TextUtils.getOffsetBefore("", 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, ((Process.getThreadPriority(0) + 20) >> 6) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    int i8 = $10 + 65;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (z) {
                    int i11 = $10 + 123;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 85 - TextUtils.lastIndexOf("", '0', 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i14 = $11 + 67;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
