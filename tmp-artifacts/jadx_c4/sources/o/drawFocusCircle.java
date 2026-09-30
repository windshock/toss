package o;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.gms.internal.ads.zzgc;
import com.skt.usp.UCPApiConstants;
import com.tmoney.LiveCheckConstants;
import im.toss.core.tracker.entry.CustomizableLog;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.core.tracker.entry.TrackState;
import im.toss.core.tracker.entry.TrackView;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreJavascriptInterface$;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AUTextView;
import o.adInfo;
import o.drawFocusCircle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class drawFocusCircle {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char[] onExtraCallbackWithResult;
    private static int onTransact;
    private final wie2 IAuthTabCallback;
    private final WeakReference<WebView> onExtraCallback;
    private final String onNavigationEvent;
    private final WeakReference<Activity> onWarmupCompleted;

    static {
        onNavigationEvent();
        Companion = new onNavigationEvent(null);
        int i = onTransact + 113;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Activity activity = (Activity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(activity);
        int i4 = asInterface + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i5;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i5 | i6 | i4);
        int i13 = i11 | i12;
        int i14 = i10 | i6;
        int i15 = i6 + i4 + i3 + (112060874 * i2) + ((-1891258303) * i);
        int i16 = i15 * i15;
        int i17 = (i6 * 1286644997) + 1783103488 + (1286644997 * i4) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i3) + ((-1427111936) * i2) + (1712848896 * i) + (159514624 * i16);
        int i18 = ((i6 * (-1669307009)) - 1771304782) + (i4 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i3 * (-1669306445)) + (i2 * (-1582645698)) + (i * (-198941581)) + (i16 * (-203030528));
        int i19 = i17 + (i18 * i18 * (-2008154112));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{adinfo}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1816562068, iOnExtraCallbackWithResult, 1816562069);
        int i4 = asInterface + 109;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @JavascriptInterface
    public final void domainLog(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onExtraCallbackWithResult(this, str, str2, false, 4, null);
        int i4 = asInterface + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    @JavascriptInterface
    public final void log(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        IAuthTabCallback(this, str, str2, null, null, 12, null);
        int i4 = IAuthTabCallbackStub + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @JavascriptInterface
    public final void log(@NotNull String str, @NotNull String str2, @Nullable String str3) throws Throwable {
        String str4;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i4 == 0) {
            str4 = null;
            i = 72;
        } else {
            str4 = null;
            i = 8;
        }
        IAuthTabCallback(this, str, str2, str3, str4, i, null);
        int i5 = asInterface + 63;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JavascriptInterface
    public final void logDebug(@NotNull String str, @NotNull String str2) throws Throwable {
        String str3;
        String str4;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 59;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i4 == 0) {
            str3 = null;
            str4 = null;
            i = UCPApiConstants.ARAM_TIME_OUT;
        } else {
            str3 = null;
            str4 = null;
            i = 12;
        }
        onWarmupCompleted(this, str, str2, str3, str4, i, (Object) null);
    }

    @JavascriptInterface
    public final void logDebug(@NotNull String str, @NotNull String str2, @Nullable String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onWarmupCompleted(this, str, str2, str3, (String) null, i3 == 0 ? 41 : 8, (Object) null);
    }

    @JavascriptInterface
    public final void logError(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onExtraCallback(this, str, str2, null, null, 12, null);
        int i4 = IAuthTabCallbackStub + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @JavascriptInterface
    public final void logError(@NotNull String str, @NotNull String str2, @Nullable String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onExtraCallback(this, str, str2, str3, null, i3 == 0 ? 28 : 8, null);
        int i4 = IAuthTabCallbackStub + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @JavascriptInterface
    public final void logEvent(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted(this, str, false, i3 != 0 ? 3 : 2, null);
    }

    @JavascriptInterface
    public final void logInfo(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onExtraCallbackWithResult(this, str, str2, null, null, i3 != 0 ? 43 : 12, null);
        int i4 = asInterface + 7;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @JavascriptInterface
    public final void logInfo(@NotNull String str, @NotNull String str2, @Nullable String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onExtraCallbackWithResult(this, str, str2, str3, null, i3 != 0 ? 107 : 8, null);
    }

    @JavascriptInterface
    public final void logWarning(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, str, str2, null, null, 12, null}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -476421399, iOnExtraCallbackWithResult, 476421399);
        int i4 = IAuthTabCallbackStub + 39;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @JavascriptInterface
    public final void logWarning(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i3 != 0) {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, str, str2, str3, null, 36, null}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -476421399, iOnExtraCallbackWithResult, 476421399);
        } else {
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, str, str2, str3, null, 8, null}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -476421399, iOnExtraCallbackWithResult2, 476421399);
        }
    }

    @JavascriptInterface
    public void postMessage(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            throw null;
        }
    }

    @Deprecated
    @JavascriptInterface
    public final void sendLog(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, str, false, 3, null}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -864154430, iOnExtraCallbackWithResult, 864154433);
            return;
        }
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, str, false, 2, null}, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, -864154430, iOnExtraCallbackWithResult4, 864154433);
    }

    public drawFocusCircle(@NotNull Activity activity, @Nullable WebView webView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = new WeakReference<>(activity);
        this.onExtraCallback = new WeakReference<>(webView);
        this.IAuthTabCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.core.webkit.TossCoreJavascriptInterface$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                IAuthTabCallback = i2 % 128;
                Object obj2 = null;
                adInfo adinfo = (adInfo) obj;
                if (i2 % 2 == 0) {
                    drawFocusCircle.onWarmupCompleted(adinfo);
                    throw null;
                }
                Unit unitOnWarmupCompleted = drawFocusCircle.onWarmupCompleted(adinfo);
                int i3 = onExtraCallback + 79;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
        }, 1, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ drawFocusCircle(Activity activity, WebView webView, String str, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        Object obj;
        if ((i & 4) != 0) {
            int i2 = asInterface + 35;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{7, '\b', 3, 5}, (byte) (93 - TextUtils.getOffsetAfter("", 0)), 4 << (KeyEvent.getMaxKeyCode() % 96), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{7, '\b', 3, 5}, (byte) (TextUtils.getOffsetAfter("", 0) + 112), 4 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
                obj = objArr2[0];
            }
            str = ((String) obj).intern();
            int i3 = asInterface + 83;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this(activity, webView, str);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GetMotionInteractionState getMotionInteractionState;
        adInfo adinfo = (adInfo) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(true);
            adinfo.IAuthTabCallback(true);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, false}, iOnExtraCallback2, iOnExtraCallback);
            adinfo.onExtraCallbackWithResult(false);
            getMotionInteractionState = GetMotionInteractionState.onExtraCallback;
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(true);
            adinfo.IAuthTabCallback(true);
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback4, iOnExtraCallback3);
            adinfo.onExtraCallbackWithResult(true);
            getMotionInteractionState = GetMotionInteractionState.onExtraCallback;
        }
        adinfo.onNavigationEvent(tnycx.onWarmupCompleted(Reflection.getOrCreateKotlinClass(Object.class), getMotionInteractionState));
        return Unit.INSTANCE;
    }

    public final WebView onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        WebView webView = this.onExtraCallback.get();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return webView;
    }

    public final Activity IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Activity activity = this.onWarmupCompleted.get();
        int i4 = IAuthTabCallbackStub + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return activity;
    }

    @JavascriptInterface
    public final void showToast(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (onExtraCallbackWithResult()) {
            int i4 = asInterface + 97;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                this.onWarmupCompleted.get();
                throw null;
            }
            Activity activity = this.onWarmupCompleted.get();
            if (activity != null) {
                onIconClick.onExtraCallbackWithResult(activity, str, 0, 2, null);
                int i5 = IAuthTabCallbackStub + 55;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    @JavascriptInterface
    public void closeWebView() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
            if (!onExtraCallbackWithResult()) {
                return;
            }
        } else if (!onExtraCallbackWithResult()) {
            return;
        }
        int i4 = IAuthTabCallbackStub + 45;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            Activity activity = this.onWarmupCompleted.get();
            if (activity != null) {
                activity.runOnUiThread(new TossCoreJavascriptInterface$.ExternalSyntheticLambda0(activity));
                return;
            }
            return;
        }
        this.onWarmupCompleted.get();
        throw null;
    }

    private static final void onExtraCallbackWithResult(Activity activity) {
        int i = 2 % 2;
        if (activity.isTaskRoot()) {
            int i2 = asInterface + 57;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            activity.onNavigateUp();
            int i4 = IAuthTabCallbackStub + 61;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        activity.finish();
    }

    @JavascriptInterface
    public final void toastLong(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (onExtraCallbackWithResult()) {
            Toast.makeText(this.onWarmupCompleted.get(), str, 1).show();
            int i2 = asInterface + 125;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallbackStub + 121;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @JavascriptInterface
    public final void toastShort(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (onExtraCallbackWithResult()) {
            Toast.makeText(this.onWarmupCompleted.get(), str, 0).show();
            int i3 = asInterface + 119;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 % 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 android.app.Activity) = (r1v6 android.app.Activity), (r1v15 android.app.Activity) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean onExtraCallbackWithResult() {
        Activity activity;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            activity = this.onWarmupCompleted.get();
            int i3 = 20 / 0;
            if (activity != null) {
                if (!activity.isFinishing()) {
                    int i4 = IAuthTabCallbackStub + 75;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else {
            activity = this.onWarmupCompleted.get();
            if (activity != null) {
            }
        }
        return false;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        boolean z = false;
        drawFocusCircle drawfocuscircle = (drawFocusCircle) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendLog");
        }
        if ((iIntValue & 2) != 0) {
            int i5 = i3 + 95;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z = zBooleanValue;
        }
        drawfocuscircle.sendLog(str, z);
        return null;
    }

    @Deprecated
    @JavascriptInterface
    public final void sendLog(@NotNull String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        logEvent(str, z);
        int i4 = IAuthTabCallbackStub + 59;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r6 = r1 + 33;
        o.drawFocusCircle.asInterface = r6 % 128;
        r6 = r6 % 2;
        r1 = r1 + 105;
        o.drawFocusCircle.asInterface = r1 % 128;
        r1 = r1 % 2;
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4.logEvent(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r8 = r1 + 117;
        o.drawFocusCircle.asInterface = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r7 & 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void onWarmupCompleted(drawFocusCircle drawfocuscircle, String str, boolean z, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 45;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    @JavascriptInterface
    public final void logEvent(@NotNull String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            TextUtils.isEmpty(str);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i3 = IAuthTabCallbackStub + 31;
        asInterface = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                onNavigationEvent(str);
                throw null;
            }
            TrackLog trackLogOnNavigationEvent = onNavigationEvent(str);
            if (trackLogOnNavigationEvent == null) {
                TrackEvent trackEventOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
                trackEventOnExtraCallbackWithResult.onNavigationEvent().remove("_domainLog");
                trackEventOnExtraCallbackWithResult.onWarmupCompleted(z);
            } else {
                if (onExtraCallback(trackLogOnNavigationEvent, z)) {
                    return;
                }
                trackLogOnNavigationEvent.onWarmupCompleted(z);
                int i4 = IAuthTabCallbackStub + 81;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(new char[]{5, 6, 2, 7}, (byte) (126 - Drawable.resolveOpacity(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 5, objArr);
            ALCDetectionMode.onNavigationEvent(th, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)));
        }
    }

    @JavascriptInterface
    public final void setView(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 38 / 0;
            if (TextUtils.isEmpty(str)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if (!(!TextUtils.isEmpty(str))) {
                return;
            }
        }
        try {
            TrackView trackViewOnExtraCallback = onExtraCallback(str);
            if (trackViewOnExtraCallback.getInterfaceDescriptor() == null) {
                int i4 = asInterface + 103;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, new Object[]{trackViewOnExtraCallback}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
            }
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(new char[]{5, 6, 2, 7}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 126), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, objArr);
            ALCDetectionMode.onNavigationEvent(th, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)));
        }
    }

    @Deprecated
    @JavascriptInterface
    public final void setState(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        logState(str);
        int i4 = IAuthTabCallbackStub + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @JavascriptInterface
    public final void logState(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!TextUtils.isEmpty(str)) {
            try {
                TrackState trackStateOnWarmupCompleted = onWarmupCompleted(str);
                if (trackStateOnWarmupCompleted.getInterfaceDescriptor() == null) {
                    return;
                }
                int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                ((Boolean) downloadZip.onWarmupCompleted(iOnNavigationEvent2, 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, new Object[]{trackStateOnWarmupCompleted}, iOnNavigationEvent3)).booleanValue();
                return;
            } catch (Throwable th) {
                Object[] objArr = new Object[1];
                a(new char[]{5, 6, 2, 7}, (byte) (126 - Color.blue(0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr);
                ALCDetectionMode.onNavigationEvent(th, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)));
            }
        }
        int i4 = IAuthTabCallbackStub + 9;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JavascriptInterface
    public void setScreenName(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!TextUtils.isEmpty(str)) {
            int i4 = IAuthTabCallbackStub + 37;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, IAuthTabCallback((String) null), (Function1) null, 4, (Object) null);
        }
        int i6 = IAuthTabCallbackStub + 63;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void onExtraCallback(drawFocusCircle drawfocuscircle, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
        }
        if ((i & 4) != 0) {
            int i6 = i3 + 35;
            asInterface = i6 % 128;
            str3 = null;
            if (i6 % 2 == 0) {
                str3.hashCode();
                throw null;
            }
        }
        if ((i & 8) != 0) {
            str4 = drawfocuscircle.onNavigationEvent;
        }
        drawfocuscircle.logError(str, str2, str3, str4);
        int i7 = asInterface + 103;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    @JavascriptInterface
    public final void logError(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, str2, (Map) IAuthTabCallback(str3), false, str4, 8, (Object) null);
        int i4 = asInterface + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        drawFocusCircle drawfocuscircle = (drawFocusCircle) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        if (objArr[6] != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logWarning");
        }
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue & 4) != 0) {
            str3 = null;
        }
        if ((iIntValue & 8) != 0) {
            str4 = drawfocuscircle.onNavigationEvent;
        }
        drawfocuscircle.logWarning(str, str2, str3, str4);
        int i4 = asInterface + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @JavascriptInterface
    public final void logWarning(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, str2, IAuthTabCallback(str3), "web", false, str4, 16, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackStub + 23;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(drawFocusCircle drawfocuscircle, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logInfo");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i5 = i3 + 125;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            str4 = drawfocuscircle.onNavigationEvent;
        }
        drawfocuscircle.logInfo(str, str2, str3, str4);
        int i7 = asInterface + 95;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    @JavascriptInterface
    public final void logInfo(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, str2, IAuthTabCallback(str3), "web", false, str4, 16, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackStub + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(drawFocusCircle drawfocuscircle, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDebug");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i5 = i3 + 79;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            str4 = drawfocuscircle.onNavigationEvent;
            int i7 = i3 + 15;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        drawfocuscircle.logDebug(str, str2, str3, str4);
    }

    @JavascriptInterface
    public final void logDebug(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) throws Throwable {
        Map<String, Object> mapIAuthTabCallback;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        String str5;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 1;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            mapIAuthTabCallback = IAuthTabCallback(str3);
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            str5 = "web";
            z = true;
            i = 122;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            mapIAuthTabCallback = IAuthTabCallback(str3);
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            str5 = "web";
            z = false;
            i = 16;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, str, str2, mapIAuthTabCallback, str5, z, str4, i, (Object) null);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(drawFocusCircle drawfocuscircle, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 3;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: domainLog");
        }
        if ((i & 4) != 0) {
            int i6 = i3 + 75;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        drawfocuscircle.domainLog(str, str2, z);
    }

    @JavascriptInterface
    public final void domainLog(@NotNull String str, @NotNull String str2, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        GetInputImageFromPath.onExtraCallbackWithResult.onNavigationEvent(str, IAuthTabCallback(str2), z);
        int i4 = IAuthTabCallbackStub + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(drawFocusCircle drawfocuscircle, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 51;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i6 = i4 + 115;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = drawfocuscircle.onNavigationEvent;
        }
        drawfocuscircle.log(str, str2, str3, str4);
        int i7 = IAuthTabCallbackStub + 97;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    @JavascriptInterface
    public final void log(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Map<String, Object> mapIAuthTabCallback = IAuthTabCallback(str3);
        if (Intrinsics.areEqual(str, "screen")) {
            mapIAuthTabCallback.put("action_type", "screen");
        }
        Object objRemove = mapIAuthTabCallback.remove("log_version");
        if (!(objRemove instanceof String)) {
            strIntern = null;
        } else {
            int i2 = IAuthTabCallbackStub + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            strIntern = (String) objRemove;
        }
        if (strIntern == null) {
            int i4 = IAuthTabCallbackStub + 113;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new char[]{13762}, (byte) (Color.green(0) + 112), 0 % Color.red(0), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{13762}, (byte) (Color.green(0) + 23), Color.red(0) + 1, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
        }
        new CustomizableLog(str2, str, "web", mapIAuthTabCallback, strIntern, str4).onWarmupCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(TrackLog trackLog, boolean z) {
        String str;
        boolean z2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objRemove = trackLog.onNavigationEvent().remove("_domainLog");
        Object obj = null;
        Map map = !(objRemove instanceof Map) ? null : (Map) objRemove;
        if (map == null) {
            int i4 = IAuthTabCallbackStub + 17;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Object obj2 = map.get("domain");
        if (obj2 instanceof String) {
            int i6 = IAuthTabCallbackStub + 1;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                str = (String) obj2;
                int i7 = 98 / 0;
            } else {
                str = (String) obj2;
            }
        } else {
            str = null;
        }
        if (str != null) {
            int i8 = IAuthTabCallbackStub + 109;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                StringsKt.isBlank(str);
                obj.hashCode();
                throw null;
            }
            String str2 = StringsKt.isBlank(str) ? null : str;
            if (str2 != null) {
                int i9 = asInterface + 71;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                GetInputImageFromPath getInputImageFromPath = GetInputImageFromPath.onExtraCallbackWithResult;
                long interfaceDescriptor = trackLog.getInterfaceDescriptor();
                if (z || !(!Intrinsics.areEqual(trackLog.onNavigationEvent().get("_immediate"), Boolean.TRUE))) {
                    z2 = true;
                } else {
                    int i11 = asInterface + 3;
                    IAuthTabCallbackStub = i11 % 128;
                    if (i11 % 2 == 0) {
                        z2 = false;
                    }
                }
                GetInputImageFromPath.onExtraCallbackWithResult(getInputImageFromPath, str2, interfaceDescriptor, z2, trackLog.asBinder(), trackLog.onNavigationEvent(), map.get("extra"), null, 64, null);
                return true;
            }
        }
        return false;
    }

    private final Map<String, Object> IAuthTabCallback(String str) {
        TossBridgeWebView tossBridgeWebView;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_web", Boolean.TRUE);
        WebView webViewOnWarmupCompleted = onWarmupCompleted();
        String str2 = null;
        if (Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webViewOnWarmupCompleted)) {
            tossBridgeWebView = (TossBridgeWebView) webViewOnWarmupCompleted;
        } else {
            int i2 = asInterface + 77;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            tossBridgeWebView = null;
        }
        if (tossBridgeWebView != null) {
            int i4 = asInterface + 61;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                str2 = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                int i5 = 80 / 0;
            } else {
                str2 = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            }
        }
        linkedHashMap.put("_webview_id", str2);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            if (str != null) {
                wie2 wie2Var = this.IAuthTabCallback;
                wie2Var.onExtraCallback();
                linkedHashMap.putAll((Map) wie2Var.onExtraCallback(new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback)), str));
            }
            kotlin.Result.constructor-impl(Unit.INSTANCE);
            return linkedHashMap;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            return linkedHashMap;
        }
    }

    private final TrackLog onNavigationEvent(String str) {
        TossBridgeWebView tossBridgeWebView;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        wie2 wie2Var = this.IAuthTabCallback;
        wie2Var.onExtraCallback();
        Object objOnExtraCallback = wie2Var.onExtraCallback(TrackLog.Companion.serializer(), str);
        String str2 = null;
        if (!((TrackLog) objOnExtraCallback).access000()) {
            objOnExtraCallback = null;
        }
        TrackLog trackLog = (TrackLog) objOnExtraCallback;
        if (trackLog == null) {
            return null;
        }
        trackLog.onNavigationEvent().put("from_web", Boolean.TRUE);
        Map<String, Object> mapOnNavigationEvent = trackLog.onNavigationEvent();
        WebView webViewOnWarmupCompleted = onWarmupCompleted();
        if (Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webViewOnWarmupCompleted)) {
            int i4 = IAuthTabCallbackStub + 109;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            tossBridgeWebView = (TossBridgeWebView) webViewOnWarmupCompleted;
        } else {
            tossBridgeWebView = null;
        }
        if (tossBridgeWebView != null) {
            int i6 = IAuthTabCallbackStub + 111;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                str2.hashCode();
                throw null;
            }
            str2 = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        mapOnNavigationEvent.put("_webview_id", str2);
        IAuthTabCallback(trackLog, str);
        return trackLog;
    }

    private final TrackEvent onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        wie2 wie2Var = this.IAuthTabCallback;
        wie2Var.onExtraCallback();
        TrackEvent trackEvent = (TrackEvent) wie2Var.onExtraCallback(TrackEvent.Companion.serializer(), str);
        trackEvent.onNavigationEvent().put("from_web", Boolean.TRUE);
        Map<String, Object> mapOnNavigationEvent = trackEvent.onNavigationEvent();
        WebView webViewOnWarmupCompleted = onWarmupCompleted();
        String str2 = null;
        TossBridgeWebView tossBridgeWebView = Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webViewOnWarmupCompleted) ? (TossBridgeWebView) webViewOnWarmupCompleted : null;
        if (tossBridgeWebView != null) {
            int i2 = IAuthTabCallbackStub + 95;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {tossBridgeWebView};
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            if (i3 == 0) {
                str2.hashCode();
                throw null;
            }
            str2 = (String) TossBridgeWebView.onWarmupCompleted(iOnExtraCallback2, objArr, iOnExtraCallback3, -157751857, 157751867, iOnExtraCallback4, iOnExtraCallback);
        }
        mapOnNavigationEvent.put("_webview_id", str2);
        int i4 = IAuthTabCallbackStub + 87;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return trackEvent;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallbackWithResult;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) - 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 26, 23139 - TextUtils.indexOf("", "", 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i6 = $11 + 17;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), Gravity.getAbsoluteGravity(0, 0) + 26, 23139 - Color.blue(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 51;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 73, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i10 = $10 + 51;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 30 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                        int i13 = $10 + 111;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = 5 % 5;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i16];
                        } else {
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i18];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private final TrackState onWarmupCompleted(String str) {
        TossBridgeWebView tossBridgeWebView;
        int i = 2 % 2;
        wie2 wie2Var = this.IAuthTabCallback;
        wie2Var.onExtraCallback();
        TrackState trackState = (TrackState) wie2Var.onExtraCallback(TrackState.Companion.serializer(), str);
        trackState.onNavigationEvent().put("from_web", Boolean.TRUE);
        Map<String, Object> mapOnNavigationEvent = trackState.onNavigationEvent();
        WebView webViewOnWarmupCompleted = onWarmupCompleted();
        String str2 = null;
        if (!(!Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webViewOnWarmupCompleted))) {
            int i2 = asInterface + 5;
            IAuthTabCallbackStub = i2 % 128;
            tossBridgeWebView = (TossBridgeWebView) webViewOnWarmupCompleted;
            if (i2 % 2 != 0) {
                str2.hashCode();
                throw null;
            }
        } else {
            tossBridgeWebView = null;
        }
        if (tossBridgeWebView != null) {
            str2 = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            int i3 = IAuthTabCallbackStub + 85;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        mapOnNavigationEvent.put("_webview_id", str2);
        return trackState;
    }

    private final TrackView onExtraCallback(String str) {
        TossBridgeWebView tossBridgeWebView;
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        wie2 wie2Var = this.IAuthTabCallback;
        wie2Var.onExtraCallback();
        TrackView trackView = (TrackView) wie2Var.onExtraCallback(TrackView.Companion.serializer(), str);
        trackView.onNavigationEvent().put("from_web", Boolean.TRUE);
        Map<String, Object> mapOnNavigationEvent = trackView.onNavigationEvent();
        WebView webViewOnWarmupCompleted = onWarmupCompleted();
        String str2 = null;
        if (Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webViewOnWarmupCompleted)) {
            tossBridgeWebView = (TossBridgeWebView) webViewOnWarmupCompleted;
        } else {
            int i4 = asInterface + 51;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            tossBridgeWebView = null;
        }
        if (tossBridgeWebView != null) {
            int i6 = IAuthTabCallbackStub + 85;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = {tossBridgeWebView};
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            if (i7 == 0) {
                throw null;
            }
            str2 = (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
        }
        mapOnNavigationEvent.put("_webview_id", str2);
        return trackView;
    }

    private final Object IAuthTabCallback(TrackLog trackLog, String str) {
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            wie2 wie2Var = this.IAuthTabCallback;
            if (Intrinsics.areEqual(((Map) wie2Var.onExtraCallback(new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(nzi.onNavigationEvent(wie2Var.onExtraCallback(), Reflection.getOrCreateKotlinClass(Object.class)))), str)).get("log_type"), "screen")) {
                int i2 = asInterface + 63;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    trackLog.onNavigationEvent().put("action_type", "screen");
                    throw null;
                }
                trackLog.onNavigationEvent().put("action_type", "screen");
            }
            return kotlin.Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            Object obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            int i3 = IAuthTabCallbackStub + 83;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 25 / 0;
            }
            return obj;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ void onNavigationEvent(Activity activity) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{activity}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1062841427, iOnExtraCallbackWithResult, -1062841425);
    }

    private static final Unit onExtraCallback(adInfo adinfo) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{adinfo}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1816562068, iOnExtraCallbackWithResult, 1816562069);
    }

    public static /* synthetic */ void onNavigationEvent(drawFocusCircle drawfocuscircle, String str, String str2, String str3, String str4, int i, Object obj) {
        Object[] objArr = {drawfocuscircle, str, str2, str3, str4, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -476421399, iOnExtraCallbackWithResult, 476421399);
    }

    public static /* synthetic */ void IAuthTabCallback(drawFocusCircle drawfocuscircle, String str, boolean z, int i, Object obj) {
        Object[] objArr = {drawfocuscircle, str, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -864154430, iOnExtraCallbackWithResult, 864154433);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{51240, 64967, 64898, 64983, 64982, 64961, 64976, 64988, 64978};
        IAuthTabCallbackDefault = (char) 51242;
    }
}
