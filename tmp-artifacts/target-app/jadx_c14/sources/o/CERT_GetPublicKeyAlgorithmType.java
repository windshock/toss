package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetPublicKeyAlgorithmType implements SearchBarKtExternalSyntheticLambda5 {
    public final ProgressBar IAuthTabCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;

    private CERT_GetPublicKeyAlgorithmType(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ProgressBar progressBar) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.IAuthTabCallback = progressBar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static CERT_GetPublicKeyAlgorithmType onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CERT_GetPublicKeyAlgorithmType onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CERT_GetPublicKeyAlgorithmType IAuthTabCallback(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.progress_bar;
        ProgressBar progressBar = (ProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (progressBar != null) {
            return new CERT_GetPublicKeyAlgorithmType(constraintLayout, constraintLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
