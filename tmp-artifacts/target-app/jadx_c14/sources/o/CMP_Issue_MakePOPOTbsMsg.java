package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Issue_MakePOPOTbsMsg implements SearchBarKtExternalSyntheticLambda5 {
    public final RecyclerView IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final AppBarLayout onExtraCallback;
    public final Toolbar onExtraCallbackWithResult;
    public final View onNavigationEvent;
    public final TextView onWarmupCompleted;

    private CMP_Issue_MakePOPOTbsMsg(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
        this.asBinder = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.onNavigationEvent = view;
        this.onWarmupCompleted = textView;
        this.IAuthTabCallback = recyclerView;
        this.onExtraCallbackWithResult = toolbar;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static CMP_Issue_MakePOPOTbsMsg IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CMP_Issue_MakePOPOTbsMsg onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_plcc_bill, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CMP_Issue_MakePOPOTbsMsg onWarmupCompleted(@NonNull View view) {
        View viewOnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.blankView))) != null) {
            i = R.id.month_text;
            TextView textView = (TextView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (textView != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new CMP_Issue_MakePOPOTbsMsg((ConstraintLayout) view, appBarLayoutOnNavigationEvent, viewOnNavigationEvent, textView, recyclerViewOnNavigationEvent, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
