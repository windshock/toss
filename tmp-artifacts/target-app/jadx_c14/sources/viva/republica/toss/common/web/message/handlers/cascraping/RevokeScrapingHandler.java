package viva.republica.toss.common.web.message.handlers.cascraping;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.RuntimeScheduler;
import o.TimelineExternalSyntheticLambda0;
import o.getPseudonym;
import o.getSemanticsIdentifier;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.setTopGuideBackgroundColor;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RevokeScrapingHandler extends getSemanticsIdentifier {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long extraCommand = -6952645234047461293L;
    private static int newSession = 1;
    private static int newSessionWithExtras;

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        getPseudonym getpseudonym;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView == null) {
            int i2 = newSession + 35;
            newSessionWithExtras = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        Object[] objArr = new Object[1];
        c(new char[]{36822, 51718, 61503, 50549, 36769, 26940, 46819, 12094, 707, 64184, 9330, 45733, 38218}, View.combineMeasuredStates(0, 0) + 1, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object tag = webView.getTag(R.id.ca_webview_scrapers);
        if (tag instanceof getPseudonym) {
            int i4 = newSession + 9;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
            getpseudonym = (getPseudonym) tag;
        } else {
            int i6 = newSessionWithExtras + 93;
            newSession = i6 % 128;
            int i7 = i6 % 2;
            getpseudonym = null;
        }
        if (getpseudonym != null) {
            int i8 = newSessionWithExtras + 55;
            newSession = i8 % 128;
            if (i8 % 2 == 0) {
                RuntimeScheduler.Companion.onExtraCallback(getpseudonym, strOnNavigationEvent);
                throw null;
            }
            RuntimeScheduler.Companion.onExtraCallback(getpseudonym, strOnNavigationEvent);
        }
        setOnOutOfMemeryErrorCallback.onExtraCallback(settopguidebackgroundcolor, (Function1) null, 1, (Object) null);
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(extraCommand ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 27;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(extraCommand)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 45812), View.resolveSizeAndState(0, 0, 0) + 84, TextUtils.lastIndexOf("", '0', 0, 0) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - TextUtils.getOffsetBefore("", 0)), 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 8808 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 11;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }
}
