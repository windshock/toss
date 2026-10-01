package com.tmoney.c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.skp.smarttouch.sem.SEManagerConnection;
import com.skp.smarttouch.sem.std.Transportation;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.dao.SEMDispatchData;
import com.skp.smarttouch.sem.tools.dao.SEMResultData;
import com.tmoney.TmoneyMsg;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class x extends BaseTmoneyCallback {
    private final String a;
    private com.tmoney.g.b.a b;
    private Transportation c;
    private boolean d;
    private SEManagerConnection e;
    private Handler f;

    public x(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneySktEnableInstance";
        this.d = false;
        this.e = new SEManagerConnection() { // from class: com.tmoney.c.x.1
            private static short[] onExtraCallback;
            private static final byte[] $$a = {119, -58, 7, 71};
            private static final int $$b = 161;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asInterface = 0;
            private static int asBinder = 1;
            private static int IAuthTabCallback = -1198034721;
            private static int onWarmupCompleted = -1538795407;
            private static int onExtraCallbackWithResult = 309461124;
            private static byte[] onNavigationEvent = {-122, 66, -67, -76, -74, 72, 76};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(byte b, int i, int i2) {
                int i3;
                int i4;
                byte[] bArr = $$a;
                int i5 = (i2 * 3) + 1;
                int i6 = 115 - (b * 4);
                int i7 = 4 - (i * 4);
                byte[] bArr2 = new byte[i5];
                if (bArr == null) {
                    int i8 = i7;
                    i4 = 0;
                    i7++;
                    i6 += i8;
                    i3 = i4;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i6;
                    if (i4 == i5) {
                        return new String(bArr2, 0);
                    }
                    i8 = i6;
                    i6 = bArr[i7];
                    i7++;
                    i6 += i8;
                    i3 = i4;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i6;
                    if (i4 == i5) {
                    }
                } else {
                    i3 = 0;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i6;
                    if (i4 == i5) {
                    }
                }
            }

            public final void onDispatchAPI(SEMDispatchData sEMDispatchData) {
                int i = 2 % 2;
                int i2 = asBinder + 109;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onResultAPI(SEMResultData sEMResultData) throws Throwable {
                int i = 2 % 2;
                int i2 = asInterface + 71;
                asBinder = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (sEMResultData == null || sEMResultData.getType() == null || sEMResultData.getResultCode() == null) {
                    x xVar = x.this;
                    TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR);
                    ResultDetailCode resultDetailCode = ResultDetailCode.ENABLE_ERROR;
                    xVar.a(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()));
                    return;
                }
                int i3 = asInterface + 85;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    sEMResultData.getResultCode().getCode();
                    TextUtils.isEmpty(sEMResultData.getResultCode().getMessage());
                    throw null;
                }
                int code = sEMResultData.getResultCode().getCode();
                String message = sEMResultData.getResultCode().getMessage();
                String str = "";
                if (!TextUtils.isEmpty(message)) {
                    int i4 = asBinder + 89;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr = new Object[1];
                    b((short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) ((-67) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (-483436759) - TextUtils.indexOf("", "", 0), 1237985257 + (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 123, objArr);
                    if (message.contains(((String) objArr[0]).intern())) {
                        message = ResultDetailCode.ENABLE_ERROR.getMessage();
                    }
                }
                String strMakeMessage = TmoneyMsg.makeMessage("S", sEMResultData.getResultCode().getCode(), message);
                if (!APITypeCode.STD_TRP_REQUEST_IS_TRANS_ISSUED.equals(sEMResultData.getType())) {
                    if (!(!APITypeCode.STD_TRP_REQUEST_TRANSPORTATION_ENABLE.equals(sEMResultData.getType()))) {
                        if (APIResultCode.SUCCESS.equals(sEMResultData.getResultCode())) {
                            int i6 = asBinder + 19;
                            asInterface = i6 % 128;
                            int i7 = i6 % 2;
                            x.this.a(TmoneyCallback.ResultType.SUCCESS);
                            return;
                        }
                        if (code == -13) {
                            if (message.contains("934")) {
                                x.this.a(TmoneyCallback.ResultType.SUCCESS);
                                return;
                            } else {
                                x.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR).setDetailCode(ResultDetailCode.ENABLE_ERROR.getCodeString()).setMessage(strMakeMessage));
                                return;
                            }
                        }
                        x.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR).setDetailCode(ResultDetailCode.ENABLE_ERROR.getCodeString()).setMessage(strMakeMessage));
                    }
                    int i8 = asInterface + 39;
                    asBinder = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                LogHelper.d("TmoneySktEnableInstance", "result.getResultCode:" + sEMResultData.getResultCode());
                if (!APIResultCode.SUCCESS.equals(sEMResultData.getResultCode())) {
                    if (code != -13) {
                        x.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR).setDetailCode(ResultDetailCode.ENABLE_ERROR.getCodeString()).setMessage(strMakeMessage));
                        return;
                    }
                    if (!(!message.contains("934"))) {
                        x.this.a(TmoneyCallback.ResultType.SUCCESS);
                        return;
                    }
                    x.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR).setDetailCode(ResultDetailCode.ENABLE_ERROR.getCodeString()).setMessage(strMakeMessage));
                    LogHelper.sendAppLog("TmoneySktEnableInstance", "onResultAPI code:" + code + "], message[" + message + "]", CodeConstants.E_SAVEAPPLOG.CREATE);
                    return;
                }
                try {
                    String str2 = (String) sEMResultData.getData();
                    if (str2 == null) {
                        int i9 = asBinder + 89;
                        asInterface = i9 % 128;
                        if (i9 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                    } else {
                        str = str2;
                    }
                } catch (Exception unused) {
                }
                LogHelper.d("TmoneySktEnableInstance", "onResultAPI data:" + str);
                if ((!"NONE".equals(str)) && !"DELETED".equals(str)) {
                    if ("INSTALLED".equals(str)) {
                        x.d(x.this);
                        return;
                    } else {
                        x.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR).setDetailCode(ResultDetailCode.ENABLE_ERROR.getCodeString()).setMessage(strMakeMessage));
                        return;
                    }
                }
                x xVar2 = x.this;
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.TODO.setError(ResultError.NEED_1TH_ISSUE);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.NEED_1TH_ISSUE;
                xVar2.a(error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()));
                int i10 = asInterface + 59;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
            }

            public final void onServiceConnected(String str) {
                int i = 2 % 2;
                LogHelper.d("TmoneySktEnableInstance", "onServiceConnected [" + str + "][" + x.this.c.getTranitpassYn() + "]");
                x.b(x.this);
                int i2 = asInterface + 53;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
            }

            public final void onServiceDisconnected(String str, int i) {
                int i2 = 2 % 2;
                LogHelper.d("TmoneySktEnableInstance", "onServiceDisconnected [" + str + "][" + i + "]");
                Object obj = null;
                if (str.endsWith("STD_TRP")) {
                    int i3 = asBinder + 55;
                    asInterface = i3 % 128;
                    if (i3 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i == 0) {
                        return;
                    }
                }
                try {
                    if (x.this.d) {
                        return;
                    }
                    int i4 = asBinder + 29;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    ResultDetailCode detailCode = ResultDetailCode.getDetailCode(i);
                    if (detailCode == ResultDetailCode.UNKNOWN) {
                        x.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR).setDetailCode(ResultDetailCode.getDetailCode(i).getCodeString()).setMessage("[" + str + "]" + TmoneyMsg.getSktMsg(i)));
                        return;
                    }
                    int i6 = asBinder + 7;
                    asInterface = i6 % 128;
                    if (i6 % 2 != 0) {
                        TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR).setDetailCode(detailCode.getCodeString()).setMessage(detailCode.getMessage());
                        ResultDetailCode resultDetailCode = ResultDetailCode.SKT_SEIO_SEM_85;
                        obj.hashCode();
                        throw null;
                    }
                    TmoneyCallback.ResultType message = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR).setDetailCode(detailCode.getCodeString()).setMessage(detailCode.getMessage());
                    if (detailCode == ResultDetailCode.SKT_SEIO_SEM_85) {
                        message = TmoneyCallback.ResultType.TODO.setError(ResultError.SKT_SEIO_UPDATE).setDetailCode(detailCode.getCodeString()).setMessage(detailCode.getMessage());
                    }
                    x.this.a(message);
                } catch (Exception e) {
                    LogHelper.exception("TmoneySktEnableInstance", e);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[PHI: r14
              0x008f: PHI (r14v3 byte[] A[IMMUTABLE_TYPE]) = (r14v2 byte[]), (r14v7 byte[]) binds: [B:22:0x008d, B:19:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
                boolean z;
                long j;
                int i4;
                boolean z2;
                byte[] bArr;
                int i5 = 2 % 2;
                TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.blue(0)), 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetBefore("", 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    if (iIntValue == -1) {
                        int i6 = $11 + 43;
                        $10 = i6 % 128;
                        z = i6 % 2 == 0;
                    }
                    long j2 = 0;
                    if (z) {
                        int i7 = $11;
                        int i8 = i7 + 89;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            bArr = onNavigationEvent;
                            int i9 = 88 / 0;
                            if (bArr != null) {
                                int i10 = i7 + 89;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                int i12 = 0;
                                while (i12 < length) {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                    if (objOnExtraCallback2 == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12843), (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 54, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                    i12++;
                                    j2 = 0;
                                }
                                bArr = bArr2;
                            }
                            if (bArr == null) {
                                byte[] bArr3 = onNavigationEvent;
                                Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43423), 42 - KeyEvent.getDeadChar(0, 0), View.resolveSizeAndState(0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                                j = -4629411779493505016L;
                            } else {
                                j = -4629411779493505016L;
                                iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                            }
                        } else {
                            bArr = onNavigationEvent;
                            if (bArr != null) {
                            }
                            if (bArr == null) {
                            }
                        }
                    } else {
                        j = -4629411779493505016L;
                    }
                    if (iIntValue > 0) {
                        int i13 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                        if (z) {
                            int i14 = $11 + 103;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
                        Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 87 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        byte[] bArr4 = onNavigationEvent;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i16 = 0; i16 < length2; i16++) {
                                bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            int i17 = $11 + 91;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            if (z2) {
                                int i19 = $10 + 65;
                                $11 = i19 % 128;
                                int i20 = i19 % 2;
                                byte[] bArr6 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = onExtraCallback;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                            int i21 = $11 + 107;
                            $10 = i21 % 128;
                            int i22 = i21 % 2;
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
        };
        this.f = new Handler(Looper.getMainLooper()) { // from class: com.tmoney.c.x.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                String message2;
                try {
                    TmoneyCallback.ResultType message3 = (TmoneyCallback.ResultType) message.obj;
                    TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.SUCCESS;
                    if (message3 == resultType) {
                        x.this.onResult(resultType);
                        return;
                    }
                    if (message3 != resultType && "-13".equals(message3.getDetailCode()) && (message2 = message3.getMessage()) != null) {
                        if (message2.contains("922") || message2.contains("923") || message2.contains("924") || message2.contains("933") || message2.contains("943") || message2.contains("944")) {
                            LogHelper.sendAppLog("NOT_SUPPORT", "TmoneySktEnableInstance resMsg:" + message2, CodeConstants.E_SAVEAPPLOG.CREATE);
                            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.NOT_SUPPORT);
                            ResultDetailCode resultDetailCode = ResultDetailCode.NOT_SUPPORT_TMONEY;
                            message3 = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
                        } else {
                            message3.setMessage(TmoneyMsg.makeUsimMessage("S", message3.getDetailCode(), message2));
                        }
                    }
                    x.this.onResult(message3);
                } catch (Exception e) {
                    LogHelper.exception("TmoneySktEnableInstance", e);
                }
            }
        };
        this.b = com.tmoney.g.b.a.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        int i = resultType.getDetailCode().equals(ResultDetailCode.SKT_SEIO_CONN.getCodeString()) ? 0 : 300;
        LogHelper.d("TmoneySktEnableInstance", "onTmoneyEnableResult " + resultType + "(delay:" + i + ") " + resultType.getError() + "/" + resultType.getMessage());
        try {
            Transportation transportation = this.c;
            if (transportation != null && !this.d) {
                transportation.finalize();
                this.c = null;
                this.d = true;
            }
        } catch (Exception unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = resultType;
        this.f.sendMessageDelayed(messageObtain, i);
    }

    static /* synthetic */ void b(x xVar) {
        try {
            LogHelper.d("TmoneySktEnableInstance", "requestIsTransIssued");
            xVar.c.requestIsTransIssued("D4100000030001");
        } catch (Exception e) {
            LogHelper.d("TmoneySktEnableInstance", "requestIsTransIssued()>>" + e.getMessage());
            xVar.a(Callback.warning(ResultError.ENABLE_ERROR, ResultDetailCode.USIM_EXCEPTION));
        }
    }

    static /* synthetic */ void d(x xVar) {
        try {
            LogHelper.d("TmoneySktEnableInstance", "requestTransportationEnable");
            xVar.c.requestTransportationEnable(1);
        } catch (Exception e) {
            LogHelper.d("TmoneySktEnableInstance", "requestTransportationEnable()>>" + e.getMessage());
            xVar.a(Callback.warning(ResultError.ENABLE_ERROR, ResultDetailCode.USIM_EXCEPTION));
        }
    }

    public final void excuteTmoneyEnable() {
        LogHelper.d("TmoneySktEnableInstance", "initializeTransportation");
        Transportation transportation = Transportation.getInstance(this.mContext);
        this.c = transportation;
        transportation.initialize(this.b.getSkStId(), this.e);
    }
}
