package kotlinx.coroutines.internal;

import java.util.List;
import o.setPatch;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface MainDispatcherFactory {
    setPatch createDispatcher(@NotNull List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
