package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class updateCertificate_Close implements SearchBarKtExternalSyntheticLambda5 {
    private final FrameLayout IAuthTabCallback;
    public final FrameLayout onNavigationEvent;

    private updateCertificate_Close(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.IAuthTabCallback = frameLayout;
        this.onNavigationEvent = frameLayout2;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static updateCertificate_Close onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static updateCertificate_Close onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.transparent_web_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static updateCertificate_Close onExtraCallbackWithResult(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new updateCertificate_Close(frameLayout, frameLayout);
    }
}
