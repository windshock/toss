package com.skp.smarttouch.sem.tools.network.nrms;

import android.content.Context;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import com.skp.smarttouch.sem.tools.network.WorkerPoolExecutor;
import o.xkzzb;
import o.zb2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class NrmsManager {
    private static NrmsManager a;
    private static Context b;

    private NrmsManager() {
    }

    public static NrmsManager getInstance(Context context) {
        xkzzb.onExtraCallback(new Object[]{">> getInstance()"});
        b = context;
        xkzzb.onExtraCallback(new Object[]{"++ s_context : [%s]", context});
        if (a == null) {
            a = new NrmsManager();
        }
        return a;
    }

    public void release() {
        xkzzb.onExtraCallback(new Object[]{">> release()"});
        a = null;
    }

    public void requestGetPackageAllRight(String str, String str2, String str3, AbstractWorker.OnWorkerListener onWorkerListener) {
        xkzzb.onExtraCallback(new Object[]{">> requestGetPackageAllRight()"});
        xkzzb.onExtraCallback(new Object[]{"++ stId : [%s]", str});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ mdn : [%s]", zb2.onNavigationEvent(b)});
        xkzzb.onExtraCallback(new Object[]{"++ listner : [%s]", onWorkerListener});
        WorkerPoolExecutor.getInstance().execute(new WorkerToGetPackageAllRight(str, str2, str3, zb2.onNavigationEvent(b), onWorkerListener));
    }
}
