package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setBeforeTimestamp {
    private static final int IAuthTabCallback;

    static {
        Object objM31constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM31constructorimpl = Result.m31constructorimpl(property != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(property) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        Integer num = (Integer) (Result.onExtraCallback(objM31constructorimpl) ? null : objM31constructorimpl);
        IAuthTabCallback = num != null ? num.intValue() : 2097152;
    }
}
