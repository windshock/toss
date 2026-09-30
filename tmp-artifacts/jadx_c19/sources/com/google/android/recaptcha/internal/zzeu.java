package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzeu extends WebViewClient {
    final /* synthetic */ zzez zza;

    zzeu(zzez zzezVar) {
        this.zza = zzezVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(@NotNull WebView webView, @NotNull String str) {
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@NotNull WebView webView, @NotNull String str) {
        zzez zzezVar = this.zza;
        zzezVar.zzi.zza(zzezVar.zzp.zza(zzne.zzc));
        zzv.zza(zzx.zzl.zza(), this.zza.zzn.zza(TimeUnit.MICROSECONDS));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onReceivedError(@NotNull WebView webView, int i2, @NotNull String str, @NotNull String str2) {
        super.onReceivedError(webView, i2, str, str2);
        zzn zznVar = zzn.zze;
        zzl zzlVar = (zzl) this.zza.zzk.get(Integer.valueOf(i2));
        if (zzlVar == null) {
            zzlVar = zzl.zzY;
        }
        zzp zzpVar = new zzp(zznVar, zzlVar, null);
        this.zza.zzk().hashCode();
        zzpVar.getMessage();
        this.zza.zzk().onExtraCallback(zzpVar);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView webView, @NotNull String str) {
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNull(uri);
        if (!zzfb.zzb(uri) || zzfb.zza(uri)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzp zzpVar = new zzp(zzn.zzc, zzl.zzac, null);
        this.zza.zzk().hashCode();
        this.zza.zzk().onExtraCallback(zzpVar);
        return new WebResourceResponse("text/plain", HexStringUtil.DEFAULT_CHARSET_NAME, new ByteArrayInputStream(new byte[0]));
    }
}
