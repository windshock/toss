package com.tmoney.b;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.telecom.skt.SktNfcAuthCheck;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class p extends com.tmoney.g.a.a {
    Handler a;
    private final String b;
    private TmoneyData c;
    private AbstractC0045f.a d;

    public p(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyInitExecuter";
        this.d = new AbstractC0045f.a() { // from class: com.tmoney.b.p.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static int[] IAuthTabCallback = {1729032107, 576352074, -1195966682, 2030276032, -1651405325, 1524277154, 983671681, 165015522, -1342154723, -1702196362, -2043304202, 18045391, -700746136, 928378424, -370584627, 1365673544, 1421102665, 1320361949};
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                p.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
                int i4 = onExtraCallback + 81;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                TmoneyCallback.ResultType detailCode;
                String message;
                TmoneyCallback.ResultType error;
                ResultDetailCode resultDetailCode;
                TmoneyCallback.ResultType resultType;
                TmoneyCallback.ResultType error2;
                ResultDetailCode resultDetailCode2;
                TmoneyCallback.ResultType message2;
                Exception exc;
                int i = 2 % 2;
                MBR0003ResponseDTO mBR0003ResponseDTO = (MBR0003ResponseDTO) responseDTO;
                p.this.c.setTmoneyData(mBR0003ResponseDTO);
                String usrUseLtnCd = mBR0003ResponseDTO.getResponse().getUsrUseLtnCd();
                TmoneyCallback.ResultType message3 = TmoneyCallback.ResultType.SUCCESS;
                if (p.this.c.getTmoneyYn()) {
                    if (!p.this.c.getAfltCd().equals(CodeConstants.EPARTNER_CODE.TPAY.getCode())) {
                        if (!TextUtils.isEmpty(usrUseLtnCd)) {
                            int i2 = onExtraCallback + 25;
                            onWarmupCompleted = i2 % 128;
                            int i3 = i2 % 2;
                            message3 = TmoneyCallback.ResultType.WARNING;
                            if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.LOST_DISABLE.getCode()) || TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.SAFE_LOST_DISABLE.getCode())) {
                                resultType = TmoneyCallback.ResultType.TODO;
                                error2 = resultType.setError(ResultError.LOST_DISABLE);
                                resultDetailCode2 = ResultDetailCode.USER_USE_LOST_DISABLE;
                            } else if (!(!TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.LONGTIME_DISABLE.getCode()))) {
                                int i4 = onExtraCallback + 7;
                                onWarmupCompleted = i4 % 128;
                                int i5 = i4 % 2;
                                resultType = TmoneyCallback.ResultType.TODO;
                                error2 = resultType.setError(ResultError.POSTPAID_LONGTIME_NOUSE_DISABLE);
                                resultDetailCode2 = ResultDetailCode.USER_USE_POSTPAID_LONGTIME_NOUSE_DISABLE;
                            } else {
                                if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.LOST.getCode())) {
                                    message2 = message3.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.NEED_LIVECHECK.getCodeString()).setMessage(ResultDetailCode.USER_USE_LOST_DISABLE.getMessage());
                                    exc = new Exception("NEED_LIVECHECK");
                                } else if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.LOGNTIME_REFUND_BALANCE.getCode())) {
                                    message2 = message3.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.NEED_LIVECHECK.getCodeString()).setMessage(ResultDetailCode.USER_USE_POSTPAID_LONGTIME_NOUSE_DISABLE.getMessage());
                                    exc = new Exception("NEED_LIVECHECK");
                                } else if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.USIM_POOR.getCode())) {
                                    message2 = message3.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.NEED_LIVECHECK.getCodeString()).setMessage(ResultDetailCode.USER_USE_POOR_USIM.getMessage());
                                    exc = new Exception("NEED_LIVECHECK");
                                } else if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.PHONE_CHANGE.getCode())) {
                                    message2 = message3.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.NEED_LIVECHECK.getCodeString()).setMessage(ResultDetailCode.USER_USE_CHANGE_PHNOE.getMessage());
                                    exc = new Exception("NEED_LIVECHECK");
                                } else if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.POOR_USER.getCode())) {
                                    message2 = message3.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.NEED_LIVECHECK.getCodeString()).setMessage(ResultDetailCode.USER_USE_LIMIT.getMessage());
                                    exc = new Exception("NEED_LIVECHECK");
                                } else if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.SAFE_LOST.getCode())) {
                                    message2 = message3.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.NEED_LIVECHECK.getCodeString()).setMessage(ResultDetailCode.USER_USE_LOST_DISABLE.getMessage());
                                    exc = new Exception("NEED_LIVECHECK");
                                } else if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.POOR_USER_NO_REFUND.getCode())) {
                                    message2 = message3.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.NEED_LIVECHECK.getCodeString()).setMessage(ResultDetailCode.USER_USE_LIMIT2.getMessage());
                                    exc = new Exception("NEED_LIVECHECK");
                                } else {
                                    message3 = message3.setError(ResultError.SERVER_ERROR).setDetailCode(mBR0003ResponseDTO.getResponse().getRspCd()).setMessage(mBR0003ResponseDTO.getResponse().getRspMsg());
                                }
                                message2.setException(exc);
                            }
                            message3 = resultType;
                            error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage());
                        } else {
                            if (!p.this.c.getIsPayment()) {
                                if (p.this.c.isNotUseUsimPartner()) {
                                    int i6 = onExtraCallback + 57;
                                    onWarmupCompleted = i6 % 128;
                                    int i7 = i6 % 2;
                                    p.this.a(message3);
                                    return;
                                }
                                try {
                                    String telecomCode = p.this.c.getTelecomCode();
                                    Object[] objArr = new Object[1];
                                    b(new int[]{-1724297088, 243800595}, Color.rgb(0, 0, 0) + 16777217, objArr);
                                    if (!TextUtils.equals(telecomCode, ((String) objArr[0]).intern())) {
                                        p.this.a(message3);
                                        return;
                                    }
                                    int i8 = onExtraCallback + 35;
                                    onWarmupCompleted = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        p.this.a.sendMessageDelayed(Message.obtain(), 300L);
                                        return;
                                    } else {
                                        p.this.a.sendMessageDelayed(Message.obtain(), 300L);
                                        throw null;
                                    }
                                } catch (Exception e) {
                                    LogHelper.d("TmoneyInitExecuter", ">> SktNfcAuthCheck : Error :  " + e.getMessage());
                                    LogHelper.sendAppLog("NOT_SUPPORT", "TmoneyInitExecuter sktNFCAuthCheckHandler:exception", CodeConstants.E_SAVEAPPLOG.CREATE);
                                    p pVar = p.this;
                                    TmoneyCallback.ResultType error3 = TmoneyCallback.ResultType.WARNING.setError(ResultError.NOT_SUPPORT);
                                    ResultDetailCode resultDetailCode3 = ResultDetailCode.NOT_SUPPORT_DEVICE;
                                    pVar.a(error3.setDetailCode(resultDetailCode3.getCodeString()).setMessage(resultDetailCode3.getMessage()).setLog(e.getMessage()));
                                    return;
                                }
                            }
                            if (!p.this.c.getIsPartnerJoin()) {
                                error = TmoneyCallback.ResultType.TODO.setError(ResultError.NEED_JOIN);
                                resultDetailCode = ResultDetailCode.NEED_JOIN;
                            } else if (p.this.c.getIsPartnerJoin() && !p.this.c.getSamePartner()) {
                                TmoneyCallback.ResultType error4 = TmoneyCallback.ResultType.TODO.setError(ResultError.PARTNER_JOIN);
                                ResultDetailCode resultDetailCode4 = ResultDetailCode.PARTNER_JOIN;
                                detailCode = error4.setDetailCode(resultDetailCode4.getCodeString());
                                message = String.format(resultDetailCode4.getMessage(), p.this.c.getPartnerAppName());
                            }
                        }
                        p.this.a(message3);
                    }
                    TmoneyCallback.ResultType error5 = TmoneyCallback.ResultType.TODO.setError(ResultError.PARTNER_JOIN);
                    ResultDetailCode resultDetailCode5 = ResultDetailCode.PARTNER_JOIN;
                    detailCode = error5.setDetailCode(resultDetailCode5.getCodeString());
                    message = String.format(resultDetailCode5.getMessage(), p.this.c.getPartnerAppName());
                    message3 = detailCode.setMessage(message);
                    p.this.a(message3);
                }
                LogHelper.sendAppLog("NOT_SUPPORT", "TmoneyInitExecuter TmoneyTmoneyYn:false", CodeConstants.E_SAVEAPPLOG.CREATE);
                error = TmoneyCallback.ResultType.WARNING.setError(ResultError.NOT_SUPPORT);
                resultDetailCode = ResultDetailCode.NOT_SUPPORT_DEVICE;
                detailCode = error.setDetailCode(resultDetailCode.getCodeString());
                message = resultDetailCode.getMessage();
                message3 = detailCode.setMessage(message);
                p.this.a(message3);
            }

            private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
                int length;
                int[] iArr2;
                int i2 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = IAuthTabCallback;
                int i3 = -1469660336;
                if (iArr3 != null) {
                    int i4 = $10 + 19;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int i6 = 0;
                    while (i6 < length2) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getLongPressTimeout() >> 16) + 72, 8848 - TextUtils.indexOf("", ""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr4[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i6++;
                            i3 = -1469660336;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr4;
                }
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int[] iArr6 = IAuthTabCallback;
                if (iArr6 != null) {
                    int i7 = $10 + 29;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = iArr6.length;
                        iArr2 = new int[length];
                    } else {
                        length = iArr6.length;
                        iArr2 = new int[length];
                    }
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(iArr6[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 72 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i8++;
                        int i9 = $10 + 81;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 2 / 3;
                        }
                    }
                    iArr6 = iArr2;
                }
                System.arraycopy(iArr6, 0, iArr5, 0, length3);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                    cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                    cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                    cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                    cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                    int i11 = 0;
                    for (int i12 = 16; i11 < i12; i12 = 16) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22251), 39 - View.resolveSizeAndState(0, 0, 0), 10301 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i11++;
                    }
                    int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                    int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                    cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                    cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 4033), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 78, 7399 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2, 0, i);
            }
        };
        this.a = new Handler(Looper.getMainLooper()) { // from class: com.tmoney.b.p.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                p.b(p.this);
            }
        };
        this.c = TmoneyData.getInstance(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), Integer.valueOf(p()));
        }
        onResult(resultType);
    }

    static /* synthetic */ void b(p pVar) {
        new SktNfcAuthCheck(pVar.getContext(), new SktNfcAuthCheck.a() { // from class: com.tmoney.b.p.3
            public final void onSktNfcAuthError(SktNfcAuthCheck.ResultError resultError, String str) {
                p pVar2;
                TmoneyCallback.ResultType error;
                ResultDetailCode resultDetailCode;
                TmoneyCallback.ResultType message;
                LogHelper.d("TmoneyInitExecuter", ">> SktNfcAuthCheck : Error : " + str);
                LogHelper.sendAppLog("NOT_SUPPORT", "SktNfcAuchCheck error : " + str, CodeConstants.E_SAVEAPPLOG.CREATE);
                if (resultError == SktNfcAuthCheck.ResultError.NOT_SUPPORT) {
                    pVar2 = p.this;
                    message = TmoneyCallback.ResultType.WARNING.setError(ResultError.NOT_SUPPORT).setDetailCode(ResultDetailCode.NOT_SUPPORT_DEVICE.getCodeString()).setMessage(str);
                } else {
                    if (resultError == SktNfcAuthCheck.ResultError.USIM) {
                        pVar2 = p.this;
                        error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                        resultDetailCode = ResultDetailCode.USIM_CREATE;
                    } else {
                        pVar2 = p.this;
                        error = TmoneyCallback.ResultType.WARNING.setError(ResultError.NETWORK);
                        resultDetailCode = ResultDetailCode.NETWORK;
                    }
                    message = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
                }
                pVar2.a(message);
            }

            public final void onSktNfcAuthSuccess() {
                LogHelper.d("TmoneyInitExecuter", ">> SktNfcAuthCheck : Success");
                p.this.a(TmoneyCallback.ResultType.SUCCESS);
            }
        });
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            new com.tmoney.kscc.sslio.a.D(getContext(), this.d).execute();
        } else {
            a(resultType);
        }
        return p();
    }
}
