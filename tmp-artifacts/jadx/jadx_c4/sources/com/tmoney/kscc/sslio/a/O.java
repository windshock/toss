package com.tmoney.kscc.sslio.a;

import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.getSignPrikeyCCFBPHFilename;
import o.getSignPrikeyCCFPHFilename;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class O {
    public static final String TAG = "OkHttp";
    private static MediaType b = MediaType.parse("application/json; charset=utf-8");
    private static O c = null;
    a a;

    public interface a {
        void onResultType(TmoneyCallback.ResultType resultType);
    }

    private O() {
    }

    private void a(String str, RequestBody requestBody) {
        a(U.create().post(str, requestBody));
    }

    private void a(getSignPrikeyCCFBPHFilename<ResponseBody> getsignprikeyccfbphfilename) {
        getsignprikeyccfbphfilename.enqueue(new getSignPrikeyCCFPHFilename<ResponseBody>() { // from class: com.tmoney.kscc.sslio.a.O.2
            public final void onFailure(getSignPrikeyCCFBPHFilename<ResponseBody> getsignprikeyccfbphfilename2, Throwable th) {
                ResultError resultError;
                String codeString;
                String str;
                Callback.success();
                LogHelper.e(O.TAG, "call()>>onFailure()>>" + th.getMessage());
                if (O.this.a != null) {
                    if (th instanceof SocketTimeoutException) {
                        resultError = ResultError.NETWORK;
                        codeString = ResultDetailCode.TIMEOUT.getCodeString();
                        str = String.format("네트워크 연결상태가 불안합니다.\n네트워크 연결 상태를 확인해 주시고, 지속적으로 앱 접속 불가 시 고객센터(1644-0088)로 연락주세요.(%s)", "TIMEOUT ERROR");
                    } else {
                        resultError = ResultError.NETWORK;
                        codeString = ResultDetailCode.NETWORK.getCodeString();
                        str = String.format("네트워크 연결상태가 불안합니다.\n네트워크 연결 상태를 확인해 주시고, 지속적으로 앱 접속 불가 시 고객센터(1644-0088)로 연락주세요.(%s)", "NETWORK ERROR");
                    }
                    O.this.a.onResultType(Callback.warning(resultError, codeString, str));
                }
            }

            public final void onResponse(getSignPrikeyCCFBPHFilename<ResponseBody> getsignprikeyccfbphfilename2, Response<ResponseBody> response) {
                String str;
                try {
                    str = new String(((ResponseBody) response.onExtraCallback()).bytes());
                } catch (Exception e) {
                    LogHelper.e(O.TAG, "call()>>onResponse()>>" + e.getMessage());
                    str = "";
                }
                a aVar = O.this.a;
                if (aVar != null) {
                    aVar.onResultType(Callback.success(str));
                }
            }
        });
    }

    public static O getInstance() {
        O o2;
        synchronized (O.class) {
            if (c == null) {
                c = new O();
            }
            o2 = c;
        }
        return o2;
    }

    public final ResponseBody executePost(String str, RequestBody requestBody) {
        final getSignPrikeyCCFBPHFilename<ResponseBody> getsignprikeyccfbphfilenamePost = U.create().post(str, requestBody);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            try {
                return (ResponseBody) executorServiceNewSingleThreadExecutor.submit(new Callable<ResponseBody>() { // from class: com.tmoney.kscc.sslio.a.O.1
                    @Override // java.util.concurrent.Callable
                    public final ResponseBody call() {
                        try {
                            Response responseExecute = getsignprikeyccfbphfilenamePost.execute();
                            if (!responseExecute.onExtraCallbackWithResult() || responseExecute.onExtraCallback() == null) {
                                return null;
                            }
                            return (ResponseBody) responseExecute.onExtraCallback();
                        } catch (Exception e) {
                            LogHelper.e(O.TAG, "executePost()>>task()>>" + e.getMessage());
                            return null;
                        }
                    }
                }).get();
            } catch (Exception e) {
                LogHelper.e(TAG, "executePost()>>future>>" + e.getMessage());
                executorServiceNewSingleThreadExecutor.shutdown();
                return null;
            }
        } finally {
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    }

    public final void get(String str) {
        LogHelper.d(TAG, "get:" + str);
        a(U.create().get(str));
    }

    public final void post(String str, String str2) {
        LogHelper.d(TAG, "post:" + str + " [" + str2 + "]");
        a(str, RequestBody.create(MediaType.parse("charset=utf-8"), str2));
    }

    public final void post(String str, String str2, getSignPrikeyCCFPHFilename<ResponseBody> getsignprikeyccfphfilename) {
        U.create().post(str, RequestBody.create(b, str2)).enqueue(getsignprikeyccfphfilename);
    }

    public final void post(String str, HashMap<String, String> map) {
        String str2 = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!str2.isEmpty()) {
                str2 = str2 + "&";
            }
            str2 = str2 + entry.getKey() + "=" + entry.getValue();
        }
        String strReplaceAll = str2.replaceAll("%", "%25");
        LogHelper.d(TAG, "post:" + str + " [" + strReplaceAll + "]");
        a(str, RequestBody.create(MediaType.parse("application/x-www-form-urlencoded; charset=utf-8"), strReplaceAll));
    }

    public final void post(String str, HashMap<String, String> map, getSignPrikeyCCFPHFilename<ResponseBody> getsignprikeyccfphfilename) {
        String str2 = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!str2.isEmpty()) {
                str2 = str2 + "&";
            }
            str2 = str2 + entry.getKey() + "=" + entry.getValue();
        }
        String strReplaceAll = str2.replaceAll("%", "%25");
        LogHelper.d(TAG, "post:" + str + " [" + strReplaceAll + "]");
        U.create().post(str, RequestBody.create(MediaType.parse("application/x-www-form-urlencoded; charset=utf-8"), strReplaceAll)).enqueue(getsignprikeyccfphfilename);
    }

    public final void setListener(a aVar) {
        this.a = aVar;
    }
}
