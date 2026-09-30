package com.tmoney.ota.c;

import com.tmoney.ota.dto.OTAData;
import com.tmoney.ota.dto.OTAData02;
import com.tmoney.ota.dto.Product;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class d extends b {
    private final String b;

    public d(byte[] bArr) {
        super(bArr);
        this.b = "OTAParser02";
    }

    @Override // com.tmoney.ota.c.b
    public final OTAData execute() throws Exception {
        int i;
        OTAData02 oTAData02 = new OTAData02();
        try {
            oTAData02.setISSU_REQ_SNO(new String(this.a, 0, 16, "UTF-8"));
            oTAData02.setMSG_DVS_CD(new String(this.a, 16, 1, "UTF-8"));
            oTAData02.setTLCN_SERV_ID(new String(this.a, 17, 3, "UTF-8"));
            oTAData02.setMSG_SNO(Integer.parseInt(new String(this.a, 20, 3, "UTF-8")));
            oTAData02.setSP_ID(new String(this.a, 23, 7, "UTF-8"));
            oTAData02.setRST_CD(new String(this.a, 30, 1, "UTF-8"));
            oTAData02.setRTRM_YN(new String(this.a, 31, 1, "UTF-8"));
            oTAData02.setCARD_NO(new String(this.a, 32, 16, "UTF-8"));
            if (TmoneyData.getInstance().isGamin()) {
                oTAData02.setUNIC_CARD_NO(new String(this.a, 48, 20, "UTF-8"));
                i = 68;
            } else {
                oTAData02.setUNIC_CARD_NO(new String(this.a, 48, 16, "UTF-8"));
                i = 64;
            }
            oTAData02.setTLCM_CD(new String(this.a, i, 3, "UTF-8"));
            oTAData02.setAPP_CNT(Integer.parseInt(new String(this.a, i + 3, 3).trim()));
            int i2 = i + 6;
            int app_cnt = oTAData02.getAPP_CNT();
            LogHelper.d("OTAParser02", "app cnt:" + app_cnt);
            if (app_cnt != 0) {
                for (int i3 = 0; i3 < app_cnt; i3++) {
                    String str = new String(this.a, i2, 6, "UTF-8");
                    String str2 = new String(this.a, i2 + 6, 20, "UTF-8");
                    String strMakeKSC5601String = ByteHelper.MakeKSC5601String(this.a, i2 + 26, 50);
                    String str3 = new String(this.a, i2 + 76, 20, "UTF-8");
                    String str4 = new String(this.a, i2 + 96, 2, "UTF-8");
                    i2 += 98;
                    oTAData02.setProd(new Product(str.trim(), str2.trim(), strMakeKSC5601String.trim(), str3.trim(), str4.trim()));
                }
            } else {
                i2 = i + 82;
            }
            oTAData02.setTL_PRRS_CD(new String(this.a, i2, 4, "UTF-8"));
            oTAData02.setRST_MSG(new String(this.a, i2 + 4, 300, "UTF-8"));
            return oTAData02;
        } catch (Exception e) {
            LogHelper.exception("OTAParser02", e);
            throw e;
        }
    }
}
