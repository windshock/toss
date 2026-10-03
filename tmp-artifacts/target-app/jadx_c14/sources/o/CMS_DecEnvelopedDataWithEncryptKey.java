package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_DecEnvelopedDataWithEncryptKey implements SearchBarKtExternalSyntheticLambda5 {
    public final RecyclerView IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final Toolbar onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final SwipeRefreshLayout onWarmupCompleted;

    private CMS_DecEnvelopedDataWithEncryptKey(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.IAuthTabCallback = recyclerView;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.onWarmupCompleted = swipeRefreshLayout;
        this.onExtraCallback = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CMS_DecEnvelopedDataWithEncryptKey onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMS_DecEnvelopedDataWithEncryptKey IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_toss_card_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMS_DecEnvelopedDataWithEncryptKey onExtraCallbackWithResult(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.swipeRefreshLayout;
            SwipeRefreshLayout swipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (swipeRefreshLayoutOnNavigationEvent != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new CMS_DecEnvelopedDataWithEncryptKey(constraintLayout, appBarLayoutOnNavigationEvent, recyclerViewOnNavigationEvent, constraintLayout, swipeRefreshLayoutOnNavigationEvent, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
