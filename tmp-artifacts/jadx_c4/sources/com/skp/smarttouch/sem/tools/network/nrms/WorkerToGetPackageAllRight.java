package com.skp.smarttouch.sem.tools.network.nrms;

import com.google.gson.Gson;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.dao.protocol.nrms.HeaderOfNrms;
import com.skp.smarttouch.sem.tools.dao.protocol.nrms.IGetPackageAllRight;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import com.skp.smarttouch.sem.tools.network.Network;
import o.xkzzb;
import o.zb2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class WorkerToGetPackageAllRight extends AbstractWorker {
    private String a;
    private String b;
    private String c;
    private String d;

    public WorkerToGetPackageAllRight(String str, String str2, String str3, String str4, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(onWorkerListener);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        xkzzb.onExtraCallback(new Object[]{">> WorkerToGetPackageAllRight()"});
        xkzzb.onExtraCallback(new Object[]{"+ stId : [%s]", str});
        xkzzb.onExtraCallback(new Object[]{"+ pkgName : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"+ compId : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"+ mdn : [%s]", str4});
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public String getNopId() {
        xkzzb.onExtraCallback(new Object[]{">> getNopId()"});
        return this.a;
    }

    public String getComponentId() {
        xkzzb.onExtraCallback(new Object[]{">> getComponentId()"});
        return this.c;
    }

    @Override // java.lang.Runnable
    public void run() {
        xkzzb.onExtraCallback(new Object[]{">> run()"});
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        IGetPackageAllRight.Request request = new IGetPackageAllRight.Request();
        HeaderOfNrms headerOfNrms = new HeaderOfNrms();
        IGetPackageAllRight.ReqBodyOfIGetPackageAllRight reqBodyOfIGetPackageAllRight = new IGetPackageAllRight.ReqBodyOfIGetPackageAllRight();
        try {
            try {
                Gson gson = new Gson();
                if (zb2.onExtraCallback()) {
                    headerOfNrms.setClientType("APP_E");
                } else {
                    headerOfNrms.setClientType("APP_D");
                }
                headerOfNrms.setClientId(this.a);
                request.setHeader(headerOfNrms);
                reqBodyOfIGetPackageAllRight.setStId(this.a);
                reqBodyOfIGetPackageAllRight.setPkgName(this.b);
                reqBodyOfIGetPackageAllRight.setMdn(this.d);
                request.setBody(reqBodyOfIGetPackageAllRight);
                String json = gson.toJson(request);
                xkzzb.onExtraCallback(new Object[]{"++ jsonOfRequest : [%s]", json});
                String serverMessage = Network.getServerMessage(request.generateUrl(), json);
                xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
                if (serverMessage == null) {
                    throw new Exception("***** You do not have nrms permissions [ jsonOfResponse is null ]");
                }
                IGetPackageAllRight.Response response = (IGetPackageAllRight.Response) gson.fromJson(serverMessage, IGetPackageAllRight.Response.class);
                if (response == null) {
                    throw new Exception("***** You do not have nrms permissions [ response is null ]");
                }
                HeaderOfNrms header = response.getHeader();
                IGetPackageAllRight.ResBodyOfIGetPackageAllRight body = response.getBody();
                if (header == null) {
                    throw new Exception("***** You do not have nrms permissions [ header is null ]");
                }
                if (!"0000".equals(header.getResultCode())) {
                    throw new Exception("***** You do not have nrms permissions [ result_code is " + header.getResultCode() + "] Msg : " + header.getResultMsg());
                }
                if (body == null) {
                    throw new Exception("***** You do not have nrms permissions [ body is null ]");
                }
                AbstractWorker.OnWorkerListener onWorkerListener = this.m_onListener;
                if (onWorkerListener != null) {
                    onWorkerListener.onTerminateFromWorker(APITypeCode.NRMS_GET_PACKAGE_ALL_RIGHT, aPIResultCode, body);
                }
            } catch (Exception e) {
                xkzzb.onNavigationEvent(e);
                APIResultCode aPIResultCode2 = APIResultCode.ERROR_NRMS_INTERACTION_FAIL;
                AbstractWorker.OnWorkerListener onWorkerListener2 = this.m_onListener;
                if (onWorkerListener2 != null) {
                    onWorkerListener2.onTerminateFromWorker(APITypeCode.NRMS_GET_PACKAGE_ALL_RIGHT, aPIResultCode2, null);
                }
            }
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener3 = this.m_onListener;
            if (onWorkerListener3 != null) {
                onWorkerListener3.onTerminateFromWorker(APITypeCode.NRMS_GET_PACKAGE_ALL_RIGHT, aPIResultCode, null);
            }
            throw th;
        }
    }
}
