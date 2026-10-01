package o;

import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dj1 {
    private static final getBacktraceNote<setRipple<Object>, Object, access13800<? super Unit>, Object> onExtraCallback;

    final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements getBacktraceNote<setRipple<? super Object>, Object, access13800<? super Unit>, Object> {
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

        onWarmupCompleted() {
            super(3, setRipple.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // o.getBacktraceNote
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<Object> setripple, Object obj, access13800<? super Unit> access13800Var) {
            return setripple.emit(obj, access13800Var);
        }
    }

    static {
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onExtraCallback;
        Intrinsics.checkNotNull(onwarmupcompleted, "");
        onExtraCallback = (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onwarmupcompleted, 3);
    }
}
