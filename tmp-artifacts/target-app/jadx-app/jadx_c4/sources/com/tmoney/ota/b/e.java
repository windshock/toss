package com.tmoney.ota.b;

import com.tmoney.ota.dto.APDU;
import com.tmoney.ota.dto.OTAData03;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.StringHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class e extends b {
    public static final String PROGRAM_ID = "IssuActC";
    private final String b;
    private OTAData03 c;
    private int d;

    public e(OTAData03 oTAData03) {
        super(PROGRAM_ID);
        this.b = "OTAPacket03";
        this.d = 436;
        if (TmoneyData.getInstance().isGamin()) {
            this.a = "IssuActCG";
            this.d += 4;
        }
        this.c = oTAData03;
    }

    @Override // com.tmoney.ota.b.b
    protected final byte[] a() {
        int i;
        String str = "";
        for (int i2 = 0; i2 < this.c.getTRM_APDU_VAL().size(); i2++) {
            APDU apdu = this.c.getTRM_APDU_VAL().get(i2);
            str = str + apdu.getCMD();
            if (apdu.getSW().length > 0 && apdu.getSW()[0] != null && !"".equals(apdu.getSW()[0])) {
                str = str + "^";
            }
            for (int i3 = 0; i3 < apdu.getSW().length; i3++) {
                str = str + apdu.getSW()[i3];
                if (i3 < apdu.getSW().length - 1) {
                    str = str + ";";
                }
            }
            if (i2 < this.c.getTRM_APDU_VAL().size() - 1) {
                str = str + "|";
            }
        }
        int length = str.length() / 260;
        if (str.length() % 260 > 0) {
            length++;
        }
        int i4 = length * 260;
        int i5 = this.d + i4;
        LogHelper.d("OTAPacket03", ">>>>> PACKET data03 TOTAL >> appCount = " + length + " total length = " + i5);
        byte[] bArr = new byte[i5];
        ByteHelper.MEMSET(bArr, 0, (byte) 32, i5);
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
        int i6 = i + 12;
        if (TmoneyData.getInstance().isGamin()) {
            ByteHelper.STRNCPYToSpace(bArr, i6, "D".getBytes(), 0, 3);
        } else {
            ByteHelper.STRNCPYToSpace(bArr, i6, this.c.getTLCM_CD().getBytes(), 0, 3);
        }
        ByteHelper.STRNCPYToSpace(bArr, i + 15, this.c.getCARD_PRD_ID().getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, i + 35, this.c.getCAPP_SVC_ID().getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, i + 55, this.c.getCARD_NO().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, i + 71, this.c.getPBCM_CD().getBytes(), 0, 6);
        ByteHelper.STRNCPYToSpace(bArr, i + 77, this.c.getCARD_STA_CD().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, i + 81, StringHelper.padZero(length, 3).getBytes(), 0, 3);
        int i7 = i + 84;
        LogHelper.d("OTAPacket03", ">>>>> offset " + i7);
        LogHelper.d("OTAPacket03", ">>>>> apduLength " + i4);
        LogHelper.d("OTAPacket03", ">>>>> APDU " + str);
        ByteHelper.STRNCPYToSpace(bArr, i7, str.getBytes(), 0, i4);
        int i8 = i7 + i4;
        ByteHelper.STRNCPYToSpace(bArr, i8, this.c.getTL_PRRS_CD().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, i8 + 4, this.c.getRST_MSG().getBytes(), 0, 300);
        return bArr;
    }
}
