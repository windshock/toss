package com.skt.usp.tools.network.usp;

import android.content.Context;
import com.google.gson.Gson;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.USPProcException;
import com.skt.usp.tools.dao.protocol.usp.AbstractUspResponse;
import com.skt.usp.tools.dao.protocol.usp.HeaderOfUsp;
import com.skt.usp.tools.dao.protocol.usp.usim.IEFRefresh;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.tools.network.Network;
import com.skt.usp.utils.Telephone;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class WorkerToReqEFRefresh extends AbstractWorker {
    private APITypeCode a;
    private Context b;
    private String c;
    private String d;

    public WorkerToReqEFRefresh(Context context, String str, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, onWorkerListener);
        this.a = APITypeCode.UCP_API_REQ_EFREFRESH;
        this.d = null;
        this.b = context;
        this.c = str;
    }

    public void run() {
        AbstractWorker.OnWorkerListener onWorkerListener;
        Gson gson;
        String serverMessage;
        IEFRefresh.Response response;
        UCPLog.info(new Object[]{">> reqColdBootByEFRefresh"});
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    UCPLog.debug(new Object[]{"++ mdn : [%s]", Telephone.getMdn(this.b)});
                    UCPLog.debug(new Object[]{"++ pkgName : [%s]", ((AbstractWorker) this).m_strPkgName});
                    UCPLog.debug(new Object[]{"++ compId : [%s]", "MGR_PUSH_APPLET"});
                    gson = new Gson();
                    IEFRefresh.Request request = new IEFRefresh.Request();
                    new IEFRefresh.BodyOfIEfrefresh();
                    request.setUspHeader(this.b, ((AbstractWorker) this).m_strPkgName, "MGR_PUSH_APPLET");
                    serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
                    UCPLog.debug(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
                } catch (USPProcException e) {
                    UCPLog.error(new Object[]{e.getMessage()});
                    aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                    aPIResultCode.setMessage(e.getMessage());
                    onWorkerListener = ((AbstractWorker) this).m_onListener;
                    if (onWorkerListener == null) {
                        return;
                    }
                }
                if (serverMessage.contains("server connection error")) {
                    throw new USPProcException("server connection error");
                }
                try {
                    response = (IEFRefresh.Response) gson.fromJson(serverMessage, IEFRefresh.Response.class);
                } catch (Exception e2) {
                    UCPLog.error(new Object[]{e2.getMessage()});
                    response = null;
                }
                a(response);
                if (response.getBody() == null) {
                    throw new USPProcException("body is empty");
                }
                onWorkerListener = ((AbstractWorker) this).m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
                onWorkerListener.onTerminateFromWorker(this.a, aPIResultCode, (Object) null);
            } catch (Exception e3) {
                UCPLog.error(new Object[]{e3.getMessage()});
                APIResultCode aPIResultCode2 = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                AbstractWorker.OnWorkerListener onWorkerListener2 = ((AbstractWorker) this).m_onListener;
                if (onWorkerListener2 != null) {
                    onWorkerListener2.onTerminateFromWorker(this.a, aPIResultCode2, (Object) null);
                }
            }
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener3 = ((AbstractWorker) this).m_onListener;
            if (onWorkerListener3 != null) {
                onWorkerListener3.onTerminateFromWorker(this.a, aPIResultCode, (Object) null);
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skt.usp.tools.common.USPProcException */
    private void a(AbstractUspResponse abstractUspResponse) throws Exception {
        UCPLog.info(new Object[]{">> verifyResponse()"});
        UCPLog.debug(new Object[]{"++ response : [%s]", abstractUspResponse});
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
