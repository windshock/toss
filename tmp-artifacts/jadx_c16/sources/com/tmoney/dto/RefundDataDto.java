package com.tmoney.dto;

import com.tmoney.kscc.sslio.dto.response.ResultTRDR0017RowDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class RefundDataDto {
    private String mAcntDsptDt;
    private String mAcntNo;
    private String mBnkNm;
    private String mCusRyAmt;
    private String mRcvStaCd;
    private String mRyReqDt;

    public RefundDataDto(ResultTRDR0017RowDTO resultTRDR0017RowDTO) {
        this.mCusRyAmt = resultTRDR0017RowDTO.getCusRyAmt();
        this.mBnkNm = resultTRDR0017RowDTO.getBnkNm();
        this.mAcntNo = resultTRDR0017RowDTO.getAcntNo();
        this.mRyReqDt = resultTRDR0017RowDTO.getRyReqDt();
        this.mAcntDsptDt = resultTRDR0017RowDTO.getAcntDpstDt();
        this.mRcvStaCd = resultTRDR0017RowDTO.getRcvStaCd();
    }

    public String getAcntDsptDt() {
        return this.mAcntDsptDt;
    }

    public String getAcntNo() {
        return this.mAcntNo;
    }

    public String getBnkNm() {
        return this.mBnkNm;
    }

    public String getCusRyAmt() {
        return this.mCusRyAmt;
    }

    public String getRcvStaCd() {
        return this.mRcvStaCd;
    }

    public String getRyReqDt() {
        return this.mRyReqDt;
    }
}
