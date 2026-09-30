package com.tmoney.ota.b;

import com.tmoney.ota.dto.OTAData02;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.StringHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class d extends b {
    public static final String PROGRAM_ID = "rqstCrdPrdIn";
    public int BODY_LENGTH;
    private OTAData02 b;

    public d(OTAData02 oTAData02) {
        super(PROGRAM_ID);
        this.BODY_LENGTH = 472;
        if (TmoneyData.getInstance().isGamin()) {
            this.a = "rqstCrdPrdG";
            this.BODY_LENGTH += 4;
        }
        this.b = oTAData02;
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
        ByteHelper.STRNCPYToSpace(bArr, 32, this.b.getCARD_NO().getBytes(), 0, 16);
        if (TmoneyData.getInstance().isGamin()) {
            ByteHelper.STRNCPYToSpace(bArr, 48, this.b.getUNIC_CARD_NO().getBytes(), 0, 20);
            i = 68;
        } else {
            ByteHelper.STRNCPYToSpace(bArr, 48, this.b.getUNIC_CARD_NO().getBytes(), 4, 20);
            i = 64;
        }
        if (TmoneyData.getInstance().isGamin()) {
            ByteHelper.STRNCPYToSpace(bArr, i, "D".getBytes(), 0, 3);
        } else {
            ByteHelper.STRNCPYToSpace(bArr, i, this.b.getTLCM_CD().getBytes(), 0, 3);
        }
        ByteHelper.STRNCPYToSpace(bArr, i + 3, StringHelper.padZero(this.b.getAPP_CNT(), 3).getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, i + 6, "".getBytes(), 0, 6);
        ByteHelper.STRNCPYToSpace(bArr, i + 12, "".getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, i + 32, "".getBytes(), 0, 50);
        ByteHelper.STRNCPYToSpace(bArr, i + 82, "".getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, i + 102, "".getBytes(), 0, 2);
        ByteHelper.STRNCPYToSpace(bArr, i + 104, this.b.getTL_PRRS_CD().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, i + 108, this.b.getRST_MSG().getBytes(), 0, 300);
        return bArr;
    }
}
