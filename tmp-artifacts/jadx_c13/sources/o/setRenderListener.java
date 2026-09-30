package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setRenderListener<T> implements getShakeView<T> {
    private final ConcurrentHashMap<Class<?>, getLogoUnionHeight<T>> IAuthTabCallback;
    private final Function1<KClass<?>, KSerializer<T>> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public setRenderListener(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = function1;
        this.IAuthTabCallback = new ConcurrentHashMap<>();
    }

    @Override // o.getShakeView
    public KSerializer<T> onWarmupCompleted(@NotNull KClass<Object> kClass) {
        getLogoUnionHeight<T> getlogounionheightPutIfAbsent;
        Intrinsics.checkNotNullParameter(kClass, "");
        ConcurrentHashMap<Class<?>, getLogoUnionHeight<T>> concurrentHashMap = this.IAuthTabCallback;
        Class<?> clsOnNavigationEvent = clearRegisters.onNavigationEvent(kClass);
        getLogoUnionHeight<T> getlogounionheight = concurrentHashMap.get(clsOnNavigationEvent);
        if (getlogounionheight == null && (getlogounionheightPutIfAbsent = concurrentHashMap.putIfAbsent(clsOnNavigationEvent, (getlogounionheight = new getLogoUnionHeight<>(this.onNavigationEvent.invoke(kClass))))) != null) {
            getlogounionheight = getlogounionheightPutIfAbsent;
        }
        return getlogounionheight.onExtraCallbackWithResult;
    }
}
