package com.tmoney.telecom.skt;

import android.content.Context;
import android.text.TextUtils;
import com.skp.smarttouch.sem.SEManagerConnection;
import com.skp.smarttouch.sem.nfc.NfcAuth;
import com.skp.smarttouch.sem.telco.SEUtility;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.dao.SEMDispatchData;
import com.skp.smarttouch.sem.tools.dao.SEMResultData;
import com.skp.smarttouch.sem.tools.dao.STAuthInfo;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SktNfcAuthCheck {
    private Context c;
    private com.tmoney.g.b.a d;
    private a e;
    private NfcAuth f;
    private boolean g;
    private final String a = "SktNfcAuthCheck";
    private final String b = "NfcAuth ";
    private String h = "[AU009]\\n유심 모듈 연결중 오류가 발생하였습니다. 종료후 재시도 해주시기 바랍니다.\\n동일 현상이 지속적으로 발생되면 티머니 고객센터(1644-0088)로 연락 바랍니다.";
    private String i = "[AUS01]\\n티머니를 지원하지 않는 단말입니다.";
    private String j = "[AUS02]\\n통신사에 개통/등록되지 않은 유심입니다. 개통 후 시도해주세요.\\n";
    private String k = "[AUS03]\\n통신사에서 NFC 기능이 지원되지 않는 스마트폰/유심으로 확인됩니다. 통신사로 확인 후 재시도해주세요.\\n";
    private String l = "[AUS04]\\n통신사에서 NFC 기능이 지원되지 않는 스마트폰으로 확인됩니다. 통신사로 확인 후 재시도해주세요.\\n";
    private String m = "[AUS05]\\n통신사에서 NFC 기능이 지원되지 않는 유심으로 확인됩니다. 통신사로 확인 후 재시도해주세요.\\n";
    private String n = "[AUS06]\\n통신사에서 티머니 기능이 지원되지 않는 유심으로 확인됩니다. 통신사로 확인 후 재시도해주세요.\\n";

    /* renamed from: o, reason: collision with root package name */
    private String f4o = "[AUS07]\\n통신사에서 NFC 기능이 지원되지 않는 스마트폰으로 확인됩니다. 통신사로 확인 후 재시도해주세요.\\n";
    private String p = "[AUS08]\\n통신사에서 티머니 기능이 지원되지 않는 스마트폰으로 확인됩니다. 통신사로 확인 후 재시도해주세요.\\n";
    private SEManagerConnection q = new SEManagerConnection() { // from class: com.tmoney.telecom.skt.SktNfcAuthCheck.1
        public final void onDispatchAPI(SEMDispatchData sEMDispatchData) {
            LogHelper.d("SktNfcAuthCheck", "NfcAuth onDispatchAPI " + sEMDispatchData.getMessage());
        }

        public final void onResultAPI(SEMResultData sEMResultData) {
            LogHelper.d("SktNfcAuthCheck", "NfcAuth ResultAPI type:" + sEMResultData.getType() + ", code:" + sEMResultData.getResultCode().getCode() + ", msg:" + sEMResultData.getResultCode().getMessage());
            if (APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN.equals(sEMResultData.getType())) {
                if (!APIResultCode.SUCCESS.equals(sEMResultData.getResultCode())) {
                    String str = sEMResultData.getResultCode().getMessage() + "(" + sEMResultData.getResultCode().getCode() + ")";
                    LogHelper.d("SktNfcAuthCheck", "NfcAuth ResultAPI carrierApiNfcYn(): error");
                    SktNfcAuthCheck.a(SktNfcAuthCheck.this, ResultError.API_RESULT_FAILED, str);
                    return;
                }
                STAuthInfo sTAuthInfo = (STAuthInfo) sEMResultData.getData();
                boolean zIsAuthResult = sTAuthInfo.isAuthResult();
                String strA = SktNfcAuthCheck.a(SktNfcAuthCheck.this, sTAuthInfo.getAuthResult_msg());
                LogHelper.d("SktNfcAuthCheck", "NfcAuth ResultAPI carrierApiNfcYn(): " + zIsAuthResult + ", authResultMsg: " + strA);
                if (zIsAuthResult) {
                    SktNfcAuthCheck.c(SktNfcAuthCheck.this);
                } else {
                    SktNfcAuthCheck.a(SktNfcAuthCheck.this, ResultError.NOT_SUPPORT, strA);
                }
            }
        }

        public final void onServiceConnected(String str) {
            LogHelper.d("SktNfcAuthCheck", "onServiceConnected [" + str + "]");
            SktNfcAuthCheck.this.f.carrierApiNfcYn();
        }

        public final void onServiceDisconnected(String str, int i) {
            LogHelper.d("SktNfcAuthCheck", "onServiceDisconnected [" + str + "][" + i + "]");
            try {
                SktNfcAuthCheck sktNfcAuthCheck = SktNfcAuthCheck.this;
                SktNfcAuthCheck.a(sktNfcAuthCheck, ResultError.USIM, sktNfcAuthCheck.h);
            } catch (Exception e) {
                LogHelper.e("SktNfcAuthCheck", "onServiceDisconnected::" + LogHelper.printStackTraceToString(e));
            }
        }
    };

    public interface a {
        void onSktNfcAuthError(ResultError resultError, String str);

        void onSktNfcAuthSuccess();
    }

    public SktNfcAuthCheck(Context context, a aVar) {
        LogHelper.d("SktNfcAuthCheck", "NfcAuth SktNfcAuthCheck start");
        if (DeviceInfoHelper.SET_ESIM) {
            SEUtility.setServerType(context, true);
        }
        this.c = context;
        this.d = com.tmoney.g.b.a.getInstance(context);
        NfcAuth nfcAuth = NfcAuth.getInstance(context);
        this.f = nfcAuth;
        this.g = true;
        nfcAuth.initialize(this.d.getSkStId(), this.q);
        this.e = aVar;
    }

    static /* synthetic */ String a(SktNfcAuthCheck sktNfcAuthCheck, String str) {
        if (!TextUtils.isEmpty(str)) {
            String strReplaceAll = str.replaceAll(" ", "");
            if (strReplaceAll.contains("SKT가입자")) {
                str = sktNfcAuthCheck.j;
            } else if (strReplaceAll.contains("NFC미지원")) {
                if (strReplaceAll.contains("카드및")) {
                    str = sktNfcAuthCheck.k;
                } else if (strReplaceAll.contains("단말")) {
                    str = sktNfcAuthCheck.l;
                } else if (strReplaceAll.contains("카드")) {
                    str = sktNfcAuthCheck.m;
                }
            } else if (strReplaceAll.contains("CarrierApi")) {
                if (strReplaceAll.contains("카드")) {
                    str = sktNfcAuthCheck.n;
                } else if (strReplaceAll.contains("단말")) {
                    str = sktNfcAuthCheck.f4o;
                } else if (strReplaceAll.contains("OS")) {
                    str = sktNfcAuthCheck.p;
                }
            }
        }
        return TextUtils.isEmpty(str) ? sktNfcAuthCheck.i : str;
    }

    private void a() {
        LogHelper.d("SktNfcAuthCheck", "NfcAuth NfcAuthFinalize");
        this.g = false;
        NfcAuth nfcAuth = this.f;
        if (nfcAuth != null) {
            nfcAuth.finalize();
            this.f = null;
        }
        if (this.q != null) {
            this.q = null;
        }
    }

    static /* synthetic */ void a(SktNfcAuthCheck sktNfcAuthCheck, ResultError resultError, String str) {
        if (sktNfcAuthCheck.g) {
            sktNfcAuthCheck.a();
            a aVar = sktNfcAuthCheck.e;
            if (aVar != null) {
                aVar.onSktNfcAuthError(resultError, str);
            }
            sktNfcAuthCheck.g = false;
        }
    }

    static /* synthetic */ void c(SktNfcAuthCheck sktNfcAuthCheck) {
        if (sktNfcAuthCheck.g) {
            sktNfcAuthCheck.a();
            a aVar = sktNfcAuthCheck.e;
            if (aVar != null) {
                aVar.onSktNfcAuthSuccess();
            }
            sktNfcAuthCheck.g = false;
        }
    }
}
