package o;

import android.content.Context;
import androidx.annotation.NonNull;
import o.setLastHorizontalStyle;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class setLastVerticalBias implements setLastHorizontalStyle {
    final setLastHorizontalStyle.onExtraCallback IAuthTabCallback;
    private final Context onExtraCallback;

    @Override // o.Layer
    public void onDestroy() {
    }

    setLastVerticalBias(@NonNull Context context, @NonNull setLastHorizontalStyle.onExtraCallback onextracallback) {
        this.onExtraCallback = context.getApplicationContext();
        this.IAuthTabCallback = onextracallback;
    }

    private void onExtraCallbackWithResult() {
        setWrapMode.IAuthTabCallback(this.onExtraCallback).onWarmupCompleted(this.IAuthTabCallback);
    }

    private void onExtraCallback() {
        setWrapMode.IAuthTabCallback(this.onExtraCallback).onExtraCallback(this.IAuthTabCallback);
    }

    @Override // o.Layer
    public void onStart() {
        onExtraCallbackWithResult();
    }

    @Override // o.Layer
    public void onStop() {
        onExtraCallback();
    }
}
