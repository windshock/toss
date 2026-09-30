package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.ReactRootView;
import im.toss.rn.toss.core.R;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    public final ReactRootView IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final TdsSkeletonV1View onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final Toolbar onNavigationEvent;
    public final ConstraintLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        ConstraintLayout constraintLayoutOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            constraintLayoutOnExtraCallback = onExtraCallback();
            int i3 = 24 / 0;
        } else {
            constraintLayoutOnExtraCallback = onExtraCallback();
        }
        int i4 = IAuthTabCallbackDefault + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnExtraCallback;
    }

    private r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull ReactRootView reactRootView, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsSkeletonV1View tdsSkeletonV1View, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.IAuthTabCallback = reactRootView;
        this.onWarmupCompleted = constraintLayout2;
        this.onExtraCallback = tdsSkeletonV1View;
        this.onNavigationEvent = toolbar;
    }

    public ConstraintLayout onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.IAuthTabCallbackStub;
        int i5 = i2 + 7;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U r8lambdah5oewef3xe9uqz9sunpymkbeo1uIAuthTabCallback = IAuthTabCallback(layoutInflater, null, false);
        int i4 = asBinder + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdah5oewef3xe9uqz9sunpymkbeo1uIAuthTabCallback;
    }

    public static r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_react_scheme_activity, viewGroup, false);
        if (z) {
            int i4 = IAuthTabCallbackDefault + 121;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 58 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U onExtraCallbackWithResult(@NonNull View view) {
        ReactRootView reactRootViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.app_bar_layout;
            AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (appBarLayoutOnNavigationEvent != null && (reactRootViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i3 = R.id.react_root_view))) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i3 = R.id.skeleton;
                TdsSkeletonV1View tdsSkeletonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                if (tdsSkeletonV1ViewOnNavigationEvent != null) {
                    int i4 = IAuthTabCallbackDefault + 19;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        i3 = R.id.tool_bar;
                        Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                        if (toolbarOnNavigationEvent != null) {
                            return new r8lambdah5OEwEF3Xe9UqZ9SUNPyMkBEo1U(constraintLayout, appBarLayoutOnNavigationEvent, reactRootViewOnNavigationEvent, constraintLayout, tdsSkeletonV1ViewOnNavigationEvent, toolbarOnNavigationEvent);
                        }
                    } else {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.tool_bar);
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.app_bar_layout);
        obj.hashCode();
        throw null;
    }
}
