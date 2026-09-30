package com.tmoney.ota.a;

import android.content.Context;
import com.tmoney.TmoneyMsg;
import com.tmoney.c.C0041b;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.ota.dto.OTAData01;
import com.tmoney.ota.dto.OTAData02;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class e extends C0041b {
    private final String b;
    private com.tmoney.ota.e.c c;
    private String d;
    private String e;
    private String f;
    private String g;
    private com.tmoney.ota.e.b h;
    private int i;
    private O j;

    public e(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyProdList";
        this.i = -1;
        this.j = O.getInstance();
        this.h = com.tmoney.ota.e.b.getInstance(getContext());
        this.c = new com.tmoney.ota.e.c(this.mContext);
    }

    private void a(int i, com.tmoney.ota.b.b bVar) throws Throwable {
        String codeString;
        String msg;
        String strMakePacket = bVar.makePacket();
        if (strMakePacket == null || "".equals(strMakePacket)) {
            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR);
            ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_SERVER;
            onResult(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()));
            return;
        }
        try {
            this.i = i;
            ResponseBody responseBodyExecutePost = this.j.executePost(this.h.getUrl(), RequestBody.create(MediaType.parse("charset=utf-8"), strMakePacket));
            if (responseBodyExecutePost != null) {
                byte[] bArrBytes = responseBodyExecutePost.bytes();
                int i2 = this.i;
                if (i2 == 1) {
                    OTAData01 oTAData01 = (OTAData01) new com.tmoney.ota.c.c(bArrBytes).execute();
                    LogHelper.d("TmoneyProdList", "서비스가입요청:[" + oTAData01.getTL_PRRS_CD() + "]" + oTAData01.getRST_MSG());
                    if ("9000".equals(oTAData01.getTL_PRRS_CD())) {
                        a(2, this.c.getOTAPacket2(oTAData01.getISSU_REQ_SNO(), this.e, oTAData01.getCARD_NO(), this.g));
                        return;
                    }
                    codeString = oTAData01.getTL_PRRS_CD();
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    OTAData02 oTAData02 = (OTAData02) new com.tmoney.ota.c.d(bArrBytes).execute();
                    LogHelper.d("TmoneyProdList", "모바일상품리스트요청:[" + oTAData02.getTL_PRRS_CD() + "]" + oTAData02.getRST_MSG());
                    if ("9000".equals(oTAData02.getTL_PRRS_CD()) && oTAData02.getProdList() != null && oTAData02.getProdList().size() > 0) {
                        onResult(TmoneyCallback.ResultType.SUCCESS.setData(oTAData02));
                        return;
                    }
                    codeString = oTAData02.getTL_PRRS_CD();
                }
                msg = ResultDetailCode.ISSUE_ERROR.getMessage();
            } else {
                codeString = ResultDetailCode.SERVER.getCodeString();
                msg = TmoneyMsg.getMsg(51);
            }
            a(codeString, msg);
        } catch (Exception e) {
            LogHelper.exception("TmoneyProdList", e);
            a("-2000", ResultDetailCode.ISSUE_ERROR.getMessage());
        }
    }

    private void a(String str, String str2) {
        onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR).setDetailCode(str).setMessage(str2));
    }

    public final void getTmoneyProdList(String str, String str2, String str3, String str4) throws Throwable {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        a(1, this.c.getOTAPacket1(DeviceInfoHelper.getOtaIssuReqSno(this.mContext), this.e, this.f, this.g, this.d));
    }
}
