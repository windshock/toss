package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.createNativeAdBaseFromBidPayload;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getLocalityName extends isSignaturePolicyImplied {
    private final createNativeAdBaseFromBidPayload IAuthTabCallback;
    private final TypographyKtExternalSyntheticLambda0 onExtraCallback;
    private final CardIssueOverviewViewModel onExtraCallbackWithResult;
    private final getDigestAlgorithms<?> onNavigationEvent;
    private final Context onWarmupCompleted;

    public getLocalityName(@NotNull Context context, @NotNull createNativeAdBaseFromBidPayload createnativeadbasefrombidpayload, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createnativeadbasefrombidpayload, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.onWarmupCompleted = context;
        this.IAuthTabCallback = createnativeadbasefrombidpayload;
        this.onExtraCallback = typographyKtExternalSyntheticLambda0;
        this.onNavigationEvent = getdigestalgorithms;
        this.onExtraCallbackWithResult = cardIssueOverviewViewModel;
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        LinearLayout linearLayout = new LinearLayout(this.onWarmupCompleted);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        Configuration configuration = tdsListRowV1View.getContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onWarmupCompleted(configuration)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View.setCenterText1(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(this.IAuthTabCallback.onExtraCallback(), false, 1, (Object) null));
        createNativeAdBaseFromBidPayload.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
        if (iAuthTabCallbackOnExtraCallbackWithResult != null) {
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View.setLeftImageSize(setTagsokhttp.onExtraCallbackWithResult(tdsListRowV1View, 24), setTagsokhttp.onExtraCallbackWithResult(tdsListRowV1View, 24));
            tdsListRowV1View.setLeftImage(iAuthTabCallbackOnExtraCallbackWithResult.onWarmupCompleted());
        }
        tdsListRowV1View.setRightArrow(this.IAuthTabCallback.onWarmupCompleted());
        if (this.IAuthTabCallback.IAuthTabCallback() != null) {
            getDigestAlgorithms.onExtraCallbackWithResult(this.onNavigationEvent, this.onExtraCallback, this.IAuthTabCallback.IAuthTabCallback(), this.onExtraCallbackWithResult, this.IAuthTabCallback.onExtraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        return linearLayout;
    }
}
