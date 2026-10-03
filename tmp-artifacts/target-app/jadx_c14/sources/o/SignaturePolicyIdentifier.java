package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignaturePolicyIdentifier extends isSignaturePolicyImplied {
    private final Context IAuthTabCallback;
    private final createInterstitialAd onExtraCallback;
    private final CardIssueOverviewViewModel onExtraCallbackWithResult;
    private final TypographyKtExternalSyntheticLambda0 onNavigationEvent;
    private final getDigestAlgorithms<?> onWarmupCompleted;

    public SignaturePolicyIdentifier(@NotNull Context context, @NotNull createInterstitialAd createinterstitialad, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createinterstitialad, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.IAuthTabCallback = context;
        this.onExtraCallback = createinterstitialad;
        this.onNavigationEvent = typographyKtExternalSyntheticLambda0;
        this.onWarmupCompleted = getdigestalgorithms;
        this.onExtraCallbackWithResult = cardIssueOverviewViewModel;
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        LinearLayout linearLayout = new LinearLayout(this.IAuthTabCallback);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        if (StringsKt.endsWith$default(this.onExtraCallback.onNavigationEvent(), ".json", false, 2, (Object) null)) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(linearLayout.getContext());
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
            DisplayMetrics displayMetrics = lottieAnimationView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            layoutParams2.width = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallbackWithResult), displayMetrics);
            int iIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
            DisplayMetrics displayMetrics2 = lottieAnimationView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            layoutParams2.height = varyMatches.onNavigationEvent(Integer.valueOf(iIAuthTabCallback), displayMetrics2);
            lottieAnimationView.setLayoutParams(layoutParams);
            lottieAnimationView.setAnimationFromUrl(this.onExtraCallback.onNavigationEvent());
            lottieAnimationView.playAnimation();
            DisplayMetrics displayMetrics3 = lottieAnimationView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            Object[] objArr = {lottieAnimationView, Integer.valueOf(varyMatches.onNavigationEvent(48, displayMetrics3))};
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
            DisplayMetrics displayMetrics4 = lottieAnimationView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(lottieAnimationView, varyMatches.onNavigationEvent(48, displayMetrics4));
            setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, lottieAnimationView);
            return linearLayout;
        }
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsImageView tdsImageView = new TdsImageView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Context context2 = tdsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context2).onExtraCallback(this.onExtraCallback.onNavigationEvent());
        int iOnExtraCallbackWithResult2 = this.onExtraCallback.onExtraCallbackWithResult();
        DisplayMetrics displayMetrics5 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallbackWithResult2), displayMetrics5);
        int iIAuthTabCallback2 = this.onExtraCallback.IAuthTabCallback();
        DisplayMetrics displayMetrics6 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        TdsImageView.setImage$default(tdsImageView, onnavigationeventOnExtraCallback.onExtraCallback(iOnNavigationEvent, varyMatches.onNavigationEvent(Integer.valueOf(iIAuthTabCallback2), displayMetrics6)), (Function1) null, (Function1) null, 6, (Object) null);
        DisplayMetrics displayMetrics7 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        Object[] objArr2 = {tdsImageView, Integer.valueOf(varyMatches.onNavigationEvent(48, displayMetrics7))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        DisplayMetrics displayMetrics8 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tdsImageView, varyMatches.onNavigationEvent(48, displayMetrics8));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView);
        return linearLayout;
    }
}
