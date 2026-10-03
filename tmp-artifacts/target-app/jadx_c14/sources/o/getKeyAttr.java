package o;

import android.view.View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.jvm.internal.Intrinsics;
import o.getKeyAttr;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKeyAttr extends RecipientIdentifier<AudienceNetworkAdsApi> {
    private final TdsListRowV1View writeTypedObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getKeyAttr(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.writeTypedObject = view.findViewById(R.id.row);
    }

    @Override // o.RecipientIdentifier
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull AudienceNetworkAdsApi audienceNetworkAdsApi, @Nullable final toHashtable.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(audienceNetworkAdsApi, "");
        super.onExtraCallbackWithResult(audienceNetworkAdsApi, iAuthTabCallback);
        final getInitializationType getinitializationtypeIAuthTabCallback = audienceNetworkAdsApi.IAuthTabCallback();
        if (getinitializationtypeIAuthTabCallback != null) {
            TdsListRowV1View tdsListRowV1View = this.writeTypedObject;
            String strOnWarmupCompleted = getinitializationtypeIAuthTabCallback.onWarmupCompleted();
            tdsListRowV1View.setLeftImage(strOnWarmupCompleted != null ? strOnWarmupCompleted : "");
            this.writeTypedObject.setCenterText1(getinitializationtypeIAuthTabCallback.asInterface());
            this.writeTypedObject.setCenterText2(getinitializationtypeIAuthTabCallback.onExtraCallback());
            this.writeTypedObject.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.UserCardTransactionHeaderBannerViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getKeyAttr.onExtraCallback(iAuthTabCallback, getinitializationtypeIAuthTabCallback, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(toHashtable.IAuthTabCallback iAuthTabCallback, getInitializationType getinitializationtype, View view) {
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallback(getinitializationtype);
        }
    }
}
