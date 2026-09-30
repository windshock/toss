package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.jw.fby;
import com.bytedance.sdk.component.jw.ul;
import com.bytedance.sdk.component.utils.bhi;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.component.utils.zb;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.ok;
import com.bytedance.sdk.openadsdk.common.ry;
import com.bytedance.sdk.openadsdk.common.syc;
import com.bytedance.sdk.openadsdk.common.thx;
import com.bytedance.sdk.openadsdk.common.thx$ycx;
import com.bytedance.sdk.openadsdk.common.wie;
import com.bytedance.sdk.openadsdk.component.reward.ycx.uh;
import com.bytedance.sdk.openadsdk.core.av;
import com.bytedance.sdk.openadsdk.core.kgy;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.widget.ycx.dj;
import com.bytedance.sdk.openadsdk.core.widget.ycx.lt;
import com.bytedance.sdk.openadsdk.core.widget.ycx.lud;
import com.bytedance.sdk.openadsdk.dj.sya;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.ea;
import com.bytedance.sdk.openadsdk.utils.oby;
import com.bytedance.sdk.openadsdk.utils.yzp;
import com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$sya;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TTHistoryLandingPageActivity extends TTBaseLandingPageActivity {
    private static final LinkedList<WeakReference<Activity>> ul = new LinkedList<>();
    private lud aeu;
    private lt.ycx av;
    private ok bhi;
    private ImageView dwi;
    private String dy;
    private Button ea;
    private fby fby;
    private int hf;
    private String htf;
    private ImageView ifb;
    private syc jc;
    private Context jw;
    private ry oby;
    private String ok;
    private int oty;
    private com.bytedance.sdk.openadsdk.thx.ycx.ycx.sya pmi;
    private com.bytedance.sdk.openadsdk.common.lud rmf;
    private String ry;
    TTAdDislikeToast sya;
    private int syc;
    private ImageView sz;
    private String thx;
    private com.bytedance.sdk.openadsdk.core.lt.lt uh;
    private tn wie;
    private ILoader wwx;
    private kgy xkz;
    private com.bytedance.sdk.openadsdk.xkz.ycx xym;
    private boolean xz;
    com.bytedance.sdk.openadsdk.dj.ry ycx;
    private com.bytedance.sdk.openadsdk.xkz.ycx.ycx yi;
    private ImageView yzp;
    wie zb;
    private final AtomicInteger tn = new AtomicInteger(0);
    private final AtomicInteger dv = new AtomicInteger(0);
    private final AtomicInteger tru = new AtomicInteger(0);
    final AtomicBoolean dj = new AtomicBoolean(false);
    final AtomicBoolean lud = new AtomicBoolean(false);
    private boolean nji = false;
    private long dc = 0;
    int lt = -1;
    private String rl = "DOWNLOAD";

    protected boolean a_() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(@Nullable Bundle bundle) {
        super/*com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity*/.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.syc.lud()) {
            finish();
            return;
        }
        try {
            pmi.zb(this);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRA==", "VOAOhwa9fcI=", 192);
        }
        LinkedList<WeakReference<Activity>> linkedList = ul;
        linkedList.add(new WeakReference<>(this));
        if (linkedList.size() > 30) {
            jw();
        }
        uh.zb(this, 3);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("material_key");
        this.htf = intent.getStringExtra("landing_url");
        int intExtra = intent.getIntExtra("landing_index", 0);
        if (stringExtra != null && intExtra >= 0) {
            com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().ycx(stringExtra, new AnonymousClass1(intExtra, bundle, jElapsedRealtime));
        } else {
            finish();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity$1, reason: invalid class name */
    class AnonymousClass1 implements sya$sya {
        final /* synthetic */ long sya;
        final /* synthetic */ int ycx;
        final /* synthetic */ Bundle zb;

        AnonymousClass1(int i2, Bundle bundle, long j) {
            this.ycx = i2;
            this.zb = bundle;
            this.sya = j;
        }

        @Override // com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$sya
        public void ycx(final String str) {
            yzp.ycx(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.1.1
                /* JADX WARN: Type inference failed for: r0v30, types: [android.content.Context, com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity] */
                @Override // java.lang.Runnable
                public void run() {
                    List listZb = com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.zb(str);
                    TTHistoryLandingPageActivity.this.wie = (listZb == null || listZb.isEmpty()) ? null : (tn) listZb.get(AnonymousClass1.this.ycx);
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    Bundle bundle = anonymousClass1.zb;
                    if (bundle != null) {
                        try {
                            TTHistoryLandingPageActivity.this.lt = bundle.getInt("meta_index", -1);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity = TTHistoryLandingPageActivity.this;
                            if (tTHistoryLandingPageActivity.lt >= 0) {
                                tTHistoryLandingPageActivity.wie = av.ycx().ycx(TTHistoryLandingPageActivity.this.lt);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRMhA5Hk=", "Sfsj", 227);
                        }
                    }
                    if (TTHistoryLandingPageActivity.this.wie == null) {
                        TTHistoryLandingPageActivity.this.finish();
                        return;
                    }
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity2 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity2.ok = tTHistoryLandingPageActivity2.wie.if();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity3 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity3.ry = tTHistoryLandingPageActivity3.wie.pks();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity4 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity4.thx = tTHistoryLandingPageActivity4.wie.dw();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity5 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity5.syc = tTHistoryLandingPageActivity5.wie.ry();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity6 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity6.dy = tTHistoryLandingPageActivity6.wie.ok();
                    try {
                        TTHistoryLandingPageActivity tTHistoryLandingPageActivity7 = TTHistoryLandingPageActivity.this;
                        tTHistoryLandingPageActivity7.setContentView(tTHistoryLandingPageActivity7.lt());
                        TTHistoryLandingPageActivity.this.sya();
                        ?? r0 = TTHistoryLandingPageActivity.this;
                        ((TTHistoryLandingPageActivity) r0).jw = r0;
                        if (TTHistoryLandingPageActivity.this.fby != null && !bhi.zb()) {
                            ul.ycx(TTHistoryLandingPageActivity.this.jw).ycx(false).zb(false).ycx(TTHistoryLandingPageActivity.this.fby.getWebView());
                        }
                        TTHistoryLandingPageActivity.this.oby.ycx(true);
                        if (TTHistoryLandingPageActivity.this.fby != null && TTHistoryLandingPageActivity.this.fby.getWebView() != null) {
                            TTHistoryLandingPageActivity.this.ycx = new com.bytedance.sdk.openadsdk.dj.ry(TTHistoryLandingPageActivity.this.wie, TTHistoryLandingPageActivity.this.fby.getWebView(), new ycx(TTHistoryLandingPageActivity.this.oty, TTHistoryLandingPageActivity.this.wie, "landingpage", TTHistoryLandingPageActivity.this), TTHistoryLandingPageActivity.this.hf).zb(true);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity8 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity8.av = tTHistoryLandingPageActivity8.ycx.ycx;
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity9 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity9.rmf = oby.ycx(tTHistoryLandingPageActivity9.wie, TTHistoryLandingPageActivity.this.fby, TTHistoryLandingPageActivity.this.jw, TTHistoryLandingPageActivity.this.dy);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity10 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity10.ycx.lud(tTHistoryLandingPageActivity10.nji);
                            TTHistoryLandingPageActivity.this.wie.uh(TTHistoryLandingPageActivity.this.nji);
                        }
                        TTHistoryLandingPageActivity.this.jc();
                        if (TTHistoryLandingPageActivity.this.fby != null) {
                            TTHistoryLandingPageActivity.this.fby.setLandingPage(true);
                            TTHistoryLandingPageActivity.this.fby.setTag("landingpage");
                            TTHistoryLandingPageActivity.this.fby.setMaterialMeta(TTHistoryLandingPageActivity.this.wie.gmd());
                        }
                        TTHistoryLandingPageActivity.this.lud();
                        TTHistoryLandingPageActivity.this.ul();
                        if (TTHistoryLandingPageActivity.this.xym != null) {
                            TTHistoryLandingPageActivity.this.xym.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.1.1.1
                                /* JADX WARN: Type inference failed for: r3v6, types: [android.content.Context, com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity] */
                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                    TTHistoryLandingPageActivity.this.zb("onSelectPrivacy");
                                    ?? r3 = TTHistoryLandingPageActivity.this;
                                    TTWebsiteActivity.ycx((Context) r3, ((TTHistoryLandingPageActivity) r3).wie, TTHistoryLandingPageActivity.this.dy);
                                }
                            });
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        sya.ycx.ycx(jElapsedRealtime - anonymousClass12.sya, TTHistoryLandingPageActivity.this.wie, "landingpage", TTHistoryLandingPageActivity.this.wwx, TTHistoryLandingPageActivity.this.thx);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRMhA5Hk=", "Sfsj", 244);
                        TTHistoryLandingPageActivity.this.finish();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$sya
        public void zb(String str) {
            TTHistoryLandingPageActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void sya() {
        oby.ycx(this.wie, this.fby);
        this.jc = findViewById(com.bytedance.sdk.openadsdk.utils.wie.ui);
        syc sycVarFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.wie.iq);
        ok okVarFindViewById = findViewById(520093721);
        this.bhi = okVarFindViewById;
        if (okVarFindViewById != null) {
            okVarFindViewById.ycx(this.wie);
            this.bhi.ycx();
        }
        if (sycVarFindViewById != null) {
            sycVarFindViewById.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.wie.dfk);
        this.ifb = imageView;
        if (imageView != null) {
            imageView.setContentDescription(wwx.ycx(this, "landingpage_default_return"));
            this.ifb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTHistoryLandingPageActivity.this.fby != null) {
                        if (TTHistoryLandingPageActivity.this.av != null) {
                            TTHistoryLandingPageActivity.this.av.ycx();
                        }
                        if (TTHistoryLandingPageActivity.this.fby.jw()) {
                            TTHistoryLandingPageActivity.this.fby.jc();
                            if (TTHistoryLandingPageActivity.this.oby != null) {
                                TTHistoryLandingPageActivity.this.oby.ycx(TTHistoryLandingPageActivity.this.fby.getWebView(), TTHistoryLandingPageActivity.this.av);
                            }
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.wie.vyl);
        this.yzp = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTHistoryLandingPageActivity.this.fby == null || !TTHistoryLandingPageActivity.this.fby.ea()) {
                        return;
                    }
                    TTHistoryLandingPageActivity.this.fby.ok();
                    if (TTHistoryLandingPageActivity.this.oby != null) {
                        TTHistoryLandingPageActivity.this.oby.ycx(TTHistoryLandingPageActivity.this.fby.getWebView(), TTHistoryLandingPageActivity.this.av);
                    }
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.sz = imageView3;
        if (imageView3 != null) {
            imageView3.setContentDescription(wwx.ycx(this, "landingpage_default_close"));
            this.sz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.lt.lt ltVarFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.wie.ufy);
        this.uh = ltVarFindViewById;
        if (ltVarFindViewById != null) {
            ltVarFindViewById.setVisibility(0);
        }
        this.dwi = (ImageView) findViewById(520093740);
        final thx thxVar = new thx(this, false);
        ImageView imageView4 = this.dwi;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    thxVar.setOnMenuItemClickListener(new thx$ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.10.1
                        @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
                        public void ycx() {
                            if (TTHistoryLandingPageActivity.this.wie != null) {
                                com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().ycx(TTHistoryLandingPageActivity.this.wie);
                            }
                            com.bytedance.sdk.component.utils.zb.ycx(TTHistoryLandingPageActivity.this, new Intent((Context) TTHistoryLandingPageActivity.this, (Class<?>) TTHistoryActivity.class), (zb.zb) null);
                            TTHistoryLandingPageActivity.this.zb("onSelectHistory");
                            thxVar.ycx();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
                        public void zb() {
                            if (TTHistoryLandingPageActivity.this.fby == null || TTHistoryLandingPageActivity.this.fby.getUrl() == null) {
                                return;
                            }
                            if (TTHistoryLandingPageActivity.this.uh != null) {
                                TTHistoryLandingPageActivity.this.uh.setVisibility(0);
                                TTHistoryLandingPageActivity.this.uh.setProgress(0);
                            }
                            TTHistoryLandingPageActivity.this.fby.fby();
                            TTHistoryLandingPageActivity.this.fby.a_(TTHistoryLandingPageActivity.this.fby.getUrl());
                            TTHistoryLandingPageActivity.this.zb("onSelectRetry");
                            thxVar.ycx();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
                        public void sya() {
                            ClipboardManager clipboardManager;
                            if (TTHistoryLandingPageActivity.this.fby != null) {
                                String url = TTHistoryLandingPageActivity.this.fby.getUrl();
                                if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTHistoryLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                }
                            }
                            TTHistoryLandingPageActivity.this.zb("onSelectCopyLink");
                            thxVar.ycx();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
                        public void dj() {
                            if (TTHistoryLandingPageActivity.this.fby != null) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                String url = TTHistoryLandingPageActivity.this.fby.getUrl();
                                if (!TextUtils.isEmpty(url)) {
                                    intent.setData(Uri.parse(url));
                                    com.bytedance.sdk.component.utils.zb.ycx(TTHistoryLandingPageActivity.this, intent, (zb.zb) null);
                                }
                                TTHistoryLandingPageActivity.this.zb("onSelectOpenInBrowser");
                                thxVar.ycx();
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
                        public void lud() {
                            TTHistoryLandingPageActivity.this.zb();
                            TTHistoryLandingPageActivity.this.zb("onSelectReport");
                            thxVar.ycx();
                        }

                        /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity] */
                        /* JADX WARN: Type inference failed for: r0v8, types: [android.content.Context, com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity] */
                        @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
                        public void lt() {
                            if (com.bytedance.sdk.openadsdk.utils.zb.lud()) {
                                ?? r0 = TTHistoryLandingPageActivity.this;
                                IABLandingPageActivity.ycx((Context) r0, ((TTHistoryLandingPageActivity) r0).wie, TTHistoryLandingPageActivity.this.dy);
                            } else {
                                ?? r02 = TTHistoryLandingPageActivity.this;
                                TTWebsiteActivity.ycx((Context) r02, ((TTHistoryLandingPageActivity) r02).wie, TTHistoryLandingPageActivity.this.dy);
                            }
                            TTHistoryLandingPageActivity.this.zb("onSelectPrivacy");
                            thxVar.ycx();
                        }
                    });
                    thxVar.ycx(view);
                }
            });
        }
        View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.wie.ag);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryLandingPageActivity.this.zb();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lud() {
        lud ludVar = new lud(this.jw, this.xkz, this.ok, this.rmf, this.ycx, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.12
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTHistoryLandingPageActivity.this.uh != null && !TTHistoryLandingPageActivity.this.isFinishing()) {
                        TTHistoryLandingPageActivity.this.uh.setVisibility(8);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRMhG", "VOAdlAS5T86OQ8RViRU=", 488);
                }
                if (TTHistoryLandingPageActivity.this.bhi != null) {
                    TTHistoryLandingPageActivity.this.bhi.zb();
                }
            }

            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (!TextUtils.isEmpty(TTHistoryLandingPageActivity.this.thx)) {
                        TTHistoryLandingPageActivity.this.tn.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelYcx = com.bytedance.sdk.openadsdk.ul.zb.ycx().ycx(TTHistoryLandingPageActivity.this.wwx, TTHistoryLandingPageActivity.this.thx, str);
                        if (webResourceResponseModelYcx != null && webResourceResponseModelYcx.getWebResourceResponse() != null) {
                            TTHistoryLandingPageActivity.this.tru.incrementAndGet();
                            return webResourceResponseModelYcx.getWebResourceResponse();
                        }
                        if (webResourceResponseModelYcx != null && webResourceResponseModelYcx.getMsg() == 2) {
                            TTHistoryLandingPageActivity.this.dv.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRMhG", "SOYigA+4QMmUT8VeiQG0Gl7/OJAQqA==", 514);
                    htf.ycx("TTAD.HistoryLandingPageAct", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }
        };
        this.aeu = ludVar;
        ludVar.ycx(this.wie);
        this.aeu.ycx("landingpage");
        fby fbyVar = this.fby;
        if (fbyVar != null) {
            fbyVar.setWebViewClient(this.aeu);
            fby fbyVar2 = this.fby;
            if (fbyVar2 != null) {
                fbyVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.htf.ycx(fbyVar2.getWebView(), 8204));
            }
            if (this.fby != null && !bhi.zb()) {
                this.fby.setMixedContentMode(0);
            }
        }
        com.bytedance.sdk.openadsdk.dj.sya.ycx(this.wie, "landingpage", this.hf);
        fby fbyVar3 = this.fby;
        if (fbyVar3 != null) {
            com.bytedance.sdk.openadsdk.utils.tn.ycx(fbyVar3, this.htf);
            this.fby.setWebChromeClient(new dj(this.xkz, this.ycx, this.rmf) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.13
                /* JADX WARN: Multi-variable type inference failed */
                public void onReceivedTitle(WebView webView, String str) {
                    super/*android.webkit.WebChromeClient*/.onReceivedTitle(webView, str);
                    TTHistoryLandingPageActivity.this.oby.ycx(str);
                    TTHistoryLandingPageActivity.this.oby.zb(webView.getUrl());
                    try {
                        if (TextUtils.isEmpty(str)) {
                            str = TTHistoryLandingPageActivity.this.htf;
                        }
                        TTHistoryLandingPageActivity.this.yi = new com.bytedance.sdk.openadsdk.xkz.ycx.ycx();
                        com.bytedance.sdk.openadsdk.core.model.ycx ycxVarDj = TTHistoryLandingPageActivity.this.wie.dj();
                        TTHistoryLandingPageActivity.this.yi.ycx(com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().sya(TTHistoryLandingPageActivity.this.wie.ybg()));
                        TTHistoryLandingPageActivity.this.yi.zb(ycxVarDj.zb());
                        TTHistoryLandingPageActivity.this.yi.sya(String.valueOf(System.currentTimeMillis()));
                        TTHistoryLandingPageActivity.this.yi.lud(webView.getUrl());
                        TTHistoryLandingPageActivity.this.yi.zb(TTHistoryLandingPageActivity.this.wie.lj());
                        TTHistoryLandingPageActivity.this.yi.dj(str);
                        com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().ycx(TTHistoryLandingPageActivity.this.yi);
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRMhJ", "VOAfkAC5YNGFTuNUmB2l", 562);
                        htf.ycx("TTAD.HistoryLandingPageAct", "page start: miabhistory index = " + TTHistoryLandingPageActivity.this.wie.lj() + "model = " + TTHistoryLandingPageActivity.this.yi, e);
                    }
                }

                public void onProgressChanged(WebView webView, int i2) {
                    super.onProgressChanged(webView, i2);
                    if (TTHistoryLandingPageActivity.this.bhi != null) {
                        TTHistoryLandingPageActivity.this.bhi.ycx(i2);
                    }
                    if (TTHistoryLandingPageActivity.this.uh != null && !TTHistoryLandingPageActivity.this.isFinishing()) {
                        if (i2 != 100 || !TTHistoryLandingPageActivity.this.uh.isShown()) {
                            TTHistoryLandingPageActivity.this.uh.setProgress(i2);
                        } else {
                            TTHistoryLandingPageActivity.this.uh.setVisibility(8);
                        }
                    }
                    if (TTHistoryLandingPageActivity.this.oby != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - TTHistoryLandingPageActivity.this.dc >= 200 || i2 == 100) {
                            TTHistoryLandingPageActivity.this.oby.ycx(webView, TTHistoryLandingPageActivity.this.av);
                            TTHistoryLandingPageActivity.this.dc = jCurrentTimeMillis;
                        }
                    }
                }
            });
            if (this.fby.getWebView() != null) {
                this.fby.getWebView().setOnScrollChangeListener(new zb(this.ycx));
                this.fby.getWebView().setOnTouchListener(new sya(this.ycx, this.rmf) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.14
                    private float dj;
                    private long lud;
                    private float sya;
                    private final int zb = pmi.zb();
                    private float lt = 0.0f;
                    private float ul = 0.0f;

                    @Override // com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.sya, android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                this.sya = motionEvent.getRawX();
                                this.dj = motionEvent.getRawY();
                                this.lud = System.currentTimeMillis();
                            } else if (actionMasked == 2) {
                                float rawX = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                Math.abs(rawX - this.sya);
                                this.lt += Math.abs(motionEvent.getX() - this.sya);
                                this.ul += Math.abs(motionEvent.getY() - this.dj);
                                if (rawY - this.dj > this.zb) {
                                    TTHistoryLandingPageActivity.this.oby.ycx();
                                }
                                if (rawY - this.dj < (-this.zb)) {
                                    TTHistoryLandingPageActivity.this.oby.zb();
                                }
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRMhI", "VOAZmha/YQ==", 649);
                        }
                        return super.onTouch(view, motionEvent);
                    }
                });
            }
            this.fby.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.2
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (TTHistoryLandingPageActivity.this.pmi != null) {
                        TTHistoryLandingPageActivity.this.pmi.ycx(TTHistoryLandingPageActivity.this.wie);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public View lt() {
        com.bytedance.sdk.openadsdk.core.model.zb zbVarMnf;
        com.bytedance.sdk.openadsdk.core.lt.sya syaVar = new com.bytedance.sdk.openadsdk.core.lt.sya(this);
        if (Build.VERSION.SDK_INT >= 35) {
            syaVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.lt.lud ludVar = new com.bytedance.sdk.openadsdk.core.lt.lud(this);
        ludVar.setOrientation(1);
        syaVar.addView(ludVar, new FrameLayout.LayoutParams(-1, -1));
        this.oby = new ry(this, this.wie, this.dy, false);
        View sycVar = new syc(this, new syc.ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.3
            public View ycx(Context context) {
                return TTHistoryLandingPageActivity.this.oby.dj();
            }
        });
        sycVar.setId(com.bytedance.sdk.openadsdk.utils.wie.iq);
        ludVar.addView(sycVar, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.lt.sya syaVar2 = new com.bytedance.sdk.openadsdk.core.lt.sya(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        ludVar.addView(syaVar2, layoutParams);
        View fbyVar = new fby(this, fby.sya.ea);
        this.fby = fbyVar;
        fbyVar.setId(com.bytedance.sdk.openadsdk.utils.wie.rl);
        syaVar2.addView(fbyVar, new FrameLayout.LayoutParams(-1, -1));
        View sycVar2 = new syc(this, new syc.ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.4
            public View ycx(Context context) {
                return new com.bytedance.sdk.openadsdk.common.fby(context);
            }
        });
        sycVar2.setId(com.bytedance.sdk.openadsdk.utils.wie.ui);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        syaVar2.addView(sycVar2, layoutParams2);
        View ltVar = new com.bytedance.sdk.openadsdk.core.lt.lt(this, (AttributeSet) null, R.style.Widget.ProgressBar.Horizontal);
        ltVar.setId(com.bytedance.sdk.openadsdk.utils.wie.ufy);
        ltVar.setProgress(1);
        ltVar.setVisibility(8);
        ltVar.setProgressDrawable(ea.ycx(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, dc.zb(this, 3.0f));
        layoutParams3.gravity = 49;
        syaVar2.addView(ltVar, layoutParams3);
        tn tnVar = this.wie;
        if (tnVar != null && (zbVarMnf = tnVar.mnf()) != null) {
            String strDj = zbVarMnf.dj();
            if (!TextUtils.isEmpty(strDj)) {
                com.bytedance.sdk.openadsdk.xkz.ycx ycxVar = new com.bytedance.sdk.openadsdk.xkz.ycx(this);
                this.xym = ycxVar;
                ycxVar.setId(com.bytedance.sdk.openadsdk.utils.wie.uu);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                this.xym.setPadding(dc.zb(this, 16.0f), dc.zb(this, 16.0f), dc.zb(this, 16.0f), dc.zb(this, 16.0f));
                this.xym.setPrivacyText(strDj);
                layoutParams4.gravity = 80;
                syaVar2.addView(this.xym, layoutParams4);
            }
        }
        View okVar = new ok(this);
        okVar.setOnlyLoading(this.xz);
        okVar.setId(520093721);
        syaVar.addView(okVar, new FrameLayout.LayoutParams(-1, -1));
        return syaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void ul() {
        tn tnVar = this.wie;
        if (tnVar == null || tnVar.liq() != 4) {
            return;
        }
        syc sycVar = this.jc;
        if (sycVar != null) {
            sycVar.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.wie.jp);
        this.ea = button;
        if (button != null) {
            ycx(fby());
            if (this.pmi == null) {
                this.pmi = com.bytedance.sdk.openadsdk.thx.ycx.ycx.dj.ycx(this, TextUtils.isEmpty(this.dy) ? oby.zb(this.syc) : this.dy);
            }
            com.bytedance.sdk.openadsdk.core.sya.ycx ycxVar = new com.bytedance.sdk.openadsdk.core.sya.ycx(this, this.wie, this.dy, this.syc);
            ycxVar.ycx(false);
            this.ea.setOnClickListener(ycxVar);
            this.ea.setOnTouchListener(ycxVar);
            ycxVar.dj(true);
            ycxVar.ycx(this.pmi);
        }
    }

    private String fby() {
        tn tnVar = this.wie;
        if (tnVar != null && !TextUtils.isEmpty(tnVar.bah())) {
            this.rl = this.wie.bah();
        }
        return this.rl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ycx(String str) {
        if (TextUtils.isEmpty(str) || this.ea == null || isFinishing()) {
            return;
        }
        this.ea.setText(str);
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            super/*com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity*/.onConfigurationChanged(configuration);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRA==", "VOAOmg26YMCVWNZJhR6uC1PvI5IGuA==", 807);
        }
        ul();
    }

    private void jw() {
        while (true) {
            LinkedList<WeakReference<Activity>> linkedList = ul;
            if (linkedList.isEmpty()) {
                return;
            }
            Activity activity = linkedList.pollFirst().get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
                return;
            }
        }
    }

    public static void ycx(Context context, String str, String str2, int i2) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTHistoryLandingPageActivity.class);
        intent.putExtra("material_key", str);
        intent.putExtra("landing_url", str2);
        intent.putExtra("landing_index", i2);
        com.bytedance.sdk.component.utils.zb.ycx(context, intent, (zb.zb) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iYcx = this.wie != null ? av.ycx().ycx(this.wie) : -1;
            this.lt = iYcx;
            bundle.putInt("meta_index", iYcx);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRA==", "VOAelBW5QMmTXtZTjxSTPFr6KA==", 848);
        }
        super/*android.app.Activity*/.onSaveInstanceState(bundle);
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onDestroy() {
        super.onDestroy();
        Iterator<WeakReference<Activity>> it = ul.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity == this || activity == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void jc() {
        kgy kgyVar = new kgy(this);
        this.xkz = kgyVar;
        kgyVar.zb(this.fby).sya(this.ok).dj(this.ry).ycx(this.wie).zb(this.syc).ycx(this.wie.row()).lud(this.wie.wbt()).ycx(this.fby).zb("landingpage");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void zb() {
        if (isFinishing()) {
            return;
        }
        if (this.lud.get()) {
            ok();
            return;
        }
        if (this.zb == null) {
            ea();
        }
        wie wieVar = this.zb;
        if (wieVar != null) {
            wieVar.ycx();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ea() {
        try {
            if (this.zb == null) {
                wie wieVar = new wie(this.jw, this.wie);
                this.zb = wieVar;
                wieVar.setDislikeSource("landing_page");
                this.zb.setCallback(new wie.ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.5
                    public void ycx(View view) {
                        TTHistoryLandingPageActivity.this.dj.set(true);
                    }

                    public void zb(View view) {
                        TTHistoryLandingPageActivity.this.dj.set(false);
                    }

                    public void ycx(FilterWord filterWord) {
                        if (TTHistoryLandingPageActivity.this.lud.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTHistoryLandingPageActivity.this.lud.set(true);
                        TTHistoryLandingPageActivity.this.ry();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.zb);
            if (this.sya == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.jw);
                this.sya = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZZtZTiBiuL2vvKpAiv33OlkPDRA==", "UuAkgSe1esuJQdI=", 951);
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void ok() {
        TTAdDislikeToast tTAdDislikeToast = this.sya;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void ry() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.sya) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onStart() {
        super/*android.app.Activity*/.onStart();
        if (this.lt >= 0) {
            av.ycx().sya(this.lt);
            this.lt = -1;
        }
        com.bytedance.sdk.openadsdk.utils.dj.ycx(this, this.wie);
        tn tnVar = this.wie;
        if (tnVar != null) {
            tnVar.sg(1);
        }
    }

    public static class ycx implements com.bytedance.sdk.openadsdk.dj.ok {
        private final WeakReference<TTHistoryLandingPageActivity> dj;
        private final String sya;
        private final int ycx;
        private final tn zb;

        public ycx(int i2, tn tnVar, String str, TTHistoryLandingPageActivity tTHistoryLandingPageActivity) {
            this.ycx = i2;
            this.zb = tnVar;
            this.sya = str;
            this.dj = new WeakReference<>(tTHistoryLandingPageActivity);
        }

        public void ycx(int i2) {
            TTHistoryLandingPageActivity tTHistoryLandingPageActivity = this.dj.get();
            if (tTHistoryLandingPageActivity != null) {
                sya.ycx.ycx(this.ycx, tTHistoryLandingPageActivity.dv.get(), tTHistoryLandingPageActivity.tru.get(), tTHistoryLandingPageActivity.tn.get() - tTHistoryLandingPageActivity.tru.get(), this.zb, this.sya, i2);
            }
        }
    }

    static class zb implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.dj.ry> ycx;

        public zb(com.bytedance.sdk.openadsdk.dj.ry ryVar) {
            this.ycx = new WeakReference<>(ryVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            com.bytedance.sdk.openadsdk.dj.ry ryVar = this.ycx.get();
            if (ryVar != null) {
                ryVar.zb(i3);
            }
        }
    }

    static class sya implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.dj.ry> ycx;
        private final WeakReference<com.bytedance.sdk.openadsdk.common.lud> zb;

        public sya(com.bytedance.sdk.openadsdk.dj.ry ryVar, com.bytedance.sdk.openadsdk.common.lud ludVar) {
            this.ycx = new WeakReference<>(ryVar);
            this.zb = new WeakReference<>(ludVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.bytedance.sdk.openadsdk.dj.ry ryVar = this.ycx.get();
            if (ryVar != null) {
                ryVar.ycx(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.lud ludVar = this.zb.get();
            if (ludVar == null) {
                return false;
            }
            ludVar.ycx(motionEvent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zb(final String str) {
        com.bytedance.sdk.openadsdk.dy.dj.ycx("iab_more_options", false, new com.bytedance.sdk.openadsdk.dy.zb() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.6
            public com.bytedance.sdk.openadsdk.dy.ycx.sya ycx() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                return com.bytedance.sdk.openadsdk.dy.ycx.dj.zb().ycx("iab_more_options").zb(jSONObject.toString());
            }
        });
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
