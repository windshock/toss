package com.skt.usp.tools.network;

import android.content.Context;
import android.os.Build;
import com.skt.usp.telco.UCPUtility;
import com.skt.usp.tools.UCPLibraryFeatures;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.USPIllegarMultiUiccException;
import com.skt.usp.tools.common.USPIllegarUcpApiException;
import com.skt.usp.tools.common.USPSubscriptionManager;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AbstractWorker implements Runnable {
    protected static String m_strOtaTid;
    public Context m_oContext;
    public OnWorkerListener m_onListener;
    protected String m_strAccessToken;
    public String m_strCompId;
    public String m_strICCID;
    public String m_strPkgName;
    public String m_strStId;
    protected TidListener m_tidListener;

    public interface OnWorkerListener {
        void onTerminateFromWorker(APITypeCode aPITypeCode, APIResultCode aPIResultCode, Object obj);
    }

    public static class TidListener {
        String a;

        public void setTidFromWorker(String str) {
            this.a = str;
        }

        public String getTidFromListener() {
            return this.a;
        }
    }

    public AbstractWorker(Context context, String str, String str2, String str3, String str4, OnWorkerListener onWorkerListener) {
        this.m_strAccessToken = null;
        this.m_tidListener = null;
        this.m_oContext = context;
        this.m_strStId = str;
        this.m_strICCID = str2;
        this.m_strPkgName = str3;
        this.m_strCompId = str4;
        this.m_onListener = onWorkerListener;
        this.m_tidListener = new TidListener();
    }

    public AbstractWorker(Context context, String str, OnWorkerListener onWorkerListener) {
        this.m_strStId = null;
        this.m_strICCID = null;
        this.m_strCompId = null;
        this.m_strAccessToken = null;
        this.m_tidListener = null;
        this.m_oContext = context;
        this.m_strPkgName = str;
        this.m_onListener = onWorkerListener;
    }

    public AbstractWorker(OnWorkerListener onWorkerListener) {
        this.m_oContext = null;
        this.m_strStId = null;
        this.m_strICCID = null;
        this.m_strPkgName = null;
        this.m_strCompId = null;
        this.m_strAccessToken = null;
        this.m_tidListener = null;
        this.m_onListener = onWorkerListener;
        this.m_tidListener = new TidListener();
    }

    public void checkUcpApiPhoneState() throws Exception {
        UCPLog.info(">> checkCarrerApiPhoneState");
        int applicationVersionCode = UCPUtility.getApplicationVersionCode(this.m_oContext, "com.skp.seio");
        UCPLog.debug(">> seioVer [%s]", Integer.valueOf(applicationVersionCode));
        int i = Build.VERSION.SDK_INT;
        UCPLog.debug(">> Build.VERSION [%s]", Integer.valueOf(i));
        if (i < 29) {
            throw new USPIllegarUcpApiException("1000", "UCP Api 미지원 OS");
        }
        if (applicationVersionCode < 14) {
            throw new USPIllegarUcpApiException("1001", "UCP Api 미지원 SEIOAgent 버전");
        }
    }

    public void checkMultiUiccAvaliable() throws Exception {
        if (UCPLibraryFeatures.isMultiUiccAvailableYn()) {
            int iAvailableMultiUiccCd = new USPSubscriptionManager(this.m_oContext).availableMultiUiccCd();
            UCPLog.info(">> checkMultiUiccAvaliable : [%s]", Integer.valueOf(iAvailableMultiUiccCd));
            if (iAvailableMultiUiccCd == -3) {
                throw new USPIllegarMultiUiccException("1301", "Multi UICC 미지원 SEIOAgent 버전");
            }
            if (iAvailableMultiUiccCd == -1) {
                throw new USPIllegarMultiUiccException("1302", "활성화 되지 않은 UICC");
            }
            if (iAvailableMultiUiccCd == -2) {
                throw new USPIllegarMultiUiccException("1303", "SKT 혹은 제휴된 MVNO UICC가 아님");
            }
            if (iAvailableMultiUiccCd == -5) {
                throw new USPIllegarMultiUiccException("1304", "SKT 혹은 제휴된 MVNO UICC가 존재하지 않음");
            }
            if (iAvailableMultiUiccCd == -6) {
                throw new USPIllegarMultiUiccException("1305", "필요 권한이 승인 되지 않음");
            }
            if (iAvailableMultiUiccCd == -7) {
                throw new USPIllegarMultiUiccException("1306", "Multi UICC 미지원 OS");
            }
        }
    }
}
