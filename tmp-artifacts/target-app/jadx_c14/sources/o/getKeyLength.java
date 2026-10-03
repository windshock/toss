package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.compat.component.compound.post.TdsPostV2View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getKeyLength;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKeyLength implements MicrosoftObjectIdentifiers {
    private final DynamicLoaderFactoryExternalSyntheticApiModelOutline0 onNavigationEvent;

    public getKeyLength(@NotNull DynamicLoaderFactoryExternalSyntheticApiModelOutline0 dynamicLoaderFactoryExternalSyntheticApiModelOutline0) {
        Intrinsics.checkNotNullParameter(dynamicLoaderFactoryExternalSyntheticApiModelOutline0, "");
        this.onNavigationEvent = dynamicLoaderFactoryExternalSyntheticApiModelOutline0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(getKeyLength getkeylength, Context context, TdsListHeaderV3View tdsListHeaderV3View) {
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        DisplayMetrics displayMetrics = tdsListHeaderV3View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsListHeaderV3View, varyMatches.onNavigationEvent(8, displayMetrics));
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
        tdsListHeaderV3View.setTitleText(getkeylength.onNavigationEvent.onExtraCallback());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onRelationshipValidationResult());
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(String str, TdsPostV2View tdsPostV2View) {
        Intrinsics.checkNotNullParameter(tdsPostV2View, "");
        tdsPostV2View.setPostStyle(new TdsPostV2View.onExtraCallback.IAuthTabCallback_Parcel(0));
        tdsPostV2View.setText(str);
        tdsPostV2View.setLowerMargin(8.0f);
        return Unit.INSTANCE;
    }

    @Override // o.MicrosoftObjectIdentifiers
    public View onWarmupCompleted(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        minWebSocketMessageToCompress.onNavigationEvent(linearLayout, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.shinhan.ListDescriptionView$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getKeyLength.onNavigationEvent(this.f$0, context, (TdsListHeaderV3View) obj);
            }
        });
        for (final String str : this.onNavigationEvent.onNavigationEvent()) {
            interceptors.onExtraCallback(linearLayout, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.shinhan.ListDescriptionView$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return getKeyLength.onNavigationEvent(str, (TdsPostV2View) obj);
                }
            });
        }
        return linearLayout;
    }
}
