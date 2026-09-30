package o;

import kotlin.Unit;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getBreadcrumbs {
    markLaunchCompleted IAuthTabCallback();

    void onExtraCallback();

    <T> Object onNavigationEvent(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer, @NotNull setRipple<? super BugsnagEventMapper<T>> setripple, @NotNull access13800<? super Unit> access13800Var);

    void onNavigationEvent();
}
