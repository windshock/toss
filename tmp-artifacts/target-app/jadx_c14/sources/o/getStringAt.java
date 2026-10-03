package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getStringAt implements SigPolicyQualifiers {
    private final isFallbackMode onExtraCallbackWithResult;

    public getStringAt(@NotNull isFallbackMode isfallbackmode) {
        Intrinsics.checkNotNullParameter(isfallbackmode, "");
        this.onExtraCallbackWithResult = isfallbackmode;
    }

    @Override // o.SigPolicyQualifiers
    public View onNavigationEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        View view = new View(linearLayout.getContext());
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int iOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams2.height = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallbackWithResult), displayMetrics);
        layoutParams2.width = -1;
        view.setLayoutParams(layoutParams);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, view);
        return linearLayout;
    }
}
