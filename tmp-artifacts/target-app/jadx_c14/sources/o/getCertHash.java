package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import im.toss.uikit.widget.table.TdsTableRowV1RightView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCertHash extends isSignaturePolicyImplied {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onExtraCallback = 8;
    private final Context IAuthTabCallback;
    private final CardIssueOverviewViewModel asBinder;
    private final getDigestAlgorithms<?> onExtraCallbackWithResult;
    private final TypographyKtExternalSyntheticLambda0 onNavigationEvent;
    private final getInitApi onWarmupCompleted;

    public getCertHash(@NotNull getInitApi getinitapi, @NotNull Context context, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel, @NotNull getDigestAlgorithms<?> getdigestalgorithms) {
        Intrinsics.checkNotNullParameter(getinitapi, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        this.onWarmupCompleted = getinitapi;
        this.IAuthTabCallback = context;
        this.onNavigationEvent = typographyKtExternalSyntheticLambda0;
        this.asBinder = cardIssueOverviewViewModel;
        this.onExtraCallbackWithResult = getdigestalgorithms;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    @Override // o.isSignaturePolicyImplied
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onWarmupCompleted() {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCertHash.onWarmupCompleted():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(TdsTableRowV1RightView tdsTableRowV1RightView, createNativeAdViewTypeApi createnativeadviewtypeapi, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, tdsTableRowV1RightView.getContext(), createnativeadviewtypeapi.onExtraCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
