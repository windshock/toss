package o;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getMemoryDumpOrBuilderList extends getMemoryDumpOrBuilder {
    private final onExtraCallback IAuthTabCallback = new onExtraCallback();

    public static final class onExtraCallback extends ThreadLocal<Random> {
        onExtraCallback() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // o.getMemoryDumpOrBuilder
    public Random onWarmupCompleted() {
        Random random = this.IAuthTabCallback.get();
        Intrinsics.checkNotNullExpressionValue(random, "");
        return random;
    }
}
