package o;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class TTAppOpenAdActivity4 extends onScrollChange {
    private final WeakReference<onScrollChange> onExtraCallbackWithResult;

    TTAppOpenAdActivity4(@NonNull onScrollChange onscrollchange) {
        this.onExtraCallbackWithResult = new WeakReference<>(onscrollchange);
    }

    boolean onExtraCallback() {
        return this.onExtraCallbackWithResult.get() == null;
    }

    onScrollChange onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.get();
    }

    @Override // o.onScrollChange
    public void onWarmupCompleted(int i, @NonNull TTAppOpenAdActivity2 tTAppOpenAdActivity2) {
        onScrollChange onscrollchange = this.onExtraCallbackWithResult.get();
        if (onscrollchange != null) {
            onscrollchange.onWarmupCompleted(i, tTAppOpenAdActivity2);
        }
    }

    @Override // o.onScrollChange
    public void onWarmupCompleted(@NonNull List<TTAppOpenAdActivity2> list) {
        onScrollChange onscrollchange = this.onExtraCallbackWithResult.get();
        if (onscrollchange != null) {
            onscrollchange.onWarmupCompleted(list);
        }
    }

    @Override // o.onScrollChange
    public void onExtraCallback(int i) {
        onScrollChange onscrollchange = this.onExtraCallbackWithResult.get();
        if (onscrollchange != null) {
            onscrollchange.onExtraCallback(i);
        }
    }
}
