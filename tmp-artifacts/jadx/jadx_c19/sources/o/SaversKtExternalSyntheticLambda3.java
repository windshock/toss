package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda3<T> {
    private static final IAuthTabCallback<Object> onWarmupCompleted = new IAuthTabCallback<Object>() { // from class: o.SaversKtExternalSyntheticLambda3.1
        @Override // o.SaversKtExternalSyntheticLambda3.IAuthTabCallback
        public void onNavigationEvent(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    };
    private final T IAuthTabCallback;
    private final String onExtraCallback;
    private volatile byte[] onExtraCallbackWithResult;
    private final IAuthTabCallback<T> onNavigationEvent;

    public interface IAuthTabCallback<T> {
        void onNavigationEvent(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public static <T> SaversKtExternalSyntheticLambda3<T> IAuthTabCallback(@NonNull String str) {
        return new SaversKtExternalSyntheticLambda3<>(str, null, onNavigationEvent());
    }

    public static <T> SaversKtExternalSyntheticLambda3<T> onWarmupCompleted(@NonNull String str, @NonNull T t) {
        return new SaversKtExternalSyntheticLambda3<>(str, t, onNavigationEvent());
    }

    public static <T> SaversKtExternalSyntheticLambda3<T> onExtraCallbackWithResult(@NonNull String str, @Nullable T t, @NonNull IAuthTabCallback<T> iAuthTabCallback) {
        return new SaversKtExternalSyntheticLambda3<>(str, t, iAuthTabCallback);
    }

    private SaversKtExternalSyntheticLambda3(@NonNull String str, @Nullable T t, @NonNull IAuthTabCallback<T> iAuthTabCallback) {
        this.onExtraCallback = markHierarchyDirty.onExtraCallbackWithResult(str);
        this.IAuthTabCallback = t;
        this.onNavigationEvent = (IAuthTabCallback) markHierarchyDirty.onExtraCallbackWithResult(iAuthTabCallback);
    }

    public T IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public void onNavigationEvent(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.onNavigationEvent.onNavigationEvent(onExtraCallbackWithResult(), t, messageDigest);
    }

    private byte[] onExtraCallbackWithResult() {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = this.onExtraCallback.getBytes(SaversKtExternalSyntheticLambda26.IAuthTabCallback);
        }
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SaversKtExternalSyntheticLambda3) {
            return this.onExtraCallback.equals(((SaversKtExternalSyntheticLambda3) obj).onExtraCallback);
        }
        return false;
    }

    public int hashCode() {
        return this.onExtraCallback.hashCode();
    }

    private static <T> IAuthTabCallback<T> onNavigationEvent() {
        return (IAuthTabCallback<T>) onWarmupCompleted;
    }

    public String toString() {
        return "Option{key='" + this.onExtraCallback + "'}";
    }
}
