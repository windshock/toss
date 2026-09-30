package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class ycx6 extends setPatch implements BufferOutputStream {
    private final Throwable IAuthTabCallback;
    private final String onNavigationEvent;

    @Override // o.setPatch
    public setPatch onExtraCallback() {
        return this;
    }

    @Override // o.BufferOutputStream
    public /* synthetic */ void onWarmupCompleted(long j, maybeRemoveAttachStateListener mayberemoveattachstatelistener) {
        onExtraCallback(j, (maybeRemoveAttachStateListener<? super Unit>) mayberemoveattachstatelistener);
    }

    @Override // o.GeckoHubImp
    public boolean onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext) {
        IAuthTabCallback();
        throw new setWrite();
    }

    @Override // o.setPatch, o.GeckoHubImp
    public GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        IAuthTabCallback();
        throw new setWrite();
    }

    @Override // o.BufferOutputStream
    public setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        IAuthTabCallback();
        throw new setWrite();
    }

    @Override // o.GeckoHubImp
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        IAuthTabCallback();
        throw new setWrite();
    }

    public Void onExtraCallback(long j, @NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        IAuthTabCallback();
        throw new setWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Void IAuthTabCallback() {
        String str;
        if (this.IAuthTabCallback == null) {
            lud4.onNavigationEvent();
            throw new setWrite();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.onNavigationEvent;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = _UrlKt.FRAGMENT_ENCODE_SET;
            }
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString(), this.IAuthTabCallback);
    }

    @Override // o.setPatch, o.GeckoHubImp
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.IAuthTabCallback != null) {
            str = ", cause=" + this.IAuthTabCallback;
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
