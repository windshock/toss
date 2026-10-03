package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class verifyCertCRLFile implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV2View IAuthTabCallback;
    public final Typography7 onExtraCallback;
    public final TdsButtonV1View onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    private verifyCertCRLFile(@NonNull ConstraintLayout constraintLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsImageView tdsImageView, @NonNull Typography7 typography7, @NonNull TdsTopV2View tdsTopV2View) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallbackWithResult = tdsButtonV1View;
        this.onWarmupCompleted = tdsImageView;
        this.onExtraCallback = typography7;
        this.IAuthTabCallback = tdsTopV2View;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static verifyCertCRLFile onExtraCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsButtonV1ViewOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.completedImage))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.hanaAccountGuide))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new verifyCertCRLFile((ConstraintLayout) view, tdsButtonV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, typography7OnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
