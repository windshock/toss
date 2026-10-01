package com.tmoney.b;

import android.content.Context;
import com.tmoney.dto.PurseHistoryDto;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tmoney.b.f, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0039f extends com.tmoney.g.a.a {
    private final String a;
    private ArrayList<String> b;
    private ArrayList<PurseHistoryDto> c;

    public C0039f(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "NfcPurseHistoryExecuter";
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        int iExecute = super.execute(dVar, resultType, true);
        if (resultType != TmoneyCallback.ResultType.SUCCESS) {
            onResult(resultType);
            return iExecute;
        }
        purseList();
        return iExecute;
    }

    public final void purseList() {
        LogHelper.d("NfcPurseHistoryExecuter", "purseList()");
        try {
            this.b.clear();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < 20) {
                i++;
                byte[] bArrA = a(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i, (byte) 0, 0, (byte) 0));
                com.tmoney.a.f fVar = new com.tmoney.a.f(bArrA);
                if (!fVar.isbResData()) {
                    break;
                }
                this.b.add(com.tmoney.e.a.a.bytesToHexString(bArrA));
                arrayList.add(fVar);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.add(new PurseHistoryDto((com.tmoney.a.f) it.next()));
            }
            onResult(Callback.success(this.c));
        } catch (Exception e) {
            onResult(Callback.warning(ResultError.EXCEPTION, ResultDetailCode.EXCEPTION_TASK, e.getMessage(), e));
        }
    }
}
