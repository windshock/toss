package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.OriginatorInfo;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OriginatorInfo extends RecipientIdentifier<AudienceNetworkRemoteServiceApiHorizonWorldUrlLauncher> {
    private final TdsImageView extraCallback;
    private final Typography6 writeTypedObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginatorInfo(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.extraCallback = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.icon);
        this.writeTypedObject = ((RecyclerView.ViewHolder) this).onNavigationEvent.findViewById(R.id.title);
    }

    @Override // o.RecipientIdentifier
    public void IAuthTabCallback(@NotNull final AudienceNetworkRemoteServiceApiHorizonWorldUrlLauncher audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher) {
        Intrinsics.checkNotNullParameter(audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher, "");
        super.IAuthTabCallback((OriginatorInfo) audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher);
        TdsImageView tdsImageView = this.extraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher.onExtraCallbackWithResult(), (Function1) null, (Function1) null, 6, (Object) null);
        this.writeTypedObject.setText(audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher.IAuthTabCallback());
        ((RecyclerView.ViewHolder) this).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.PlccNoticeViewHolder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OriginatorInfo.onWarmupCompleted(audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(AudienceNetworkRemoteServiceApiHorizonWorldUrlLauncher audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher, View view) {
        audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher.onExtraCallback().invoke();
    }
}
