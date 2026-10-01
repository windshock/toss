package im.toss.core.tracker;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.DetectFaceInContinuousImage;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogFlushScheduler$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CoroutineExceptionHandler f$0;
    public final /* synthetic */ LogFlushScheduler f$1;

    public /* synthetic */ LogFlushScheduler$$ExternalSyntheticLambda3(CoroutineExceptionHandler coroutineExceptionHandler, LogFlushScheduler logFlushScheduler) {
        this.f$0 = coroutineExceptionHandler;
        this.f$1 = logFlushScheduler;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, (DetectFaceInContinuousImage) obj};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, (DetectFaceInContinuousImage) obj};
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) LogFlushScheduler.onExtraCallback(-1265835535, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, 1265835544, iOnNavigationEvent2);
        int i3 = onExtraCallback + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
