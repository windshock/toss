package com.skt.usp.ucp.auth;

import android.content.Context;
import android.os.Handler;
import com.skt.usp.AbstractUCP;
import com.skt.usp.tools.UCPLibraryFeatures;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.UCPException;
import com.skt.usp.tools.common.USPIllegarCompPermissionException;
import com.skt.usp.tools.common.USPIllegarStIdException;
import com.skt.usp.tools.common.USPIllegarStateException;
import com.skt.usp.tools.common.USPIllegarUcpApiException;
import com.skt.usp.tools.common.USPIllegarUcpServiceException;
import com.skt.usp.tools.dao.UCPResultData;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.tools.network.WorkerPoolExecutor;
import com.skt.usp.tools.network.usp.WorkerToUcpApiYn;
import com.skt.usp.utils.UCPLog;
import o.RecyclerViewItemAnimator;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCPAuth extends AbstractUCP implements AbstractWorker.OnWorkerListener {
    public static final String COMPONENT_ID = "UCP_AUTH";
    private static UCPAuth b;
    private static String c;

    private UCPAuth(Context context, String str) {
        super(context, str);
        UCPLog.info(">> UCPAuth()");
        UCPLog.debug("++ context : [%s]", context);
        UCPLog.debug("++ compId : [%s]", str);
    }

    public static UCPAuth getInstance(Context context) {
        UCPLog.info(">> getInstance()");
        UCPLog.debug("++ context : [%s]");
        if (b == null) {
            b = new UCPAuth(context, COMPONENT_ID);
        }
        return b;
    }

    @Override // com.skt.usp.AbstractUCP
    public void finalize() {
        UCPLog.info(">> finalize()");
        super.finalize();
    }

    @Override // com.skt.usp.tools.network.AbstractWorker.OnWorkerListener
    public void onTerminateFromWorker(final APITypeCode aPITypeCode, final APIResultCode aPIResultCode, final Object obj) {
        UCPLog.info(">> onTerminateFromWorker()");
        UCPLog.debug("++ api : [%s]", aPITypeCode);
        UCPLog.debug("++ result : [%s]", aPIResultCode);
        UCPLog.debug("++ resultData : [%s]", obj);
        if (this.m_onSEManagerConnection != null) {
            this.m_oHandler.post(new Runnable() { // from class: com.skt.usp.ucp.auth.UCPAuth.1
                @Override // java.lang.Runnable
                public void run() {
                    UCPResultData uCPResultData = UCPResultData.getInstance();
                    uCPResultData.setType(aPITypeCode);
                    uCPResultData.setResultCode(aPIResultCode);
                    uCPResultData.setData(obj);
                    UCPAuth.this.m_onSEManagerConnection.onResultAPI(uCPResultData);
                }
            });
        }
    }

    public void ucpApiAvailableYn() {
        Handler handler;
        Runnable runnable;
        UCPLog.info(">> ucpApiAvailableYn()");
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
                            WorkerPoolExecutor.getInstance().execute(new WorkerToUcpApiYn(this.m_oContext, this.m_strStId, null, this.m_oGlobalRepository.getAppInfo(COMPONENT_ID).getPkgName(), COMPONENT_ID, c, this));
                        } catch (Exception e) {
                            UCPLog.error(e.getMessage());
                            APIResultCode aPIResultCode2 = APIResultCode.ERROR_UNKNOWN;
                            if (APIResultCode.SUCCESS.equals(aPIResultCode2)) {
                                return;
                            }
                            final UCPResultData uCPResultData = UCPResultData.getInstance(APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN, aPIResultCode2, Boolean.FALSE);
                            handler = this.m_oHandler;
                            runnable = new Runnable() { // from class: com.skt.usp.ucp.auth.UCPAuth.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    UCPAuth.this.m_onSEManagerConnection.onResultAPI(uCPResultData);
                                }
                            };
                            handler.post(runnable);
                        }
                    } catch (USPIllegarUcpApiException e2) {
                        UCPLog.error(e2.getMessage());
                        APIResultCode aPIResultCode3 = APIResultCode.ERROR_UNSUPPORTED_CARRIER_API_STATE;
                        if (APIResultCode.SUCCESS.equals(aPIResultCode3)) {
                            return;
                        }
                        final UCPResultData uCPResultData2 = UCPResultData.getInstance(APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN, aPIResultCode3, Boolean.FALSE);
                        handler = this.m_oHandler;
                        runnable = new Runnable() { // from class: com.skt.usp.ucp.auth.UCPAuth.2
                            @Override // java.lang.Runnable
                            public void run() {
                                UCPAuth.this.m_onSEManagerConnection.onResultAPI(uCPResultData2);
                            }
                        };
                        handler.post(runnable);
                    }
                } catch (USPIllegarStIdException e3) {
                    UCPLog.error(e3.getMessage());
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_INVALID_STID;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode4)) {
                        return;
                    }
                    final UCPResultData uCPResultData3 = UCPResultData.getInstance(APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN, aPIResultCode4, Boolean.FALSE);
                    handler = this.m_oHandler;
                    runnable = new Runnable() { // from class: com.skt.usp.ucp.auth.UCPAuth.2
                        @Override // java.lang.Runnable
                        public void run() {
                            UCPAuth.this.m_onSEManagerConnection.onResultAPI(uCPResultData3);
                        }
                    };
                    handler.post(runnable);
                } catch (USPIllegarStateException e4) {
                    UCPLog.error(e4.getMessage());
                    APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode5)) {
                        return;
                    }
                    final UCPResultData uCPResultData4 = UCPResultData.getInstance(APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN, aPIResultCode5, Boolean.FALSE);
                    handler = this.m_oHandler;
                    runnable = new Runnable() { // from class: com.skt.usp.ucp.auth.UCPAuth.2
                        @Override // java.lang.Runnable
                        public void run() {
                            UCPAuth.this.m_onSEManagerConnection.onResultAPI(uCPResultData4);
                        }
                    };
                    handler.post(runnable);
                }
            } catch (USPIllegarCompPermissionException e5) {
                UCPLog.error(e5.getMessage());
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                if (APIResultCode.SUCCESS.equals(aPIResultCode6)) {
                    return;
                }
                final UCPResultData uCPResultData5 = UCPResultData.getInstance(APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN, aPIResultCode6, Boolean.FALSE);
                handler = this.m_oHandler;
                runnable = new Runnable() { // from class: com.skt.usp.ucp.auth.UCPAuth.2
                    @Override // java.lang.Runnable
                    public void run() {
                        UCPAuth.this.m_onSEManagerConnection.onResultAPI(uCPResultData5);
                    }
                };
                handler.post(runnable);
            } catch (USPIllegarUcpServiceException e6) {
                UCPLog.error(e6.getMessage());
                APIResultCode aPIResultCode7 = APIResultCode.ERROR_INVALID_UCPSERVICE_STATE;
                if (APIResultCode.SUCCESS.equals(aPIResultCode7)) {
                    return;
                }
                final UCPResultData uCPResultData6 = UCPResultData.getInstance(APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN, aPIResultCode7, Boolean.FALSE);
                handler = this.m_oHandler;
                runnable = new Runnable() { // from class: com.skt.usp.ucp.auth.UCPAuth.2
                    @Override // java.lang.Runnable
                    public void run() {
                        UCPAuth.this.m_onSEManagerConnection.onResultAPI(uCPResultData6);
                    }
                };
                handler.post(runnable);
            }
        } catch (Throwable th) {
            if (!APIResultCode.SUCCESS.equals(aPIResultCode)) {
                final UCPResultData uCPResultData7 = UCPResultData.getInstance(APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN, aPIResultCode, Boolean.FALSE);
                this.m_oHandler.post(new Runnable() { // from class: com.skt.usp.ucp.auth.UCPAuth.2
                    @Override // java.lang.Runnable
                    public void run() {
                        UCPAuth.this.m_onSEManagerConnection.onResultAPI(uCPResultData7);
                    }
                });
            }
            throw th;
        }
    }

    public boolean hasUcpYn() throws UCPException {
        boolean zOnExtraCallbackWithResult;
        Exception e;
        USPIllegarUcpServiceException e2;
        USPIllegarStateException e3;
        USPIllegarStIdException e4;
        USPIllegarCompPermissionException e5;
        UCPLog.info(">> hasUcpYn()");
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                String str = this.m_strStId;
                if (str == null || str.length() <= 0) {
                    throw new USPIllegarStIdException("invalid stId");
                }
                a();
                RecyclerViewItemAnimator cPService = this.m_oGlobalRepository.getCPService();
                if (cPService != null) {
                    UCPLog.debug("++ getUCPService is not null");
                    int ucpSubscriptionId = UCPLibraryFeatures.getUcpSubscriptionId();
                    if (ucpSubscriptionId > 0) {
                        zOnExtraCallbackWithResult = cPService.onNavigationEvent(ucpSubscriptionId);
                        try {
                            UCPLog.debug("++ hasSeioCarrierPrivileges_subId hasUcpYn" + zOnExtraCallbackWithResult);
                        } catch (USPIllegarCompPermissionException e6) {
                            e5 = e6;
                            UCPLog.error(e5.getMessage());
                            APIResultCode aPIResultCode2 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                            if (!aPIResultCode2.equals(APIResultCode.SUCCESS)) {
                                throw new UCPException(aPIResultCode2.getMessage());
                            }
                            return zOnExtraCallbackWithResult;
                        } catch (USPIllegarStIdException e7) {
                            e4 = e7;
                            UCPLog.error(e4.getMessage());
                            APIResultCode aPIResultCode3 = APIResultCode.ERROR_INVALID_STID;
                            if (!aPIResultCode3.equals(APIResultCode.SUCCESS)) {
                                throw new UCPException(aPIResultCode3.getMessage());
                            }
                            return zOnExtraCallbackWithResult;
                        } catch (USPIllegarStateException e8) {
                            e3 = e8;
                            UCPLog.error(e3.getMessage());
                            APIResultCode aPIResultCode4 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                            if (!aPIResultCode4.equals(APIResultCode.SUCCESS)) {
                                throw new UCPException(aPIResultCode4.getMessage());
                            }
                            return zOnExtraCallbackWithResult;
                        } catch (USPIllegarUcpServiceException e9) {
                            e2 = e9;
                            UCPLog.error(e2.getMessage());
                            APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_UCPSERVICE_STATE;
                            if (!aPIResultCode5.equals(APIResultCode.SUCCESS)) {
                                throw new UCPException(aPIResultCode5.getMessage());
                            }
                            return zOnExtraCallbackWithResult;
                        } catch (Exception e10) {
                            e = e10;
                            UCPLog.error(e.getMessage());
                            APIResultCode aPIResultCode6 = APIResultCode.ERROR_UNKNOWN;
                            if (!aPIResultCode6.equals(APIResultCode.SUCCESS)) {
                                throw new UCPException(aPIResultCode6.getMessage());
                            }
                            return zOnExtraCallbackWithResult;
                        }
                    } else {
                        zOnExtraCallbackWithResult = cPService.onExtraCallbackWithResult();
                    }
                } else {
                    zOnExtraCallbackWithResult = false;
                }
                UCPLog.info(">> hasUcpYn [%s] ", Boolean.valueOf(zOnExtraCallbackWithResult));
                return zOnExtraCallbackWithResult;
            } catch (Throwable th) {
                if (aPIResultCode.equals(APIResultCode.SUCCESS)) {
                    throw th;
                }
                throw new UCPException(aPIResultCode.getMessage());
            }
        } catch (USPIllegarCompPermissionException e11) {
            zOnExtraCallbackWithResult = false;
            e5 = e11;
        } catch (USPIllegarStIdException e12) {
            zOnExtraCallbackWithResult = false;
            e4 = e12;
        } catch (USPIllegarStateException e13) {
            zOnExtraCallbackWithResult = false;
            e3 = e13;
        } catch (USPIllegarUcpServiceException e14) {
            zOnExtraCallbackWithResult = false;
            e2 = e14;
        } catch (Exception e15) {
            zOnExtraCallbackWithResult = false;
            e = e15;
        }
    }

    private void a() throws Exception {
        UCPLog.debug(">> beforeExecute()");
        if (this.m_oGlobalRepository == null) {
            throw new USPIllegarStateException("component state is not connected !!, m_oGlobalRepository is null");
        }
        if (getState() != 50) {
            throw new USPIllegarStateException("component state is not connected !!, getState is " + getState());
        }
        this.m_oGlobalRepository.checkPermissionComponents(getCompID());
    }
}
