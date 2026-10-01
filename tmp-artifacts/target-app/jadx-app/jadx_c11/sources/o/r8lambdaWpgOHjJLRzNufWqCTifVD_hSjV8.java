package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.rn.toss.core.R;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    public final ConstraintLayout IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final Toolbar onExtraCallback;
    public final FrameLayout onExtraCallbackWithResult;
    public final TdsSkeletonV1View onNavigationEvent;
    public final AppBarLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallbackStub + 91;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayoutIAuthTabCallback;
        }
        throw null;
    }

    private r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsSkeletonV1View tdsSkeletonV1View, @NonNull Toolbar toolbar) {
        this.asBinder = constraintLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onExtraCallbackWithResult = frameLayout;
        this.IAuthTabCallback = constraintLayout2;
        this.onNavigationEvent = tdsSkeletonV1View;
        this.onExtraCallback = toolbar;
    }

    public ConstraintLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.asBinder;
        int i5 = i3 + 97;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 r8lambdawpgohjjlrznufwqctifvd_hsjv8OnExtraCallback = onExtraCallback(layoutInflater, null, false);
        int i4 = asInterface + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdawpgohjjlrznufwqctifvd_hsjv8OnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_portal_service_activity, viewGroup, false);
        if (z) {
            int i4 = asInterface + 113;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
            int i6 = asInterface + 93;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
        return IAuthTabCallback(viewInflate);
    }

    public static r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8 IAuthTabCallback(@NonNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.app_bar_layout;
            AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (appBarLayoutOnNavigationEvent != null) {
                i3 = R.id.portal_content_view;
                FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                if (frameLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i3 = R.id.skeleton;
                    TdsSkeletonV1View tdsSkeletonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    if (tdsSkeletonV1ViewOnNavigationEvent != null) {
                        int i4 = asInterface + 59;
                        IAuthTabCallbackStub = i4 % 128;
                        int i5 = i4 % 2;
                        i3 = R.id.tool_bar;
                        Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                        if (toolbarOnNavigationEvent != null) {
                            return new r8lambdaWpgOHjJLRzNufWqCTifVD_hSjV8(constraintLayout, appBarLayoutOnNavigationEvent, frameLayout, constraintLayout, tdsSkeletonV1ViewOnNavigationEvent, toolbarOnNavigationEvent);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.app_bar_layout);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
