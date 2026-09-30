package o;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logCrossPromoteImpression extends OkHttpClientBuilderaddNetworkInterceptor2 {
    public logCrossPromoteImpression(int i, int i2) {
        super(new setRetryOnConnectionFailureokhttp(i, i2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public logCrossPromoteImpression(float f, float f2) {
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
        this(iOnNavigationEvent, varyMatches.onNavigationEvent(Float.valueOf(f2), displayMetrics2));
    }
}
