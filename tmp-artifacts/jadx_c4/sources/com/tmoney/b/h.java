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
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class h extends com.tmoney.g.a.a {
    private final String a;
    private ArrayList<String> b;
    private ArrayList<TransHistoryDto> c;
    private String[] d;
    private AbstractC0045f.a e;

    public h(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "NfcTransHistoryExecuter";
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = null;
        this.e = new AbstractC0045f.a() { // from class: com.tmoney.b.h.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                h.this.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                TRDR0003ResponseDTO tRDR0003ResponseDTO = (TRDR0003ResponseDTO) responseDTO;
                int size = tRDR0003ResponseDTO.getResponse().getRspDta().size();
                h.this.c = new ArrayList();
                for (int i = 0; i < size; i++) {
                    h.this.c.add(new TransHistoryDto(tRDR0003ResponseDTO.getResponse().getRspDta().get(i)));
                }
                h hVar = h.this;
                hVar.onResult(Callback.success(hVar.c));
            }
        };
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        int iExecute = super.execute(dVar, resultType, true);
        if (resultType != TmoneyCallback.ResultType.SUCCESS) {
            onResult(resultType);
            return iExecute;
        }
        transHistory();
        return iExecute;
    }

    public final void transHistory() throws Throwable {
        LogHelper.d("NfcTransHistoryExecuter", "transHistory()");
        ArrayList arrayList = new ArrayList();
        try {
            this.b.clear();
            int i = 0;
            while (i < 20) {
                i++;
                byte[] bArrA = a(com.tmoney.a.a.getApduCmd(2, (byte) 0, (byte) i, (byte) 0, 0, (byte) 0));
                if (!new com.tmoney.a.h(bArrA).isbResData()) {
                    break;
                } else {
                    arrayList.add(bArrA);
                }
            }
            this.d = new String[arrayList.size()];
            if (arrayList.size() <= 0) {
                onResult(Callback.success(new ArrayList()));
                return;
            }
            byte[] bArr = new byte[1080];
            Arrays.fill(bArr, (byte) 0);
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                byte[] bArr2 = (byte[]) arrayList.get(i3);
                System.arraycopy(bArr2, 0, bArr, i2, 54);
                i2 += 54;
                this.d[i3] = com.tmoney.e.a.a.bytesToHexString(bArr2);
            }
            new ab(this.mContext, this.e).execute(this.d);
        } catch (Exception e) {
            onResult(Callback.warning(ResultError.EXCEPTION, ResultDetailCode.EXCEPTION_TASK, e.getMessage(), e));
        }
    }
}
