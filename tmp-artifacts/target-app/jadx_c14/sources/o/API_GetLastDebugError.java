package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class API_GetLastDebugError implements SearchBarKtExternalSyntheticLambda5 {
    public final Toolbar IAuthTabCallback;
    public final LottieAnimationView onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final Typography5 onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private API_GetLastDebugError(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull Toolbar toolbar, @NonNull Typography5 typography5) {
        this.onWarmupCompleted = constraintLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onExtraCallback = lottieAnimationView;
        this.IAuthTabCallback = toolbar;
        this.onNavigationEvent = typography5;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static API_GetLastDebugError onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static API_GetLastDebugError IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_card_notification_register_nudge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static API_GetLastDebugError onExtraCallback(@NonNull View view) {
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        int i = R.id.appBar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tvTitle))) != null) {
            return new API_GetLastDebugError((ConstraintLayout) view, appBarLayoutOnNavigationEvent, lottieAnimationViewOnNavigationEvent, toolbarOnNavigationEvent, typography5OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
