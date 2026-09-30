package o;

import android.app.Application;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class initView$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    final /* synthetic */ Application $context;
    int label;
    final /* synthetic */ initView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    initView$onWarmupCompleted(initView initview, Application application, access13800<? super initView$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.this$0 = initview;
        this.$context = application;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        initView$onWarmupCompleted initview_onwarmupcompleted = new initView$onWarmupCompleted(this.this$0, this.$context, access13800Var);
        int i3 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
        return initview_onwarmupcompleted;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws setWrite {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        int i5 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws setWrite {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        initView$onWarmupCompleted initview_onwarmupcompletedCreate = create(findresandmsg, access13800Var);
        if (i4 == 0) {
            return initview_onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        }
        initview_onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
    public final Object invokeSuspend(Object obj) throws setWrite {
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 != 0) {
            int i4 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            getTileModeX gettilemodexOnExtraCallback = initView.onExtraCallback(this.this$0).onExtraCallback();
            final initView initview = this.this$0;
            final Application application = this.$context;
            setRipple setripple = new setRipple() { // from class: o.initView$onWarmupCompleted.5
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 23;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((onViewDraw) obj2, access13800Var);
                    if (i8 == 0) {
                        int i9 = 8 / 0;
                    }
                    return objOnExtraCallbackWithResult;
                }

                public final Object onExtraCallbackWithResult(onViewDraw onviewdraw, access13800<? super Unit> access13800Var) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 93;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    initView.onNavigationEvent(initview, application, onviewdraw);
                    Unit unit = Unit.INSTANCE;
                    int i9 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            };
            this.label = 1;
            if (gettilemodexOnExtraCallback.collect(setripple, this) == objOnWarmupCompleted) {
                int i6 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
        }
        throw new setWrite();
    }
}
