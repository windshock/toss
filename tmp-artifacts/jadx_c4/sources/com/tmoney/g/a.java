package com.tmoney.g;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.skt.usp.UCPApiConstants;
import com.tmoney.LiveCheckConstants;
import com.tmoney.TmoneyMsg;
import com.tmoney.listener.ResultDetailCode;
import java.lang.reflect.Method;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class a {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String STR_PHONE_NUM = "PHONE_NUM";
    public static final String STR_UICC = "UICC";
    private static char[] onExtraCallback = {27222, 27217, 27223};
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    protected Context a;
    private InterfaceC0003a b;
    private b c;
    private c d;
    private boolean e = true;

    /* renamed from: com.tmoney.g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0003a {
        void onCreateResult(boolean z, TmoneyMsg.TmoneyResult tmoneyResult);
    }

    public interface b {
        void onDestroyResult(boolean z);
    }

    public interface c {
        void onUsimInfo(String str, String str2);
    }

    public a(Context context) {
        this.a = context;
    }

    protected static String a(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        if (bArr == null || bArr.length <= 0) {
            int i2 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = 0;
        Object[] objArr = new Object[1];
        q(new int[]{0, 1, 0, 0}, false, new byte[]{0}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        q(new int[]{1, 1, 14, 1}, true, new byte[]{1}, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        q(new int[]{2, 1, 0, 0}, true, new byte[]{0}, objArr3);
        String[] strArr = {strIntern, strIntern2, ((String) objArr3[0]).intern(), "3", "4", "5", "6", "7", UCPApiConstants.ERR_CARD_DEVICES_RES_FAIL, "9", "A", LiveCheckConstants.LOAD_PHONE_LOST_ACK, "C", "D", "E", "F"};
        StringBuffer stringBuffer = new StringBuffer(bArr.length << 1);
        int i5 = onExtraCallbackWithResult + 63;
        while (true) {
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (i4 >= bArr.length) {
                return new String(stringBuffer);
            }
            stringBuffer.append(strArr[(byte) (((byte) (((byte) (bArr[i4] & 240)) >>> 4)) & 15)]);
            stringBuffer.append(strArr[(byte) (bArr[i4] & 15)]);
            i4++;
            i5 = onExtraCallbackWithResult + 125;
        }
    }

    public static byte[] hexStringToByteArray(String str) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            length = str.length();
            i = length % 4;
        } else {
            length = str.length();
            i = length / 2;
        }
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < length; i4 += 2) {
            bArr[i4 / 2] = (byte) ((Character.digit(str.charAt(i4), 16) << 4) + Character.digit(str.charAt(i4 + 1), 16));
        }
        int i5 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public static boolean isGetTelecomUiccOS() {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    protected final void a(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c cVar = this.d;
        if (cVar != null) {
            int i4 = i3 + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            cVar.onUsimInfo(str, str2);
        }
    }

    protected final void a(boolean z) {
        int i = 2 % 2;
        b bVar = this.c;
        if (bVar != null) {
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            bVar.onDestroyResult(true);
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    protected final void a(boolean z, TmoneyMsg.TmoneyResult tmoneyResult) {
        InterfaceC0003a interfaceC0003a;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            interfaceC0003a = this.b;
            int i3 = 87 / 0;
            if (interfaceC0003a == null) {
                return;
            }
        } else {
            interfaceC0003a = this.b;
            if (interfaceC0003a == null) {
                return;
            }
        }
        interfaceC0003a.onCreateResult(z, tmoneyResult);
        int i4 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    abstract void close();

    abstract void create(Map<String, Object> map);

    abstract void destroy();

    abstract int getChannel();

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.a;
        int i5 = i2 + 51;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return context;
        }
        throw null;
    }

    public boolean isCheckTelecomUicc() {
        int i = 2 % 2;
        if (!isGetTelecomUiccOS()) {
            return false;
        }
        int i2 = onExtraCallbackWithResult + 1;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (!this.e) {
            return false;
        }
        int i5 = i3 + 65;
        int i6 = i5 % 128;
        onExtraCallbackWithResult = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 1;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    abstract boolean isCreated();

    public TmoneyMsg.TmoneyResult makeResult(TmoneyMsg.TmoneyResult tmoneyResult, ResultDetailCode resultDetailCode) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TmoneyMsg.TmoneyResult message = tmoneyResult.setCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
        int i4 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return message;
    }

    public TmoneyMsg.TmoneyResult makeResult(TmoneyMsg.TmoneyResult tmoneyResult, ResultDetailCode resultDetailCode, String str) {
        int i = 2 % 2;
        TmoneyMsg.TmoneyResult tmoneyResultMakeResult = makeResult(tmoneyResult, resultDetailCode);
        tmoneyResultMakeResult.setMessage(str + tmoneyResultMakeResult.getMessage());
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return tmoneyResultMakeResult;
    }

    abstract int open();

    public void setIsEmptyUicc(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.e = z;
        int i5 = i2 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setOnUsimCreateListener(InterfaceC0003a interfaceC0003a) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.b = interfaceC0003a;
        int i5 = i3 + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setOnUsimDestroyListener(b bVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.c = bVar;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
    }

    public void setOnUsimInfoListener(c cVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.d = cVar;
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    abstract byte[] transmit(byte[] bArr);

    private static void q(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallback;
        char c2 = '0';
        if (cArr2 != null) {
            int i7 = $11 + 41;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 35 - TextUtils.getCapsMode("", 0, 0), 14238 - TextUtils.indexOf("", c2), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                    c2 = '0';
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c3 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c3)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), View.resolveSize(0, 0) + 65, 16718 - View.resolveSize(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c3)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, 17657 - View.resolveSize(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 70 - TextUtils.getOffsetBefore("", 0), Color.red(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i10, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i10);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i11 = $11 + 11;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i12 = $10 + 19;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
