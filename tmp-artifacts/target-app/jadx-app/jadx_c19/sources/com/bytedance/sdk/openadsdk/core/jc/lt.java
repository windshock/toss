package com.bytedance.sdk.openadsdk.core.jc;

import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.bytedance.sdk.component.jw.fby;
import com.bytedance.sdk.component.utils.jw;
import com.bytedance.sdk.component.utils.pmi;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.ry;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.xkz.lud;
import com.bytedance.sdk.openadsdk.core.yzp;
import com.bytedance.sdk.openadsdk.utils.oby;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends fby implements sya$sya {
    protected boolean dj;
    private long dy;
    private String ea;
    private hf fby;
    private tn jc;
    private sya jw;
    AtomicBoolean lt;
    protected boolean lud;
    private int ok;
    private List<String> ry;
    private int syc;
    AtomicBoolean ul;
    private zb xkz;

    public interface zb {
        View ycx();

        void ycx(int i2, int i3);

        void ycx(View view, int i2);

        void zb();
    }

    public lt(Context context) {
        super(context, fby.sya.ul);
        this.dj = false;
        this.lud = false;
        this.lt = new AtomicBoolean(false);
        this.ul = new AtomicBoolean(false);
        this.ok = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ycx(tn tnVar, zb zbVar, String str) {
        this.xkz = zbVar;
        this.jc = tnVar;
        this.ea = str;
        this.jw = new sya();
        this.fby = new hf(getContext());
        setWebViewClient(new ycx(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.jc.lt.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i2) {
                lt.this.syc = i2;
                super.onProgressChanged(webView, i2);
                if (i2 >= 100) {
                    lt.this.ycx();
                }
            }
        });
        jw.zb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jc.lt.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = lt.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.jc.lt.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            lt.this.fby.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    private void thx() {
        if (this.ry == null) {
            com.bytedance.sdk.openadsdk.dj.sya.zb(this.jc, this.ea, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.dj.sya.ycx(new com.bytedance.sdk.component.fby.zb.sya("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.jc.lt.3
                private static int $10 = 0;
                private static int $11 = 1;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;
                private static char[] onNavigationEvent = {27255, 27169, 27198};

                public void run() throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 101;
                    onExtraCallback = i3 % 128;
                    try {
                        if (i3 % 2 == 0) {
                            int i4 = 65 / 0;
                            if (lt.this.ry == null) {
                                return;
                            }
                        } else if (lt.this.ry == null) {
                            return;
                        }
                        Object obj = null;
                        if (lt.this.ul.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = lt.this.ry.iterator();
                            while (it.hasNext()) {
                                int i5 = onExtraCallbackWithResult + 17;
                                onExtraCallback = i5 % 128;
                                if (i5 % 2 == 0) {
                                    jSONArray.put((String) it.next());
                                    obj.hashCode();
                                    throw null;
                                }
                                jSONArray.put((String) it.next());
                            }
                            Object[] objArr = new Object[1];
                            a(new int[]{0, 3, 0, 2}, false, new byte[]{0, 0, 1}, objArr);
                            jSONObject.put(((String) objArr[0]).intern(), jSONArray);
                            com.bytedance.sdk.openadsdk.dj.sya.zb(lt.this.jc, lt.this.ea, "dsp_html_error_url", jSONObject);
                            lt.this.ry = null;
                        }
                        int i6 = onExtraCallback + 53;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "f/09vRexZfCFSOFUiQbkew==", "Sfsj", RVParams.WEBVIEW_FONT_SIZE_LARGER);
                    }
                }

                private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                    char[] cArr;
                    char c;
                    int i2 = 2 % 2;
                    TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int i5 = iArr[2];
                    int i6 = iArr[3];
                    char[] cArr2 = onNavigationEvent;
                    Object obj = null;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        for (int i7 = 0; i7 < length; i7++) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.MeasureSpec.getMode(0) + 35, View.MeasureSpec.getSize(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                                }
                                cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2 = cArr3;
                    }
                    char[] cArr4 = new char[i4];
                    System.arraycopy(cArr2, i3, cArr4, 0, i4);
                    if (bArr != null) {
                        int i8 = $11 + 125;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            cArr = new char[i4];
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                            c = 1;
                        } else {
                            cArr = new char[i4];
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                            c = 0;
                        }
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                            if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                                int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 10935), TextUtils.indexOf("", "", 0, 0) + 65, 16717 - ((byte) KeyEvent.getModifierMetaStateMask()), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                            } else {
                                int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 29, ((byte) KeyEvent.getModifierMetaStateMask()) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                            }
                            c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                            try {
                                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 49467), View.getDefaultSize(0, 0) + 70, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                                }
                                obj = null;
                                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        int i11 = $11 + 11;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr4 = cArr;
                    }
                    if (i6 > 0) {
                        char[] cArr5 = new char[i4];
                        System.arraycopy(cArr4, 0, cArr5, 0, i4);
                        int i13 = i4 - i6;
                        System.arraycopy(cArr5, 0, cArr4, i13, i6);
                        System.arraycopy(cArr5, i6, cArr4, 0, i13);
                    }
                    if (z) {
                        char[] cArr6 = new char[i4];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                            cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                            trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                        }
                        cArr4 = cArr6;
                    }
                    if (i5 > 0) {
                        int i14 = $11 + 107;
                        $10 = i14 % 128;
                        char c2 = 2;
                        if (i14 % 2 != 0) {
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                        } else {
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        }
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                            cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[c2]);
                            trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                            c2 = 2;
                        }
                    }
                    String str = new String(cArr4);
                    int i15 = $11 + 69;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    objArr[0] = str;
                }
            });
        }
    }

    public void dy() {
        this.jw.zb();
        super.dy();
    }

    public void ycx(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.jw.ycx(view, friendlyObstructionPurpose);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.dj) {
            this.jw.ycx(getWebView());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onVisibilityChanged(@NonNull View view, int i2) {
        super/*android.view.View*/.onVisibilityChanged(view, i2);
        boolean z = i2 == 0;
        this.lud = z;
        this.jw.ycx(z);
    }

    public void onDetachedFromWindow() {
        this.jw.ycx();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.syc / 100.0f);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "f/09vRexZfCFSOFUiQY=", "VOAJkBe9as+FTvFPgxyXIVXqIoI=", 191);
        }
        com.bytedance.sdk.openadsdk.dj.sya.zb(this.jc, this.ea, "load_rate", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.jc.sya$sya
    public void ycx(String str) {
        boolean zYcx;
        if (TextUtils.isEmpty(str) || this.jc == null || !this.fby.zb()) {
            return;
        }
        int iYcx = oby.ycx(this.ea);
        View viewYcx = null;
        if (!pmi.ycx(str) && (this.jc.sjd() == null || TextUtils.isEmpty(this.jc.sjd().ycx()))) {
            ry ryVar = new ry();
            ryVar.ycx(str);
            this.jc.ycx(ryVar);
            str = null;
        }
        this.jc.dj(true);
        tn tnVar = this.jc;
        if (tnVar == null || tnVar.sjd() == null || TextUtils.isEmpty(this.jc.sjd().ycx())) {
            zYcx = false;
        } else {
            zYcx = yzp.ycx(getContext(), this.jc, iYcx, this.ea, true, (Map) null);
            if (!zYcx && !TextUtils.isEmpty(this.jc.sjd().zb())) {
                str = this.jc.sjd().zb();
                com.bytedance.sdk.openadsdk.dj.sya.ycx(this.jc, this.ea, "open_fallback_url", (Map) null);
            }
        }
        String str2 = str;
        if (!zYcx) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                yzp.ycx(getContext(), this.jc, iYcx, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.dj.ycx) null, this.ea, true, str2);
            }
        }
        if (this.fby != null) {
            zb zbVar = this.xkz;
            if (zbVar != null) {
                viewYcx = zbVar.ycx();
                this.xkz.ycx((View) this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.ok okVarYcx = this.fby.ycx(getContext(), viewYcx);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.dj.sya.ycx("click", this.jc, okVarYcx, this.ea, true, map, this.fby.zb() ? 1 : 2);
        }
        hf hfVar = this.fby;
        if (hfVar != null) {
            hfVar.ycx();
        }
    }

    public void uh() {
        zb zbVar = this.xkz;
        if (zbVar != null) {
            zbVar.zb();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.dy);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "f/09vRexZfCFSOFUiQY=", "SesjkQauWtKDSdJOnw==", 259);
        }
        com.bytedance.sdk.openadsdk.dj.sya.zb(this.jc, this.ea, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jc.sya$sya
    public void ycx(int i2, int i3) {
        zb zbVar = this.xkz;
        if (zbVar != null) {
            zbVar.ycx(i2, i3);
        }
        this.ok = i3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i3);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.dy);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "f/09vRexZfCFSOFUiQY=", "SesjkQauT8aJRg==", 274);
        }
        com.bytedance.sdk.openadsdk.dj.sya.zb(this.jc, this.ea, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jc.sya$sya
    public void zb(String str) {
        if (this.ry == null) {
            this.ry = new ArrayList();
        }
        this.ry.add(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jc.sya$sya
    public void ycx() {
        if (this.lt.compareAndSet(false, true)) {
            this.dj = true;
            this.jw.ycx(getWebView());
            this.jw.ycx(this.lud);
            uh();
            thx();
        }
    }

    public void htf() {
        this.lt.set(false);
        String strRc = this.jc.rc();
        if (TextUtils.isEmpty(strRc)) {
            return;
        }
        String strYcx = lud.ycx(strRc);
        String str = !TextUtils.isEmpty(strYcx) ? strYcx : strRc;
        this.ok = 0;
        ycx((String) null, str, "text/html", HexStringUtil.DEFAULT_CHARSET_NAME, (String) null);
        this.dy = SystemClock.elapsedRealtime();
    }

    static class ycx extends fby.ycx {
        public static final Set<String> ycx = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.jc.lt.ycx.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        sya$sya zb;

        public ycx(sya$sya sya_sya) {
            this.zb = sya_sya;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.zb.ycx(str);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super/*android.webkit.WebViewClient*/.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                ycx(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            ycx(webResourceRequest.getUrl().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super/*android.webkit.WebViewClient*/.onReceivedError(webView, i2, str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super/*android.webkit.WebViewClient*/.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            ycx(webResourceRequest.getUrl().toString());
        }

        private void ycx(String str) {
            int iLastIndexOf;
            sya$sya sya_sya;
            if (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(".")) <= 0) {
                return;
            }
            if (!ycx.contains(str.substring(iLastIndexOf).toLowerCase()) || (sya_sya = this.zb) == null) {
                return;
            }
            sya_sya.zb(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onPageFinished(WebView webView, String str) {
            super/*android.webkit.WebViewClient*/.onPageFinished(webView, str);
            sya$sya sya_sya = this.zb;
            if (sya_sya != null) {
                sya_sya.ycx();
            }
        }

        private void ycx(String str, int i2, String str2) {
            sya$sya sya_sya = this.zb;
            if (sya_sya != null) {
                sya_sya.ycx(106, i2);
            }
        }
    }

    public static class sya {
        protected int ycx = 0;
        private com.bytedance.sdk.openadsdk.core.xkz.lt zb = com.bytedance.sdk.openadsdk.core.xkz.lt.ycx();

        sya() {
        }

        public void ycx(WebView webView) {
            if (webView == null || this.ycx != 0) {
                return;
            }
            if (this.zb == null) {
                this.zb = com.bytedance.sdk.openadsdk.core.xkz.lt.ycx();
            }
            this.zb.ycx(webView);
            this.zb.zb();
            this.ycx = 1;
        }

        public void ycx(boolean z) {
            com.bytedance.sdk.openadsdk.core.xkz.lt ltVar;
            if (this.ycx == 1 && z && (ltVar = this.zb) != null) {
                ltVar.sya();
                this.ycx = 3;
            }
        }

        public void ycx(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.xkz.lt ltVar = this.zb;
            if (ltVar != null) {
                ltVar.ycx(view, friendlyObstructionPurpose);
            }
        }

        public void ycx() {
            com.bytedance.sdk.openadsdk.core.xkz.lt ltVar;
            int i2 = this.ycx;
            if (i2 != 0 && i2 != 4 && (ltVar = this.zb) != null) {
                ltVar.dj();
            }
            this.ycx = 4;
            this.zb = null;
        }

        public void zb() {
            ycx();
        }
    }
}
