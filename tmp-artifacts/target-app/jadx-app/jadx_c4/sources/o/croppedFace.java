package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.core.webkit.bridge.SetPageReadyHandler$;
import im.toss.uikit.base.UIKitBaseActivity;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class croppedFace implements ALCFaceResult {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ void onExtraCallback(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(uIKitBaseActivity);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        int i4 = onExtraCallbackWithResult;
        int i5 = (i4 & 41) + (i4 | 41);
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Override // o.ALCFaceResult
    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = (i4 ^ 85) + ((i4 & 85) << 1);
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 37;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i8 = onExtraCallbackWithResult;
        int i9 = (i8 & 81) + (i8 | 81);
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 33 / 0;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 121) + ((i2 & 121) << 1);
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i5 = onExtraCallbackWithResult;
        int i6 = (i5 ^ 57) + ((i5 & 57) << 1);
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // o.ALCFaceResult
    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = ((i4 | 45) << 1) - (i4 ^ 45);
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i6 != 0) {
            int i7 = 97 / 0;
        }
        int i8 = onExtraCallbackWithResult + 13;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 93 / 0;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onNavigationEvent();
        }
        super.onNavigationEvent();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onWarmupCompleted(str);
        }
        super.onWarmupCompleted(str);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r5.isFinishing() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if ((r5 instanceof im.toss.uikit.base.UIKitBaseActivity) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r6 = o.croppedFace.onExtraCallbackWithResult;
        r7 = (r6 ^ 31) + ((r6 & 31) << 1);
        r6 = r7 % 128;
        o.croppedFace.onExtraCallback = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if ((r7 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r2 = r5;
        r5 = (r6 ^ 17) + ((r6 & 17) << 1);
        o.croppedFace.onExtraCallbackWithResult = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        r5 = o.croppedFace.onExtraCallbackWithResult;
        r6 = (r5 ^ 7) + ((r5 & 7) << 1);
        o.croppedFace.onExtraCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if ((r6 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        onNavigationEvent(r2);
        r5 = 43 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        onNavigationEvent(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        r5 = o.croppedFace.onExtraCallback;
        r6 = (r5 & 81) + (r5 | 81);
        o.croppedFace.onExtraCallbackWithResult = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if ((r6 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r5 = 4 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        r4.onPageReady();
        r4 = o.croppedFace.onExtraCallbackWithResult + 67;
        o.croppedFace.onExtraCallback = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if ((r4 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        r4 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r5.isFinishing() != false) goto L33;
     */
    @Override // o.ALCFaceResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = onExtraCallback + 1;
        onExtraCallbackWithResult = i5 % 128;
        UIKitBaseActivity uIKitBaseActivity = null;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        UIKitBaseActivity activity = webViewContentOwner.getActivity();
        if (activity != null) {
            int i6 = onExtraCallbackWithResult;
            int i7 = ((i6 | 93) << 1) - (i6 ^ 93);
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 82 / 0;
            }
        }
        int i9 = onExtraCallback + 125;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (uIKitBaseActivity.MediaSessionCompatQueueItem()) {
            Handler handler = new Handler(Looper.getMainLooper());
            SetPageReadyHandler$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new SetPageReadyHandler$.ExternalSyntheticLambda0(uIKitBaseActivity);
            int i4 = onExtraCallbackWithResult;
            int i5 = ((i4 | 103) << 1) - (i4 ^ 103);
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            handler.postDelayed(externalSyntheticLambda0, 2000L);
        }
        int i7 = onExtraCallback;
        int i8 = ((i7 | 49) << 1) - (i7 ^ 49);
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final void IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        UIKitBaseActivity.onWarmupCompleted(uIKitBaseActivity, true, (Function0) null, 2, (Object) null);
        int i4 = onExtraCallback;
        int i5 = ((i4 | 3) << 1) - (i4 ^ 3);
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }
}
