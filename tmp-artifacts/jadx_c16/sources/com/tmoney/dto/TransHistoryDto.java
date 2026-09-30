package com.tmoney.dto;

import com.tmoney.TmoneyConstants$TmoneyTransType;
import com.tmoney.kscc.sslio.dto.response.ResultTRDR0003RowDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class TransHistoryDto {
    private int amount;
    private String dateTime;
    private TmoneyConstants$TmoneyTransType transType;

    public TransHistoryDto(ResultTRDR0003RowDTO resultTRDR0003RowDTO) {
        this.dateTime = resultTRDR0003RowDTO.getUseDt();
        this.amount = Integer.parseInt(resultTRDR0003RowDTO.getAmt());
        this.transType = resultTRDR0003RowDTO.getDvsCd().equals("승차") ? TmoneyConstants$TmoneyTransType.GetOn : resultTRDR0003RowDTO.getDvsCd().equals("하차") ? TmoneyConstants$TmoneyTransType.GetOff : TmoneyConstants$TmoneyTransType.UnKnown;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public TmoneyConstants$TmoneyTransType getTransType() {
        return this.transType;
    }
}
