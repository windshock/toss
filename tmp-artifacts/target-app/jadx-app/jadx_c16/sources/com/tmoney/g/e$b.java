package com.tmoney.g;

import com.tmoney.TmoneyMsg;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.utils.LogHelper;
import java.util.TimerTask;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class e$b extends TimerTask {
    private /* synthetic */ e a;

    private e$b(e eVar) {
        this.a = eVar;
    }

    /* synthetic */ e$b(e eVar, byte b) {
        this(eVar);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.a.c) / 1000;
        LogHelper.d("UsimKTUfin", "limit_time:" + jCurrentTimeMillis);
        if (e.a(this.a).UFIN_hasCarrierPrivileges(e.h(this.a))) {
            this.a.b.cancel();
            LogHelper.d("UsimKTUfin", "UFIN_hasCarrierPrivileges:true");
            e eVar = this.a;
            eVar.a(false, eVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_NEED_REBOOT, ResultDetailCode.KT_UFIN_CLIENT_SUCCESS));
            return;
        }
        if (jCurrentTimeMillis > 120) {
            e eVar2 = this.a;
            eVar2.a(false, eVar2.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_KT_CLIENT_FAIL, ResultDetailCode.KT_UFIN_CLIENT_FAIL));
            this.a.b.cancel();
            this.a.b = null;
        }
        LogHelper.d("UsimKTUfin", "UFIN_hasCarrierPrivileges:false");
    }
}
