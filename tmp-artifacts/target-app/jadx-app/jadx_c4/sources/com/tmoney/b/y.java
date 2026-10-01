package com.tmoney.b;

import android.content.Context;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.ByteHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class y extends com.tmoney.g.a.a {
    private final String a;
    private String b;
    private String c;

    public y(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyRecentRecordExecuter";
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
        if (resultType == resultType2) {
            com.tmoney.f.a.a aVar = new com.tmoney.f.a.a();
            this.c = ByteHelper.byteArrayToHexString(aVar.getRecentTransByte(dVar));
            this.b = ByteHelper.byteArrayToHexString(aVar.getRecentPurseByte(dVar));
        }
        if (resultType == resultType2) {
            if (this.b == null) {
                this.b = "";
            }
            if (this.c == null) {
                this.c = "";
            }
            resultType.setData(b(), this.b, this.c);
        }
        onResult(resultType);
        return p();
    }
}
