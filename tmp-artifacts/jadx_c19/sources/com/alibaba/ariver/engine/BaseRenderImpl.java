package com.alibaba.ariver.engine;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.ExitCallback;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.alibaba.ariver.engine.api.common.CommonBackPerform;
import com.alibaba.ariver.engine.api.common.CommonExitPerform;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BaseRenderImpl implements Render {
    private static final String TAG = "AriverEngine:BaseRenderImpl";
    private static AtomicInteger sRenderIdCounter = new AtomicInteger(1);
    protected LoadParams currentLoadParam;
    private boolean isDestroyed;
    protected Activity mActivity;
    private String mAppId;
    private CommonBackPerform mBackPerform;
    protected CreateParams mCreateParams;
    protected RVEngine mEngineProxy;
    private CommonExitPerform mExitPerform;
    protected DataNode mNode;
    private String mRenderId;
    private String mUserAgent = null;

    public void eveluateJavaScript(String str) {
    }

    protected abstract void onDestroy();

    public void reset() {
    }

    public void setTextSize(int i2) {
    }

    public void triggerSaveSnapshot() {
    }

    public BaseRenderImpl(RVEngine rVEngine, Activity activity, DataNode dataNode, CreateParams createParams) {
        this.mEngineProxy = rVEngine;
        this.mAppId = rVEngine.getAppId();
        this.mActivity = activity;
        this.mNode = dataNode;
        this.mCreateParams = createParams;
        StringBuilder sb = new StringBuilder();
        sb.append(sRenderIdCounter.addAndGet(1));
        this.mRenderId = sb.toString();
    }

    public void setRenderId(String str) {
        this.mRenderId = str;
    }

    public String getUserAgent() {
        String str;
        synchronized (this) {
            if (this.mUserAgent == null) {
                WebView webView = new WebView(this.mActivity);
                this.mUserAgent = webView.getSettings().getUserAgentString();
                this.mUserAgent += " " + EngineUtils.getUserAgentSuffix();
                webView.destroy();
            }
            str = this.mUserAgent;
        }
        return str;
    }

    public void setBackPerform(CommonBackPerform commonBackPerform) {
        this.mBackPerform = commonBackPerform;
    }

    public CommonBackPerform getBackPerform() {
        return this.mBackPerform;
    }

    protected void setExitPerform(CommonExitPerform commonExitPerform) {
        this.mExitPerform = commonExitPerform;
    }

    public CommonExitPerform getExitPerform() {
        return this.mExitPerform;
    }

    public void load(LoadParams loadParams) {
        RVLogger.d(TAG, "load " + loadParams);
        this.currentLoadParam = loadParams;
    }

    public void updateLoadParamUrl(String str) {
        if (this.currentLoadParam != null) {
            RVLogger.d(TAG, "updateLoadParamUrl\t" + str);
            this.currentLoadParam.url = str;
        }
    }

    public void reload() {
        load(new LoadParams(this.currentLoadParam));
    }

    public void goBack(GoBackCallback goBackCallback) throws Throwable {
        CommonBackPerform commonBackPerform = this.mBackPerform;
        if (commonBackPerform != null) {
            commonBackPerform.goBack(goBackCallback);
        } else {
            goBackCallback.afterProcess(false);
        }
    }

    public void runExit(ExitCallback exitCallback) {
        CommonExitPerform commonExitPerform = this.mExitPerform;
        if (commonExitPerform != null) {
            commonExitPerform.runExit(exitCallback);
        } else {
            exitCallback.afterProcess(false);
        }
    }

    public void onResume() {
        List listFindAllEmbedView;
        Page page = getPage();
        if (page == null || page.getPageContext() == null) {
            return;
        }
        if (page.isUseForEmbed() && ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ta_embedpage_ignore_embedview_pause", true)) {
            RVLogger.d(TAG, "Ignore EmbedPage's EmbedViews onResume");
            return;
        }
        PageContext pageContext = page.getPageContext();
        if (pageContext == null || pageContext.getEmbedViewManager() == null || (listFindAllEmbedView = pageContext.getEmbedViewManager().findAllEmbedView()) == null) {
            return;
        }
        Iterator it = listFindAllEmbedView.iterator();
        while (it.hasNext()) {
            ((IEmbedView) it.next()).onWebViewResume();
        }
    }

    public void onPause() {
        List listFindAllEmbedView;
        Page page = getPage();
        if (page == null || page.getPageContext() == null) {
            return;
        }
        if (page.isUseForEmbed() && ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ta_embedpage_ignore_embedview_pause", true)) {
            RVLogger.d(TAG, "Ignore EmbedPage's EmbedViews onPause");
            return;
        }
        PageContext pageContext = page.getPageContext();
        if (pageContext == null || pageContext.getEmbedViewManager() == null || (listFindAllEmbedView = pageContext.getEmbedViewManager().findAllEmbedView()) == null) {
            return;
        }
        Iterator it = listFindAllEmbedView.iterator();
        while (it.hasNext()) {
            ((IEmbedView) it.next()).onWebViewPause();
        }
    }

    public Bundle getStartParams() {
        return this.mCreateParams.startParams;
    }

    public String getCurrentUri() {
        LoadParams loadParams = this.currentLoadParam;
        if (loadParams != null) {
            return loadParams.url;
        }
        Page page = getPage();
        if (page instanceof Page) {
            return page.getOriginalURI();
        }
        return null;
    }

    public final void destroy() {
        synchronized (this) {
            if (this.isDestroyed) {
                return;
            }
            this.isDestroyed = true;
            onDestroy();
        }
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public RVEngine getEngine() {
        return this.mEngineProxy;
    }

    public DataNode getPage() {
        return this.mNode;
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public String getRenderId() {
        return this.mRenderId;
    }

    public boolean hasTriggeredLoad() {
        return this.currentLoadParam != null;
    }
}
