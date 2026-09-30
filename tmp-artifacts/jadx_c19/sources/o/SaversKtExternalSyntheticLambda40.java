package o;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.SaversKtExternalSyntheticLambda35;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class SaversKtExternalSyntheticLambda40<T> implements SaversKtExternalSyntheticLambda35<T> {
    private final ContentResolver IAuthTabCallback;
    private T onNavigationEvent;
    private final Uri onWarmupCompleted;

    protected abstract T IAuthTabCallback(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallbackWithResult() {
    }

    protected abstract void onExtraCallbackWithResult(T t) throws IOException;

    public SaversKtExternalSyntheticLambda40(ContentResolver contentResolver, Uri uri) {
        this.IAuthTabCallback = contentResolver;
        this.onWarmupCompleted = uri;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public final void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super T> onnavigationevent) {
        try {
            T tIAuthTabCallback = IAuthTabCallback(this.onWarmupCompleted, this.IAuthTabCallback);
            this.onNavigationEvent = tIAuthTabCallback;
            onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super T>) tIAuthTabCallback);
        } catch (FileNotFoundException e) {
            onnavigationevent.onExtraCallback((Exception) e);
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallback() {
        T t = this.onNavigationEvent;
        if (t != null) {
            try {
                onExtraCallbackWithResult(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
        return SaversKtExternalSyntheticLambda21.LOCAL;
    }
}
