package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCTimerLabelExternalSyntheticLambda0 implements ALCFaceResult {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onExtraCallback();
        }
        super.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceResult
    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i6 = onWarmupCompleted + 65;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return super.onExtraCallbackWithResult();
        }
        super.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceResult
    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = ((i4 | 27) << 1) - (i4 ^ 27);
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i5 = onExtraCallback + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return super.onWarmupCompleted(str);
        }
        super.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceResult
    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        TossCoreWebView webView = webViewContentOwner.getWebView();
        int i5 = onWarmupCompleted;
        int i6 = (i5 ^ 3) + ((i5 & 3) << 1);
        int i7 = i6 % 128;
        onExtraCallback = i7;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (webView != null) {
            int i8 = (i7 ^ 91) + ((i7 & 91) << 1);
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            webView.clearHistory();
            int i10 = onWarmupCompleted;
            int i11 = (i10 ^ 79) + ((i10 & 79) << 1);
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        webViewContentOwner.onHistoryCleared();
        int i13 = onWarmupCompleted;
        int i14 = (i13 & 103) + (i13 | 103);
        onExtraCallback = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }
}
