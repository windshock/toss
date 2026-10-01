package com.tmoney.c;

import android.content.Context;
import com.tmoney.dto.PostpaidBillInfoListDto;
import com.tmoney.dto.PostpaidBillingInfoDto;
import com.tmoney.dto.PostpaidBillingResultDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.aa;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResultTRDR0001RowDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0001ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class l extends BaseTmoneyCallback {
    private final String a;
    private Context b;
    private String c;
    private String d;
    private AbstractC0045f.a e;

    public l(Context context, String str, String str2, ResultListener resultListener) {
        super(resultListener);
        this.a = "PostPaidBillingInfoInstance";
        this.e = new AbstractC0045f.a() { // from class: com.tmoney.c.l.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str3, String str4) {
                l.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str3).setMessage(str4));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                l.this.onResult(TmoneyCallback.ResultType.SUCCESS.setData(l.a(l.this, (TRDR0001ResponseDTO) responseDTO).getBillInfo()));
            }
        };
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    static /* synthetic */ PostpaidBillingResultDto a(l lVar, TRDR0001ResponseDTO tRDR0001ResponseDTO) {
        PostpaidBillingResultDto postpaidBillingResultDto = new PostpaidBillingResultDto();
        PostpaidBillingInfoDto billInfo = postpaidBillingResultDto.getBillInfo();
        billInfo.setTtam(tRDR0001ResponseDTO.getResponse().getBillAmt());
        billInfo.setBillDay(tRDR0001ResponseDTO.getResponse().getBillDay());
        billInfo.setUseTtam(tRDR0001ResponseDTO.getResponse().getUseAmt());
        billInfo.setAprvTtam(tRDR0001ResponseDTO.getResponse().getAprvAmt());
        billInfo.setNAprvYn(tRDR0001ResponseDTO.getResponse().getNAprvYn());
        billInfo.setNAprvTtam(tRDR0001ResponseDTO.getResponse().getNAprvAmt());
        billInfo.setCancTtam(tRDR0001ResponseDTO.getResponse().getCancAmt());
        billInfo.setPntTtam(tRDR0001ResponseDTO.getResponse().getPntAmt());
        if (tRDR0001ResponseDTO.getResponse().getApprDtaV() != null) {
            for (int i = 0; i < tRDR0001ResponseDTO.getResponse().getApprDtaV().size(); i++) {
                PostpaidBillInfoListDto postpaidBillInfoListDto = new PostpaidBillInfoListDto();
                ResultTRDR0001RowDTO resultTRDR0001RowDTO = tRDR0001ResponseDTO.getResponse().getApprDtaV().get(i);
                postpaidBillInfoListDto.setCrcmNm(resultTRDR0001RowDTO.getCrcmNm());
                postpaidBillInfoListDto.setTrdDt(resultTRDR0001RowDTO.getTrdDt());
                postpaidBillInfoListDto.setAmt(resultTRDR0001RowDTO.getAmt());
                postpaidBillInfoListDto.setCrcmCd(resultTRDR0001RowDTO.getCrcmCd());
                postpaidBillInfoListDto.setLinkId(resultTRDR0001RowDTO.getTakDt());
                postpaidBillInfoListDto.setSeq(resultTRDR0001RowDTO.getSKey());
                postpaidBillInfoListDto.setKey(resultTRDR0001RowDTO.getSKey());
                billInfo.getApprList().add(postpaidBillInfoListDto);
            }
        }
        if (tRDR0001ResponseDTO.getResponse().getCancDtaV() != null) {
            for (int i2 = 0; i2 < tRDR0001ResponseDTO.getResponse().getCancDtaV().size(); i2++) {
                PostpaidBillInfoListDto postpaidBillInfoListDto2 = new PostpaidBillInfoListDto();
                ResultTRDR0001RowDTO resultTRDR0001RowDTO2 = tRDR0001ResponseDTO.getResponse().getCancDtaV().get(i2);
                postpaidBillInfoListDto2.setCrcmNm(resultTRDR0001RowDTO2.getCrcmNm());
                postpaidBillInfoListDto2.setTrdDt(resultTRDR0001RowDTO2.getTrdDt());
                postpaidBillInfoListDto2.setAmt(resultTRDR0001RowDTO2.getAmt());
                postpaidBillInfoListDto2.setCrcmCd(resultTRDR0001RowDTO2.getCrcmCd());
                postpaidBillInfoListDto2.setLinkId(resultTRDR0001RowDTO2.getTakDt());
                postpaidBillInfoListDto2.setSeq(resultTRDR0001RowDTO2.getSKey());
                postpaidBillInfoListDto2.setKey(resultTRDR0001RowDTO2.getSKey());
                billInfo.getCancelList().add(postpaidBillInfoListDto2);
            }
        }
        if (tRDR0001ResponseDTO.getResponse().getPntDtaV() != null) {
            for (int i3 = 0; i3 < tRDR0001ResponseDTO.getResponse().getPntDtaV().size(); i3++) {
                PostpaidBillInfoListDto postpaidBillInfoListDto3 = new PostpaidBillInfoListDto();
                ResultTRDR0001RowDTO resultTRDR0001RowDTO3 = tRDR0001ResponseDTO.getResponse().getPntDtaV().get(i3);
                postpaidBillInfoListDto3.setPointName(resultTRDR0001RowDTO3.getCrcmNm());
                postpaidBillInfoListDto3.setTrdDt(resultTRDR0001RowDTO3.getTrdDt());
                postpaidBillInfoListDto3.setAmt(resultTRDR0001RowDTO3.getAmt());
                postpaidBillInfoListDto3.setCrcmCd(resultTRDR0001RowDTO3.getCrcmCd());
                postpaidBillInfoListDto3.setLinkId(resultTRDR0001RowDTO3.getTakDt());
                postpaidBillInfoListDto3.setSeq(resultTRDR0001RowDTO3.getSKey());
                postpaidBillInfoListDto3.setKey(resultTRDR0001RowDTO3.getSKey());
                billInfo.getPointList().add(postpaidBillInfoListDto3);
            }
        }
        postpaidBillingResultDto.setBillInfo(billInfo);
        return postpaidBillingResultDto;
    }

    public final void excutePostPaidBillingInfo() {
        new aa(this.b, this.e).execute(this.d, this.c);
    }
}
