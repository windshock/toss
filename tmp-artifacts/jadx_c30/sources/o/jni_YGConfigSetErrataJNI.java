package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.rx2.RxSchedulerKt;
import o.MapConverter;
import o.getPackageType;
import o.jni_YGConfigSetErrataJNI;
import o.lt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGConfigSetErrataJNI extends MapConverter {
    private static final /* synthetic */ AtomicLongFieldUpdater onExtraCallback = AtomicLongFieldUpdater.newUpdater(jni_YGConfigSetErrataJNI.class, "workerCounter$volatile");
    private final waitForLayout onExtraCallbackWithResult;
    public final GeckoHubImp onNavigationEvent;
    private final findResAndMsg onTransact;
    private volatile /* synthetic */ long workerCounter$volatile;

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function1<access13800<? super Unit>, Object> $task;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Function1<? super access13800<? super Unit>, ? extends Object> function1, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$task = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(this.$task, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Function1<access13800<? super Unit>, Object> function1 = this.$task;
                this.label = 1;
                if (function1.invoke(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public deserializeUriNullableCollection onNavigationEvent(@NotNull Runnable runnable, long j, @NotNull TimeUnit timeUnit) {
        return RxSchedulerKt.onWarmupCompleted(this.onTransact, runnable, timeUnit.toMillis(j), (Function1<? super Function1<? super access13800<? super Unit>, ? extends Object>, ? extends Runnable>) new Function1() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return jni_YGConfigSetErrataJNI.onExtraCallback(this.f$0, (Function1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable onExtraCallback(final jni_YGConfigSetErrataJNI jni_ygconfigseterratajni, final Function1 function1) {
        return new Runnable() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                jni_YGConfigSetErrataJNI.onExtraCallbackWithResult(this.f$0, function1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(jni_YGConfigSetErrataJNI jni_ygconfigseterratajni, Function1 function1) {
        maybeUpdateAnimatable.onNavigationEvent(jni_ygconfigseterratajni.onTransact, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(function1, null), 3, (Object) null);
    }

    public MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        return new onWarmupCompleted(onExtraCallback.getAndIncrement(this), this.onNavigationEvent, this.onExtraCallbackWithResult);
    }

    public static final class onWarmupCompleted extends MapConverter.onNavigationEvent {
        private final nLockFileSegment<Function1<access13800<? super Unit>, Object>> IAuthTabCallback;
        private final waitForLayout onExtraCallback;
        private final long onExtraCallbackWithResult;
        private final GeckoHubImp onNavigationEvent;
        private final findResAndMsg onWarmupCompleted;

        public onWarmupCompleted(long j, @NotNull GeckoHubImp geckoHubImp, @NotNull getPackageType getpackagetype) {
            this.onExtraCallbackWithResult = j;
            this.onNavigationEvent = geckoHubImp;
            waitForLayout waitforlayoutIAuthTabCallback = isNeedUnzip.IAuthTabCallback(getpackagetype);
            this.onExtraCallback = waitforlayoutIAuthTabCallback;
            findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(waitforlayoutIAuthTabCallback.plus(geckoHubImp));
            this.onWarmupCompleted = findresandmsgOnWarmupCompleted;
            this.IAuthTabCallback = zb.onExtraCallbackWithResult(Integer.MAX_VALUE, (CloseableUtils) null, (Function1) null, 6, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsgOnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(null), 3, (Object) null);
        }

        /* renamed from: o.jni_YGConfigSetErrataJNI$onWarmupCompleted$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            int label;

            AnonymousClass4(access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return onWarmupCompleted.this.new AnonymousClass4(access13800Var);
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: all -> 0x006e, TryCatch #1 {all -> 0x006e, blocks: (B:7:0x0016, B:16:0x003c, B:19:0x004b, B:21:0x0053, B:24:0x0066, B:12:0x002b, B:15:0x0038), top: B:35:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #1 {all -> 0x006e, blocks: (B:7:0x0016, B:16:0x003c, B:19:0x004b, B:21:0x0053, B:24:0x0066, B:12:0x002b, B:15:0x0038), top: B:35:0x0008 }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:8:0x0019). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ReceiveChannel receiveChannel;
                nUnlockFile nunlockfileWriteTypedObject;
                nUnlockFile nunlockfile;
                Object objOnWarmupCompleted;
                Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        receiveChannel = onWarmupCompleted.this.IAuthTabCallback;
                        nunlockfileWriteTypedObject = receiveChannel.writeTypedObject();
                        this.L$0 = receiveChannel;
                        this.L$1 = nunlockfileWriteTypedObject;
                        this.label = 1;
                        objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(this);
                        if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                        }
                        return objOnWarmupCompleted2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nunlockfile = (nUnlockFile) this.L$1;
                        receiveChannel = (ReceiveChannel) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        nunlockfileWriteTypedObject = nunlockfile;
                        this.L$0 = receiveChannel;
                        this.L$1 = nunlockfileWriteTypedObject;
                        this.label = 1;
                        objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(this);
                        if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                            nunlockfile = nunlockfileWriteTypedObject;
                            obj = objOnWarmupCompleted;
                            if (!((Boolean) obj).booleanValue()) {
                                Function1 function1 = (Function1) nunlockfile.onNavigationEvent();
                                this.L$0 = receiveChannel;
                                this.L$1 = nunlockfile;
                                this.label = 2;
                                if (function1.invoke(this) == objOnWarmupCompleted2) {
                                }
                                nunlockfileWriteTypedObject = nunlockfile;
                                this.L$0 = receiveChannel;
                                this.L$1 = nunlockfileWriteTypedObject;
                                this.label = 1;
                                objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(this);
                                if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                                }
                            } else {
                                Unit unit = Unit.INSTANCE;
                                av.onExtraCallback(receiveChannel, (Throwable) null);
                                return unit;
                            }
                        }
                        return objOnWarmupCompleted2;
                    }
                    nunlockfile = (nUnlockFile) this.L$1;
                    receiveChannel = (ReceiveChannel) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } finally {
                }
            }
        }

        public deserializeUriNullableCollection onNavigationEvent(@NotNull Runnable runnable, long j, @NotNull TimeUnit timeUnit) {
            return RxSchedulerKt.onWarmupCompleted(this.onWarmupCompleted, runnable, timeUnit.toMillis(j), (Function1<? super Function1<? super access13800<? super Unit>, ? extends Object>, ? extends Runnable>) new Function1() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return jni_YGConfigSetErrataJNI.onWarmupCompleted.onExtraCallbackWithResult(this.f$0, (Function1) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Runnable onExtraCallbackWithResult(final onWarmupCompleted onwarmupcompleted, final Function1 function1) {
            return new Runnable() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    jni_YGConfigSetErrataJNI.onWarmupCompleted.onNavigationEvent(this.f$0, function1);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNavigationEvent(onWarmupCompleted onwarmupcompleted, Function1 function1) {
            onwarmupcompleted.IAuthTabCallback.IAuthTabCallback(function1);
        }

        public boolean isDisposed() {
            return !findRes.onWarmupCompleted(this.onWarmupCompleted);
        }

        public void dispose() {
            lt.onWarmupCompleted.onExtraCallbackWithResult(this.IAuthTabCallback, (Throwable) null, 1, (Object) null);
            getPackageType.onWarmupCompleted.onWarmupCompleted(this.onExtraCallback, (CancellationException) null, 1, (Object) null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.onNavigationEvent);
            sb.append(" (worker ");
            sb.append(this.onExtraCallbackWithResult);
            sb.append(", ");
            sb.append(isDisposed() ? "disposed" : "active");
            sb.append(')');
            return sb.toString();
        }
    }

    public String toString() {
        return this.onNavigationEvent.toString();
    }
}
