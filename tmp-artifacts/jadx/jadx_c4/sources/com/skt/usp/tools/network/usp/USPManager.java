package com.skt.usp.tools.network.usp;

import android.content.Context;
import com.google.gson.Gson;
import com.skt.usp.tools.common.USPProcException;
import com.skt.usp.tools.dao.protocol.usp.AbstractUspResponse;
import com.skt.usp.tools.dao.protocol.usp.HeaderOfUsp;
import com.skt.usp.tools.dao.protocol.usp.device.IAvailable;
import com.skt.usp.tools.dao.protocol.usp.device.ISKTUser;
import com.skt.usp.tools.dao.protocol.usp.device.IUsimAvailable;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.tools.network.Network;
import com.skt.usp.tools.network.WorkerPoolExecutor;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class USPManager {
    private static USPManager a;
    private static Context b;
    private String c = "N";

    private USPManager() {
        UCPLog.info(">> NetworkManager()");
    }

    public static USPManager getInstance(Context context) {
        UCPLog.info(">> getInstance()" + context);
        b = context;
        if (a == null) {
            a = new USPManager();
        }
        return a;
    }

    public void setStagingYn(String str) {
        UCPLog.info(">> setStagingYn()");
        UCPLog.debug("++ yn : [%s]", str);
        this.c = str;
    }

    public String getStagingYn() {
        UCPLog.info(">> getStagingYn()");
        UCPLog.debug("-- returned : [%s]", this.c);
        return this.c;
    }

    public IAvailable.Response authNfcYn(String str, String str2, String str3, String str4) throws Exception {
        IAvailable.Response response;
        UCPLog.info(">> authNfcYn()");
        UCPLog.debug("++ mdn : [%s]", str4);
        UCPLog.debug("++ pkgName : [%s]", str2);
        UCPLog.debug("++ compId : [%s]", str3);
        Gson gson = new Gson();
        IAvailable.Request request = new IAvailable.Request();
        IAvailable.BodyOfIAvailable bodyOfIAvailable = new IAvailable.BodyOfIAvailable();
        bodyOfIAvailable.setMdn(str4);
        request.setBody(bodyOfIAvailable);
        request.setUspHeader(b, str2, str3);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        UCPLog.debug("++ jsonOfResponse : [%s]", serverMessage);
        try {
            response = (IAvailable.Response) gson.fromJson(serverMessage, IAvailable.Response.class);
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new USPProcException("body is empty");
    }

    public IUsimAvailable.Response checkCarrierApiUsim(String str, String str2, String str3, String str4, String str5) throws Exception {
        IUsimAvailable.Response response;
        UCPLog.info(">> checkCarrierApi()");
        UCPLog.debug("++ mdn : [%s]", str4);
        UCPLog.debug("++ pkgName : [%s]", str2);
        UCPLog.debug("++ compId : [%s]", str3);
        Gson gson = new Gson();
        IUsimAvailable.Request request = new IUsimAvailable.Request();
        IUsimAvailable.BodyOfIUsimAvailable bodyOfIUsimAvailable = new IUsimAvailable.BodyOfIUsimAvailable();
        bodyOfIUsimAvailable.setMdn(str4);
        bodyOfIUsimAvailable.setIccid(str5);
        request.setBody(bodyOfIUsimAvailable);
        request.setUspHeader(b, str2, str3);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        UCPLog.debug("++ jsonOfResponse : [%s]", serverMessage);
        if (serverMessage.contains("server connection error")) {
            throw new USPProcException("server connection error");
        }
        try {
            response = (IUsimAvailable.Response) gson.fromJson(serverMessage, IUsimAvailable.Response.class);
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new USPProcException("body is empty");
    }

    public ISKTUser.Response getSktUserYn(String str, String str2, String str3, String str4, String str5) throws Exception {
        ISKTUser.Response response;
        UCPLog.info(">> getSktUserYn()");
        UCPLog.debug("++ mdn : [%s]", str4);
        UCPLog.debug("++ jumin : [%s]", str5);
        UCPLog.debug("++ pkgName : [%s]", str2);
        UCPLog.debug("++ compId : [%s]", str3);
        Gson gson = new Gson();
        ISKTUser.Request request = new ISKTUser.Request();
        ISKTUser.BodyOfISKTUser bodyOfISKTUser = new ISKTUser.BodyOfISKTUser();
        bodyOfISKTUser.setMdn(str4);
        bodyOfISKTUser.setJumin(str5);
        request.setBody(bodyOfISKTUser);
        request.setUspHeader(b, str2, str3);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        UCPLog.debug("++ jsonOfResponse : [%s]", serverMessage);
        try {
            response = (ISKTUser.Response) gson.fromJson(serverMessage, ISKTUser.Response.class);
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new USPProcException("body is empty");
    }

    public void setAccessRuleAram(Context context, String str, AbstractWorker.OnWorkerListener onWorkerListener) throws Exception {
        UCPLog.info(">> setAccessRuleAram()");
        UCPLog.debug("++ pkgName : [%s]", str);
        WorkerPoolExecutor.getInstance().execute(new WorkerToSetAccessRuleAram(context, str, onWorkerListener, Boolean.FALSE));
    }

    private void a(AbstractUspResponse abstractUspResponse) throws Exception {
        UCPLog.info(">> verifyResponse()");
        UCPLog.debug("++ response : [%s]", abstractUspResponse);
        if (abstractUspResponse == null) {
            throw new USPProcException("response is empty");
        }
        HeaderOfUsp header = abstractUspResponse.getHeader();
        if (header == null) {
            throw new USPProcException("response header is empty");
        }
        if (!"000".equalsIgnoreCase(header.getResultCode())) {
            throw new USPProcException("header.result_code is not 000", header.getResultMsg());
        }
    }
}
