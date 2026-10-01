package com.tmoney.b;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.tmoney.dto.RequestT6;
import com.tmoney.dto.Response5T;
import com.tmoney.dto.Response6T;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.AppInfoHelper;
import com.tmoney.utils.Callback;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* renamed from: com.tmoney.b.e, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0038e extends com.tmoney.g.a.a {
    private static final byte[] $$a = {94, -43, -105, 125};
    private static final int $$b = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = {60901};
    private static long onWarmupCompleted = -3371265301802650983L;
    private final String a;
    private String b;
    private int c;
    private int d;
    private String e;
    private int f;
    private int g;
    private TmoneyData h;
    private String i;
    private O j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        byte[] bArr = $$a;
        int i2 = b * 3;
        int i3 = 97 - (b2 * 4);
        int i4 = (b3 * 4) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i2;
            i = 0;
            i3 += i5;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            i++;
            i5 = bArr[i4];
            i3 += i5;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        }
    }

    public C0038e(Context context, String str, int i, int i2, String str2, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyPlateLoadForPhoneBillExecuter";
        this.f = 0;
        this.g = 0;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.h = TmoneyData.getInstance(context);
        this.i = com.tmoney.d.a.getInstance().getTmonetServerIp(this.h.getServerType());
        this.j = O.getInstance();
    }

    static /* synthetic */ void a(C0038e c0038e, Response5T response5T, String str) throws Throwable {
        int i = 2 % 2;
        try {
            O o2 = c0038e.j;
            String str2 = c0038e.i;
            String str3 = response5T.data.TR_NO;
            String strC = c0038e.c();
            String strF = c0038e.f();
            String strD = c0038e.d();
            String str4 = response5T.data.LOAD_APDU;
            RequestT6 requestT6 = new RequestT6();
            requestT6.MTEL_CO = c0038e.h.getTelecomCode();
            requestT6.MOBILE_NO = DeviceInfoHelper.getLine1NumberLocaleRemove(c0038e.mContext);
            requestT6.CARD_ID = c0038e.n();
            requestT6.PLATFORM = c0038e.h.getPlatform();
            requestT6.APP_VER = AppInfoHelper.getAppVersion(c0038e.mContext);
            requestT6.OS_VER = DeviceInfoHelper.getAndroidOsVersion();
            requestT6.MODEL_ID = DeviceInfoHelper.getModel();
            requestT6.UUID = DeviceInfoHelper.getSimSerialNumber(c0038e.mContext);
            Object[] objArr = new Object[1];
            u(1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr);
            requestT6.GUBUN = ((String) objArr[0]).intern();
            requestT6.TR_NO = str3;
            requestT6.ILOAD_RESULT = strC;
            requestT6.LOAD_RESULT = strF;
            requestT6.LOAD_APDU = str4;
            requestT6.TSIGN3 = strD;
            requestT6.REQ_DH = str;
            o2.post(str2, new Gson().toJson(requestT6));
            c0038e.j.setListener(new O.a() { // from class: com.tmoney.b.e.2
                @Override // com.tmoney.kscc.sslio.a.O.a
                public final void onResultType(TmoneyCallback.ResultType resultType) {
                    Response6T response6T;
                    Response6T.Data data;
                    if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                        C0038e.a(C0038e.this, Callback.warning(ResultError.SERVER_ERROR, resultType.getDetailCode(), resultType.getMessage()));
                        return;
                    }
                    String string = resultType.getData()[0].toString();
                    try {
                        response6T = (Response6T) new Gson().fromJson(string, Response6T.class);
                    } catch (Exception unused) {
                        response6T = null;
                    }
                    if (response6T == null || (data = response6T.data) == null || !data.REPL_CD.equals("00")) {
                        C0038e.a(C0038e.this, TmoneyCallback.ResultType.SUCCESS.setMessage(response6T != null ? response6T.msg : ResultDetailCode.SERVER.getMessage()).setLog(string));
                    } else {
                        C0038e.a(C0038e.this, Callback.success());
                    }
                }
            });
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            c0038e.a(Callback.warning(ResultError.EXCEPTION, ResultDetailCode.EXCEPTION_TASK, e.getMessage(), e));
        }
    }

    static /* synthetic */ void a(C0038e c0038e, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        c0038e.a(resultType);
        int i4 = onExtraCallback + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }

    private void a(TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), 0, 0);
            LogHelper.d("TmoneyPlateLoadForPhoneBillExecuter", "BeforeBalance >> 0, AfterBalance >> 0");
        }
        onResult(resultType);
        int i4 = onExtraCallback + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean a(C0038e c0038e, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return c0038e.a(0);
    }

    static /* synthetic */ boolean a(C0038e c0038e, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zB = c0038e.b(str);
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r12 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r12 = 10 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (b(r10.c) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r12 = com.tmoney.utils.Callback.warning(com.tmoney.listener.ResultError.USIM_ERROR, com.tmoney.listener.ResultDetailCode.USIM_INIT_LOAD);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        com.tmoney.utils.LogHelper.d("TmoneyPlateLoadForPhoneBillExecuter", "requestInitLoad()");
        r12 = com.tmoney.utils.DateTimeHelper.date("yyyyMMddhhmmss");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r3 = r10.j;
        r6 = r10.i;
        r7 = new com.tmoney.dto.RequestT5();
        r7.MTEL_CO = r10.h.getTelecomCode();
        r7.MOBILE_NO = com.tmoney.utils.DeviceInfoHelper.getLine1NumberLocaleRemove(r10.mContext);
        r7.CARD_ID = n();
        r7.PLATFORM = r10.h.getPlatform();
        r7.APP_VER = com.tmoney.utils.AppInfoHelper.getAppVersion(r10.mContext);
        r7.OS_VER = com.tmoney.utils.DeviceInfoHelper.getAndroidOsVersion();
        r7.MODEL_ID = com.tmoney.utils.DeviceInfoHelper.getModel();
        r7.UUID = com.tmoney.utils.DeviceInfoHelper.getSimSerialNumber(r10.mContext);
        r4 = new java.lang.Object[1];
        u(android.text.TextUtils.indexOf("", ""), android.text.TextUtils.getOffsetBefore("", 0) + 1, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), r4);
        r7.GUBUN = ((java.lang.String) r4[0]).intern();
        r7.WAY = "01";
        r7.PAY_METHOD = "PH";
        r7.CARD_CMPL_CD = "01";
        r7.PAY_METHOD_VAL = r10.b;
        r7.CHG_AMT = r10.c;
        r7.FEE_AMT = r10.d;
        r7.SELECT_RESULT = b();
        r7.ILOAD_RESULT = c();
        r7.REQ_DH = r12;
        r7.CHG_TYPE = com.tmoney.LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK;
        r7.ENC_KEY = r10.e;
        r3.post(r6, new com.google.gson.Gson().toJson(r7));
        r10.j.setListener(new com.tmoney.b.C0038e.AnonymousClass1(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f8, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f9, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fa, code lost:
    
        r12 = com.tmoney.utils.Callback.warning(com.tmoney.listener.ResultError.EXCEPTION, com.tmoney.listener.ResultDetailCode.EXCEPTION_TASK, r12.getMessage(), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0106, code lost:
    
        a(r12);
        r12 = com.tmoney.b.C0038e.onExtraCallback + 85;
        com.tmoney.b.C0038e.IAuthTabCallback = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0112, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r12 != com.tmoney.listener.TmoneyCallback.ResultType.SUCCESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r12 != com.tmoney.listener.TmoneyCallback.ResultType.SUCCESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        onResult(r12);
        r12 = com.tmoney.b.C0038e.IAuthTabCallback + 31;
        com.tmoney.b.C0038e.onExtraCallback = r12 % 128;
     */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        int iExecute;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iExecute = super.execute(dVar, resultType, false);
        } else {
            iExecute = super.execute(dVar, resultType, true);
        }
    }

    private static void u(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 17 - (Process.myPid() >> 22), 10973 - KeyEvent.normalizeMetaState(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46134), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 20220 - Color.alpha(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTouchSlop() >> 8)), (Process.myPid() >> 22) + 44, 1494 - (KeyEvent.getMaxKeyCode() >> 16), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), 44 - (ViewConfiguration.getPressedStateDuration() >> 16), 1494 - Gravity.getAbsoluteGravity(0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i7 = $10 + 65;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str = new String(cArr);
        int i9 = $11 + 1;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
