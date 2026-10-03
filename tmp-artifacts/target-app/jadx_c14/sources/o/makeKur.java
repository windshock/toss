package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class makeKur implements SearchBarKtExternalSyntheticLambda5 {
    public final RecyclerView IAuthTabCallback;
    private final LinearLayout IAuthTabCallbackDefault;
    public final View onExtraCallback;
    public final LinearLayout onExtraCallbackWithResult;
    public final BottomSheetHeader onNavigationEvent;
    public final View onWarmupCompleted;

    private makeKur(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull BottomSheetHeader bottomSheetHeader, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout2) {
        this.IAuthTabCallbackDefault = linearLayout;
        this.onWarmupCompleted = view;
        this.onExtraCallback = view2;
        this.onNavigationEvent = bottomSheetHeader;
        this.IAuthTabCallback = recyclerView;
        this.onExtraCallbackWithResult = linearLayout2;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static makeKur IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static makeKur onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.loan_bottom_sheet_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static makeKur onExtraCallback(@NonNull View view) {
        View viewOnNavigationEvent;
        BottomSheetHeader bottomSheetHeaderOnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent;
        int i = R.id.divider;
        View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (viewOnNavigationEvent2 != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.divider_bottom))) != null && (bottomSheetHeaderOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new makeKur(linearLayout, viewOnNavigationEvent2, viewOnNavigationEvent, bottomSheetHeaderOnNavigationEvent, recyclerViewOnNavigationEvent, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
