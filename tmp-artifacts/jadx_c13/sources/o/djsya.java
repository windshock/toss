package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import o.djsya;
import o.vbt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class djsya {
    public static final <T> JsonElement onNavigationEvent(@NotNull wie2 wie2Var, T t, @NotNull py<? super T> pyVar) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new getReuseCount(wie2Var, new Function1() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return djsya.onWarmupCompleted(objectRef, (JsonElement) obj);
            }
        }).onExtraCallbackWithResult((py<? super py<? super T>>) pyVar, (py<? super T>) t);
        T t2 = objectRef.element;
        if (t2 != null) {
            return (JsonElement) t2;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(Ref.ObjectRef objectRef, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        objectRef.element = jsonElement;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onWarmupCompleted(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.IAuthTabCallback() instanceof spv) || serialDescriptor.IAuthTabCallback() == vbt.onExtraCallbackWithResult.onWarmupCompleted;
    }
}
