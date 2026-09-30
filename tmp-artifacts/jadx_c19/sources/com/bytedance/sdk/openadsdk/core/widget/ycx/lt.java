package com.bytedance.sdk.openadsdk.core.widget.ycx;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.alibaba.ariver.kernel.RVParams;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.component.utils.tru;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.syc;
import com.bytedance.sdk.openadsdk.dy.ycx.ycx$ycx;
import com.bytedance.sdk.openadsdk.utils.dc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt implements tru.ycx {
    private boolean aeu;
    WebView dj;
    long dy;
    float ea;
    boolean fby;
    int jc;
    String jw;
    float ok;
    boolean pmi;
    private long rmf;
    float ry;
    float syc;
    private final boolean tru;
    long uh;
    boolean ul;
    boolean wie;
    float xkz;
    Context ycx;
    tn zb;
    private final Handler hf = new tru(syc.zb().getLooper(), this);
    String sya = "landingpage";
    int lt = 0;
    private final String bhi = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String av = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    ycx dv = new ycx() { // from class: com.bytedance.sdk.openadsdk.core.widget.ycx.lt.1
        public void ycx() {
            lt ltVar = lt.this;
            ltVar.fby = true;
            ltVar.lt();
            lt ltVar2 = lt.this;
            ltVar2.ycx(2, ltVar2.jw, ltVar2.jc);
        }
    };
    GestureDetector oty = new GestureDetector(pmi.ycx(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ycx.lt.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            lt.this.wie = true;
            return false;
        }
    });
    int lud = pmi.dj().htf();
    Map<Integer, Long> htf = new HashMap();
    Map<Integer, Float> thx = new HashMap();
    Map<Integer, Long> wwx = new HashMap();
    List<Integer> tn = new ArrayList();

    public lt(WebView webView, tn tnVar, Context context, boolean z) {
        this.zb = tnVar;
        this.dj = webView;
        this.ycx = context;
        this.tru = z;
    }

    public void ycx(String str) {
        this.sya = str;
    }

    public void zb(String str) {
        this.jw = str;
        fby();
        this.htf.put(Integer.valueOf(this.jc), Long.valueOf(SystemClock.elapsedRealtime()));
        this.wwx.put(Integer.valueOf(this.jc), Long.valueOf(SystemClock.elapsedRealtime()));
        this.aeu = lud();
    }

    public void ycx() {
        zb(this.jc);
    }

    public void ycx(int i2) {
        float height = (i2 + this.dj.getHeight()) / dc.zb(this.ycx, this.dj.getContentHeight());
        Float f = this.thx.get(Integer.valueOf(this.jc));
        if (height > (f == null ? 0.0f : f.floatValue())) {
            this.thx.put(Integer.valueOf(this.jc), Float.valueOf(height));
        }
    }

    public void zb() {
        this.dj.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ycx.lt.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                if (!z) {
                    lt ltVar = lt.this;
                    if (!ltVar.fby) {
                        ltVar.lt();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - lt.this.rmf >= 50) {
                            lt ltVar2 = lt.this;
                            ltVar2.ycx(3, ltVar2.jw, ltVar2.jc);
                            lt.this.rmf = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    ltVar.fby = false;
                }
                if (z) {
                    lt.this.fby();
                    lt ltVar3 = lt.this;
                    ltVar3.htf.put(Integer.valueOf(ltVar3.jc), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    public void sya(String str) {
        if (this.ul) {
            this.pmi = true;
        }
        if (this.jc == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf("&", iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            dj(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public void ycx(MotionEvent motionEvent) {
        this.oty.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ea = motionEvent.getX();
            this.ok = motionEvent.getY();
            this.dy = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            sya(2);
        } else {
            this.uh = SystemClock.elapsedRealtime() - this.dy;
            if (zb(motionEvent)) {
                dj();
            } else {
                sya(1);
            }
        }
    }

    public ycx sya() {
        return this.dv;
    }

    private void dj(String str) {
        if (ul()) {
            return;
        }
        com.bytedance.sdk.openadsdk.dj.sya.ycx(this.zb, new ycx$ycx().ycx(this.jw).zb(Uri.decode(str)).ycx(), this.sya);
    }

    private void zb(int i2) {
        if (ul() || this.tn.contains(Integer.valueOf(i2))) {
            return;
        }
        this.tn.add(Integer.valueOf(i2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.dj.sya.zb(this.zb, new ycx$ycx().ycx(this.jw).ycx(this.jc).jc(jElapsedRealtime - (this.wwx.get(Integer.valueOf(i2)) != null ? r6.longValue() : jElapsedRealtime)).ycx(), this.sya);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx(int i2, String str, int i3) {
        if (ul()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.htf.get(Integer.valueOf(i3));
        long jLongValue = l != null ? l.longValue() : jElapsedRealtime;
        Float f = this.thx.get(Integer.valueOf(i3));
        com.bytedance.sdk.openadsdk.dj.sya.sya(this.zb, new ycx$ycx().ycx(str).ycx(i3).fby(jElapsedRealtime - jLongValue).jw(f == null ? 0.0f : f.floatValue()).zb(i2).ycx(), this.sya);
    }

    private void dj() {
        if (ul()) {
            return;
        }
        com.bytedance.sdk.openadsdk.dy.ycx.ycx ycxVarYcx = new ycx$ycx().ycx(this.jw).ycx(this.jc).dj(this.ea).lud(this.ok).lt(this.syc).ul(this.uh).ycx();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = ycxVarYcx;
        this.hf.sendMessageDelayed(messageObtain, 20L);
    }

    private void sya(int i2) {
        if (ul()) {
            return;
        }
        lt();
        this.ul = true;
        com.bytedance.sdk.openadsdk.dy.ycx.ycx ycxVarYcx = new ycx$ycx().ycx(this.jw).ycx(this.jc).ycx(this.ea).zb(this.ok).sya(this.uh).sya(i2).ycx();
        try {
            if (this.aeu) {
                WebView.HitTestResult hitTestResult = this.dj.getHitTestResult();
                ycxVarYcx.ycx(hitTestResult.getExtra());
                ycxVarYcx.ycx(hitTestResult.getType());
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+SSRBLl9iZdP1UuFFLc=", "bOsvtBG+YNOSS9BYrhSoKU3nIoc=", "S/wilgaveuSMQ9RWqQelJk8=", 340);
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = RVParams.WEBVIEW_FONT_SIZE_LARGEST;
        messageObtain.obj = ycxVarYcx;
        this.hf.sendMessageDelayed(messageObtain, 100L);
    }

    private boolean lud() {
        try {
            int i2 = this.jc;
            if (i2 != 2 && i2 != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.jw)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.jw);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+SSRBLl9iZdP1UuFFLc=", "bOsvtBG+YNOSS9BYrhSoKU3nIoc=", "TvwhuAKoas+yT9BYlA==", 354);
            htf.sya("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lt() {
        if (this.thx.get(Integer.valueOf(this.jc)) != null) {
            return;
        }
        float height = this.dj.getHeight() / dc.zb(this.ycx, this.dj.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.thx.put(Integer.valueOf(this.jc), Float.valueOf(height));
    }

    private boolean ul() {
        int i2 = this.lt + 1;
        this.lt = i2;
        if (i2 > this.lud) {
            return true;
        }
        return ("landingpage".equals(this.sya) || "landingpage_endcard".equals(this.sya) || "landingpage_split_screen".equals(this.sya) || "landingpage_direct".equals(this.sya) || "landingpage_split_ceiling".equals(this.sya)) ? false : true;
    }

    private boolean zb(MotionEvent motionEvent) {
        this.ry = motionEvent.getX();
        float y = motionEvent.getY();
        this.xkz = y;
        float f = y - this.ok;
        if (f == 0.0f) {
            return false;
        }
        this.syc = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fby() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.dj.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.jc = currentIndex + 1;
            if (this.tru) {
                this.jc = currentIndex + 2;
            }
        }
    }

    public void ycx(Message message) {
        int i2 = message.what;
        com.bytedance.sdk.openadsdk.dy.ycx.ycx ycxVar = (com.bytedance.sdk.openadsdk.dy.ycx.ycx) message.obj;
        if (i2 == 100) {
            ycxVar.dj(this.wie ? 2 : 1);
            com.bytedance.sdk.openadsdk.dj.sya.dj(this.zb, ycxVar, this.sya);
            this.wie = false;
        } else if (i2 == 200) {
            if (this.pmi) {
                ycx(1, ycxVar.sya(), ycxVar.dj());
            }
            ycxVar.sya(this.pmi ? 1 : 0);
            com.bytedance.sdk.openadsdk.dj.sya.lud(this.zb, ycxVar, this.sya);
            this.ul = false;
            this.pmi = false;
        }
    }
}
