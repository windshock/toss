package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.clearProcessUptime;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class clearProcessUptime extends clearSelinuxLabel {
    public static <R> Sequence<R> onExtraCallback(@NotNull Sequence<?> sequence, @NotNull final Class<R> cls) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Sequence<R> sequenceAccess100 = ensureCausesIsMutable.access100(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesJvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(clearProcessUptime.onExtraCallbackWithResult(cls, obj));
            }
        });
        Intrinsics.checkNotNull(sequenceAccess100, "");
        return sequenceAccess100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(Class cls, Object obj) {
        return cls.isInstance(obj);
    }
}
