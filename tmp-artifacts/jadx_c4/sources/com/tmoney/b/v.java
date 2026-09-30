package com.tmoney.b;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.TmoneyInfo;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0051o;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.DPCG0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class v extends com.tmoney.g.a.a {
    private final String a;
    private TmoneyInfo b;
    private int c;
    private APIConstants.EAPI_CONST d;
    private int e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private String k;
    private String l;
    private String m;
    private AbstractC0045f.a n;

    public v(Context context, int i, String str, ResultListener resultListener) {
        APIConstants.EAPI_CONST eapi_const;
        super(context, resultListener);
        this.a = "TmoneyPostPaidLoadExecuter";
        this.c = 0;
        this.h = false;
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = new 1(this);
        this.b = TmoneyInfo.getInstance(context);
        this.e = i;
        if ("K".equals(str) || "P".equals(str) || "M".equals(str)) {
            eapi_const = APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0001;
        } else {
            this.f = (TextUtils.equals(str, "N") || TextUtils.equals(str, "X")) ? "Y" : "N";
            this.g = TextUtils.equals(str, "C") ? CodeConstants.AUT_MNL_DVS_MNL : CodeConstants.AUT_MNL_DVS_AUT;
            eapi_const = APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0003;
        }
        this.d = eapi_const;
    }

    static /* synthetic */ void a(v vVar, ResponseDTO responseDTO) {
        String rspCd;
        if (vVar.d == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0001) {
            DPCG0001ResponseDTO dPCG0001ResponseDTO = (DPCG0001ResponseDTO) responseDTO;
            vVar.i = (dPCG0001ResponseDTO == null || dPCG0001ResponseDTO.getResponse() == null || !TextUtils.equals(dPCG0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) ? false : true;
            if (dPCG0001ResponseDTO == null || dPCG0001ResponseDTO.getResponse() == null) {
                return;
            }
            vVar.l = dPCG0001ResponseDTO.getResponse().getLoadApdu();
            vVar.m = dPCG0001ResponseDTO.getResponse().getChgTrdNo();
            vVar.j = dPCG0001ResponseDTO.getResponse().getRspMsg();
            rspCd = dPCG0001ResponseDTO.getResponse().getRspCd();
        } else {
            DPCG0003ResponseDTO dPCG0003ResponseDTO = (DPCG0003ResponseDTO) responseDTO;
            vVar.i = (dPCG0003ResponseDTO == null || dPCG0003ResponseDTO.getResponse() == null || !TextUtils.equals(dPCG0003ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) ? false : true;
            if (dPCG0003ResponseDTO == null || dPCG0003ResponseDTO.getResponse() == null) {
                return;
            }
            vVar.l = dPCG0003ResponseDTO.getResponse().getLoadApdu();
            vVar.m = dPCG0003ResponseDTO.getResponse().getChgTrdNo();
            vVar.j = dPCG0003ResponseDTO.getResponse().getRspMsg();
            rspCd = dPCG0003ResponseDTO.getResponse().getRspCd();
        }
        vVar.k = rspCd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), Integer.valueOf(this.c), Integer.valueOf(p()));
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws NumberFormatException {
        TmoneyCallback.ResultType message;
        StringBuilder sb;
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            this.c = p();
            int registedPostPaidLimitAmount = this.b.getRegistedPostPaidLimitAmount();
            int i = this.c;
            int i2 = this.e;
            if (registedPostPaidLimitAmount != i + i2) {
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.USIM_AMOUNT_ERROR;
                message = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
                sb = new StringBuilder("BeforeBalance:");
                sb.append(this.c);
                sb.append("/ReqAmount:");
                sb.append(this.e);
            } else {
                if (b(i2)) {
                    if (this.d == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0001) {
                        new C0051o(getContext(), this.n).execute(b(), c(), Integer.toString(this.e));
                    } else {
                        new com.tmoney.kscc.sslio.a.q(getContext(), this.n).execute(b(), c(), Integer.toString(this.e), this.g, this.f);
                    }
                    return this.c;
                }
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.USIM_INIT_LOAD;
                message = error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage());
                sb = new StringBuilder("ApduResInitLoad::");
                sb.append(c());
                sb.append(" SW::");
                sb.append(q());
            }
            resultType = message.setLog(sb.toString());
        }
        a(resultType);
        return p();
    }
}
