package o;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.JavascriptInterface;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda10;
import im.toss.webview.TossWebView;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class convertStacktracebugsnag_android_core_release extends setCircleStrokeWidth {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private final TossWebView onWarmupCompleted;

    static {
        asInterface();
        Companion = new IAuthTabCallback(null);
        int i = asBinder + 91;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public abstract String onExtraCallback(@NotNull String str, @NotNull String str2);

    public abstract String onWarmupCompleted(@NotNull String str, boolean z, @Nullable String str2, boolean z2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public convertStacktracebugsnag_android_core_release(@NotNull WebViewContentOwner webViewContentOwner, @NotNull TossWebView tossWebView, @Nullable getTextProgressSize gettextprogresssize) {
        super(webViewContentOwner, tossWebView, tossWebView, gettextprogresssize);
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(tossWebView, "");
        this.onWarmupCompleted = tossWebView;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ convertStacktracebugsnag_android_core_release(WebViewContentOwner webViewContentOwner, TossWebView tossWebView, getTextProgressSize gettextprogresssize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallbackStub + 25;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            gettextprogresssize = null;
        }
        this(webViewContentOwner, tossWebView, gettextprogresssize);
    }

    @JavascriptInterface
    public final void shareUrlForFacebook(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }
        TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0);
        IAuthTabCallback(str, str2);
        int i3 = asInterface + 69;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    @JavascriptInterface
    public void setScreenName(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ViewConfiguration.getTapTimeout();
        super/*o.drawFocusCircle*/.setScreenName(str);
        onWarmupCompleted(IAuthTabCallback(), str);
        int i2 = IAuthTabCallbackStub + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @JavascriptInterface
    public final String __te(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        str.length();
        Object[] objArr = new Object[1];
        c(new char[]{55158, 57426, 48636, 48853, 13194, 44505}, 5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        ((String) objArr[0]).intern();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        String strOnNavigationEvent = onNavigationEvent(str, false, null);
        int i2 = IAuthTabCallbackStub + 57;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    @JavascriptInterface
    public final String __te(@NotNull String str, boolean z) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        str.length();
        Object[] objArr = new Object[1];
        c(new char[]{55158, 57426, 48636, 48853, 13194, 44505}, (ViewConfiguration.getTapTimeout() >> 16) + 5, objArr);
        ((String) objArr[0]).intern();
        SystemClock.uptimeMillis();
        String strOnNavigationEvent = onNavigationEvent(str, z, null);
        int i2 = asInterface + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return strOnNavigationEvent;
    }

    @JavascriptInterface
    public final String __te(@NotNull String str, boolean z, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        str.length();
        Object[] objArr = new Object[1];
        c(new char[]{55158, 57426, 48636, 48853, 13194, 44505}, 5 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        ((String) objArr[0]).intern();
        TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0);
        String strOnNavigationEvent = onNavigationEvent(str, z, str2);
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onNavigationEvent(String str, boolean z, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            String strOnWarmupCompleted = onWarmupCompleted(str, z, str2, onExtraCallbackWithResult("__te"));
            int i3 = asInterface + 89;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return strOnWarmupCompleted;
        }
        onWarmupCompleted(str, z, str2, onExtraCallbackWithResult("__te"));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JavascriptInterface
    public final String __td(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        str.length();
        Object[] objArr = new Object[1];
        c(new char[]{55158, 57426, 48652, 63839, 13194, 44505}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, objArr);
        ((String) objArr[0]).intern();
        ViewConfiguration.getKeyRepeatTimeout();
        if (onExtraCallbackWithResult("__td")) {
            return onExtraCallback(str, str2);
        }
        int i2 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        c(new char[]{31358, 8707, 2793, 33058, 8438, 35805, 22434, 55071, 44279, 47595, 12654, 4900, 3448, 31028, 35325, 14942}, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 16, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c(new char[]{64526, 41333, 35263, 25310}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, objArr2);
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult(convertFloatArrayToByteArray, strIntern, "onShareUrlForFacebook not implemented", access8200.IAuthTabCallback(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str)), false, (String) null, 24, (Object) null);
        int i4 = IAuthTabCallbackStub + 69;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
    }

    public void onWarmupCompleted(@Nullable Activity activity, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            c(new char[]{31358, 8707, 2793, 33058, 8438, 35805, 22434, 55071, 44279, 47595, 12654, 4900, 3448, 31028, 35325, 14942}, 17 << KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr);
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult(convertFloatArrayToByteArray, ((String) objArr[0]).intern(), "onSetScreenName not implemented", access8200.IAuthTabCallback(getWrite.IAuthTabCallback("screenName", str)), true, (String) null, 86, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            c(new char[]{31358, 8707, 2793, 33058, 8438, 35805, 22434, 55071, 44279, 47595, 12654, 4900, 3448, 31028, 35325, 14942}, 15 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr2);
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult(convertFloatArrayToByteArray2, ((String) objArr2[0]).intern(), "onSetScreenName not implemented", access8200.IAuthTabCallback(getWrite.IAuthTabCallback("screenName", str)), false, (String) null, 24, (Object) null);
        }
        int i3 = asInterface + 53;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private final boolean onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (((Boolean) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this.onWarmupCompleted}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 1411769593, -1411769587, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback())).booleanValue()) {
            int i4 = asInterface;
            int i5 = i4 + 89;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 25;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        String strOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            strOnExtraCallbackWithResult = "webView is null";
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        c(new char[]{24863, 58940, 58571, 26355}, 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "core,me");
        Object[] objArr2 = new Object[1];
        c(new char[]{64526, 41333, 35263, 25310}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, objArr2);
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "javascript_not_allowed", str, access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), strOnExtraCallbackWithResult)), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i9 = IAuthTabCallbackStub + 13;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 119;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 5;
        }
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 77;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1));
                        int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i12 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, pressedStateDuration, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), Drawable.resolveOpacity(0, 0) + 10, 12433 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, 19901 - KeyEvent.getDeadChar(0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void asInterface() {
        IAuthTabCallback = (char) 37566;
        onExtraCallback = (char) 2688;
        onNavigationEvent = (char) 5189;
        onExtraCallbackWithResult = (char) 62098;
    }
}
