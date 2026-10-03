package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SigPolicyQualifierInfo implements SigPolicyQualifiers {
    private final maybeInitInternally onExtraCallbackWithResult;

    public SigPolicyQualifierInfo(@NotNull maybeInitInternally maybeinitinternally) {
        Intrinsics.checkNotNullParameter(maybeinitinternally, "");
        this.onExtraCallbackWithResult = maybeinitinternally;
    }

    @Override // o.SigPolicyQualifiers
    public View onNavigationEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsRoundLayout tdsRoundLayout = new TdsRoundLayout(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics = tdsRoundLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsRoundLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -935338024, new Object[]{tdsRoundLayout, Integer.valueOf(iOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics2))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 935338026);
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout.getResources().getDisplayMetrics(), "");
        tdsRoundLayout.setRadius(varyMatches.onNavigationEvent(20, r5));
        tdsRoundLayout.setBackgroundColor(setBodyokhttp.onWarmupCompleted(context, this.onExtraCallbackWithResult.onWarmupCompleted(), 0));
        Context context3 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout2 = new LinearLayout(context3);
        linearLayout2.setOrientation(1);
        DisplayMetrics displayMetrics3 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(12, displayMetrics3);
        DisplayMetrics displayMetrics4 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        linearLayout2.setPadding(0, iOnNavigationEvent2, 0, varyMatches.onNavigationEvent(12, displayMetrics4));
        linearLayout2.addView(getSigPolicyQualifierId.onNavigationEvent(context, this.onExtraCallbackWithResult.onExtraCallback()));
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsRoundLayout, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsRoundLayout);
        return linearLayout;
    }
}
