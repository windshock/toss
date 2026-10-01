package com.skt.usp.tools.network.urms;

import com.google.gson.Gson;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.dao.protocol.urms.HeaderOfUrms;
import com.skt.usp.tools.dao.protocol.urms.IGetPackageAllRight;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.tools.network.Network;
import com.skt.usp.utils.Telephone;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class WorkerToGetPackageAllRight extends AbstractWorker {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public WorkerToGetPackageAllRight(String str, String str2, String str3, String str4, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(onWorkerListener);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        UCPLog.info(">> WorkerToGetPackageAllRight()");
        UCPLog.debug("+ stId : [%s]", str);
        UCPLog.debug("+ pkgName : [%s]", str2);
        UCPLog.debug("+ compId : [%s]", str3);
        UCPLog.debug("+ mdn : [%s]", str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public WorkerToGetPackageAllRight(String str, String str2, String str3, String str4, AbstractWorker.OnWorkerListener onWorkerListener, String str5) {
        super(onWorkerListener);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        UCPLog.info(">> WorkerToGetPackageAllRight()");
        UCPLog.debug("+ stId : [%s]", str);
        UCPLog.debug("+ pkgName : [%s]", str2);
        UCPLog.debug("+ compId : [%s]", str3);
        UCPLog.debug("+ mdn : [%s]", str4);
        UCPLog.debug("+ getPkgAll : [%s]", str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public String getNopId() {
        UCPLog.info(">> getNopId()");
        return this.a;
    }

    public String getComponentId() {
        UCPLog.info(">> getComponentId()");
        return this.c;
    }

    @Override // java.lang.Runnable
    public void run() {
        UCPLog.info(">> run()");
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        IGetPackageAllRight.Request request = new IGetPackageAllRight.Request();
        HeaderOfUrms headerOfUrms = new HeaderOfUrms();
        IGetPackageAllRight.ReqBodyOfIGetPackageAllRight reqBodyOfIGetPackageAllRight = new IGetPackageAllRight.ReqBodyOfIGetPackageAllRight();
        try {
            try {
                Gson gson = new Gson();
                if (Telephone.isEmulator()) {
                    headerOfUrms.setClientType("APP_E");
                } else {
                    headerOfUrms.setClientType("APP_D");
                }
                headerOfUrms.setClientId(this.a);
                request.setHeader(headerOfUrms);
                reqBodyOfIGetPackageAllRight.setStId(this.a);
                reqBodyOfIGetPackageAllRight.setPkgName(this.b);
                reqBodyOfIGetPackageAllRight.setMdn(this.d);
                request.setBody(reqBodyOfIGetPackageAllRight);
                String json = gson.toJson(request);
                UCPLog.debug("++ jsonOfRequest : [%s]", json);
                String serverMessage = this.e;
                if (serverMessage == null) {
                    serverMessage = Network.getServerMessage(request.generateUrl(), json);
                    UCPLog.debug("++ jsonOfResponse : [%s]", serverMessage);
                    if (serverMessage == null) {
                        throw new Exception("You do not have urms permissions [ jsonOfResponse is null ]");
                    }
                }
                IGetPackageAllRight.Response response = (IGetPackageAllRight.Response) gson.fromJson(serverMessage, IGetPackageAllRight.Response.class);
                if (response == null) {
                    throw new Exception("You do not have urms permissions [ response is null ]");
                }
                HeaderOfUrms header = response.getHeader();
                IGetPackageAllRight.ResBodyOfIGetPackageAllRight body = response.getBody();
                if (header == null) {
                    throw new Exception("You do not have urms permissions [ header is null ]");
                }
                if (!"0000".equals(header.getResultCode())) {
                    throw new Exception("You do not have urms permissions [ result_code is " + header.getResultCode() + "] Msg : " + header.getResultMsg());
                }
                if (body == null) {
                    throw new Exception("You do not have urms permissions [ body is null ]");
                }
                AbstractWorker.OnWorkerListener onWorkerListener = this.m_onListener;
                if (onWorkerListener != null) {
                    onWorkerListener.onTerminateFromWorker(APITypeCode.URMS_GET_PACKAGE_ALL_RIGHT, aPIResultCode, body);
                }
            } catch (Exception e) {
                UCPLog.error(e.getMessage());
                APIResultCode aPIResultCode2 = APIResultCode.ERROR_URMS_INTERACTION_FAIL;
                AbstractWorker.OnWorkerListener onWorkerListener2 = this.m_onListener;
                if (onWorkerListener2 != null) {
                    onWorkerListener2.onTerminateFromWorker(APITypeCode.URMS_GET_PACKAGE_ALL_RIGHT, aPIResultCode2, null);
                }
            }
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener3 = this.m_onListener;
            if (onWorkerListener3 != null) {
                onWorkerListener3.onTerminateFromWorker(APITypeCode.URMS_GET_PACKAGE_ALL_RIGHT, aPIResultCode, null);
            }
            throw th;
        }
    }
}
