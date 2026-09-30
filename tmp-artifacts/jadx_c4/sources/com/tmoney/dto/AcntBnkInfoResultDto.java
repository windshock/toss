package com.tmoney.dto;

import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class AcntBnkInfoResultDto {
    private ArrayList<AcntBnkInfoRowDto> acntBnkList;

    public AcntBnkInfoResultDto(ArrayList<AcntBnkInfoRowDto> arrayList) {
        this.acntBnkList = arrayList;
    }

    public ArrayList<AcntBnkInfoRowDto> getAcntBnkList() {
        return this.acntBnkList;
    }
}
