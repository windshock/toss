package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HomeWatcherReceiverycx<Base> {
    private Function1<? super Base, ? extends py<? super Base>> IAuthTabCallback;
    private final List<Pair<KClass<? extends Base>, KSerializer<? extends Base>>> onExtraCallback;
    private Function1<? super String, ? extends jp<? extends Base>> onExtraCallbackWithResult;
    private final KClass<Base> onNavigationEvent;
    private final KSerializer<Base> onWarmupCompleted;

    public HomeWatcherReceiverycx(@NotNull KClass<Base> kClass, @Nullable KSerializer<Base> kSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "");
        this.onNavigationEvent = kClass;
        this.onWarmupCompleted = kSerializer;
        this.onExtraCallback = new ArrayList();
    }

    public final <T extends Base> void IAuthTabCallback(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.onExtraCallback.add(getWrite.IAuthTabCallback(kClass, kSerializer));
    }

    public final void onNavigationEvent(@NotNull hfzb hfzbVar) {
        Intrinsics.checkNotNullParameter(hfzbVar, "");
        KSerializer<Base> kSerializer = this.onWarmupCompleted;
        if (kSerializer != null) {
            KClass<Base> kClass = this.onNavigationEvent;
            hfzb.onNavigationEvent(hfzbVar, kClass, kClass, kSerializer, false, 8, null);
        }
        Iterator<T> it = this.onExtraCallback.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            KClass kClass2 = (KClass) pair.onExtraCallbackWithResult();
            KSerializer kSerializer2 = (KSerializer) pair.IAuthTabCallback();
            KClass<Base> kClass3 = this.onNavigationEvent;
            Intrinsics.checkNotNull(kClass2, "");
            Intrinsics.checkNotNull(kSerializer2, "");
            hfzb.onNavigationEvent(hfzbVar, kClass3, kClass2, kSerializer2, false, 8, null);
        }
        Function1<? super Base, ? extends py<? super Base>> function1 = this.IAuthTabCallback;
        if (function1 != null) {
            hfzbVar.IAuthTabCallback(this.onNavigationEvent, function1, false);
        }
        Function1<? super String, ? extends jp<? extends Base>> function12 = this.onExtraCallbackWithResult;
        if (function12 != null) {
            hfzbVar.onNavigationEvent((KClass) this.onNavigationEvent, (Function1) function12, false);
        }
    }
}
