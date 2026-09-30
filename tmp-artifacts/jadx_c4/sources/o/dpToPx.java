package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class dpToPx implements ALCFaceResult {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @Override // o.ALCFaceResult
    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i5 = onExtraCallback;
        int i6 = (i5 & 45) + (i5 | 45);
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 24 / 0;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i3 = onExtraCallback + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.ALCFaceResult
    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = (i4 & 99) + (i4 | 99);
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i7 = onNavigationEvent;
        int i8 = (i7 & 9) + (i7 | 9);
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onNavigationEvent();
        }
        super.onNavigationEvent();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onOutOfMemory.onNavigationEvent onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        if (i4 != 0) {
            int i5 = 86 / 0;
        }
        int i6 = onExtraCallback + 73;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    @Override // o.ALCFaceResult
    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = onNavigationEvent + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        webViewContentOwner.onUpdateWebHistoryState();
        int i5 = onNavigationEvent;
        int i6 = (i5 ^ 117) + ((i5 & 117) << 1);
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }
}
