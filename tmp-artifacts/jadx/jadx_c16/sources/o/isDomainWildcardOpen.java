package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.home.presentation.legacy_transaction_list.R;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isDomainWildcardOpen implements SearchBarKtExternalSyntheticLambda5 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final ConstraintLayout IAuthTabCallback;
    public final TdsListRowV1View onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return constraintLayoutOnExtraCallbackWithResult;
    }

    private isDomainWildcardOpen(@NonNull ConstraintLayout constraintLayout, @NonNull TdsListRowV1View tdsListRowV1View) {
        this.IAuthTabCallback = constraintLayout;
        this.onWarmupCompleted = tdsListRowV1View;
    }

    public ConstraintLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return constraintLayout;
    }

    public static isDomainWildcardOpen onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.home_presentation_legacy_transaction_list_banner, viewGroup, false);
        if (z) {
            int i4 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static isDomainWildcardOpen onNavigationEvent(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.listRow;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsListRowV1ViewOnNavigationEvent != null) {
            isDomainWildcardOpen isdomainwildcardopen = new isDomainWildcardOpen((ConstraintLayout) view, tdsListRowV1ViewOnNavigationEvent);
            int i5 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return isdomainwildcardopen;
            }
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
