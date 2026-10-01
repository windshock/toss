package com.skp.smarttouch.sem.tools.network.usp;

import android.content.Context;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STUspProcException;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class WorkerToRequestIsTransIssued extends AbstractWorker {
    private final APITypeCode a;
    private String b;

    public WorkerToRequestIsTransIssued(Context context, String str, String str2, String str3, String str4, String str5, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, str2, str3, str4, onWorkerListener);
        this.a = APITypeCode.STD_TRP_REQUEST_IS_TRANS_ISSUED;
        this.b = str5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r2 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        r2.onTerminateFromWorker(r9.a, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        AbstractWorker.OnWorkerListener onWorkerListener;
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        String appletLifeCycle = null;
        try {
            try {
                appletLifeCycle = USPManager.getInstance(this.m_oContext).getAppletLifeCycle(this.m_strStId, this.m_strICCID, this.m_strPkgName, this.m_strCompId, this.b).getBody().getAppletLifeCycle();
                onWorkerListener = this.m_onListener;
            } catch (Exception e) {
                xkzzb.onNavigationEvent(e);
                aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                onWorkerListener = this.m_onListener;
            } catch (STUspProcException e2) {
                xkzzb.onNavigationEvent(e2);
                aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                aPIResultCode.setMessage(e2.getErrorCode());
                AbstractWorker.OnWorkerListener onWorkerListener2 = this.m_onListener;
                if (onWorkerListener2 != null) {
                    onWorkerListener2.onTerminateFromWorker(this.a, aPIResultCode, null);
                }
            }
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener3 = this.m_onListener;
            if (onWorkerListener3 != null) {
                onWorkerListener3.onTerminateFromWorker(this.a, aPIResultCode, appletLifeCycle);
            }
            throw th;
        }
    }
}
