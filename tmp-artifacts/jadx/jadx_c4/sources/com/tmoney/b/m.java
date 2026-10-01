package com.tmoney.b;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.TmoneyMsg;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class m extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent = {357285428, 2005042046, 818187908, -252220669, 1338436182, 99709219, 921891385, 1684564758, 174310141, -1572482767, -1425425050, 2072235124, 1708793958, 1749985960, 886580196, 1862790530, -684267923, 1498654775};
    private static int onWarmupCompleted;
    private final String a;
    private TmoneyData b;
    private int c;
    private String d;
    private String e;
    private boolean f;
    private Handler g;
    private Handler h;

    public m(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyEnableCheckExecuter";
        this.f = false;
        this.g = new Handler(Looper.getMainLooper()) { // from class: com.tmoney.b.m.3
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                m.b(m.this);
            }
        };
        this.h = new Handler(Looper.getMainLooper()) { // from class: com.tmoney.b.m.4
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                m.c(m.this);
            }
        };
        this.b = TmoneyData.getInstance(context);
    }

    static /* synthetic */ TmoneyData a(m mVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TmoneyData tmoneyData = mVar.b;
        if (i3 == 0) {
            return tmoneyData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void a(m mVar, TmoneyCallback.ResultType resultType, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        mVar.onResult(resultType);
        int i5 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void b(m mVar) {
        int i = 2 % 2;
        LogHelper.d("TmoneyEnableCheckExecuter", "tmoneySktIssueCheck");
        new com.tmoney.c.y(mVar.getContext(), new ResultListener() { // from class: com.tmoney.b.m.1
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                LogHelper.d("TmoneyEnableCheckExecuter", "onTmoneySktIssueCheckResult : " + resultType);
                m.a(m.this, resultType, 0);
            }
        }).excuteSktIssueCheck(false);
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ void c(m mVar) {
        int i = 2 % 2;
        LogHelper.d("TmoneyEnableCheckExecuter", "tmoneyStatusCheck");
        new com.tmoney.ota.a(mVar.getContext(), new ResultListener() { // from class: com.tmoney.b.m.2
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static long onNavigationEvent = -7319102933018035545L;

            /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
            @Override // com.tmoney.listener.ResultListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onResult(TmoneyCallback.ResultType resultType) throws Throwable {
                int i2 = 2 % 2;
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    String detailCode = resultType.getDetailCode();
                    LogHelper.d("TmoneyEnableCheckExecuter", "tmoneyStatusCheck:" + detailCode);
                    Object[] objArr = new Object[1];
                    b(new char[]{29608, 60326, 29592, 32252, 9115}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                    if (!((String) objArr[0]).intern().equals(detailCode)) {
                        Object[] objArr2 = new Object[1];
                        b(new char[]{4089, 7343, 4043, 23853, 8332}, (ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr2);
                        if (((String) objArr2[0]).intern().equals(detailCode)) {
                            resultType = TmoneyCallback.ResultType.TODO.setError(ResultError.NEED_2TH_ISSUE);
                            int i3 = onExtraCallbackWithResult + 19;
                            onExtraCallback = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i4 = 3 / 2;
                            }
                        }
                        resultType.setDetailCode(detailCode);
                        if (resultType.getError() == ResultError.NEED_2TH_ISSUE) {
                            int i5 = onExtraCallback + 35;
                            onExtraCallbackWithResult = i5 % 128;
                            int i6 = i5 % 2;
                            resultType.setMessage(ResultDetailCode.NEED_2TH_ISSUE.getCodeString());
                            m.a(m.this).setTmoney2IssueFromEnableChek(true);
                            int i7 = onExtraCallback + 15;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                }
                m.a(m.this, resultType, 300);
            }

            private static void b(char[] cArr, int i2, Object[] objArr) throws Throwable {
                Object obj;
                int i3 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i2);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                while (true) {
                    obj = null;
                    if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                        break;
                    }
                    int i4 = $11 + 23;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 45813), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 83, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 14137), 19 - TextUtils.indexOf("", "", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                int i7 = $11 + 17;
                $10 = i7 % 128;
                if (i7 % 2 == 0) {
                    objArr[0] = str;
                } else {
                    obj.hashCode();
                    throw null;
                }
            }
        }).getStatus(mVar.n());
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01a0  */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        Handler handler;
        int i = 2 % 2;
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            int i2 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (TmoneyData.getInstance().isNotUseUsimPartner()) {
                int i4 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                onResult(Callback.success());
                return 0;
            }
            com.tmoney.a.a aVar = new com.tmoney.a.a(a(com.tmoney.a.b.getData()));
            if (aVar.isbResData()) {
                this.c = aVar.getAppVersion();
                this.d = aVar.getLifeCycle();
                byte[] bArr = new byte[5];
                System.arraycopy(a(), 16, bArr, 0, 5);
                this.e = ByteHelper.toHexString(bArr);
                LogHelper.d("TmoneyEnableCheckExecuter", ">>>>> appCode : " + aVar.getAppCode());
                LogHelper.d("TmoneyEnableCheckExecuter", ">>>>> mVersion : " + this.c);
                LogHelper.d("TmoneyEnableCheckExecuter", ">>>>> mLifeCycle : " + this.d);
                LogHelper.d("TmoneyEnableCheckExecuter", ">>>>> mAlias : " + this.e);
                LogHelper.d("TmoneyEnableCheckExecuter", ">>>>> Diss : " + r());
                this.b.setIssueData(this.c, this.d, this.e, n(), o());
                LogHelper.d("TmoneyEnableCheckExecuter", ">>>>> TelecomType : " + this.b.getTelecomType().toString());
                LogHelper.d("TmoneyEnableCheckExecuter", ">>>>> 20180301 : " + r().compareTo("20180301"));
                LogHelper.d("TmoneyEnableCheckExecuter", ">>>>> 20180101 : " + r().compareTo("20180101"));
                if (this.c >= 23) {
                    if (!this.b.isGamin() && !this.b.isTelecomTypeSk()) {
                        int i6 = onExtraCallbackWithResult + 81;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            this.b.isTelecomTypeKt();
                            throw null;
                        }
                        if (!this.b.isTelecomTypeKt() || (!r().equals("00000000") && r().compareTo("20180301") < 0)) {
                            if (this.b.isTelecomTypeLgu()) {
                                int i7 = onExtraCallbackWithResult + 27;
                                onWarmupCompleted = i7 % 128;
                                if (i7 % 2 != 0) {
                                    r().equals("00000000");
                                    throw null;
                                }
                                if (r().equals("00000000") || r().compareTo("20180101") >= 0) {
                                }
                            }
                        }
                    } else if ("07".equals(this.d)) {
                        t();
                        handler = this.h;
                        handler.sendMessageDelayed(Message.obtain(), 300L);
                        this.f = true;
                    } else {
                        resultType = Callback.todo(ResultError.NEED_2TH_ISSUE, this.d, ResultDetailCode.NEED_2TH_ISSUE.getMessage());
                    }
                }
            }
        } else {
            ResultError error = resultType.getError();
            ResultError resultError = ResultError.USIM_ERROR;
            if (error == resultError) {
                if (this.b.isTelecomTypeKt() && resultType.getDetailCode().startsWith("3")) {
                    int i8 = onWarmupCompleted + 63;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    resultType = Callback.warning(resultError, ResultDetailCode.KT_CALL_MOCA_TSM);
                }
                if (!"6A82".equals(resultType.getDetailCode())) {
                    if ("6A88".equals(resultType.getDetailCode())) {
                        Object[] objArr = new Object[1];
                        u(new int[]{60083227, 1690610726}, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr);
                        if (!((String) objArr[0]).intern().equals(this.b.getTelecomCode())) {
                        }
                    }
                    resultType = Callback.warning(resultError, resultType.getDetailCode(), resultType.getMessage());
                    int i10 = onWarmupCompleted + 105;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                } else if (this.b.isTelecomTypeSk()) {
                    t();
                    handler = this.g;
                    handler.sendMessageDelayed(Message.obtain(), 300L);
                    this.f = true;
                }
                resultType = Callback.todo(ResultError.NEED_ENABLE, ResultDetailCode.NEED_ENABLE);
            }
        }
        if (!this.f) {
            onResult(resultType);
        }
        return 0;
    }

    public final void lgu_waitingProgressChanged(TmoneyMsg.TmoneyResult tmoneyResult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onResult(Callback.todo(ResultError.USIM_WAITTING, tmoneyResult.getCode(), tmoneyResult.getMessage()));
        int i4 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void u(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i3 = -1469660336;
        char c = '0';
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 72 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 8847 - TextUtils.lastIndexOf("", c), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = -1469660336;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i6]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", i4), (KeyEvent.getMaxKeyCode() >> 16) + 72, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6++;
                    i4 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i7 = i4;
        System.arraycopy(iArr5, i7, iArr4, i7, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i7;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i8 = $10 + 119;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $11 + 59;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 22252), KeyEvent.keyCodeFromString("") + 39, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i10 += 61;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - MotionEvent.axisFromString("")), TextUtils.indexOf("", "") + 39, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i10++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i13 = $10 + 75;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 3 % 2;
                }
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 4034), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 78, 7398 - TextUtils.getOffsetAfter("", 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
