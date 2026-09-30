package com.skp.smarttouch.sem.tools.network.usp;

import android.content.Context;
import android.nfc.NfcManager;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STIllegarCarrierApiException;
import com.skp.smarttouch.sem.tools.common.STIllegarMultiUiccException;
import com.skp.smarttouch.sem.tools.common.STUspProcException;
import com.skp.smarttouch.sem.tools.dao.STAuthInfo;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.device.IAvailable;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import o.xkzzb;
import o.zb2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class WorkerToCarrierApiNfcYn extends AbstractWorker {
    private APITypeCode a;
    private String b;

    public WorkerToCarrierApiNfcYn(Context context, String str, String str2, String str3, String str4, String str5, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, str2, str3, str4, onWorkerListener);
        this.a = APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN;
        this.b = str5;
    }

    public void run() {
        AbstractWorker.OnWorkerListener onWorkerListener;
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        STAuthInfo sTAuthInfo = new STAuthInfo();
        String strOnNavigationEvent = zb2.onNavigationEvent(((AbstractWorker) this).m_oContext);
        try {
            try {
                try {
                    checkMultiUiccAvaliable();
                    USPManager uSPManager = USPManager.getInstance(((AbstractWorker) this).m_oContext);
                    if (this.b.equalsIgnoreCase("com.sktelecom.smartcard.ISmartcard")) {
                        IAvailable.Response responseAuthNfcYn = uSPManager.authNfcYn(((AbstractWorker) this).m_strStId, ((AbstractWorker) this).m_strPkgName, ((AbstractWorker) this).m_strCompId, strOnNavigationEvent);
                        sTAuthInfo.setTid(responseAuthNfcYn.getBody().getTid());
                        sTAuthInfo.setAuthResult_msg(responseAuthNfcYn.getBody().getResultMsg());
                        if (!"Y".equalsIgnoreCase(responseAuthNfcYn.getBody().getResultYn())) {
                            sTAuthInfo.setAuthResult(false);
                        }
                    } else if (this.b.equalsIgnoreCase("com.skp.seio.aidl.ISEService")) {
                        sTAuthInfo = checkCarrierApiUsim();
                        checkCarrerApiPhoneState();
                        if (((NfcManager) ((AbstractWorker) this).m_oContext.getSystemService("nfc")).getDefaultAdapter() == null) {
                            throw new STIllegarCarrierApiException("1100", "CarrierApi NFC 미지원 단말");
                        }
                    }
                    onWorkerListener = ((AbstractWorker) this).m_onListener;
                    if (onWorkerListener == null) {
                        return;
                    }
                } catch (STIllegarCarrierApiException e) {
                    xkzzb.onNavigationEvent(e);
                    sTAuthInfo.setAuthResult(false);
                    sTAuthInfo.setAuthResult_msg(e.getMessage());
                    sTAuthInfo.setAuthResult_code(e.getCode());
                    onWorkerListener = ((AbstractWorker) this).m_onListener;
                    if (onWorkerListener == null) {
                        return;
                    }
                } catch (Exception e2) {
                    xkzzb.onNavigationEvent(e2);
                    aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                    sTAuthInfo.setAuthResult(false);
                    onWorkerListener = ((AbstractWorker) this).m_onListener;
                    if (onWorkerListener == null) {
                        return;
                    }
                }
            } catch (STUspProcException e3) {
                xkzzb.onNavigationEvent(e3);
                aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                aPIResultCode.setMessage(e3.getErrorCode());
                sTAuthInfo.setAuthResult(false);
                onWorkerListener = ((AbstractWorker) this).m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
            } catch (STIllegarMultiUiccException e4) {
                xkzzb.onNavigationEvent(e4);
                sTAuthInfo.setAuthResult(false);
                sTAuthInfo.setAuthResult_msg(e4.getMessage());
                sTAuthInfo.setAuthResult_code(e4.getCode());
                onWorkerListener = ((AbstractWorker) this).m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
            }
            onWorkerListener.onTerminateFromWorker(this.a, aPIResultCode, sTAuthInfo);
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener2 = ((AbstractWorker) this).m_onListener;
            if (onWorkerListener2 != null) {
                onWorkerListener2.onTerminateFromWorker(this.a, aPIResultCode, sTAuthInfo);
            }
            throw th;
        }
    }
}
