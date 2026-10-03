package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.text.Typography7;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ASymmetricKey implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography7 onExtraCallback;
    private final LinearLayout onWarmupCompleted;

    private ASymmetricKey(@NonNull LinearLayout linearLayout, @NonNull Typography7 typography7) {
        this.onWarmupCompleted = linearLayout;
        this.onExtraCallback = typography7;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static ASymmetricKey onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static ASymmetricKey onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_guardian_certify_pending_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static ASymmetricKey onWarmupCompleted(@NonNull View view) {
        int i = R.id.message;
        Typography7 typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (typography7OnNavigationEvent != null) {
            return new ASymmetricKey((LinearLayout) view, typography7OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
