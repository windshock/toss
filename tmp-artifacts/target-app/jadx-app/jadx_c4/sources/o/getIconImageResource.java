package o;

import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
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
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getIconImageResource<T> {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int onTransact = 0;
    private static final boolean onWarmupCompleted = false;
    private volatile pauseMyRequest<kotlin.Result<T>> IAuthTabCallback;
    private final jni_YGNodeStyleGetFlexBasisJNI asBinder;
    private final String asInterface;
    private final Function1<access13800<? super T>, Object> onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final JsonEncodingException<T> onNavigationEvent;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int I$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ getIconImageResource<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getIconImageResource<T> geticonimageresource, access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
            this.this$0 = geticonimageresource;
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = this.this$0.onExtraCallback(false, (access13800) this);
            int i4 = IAuthTabCallback + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ getIconImageResource(Function1 function1, Object obj, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, obj, str);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i6 | i5;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = (~(i5 | i8)) | (~(i9 | i6));
        int i12 = i6 + i + i3 + (1389894630 * i4) + ((-1243605516) * i2);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i6) + 1335230464 + (862422157 * i) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i3) + (1607991296 * i4) + ((-548405248) * i2) + ((-1553596416) * i13);
        int i15 = ((i6 * (-88671125)) - 261777699) + (i * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i3 * (-88671137)) + (i4 * (-349388198)) + (i2 * (-147040884)) + (i13 * 182059008);
        return i14 + ((i15 * i15) * (-132513792)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private getIconImageResource(Function1<? super access13800<? super T>, ? extends Object> function1, T t, String str) {
        String str2;
        this.onExtraCallback = function1;
        this.asInterface = str;
        this.asBinder = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
        getColorIconBackground getcoloriconbackground = new getColorIconBackground();
        this.onNavigationEvent = getcoloriconbackground;
        if (str == null) {
            str2 = "SuspendSharedApiCall@" + hashCode();
            int i = IAuthTabCallbackStubProxy + 29;
            onTransact = i % 128;
            if (i % 2 == 0) {
            }
            this.onExtraCallbackWithResult = str2;
            if (t == null) {
                int i2 = IAuthTabCallbackStubProxy + 71;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    getcoloriconbackground.onExtraCallback(t);
                    int i3 = 31 / 0;
                    if (!onWarmupCompleted) {
                        return;
                    }
                } else {
                    getcoloriconbackground.onExtraCallback(t);
                    if (!onWarmupCompleted) {
                        return;
                    }
                }
                Objects.toString(t);
                return;
            }
            return;
        }
        str2 = "SuspendSharedApiCall@" + str;
        int i4 = 2 % 2;
        this.onExtraCallbackWithResult = str2;
        if (t == null) {
        }
    }

    public static final /* synthetic */ jni_YGNodeStyleGetFlexBasisJNI IAuthTabCallback(getIconImageResource geticonimageresource) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni = geticonimageresource.asBinder;
        int i5 = i3 + 105;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return jni_ygnodestylegetflexbasisjni;
    }

    public static final /* synthetic */ boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean z = onWarmupCompleted;
        int i5 = i2 + 103;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ Function1 onExtraCallback(getIconImageResource geticonimageresource) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 31;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Function1<access13800<? super T>, Object> function1 = geticonimageresource.onExtraCallback;
        int i5 = i2 + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getIconImageResource geticonimageresource = (getIconImageResource) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        geticonimageresource.onExtraCallback((getIconImageResource) obj);
        int i4 = onTransact + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(getIconImageResource geticonimageresource) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = geticonimageresource.onExtraCallbackWithResult;
        int i5 = i2 + 73;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ pauseMyRequest onNavigationEvent(getIconImageResource geticonimageresource) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        pauseMyRequest<kotlin.Result<T>> pausemyrequest = geticonimageresource.IAuthTabCallback;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return pausemyrequest;
    }

    public static final /* synthetic */ void onWarmupCompleted(getIconImageResource geticonimageresource, pauseMyRequest pausemyrequest) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        geticonimageresource.IAuthTabCallback = pausemyrequest;
        int i4 = IAuthTabCallbackStubProxy + 11;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ getIconImageResource onExtraCallback(onExtraCallback onextracallback, String str, Function1 function1, long j, Object obj, int i, Object obj2) {
            T t;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 83;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            if (i3 % 2 != 0) {
                t = obj;
                if ((i & 93) != 0) {
                    int i5 = i4 + 123;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    t = null;
                }
            } else {
                t = obj;
                if ((i & 8) != 0) {
                }
            }
            getIconImageResource<T> geticonimageresourceOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult(str, function1, j, t);
            int i7 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return geticonimageresourceOnExtraCallbackWithResult;
        }

        public final <T> getIconImageResource<T> onExtraCallbackWithResult(@NotNull String str, @NotNull Function1<? super access13800<? super T>, ? extends Object> function1, long j, @Nullable T t) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            if (!setLogBuffers.onMinimized(j)) {
                throw new IllegalArgumentException("expireAfterWrite must be positive. Use createWithoutCache() for no caching.");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            getIconImageResource<T> geticonimageresource = new getIconImageResource<>(function1, t, str, defaultConstructorMarker);
            geticonimageresource.onExtraCallback(setLogBuffers.asBinder(j), TimeUnit.MILLISECONDS);
            int i4 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return geticonimageresource;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ getIconImageResource IAuthTabCallback(onExtraCallback onextracallback, String str, Function1 function1, Object obj, setLogBuffers setlogbuffers, int i, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0 ? (i & 4) != 0 : (i & 4) != 0) {
                obj = null;
            }
            if ((i & 8) != 0) {
                int i5 = i3 + 83;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                setlogbuffers = null;
            }
            return onextracallback.onNavigationEvent(str, function1, obj, setlogbuffers);
        }

        @Deprecated
        public final <T> getIconImageResource<T> onNavigationEvent(@NotNull String str, @NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @Nullable T t, @Nullable setLogBuffers setlogbuffers) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            getIconImageResource<T> geticonimageresource = new getIconImageResource<>(function1, t, str, null);
            if (setlogbuffers != null) {
                geticonimageresource.onExtraCallback(setLogBuffers.asBinder(setlogbuffers.onExtraCallback()), TimeUnit.MILLISECONDS);
                int i2 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return geticonimageresource;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(getIconImageResource geticonimageresource, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 5;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 67;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return geticonimageresource.onExtraCallback(z, access13800Var);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getIconImageResource geticonimageresource = (getIconImageResource) objArr[0];
        pauseMyRequest pausemyrequest = (pauseMyRequest) objArr[1];
        CoroutineContext coroutineContext = (CoroutineContext) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            access13600 access13600Var = (access13700) coroutineContext.get(access13700.onWarmupCompleted);
            if (access13600Var == null) {
                access13600Var = access13600.IAuthTabCallback;
                int i3 = IAuthTabCallbackStubProxy + 121;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(access13600Var.plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null))), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(geticonimageresource, pausemyrequest, null), 3, (Object) null);
            return null;
        }
        coroutineContext.get(access13700.onWarmupCompleted);
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ pauseMyRequest<kotlin.Result<T>> $deferred;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ getIconImageResource<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(getIconImageResource<T> geticonimageresource, pauseMyRequest<kotlin.Result<T>> pausemyrequest, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.this$0 = geticonimageresource;
            this.$deferred = pausemyrequest;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, this.$deferred, access13800Var);
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 25 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r15, r0, r14) != r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r15, r0, r14) != r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0154, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r15, r0, r14) == r1) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[Catch: all -> 0x00cd, TryCatch #2 {all -> 0x00cd, blocks: (B:22:0x0078, B:24:0x007e, B:25:0x009b), top: B:55:0x0078, outer: #4 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjniIAuthTabCallback;
            getIconImageResource<T> geticonimageresource;
            pauseMyRequest<kotlin.Result<T>> pausemyrequest;
            Object obj2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            try {
            } catch (CancellationException e) {
                if (getIconImageResource.IAuthTabCallback()) {
                    getIconImageResource.onExtraCallbackWithResult(this.this$0);
                    e.getMessage();
                    int i4 = onExtraCallbackWithResult + 51;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }
                pauseMyRequest<kotlin.Result<T>> pausemyrequest2 = this.$deferred;
                Result.Companion companion = kotlin.Result.Companion;
                pausemyrequest2.IAuthTabCallback(kotlin.Result.IAuthTabCallback(kotlin.Result.constructor-impl(ResultKt.createFailure(e))));
                UpdatePackageContent updatePackageContent = UpdatePackageContent.onExtraCallback;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$deferred, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
            } catch (Throwable th) {
                if (getIconImageResource.IAuthTabCallback()) {
                    getIconImageResource.onExtraCallbackWithResult(this.this$0);
                    th.getMessage();
                }
                pauseMyRequest<kotlin.Result<T>> pausemyrequest3 = this.$deferred;
                Result.Companion companion2 = kotlin.Result.Companion;
                pausemyrequest3.IAuthTabCallback(kotlin.Result.IAuthTabCallback(kotlin.Result.constructor-impl(ResultKt.createFailure(th))));
                UpdatePackageContent updatePackageContent2 = UpdatePackageContent.onExtraCallback;
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$deferred, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
            }
            switch (this.label) {
                case 0:
                    ResultKt.onNavigationEvent(obj);
                    Function1 function1OnExtraCallback = getIconImageResource.onExtraCallback((getIconImageResource) this.this$0);
                    this.label = 1;
                    obj = function1OnExtraCallback.invoke(this);
                    if (obj != objOnWarmupCompleted) {
                        jni_ygnodestylegetflexbasisjniIAuthTabCallback = getIconImageResource.IAuthTabCallback(this.this$0);
                        geticonimageresource = this.this$0;
                        pausemyrequest = this.$deferred;
                        this.L$0 = obj;
                        this.L$1 = jni_ygnodestylegetflexbasisjniIAuthTabCallback;
                        this.L$2 = geticonimageresource;
                        this.L$3 = pausemyrequest;
                        this.I$0 = 0;
                        this.label = 2;
                        if (jni_ygnodestylegetflexbasisjniIAuthTabCallback.IAuthTabCallback((Object) null, this) != objOnWarmupCompleted) {
                            obj2 = obj;
                            try {
                                if (getIconImageResource.onNavigationEvent(geticonimageresource) == pausemyrequest) {
                                    int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
                                    getIconImageResource.IAuthTabCallback(-2058611249, new Object[]{geticonimageresource, obj2}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, 2058611250);
                                }
                                Unit unit = Unit.INSTANCE;
                                jni_ygnodestylegetflexbasisjniIAuthTabCallback.onWarmupCompleted((Object) null);
                                pauseMyRequest<kotlin.Result<T>> pausemyrequest4 = this.$deferred;
                                Result.Companion companion3 = kotlin.Result.Companion;
                                pausemyrequest4.IAuthTabCallback(kotlin.Result.IAuthTabCallback(kotlin.Result.constructor-impl(obj2)));
                                UpdatePackageContent updatePackageContent3 = UpdatePackageContent.onExtraCallback;
                                AnonymousClass1 anonymousClass13 = new AnonymousClass1(this.this$0, this.$deferred, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 3;
                                break;
                            } catch (Throwable th2) {
                                jni_ygnodestylegetflexbasisjniIAuthTabCallback.onWarmupCompleted((Object) null);
                                throw th2;
                            }
                        }
                    }
                    return objOnWarmupCompleted;
                case 1:
                    ResultKt.onNavigationEvent(obj);
                    jni_ygnodestylegetflexbasisjniIAuthTabCallback = getIconImageResource.IAuthTabCallback(this.this$0);
                    geticonimageresource = this.this$0;
                    pausemyrequest = this.$deferred;
                    this.L$0 = obj;
                    this.L$1 = jni_ygnodestylegetflexbasisjniIAuthTabCallback;
                    this.L$2 = geticonimageresource;
                    this.L$3 = pausemyrequest;
                    this.I$0 = 0;
                    this.label = 2;
                    if (jni_ygnodestylegetflexbasisjniIAuthTabCallback.IAuthTabCallback((Object) null, this) != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                case 2:
                    pausemyrequest = (pauseMyRequest) this.L$3;
                    geticonimageresource = (getIconImageResource) this.L$2;
                    jni_ygnodestylegetflexbasisjniIAuthTabCallback = (jni_YGNodeStyleGetFlexBasisJNI) this.L$1;
                    obj2 = this.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj);
                        if (getIconImageResource.onNavigationEvent(geticonimageresource) == pausemyrequest) {
                        }
                        Unit unit2 = Unit.INSTANCE;
                        jni_ygnodestylegetflexbasisjniIAuthTabCallback.onWarmupCompleted((Object) null);
                        pauseMyRequest<kotlin.Result<T>> pausemyrequest42 = this.$deferred;
                        Result.Companion companion32 = kotlin.Result.Companion;
                        pausemyrequest42.IAuthTabCallback(kotlin.Result.IAuthTabCallback(kotlin.Result.constructor-impl(obj2)));
                        UpdatePackageContent updatePackageContent32 = UpdatePackageContent.onExtraCallback;
                        AnonymousClass1 anonymousClass132 = new AnonymousClass1(this.this$0, this.$deferred, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        break;
                    } catch (Throwable th3) {
                        UpdatePackageContent updatePackageContent4 = UpdatePackageContent.onExtraCallback;
                        AnonymousClass1 anonymousClass14 = new AnonymousClass1(this.this$0, this.$deferred, null);
                        this.L$0 = th3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 6;
                        if (maybeUpdateAnimatable.onExtraCallback(updatePackageContent4, anonymousClass14, this) != objOnWarmupCompleted) {
                            throw th3;
                        }
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                case 6:
                    Throwable th4 = (Throwable) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    throw th4;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: o.getIconImageResource$onWarmupCompleted$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ pauseMyRequest<kotlin.Result<T>> $deferred;
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ getIconImageResource<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(getIconImageResource<T> geticonimageresource, pauseMyRequest<kotlin.Result<T>> pausemyrequest, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = geticonimageresource;
                this.$deferred = pausemyrequest;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$deferred, access13800Var);
                int i2 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 46 / 0;
                }
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 24 / 0;
                }
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[PHI: r1
              0x003f: PHI (r1v9 java.lang.Object) = (r1v4 java.lang.Object), (r1v11 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r5
              0x0025: PHI (r5v1 int) = (r5v0 int), (r5v3 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted;
                int i;
                pauseMyRequest<kotlin.Result<T>> pausemyrequest;
                getIconImageResource<T> geticonimageresource;
                jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 83 / 0;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjniIAuthTabCallback = getIconImageResource.IAuthTabCallback(this.this$0);
                        getIconImageResource<T> geticonimageresource2 = this.this$0;
                        pauseMyRequest<kotlin.Result<T>> pausemyrequest2 = this.$deferred;
                        this.L$0 = jni_ygnodestylegetflexbasisjniIAuthTabCallback;
                        this.L$1 = geticonimageresource2;
                        this.L$2 = pausemyrequest2;
                        this.I$0 = 0;
                        this.label = 1;
                        if (jni_ygnodestylegetflexbasisjniIAuthTabCallback.IAuthTabCallback((Object) null, this) == objOnWarmupCompleted) {
                            int i5 = onExtraCallbackWithResult + 109;
                            IAuthTabCallback = i5 % 128;
                            if (i5 % 2 == 0) {
                                int i6 = 78 / 0;
                            }
                            return objOnWarmupCompleted;
                        }
                        jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjniIAuthTabCallback;
                        geticonimageresource = geticonimageresource2;
                        pausemyrequest = pausemyrequest2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pausemyrequest = (pauseMyRequest) this.L$2;
                        geticonimageresource = (getIconImageResource) this.L$1;
                        jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                    }
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    if (i != 0) {
                    }
                }
                try {
                    if (getIconImageResource.onNavigationEvent(geticonimageresource) == pausemyrequest) {
                        int i7 = onExtraCallbackWithResult + 5;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        getIconImageResource.onWarmupCompleted(geticonimageresource, (pauseMyRequest) null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                }
            }
        }
    }

    static abstract class onExtraCallbackWithResult<T> {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: o.getIconImageResource$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0027onExtraCallbackWithResult<T> extends onExtraCallbackWithResult<T> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private final T onExtraCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onNavigationEvent + 31;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof C0027onExtraCallbackWithResult) {
                    return !(Intrinsics.areEqual(this.onExtraCallback, ((C0027onExtraCallbackWithResult) obj).onExtraCallback) ^ true);
                }
                int i4 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                T t = this.onExtraCallback;
                if (t != null) {
                    return t.hashCode();
                }
                int i5 = i2 + 103;
                onExtraCallbackWithResult = i5 % 128;
                return 1 ^ (i5 % 2 == 0 ? 0 : 1);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Cached(value=" + this.onExtraCallback + ")";
                int i2 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public C0027onExtraCallbackWithResult(T t) {
                super(null);
                this.onExtraCallback = t;
            }

            public final T onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 51;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                T t = this.onExtraCallback;
                int i5 = i3 + 33;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 66 / 0;
                }
                return t;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public static final class onNavigationEvent<T> extends onExtraCallbackWithResult<T> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            private final pauseMyRequest<kotlin.Result<T>> IAuthTabCallback;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
            
                if ((r6 instanceof o.getIconImageResource.onExtraCallbackWithResult.onNavigationEvent) != false) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                r2 = r2 + 117;
                o.getIconImageResource.onExtraCallbackWithResult.onNavigationEvent.onWarmupCompleted = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, ((o.getIconImageResource.onExtraCallbackWithResult.onNavigationEvent) r6).IAuthTabCallback) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r2 = r2 + 77;
                o.getIconImageResource.onExtraCallbackWithResult.onNavigationEvent.onWarmupCompleted = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 85;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    int i4 = 8 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.IAuthTabCallback.hashCode();
                int i4 = onWarmupCompleted + 33;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Inflight(deferred=" + this.IAuthTabCallback + ")";
                int i2 = onExtraCallback + 11;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 19 / 0;
                }
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(@NotNull pauseMyRequest<kotlin.Result<T>> pausemyrequest) {
                super(null);
                Intrinsics.checkNotNullParameter(pausemyrequest, "");
                this.IAuthTabCallback = pausemyrequest;
            }

            public final pauseMyRequest<kotlin.Result<T>> onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 49;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                pauseMyRequest<kotlin.Result<T>> pausemyrequest = this.IAuthTabCallback;
                int i5 = i2 + 53;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return pausemyrequest;
                }
                throw null;
            }
        }

        public static final class onExtraCallback<T> extends onExtraCallbackWithResult<T> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            private final pauseMyRequest<kotlin.Result<T>> IAuthTabCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 15;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i4 + 3;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
                if (!(obj instanceof onExtraCallback)) {
                    int i8 = i2 + 121;
                    onWarmupCompleted = i8 % 128;
                    return i8 % 2 == 0;
                }
                if (Intrinsics.areEqual(this.IAuthTabCallback, ((onExtraCallback) obj).IAuthTabCallback)) {
                    return true;
                }
                int i9 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.IAuthTabCallback.hashCode();
                if (i3 != 0) {
                    int i4 = 50 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "NewCall(deferred=" + this.IAuthTabCallback + ")";
                int i2 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 / 0;
                }
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(@NotNull pauseMyRequest<kotlin.Result<T>> pausemyrequest) {
                super(null);
                Intrinsics.checkNotNullParameter(pausemyrequest, "");
                this.IAuthTabCallback = pausemyrequest;
            }

            public final pauseMyRequest<kotlin.Result<T>> onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 77;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                pauseMyRequest<kotlin.Result<T>> pausemyrequest = this.IAuthTabCallback;
                int i5 = i3 + 101;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return pausemyrequest;
            }
        }
    }

    public final void onExtraCallback(long j, @NotNull TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(timeUnit, "");
            this.onNavigationEvent.onExtraCallbackWithResult(timeUnit.toMillis(j));
        } else {
            Intrinsics.checkNotNullParameter(timeUnit, "");
            this.onNavigationEvent.onExtraCallbackWithResult(timeUnit.toMillis(j));
            int i3 = 85 / 0;
        }
    }

    private final void onExtraCallback(T t) {
        int i = 2 % 2;
        this.onNavigationEvent.onExtraCallback(t);
        if (onWarmupCompleted) {
            int i2 = IAuthTabCallbackStubProxy + 7;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (t != null) {
                Objects.toString(t);
            }
        }
        int i4 = IAuthTabCallbackStubProxy + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private final T onWarmupCompleted() {
        int i = 2 % 2;
        T tOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        Object obj = null;
        if (tOnNavigationEvent == null) {
            int i2 = IAuthTabCallbackStubProxy + 49;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
        int i3 = onTransact + 57;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return tOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        if (this.onNavigationEvent.onNavigationEvent() != null) {
            int i2 = IAuthTabCallbackStubProxy + 81;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.onWarmupCompleted();
            if (onWarmupCompleted) {
                int i4 = IAuthTabCallbackStubProxy + 111;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
    
        if (r0 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r0 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        if (r0 == r5) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(boolean z, @NotNull access13800<? super T> access13800Var) throws NoWhenBranchMatchedException {
        onNavigationEvent onnavigationevent;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        boolean z2;
        Object onextracallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z3 = access13800Var instanceof onNavigationEvent;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i3 = onnavigationevent.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = onTransact + 33;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                onnavigationevent.label = i3 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(this, access13800Var);
            }
        }
        Object objIAuthTabCallback = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onnavigationevent.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            jni_ygnodestylegetflexbasisjni = this.asBinder;
            onnavigationevent.L$0 = jni_ygnodestylegetflexbasisjni;
            z2 = z;
            onnavigationevent.Z$0 = z2;
            onnavigationevent.I$0 = 0;
            onnavigationevent.label = 1;
            if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, onnavigationevent) != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i6 != 1) {
            int i7 = onTransact + 45;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 != 0 ? i6 == 2 : i6 == 3) {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                Object objOnNavigationEvent = ((kotlin.Result) objIAuthTabCallback).onNavigationEvent();
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                return objOnNavigationEvent;
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            Object objOnNavigationEvent2 = ((kotlin.Result) objIAuthTabCallback).onNavigationEvent();
            ResultKt.onNavigationEvent(objOnNavigationEvent2);
            return objOnNavigationEvent2;
        }
        boolean z4 = onnavigationevent.Z$0;
        jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) onnavigationevent.L$0;
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        z2 = z4;
        if (z2) {
            try {
                onExtraCallbackWithResult("execute-without-cache");
                this.IAuthTabCallback = null;
            } catch (Throwable th) {
                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                throw th;
            }
        }
        T tOnWarmupCompleted = onWarmupCompleted();
        if (tOnWarmupCompleted != null) {
            int i8 = IAuthTabCallbackStubProxy + 119;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            if (onWarmupCompleted) {
                Objects.toString(tOnWarmupCompleted);
            }
            onextracallback = new onExtraCallbackWithResult.C0027onExtraCallbackWithResult(tOnWarmupCompleted);
        } else {
            pauseMyRequest<kotlin.Result<T>> pausemyrequest = this.IAuthTabCallback;
            if (pausemyrequest != null) {
                int i10 = IAuthTabCallbackStubProxy + 125;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                onextracallback = new onExtraCallbackWithResult.onNavigationEvent(pausemyrequest);
            } else {
                pauseMyRequest<kotlin.Result<T>> pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
                this.IAuthTabCallback = pausemyrequestOnExtraCallback;
                if (onWarmupCompleted) {
                    int i12 = onTransact + 49;
                    IAuthTabCallbackStubProxy = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                }
                onextracallback = new onExtraCallbackWithResult.onExtraCallback(pausemyrequestOnExtraCallback);
            }
        }
        jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
        if (onextracallback instanceof onExtraCallbackWithResult.C0027onExtraCallbackWithResult) {
            return ((onExtraCallbackWithResult.C0027onExtraCallbackWithResult) onextracallback).onExtraCallbackWithResult();
        }
        if (onextracallback instanceof onExtraCallbackWithResult.onNavigationEvent) {
            int i13 = onTransact + 77;
            IAuthTabCallbackStubProxy = i13 % 128;
            if (i13 % 2 == 0) {
                pauseMyRequest<kotlin.Result<T>> pausemyrequestOnNavigationEvent = ((onExtraCallbackWithResult.onNavigationEvent) onextracallback).onNavigationEvent();
                onnavigationevent.L$0 = access15400.onNavigationEvent(onextracallback);
                onnavigationevent.Z$0 = z2;
                onnavigationevent.label = 4;
                objIAuthTabCallback = pausemyrequestOnNavigationEvent.IAuthTabCallback(onnavigationevent);
            } else {
                pauseMyRequest<kotlin.Result<T>> pausemyrequestOnNavigationEvent2 = ((onExtraCallbackWithResult.onNavigationEvent) onextracallback).onNavigationEvent();
                onnavigationevent.L$0 = access15400.onNavigationEvent(onextracallback);
                onnavigationevent.Z$0 = z2;
                onnavigationevent.label = 2;
                objIAuthTabCallback = pausemyrequestOnNavigationEvent2.IAuthTabCallback(onnavigationevent);
            }
        } else {
            if (!(onextracallback instanceof onExtraCallbackWithResult.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            onExtraCallbackWithResult.onExtraCallback onextracallback2 = (onExtraCallbackWithResult.onExtraCallback) onextracallback;
            IAuthTabCallback(-1858556274, new Object[]{this, onextracallback2.onWarmupCompleted(), onnavigationevent.getContext()}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1858556274);
            pauseMyRequest<kotlin.Result<T>> pausemyrequestOnWarmupCompleted = onextracallback2.onWarmupCompleted();
            onnavigationevent.L$0 = access15400.onNavigationEvent(onextracallback);
            onnavigationevent.Z$0 = z2;
            onnavigationevent.label = 3;
            objIAuthTabCallback = pausemyrequestOnWarmupCompleted.IAuthTabCallback(onnavigationevent);
        }
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ void IAuthTabCallback(getIconImageResource geticonimageresource, Object obj) {
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(-2058611249, new Object[]{geticonimageresource, obj}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, 2058611250);
    }

    private final void onWarmupCompleted(pauseMyRequest<kotlin.Result<T>> pausemyrequest, CoroutineContext coroutineContext) {
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(-1858556274, new Object[]{this, pausemyrequest, coroutineContext}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, 1858556274);
    }
}
