package o;

import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class p7 implements onFlowHidden {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @Inject
    public p7() {
    }

    @Override // o.onFlowHidden
    public boolean onExtraCallback() {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(newKnownLengthSink.Companion.onExtraCallback(Http1ExchangeCodecAbstractSource.SEAND_4260_MARKET_TIME, false)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.onExtraCallback(obj)) {
            int i4 = onWarmupCompleted + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            obj = bool;
        }
        return ((Boolean) obj).booleanValue();
    }
}
