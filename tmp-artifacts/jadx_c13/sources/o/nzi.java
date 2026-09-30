package o;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class nzi {
    public static final <T> KSerializer<T> IAuthTabCallback(@NotNull KClass<T> kClass) {
        return sg.onExtraCallback(kClass);
    }

    public static final KSerializer<Object> IAuthTabCallback(@NotNull access5900 access5900Var) {
        return sg.onNavigationEvent(access5900Var);
    }

    public static final KSerializer<Object> IAuthTabCallback(@NotNull hfycx hfycxVar, @NotNull Type type) {
        return pg.onExtraCallbackWithResult(hfycxVar, type);
    }

    public static final KSerializer<Object> IAuthTabCallback(@NotNull hfycx hfycxVar, @NotNull access5900 access5900Var) {
        return sg.onWarmupCompleted(hfycxVar, access5900Var);
    }

    public static final <T> KSerializer<T> onExtraCallback(@NotNull KClass<T> kClass) {
        return sg.IAuthTabCallback(kClass);
    }

    public static final KSerializer<Object> onExtraCallbackWithResult(@NotNull Type type) {
        return pg.onExtraCallbackWithResult(type);
    }

    public static final KSerializer<Object> onExtraCallbackWithResult(@NotNull hfycx hfycxVar, @NotNull Type type) {
        return pg.IAuthTabCallback(hfycxVar, type);
    }

    public static final KSerializer<Object> onExtraCallbackWithResult(@NotNull hfycx hfycxVar, @NotNull access5900 access5900Var) {
        return sg.onExtraCallback(hfycxVar, access5900Var);
    }

    public static final KSerializer<?> onNavigationEvent(@NotNull hfycx hfycxVar, @NotNull KClass<?> kClass) {
        return sg.onExtraCallback(hfycxVar, kClass);
    }

    public static final List<KSerializer<Object>> onWarmupCompleted(@NotNull hfycx hfycxVar, @NotNull List<? extends access5900> list, boolean z) {
        return sg.onExtraCallbackWithResult(hfycxVar, list, z);
    }

    public static final KSerializer<? extends Object> onWarmupCompleted(@NotNull KClass<Object> kClass, @NotNull List<? extends KSerializer<Object>> list, @NotNull Function0<? extends access5200> function0) {
        return sg.onExtraCallbackWithResult(kClass, list, function0);
    }
}
