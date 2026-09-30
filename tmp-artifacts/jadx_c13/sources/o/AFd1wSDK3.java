package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AFd1wSDK1;
import o.r8lambdaXUV0XaeUaBOk291HT96CH0q4Y0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFd1wSDK3 implements AFd1wSDKExternalSyntheticLambda1 {
    private static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int onTransact;
    private final AFd1wSDK onExtraCallback;
    private final AppSetIdAndScope1 onExtraCallbackWithResult;
    private final r8lambdaXUV0XaeUaBOk291HT96CH0q4Y0 onNavigationEvent;
    private final r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            AFd1wSDK3 aFd1wSDK3 = AFd1wSDK3.this;
            if (i3 == 0) {
                return AFd1wSDK3.onExtraCallbackWithResult(aFd1wSDK3, null, this);
            }
            AFd1wSDK3.onExtraCallbackWithResult(aFd1wSDK3, null, this);
            throw null;
        }
    }

    static {
        int i = asBinder + 9;
        onTransact = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }

    public AFd1wSDK3(@NotNull AFd1wSDK aFd1wSDK, @NotNull r8lambdaXUV0XaeUaBOk291HT96CH0q4Y0 r8lambdaxuv0xaeuabok291ht96ch0q4y0, @NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(r8lambdaxuv0xaeuabok291ht96ch0q4y0, "");
        Intrinsics.checkNotNullParameter(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, "");
        this.onExtraCallback = aFd1wSDK;
        this.onNavigationEvent = r8lambdaxuv0xaeuabok291ht96ch0q4y0;
        this.onWarmupCompleted = r8lambdavvxsp2uzrjb9nt4ewemuyygvi;
        this.onExtraCallbackWithResult = ea10.onExtraCallbackWithResult(Reflection.getOrCreateKotlinClass(AFd1wSDK3.class).getSimpleName());
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(AFd1wSDK3 aFd1wSDK3, List list, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = aFd1wSDK3.onWarmupCompleted(list, access13800Var);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallbackWithResult(AFd1wSDK3 aFd1wSDK3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = aFd1wSDK3.onExtraCallbackWithResult;
        int i5 = i3 + 99;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return appSetIdAndScope1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AFd1wSDKExternalSyntheticLambda1
    public void onExtraCallback(@NotNull List<AFd1wSDK1> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        onLoadStarted.onExtraCallback(this.onWarmupCompleted.IAuthTabCallback(), null, null, new onWarmupCompleted(list, null), 3, null);
        int i2 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List<AFd1wSDK1> $stamps;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(List<AFd1wSDK1> list, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$stamps = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = AFd1wSDK3.this.new onWarmupCompleted(this.$stamps, access13800Var);
            int i2 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            Object obj2 = null;
            try {
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 79;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    AFd1wSDK3 aFd1wSDK3 = AFd1wSDK3.this;
                    List<AFd1wSDK1> list = this.$stamps;
                    this.label = 1;
                    if (AFd1wSDK3.onExtraCallbackWithResult(aFd1wSDK3, list, this) == objOnExtraCallback) {
                        int i7 = onExtraCallbackWithResult + 35;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 != 0) {
                            return objOnExtraCallback;
                        }
                        throw null;
                    }
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
                AFd1wSDK3.onExtraCallbackWithResult(AFd1wSDK3.this);
                AFd1wSDK1 aFd1wSDK1 = (AFd1wSDK1) CollectionsKt___CollectionsKt.firstOrNull((List) this.$stamps);
                if (aFd1wSDK1 != null) {
                    int i8 = onExtraCallbackWithResult + 57;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    AFd1wSDK1.onWarmupCompleted onwarmupcompletedIAuthTabCallback = aFd1wSDK1.IAuthTabCallback();
                    if (onwarmupcompletedIAuthTabCallback != null) {
                        onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult();
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            int i10 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(List<AFd1wSDK1> list, access13800<? super Unit> access13800Var) {
        onExtraCallback onextracallback;
        Object obj;
        List<AFd1wSDK1> list2;
        r8lambdaXUV0XaeUaBOk291HT96CH0q4Y0.onNavigationEvent onnavigationevent;
        r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks r8lambdan2uusxctu9sq10xffiic0tk0ks;
        AFd1wSDK1.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        List<AFd1wSDK1> list3 = list;
        int i = 2 % 2;
        if (!(access13800Var instanceof onExtraCallback)) {
            onextracallback = new onExtraCallback(access13800Var);
        } else {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i2 - 2147483648;
            }
        }
        Object objOnExtraCallback = onextracallback.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i3 = onextracallback.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            r8lambdaXUV0XaeUaBOk291HT96CH0q4Y0 r8lambdaxuv0xaeuabok291ht96ch0q4y0 = this.onNavigationEvent;
            onextracallback.L$0 = list3;
            onextracallback.label = 1;
            objOnExtraCallback = r8lambdaxuv0xaeuabok291ht96ch0q4y0.onExtraCallback(list3, onextracallback);
            if (objOnExtraCallback == objOnExtraCallback2) {
                return objOnExtraCallback2;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    return Unit.INSTANCE;
                }
                onnavigationevent = (r8lambdaXUV0XaeUaBOk291HT96CH0q4Y0.onNavigationEvent) onextracallback.L$1;
                List<AFd1wSDK1> list4 = (List) onextracallback.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
                list2 = list4;
                obj = objOnExtraCallback2;
                r8lambdan2uusxctu9sq10xffiic0tk0ks = (r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks) objOnExtraCallback;
                if (r8lambdan2uusxctu9sq10xffiic0tk0ks.onWarmupCompleted().isEmpty()) {
                    r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi = this.onWarmupCompleted;
                    onextracallback.L$0 = access15400.onNavigationEvent(list2);
                    onextracallback.L$1 = access15400.onNavigationEvent(onnavigationevent);
                    onextracallback.L$2 = access15400.onNavigationEvent(r8lambdan2uusxctu9sq10xffiic0tk0ks);
                    onextracallback.label = 3;
                    if (r8lambdavvxsp2uzrjb9nt4ewemuyygvi.onNavigationEvent(r8lambdan2uusxctu9sq10xffiic0tk0ks, onextracallback) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                }
                int i4 = IAuthTabCallbackStub + 33;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                AFd1wSDK1 aFd1wSDK1 = (AFd1wSDK1) CollectionsKt___CollectionsKt.firstOrNull((List) list2);
                if (aFd1wSDK1 != null && (onwarmupcompletedIAuthTabCallback = aFd1wSDK1.IAuthTabCallback()) != null) {
                    onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult();
                }
                Object obj2 = r8lambdan2uusxctu9sq10xffiic0tk0ks.onExtraCallbackWithResult().get("droppedNegativeMetricCount");
                Object obj3 = r8lambdan2uusxctu9sq10xffiic0tk0ks.onExtraCallbackWithResult().get("droppedInvalidTimestampMetricCount");
                Objects.toString(obj2);
                Objects.toString(obj3);
                return Unit.INSTANCE;
            }
            list3 = (List) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        r8lambdaXUV0XaeUaBOk291HT96CH0q4Y0.onNavigationEvent onnavigationevent2 = (r8lambdaXUV0XaeUaBOk291HT96CH0q4Y0.onNavigationEvent) objOnExtraCallback;
        if (onnavigationevent2 == null) {
            return Unit.INSTANCE;
        }
        AFd1wSDK aFd1wSDK = this.onExtraCallback;
        List<AFd1wSDK1> list5 = list3;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
        Iterator<T> it = list5.iterator();
        while (it.hasNext()) {
            int i6 = IAuthTabCallbackStub + 47;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            arrayList.add(((AFd1wSDK1) it.next()).IAuthTabCallback());
        }
        long jIAuthTabCallback = onnavigationevent2.IAuthTabCallback();
        long jOnExtraCallback = onnavigationevent2.onExtraCallback();
        long jOnWarmupCompleted = onnavigationevent2.onWarmupCompleted();
        Map mapOnNavigationEvent = onnavigationevent2.onNavigationEvent();
        onextracallback.L$0 = list3;
        onextracallback.L$1 = access15400.onNavigationEvent(onnavigationevent2);
        onextracallback.label = 2;
        obj = objOnExtraCallback2;
        Object objIAuthTabCallback = aFd1wSDK.IAuthTabCallback(arrayList, jIAuthTabCallback, jOnExtraCallback, jOnWarmupCompleted, mapOnNavigationEvent, onextracallback);
        if (objIAuthTabCallback == obj) {
            return obj;
        }
        list2 = list3;
        onnavigationevent = onnavigationevent2;
        objOnExtraCallback = objIAuthTabCallback;
        r8lambdan2uusxctu9sq10xffiic0tk0ks = (r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks) objOnExtraCallback;
        if (r8lambdan2uusxctu9sq10xffiic0tk0ks.onWarmupCompleted().isEmpty()) {
        }
    }

    static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
