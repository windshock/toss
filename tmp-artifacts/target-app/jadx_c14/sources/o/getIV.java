package o;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.tds.R;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.uikit.widget.table.TdsTableRowV1LeftView;
import im.toss.uikit.widget.table.TdsTableRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getIV;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIV implements MicrosoftObjectIdentifiers {
    private final DynamicLoaderFallback onWarmupCompleted;

    public getIV(@NotNull DynamicLoaderFallback dynamicLoaderFallback) {
        Intrinsics.checkNotNullParameter(dynamicLoaderFallback, "");
        this.onWarmupCompleted = dynamicLoaderFallback;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(getIV getiv, Context context, TdsListHeaderV3View tdsListHeaderV3View) {
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        DisplayMetrics displayMetrics = tdsListHeaderV3View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsListHeaderV3View, varyMatches.onNavigationEvent(8, displayMetrics));
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
        tdsListHeaderV3View.setTitleText(getiv.onWarmupCompleted.onExtraCallbackWithResult());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new IAuthTabCallback(configuration)).onRelationshipValidationResult());
        return Unit.INSTANCE;
    }

    @Override // o.MicrosoftObjectIdentifiers
    public View onWarmupCompleted(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        minWebSocketMessageToCompress.onNavigationEvent(linearLayout, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.shinhan.TableDescriptionView$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getIV.IAuthTabCallback(this.f$0, context, (TdsListHeaderV3View) obj);
            }
        });
        for (equalsMethods equalsmethods : this.onWarmupCompleted.onExtraCallback()) {
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            TdsTableRowV1LeftView tdsTableRowV1LeftView = new TdsTableRowV1LeftView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            Context context3 = tdsTableRowV1LeftView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsTableRowV1LeftView.IAuthTabCallback(new getUrlokhttp(new onExtraCallback(configuration)).ICustomTabsCallbackStubProxy());
            tdsTableRowV1LeftView.onExtraCallback(R.font.toss_product_sans_bd);
            Context context4 = tdsTableRowV1LeftView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration2 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsTableRowV1LeftView.onExtraCallbackWithResult(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).ICustomTabsCallbackStubProxy());
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            TdsTableRowV1View.onExtraCallback(iOnExtraCallback, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1425704444, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1425704444, iOnExtraCallback2, new Object[]{tdsTableRowV1LeftView, true});
            Object[] objArr = {tdsTableRowV1LeftView, equalsmethods.onExtraCallback()};
            TdsTableRowV1View.onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1606023985, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1606023987, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr);
            String strOnWarmupCompleted = equalsmethods.onWarmupCompleted();
            Spanned spannedOnNavigationEvent = null;
            if (strOnWarmupCompleted != null) {
                spannedOnNavigationEvent = BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnWarmupCompleted, false, 1, (Object) null);
            }
            tdsTableRowV1LeftView.onNavigationEvent(spannedOnNavigationEvent);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsTableRowV1LeftView);
        }
        return linearLayout;
    }
}
