package o;

import im.toss.features.tosscert.ui.R;
import im.toss.state.spec.SessionState;
import im.toss.tracker.SdkConsentServerSync$;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1mSDKExternalSyntheticLambda1 {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private final AFj1mSDKExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private final SessionState IAuthTabCallbackStub;
    private final getBillingPeriod IAuthTabCallback_Parcel;
    private final Object asBinder;
    private final onFirstFrameRendered asInterface;
    private final AtomicBoolean onExtraCallback;
    private final findResAndMsg onExtraCallbackWithResult;
    private final initLayout onNavigationEvent;
    private final jni_YGNodeStyleGetFlexBasisJNI onTransact;
    private getPackageType onWarmupCompleted;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {AFj1mSDKExternalSyntheticLambda1.this, 0L, this};
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            return i3 != 0 ? AFj1mSDKExternalSyntheticLambda1.onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback2, R.drawable.IAuthTabCallback(), -1214826537, iIAuthTabCallback, 1214826539, objArr) : AFj1mSDKExternalSyntheticLambda1.onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback2, R.drawable.IAuthTabCallback(), -1214826537, iIAuthTabCallback, 1214826539, objArr);
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AFj1mSDKExternalSyntheticLambda1.onWarmupCompleted(AFj1mSDKExternalSyntheticLambda1.this, null, 0L, this);
        }
    }

    static {
        int i = access100 + 41;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~i5;
        int i11 = (~(i7 | i10)) | (~(i8 | i6 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = i6 + i4 + i2 + ((-1255669517) * i) + (533247121 * i3);
        int i14 = i13 * i13;
        int i15 = ((i6 * (-1895547823)) - 858849280) + ((-1895547823) * i4) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i2) + (760610816 * i) + ((-1057882112) * i3) + (1344208896 * i14);
        int i16 = ((i6 * (-122328301)) - 2132886715) + (i4 * (-122328301)) + (i9 * Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000) + (i11 * Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000) + (i12 * Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000) + (i2 * (-122328029)) + (i * (-1196579527)) + (i3 * 656595923) + (i14 * 138215424);
        int i17 = i15 + (i16 * i16 * (-833028096));
        return i17 != 1 ? i17 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(AFj1mSDKExternalSyntheticLambda1 aFj1mSDKExternalSyntheticLambda1, SessionState.State state) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(aFj1mSDKExternalSyntheticLambda1, state);
        int i4 = access000 + 105;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {th};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback4, 1779899673, iIAuthTabCallback, -1779899672, objArr);
        int i4 = getInterfaceDescriptor + 51;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = access000 + 113;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public AFj1mSDKExternalSyntheticLambda1(@NotNull initLayout initlayout, @NotNull AFj1mSDKExternalSyntheticLambda0 aFj1mSDKExternalSyntheticLambda0, @NotNull getBillingPeriod getbillingperiod, @NotNull SessionState sessionState, @NotNull onFirstFrameRendered onfirstframerendered, @NotNull GeckoHubImp geckoHubImp) {
        Intrinsics.checkNotNullParameter(initlayout, "");
        Intrinsics.checkNotNullParameter(aFj1mSDKExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        Intrinsics.checkNotNullParameter(onfirstframerendered, "");
        Intrinsics.checkNotNullParameter(geckoHubImp, "");
        this.onNavigationEvent = initlayout;
        this.IAuthTabCallbackDefault = aFj1mSDKExternalSyntheticLambda0;
        this.IAuthTabCallback_Parcel = getbillingperiod;
        this.IAuthTabCallbackStub = sessionState;
        this.asInterface = onfirstframerendered;
        this.onExtraCallback = new AtomicBoolean(false);
        this.onExtraCallbackWithResult = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult(null, 1, null).plus(geckoHubImp));
        this.onTransact = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, null);
        this.asBinder = new Object();
    }

    public static final /* synthetic */ void IAuthTabCallback(AFj1mSDKExternalSyntheticLambda1 aFj1mSDKExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1079983366, iIAuthTabCallback, -1079983366, new Object[]{aFj1mSDKExternalSyntheticLambda1});
        int i4 = getInterfaceDescriptor + 5;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ onFirstFrameRendered onNavigationEvent(AFj1mSDKExternalSyntheticLambda1 aFj1mSDKExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        onFirstFrameRendered onfirstframerendered = aFj1mSDKExternalSyntheticLambda1.asInterface;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 49;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return onfirstframerendered;
    }

    public static final /* synthetic */ Object onWarmupCompleted(AFj1mSDKExternalSyntheticLambda1 aFj1mSDKExternalSyntheticLambda1, onViewDraw onviewdraw, long j, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = aFj1mSDKExternalSyntheticLambda1.onNavigationEvent(onviewdraw, j, access13800Var);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = access000 + 67;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return objOnNavigationEvent;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        if (this.IAuthTabCallback_Parcel.onExtraCallbackWithResult() == getPricingPhaseList.EU) {
            int i2 = access000 + 77;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            if (this.onExtraCallback.compareAndSet(false, true)) {
                onLoadStarted.onExtraCallback(this.onExtraCallbackWithResult, null, setRandomHost.UNDISPATCHED, new onExtraCallback(this, (access13800) null), 1, null);
                this.IAuthTabCallbackStub.onExtraCallbackWithResult(true).asInterface().onWarmupCompleted((deserializeFloat) new SdkConsentServerSync$.ExternalSyntheticLambda1(new SdkConsentServerSync$.ExternalSyntheticLambda0(this)), (deserializeFloat<? super Throwable>) new SdkConsentServerSync$.ExternalSyntheticLambda3(new SdkConsentServerSync$.ExternalSyntheticLambda2()));
                int i4 = getInterfaceDescriptor + 21;
                access000 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = getInterfaceDescriptor + 83;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onWarmupCompleted(AFj1mSDKExternalSyntheticLambda1 aFj1mSDKExternalSyntheticLambda1, SessionState.State state) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            aFj1mSDKExternalSyntheticLambda1.onWarmupCompleted(state instanceof SessionState.State.LoginSession);
            return Unit.INSTANCE;
        }
        aFj1mSDKExternalSyntheticLambda1.onWarmupCompleted(state instanceof SessionState.State.LoginSession);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SdkConsentServerSync", "SDK consent session observation failed", th, (Map) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(boolean z) {
        synchronized (this.asBinder) {
            onNavigationEvent(z);
            Unit unit = Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AFj1mSDKExternalSyntheticLambda1 aFj1mSDKExternalSyntheticLambda1 = (AFj1mSDKExternalSyntheticLambda1) objArr[0];
        synchronized (aFj1mSDKExternalSyntheticLambda1.asBinder) {
            getPackageType getpackagetype = aFj1mSDKExternalSyntheticLambda1.onWarmupCompleted;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
            }
            aFj1mSDKExternalSyntheticLambda1.onWarmupCompleted = null;
            aFj1mSDKExternalSyntheticLambda1.onNavigationEvent.IAuthTabCallback();
        }
        return null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ long $validationRevision;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(long j, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$validationRevision = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = AFj1mSDKExternalSyntheticLambda1.this.new onWarmupCompleted(this.$validationRevision, access13800Var);
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onExtraCallbackWithResult + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompleted.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(unit);
            int i4 = onExtraCallback + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                AFj1mSDKExternalSyntheticLambda1 aFj1mSDKExternalSyntheticLambda1 = AFj1mSDKExternalSyntheticLambda1.this;
                long j = this.$validationRevision;
                this.label = 1;
                Object[] objArr = {aFj1mSDKExternalSyntheticLambda1, Long.valueOf(j), this};
                int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                if (AFj1mSDKExternalSyntheticLambda1.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1214826537, iIAuthTabCallback, 1214826539, objArr) == objOnExtraCallback) {
                    int i3 = onExtraCallbackWithResult + 119;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnExtraCallback;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallbackWithResult + 35;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            getPackageType getpackagetype = this.onWarmupCompleted;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
                int i3 = access000 + 97;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
            }
            this.onWarmupCompleted = z ? onLoadStarted.onExtraCallback(this.onExtraCallbackWithResult, null, null, new onWarmupCompleted(this.onNavigationEvent.IAuthTabCallback(), null), 3, null) : null;
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0178 -> B:42:0x0179). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x017c -> B:43:0x017a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        Ref.ObjectRef objectRef2;
        long j;
        Ref.ObjectRef objectRef3;
        Object objOnWarmupCompleted;
        int i3;
        int i4;
        int i5;
        int i6;
        IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        Ref.ObjectRef objectRef4;
        int i7;
        int i8;
        AFj1mSDKExternalSyntheticLambda1 aFj1mSDKExternalSyntheticLambda1 = (AFj1mSDKExternalSyntheticLambda1) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        access13800 access13800Var = (access13800) objArr[2];
        int i9 = 2 % 2;
        int i10 = getInterfaceDescriptor + 73;
        access000 = i10 % 128;
        if (i10 % 2 == 0) {
            boolean z = access13800Var instanceof IAuthTabCallbackDefault;
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i11 = iAuthTabCallbackDefault.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                int i12 = access000 + 11;
                getInterfaceDescriptor = i12 % 128;
                int i13 = i12 % 2;
                iAuthTabCallbackDefault.label = i11 - 2147483648;
            } else {
                iAuthTabCallbackDefault = aFj1mSDKExternalSyntheticLambda1.new IAuthTabCallbackDefault(access13800Var);
            }
        }
        Object obj = iAuthTabCallbackDefault.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i14 = iAuthTabCallbackDefault.label;
        if (i14 == 0) {
            ResultKt.onNavigationEvent(obj);
            objectRef = new Ref.ObjectRef();
            objectRef.element = CollectionsKt___CollectionsKt.toSet(onViewDraw.getEntries());
            i = 0;
            i2 = 3;
            if (i >= i2) {
            }
        } else {
            if (i14 == 1) {
                int i15 = iAuthTabCallbackDefault.I$4;
                int i16 = iAuthTabCallbackDefault.I$3;
                int i17 = iAuthTabCallbackDefault.I$2;
                i = iAuthTabCallbackDefault.I$1;
                int i18 = iAuthTabCallbackDefault.I$0;
                j = iAuthTabCallbackDefault.J$0;
                objectRef4 = (Ref.ObjectRef) iAuthTabCallbackDefault.L$3;
                iAuthTabCallbackDefault2 = (IAuthTabCallbackDefault) iAuthTabCallbackDefault.L$2;
                jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) iAuthTabCallbackDefault.L$1;
                objectRef = (Ref.ObjectRef) iAuthTabCallbackDefault.L$0;
                ResultKt.onNavigationEvent(obj);
                i3 = i18;
                jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
                i8 = i15;
                i7 = i16;
                i4 = i17;
                Set<? extends onViewDraw> set = (Set) objectRef.element;
                iAuthTabCallbackDefault.L$0 = objectRef;
                iAuthTabCallbackDefault.L$1 = jni_ygnodestylegetflexbasisjni;
                iAuthTabCallbackDefault.L$2 = access15400.onNavigationEvent(iAuthTabCallbackDefault2);
                iAuthTabCallbackDefault.L$3 = objectRef4;
                iAuthTabCallbackDefault.J$0 = j;
                iAuthTabCallbackDefault.I$0 = i3;
                iAuthTabCallbackDefault.I$1 = i;
                iAuthTabCallbackDefault.I$2 = i4;
                iAuthTabCallbackDefault.I$3 = i7;
                iAuthTabCallbackDefault.I$4 = i8;
                iAuthTabCallbackDefault.I$5 = 0;
                iAuthTabCallbackDefault.label = 2;
                objOnWarmupCompleted = aFj1mSDKExternalSyntheticLambda1.onWarmupCompleted(set, j, iAuthTabCallbackDefault);
                if (objOnWarmupCompleted != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i14 == 2) {
                int i19 = iAuthTabCallbackDefault.I$3;
                i4 = iAuthTabCallbackDefault.I$2;
                int i20 = iAuthTabCallbackDefault.I$1;
                int i21 = iAuthTabCallbackDefault.I$0;
                long j2 = iAuthTabCallbackDefault.J$0;
                objectRef2 = (Ref.ObjectRef) iAuthTabCallbackDefault.L$3;
                jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) iAuthTabCallbackDefault.L$1;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) iAuthTabCallbackDefault.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    i6 = i19;
                    i5 = i20;
                    objectRef3 = objectRef5;
                    objOnWarmupCompleted = obj;
                    i3 = i21;
                    j = j2;
                    ?? r8 = (Set) objOnWarmupCompleted;
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted(null);
                    objectRef2.element = r8;
                    if (((Set) objectRef3.element).isEmpty()) {
                    }
                } catch (Throwable th) {
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted(null);
                    throw th;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = iAuthTabCallbackDefault.I$1;
                int i22 = iAuthTabCallbackDefault.I$0;
                j = iAuthTabCallbackDefault.J$0;
                objectRef3 = (Ref.ObjectRef) iAuthTabCallbackDefault.L$0;
                ResultKt.onNavigationEvent(obj);
                i2 = i22;
                objectRef = objectRef3;
                i = i5 + 1;
                jLongValue = j;
                if (i >= i2) {
                    int i23 = access000 + 7;
                    getInterfaceDescriptor = i23 % 128;
                    int i24 = i23 % 2;
                    jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni3 = aFj1mSDKExternalSyntheticLambda1.onTransact;
                    iAuthTabCallbackDefault.L$0 = objectRef;
                    iAuthTabCallbackDefault.L$1 = jni_ygnodestylegetflexbasisjni3;
                    iAuthTabCallbackDefault.L$2 = access15400.onNavigationEvent(iAuthTabCallbackDefault);
                    iAuthTabCallbackDefault.L$3 = objectRef;
                    iAuthTabCallbackDefault.J$0 = jLongValue;
                    iAuthTabCallbackDefault.I$0 = i2;
                    iAuthTabCallbackDefault.I$1 = i;
                    iAuthTabCallbackDefault.I$2 = i;
                    iAuthTabCallbackDefault.I$3 = 0;
                    iAuthTabCallbackDefault.I$4 = 0;
                    iAuthTabCallbackDefault.label = 1;
                    if (jni_ygnodestylegetflexbasisjni3.IAuthTabCallback(null, iAuthTabCallbackDefault) != objOnExtraCallback) {
                        objectRef4 = objectRef;
                        j = jLongValue;
                        iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
                        i4 = i;
                        i3 = i2;
                        i7 = 0;
                        jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni3;
                        i8 = 0;
                        Set<? extends onViewDraw> set2 = (Set) objectRef.element;
                        iAuthTabCallbackDefault.L$0 = objectRef;
                        iAuthTabCallbackDefault.L$1 = jni_ygnodestylegetflexbasisjni;
                        iAuthTabCallbackDefault.L$2 = access15400.onNavigationEvent(iAuthTabCallbackDefault2);
                        iAuthTabCallbackDefault.L$3 = objectRef4;
                        iAuthTabCallbackDefault.J$0 = j;
                        iAuthTabCallbackDefault.I$0 = i3;
                        iAuthTabCallbackDefault.I$1 = i;
                        iAuthTabCallbackDefault.I$2 = i4;
                        iAuthTabCallbackDefault.I$3 = i7;
                        iAuthTabCallbackDefault.I$4 = i8;
                        iAuthTabCallbackDefault.I$5 = 0;
                        iAuthTabCallbackDefault.label = 2;
                        objOnWarmupCompleted = aFj1mSDKExternalSyntheticLambda1.onWarmupCompleted(set2, j, iAuthTabCallbackDefault);
                        if (objOnWarmupCompleted != objOnExtraCallback) {
                            int i25 = getInterfaceDescriptor + 55;
                            access000 = i25 % 128;
                            if (i25 % 2 == 0) {
                                throw null;
                            }
                            objectRef2 = objectRef4;
                            int i26 = i;
                            objectRef3 = objectRef;
                            i6 = i7;
                            i5 = i26;
                            ?? r82 = (Set) objOnWarmupCompleted;
                            jni_ygnodestylegetflexbasisjni.onWarmupCompleted(null);
                            objectRef2.element = r82;
                            if (((Set) objectRef3.element).isEmpty()) {
                                return Unit.INSTANCE;
                            }
                            if (i4 < 2) {
                                int i27 = access000 + 93;
                                getInterfaceDescriptor = i27 % 128;
                                int i28 = i27 % 2;
                                iAuthTabCallbackDefault.L$0 = objectRef3;
                                iAuthTabCallbackDefault.L$1 = null;
                                iAuthTabCallbackDefault.L$2 = null;
                                iAuthTabCallbackDefault.L$3 = null;
                                iAuthTabCallbackDefault.J$0 = j;
                                iAuthTabCallbackDefault.I$0 = i3;
                                iAuthTabCallbackDefault.I$1 = i5;
                                iAuthTabCallbackDefault.I$2 = i4;
                                iAuthTabCallbackDefault.I$3 = i6;
                                iAuthTabCallbackDefault.label = 3;
                                if (formatMsgs.onWarmupCompleted(10000L, iAuthTabCallbackDefault) != objOnExtraCallback) {
                                    i22 = i3;
                                    i2 = i22;
                                    objectRef = objectRef3;
                                    i = i5 + 1;
                                    jLongValue = j;
                                    if (i >= i2) {
                                        Unit unit = Unit.INSTANCE;
                                        int i29 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGB_YVYU;
                                        access000 = i29 % 128;
                                        int i30 = i29 % 2;
                                        return unit;
                                    }
                                }
                            } else {
                                i2 = i3;
                                objectRef = objectRef3;
                                i = i5 + 1;
                                jLongValue = j;
                                if (i >= i2) {
                                }
                            }
                        }
                    }
                    return objOnExtraCallback;
                }
            }
        }
    }

    private final Object onWarmupCompleted(Set<? extends onViewDraw> set, long j, access13800<? super Set<? extends onViewDraw>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new IAuthTabCallback(set, this, j, (access13800) null), access13800Var);
        int i2 = access000 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(onViewDraw onviewdraw, long j, access13800<? super onNavigationEvent> access13800Var) {
        onTransact ontransact;
        int i = 2 % 2;
        if (access13800Var instanceof onTransact) {
            ontransact = (onTransact) access13800Var;
            int i2 = ontransact.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = getInterfaceDescriptor + 99;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                ontransact.label = i2 - 2147483648;
                int i5 = getInterfaceDescriptor + 71;
                access000 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 % 4;
                }
            } else {
                ontransact = new onTransact(access13800Var);
                int i7 = getInterfaceDescriptor + 65;
                access000 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 5;
                }
            }
        }
        Object objOnExtraCallbackWithResult = ontransact.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i9 = ontransact.label;
        try {
            if (i9 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                AFj1mSDKExternalSyntheticLambda0 aFj1mSDKExternalSyntheticLambda0 = this.IAuthTabCallbackDefault;
                ontransact.L$0 = onviewdraw;
                ontransact.J$0 = j;
                ontransact.label = 1;
                objOnExtraCallbackWithResult = aFj1mSDKExternalSyntheticLambda0.onExtraCallbackWithResult(onviewdraw, ontransact);
                if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = ontransact.J$0;
                onviewdraw = (onViewDraw) ontransact.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            }
            r8lambdaFdmIAA_UXINhmXHoAAx2CLnc4EQ r8lambdafdmiaa_uxinhmxhoaax2clnc4eq = (r8lambdaFdmIAA_UXINhmXHoAAx2CLnc4EQ) objOnExtraCallbackWithResult;
            return this.onNavigationEvent.onNavigationEvent(onviewdraw, r8lambdafdmiaa_uxinhmxhoaax2clnc4eq.onExtraCallback(), r8lambdafdmiaa_uxinhmxhoaax2clnc4eq.onExtraCallbackWithResult(), j) ? onNavigationEvent.Applied : onNavigationEvent.Stale;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SdkConsentServerSync", "SDK consent server sync failed: " + onviewdraw.name(), th, (Map) null, 8, (Object) null);
            onNavigationEvent onnavigationevent = onNavigationEvent.Retry;
            int i10 = access000 + 115;
            getInterfaceDescriptor = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 49 / 0;
            }
            return onnavigationevent;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1779899673, iIAuthTabCallback, -1779899672, new Object[]{th});
    }

    private final void onExtraCallbackWithResult() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1079983366, iIAuthTabCallback, -1079983366, new Object[]{this});
    }

    public final Object IAuthTabCallback(long j, @NotNull access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, Long.valueOf(j), access13800Var};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1214826537, iIAuthTabCallback, 1214826539, objArr);
    }
}
