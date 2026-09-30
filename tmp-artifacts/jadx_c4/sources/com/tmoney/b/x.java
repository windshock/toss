package com.tmoney.b;

import android.content.Context;
import com.tmoney.dto.PurseHistoryDto;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class x extends com.tmoney.g.a.a {
    private final String a;
    private com.tmoney.f.a.a b;
    private ArrayList<PurseHistoryDto> c;

    public x(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyPurseHistoryExecuter";
        this.c = new ArrayList<>();
        this.b = new com.tmoney.f.a.a();
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            Iterator<com.tmoney.a.f> it = this.b.getPurseList(dVar).iterator();
            while (it.hasNext()) {
                this.c.add(new PurseHistoryDto(it.next()));
            }
        }
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(this.c);
        }
        onResult(resultType);
        return 0;
    }
}
