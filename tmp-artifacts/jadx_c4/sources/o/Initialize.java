package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Initialize<T> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final findResAndMsg onExtraCallbackWithResult;
    private final ConcurrentHashMap<String, pauseMyRequest<kotlin.Result<T>>> onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ Initialize<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Initialize<T> initialize, access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
            this.this$0 = initialize;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Initialize<T> initialize = this.this$0;
            if (i3 == 0) {
                return initialize.onExtraCallbackWithResult(null, null, this);
            }
            initialize.onExtraCallbackWithResult(null, null, this);
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Initialize() {
        findResAndMsg findresandmsg = null;
        this(findresandmsg, 1, findresandmsg);
    }

    public Initialize(@NotNull findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onExtraCallbackWithResult = findresandmsg;
        this.onNavigationEvent = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Initialize(findResAndMsg findresandmsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            findresandmsg = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
            int i4 = 2 % 2;
        }
        this(findresandmsg);
    }

    public static final /* synthetic */ ConcurrentHashMap onWarmupCompleted(Initialize initialize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        ConcurrentHashMap<String, pauseMyRequest<kotlin.Result<T>>> concurrentHashMap = initialize.onNavigationEvent;
        int i5 = i3 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Function1<access13800<? super T>, Object> $block;
        final /* synthetic */ String $key;
        final /* synthetic */ pauseMyRequest<kotlin.Result<T>> $mine;
        Object L$0;
        int label;
        final /* synthetic */ Initialize<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(pauseMyRequest<kotlin.Result<T>> pausemyrequest, Function1<? super access13800<? super T>, ? extends Object> function1, Initialize<T> initialize, String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$mine = pausemyrequest;
            this.$block = function1;
            this.this$0 = initialize;
            this.$key = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$mine, this.$block, this.this$0, this.$key, access13800Var);
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* renamed from: o.Initialize$onWarmupCompleted$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ String $key;
            final /* synthetic */ pauseMyRequest<kotlin.Result<T>> $mine;
            int label;
            final /* synthetic */ Initialize<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Initialize<T> initialize, String str, pauseMyRequest<kotlin.Result<T>> pausemyrequest, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = initialize;
                this.$key = str;
                this.$mine = pausemyrequest;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$key, this.$mine, access13800Var);
                int i2 = onNavigationEvent + 21;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass2;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 25;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Boolean> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onExtraCallbackWithResult(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = onNavigationEvent + 97;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 18 / 0;
                }
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 73;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 79;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i2 + 65;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i6 == 0) {
                    return access14000.onNavigationEvent(Initialize.onWarmupCompleted(this.this$0).remove(this.$key, this.$mine));
                }
                int i7 = 69 / 0;
                return access14000.onNavigationEvent(Initialize.onWarmupCompleted(this.this$0).remove(this.$key, this.$mine));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r9, r0, r8) == r1) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            pauseMyRequest<kotlin.Result<T>> pausemyrequest;
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
            } catch (Throwable th) {
                try {
                    pauseMyRequest<kotlin.Result<T>> pausemyrequest2 = this.$mine;
                    Result.Companion companion = kotlin.Result.Companion;
                    pausemyrequest2.IAuthTabCallback(kotlin.Result.IAuthTabCallback(kotlin.Result.constructor-impl(ResultKt.createFailure(th))));
                    UpdatePackageContent updatePackageContent = UpdatePackageContent.onExtraCallback;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$key, this.$mine, null);
                    this.L$0 = null;
                    this.label = 3;
                } catch (Throwable th2) {
                    UpdatePackageContent updatePackageContent2 = UpdatePackageContent.onExtraCallback;
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(this.this$0, this.$key, this.$mine, null);
                    this.L$0 = th2;
                    this.label = 4;
                    if (maybeUpdateAnimatable.onExtraCallback(updatePackageContent2, anonymousClass22, this) != objOnWarmupCompleted) {
                        throw th2;
                    }
                }
            }
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                pausemyrequest = this.$mine;
                Result.Companion companion2 = kotlin.Result.Companion;
                Function1<access13800<? super T>, Object> function1 = this.$block;
                this.L$0 = pausemyrequest;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    int i5 = onExtraCallback;
                    int i6 = i5 + 29;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (i4 != 3) {
                        int i8 = i5 + 27;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 == 0 ? i4 != 4 : i4 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th3 = (Throwable) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        throw th3;
                    }
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            pausemyrequest = (pauseMyRequest) this.L$0;
            ResultKt.onNavigationEvent(obj);
            pausemyrequest.IAuthTabCallback(kotlin.Result.IAuthTabCallback(kotlin.Result.constructor-impl(obj)));
            UpdatePackageContent updatePackageContent3 = UpdatePackageContent.onExtraCallback;
            AnonymousClass2 anonymousClass23 = new AnonymousClass2(this.this$0, this.$key, this.$mine, null);
            this.L$0 = null;
            this.label = 2;
            if (maybeUpdateAnimatable.onExtraCallback(updatePackageContent3, anonymousClass23, this) == objOnWarmupCompleted) {
                int i9 = onExtraCallback + 37;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return objOnWarmupCompleted;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        if (r0 != r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fc, code lost:
    
        if (r0 == r9) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull String str, @NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @NotNull access13800<? super T> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        Object obj = null;
        if (access13800Var instanceof IAuthTabCallback) {
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((IAuthTabCallback) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
                int i5 = onWarmupCompleted + 67;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iAuthTabCallback = new IAuthTabCallback(this, access13800Var);
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object objIAuthTabCallback = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallback2.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            pauseMyRequest<kotlin.Result<T>> pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
            pauseMyRequest<kotlin.Result<T>> pausemyrequestPutIfAbsent = this.onNavigationEvent.putIfAbsent(str, pausemyrequestOnExtraCallback);
            if (pausemyrequestPutIfAbsent != null) {
                iAuthTabCallback2.L$0 = access15400.onNavigationEvent(str);
                iAuthTabCallback2.L$1 = access15400.onNavigationEvent(function1);
                iAuthTabCallback2.L$2 = access15400.onNavigationEvent(pausemyrequestOnExtraCallback);
                iAuthTabCallback2.L$3 = access15400.onNavigationEvent(pausemyrequestPutIfAbsent);
                iAuthTabCallback2.label = 1;
                objIAuthTabCallback = pausemyrequestPutIfAbsent.IAuthTabCallback(iAuthTabCallback2);
            } else {
                maybeUpdateAnimatable.onNavigationEvent(this.onExtraCallbackWithResult, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(pausemyrequestOnExtraCallback, function1, this, str, null), 3, (Object) null);
                iAuthTabCallback2.L$0 = access15400.onNavigationEvent(str);
                iAuthTabCallback2.L$1 = access15400.onNavigationEvent(function1);
                iAuthTabCallback2.L$2 = access15400.onNavigationEvent(pausemyrequestOnExtraCallback);
                iAuthTabCallback2.L$3 = access15400.onNavigationEvent(pausemyrequestPutIfAbsent);
                iAuthTabCallback2.label = 2;
                objIAuthTabCallback = pausemyrequestOnExtraCallback.IAuthTabCallback(iAuthTabCallback2);
            }
            return objOnWarmupCompleted;
        }
        int i8 = IAuthTabCallback + 111;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        if (i7 == 1) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            Object objOnNavigationEvent = ((kotlin.Result) objIAuthTabCallback).onNavigationEvent();
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            return objOnNavigationEvent;
        }
        if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        Object objOnNavigationEvent2 = ((kotlin.Result) objIAuthTabCallback).onNavigationEvent();
        ResultKt.onNavigationEvent(objOnNavigationEvent2);
        int i10 = onWarmupCompleted + 71;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 99 / 0;
        }
        return objOnNavigationEvent2;
    }
}
