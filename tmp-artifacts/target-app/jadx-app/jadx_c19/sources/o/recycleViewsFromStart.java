package o;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.KakaoSdkError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class recycleViewsFromStart<T, E> extends ResultReceiver {
    private E IAuthTabCallback;
    private final String onWarmupCompleted;

    public abstract void IAuthTabCallback(@NotNull Throwable th);

    public abstract Throwable onExtraCallbackWithResult(@NotNull Uri uri);

    public abstract void onNavigationEvent(@NotNull T t);

    public abstract boolean onNavigationEvent(@NotNull Uri uri);

    public abstract T onWarmupCompleted(@NotNull Uri uri);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public recycleViewsFromStart(@NotNull String str) {
        super(new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
    }

    public final E onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final void IAuthTabCallback(E e) {
        this.IAuthTabCallback = e;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i2, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        updateLayoutStateToFillStart.Companion.IAuthTabCallback("***** " + this.onWarmupCompleted + " Status: " + bundle);
        if (i2 == -1) {
            onWarmupCompleted(bundle);
        } else if (i2 == 0) {
            onNavigationEvent(bundle);
        } else {
            IAuthTabCallback();
        }
        this.IAuthTabCallback = null;
    }

    public final void onWarmupCompleted(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Uri uri = (Uri) PreviewView1ExternalSyntheticLambda2.onNavigationEvent(bundle, "key.url", Uri.class);
        if (uri == null) {
            throw new IllegalStateException();
        }
        if (onNavigationEvent(uri)) {
            IAuthTabCallback(onExtraCallbackWithResult(uri));
            return;
        }
        T tOnWarmupCompleted = onWarmupCompleted(uri);
        if (tOnWarmupCompleted == null) {
            IAuthTabCallback((Throwable) new ClientError(ClientErrorCause.Unknown, "Failed to parse response\n" + uri));
            return;
        }
        onNavigationEvent((recycleViewsFromStart<T, E>) tOnWarmupCompleted);
    }

    public final void onNavigationEvent(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        KakaoSdkError kakaoSdkErrorOnWarmupCompleted = PreviewView1ExternalSyntheticLambda2.onWarmupCompleted(bundle, "key.exception", KakaoSdkError.class);
        if (kakaoSdkErrorOnWarmupCompleted != null) {
            IAuthTabCallback((Throwable) kakaoSdkErrorOnWarmupCompleted);
        }
    }

    public final void IAuthTabCallback() {
        IAuthTabCallback((Throwable) new IllegalStateException("Unknown resultCode in " + getClass().getSimpleName() + "#onReceivedResult()"));
    }
}
