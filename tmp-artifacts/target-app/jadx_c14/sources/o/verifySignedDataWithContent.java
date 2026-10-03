package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class verifySignedDataWithContent implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    private final View onNavigationEvent;
    public final View onWarmupCompleted;

    private verifySignedDataWithContent(@NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull View view2) {
        this.onNavigationEvent = view;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onExtraCallback = tdsListRowV1View;
        this.onWarmupCompleted = view2;
    }

    public View getRoot() {
        return this.onNavigationEvent;
    }

    public static verifySignedDataWithContent onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_home_transaction_dutch, viewGroup);
        return onNavigationEvent(viewGroup);
    }

    public static verifySignedDataWithContent onNavigationEvent(@NonNull View view) {
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        View viewOnNavigationEvent;
        int i = R.id.leftImage;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.listRow))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.overlay))) != null) {
            return new verifySignedDataWithContent(view, tdsImageViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, viewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
