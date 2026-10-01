package com.skt.usp.ucp.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.UCPException;
import com.skt.usp.tools.common.USPIllegarCompPermissionException;
import com.skt.usp.tools.common.USPIllegarStIdException;
import com.skt.usp.tools.common.USPIllegarStateException;
import com.skt.usp.tools.common.USPIllegarUcpServiceException;
import com.skt.usp.tools.dao.UCPResultData;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCPTelephony extends ApiCom implements AbstractWorker.OnWorkerListener {
    public static final String COMPONENT_ID = "UCP_TELEPHONY";
    private static UCPTelephony d;
    BroadcastReceiver c;
    private Boolean e;

    private UCPTelephony(Context context, String str) {
        super(context, str);
        this.e = Boolean.FALSE;
        UCPLog.info(">> UCPTelephony()");
        UCPLog.debug("++ context : [%s]", context);
        UCPLog.debug("++ compId : [%s]", str);
    }

    public static UCPTelephony getInstance(Context context) {
        UCPLog.info(">> getInstance()");
        UCPLog.debug("++ context : [%s]");
        if (d == null) {
            d = new UCPTelephony(context, COMPONENT_ID);
        }
        return d;
    }

    @Override // com.skt.usp.ucp.api.ApiCom, com.skt.usp.AbstractUCP
    public void finalize() {
        UCPLog.info(">> finalize()");
        super.finalize();
    }

    @Override // com.skt.usp.ucp.api.ApiCom, com.skt.usp.tools.network.AbstractWorker.OnWorkerListener
    public void onTerminateFromWorker(final APITypeCode aPITypeCode, final APIResultCode aPIResultCode, final Object obj) {
        UCPLog.info(">> onTerminateFromWorker()");
        UCPLog.debug("++ api : [%s]", aPITypeCode);
        UCPLog.debug("++ result : [%s]", aPIResultCode);
        UCPLog.debug("++ resultData : [%s]", obj);
        try {
            try {
                if (APITypeCode.UCP_API_REQ_EFREFRESH.equals(aPITypeCode) && APIResultCode.SUCCESS.equals(aPIResultCode)) {
                    this.connChangeYn = Boolean.TRUE;
                }
                if (this.m_onSEManagerConnection != null) {
                    this.m_oHandler.post(new Runnable() { // from class: com.skt.usp.ucp.api.UCPTelephony.1
                        @Override // java.lang.Runnable
                        public void run() {
                            UCPResultData uCPResultData = UCPResultData.getInstance();
                            uCPResultData.setType(aPITypeCode);
                            uCPResultData.setResultCode(aPIResultCode);
                            uCPResultData.setData(obj);
                            UCPTelephony.this.m_onSEManagerConnection.onResultAPI(uCPResultData);
                        }
                    });
                }
            } catch (Exception e) {
                UCPLog.error(e.getMessage());
                if (this.m_onSEManagerConnection != null) {
                    this.m_oHandler.post(new Runnable() { // from class: com.skt.usp.ucp.api.UCPTelephony.1
                        @Override // java.lang.Runnable
                        public void run() {
                            UCPResultData uCPResultData = UCPResultData.getInstance();
                            uCPResultData.setType(aPITypeCode);
                            uCPResultData.setResultCode(aPIResultCode);
                            uCPResultData.setData(obj);
                            UCPTelephony.this.m_onSEManagerConnection.onResultAPI(uCPResultData);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            if (this.m_onSEManagerConnection != null) {
                this.m_oHandler.post(new Runnable() { // from class: com.skt.usp.ucp.api.UCPTelephony.1
                    @Override // java.lang.Runnable
                    public void run() {
                        UCPResultData uCPResultData = UCPResultData.getInstance();
                        uCPResultData.setType(aPITypeCode);
                        uCPResultData.setResultCode(aPIResultCode);
                        uCPResultData.setData(obj);
                        UCPTelephony.this.m_onSEManagerConnection.onResultAPI(uCPResultData);
                    }
                });
            }
            throw th;
        }
    }

    public String ucpGetImei() throws UCPException {
        UCPLog.info(">> ucpGetImei()");
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    try {
                        try {
                            String str = this.m_strStId;
                            if (str == null || str.length() <= 0) {
                                throw new USPIllegarStIdException("invalid stId");
                            }
                            a();
                            String strOnWarmupCompleted = this.m_oGlobalRepository.getCPService().onWarmupCompleted();
                            UCPLog.debug(">> imei() " + strOnWarmupCompleted);
                            return strOnWarmupCompleted;
                        } catch (USPIllegarCompPermissionException e) {
                            UCPLog.error(e.getMessage());
                            APIResultCode aPIResultCode2 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                            if (!aPIResultCode2.equals(APIResultCode.SUCCESS)) {
                                throw new UCPException(aPIResultCode2.getMessage());
                            }
                            return null;
                        }
                    } catch (Exception e2) {
                        UCPLog.error(e2.getMessage());
                        APIResultCode aPIResultCode3 = APIResultCode.ERROR_UNKNOWN;
                        if (!aPIResultCode3.equals(APIResultCode.SUCCESS)) {
                            throw new UCPException(aPIResultCode3.getMessage());
                        }
                        return null;
                    }
                } catch (USPIllegarUcpServiceException e3) {
                    UCPLog.error(e3.getMessage());
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_INVALID_UCPSERVICE_STATE;
                    if (!aPIResultCode4.equals(APIResultCode.SUCCESS)) {
                        throw new UCPException(aPIResultCode4.getMessage());
                    }
                    return null;
                }
            } catch (USPIllegarStIdException e4) {
                UCPLog.error(e4.getMessage());
                APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_STID;
                if (!aPIResultCode5.equals(APIResultCode.SUCCESS)) {
                    throw new UCPException(aPIResultCode5.getMessage());
                }
                return null;
            } catch (USPIllegarStateException e5) {
                UCPLog.error(e5.getMessage());
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                if (!aPIResultCode6.equals(APIResultCode.SUCCESS)) {
                    throw new UCPException(aPIResultCode6.getMessage());
                }
                return null;
            }
        } catch (Throwable th) {
            if (aPIResultCode.equals(APIResultCode.SUCCESS)) {
                throw th;
            }
            throw new UCPException(aPIResultCode.getMessage());
        }
    }

    public String ucpGetSimSerialNumber() throws UCPException {
        UCPLog.info(">> getSimSerialNumber()");
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    try {
                        String str = this.m_strStId;
                        if (str == null || str.length() <= 0) {
                            throw new USPIllegarStIdException("invalid stId");
                        }
                        a();
                        return this.m_oGlobalRepository.getCPService().onNavigationEvent();
                    } catch (USPIllegarStIdException e) {
                        UCPLog.error(e.getMessage());
                        APIResultCode aPIResultCode2 = APIResultCode.ERROR_INVALID_STID;
                        if (aPIResultCode2.equals(APIResultCode.SUCCESS)) {
                            return null;
                        }
                        throw new UCPException(aPIResultCode2.getMessage());
                    }
                } catch (USPIllegarCompPermissionException e2) {
                    UCPLog.error(e2.getMessage());
                    APIResultCode aPIResultCode3 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                    if (aPIResultCode3.equals(APIResultCode.SUCCESS)) {
                        return null;
                    }
                    throw new UCPException(aPIResultCode3.getMessage());
                } catch (Exception e3) {
                    UCPLog.error(e3.getMessage());
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_UNKNOWN;
                    if (aPIResultCode4.equals(APIResultCode.SUCCESS)) {
                        return null;
                    }
                    throw new UCPException(aPIResultCode4.getMessage());
                }
            } catch (USPIllegarStateException e4) {
                UCPLog.error(e4.getMessage());
                APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                if (aPIResultCode5.equals(APIResultCode.SUCCESS)) {
                    return null;
                }
                throw new UCPException(aPIResultCode5.getMessage());
            } catch (USPIllegarUcpServiceException e5) {
                UCPLog.error(e5.getMessage());
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_INVALID_UCPSERVICE_STATE;
                if (aPIResultCode6.equals(APIResultCode.SUCCESS)) {
                    return null;
                }
                throw new UCPException(aPIResultCode6.getMessage());
            }
        } catch (Throwable th) {
            if (aPIResultCode.equals(APIResultCode.SUCCESS)) {
                throw th;
            }
            throw new UCPException(aPIResultCode.getMessage());
        }
    }

    public String ucpGetSubscriberId() throws UCPException {
        UCPLog.info(">> ucpGetSubscriberId()");
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    try {
                        String str = this.m_strStId;
                        if (str == null || str.length() <= 0) {
                            throw new USPIllegarStIdException("invalid stId");
                        }
                        a();
                        return this.m_oGlobalRepository.getCPService().onExtraCallback();
                    } catch (USPIllegarStIdException e) {
                        UCPLog.error(e.getMessage());
                        APIResultCode aPIResultCode2 = APIResultCode.ERROR_INVALID_STID;
                        if (aPIResultCode2.equals(APIResultCode.SUCCESS)) {
                            return null;
                        }
                        throw new UCPException(aPIResultCode2.getMessage());
                    }
                } catch (USPIllegarCompPermissionException e2) {
                    UCPLog.error(e2.getMessage());
                    APIResultCode aPIResultCode3 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                    if (aPIResultCode3.equals(APIResultCode.SUCCESS)) {
                        return null;
                    }
                    throw new UCPException(aPIResultCode3.getMessage());
                } catch (Exception e3) {
                    UCPLog.error(e3.getMessage());
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_UNKNOWN;
                    if (aPIResultCode4.equals(APIResultCode.SUCCESS)) {
                        return null;
                    }
                    throw new UCPException(aPIResultCode4.getMessage());
                }
            } catch (USPIllegarStateException e4) {
                UCPLog.error(e4.getMessage());
                APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                if (aPIResultCode5.equals(APIResultCode.SUCCESS)) {
                    return null;
                }
                throw new UCPException(aPIResultCode5.getMessage());
            } catch (USPIllegarUcpServiceException e5) {
                UCPLog.error(e5.getMessage());
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_INVALID_UCPSERVICE_STATE;
                if (aPIResultCode6.equals(APIResultCode.SUCCESS)) {
                    return null;
                }
                throw new UCPException(aPIResultCode6.getMessage());
            }
        } catch (Throwable th) {
            if (aPIResultCode.equals(APIResultCode.SUCCESS)) {
                throw th;
            }
            throw new UCPException(aPIResultCode.getMessage());
        }
    }

    public String ucpGetLine1Number() throws UCPException {
        UCPLog.info(">> ucpGetLine1Number()");
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    try {
                        String str = this.m_strStId;
                        if (str == null || str.length() <= 0) {
                            throw new USPIllegarStIdException("invalid stId");
                        }
                        a();
                        return this.m_oGlobalRepository.getCPService().IAuthTabCallback();
                    } catch (USPIllegarStIdException e) {
                        UCPLog.error(e.getMessage());
                        APIResultCode aPIResultCode2 = APIResultCode.ERROR_INVALID_STID;
                        if (aPIResultCode2.equals(APIResultCode.SUCCESS)) {
                            return null;
                        }
                        throw new UCPException(aPIResultCode2.getMessage());
                    }
                } catch (USPIllegarCompPermissionException e2) {
                    UCPLog.error(e2.getMessage());
                    APIResultCode aPIResultCode3 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                    if (aPIResultCode3.equals(APIResultCode.SUCCESS)) {
                        return null;
                    }
                    throw new UCPException(aPIResultCode3.getMessage());
                } catch (Exception e3) {
                    UCPLog.error(e3.getMessage());
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_UNKNOWN;
                    if (aPIResultCode4.equals(APIResultCode.SUCCESS)) {
                        return null;
                    }
                    throw new UCPException(aPIResultCode4.getMessage());
                }
            } catch (USPIllegarStateException e4) {
                UCPLog.error(e4.getMessage());
                APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                if (aPIResultCode5.equals(APIResultCode.SUCCESS)) {
                    return null;
                }
                throw new UCPException(aPIResultCode5.getMessage());
            } catch (USPIllegarUcpServiceException e5) {
                UCPLog.error(e5.getMessage());
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_INVALID_UCPSERVICE_STATE;
                if (aPIResultCode6.equals(APIResultCode.SUCCESS)) {
                    return null;
                }
                throw new UCPException(aPIResultCode6.getMessage());
            }
        } catch (Throwable th) {
            if (aPIResultCode.equals(APIResultCode.SUCCESS)) {
                throw th;
            }
            throw new UCPException(aPIResultCode.getMessage());
        }
    }

    public void reqEFRefresh() {
        UCPLog.info(">> reqEFRefresh()");
        UCPLog.debug("++ s_instance : [%s]", d);
        ApiCom.super_instance = d;
        super.reqEFRefresh(COMPONENT_ID);
        d = null;
    }

    private void a() throws Exception {
        UCPLog.debug(">> beforeExecute()");
        if (this.m_oGlobalRepository == null) {
            throw new USPIllegarStateException("component state is not connected !!");
        }
        if (getState() != 50) {
            throw new USPIllegarStateException("component state is not connected !!");
        }
        if (this.m_oGlobalRepository.getCPService() == null) {
            throw new USPIllegarUcpServiceException("UCPService is not available !!, UCPService is null");
        }
        this.m_oGlobalRepository.checkPermissionComponents(getCompID());
    }
}
