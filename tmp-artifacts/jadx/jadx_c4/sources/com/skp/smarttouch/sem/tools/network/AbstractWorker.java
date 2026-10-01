package com.skp.smarttouch.sem.tools.network;

import android.content.Context;
import android.os.Build;
import com.skp.smarttouch.sem.telco.SEUtility;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STIllegarCarrierApiException;
import com.skp.smarttouch.sem.tools.common.STIllegarMultiUiccException;
import com.skp.smarttouch.sem.tools.common.USPSubscriptionManager;
import com.skp.smarttouch.sem.tools.dao.STAuthInfo;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.device.IUsimAvailable;
import com.skp.smarttouch.sem.tools.network.usp.USPManager;
import o.xkzzb;
import o.zb2;

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
    public TidListener m_tidListener;

    public interface OnWorkerListener {
        void onDispatchFromWorker(APITypeCode aPITypeCode, String str, String str2);

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

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STIllegarCarrierApiException */
    public STAuthInfo checkCarrierApiUsim() throws Exception {
        xkzzb.onExtraCallback(new Object[]{">> carrierApiYn"});
        String strOnNavigationEvent = zb2.onNavigationEvent(this.m_oContext);
        STAuthInfo sTAuthInfo = new STAuthInfo();
        IUsimAvailable.Response responseCheckCarrierApiUsim = USPManager.getInstance(this.m_oContext).checkCarrierApiUsim(this.m_strStId, this.m_strPkgName, this.m_strCompId, strOnNavigationEvent, this.m_strICCID);
        sTAuthInfo.setTid(responseCheckCarrierApiUsim.getBody().getTid());
        sTAuthInfo.setAuthResult_msg(responseCheckCarrierApiUsim.getBody().getResultMsg());
        sTAuthInfo.setAuthResult_code(responseCheckCarrierApiUsim.getBody().getResultCode());
        if ("Y".equalsIgnoreCase(responseCheckCarrierApiUsim.getBody().getResultYn())) {
            return sTAuthInfo;
        }
        throw new STIllegarCarrierApiException(responseCheckCarrierApiUsim.getBody().getResultCode(), responseCheckCarrierApiUsim.getBody().getResultMsg());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STIllegarCarrierApiException */
    public void checkCarrerApiPhoneState() throws Exception {
        xkzzb.onExtraCallback(new Object[]{">> checkCarrerApiPhoneState"});
        int applicationVersionCode = SEUtility.getApplicationVersionCode(this.m_oContext, "com.skp.seio");
        xkzzb.onExtraCallback(new Object[]{">> seioVer [%s]", Integer.valueOf(applicationVersionCode)});
        int i = Build.VERSION.SDK_INT;
        if (applicationVersionCode < 5) {
            throw new STIllegarCarrierApiException("1102", "CarrierApi 미지원 SEIOAgent 버전");
        }
        if (i >= 29 && applicationVersionCode < 14) {
            throw new STIllegarCarrierApiException("1102", "CarrierApi 미지원 SEIOAgent 버전");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STIllegarMultiUiccException */
    public void checkMultiUiccAvaliable() throws Exception {
        if (LibraryFeatures.isMultiUiccAvailableYn()) {
            int iAvailableMultiUiccCd = new USPSubscriptionManager(this.m_oContext).availableMultiUiccCd();
            xkzzb.onExtraCallback(new Object[]{">> checkMultiUiccAvaliable [%s]", Integer.valueOf(iAvailableMultiUiccCd)});
            if (iAvailableMultiUiccCd == -3) {
                throw new STIllegarMultiUiccException("1301", "Multi UICC 미지원 SEIOAgent 버전");
            }
            if (iAvailableMultiUiccCd == -4) {
                throw new STIllegarMultiUiccException("1300", "Multi UICC 미지원 SmartcardService 버전");
            }
            if (iAvailableMultiUiccCd == -1) {
                throw new STIllegarMultiUiccException("1302", "활성화 되지 않은 UICC");
            }
            if (iAvailableMultiUiccCd == -2) {
                throw new STIllegarMultiUiccException("1303", "SKT 혹은 제휴된 MVNO UICC가 아님");
            }
            if (iAvailableMultiUiccCd == -5) {
                throw new STIllegarMultiUiccException("1304", "SKT 혹은 제휴된 MVNO UICC가 존재하지 않음");
            }
            if (iAvailableMultiUiccCd == -6) {
                throw new STIllegarMultiUiccException("1305", "필요 권한이 승인 되지 않음");
            }
            if (iAvailableMultiUiccCd == -7) {
                throw new STIllegarMultiUiccException("1306", "Multi UICC 미지원 OS");
            }
        }
    }
}
