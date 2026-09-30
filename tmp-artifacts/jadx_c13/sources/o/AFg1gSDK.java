package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFg1eSDK;
import o.AFg1eSDKAFa1ySDK;
import o.AFg1gSDK;
import o.InternalCameraPresenceListener;
import o.UtilsKtExternalSyntheticLambda17;
import o.ddefault;
import o.getPackageType;
import o.setUseCaseAttached;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1gSDK {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int onActivityLayout = 1;
    private static int onActivityResized = 1;
    private static int onMessageChannelReady;
    private static int onPostMessage;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackDefault;
    private final getTimebase IAuthTabCallbackStub;
    private final float IAuthTabCallbackStubProxy;
    private final findResAndMsg IAuthTabCallback_Parcel;
    private final getSupportedHighSpeedResolutions ICustomTabsCallback;
    private final getTimebase access000;
    private final getSupportedHighSpeedResolutions access100;
    private final inflateMenu asBinder;
    private final inflateMenu asInterface;
    private final toMetersPerSecond extraCallback;
    private final CameraPresenceProviderExternalSyntheticLambda6 extraCallbackWithResult;
    private final getSupportedHighSpeedResolutions getInterfaceDescriptor;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private HandlerScheduledExecutorService2 onExtraCallbackWithResult;
    private final transformAsync onMinimized;
    private final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onNavigationEvent;
    private final CameraPresenceProviderExternalSyntheticLambda6 onTransact;
    private final CameraPresenceProviderExternalSyntheticLambda6 onWarmupCompleted;
    private final getSupportedHighSpeedResolutionsFor readTypedObject;
    private final float writeTypedObject;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = AFg1gSDK.onExtraCallbackWithResult(AFg1gSDK.this, null, null, this);
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[AFg1eSDK.values().length];
            try {
                iArr[AFg1eSDK.Hidden.ordinal()] = 1;
                int i = onExtraCallback + 61;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            IAuthTabCallback = iArr;
            int i4 = onExtraCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        int i = onMessageChannelReady + 57;
        onActivityLayout = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AFg1gSDK(AFg1eSDK aFg1eSDK, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, toMetersPerSecond tometerspersecond, float f, float f2, findResAndMsg findresandmsg, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFg1eSDK, r8lambdanm9dm2eewl4vrptnjmesfjqky4, tometerspersecond, f, f2, findresandmsg);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = ~((~i6) | i9);
        int i11 = ~(i9 | i5);
        int i12 = i10 | i11;
        int i13 = (~(i6 | i7)) | i11 | i8;
        int i14 = i + i5 + i4 + ((-168536539) * i2) + (1787681333 * i3);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i) + 1460535296 + ((-923239215) * i5) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i4) + (1604583424 * i2) + (216268800 * i3) + (1778253824 * i15);
        int i17 = (i * (-925914073)) + 175428941 + (i5 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i4 * (-925913209)) + (i2 * 1252505731) + (i3 * 30625011) + (i15 * (-2030960640));
        switch (i16 + (i17 * i17 * 899809280)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            default:
                AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
                int i18 = 2 % 2;
                int i19 = onActivityResized + 5;
                onPostMessage = i19 % 128;
                int i20 = i19 % 2;
                int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.round(aFg1gSDK.IAuthTabCallbackDefault() - (aFg1gSDK.onNavigationEvent.onExtraCallbackWithResult(aFg1gSDK.writeTypedObject) << 1)), 0);
                int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                long jIAuthTabCallback = r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iCoerceAtLeast, 0, RangesKt___RangesKt.coerceAtLeast(Math.round(((AFg1eSDKAFa1ySDK) IAuthTabCallback(-1572111621, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1572111625, new Object[]{aFg1gSDK}, iOnExtraCallbackWithResult)).onExtraCallback(AFg1eSDK.Expanded)), 0), 5, (Object) null);
                int i21 = onPostMessage + 57;
                onActivityResized = i21 % 128;
                int i22 = i21 % 2;
                return Long.valueOf(jIAuthTabCallback);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(AFg1gSDK aFg1gSDK, int i, ddefault ddefaultVar) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 113;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(aFg1gSDK, i, ddefaultVar);
        }
        onExtraCallback(aFg1gSDK, i, ddefaultVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AFg1eSDKAFa1ySDK onExtraCallback(AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onActivityResized + 83;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        AFg1eSDKAFa1ySDK aFg1eSDKAFa1ySDKIAuthTabCallbackStub = IAuthTabCallbackStub(aFg1gSDK);
        int i4 = onActivityResized + 77;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return aFg1eSDKAFa1ySDKIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onPostMessage + 37;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact(aFg1gSDK);
        int i4 = onPostMessage + 7;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return zOnTransact;
    }

    public static /* synthetic */ boolean onNavigationEvent(AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onPostMessage + 53;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(1077016029, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1077016023, new Object[]{aFg1gSDK}, iOnExtraCallbackWithResult)).booleanValue();
        int i4 = onActivityResized + 57;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ float onWarmupCompleted(AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onPostMessage + 57;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        float fAsBinder = asBinder(aFg1gSDK);
        int i4 = onPostMessage + 119;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return fAsBinder;
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AFg1eSDK $target;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(AFg1eSDK aFg1eSDK, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$target = aFg1eSDK;
        }

        public static /* synthetic */ setUseCaseAttached onExtraCallback(AFg1gSDK aFg1gSDK) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setUseCaseAttached setusecaseattachedIAuthTabCallback = IAuthTabCallback(aFg1gSDK);
            int i4 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return setusecaseattachedIAuthTabCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = AFg1gSDK.this.new asBinder(this.$target, access13800Var);
            asbinder.L$0 = obj;
            int i2 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return asbinder;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg2, access13800Var2);
            }
            onWarmupCompleted(findresandmsg2, access13800Var2);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((asBinder) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 44 / 0;
            }
            int i5 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            return objInvokeSuspend;
        }

        public static final class onWarmupCompleted implements IAnimation<Boolean> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ IAnimation onExtraCallback;
            final /* synthetic */ AFg1gSDK onWarmupCompleted;

            /* renamed from: o.AFg1gSDK$asBinder$onWarmupCompleted$3, reason: invalid class name */
            public static final class AnonymousClass3<T> implements setRipple {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ setRipple onExtraCallbackWithResult;
                final /* synthetic */ AFg1gSDK onWarmupCompleted;

                /* renamed from: o.AFg1gSDK$asBinder$onWarmupCompleted$3$4, reason: invalid class name */
                public static final class AnonymousClass4 extends ContinuationImpl {
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass4(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 79;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass3.this.emit(null, this);
                        int i4 = onWarmupCompleted + 51;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 63 / 0;
                        }
                        return objEmit;
                    }
                }

                public AnonymousClass3(setRipple setripple, AFg1gSDK aFg1gSDK) {
                    this.onExtraCallbackWithResult = setripple;
                    this.onWarmupCompleted = aFg1gSDK;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                @Override // o.setRipple
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass4 anonymousClass4;
                    int i = 2 % 2;
                    if (access13800Var instanceof AnonymousClass4) {
                        anonymousClass4 = (AnonymousClass4) access13800Var;
                        int i2 = anonymousClass4.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            int i3 = onNavigationEvent + 17;
                            onExtraCallback = i3 % 128;
                            if (i3 % 2 != 0) {
                                anonymousClass4.label = i2 << Integer.MIN_VALUE;
                            } else {
                                anonymousClass4.label = i2 - 2147483648;
                            }
                            int i4 = onNavigationEvent + 79;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                        } else {
                            anonymousClass4 = new AnonymousClass4(access13800Var);
                        }
                    }
                    Object obj2 = anonymousClass4.result;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i6 = anonymousClass4.label;
                    if (i6 == 0) {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.onExtraCallbackWithResult;
                        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(Float.intBitsToFloat((int) ((setUseCaseAttached) obj).onExtraCallback()) <= (-this.onWarmupCompleted.onTransact()));
                        anonymousClass4.L$0 = access15400.onNavigationEvent(obj);
                        anonymousClass4.L$1 = access15400.onNavigationEvent(anonymousClass4);
                        anonymousClass4.L$2 = access15400.onNavigationEvent(obj);
                        anonymousClass4.L$3 = access15400.onNavigationEvent(setripple);
                        anonymousClass4.I$0 = 0;
                        anonymousClass4.label = 1;
                        if (setripple.emit(boolOnNavigationEvent, anonymousClass4) == objOnExtraCallback) {
                            int i7 = onNavigationEvent + 61;
                            onExtraCallback = i7 % 128;
                            if (i7 % 2 == 0) {
                                return objOnExtraCallback;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
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

            public onWarmupCompleted(IAnimation iAnimation, AFg1gSDK aFg1gSDK) {
                this.onExtraCallback = iAnimation;
                this.onWarmupCompleted = aFg1gSDK;
            }

            @Override // o.IAnimation
            public Object collect(setRipple<? super Boolean> setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallback.collect(new AnonymousClass3(setripple, this.onWarmupCompleted), access13800Var);
                if (objCollect != access14100.onExtraCallback()) {
                    return Unit.INSTANCE;
                }
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 27;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return objCollect;
            }
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            int label;
            final /* synthetic */ AFg1gSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(AFg1gSDK aFg1gSDK, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = aFg1gSDK;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
                int i2 = onNavigationEvent + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 41;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i4 = onNavigationEvent + 93;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnNavigationEvent;
                }
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 28 / 0;
                }
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent;
                    int i4 = i3 + 79;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 33;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    AFg1gSDK aFg1gSDK = this.this$0;
                    float f = -(aFg1gSDK.onTransact() + 48.0f);
                    long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                    getCompoundPaddingRight getcompoundpaddingrightOnExtraCallback = onQueryRefine.onExtraCallback(0.0f, 400.0f, (Object) null, 5, (Object) null);
                    this.label = 1;
                    if (AFg1gSDK.onNavigationEvent(aFg1gSDK, jIAuthTabCallback, getcompoundpaddingrightOnExtraCallback, 0L, this, 4, null) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<Boolean, access13800<? super Boolean>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            /* synthetic */ boolean Z$0;
            int label;

            onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                onextracallbackwithresult.Z$0 = ((Boolean) obj).booleanValue();
                int i2 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Boolean bool, access13800<? super Boolean> access13800Var) {
                Object objOnExtraCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                boolean zBooleanValue = bool.booleanValue();
                if (i3 != 0) {
                    objOnExtraCallback = onExtraCallback(zBooleanValue, access13800Var);
                    int i4 = 69 / 0;
                } else {
                    objOnExtraCallback = onExtraCallback(zBooleanValue, access13800Var);
                }
                int i5 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 43 / 0;
                }
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(boolean z, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((onExtraCallbackWithResult) create(Boolean.valueOf(z), access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z);
                if (i6 != 0) {
                    int i7 = 11 / 0;
                }
                return boolOnNavigationEvent;
            }
        }

        private static final setUseCaseAttached IAuthTabCallback(AFg1gSDK aFg1gSDK) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return setUseCaseAttached.onNavigationEvent(aFg1gSDK.IAuthTabCallback());
            }
            setUseCaseAttached.onNavigationEvent(aFg1gSDK.IAuthTabCallback());
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            getPackageType getpackagetypeOnExtraCallback;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 45;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 101;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                getpackagetypeOnExtraCallback = (getPackageType) this.L$1;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(findresandmsg, null, null, new onNavigationEvent(AFg1gSDK.this, null), 3, null);
                final AFg1gSDK aFg1gSDK = AFg1gSDK.this;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$animateValueTo$2$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 111;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        setUseCaseAttached setusecaseattachedOnExtraCallback = AFg1gSDK.asBinder.onExtraCallback(aFg1gSDK);
                        int i10 = onNavigationEvent + 97;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        return setusecaseattachedOnExtraCallback;
                    }
                }), AFg1gSDK.this);
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = getpackagetypeOnExtraCallback;
                this.label = 1;
                obj = ycxycx.IAuthTabCallback(onwarmupcompleted, onextracallbackwithresult, this);
                if (obj == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            if (Intrinsics.areEqual((Boolean) obj, access14000.onNavigationEvent(true))) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeOnExtraCallback, null, 1, null);
                AFg1gSDK.onExtraCallback(AFg1gSDK.this, this.$target);
                AFg1gSDK.onNavigationEvent(AFg1gSDK.this, 0.0f);
                Object[] objArr = {AFg1gSDK.this, Long.valueOf(setUseCaseAttached.Companion.IAuthTabCallback())};
                int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                AFg1gSDK.IAuthTabCallback(1389538183, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1389538182, objArr, iOnExtraCallbackWithResult);
            }
            return Unit.INSTANCE;
        }
    }

    private AFg1gSDK(AFg1eSDK aFg1eSDK, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, toMetersPerSecond tometerspersecond, float f, float f2, findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(aFg1eSDK, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(tometerspersecond, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onNavigationEvent = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.extraCallback = tometerspersecond;
        this.writeTypedObject = f;
        this.IAuthTabCallbackStubProxy = f2;
        this.IAuthTabCallback_Parcel = findresandmsg;
        this.readTypedObject = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(aFg1eSDK, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(aFg1eSDK, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolValueOf = Boolean.valueOf(AFg1gSDK.onNavigationEvent(this.f$0));
                int i4 = onWarmupCompleted + 125;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return boolValueOf;
                }
                throw null;
            }
        });
        this.extraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Float fValueOf = Float.valueOf(AFg1gSDK.onWarmupCompleted(this.f$0));
                int i4 = IAuthTabCallback + 9;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 73 / 0;
                }
                return fValueOf;
            }
        });
        this.IAuthTabCallbackStub = notifyPublicListeners.onWarmupCompleted(0);
        this.ICustomTabsCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    AFg1gSDK.onExtraCallback(this.f$0);
                    throw null;
                }
                AFg1eSDKAFa1ySDK aFg1eSDKAFa1ySDKOnExtraCallback = AFg1gSDK.onExtraCallback(this.f$0);
                int i3 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return aFg1eSDKAFa1ySDKOnExtraCallback;
            }
        });
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        this.access100 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(((AFg1eSDKAFa1ySDK) IAuthTabCallback(-1572111621, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1572111625, new Object[]{this}, iOnExtraCallbackWithResult)).onExtraCallback(onExtraCallback()));
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.getInterfaceDescriptor = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Boolean.valueOf(AFg1gSDK.onExtraCallbackWithResult(this.f$0));
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(AFg1gSDK.onExtraCallbackWithResult(this.f$0));
                int i3 = onExtraCallback + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return boolValueOf;
            }
        });
        this.access000 = notifyPublicListeners.onWarmupCompleted(0);
        this.asInterface = new inflateMenu();
        this.asBinder = new inflateMenu();
        this.onMinimized = new transformAsync();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onPostMessage + 7;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        aFg1gSDK.IAuthTabCallback(jLongValue);
        if (i3 != 0) {
            return null;
        }
        int i4 = 76 / 0;
        return null;
    }

    public static final /* synthetic */ AFg1eSDKAFa1ySDK IAuthTabCallback(AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onActivityResized + 19;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {aFg1gSDK};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AFg1eSDKAFa1ySDK aFg1eSDKAFa1ySDK = (AFg1eSDKAFa1ySDK) IAuthTabCallback(-1572111621, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, 1572111625, objArr, iOnExtraCallbackWithResult);
        int i4 = onPostMessage + 43;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return aFg1eSDKAFa1ySDK;
    }

    public static final /* synthetic */ void onExtraCallback(AFg1gSDK aFg1gSDK, AFg1eSDK aFg1eSDK) {
        int i = 2 % 2;
        int i2 = onPostMessage + 47;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        aFg1gSDK.onExtraCallbackWithResult(aFg1eSDK);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = onActivityResized + 7;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(AFg1gSDK aFg1gSDK, AFg1eSDK aFg1eSDK, accessgetSTART_TIMEcp accessgetstart_timecp, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onPostMessage + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = aFg1gSDK.onExtraCallbackWithResult(aFg1eSDK, accessgetstart_timecp, (access13800<? super Unit>) access13800Var);
        int i4 = onActivityResized + 103;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onNavigationEvent(AFg1gSDK aFg1gSDK, float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 7;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        aFg1gSDK.onExtraCallbackWithResult(f);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final toMetersPerSecond asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 67;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        toMetersPerSecond tometerspersecond = this.extraCallback;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return tometerspersecond;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 91;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        float f = aFg1gSDK.writeTypedObject;
        int i5 = i2 + 87;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 29;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            aFg1gSDK.onExtraCallback();
            AFg1eSDK aFg1eSDK = AFg1eSDK.Hidden;
            throw null;
        }
        if (aFg1gSDK.onExtraCallback() == AFg1eSDK.Hidden) {
            int i3 = onPostMessage + 11;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            if (aFg1gSDK.onTransact() <= 0.0f) {
                int i5 = onActivityResized + 63;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
        int i7 = onActivityResized + 25;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static final float asBinder(AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onActivityResized + 37;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        if (aFg1gSDK.onExtraCallback() != AFg1eSDK.Hidden || aFg1gSDK.onTransact() > 0.0f) {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            float fIntValue = ((Integer) IAuthTabCallback(-911057591, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 911057596, new Object[]{aFg1gSDK}, iOnExtraCallbackWithResult)).intValue();
            if (fIntValue <= 0.0f) {
                return 0.0f;
            }
            return RangesKt___RangesKt.coerceIn(RangesKt___RangesKt.coerceAtLeast(Float.intBitsToFloat((int) aFg1gSDK.IAuthTabCallback()) + fIntValue, 0.0f) / fIntValue, 0.0f, 1.0f);
        }
        int i4 = onActivityResized + 1;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return 0.0f;
    }

    private static final AFg1eSDKAFa1ySDK IAuthTabCallbackStub(final AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        final int iOnExtraCallbackWithResult = aFg1gSDK.onNavigationEvent.onExtraCallbackWithResult(aFg1gSDK.writeTypedObject) << 1;
        AFg1eSDKAFa1ySDK aFg1eSDKAFa1ySDKIAuthTabCallback = idefault.IAuthTabCallback(new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = AFg1gSDK.IAuthTabCallback(this.f$0, iOnExtraCallbackWithResult, (ddefault) obj);
                int i5 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        });
        int i2 = onActivityResized + Imgproc.COLOR_YUV2RGB_YVYU;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return aFg1eSDKAFa1ySDKIAuthTabCallback;
    }

    private static final Unit onExtraCallback(AFg1gSDK aFg1gSDK, int i, ddefault ddefaultVar) {
        AFg1eSDK aFg1eSDK;
        int iIAuthTabCallback_Parcel;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 67;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(ddefaultVar, "");
            ddefaultVar.IAuthTabCallback(AFg1eSDK.Hidden, 1.0f);
            aFg1eSDK = AFg1eSDK.Expanded;
            iIAuthTabCallback_Parcel = aFg1gSDK.IAuthTabCallback_Parcel() << i;
        } else {
            Intrinsics.checkNotNullParameter(ddefaultVar, "");
            ddefaultVar.IAuthTabCallback(AFg1eSDK.Hidden, 0.0f);
            aFg1eSDK = AFg1eSDK.Expanded;
            iIAuthTabCallback_Parcel = aFg1gSDK.IAuthTabCallback_Parcel() - i;
        }
        ddefaultVar.IAuthTabCallback(aFg1eSDK, iIAuthTabCallback_Parcel);
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 95;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onTransact(AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            aFg1gSDK.onExtraCallback();
            aFg1gSDK.IAuthTabCallbackStubProxy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (aFg1gSDK.onExtraCallback() != aFg1gSDK.IAuthTabCallbackStubProxy()) {
            return true;
        }
        int i3 = onActivityResized + 83;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final void onNavigationEvent(long j) {
        int i = 2 % 2;
        onExtraCallbackWithResult(VirtualCameraCaptureResult.IAuthTabCallbackDefault(j));
        onExtraCallback(VirtualCameraCaptureResult.asInterface(j));
        if (!onWarmupCompleted()) {
            onLoadStarted.onExtraCallback(this.IAuthTabCallback_Parcel, null, null, new IAuthTabCallbackDefault(null), 3, null);
            int i2 = onActivityResized + 125;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 3;
            }
        }
        int i4 = onPostMessage + 29;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = AFg1gSDK.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((IAuthTabCallbackDefault) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                AFg1gSDK aFg1gSDK = AFg1gSDK.this;
                float fOnExtraCallback = AFg1gSDK.IAuthTabCallback(aFg1gSDK).onExtraCallback(AFg1gSDK.this.onExtraCallback());
                this.label = 1;
                if (AFg1gSDK.onExtraCallback(aFg1gSDK, fOnExtraCallback, 0.0f, this, 2, null) == objOnExtraCallback) {
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 75;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 13;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                int i10 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 5;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        if (i4 == 0) {
            IAuthTabCallback(-1376048090, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1376048093, objArr, iOnExtraCallbackWithResult);
            return;
        }
        IAuthTabCallback(-1376048090, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1376048093, objArr, iOnExtraCallbackWithResult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        access13800 access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 67;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {aFg1gSDK, AFg1eSDK.Expanded, null, access13800Var, 2, null};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        Object objIAuthTabCallback = IAuthTabCallback(1804485297, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1804485289, objArr2, iOnExtraCallbackWithResult);
        if (objIAuthTabCallback == access14100.onExtraCallback()) {
            return objIAuthTabCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 81;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object IAuthTabCallback(AFg1gSDK aFg1gSDK, accessgetSTART_TIMEcp accessgetstart_timecp, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 65;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            accessgetstart_timecp = accessgetSTART_TIMEcp.Companion.onExtraCallback();
            int i4 = onPostMessage + 47;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        }
        return aFg1gSDK.onNavigationEvent(accessgetstart_timecp, (access13800<? super Unit>) access13800Var);
    }

    public final Object onNavigationEvent(@NotNull accessgetSTART_TIMEcp accessgetstart_timecp, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(AFg1eSDK.Hidden, accessgetstart_timecp, access13800Var);
        if (objOnExtraCallbackWithResult == access14100.onExtraCallback()) {
            int i2 = onPostMessage + 97;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            return objOnExtraCallbackWithResult;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 21;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        AFg1eSDK aFg1eSDK = (AFg1eSDK) objArr[1];
        accessgetSTART_TIMEcp accessgetstart_timecp = (accessgetSTART_TIMEcp) objArr[2];
        access13800<? super Unit> access13800Var = (access13800) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 85;
        onPostMessage = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0 ? (iIntValue & 2) != 0 : (iIntValue & 5) != 0) {
            int i4 = i2 + 71;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            accessgetstart_timecp = null;
        }
        Object objOnExtraCallbackWithResult = aFg1gSDK.onExtraCallbackWithResult(aFg1eSDK, accessgetstart_timecp, access13800Var);
        int i6 = onActivityResized + 21;
        onPostMessage = i6 % 128;
        if (i6 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (o.findRes.onExtraCallbackWithResult(r0, r5) != r8) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(AFg1eSDK aFg1eSDK, accessgetSTART_TIMEcp accessgetstart_timecp, access13800<? super Unit> access13800Var) {
        onExtraCallback onextracallback;
        AFg1eSDK aFg1eSDK2;
        int i = 2 % 2;
        int i2 = onActivityResized + 45;
        onPostMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof onExtraCallback;
            obj.hashCode();
            throw null;
        }
        if (!(access13800Var instanceof onExtraCallback)) {
            onextracallback = new onExtraCallback(access13800Var);
        } else {
            onextracallback = (onExtraCallback) access13800Var;
            int i3 = onextracallback.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = onPostMessage + 61;
                onActivityResized = i4 % 128;
                if (i4 % 2 == 0) {
                    onextracallback.label = i3 >> Integer.MIN_VALUE;
                } else {
                    onextracallback.label = i3 - 2147483648;
                }
            }
        }
        onExtraCallback onextracallback2 = onextracallback;
        Object obj2 = onextracallback2.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = onextracallback2.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aFg1eSDK2 = (AFg1eSDK) onextracallback2.L$0;
                ResultKt.onNavigationEvent(obj2);
                onExtraCallbackWithResult(aFg1eSDK2);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj2);
            int i6 = onPostMessage + 125;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj2);
        onNavigationEvent(aFg1eSDK);
        if (onExtraCallbackWithResult.IAuthTabCallback[aFg1eSDK.ordinal()] == 1) {
            asBinder asbinder = new asBinder(aFg1eSDK, null);
            onextracallback2.L$0 = access15400.onNavigationEvent(aFg1eSDK);
            onextracallback2.L$1 = access15400.onNavigationEvent(accessgetstart_timecp);
            onextracallback2.label = 1;
        } else {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            float fOnExtraCallback = ((AFg1eSDKAFa1ySDK) IAuthTabCallback(-1572111621, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1572111625, new Object[]{this}, iOnExtraCallbackWithResult)).onExtraCallback(aFg1eSDK);
            onextracallback2.L$0 = aFg1eSDK;
            onextracallback2.L$1 = access15400.onNavigationEvent(accessgetstart_timecp);
            onextracallback2.label = 2;
            if (onExtraCallback(this, fOnExtraCallback, 0.0f, onextracallback2, 2, null) != objOnExtraCallback) {
                aFg1eSDK2 = aFg1eSDK;
                onExtraCallbackWithResult(aFg1eSDK2);
                return Unit.INSTANCE;
            }
        }
        return objOnExtraCallback;
    }

    static /* synthetic */ Object onExtraCallback(AFg1gSDK aFg1gSDK, float f, float f2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 99;
        int i4 = i3 % 128;
        onActivityResized = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            int i5 = i4 + 47;
            onPostMessage = i5 % 128;
            if (i5 % 2 != 0) {
                aFg1gSDK.onTransact();
                throw null;
            }
            f2 = aFg1gSDK.onTransact();
        }
        return aFg1gSDK.onExtraCallbackWithResult(f, f2, (access13800<? super Unit>) access13800Var);
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ float $initialHeight;
        final /* synthetic */ float $targetHeight;
        int label;
        final /* synthetic */ AFg1gSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(float f, float f2, AFg1gSDK aFg1gSDK, access13800<? super onWarmupCompleted> access13800Var) {
            super(1, access13800Var);
            this.$initialHeight = f;
            this.$targetHeight = f2;
            this.this$0 = aFg1gSDK;
        }

        public static /* synthetic */ Unit IAuthTabCallback(AFg1gSDK aFg1gSDK, float f, float f2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(aFg1gSDK, f, f2);
            int i4 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$initialHeight, this.$targetHeight, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(access13800Var);
            if (i3 == 0) {
                int i4 = 23 / 0;
            }
            int i5 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 85 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(access13800Var);
            if (i3 == 0) {
                onwarmupcompleted.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onWarmupCompleted(AFg1gSDK aFg1gSDK, float f, float f2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                AFg1gSDK.onNavigationEvent(aFg1gSDK, f);
                return Unit.INSTANCE;
            }
            AFg1gSDK.onNavigationEvent(aFg1gSDK, f);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                float f = this.$initialHeight;
                float f2 = this.$targetHeight;
                final AFg1gSDK aFg1gSDK = this.this$0;
                Function2 function2 = new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$animateHeightTo$2$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 109;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitIAuthTabCallback = AFg1gSDK.onWarmupCompleted.IAuthTabCallback(aFg1gSDK, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        int i8 = IAuthTabCallback + 67;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                this.label = 1;
                if (getShowText.onWarmupCompleted(f, f2, 0.0f, (onItemClicked) null, function2, this, 12, (Object) null) == objOnExtraCallback) {
                    int i5 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final Object onExtraCallbackWithResult(float f, float f2, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objIAuthTabCallback = inflateMenu.IAuthTabCallback(this.asInterface, (isOverflowMenuShowing) null, new onWarmupCompleted(f2, f, this, null), access13800Var, 1, (Object) null);
        if (objIAuthTabCallback == access14100.onExtraCallback()) {
            int i2 = onPostMessage + 53;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            return objIAuthTabCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 35;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static /* synthetic */ Object onNavigationEvent(AFg1gSDK aFg1gSDK, long j, onItemClicked onitemclicked, long j2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onActivityResized;
        int i4 = i3 + 69;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 15;
            onPostMessage = i6 % 128;
            if (i6 % 2 != 0) {
                aFg1gSDK.IAuthTabCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j2 = aFg1gSDK.IAuthTabCallback();
        }
        return aFg1gSDK.onWarmupCompleted(j, onitemclicked, j2, access13800Var);
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ onItemClicked<setUseCaseAttached> $animationSpec;
        final /* synthetic */ long $initialOffset;
        final /* synthetic */ long $targetOffset;
        int label;
        final /* synthetic */ AFg1gSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(long j, long j2, onItemClicked<setUseCaseAttached> onitemclicked, AFg1gSDK aFg1gSDK, access13800<? super onNavigationEvent> access13800Var) {
            super(1, access13800Var);
            this.$initialOffset = j;
            this.$targetOffset = j2;
            this.$animationSpec = onitemclicked;
            this.this$0 = aFg1gSDK;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(AFg1gSDK aFg1gSDK, setUseCaseAttached setusecaseattached, setUseCaseAttached setusecaseattached2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(aFg1gSDK, setusecaseattached, setusecaseattached2);
            if (i3 != 0) {
                int i4 = 28 / 0;
            }
            return unitIAuthTabCallback;
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) create(access13800Var);
            if (i3 == 0) {
                return onnavigationevent.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationevent.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$initialOffset, this.$targetOffset, this.$animationSpec, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 30 / 0;
            }
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(access13800Var);
            int i4 = onNavigationEvent + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        private static final Unit IAuthTabCallback(AFg1gSDK aFg1gSDK, setUseCaseAttached setusecaseattached, setUseCaseAttached setusecaseattached2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                AFg1gSDK.IAuthTabCallback(1389538183, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1389538182, new Object[]{aFg1gSDK, Long.valueOf(setusecaseattached.onExtraCallback())}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
                int i3 = 74 / 0;
                return Unit.INSTANCE;
            }
            AFg1gSDK.IAuthTabCallback(1389538183, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1389538182, new Object[]{aFg1gSDK, Long.valueOf(setusecaseattached.onExtraCallback())}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                access14100.onExtraCallback();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(setUseCaseAttached.Companion);
                setUseCaseAttached setusecaseattachedOnNavigationEvent = setUseCaseAttached.onNavigationEvent(this.$initialOffset);
                setUseCaseAttached setusecaseattachedOnNavigationEvent2 = setUseCaseAttached.onNavigationEvent(this.$targetOffset);
                onItemClicked<setUseCaseAttached> onitemclicked = this.$animationSpec;
                final AFg1gSDK aFg1gSDK = this.this$0;
                Function2 function2 = new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$animateOffsetTo$2$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnExtraCallbackWithResult = AFg1gSDK.onNavigationEvent.onExtraCallbackWithResult(aFg1gSDK, (setUseCaseAttached) obj2, (setUseCaseAttached) obj3);
                        if (i6 != 0) {
                            int i7 = 45 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                };
                this.label = 1;
                if (getShowText.onExtraCallbackWithResult(getthumbtintlistIAuthTabCallback, setusecaseattachedOnNavigationEvent, setusecaseattachedOnNavigationEvent2, (Object) null, onitemclicked, function2, this, 8, (Object) null) == objOnExtraCallback) {
                    int i4 = onNavigationEvent + 9;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objOnExtraCallback;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 83;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final Object onWarmupCompleted(long j, onItemClicked<setUseCaseAttached> onitemclicked, long j2, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objIAuthTabCallback = inflateMenu.IAuthTabCallback(this.asBinder, (isOverflowMenuShowing) null, new onNavigationEvent(j2, j, onitemclicked, this, null), access13800Var, 1, (Object) null);
        if (objIAuthTabCallback != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i2 = onActivityResized;
        int i3 = i2 + 37;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return objIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull HandlerScheduledExecutorService2 handlerScheduledExecutorService2) {
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
        this.onExtraCallbackWithResult = handlerScheduledExecutorService2;
        int i4 = onPostMessage + 71;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@NotNull HandlerScheduledExecutorService2 handlerScheduledExecutorService2) {
        int i = 2 % 2;
        int i2 = onPostMessage + 31;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
        if (this.onExtraCallbackWithResult == null) {
            int i3 = onActivityResized + 99;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
        } else {
            this.onMinimized.IAuthTabCallback(handlerScheduledExecutorService2.IAuthTabCallbackStubProxy(), handlerScheduledExecutorService2.IAuthTabCallback());
            IAuthTabCallback(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(RangesKt___RangesKt.coerceAtMost(Float.intBitsToFloat((int) IAuthTabCallback()) + Float.intBitsToFloat((int) DirectExecutor.IAuthTabCallback(handlerScheduledExecutorService2)), 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)));
            handlerScheduledExecutorService2.onExtraCallback();
        }
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ boolean $shouldHide;
        int label;
        final /* synthetic */ AFg1gSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(boolean z, AFg1gSDK aFg1gSDK, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$shouldHide = z;
            this.this$0 = aFg1gSDK;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$shouldHide, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterface = (asInterface) create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return asinterface.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 40 / 0;
            return asinterface.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            if (o.AFg1gSDK.IAuthTabCallback(r10, null, r9, 1, null) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            if (o.AFg1gSDK.IAuthTabCallback(-1895540931, o.UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), o.UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), r5, 1895540933, new java.lang.Object[]{r10, r9}, r8) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (this.$shouldHide) {
                    AFg1gSDK aFg1gSDK = this.this$0;
                    this.label = 1;
                } else {
                    AFg1gSDK aFg1gSDK2 = this.this$0;
                    this.label = 2;
                    int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                }
            }
            Object[] objArr = {this.this$0, Long.valueOf(setUseCaseAttached.Companion.IAuthTabCallback())};
            int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            AFg1gSDK.IAuthTabCallback(1389538183, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1389538182, objArr, iOnExtraCallbackWithResult3);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public final void access000() {
        int i = 2 % 2;
        int i2 = onPostMessage + 79;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = null;
        onLoadStarted.onExtraCallback(this.IAuthTabCallback_Parcel, null, null, new asInterface(Float.intBitsToFloat((int) IAuthTabCallback()) < (-this.onNavigationEvent.onExtraCallback(this.IAuthTabCallbackStubProxy)), this, null), 3, null);
        this.onMinimized.onExtraCallbackWithResult();
        int i4 = onPostMessage + 91;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AFg1eSDK onExtraCallbackWithResult(InternalCameraPresenceListener internalCameraPresenceListener, AFg1gSDK aFg1gSDK) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AFg1eSDK aFg1eSDKIAuthTabCallback = IAuthTabCallback(internalCameraPresenceListener, aFg1gSDK);
            int i4 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return aFg1eSDKIAuthTabCallback;
        }

        public static /* synthetic */ AFg1gSDK onNavigationEvent(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, toMetersPerSecond tometerspersecond, float f, float f2, findResAndMsg findresandmsg, AFg1eSDK aFg1eSDK) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, tometerspersecond, f, f2, findresandmsg, aFg1eSDK);
                throw null;
            }
            AFg1gSDK aFg1gSDKOnWarmupCompleted = onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, tometerspersecond, f, f2, findresandmsg, aFg1eSDK);
            int i3 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return aFg1gSDKOnWarmupCompleted;
            }
            throw null;
        }

        private IAuthTabCallback() {
        }

        public final getCaptureIds<AFg1gSDK, AFg1eSDK> onExtraCallbackWithResult(@NotNull final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull final toMetersPerSecond tometerspersecond, final float f, final float f2, @NotNull final findResAndMsg findresandmsg) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            Intrinsics.checkNotNullParameter(tometerspersecond, "");
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            getCaptureIds<AFg1gSDK, AFg1eSDK> getcaptureidsOnWarmupCompleted = ImmediateSurface.onWarmupCompleted(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$Companion$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 55;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    AFg1eSDK aFg1eSDKOnExtraCallbackWithResult = AFg1gSDK.IAuthTabCallback.onExtraCallbackWithResult((InternalCameraPresenceListener) obj, (AFg1gSDK) obj2);
                    int i5 = onExtraCallback + 75;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return aFg1eSDKOnExtraCallbackWithResult;
                }
            }, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetState$Companion$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 113;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return AFg1gSDK.IAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, tometerspersecond, f, f2, findresandmsg, (AFg1eSDK) obj);
                    }
                    AFg1gSDK.IAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, tometerspersecond, f, f2, findresandmsg, (AFg1eSDK) obj);
                    throw null;
                }
            });
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return getcaptureidsOnWarmupCompleted;
        }

        private static final AFg1eSDK IAuthTabCallback(InternalCameraPresenceListener internalCameraPresenceListener, AFg1gSDK aFg1gSDK) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            AFg1eSDK aFg1eSDKOnExtraCallback = aFg1gSDK.onExtraCallback();
            int i4 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return aFg1eSDKOnExtraCallback;
            }
            throw null;
        }

        private static final AFg1gSDK onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, toMetersPerSecond tometerspersecond, float f, float f2, findResAndMsg findresandmsg, AFg1eSDK aFg1eSDK) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(aFg1eSDK, "");
            AFg1gSDK aFg1gSDK = new AFg1gSDK(aFg1eSDK, r8lambdanm9dm2eewl4vrptnjmesfjqky4, tometerspersecond, f, f2, findresandmsg, null);
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return aFg1gSDK;
        }
    }

    public final AFg1eSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onPostMessage + 29;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return (AFg1eSDK) this.readTypedObject.onExtraCallbackWithResult();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(AFg1eSDK aFg1eSDK) {
        int i = 2 % 2;
        int i2 = onPostMessage + 71;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            this.readTypedObject.IAuthTabCallback(aFg1eSDK);
            int i3 = 26 / 0;
        } else {
            this.readTypedObject.IAuthTabCallback(aFg1eSDK);
        }
    }

    public final AFg1eSDK onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 7;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            AFg1eSDK aFg1eSDK = (AFg1eSDK) this.onExtraCallback.onExtraCallbackWithResult();
            int i3 = onPostMessage + Imgproc.COLOR_YUV2RGBA_YVYU;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            return aFg1eSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(AFg1eSDK aFg1eSDK) {
        int i = 2 % 2;
        int i2 = onActivityResized + 79;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.IAuthTabCallback(aFg1eSDK);
        } else {
            this.onExtraCallback.IAuthTabCallback(aFg1eSDK);
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 29;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) aFg1gSDK.onTransact.onExtraCallbackWithResult()).booleanValue();
        int i4 = onPostMessage + 77;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i5 = 87 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
            return ((Number) this.extraCallbackWithResult.onExtraCallbackWithResult()).floatValue();
        }
        return ((Number) this.extraCallbackWithResult.onExtraCallbackWithResult()).floatValue();
    }

    private final int IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onPostMessage + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted();
        int i4 = onPostMessage + 3;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    private final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 25;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallbackStub.onExtraCallback(i);
        } else {
            this.IAuthTabCallbackStub.onExtraCallback(i);
            throw null;
        }
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onPostMessage + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.ICustomTabsCallback.onNavigationEvent();
        int i4 = onPostMessage + 91;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = onActivityResized + 91;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallback.onNavigationEvent(f);
        int i4 = onPostMessage + 7;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + Imgproc.COLOR_YUV2RGBA_YVYU;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        AFg1eSDKAFa1ySDK aFg1eSDKAFa1ySDK = (AFg1eSDKAFa1ySDK) aFg1gSDK.IAuthTabCallback.onExtraCallbackWithResult();
        int i4 = onPostMessage + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return aFg1eSDKAFa1ySDK;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = onPostMessage + 111;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.access100.onNavigationEvent();
        int i4 = onActivityResized + 125;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 123;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        this.access100.onNavigationEvent(f);
        int i4 = onPostMessage + 113;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return ((setUseCaseAttached) this.IAuthTabCallbackDefault.onExtraCallbackWithResult()).onExtraCallback();
        }
        ((setUseCaseAttached) this.IAuthTabCallbackDefault.onExtraCallbackWithResult()).onExtraCallback();
        throw null;
    }

    private final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(j));
        int i4 = onActivityResized + 71;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityResized + 45;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.getInterfaceDescriptor.onNavigationEvent();
        int i4 = onActivityResized + 41;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return fOnNavigationEvent;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            boolean zBooleanValue = ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
            int i3 = onPostMessage + 37;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 71 / 0;
            }
            return zBooleanValue;
        }
        ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iOnWarmupCompleted;
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            iOnWarmupCompleted = aFg1gSDK.access000.onWarmupCompleted();
            int i3 = 90 / 0;
        } else {
            iOnWarmupCompleted = aFg1gSDK.access000.onWarmupCompleted();
        }
        return Integer.valueOf(iOnWarmupCompleted);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onPostMessage + 109;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            aFg1gSDK.access000.onExtraCallback(iIntValue);
            int i3 = onPostMessage + 59;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        aFg1gSDK.access000.onExtraCallback(iIntValue);
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(AFg1gSDK aFg1gSDK, long j) {
        Object[] objArr = {aFg1gSDK, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        IAuthTabCallback(1389538183, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1389538182, objArr, iOnExtraCallbackWithResult);
    }

    static /* synthetic */ Object onNavigationEvent(AFg1gSDK aFg1gSDK, AFg1eSDK aFg1eSDK, accessgetSTART_TIMEcp accessgetstart_timecp, access13800 access13800Var, int i, Object obj) {
        Object[] objArr = {aFg1gSDK, aFg1eSDK, accessgetstart_timecp, access13800Var, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return IAuthTabCallback(1804485297, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1804485289, objArr, iOnExtraCallbackWithResult);
    }

    private final AFg1eSDKAFa1ySDK<AFg1eSDK> access100() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (AFg1eSDKAFa1ySDK) IAuthTabCallback(-1572111621, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1572111625, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    private final int extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return ((Integer) IAuthTabCallback(-911057591, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 911057596, new Object[]{this}, iOnExtraCallbackWithResult)).intValue();
    }

    private static final boolean asInterface(AFg1gSDK aFg1gSDK) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(1077016029, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1077016023, new Object[]{aFg1gSDK}, iOnExtraCallbackWithResult)).booleanValue();
    }

    private final void onNavigationEvent(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        IAuthTabCallback(-1376048090, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1376048093, objArr, iOnExtraCallbackWithResult);
    }

    public final long onNavigationEvent() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return ((Long) IAuthTabCallback(1186280271, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1186280271, new Object[]{this}, iOnExtraCallbackWithResult)).longValue();
    }

    public final float IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return ((Float) IAuthTabCallback(1909395745, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1909395736, new Object[]{this}, iOnExtraCallbackWithResult)).floatValue();
    }

    public final boolean getInterfaceDescriptor() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(2025873715, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -2025873708, new Object[]{this}, iOnExtraCallbackWithResult)).booleanValue();
    }

    public final Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return IAuthTabCallback(-1895540931, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1895540933, new Object[]{this, access13800Var}, iOnExtraCallbackWithResult);
    }
}
