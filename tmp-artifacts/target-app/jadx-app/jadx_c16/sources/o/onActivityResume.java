package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.home.core.ui.R;
import im.toss.uikit.widget.PillarSwipeRefreshLayout;
import im.toss.uikit.widget.TdsResultV0View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onActivityResume implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private final ConstraintLayout IAuthTabCallback;
    public final TdsResultV0View onExtraCallback;
    public final ConstraintLayout onNavigationEvent;
    public final PillarSwipeRefreshLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutIAuthTabCallback = IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return constraintLayoutIAuthTabCallback;
    }

    private onActivityResume(@NonNull ConstraintLayout constraintLayout, @NonNull TdsResultV0View tdsResultV0View, @NonNull ConstraintLayout constraintLayout2, @NonNull PillarSwipeRefreshLayout pillarSwipeRefreshLayout) {
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallback = tdsResultV0View;
        this.onNavigationEvent = constraintLayout2;
        this.onWarmupCompleted = pillarSwipeRefreshLayout;
    }

    public ConstraintLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.IAuthTabCallback;
        int i5 = i3 + 113;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
      0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static onActivityResume onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.home_v2_core_ui_home_network_error, viewGroup, true);
            if (z) {
                int i3 = onExtraCallbackWithResult + 113;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                viewGroup.addView(viewInflate);
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.home_v2_core_ui_home_network_error, viewGroup, false);
            if (z) {
            }
        }
        return IAuthTabCallback(viewInflate);
    }

    public static onActivityResume IAuthTabCallback(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.errorEmptyStateView;
            TdsResultV0View tdsResultV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (tdsResultV0ViewOnNavigationEvent != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                int i4 = R.id.errorSwipeRefreshLayout;
                PillarSwipeRefreshLayout pillarSwipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (pillarSwipeRefreshLayoutOnNavigationEvent != null) {
                    onActivityResume onactivityresume = new onActivityResume(constraintLayout, tdsResultV0ViewOnNavigationEvent, constraintLayout, pillarSwipeRefreshLayoutOnNavigationEvent);
                    int i5 = onExtraCallbackWithResult + 81;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    return onactivityresume;
                }
                i3 = i4;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.errorEmptyStateView);
        throw null;
    }
}
