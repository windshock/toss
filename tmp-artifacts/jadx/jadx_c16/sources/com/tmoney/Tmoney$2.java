package com.tmoney;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tmoney.Tmoney;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResultTRDR0013RowDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0013ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.CryptoByKeyStore;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class Tmoney$2 implements f.a {
    final /* synthetic */ Tmoney.ApiName a;
    final /* synthetic */ TmoneyCallback b;
    final /* synthetic */ Object[] c;

    Tmoney$2(Tmoney.ApiName apiName, TmoneyCallback tmoneyCallback, Object[] objArr) {
        this.a = apiName;
        this.b = tmoneyCallback;
        this.c = objArr;
    }

    public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
        LogHelper.d("setSetting", str + str2);
        Tmoney.a(false);
        Tmoney.a(0L);
        TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.NEED_INIT);
        ResultDetailCode resultDetailCode = ResultDetailCode.NEED_INIT;
        TmoneyCallback.ResultType log = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("[" + str + "]" + str2);
        if (str != null && str.startsWith("-")) {
            TmoneyCallback.ResultType error2 = log.setError(ResultError.NETWORK);
            ResultDetailCode resultDetailCode2 = ResultDetailCode.NETWORK;
            error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage());
        }
        new Handler(Looper.getMainLooper()).post(new 2(this, log));
    }

    public final void onConnectionSuccess(ResponseDTO responseDTO) {
        TRDR0013ResponseDTO tRDR0013ResponseDTO = (TRDR0013ResponseDTO) responseDTO;
        for (int i = 0; i < tRDR0013ResponseDTO.getResponse().getRspDta().size(); i++) {
            ResultTRDR0013RowDTO resultTRDR0013RowDTO = (ResultTRDR0013RowDTO) tRDR0013ResponseDTO.getResponse().getRspDta().get(i);
            if (TextUtils.equals(resultTRDR0013RowDTO.getAfltStupDvsCd(), CodeConstants.AFLT_STUP_VAL_CD.MKTP_TOKEN.getCode())) {
                TmoneyData.getInstance().setMktpToken(CryptoByKeyStore.encrypt(Tmoney.a(), resultTRDR0013RowDTO.getAfltStupVal()));
            } else if (TextUtils.equals(resultTRDR0013RowDTO.getAfltStupDvsCd(), CodeConstants.AFLT_STUP_VAL_CD.KT_APP_KEY.getCode())) {
                TmoneyData.getInstance().setKtAppKey(CryptoByKeyStore.encrypt(Tmoney.a(), resultTRDR0013RowDTO.getAfltStupVal()));
            } else if (TextUtils.equals(resultTRDR0013RowDTO.getAfltStupDvsCd(), CodeConstants.AFLT_STUP_VAL_CD.ENCRYPT_KEY.getCode())) {
                TmoneyData.getInstance().setKey(CryptoByKeyStore.encrypt(Tmoney.a(), resultTRDR0013RowDTO.getAfltStupVal()));
            } else {
                TmoneyData.getInstance().setSetupInfo(resultTRDR0013RowDTO.getAfltStupDvsCd(), resultTRDR0013RowDTO.getAfltStupVal());
            }
        }
        Tmoney.b();
        TmoneyData.getInstance().setReadAfltSetupTime(System.currentTimeMillis());
        Tmoney.a(0L);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tmoney.Tmoney$2.1
            @Override // java.lang.Runnable
            public final void run() {
                if (Tmoney.c()) {
                    Tmoney$2 tmoney$2 = Tmoney$2.this;
                    Tmoney.Api.a(tmoney$2.a, tmoney$2.b, tmoney$2.c);
                } else {
                    Tmoney$2 tmoney$22 = Tmoney$2.this;
                    Tmoney.Api.b(tmoney$22.a, tmoney$22.b, tmoney$22.c);
                }
            }
        });
    }
}
