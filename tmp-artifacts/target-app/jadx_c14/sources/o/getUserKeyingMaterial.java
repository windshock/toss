package o;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getUserKeyingMaterial;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getUserKeyingMaterial extends RecipientIdentifier<AudienceNetworkRemoteServiceApiPackageVerifier> {
    private final TextView ICustomTabsCallback;
    private final TextView extraCallback;
    private final ImageView onActivityLayout;
    private final TdsImageView writeTypedObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getUserKeyingMaterial(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.writeTypedObject = view.findViewById(R.id.icon);
        this.ICustomTabsCallback = (TextView) view.findViewById(R.id.title);
        this.extraCallback = (TextView) view.findViewById(R.id.body);
        this.onActivityLayout = (ImageView) view.findViewById(R.id.warning);
    }

    @Override // o.RecipientIdentifier
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull final AudienceNetworkRemoteServiceApiPackageVerifier audienceNetworkRemoteServiceApiPackageVerifier, @Nullable toHashtable.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(audienceNetworkRemoteServiceApiPackageVerifier, "");
        final nativeAddRoundedCornersFilter nativeaddroundedcornersfilterOnExtraCallbackWithResult = audienceNetworkRemoteServiceApiPackageVerifier.onExtraCallbackWithResult();
        TdsImageView tdsImageView = this.writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, nativeaddroundedcornersfilterOnExtraCallbackWithResult.onExtraCallbackWithResult(), (Function1) null, (Function1) null, 6, (Object) null);
        this.ICustomTabsCallback.setText(nativeaddroundedcornersfilterOnExtraCallbackWithResult.IAuthTabCallbackDefault());
        this.ICustomTabsCallback.setTextColor(Color.parseColor(nativeaddroundedcornersfilterOnExtraCallbackWithResult.IAuthTabCallbackStub()));
        this.extraCallback.setText(nativeaddroundedcornersfilterOnExtraCallbackWithResult.onWarmupCompleted());
        this.extraCallback.setTextColor(Color.parseColor(nativeaddroundedcornersfilterOnExtraCallbackWithResult.IAuthTabCallback()));
        ImageView imageView = this.onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(audienceNetworkRemoteServiceApiPackageVerifier.onExtraCallbackWithResult().onExtraCallback() ? 0 : 8);
        IAuthTabCallback().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.PlccCardBannerViewHolder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getUserKeyingMaterial.IAuthTabCallback(nativeaddroundedcornersfilterOnExtraCallbackWithResult, audienceNetworkRemoteServiceApiPackageVerifier, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(nativeAddRoundedCornersFilter nativeaddroundedcornersfilter, AudienceNetworkRemoteServiceApiPackageVerifier audienceNetworkRemoteServiceApiPackageVerifier, View view) {
        SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, view.getContext(), nativeaddroundedcornersfilter.onNavigationEvent(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        audienceNetworkRemoteServiceApiPackageVerifier.onNavigationEvent().invoke();
    }
}
