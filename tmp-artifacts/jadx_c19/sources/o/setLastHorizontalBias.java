package o;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setLastHorizontalBias implements setVerticalStyle {
    @Override // o.setVerticalStyle
    public void onExtraCallbackWithResult(@NonNull Layer layer) {
    }

    @Override // o.setVerticalStyle
    public void onNavigationEvent(@NonNull Layer layer) {
        layer.onStart();
    }
}
