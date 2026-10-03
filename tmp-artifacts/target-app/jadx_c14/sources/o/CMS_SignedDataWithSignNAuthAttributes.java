package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_SignedDataWithSignNAuthAttributes implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    private final ConstraintLayout asInterface;
    public final TdsButtonV1View onExtraCallback;
    public final Typography1 onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final Typography5 onWarmupCompleted;

    private CMS_SignedDataWithSignNAuthAttributes(@NonNull ConstraintLayout constraintLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull Typography5 typography5, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull Typography1 typography1) {
        this.asInterface = constraintLayout;
        this.onExtraCallback = tdsButtonV1View;
        this.onWarmupCompleted = typography5;
        this.IAuthTabCallback = tdsImageView;
        this.onNavigationEvent = constraintLayout2;
        this.onExtraCallbackWithResult = typography1;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asInterface;
    }

    public static CMS_SignedDataWithSignNAuthAttributes onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CMS_SignedDataWithSignNAuthAttributes onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_under_fourteen_remains, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMS_SignedDataWithSignNAuthAttributes onNavigationEvent(@NonNull View view) {
        Typography5 typography5OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsButtonV1ViewOnNavigationEvent != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.descriptionView))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.imageView))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.titleView;
            Typography1 typography1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (typography1OnNavigationEvent != null) {
                return new CMS_SignedDataWithSignNAuthAttributes(constraintLayout, tdsButtonV1ViewOnNavigationEvent, typography5OnNavigationEvent, tdsImageViewOnNavigationEvent, constraintLayout, typography1OnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
