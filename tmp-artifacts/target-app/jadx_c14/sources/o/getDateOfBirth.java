package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDateOfBirth extends getSemanticsIdentifier {
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 135;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int prefetch = 0;
    private static int postMessage = 1;
    private static int extraCommand = 478308897;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, int r8) {
        /*
            byte[] r0 = o.getDateOfBirth.$$a
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = r8 + 105
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDateOfBirth.$$c(int, byte, int):java.lang.String");
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        getPseudonym getpseudonym;
        RuntimeScheduler next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView != null) {
            int i2 = prefetch + 59;
            postMessage = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            c(new char[]{65531, 65529, 65531, 65535, '\f', 65531, '\b', '\b'}, 7 - Color.blue(0), false, 8 - TextUtils.getOffsetBefore("", 0), 113 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
            Object[] objArr2 = new Object[1];
            c(new char[]{6, 65530, 65527, 5, 2, 15, 65527}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, true, KeyEvent.keyCodeFromString("") + 7, 114 - TextUtils.indexOf("", "", 0), objArr2);
            Object obj = null;
            JsonObject jsonObject2 = (JsonObject) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2139313042, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2139313040, new Object[]{settext, ((String) objArr2[0]).intern(), null, 2, null});
            Object[] objArr3 = new Object[1];
            c(new char[]{1, 5, 65522, 65534, 1, 19, 0, 65509, 19}, 6 - View.getDefaultSize(0, 0), true, (ViewConfiguration.getPressedStateDuration() >> 16) + 9, 108 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
            String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
            Object tag = webView.getTag(R.id.ca_webview_scrapers);
            if (tag instanceof getPseudonym) {
                int i4 = prefetch + 49;
                postMessage = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                getpseudonym = (getPseudonym) tag;
            } else {
                getpseudonym = null;
            }
            if (getpseudonym == null) {
                getpseudonym = new getPseudonym();
                int i5 = postMessage + 73;
                prefetch = i5 % 128;
                int i6 = i5 % 2;
            }
            Iterator<RuntimeScheduler> it = getpseudonym.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i7 = postMessage + 29;
                prefetch = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.areEqual(it.next().asBinder(), strOnNavigationEvent2);
                    obj.hashCode();
                    throw null;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.asBinder(), strOnNavigationEvent2)) {
                    break;
                }
            }
            RuntimeScheduler runtimeScheduler = next;
            if (runtimeScheduler != null) {
                int i8 = prefetch + 59;
                postMessage = i8 % 128;
                if (i8 % 2 == 0) {
                    runtimeScheduler.IAuthTabCallbackDefault();
                    obj.hashCode();
                    throw null;
                }
                WebView webViewIAuthTabCallbackDefault = runtimeScheduler.IAuthTabCallbackDefault();
                if (webViewIAuthTabCallbackDefault != null) {
                    setTopGuideFontSize.onExtraCallback(webViewIAuthTabCallbackDefault, strOnNavigationEvent, jsonObject2);
                }
            }
        }
    }

    private static void c(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $10 + 111;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(extraCommand)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0', 0)), 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 10277 - Process.getGidForName(""), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 12843);
                    int iIndexOf = 54 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i9 = 2168 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b = (byte) ($$a[2] + 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, iIndexOf, i9, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i10 = $11 + 29;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char c2 = (char) (12844 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 55;
                        int iLastIndexOf = TextUtils.lastIndexOf("", c) + 2168;
                        byte b3 = (byte) ($$a[2] + 1);
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, keyRepeatDelay, iLastIndexOf, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                    c = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
