package com.tmoney.ota.c;

import com.tmoney.ota.dto.APDU;
import com.tmoney.ota.dto.EfIssuActCDTO;
import com.tmoney.ota.dto.OTAData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class a extends b {
    private final String b;
    private final String c;

    public a(byte[] bArr) {
        super(bArr);
        this.b = a.class.getSimpleName();
        this.c = "UTF-8";
    }

    private static void a(EfIssuActCDTO efIssuActCDTO, String... strArr) {
        for (String str : strArr) {
            if (str.contains("^")) {
                String[] strArrSplit = str.split("\\^");
                String str2 = strArrSplit[0];
                efIssuActCDTO.setTrmApdu(strArrSplit[1].contains(";") ? new APDU(str2, strArrSplit[1].split("\\;")) : new APDU(str2, strArrSplit[1]));
            }
        }
    }

    @Override // com.tmoney.ota.c.b
    public OTAData execute() throws Exception {
        LogHelper.d(this.b, "RESPONSE DATA \n" + this.a);
        EfIssuActCDTO efIssuActCDTO = new EfIssuActCDTO();
        try {
            String str = this.b;
            StringBuilder sb = new StringBuilder("body len : ");
            byte[] bArr = this.a;
            sb.append(ByteHelper.MakeKSC5601String(bArr, 0, bArr.length));
            LogHelper.d(str, sb.toString());
            efIssuActCDTO.setISSU_REQ_SNO(new String(this.a, 0, 16, "UTF-8"));
            efIssuActCDTO.setMSG_DVS_CD(new String(this.a, 16, 1, "UTF-8"));
            efIssuActCDTO.setTLCN_SERV_ID(new String(this.a, 17, 3, "UTF-8"));
            efIssuActCDTO.setMSG_SNO(Integer.parseInt(new String(this.a, 20, 3, "UTF-8")));
            efIssuActCDTO.setSP_ID(new String(this.a, 23, 7, "UTF-8"));
            efIssuActCDTO.setRST_CD(new String(this.a, 30, 1, "UTF-8"));
            efIssuActCDTO.setRTRM_YN(new String(this.a, 31, 1, "UTF-8"));
            efIssuActCDTO.setCardPrdInhrNo(new String(this.a, 32, 16, "UTF-8"));
            efIssuActCDTO.setUnicCardNo(new String(this.a, 48, 20, "UTF-8"));
            efIssuActCDTO.setTmcrNo(new String(this.a, 68, 16, "UTF-8"));
            efIssuActCDTO.setHndhTelNo(new String(this.a, 84, 12, "UTF-8"));
            efIssuActCDTO.setTlcmCd(new String(this.a, 96, 3, "UTF-8"));
            efIssuActCDTO.setCardPrdId(new String(this.a, 99, 4, "UTF-8"));
            efIssuActCDTO.setDtaRecSno(new String(this.a, 103, 4, "UTF-8"));
            efIssuActCDTO.setAfltPrdId(new String(this.a, 107, 12, "UTF-8"));
            efIssuActCDTO.setCardStaCd(new String(this.a, 119, 4, "UTF-8"));
            efIssuActCDTO.setAppCnt(Integer.parseInt(new String(this.a, 123, 3).trim()));
            int appCnt = efIssuActCDTO.getAppCnt() * 260;
            String strTrim = new String(this.a, 126, appCnt, "UTF-8").trim();
            if (strTrim.contains("|")) {
                a(efIssuActCDTO, strTrim.split("\\|"));
            } else {
                a(efIssuActCDTO, strTrim);
            }
            efIssuActCDTO.setTL_PRRS_CD(new String(this.a, appCnt + 126, 4, "UTF-8"));
            efIssuActCDTO.setRST_MSG(new String(this.a, appCnt + 130, 300, "UTF-8"));
            return efIssuActCDTO;
        } catch (Exception e) {
            LogHelper.e(this.b, "execute EXCP::" + LogHelper.printStackTraceToString(e));
            throw e;
        }
    }
}
