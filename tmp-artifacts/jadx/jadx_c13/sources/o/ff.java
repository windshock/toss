package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.ff;
import o.qt;
import o.vbt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ff<T> implements KSerializer<T> {
    private final SerialDescriptor IAuthTabCallback;
    private final KClass<T> onExtraCallback;
    private final List<KSerializer<?>> onExtraCallbackWithResult;
    private final KSerializer<T> onWarmupCompleted;

    public ff(@NotNull KClass<T> kClass, @Nullable KSerializer<T> kSerializer, @NotNull KSerializer<?>[] kSerializerArr) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kSerializerArr, "");
        this.onExtraCallback = kClass;
        this.onWarmupCompleted = kSerializer;
        this.onExtraCallbackWithResult = ArraysKt___ArraysJvmKt.asList(kSerializerArr);
        this.IAuthTabCallback = skm.onExtraCallback(ujb.onExtraCallback("kotlinx.serialization.ContextualSerializer", vbt.onNavigationEvent.onExtraCallbackWithResult, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.ContextualSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ff.IAuthTabCallback(this.f$0, (qt) obj);
            }
        }), kClass);
    }

    private final KSerializer<T> onExtraCallback(hfycx hfycxVar) {
        KSerializer<T> kSerializerOnExtraCallbackWithResult = hfycxVar.onExtraCallbackWithResult(this.onExtraCallback, this.onExtraCallbackWithResult);
        if (kSerializerOnExtraCallbackWithResult != null) {
            return kSerializerOnExtraCallbackWithResult;
        }
        KSerializer<T> kSerializer = this.onWarmupCompleted;
        if (kSerializer != null) {
            return kSerializer;
        }
        setImageLottieTosPath.onWarmupCompleted((KClass<?>) this.onExtraCallback);
        throw new setWrite();
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.IAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(ff ffVar, qt qtVar) {
        SerialDescriptor descriptor;
        Intrinsics.checkNotNullParameter(qtVar, "");
        KSerializer<T> kSerializer = ffVar.onWarmupCompleted;
        List<Annotation> listOnNavigationEvent = (kSerializer == null || (descriptor = kSerializer.getDescriptor()) == null) ? null : descriptor.onNavigationEvent();
        if (listOnNavigationEvent == null) {
            listOnNavigationEvent = CollectionsKt__CollectionsKt.emptyList();
        }
        qtVar.onNavigationEvent(listOnNavigationEvent);
        return Unit.INSTANCE;
    }

    @Override // o.py
    public void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        encoder.onExtraCallbackWithResult(onExtraCallback(encoder.onNavigationEvent()), t);
    }

    @Override // o.jp
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return (T) decoder.onWarmupCompleted(onExtraCallback(decoder.IAuthTabCallback()));
    }
}
