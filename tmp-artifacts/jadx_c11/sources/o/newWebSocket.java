package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class newWebSocket {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ addFixedPosition onWarmupCompleted(View view, MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        addFixedPosition addfixedpositionIAuthTabCallback = IAuthTabCallback(view, maxAdPlacerExternalSyntheticLambda2);
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return addfixedpositionIAuthTabCallback;
    }

    private static final addFixedPosition IAuthTabCallback(View view, MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2) {
        int i = 2 % 2;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (!readIntokhttp.onExtraCallback(configuration)) {
            return maxAdPlacerExternalSyntheticLambda2.onExtraCallbackWithResult();
        }
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        addFixedPosition addfixedpositionOnWarmupCompleted = maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted();
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return addfixedpositionOnWarmupCompleted;
    }
}
