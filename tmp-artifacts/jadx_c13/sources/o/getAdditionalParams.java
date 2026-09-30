package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAdditionalParams {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @Deprecated
    public static final OkHttpClientBuilderaddNetworkInterceptor2 onExtraCallbackWithResult(int i, int i2, int i3) {
        int i4 = 2 % 2;
        Object[] objArr = {followRedirects.onExtraCallbackWithResult};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        OkHttpClientBuilderaddNetworkInterceptor2 okHttpClientBuilderaddNetworkInterceptor2 = new OkHttpClientBuilderaddNetworkInterceptor2(new setReadTimeoutokhttp((Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()), i, i2, i3));
        int i5 = onNavigationEvent + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return okHttpClientBuilderaddNetworkInterceptor2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static final OkHttpClientBuilderaddNetworkInterceptor2 onExtraCallbackWithResult(float f, float f2, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        followRedirects followredirects = followRedirects.onExtraCallbackWithResult;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3)).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics);
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        DisplayMetrics displayMetrics2 = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, iOnWarmupCompleted5, iOnWarmupCompleted4, iOnWarmupCompleted6)).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        OkHttpClientBuilderaddNetworkInterceptor2 okHttpClientBuilderaddNetworkInterceptor2OnExtraCallbackWithResult = onExtraCallbackWithResult(iOnNavigationEvent, varyMatches.onNavigationEvent(Float.valueOf(f2), displayMetrics2), i);
        int i5 = onNavigationEvent + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return okHttpClientBuilderaddNetworkInterceptor2OnExtraCallbackWithResult;
    }
}
