package o;

import android.app.Activity;
import im.toss.core.tuba.Trigger;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class getWriteEnabled implements onAssetDownloadCompleted {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private final long IAuthTabCallback;
    private final String onExtraCallback;
    private final OkHttpNetworkFetcherExternalSyntheticLambda3 onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            getWriteEnabled getwriteenabled = getWriteEnabled.this;
            if (i3 != 0) {
                return getwriteenabled.onExtraCallbackWithResult(null, null, this);
            }
            getwriteenabled.onExtraCallbackWithResult(null, null, this);
            throw null;
        }
    }

    static {
        int i = onTransact + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public abstract void onWarmupCompleted(@NotNull Activity activity, @NotNull Trigger trigger, @NotNull String str);

    public getWriteEnabled(@NotNull OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, @NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(okHttpNetworkFetcherExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = okHttpNetworkFetcherExternalSyntheticLambda3;
        this.onExtraCallback = str;
        this.IAuthTabCallback = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getWriteEnabled(OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallbackStub + 51;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 3;
            } else {
                int i7 = 2 % 2;
            }
            j = 0;
        }
        this(okHttpNetworkFetcherExternalSyntheticLambda3, str, j);
    }

    public static final /* synthetic */ long IAuthTabCallback(getWriteEnabled getwriteenabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = getwriteenabled.IAuthTabCallback;
        int i5 = i3 + 31;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ OkHttpNetworkFetcherExternalSyntheticLambda3 onExtraCallback(getWriteEnabled getwriteenabled) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3 = getwriteenabled.onWarmupCompleted;
        int i5 = i3 + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return okHttpNetworkFetcherExternalSyntheticLambda3;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String $loggingCompany;
        final /* synthetic */ Trigger $trigger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Trigger trigger, String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$trigger = trigger;
            this.$loggingCompany = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = getWriteEnabled.this.new onNavigationEvent(this.$trigger, this.$loggingCompany, access13800Var);
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
            return objIAuthTabCallback;
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<Activity, access13800<? super Boolean>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            /* synthetic */ Object L$0;
            int label;

            onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
                onwarmupcompleted.L$0 = obj;
                int i2 = IAuthTabCallback + 19;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((Activity) obj, (access13800) obj2);
                if (i3 == 0) {
                    int i4 = 51 / 0;
                }
                int i5 = IAuthTabCallback + 31;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(Activity activity, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedCreate = create(activity, access13800Var);
                if (i3 == 0) {
                    onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 49;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean z;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Activity activity = (Activity) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                if (activity != null) {
                    int i4 = IAuthTabCallback + 31;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        activity.isFinishing();
                        throw null;
                    }
                    z = !activity.isFinishing();
                }
                return access14000.onNavigationEvent(z);
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation currentActivityFlow = getWriteEnabled.onExtraCallback(getWriteEnabled.this).getCurrentActivityFlow();
                long jIAuthTabCallback = getWriteEnabled.IAuthTabCallback(getWriteEnabled.this);
                if (jIAuthTabCallback != 0) {
                    currentActivityFlow = ycxycx.IAuthTabCallback(currentActivityFlow, new onExtraCallbackWithResult(jIAuthTabCallback, null));
                    int i3 = onNavigationEvent + 29;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
                C0029onNavigationEvent c0029onNavigationEvent = new C0029onNavigationEvent(currentActivityFlow);
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null);
                this.label = 1;
                obj = ycxycx.IAuthTabCallback(c0029onNavigationEvent, onwarmupcompleted, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallback + 63;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            Activity activity = (Activity) obj;
            if (activity != null) {
                int i7 = onNavigationEvent + 105;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                getWriteEnabled.this.onWarmupCompleted(activity, this.$trigger, this.$loggingCompany);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.getWriteEnabled$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0029onNavigationEvent implements IAnimation<Activity> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ IAnimation onExtraCallbackWithResult;

            /* renamed from: o.getWriteEnabled$onNavigationEvent$onNavigationEvent$5, reason: invalid class name */
            public static final class AnonymousClass5<T> implements setRipple {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                final /* synthetic */ setRipple IAuthTabCallback;

                /* renamed from: o.getWriteEnabled$onNavigationEvent$onNavigationEvent$5$2, reason: invalid class name */
                public static final class AnonymousClass2 extends ContinuationImpl {
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass2(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult + 51;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass5.this.emit(null, this);
                        int i4 = IAuthTabCallback + 11;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return objEmit;
                    }
                }

                public AnonymousClass5(setRipple setripple) {
                    this.IAuthTabCallback = setripple;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass2 anonymousClass2;
                    int i = 2 % 2;
                    Activity activity = null;
                    if (access13800Var instanceof AnonymousClass2) {
                        int i2 = onExtraCallback + 79;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = ((AnonymousClass2) access13800Var).label;
                            activity.hashCode();
                            throw null;
                        }
                        anonymousClass2 = (AnonymousClass2) access13800Var;
                        int i4 = anonymousClass2.label;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            anonymousClass2.label = i4 - 2147483648;
                        } else {
                            anonymousClass2 = new AnonymousClass2(access13800Var);
                        }
                    }
                    Object obj2 = anonymousClass2.result;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i5 = anonymousClass2.label;
                    if (i5 == 0) {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.IAuthTabCallback;
                        WeakReference weakReference = (WeakReference) obj;
                        if (weakReference != null) {
                            int i6 = onExtraCallbackWithResult + 17;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                activity = (Activity) weakReference.get();
                                int i7 = 49 / 0;
                            } else {
                                activity = (Activity) weakReference.get();
                            }
                        }
                        anonymousClass2.L$0 = access15400.onNavigationEvent(obj);
                        anonymousClass2.L$1 = access15400.onNavigationEvent(anonymousClass2);
                        anonymousClass2.L$2 = access15400.onNavigationEvent(obj);
                        anonymousClass2.L$3 = access15400.onNavigationEvent(setripple);
                        anonymousClass2.I$0 = 0;
                        anonymousClass2.label = 1;
                        if (setripple.emit(activity, anonymousClass2) == objOnWarmupCompleted) {
                            int i8 = onExtraCallback + 7;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i9 = 78 / 0;
                            }
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C0029onNavigationEvent(IAnimation iAnimation) {
                this.onExtraCallbackWithResult = iAnimation;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass5(setripple), access13800Var);
                if (objCollect != access14300.onWarmupCompleted()) {
                    Unit unit = Unit.INSTANCE;
                    int i2 = IAuthTabCallback + 19;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return unit;
                }
                int i4 = onWarmupCompleted + 107;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objCollect;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<WeakReference<Activity>, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ long $delay;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(long j, access13800 access13800Var) {
                super(2, access13800Var);
                this.$delay = j;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$delay, access13800Var);
                int i2 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted(obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }

            public final Object onWarmupCompleted(WeakReference<Activity> weakReference, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(weakReference, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    access14300.onWarmupCompleted();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    long j = this.$delay;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                        int i4 = onExtraCallbackWithResult + 73;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = IAuthTabCallback + 93;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                }
                Unit unit = Unit.INSTANCE;
                int i8 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[PHI: r6 r9
      0x003b: PHI (r6v8 o.getWriteEnabled$onExtraCallbackWithResult) = (r6v7 o.getWriteEnabled$onExtraCallbackWithResult), (r6v10 o.getWriteEnabled$onExtraCallbackWithResult) binds: [B:12:0x0039, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:12:0x0039, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // o.onAssetDownloadCompleted
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull Trigger trigger, @NotNull String str, @NotNull access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i;
        Trigger trigger2 = trigger;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 3;
        int i4 = i3 % 128;
        asBinder = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = access13800Var instanceof onExtraCallbackWithResult;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i5 = i4 + 37;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
                i = onextracallbackwithresult.label;
                int i6 = 90 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onextracallbackwithresult.label = i - 2147483648;
                } else {
                    onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                }
            } else {
                onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
                i = onextracallbackwithresult.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object obj2 = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        try {
            if (i7 != 0) {
                int i8 = asBinder + 73;
                int i9 = i8 % 128;
                IAuthTabCallbackStub = i9;
                int i10 = i8 % 2;
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = i9 + 109;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                Trigger trigger3 = (Trigger) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj2);
                trigger2 = trigger3;
            } else {
                ResultKt.onNavigationEvent(obj2);
                long j = this.IAuthTabCallback;
                onNavigationEvent onnavigationevent = new onNavigationEvent(trigger2, str, null);
                onextracallbackwithresult.L$0 = trigger2;
                onextracallbackwithresult.L$1 = access15400.onNavigationEvent(str);
                onextracallbackwithresult.label = 1;
                Object objOnNavigationEvent = doGet.onNavigationEvent(j + 1000, onnavigationevent, onextracallbackwithresult);
                trigger2 = objOnNavigationEvent;
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i13 = IAuthTabCallbackStub + 63;
                    asBinder = i13 % 128;
                    int i14 = i13 % 2;
                    return objOnWarmupCompleted;
                }
            }
        } catch (WebResourceResponseModel unused) {
            Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("trigger_id", trigger2.onNavigationEvent()), getWrite.IAuthTabCallback("trigger_name", trigger2.onWarmupCompleted()), getWrite.IAuthTabCallback("trigger_type", this.onExtraCallback)});
            auth.onExtraCallback(auth.onNavigationEvent, "tuba trigger failed - no foreground activity: " + this, null, mapIAuthTabCallback, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
