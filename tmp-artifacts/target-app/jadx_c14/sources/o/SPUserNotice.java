package o;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.ui.faq.content.CardIssueExpandView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SPUserNotice implements SigPolicyQualifiers {
    private final getCacheCodeDirLegacy onWarmupCompleted;

    public SPUserNotice(@NotNull getCacheCodeDirLegacy getcachecodedirlegacy) {
        Intrinsics.checkNotNullParameter(getcachecodedirlegacy, "");
        this.onWarmupCompleted = getcachecodedirlegacy;
    }

    @Override // o.SigPolicyQualifiers
    public View onNavigationEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        CardIssueExpandView cardIssueExpandView = new CardIssueExpandView(context2, null, 0, 6, null);
        cardIssueExpandView.setFaqData(this.onWarmupCompleted);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, cardIssueExpandView);
        return linearLayout;
    }
}
