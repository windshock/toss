package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_AsymmDecryptWithCert implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    public final ProgressBar onExtraCallback;
    public final FrameLayout onExtraCallbackWithResult;
    public final Group onNavigationEvent;
    private final ConstraintLayout onTransact;
    public final Toolbar onWarmupCompleted;

    private CRYPT_AsymmDecryptWithCert(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull Group group, @NonNull ProgressBar progressBar, @NonNull Toolbar toolbar, @NonNull View view) {
        this.onTransact = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallbackWithResult = frameLayout;
        this.onNavigationEvent = group;
        this.onExtraCallback = progressBar;
        this.onWarmupCompleted = toolbar;
        this.IAuthTabCallbackDefault = view;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onTransact;
    }

    public static CRYPT_AsymmDecryptWithCert IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CRYPT_AsymmDecryptWithCert onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_withdraw_additional_agreement, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CRYPT_AsymmDecryptWithCert onNavigationEvent(@NonNull View view) {
        Group groupOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        View viewOnNavigationEvent;
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null) {
            i = R.id.contents_container;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (frameLayout != null && (groupOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.loading_group))) != null) {
                i = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (progressBar != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.touch_blocker))) != null) {
                    return new CRYPT_AsymmDecryptWithCert((ConstraintLayout) view, appBarLayoutOnNavigationEvent, frameLayout, groupOnNavigationEvent, progressBar, toolbarOnNavigationEvent, viewOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
