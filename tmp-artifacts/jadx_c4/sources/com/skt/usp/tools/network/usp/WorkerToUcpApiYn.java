package com.skt.usp.tools.network.usp;

import android.content.Context;
import android.os.Build;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.USPIllegarMultiUiccException;
import com.skt.usp.tools.common.USPIllegarUcpApiException;
import com.skt.usp.tools.common.USPProcException;
import com.skt.usp.tools.dao.UCPAuthInfo;
import com.skt.usp.tools.dao.protocol.usp.device.IUsimAvailable;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.utils.Telephone;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class WorkerToUcpApiYn extends AbstractWorker {
    private APITypeCode a;
    private String b;

    public WorkerToUcpApiYn(Context context, String str, String str2, String str3, String str4, String str5, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, str2, str3, str4, onWorkerListener);
        this.a = APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN;
        this.b = str5;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        AbstractWorker.OnWorkerListener onWorkerListener;
        IUsimAvailable.Response responseCheckCarrierApiUsim;
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        UCPAuthInfo uCPAuthInfo = new UCPAuthInfo();
        String mdn = Telephone.getMdn(this.m_oContext);
        try {
            try {
                try {
                    checkUcpApiPhoneState();
                    checkMultiUiccAvaliable();
                    USPManager uSPManager = USPManager.getInstance(this.m_oContext);
                    UCPLog.debug(">> Build.VERSION [%s]", Integer.valueOf(Build.VERSION.SDK_INT));
                    responseCheckCarrierApiUsim = uSPManager.checkCarrierApiUsim(this.m_strStId, this.m_strPkgName, this.m_strCompId, mdn, this.m_strICCID);
                    uCPAuthInfo.setTid(responseCheckCarrierApiUsim.getBody().getTid());
                    uCPAuthInfo.setAuthResult_msg(responseCheckCarrierApiUsim.getBody().getResultMsg());
                } catch (USPIllegarMultiUiccException e) {
                    UCPLog.error(e.getMessage());
                    uCPAuthInfo.setAuthResult(false);
                    uCPAuthInfo.setAuthResult_msg(e.getMessage());
                    uCPAuthInfo.setAuthResult_code(e.getCode());
                    onWorkerListener = this.m_onListener;
                    if (onWorkerListener == null) {
                        return;
                    }
                } catch (USPProcException e2) {
                    UCPLog.error(e2.getMessage());
                    aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                    aPIResultCode.setMessage(e2.getErrorCode());
                    uCPAuthInfo.setAuthResult(false);
                    uCPAuthInfo.setAuthResult_msg(e2.getMessage());
                    onWorkerListener = this.m_onListener;
                    if (onWorkerListener == null) {
                        return;
                    }
                }
            } catch (USPIllegarUcpApiException e3) {
                UCPLog.error(e3.getMessage());
                uCPAuthInfo.setAuthResult(false);
                uCPAuthInfo.setAuthResult_msg(e3.getMessage());
                uCPAuthInfo.setAuthResult_code(e3.getCode());
                onWorkerListener = this.m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
            } catch (Exception e4) {
                UCPLog.error(e4.getMessage());
                aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                uCPAuthInfo.setAuthResult(false);
                onWorkerListener = this.m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
            }
            if (!"Y".equalsIgnoreCase(responseCheckCarrierApiUsim.getBody().getResultYn())) {
                throw new USPIllegarUcpApiException(responseCheckCarrierApiUsim.getBody().getResult_code(), responseCheckCarrierApiUsim.getBody().getResultMsg());
            }
            onWorkerListener = this.m_onListener;
            if (onWorkerListener == null) {
                return;
            }
            onWorkerListener.onTerminateFromWorker(this.a, aPIResultCode, uCPAuthInfo);
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener2 = this.m_onListener;
            if (onWorkerListener2 != null) {
                onWorkerListener2.onTerminateFromWorker(this.a, aPIResultCode, uCPAuthInfo);
            }
            throw th;
        }
    }
}
