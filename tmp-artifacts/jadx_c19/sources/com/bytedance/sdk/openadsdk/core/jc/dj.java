package com.bytedance.sdk.openadsdk.core.jc;

import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.bytedance.sdk.component.utils.bhi;
import com.bytedance.sdk.openadsdk.oty.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj {
    /* JADX WARN: Multi-variable type inference failed */
    public static void ycx(lt ltVar) {
        if (ltVar == 0 || ltVar.getWebView() == null) {
            return;
        }
        try {
            if (bhi.zb()) {
                return;
            }
            if (ltVar.getParent() != null) {
                ((ViewGroup) ltVar.getParent()).removeView(ltVar);
            }
            ltVar.removeAllViews();
            ltVar.fby();
            ltVar.setWebChromeClient((WebChromeClient) null);
            ltVar.setWebViewClient((WebViewClient) null);
            ltVar.setDownloadListener((DownloadListener) null);
            ltVar.setDefaultTextEncodingName(HexStringUtil.DEFAULT_CHARSET_NAME);
            ltVar.setAllowFileAccess(false);
            ltVar.setJavaScriptEnabled(true);
            ltVar.setCacheMode(-1);
            ltVar.setDatabaseEnabled(true);
            ltVar.setSupportZoom(false);
            ltVar.getWebView().setLayerType(0, null);
            ltVar.setBackgroundColor(0);
            ltVar.getWebView().setHorizontalScrollBarEnabled(false);
            ltVar.getWebView().setHorizontalScrollbarOverlay(false);
            ltVar.getWebView().setVerticalScrollBarEnabled(false);
            ltVar.getWebView().setVerticalScrollbarOverlay(false);
            ltVar.xkz();
            ltVar.setMixedContentMode(0);
        } catch (Exception e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "efwsmweeaMmOT8VqiROWIV75HZoMsA==", "Ses+kBeLbMW2Q9JK", 53);
        }
    }
}
