package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.jw.fby;
import com.bytedance.sdk.component.utils.bhi;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.openadsdk.common.lud;
import com.bytedance.sdk.openadsdk.core.av;
import com.bytedance.sdk.openadsdk.core.kgy;
import com.bytedance.sdk.openadsdk.core.lt.dj;
import com.bytedance.sdk.openadsdk.core.lt.sya;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.model.uh;
import com.bytedance.sdk.openadsdk.core.syc;
import com.bytedance.sdk.openadsdk.core.widget.ul;
import com.bytedance.sdk.openadsdk.core.widget.ycx.lt;
import com.bytedance.sdk.openadsdk.dj.ry;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.oby;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {
    private String dj;
    private ry fby;
    private fby jc;
    private lud jw;
    private int lt;
    private String lud;
    private kgy sya;
    private String ul;
    ycx ycx;
    private tn zb;

    public interface ycx {
        void ycx();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super/*com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity*/.onCreate(bundle);
        if (!syc.lud()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.lt = intent.getIntExtra("source", -1);
        tn tnVarYcx = av.ycx().ycx(av.ycx(intent));
        this.zb = tnVarYcx;
        if (tnVarYcx == null) {
            finish();
            return;
        }
        this.ul = tnVarYcx.ea();
        this.dj = this.zb.if();
        this.lud = this.zb.pks();
        this.lt = this.zb.qn().getDurationSlotType() != 7 ? 5 : 7;
        sya syaVar = new sya(this);
        if (Build.VERSION.SDK_INT >= 35) {
            syaVar.setFitsSystemWindows(true);
        }
        ycx(this, syaVar);
        setContentView(syaVar);
        zb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ycx(Context context, FrameLayout frameLayout) {
        dj djVar;
        this.jc = new fby(context, fby.sya.ok);
        frameLayout.addView(this.jc, new FrameLayout.LayoutParams(-1, -1));
        View viewZb = ul.zb(context);
        viewZb.setContentDescription(wwx.ycx(this, "landingpage_default_close"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = dc.zb(context, 18.0f);
        layoutParams.rightMargin = dc.zb(context, 18.0f);
        frameLayout.addView(viewZb, layoutParams);
        final int iUl = this.zb.tru().ul();
        if (iUl != 3) {
            djVar = new dj(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dc.zb(context, 28.0f), dc.zb(context, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = dc.zb(context, 18.0f);
            layoutParams2.leftMargin = dc.zb(context, 18.0f);
            int iZb = dc.zb(context, 5.0f);
            djVar.setPadding(iZb, iZb, iZb, iZb);
            djVar.setScaleType(ImageView.ScaleType.FIT_XY);
            djVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.dj.ycx());
            djVar.setImageDrawable(wwx.sya(context, "tt_white_lefterbackicon_titlebar"));
            djVar.setContentDescription(wwx.ycx(this, "landingpage_default_return"));
            frameLayout.addView((View) djVar, (ViewGroup.LayoutParams) layoutParams2);
        } else {
            djVar = null;
        }
        com.bytedance.sdk.openadsdk.utils.tn.ycx(this.jc, this.ul);
        final WebView webView = this.jc.getWebView();
        viewZb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        ry ryVar = new ry(this.zb, webView, true);
        this.fby = ryVar;
        ryVar.ycx("landingpage_split_ceiling");
        final lt.ycx ycxVar = this.fby.ycx;
        if (djVar != null) {
            djVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i2 = iUl;
                    if (i2 == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i2 != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 != null && webView2.canGoBack()) {
                        webView.goBack();
                        lt.ycx ycxVar2 = ycxVar;
                        if (ycxVar2 != null) {
                            ycxVar2.ycx();
                            return;
                        }
                        return;
                    }
                    TTCeilingLandingPageActivity.this.finish();
                }
            });
        }
        lud ludVarYcx = oby.ycx(this.zb, this.jc, this, "landingpage_split_ceiling");
        this.jw = ludVarYcx;
        if (ludVarYcx != null) {
            ludVarYcx.ycx("landingpage_split_ceiling");
            this.jw.ycx();
        }
        oby.ycx(this.zb, this.jc, true);
        this.ycx = new ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.ycx
            public void ycx() {
                if (TTCeilingLandingPageActivity.this.zb.tru().fby() == uh.zb) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.ycx.lud ludVar = new com.bytedance.sdk.openadsdk.core.widget.ycx.lud(this, this.sya, this.dj, this.jw, this.fby, true, true, this.ycx) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.4
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        ludVar.ycx(this.zb);
        com.bytedance.sdk.openadsdk.core.widget.ycx.dj djVar2 = new com.bytedance.sdk.openadsdk.core.widget.ycx.dj(this.sya, this.fby, this.jw) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.5
            public void onProgressChanged(WebView webView2, int i2) {
                super.onProgressChanged(webView2, i2);
            }
        };
        fby fbyVar = this.jc;
        if (fbyVar != null) {
            fbyVar.setWebViewClient(ludVar);
            this.jc.setWebChromeClient(djVar2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.fby == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.fby.ycx(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                    if (TTCeilingLandingPageActivity.this.fby != null) {
                        TTCeilingLandingPageActivity.this.fby.zb(i3);
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zb() {
        kgy kgyVar = new kgy(this);
        this.sya = kgyVar;
        kgyVar.zb(this.jc).sya(this.dj).dj(this.lud).ycx(this.zb).zb(this.lt).ycx(this.zb.row()).lud(this.zb.wbt()).ycx(this.jc).zb("landingpage_split_ceiling");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onStop() {
        super/*android.app.Activity*/.onStop();
        ry ryVar = this.fby;
        if (ryVar != null) {
            ryVar.fby();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        fby fbyVar = this.jc;
        if (fbyVar != null) {
            bhi.ycx(fbyVar);
        }
    }

    public void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
