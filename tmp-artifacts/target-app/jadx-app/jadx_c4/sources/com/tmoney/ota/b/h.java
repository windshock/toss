package com.tmoney.ota.b;

import com.tmoney.ota.dto.OTAData2001;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.StringHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class h extends b {
    public static final String PROGRAM_ID = "IsrInfInqrCG";
    public final int BODY_LENGTH;
    private OTAData2001 b;

    public h(OTAData2001 oTAData2001) {
        super(PROGRAM_ID);
        this.BODY_LENGTH = 649;
        this.b = oTAData2001;
    }

    @Override // com.tmoney.ota.b.b
    protected final byte[] a() {
        byte[] bArr = new byte[649];
        ByteHelper.MEMSET(bArr, 0, (byte) 32, 649);
        ByteHelper.STRNCPYToSpace(bArr, 0, this.b.getISSU_REQ_SNO().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 16, this.b.getMSG_DVS_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 17, this.b.getTLCN_SERV_ID().getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 20, StringHelper.padZero(this.b.getMSG_SNO(), 3).getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 23, this.b.getSP_ID().getBytes(), 0, 7);
        ByteHelper.STRNCPYToSpace(bArr, 30, this.b.getRST_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 31, this.b.getRTRM_YN().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 32, this.b.getUSER_ID().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 48, this.b.getUNIC_CARD_NO().getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, 68, this.b.getCARD_NO().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 84, this.b.getHNDH_TEL_NO().getBytes(), 0, 12);
        ByteHelper.STRNCPYToSpace(bArr, 96, this.b.getTLCM_CD().getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 99, this.b.getAGE_DVS_CD().getBytes(), 0, 2);
        ByteHelper.STRNCPYToSpace(bArr, 101, this.b.getGNDR().getBytes(), 0, 2);
        ByteHelper.STRNCPYToSpace(bArr, 103, this.b.getMBPH_TRCN_NM().getBytes(), 0, 30);
        ByteHelper.STRNCPYToSpace(bArr, 133, this.b.getUSE_OS_VER().getBytes(), 0, 10);
        ByteHelper.STRNCPYToSpace(bArr, 143, this.b.getMOAPP_ID().getBytes(), 0, 200);
        ByteHelper.STRNCPYToSpace(bArr, 343, this.b.getTL_PRRS_CD().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, 347, this.b.getRST_MSG().getBytes(), 0, 300);
        return bArr;
    }
}
