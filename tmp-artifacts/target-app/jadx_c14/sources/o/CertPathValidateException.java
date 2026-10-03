package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.partner.PartnerGetClipboardTextHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CertPathValidateException implements ALCFaceResult {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 6578738384949167474L;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i6 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 64 / 0;
        }
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new PartnerGetClipboardTextHandler$.ExternalSyntheticLambda0());
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            filterCreatePageParams.asBinder(Uri.parse(str));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zAsBinder = filterCreatePageParams.asBinder(Uri.parse(str));
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zAsBinder;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        Object obj = "";
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        try {
            TossCoreWebView webView = webViewContentOwner.getWebView();
            if (webView == null || (strOnExtraCallbackWithResult = webView.onExtraCallbackWithResult()) == null) {
                int i2 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                strOnExtraCallbackWithResult = "";
            }
            Uri uri = Uri.parse(strOnExtraCallbackWithResult);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            String strOnExtraCallback = filterCreatePageParams.onExtraCallback(uri);
            Context context = webViewContentOwner.getContext();
            if (context == null) {
                Object[] objArr = new Object[1];
                a(new char[]{49190, 16303, 16161, 16062, 15924, 15780, 15663, 15558, 15364, 15259, 15191, 15004, 14860, 14824, 14703}, TextUtils.getCapsMode("", 0, 0) + 65413, objArr);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
            } else {
                Object objIAuthTabCallback = new X9ObjectIdentifiers(strOnExtraCallback).IAuthTabCallback(context);
                if (objIAuthTabCallback != null) {
                    obj = objIAuthTabCallback;
                }
                ALCFaceBox.onExtraCallback(settopguidebackgroundcolor, obj.toString());
            }
        } catch (Throwable th) {
            ALCFaceBox.onExtraCallbackWithResult(settopguidebackgroundcolor, th, (String) null, (Map) null, 6, (Object) null);
            int i4 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CertPathValidateException.a(char[], int, java.lang.Object[]):void");
    }
}
