package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.htf1;
import o.qt;
import o.uu;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class htf1<T> implements KSerializer<T> {
    private final T onExtraCallback;
    private List<? extends Annotation> onNavigationEvent;
    private final Lazy onWarmupCompleted;

    public htf1(@NotNull final String str, @NotNull T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.onExtraCallback = t;
        this.onNavigationEvent = CollectionsKt__CollectionsKt.emptyList();
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: kotlinx.serialization.internal.ObjectSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return htf1.onWarmupCompleted(str, this);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public htf1(@NotNull String str, @NotNull T t, @NotNull Annotation[] annotationArr) {
        this(str, t);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        this.onNavigationEvent = ArraysKt___ArraysJvmKt.asList(annotationArr);
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.onWarmupCompleted.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor onWarmupCompleted(String str, final htf1 htf1Var) {
        return ujb.onExtraCallback(str, uu.onExtraCallback.onExtraCallbackWithResult, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.ObjectSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return htf1.onExtraCallbackWithResult(this.f$0, (qt) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(htf1 htf1Var, qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, "");
        qtVar.onNavigationEvent(htf1Var.onNavigationEvent);
        return Unit.INSTANCE;
    }

    @Override // o.py
    public void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        encoder.onExtraCallback(getDescriptor()).onNavigationEvent(getDescriptor());
    }

    @Override // o.jp
    public T deserialize(@NotNull Decoder decoder) {
        int iOnNavigationEvent;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult() && (iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(getDescriptor())) != -1) {
            throw new qn("Unexpected index " + iOnNavigationEvent);
        }
        Unit unit = Unit.INSTANCE;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
        return this.onExtraCallback;
    }
}
