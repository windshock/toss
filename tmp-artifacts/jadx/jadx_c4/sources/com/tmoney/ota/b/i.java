package com.tmoney.ota.b;

import com.tmoney.ota.dto.OTAData2005;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.StringHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class i extends b {
    public static final String PROGRAM_ID = "SessDtaPrcgG";
    public final int BODY_LENGTH;
    private final String b;
    private OTAData2005 c;

    public i(OTAData2005 oTAData2005) {
        super(PROGRAM_ID);
        this.b = i.class.getSimpleName();
        this.BODY_LENGTH = 883;
        this.c = oTAData2005;
    }

    @Override // com.tmoney.ota.b.b
    protected final byte[] a() {
        byte[] bArr = new byte[883];
        ByteHelper.MEMSET(bArr, 0, (byte) 32, 883);
        ByteHelper.STRNCPYToSpace(bArr, 0, this.c.getISSU_REQ_SNO().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 16, this.c.getMSG_DVS_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 17, this.c.getTLCN_SERV_ID().getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 20, StringHelper.padZero(this.c.getMSG_SNO(), 3).getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 23, this.c.getSP_ID().getBytes(), 0, 7);
        ByteHelper.STRNCPYToSpace(bArr, 30, this.c.getRST_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 31, this.c.getRTRM_YN().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 32, this.c.getUNIC_CARD_NO().getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, 52, this.c.getHNDH_TEL_NO().getBytes(), 0, 12);
        LogHelper.d(this.b, "TLCM_CD:" + this.c.getTLCM_CD());
        ByteHelper.STRNCPYToSpace(bArr, 64, this.c.getTLCM_CD().getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 67, this.c.getENCR_DTA().getBytes(), 0, 512);
        ByteHelper.STRNCPYToSpace(bArr, 579, this.c.getTL_PRRS_CD().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, 583, this.c.getRST_MSG().getBytes(), 0, 300);
        return bArr;
    }
}
