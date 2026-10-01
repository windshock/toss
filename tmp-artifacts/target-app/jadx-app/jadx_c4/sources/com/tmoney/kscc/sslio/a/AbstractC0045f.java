package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.tmoney.LiveCheckConstants;
import com.tmoney.Tmoney;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.AppInfoHelper;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.getSignPrikeyCCFBPHFilename;
import o.getSignPrikeyCCFPHFilename;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* renamed from: com.tmoney.kscc.sslio.a.f, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AbstractC0045f extends AbstractC0046g {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    protected static Context b;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    protected String a;
    private APIConstants.EAPI_CONST c;
    private a d;
    private Gson e;
    private boolean f;
    public Object m_object;
    public TmoneyData m_tmoneyData;

    /* renamed from: com.tmoney.kscc.sslio.a.f$a */
    public interface a {
        void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2);

        void onConnectionSuccess(ResponseDTO responseDTO);
    }

    static {
        onExtraCallback();
        int i = IAuthTabCallbackStub + 95;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AbstractC0045f() {
        this.a = "APIInstance";
        this.d = null;
        this.m_tmoneyData = null;
        this.m_object = null;
        this.e = null;
        this.f = true;
    }

    public AbstractC0045f(Context context, APIConstants.EAPI_CONST eapi_const, a aVar) {
        this.a = "APIInstance";
        this.m_tmoneyData = null;
        this.m_object = null;
        this.e = null;
        this.f = true;
        b = context;
        this.c = eapi_const;
        this.d = aVar;
        this.m_tmoneyData = TmoneyData.getInstance(context);
        this.e = new Gson();
    }

    protected static Context a() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return b;
        }
        throw null;
    }

    static /* synthetic */ boolean a(AbstractC0045f abstractC0045f) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean z = abstractC0045f.f;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ a b(AbstractC0045f abstractC0045f) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        a aVar = abstractC0045f.d;
        int i5 = i3 + 71;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    protected final void a(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.f) {
            LogHelper.d(this.a, "request::" + str);
            int i3 = asBinder + 31;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        O.getInstance().post(APIConstants.getServerIP(this.m_tmoneyData.getServerType(), this.c), str, new getSignPrikeyCCFPHFilename<ResponseBody>() { // from class: com.tmoney.kscc.sslio.a.f.1
            public final void onFailure(getSignPrikeyCCFBPHFilename<ResponseBody> getsignprikeyccfbphfilename, Throwable th) {
                CodeConstants.EERROR_CODE eerror_code;
                String str2;
                LogHelper.d(AbstractC0045f.this.a, "onFailure()");
                LogHelper.d(AbstractC0045f.this.a, th.getMessage());
                if (th instanceof SocketTimeoutException) {
                    eerror_code = CodeConstants.EERROR_CODE.TIMEOUT;
                    str2 = String.format("네트워크 연결상태가 불안합니다.\n네트워크 연결 상태를 확인해 주시고, 지속적으로 앱 접속 불가 시 고객센터(1644-0088)로 연락주세요.(%s)", "TIMEOUT ERROR");
                } else {
                    eerror_code = CodeConstants.EERROR_CODE.NETWORK;
                    str2 = String.format("네트워크 연결상태가 불안합니다.\n네트워크 연결 상태를 확인해 주시고, 지속적으로 앱 접속 불가 시 고객센터(1644-0088)로 연락주세요.(%s)", "NETWORK ERROR");
                }
                eerror_code.setMsg(str2);
                LogHelper.d(AbstractC0045f.this.a, "onErrorResponse() eCode:" + eerror_code);
                if (AbstractC0045f.b(AbstractC0045f.this) != null) {
                    AbstractC0045f.b(AbstractC0045f.this).onConnectionError(AbstractC0045f.this.b(), eerror_code.getCode(), eerror_code.getMsg());
                }
            }

            public final void onResponse(getSignPrikeyCCFBPHFilename<ResponseBody> getsignprikeyccfbphfilename, Response<ResponseBody> response) {
                String str2;
                String str3;
                str2 = "";
                try {
                    str3 = new String(((ResponseBody) response.onExtraCallback()).bytes());
                    try {
                        String str4 = AbstractC0045f.this.a;
                        StringBuilder sb = new StringBuilder("onResponse() ");
                        sb.append(AbstractC0045f.a(AbstractC0045f.this) ? str3 : "");
                        LogHelper.d(str4, sb.toString());
                        str2 = TextUtils.isEmpty(str3) ? "{\"err\":{\"code\":\"ER01\",\"message\":\"Response Empty\"}}" : str3.contains("\"err\":{\"code\":\"0550\"}") ? "{\"err\":{\"code\":\"0550\",\"message\":\"응답오류\"}}" : str3;
                        AbstractC0045f.this.onResponse(str2);
                    } catch (Exception unused) {
                        LogHelper.d(AbstractC0045f.this.a, "PARSE ERROR : " + str3);
                        AbstractC0045f.this.onResponse("{\"err\":{\"code\":\"0550\",\"message\":\"PARSE ERROR\"}}");
                    }
                } catch (Exception unused2) {
                    str3 = str2;
                }
            }
        });
    }

    protected final APIConstants.EAPI_CONST b() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        APIConstants.EAPI_CONST eapi_const = this.c;
        int i5 = i3 + 115;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return eapi_const;
        }
        throw null;
    }

    protected final Gson c() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Gson gson = this.e;
        int i5 = i3 + 79;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return gson;
    }

    protected final a d() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 53;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        a aVar = this.d;
        int i4 = i2 + 109;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return aVar;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public void destroy() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.e = null;
        this.m_object = null;
        this.m_tmoneyData = null;
        this.d = null;
        b = null;
        this.a = null;
        int i5 = i3 + 107;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final RequestDTO e() {
        int i = 2 % 2;
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setTxId(String.format("%s%s%s", DeviceInfoHelper.getLine1NumberLocaleRemove(b), this.m_tmoneyData.getCardNumber(), Integer.valueOf(((int) (Math.random() * 900000.0d)) + 100000)));
        requestDTO.setPartnerKey(Tmoney.getAffiliateKey());
        requestDTO.setBsnCd(APIConstants.getAPIValue(this.c, APIConstants.EAPI_CONST_TYPE.EAPI_CONST_TYPE_2_CODE));
        requestDTO.setLocale("KOR");
        Object[] objArr = new Object[1];
        j(new char[]{32334, 26129}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        requestDTO.setToken(((String) objArr[0]).intern());
        requestDTO.setPartnerCd(Tmoney.getAffiliateCd());
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return requestDTO;
        }
        throw null;
    }

    protected final String f() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String line1NumberLocaleRemove = DeviceInfoHelper.getLine1NumberLocaleRemove(b);
        int i4 = asBinder + 33;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return line1NumberLocaleRemove;
    }

    protected final String g() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String simSerialNumber = DeviceInfoHelper.getSimSerialNumber(b);
        int i4 = onTransact + 109;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return simSerialNumber;
    }

    protected final String h() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String appVersion = AppInfoHelper.getAppVersion(b);
        int i4 = asBinder + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return appVersion;
    }

    private static void j(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 47;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 117;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", i3);
                        int iAlpha = Color.alpha(i3) + 10;
                        int minimumFlingVelocity = 12434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, iAlpha, minimumFlingVelocity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12435 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 14 - Color.argb(0, 0, 0, 0), 19901 - (Process.myTid() >> 22), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onNavigationEvent = (char) 705;
        IAuthTabCallback = (char) 14817;
        onExtraCallbackWithResult = (char) 25615;
        onWarmupCompleted = (char) 27197;
    }
}
