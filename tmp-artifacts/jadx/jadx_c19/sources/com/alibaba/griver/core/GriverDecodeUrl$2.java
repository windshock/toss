package com.alibaba.griver.core;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.api.callback.GriverDecodeUrlCallback;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.rpc.BaseGriverRpcResult;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.core.common.monitor.UrlContentDecoderMonitorHelper;
import com.alibaba.griver.core.model.codec.PromotionUrlCodecResult;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverDecodeUrl$2 implements OnRpcResultListener<PromotionUrlCodecResult> {
    final /* synthetic */ GriverDecodeUrlCallback val$callback;
    final /* synthetic */ String val$url;

    public GriverDecodeUrl$2(GriverDecodeUrlCallback griverDecodeUrlCallback, String str) {
        this.val$callback = griverDecodeUrlCallback;
        this.val$url = str;
    }

    public void onResultFailed(final int i2, final String str) {
        GriverLogger.e("DecodeUrlUtils", "onResultFailed errorCode == " + i2);
        GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() { // from class: com.alibaba.griver.core.GriverDecodeUrl$2.2
            @Override // java.lang.Runnable
            public void run() {
                GriverDecodeUrl$2.this.val$callback.onDecodeFailed(i2, str);
            }
        });
        MonitorMap.Builder builder = new MonitorMap.Builder();
        builder.append("operationType", "alipay.intl.gmp.rpc.app.codec.route").url(this.val$url).code(String.valueOf(i2)).message(str);
        GriverMonitor.error("mini_rpc_exception", "GriverAppContainer", builder.build());
        UrlContentDecoderMonitorHelper.monitor(UrlContentDecoderMonitorHelper.Scene.DecodeURL, UrlContentDecoderMonitorHelper.ErrorType.NetworkError, str);
    }

    public void onResultSuccess(final PromotionUrlCodecResult promotionUrlCodecResult) {
        GriverLogger.d("DecodeUrlUtils", "onResultSuccess == " + JSON.toJSONString(promotionUrlCodecResult));
        if (promotionUrlCodecResult != null && ((BaseGriverRpcResult) promotionUrlCodecResult).success && !TextUtils.isEmpty(promotionUrlCodecResult.getUri())) {
            GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() { // from class: com.alibaba.griver.core.GriverDecodeUrl$2.1
                @Override // java.lang.Runnable
                public void run() {
                    GriverDecodeUrl$2.this.val$callback.onDecodeSuccess(promotionUrlCodecResult.getUri());
                }
            });
            return;
        }
        onResultFailed(1, "decode failed.");
        if (promotionUrlCodecResult == null || !((BaseGriverRpcResult) promotionUrlCodecResult).success) {
            UrlContentDecoderMonitorHelper.monitor(UrlContentDecoderMonitorHelper.Scene.DecodeURL, UrlContentDecoderMonitorHelper.ErrorType.ServerError, promotionUrlCodecResult == null ? "" : ((BaseGriverRpcResult) promotionUrlCodecResult).errorMessage);
        }
    }
}
