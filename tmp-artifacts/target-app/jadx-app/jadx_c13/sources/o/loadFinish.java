package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface loadFinish<S> extends UpdatePackageStrategy<S> {
    loadFinish<S> onExtraCallback();

    CoroutineContext onExtraCallbackWithResult(@NotNull CoroutineContext.Element element);
}
