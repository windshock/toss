package im.toss;

import dagger.Lazy;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findRes;
import o.findResAndMsg;
import o.getPackageType;
import o.isNeedUnzip;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import o.setRipple;
import o.setRubIn;
import o.setTextProgressColor;
import o.setWrite;
import o.zzag;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class TossApplication$IEngagementSignalsCallback_Parcel extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    int label;
    final /* synthetic */ TossApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TossApplication$IEngagementSignalsCallback_Parcel(TossApplication tossApplication, access13800<? super TossApplication$IEngagementSignalsCallback_Parcel> access13800Var) {
        super(1, access13800Var);
        this.this$0 = tossApplication;
    }

    public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(access13800<?> access13800Var) {
        int i = 2 % 2;
        TossApplication$IEngagementSignalsCallback_Parcel tossApplication$IEngagementSignalsCallback_Parcel = new TossApplication$IEngagementSignalsCallback_Parcel(this.this$0, access13800Var);
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return tossApplication$IEngagementSignalsCallback_Parcel;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
        int i4 = IAuthTabCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null))), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return unit;
    }

    /* renamed from: im.toss.TossApplication$IEngagementSignalsCallback_Parcel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;
        final /* synthetic */ TossApplication this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TossApplication tossApplication, access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
            this.this$0 = tossApplication;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws setWrite {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws setWrite {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 55 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r1
          0x003b: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws setWrite {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 15 / 0;
                if (i != 0) {
                    int i5 = onExtraCallback + 3;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    setRubIn setrubinIAuthTabCallback = ((zzag) this.this$0.prefetchWithMultipleUrls().get()).IAuthTabCallback();
                    final TossApplication tossApplication = this.this$0;
                    setRipple setripple = new setRipple() { // from class: im.toss.TossApplication.IEngagementSignalsCallback_Parcel.1.5
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 15;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            Object objOnWarmupCompleted2 = onWarmupCompleted((Long) obj2, access13800Var);
                            int i10 = onWarmupCompleted + 71;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            return objOnWarmupCompleted2;
                        }

                        public final Object onWarmupCompleted(Long l, access13800<? super Unit> access13800Var) {
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 103;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            Object objOnExtraCallback = ((setTextProgressColor) ((Lazy) TossApplication.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{tossApplication}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1734275450, -1734275428)).get()).onExtraCallback(access13800Var);
                            Object obj2 = null;
                            if (objOnExtraCallback == access14300.onWarmupCompleted()) {
                                int i10 = onNavigationEvent + 43;
                                onWarmupCompleted = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return objOnExtraCallback;
                                }
                                throw null;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i11 = onNavigationEvent + 71;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 != 0) {
                                return unit;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    this.label = 1;
                    if (setrubinIAuthTabCallback.collect(setripple, this) == objOnWarmupCompleted) {
                        int i7 = onExtraCallbackWithResult + 103;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            throw new setWrite();
        }
    }
}
