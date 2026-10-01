package com.tmoney.b;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.tmoney.LiveCheckConstants;
import com.tmoney.TmoneyConstants;
import com.tmoney.dto.RequestT5;
import com.tmoney.dto.RequestT6;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.AppInfoHelper;
import com.tmoney.utils.DateTimeHelper;
import com.tmoney.utils.DeviceInfoHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class u extends com.tmoney.g.a.a {
    int a;
    String b;
    O c;
    private String d;
    private TmoneyData e;
    private String f;
    private String g;
    private int h;
    private int i;
    private int j;
    private TmoneyConstants.PayMethodType k;
    private static final byte[] $$a = {52, -107, 59, -11};
    private static final int $$b = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static char[] onNavigationEvent = {60901};
    private static long onWarmupCompleted = 1744673083894724859L;

    /* renamed from: com.tmoney.b.u$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TmoneyConstants.PayMethodType.values().length];
            a = iArr;
            try {
                iArr[TmoneyConstants.PayMethodType.PhoneBill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3 = 4 - (s * 3);
        int i4 = 1 - (i * 2);
        byte[] bArr = $$a;
        int i5 = (b * 4) + 97;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i5 = i4;
            i5 += i6;
            i3++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i5 += i6;
            i3++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    public u(Context context, TmoneyConstants.PayMethodType payMethodType, String str, int i, int i2, String str2, String str3, ResultListener resultListener) {
        super(context, resultListener);
        this.d = "TmoneyPaymentLoadExecuter";
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.a = 0;
        TmoneyConstants.PayMethodType payMethodType2 = TmoneyConstants.PayMethodType.Nothing;
        this.k = payMethodType2;
        TmoneyData tmoneyData = TmoneyData.getInstance(getContext());
        this.e = tmoneyData;
        this.b = com.tmoney.d.a.getInstance().getTmonetServerIp(tmoneyData.getServerType());
        this.c = O.getInstance();
        this.k = payMethodType;
        this.f = str;
        this.h = i;
        this.i = i2;
        this.g = str2;
        if (AnonymousClass2.a[payMethodType.ordinal()] != 1) {
            this.k = payMethodType2;
            int i3 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        int i6 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int a(u uVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return uVar.p();
        }
        uVar.p();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String a(u uVar, String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        int i = 2 % 2;
        RequestT6 requestT6 = new RequestT6();
        requestT6.MTEL_CO = uVar.e.getTelecomCode();
        requestT6.MOBILE_NO = DeviceInfoHelper.getLine1NumberLocaleRemove(uVar.getContext());
        requestT6.CARD_ID = uVar.e.getCardNumber();
        requestT6.PLATFORM = uVar.e.getPlatform();
        requestT6.APP_VER = AppInfoHelper.getAppVersion(uVar.getContext());
        requestT6.OS_VER = DeviceInfoHelper.getAndroidOsVersion();
        requestT6.MODEL_ID = DeviceInfoHelper.getModel();
        requestT6.UUID = DeviceInfoHelper.getSimSerialNumber(uVar.getContext());
        Object[] objArr = new Object[1];
        u((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        requestT6.GUBUN = ((String) objArr[0]).intern();
        requestT6.TR_NO = str;
        requestT6.ILOAD_RESULT = str2;
        requestT6.LOAD_RESULT = str3;
        requestT6.LOAD_APDU = str5;
        requestT6.TSIGN3 = str4;
        requestT6.REQ_DH = str6;
        String string = new Gson().toJson(requestT6).toString();
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static /* synthetic */ void a(u uVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        uVar.a(resultType);
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private void a(TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), Integer.valueOf(this.j), Integer.valueOf(this.a));
        }
        onResult(resultType);
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
    }

    static /* synthetic */ boolean a(u uVar, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return uVar.a(0);
    }

    static /* synthetic */ boolean a(u uVar, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zB = uVar.b(str);
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zB;
    }

    static /* synthetic */ String b(u uVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return uVar.c();
        }
        uVar.c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String c(u uVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            uVar.f();
            throw null;
        }
        String strF = uVar.f();
        int i3 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return strF;
    }

    static /* synthetic */ String d(u uVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strD = uVar.d();
        int i4 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return strD;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.execute(dVar, resultType);
        if (i3 != 0) {
            int i4 = 97 / 0;
            if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                try {
                    String strDate = DateTimeHelper.date("yyyyMMddhhmmss");
                    int i5 = this.h;
                    this.j = p();
                    if (!b(i5)) {
                        TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                        ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_LOAD;
                        a(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("ApduResLoad::" + c() + " SW::" + q()));
                        return p();
                    }
                    O o2 = this.c;
                    String str = this.b;
                    String strB = b();
                    String strC = c();
                    RequestT5 requestT5 = new RequestT5();
                    requestT5.MTEL_CO = this.e.getTelecomCode();
                    requestT5.MOBILE_NO = DeviceInfoHelper.getLine1NumberLocaleRemove(getContext());
                    requestT5.CARD_ID = this.e.getCardNumber();
                    requestT5.PLATFORM = this.e.getPlatform();
                    requestT5.APP_VER = AppInfoHelper.getAppVersion(getContext());
                    requestT5.OS_VER = DeviceInfoHelper.getAndroidOsVersion();
                    requestT5.MODEL_ID = DeviceInfoHelper.getModel();
                    requestT5.UUID = DeviceInfoHelper.getSimSerialNumber(getContext());
                    Object[] objArr = new Object[1];
                    u(AndroidCharacter.getMirror('0') - '0', (Process.myTid() >> 22) + 1, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
                    requestT5.GUBUN = ((String) objArr[0]).intern();
                    requestT5.WAY = "01";
                    requestT5.PAY_METHOD = "PH";
                    requestT5.CARD_CMPL_CD = "01";
                    requestT5.PAY_METHOD_VAL = this.f;
                    requestT5.CHG_AMT = this.h;
                    requestT5.FEE_AMT = this.i;
                    requestT5.SELECT_RESULT = strB;
                    requestT5.ILOAD_RESULT = strC;
                    requestT5.REQ_DH = strDate;
                    requestT5.CHG_TYPE = LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK;
                    requestT5.ENC_KEY = this.g;
                    o2.post(str, new Gson().toJson(requestT5).toString());
                    this.c.setListener(new 1(this, strDate));
                    int i6 = onExtraCallbackWithResult + 3;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 / 3;
                    }
                } catch (Exception e) {
                    TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                    ResultDetailCode resultDetailCode2 = ResultDetailCode.EXCEPTION_SERVER;
                    onResult(error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setLog(e.getMessage()).setException(e));
                }
            } else {
                a(resultType);
            }
        } else if (resultType == TmoneyCallback.ResultType.SUCCESS) {
        }
        int iP = p();
        int i8 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return iP;
    }

    private static void u(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 89;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 59697), 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10974 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46134), TextUtils.lastIndexOf("", '0', 0) + 32, MotionEvent.axisFromString("") + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49123), Drawable.resolveOpacity(0, 0) + 44, (ViewConfiguration.getPressedStateDuration() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 71;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }
}
