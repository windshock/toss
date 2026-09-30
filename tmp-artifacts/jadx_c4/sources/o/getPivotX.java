package o;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPivotX {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static volatile InitializationStatus onExtraCallbackWithResult = null;
    private static int onTransact = 1;
    public static final getPivotX onExtraCallback = new getPivotX();
    private static final jni_YGNodeStyleGetFlexBasisJNI onWarmupCompleted = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
    private static final findResAndMsg onNavigationEvent = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
    public static final int IAuthTabCallback = 8;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            getPivotX getpivotx = getPivotX.this;
            if (i3 == 0) {
                getpivotx.onWarmupCompleted(null, this);
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = getpivotx.onWarmupCompleted(null, this);
            if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnWarmupCompleted);
            }
            int i4 = onExtraCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    private getPivotX() {
    }

    static {
        int i = asInterface + 61;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (onExtraCallbackWithResult != null) {
            int i2 = onTransact + 29;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onTransact + 105;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted implements OnInitializationCompleteListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ maybeRemoveAttachStateListener<InitializationStatus> onExtraCallbackWithResult;

        onWarmupCompleted(maybeRemoveAttachStateListener<? super InitializationStatus> mayberemoveattachstatelistener) {
            this.onExtraCallbackWithResult = mayberemoveattachstatelistener;
        }

        public final void onInitializationComplete(InitializationStatus initializationStatus) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(initializationStatus, "");
            if (this.onExtraCallbackWithResult.onNavigationEvent()) {
                maybeRemoveAttachStateListener<InitializationStatus> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
                Result.Companion companion = kotlin.Result.Companion;
                mayberemoveattachstatelistener.resumeWith(kotlin.Result.constructor-impl(initializationStatus));
                int i4 = onNavigationEvent + 17;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Context $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Context context, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$appContext = context;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$appContext, access13800Var);
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 103;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                getPivotX getpivotx = getPivotX.onExtraCallback;
                Context context = this.$appContext;
                Intrinsics.checkNotNull(context);
                this.label = 1;
                if (getpivotx.onWarmupCompleted(context, this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 111;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 78 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                ((kotlin.Result) obj).onNavigationEvent();
            }
            return Unit.INSTANCE;
        }
    }

    public final void onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (!onExtraCallbackWithResult()) {
            maybeUpdateAnimatable.onNavigationEvent(onNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(context.getApplicationContext(), null), 3, (Object) null);
        } else {
            int i3 = asBinder + 19;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4
      0x002b: PHI (r1v27 o.getPivotX$onNavigationEvent) = (r1v26 o.getPivotX$onNavigationEvent), (r1v29 o.getPivotX$onNavigationEvent) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v22 int) = (r4v21 int), (r4v24 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107 A[Catch: all -> 0x01cd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01cd, blocks: (B:44:0x00e7, B:48:0x00f6, B:49:0x00fe, B:52:0x0107, B:71:0x0187, B:73:0x018d, B:74:0x0192, B:84:0x01bc, B:83:0x01ae, B:70:0x017d, B:53:0x010d, B:58:0x014d, B:60:0x0153, B:62:0x0159, B:63:0x0166, B:65:0x0170, B:68:0x0176, B:57:0x0143, B:23:0x006a, B:54:0x0133), top: B:95:0x0041, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d A[Catch: all -> 0x01cd, TryCatch #2 {all -> 0x01cd, blocks: (B:44:0x00e7, B:48:0x00f6, B:49:0x00fe, B:52:0x0107, B:71:0x0187, B:73:0x018d, B:74:0x0192, B:84:0x01bc, B:83:0x01ae, B:70:0x017d, B:53:0x010d, B:58:0x014d, B:60:0x0153, B:62:0x0159, B:63:0x0166, B:65:0x0170, B:68:0x0176, B:57:0x0143, B:23:0x006a, B:54:0x0133), top: B:95:0x0041, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull Context context, @NotNull access13800<? super kotlin.Result<? extends InitializationStatus>> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        Object obj;
        Throwable th;
        int i;
        int i2;
        Context context2;
        InitializationStatus initializationStatus;
        Object obj2;
        int i3;
        int i4 = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            int i5 = asBinder + 117;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                onnavigationevent = (onNavigationEvent) access13800Var;
                i3 = onnavigationevent.label;
                int i6 = 85 / 0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    onnavigationevent.label = i3 - 2147483648;
                } else {
                    onnavigationevent = new onNavigationEvent(access13800Var);
                }
            } else {
                onnavigationevent = (onNavigationEvent) access13800Var;
                i3 = onnavigationevent.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objIAuthTabCallback = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onnavigationevent.label;
        Object obj3 = null;
        try {
            try {
            } catch (Throwable th2) {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
            }
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                getTrimPathStart gettrimpathstart = getTrimPathStart.onExtraCallbackWithResult;
                onnavigationevent.L$0 = context;
                onnavigationevent.label = 1;
                objIAuthTabCallback = gettrimpathstart.IAuthTabCallback(context, (access13800<? super getFillColor>) onnavigationevent);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i8 = asBinder + 49;
            onTransact = i8 % 128;
            if (i8 % 2 != 0 ? i7 == 1 : i7 == 1) {
                context = (Context) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (jni_YGNodeStyleGetFlexBasisJNI) onnavigationevent.L$1;
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                    int i9 = onTransact + 115;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    obj = kotlin.Result.constructor-impl((InitializationStatus) objIAuthTabCallback);
                    if (kotlin.Result.onNavigationEvent(obj)) {
                        onExtraCallbackWithResult = (InitializationStatus) obj;
                    }
                    th = kotlin.Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                        int i11 = onTransact + 27;
                        asBinder = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 49 / 0;
                            if (!(!(th instanceof CancellationException))) {
                                throw th;
                            }
                        } else if (th instanceof CancellationException) {
                            throw th;
                        }
                        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "MobileAdsInitializer", "MobileAds initialize failed", th, (Map) null, 8, (Object) null);
                    }
                    context.onWarmupCompleted((Object) null);
                    i = asBinder + 29;
                    onTransact = i % 128;
                    if (i % 2 != 0) {
                        return obj;
                    }
                    throw null;
                }
                int i13 = onnavigationevent.I$0;
                Context context3 = (jni_YGNodeStyleGetFlexBasisJNI) onnavigationevent.L$1;
                context2 = (Context) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                i2 = i13;
                context = context3;
                initializationStatus = onExtraCallbackWithResult;
                if (initializationStatus == null) {
                    int i14 = onTransact + 109;
                    asBinder = i14 % 128;
                    if (i14 % 2 != 0) {
                        Result.Companion companion2 = kotlin.Result.Companion;
                        kotlin.Result.constructor-impl(initializationStatus);
                        obj3.hashCode();
                        throw null;
                    }
                    Result.Companion companion3 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(initializationStatus);
                    context.onWarmupCompleted((Object) null);
                    i = asBinder + 29;
                    onTransact = i % 128;
                    if (i % 2 != 0) {
                    }
                } else {
                    Context applicationContext = context2.getApplicationContext();
                    getPivotX getpivotx = onExtraCallback;
                    Result.Companion companion4 = kotlin.Result.Companion;
                    onnavigationevent.L$0 = access15400.onNavigationEvent(context2);
                    onnavigationevent.L$1 = context;
                    onnavigationevent.L$2 = applicationContext;
                    onnavigationevent.L$3 = getpivotx;
                    onnavigationevent.L$4 = onnavigationevent;
                    onnavigationevent.I$0 = i2;
                    onnavigationevent.I$1 = 0;
                    onnavigationevent.I$2 = 0;
                    onnavigationevent.I$3 = 0;
                    onnavigationevent.label = 3;
                    setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(onnavigationevent), 1);
                    setresourceinternal.onTransact();
                    try {
                        MobileAds.initialize(applicationContext, new onWarmupCompleted(setresourceinternal));
                        obj2 = kotlin.Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th3) {
                        Result.Companion companion5 = kotlin.Result.Companion;
                        obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th3));
                    }
                    Throwable th4 = kotlin.Result.exceptionOrNull-impl(obj2);
                    if (th4 != null && setresourceinternal.onNavigationEvent()) {
                        Result.Companion companion6 = kotlin.Result.Companion;
                        setresourceinternal.resumeWith(kotlin.Result.constructor-impl(ResultKt.createFailure(th4)));
                    }
                    objIAuthTabCallback = setresourceinternal.IAuthTabCallbackDefault();
                    if (objIAuthTabCallback == access14300.onWarmupCompleted()) {
                        access14600.IAuthTabCallback(onnavigationevent);
                    }
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    obj = kotlin.Result.constructor-impl((InitializationStatus) objIAuthTabCallback);
                    if (kotlin.Result.onNavigationEvent(obj)) {
                    }
                    th = kotlin.Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                    }
                    context.onWarmupCompleted((Object) null);
                    i = asBinder + 29;
                    onTransact = i % 128;
                    if (i % 2 != 0) {
                    }
                }
            }
            if (objIAuthTabCallback != getFillColor.AVAILABLE) {
                Result.Companion companion7 = kotlin.Result.Companion;
                return kotlin.Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("AdMob is unavailable.")));
            }
            InitializationStatus initializationStatus2 = onExtraCallbackWithResult;
            if (initializationStatus2 != null) {
                Result.Companion companion8 = kotlin.Result.Companion;
                return kotlin.Result.constructor-impl(initializationStatus2);
            }
            Context context4 = onWarmupCompleted;
            onnavigationevent.L$0 = context;
            onnavigationevent.L$1 = context4;
            onnavigationevent.I$0 = 0;
            onnavigationevent.label = 2;
            if (context4.IAuthTabCallback((Object) null, onnavigationevent) != objOnWarmupCompleted) {
                int i15 = onTransact + 9;
                asBinder = i15 % 128;
                int i16 = i15 % 2;
                context2 = context;
                context = context4;
                i2 = 0;
                initializationStatus = onExtraCallbackWithResult;
                if (initializationStatus == null) {
                }
            }
            return objOnWarmupCompleted;
        } catch (Throwable th5) {
            context.onWarmupCompleted((Object) null);
            throw th5;
        }
    }
}
