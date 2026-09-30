package com.skp.smarttouch.sem.tools.network.usp;

import android.content.Context;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STUspProcException;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import java.util.List;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class WorkerToRequestTransportationList extends AbstractWorker {
    private final APITypeCode a;

    public WorkerToRequestTransportationList(Context context, String str, String str2, String str3, String str4, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, str2, str3, str4, onWorkerListener);
        this.a = APITypeCode.STD_TRP_REQUEST_TRANSPORTATION_LIST;
    }

    public void run() {
        AbstractWorker.OnWorkerListener onWorkerListener;
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        List list = null;
        try {
            try {
                list = USPManager.getInstance(((AbstractWorker) this).m_oContext).requestTransportationList(((AbstractWorker) this).m_strStId, ((AbstractWorker) this).m_strICCID, ((AbstractWorker) this).m_strPkgName, ((AbstractWorker) this).m_strCompId).getBody().getList();
                onWorkerListener = ((AbstractWorker) this).m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
            } catch (STUspProcException e) {
                xkzzb.onNavigationEvent(e);
                aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                aPIResultCode.setMessage(e.getErrorCode());
                onWorkerListener = ((AbstractWorker) this).m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
            } catch (Exception e2) {
                xkzzb.onNavigationEvent(e2);
                aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                onWorkerListener = ((AbstractWorker) this).m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
            }
            onWorkerListener.onTerminateFromWorker(this.a, aPIResultCode, list);
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener2 = ((AbstractWorker) this).m_onListener;
            if (onWorkerListener2 != null) {
                onWorkerListener2.onTerminateFromWorker(this.a, aPIResultCode, (Object) null);
            }
            throw th;
        }
    }
}
