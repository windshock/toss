package com.skt.usp.tools.network.urms;

import android.content.Context;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.tools.network.WorkerPoolExecutor;
import com.skt.usp.utils.Telephone;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UrmsManager {
    private static UrmsManager a;
    private static Context b;

    private UrmsManager() {
    }

    public static UrmsManager getInstance(Context context) {
        UCPLog.info(">> getInstance()");
        b = context;
        UCPLog.debug("++ s_context : [%s]", context);
        if (a == null) {
            a = new UrmsManager();
        }
        return a;
    }

    public void release() {
        UCPLog.info(">> release()");
        a = null;
    }

    public void requestGetPackageAllRight(String str, String str2, String str3, AbstractWorker.OnWorkerListener onWorkerListener) {
        UCPLog.info(">> requestGetPackageAllRight()");
        UCPLog.debug("++ stId : [%s]", str);
        UCPLog.debug("++ pkgName : [%s]", str2);
        UCPLog.debug("++ compId : [%s]", str3);
        UCPLog.debug("++ mdn : [%s]", Telephone.getMdn(b));
        UCPLog.debug("++ listner : [%s]", onWorkerListener);
        WorkerPoolExecutor.getInstance().execute(new WorkerToGetPackageAllRight(str, str2, str3, Telephone.getMdn(b), onWorkerListener));
    }
}
