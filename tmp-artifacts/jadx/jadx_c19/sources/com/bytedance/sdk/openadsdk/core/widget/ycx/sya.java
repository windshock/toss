package com.bytedance.sdk.openadsdk.core.widget.ycx;

import android.content.MutableContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.MessageQueue;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.ariver.kernel.RVParams;
import com.bytedance.sdk.component.adexpress.lud.lud;
import com.bytedance.sdk.component.adexpress.ycx.zb.zb;
import com.bytedance.sdk.component.jw.fby;
import com.bytedance.sdk.component.jw.ul;
import com.bytedance.sdk.component.utils.bhi;
import com.bytedance.sdk.openadsdk.core.kgy;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.utils.htf;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya implements zb {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -3149221662202102442L;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final MessageQueue dj;
    private final boolean lud;
    private final AtomicInteger sya;
    kgy ycx;
    private fby zb;

    static /* synthetic */ MessageQueue sya(sya syaVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        MessageQueue messageQueue = syaVar.dj;
        int i6 = i3 + 9;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return messageQueue;
    }

    static /* synthetic */ AtomicInteger ycx(sya syaVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        AtomicInteger atomicInteger = syaVar.sya;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 119;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
        return atomicInteger;
    }

    static /* synthetic */ boolean zb(sya syaVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean z = syaVar.lud;
        int i6 = i3 + 71;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 42 / 0;
        }
        return z;
    }

    public sya(int i2, boolean z, MessageQueue messageQueue) {
        this.sya = new AtomicInteger(i2);
        this.lud = z;
        this.dj = messageQueue;
    }

    public void zb() throws Throwable {
        fby.sya syaVar;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.sya.get() > 0) {
                Objects.toString(this.sya);
                String strDj = zb.dj((String) null);
                if (this.lud) {
                    String strDj2 = zb.dj("v3");
                    if (strDj != null && strDj.equals(strDj2)) {
                        return;
                    } else {
                        strDj = strDj2;
                    }
                }
                if (TextUtils.isEmpty(strDj)) {
                    return;
                }
                try {
                    MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(pmi.ycx());
                    if (this.lud) {
                        syaVar = fby.sya.zb;
                    } else {
                        fby.sya syaVar2 = fby.sya.ycx;
                        int i4 = onExtraCallback + 123;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        syaVar = syaVar2;
                    }
                    fby fbyVar = new fby(mutableContextWrapper, syaVar);
                    this.zb = fbyVar;
                    if (fbyVar.getWebView() == null) {
                        return;
                    }
                    if (bhi.ycx()) {
                        this.zb.setWebViewClient(new fby.ycx());
                    } else {
                        this.zb.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.ycx.sya.1
                            @Override // android.webkit.WebViewClient
                            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                                return true;
                            }
                        });
                    }
                    ycx(this.zb);
                    Uri.Builder builderBuildUpon = Uri.parse(strDj).buildUpon();
                    Object[] objArr = new Object[1];
                    a(new char[]{63568}, 5717 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                    Uri uriBuild = builderBuildUpon.appendQueryParameter("isPreLoad", ((String) objArr[0]).intern()).build();
                    kgy kgyVar = new kgy(this.zb.getContext());
                    this.ycx = kgyVar;
                    kgyVar.zb(this.zb).ycx(this).ycx(this.zb);
                    lud.ycx().ycx(this.zb, this.ycx);
                    this.zb.a_(uriBuild.toString());
                    return;
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+SSRBLl9iZdP1UuFFLc=", "a/wouQy9bfCFSOFUiQY=", "S/wouQy9bfCFSOFUiQY=", 70);
                    return;
                }
            }
            return;
        }
        this.sya.get();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, 19627 - TextUtils.getOffsetBefore("", 0), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i5 = $10 + 5;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 5;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i7 = $10 + 85;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 60, 6384 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            j = 0;
        }
        objArr[0] = new String(cArr2);
    }

    private void ycx(fby fbyVar) {
        int i2 = 2 % 2;
        if (fbyVar == null || fbyVar.getWebView() == null) {
            return;
        }
        int i3 = onExtraCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                fbyVar.setUserAgentString(htf.ycx(fbyVar.getWebView(), 542));
                if (bhi.zb()) {
                    return;
                }
            } else {
                fbyVar.setUserAgentString(htf.ycx(fbyVar.getWebView(), 8204));
                if (bhi.zb()) {
                    return;
                }
            }
            int i4 = onExtraCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ul.ycx(pmi.ycx()).ycx(false).ycx(fbyVar.getWebView());
            fbyVar.setVerticalScrollBarEnabled(false);
            fbyVar.setHorizontalScrollBarEnabled(false);
            fbyVar.xkz();
            fbyVar.setMixedContentMode(0);
            fbyVar.setJavaScriptEnabled(true);
            fbyVar.setJavaScriptCanOpenWindowsAutomatically(true);
            fbyVar.setDomStorageEnabled(true);
            fbyVar.setDatabaseEnabled(true);
            fbyVar.setCacheMode(-1);
            fbyVar.setAllowFileAccess(false);
            fbyVar.setSupportZoom(true);
            fbyVar.setBuiltInZoomControls(true);
            fbyVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            fbyVar.setUseWideViewPort(true);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+SSRBLl9iZdP1UuFFLc=", "a/wouQy9bfCFSOFUiQY=", "UuAkgTS5a/GJT8BuiQW0IVXp", 137);
            com.bytedance.sdk.component.utils.htf.sya("WebViewPool", th.toString());
        }
    }

    public void ycx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.lud) {
            lud.ycx().dj(this.zb);
        } else {
            lud.ycx().lud(this.zb);
        }
        try {
            this.sya.get();
            this.sya.decrementAndGet();
            if (this.sya.get() > 0) {
                int i4 = onExtraCallbackWithResult + 107;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                MessageQueue messageQueue = this.dj;
                if (messageQueue != null) {
                    messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.ycx.sya.2
                        @Override // android.os.MessageQueue.IdleHandler
                        public boolean queueIdle() throws Throwable {
                            new sya(sya.ycx(sya.this).get(), sya.zb(sya.this), sya.sya(sya.this)).zb();
                            return false;
                        }
                    });
                }
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+SSRBLl9iZdP1UuFFLc=", "a/wouQy9bfCFSOFUiQY=", "UuAkgTG5Z8OFWPFUghizIA==", 164);
            e.getMessage();
            int i6 = onExtraCallback + 105;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }
}
