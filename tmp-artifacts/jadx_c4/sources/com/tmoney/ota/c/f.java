package com.tmoney.ota.c;

import com.tmoney.ota.dto.APDU;
import com.tmoney.ota.dto.OTAData;
import com.tmoney.ota.dto.OTAData04;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class f extends b {
    private final String b;

    public f(byte[] bArr) {
        super(bArr);
        this.b = "OTAParser04";
    }

    private static void a(OTAData04 oTAData04, String... strArr) {
        for (String str : strArr) {
            if (str.contains("^")) {
                String[] strArrSplit = str.split("\\^");
                String str2 = strArrSplit[0];
                oTAData04.setTRM_APDU_VAL(strArrSplit[1].contains(";") ? new APDU(str2, strArrSplit[1].split("\\;")) : new APDU(str2, strArrSplit[1]));
            }
        }
    }

    @Override // com.tmoney.ota.c.b
    public final OTAData execute() throws Exception {
        int i;
        OTAData04 oTAData04 = new OTAData04();
        try {
            oTAData04.setISSU_REQ_SNO(new String(this.a, 0, 16, "UTF-8"));
            oTAData04.setMSG_DVS_CD(new String(this.a, 16, 1, "UTF-8"));
            oTAData04.setTLCN_SERV_ID(new String(this.a, 17, 3, "UTF-8"));
            oTAData04.setMSG_SNO(Integer.parseInt(new String(this.a, 20, 3, "UTF-8")));
            oTAData04.setSP_ID(new String(this.a, 23, 7, "UTF-8"));
            oTAData04.setRST_CD(new String(this.a, 30, 1, "UTF-8"));
            oTAData04.setRTRM_YN(new String(this.a, 31, 1, "UTF-8"));
            oTAData04.setDUTY_DVS_CD(new String(this.a, 32, 2, "UTF-8"));
            if (TmoneyData.getInstance().isGamin()) {
                oTAData04.setUNIC_CARD_NO(new String(this.a, 34, 20, "UTF-8"));
                i = 54;
            } else {
                oTAData04.setUNIC_CARD_NO(new String(this.a, 34, 16, "UTF-8"));
                i = 50;
            }
            oTAData04.setHNDH_TEL_NO(new String(this.a, i, 12, "UTF-8"));
            oTAData04.setTLCM_CD(new String(this.a, i + 12, 3, "UTF-8"));
            oTAData04.setCARD_PRD_ID(new String(this.a, i + 15, 20, "UTF-8"));
            oTAData04.setCAPP_SVC_ID(new String(this.a, i + 35, 20, "UTF-8"));
            oTAData04.setCARD_NO(new String(this.a, i + 55, 16, "UTF-8"));
            oTAData04.setPBCM_CD(new String(this.a, i + 71, 6, "UTF-8"));
            oTAData04.setCARD_STA_CD(new String(this.a, i + 77, 4, "UTF-8"));
            oTAData04.setAPP_CNT(Integer.parseInt(new String(this.a, i + 81, 3).trim()));
            int i2 = i + 84;
            int app_cnt = oTAData04.getAPP_CNT() * 260;
            String strTrim = new String(this.a, i2, app_cnt, "UTF-8").trim();
            if (strTrim.contains("|")) {
                a(oTAData04, strTrim.split("\\|"));
            } else {
                a(oTAData04, strTrim);
            }
            int i3 = i2 + app_cnt;
            oTAData04.setTL_PRRS_CD(new String(this.a, i3, 4, "UTF-8"));
            oTAData04.setRST_MSG(new String(this.a, i3 + 4, 300, "UTF-8"));
            return oTAData04;
        } catch (Exception e) {
            LogHelper.exception("OTAParser04", e);
            throw e;
        }
    }
}
