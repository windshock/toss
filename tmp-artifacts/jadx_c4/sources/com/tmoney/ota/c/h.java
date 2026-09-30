package com.tmoney.ota.c;

import com.tmoney.ota.dto.OTAData;
import com.tmoney.ota.dto.OTAData2001;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class h extends b {
    private final String b;

    public h(byte[] bArr) {
        super(bArr);
        this.b = h.class.getSimpleName();
    }

    @Override // com.tmoney.ota.c.b
    public OTAData execute() throws Exception {
        LogHelper.d(this.b, "RESPONSE DATA:" + this.a);
        OTAData2001 oTAData2001 = new OTAData2001();
        try {
            String str = this.b;
            StringBuilder sb = new StringBuilder("body len:");
            byte[] bArr = this.a;
            sb.append(ByteHelper.MakeKSC5601String(bArr, 0, bArr.length));
            LogHelper.d(str, sb.toString());
            oTAData2001.setISSU_REQ_SNO(new String(this.a, 0, 16, "UTF-8"));
            oTAData2001.setMSG_DVS_CD(new String(this.a, 16, 1, "UTF-8"));
            oTAData2001.setTLCN_SERV_ID(new String(this.a, 17, 3, "UTF-8"));
            oTAData2001.setMSG_SNO(Integer.parseInt(new String(this.a, 20, 3, "UTF-8")));
            oTAData2001.setSP_ID(new String(this.a, 23, 7, "UTF-8"));
            oTAData2001.setRST_CD(new String(this.a, 30, 1, "UTF-8"));
            oTAData2001.setRTRM_YN(new String(this.a, 31, 1, "UTF-8"));
            oTAData2001.setUSER_ID(new String(this.a, 32, 16, "UTF-8"));
            oTAData2001.setUNIC_CARD_NO(new String(this.a, 48, 20, "UTF-8"));
            oTAData2001.setCARD_NO(new String(this.a, 68, 16, "UTF-8"));
            oTAData2001.setHNDH_TEL_NO(new String(this.a, 84, 12, "UTF-8"));
            oTAData2001.setTLCM_CD(new String(this.a, 96, 3, "UTF-8"));
            oTAData2001.setAGE_DVS_CD(new String(this.a, 99, 2, "UTF-8"));
            oTAData2001.setGNDR(new String(this.a, 101, 2, "UTF-8"));
            oTAData2001.setMBPH_TRCN_NM(new String(this.a, 103, 30, "UTF-8"));
            oTAData2001.setUSE_OS_VER(new String(this.a, 133, 10, "UTF-8"));
            oTAData2001.setMOAPP_ID(new String(this.a, 143, 200, "UTF-8"));
            oTAData2001.setTL_PRRS_CD(new String(this.a, 343, 4, "UTF-8"));
            oTAData2001.setRST_MSG(new String(this.a, 347, 300, "UTF-8"));
            return oTAData2001;
        } catch (Exception e) {
            LogHelper.e(this.b, "execute EXCP::" + LogHelper.printStackTraceToString(e));
            throw e;
        }
    }
}
