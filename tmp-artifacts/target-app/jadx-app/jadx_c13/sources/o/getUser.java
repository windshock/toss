package o;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.state.spec.SessionState;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.websocket.util.AppLifecycleEventObserver;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;
import kotlinx.serialization.KSerializer;
import o.convertErrorbugsnag_android_core_release;
import o.getPackageType;
import o.getUser;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getUser implements getBreadcrumbs {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private final setUser IAuthTabCallback;
    private getPackageType IAuthTabCallbackDefault;
    private final getBorderRadius<convertErrorbugsnag_android_core_release> IAuthTabCallbackStub;
    private final Map<KClass<?>, String> onExtraCallback;
    private final findResAndMsg onExtraCallbackWithResult;
    private final clearFeatureFlags onNavigationEvent;
    private final convertThreadbugsnag_android_core_release onTransact;
    private final CoroutineExceptionHandler onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        static {
            int[] iArr = new int[getLastRunInfo.values().length];
            try {
                iArr[getLastRunInfo.StateChanged.ordinal()] = 1;
                int i = onExtraCallback + 47;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getLastRunInfo.ServiceRequest.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getLastRunInfo.ErrorRetry.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int i5 = onExtraCallbackWithResult + 7;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = asInterface + 75;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i4) | i2)) | (~(i4 | i3));
        int i8 = ~i2;
        int i9 = (~(i8 | i3)) | i4;
        int i10 = (~(i3 | i2)) | (~(i8 | (~i3))) | i4;
        int i11 = i2 + i4 + i + ((-737137436) * i5) + ((-1840598144) * i6);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i2) - 818937856) + (24099949 * i4) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i) + (1335885824 * i5) + ((-1946157056) * i6) + ((-1593638912) * i12);
        int i14 = (i2 * 1252406331) + 1981669868 + (i4 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i * 1252407325) + (i5 * (-1820396076)) + (i6 * 1320834432) + (i12 * (-447283200));
        int i15 = i13 + (i14 * i14 * 1511325696);
        return i15 != 1 ? i15 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public getUser(@NotNull findResAndMsg findresandmsg, @NotNull clearFeatureFlags clearfeatureflags, @NotNull convertThreadbugsnag_android_core_release convertthreadbugsnag_android_core_release) {
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(clearfeatureflags, "");
        Intrinsics.checkNotNullParameter(convertthreadbugsnag_android_core_release, "");
        this.onExtraCallbackWithResult = findresandmsg;
        this.onNavigationEvent = clearfeatureflags;
        this.onTransact = convertthreadbugsnag_android_core_release;
        this.IAuthTabCallback = new setUser();
        this.IAuthTabCallbackStub = getShine.onWarmupCompleted(0, 0, null, 7, null);
        this.onWarmupCompleted = new IAuthTabCallbackStub(CoroutineExceptionHandler.extraCallbackWithResult, this);
        this.onExtraCallback = new LinkedHashMap();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getUser getuser = (getUser) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 77;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        Map<KClass<?>, String> map = getuser.onExtraCallback;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i3 + 17;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public static final /* synthetic */ setUser IAuthTabCallback(getUser getuser) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        setUser setuser = getuser.IAuthTabCallback;
        int i5 = i2 + 73;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return setuser;
    }

    public static final /* synthetic */ void IAuthTabCallback(getUser getuser, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getuser.onExtraCallback(th);
        int i4 = access000 + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(getUser getuser, getLastRunInfo getlastruninfo) {
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getuser.onExtraCallback(getlastruninfo);
        int i4 = IAuthTabCallback_Parcel + 5;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ clearFeatureFlags onExtraCallbackWithResult(getUser getuser) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        clearFeatureFlags clearfeatureflags = getuser.onNavigationEvent;
        if (i4 == 0) {
            int i5 = 13 / 0;
        }
        int i6 = i3 + 97;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return clearfeatureflags;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getUser getuser = (getUser) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return getuser.onWarmupCompleted();
        }
        getuser.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(getUser getuser, String str, String str2) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = getuser.onNavigationEvent(str, str2);
        int i4 = IAuthTabCallback_Parcel + 109;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return strOnNavigationEvent;
    }

    public static final /* synthetic */ convertThreadbugsnag_android_core_release onNavigationEvent(getUser getuser) {
        int i = 2 % 2;
        int i2 = access000 + 123;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        convertThreadbugsnag_android_core_release convertthreadbugsnag_android_core_release = getuser.onTransact;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 81;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return convertthreadbugsnag_android_core_release;
    }

    public static final /* synthetic */ getBorderRadius onWarmupCompleted(getUser getuser) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<convertErrorbugsnag_android_core_release> getborderradius = getuser.IAuthTabCallbackStub;
        int i5 = i2 + 115;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return getborderradius;
    }

    public static final class IAuthTabCallbackStub extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getUser onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, getUser getuser) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = getuser;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (!(th instanceof CancellationException)) {
                getUser.onNavigationEvent(this.onWarmupCompleted).onExtraCallbackWithResult(getUser.onExtraCallbackWithResult(this.onWarmupCompleted), th);
                return;
            }
            int i5 = i3 + 49;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallbackWithResult<T> implements IAnimation<BugsnagEventMapper<T>> {
        private static int IAuthTabCallback = 0;
        private static int onTransact = 1;
        final /* synthetic */ KClass onExtraCallback;
        final /* synthetic */ getUser onExtraCallbackWithResult;
        final /* synthetic */ IAnimation onNavigationEvent;
        final /* synthetic */ KSerializer onWarmupCompleted;

        /* renamed from: o.getUser$onExtraCallbackWithResult$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements setRipple {
            private static int IAuthTabCallbackStub = 1;
            private static int onNavigationEvent;
            final /* synthetic */ setRipple IAuthTabCallback;
            final /* synthetic */ KSerializer onExtraCallback;
            final /* synthetic */ KClass onExtraCallbackWithResult;
            final /* synthetic */ getUser onWarmupCompleted;

            /* renamed from: o.getUser$onExtraCallbackWithResult$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends ContinuationImpl {
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass4(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 33;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass1.this.emit(null, this);
                    int i4 = onWarmupCompleted + 103;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objEmit;
                }
            }

            public AnonymousClass1(setRipple setripple, getUser getuser, KSerializer kSerializer, KClass kClass) {
                this.IAuthTabCallback = setripple;
                this.onWarmupCompleted = getuser;
                this.onExtraCallback = kSerializer;
                this.onExtraCallbackWithResult = kClass;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass4 anonymousClass4;
                BugsnagEventMapper<T> bugsnagEventMapperM31constructorimpl;
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
                String str;
                String str2;
                Map map;
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 35;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean z = access13800Var instanceof AnonymousClass4;
                    bugsnagEventMapperOnNavigationEvent.hashCode();
                    throw null;
                }
                if (!(access13800Var instanceof AnonymousClass4)) {
                    anonymousClass4 = new AnonymousClass4(access13800Var);
                } else {
                    anonymousClass4 = (AnonymousClass4) access13800Var;
                    int i4 = anonymousClass4.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        int i5 = IAuthTabCallbackStub + 19;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            anonymousClass4.label = i4 * Integer.MIN_VALUE;
                        } else {
                            anonymousClass4.label = i4 - 2147483648;
                        }
                    }
                }
                Object obj2 = anonymousClass4.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i6 = anonymousClass4.label;
                if (i6 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.IAuthTabCallback;
                    convertErrorbugsnag_android_core_release converterrorbugsnag_android_core_release = (convertErrorbugsnag_android_core_release) obj;
                    if (Intrinsics.areEqual(converterrorbugsnag_android_core_release, convertErrorbugsnag_android_core_release.onExtraCallbackWithResult.IAuthTabCallback) || (converterrorbugsnag_android_core_release instanceof convertErrorbugsnag_android_core_release.onExtraCallback) || (converterrorbugsnag_android_core_release instanceof convertErrorbugsnag_android_core_release.onNavigationEvent)) {
                        bugsnagEventMapperOnNavigationEvent = getUser.IAuthTabCallback(this.onWarmupCompleted).onNavigationEvent(this.onExtraCallback, converterrorbugsnag_android_core_release);
                    } else {
                        int i7 = IAuthTabCallbackStub + 113;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        if (!(converterrorbugsnag_android_core_release instanceof convertErrorbugsnag_android_core_release.IAuthTabCallback)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        convertErrorbugsnag_android_core_release.IAuthTabCallback iAuthTabCallback = (convertErrorbugsnag_android_core_release.IAuthTabCallback) converterrorbugsnag_android_core_release;
                        if (iAuthTabCallback.onWarmupCompleted().onExtraCallbackWithResult() != null && iAuthTabCallback.onWarmupCompleted().onWarmupCompleted() != null) {
                            if (Intrinsics.areEqual((String) ((Map) getUser.onWarmupCompleted(ACPayResult.onWarmupCompleted(), 351831193, new Object[]{this.onWarmupCompleted}, ACPayResult.onWarmupCompleted(), -351831191, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted())).get(this.onExtraCallbackWithResult), getUser.onNavigationEvent(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted().onExtraCallbackWithResult(), iAuthTabCallback.onWarmupCompleted().onWarmupCompleted()))) {
                                getUser getuser = this.onWarmupCompleted;
                                try {
                                    Result.Companion companion = Result.Companion;
                                    Object objM31constructorimpl = Result.m31constructorimpl(getUser.IAuthTabCallback(getuser).onNavigationEvent(this.onExtraCallback, converterrorbugsnag_android_core_release));
                                    int i9 = onNavigationEvent + 69;
                                    IAuthTabCallbackStub = i9 % 128;
                                    int i10 = i9 % 2;
                                    bugsnagEventMapperM31constructorimpl = objM31constructorimpl;
                                } catch (Throwable th) {
                                    Result.Companion companion2 = Result.Companion;
                                    bugsnagEventMapperM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
                                }
                                Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(bugsnagEventMapperM31constructorimpl);
                                if (thM32exceptionOrNullimpl != null) {
                                    int i11 = IAuthTabCallbackStub + 25;
                                    onNavigationEvent = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        str = "TossWebSocketImpl";
                                        str2 = "fail to map message for collector";
                                        map = null;
                                        i = 1;
                                    } else {
                                        convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                        str = "TossWebSocketImpl";
                                        str2 = "fail to map message for collector";
                                        map = null;
                                        i = 8;
                                    }
                                    ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, str, str2, thM32exceptionOrNullimpl, map, i, (Object) null);
                                }
                                bugsnagEventMapperOnNavigationEvent = Result.onExtraCallback(bugsnagEventMapperM31constructorimpl) ? null : bugsnagEventMapperM31constructorimpl;
                            }
                        }
                    }
                    if (bugsnagEventMapperOnNavigationEvent != null) {
                        anonymousClass4.L$0 = access15400.onNavigationEvent(obj);
                        anonymousClass4.L$1 = access15400.onNavigationEvent(anonymousClass4);
                        anonymousClass4.L$2 = access15400.onNavigationEvent(obj);
                        anonymousClass4.L$3 = access15400.onNavigationEvent(setripple);
                        anonymousClass4.L$4 = access15400.onNavigationEvent(bugsnagEventMapperOnNavigationEvent);
                        anonymousClass4.I$0 = 0;
                        anonymousClass4.label = 1;
                        if (setripple.emit(bugsnagEventMapperOnNavigationEvent, anonymousClass4) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public onExtraCallbackWithResult(IAnimation iAnimation, getUser getuser, KSerializer kSerializer, KClass kClass) {
            this.onNavigationEvent = iAnimation;
            this.onExtraCallbackWithResult = getuser;
            this.onWarmupCompleted = kSerializer;
            this.onExtraCallback = kClass;
        }

        @Override // o.IAnimation
        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onNavigationEvent.collect(new AnonymousClass1(setripple, this.onExtraCallbackWithResult, this.onWarmupCompleted, this.onExtraCallback), access13800Var);
            if (objCollect == access14100.onExtraCallback()) {
                int i2 = IAuthTabCallback + 101;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return objCollect;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 119;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    @Override // o.getBreadcrumbs
    public void onExtraCallback() {
        int i = 2 % 2;
        onLoadStarted.onExtraCallback(this.onExtraCallbackWithResult, null, null, new onWarmupCompleted(this, (access13800) null), 3, null);
        int i2 = access000 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.getBreadcrumbs
    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(getLastRunInfo.ServiceRequest);
            int i3 = 89 / 0;
        } else {
            onExtraCallback(getLastRunInfo.ServiceRequest);
        }
        int i4 = access000 + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getBreadcrumbs
    public <T> Object onNavigationEvent(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer, @NotNull setRipple<? super BugsnagEventMapper<T>> setripple, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        if (!((Boolean) onWarmupCompleted(ACPayResult.onWarmupCompleted(), -735207784, new Object[]{this, kClass}, iOnWarmupCompleted, 735207784, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted())).booleanValue()) {
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback_Parcel + 93;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        Object objCollect = new onExtraCallbackWithResult(this.IAuthTabCallbackStub, this, kSerializer, kClass).collect(setripple, access13800Var);
        if (objCollect != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i6 = IAuthTabCallback_Parcel + 105;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return objCollect;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getUser getuser = (getUser) objArr[0];
        KClass<?> kClass = (KClass) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 11;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (getuser.onExtraCallback.containsKey(kClass)) {
            int i4 = access000 + 89;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        try {
            clearMetadata clearmetadata = (clearMetadata) clearRegisters.onNavigationEvent(kClass).getAnnotation(clearMetadata.class);
            if (clearmetadata == null) {
                throw new removeOnError(clearRegisters.onNavigationEvent(kClass).getName());
            }
            getuser.onExtraCallback.put(kClass, getuser.onNavigationEvent(clearmetadata.onWarmupCompleted(), clearmetadata.onNavigationEvent()));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final String onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        String str3 = str + ":" + str2;
        int i2 = access000 + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return str3;
    }

    public static final class asInterface extends SuspendLambda implements Function2<ok<? super Boolean>, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(AppLifecycleEventObserver appLifecycleEventObserver) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(appLifecycleEventObserver);
            }
            IAuthTabCallback(appLifecycleEventObserver);
            throw null;
        }

        public final Object IAuthTabCallback(ok<? super Boolean> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterface = (asInterface) create(okVar, access13800Var);
            if (i3 != 0) {
                return asinterface.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 13 / 0;
            return asinterface.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(access13800Var);
            asinterface.L$0 = obj;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return asinterface;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(ok<? super Boolean> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(okVar, access13800Var);
            int i4 = IAuthTabCallback + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public static final class onNavigationEvent implements AppLifecycleEventObserver.onExtraCallbackWithResult {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ ok<Boolean> onExtraCallback;

            /* JADX WARN: Multi-variable type inference failed */
            onNavigationEvent(ok<? super Boolean> okVar) {
                this.onExtraCallback = okVar;
            }

            @Override // im.toss.websocket.util.AppLifecycleEventObserver.onExtraCallbackWithResult
            public void onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                this.onExtraCallback.IAuthTabCallback(Boolean.TRUE);
                int i4 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        }

        private static final Unit IAuthTabCallback(AppLifecycleEventObserver appLifecycleEventObserver) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().onExtraCallbackWithResult(appLifecycleEventObserver);
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().onExtraCallbackWithResult(appLifecycleEventObserver);
            Unit unit2 = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14100.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            ok okVar = (ok) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                final AppLifecycleEventObserver appLifecycleEventObserver = new AppLifecycleEventObserver(new onNavigationEvent(okVar));
                TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().IAuthTabCallback(appLifecycleEventObserver);
                Function0 function0 = new Function0() { // from class: im.toss.websocket.TossWebSocketImpl$observeStates$foregroundStateFlow$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 113;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnExtraCallbackWithResult = getUser.asInterface.onExtraCallbackWithResult(appLifecycleEventObserver);
                        int i7 = onExtraCallback + 27;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                this.L$0 = access15400.onNavigationEvent(okVar);
                this.L$1 = access15400.onNavigationEvent(appLifecycleEventObserver);
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, function0, this) == objOnExtraCallback) {
                    int i4 = IAuthTabCallback + 59;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnExtraCallback;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 13;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                int i7 = IAuthTabCallback + 81;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    static final class asBinder extends SuspendLambda implements setTaggedAddrCtrl<Boolean, SessionState.State, Boolean, access13800<? super Boolean>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(4, access13800Var);
        }

        @Override // o.setTaggedAddrCtrl
        public /* synthetic */ Object invoke(Boolean bool, SessionState.State state, Boolean bool2, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(bool.booleanValue(), state, bool2, access13800Var);
            int i4 = onExtraCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(boolean z, SessionState.State state, Boolean bool, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(access13800Var);
            asbinder.Z$0 = z;
            asbinder.L$0 = state;
            asbinder.L$1 = bool;
            Object objInvokeSuspend = asbinder.invokeSuspend(Unit.INSTANCE);
            int i2 = onExtraCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            boolean z = this.Z$0;
            SessionState.State state = (SessionState.State) this.L$0;
            Boolean bool = (Boolean) this.L$1;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 43;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            boolean z2 = true;
            if (!(!z) && !(!Intrinsics.areEqual(state, SessionState.State.LoginSession.onExtraCallbackWithResult))) {
                int i7 = onExtraCallbackWithResult + 23;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                if (!bool.booleanValue()) {
                    int i9 = onExtraCallbackWithResult + 113;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    z2 = false;
                }
            }
            return access14000.onNavigationEvent(z2);
        }
    }

    private final IAnimation<Boolean> onWarmupCompleted() {
        int i = 2 % 2;
        IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(new asInterface(null));
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = SessionState.Companion.onExtraCallback().onExtraCallbackWithResult(true).onWarmupCompleted(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        IAnimation iAnimationOnWarmupCompleted = ReactiveFlowKt.onWarmupCompleted(jsonReaderUnknownNumberParsingOnWarmupCompleted);
        Object[] objArr = {onTextViewSizeChanged.onExtraCallbackWithResult, false, 1, null};
        getByteBuffer getbytebufferOnExtraCallbackWithResult = ((getByteBuffer) onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 773290631, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -773290631)).onExtraCallbackWithResult(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
        IAnimation<Boolean> iAnimationOnNavigationEvent2 = ycxycx.onNavigationEvent(ycxycx.onExtraCallbackWithResult(iAnimationOnNavigationEvent, iAnimationOnWarmupCompleted, RxConvertKt.IAuthTabCallback(getbytebufferOnExtraCallbackWithResult), new asBinder(null)));
        int i2 = access000 + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return iAnimationOnNavigationEvent2;
        }
        throw null;
    }

    private final void onExtraCallback(getLastRunInfo getlastruninfo) {
        boolean z;
        int i = 2 % 2;
        Object[] objArr = {this.onNavigationEvent};
        if (((Boolean) clearFeatureFlags.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, 2116677382, -2116677381, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).booleanValue()) {
            if (getlastruninfo != getLastRunInfo.ServiceRequest) {
                return;
            } else {
                this.onNavigationEvent.IAuthTabCallback((String) null);
            }
        }
        int i2 = IAuthTabCallback.IAuthTabCallback[getlastruninfo.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.onNavigationEvent.onExtraCallback();
            int i3 = access000 + 19;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 3;
            }
            z = true;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        getPackageType getpackagetype = this.IAuthTabCallbackDefault;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
            int i5 = access000 + 35;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
        this.IAuthTabCallbackDefault = onLoadStarted.onExtraCallback(this.onExtraCallbackWithResult, this.onWarmupCompleted.plus(putChannelInfo.IAuthTabCallback()), null, new onExtraCallback(z, null), 2, null);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ boolean $isNormalState;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$isNormalState = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = getUser.this.new onExtraCallback(this.$isNormalState, access13800Var);
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            }
            onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        static final class onWarmupCompleted<T> implements setRipple {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ getUser onWarmupCompleted;

            onWarmupCompleted(getUser getuser) {
                this.onWarmupCompleted = getuser;
            }

            @Override // o.setRipple
            public /* synthetic */ Object emit(Object obj, access13800 access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((convertErrorbugsnag_android_core_release) obj, access13800Var);
                if (i3 != 0) {
                    int i4 = 6 / 0;
                }
                int i5 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return objOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final Object onExtraCallbackWithResult(convertErrorbugsnag_android_core_release converterrorbugsnag_android_core_release, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objEmit = getUser.onWarmupCompleted(this.onWarmupCompleted).emit(converterrorbugsnag_android_core_release, access13800Var);
                if (objEmit != access14100.onExtraCallback()) {
                    Unit unit = Unit.INSTANCE;
                    int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }
                int i6 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return objEmit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM31constructorimpl;
            Throwable thM32exceptionOrNullimpl;
            getUser getuser;
            access13800 access13800Var;
            int i;
            int i2 = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            int i4 = 0;
            try {
            } catch (WebResourceResponseModel e) {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                getuser = getUser.this;
                boolean z = this.$isNormalState;
                Result.Companion companion3 = Result.Companion;
                clearFeatureFlags clearfeatureflagsOnExtraCallbackWithResult = getUser.onExtraCallbackWithResult(getuser);
                this.L$0 = getuser;
                this.L$1 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = clearfeatureflagsOnExtraCallbackWithResult.onNavigationEvent(!z, this);
                if (obj != objOnExtraCallback) {
                    access13800Var = this;
                    i = 0;
                }
                return objOnExtraCallback;
            }
            int i5 = IAuthTabCallback + 21;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            if (i5 % 2 != 0 ? i3 != 1 : i3 != 1) {
                int i7 = i6 + 111;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = i6 + 17;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i10 = 61 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                getUser getuser2 = getUser.this;
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                    getUser.IAuthTabCallback(getuser2, thM32exceptionOrNullimpl);
                    int i11 = onExtraCallbackWithResult + 23;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                }
                return Unit.INSTANCE;
            }
            int i13 = this.I$1;
            int i14 = this.I$0;
            access13800Var = (access13800) this.L$1;
            getuser = (getUser) this.L$0;
            ResultKt.onNavigationEvent(obj);
            i4 = i14;
            i = i13;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(getuser);
            this.L$0 = access15400.onNavigationEvent(access13800Var);
            this.L$1 = null;
            this.I$0 = i4;
            this.I$1 = i;
            this.label = 2;
            if (((IAnimation) obj).collect(onwarmupcompleted, this) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
            objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            getUser getuser22 = getUser.this;
            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ void IAuthTabCallback(getUser getuser, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = access000 + 51;
            int i4 = i3 % 128;
            IAuthTabCallback_Parcel = i4;
            if (i3 % 2 != 0) {
                int i5 = 27 / 0;
            }
            int i6 = i4 + 23;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        getuser.onExtraCallback(str);
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.IAuthTabCallback(str);
            obj.hashCode();
            throw null;
        }
        this.onNavigationEvent.IAuthTabCallback(str);
        int i3 = access000 + 115;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(Throwable th) {
        int i = 2 % 2;
        Object obj = null;
        if (!(th instanceof CancellationException)) {
            int i2 = IAuthTabCallback_Parcel + 7;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(th.getMessage());
            } else {
                onExtraCallback(th.getMessage());
                throw null;
            }
        }
        if (!(th instanceof startSession)) {
            onExtraCallback(getLastRunInfo.ErrorRetry);
            int i3 = access000 + 1;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = access000 + 89;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            this.onTransact.onExtraCallbackWithResult(this.onNavigationEvent, th);
        } else {
            this.onTransact.onExtraCallbackWithResult(this.onNavigationEvent, th);
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.getBreadcrumbs
    public markLaunchCompleted IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.onNavigationEvent};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (((Boolean) clearFeatureFlags.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, 2116677382, -2116677381, iOnNavigationEvent2)).booleanValue()) {
            int i4 = IAuthTabCallback_Parcel + 1;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return markLaunchCompleted.Connected;
        }
        markLaunchCompleted marklaunchcompleted = markLaunchCompleted.Disconnected;
        int i6 = IAuthTabCallback_Parcel + 75;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return marklaunchcompleted;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static final /* synthetic */ Map onExtraCallback(getUser getuser) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        return (Map) onWarmupCompleted(ACPayResult.onWarmupCompleted(), 351831193, new Object[]{getuser}, iOnWarmupCompleted, -351831191, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    public static final /* synthetic */ IAnimation IAuthTabCallbackStub(getUser getuser) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        return (IAnimation) onWarmupCompleted(ACPayResult.onWarmupCompleted(), -1582480053, new Object[]{getuser}, iOnWarmupCompleted, 1582480054, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }

    private final <T> boolean IAuthTabCallback(KClass<T> kClass) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(ACPayResult.onWarmupCompleted(), -735207784, new Object[]{this, kClass}, iOnWarmupCompleted, 735207784, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted())).booleanValue();
    }
}
