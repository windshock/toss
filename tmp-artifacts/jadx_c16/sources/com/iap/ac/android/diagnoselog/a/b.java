package com.iap.ac.android.diagnoselog.a;

import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.diagnoselog.api.OnLogUploadListener;
import com.iap.ac.android.diagnoselog.core.DiagnoseLogContext;
import com.iap.ac.android.diagnoselog.core.UserDiagnosing;
import com.iap.ac.android.diagnoselog.rpc.marmotconfig.DiagnoseTask;
import com.iap.ac.android.diagnoselog.rpc.marmotconfig.FetchMarmotConfigFacade;
import com.iap.ac.android.diagnoselog.rpc.marmotconfig.MarmotConfigRequest;
import com.iap.ac.android.diagnoselog.rpc.marmotconfig.MarmotConfigResult;
import com.iap.ac.android.loglite.utils.LoggerWrapper;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class b implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ OnLogUploadListener c;
    public final /* synthetic */ DiagnoseLogContext d;

    public b(DiagnoseLogContext diagnoseLogContext, long j, long j2, OnLogUploadListener onLogUploadListener) {
        this.d = diagnoseLogContext;
        this.a = j;
        this.b = j2;
        this.c = onLogUploadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        MarmotConfigResult marmotConfigResultFetchMarmotConfig;
        long j = this.a;
        long j2 = this.b;
        try {
            FetchMarmotConfigFacade fetchMarmotConfigFacade = (FetchMarmotConfigFacade) RPCProxyHost.getInterfaceProxy(FetchMarmotConfigFacade.class, "diagnoselog_biz");
            MarmotConfigRequest marmotConfigRequest = new MarmotConfigRequest();
            marmotConfigRequest.platform = "ANDROID";
            marmotConfigRequest.startTime = j;
            marmotConfigRequest.endTime = j2;
            marmotConfigResultFetchMarmotConfig = fetchMarmotConfigFacade.fetchMarmotConfig(marmotConfigRequest);
        } catch (Exception e) {
            LoggerWrapper.w("DiagnoseLogContext", e);
            marmotConfigResultFetchMarmotConfig = null;
        }
        if (marmotConfigResultFetchMarmotConfig == null || !marmotConfigResultFetchMarmotConfig.success.booleanValue()) {
            OnLogUploadListener onLogUploadListener = this.c;
            if (onLogUploadListener != null) {
                onLogUploadListener.onFinished(false, "");
                return;
            }
            return;
        }
        DiagnoseLogContext diagnoseLogContext = this.d;
        UserDiagnosing userDiagnosing = new UserDiagnosing(diagnoseLogContext.d, diagnoseLogContext.c, this.c);
        long j3 = this.a;
        long j4 = this.b;
        DiagnoseTask diagnoseTask = new DiagnoseTask();
        diagnoseTask.startTime = j3;
        diagnoseTask.endTime = j4;
        diagnoseTask.taskId = marmotConfigResultFetchMarmotConfig.taskId;
        diagnoseTask.uploadUrl = marmotConfigResultFetchMarmotConfig.uploadUrl;
        DiagnoseTask.UploadParams uploadParams = new DiagnoseTask.UploadParams();
        diagnoseTask.uploadParams = uploadParams;
        uploadParams.OSSAccessKeyId = marmotConfigResultFetchMarmotConfig.OSSAccessKeyId;
        uploadParams.Signature = marmotConfigResultFetchMarmotConfig.Signature;
        uploadParams.key = marmotConfigResultFetchMarmotConfig.key;
        uploadParams.policy = marmotConfigResultFetchMarmotConfig.policy;
        userDiagnosing.a(JsonUtils.toJson(diagnoseTask));
    }
}
