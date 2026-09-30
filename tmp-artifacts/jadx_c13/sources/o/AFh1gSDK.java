package o;

import im.toss.tosssecurities.utils.appstate.AppLifecycleEventObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.AFh1gSDK;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1gSDK {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onTransact;
    public static final AFh1gSDK onExtraCallbackWithResult = new AFh1gSDK();
    private static final IAnimation<Boolean> onWarmupCompleted = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(new onWarmupCompleted(null)), putChannelInfo.onExtraCallback());
    public static final int IAuthTabCallback = 8;

    private AFh1gSDK() {
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<ok<? super Boolean>, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onNavigationEvent(AppLifecycleEventObserver appLifecycleEventObserver) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(appLifecycleEventObserver);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitIAuthTabCallback = IAuthTabCallback(appLifecycleEventObserver);
            int i3 = onNavigationEvent + 77;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 45 / 0;
            }
            return unitIAuthTabCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(ok<? super Boolean> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(okVar, access13800Var);
            int i4 = IAuthTabCallback + 49;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(ok<? super Boolean> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(okVar, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onwarmupcompleted.invokeSuspend(unit);
            }
            onwarmupcompleted.invokeSuspend(unit);
            throw null;
        }

        public static final class IAuthTabCallback implements AppLifecycleEventObserver.onWarmupCompleted {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ ok<Boolean> IAuthTabCallback;

            /* JADX WARN: Multi-variable type inference failed */
            IAuthTabCallback(ok<? super Boolean> okVar) {
                this.IAuthTabCallback = okVar;
            }

            @Override // im.toss.tosssecurities.utils.appstate.AppLifecycleEventObserver.onWarmupCompleted
            public void onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                ok<Boolean> okVar = this.IAuthTabCallback;
                if (i3 == 0) {
                    okVar.IAuthTabCallback(Boolean.FALSE);
                    return;
                }
                okVar.IAuthTabCallback(Boolean.FALSE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.tosssecurities.utils.appstate.AppLifecycleEventObserver.onWarmupCompleted
            public void onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    this.IAuthTabCallback.IAuthTabCallback(Boolean.TRUE);
                    throw null;
                }
                this.IAuthTabCallback.IAuthTabCallback(Boolean.TRUE);
                int i3 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        private static final Unit IAuthTabCallback(AppLifecycleEventObserver appLifecycleEventObserver) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().onExtraCallbackWithResult(appLifecycleEventObserver);
                return Unit.INSTANCE;
            }
            TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().onExtraCallbackWithResult(appLifecycleEventObserver);
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ok okVar = (ok) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                final AppLifecycleEventObserver appLifecycleEventObserver = new AppLifecycleEventObserver(new IAuthTabCallback(okVar));
                TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().IAuthTabCallback(appLifecycleEventObserver);
                Function0 function0 = new Function0() { // from class: im.toss.tosssecurities.utils.appstate.ForegroundState$state$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 13;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            AFh1gSDK.onWarmupCompleted.onNavigationEvent(appLifecycleEventObserver);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = AFh1gSDK.onWarmupCompleted.onNavigationEvent(appLifecycleEventObserver);
                        int i7 = IAuthTabCallback + 113;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return unitOnNavigationEvent;
                    }
                };
                this.L$0 = access15400.onNavigationEvent(okVar);
                this.L$1 = access15400.onNavigationEvent(appLifecycleEventObserver);
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, function0, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 21;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i = onExtraCallback + 3;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public final IAnimation<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IAnimation<Boolean> iAnimation = onWarmupCompleted;
        int i4 = i3 + 101;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iAnimation;
    }
}
