package com.alibaba.ariver.kernel.api.singlePage;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.ariver.kernel.common.Proxiable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface CaprSinglePageProxy extends Proxiable {
    public static final String pageDomReady = "pageDomReady";
    public static final String pageLoadComplete = "pageLoadComplete";
    public static final String pageLoadFail = "pageLoadFail";
    public static final int pageLoadFailCode = 12;
    public static final String pageLoadStart = "pageLoadStart";
    public static final String webviewCreateFail = "webviewCreateFail";
    public static final int webviewCreateFailCode = 11;
    public static final String webviewCreated = "webviewCreated";

    public interface CaprProgressCallback {
        void onProgress(String str);
    }

    void createCaprPage(Activity activity, Bundle bundle, Bundle bundle2, CaprPageCallback caprPageCallback, CaprProgressCallback caprProgressCallback, CaprErrorCallback caprErrorCallback, String str);
}
