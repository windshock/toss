package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import im.toss.uikit.drawable.RectCropTransformation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.card.CardMonthSelectDialog;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OriginatorIdentifierOrKey {
    public static final OriginatorIdentifierOrKey onExtraCallbackWithResult = new OriginatorIdentifierOrKey();

    private OriginatorIdentifierOrKey() {
    }

    public final void onExtraCallbackWithResult(@Nullable String str, @NotNull ImageView imageView, boolean z, int i, int i2, @Nullable SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1, boolean z2, @Nullable Integer num) {
        int i3;
        Intrinsics.checkNotNullParameter(imageView, "");
        if (!z2) {
            i3 = 0;
        } else if (z) {
            i3 = R.drawable.img_banklogo_square_null;
        } else {
            i3 = im.toss.core.R.drawable.img_card_placeholder;
        }
        if (str != null && !StringsKt.isBlank(str)) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(str);
            List listMutableListOf = CollectionsKt.mutableListOf(new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new Cookies_removeSessionCookies(str + z, z)});
            if (num != null) {
                listMutableListOf.add(getAdditionalParams.onExtraCallbackWithResult(i, i2, num.intValue()));
            }
            if (i > 0 && i2 > 0) {
                listMutableListOf.add(new RectCropTransformation(i, i2));
            }
            if (singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 != null) {
                listMutableListOf.add(singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1);
            }
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback2 = Recomposerjoin2.onExtraCallback(RecomposerrecompositionRunner2.IAuthTabCallback(RecomposerrecompositionRunner2.onWarmupCompleted(onnavigationeventOnExtraCallback, listMutableListOf), true), imageView);
            if (i3 != 0) {
                Drawable drawableOnExtraCallbackWithResult = ITrustedWebActivityServiceStub.onExtraCallbackWithResult(imageView.getContext(), i3);
                onnavigationeventOnExtraCallback2.onNavigationEvent(drawableOnExtraCallbackWithResult != null ? CarouselPagerStateExternalSyntheticLambda1.onNavigationEvent(drawableOnExtraCallbackWithResult) : null).onExtraCallbackWithResult(drawableOnExtraCallbackWithResult != null ? CarouselPagerStateExternalSyntheticLambda1.onNavigationEvent(drawableOnExtraCallbackWithResult) : null);
            }
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context2).onWarmupCompleted(onnavigationeventOnExtraCallback2.onExtraCallbackWithResult());
            return;
        }
        CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(imageView.getContext()).onWarmupCompleted(Recomposerjoin2.onExtraCallback(new RecomposerawaitIdle2.onNavigationEvent(imageView.getContext()).onExtraCallback(Integer.valueOf(i3)), imageView).onExtraCallbackWithResult());
    }

    public final void onWarmupCompleted(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, int i, int i2, int i3, @NotNull String str, @Nullable CardMonthSelectDialog.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(str, "");
        CardMonthSelectDialog.Companion.IAuthTabCallback(Integer.valueOf(i), i2, i3, str, onnavigationevent).show(flowMeasureLazyPolicyExternalSyntheticLambda3, "selectMonthDialog");
    }
}
