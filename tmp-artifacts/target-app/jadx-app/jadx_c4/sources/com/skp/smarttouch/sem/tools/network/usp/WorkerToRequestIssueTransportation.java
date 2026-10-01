package com.skp.smarttouch.sem.tools.network.usp;

import android.content.Context;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STOtaProcException;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OtaResult;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import com.skp.smarttouch.sem.tools.network.ota.OTAManager;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class WorkerToRequestIssueTransportation extends AbstractWorker {
    private final APITypeCode a;
    private AbstractSmartcard b;
    private String c;
    private String d;
    private String e;

    public WorkerToRequestIssueTransportation(Context context, AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5, String str6, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, str2, str3, str4, onWorkerListener);
        this.a = APITypeCode.STD_TRP_REQUEST_ISSUE_TRANSPORTATION;
        this.e = null;
        this.b = abstractSmartcard;
        this.c = str5;
        this.d = str6;
    }

    @Override // java.lang.Runnable
    public void run() {
        String tidFromListener;
        OtaResult otaResultRequestIssueApplet;
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                OTAManager oTAManager = OTAManager.getInstance(this.m_oContext);
                oTAManager.setOnWorkerListener(this.a, this.m_onListener, this.m_tidListener);
                otaResultRequestIssueApplet = oTAManager.requestIssueApplet(this.b, this.m_strICCID, this.m_strStId, this.m_strCompId, this.c, this.d);
                oTAManager.setOnWorkerListener(null, null, null);
            } catch (Exception e) {
                xkzzb.onNavigationEvent(e);
                aPIResultCode = APIResultCode.ERROR_OTA_INTERACTION_FAIL;
                tidFromListener = this.m_tidListener.getTidFromListener();
                if (tidFromListener != null) {
                }
            } catch (STOtaProcException e2) {
                xkzzb.onNavigationEvent(e2);
                APIResultCode aPIResultCode2 = APIResultCode.ERROR_OTA_INTERACTION_FAIL;
                aPIResultCode2.setMessage(e2.getErrorCode());
                String tidFromListener2 = this.m_tidListener.getTidFromListener();
                if (tidFromListener2 != null) {
                    this.e = tidFromListener2;
                }
                aPIResultCode = aPIResultCode2;
            }
            if (otaResultRequestIssueApplet.isFail()) {
                throw new Exception("***** ota interaction fail");
            }
            tidFromListener = this.m_tidListener.getTidFromListener();
            if (tidFromListener != null) {
                this.e = tidFromListener;
            }
            AbstractWorker.OnWorkerListener onWorkerListener = this.m_onListener;
            if (onWorkerListener != null) {
                onWorkerListener.onTerminateFromWorker(this.a, aPIResultCode, this.e);
            }
        } catch (Throwable th) {
            String tidFromListener3 = this.m_tidListener.getTidFromListener();
            if (tidFromListener3 != null) {
                this.e = tidFromListener3;
            }
            throw th;
        }
    }
}
