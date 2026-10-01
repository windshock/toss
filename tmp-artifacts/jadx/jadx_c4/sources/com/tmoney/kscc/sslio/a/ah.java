package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0015RequestDTO;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.DeviceInfoHelper;
import java.util.Date;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ah extends AbstractC0049k {
    private TRDR0015RequestDTO c;
    private TmoneyData d;
    private String[] e;

    public ah(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0015, aVar);
        this.c = null;
        this.e = new String[]{"6A82", "6A83", "6200"};
        this.d = TmoneyData.getInstance();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        String setupInfo = this.d.getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.SAVEAPPLOG_INTERVAL.getCode());
        if (TextUtils.isEmpty(setupInfo)) {
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            if (str3.endsWith("9000")) {
                if (str3.length() > 4) {
                    return;
                }
                if (!TextUtils.isEmpty(str2) && (str2.startsWith("3C01", 2) || str2.startsWith("708003", 2))) {
                    return;
                }
            } else {
                if (str3.startsWith("61")) {
                    return;
                }
                for (String str4 : this.e) {
                    if (str4.equals(str3.toUpperCase())) {
                        return;
                    }
                }
            }
        }
        try {
            if (Integer.parseInt(setupInfo) == -1) {
                d().onConnectionError(b(), "", "");
                return;
            }
            long jLongValue = this.d.getSendLogTime(str).longValue();
            long time = new Date().getTime();
            if (time - jLongValue < r1 * 60000) {
                d().onConnectionError(b(), "", "");
                return;
            }
            this.d.setSendLogTime(str, time);
            TRDR0015RequestDTO tRDR0015RequestDTO = new TRDR0015RequestDTO();
            this.c = tRDR0015RequestDTO;
            tRDR0015RequestDTO.setMbphNo(f());
            this.c.setUnicId(g());
            this.c.setMbphMdlId(DeviceInfoHelper.getModel());
            this.c.setMoappVer(h());
            this.c.setMbphOsVer(DeviceInfoHelper.getAndroidOsVersion());
            this.c.setCardReqDvsCd(str);
            this.c.setCardReqCtt(str2);
            this.c.setCardRspCtt(str3);
            connectServer();
        } catch (Exception unused) {
            d().onConnectionError(b(), "", "");
        }
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
    }
}
