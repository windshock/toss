package im.toss.compose.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getComposition;
import o.removeTimestamp;
import o.setIso;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ComposeBorderKt$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ removeTimestamp f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ ComposeBorderKt$$ExternalSyntheticLambda0(removeTimestamp removetimestamp, long j, float f) {
        this.f$0 = removetimestamp;
        this.f$1 = j;
        this.f$2 = f;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getComposition.onExtraCallback(this.f$0, this.f$1, this.f$2, (setIso) obj);
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
