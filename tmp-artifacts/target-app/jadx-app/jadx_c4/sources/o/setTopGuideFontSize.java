package o;

import android.net.Uri;
import android.webkit.WebView;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.core.webkit.WebJsBridgeKt$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import o.onPreviewFrame;
import o.setTopGuideFontSize;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setTopGuideFontSize {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onExtraCallbackWithResult("WebJsBridge");
    private static final Regex IAuthTabCallback = new Regex("^[\\w$-]+(\\.[\\w$-]+)*$");
    private static final Regex onNavigationEvent = new Regex("^[A-Za-z_$][\\w$]*(\\.[A-Za-z_$][\\w$]*)*$");

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i6 | i5));
        int i11 = ~(i7 | i9);
        int i12 = (~i5) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i6);
        int i15 = i6 + i3 + i2 + ((-1261570137) * i4) + (2040842291 * i);
        int i16 = i15 * i15;
        int i17 = ((i6 * (-750812765)) - 1471086592) + ((-750812765) * i3) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i2) + ((-1928462336) * i4) + (1629880320 * i) + (2096168960 * i16);
        int i18 = ((i6 * 1408203179) - 1033136887) + (i3 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i2 * 1408202841) + (i4 * (-1046847217)) + (i * (-121732677)) + (i16 * 1741225984);
        int i19 = i17 + (i18 * i18 * 838795264);
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? i19 != 5 ? onWarmupCompleted(objArr) : IAuthTabCallbackStub(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(jsonElement, startrunning);
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            return (Unit) IAuthTabCallback(new Object[]{startrunning}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1163058481, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1163058477);
        }
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int i3 = 79 / 0;
        return (Unit) IAuthTabCallback(new Object[]{startrunning}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1163058481, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -1163058477);
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Integer num = (Integer) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            return (Unit) IAuthTabCallback(new Object[]{num, startrunning}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 38646214, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -38646214);
        }
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{num, startrunning}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 38646214, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -38646214);
        int i3 = 84 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Double d, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(d, startrunning);
        }
        onNavigationEvent(d, startrunning);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Long l, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(l, startrunning);
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(startrunning);
        }
        onWarmupCompleted(startrunning);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Boolean bool, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(bool, startrunning);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(bool, startrunning);
        int i3 = onWarmupCompleted + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, startrunning);
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onPreviewFrame onpreviewframe, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onpreviewframe, startrunning);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        int i5 = onWarmupCompleted + 37;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(com.google.gson.JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(jsonElement, startrunning);
        int i4 = onWarmupCompleted + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    static {
        int i = IAuthTabCallbackDefault + 25;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static final String IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strQuote = JSONObject.quote(str);
        Intrinsics.checkNotNullExpressionValue(strQuote, "");
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strQuote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final String onExtraCallback(onPreviewFrame onpreviewframe) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (onpreviewframe instanceof onPreviewFrame.onWarmupCompleted) {
            return "null";
        }
        if (onpreviewframe instanceof onPreviewFrame.onExtraCallback) {
            return String.valueOf(((onPreviewFrame.onExtraCallback) onpreviewframe).IAuthTabCallback());
        }
        if (onpreviewframe instanceof onPreviewFrame.onExtraCallbackWithResult) {
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return String.valueOf(((onPreviewFrame.onExtraCallbackWithResult) onpreviewframe).IAuthTabCallback());
        }
        if (!(onpreviewframe instanceof onPreviewFrame.IAuthTabCallback)) {
            if (onpreviewframe instanceof onPreviewFrame.IAuthTabCallbackDefault) {
                return IAuthTabCallback(((onPreviewFrame.IAuthTabCallbackDefault) onpreviewframe).onExtraCallbackWithResult());
            }
            if (!(onpreviewframe instanceof onPreviewFrame.onNavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            return "JSON.parse(" + IAuthTabCallback(((onPreviewFrame.onNavigationEvent) onpreviewframe).onExtraCallback()) + ")";
        }
        onPreviewFrame.IAuthTabCallback iAuthTabCallback = (onPreviewFrame.IAuthTabCallback) onpreviewframe;
        if (Double.isNaN(iAuthTabCallback.onWarmupCompleted())) {
            return "NaN";
        }
        if (iAuthTabCallback.onWarmupCompleted() == Double.POSITIVE_INFINITY) {
            return "Infinity";
        }
        if (iAuthTabCallback.onWarmupCompleted() == Double.NEGATIVE_INFINITY) {
            return "-Infinity";
        }
        String strValueOf = String.valueOf(iAuthTabCallback.onWarmupCompleted());
        int i4 = onExtraCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return strValueOf;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        WebView webView = (WebView) objArr[0];
        String str = (String) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0 ? (iIntValue & 2) != 0 : (iIntValue & 3) != 0) {
            function1 = new Function1() { // from class: im.toss.core.webkit.WebJsBridgeKt$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitIAuthTabCallback = setTopGuideFontSize.IAuthTabCallback((startRunning) obj2);
                    int i6 = onExtraCallback + 65;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return unitIAuthTabCallback;
                }
            };
        }
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(new Object[]{webView, str, function1}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1755743382);
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        startRunning startrunning = (startRunning) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        WebView webView = (WebView) objArr[0];
        String str = (String) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        onPreviewFrame[] onpreviewframeArrOnExtraCallback = startrunning.onExtraCallback();
        ArraysKt.joinToString$default(onpreviewframeArrOnExtraCallback, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        webView.evaluateJavascript((String) IAuthTabCallback(new Object[]{str, onpreviewframeArrOnExtraCallback, null, 4, null}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 659773750, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -659773747), null);
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(onPreviewFrame onpreviewframe, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.IAuthTabCallback(onpreviewframe);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback(onpreviewframe);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return unit2;
    }

    public static final void onWarmupCompleted(@NotNull WebView webView, @NotNull String str, @NotNull onPreviewFrame onpreviewframe) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onpreviewframe, "");
        Object[] objArr = {webView, str, new WebJsBridgeKt$.ExternalSyntheticLambda0(onpreviewframe)};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1755743382);
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallback(@NotNull WebView webView, @NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = {webView, str, new WebJsBridgeKt$.ExternalSyntheticLambda8(str2)};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1755743382);
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    private static final Unit onNavigationEvent(String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return unit;
    }

    public static final void onExtraCallbackWithResult(@NotNull WebView webView, @NotNull String str, @Nullable final Boolean bool) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = {webView, str, new Function1() { // from class: im.toss.core.webkit.WebJsBridgeKt$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = setTopGuideFontSize.onExtraCallbackWithResult(bool, (startRunning) obj);
                int i5 = onExtraCallbackWithResult + 3;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1755743382);
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
    }

    private static final Unit onWarmupCompleted(Boolean bool, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.onNavigationEvent(bool);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onNavigationEvent(bool);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Integer num = (Integer) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.onExtraCallbackWithResult(num);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onExtraCallbackWithResult(num);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 19;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(Long l, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.onExtraCallback(l);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onExtraCallback(l);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onNavigationEvent(Double d, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onNavigationEvent(d);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback(jsonElement);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallback(@NotNull WebView webView, @NotNull String str, @Nullable final com.google.gson.JsonElement jsonElement) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = {webView, str, new Function1() { // from class: im.toss.core.webkit.WebJsBridgeKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 49;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = setTopGuideFontSize.onNavigationEvent(jsonElement, (startRunning) obj);
                int i5 = onNavigationEvent + 5;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1755743382);
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(com.google.gson.JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonElement}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void onExtraCallbackWithResult(@NotNull WebView webView, @NotNull String str, @NotNull String str2, @NotNull Function1<? super startRunning, Unit> function1) {
        String lowerCase;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        onPreviewFrame[] onpreviewframeArrOnExtraCallback = startrunning.onExtraCallback();
        ArraysKt.joinToString$default(onpreviewframeArrOnExtraCallback, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        String host = Uri.parse(str2).getHost();
        Object obj = null;
        if (host != null) {
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(host.toLowerCase(Locale.ROOT), "");
                obj.hashCode();
                throw null;
            }
            lowerCase = host.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            webView.evaluateJavascript(onExtraCallback(str, onpreviewframeArrOnExtraCallback, lowerCase), null);
            return;
        }
        int i3 = onExtraCallback + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final void onExtraCallback(@NotNull StringBuilder sb, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sb, "");
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback.onExtraCallbackWithResult(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(str, "");
        if ((!IAuthTabCallback.onExtraCallbackWithResult(str)) || onNavigationEvent.onExtraCallbackWithResult(str)) {
            sb.append(str);
            return;
        }
        sb.append("globalThis");
        int i3 = onExtraCallback + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        for (String str2 : StringsKt.split$default(str, new String[]{"."}, false, 0, 6, (Object) null)) {
            int i5 = onExtraCallback + 1;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            sb.append('[');
            sb.append(JSONObject.quote(str2));
            sb.append(']');
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        onPreviewFrame[] onpreviewframeArr = (onPreviewFrame[]) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = null;
        if ((iIntValue & 4) != 0) {
            int i5 = i2 + 111;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        String strOnExtraCallback = onExtraCallback(str, onpreviewframeArr, str2);
        int i7 = onWarmupCompleted + 17;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return strOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }

    public static final String onExtraCallback(@NotNull String str, @NotNull onPreviewFrame[] onpreviewframeArr, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onpreviewframeArr, "");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (str2 != null) {
            int i3 = onExtraCallback + 117;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                sb.append("if(document.location.hostname.toLowerCase()==='");
                sb.append(str2);
                sb.append("'){");
                int i4 = 87 / 0;
            } else {
                sb.append("if(document.location.hostname.toLowerCase()==='");
                sb.append(str2);
                sb.append("'){");
            }
        }
        onExtraCallback(sb, str);
        sb.append('(');
        int length = onpreviewframeArr.length;
        int i5 = 0;
        while (i2 < length) {
            int i6 = onWarmupCompleted + 27;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            onPreviewFrame onpreviewframe = onpreviewframeArr[i2];
            if (i5 > 0) {
                sb.append(',');
                int i8 = onExtraCallback + 29;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            sb.append(onExtraCallback(onpreviewframe));
            i2++;
            i5++;
        }
        sb.append(");");
        if (str2 != null) {
            int i10 = onWarmupCompleted + 115;
            onExtraCallback = i10 % 128;
            sb.append(i10 % 2 == 0 ? '.' : '}');
        }
        return sb.toString();
    }

    public static /* synthetic */ Unit onExtraCallback(Integer num, startRunning startrunning) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{num, startrunning}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1051134047, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1051134042);
    }

    public static /* synthetic */ String onExtraCallback(String str, onPreviewFrame[] onpreviewframeArr, String str2, int i, Object obj) {
        Object[] objArr = {str, onpreviewframeArr, str2, Integer.valueOf(i), obj};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (String) IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 659773750, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -659773747);
    }

    public static final void onNavigationEvent(@NotNull WebView webView, @NotNull String str, @NotNull Function1<? super startRunning, Unit> function1) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(new Object[]{webView, str, function1}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1755743382);
    }

    public static /* synthetic */ void onExtraCallback(WebView webView, String str, Function1 function1, int i, Object obj) {
        Object[] objArr = {webView, str, function1, Integer.valueOf(i), obj};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 57251240, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -57251238);
    }

    private static final Unit onExtraCallbackWithResult(startRunning startrunning) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{startrunning}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1163058481, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1163058477);
    }

    private static final Unit IAuthTabCallback(Integer num, startRunning startrunning) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (Unit) IAuthTabCallback(new Object[]{num, startrunning}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 38646214, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -38646214);
    }
}
