package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.hf1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class hfzb implements xkzycx {
    private boolean onWarmupCompleted;
    private final Map<KClass<?>, hf1> onExtraCallback = new HashMap();
    private final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> IAuthTabCallbackDefault = new HashMap();
    private final Map<KClass<?>, Function1<?, py<?>>> onNavigationEvent = new HashMap();
    private final Map<KClass<?>, Map<String, KSerializer<?>>> onExtraCallbackWithResult = new HashMap();
    private final Map<KClass<?>, Function1<String, jp<?>>> IAuthTabCallback = new HashMap();

    @Override // o.xkzycx
    public <T> void onNavigationEvent(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        IAuthTabCallback(this, kClass, new hf1.onWarmupCompleted(kSerializer), false, 4, null);
    }

    @Override // o.xkzycx
    public <T> void onExtraCallbackWithResult(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        IAuthTabCallback(this, kClass, new hf1.onExtraCallbackWithResult(function1), false, 4, null);
    }

    @Override // o.xkzycx
    public <Base, Sub extends Base> void onExtraCallbackWithResult(@NotNull KClass<Base> kClass, @NotNull KClass<Sub> kClass2, @NotNull KSerializer<Sub> kSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass2, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        onNavigationEvent(this, kClass, kClass2, kSerializer, false, 8, null);
    }

    @Override // o.xkzycx
    public <Base> void onNavigationEvent(@NotNull KClass<Base> kClass, @NotNull Function1<? super Base, ? extends py<? super Base>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        IAuthTabCallback(kClass, function1, false);
    }

    @Override // o.xkzycx
    public <Base> void onWarmupCompleted(@NotNull KClass<Base> kClass, @NotNull Function1<? super String, ? extends jp<? extends Base>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        onNavigationEvent((KClass) kClass, (Function1) function1, false);
    }

    public final void IAuthTabCallback(@NotNull hfycx hfycxVar) {
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        hfycxVar.IAuthTabCallback(this);
    }

    public static /* synthetic */ void IAuthTabCallback(hfzb hfzbVar, KClass kClass, hf1 hf1Var, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        hfzbVar.onNavigationEvent(kClass, hf1Var, z);
    }

    public final <T> void onNavigationEvent(@NotNull KClass<T> kClass, @NotNull hf1 hf1Var, boolean z) {
        hf1 hf1Var2;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(hf1Var, "");
        if (!z && (hf1Var2 = this.onExtraCallback.get(kClass)) != null && !Intrinsics.areEqual(hf1Var2, hf1Var)) {
            throw new tnzb("Contextual serializer or serializer provider for " + kClass + " already registered in this module");
        }
        this.onExtraCallback.put(kClass, hf1Var);
        if (htf2.IAuthTabCallback(kClass)) {
            this.onWarmupCompleted = true;
        }
    }

    public final <Base> void IAuthTabCallback(@NotNull KClass<Base> kClass, @NotNull Function1<? super Base, ? extends py<? super Base>> function1, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Function1<?, py<?>> function12 = this.onNavigationEvent.get(kClass);
        if (function12 != null && !Intrinsics.areEqual(function12, function1) && !z) {
            throw new IllegalArgumentException("Default serializers provider for " + kClass + " is already registered: " + function12);
        }
        this.onNavigationEvent.put(kClass, function1);
    }

    public final <Base> void onNavigationEvent(@NotNull KClass<Base> kClass, @NotNull Function1<? super String, ? extends jp<? extends Base>> function1, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Function1<String, jp<?>> function12 = this.IAuthTabCallback.get(kClass);
        if (function12 != null && !Intrinsics.areEqual(function12, function1) && !z) {
            throw new IllegalArgumentException("Default deserializers provider for " + kClass + " is already registered: " + function12);
        }
        this.IAuthTabCallback.put(kClass, function1);
    }

    public static /* synthetic */ void onNavigationEvent(hfzb hfzbVar, KClass kClass, KClass kClass2, KSerializer kSerializer, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        hfzbVar.onNavigationEvent(kClass, kClass2, kSerializer, z);
    }

    public final <Base, Sub extends Base> void onNavigationEvent(@NotNull KClass<Base> kClass, @NotNull KClass<Sub> kClass2, @NotNull KSerializer<Sub> kSerializer, boolean z) {
        Object next;
        KClass kClass3;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass2, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        String strOnExtraCallbackWithResult = kSerializer.getDescriptor().onExtraCallbackWithResult();
        Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> map = this.IAuthTabCallbackDefault;
        Map<KClass<?>, KSerializer<?>> map2 = map.get(kClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(kClass, map2);
        }
        Map<KClass<?>, KSerializer<?>> map3 = map2;
        Map<KClass<?>, Map<String, KSerializer<?>>> map4 = this.onExtraCallbackWithResult;
        Map<String, KSerializer<?>> map5 = map4.get(kClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(kClass, map5);
        }
        Map<String, KSerializer<?>> map6 = map5;
        KSerializer<?> kSerializer2 = map3.get(kClass2);
        if (kSerializer2 != null && !Intrinsics.areEqual(kSerializer2, kSerializer)) {
            if (z) {
                map6.remove(kSerializer2.getDescriptor().onExtraCallbackWithResult());
            } else {
                throw new tnzb(kClass, kClass2);
            }
        }
        KSerializer<?> kSerializer3 = map6.get(strOnExtraCallbackWithResult);
        if (kSerializer3 != null && !Intrinsics.areEqual(kSerializer3, kSerializer)) {
            Iterator itIAuthTabCallback = clearCode.access000(map3).IAuthTabCallback();
            while (true) {
                if (!itIAuthTabCallback.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = itIAuthTabCallback.next();
                    if (((Map.Entry) next).getValue() == kSerializer3) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (kClass3 = (KClass) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + strOnExtraCallbackWithResult + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (z) {
                map3.remove(kClass3);
            } else {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + kClass + "' have the same serial name '" + strOnExtraCallbackWithResult + "': " + kSerializer + " for '" + kClass2 + "' and " + kSerializer3 + " for '" + kClass3 + '\'');
            }
        }
        map3.put(kClass2, kSerializer);
        map6.put(strOnExtraCallbackWithResult, kSerializer);
    }

    public final hfycx onNavigationEvent() {
        return new truycx(this.onExtraCallback, this.IAuthTabCallbackDefault, this.onNavigationEvent, this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onWarmupCompleted);
    }
}
