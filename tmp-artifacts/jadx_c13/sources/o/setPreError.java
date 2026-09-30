package o;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setPreError {
    private final Map<SerialDescriptor, Map<onExtraCallback<Object>, Object>> map = setLpPreRender.onNavigationEvent(16);

    public static final class onExtraCallback<T> {
    }

    public final <T> void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, @NotNull onExtraCallback<T> onextracallback, @NotNull T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(t, "");
        Map<SerialDescriptor, Map<onExtraCallback<Object>, Object>> map = this.map;
        Map<onExtraCallback<Object>, Object> mapOnNavigationEvent = map.get(serialDescriptor);
        if (mapOnNavigationEvent == null) {
            mapOnNavigationEvent = setLpPreRender.onNavigationEvent(2);
            map.put(serialDescriptor, mapOnNavigationEvent);
        }
        mapOnNavigationEvent.put(onextracallback, t);
    }

    public final <T> T IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor, @NotNull onExtraCallback<T> onextracallback, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(function0, "");
        T t = (T) onExtraCallback(serialDescriptor, onextracallback);
        if (t != null) {
            return t;
        }
        T tInvoke = function0.invoke();
        onNavigationEvent(serialDescriptor, onextracallback, tInvoke);
        return tInvoke;
    }

    public final <T> T onExtraCallback(@NotNull SerialDescriptor serialDescriptor, @NotNull onExtraCallback<T> onextracallback) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Map<onExtraCallback<Object>, Object> map = this.map.get(serialDescriptor);
        T t = map != null ? (T) map.get(onextracallback) : null;
        if (t == null) {
            return null;
        }
        return t;
    }
}
