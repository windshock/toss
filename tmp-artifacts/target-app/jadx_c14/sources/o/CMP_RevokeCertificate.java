package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pnikosis.materialishprogress.ProgressWheel;
import im.toss.core.webkit.bridge.image.crop.FocusView;
import im.toss.core.webkit.bridge.image.crop.PinchImageView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_RevokeCertificate implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsButtonV1View IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final ConstraintLayout asInterface;
    public final PinchImageView onExtraCallback;
    public final View onExtraCallbackWithResult;
    public final View onNavigationEvent;
    public final ProgressWheel onTransact;
    public final FocusView onWarmupCompleted;

    private CMP_RevokeCertificate(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull View view2, @NonNull FocusView focusView, @NonNull PinchImageView pinchImageView, @NonNull ProgressWheel progressWheel, @NonNull ConstraintLayout constraintLayout2) {
        this.asBinder = constraintLayout;
        this.onExtraCallbackWithResult = view;
        this.IAuthTabCallback = tdsButtonV1View;
        this.onNavigationEvent = view2;
        this.onWarmupCompleted = focusView;
        this.onExtraCallback = pinchImageView;
        this.onTransact = progressWheel;
        this.asInterface = constraintLayout2;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static CMP_RevokeCertificate onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CMP_RevokeCertificate onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_photo_crop, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMP_RevokeCertificate onExtraCallbackWithResult(@NonNull View view) {
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        View viewOnNavigationEvent;
        FocusView focusViewOnNavigationEvent;
        PinchImageView pinchImageViewOnNavigationEvent;
        ProgressWheel progressWheelOnNavigationEvent;
        int i = R.id.activity_photo_crop_bound;
        View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (viewOnNavigationEvent2 != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.activity_photo_crop_button))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.activityPhotoCropCoverView))) != null && (focusViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.activity_photo_crop_focus))) != null && (pinchImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.activity_photo_crop_image))) != null && (progressWheelOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.activity_photo_crop_progress))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new CMP_RevokeCertificate(constraintLayout, viewOnNavigationEvent2, tdsButtonV1ViewOnNavigationEvent, viewOnNavigationEvent, focusViewOnNavigationEvent, pinchImageViewOnNavigationEvent, progressWheelOnNavigationEvent, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
