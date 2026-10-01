package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
final class WebViewProviderAdapterExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WebViewProviderAdapterExternalSyntheticLambda0[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    public static final WebViewProviderAdapterExternalSyntheticLambda0 ADMOB = new WebViewProviderAdapterExternalSyntheticLambda0("ADMOB", 0);
    public static final WebViewProviderAdapterExternalSyntheticLambda0 TOSS = new WebViewProviderAdapterExternalSyntheticLambda0("TOSS", 1);

    private static final /* synthetic */ WebViewProviderAdapterExternalSyntheticLambda0[] $values() {
        WebViewProviderAdapterExternalSyntheticLambda0[] webViewProviderAdapterExternalSyntheticLambda0Arr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            WebViewProviderAdapterExternalSyntheticLambda0 webViewProviderAdapterExternalSyntheticLambda0 = ADMOB;
            WebViewProviderAdapterExternalSyntheticLambda0 webViewProviderAdapterExternalSyntheticLambda02 = TOSS;
            webViewProviderAdapterExternalSyntheticLambda0Arr = new WebViewProviderAdapterExternalSyntheticLambda0[5];
            webViewProviderAdapterExternalSyntheticLambda0Arr[0] = webViewProviderAdapterExternalSyntheticLambda0;
            webViewProviderAdapterExternalSyntheticLambda0Arr[1] = webViewProviderAdapterExternalSyntheticLambda02;
        } else {
            webViewProviderAdapterExternalSyntheticLambda0Arr = new WebViewProviderAdapterExternalSyntheticLambda0[]{ADMOB, TOSS};
        }
        int i4 = i2 + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return webViewProviderAdapterExternalSyntheticLambda0Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<WebViewProviderAdapterExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static WebViewProviderAdapterExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        WebViewProviderAdapterExternalSyntheticLambda0 webViewProviderAdapterExternalSyntheticLambda0 = (WebViewProviderAdapterExternalSyntheticLambda0) Enum.valueOf(WebViewProviderAdapterExternalSyntheticLambda0.class, str);
        int i4 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return webViewProviderAdapterExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WebViewProviderAdapterExternalSyntheticLambda0[] values() {
        WebViewProviderAdapterExternalSyntheticLambda0[] webViewProviderAdapterExternalSyntheticLambda0Arr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            webViewProviderAdapterExternalSyntheticLambda0Arr = (WebViewProviderAdapterExternalSyntheticLambda0[]) $VALUES.clone();
            int i3 = 54 / 0;
        } else {
            webViewProviderAdapterExternalSyntheticLambda0Arr = (WebViewProviderAdapterExternalSyntheticLambda0[]) $VALUES.clone();
        }
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return webViewProviderAdapterExternalSyntheticLambda0Arr;
    }

    private WebViewProviderAdapterExternalSyntheticLambda0(String str, int i) {
    }

    static {
        WebViewProviderAdapterExternalSyntheticLambda0[] webViewProviderAdapterExternalSyntheticLambda0Arr$values = $values();
        $VALUES = webViewProviderAdapterExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(webViewProviderAdapterExternalSyntheticLambda0Arr$values);
        int i = onWarmupCompleted + 109;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
