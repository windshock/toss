package o;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignerAttribute extends isSignaturePolicyImplied {
    private final Context IAuthTabCallback;
    private final CardIssueOverviewViewModel onExtraCallback;
    private final getDigestAlgorithms<?> onExtraCallbackWithResult;
    private final TypographyKtExternalSyntheticLambda0 onNavigationEvent;
    private final createNativeBannerAdViewApi onWarmupCompleted;

    public SignerAttribute(@NotNull Context context, @NotNull createNativeBannerAdViewApi createnativebanneradviewapi, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createnativebanneradviewapi, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.IAuthTabCallback = context;
        this.onWarmupCompleted = createnativebanneradviewapi;
        this.onNavigationEvent = typographyKtExternalSyntheticLambda0;
        this.onExtraCallbackWithResult = getdigestalgorithms;
        this.onExtraCallback = cardIssueOverviewViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    @Override // o.isSignaturePolicyImplied
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onWarmupCompleted() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SignerAttribute.onWarmupCompleted():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(SignerAttribute signerAttribute, View view) {
        getDigestAlgorithms.onExtraCallbackWithResult(signerAttribute.onExtraCallbackWithResult, signerAttribute.onNavigationEvent, signerAttribute.onWarmupCompleted.onExtraCallback(), signerAttribute.onExtraCallback, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
    }
}
