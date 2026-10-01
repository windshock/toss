package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setCertVerifyEnvExternal implements SearchBarKtExternalSyntheticLambda5 {
    private final FrameLayout IAuthTabCallback;
    public final FrameLayout onNavigationEvent;

    private setCertVerifyEnvExternal(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.IAuthTabCallback = frameLayout;
        this.onNavigationEvent = frameLayout2;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static setCertVerifyEnvExternal onExtraCallbackWithResult(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new setCertVerifyEnvExternal(frameLayout, frameLayout);
    }
}
