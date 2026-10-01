package com.tmoney.dto;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CardListDto {
    private List<CreditCardGroupDto> mPostpaidCardList;
    private List<CreditCardGroupDto> mPrepaidCardList;

    public CardListDto(List<CreditCardGroupDto> list, List<CreditCardGroupDto> list2) {
        this.mPrepaidCardList = list;
        this.mPostpaidCardList = list2;
    }

    public List<CreditCardGroupDto> getPostpaidCardList() {
        return this.mPostpaidCardList;
    }

    public List<CreditCardGroupDto> getPrePaidCardList() {
        return this.mPrepaidCardList;
    }
}
