package com.tmoney.ota.a;

import android.content.Context;
import com.tmoney.c.C0041b;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.ota.dto.OTAData01;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class d extends C0041b {
    private final String b;
    private Context c;
    private com.tmoney.ota.e.b d;
    private com.tmoney.ota.e.c e;
    private O f;

    public d(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyOtaStatusCheck";
        this.c = context;
        this.f = O.getInstance();
        this.d = com.tmoney.ota.e.b.getInstance(this.c);
        this.e = new com.tmoney.ota.e.c(this.c);
    }

    public final void issueStatusCheck(String str) throws Throwable {
        issueStatusCheck(str, false);
    }

    public final void issueStatusCheck(String str, boolean z) throws Throwable {
        TmoneyCallback.ResultType exception;
        StringBuilder sb = new StringBuilder("issueStatusCheck ");
        sb.append(z ? "del" : "issue");
        LogHelper.d("TmoneyOtaStatusCheck", sb.toString());
        String simSerialNumber = DeviceInfoHelper.getSimSerialNumber(this.c);
        String line1NumberLocaleRemove = DeviceInfoHelper.getLine1NumberLocaleRemove(this.c);
        String otaTelecom = DeviceInfoHelper.getOtaTelecom(this.c);
        com.tmoney.ota.e.c cVar = this.e;
        String strMakePacket = (z ? cVar.getOTADelPacket1(DeviceInfoHelper.getOtaIssuReqSno(this.c), simSerialNumber, line1NumberLocaleRemove, otaTelecom, "0000000000000000") : cVar.getOTAPacket1(DeviceInfoHelper.getOtaIssuReqSno(this.c), simSerialNumber, line1NumberLocaleRemove, otaTelecom, str)).makePacket();
        if (strMakePacket == null || "".equals(strMakePacket)) {
            LogHelper.d("TmoneyOtaStatusCheck", "Packet is null");
            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
            ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_ISSUE;
            exception = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setException(new Exception("Packet is null"));
        } else {
            try {
                this.f.post(this.d.getUrl(), strMakePacket);
                this.f.setListener(new O.a() { // from class: com.tmoney.ota.a.d.1
                    @Override // com.tmoney.kscc.sslio.a.O.a
                    public final void onResultType(TmoneyCallback.ResultType resultType) {
                        TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
                        if (resultType != resultType2) {
                            d.this.onResult(resultType);
                            return;
                        }
                        try {
                            OTAData01 oTAData01 = (OTAData01) new com.tmoney.ota.c.c(resultType.getData()[0].toString().getBytes()).execute();
                            LogHelper.d("TmoneyOtaStatusCheck", "서비스가입요청:[" + oTAData01.getTL_PRRS_CD() + "]" + oTAData01.getRST_MSG());
                            StringBuilder sb2 = new StringBuilder("서비스가입요청 data01.getRST_CD():[");
                            sb2.append(oTAData01.getRST_CD());
                            sb2.append("]");
                            LogHelper.d("TmoneyOtaStatusCheck", sb2.toString());
                            d.this.onResult(resultType2.setDetailCode(oTAData01.getRST_CD()));
                        } catch (Exception e) {
                            LogHelper.exception("TmoneyOtaStatusCheck", e);
                            d dVar = d.this;
                            TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                            ResultDetailCode resultDetailCode2 = ResultDetailCode.EXCEPTION_ISSUE;
                            dVar.onResult(error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setException(e));
                        }
                    }
                });
                return;
            } catch (Exception e) {
                LogHelper.exception("TmoneyOtaStatusCheck", e);
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.EXCEPTION_ISSUE;
                exception = error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setException(e);
            }
        }
        onResult(exception);
    }
}
