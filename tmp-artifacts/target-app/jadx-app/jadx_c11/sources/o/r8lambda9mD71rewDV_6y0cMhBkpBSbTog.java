package o;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.q4ExternalSyntheticLambda10;
import o.r8lambda9mD71rewDV_6y0cMhBkpBSbTog;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda9mD71rewDV_6y0cMhBkpBSbTog implements q4ExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 1;
    private final Function1<Integer, Unit> IAuthTabCallback;
    private final r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI IAuthTabCallbackDefault;
    private final Function1<Integer, Unit> asInterface;
    private final int onExtraCallback;
    private final AtomicInteger onNavigationEvent;
    private final nLockFileSegment<onExtraCallback> onTransact;
    private final int onWarmupCompleted;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = r8lambda9mD71rewDV_6y0cMhBkpBSbTog.onExtraCallbackWithResult(r8lambda9mD71rewDV_6y0cMhBkpBSbTog.this, null, this);
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            r8lambda9mD71rewDV_6y0cMhBkpBSbTog r8lambda9md71rewdv_6y0cmhbkpbsbtog = r8lambda9mD71rewDV_6y0cMhBkpBSbTog.this;
            if (i3 == 0) {
                return r8lambda9mD71rewDV_6y0cMhBkpBSbTog.onWarmupCompleted(r8lambda9md71rewdv_6y0cmhbkpbsbtog, null, this);
            }
            r8lambda9mD71rewDV_6y0cMhBkpBSbTog.onWarmupCompleted(r8lambda9md71rewdv_6y0cmhbkpbsbtog, null, this);
            throw null;
        }
    }

    static {
        int i = IAuthTabCallbackStubProxy + 21;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i);
        int i9 = (~(i6 | i3)) | i8;
        int i10 = (~(i3 | (~i))) | (~((~i6) | i7)) | i8;
        int i11 = i7 | i6 | i;
        int i12 = i6 + i + i2 + (1050315579 * i5) + (2086215248 * i4);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1156115713)) + 1671168000 + ((-1156115713) * i) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i2) + ((-1303117824) * i5) + (314572800 * i4) + (431423488 * i13);
        int i15 = ((i6 * (-961373039)) - 1316831794) + (i * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i2 * (-961372049)) + (i5 * 755842709) + (i4 * (-1858722640)) + (i13 * (-2040987648));
        return i14 + ((i15 * i15) * 1361641472) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(iIntValue);
        int i4 = IAuthTabCallbackStub + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambda9mD71rewDV_6y0cMhBkpBSbTog(@NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, @NotNull q3ExternalSyntheticLambda0 q3externalsyntheticlambda0, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Integer, Unit> function12) {
        Intrinsics.checkNotNullParameter(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, "");
        Intrinsics.checkNotNullParameter(q3externalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.IAuthTabCallbackDefault = r8lambdavvxsp2uzrjb9nt4ewemuyygvi;
        this.asInterface = function1;
        this.IAuthTabCallback = function12;
        this.onTransact = zb.onExtraCallbackWithResult(q3externalsyntheticlambda0.onExtraCallbackWithResult(), (CloseableUtils) null, (Function1) null, 6, (Object) null);
        this.onNavigationEvent = new AtomicInteger(0);
        this.onExtraCallback = q3externalsyntheticlambda0.onWarmupCompleted();
        this.onWarmupCompleted = q3externalsyntheticlambda0.IAuthTabCallback();
        maybeUpdateAnimatable.onNavigationEvent(r8lambdavvxsp2uzrjb9nt4ewemuyygvi.IAuthTabCallback(), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(null), 3, (Object) null);
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(r8lambda9mD71rewDV_6y0cMhBkpBSbTog r8lambda9md71rewdv_6y0cmhbkpbsbtog, List list, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            r8lambda9md71rewdv_6y0cmhbkpbsbtog.onExtraCallback(list, access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = r8lambda9md71rewdv_6y0cmhbkpbsbtog.onExtraCallback(list, access13800Var);
        int i3 = IAuthTabCallbackStub + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public static final /* synthetic */ List onNavigationEvent(r8lambda9mD71rewDV_6y0cMhBkpBSbTog r8lambda9md71rewdv_6y0cmhbkpbsbtog, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return r8lambda9md71rewdv_6y0cmhbkpbsbtog.onWarmupCompleted(onextracallback);
        }
        r8lambda9md71rewdv_6y0cmhbkpbsbtog.onWarmupCompleted(onextracallback);
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(r8lambda9mD71rewDV_6y0cMhBkpBSbTog r8lambda9md71rewdv_6y0cmhbkpbsbtog, onExtraCallback onextracallback, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = r8lambda9md71rewdv_6y0cmhbkpbsbtog.onNavigationEvent(onextracallback, (access13800<? super Unit>) access13800Var);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = IAuthTabCallbackStub + 115;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ nLockFileSegment onWarmupCompleted(r8lambda9mD71rewDV_6y0cMhBkpBSbTog r8lambda9md71rewdv_6y0cmhbkpbsbtog) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        nLockFileSegment<onExtraCallback> nlockfilesegment = r8lambda9md71rewdv_6y0cmhbkpbsbtog.onTransact;
        int i5 = i3 + 103;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return nlockfilesegment;
    }

    public /* synthetic */ r8lambda9mD71rewDV_6y0cMhBkpBSbTog(r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q3ExternalSyntheticLambda0 q3externalsyntheticlambda0, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            function12 = new Function1() { // from class: im.toss.securities.libs.performance.tracker.data.MonitoringEventDispatchQueue$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 115;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    Integer numValueOf = Integer.valueOf(((Integer) obj).intValue());
                    if (i4 == 0) {
                        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                        return (Unit) r8lambda9mD71rewDV_6y0cMhBkpBSbTog.onNavigationEvent(334079090, new Object[]{numValueOf}, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -334079089);
                    }
                    int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
                    throw null;
                }
            };
            int i2 = asBinder + 113;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q3externalsyntheticlambda0, function1, function12);
    }

    private static final Unit onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 81;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 123;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* renamed from: o.r8lambda9mD71rewDV_6y0cMhBkpBSbTog$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        int label;

        AnonymousClass4(access13800<? super AnonymousClass4> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass4 anonymousClass4 = r8lambda9mD71rewDV_6y0cMhBkpBSbTog.this.new AnonymousClass4(access13800Var);
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass4;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 87;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 43 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        
            if (o.r8lambda9mD71rewDV_6y0cMhBkpBSbTog.onExtraCallbackWithResult(r5, r6, r8) == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0099 -> B:14:0x0036). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            nUnlockFile nunlockfileWriteTypedObject;
            nUnlockFile nunlockfile;
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                nunlockfileWriteTypedObject = r8lambda9mD71rewDV_6y0cMhBkpBSbTog.onWarmupCompleted(r8lambda9mD71rewDV_6y0cMhBkpBSbTog.this).writeTypedObject();
                this.L$0 = nunlockfileWriteTypedObject;
                this.L$1 = null;
                this.label = 1;
                objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(this);
                if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                }
                return objOnWarmupCompleted2;
            }
            if (i3 != 1) {
                int i4 = onExtraCallback + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 2 : i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nunlockfile = (nUnlockFile) this.L$0;
                ResultKt.onNavigationEvent(obj);
                nunlockfileWriteTypedObject = nunlockfile;
                this.L$0 = nunlockfileWriteTypedObject;
                this.L$1 = null;
                this.label = 1;
                objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(this);
                if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                    int i5 = onExtraCallback + 13;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    nunlockfile = nunlockfileWriteTypedObject;
                    obj = objOnWarmupCompleted;
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    int i7 = onExtraCallback + 87;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    onExtraCallback onextracallback = (onExtraCallback) nunlockfile.onNavigationEvent();
                    r8lambda9mD71rewDV_6y0cMhBkpBSbTog r8lambda9md71rewdv_6y0cmhbkpbsbtog = r8lambda9mD71rewDV_6y0cMhBkpBSbTog.this;
                    List listOnNavigationEvent = r8lambda9mD71rewDV_6y0cMhBkpBSbTog.onNavigationEvent(r8lambda9md71rewdv_6y0cmhbkpbsbtog, onextracallback);
                    this.L$0 = nunlockfile;
                    this.L$1 = access15400.onNavigationEvent(onextracallback);
                    this.label = 2;
                }
                return objOnWarmupCompleted2;
            }
            nunlockfile = (nUnlockFile) this.L$0;
            ResultKt.onNavigationEvent(obj);
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    @Override // o.q4ExternalSyntheticLambda5
    public getPackageType IAuthTabCallback(@NotNull q4ExternalSyntheticLambda4 q4externalsyntheticlambda4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(q4externalsyntheticlambda4, "");
        waitForLayout waitforlayout = null;
        onExtraCallback onextracallback = new onExtraCallback(q4externalsyntheticlambda4, waitforlayout, 2, waitforlayout);
        if (lud.asInterface(this.onTransact.IAuthTabCallback(onextracallback))) {
            int i2 = asBinder + 29;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback.onExtraCallbackWithResult();
            }
            onextracallback.onExtraCallbackWithResult();
            waitforlayout.hashCode();
            throw null;
        }
        int iIncrementAndGet = this.onNavigationEvent.incrementAndGet();
        this.asInterface.invoke(Integer.valueOf(iIncrementAndGet));
        Object[] objArr = {this, Integer.valueOf(iIncrementAndGet)};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        if (((Boolean) onNavigationEvent(-1102207291, objArr, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1102207291)).booleanValue()) {
            q4externalsyntheticlambda4.onNavigationEvent(new q4ExternalSyntheticLambda10.onWarmupCompleted("queue_full", iIncrementAndGet));
        }
        onextracallback.onExtraCallbackWithResult().onWarmupCompleted();
        waitForLayout waitforlayoutOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
        int i3 = IAuthTabCallbackStub + 103;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return waitforlayoutOnExtraCallbackWithResult;
        }
        throw null;
    }

    private final List<onExtraCallback> onWarmupCompleted(onExtraCallback onextracallback) {
        onExtraCallback onextracallback2;
        int i = 2 % 2;
        if (this.onExtraCallback != 1) {
            List<onExtraCallback> listMutableListOf = CollectionsKt.mutableListOf(new onExtraCallback[]{onextracallback});
            while (listMutableListOf.size() < this.onExtraCallback && (onextracallback2 = (onExtraCallback) lud.onExtraCallbackWithResult(this.onTransact.onMinimized())) != null) {
                int i2 = asBinder + 91;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    listMutableListOf.add(onextracallback2);
                    int i3 = 17 / 0;
                } else {
                    listMutableListOf.add(onextracallback2);
                }
            }
            return listMutableListOf;
        }
        int i4 = IAuthTabCallbackStub + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return CollectionsKt.listOf(onextracallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(List<onExtraCallback> list, access13800<? super Unit> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        List<onExtraCallback> list2;
        Iterator it;
        List<onExtraCallback> list3;
        int i;
        int i2 = 2 % 2;
        if (!(access13800Var instanceof onExtraCallbackWithResult)) {
            onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
        } else {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i3 = onextracallbackwithresult.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i3 - 2147483648;
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onextracallbackwithresult.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.IAuthTabCallback.invoke(access14000.onNavigationEvent(list.size()));
            list2 = list;
            it = list2.iterator();
            list3 = list;
            i = 0;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = onextracallbackwithresult.I$0;
            it = (Iterator) onextracallbackwithresult.L$2;
            list2 = (Iterable) onextracallbackwithresult.L$1;
            list3 = (List) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(obj);
            int i5 = asBinder + 95;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 4;
            }
        }
        while (it.hasNext()) {
            int i7 = asBinder + 57;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            Object next = it.next();
            onExtraCallback onextracallback = (onExtraCallback) next;
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(list3);
            onextracallbackwithresult.L$1 = access15400.onNavigationEvent(list2);
            onextracallbackwithresult.L$2 = it;
            onextracallbackwithresult.L$3 = access15400.onNavigationEvent(next);
            onextracallbackwithresult.L$4 = access15400.onNavigationEvent(onextracallback);
            onextracallbackwithresult.I$0 = i;
            onextracallbackwithresult.I$1 = 0;
            onextracallbackwithresult.label = 1;
            if (onNavigationEvent(onextracallback, (access13800<? super Unit>) onextracallbackwithresult) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(onExtraCallback onextracallback, access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
                int i3 = asBinder + 69;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi = this.IAuthTabCallbackDefault;
                q4ExternalSyntheticLambda4 q4externalsyntheticlambda4OnExtraCallback = onextracallback.onExtraCallback();
                onnavigationevent.L$0 = onextracallback;
                onnavigationevent.label = 1;
                if (q4ExternalSyntheticLambda8.onExtraCallbackWithResult(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4externalsyntheticlambda4OnExtraCallback, false, false, onnavigationevent) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onextracallback = (onExtraCallback) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            onextracallback.onExtraCallbackWithResult().onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i6 = asBinder + 31;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 31 / 0;
            }
            return unit;
        } catch (Throwable th) {
            onextracallback.onExtraCallbackWithResult().onExtraCallback(th);
            throw th;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        r8lambda9mD71rewDV_6y0cMhBkpBSbTog r8lambda9md71rewdv_6y0cmhbkpbsbtog = (r8lambda9mD71rewDV_6y0cMhBkpBSbTog) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (iIntValue == 1 || iIntValue % r8lambda9md71rewdv_6y0cmhbkpbsbtog.onWarmupCompleted == 0) {
            int i5 = i2 + 27;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 109;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    static final class onExtraCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final waitForLayout IAuthTabCallback;
        private final q4ExternalSyntheticLambda4 onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 73;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback)) {
                int i7 = onNavigationEvent + 125;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback)) {
                int i9 = onNavigationEvent + 57;
                onWarmupCompleted = i9 % 128;
                return i9 % 2 == 0;
            }
            int i10 = onNavigationEvent + 89;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode();
            int i4 = onNavigationEvent + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "QueuedMonitoringEvent(request=" + this.onExtraCallback + ", completion=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 121;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 77 / 0;
            }
            return str;
        }

        public onExtraCallback(@NotNull q4ExternalSyntheticLambda4 q4externalsyntheticlambda4, @NotNull waitForLayout waitforlayout) {
            Intrinsics.checkNotNullParameter(q4externalsyntheticlambda4, "");
            Intrinsics.checkNotNullParameter(waitforlayout, "");
            this.onExtraCallback = q4externalsyntheticlambda4;
            this.IAuthTabCallback = waitforlayout;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(q4ExternalSyntheticLambda4 q4externalsyntheticlambda4, waitForLayout waitforlayout, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onNavigationEvent + 21;
                onWarmupCompleted = i2 % 128;
                waitforlayout = getFullPackage.onExtraCallbackWithResult((getPackageType) null, i2 % 2 == 0 ? 0 : 1, (Object) null);
                int i3 = onNavigationEvent + 85;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            }
            this(q4externalsyntheticlambda4, waitforlayout);
        }

        public final q4ExternalSyntheticLambda4 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        public final waitForLayout onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(334079090, objArr, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -334079089);
    }

    private final boolean IAuthTabCallback(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(-1102207291, objArr, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1102207291)).booleanValue();
    }
}
