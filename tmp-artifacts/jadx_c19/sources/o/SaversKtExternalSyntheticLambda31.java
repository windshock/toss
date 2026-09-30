package o;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import o.SaversKtExternalSyntheticLambda35;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class SaversKtExternalSyntheticLambda31<T> implements SaversKtExternalSyntheticLambda35<T> {
    private final String onExtraCallback;
    private final AssetManager onExtraCallbackWithResult;
    private T onWarmupCompleted;

    protected abstract T onExtraCallback(AssetManager assetManager, String str) throws IOException;

    protected abstract void onExtraCallback(T t) throws IOException;

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallbackWithResult() {
    }

    public SaversKtExternalSyntheticLambda31(AssetManager assetManager, String str) {
        this.onExtraCallbackWithResult = assetManager;
        this.onExtraCallback = str;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super T> onnavigationevent) {
        try {
            T tOnExtraCallback = onExtraCallback(this.onExtraCallbackWithResult, this.onExtraCallback);
            this.onWarmupCompleted = tOnExtraCallback;
            onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super T>) tOnExtraCallback);
        } catch (IOException e) {
            onnavigationevent.onExtraCallback((Exception) e);
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallback() {
        T t = this.onWarmupCompleted;
        if (t != null) {
            try {
                onExtraCallback(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
        return SaversKtExternalSyntheticLambda21.LOCAL;
    }
}
