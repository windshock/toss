package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.GraphicDeviceInfo;
import o.doMakeLoader;
import o.getSigQualifier;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSigQualifier implements SigPolicyQualifiers {
    private final getDynamicLoader onWarmupCompleted;

    public getSigQualifier(@NotNull getDynamicLoader getdynamicloader) {
        Intrinsics.checkNotNullParameter(getdynamicloader, "");
        this.onWarmupCompleted = getdynamicloader;
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

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(getSigQualifier getsigqualifier, Context context, TdsListHeaderV3View tdsListHeaderV3View) {
        int iICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        boolean z = getsigqualifier.onWarmupCompleted.IAuthTabCallback().onExtraCallbackWithResult() == doMakeLoader.onExtraCallback.BOLD;
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
        tdsListHeaderV3View.setTitleText(getsigqualifier.onWarmupCompleted.IAuthTabCallback().IAuthTabCallback());
        GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
        tdsListHeaderV3View.setTitleFontWeight(z ? iAuthTabCallback.IAuthTabCallback() : iAuthTabCallback.onNavigationEvent());
        if (z) {
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new IAuthTabCallback(configuration)).onRelationshipValidationResult();
        } else {
            Configuration configuration2 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new onWarmupCompleted(configuration2)).ICustomTabsCallbackStubProxy();
        }
        tdsListHeaderV3View.setTitleTextColor(iICustomTabsCallbackStubProxy);
        tdsListHeaderV3View.setTitleWidthRatioValue(0.9f);
        return Unit.INSTANCE;
    }

    @Override // o.SigPolicyQualifiers
    public View onNavigationEvent(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (this.onWarmupCompleted.IAuthTabCallback().IAuthTabCallback().length() > 0) {
            minWebSocketMessageToCompress.onNavigationEvent(linearLayout, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.content.FaqPlainView$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return getSigQualifier.onNavigationEvent(this.f$0, context, (TdsListHeaderV3View) obj);
                }
            });
        }
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(1);
        if (!Intrinsics.areEqual(this.onWarmupCompleted.onExtraCallbackWithResult(), "adaptive-background") || this.onWarmupCompleted.IAuthTabCallback().IAuthTabCallback().length() == 0) {
            DisplayMetrics displayMetrics = linearLayout2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
            DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            linearLayout2.setPadding(0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(40, displayMetrics2));
        }
        linearLayout2.setBackgroundColor(setBodyokhttp.onWarmupCompleted(context, this.onWarmupCompleted.onExtraCallbackWithResult(), 0));
        linearLayout2.addView(getSigPolicyQualifierId.onNavigationEvent(context, this.onWarmupCompleted.onNavigationEvent()));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, linearLayout2);
        return linearLayout;
    }
}
