package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class initializeAPI implements SearchBarKtExternalSyntheticLambda5 {
    private final FrameLayout onExtraCallback;
    public final FrameLayout onWarmupCompleted;

    private initializeAPI(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.onExtraCallback = frameLayout;
        this.onWarmupCompleted = frameLayout2;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onExtraCallback;
    }

    public static initializeAPI onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static initializeAPI onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_auth_cs_web, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static initializeAPI onExtraCallbackWithResult(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new initializeAPI(frameLayout, frameLayout);
    }
}
