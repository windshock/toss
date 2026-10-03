package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.SubTypography10;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class genSignedDataWithSign implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final SubTypography10 onWarmupCompleted;

    private genSignedDataWithSign(@NonNull ConstraintLayout constraintLayout, @NonNull SubTypography10 subTypography10) {
        this.IAuthTabCallback = constraintLayout;
        this.onWarmupCompleted = subTypography10;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static genSignedDataWithSign onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static genSignedDataWithSign IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_consumption_action_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static genSignedDataWithSign onExtraCallback(@NonNull View view) {
        int i = R.id.consumptionTitle;
        SubTypography10 subTypography10OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (subTypography10OnNavigationEvent != null) {
            return new genSignedDataWithSign((ConstraintLayout) view, subTypography10OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
