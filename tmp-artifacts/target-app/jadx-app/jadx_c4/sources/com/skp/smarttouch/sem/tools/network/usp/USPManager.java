package com.skp.smarttouch.sem.tools.network.usp;

import android.content.Context;
import com.google.gson.Gson;
import com.skp.smarttouch.sem.tools.common.STUspProcException;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspResponse;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.HeaderOfUsp;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.device.IAvailable;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.device.ISKTUser;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.device.IUsimAvailable;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.profile.IUsimInfo;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IAppletInfo;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IApplets;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IApplets$Response;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IPerso;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IStatus;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IVersion;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import com.skp.smarttouch.sem.tools.network.Network;
import com.skp.smarttouch.sem.tools.network.WorkerPoolExecutor;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class USPManager {
    private static USPManager a;
    private static Context b;
    private String c = "N";

    private USPManager() {
        xkzzb.onExtraCallback(new Object[]{">> NetworkManager()"});
    }

    public static USPManager getInstance(Context context) {
        xkzzb.onExtraCallback(new Object[]{">> getInstance()"});
        b = context;
        if (a == null) {
            a = new USPManager();
        }
        return a;
    }

    public void setStagingYn(String str) {
        xkzzb.onExtraCallback(new Object[]{">> setStagingYn()"});
        xkzzb.onExtraCallback(new Object[]{"++ yn : [%s]", str});
        this.c = str;
    }

    public String getStagingYn() {
        xkzzb.onExtraCallback(new Object[]{">> getStagingYn()"});
        xkzzb.onExtraCallback(new Object[]{"-- returned : [%s]", this.c});
        return this.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IUsimInfo.Response getUsimInfo(String str, String str2, String str3, String str4) throws Exception {
        IUsimInfo.Response response;
        xkzzb.onExtraCallback(new Object[]{">> getUsimInfo()"});
        xkzzb.onExtraCallback(new Object[]{"++ stId : [%s]", str});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ cpf_id : [%s]", str4});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str2});
        Gson gson = new Gson();
        IUsimInfo.Request request = new IUsimInfo.Request();
        IUsimInfo.BodyOfIUsimInfo bodyOfIUsimInfo = new IUsimInfo.BodyOfIUsimInfo();
        bodyOfIUsimInfo.setCpf_id(str4);
        request.setBody(bodyOfIUsimInfo);
        request.setUspHeader(b, str2, str3);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (IUsimInfo.Response) gson.fromJson(serverMessage, IUsimInfo.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IApplets$Response getAppletListByAll(String str, String str2, String str3, String str4) throws Exception {
        IApplets$Response iApplets$Response;
        xkzzb.onExtraCallback(new Object[]{">> getAppletListByAll()"});
        xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str4});
        Gson gson = new Gson();
        IApplets.Request request = new IApplets.Request();
        IApplets.BodyOfIApplets bodyOfIApplets = new IApplets.BodyOfIApplets();
        bodyOfIApplets.setIccid(str2);
        request.setBody(bodyOfIApplets);
        request.setUspHeader(b, str3, str4);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            iApplets$Response = (IApplets$Response) gson.fromJson(serverMessage, IApplets$Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            iApplets$Response = null;
        }
        a(iApplets$Response);
        if (iApplets$Response.getBody() != null) {
            return iApplets$Response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IApplets$Response requestTransportationList(String str, String str2, String str3, String str4) throws Exception {
        IApplets$Response iApplets$Response;
        xkzzb.onExtraCallback(new Object[]{">> requestTransportationList()"});
        xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str4});
        Gson gson = new Gson();
        IApplets.Request request = new IApplets.Request();
        IApplets.BodyOfIApplets bodyOfIApplets = new IApplets.BodyOfIApplets();
        bodyOfIApplets.setIccid(str2);
        bodyOfIApplets.setAppletType("TRANS");
        request.setBody(bodyOfIApplets);
        request.setUspHeader(b, str3, str4);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            iApplets$Response = (IApplets$Response) gson.fromJson(serverMessage, IApplets$Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            iApplets$Response = null;
        }
        a(iApplets$Response);
        if (iApplets$Response.getBody() != null) {
            return iApplets$Response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IApplets$Response getCreditCardList(String str, String str2, String str3, String str4) throws Exception {
        IApplets$Response iApplets$Response;
        xkzzb.onExtraCallback(new Object[]{">> getCreditCardList()"});
        xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str4});
        Gson gson = new Gson();
        IApplets.Request request = new IApplets.Request();
        IApplets.BodyOfIApplets bodyOfIApplets = new IApplets.BodyOfIApplets();
        bodyOfIApplets.setIccid(str2);
        bodyOfIApplets.setAppletType("MCARD");
        request.setBody(bodyOfIApplets);
        request.setUspHeader(b, str3, str4);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            iApplets$Response = (IApplets$Response) gson.fromJson(serverMessage, IApplets$Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            iApplets$Response = null;
        }
        a(iApplets$Response);
        if (iApplets$Response.getBody() != null) {
            return iApplets$Response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IAppletInfo.Response getAppletInfo(String str, String str2, String str3, String str4) throws Exception {
        IAppletInfo.Response response;
        xkzzb.onExtraCallback(new Object[]{">> getAppletInfo()"});
        xkzzb.onExtraCallback(new Object[]{"++ stId : [%s]", str});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ aid : [%s]", str4});
        Gson gson = new Gson();
        IAppletInfo.Request request = new IAppletInfo.Request();
        IAppletInfo.BodyOfIAppletInfo bodyOfIAppletInfo = new IAppletInfo.BodyOfIAppletInfo();
        bodyOfIAppletInfo.setAid(str4);
        request.setBody(bodyOfIAppletInfo);
        request.setUspHeader(b, str2, str3);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (IAppletInfo.Response) gson.fromJson(serverMessage, IAppletInfo.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IStatus.Response getAppletLifeCycle(String str, String str2, String str3, String str4, String str5) throws Exception {
        IStatus.Response response;
        xkzzb.onExtraCallback(new Object[]{">> getAppletLifeCycle()"});
        xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ aid : [%s]", str5});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str4});
        Gson gson = new Gson();
        IStatus.Request request = new IStatus.Request();
        IStatus.BodyOfIStatus bodyOfIStatus = new IStatus.BodyOfIStatus();
        bodyOfIStatus.setAid(str5);
        bodyOfIStatus.setIccid(str2);
        request.setBody(bodyOfIStatus);
        request.setUspHeader(b, str3, str4);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (IStatus.Response) gson.fromJson(serverMessage, IStatus.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IVersion.Response getAppletVersion(String str, String str2, String str3, String str4, String str5) throws Exception {
        IVersion.Response response;
        xkzzb.onExtraCallback(new Object[]{">> getAppletVersion()"});
        xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ aid : [%s]", str5});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str4});
        Gson gson = new Gson();
        IVersion.Request request = new IVersion.Request();
        IVersion.BodyOfIVersion bodyOfIVersion = new IVersion.BodyOfIVersion();
        bodyOfIVersion.setAid(str5);
        bodyOfIVersion.setIccid(str2);
        request.setBody(bodyOfIVersion);
        request.setUspHeader(b, str3, str4);
        String serverMessage = Network.getServerMessage(request.generateUrl(this.c), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (IVersion.Response) gson.fromJson(serverMessage, IVersion.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IVersion.Response getAppletCapVersion(String str, String str2, String str3, String str4, String str5) throws Exception {
        IVersion.Response response;
        xkzzb.onExtraCallback(new Object[]{">> getAppletCapVersion()"});
        xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ aid : [%s]", str5});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str4});
        Gson gson = new Gson();
        IVersion.Request request = new IVersion.Request();
        IVersion.BodyOfIVersion bodyOfIVersion = new IVersion.BodyOfIVersion();
        bodyOfIVersion.setAid(str5);
        bodyOfIVersion.setIccid(str2);
        request.setBody(bodyOfIVersion);
        request.setUspHeader(b, str3, str4);
        String serverMessage = Network.getServerMessage(request.generateUrl(this.c), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (IVersion.Response) gson.fromJson(serverMessage, IVersion.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IPerso.Response postSecondPersoResult(String str, String str2, String str3, String str4, String str5) throws Exception {
        IPerso.Response response;
        xkzzb.onExtraCallback(new Object[]{">> postSecondPersoResult()"});
        xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ aid : [%s]", str5});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str4});
        Gson gson = new Gson();
        IPerso.Request request = new IPerso.Request();
        IPerso.BodyOfIPerso bodyOfIPerso = new IPerso.BodyOfIPerso();
        bodyOfIPerso.setAid(str5);
        bodyOfIPerso.setIccid(str2);
        request.setBody(bodyOfIPerso);
        request.setUspHeader(b, str3, str4);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (IPerso.Response) gson.fromJson(serverMessage, IPerso.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IAvailable.Response authNfcYn(String str, String str2, String str3, String str4) throws Exception {
        IAvailable.Response response;
        xkzzb.onExtraCallback(new Object[]{">> authNfcYn()"});
        xkzzb.onExtraCallback(new Object[]{"++ mdn : [%s]", str4});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        Gson gson = new Gson();
        IAvailable.Request request = new IAvailable.Request();
        IAvailable.BodyOfIAvailable bodyOfIAvailable = new IAvailable.BodyOfIAvailable();
        bodyOfIAvailable.setMdn(str4);
        request.setBody(bodyOfIAvailable);
        request.setUspHeader(b, str2, str3);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (IAvailable.Response) gson.fromJson(serverMessage, IAvailable.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public IUsimAvailable.Response checkCarrierApiUsim(String str, String str2, String str3, String str4, String str5) throws Exception {
        IUsimAvailable.Response response;
        xkzzb.onExtraCallback(new Object[]{">> checkCarrierApi()"});
        xkzzb.onExtraCallback(new Object[]{"++ mdn : [%s]", str4});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        Gson gson = new Gson();
        IUsimAvailable.Request request = new IUsimAvailable.Request();
        IUsimAvailable.BodyOfIUsimAvailable bodyOfIUsimAvailable = new IUsimAvailable.BodyOfIUsimAvailable();
        bodyOfIUsimAvailable.setMdn(str4);
        bodyOfIUsimAvailable.setIccid(str5);
        request.setBody(bodyOfIUsimAvailable);
        request.setUspHeader(b, str2, str3);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (IUsimAvailable.Response) gson.fromJson(serverMessage, IUsimAvailable.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    public ISKTUser.Response getSktUserYn(String str, String str2, String str3, String str4, String str5) throws Exception {
        ISKTUser.Response response;
        xkzzb.onExtraCallback(new Object[]{">> getSktUserYn()"});
        xkzzb.onExtraCallback(new Object[]{"++ mdn : [%s]", str4});
        xkzzb.onExtraCallback(new Object[]{"++ jumin : [%s]", str5});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        Gson gson = new Gson();
        ISKTUser.Request request = new ISKTUser.Request();
        ISKTUser.BodyOfISKTUser bodyOfISKTUser = new ISKTUser.BodyOfISKTUser();
        bodyOfISKTUser.setMdn(str4);
        bodyOfISKTUser.setJumin(str5);
        request.setBody(bodyOfISKTUser);
        request.setUspHeader(b, str2, str3);
        String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
        try {
            response = (ISKTUser.Response) gson.fromJson(serverMessage, ISKTUser.Response.class);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            response = null;
        }
        a(response);
        if (response.getBody() != null) {
            return response;
        }
        throw new STUspProcException("***** body is empty");
    }

    public void setAccessRuleAram(Context context, String str, AbstractWorker.OnWorkerListener onWorkerListener) throws Exception {
        xkzzb.onExtraCallback(new Object[]{">> setAccessRuleAram()"});
        xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", str});
        WorkerPoolExecutor.getInstance().execute(new WorkerToSetAccessRuleAram(context, str, onWorkerListener));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    private void a(AbstractUspResponse abstractUspResponse) throws Exception {
        xkzzb.onExtraCallback(new Object[]{">> verifyResponse()"});
        xkzzb.onExtraCallback(new Object[]{"++ response : [%s]", abstractUspResponse});
        if (abstractUspResponse == null) {
            throw new STUspProcException("***** response is empty");
        }
        HeaderOfUsp header = abstractUspResponse.getHeader();
        if (header == null) {
            throw new STUspProcException("***** response header is empty");
        }
        if (!"000".equalsIgnoreCase(header.getResultCode())) {
            throw new STUspProcException("***** header.result_code is not '000'", header.getResultCode());
        }
    }
}
