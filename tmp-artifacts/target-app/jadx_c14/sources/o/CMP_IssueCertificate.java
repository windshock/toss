package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsSpace;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;
import viva.republica.toss.send.v3.view.StatusBarSpace;
import viva.republica.toss.widget.LockWheel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_IssueCertificate implements SearchBarKtExternalSyntheticLambda5 {
    public final FrameLayout IAuthTabCallback;
    public final StatusBarSpace IAuthTabCallbackDefault;
    public final TdsSpace IAuthTabCallbackStub;
    private final ConstraintLayout IAuthTabCallbackStubProxy;
    public final TdsSpace asBinder;
    public final Space asInterface;
    public final ConstraintLayout onExtraCallback;
    public final LockWheel onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final Toolbar onTransact;
    public final TdsTopV1View onWarmupCompleted;

    private CMP_IssueCertificate(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsTopV1View tdsTopV1View, @NonNull LockWheel lockWheel, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsSpace tdsSpace, @NonNull TdsSpace tdsSpace2, @NonNull StatusBarSpace statusBarSpace, @NonNull Space space, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackStubProxy = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.onWarmupCompleted = tdsTopV1View;
        this.onExtraCallbackWithResult = lockWheel;
        this.IAuthTabCallback = frameLayout;
        this.onExtraCallback = constraintLayout2;
        this.asBinder = tdsSpace;
        this.IAuthTabCallbackStub = tdsSpace2;
        this.IAuthTabCallbackDefault = statusBarSpace;
        this.asInterface = space;
        this.onTransact = toolbar;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStubProxy;
    }

    public static CMP_IssueCertificate IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMP_IssueCertificate IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CMP_IssueCertificate IAuthTabCallback(@NonNull View view) {
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        LockWheel lockWheelOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsSpace tdsSpaceOnNavigationEvent;
        TdsSpace tdsSpaceOnNavigationEvent2;
        StatusBarSpace statusBarSpaceOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cover_top))) != null && (lockWheelOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lock_wheel))) != null) {
            i = R.id.password_container;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (frameLayout != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.proximity_cover))) != null && (tdsSpaceOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.space_left))) != null && (tdsSpaceOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.space_right))) != null && (statusBarSpaceOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.space_status_bar))) != null) {
                i = R.id.space_top;
                Space space = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (space != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                    return new CMP_IssueCertificate((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsTopV1ViewOnNavigationEvent, lockWheelOnNavigationEvent, frameLayout, constraintLayoutOnNavigationEvent, tdsSpaceOnNavigationEvent, tdsSpaceOnNavigationEvent2, statusBarSpaceOnNavigationEvent, space, toolbarOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
