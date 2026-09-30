package com.tmoney.b;

import android.content.Context;
import com.tmoney.dto.TransHistoryDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.ab;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0003ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class E extends com.tmoney.g.a.a {
    private final String a;
    private com.tmoney.f.a.a b;
    private ArrayList<TransHistoryDto> c;
    private String[] d;
    private AbstractC0045f.a e;

    public E(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyTransHistoryExecuter";
        this.c = null;
        this.d = null;
        this.e = new AbstractC0045f.a() { // from class: com.tmoney.b.E.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                E.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                TRDR0003ResponseDTO tRDR0003ResponseDTO = (TRDR0003ResponseDTO) responseDTO;
                int size = tRDR0003ResponseDTO.getResponse().getRspDta().size();
                E.this.c = new ArrayList();
                for (int i = 0; i < size; i++) {
                    E.this.c.add(new TransHistoryDto(tRDR0003ResponseDTO.getResponse().getRspDta().get(i)));
                }
                E.this.a(TmoneyCallback.ResultType.SUCCESS);
            }
        };
        this.b = new com.tmoney.f.a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(this.c);
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        super.execute(dVar, resultType);
        TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
        if (resultType == resultType2) {
            LogHelper.d("TmoneyTransHistoryExecuter", "(" + resultType.getError() + ")");
            try {
                ArrayList<byte[]> transListBytes = this.b.getTransListBytes(dVar);
                this.d = new String[transListBytes.size()];
                if (transListBytes.size() > 0) {
                    byte[] bArr = new byte[1080];
                    Arrays.fill(bArr, (byte) 0);
                    int i = 0;
                    for (int i2 = 0; i2 < transListBytes.size(); i2++) {
                        byte[] bArr2 = transListBytes.get(i2);
                        System.arraycopy(bArr2, 0, bArr, i, 54);
                        i += 54;
                        this.d[i2] = new String(com.tmoney.e.a.a.bytesToHexString(bArr2));
                    }
                    new ab(getContext(), this.e).execute(this.d);
                    return p();
                }
                resultType = resultType2.setData(new ArrayList());
            } catch (Exception e) {
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_SERVER;
                onResult(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog(e.getMessage()).setException(e));
            }
        }
        a(resultType);
        return p();
    }
}
