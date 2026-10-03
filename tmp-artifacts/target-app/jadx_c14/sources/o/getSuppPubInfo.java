package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.partner.PartnerSetClipboardTextHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSuppPubInfo implements ALCFaceResult {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallbackWithResult = 6343164162562607956L;
    private static int onWarmupCompleted;

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(str, str2);
        int i4 = IAuthTabCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i6 = IAuthTabCallback + 123;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new PartnerSetClipboardTextHandler$.ExternalSyntheticLambda0());
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zAsBinder = filterCreatePageParams.asBinder(Uri.parse(str));
        int i4 = IAuthTabCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zAsBinder;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(webViewContentOwner, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(jsonObject, "");
                Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
                webViewContentOwner.getWebView();
                throw null;
            }
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            TossCoreWebView webView = webViewContentOwner.getWebView();
            if (webView == null || (strOnExtraCallbackWithResult = webView.onExtraCallbackWithResult()) == null) {
                int i3 = onWarmupCompleted + 49;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                strOnExtraCallbackWithResult = "";
            }
            setText settext = new setText(jsonObject);
            Object[] objArr = new Object[1];
            a(new char[]{52759, 62025, 46725, 31482}, 15440 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
            Uri uri = Uri.parse(strOnExtraCallbackWithResult);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            String strOnExtraCallback = filterCreatePageParams.onExtraCallback(uri);
            Context context = webViewContentOwner.getContext();
            if (context != null) {
                new X9ObjectIdentifiers(strOnExtraCallback).IAuthTabCallback(context, strOnNavigationEvent);
                setOnOutOfMemeryErrorCallback.onExtraCallback(settopguidebackgroundcolor, (Function1) null, 1, (Object) null);
                return;
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{52736, 35261, 16751, 6404, 53442, 43118, 24625, 15252, 62338, 19241, 681, 55958, 37466, 28146, 9633}, (Process.myTid() >> 22) + 18353, objArr2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr2[0]).intern(), (String) null, (Map) null, 6, (Object) null);
            int i5 = onWarmupCompleted + 117;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            ALCFaceBox.onExtraCallbackWithResult(settopguidebackgroundcolor, th, (String) null, (Map) null, 6, (Object) null);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 119;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 103;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.keyCodeFromString("") + 24, Gravity.getAbsoluteGravity(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 59 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (Process.myPid() >> 22) + 59, 6383 - (Process.myPid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }
}
