package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import o.ufy;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setAnimationText<T> implements KSerializer<T> {
    private final KClass<T> IAuthTabCallback;
    private final SerialDescriptor onNavigationEvent;

    protected abstract jp<T> onWarmupCompleted(@NotNull JsonElement jsonElement);

    public setAnimationText(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        this.IAuthTabCallback = kClass;
        this.onNavigationEvent = ujb.IAuthTabCallback("JsonContentPolymorphicSerializer<" + kClass.getSimpleName() + '>', ufy.onWarmupCompleted.onNavigationEvent, new SerialDescriptor[0], null, 8, null);
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.onNavigationEvent;
    }

    @Override // o.py
    public final void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        KSerializer kSerializerOnNavigationEvent = encoder.onNavigationEvent().onNavigationEvent(this.IAuthTabCallback, t);
        if (kSerializerOnNavigationEvent == null) {
            KSerializer kSerializerOnExtraCallback = nzi.onExtraCallback(Reflection.getOrCreateKotlinClass(t.getClass()));
            if (kSerializerOnExtraCallback != null) {
                kSerializerOnNavigationEvent = kSerializerOnExtraCallback;
            } else {
                IAuthTabCallback(Reflection.getOrCreateKotlinClass(t.getClass()), this.IAuthTabCallback);
                throw new setWrite();
            }
        }
        ((KSerializer) kSerializerOnNavigationEvent).serialize(encoder, t);
    }

    @Override // o.jp
    public final T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        setAnimationType setanimationtypeOnExtraCallback = getCurrentVideoState.onExtraCallback(decoder);
        JsonElement jsonElementOnWarmupCompleted = setanimationtypeOnExtraCallback.onWarmupCompleted();
        jp<T> jpVarOnWarmupCompleted = onWarmupCompleted(jsonElementOnWarmupCompleted);
        Intrinsics.checkNotNull(jpVarOnWarmupCompleted, "");
        return (T) setanimationtypeOnExtraCallback.access000().onExtraCallbackWithResult((KSerializer) jpVarOnWarmupCompleted, jsonElementOnWarmupCompleted);
    }

    private final Void IAuthTabCallback(KClass<?> kClass, KClass<?> kClass2) {
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(kClass);
        }
        throw new qn("Class '" + simpleName + "' is not registered for polymorphic serialization " + ("in the scope of '" + kClass2.getSimpleName() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }
}
