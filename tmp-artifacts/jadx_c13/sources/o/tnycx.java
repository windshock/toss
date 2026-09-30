package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class tnycx {
    public static final hfycx onNavigationEvent() {
        return zb3.onExtraCallback();
    }

    public static final <T> hfycx onWarmupCompleted(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        hfzb hfzbVar = new hfzb();
        hfzbVar.onNavigationEvent(kClass, kSerializer);
        return hfzbVar.onNavigationEvent();
    }
}
