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

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class WorkerToRequestDeletePostPay extends AbstractWorker {
    private final APITypeCode a;
    private AbstractSmartcard b;
    private String c;
    private String d;
    private String e;

    public WorkerToRequestDeletePostPay(Context context, AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5, String str6, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, str2, str3, str4, onWorkerListener);
        this.a = APITypeCode.STD_TRP_REQUEST_DELETE_POST_PAY;
        this.e = null;
        this.b = abstractSmartcard;
        this.c = str5;
        this.d = str6;
    }

    public void run() {
        String tidFromListener;
        OtaResult otaResultBlockingApplet;
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    OTAManager oTAManager = OTAManager.getInstance(((AbstractWorker) this).m_oContext);
                    oTAManager.setOnWorkerListener(this.a, ((AbstractWorker) this).m_onListener, ((AbstractWorker) this).m_tidListener);
                    otaResultBlockingApplet = oTAManager.blockingApplet(this.b, ((AbstractWorker) this).m_strICCID, ((AbstractWorker) this).m_strStId, ((AbstractWorker) this).m_strCompId, this.c, this.d);
                    this.e = otaResultBlockingApplet.getTid();
                    oTAManager.setOnWorkerListener((APITypeCode) null, (AbstractWorker.OnWorkerListener) null, (AbstractWorker.TidListener) null);
                } catch (Exception e) {
                    xkzzb.onNavigationEvent(e);
                    aPIResultCode = APIResultCode.ERROR_OTA_INTERACTION_FAIL;
                    tidFromListener = ((AbstractWorker) this).m_tidListener.getTidFromListener();
                    if (tidFromListener != null) {
                    }
                }
            } catch (STOtaProcException e2) {
                xkzzb.onNavigationEvent(e2);
                APIResultCode aPIResultCode2 = APIResultCode.ERROR_OTA_INTERACTION_FAIL;
                aPIResultCode2.setMessage(e2.getErrorCode());
                String tidFromListener2 = ((AbstractWorker) this).m_tidListener.getTidFromListener();
                if (tidFromListener2 != null) {
                    this.e = tidFromListener2;
                }
                aPIResultCode = aPIResultCode2;
            }
            if (otaResultBlockingApplet.isFail()) {
                throw new Exception("***** ota interaction fail !!");
            }
            tidFromListener = ((AbstractWorker) this).m_tidListener.getTidFromListener();
            if (tidFromListener != null) {
                this.e = tidFromListener;
            }
            AbstractWorker.OnWorkerListener onWorkerListener = ((AbstractWorker) this).m_onListener;
            if (onWorkerListener != null) {
                onWorkerListener.onTerminateFromWorker(this.a, aPIResultCode, this.e);
            }
        } catch (Throwable th) {
            String tidFromListener3 = ((AbstractWorker) this).m_tidListener.getTidFromListener();
            if (tidFromListener3 != null) {
                this.e = tidFromListener3;
            }
            throw th;
        }
    }
}
