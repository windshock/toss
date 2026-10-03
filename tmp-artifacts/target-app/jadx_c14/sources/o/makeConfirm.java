package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class makeConfirm implements SearchBarKtExternalSyntheticLambda5 {
    private final View onExtraCallbackWithResult;

    private makeConfirm(@NonNull View view) {
        this.onExtraCallbackWithResult = view;
    }

    public View getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static makeConfirm onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_space, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static makeConfirm onWarmupCompleted(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new makeConfirm(view);
    }
}
