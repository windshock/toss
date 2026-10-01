package com.tmoney.dto;

import com.tmoney.kscc.sslio.dto.response.ResultTRDR0004RowDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class MonthlySumDto {
    private String mChgAmt;
    private String mDvsCd;
    private String mMon;
    private String mUseAmt;

    public MonthlySumDto(ResultTRDR0004RowDTO resultTRDR0004RowDTO) {
        this.mMon = "";
        this.mDvsCd = "";
        this.mChgAmt = "";
        this.mUseAmt = "";
        this.mMon = resultTRDR0004RowDTO.getMon();
        this.mDvsCd = resultTRDR0004RowDTO.getDvsCd();
        this.mChgAmt = resultTRDR0004RowDTO.getChgAmt();
        this.mUseAmt = resultTRDR0004RowDTO.getUseAmt();
    }

    public String getChgAmt() {
        return this.mChgAmt;
    }

    public String getDvsCd() {
        return this.mDvsCd;
    }

    public String getMon() {
        return this.mMon;
    }

    public String getUseAmt() {
        return this.mUseAmt;
    }
}
