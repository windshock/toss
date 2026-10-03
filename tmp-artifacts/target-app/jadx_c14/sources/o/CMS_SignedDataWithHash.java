package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.list.ServiceRow;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_SignedDataWithHash implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final Toolbar asInterface;
    public final ServiceRow onExtraCallback;
    public final ServiceRow onExtraCallbackWithResult;
    public final Typography2 onNavigationEvent;
    public final ServiceRow onWarmupCompleted;

    private CMS_SignedDataWithHash(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull ServiceRow serviceRow, @NonNull ServiceRow serviceRow2, @NonNull ServiceRow serviceRow3, @NonNull Typography2 typography2, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onWarmupCompleted = serviceRow;
        this.onExtraCallback = serviceRow2;
        this.onExtraCallbackWithResult = serviceRow3;
        this.onNavigationEvent = typography2;
        this.asInterface = toolbar;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CMS_SignedDataWithHash onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CMS_SignedDataWithHash onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_under_fourteen_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMS_SignedDataWithHash onNavigationEvent(@NonNull View view) {
        ServiceRow serviceRowOnNavigationEvent;
        ServiceRow serviceRowOnNavigationEvent2;
        ServiceRow serviceRowOnNavigationEvent3;
        Typography2 typography2OnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (serviceRowOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.serviceCertify))) != null && (serviceRowOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.serviceCs))) != null && (serviceRowOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.serviceSettings))) != null && (typography2OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.titleView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CMS_SignedDataWithHash((ConstraintLayout) view, appBarLayoutOnNavigationEvent, serviceRowOnNavigationEvent, serviceRowOnNavigationEvent2, serviceRowOnNavigationEvent3, typography2OnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
