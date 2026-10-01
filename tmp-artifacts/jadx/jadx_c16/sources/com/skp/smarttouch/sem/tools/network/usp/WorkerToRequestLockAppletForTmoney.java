package com.skp.smarttouch.sem.tools.network.usp;

import android.content.Context;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STOtaProcException;
import com.skp.smarttouch.sem.tools.common.STUspProcException;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OtaResult;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import com.skp.smarttouch.sem.tools.network.ota.OTAManager;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import o.xkzzb;
import o.zb2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class WorkerToRequestLockAppletForTmoney extends AbstractWorker {
    private final APITypeCode a;
    private AbstractSmartcard b;
    private String c;
    private String d;

    public WorkerToRequestLockAppletForTmoney(Context context, AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, str2, str3, str4, onWorkerListener);
        this.a = APITypeCode.STD_TRP_REQUEST_LOCK_TMONEY;
        this.d = null;
        this.b = abstractSmartcard;
        this.c = str5;
    }

    public void run() {
        String installedAppletVersion;
        String tidFromListener;
        OtaResult otaResultLockApplet;
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            zb2.onNavigationEvent(((AbstractWorker) this).m_oContext);
            installedAppletVersion = USPManager.getInstance(((AbstractWorker) this).m_oContext).getAppletVersion(((AbstractWorker) this).m_strStId, ((AbstractWorker) this).m_strICCID, ((AbstractWorker) this).m_strPkgName, ((AbstractWorker) this).m_strCompId, this.c).getBody().getInstalledAppletVersion();
        } catch (STUspProcException e) {
            xkzzb.onNavigationEvent(e);
            APIResultCode aPIResultCode2 = APIResultCode.ERROR_USP_INTERACTION_FAIL;
            aPIResultCode2.setMessage(e.getErrorCode());
            installedAppletVersion = null;
            aPIResultCode = aPIResultCode2;
        } catch (Exception e2) {
            xkzzb.onNavigationEvent(e2);
            aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
            installedAppletVersion = null;
        }
        try {
            if (APIResultCode.SUCCESS.equals(aPIResultCode)) {
                try {
                    OTAManager oTAManager = OTAManager.getInstance(((AbstractWorker) this).m_oContext);
                    oTAManager.setOnWorkerListener(this.a, ((AbstractWorker) this).m_onListener, ((AbstractWorker) this).m_tidListener);
                    otaResultLockApplet = oTAManager.lockApplet(this.b, ((AbstractWorker) this).m_strICCID, ((AbstractWorker) this).m_strStId, ((AbstractWorker) this).m_strCompId, this.c, installedAppletVersion);
                    oTAManager.setOnWorkerListener((APITypeCode) null, (AbstractWorker.OnWorkerListener) null, (AbstractWorker.TidListener) null);
                } catch (Exception e3) {
                    xkzzb.onNavigationEvent(e3);
                    aPIResultCode = APIResultCode.ERROR_OTA_INTERACTION_FAIL;
                    tidFromListener = ((AbstractWorker) this).m_tidListener.getTidFromListener();
                    if (tidFromListener != null) {
                    }
                } catch (STOtaProcException e4) {
                    xkzzb.onNavigationEvent(e4);
                    APIResultCode aPIResultCode3 = APIResultCode.ERROR_OTA_INTERACTION_FAIL;
                    aPIResultCode3.setMessage(e4.getErrorCode());
                    String tidFromListener2 = ((AbstractWorker) this).m_tidListener.getTidFromListener();
                    if (tidFromListener2 != null) {
                        this.d = tidFromListener2;
                    }
                    aPIResultCode = aPIResultCode3;
                }
                if (otaResultLockApplet.isFail()) {
                    throw new Exception("***** ota interaction fail !!");
                }
                tidFromListener = ((AbstractWorker) this).m_tidListener.getTidFromListener();
                if (tidFromListener != null) {
                    this.d = tidFromListener;
                }
            }
            AbstractWorker.OnWorkerListener onWorkerListener = ((AbstractWorker) this).m_onListener;
            if (onWorkerListener != null) {
                onWorkerListener.onTerminateFromWorker(this.a, aPIResultCode, this.d);
            }
        } catch (Throwable th) {
            String tidFromListener3 = ((AbstractWorker) this).m_tidListener.getTidFromListener();
            if (tidFromListener3 != null) {
                this.d = tidFromListener3;
            }
            throw th;
        }
    }
}
