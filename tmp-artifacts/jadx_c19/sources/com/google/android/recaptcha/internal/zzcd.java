package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import o.access13800;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcd {
    private final WebView zza;
    private final findResAndMsg zzb;

    public zzcd(@NotNull WebView webView, @NotNull findResAndMsg findresandmsg) {
        this.zza = webView;
        this.zzb = findresandmsg;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        maybeUpdateAnimatable.onNavigationEvent(this.zzb, (CoroutineContext) null, (setRandomHost) null, new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, (access13800) null), 3, (Object) null);
    }
}
