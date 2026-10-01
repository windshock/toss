package im.toss.devtool.runtime.data.util;

import android.view.ViewConfiguration;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.TimelineExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.tryTriggerOnStart;

/* loaded from: classes.dex */
final class DevToolActionActivity$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onWarmupCompleted = -1033655564469783348L;
    int label;
    final /* synthetic */ DevToolActionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionActivity$onNavigationEvent(DevToolActionActivity devToolActionActivity, access13800<? super DevToolActionActivity$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.this$0 = devToolActionActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        DevToolActionActivity$onNavigationEvent devToolActionActivity$onNavigationEvent = new DevToolActionActivity$onNavigationEvent(this.this$0, access13800Var);
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return devToolActionActivity$onNavigationEvent;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return objInvokeSuspend;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 81;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 97;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onWarmupCompleted);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $10 + 105;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 != 0) {
            int i5 = onExtraCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{4455, 46374, 33742, 43390, 4356, 64135, 7202, 18002, 11847, 15250, 23841, 34590, 28480, 30868, 40491, 50253, 44050, 47499, 57131, 1305, 60743, 65156, 6187, 16984, 10760, 16276, 22827, 33566, 27456, 31887, 39456, 49224, 43016, 48525, 56107, 281, 59719, 62097, 5159, 20042, 9743, 13254, 21805, 36689, 26389, 28809, 38459, 52298, 41998, 45448, 55083}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            if (this.this$0.onExtraCallback().onActivityResized() != 0) {
                DevToolActionActivity devToolActionActivity = this.this$0;
                this.label = 1;
                if (DevToolActionActivity.onExtraCallbackWithResult(devToolActionActivity, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
        }
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
