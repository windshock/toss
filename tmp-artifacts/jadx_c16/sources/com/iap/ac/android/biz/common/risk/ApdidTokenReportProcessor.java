package com.iap.ac.android.biz.common.risk;

import android.os.SystemClock;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.rpc.facade.MobilePaymentTokenIdPostFacade;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentTokenIdPostRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentTokenIdPostResult;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ApdidTokenReportProcessor extends BaseNetwork<MobilePaymentTokenIdPostFacade> {
    private static final int MAX_RETRY_TIMES = 3;
    private static final long RETRY_TIME_INTERVAL = 500;

    public Class<MobilePaymentTokenIdPostFacade> getFacadeClass() {
        return MobilePaymentTokenIdPostFacade.class;
    }

    public boolean reportTokenId(String str) {
        MobilePaymentTokenIdPostResult mobilePaymentTokenIdPostResultReportTokenId;
        MobilePaymentTokenIdPostRequest mobilePaymentTokenIdPostRequest = new MobilePaymentTokenIdPostRequest();
        mobilePaymentTokenIdPostRequest.apdidToken = str;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                mobilePaymentTokenIdPostResultReportTokenId = ((MobilePaymentTokenIdPostFacade) getFacade()).reportTokenId(mobilePaymentTokenIdPostRequest);
            } catch (Throwable unused) {
                reportUploadTokenIdResult(false, null, null, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            }
            if (mobilePaymentTokenIdPostResultReportTokenId != null && ((BaseRpcResult) mobilePaymentTokenIdPostResultReportTokenId).success) {
                reportUploadTokenIdResult(true, null, null, SystemClock.elapsedRealtime() - jElapsedRealtime, ((BaseRpcResult) mobilePaymentTokenIdPostResultReportTokenId).traceId);
                z = true;
                return true;
            }
            if (mobilePaymentTokenIdPostResultReportTokenId != null) {
                reportUploadTokenIdResult(false, ((BaseRpcResult) mobilePaymentTokenIdPostResultReportTokenId).errorCode, ((BaseRpcResult) mobilePaymentTokenIdPostResultReportTokenId).errorMessage, SystemClock.elapsedRealtime() - jElapsedRealtime, ((BaseRpcResult) mobilePaymentTokenIdPostResultReportTokenId).traceId);
            } else {
                reportUploadTokenIdResult(false, null, null, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            }
            Thread.sleep(RETRY_TIME_INTERVAL);
        }
        return z;
    }

    private void reportUploadTokenIdResult(boolean z, String str, String str2, long j, String str3) {
        ACLog.d("IAPConnect", String.format("reportUploadTokenIdResult: %s, errorCode: %s, errorMessage: %s", Boolean.valueOf(z), str, str2));
        if (z) {
            ACLogEvent.commonRpcSuccessEvent("iapconnect_center", "ac_apdidtoken_upload", j, str3);
        } else {
            ACLogEvent.commonRpcFailEvent("iapconnect_center", "ac_apdidtoken_upload", str, str2, j, str3);
        }
    }
}
