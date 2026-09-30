package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.android.gms.internal.ads.zziea;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda10;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambda0grt42NLozkvlz2kicXj5Z0ej8U;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class AFi1aSDK4ExternalSyntheticLambda0 extends roundedRect {
    private String IAuthTabCallback;
    private Long IAuthTabCallbackDefault;
    private boolean asBinder;
    private boolean onExtraCallback;
    private final getBorderRadius<TossSecuritiesWebView> onExtraCallbackWithResult;
    private final AFi1qSDK onNavigationEvent;
    private final AFi1pSDKAFa1ySDK onWarmupCompleted;
    private static final byte[] $$d = {61, -49, -70, 93};
    private static final int $$e = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int access100 = 1;
    private static char[] IAuthTabCallbackStub = {48832, 31114, 12355, 60832, 10992, 25402, 47199, 61573, 60838, 11004, 25405, 47174, 61580, 2337, 60836, 10987, 25383, 47196, 61586, 2364, 18030, 40630};
    private static long asInterface = -476892746533819751L;

    private static String $$f(short s, byte b, byte b2) {
        int i = (b2 * 3) + 97;
        int i2 = b * 2;
        int i3 = s + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i += -i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3++;
            i += -bArr[i3];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1aSDK4ExternalSyntheticLambda0(@NotNull getBorderRadius<TossSecuritiesWebView> getborderradius, @Nullable AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK) {
        super((IconRoundCornerProgressBar1) null, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getborderradius, "");
        this.onExtraCallbackWithResult = getborderradius;
        this.onWarmupCompleted = aFi1pSDKAFa1ySDK;
        this.onNavigationEvent = new AFi1qSDK();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AFi1aSDK4ExternalSyntheticLambda0(getBorderRadius getborderradius, AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = access100;
            int i3 = i2 + 77;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            aFi1pSDKAFa1ySDK = null;
        }
        this(getborderradius, aFi1pSDKAFa1ySDK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean rA_(@NotNull WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail, @NotNull r8lambda0grt42NLozkvlz2kicXj5Z0ej8U.IAuthTabCallback iAuthTabCallback) throws Throwable {
        TossSecuritiesWebView tossSecuritiesWebView;
        TossBridgeWebView tossBridgeWebView;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        String str = null;
        if (webView instanceof TossSecuritiesWebView) {
            int i2 = onTransact + 89;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            tossSecuritiesWebView = (TossSecuritiesWebView) webView;
        } else {
            tossSecuritiesWebView = null;
        }
        if (tossSecuritiesWebView != null) {
            int i4 = access100 + 33;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                tossSecuritiesWebView.onExtraCallbackWithResult("renderer_gone");
                this.onExtraCallbackWithResult.onNavigationEvent(tossSecuritiesWebView);
                throw null;
            }
            tossSecuritiesWebView.onExtraCallbackWithResult("renderer_gone");
            this.onExtraCallbackWithResult.onNavigationEvent(tossSecuritiesWebView);
        }
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.onWarmupCompleted;
        Long lOnExtraCallback = aFi1pSDKAFa1ySDK != null ? aFi1pSDKAFa1ySDK.onExtraCallback() : null;
        this.IAuthTabCallbackDefault = lOnExtraCallback;
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK2 = this.onWarmupCompleted;
        if (aFi1pSDKAFa1ySDK2 != null) {
            AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{aFi1pSDKAFa1ySDK2, onWarmupCompleted(webView), webView.getUrl(), true, this.onNavigationEvent.IAuthTabCallback(lOnExtraCallback)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -136385164, 136385165, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
        }
        this.onExtraCallback = true;
        this.asBinder = false;
        Object[] objArr = new Object[1];
        c(3 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21344), KeyEvent.getDeadChar(0, 0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), roundedRect.Companion.onExtraCallbackWithResult(webView.getUrl()));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("didCrash", Boolean.valueOf(iAuthTabCallback.onWarmupCompleted()));
        Integer numValueOf = renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null;
        Object[] objArr2 = new Object[1];
        c(View.resolveSize(0, 0) + 8, (char) Color.argb(0, 0, 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 15, objArr2);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), numValueOf);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("crashCount", Integer.valueOf(iAuthTabCallback.onExtraCallback()));
        if (webView instanceof TossBridgeWebView) {
            int i5 = onTransact + 119;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            tossBridgeWebView = (TossBridgeWebView) webView;
        } else {
            tossBridgeWebView = null;
        }
        if (tossBridgeWebView != null) {
            str = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback());
        }
        AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"NativeWebViewRenderGone", access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("_webview_id", str)), false, null, 12, null}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i) {
                break;
            }
            int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackStub[i2 + i5])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), 17 - (ViewConfiguration.getTouchSlop() >> 8), 10973 - View.MeasureSpec.getSize(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(asInterface), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 31, 20220 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 49123), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1494, -1657859959, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = $11 + 89;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i8 = $10 + 57;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 44, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1494, -1657859959, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i9 = 19 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), 43 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1495, -1657859959, false, $$f(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i3 = -1401950695;
            }
        }
        objArr[0] = new String(cArr);
    }

    public boolean rB_(@NotNull WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail, @NotNull r8lambda0grt42NLozkvlz2kicXj5Z0ej8U.IAuthTabCallback iAuthTabCallback) throws Throwable {
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = access100 + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.onWarmupCompleted;
        String str = null;
        Long lOnExtraCallback = aFi1pSDKAFa1ySDK != null ? aFi1pSDKAFa1ySDK.onExtraCallback() : null;
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK2 = this.onWarmupCompleted;
        if (aFi1pSDKAFa1ySDK2 != null) {
            AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{aFi1pSDKAFa1ySDK2, onWarmupCompleted(webView), webView.getUrl(), false, this.onNavigationEvent.IAuthTabCallback(lOnExtraCallback)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -136385164, 136385165, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
        }
        Object[] objArr = new Object[1];
        c(3 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (char) (21344 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 1, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), roundedRect.Companion.onExtraCallbackWithResult(webView.getUrl()));
        if (renderProcessGoneDetail != null) {
            int i4 = access100 + 85;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            numValueOf = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
        } else {
            numValueOf = null;
        }
        Object[] objArr2 = new Object[1];
        c(7 - ExpandableListView.getPackedPositionChild(0L), (char) View.getDefaultSize(0, 0), 13 - ExpandableListView.getPackedPositionChild(0L), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), numValueOf);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("crashCount", Integer.valueOf(iAuthTabCallback.onExtraCallback()));
        TossBridgeWebView tossBridgeWebView = webView instanceof TossBridgeWebView ? (TossBridgeWebView) webView : null;
        if (tossBridgeWebView != null) {
            str = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback());
        }
        AFd1mSDK.onNavigationEvent("NativeWebViewRenderGone", (Throwable) null, access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("_webview_id", str)), false, (Function1) null, 26, (Object) null);
        return false;
    }

    public void onPageStarted(@NotNull WebView webView, @NotNull String str, @Nullable Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onPageStarted(webView, str, bitmap);
        AFi1qSDK aFi1qSDK = this.onNavigationEvent;
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.onWarmupCompleted;
        aFi1qSDK.onExtraCallback(aFi1pSDKAFa1ySDK != null ? aFi1pSDKAFa1ySDK.onExtraCallback() : null);
        int i4 = access100 + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPageFinished(@NotNull WebView webView, @NotNull String str) throws Throwable {
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK;
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onPageFinished(webView, str);
        AFi1mSDK aFi1mSDKOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
        if (this.onExtraCallback) {
            AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK2 = this.onWarmupCompleted;
            if (aFi1pSDKAFa1ySDK2 != null) {
                aFi1pSDKAFa1ySDK2.IAuthTabCallback(onWarmupCompleted(webView), str, !this.asBinder, this.IAuthTabCallbackDefault);
                int i2 = access100 + 119;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
            }
            this.onExtraCallback = false;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("content", "renderRecoveryResult");
            if (this.asBinder) {
                int i4 = onTransact + 45;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                str2 = "failure";
            } else {
                int i6 = onTransact + 27;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                str2 = "success";
            }
            Object[] objArr = new Object[1];
            c(6 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 7 - ImageFormat.getBitsPerPixel(0), objArr);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str2);
            Object[] objArr2 = new Object[1];
            c(3 - (KeyEvent.getMaxKeyCode() >> 16), (char) (21345 - (Process.myPid() >> 22)), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), objArr2);
            AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"WebView", access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), roundedRect.Companion.onExtraCallbackWithResult(str))), false, null, 12, null}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            this.asBinder = false;
            this.IAuthTabCallbackDefault = null;
        }
        if (aFi1mSDKOnWarmupCompleted.onExtraCallback() && (aFi1pSDKAFa1ySDK = this.onWarmupCompleted) != null) {
            AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{aFi1pSDKAFa1ySDK, onWarmupCompleted(webView), str, aFi1mSDKOnWarmupCompleted.onWarmupCompleted()}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 197011124, -197011122, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
        }
        this.IAuthTabCallback = str;
        if (webView instanceof TossSecuritiesWebView) {
            TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) webView;
            tossSecuritiesWebView.prefetchWithMultipleUrls();
            tossSecuritiesWebView.onExtraCallbackWithResult(str, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
        int i = 2 % 2;
        super/*android.webkit.WebViewClient*/.doUpdateVisitedHistory(webView, str, z);
        TossSecuritiesWebView.Companion.onWarmupCompleted();
        if (str != null) {
            int i2 = onTransact + 97;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback = str;
        }
        if (webView instanceof TossSecuritiesWebView) {
            int i4 = access100 + 73;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            ((TossSecuritiesWebView) webView).onExtraCallbackWithResult(str, z);
        }
        int i6 = onTransact + 103;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_3649)) {
            String str = this.IAuthTabCallback;
            if (str != null) {
                return str;
            }
            int i2 = onTransact + 111;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return super/*o.setTopGuideSpacing*/.onExtraCallbackWithResult();
        }
        String strOnExtraCallbackWithResult = super/*o.setTopGuideSpacing*/.onExtraCallbackWithResult();
        int i4 = access100 + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceivedError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceError webResourceError) {
        TossSecuritiesWebView tossSecuritiesWebView;
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 89;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            Intrinsics.checkNotNullParameter(webResourceError, "");
            int i3 = 62 / 0;
            if (this.onExtraCallback) {
                if (!(!webResourceRequest.isForMainFrame())) {
                    int i4 = access100 + 69;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        this.asBinder = false;
                    } else {
                        this.asBinder = true;
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            Intrinsics.checkNotNullParameter(webResourceError, "");
            if (this.onExtraCallback) {
            }
        }
        int errorCode = webResourceError.getErrorCode();
        String string = webResourceError.getDescription().toString();
        String string2 = webResourceRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Object obj = null;
        if (webView instanceof TossSecuritiesWebView) {
            int i5 = onTransact + 81;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            tossSecuritiesWebView = (TossSecuritiesWebView) webView;
        } else {
            tossSecuritiesWebView = null;
        }
        if (tossSecuritiesWebView != null) {
            if (((Boolean) TossSecuritiesWebView.onNavigationEvent(zziea.IAuthTabCallback(), -1671939869, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{tossSecuritiesWebView, Integer.valueOf(errorCode), string, string2}, 1671939873)).booleanValue()) {
                AFi1oSDK aFi1oSDKOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(webResourceRequest.isForMainFrame());
                AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.onWarmupCompleted;
                if (aFi1pSDKAFa1ySDK != null) {
                    int i6 = access100 + 95;
                    onTransact = i6 % 128;
                    if (i6 % 2 != 0) {
                        aFi1pSDKAFa1ySDK.onWarmupCompleted(onWarmupCompleted(webView), string2, aFi1oSDKOnNavigationEvent.onNavigationEvent(), Boolean.valueOf(webResourceRequest.isForMainFrame()), errorCode, aFi1oSDKOnNavigationEvent.IAuthTabCallback());
                        obj.hashCode();
                        throw null;
                    }
                    TossSecuritiesWebView.onWarmupCompleted onWarmupCompleted = onWarmupCompleted(webView);
                    Long lOnNavigationEvent = aFi1oSDKOnNavigationEvent.onNavigationEvent();
                    boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
                    boolean zIAuthTabCallback = aFi1oSDKOnNavigationEvent.IAuthTabCallback();
                    Boolean boolValueOf = Boolean.valueOf(zIsForMainFrame);
                    str = string2;
                    aFi1pSDKAFa1ySDK.onWarmupCompleted(onWarmupCompleted, string2, lOnNavigationEvent, boolValueOf, errorCode, zIAuthTabCallback);
                } else {
                    str = string2;
                }
                onNavigationEvent(webView, errorCode, string, str, Boolean.valueOf(webResourceRequest.isForMainFrame()));
            }
        }
        int i7 = access100 + 11;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onReceivedHttpError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(webResourceRequest, "");
        Intrinsics.checkNotNullParameter(webResourceResponse, "");
        TossSecuritiesWebView.Companion.onWarmupCompleted();
        Uri url = webResourceRequest.getUrl();
        webResourceResponse.getStatusCode();
        webResourceResponse.getReasonPhrase();
        Objects.toString(url);
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        TossSecuritiesWebView tossSecuritiesWebView = null;
        if (webView instanceof TossSecuritiesWebView) {
            int i2 = onTransact + 25;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            tossSecuritiesWebView = (TossSecuritiesWebView) webView;
        }
        if (tossSecuritiesWebView == null || !tossSecuritiesWebView.onExtraCallback(webResourceRequest, webResourceResponse)) {
            return;
        }
        int i3 = access100 + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        AFi1oSDK aFi1oSDKOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(webResourceRequest.isForMainFrame());
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.onWarmupCompleted;
        if (aFi1pSDKAFa1ySDK != null) {
            TossSecuritiesWebView.onWarmupCompleted onWarmupCompleted = onWarmupCompleted(webView);
            String string = webResourceRequest.getUrl().toString();
            Long lOnNavigationEvent = aFi1oSDKOnNavigationEvent.onNavigationEvent();
            int statusCode = webResourceResponse.getStatusCode();
            boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
            boolean zIAuthTabCallback = aFi1oSDKOnNavigationEvent.IAuthTabCallback();
            AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{aFi1pSDKAFa1ySDK, onWarmupCompleted, string, lOnNavigationEvent, Integer.valueOf(statusCode), Boolean.valueOf(zIsForMainFrame), Boolean.valueOf(zIAuthTabCallback)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -363287833, 363287838, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
        }
        onNavigationEvent(webView, webResourceRequest, webResourceResponse);
        int i5 = access100 + 3;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean IAuthTabCallbackDefault(@NotNull WebView webView, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (Intrinsics.areEqual(uri.getHost(), "web")) {
            int i4 = onTransact + 105;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = {webView.getUrl()};
                throw null;
            }
            Object[] objArr2 = {webView.getUrl()};
            Uri uri2 = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, objArr2);
            if (uri2 != null && filterCreatePageParams.onTransact(uri2)) {
                Context context = webView.getContext();
                Response response = Response.onNavigationEvent;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                afVerboseLog afverboselogActivityResultRegistryKtExternalSyntheticLambda2 = ((AFi1aSDKExternalSyntheticLambda0) Response.onExtraCallback(applicationContext, AFi1aSDKExternalSyntheticLambda0.class)).ActivityResultRegistryKtExternalSyntheticLambda2();
                Intrinsics.checkNotNull(context);
                Object[] objArr3 = new Object[1];
                c(3 - (KeyEvent.getMaxKeyCode() >> 16), (char) (21345 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), ViewConfiguration.getScrollBarSize() >> 8, objArr3);
                String str = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr3[0]).intern(), _UrlKt.FRAGMENT_ENCODE_SET}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
                Object[] objArr4 = new Object[1];
                c(TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 5, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 3, objArr4);
                Intent intentOnExtraCallback = afverboselogActivityResultRegistryKtExternalSyntheticLambda2.onExtraCallback(context, str, (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr4[0]).intern(), _UrlKt.FRAGMENT_ENCODE_SET}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789), (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, "external", _UrlKt.FRAGMENT_ENCODE_SET}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789), (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, "ui", _UrlKt.FRAGMENT_ENCODE_SET}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789), filterCreatePageParams.onExtraCallback(uri, "hideTitle", false), (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, "icon", _UrlKt.FRAGMENT_ENCODE_SET}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789), filterCreatePageParams.onExtraCallback(uri, "showBackButton", false));
                if (intentOnExtraCallback == null) {
                    return super/*o.ALCFocusCircle*/.IAuthTabCallbackDefault(webView, uri);
                }
                context.startActivity(intentOnExtraCallback);
                int i5 = access100 + 107;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return super/*o.ALCFocusCircle*/.IAuthTabCallbackDefault(webView, uri);
    }

    private static final boolean onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = !CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-6, -8, -2}).contains(Integer.valueOf(i));
        int i5 = onTransact + 1;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (onExtraCallbackWithResult(r27) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (onExtraCallbackWithResult(r27) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        r3 = o.AFi1aSDK4ExternalSyntheticLambda0.onTransact + 13;
        o.AFi1aSDK4ExternalSyntheticLambda0.access100 = r3 % 128;
        r3 = r3 % 2;
        o.AFd1mSDK.onExtraCallbackWithResult("NativeWebViewError", (java.lang.Throwable) null, o.access8000.IAuthTabCallbackStub(o.getWrite.IAuthTabCallback("currentHttpUrl", r26.getUrl()), o.getWrite.IAuthTabCallback("failingUrl", r29), o.getWrite.IAuthTabCallback("errorCode", java.lang.Integer.valueOf(r27)), o.getWrite.IAuthTabCallback("errorDesc", r28)), false, (kotlin.jvm.functions.Function1) null, 26, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(WebView webView, int i, String str, String str2, Boolean bool) {
        TossBridgeWebView tossBridgeWebView;
        String url;
        String str3;
        int i2 = 2 % 2;
        TossSecuritiesWebView.Companion.onWarmupCompleted();
        if (!Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webView)) {
            int i3 = access100 + 3;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 2;
            }
            tossBridgeWebView = null;
        } else {
            tossBridgeWebView = (TossBridgeWebView) webView;
        }
        if ((tossBridgeWebView == null || (url = tossBridgeWebView.onExtraCallbackWithResult()) == null) && (url = webView.getUrl()) == null) {
            url = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        Uri uri = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        String strOnExtraCallback = filterCreatePageParams.onExtraCallback(uri);
        Cookies_set cookies_set = Cookies_set.onNavigationEvent;
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        PackageInfo packageInfoIAuthTabCallback = cookies_set.IAuthTabCallback(context);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2) && Intrinsics.areEqual(CollectionsKt___CollectionsKt.firstOrNull((List) AFh1eSDK.onExtraCallbackWithResult().onExtraCallback()), bool2)) {
            int i5 = access100 + 87;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (webView.isAttachedToWindow()) {
                int i7 = onTransact + 29;
                access100 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 86 / 0;
                }
            }
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("info", "[errorCode:" + i + "] " + str + " (failingUrl: " + str2 + ")");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("currentHttpUrl", url);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("failingUrl", str2);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("errorCode", Integer.valueOf(i));
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("errorDesc", str);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("isForMainFrame", bool);
        if (packageInfoIAuthTabCallback != null) {
            int i9 = access100 + 95;
            onTransact = i9 % 128;
            if (i9 % 2 != 0) {
                String str4 = packageInfoIAuthTabCallback.packageName;
                str.hashCode();
                throw null;
            }
            str3 = packageInfoIAuthTabCallback.packageName;
        } else {
            str3 = null;
        }
        AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"ReceivedError", access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback("webViewPackage", str3), getWrite.IAuthTabCallback("webViewVersion", packageInfoIAuthTabCallback != null ? packageInfoIAuthTabCallback.versionName : null), getWrite.IAuthTabCallback("service", strOnExtraCallback)), false, null, 12, null}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        TossBridgeWebView tossBridgeWebView;
        String url;
        int i = 2 % 2;
        int i2 = onTransact + 113;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
            if (!Intrinsics.areEqual(CollectionsKt___CollectionsKt.lastOrNull((List) AFh1eSDK.onExtraCallbackWithResult().onExtraCallback()), Boolean.TRUE)) {
                return;
            }
        } else if (!Intrinsics.areEqual(CollectionsKt___CollectionsKt.lastOrNull((List) AFh1eSDK.onExtraCallbackWithResult().onExtraCallback()), Boolean.TRUE)) {
            return;
        }
        if (webView.isAttachedToWindow()) {
            int i4 = onTransact + 31;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
                if (Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webView)) {
                    tossBridgeWebView = (TossBridgeWebView) webView;
                } else {
                    int i6 = onTransact + 9;
                    access100 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 / 5;
                    }
                    tossBridgeWebView = null;
                }
            } else if (Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webView)) {
            }
            if (tossBridgeWebView != null) {
                int i8 = onTransact + 95;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                url = tossBridgeWebView.onExtraCallbackWithResult();
                if (url == null) {
                    url = webView.getUrl();
                    if (url == null) {
                        int i10 = onTransact + 51;
                        access100 = i10 % 128;
                        int i11 = i10 % 2;
                        url = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                }
            }
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            AFd1mSDK.onExtraCallbackWithResult("NativeWebViewHttpError", (Throwable) null, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("currentHttpUrl", url), getWrite.IAuthTabCallback("failingUrl", webResourceRequest.getUrl()), getWrite.IAuthTabCallback("errorCode", Integer.valueOf(webResourceResponse.getStatusCode())), getWrite.IAuthTabCallback("service", filterCreatePageParams.onExtraCallback(uri))), false, (Function1) null, 26, (Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TossSecuritiesWebView.onWarmupCompleted onWarmupCompleted(WebView webView) {
        TossSecuritiesWebView tossSecuritiesWebView;
        int i = 2 % 2;
        Object obj = null;
        if (webView instanceof TossSecuritiesWebView) {
            int i2 = access100 + 25;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            tossSecuritiesWebView = (TossSecuritiesWebView) webView;
        } else {
            tossSecuritiesWebView = null;
        }
        if (tossSecuritiesWebView != null) {
            int i4 = onTransact + 23;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                tossSecuritiesWebView.postMessage();
                obj.hashCode();
                throw null;
            }
            TossSecuritiesWebView.onWarmupCompleted onwarmupcompletedPostMessage = tossSecuritiesWebView.postMessage();
            if (onwarmupcompletedPostMessage != null) {
                return onwarmupcompletedPostMessage;
            }
        }
        TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted = TossSecuritiesWebView.onWarmupCompleted.FINTECH;
        int i5 = onTransact + 105;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }
}
