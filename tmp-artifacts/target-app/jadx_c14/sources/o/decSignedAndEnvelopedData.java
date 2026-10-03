package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class decSignedAndEnvelopedData implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListHeaderV3View IAuthTabCallback;
    public final TdsImageView IAuthTabCallbackDefault;
    private final LinearLayout IAuthTabCallbackStub;
    public final Typography5 onExtraCallback;
    public final LinearLayout onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final View onWarmupCompleted;

    private decSignedAndEnvelopedData(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull Typography5 typography5, @NonNull ConstraintLayout constraintLayout, @NonNull TdsListHeaderV3View tdsListHeaderV3View, @NonNull TdsImageView tdsImageView) {
        this.IAuthTabCallbackStub = linearLayout;
        this.onWarmupCompleted = view;
        this.onExtraCallbackWithResult = linearLayout2;
        this.onExtraCallback = typography5;
        this.onNavigationEvent = constraintLayout;
        this.IAuthTabCallback = tdsListHeaderV3View;
        this.IAuthTabCallbackDefault = tdsImageView;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static decSignedAndEnvelopedData onExtraCallbackWithResult(@NonNull View view) {
        Typography5 typography5OnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsListHeaderV3View tdsListHeaderV3ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        int i = R.id.clickView;
        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (viewOnNavigationEvent != null) {
            i = R.id.content;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.expand_title))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.expandView))) != null && (tdsListHeaderV3ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerView))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.icon))) != null) {
                return new decSignedAndEnvelopedData((LinearLayout) view, viewOnNavigationEvent, linearLayout, typography5OnNavigationEvent, constraintLayoutOnNavigationEvent, tdsListHeaderV3ViewOnNavigationEvent, tdsImageViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
