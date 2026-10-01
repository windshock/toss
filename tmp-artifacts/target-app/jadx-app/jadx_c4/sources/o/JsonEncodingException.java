package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface JsonEncodingException<T> {
    void onExtraCallback(@Nullable T t);

    void onExtraCallbackWithResult(long j);

    T onNavigationEvent();

    void onWarmupCompleted();
}
