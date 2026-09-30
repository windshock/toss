package im.toss.tds.compose.foundation.anim.rally;

import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.access13800;
import o.findResAndMsg;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RallyKt$rememberRally$17$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    final /* synthetic */ getSupportedHighSpeedResolutionsFor<Function1<Rally, List<AppLovinSdkSettings>>> $currentMotions$delegate;
    final /* synthetic */ Function1<Rally, List<AppLovinSdkSettings>> $motions;
    final /* synthetic */ Rally $rally;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RallyKt$rememberRally$17$1(Function1<? super Rally, ? extends List<AppLovinSdkSettings>> function1, Rally rally, getSupportedHighSpeedResolutionsFor<Function1<Rally, List<AppLovinSdkSettings>>> getsupportedhighspeedresolutionsfor, access13800<? super RallyKt$rememberRally$17$1> access13800Var) {
        super(2, access13800Var);
        this.$motions = function1;
        this.$rally = rally;
        this.$currentMotions$delegate = getsupportedhighspeedresolutionsfor;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RallyKt$rememberRally$17$1 rallyKt$rememberRally$17$1 = new RallyKt$rememberRally$17$1(this.$motions, this.$rally, this.$currentMotions$delegate, access13800Var);
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return rallyKt$rememberRally$17$1;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return onNavigationEvent(findresandmsg, access13800Var);
        }
        onNavigationEvent(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        Object[] objArr = {this.$currentMotions$delegate};
        if (!Intrinsics.areEqual((Function1) RallyKt.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1703554357, 1703554364, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted()), this.$motions)) {
            int i4 = onExtraCallback + 19;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Rally rally = this.$rally;
                Function1<Rally, List<AppLovinSdkSettings>> function1 = this.$motions;
                rally.warmup();
                rally.onNavigationEvent((List<AppLovinSdkSettings>) function1.invoke(rally));
                RallyKt.onExtraCallback(this.$currentMotions$delegate, this.$motions);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Rally rally2 = this.$rally;
            Function1<Rally, List<AppLovinSdkSettings>> function12 = this.$motions;
            rally2.warmup();
            rally2.onNavigationEvent((List<AppLovinSdkSettings>) function12.invoke(rally2));
            RallyKt.onExtraCallback(this.$currentMotions$delegate, this.$motions);
        }
        return Unit.INSTANCE;
    }
}
