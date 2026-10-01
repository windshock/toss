package com.tmoney.ota.b;

import com.tmoney.ota.dto.OTAData05;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.StringHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class g extends b {
    public static final String PROGRAM_ID = "SessDtaPrcgC";
    public int BODY_LENGTH;
    private final String b;
    private OTAData05 c;

    public g(OTAData05 oTAData05) {
        super(PROGRAM_ID);
        this.b = "OTAPacket05";
        this.BODY_LENGTH = 879;
        if (TmoneyData.getInstance().isGamin()) {
            this.a = i.PROGRAM_ID;
            this.BODY_LENGTH += 4;
        }
        this.c = oTAData05;
    }

    @Override // com.tmoney.ota.b.b
    protected final byte[] a() {
        int i;
        int i2 = this.BODY_LENGTH;
        byte[] bArr = new byte[i2];
        ByteHelper.MEMSET(bArr, 0, (byte) 32, i2);
        ByteHelper.STRNCPYToSpace(bArr, 0, this.c.getISSU_REQ_SNO().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 16, this.c.getMSG_DVS_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 17, this.c.getTLCN_SERV_ID().getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 20, StringHelper.padZero(this.c.getMSG_SNO(), 3).getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 23, this.c.getSP_ID().getBytes(), 0, 7);
        ByteHelper.STRNCPYToSpace(bArr, 30, this.c.getRST_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 31, this.c.getRTRM_YN().getBytes(), 0, 1);
        if (TmoneyData.getInstance().isGamin()) {
            ByteHelper.STRNCPYToSpace(bArr, 32, this.c.getUNIC_CARD_NO().getBytes(), 0, 20);
            i = 52;
        } else {
            ByteHelper.STRNCPYToSpace(bArr, 32, this.c.getUNIC_CARD_NO().getBytes(), 4, 20);
            i = 48;
        }
        ByteHelper.STRNCPYToSpace(bArr, i, this.c.getHNDH_TEL_NO().getBytes(), 0, 12);
        int i3 = i + 12;
        LogHelper.d("OTAPacket05", "TLCM_CD:" + this.c.getTLCM_CD());
        if (TmoneyData.getInstance().isGamin()) {
            ByteHelper.STRNCPYToSpace(bArr, i3, "D".getBytes(), 0, 3);
        } else {
            ByteHelper.STRNCPYToSpace(bArr, i3, this.c.getTLCM_CD().getBytes(), 0, 3);
        }
        ByteHelper.STRNCPYToSpace(bArr, i + 15, this.c.getENCR_DTA().getBytes(), 0, 512);
        ByteHelper.STRNCPYToSpace(bArr, i + 527, this.c.getTL_PRRS_CD().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, i + 531, this.c.getRST_MSG().getBytes(), 0, 300);
        return bArr;
    }
}
