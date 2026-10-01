package com.tmoney.dto;

import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PostpaidBillingResultDto {
    ArrayList<PostpaidBillingDayDto> billDay = new ArrayList<>();
    PostpaidBillingInfoDto billInfo = new PostpaidBillingInfoDto();

    public ArrayList<PostpaidBillingDayDto> getBillDay() {
        return this.billDay;
    }

    public PostpaidBillingInfoDto getBillInfo() {
        return this.billInfo;
    }

    public void setBillInfo(PostpaidBillingInfoDto postpaidBillingInfoDto) {
        this.billInfo = postpaidBillingInfoDto;
    }
}
