package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCImageUtil implements ALCFaceResult {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @Override // o.ALCFaceResult
    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = (i4 & 31) + (i4 | 31);
        int i6 = i5 % 128;
        onExtraCallback = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 7;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i9 != 0) {
            throw null;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = ((i2 | 121) << 1) - (i2 ^ 121);
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i5 = onWarmupCompleted + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.ALCFaceResult
    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
        int i6 = onExtraCallback;
        int i7 = (i6 ^ 87) + ((i6 & 87) << 1);
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = ((i2 | 9) << 1) - (i2 ^ 9);
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i5 = onExtraCallback + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = (i2 & 41) + (i2 | 41);
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i5 = onExtraCallback;
        int i6 = ((i5 | 75) << 1) - (i5 ^ 75);
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 83) + ((i2 & 83) << 1);
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onOutOfMemory.onNavigationEvent onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        int i5 = onExtraCallback;
        int i6 = (i5 ^ 25) + ((i5 & 25) << 1);
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
        return onnavigationevent;
    }

    @Override // o.ALCFaceResult
    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String strOnExtraCallback = settext.onExtraCallback();
        TossCoreWebView webView = webViewContentOwner.getWebView();
        Object obj = null;
        if (webView != null) {
            int i6 = onWarmupCompleted + 31;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            webView.setWebBridgeBackPressHandler(strOnExtraCallback);
            if (i7 == 0) {
                throw null;
            }
        }
        int i8 = onExtraCallback + 103;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
