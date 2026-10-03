package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class decEncryptedData implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    public final ConstraintLayout asBinder;
    public final ConstraintLayout onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final Typography7 onNavigationEvent;
    private final FrameLayout onTransact;
    public final Typography7 onWarmupCompleted;

    private decEncryptedData(@NonNull FrameLayout frameLayout, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout, @NonNull Typography7 typography7, @NonNull TdsImageView tdsImageView2, @NonNull Typography7 typography72, @NonNull ConstraintLayout constraintLayout2) {
        this.onTransact = frameLayout;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = constraintLayout;
        this.onNavigationEvent = typography7;
        this.onExtraCallbackWithResult = tdsImageView2;
        this.onWarmupCompleted = typography72;
        this.asBinder = constraintLayout2;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onTransact;
    }

    public static decEncryptedData onWarmupCompleted(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent2;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        int i = R.id.lastSyncTimeIcon;
        TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent2 != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lastSyncTimeLayout))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lastSyncTimeText))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.taskStatusIcon))) != null && (typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.taskStatusText))) != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.taskStatusTextLayout))) != null) {
            return new decEncryptedData((FrameLayout) view, tdsImageViewOnNavigationEvent2, constraintLayoutOnNavigationEvent, typography7OnNavigationEvent, tdsImageViewOnNavigationEvent, typography7OnNavigationEvent2, constraintLayoutOnNavigationEvent2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
