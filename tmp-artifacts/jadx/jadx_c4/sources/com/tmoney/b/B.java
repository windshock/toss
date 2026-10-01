package com.tmoney.b;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.K;
import com.tmoney.kscc.sslio.a.L;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.ACRY0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ACRY0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MSS0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MSS0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class B extends com.tmoney.g.a.a {
    AbstractC0045f.a a;
    private final String b;
    private TmoneyData c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private boolean k;
    private TmoneyCallback.ResultType l;
    private APIConstants.EAPI_CONST m;
    private AbstractC0045f.a n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC0045f.a f5o;

    public B(Context context, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyRefundForPrePaidExecuter";
        this.k = false;
        this.n = new AbstractC0045f.a() { // from class: com.tmoney.b.B.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str6, String str7) throws NumberFormatException {
                B.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str6).setMessage(str7), true);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws NumberFormatException {
                String unLoadApdu;
                String missTrdNo;
                String rspCd;
                String rspMsg;
                if (TextUtils.isEmpty(B.this.g) || TextUtils.isEmpty(B.this.h)) {
                    MSS0002ResponseDTO mSS0002ResponseDTO = (MSS0002ResponseDTO) responseDTO;
                    unLoadApdu = mSS0002ResponseDTO.getResponse().getUnLoadApdu();
                    missTrdNo = mSS0002ResponseDTO.getResponse().getMissTrdNo();
                    rspCd = mSS0002ResponseDTO.getResponse().getRspCd();
                    rspMsg = mSS0002ResponseDTO.getResponse().getRspMsg();
                } else {
                    ACRY0001ResponseDTO aCRY0001ResponseDTO = (ACRY0001ResponseDTO) responseDTO;
                    unLoadApdu = aCRY0001ResponseDTO.getResponse().getUnLoadApdu();
                    missTrdNo = aCRY0001ResponseDTO.getResponse().getAcntRyTrdNo();
                    rspCd = aCRY0001ResponseDTO.getResponse().getRspCd();
                    rspMsg = aCRY0001ResponseDTO.getResponse().getRspMsg();
                }
                if (TextUtils.isEmpty(unLoadApdu)) {
                    B.this.a(TmoneyCallback.ResultType.SUCCESS.setDetailCode(rspCd).setMessage(rspMsg), true);
                    return;
                }
                B b = B.this;
                b.k = b.a(unLoadApdu);
                if (TextUtils.isEmpty(B.this.g) || TextUtils.isEmpty(B.this.h)) {
                    new L(B.this.getContext(), B.this.a).execute(B.this.i(), missTrdNo);
                } else {
                    new com.tmoney.kscc.sslio.a.c(B.this.getContext(), B.this.a).execute(B.this.i(), missTrdNo);
                }
            }
        };
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.b.B.2
            private String a;
            private String b;

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str6, String str7) throws NumberFormatException {
                TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.SUCCESS;
                if (!B.this.k) {
                    resultType = TmoneyCallback.ResultType.WARNING;
                }
                B.this.a(resultType.setError(ResultError.SERVER_ERROR).setDetailCode(str6).setMessage(str7), true);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws NumberFormatException {
                String rspMsg;
                if (responseDTO instanceof ACRY0003ResponseDTO) {
                    ACRY0003ResponseDTO aCRY0003ResponseDTO = (ACRY0003ResponseDTO) responseDTO;
                    this.a = aCRY0003ResponseDTO.getResponse().getRspCd();
                    rspMsg = aCRY0003ResponseDTO.getResponse().getRspMsg();
                } else {
                    MSS0003ResponseDTO mSS0003ResponseDTO = (MSS0003ResponseDTO) responseDTO;
                    this.a = mSS0003ResponseDTO.getResponse().getRspCd();
                    rspMsg = mSS0003ResponseDTO.getResponse().getRspMsg();
                }
                this.b = rspMsg;
                B.this.a(TmoneyCallback.ResultType.SUCCESS.setDetailCode(this.a).setMessage(this.b), true);
            }
        };
        this.f5o = new AbstractC0045f.a() { // from class: com.tmoney.b.B.3
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str6, String str7) throws NumberFormatException {
                B b = B.this;
                b.a(b.l, false);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                B.this.c.setTmoneyData((MBR0003ResponseDTO) responseDTO);
                B b = B.this;
                b.a(b.l, false);
            }
        };
        this.c = TmoneyData.getInstance(context);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = (z ? CodeConstants.EMBL_SVC_TYP_CD.POSTPAID : CodeConstants.EMBL_SVC_TYP_CD.PREPAID).getCode();
        this.j = z2;
        this.m = (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) ? APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0002 : APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0001;
        LogHelper.d("TmoneyRefundForPrePaidExecuter", "accName : " + str4 + ", bankCode : " + str3 + ", reqAmt : " + str + ", fee : " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType, boolean z) throws NumberFormatException {
        if (z) {
            this.l = resultType;
            new com.tmoney.kscc.sslio.a.D(getContext(), this.f5o).execute();
            return;
        }
        TmoneyCallback.ResultType resultType2 = this.l;
        if (resultType2 == TmoneyCallback.ResultType.SUCCESS) {
            resultType2.setData(n(), Integer.valueOf(Integer.parseInt(this.d)), Integer.valueOf(p()));
        }
        onResult(this.l);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws NumberFormatException {
        super.execute(dVar, resultType);
        TmoneyCallback.ResultType log = TmoneyCallback.ResultType.SUCCESS;
        if (resultType == log) {
            try {
                if (!this.j || (p() > 0 && this.j)) {
                    if (k()) {
                        if (TextUtils.isEmpty(this.g) || TextUtils.isEmpty(this.h)) {
                            new K(getContext(), this.n).execute(b(), g(), this.d);
                        } else {
                            new com.tmoney.kscc.sslio.a.a(getContext(), this.n).execute(this.d, this.e, g(), b(), this.f, this.g, this.h, this.i, "N");
                        }
                        return p();
                    }
                    TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                    ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_REFUND;
                    log = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("ApduResInitUnLoad::" + g() + " SW::" + q());
                }
                this.l = log;
            } catch (Exception e) {
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.EXCEPTION_SERVER;
                this.l = error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setLog(e.getMessage()).setException(e);
            }
        } else if (this.l == null) {
            this.l = resultType;
        }
        a(this.l, true);
        return p();
    }
}
