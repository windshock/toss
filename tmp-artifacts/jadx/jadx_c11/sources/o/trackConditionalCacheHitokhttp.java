package o;

import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackConditionalCacheHitokhttp<V> extends requestCount<Integer, V> implements setWriteSuccessCountokhttp<V> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trackConditionalCacheHitokhttp(@NotNull Pair<Integer, ? extends V>... pairArr) {
        super((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Intrinsics.checkNotNullParameter(pairArr, "");
    }

    @Override // o.setWriteSuccessCountokhttp, o.putokhttp
    public /* bridge */ V onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return (V) super.onExtraCallback(f);
        }
        super.onExtraCallback(f);
        throw null;
    }
}
