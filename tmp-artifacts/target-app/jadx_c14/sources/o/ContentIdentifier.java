package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ContentIdentifier extends isSignaturePolicyImplied {
    private final createNativeAdImageApi IAuthTabCallback;
    private final Context onWarmupCompleted;

    public ContentIdentifier(@NotNull Context context, @NotNull createNativeAdImageApi createnativeadimageapi) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createnativeadimageapi, "");
        this.onWarmupCompleted = context;
        this.IAuthTabCallback = createnativeadimageapi;
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        LinearLayout linearLayout = new LinearLayout(this.onWarmupCompleted);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListHeaderV2View tdsListHeaderV2View = new TdsListHeaderV2View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsListHeaderV2View.setHeaderType(TdsListHeaderV2View.onExtraCallback.ROW1B);
        Context context2 = tdsListHeaderV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        getUrlokhttp geturlokhttp = new getUrlokhttp(new onExtraCallbackWithResult(configuration));
        tdsListHeaderV2View.setTitleColor(geturlokhttp.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttp.getInterfaceDescriptor().ICustomTabsCallbackStubProxy() : geturlokhttp.requestPostMessageChannel().onMinimized());
        tdsListHeaderV2View.setTitle(this.IAuthTabCallback.onWarmupCompleted());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListHeaderV2View);
        return linearLayout;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }
}
