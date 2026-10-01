package o;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.hf1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class truycx extends hfycx {
    private final boolean IAuthTabCallback;
    private final Map<KClass<?>, Map<String, KSerializer<?>>> asInterface;
    private final Map<KClass<?>, Function1<String, jp<?>>> onExtraCallback;
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> onExtraCallbackWithResult;
    private final Map<KClass<?>, hf1> onNavigationEvent;
    private final Map<KClass<?>, Function1<?, py<?>>> onWarmupCompleted;

    @Override // o.hfycx
    public boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public truycx(@NotNull Map<KClass<?>, ? extends hf1> map, @NotNull Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> map2, @NotNull Map<KClass<?>, ? extends Function1<?, ? extends py<?>>> map3, @NotNull Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> map4, @NotNull Map<KClass<?>, ? extends Function1<? super String, ? extends jp<?>>> map5, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        Intrinsics.checkNotNullParameter(map4, "");
        Intrinsics.checkNotNullParameter(map5, "");
        this.onNavigationEvent = map;
        this.onExtraCallbackWithResult = map2;
        this.onWarmupCompleted = map3;
        this.asInterface = map4;
        this.onExtraCallback = map5;
        this.IAuthTabCallback = z;
    }

    @Override // o.hfycx
    public <T> py<T> onNavigationEvent(@NotNull KClass<? super T> kClass, @NotNull T t) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(t, "");
        if (!kClass.isInstance(t)) {
            return null;
        }
        Map<KClass<?>, KSerializer<?>> map = this.onExtraCallbackWithResult.get(kClass);
        KSerializer<?> kSerializer = map != null ? map.get(Reflection.getOrCreateKotlinClass(t.getClass())) : null;
        KSerializer<?> kSerializer2 = kSerializer instanceof py ? kSerializer : null;
        if (kSerializer2 != null) {
            return kSerializer2;
        }
        Function1<?, py<?>> function1 = this.onWarmupCompleted.get(kClass);
        Function1<?, py<?>> function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (py) function12.invoke(t);
        }
        return null;
    }

    @Override // o.hfycx
    public <T> jp<T> onExtraCallbackWithResult(@NotNull KClass<? super T> kClass, @Nullable String str) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Map<String, KSerializer<?>> map = this.asInterface.get(kClass);
        KSerializer<?> kSerializer = map != null ? map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Function1<String, jp<?>> function1 = this.onExtraCallback.get(kClass);
        Function1<String, jp<?>> function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (jp) function12.invoke(str);
        }
        return null;
    }

    @Override // o.hfycx
    public <T> KSerializer<T> onExtraCallbackWithResult(@NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<?>> list) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        hf1 hf1Var = this.onNavigationEvent.get(kClass);
        KSerializer<T> kSerializer = hf1Var != null ? (KSerializer<T>) hf1Var.onExtraCallbackWithResult(list) : null;
        if (kSerializer instanceof KSerializer) {
            return kSerializer;
        }
        return null;
    }

    @Override // o.hfycx
    public void IAuthTabCallback(@NotNull xkzycx xkzycxVar) {
        Intrinsics.checkNotNullParameter(xkzycxVar, "");
        for (Map.Entry<KClass<?>, hf1> entry : this.onNavigationEvent.entrySet()) {
            KClass<?> key = entry.getKey();
            hf1 value = entry.getValue();
            if (value instanceof hf1.onWarmupCompleted) {
                Intrinsics.checkNotNull(key, "");
                KSerializer<?> kSerializerOnNavigationEvent = ((hf1.onWarmupCompleted) value).onNavigationEvent();
                Intrinsics.checkNotNull(kSerializerOnNavigationEvent, "");
                xkzycxVar.onNavigationEvent(key, kSerializerOnNavigationEvent);
            } else {
                if (!(value instanceof hf1.onExtraCallbackWithResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                xkzycxVar.onExtraCallbackWithResult(key, ((hf1.onExtraCallbackWithResult) value).onExtraCallbackWithResult());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, KSerializer<?>>> entry2 : this.onExtraCallbackWithResult.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                KSerializer<?> value2 = entry3.getValue();
                Intrinsics.checkNotNull(key2, "");
                Intrinsics.checkNotNull(key3, "");
                Intrinsics.checkNotNull(value2, "");
                xkzycxVar.onExtraCallbackWithResult(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, py<?>>> entry4 : this.onWarmupCompleted.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, py<?>> value3 = entry4.getValue();
            Intrinsics.checkNotNull(key4, "");
            Intrinsics.checkNotNull(value3, "");
            xkzycxVar.onNavigationEvent(key4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, jp<?>>> entry5 : this.onExtraCallback.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, jp<?>> value4 = entry5.getValue();
            Intrinsics.checkNotNull(key5, "");
            Intrinsics.checkNotNull(value4, "");
            xkzycxVar.onWarmupCompleted(key5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }
}
