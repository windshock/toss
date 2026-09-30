package com.tmoney.ota.b;

import com.tmoney.ota.dto.OTAData01;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.StringHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class c extends b {
    public static final String PROGRAM_ID = "IsrInfInqrC";
    public int BODY_LENGTH;
    private OTAData01 b;

    public c(OTAData01 oTAData01) {
        super(PROGRAM_ID);
        this.BODY_LENGTH = 645;
        if (TmoneyData.getInstance().isGamin()) {
            this.a = h.PROGRAM_ID;
            this.BODY_LENGTH += 4;
        }
        this.b = oTAData01;
    }

    @Override // com.tmoney.ota.b.b
    protected final byte[] a() {
        int i;
        int i2 = this.BODY_LENGTH;
        byte[] bArr = new byte[i2];
        ByteHelper.MEMSET(bArr, 0, (byte) 32, i2);
        ByteHelper.STRNCPYToSpace(bArr, 0, this.b.getISSU_REQ_SNO().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 16, this.b.getMSG_DVS_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 17, this.b.getTLCN_SERV_ID().getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 20, StringHelper.padZero(this.b.getMSG_SNO(), 3).getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 23, this.b.getSP_ID().getBytes(), 0, 7);
        ByteHelper.STRNCPYToSpace(bArr, 30, this.b.getRST_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 31, this.b.getRTRM_YN().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 32, this.b.getUSER_ID().getBytes(), 0, 16);
        if (TmoneyData.getInstance().isGamin()) {
            ByteHelper.STRNCPYToSpace(bArr, 48, this.b.getUNIC_CARD_NO().getBytes(), 0, 20);
            i = 68;
        } else {
            ByteHelper.STRNCPYToSpace(bArr, 48, this.b.getUNIC_CARD_NO().getBytes(), 4, 20);
            i = 64;
        }
        ByteHelper.STRNCPYToSpace(bArr, i, this.b.getCARD_NO().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, i + 16, this.b.getHNDH_TEL_NO().getBytes(), 0, 12);
        int i3 = i + 28;
        if (TmoneyData.getInstance().isGamin()) {
            ByteHelper.STRNCPYToSpace(bArr, i3, "D".getBytes(), 0, 3);
        } else {
            ByteHelper.STRNCPYToSpace(bArr, i3, this.b.getTLCM_CD().getBytes(), 0, 3);
        }
        ByteHelper.STRNCPYToSpace(bArr, i + 31, this.b.getAGE_DVS_CD().getBytes(), 0, 2);
        ByteHelper.STRNCPYToSpace(bArr, i + 33, this.b.getGNDR().getBytes(), 0, 2);
        ByteHelper.STRNCPYToSpace(bArr, i + 35, this.b.getMBPH_TRCN_NM().getBytes(), 0, 30);
        ByteHelper.STRNCPYToSpace(bArr, i + 65, this.b.getUSE_OS_VER().getBytes(), 0, 10);
        ByteHelper.STRNCPYToSpace(bArr, i + 75, this.b.getMOAPP_ID().getBytes(), 0, 200);
        ByteHelper.STRNCPYToSpace(bArr, i + 275, this.b.getTL_PRRS_CD().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, i + 279, this.b.getRST_MSG().getBytes(), 0, 300);
        return bArr;
    }
}
