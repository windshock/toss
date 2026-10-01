package com.tmoney.c;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.tmoney.dto.TpoRequestInfo;
import com.tmoney.dto.TpoResult;
import com.tmoney.dto.TpoResultData;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.getSignPrikeyCCFBPHFilename;
import o.getSignPrikeyCCFPHFilename;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class A extends C0041b {
    private final String b;
    private final int c;
    private TmoneyData d;
    private com.tmoney.d.a e;
    private int f;
    private String g;
    private String h;
    private String i;
    private O j;
    private static final byte[] $$a = {48, 86, 58, 71};
    private static final int $$b = 90;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static int onExtraCallbackWithResult = 478308898;

    private static String $$c(short s, byte b, short s2) {
        int i = b * 2;
        int i2 = (s * 4) + 4;
        int i3 = 105 - (s2 * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 += i2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i2];
            i2++;
            i3 += b2;
        }
    }

    public A(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TpoInfoInterface";
        this.c = 3;
        this.j = O.getInstance();
        this.e = com.tmoney.d.a.getInstance();
        TmoneyData tmoneyData = TmoneyData.getInstance(context);
        this.d = tmoneyData;
        this.f = tmoneyData.getServerType();
    }

    static /* synthetic */ void a(A a) {
        int i = 2 % 2;
        LogHelper.d("TpoInfoInterface", "saveNTep mPurse : " + a.h);
        LogHelper.d("TpoInfoInterface", "saveNTep mTransport : " + a.i);
        a.d.setTpoData(a.h, a.i);
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ void a(A a, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        a.onResult(resultType);
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private boolean a(String str, String str2, String str3) {
        String str4;
        int i = 2 % 2;
        if (str2.isEmpty() && str3.isEmpty()) {
            return false;
        }
        String tpoPurse = this.d.getTpoPurse();
        String tpoTrans = this.d.getTpoTrans();
        if (TextUtils.isEmpty(str)) {
            str4 = "칩 읽어오기 실패.";
        } else {
            LogHelper.d("TpoInfoInterface", "selChip : " + str);
            LogHelper.d("TpoInfoInterface", "purse : " + str2);
            LogHelper.d("TpoInfoInterface", "trans : " + str3);
            try {
                String strSubstring = str2.substring(str2.length() - 4, str2.length());
                LogHelper.d("TpoInfoInterface", "purseSW : " + strSubstring);
                if (TextUtils.equals("9000", strSubstring)) {
                    LogHelper.d("TpoInfoInterface", "savePurse : " + tpoPurse);
                    LogHelper.d("TpoInfoInterface", "new Purse : " + str2);
                    LogHelper.d("TpoInfoInterface", "saveTrans : " + tpoTrans);
                    LogHelper.d("TpoInfoInterface", "new Trans : " + str3);
                    if (!TextUtils.isEmpty(tpoPurse)) {
                        if (TextUtils.equals(str2, tpoPurse)) {
                            int i2 = onWarmupCompleted + 125;
                            onNavigationEvent = i2 % 128;
                            int i3 = i2 % 2;
                            if (TextUtils.equals(str3, tpoTrans)) {
                                int i4 = onNavigationEvent + 53;
                                onWarmupCompleted = i4 % 128;
                                int i5 = i4 % 2;
                                str4 = "TPO 변경 정보 없음";
                            }
                        }
                        if (!str3.startsWith("0000") && str3.length() < 150) {
                            return true;
                        }
                        LogHelper.d("TpoInfoInterface", "TPO Trans 값 오류");
                        return false;
                    }
                    LogHelper.d("TpoInfoInterface", "최초 저장값 없음");
                    if (!str3.startsWith("0000")) {
                        int i6 = onNavigationEvent + 79;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0 ? str3.length() < 150 : str3.length() < 23042) {
                            return true;
                        }
                    }
                    LogHelper.d("TpoInfoInterface", "TPO Trans 값 오류");
                    int i7 = onNavigationEvent + 41;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        return false;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (TextUtils.equals("6A83", strSubstring)) {
                    int i8 = onWarmupCompleted + 103;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 74 / 0;
                    }
                    str4 = "PURSE 정보 없음";
                } else {
                    str4 = "PURSE 정보 에러";
                }
            } catch (Exception e) {
                LogHelper.exception("TpoInfoInterface", e);
                str4 = " 거래 정보가 없습니다.";
            }
        }
        LogHelper.d("TpoInfoInterface", str4);
        return false;
    }

    static /* synthetic */ void b(A a, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        a.onResult(resultType);
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void c(A a, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        a.onResult(resultType);
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void d(A a, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        a.onResult(resultType);
        int i4 = onWarmupCompleted + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void requestTpoInfo(String str, String str2, String str3) {
        TmoneyCallback.ResultType data;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (a(str, str2, str3)) {
            this.g = str;
            this.h = str2;
            this.i = str3;
            LogHelper.d("TpoInfoInterface", "sendTpoData count : 0");
            try {
                HashMap<String, String> map = new HashMap<>();
                TpoRequestInfo tpoRequestInfo = new TpoRequestInfo();
                tpoRequestInfo.setCardInfo(this.g);
                tpoRequestInfo.setPurse(this.h);
                tpoRequestInfo.setTransport(this.i);
                tpoRequestInfo.setFirstFlag("N");
                tpoRequestInfo.setAppGubun(this.d.getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.TPO_CODE.getCode()));
                tpoRequestInfo.setReciveYn(this.d.getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.RECEIVE_YN.getCode()));
                String json = new Gson().toJson(tpoRequestInfo);
                LogHelper.d("TpoInfoInterface", json);
                Object[] objArr = new Object[1];
                k((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{14, 65531, 65534, 65531}, true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 113, objArr);
                map.put(((String) objArr[0]).intern(), json);
                this.j.post(this.e.getTpoInfoUrl(this.f), map, new getSignPrikeyCCFPHFilename<ResponseBody>() { // from class: com.tmoney.c.A.1
                    public final void onFailure(getSignPrikeyCCFBPHFilename<ResponseBody> getsignprikeyccfbphfilename, Throwable th) {
                        ResultError resultError;
                        String strValueOf;
                        String str4;
                        if (th instanceof SocketTimeoutException) {
                            resultError = ResultError.NETWORK;
                            strValueOf = String.valueOf(CodeConstants.EERROR_CODE.TIMEOUT);
                            str4 = String.format("네트워크 연결상태가 불안합니다.\n네트워크 연결 상태를 확인해 주시고, 지속적으로 앱 접속 불가 시 고객센터(1644-0088)로 연락주세요.(%s)", "TIMEOUT ERROR");
                        } else {
                            resultError = ResultError.NETWORK;
                            strValueOf = String.valueOf(CodeConstants.EERROR_CODE.NETWORK);
                            str4 = String.format("네트워크 연결상태가 불안합니다.\n네트워크 연결 상태를 확인해 주시고, 지속적으로 앱 접속 불가 시 고객센터(1644-0088)로 연락주세요.(%s)", "NETWORK ERROR");
                        }
                        A.d(A.this, Callback.warning(resultError, strValueOf, str4));
                    }

                    public final void onResponse(getSignPrikeyCCFBPHFilename<ResponseBody> getsignprikeyccfbphfilename, Response<ResponseBody> response) {
                        try {
                            String str4 = new String(((ResponseBody) response.onExtraCallback()).bytes());
                            LogHelper.d("TpoInfoInterface", str4);
                            TpoResult tpoResult = (TpoResult) new Gson().fromJson(str4, TpoResult.class);
                            if (tpoResult == null || tpoResult.getResultData() == null) {
                                TpoResultData tpoResultData = new TpoResultData();
                                LogHelper.dw("TpoInfoInterface", "tpoResultData", str4);
                                A.b(A.this, TmoneyCallback.ResultType.SUCCESS.setData(tpoResultData));
                            } else {
                                TpoResultData resultData = tpoResult.getResultData();
                                LogHelper.dw("TpoInfoInterface", "tpoResultData", str4);
                                A.a(A.this, Callback.success(resultData));
                            }
                            A.a(A.this);
                        } catch (Exception e) {
                            A a = A.this;
                            ResultError resultError = ResultError.EXCEPTION;
                            ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_SERVER;
                            A.c(a, Callback.warning(resultError, resultDetailCode.getCodeString(), resultDetailCode.getMessage()).setLog(e.getMessage()).setException(e));
                        }
                    }
                });
                int i4 = onWarmupCompleted + 97;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return;
            } catch (Exception e) {
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_SERVER;
                data = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog(e.getMessage()).setException(e);
            }
        } else {
            data = TmoneyCallback.ResultType.SUCCESS.setData(new TpoResultData());
        }
        onResult(data);
    }

    private static void k(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 23;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (Process.myPid() >> 22)), 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 10278 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 12844), KeyEvent.getDeadChar(0, 0) + 55, TextUtils.indexOf("", "") + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i9 = $11 + 31;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.alpha(0)), 55 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2166, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i11 = $11 + 43;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 / 4;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
