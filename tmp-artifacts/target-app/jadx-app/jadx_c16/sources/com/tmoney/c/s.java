package com.tmoney.c;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.D;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class s extends BaseTmoneyCallback {
    private final String a;
    private TmoneyData b;
    private boolean c;
    private f.a d;

    public s(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyAvailabilityInstance";
        this.d = new f.a() { // from class: com.tmoney.c.s.1
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                s.a(s.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                TmoneyCallback.ResultType resultType;
                s sVar;
                MBR0003ResponseDTO mBR0003ResponseDTO = (MBR0003ResponseDTO) responseDTO;
                s.this.b.setTmoneyData(mBR0003ResponseDTO);
                if (mBR0003ResponseDTO.getResponse().getPsbMbph() != null) {
                    s.this.c = TextUtils.equals(mBR0003ResponseDTO.getResponse().getPsbMbph(), "Y");
                    s.this.b.setTmoneyYn(s.this.c);
                    sVar = s.this;
                    resultType = TmoneyCallback.ResultType.SUCCESS;
                } else {
                    resultType = TmoneyCallback.ResultType.WARNING;
                    resultType.setError(ResultError.SERVER_ERROR);
                    if (mBR0003ResponseDTO.getResponse().getRspCd() != null) {
                        resultType.setDetailCode(mBR0003ResponseDTO.getResponse().getRspCd());
                    }
                    if (mBR0003ResponseDTO.getResponse().getRspMsg() != null) {
                        resultType.setMessage(mBR0003ResponseDTO.getResponse().getRspMsg());
                    }
                    sVar = s.this;
                }
                s.a(sVar, resultType);
            }
        };
        LogHelper.d("TmoneyAvailabilityInstance", "TmoneyAvailabilityInstance");
        this.b = TmoneyData.getInstance(((BaseTmoneyCallback) this).mContext);
    }

    static /* synthetic */ void a(s sVar, TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(new Object[]{Boolean.valueOf(sVar.c)});
        }
        sVar.onResult(resultType);
    }

    public final Context getContext() {
        return ((BaseTmoneyCallback) this).mContext;
    }

    public final void request() {
        new D(((BaseTmoneyCallback) this).mContext, this.d).execute();
    }
}
