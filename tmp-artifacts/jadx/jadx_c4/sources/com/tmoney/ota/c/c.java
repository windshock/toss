package com.tmoney.ota.c;

import com.tmoney.ota.dto.OTAData;
import com.tmoney.ota.dto.OTAData01;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class c extends b {
    private final String b;

    public c(byte[] bArr) {
        super(bArr);
        this.b = "OTAParser01";
    }

    @Override // com.tmoney.ota.c.b
    public final OTAData execute() throws Exception {
        int i;
        OTAData01 oTAData01 = new OTAData01();
        try {
            oTAData01.setISSU_REQ_SNO(new String(this.a, 0, 16, "UTF-8"));
            oTAData01.setMSG_DVS_CD(new String(this.a, 16, 1, "UTF-8"));
            oTAData01.setTLCN_SERV_ID(new String(this.a, 17, 3, "UTF-8"));
            oTAData01.setMSG_SNO(Integer.parseInt(new String(this.a, 20, 3, "UTF-8")));
            oTAData01.setSP_ID(new String(this.a, 23, 7, "UTF-8"));
            oTAData01.setRST_CD(new String(this.a, 30, 1, "UTF-8"));
            oTAData01.setRTRM_YN(new String(this.a, 31, 1, "UTF-8"));
            oTAData01.setUSER_ID(new String(this.a, 32, 16, "UTF-8"));
            if (TmoneyData.getInstance().isGamin()) {
                oTAData01.setUNIC_CARD_NO(new String(this.a, 48, 20, "UTF-8"));
                i = 68;
            } else {
                oTAData01.setUNIC_CARD_NO(new String(this.a, 48, 16, "UTF-8"));
                i = 64;
            }
            oTAData01.setCARD_NO(new String(this.a, i, 16, "UTF-8"));
            oTAData01.setHNDH_TEL_NO(new String(this.a, i + 16, 12, "UTF-8"));
            oTAData01.setTLCM_CD(new String(this.a, i + 28, 3, "UTF-8"));
            oTAData01.setAGE_DVS_CD(new String(this.a, i + 31, 2, "UTF-8"));
            oTAData01.setGNDR(new String(this.a, i + 33, 2, "UTF-8"));
            oTAData01.setMBPH_TRCN_NM(new String(this.a, i + 35, 30, "UTF-8"));
            oTAData01.setUSE_OS_VER(new String(this.a, i + 65, 10, "UTF-8"));
            oTAData01.setMOAPP_ID(new String(this.a, i + 75, 200, "UTF-8"));
            oTAData01.setTL_PRRS_CD(new String(this.a, i + 275, 4, "UTF-8"));
            oTAData01.setRST_MSG(new String(this.a, i + 279, 300, "UTF-8"));
            return oTAData01;
        } catch (Exception e) {
            LogHelper.exception("OTAParser01", e);
            throw e;
        }
    }
}
