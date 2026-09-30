package com.tmoney.dto;

import android.text.TextUtils;
import com.tmoney.TmoneyConstants;
import com.tmoney.TmoneyConstants$TmoneyTransType;
import com.tmoney.TmoneyConstants$UseTargetType;
import com.tmoney.kscc.sslio.dto.response.ResultTRDR0005RowDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class MonthlyHistoryDto {
    private int amount;
    private String cardTrdSno;
    private String dateTime;
    private TmoneyConstants.MonthlyHistoryType historyType;
    private TmoneyConstants$TmoneyTransType transType;
    private String usePlace;
    private TmoneyConstants$UseTargetType usePlaceType;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MonthlyHistoryDto(ResultTRDR0005RowDTO resultTRDR0005RowDTO) {
        TmoneyConstants.MonthlyHistoryType monthlyHistoryType;
        TmoneyConstants$UseTargetType tmoneyConstants$UseTargetType;
        TmoneyConstants$TmoneyTransType tmoneyConstants$TmoneyTransType;
        this.dateTime = resultTRDR0005RowDTO.getUseDt();
        this.usePlace = resultTRDR0005RowDTO.getStn();
        this.amount = Integer.parseInt(resultTRDR0005RowDTO.getAmt());
        this.cardTrdSno = resultTRDR0005RowDTO.getCardTrdSno();
        String dvsCd = resultTRDR0005RowDTO.getDvsCd();
        if (TextUtils.isEmpty(dvsCd)) {
            monthlyHistoryType = TmoneyConstants.MonthlyHistoryType.All;
        } else if (dvsCd.equals("01")) {
            monthlyHistoryType = TmoneyConstants.MonthlyHistoryType.Trans;
        } else if (dvsCd.equals("02")) {
            monthlyHistoryType = TmoneyConstants.MonthlyHistoryType.Shoping;
        } else if (dvsCd.equals("03")) {
            monthlyHistoryType = TmoneyConstants.MonthlyHistoryType.Gift;
        } else if (dvsCd.equals("04")) {
            monthlyHistoryType = TmoneyConstants.MonthlyHistoryType.Load;
        }
        this.historyType = monthlyHistoryType;
        String mns = resultTRDR0005RowDTO.getMns();
        if (TextUtils.isEmpty(mns)) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.UnKnown;
        } else if (mns.equals("01")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.Bus;
        } else if (mns.equals("02")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.Subway;
        } else if (mns.equals("03")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.Taxi;
        } else if (mns.equals("04")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.Shopping;
        } else if (mns.equals("05")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.Gift;
        } else if (mns.equals("06")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.Load;
        } else if (mns.equals("07")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.Refund;
        } else if (mns.equals("08")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.ExpressBus;
        } else if (mns.equals("09")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.IntercityBus;
        } else if (mns.equals("10")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.AirportBus;
        } else if (mns.equals("11")) {
            tmoneyConstants$UseTargetType = TmoneyConstants$UseTargetType.Train;
        }
        this.usePlaceType = tmoneyConstants$UseTargetType;
        String raa = resultTRDR0005RowDTO.getRaa();
        if (TextUtils.isEmpty(raa)) {
            tmoneyConstants$TmoneyTransType = TmoneyConstants$TmoneyTransType.UnKnown;
        } else if (raa.equals("00")) {
            tmoneyConstants$TmoneyTransType = TmoneyConstants$TmoneyTransType.GetOn;
        } else if (raa.equals("01")) {
            tmoneyConstants$TmoneyTransType = TmoneyConstants$TmoneyTransType.GetOff;
        }
        this.transType = tmoneyConstants$TmoneyTransType;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getCardTrdSno() {
        return this.cardTrdSno;
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public TmoneyConstants.MonthlyHistoryType getHistoryType() {
        return this.historyType;
    }

    public TmoneyConstants$TmoneyTransType getTransType() {
        return this.transType;
    }

    public String getUsePlace() {
        return this.usePlace;
    }

    public TmoneyConstants$UseTargetType getUsePlaceType() {
        return this.usePlaceType;
    }
}
