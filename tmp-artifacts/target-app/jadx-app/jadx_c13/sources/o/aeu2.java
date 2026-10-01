package o;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface aeu2<T> extends KSerializer<T> {
    KSerializer<?>[] childSerializers();

    public static final class onWarmupCompleted {
        @Deprecated
        public static <T> KSerializer<?>[] onWarmupCompleted(@NotNull aeu2<T> aeu2Var) {
            return aeu2.super.typeParametersSerializers();
        }
    }

    default KSerializer<?>[] typeParametersSerializers() {
        return jc11.onExtraCallbackWithResult;
    }
}
