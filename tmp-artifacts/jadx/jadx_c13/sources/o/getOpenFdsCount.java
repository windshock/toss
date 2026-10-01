package o;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.getProcessUptime;
import o.getRevision;
import o.getThreadsMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getOpenFdsCount {
    public static final <E> getProcessUptime<E> IAuthTabCallback(@NotNull getProcessUptime<? extends E> getprocessuptime, @NotNull Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(getprocessuptime, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            return getprocessuptime.onWarmupCompleted((Collection<? extends Object>) iterable);
        }
        getProcessUptime.onExtraCallback<? extends E> onextracallbackIAuthTabCallback = getprocessuptime.IAuthTabCallback();
        CollectionsKt__MutableCollectionsKt.addAll(onextracallbackIAuthTabCallback, iterable);
        return onextracallbackIAuthTabCallback.IAuthTabCallback();
    }

    public static final <E> getThreadsMap<E> onExtraCallbackWithResult(@NotNull getThreadsMap<? extends E> getthreadsmap, @NotNull Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(getthreadsmap, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            return getthreadsmap.IAuthTabCallback((Collection) iterable);
        }
        getThreadsMap.onExtraCallback onextracallbackOnWarmupCompleted = getthreadsmap.onWarmupCompleted();
        CollectionsKt__MutableCollectionsKt.addAll((Collection) onextracallbackOnWarmupCompleted, (Iterable) iterable);
        return onextracallbackOnWarmupCompleted.onNavigationEvent();
    }

    public static final <E> getProcessUptime<E> IAuthTabCallback(@NotNull E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "");
        return removeThreads.onNavigationEvent().onWarmupCompleted((Collection) ArraysKt___ArraysJvmKt.asList(eArr));
    }

    public static final <E> getProcessUptime<E> onExtraCallbackWithResult() {
        return removeThreads.onNavigationEvent();
    }

    public static final <E> getThreadsMap<E> onWarmupCompleted() {
        return RequestManagerRetriever.Companion.onNavigationEvent();
    }

    public static final <K, V> getRevision<K, V> onExtraCallback() {
        return ResourceLoaderStreamFactory.Companion.onExtraCallback();
    }

    public static final <T> getMemoryMappingsOrBuilder<T> onWarmupCompleted(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        getMemoryMappingsOrBuilder<T> getmemorymappingsorbuilder = iterable instanceof getMemoryMappingsOrBuilder ? (getMemoryMappingsOrBuilder) iterable : null;
        return getmemorymappingsorbuilder == null ? onExtraCallbackWithResult(iterable) : getmemorymappingsorbuilder;
    }

    public static final <T> getProcessUptime<T> onExtraCallbackWithResult(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        getProcessUptime<T> getprocessuptime = iterable instanceof getProcessUptime ? (getProcessUptime) iterable : null;
        if (getprocessuptime != null) {
            return getprocessuptime;
        }
        getProcessUptime.onExtraCallback onextracallback = iterable instanceof getProcessUptime.onExtraCallback ? (getProcessUptime.onExtraCallback) iterable : null;
        getProcessUptime<T> getprocessuptimeIAuthTabCallback = onextracallback != null ? onextracallback.IAuthTabCallback() : null;
        return getprocessuptimeIAuthTabCallback == null ? IAuthTabCallback(onExtraCallbackWithResult(), iterable) : getprocessuptimeIAuthTabCallback;
    }

    public static final <T> getOpenFdsOrBuilderList<T> onExtraCallback(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        getOpenFdsOrBuilderList<T> getopenfdsorbuilderlist = iterable instanceof getOpenFdsOrBuilderList ? (getOpenFdsOrBuilderList) iterable : null;
        if (getopenfdsorbuilderlist != null) {
            return getopenfdsorbuilderlist;
        }
        getThreadsMap.onExtraCallback onextracallback = iterable instanceof getThreadsMap.onExtraCallback ? (getThreadsMap.onExtraCallback) iterable : null;
        getThreadsMap getthreadsmapOnNavigationEvent = onextracallback != null ? onextracallback.onNavigationEvent() : null;
        return getthreadsmapOnNavigationEvent != null ? getthreadsmapOnNavigationEvent : onExtraCallbackWithResult(onWarmupCompleted(), iterable);
    }

    public static final <K, V> getOpenFdsList<K, V> onExtraCallback(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        getOpenFdsList<K, V> getopenfdslist = map instanceof getOpenFdsList ? (getOpenFdsList) map : null;
        if (getopenfdslist != null) {
            return getopenfdslist;
        }
        getRevision.onExtraCallbackWithResult onextracallbackwithresult = map instanceof getRevision.onExtraCallbackWithResult ? (getRevision.onExtraCallbackWithResult) map : null;
        getRevision<K, V> getrevisionOnWarmupCompleted = onextracallbackwithresult != null ? onextracallbackwithresult.onWarmupCompleted() : null;
        return getrevisionOnWarmupCompleted != null ? getrevisionOnWarmupCompleted : onExtraCallback().IAuthTabCallback(map);
    }
}
