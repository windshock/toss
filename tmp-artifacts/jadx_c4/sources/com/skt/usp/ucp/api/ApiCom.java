package com.skt.usp.ucp.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.skt.usp.AbstractUCP;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.USPIllegarCompPermissionException;
import com.skt.usp.tools.common.USPIllegarStIdException;
import com.skt.usp.tools.common.USPIllegarStateException;
import com.skt.usp.tools.common.USPIllegarUcpServiceException;
import com.skt.usp.tools.dao.UCPResultData;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.tools.network.WorkerPoolExecutor;
import com.skt.usp.tools.network.usp.WorkerToReqEFRefresh;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ApiCom extends AbstractUCP implements AbstractWorker.OnWorkerListener {
    public static ApiCom super_instance;
    BroadcastReceiver b;
    public Boolean connChangeYn;

    protected ApiCom(Context context, String str) {
        super(context, str);
        this.connChangeYn = Boolean.FALSE;
        UCPLog.info(">> ApiCom()");
        UCPLog.debug("++ context : [%s]", context);
        UCPLog.debug("++ compId : [%s]", str);
    }

    public static ApiCom getInstance(Context context, String str) {
        UCPLog.debug(">> getInstance()");
        UCPLog.debug("++ context : [%s]");
        if (super_instance == null) {
            super_instance = new ApiCom(context, str);
        }
        return super_instance;
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
        if (APITypeCode.UCP_API_REQ_EFREFRESH.equals(aPITypeCode) && APIResultCode.SUCCESS.equals(aPIResultCode)) {
            this.connChangeYn = Boolean.TRUE;
        }
        if (this.m_onSEManagerConnection != null) {
            this.m_oHandler.post(new Runnable() { // from class: com.skt.usp.ucp.api.ApiCom.1
                @Override // java.lang.Runnable
                public void run() {
                    UCPResultData uCPResultData = UCPResultData.getInstance();
                    uCPResultData.setType(aPITypeCode);
                    uCPResultData.setResultCode(aPIResultCode);
                    uCPResultData.setData(obj);
                    ApiCom.this.m_onSEManagerConnection.onResultAPI(uCPResultData);
                }
            });
        }
    }

    protected void reqEFRefresh(String str) {
        Handler handler;
        Runnable runnable;
        UCPLog.info(">> reqEFRefresh()");
        UCPLog.debug(">> reqEFRefresh reqCompId : [%s]", str);
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    try {
                        String str2 = this.m_strStId;
                        if (str2 == null || str2.length() <= 0) {
                            throw new USPIllegarStIdException("invalid stId");
                        }
                        a();
                        onReceiveConnChange();
                        WorkerPoolExecutor.getInstance().execute(new WorkerToReqEFRefresh(this.m_oContext, this.m_oGlobalRepository.getAppInfo(str).getPkgName(), this));
                    } catch (USPIllegarUcpServiceException e) {
                        UCPLog.error(e.getMessage());
                        APIResultCode aPIResultCode2 = APIResultCode.ERROR_INVALID_UCPSERVICE_STATE;
                        if (APIResultCode.SUCCESS.equals(aPIResultCode2)) {
                            return;
                        }
                        final UCPResultData uCPResultData = UCPResultData.getInstance(APITypeCode.UCP_API_REQ_EFREFRESH, aPIResultCode2, Boolean.FALSE);
                        handler = this.m_oHandler;
                        runnable = new Runnable() { // from class: com.skt.usp.ucp.api.ApiCom.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ApiCom.this.m_onSEManagerConnection.onResultAPI(uCPResultData);
                            }
                        };
                        handler.post(runnable);
                    }
                } catch (USPIllegarCompPermissionException e2) {
                    UCPLog.error(e2.getMessage());
                    APIResultCode aPIResultCode3 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode3)) {
                        return;
                    }
                    final UCPResultData uCPResultData2 = UCPResultData.getInstance(APITypeCode.UCP_API_REQ_EFREFRESH, aPIResultCode3, Boolean.FALSE);
                    handler = this.m_oHandler;
                    runnable = new Runnable() { // from class: com.skt.usp.ucp.api.ApiCom.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ApiCom.this.m_onSEManagerConnection.onResultAPI(uCPResultData2);
                        }
                    };
                    handler.post(runnable);
                } catch (USPIllegarStateException e3) {
                    UCPLog.error(e3.getMessage());
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                    aPIResultCode4.setMessage(e3.getMessage());
                    if (APIResultCode.SUCCESS.equals(aPIResultCode4)) {
                        return;
                    }
                    final UCPResultData uCPResultData3 = UCPResultData.getInstance(APITypeCode.UCP_API_REQ_EFREFRESH, aPIResultCode4, Boolean.FALSE);
                    handler = this.m_oHandler;
                    runnable = new Runnable() { // from class: com.skt.usp.ucp.api.ApiCom.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ApiCom.this.m_onSEManagerConnection.onResultAPI(uCPResultData3);
                        }
                    };
                    handler.post(runnable);
                }
            } catch (USPIllegarStIdException e4) {
                UCPLog.error(e4.getMessage());
                APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_STID;
                if (APIResultCode.SUCCESS.equals(aPIResultCode5)) {
                    return;
                }
                final UCPResultData uCPResultData4 = UCPResultData.getInstance(APITypeCode.UCP_API_REQ_EFREFRESH, aPIResultCode5, Boolean.FALSE);
                handler = this.m_oHandler;
                runnable = new Runnable() { // from class: com.skt.usp.ucp.api.ApiCom.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ApiCom.this.m_onSEManagerConnection.onResultAPI(uCPResultData4);
                    }
                };
                handler.post(runnable);
            } catch (Exception e5) {
                UCPLog.error(e5.getMessage());
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_UNKNOWN;
                if (APIResultCode.SUCCESS.equals(aPIResultCode6)) {
                    return;
                }
                final UCPResultData uCPResultData5 = UCPResultData.getInstance(APITypeCode.UCP_API_REQ_EFREFRESH, aPIResultCode6, Boolean.FALSE);
                handler = this.m_oHandler;
                runnable = new Runnable() { // from class: com.skt.usp.ucp.api.ApiCom.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ApiCom.this.m_onSEManagerConnection.onResultAPI(uCPResultData5);
                    }
                };
                handler.post(runnable);
            }
        } catch (Throwable th) {
            if (!APIResultCode.SUCCESS.equals(aPIResultCode)) {
                final UCPResultData uCPResultData6 = UCPResultData.getInstance(APITypeCode.UCP_API_REQ_EFREFRESH, aPIResultCode, Boolean.FALSE);
                this.m_oHandler.post(new Runnable() { // from class: com.skt.usp.ucp.api.ApiCom.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ApiCom.this.m_onSEManagerConnection.onResultAPI(uCPResultData6);
                    }
                });
            }
            throw th;
        }
    }

    private void a() throws Exception {
        UCPLog.debug(">> beforeExecuteReqEfRefresh()");
        if (this.m_oGlobalRepository == null) {
            throw new USPIllegarStateException("component state is not connected !!");
        }
        if (getState() != 80) {
            throw new USPIllegarStateException("component state is not 80 !!");
        }
        if (super_instance == null) {
            throw new USPIllegarStateException("UCPService is not available !! , super_instance is null");
        }
        if (this.m_oGlobalRepository.getCPService() == null) {
            throw new USPIllegarUcpServiceException("UCPService is not available !!");
        }
        this.m_oGlobalRepository.checkPermissionComponents(getCompID());
    }

    public void onReceiveConnChange() {
        UCPLog.info(">> onReceiveConnChange() ");
        UCPLog.debug("++ connChangeYn :[%s]", this.connChangeYn);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.skt.usp.ucp.api.ApiCom.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                UCPLog.debug("++ connChangeYn :[%s], actionName : [%s]", ApiCom.this.connChangeYn, action);
                if (action.equals("android.intent.action.SIM_STATE_CHANGED")) {
                    String string = intent.getExtras().getString("ss");
                    if (ApiCom.this.connChangeYn.booleanValue() && "LOADED".equals(string)) {
                        UCPLog.debug(">> BroadcastReceiver connectivity change [%s] ", ApiCom.this.connChangeYn);
                        ApiCom apiCom = ApiCom.this;
                        apiCom.connChangeYn = Boolean.FALSE;
                        apiCom.m_oContext.unregisterReceiver(ApiCom.this.b);
                        if (ApiCom.this.m_oGlobalRepository != null) {
                            ApiCom.this.m_oGlobalRepository.setIsUsimRefresh(false);
                        }
                        UCPLog.debug(">> s_instance() " + ApiCom.super_instance);
                        ApiCom.super_instance.finalize();
                    }
                }
            }
        };
        this.b = broadcastReceiver;
        this.m_oContext.registerReceiver(broadcastReceiver, intentFilter);
    }
}
