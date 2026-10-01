package com.tmoney.ota.c;

import com.tmoney.ota.dto.OTAData;
import com.tmoney.ota.dto.OTAData2005;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class i extends b {
    private final String b;

    public i(byte[] bArr) {
        super(bArr);
        this.b = i.class.getSimpleName();
    }

    @Override // com.tmoney.ota.c.b
    public OTAData execute() throws Exception {
        LogHelper.d(this.b, "RESPONSE DATA:" + this.a);
        OTAData2005 oTAData2005 = new OTAData2005();
        try {
            String str = this.b;
            StringBuilder sb = new StringBuilder("body len:");
            byte[] bArr = this.a;
            sb.append(ByteHelper.MakeKSC5601String(bArr, 0, bArr.length));
            LogHelper.d(str, sb.toString());
            oTAData2005.setISSU_REQ_SNO(new String(this.a, 0, 16, "UTF-8"));
            oTAData2005.setMSG_DVS_CD(new String(this.a, 16, 1, "UTF-8"));
            oTAData2005.setTLCN_SERV_ID(new String(this.a, 17, 3, "UTF-8"));
            oTAData2005.setMSG_SNO(Integer.parseInt(new String(this.a, 20, 3, "UTF-8")));
            oTAData2005.setSP_ID(new String(this.a, 23, 7, "UTF-8"));
            oTAData2005.setRST_CD(new String(this.a, 30, 1, "UTF-8"));
            oTAData2005.setRTRM_YN(new String(this.a, 31, 1, "UTF-8"));
            oTAData2005.setUNIC_CARD_NO(new String(this.a, 32, 20, "UTF-8"));
            oTAData2005.setHNDH_TEL_NO(new String(this.a, 52, 12, "UTF-8"));
            oTAData2005.setTLCM_CD(new String(this.a, 64, 3, "UTF-8"));
            oTAData2005.setENCR_DTA(new String(this.a, 67, 512, "UTF-8"));
            oTAData2005.setTL_PRRS_CD(new String(this.a, 579, 4, "UTF-8"));
            oTAData2005.setRST_MSG(new String(this.a, 583, 300, "UTF-8"));
            return oTAData2005;
        } catch (Exception e) {
            LogHelper.e(this.b, "execute EXCP::" + LogHelper.printStackTraceToString(e));
            throw e;
        }
    }
}
