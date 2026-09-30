package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ParcelImpl implements SearchBarKtExternalSyntheticLambda5 {
    private static int asInterface = 1;
    private static int onTransact;
    public final TdsImageView IAuthTabCallback;
    public final Typography5 IAuthTabCallbackDefault;
    private final ConstraintLayout asBinder;
    public final View onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ParcelImpl(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull ConstraintLayout constraintLayout3, @NonNull Typography5 typography5) {
        this.asBinder = constraintLayout;
        this.onNavigationEvent = constraintLayout2;
        this.onExtraCallback = view;
        this.IAuthTabCallback = tdsImageView;
        this.onWarmupCompleted = tdsImageView2;
        this.onExtraCallbackWithResult = constraintLayout3;
        this.IAuthTabCallbackDefault = typography5;
    }

    public ConstraintLayout onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.asBinder;
        int i5 = i2 + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ParcelImpl onNavigationEvent(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        int i = 2 % 2;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i2 = R.id.btnPlayClickView;
        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (viewOnNavigationEvent != null) {
            int i3 = onTransact + 119;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                i2 = R.id.btnPlayImage;
                TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsImageViewOnNavigationEvent2 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.pauseStateBackground))) != null) {
                    int i4 = asInterface + 45;
                    onTransact = i4 % 128;
                    if (i4 % 2 == 0) {
                        i2 = R.id.pauseStateLayout;
                        ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (constraintLayoutOnNavigationEvent != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.playGuideTextView))) != null) {
                            return new ParcelImpl(constraintLayout, constraintLayout, viewOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent, constraintLayoutOnNavigationEvent, typography5OnNavigationEvent);
                        }
                    } else {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.pauseStateLayout);
                        throw null;
                    }
                }
            } else {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.btnPlayImage);
                obj.hashCode();
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
