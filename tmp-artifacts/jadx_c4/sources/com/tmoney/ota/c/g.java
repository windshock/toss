package com.tmoney.ota.c;

import com.tmoney.ota.dto.OTAData;
import com.tmoney.ota.dto.OTAData05;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class g extends b {
    private final String b;

    public g(byte[] bArr) {
        super(bArr);
        this.b = "OTAParser05";
    }

    @Override // com.tmoney.ota.c.b
    public final OTAData execute() throws Exception {
        int i;
        OTAData05 oTAData05 = new OTAData05();
        try {
            oTAData05.setISSU_REQ_SNO(new String(this.a, 0, 16, "UTF-8"));
            oTAData05.setMSG_DVS_CD(new String(this.a, 16, 1, "UTF-8"));
            oTAData05.setTLCN_SERV_ID(new String(this.a, 17, 3, "UTF-8"));
            oTAData05.setMSG_SNO(Integer.parseInt(new String(this.a, 20, 3, "UTF-8")));
            oTAData05.setSP_ID(new String(this.a, 23, 7, "UTF-8"));
            oTAData05.setRST_CD(new String(this.a, 30, 1, "UTF-8"));
            oTAData05.setRTRM_YN(new String(this.a, 31, 1, "UTF-8"));
            if (TmoneyData.getInstance().isGamin()) {
                oTAData05.setUNIC_CARD_NO(new String(this.a, 32, 20, "UTF-8"));
                i = 52;
            } else {
                oTAData05.setUNIC_CARD_NO(new String(this.a, 32, 16, "UTF-8"));
                i = 48;
            }
            oTAData05.setHNDH_TEL_NO(new String(this.a, i, 12, "UTF-8"));
            oTAData05.setTLCM_CD(new String(this.a, i + 12, 3, "UTF-8"));
            oTAData05.setENCR_DTA(new String(this.a, i + 15, 512, "UTF-8"));
            oTAData05.setTL_PRRS_CD(new String(this.a, i + 527, 4, "UTF-8"));
            oTAData05.setRST_MSG(new String(this.a, i + 531, 300, "UTF-8"));
            return oTAData05;
        } catch (Exception e) {
            LogHelper.exception("OTAParser05", e);
            throw e;
        }
    }
}
