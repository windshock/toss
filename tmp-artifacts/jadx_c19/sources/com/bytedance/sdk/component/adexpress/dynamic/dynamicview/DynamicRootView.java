package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.dj {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private lud dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.lt.ycx mDynamicClickListener;
    boolean mIsMute;
    private com.bytedance.sdk.component.adexpress.zb.ea mRenderListener;
    private com.bytedance.sdk.component.adexpress.zb.ry mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.zb muteListener;
    protected final com.bytedance.sdk.component.adexpress.zb.xkz renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.sya> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.lud videoListener;
    public View videoView;

    public DynamicRootView(Context context, boolean z, com.bytedance.sdk.component.adexpress.zb.ry ryVar, com.bytedance.sdk.component.adexpress.dynamic.lt.ycx ycxVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.zb.xkz xkzVar = new com.bytedance.sdk.component.adexpress.zb.xkz();
        this.renderResult = xkzVar;
        xkzVar.ycx(2);
        this.mDynamicClickListener = ycxVar;
        ycxVar.ycx(this);
        this.mIsMute = z;
        this.mRenderRequest = ryVar;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.zb.ea eaVar) {
        this.mRenderListener = eaVar;
        this.mDynamicClickListener.ycx(eaVar);
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar, int i2) {
        this.dynamicBaseWidget = renderDynamicView(fbyVar, this, i2);
        this.renderResult.zb(true);
        this.renderResult.ycx(this.dynamicBaseWidget.lud);
        this.renderResult.zb(this.dynamicBaseWidget.lt);
        this.renderResult.ycx(this.videoView);
        this.mRenderListener.ycx(this.renderResult);
    }

    public lud renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar, ViewGroup viewGroup, int i2) throws JSONException {
        if (fbyVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.dj.fby> listEa = fbyVar.ea();
        lud ludVarYcx = com.bytedance.sdk.component.adexpress.dynamic.ycx.zb.ycx(this.mContext, this, fbyVar);
        if (ludVarYcx instanceof rmf) {
            callBackRenderFail(i2 == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(fbyVar);
        ludVarYcx.sya();
        if (viewGroup != null) {
            viewGroup.addView(ludVarYcx);
            setClipChildren(viewGroup, fbyVar);
        }
        if (listEa == null || listEa.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dj.fby> it = listEa.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), ludVarYcx, i2);
        }
        return ludVarYcx;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud;
        com.bytedance.sdk.component.adexpress.dynamic.dj.lud ludVarJc = fbyVar.jc();
        if (ludVarJc == null || (ltVarLud = ludVarJc.lud()) == null) {
            return;
        }
        this.renderResult.sya(ltVarLud.kh());
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !fbyVar.dv()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void updateRenderInfoForVideo(double d, double d2, double d3, double d4, float f) {
        this.renderResult.sya(d);
        this.renderResult.dj(d2);
        this.renderResult.lud(d3);
        this.renderResult.lt(d4);
        this.renderResult.ycx(f);
        this.renderResult.zb(f);
        this.renderResult.sya(f);
        this.renderResult.dj(f);
    }

    public void callBackRenderFail(int i2, String str) {
        this.renderResult.zb(false);
        this.renderResult.zb(i2);
        this.renderResult.ycx(str);
        this.mRenderListener.ycx(this.renderResult);
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.zb zbVar) {
        this.muteListener = zbVar;
    }

    public com.bytedance.sdk.component.adexpress.zb.ea getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.lt.ycx getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    private boolean checkSizeValid() {
        lud ludVar = this.dynamicBaseWidget;
        return ludVar.lud > 0.0f && ludVar.lt > 0.0f;
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible(lud ludVar, int i2) {
        if (ludVar != null) {
            if (ludVar.getBeginInvisibleAndShow()) {
                ludVar.setVisibility(i2);
                View view = ludVar.syc;
                if (view != null) {
                    view.setVisibility(i2);
                }
            }
            int childCount = ludVar.getChildCount();
            if (childCount > 0) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (ludVar.getChildAt(i3) instanceof lud) {
                        beginShowFromInvisible((lud) ludVar.getChildAt(i3), i2);
                    }
                }
            }
        }
    }

    public void setTime(CharSequence charSequence, int i2, int i3, boolean z) {
        for (int i4 = 0; i4 < this.timeOutListener.size(); i4++) {
            if (this.timeOutListener.get(i4) != null) {
                this.timeOutListener.get(i4).ycx(charSequence, i2 == 1, i3, z);
            }
        }
    }

    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.zb zbVar = this.muteListener;
        if (zbVar != null) {
            zbVar.setSoundMute(z);
        }
    }

    public void setTimeUpdate(int i2) {
        this.videoListener.setTimeUpdate(i2);
    }

    public void onvideoComplate() {
        try {
            this.videoListener.ycx();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61avWPRcNrhRS3", "VOA7nAe5ZuSPR8dRjQWl", 246);
        }
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public int getTimedown() {
        return this.timedown;
    }

    public void setTimedown(int i2) {
        this.timedown = i2;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.sya> getTimeOutListener() {
        return this.timeOutListener;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.sya syaVar) {
        this.timeOutListener.add(syaVar);
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.lud ludVar) {
        this.videoListener = ludVar;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public void setScoreCountWithIcon(int i2) {
        this.scoreCountWithIcon = i2;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public void setLogoUnionHeight(int i2) {
        this.logoUnionHeight = i2;
    }

    public com.bytedance.sdk.component.adexpress.zb.ry getRenderRequest() {
        return this.mRenderRequest;
    }
}
