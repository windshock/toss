package okhttp3;

import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Call extends Cloneable {

    public interface Factory {
        Call newCall(@NotNull Request request);
    }

    void cancel();

    /* renamed from: clone */
    Call mo311clone();

    void enqueue(@NotNull Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    <T> T tag(@NotNull Class<? extends T> cls);

    <T> T tag(@NotNull Class<T> cls, @NotNull Function0<? extends T> function0);

    <T> T tag(@NotNull KClass<T> kClass);

    <T> T tag(@NotNull KClass<T> kClass, @NotNull Function0<? extends T> function0);

    Timeout timeout();
}
