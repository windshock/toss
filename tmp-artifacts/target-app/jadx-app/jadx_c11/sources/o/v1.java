package o;

import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.InternalCameraPresenceListener;
import o.getPackageType;
import o.setUseCaseAttached;
import o.u7a;
import o.v1;
import o.x1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v1 {
    private static int ICustomTabsCallbackStub = 0;
    private static int ICustomTabsService = 0;
    private static int isEngagementSignalsApiAvailable = 1;
    private static int mayLaunchUrl = 1;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback;
    private final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 IAuthTabCallbackDefault;
    private final Function0<Unit> IAuthTabCallbackStub;
    private Float IAuthTabCallbackStubProxy;
    private u5b IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final float ICustomTabsCallbackDefault;
    private final transformAsync ICustomTabsCallbackStubProxy;
    private boolean access000;
    private final CameraPresenceProviderExternalSyntheticLambda6 access100;
    private HandlerScheduledExecutorService2 asBinder;
    private final getSupportedHighSpeedResolutionsFor asInterface;
    private final getSupportedHighSpeedResolutions extraCallback;
    private final inflateMenu extraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor getInterfaceDescriptor;
    private final float onActivityLayout;
    private final inflateMenu onActivityResized;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final Function2<u5b, x1, Boolean> onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutions onMessageChannelReady;
    private final float onMinimized;
    private final findResAndMsg onNavigationEvent;
    private final CameraPresenceProviderExternalSyntheticLambda6 onPostMessage;
    private final getSupportedHighSpeedResolutionsFor onRelationshipValidationResult;
    private final getSupportedHighSpeedResolutionsFor onTransact;
    private final getSupportedHighSpeedResolutions onUnminimized;
    private final float readTypedObject;
    private final float writeTypedObject;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final getThumbPosition<setUseCaseAttached> onWarmupCompleted = onQueryRefine.onExtraCallbackWithResult(1000, 0, getMediaContentView.onWarmupCompleted.IAuthTabCallback(1.0d, 0.2d), 2, (Object) null);

    static final class asInterface extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            v1 v1Var = v1.this;
            if (i3 == 0) {
                return v1Var.IAuthTabCallback((x1) null, (access13800<? super Unit>) this);
            }
            v1Var.IAuthTabCallback((x1) null, (access13800<? super Unit>) this);
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        float F$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            float f;
            int i = 2 % 2;
            boolean z = true;
            int i2 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            v1 v1Var = v1.this;
            if (i3 == 0) {
                f = 2.0f;
            } else {
                f = 0.0f;
                z = false;
            }
            Object objOnNavigationEvent = v1.onNavigationEvent(v1Var, f, z, (access13800) this);
            int i4 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[u5b.values().length];
            try {
                iArr[u5b.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u5b.PartiallyExpanded.ordinal()] = 2;
                int i = IAuthTabCallback + 37;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u5b.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
            int i4 = IAuthTabCallback + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = v1.onExtraCallbackWithResult(v1.this, null, null, this);
            int i4 = onNavigationEvent + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    public /* synthetic */ v1(u5b u5bVar, boolean z, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Function2 function2, float f, float f2, float f3, float f4, float f5, Function0 function0, findResAndMsg findresandmsg, DefaultConstructorMarker defaultConstructorMarker) {
        this(u5bVar, z, r8lambdanm9dm2eewl4vrptnjmesfjqky4, function2, f, f2, f3, f4, f5, function0, findresandmsg);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i4));
        int i11 = ~(i2 | i4);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i4);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i6 + i4 + i3 + (1349231875 * i) + (1735201104 * i5);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i6) + 1558183936 + (237349861 * i4) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i3) + ((-1337982976) * i) + (469762048 * i5) + (1272971264 * i16);
        int i18 = ((i6 * 236314795) - 374860141) + (i4 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i3 * 236313959) + (i * (-66979019)) + (i5 * (-1872492752)) + (i16 * (-417333248));
        switch (i17 + (i18 * i18 * 639631360)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                v1 v1Var = (v1) objArr[1];
                float fFloatValue = ((Number) objArr[2]).floatValue();
                ((Number) objArr[3]).floatValue();
                int i19 = 2 % 2;
                if (zBooleanValue) {
                    int i20 = ICustomTabsCallbackStub + 75;
                    isEngagementSignalsApiAvailable = i20 % 128;
                    int i21 = i20 % 2;
                    u5b u5bVarOnExtraCallback = v1Var.IAuthTabCallback().onExtraCallback(fFloatValue);
                    if (u5bVarOnExtraCallback != null) {
                        v1Var.onNavigationEvent(u5bVarOnExtraCallback);
                        int i22 = ICustomTabsCallbackStub + 97;
                        isEngagementSignalsApiAvailable = i22 % 128;
                        int i23 = i22 % 2;
                    }
                }
                v1Var.onExtraCallbackWithResult(fFloatValue);
                return Unit.INSTANCE;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                v1 v1Var2 = (v1) objArr[0];
                int i24 = 2 % 2;
                int i25 = ICustomTabsCallbackStub + 15;
                isEngagementSignalsApiAvailable = i25 % 128;
                int i26 = i25 % 2;
                long jOnExtraCallback = ((setUseCaseAttached) v1Var2.getInterfaceDescriptor.onExtraCallbackWithResult()).onExtraCallback();
                int i27 = ICustomTabsCallbackStub + 35;
                isEngagementSignalsApiAvailable = i27 % 128;
                int i28 = i27 % 2;
                return Long.valueOf(jOnExtraCallback);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                v1 v1Var3 = (v1) objArr[0];
                u7ExternalSyntheticLambda0 u7externalsyntheticlambda0 = (u7ExternalSyntheticLambda0) objArr[1];
                int i29 = 2 % 2;
                int i30 = ICustomTabsCallbackStub + 77;
                isEngagementSignalsApiAvailable = i30 % 128;
                int i31 = i30 % 2;
                v1Var3.IAuthTabCallback.IAuthTabCallback(u7externalsyntheticlambda0);
                int i32 = ICustomTabsCallbackStub + 65;
                isEngagementSignalsApiAvailable = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return asBinder(objArr);
            case 13:
                v1 v1Var4 = (v1) objArr[0];
                int i34 = 2 % 2;
                v1Var4.asBinder = null;
                maybeUpdateAnimatable.onNavigationEvent(v1Var4.onNavigationEvent, (CoroutineContext) null, (setRandomHost) null, v1Var4.new IAuthTabCallbackStub(((Long) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1920793799, new Object[]{v1Var4}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue(), null), 3, (Object) null);
                int i35 = isEngagementSignalsApiAvailable + 11;
                ICustomTabsCallbackStub = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(float f, v1 v1Var, float f2, u7a u7aVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 31;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(f, v1Var, f2, u7aVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(f, v1Var, f2, u7aVar);
        int i3 = ICustomTabsCallbackStub + 115;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, v1 v1Var, float f, float f2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 125;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {Boolean.valueOf(z), v1Var, Float.valueOf(f), Float.valueOf(f2)};
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent2, 305841504, objArr, iOnNavigationEvent4, -305841502);
        int i4 = ICustomTabsCallbackStub + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ VirtualCameraCaptureResult onExtraCallbackWithResult(v1 v1Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(v1Var);
            throw null;
        }
        VirtualCameraCaptureResult virtualCameraCaptureResultIAuthTabCallbackStub = IAuthTabCallbackStub(v1Var);
        int i3 = ICustomTabsCallbackStub + 121;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return virtualCameraCaptureResultIAuthTabCallbackStub;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(u5b u5bVar, x1 x1Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1794805771, new Object[]{u5bVar, x1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1794805768)).booleanValue();
        int i4 = ICustomTabsCallbackStub + 7;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        u5b u5bVar = (u5b) objArr[0];
        x1 x1Var = (x1) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 63;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(u5bVar, "");
        Intrinsics.checkNotNullParameter(x1Var, "");
        int i4 = ICustomTabsCallbackStub + 53;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(v1 v1Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(v1Var);
        }
        onTransact(v1Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ float $targetOffsetY;
        final /* synthetic */ u5b $value;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(float f, u5b u5bVar, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$targetOffsetY = f;
            this.$value = u5bVar;
        }

        public static /* synthetic */ setUseCaseAttached onNavigationEvent(v1 v1Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setUseCaseAttached setusecaseattachedOnWarmupCompleted = onWarmupCompleted(v1Var);
            int i4 = IAuthTabCallback + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return setusecaseattachedOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = v1.this.new asBinder(this.$targetOffsetY, this.$value, access13800Var);
            asbinder.L$0 = obj;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 3;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public static final class onNavigationEvent implements IAnimation<Boolean> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ IAnimation onExtraCallback;
            final /* synthetic */ v1 onNavigationEvent;

            /* renamed from: o.v1$asBinder$onNavigationEvent$1, reason: invalid class name */
            public static final class AnonymousClass1<T> implements setRipple {
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;
                final /* synthetic */ v1 IAuthTabCallback;
                final /* synthetic */ setRipple onWarmupCompleted;

                /* renamed from: o.v1$asBinder$onNavigationEvent$1$5, reason: invalid class name */
                public static final class AnonymousClass5 extends ContinuationImpl {
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass5(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 95;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object obj2 = null;
                        Object objEmit = AnonymousClass1.this.emit(null, this);
                        int i4 = onNavigationEvent + 109;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objEmit;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }

                public AnonymousClass1(setRipple setripple, v1 v1Var) {
                    this.onWarmupCompleted = setripple;
                    this.IAuthTabCallback = v1Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass5 anonymousClass5;
                    int i;
                    int i2 = 2 % 2;
                    if (access13800Var instanceof AnonymousClass5) {
                        int i3 = onExtraCallbackWithResult + 85;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = ((AnonymousClass5) access13800Var).label;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        anonymousClass5 = (AnonymousClass5) access13800Var;
                        int i5 = anonymousClass5.label;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            anonymousClass5.label = i5 - 2147483648;
                            i = onExtraCallback + 125;
                        } else {
                            anonymousClass5 = new AnonymousClass5(access13800Var);
                            i = onExtraCallback + 63;
                        }
                    }
                    onExtraCallbackWithResult = i % 128;
                    int i6 = i % 2;
                    Object obj3 = anonymousClass5.result;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i7 = anonymousClass5.label;
                    if (i7 == 0) {
                        ResultKt.onNavigationEvent(obj3);
                        setRipple setripple = this.onWarmupCompleted;
                        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(Float.intBitsToFloat((int) ((setUseCaseAttached) obj).onExtraCallback()) > this.IAuthTabCallback.IAuthTabCallbackDefault());
                        anonymousClass5.L$0 = access15400.onNavigationEvent(obj);
                        anonymousClass5.L$1 = access15400.onNavigationEvent(anonymousClass5);
                        anonymousClass5.L$2 = access15400.onNavigationEvent(obj);
                        anonymousClass5.L$3 = access15400.onNavigationEvent(setripple);
                        anonymousClass5.I$0 = 0;
                        anonymousClass5.label = 1;
                        if (setripple.emit(boolOnNavigationEvent, anonymousClass5) == objOnWarmupCompleted) {
                            int i8 = onExtraCallbackWithResult + 113;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i9 = 14 / 0;
                            }
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj3);
                    }
                    return Unit.INSTANCE;
                }
            }

            public onNavigationEvent(IAnimation iAnimation, v1 v1Var) {
                this.onExtraCallback = iAnimation;
                this.onNavigationEvent = v1Var;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallback.collect(new AnonymousClass1(setripple, this.onNavigationEvent), access13800Var);
                if (objCollect == access14300.onWarmupCompleted()) {
                    int i2 = onWarmupCompleted + 105;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return objCollect;
                }
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ float $targetOffsetY;
            int label;
            final /* synthetic */ v1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(v1 v1Var, float f, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = v1Var;
                this.$targetOffsetY = f;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$targetOffsetY, access13800Var);
                int i2 = onExtraCallbackWithResult + 37;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallback;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 121;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 117;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                Object obj2 = null;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    v1 v1Var = this.this$0;
                    float f = this.$targetOffsetY;
                    long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                    getCompoundPaddingRight getcompoundpaddingrightOnExtraCallback = onQueryRefine.onExtraCallback(0.0f, 400.0f, (Object) null, 5, (Object) null);
                    this.label = 1;
                    if (v1.onExtraCallbackWithResult(v1Var, jIAuthTabCallback, getcompoundpaddingrightOnExtraCallback, 0L, this, 4, null) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 3;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i6 = onExtraCallbackWithResult + 73;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
                Unit unit = Unit.INSTANCE;
                int i8 = onExtraCallback + 89;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<Boolean, access13800<? super Boolean>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            /* synthetic */ boolean Z$0;
            int label;

            onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
            }

            public final Object IAuthTabCallback(boolean z, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedCreate = create(Boolean.valueOf(z), access13800Var);
                if (i3 == 0) {
                    return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                }
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
                onwarmupcompleted.Z$0 = ((Boolean) obj).booleanValue();
                int i2 = onExtraCallbackWithResult + 5;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onwarmupcompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback(((Boolean) obj).booleanValue(), (access13800) obj2);
                int i4 = onExtraCallback + 57;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 107;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z);
                int i3 = onExtraCallbackWithResult + 13;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return boolOnNavigationEvent;
            }
        }

        private static final setUseCaseAttached onWarmupCompleted(v1 v1Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            setUseCaseAttached setusecaseattachedOnNavigationEvent = setUseCaseAttached.onNavigationEvent(((Long) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -1920793799, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue());
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return setusecaseattachedOnNavigationEvent;
        }

        public final Object invokeSuspend(Object obj) {
            getPackageType getpackagetype;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(v1.this, this.$targetOffsetY, null), 3, (Object) null);
                final v1 v1Var = v1.this;
                onNavigationEvent onnavigationevent = new onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$animateValueTo$2$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 107;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        v1 v1Var2 = v1Var;
                        if (i6 == 0) {
                            return v1.asBinder.onNavigationEvent(v1Var2);
                        }
                        v1.asBinder.onNavigationEvent(v1Var2);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }), v1.this);
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = getpackagetypeOnNavigationEvent;
                this.label = 1;
                Object objIAuthTabCallback = ycxycx.IAuthTabCallback(onnavigationevent, onwarmupcompleted, this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 125;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
                getpackagetype = getpackagetypeOnNavigationEvent;
                obj = objIAuthTabCallback;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getpackagetype = (getPackageType) this.L$1;
                ResultKt.onNavigationEvent(obj);
            }
            if (Intrinsics.areEqual((Boolean) obj, access14000.onNavigationEvent(true))) {
                int i5 = IAuthTabCallback + 87;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
            v1.onExtraCallback(v1.this, this.$value);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v1(u5b u5bVar, boolean z, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Function2<? super u5b, ? super x1, Boolean> function2, float f, float f2, float f3, float f4, float f5, Function0<Unit> function0, findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(u5bVar, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.IAuthTabCallbackDefault = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.onExtraCallbackWithResult = function2;
        this.onMinimized = f;
        this.onActivityLayout = f2;
        this.writeTypedObject = f3;
        this.ICustomTabsCallbackDefault = f4;
        this.readTypedObject = f5;
        this.IAuthTabCallbackStub = function0;
        this.onNavigationEvent = findresandmsg;
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Boolean.valueOf(v1.onWarmupCompleted(this.f$0));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(v1.onWarmupCompleted(this.f$0));
                int i3 = IAuthTabCallback + 59;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return boolValueOf;
            }
        });
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(u5bVar, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onRelationshipValidationResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(u8.onExtraCallbackWithResult(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onPostMessage = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                v1 v1Var = this.f$0;
                if (i3 == 0) {
                    return v1.onExtraCallbackWithResult(v1Var);
                }
                v1.onExtraCallbackWithResult(v1Var);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onUnminimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.onMessageChannelReady = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(Float.NaN);
        this.ICustomTabsCallbackStubProxy = new transformAsync();
        this.extraCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.getInterfaceDescriptor = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onActivityResized = new inflateMenu();
        this.extraCallbackWithResult = new inflateMenu();
    }

    public static final /* synthetic */ boolean IAuthTabCallback(v1 v1Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zWriteTypedObject = v1Var.writeTypedObject();
        int i4 = isEngagementSignalsApiAvailable + 41;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zWriteTypedObject;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        v1Var.IAuthTabCallback(zBooleanValue);
        int i4 = isEngagementSignalsApiAvailable + 79;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ boolean asInterface(v1 v1Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 103;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = v1Var.access000;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        u5b u5bVar = (u5b) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        v1Var.onWarmupCompleted(u5bVar);
        if (i3 == 0) {
            throw null;
        }
        int i4 = isEngagementSignalsApiAvailable + 39;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onExtraCallback(v1 v1Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 31;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = v1Var.IAuthTabCallbackDefault;
        int i5 = i2 + 49;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdanm9dm2eewl4vrptnjmesfjqky4;
    }

    public static final /* synthetic */ u5b onExtraCallback(v1 v1Var, u5b u5bVar, boolean z, x1 x1Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 89;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        u5b u5bVarOnWarmupCompleted = v1Var.onWarmupCompleted(u5bVar, z, x1Var);
        int i4 = ICustomTabsCallbackStub + 75;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return u5bVarOnWarmupCompleted;
    }

    public static final /* synthetic */ void onExtraCallback(v1 v1Var, u5b u5bVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 39;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(v1Var, u5bVar);
        int i4 = isEngagementSignalsApiAvailable + 29;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(v1 v1Var, u5b u5bVar, x1 x1Var, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = v1Var.onExtraCallbackWithResult(u5bVar, x1Var, (access13800<? super Unit>) access13800Var);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(v1 v1Var, float f) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 93;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        v1Var.onWarmupCompleted(f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(v1 v1Var, float f, boolean z, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {v1Var, Float.valueOf(f), Boolean.valueOf(z), access13800Var};
        Object objIAuthTabCallback = IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -24660039, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 24660049);
        int i4 = ICustomTabsCallbackStub + 65;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onNavigationEvent(v1 v1Var, long j, onItemClicked onitemclicked, long j2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 87;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = v1Var.onExtraCallback(j, (onItemClicked<setUseCaseAttached>) onitemclicked, j2, (access13800<? super Unit>) access13800Var);
        int i4 = isEngagementSignalsApiAvailable + 89;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public static final /* synthetic */ u5b onNavigationEvent(v1 v1Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 101;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            return v1Var.readTypedObject();
        }
        v1Var.readTypedObject();
        throw null;
    }

    public static final /* synthetic */ getThumbPosition onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 35;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getThumbPosition<setUseCaseAttached> getthumbposition = onWarmupCompleted;
        int i5 = i2 + 17;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return getthumbposition;
        }
        throw null;
    }

    public static final /* synthetic */ u5b onWarmupCompleted(v1 v1Var, u5b u5bVar, x1 x1Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        u5b u5bVarOnExtraCallback = v1Var.onExtraCallback(u5bVar, x1Var);
        int i4 = ICustomTabsCallbackStub + 105;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return u5bVarOnExtraCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(v1 v1Var, long j) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 77;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        v1Var.onWarmupCompleted(j);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(v1 v1Var, Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 67;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        v1Var.IAuthTabCallbackStubProxy = f;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 61;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        float f = this.onMinimized;
        int i5 = i3 + 113;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 35;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        float f = v1Var.onActivityLayout;
        if (i3 != 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onTransact() {
        float f;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 117;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        if (i2 % 2 == 0) {
            f = this.writeTypedObject;
            int i4 = 74 / 0;
        } else {
            f = this.writeTypedObject;
        }
        int i5 = i3 + 31;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onTransact(v1 v1Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 111;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
            if (v1Var.onNavigationEvent() == u5b.Hidden) {
                if (v1Var.IAuthTabCallbackDefault() <= 0.0f) {
                    int i4 = ICustomTabsCallbackStub + 55;
                    isEngagementSignalsApiAvailable = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
            }
        } else if (v1Var.onNavigationEvent() == u5b.Hidden) {
        }
        int i6 = ICustomTabsCallbackStub + 21;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static final VirtualCameraCaptureResult IAuthTabCallbackStub(v1 v1Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = v1Var.IAuthTabCallbackDefault.onExtraCallbackWithResult(v1Var.onMinimized);
        float f = iOnExtraCallbackWithResult << 1;
        VirtualCameraCaptureResult virtualCameraCaptureResultOnExtraCallback = VirtualCameraCaptureResult.onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, RangesKt.coerceAtLeast(Math.round(((Float) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 2090623178, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -2090623173)).floatValue() - f), 0), 0, RangesKt.coerceAtLeast(Math.round(v1Var.IAuthTabCallbackDefault() - f), 0), 5, (Object) null));
        int i4 = ICustomTabsCallbackStub + 13;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return virtualCameraCaptureResultOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 java.lang.Float) = (r1v4 java.lang.Float), (r1v13 java.lang.Float) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean writeTypedObject() {
        Float f;
        float fFloatValue;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            f = this.IAuthTabCallbackStubProxy;
            int i3 = 7 / 0;
            fFloatValue = f != null ? f.floatValue() : 0.0f;
        } else {
            f = this.IAuthTabCallbackStubProxy;
            if (f != null) {
            }
        }
        if (fFloatValue >= 0.0f) {
            return false;
        }
        int i4 = ICustomTabsCallbackStub + 75;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 105;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            u5b u5bVar = v1Var.IAuthTabCallback_Parcel;
            if (u5bVar != null) {
                int i4 = i2 + 67;
                isEngagementSignalsApiAvailable = i4 % 128;
                int i5 = i4 % 2;
                if (u5bVar.compareTo(u5b.PartiallyExpanded) <= 0) {
                    return false;
                }
            }
            return true;
        }
        u5b u5bVar2 = v1Var.IAuthTabCallback_Parcel;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(v1 v1Var, u5b u5bVar, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub;
        int i4 = i3 + 121;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 81;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            u5bVar = u5b.PartiallyExpanded;
            if (i7 == 0) {
                int i8 = 94 / 0;
            }
        }
        Object objOnNavigationEvent = v1Var.onNavigationEvent(u5bVar, (access13800<? super Unit>) access13800Var);
        int i9 = isEngagementSignalsApiAvailable + 27;
        ICustomTabsCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(@NotNull u5b u5bVar, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        if (u5bVar == u5b.Hidden) {
            throw new IllegalArgumentException("show 함수의 value는 Hidden이 될 수 없어요.");
        }
        this.IAuthTabCallback_Parcel = null;
        maybeUpdateAnimatable.onNavigationEvent(this.onNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(null), 3, (Object) null);
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(u5bVar, (x1) null, access13800Var);
        if (objOnExtraCallbackWithResult == access14300.onWarmupCompleted()) {
            int i2 = ICustomTabsCallbackStub + 97;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            return objOnExtraCallbackWithResult;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 47;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = v1.this.new getInterfaceDescriptor(access13800Var);
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return getinterfacedescriptor;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 97 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getInterfaceDescriptor getinterfacedescriptorCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                getinterfacedescriptorCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = getinterfacedescriptorCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 63 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = IAuthTabCallback + 61;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b11.onExtraCallbackWithResult(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Object[] objArr = {v1.this, true};
            v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -245379002, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 245379010);
            Unit unit = Unit.INSTANCE;
            int i9 = onWarmupCompleted + 111;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallback(v1 v1Var, x1 x1Var, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 117;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            x1Var = x1.Companion.IAuthTabCallback();
        }
        Object objIAuthTabCallback = v1Var.IAuthTabCallback(x1Var, (access13800<? super Unit>) access13800Var);
        int i4 = isEngagementSignalsApiAvailable + 11;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull x1 x1Var, @NotNull access13800<? super Unit> access13800Var) {
        asInterface asinterface;
        int i = 2 % 2;
        boolean z = true;
        if (!(!(access13800Var instanceof asInterface))) {
            asinterface = (asInterface) access13800Var;
            int i2 = asinterface.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = isEngagementSignalsApiAvailable + 49;
                ICustomTabsCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                asinterface.label = i2 - 2147483648;
            } else {
                asinterface = new asInterface(access13800Var);
            }
        }
        Object obj = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = asinterface.label;
        if (i5 != 0) {
            int i6 = isEngagementSignalsApiAvailable + 97;
            ICustomTabsCallbackStub = i6 % 128;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i7 = isEngagementSignalsApiAvailable + 43;
            ICustomTabsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        } else {
            ResultKt.onNavigationEvent(obj);
            u5b u5bVar = u5b.Hidden;
            asinterface.L$0 = access15400.onNavigationEvent(x1Var);
            asinterface.label = 1;
            if (onExtraCallbackWithResult(u5bVar, x1Var, (access13800<? super Unit>) asinterface) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        if (onNavigationEvent() == u5b.Hidden) {
            int i9 = ICustomTabsCallbackStub + 25;
            isEngagementSignalsApiAvailable = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        IAuthTabCallback(z);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        x1 x1VarIAuthTabCallback = (x1) objArr[1];
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 119;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            int i5 = i3 + 103;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            x1VarIAuthTabCallback = x1.Companion.IAuthTabCallback();
            int i7 = isEngagementSignalsApiAvailable + 115;
            ICustomTabsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        return v1Var.onWarmupCompleted(x1VarIAuthTabCallback, access13800Var);
    }

    public final Object onWarmupCompleted(@NotNull x1 x1Var, @NotNull access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        u5b u5bVarOnExtraCallback = onExtraCallback(onNavigationEvent(), (x1) null);
        if (u5bVarOnExtraCallback == null || (objOnExtraCallbackWithResult = onExtraCallbackWithResult(u5bVarOnExtraCallback, x1Var, access13800Var)) != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i4 = isEngagementSignalsApiAvailable + 97;
        int i5 = i4 % 128;
        ICustomTabsCallbackStub = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 85;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(@NotNull x1 x1Var, @NotNull access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        u5b u5bVarOnWarmupCompleted = onWarmupCompleted(onNavigationEvent(), true, (x1) null);
        if (u5bVarOnWarmupCompleted != null) {
            int i4 = ICustomTabsCallbackStub + 115;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallbackWithResult(u5bVarOnWarmupCompleted, x1Var, access13800Var);
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(u5bVarOnWarmupCompleted, x1Var, access13800Var);
            if (objOnExtraCallbackWithResult == access14300.onWarmupCompleted()) {
                int i5 = isEngagementSignalsApiAvailable + 107;
                ICustomTabsCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 11 / 0;
                }
                return objOnExtraCallbackWithResult;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = ICustomTabsCallbackStub + 87;
        isEngagementSignalsApiAvailable = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        float F$0;
        long J$0;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = v1.this.new access100(access13800Var);
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return access100Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 95;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return access100VarCreate.invokeSuspend(unit);
            }
            access100VarCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[PHI: r1
          0x0042: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v11 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 3;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 38 / 0;
                if (i != 0) {
                    int i5 = onWarmupCompleted;
                    int i6 = i5 + 75;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = i5 + 47;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {v1.this};
                    long jLongValue = ((Long) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1920793799, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue();
                    float fOnExtraCallback = v1.onExtraCallback(v1.this).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f));
                    long jOnWarmupCompleted = setUseCaseAttached.onWarmupCompleted(jLongValue, Float.intBitsToFloat((int) (jLongValue >> 32)) + fOnExtraCallback, 0.0f, 2, (Object) null);
                    getThumbPosition getthumbpositionOnWarmupCompleted = v1.onWarmupCompleted();
                    v1 v1Var = v1.this;
                    this.J$0 = jLongValue;
                    this.F$0 = fOnExtraCallback;
                    this.label = 1;
                    if (v1.onNavigationEvent(v1Var, jLongValue, getthumbpositionOnWarmupCompleted, jOnWarmupCompleted, this) == objOnWarmupCompleted) {
                        int i10 = onNavigationEvent + 23;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        return objOnWarmupCompleted;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void ICustomTabsCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(this.onNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new access100(null), 3, (Object) null);
        this.IAuthTabCallbackStub.invoke();
        int i2 = isEngagementSignalsApiAvailable + 33;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(float f, v1 v1Var, float f2, u7a u7aVar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 65;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(u7aVar, "");
        u7aVar.onExtraCallbackWithResult(u5b.Hidden, 0.0f);
        u7aVar.onExtraCallbackWithResult(u5b.PartiallyExpanded, Math.round(f * v1Var.readTypedObject));
        u7aVar.onExtraCallbackWithResult(u5b.Expanded, f2);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 91;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onExtraCallback(long j) {
        final float fIAuthTabCallbackDefault;
        final float fOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 121;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(VirtualCameraCaptureResult.asInterface(j));
            fIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(j);
            this.IAuthTabCallbackDefault.onExtraCallbackWithResult(this.onMinimized);
            fOnExtraCallbackWithResult = fIAuthTabCallbackDefault % 0;
            if (IAuthTabCallback().onWarmupCompleted() == fOnExtraCallbackWithResult) {
                return;
            }
        } else {
            IAuthTabCallback(VirtualCameraCaptureResult.asInterface(j));
            fIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(j);
            fOnExtraCallbackWithResult = fIAuthTabCallbackDefault - (this.IAuthTabCallbackDefault.onExtraCallbackWithResult(this.onMinimized) << 1);
            if (IAuthTabCallback().onWarmupCompleted() == fOnExtraCallbackWithResult) {
                return;
            }
        }
        IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1256701932, new Object[]{this, u8.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 49;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = v1.IAuthTabCallback(fIAuthTabCallbackDefault, this, fOnExtraCallbackWithResult, (u7a) obj);
                int i6 = onNavigationEvent + 81;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        })}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1256701925);
        maybeUpdateAnimatable.onNavigationEvent(this.onNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(null), 3, (Object) null);
        int i3 = ICustomTabsCallbackStub + 63;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = v1.this.new IAuthTabCallback_Parcel(access13800Var);
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback_Parcel;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 119;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 91 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 49;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 29;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = v1.this;
                float fOnExtraCallbackWithResult = v1Var.IAuthTabCallback().onExtraCallbackWithResult(v1.this.onNavigationEvent());
                boolean zAsInterface = v1.asInterface(v1.this);
                this.label = 1;
                if (v1.onNavigationEvent(v1Var, fOnExtraCallbackWithResult, true ^ zAsInterface, (access13800) this) == objOnWarmupCompleted) {
                    int i8 = IAuthTabCallback + 87;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 35 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i10 = IAuthTabCallback + 123;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 17;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        int i5 = i3 % 2;
        this.ICustomTabsCallback = i;
        int i6 = i4 + 27;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final long onNavigationEvent(long j) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j));
        if (fIntBitsToFloat < 0.0f) {
            u5b u5bVarOnExtraCallback = onExtraCallback(onNavigationEvent(), x1.onWarmupCompleted.onExtraCallback);
            this.IAuthTabCallbackStubProxy = Float.valueOf(fIntBitsToFloat);
            if (u5bVarOnExtraCallback != null) {
                onWarmupCompleted(u5bVarOnExtraCallback);
                onExtraCallbackWithResult(onNavigationEvent(this, IAuthTabCallbackDefault() - fIntBitsToFloat, u5bVarOnExtraCallback, null, 2, null));
                return j;
            }
        }
        if (readTypedObject() == null || fIntBitsToFloat <= 0.0f) {
            return setUseCaseAttached.Companion.IAuthTabCallback();
        }
        int i4 = ICustomTabsCallbackStub + 79;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        this.IAuthTabCallbackStubProxy = Float.valueOf(fIntBitsToFloat);
        onWarmupCompleted(readTypedObject());
        float fIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        u5b typedObject = readTypedObject();
        Intrinsics.checkNotNull(typedObject);
        onExtraCallbackWithResult(onNavigationEvent(this, fIAuthTabCallbackDefault - fIntBitsToFloat, typedObject, null, 2, null));
        int i6 = ICustomTabsCallbackStub + 19;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
        return j;
    }

    public final long onNavigationEvent(long j, long j2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (Float.intBitsToFloat((int) j) == 0.0f) {
            int i2 = isEngagementSignalsApiAvailable + 41;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j2));
            if (fIntBitsToFloat > 0.0f) {
                u5b u5bVarOnWarmupCompleted = onWarmupCompleted(onNavigationEvent(), false, (x1) x1.onWarmupCompleted.onExtraCallback);
                this.IAuthTabCallbackStubProxy = Float.valueOf(fIntBitsToFloat);
                if (u5bVarOnWarmupCompleted != null) {
                    onWarmupCompleted(u5bVarOnWarmupCompleted);
                    onExtraCallbackWithResult(onNavigationEvent(this, IAuthTabCallbackDefault() - fIntBitsToFloat, u5bVarOnWarmupCompleted, null, 2, null));
                    return j2;
                }
            }
            if (fIntBitsToFloat < 0.0f) {
                u5b u5bVarOnExtraCallback = onExtraCallback(onNavigationEvent(), x1.onWarmupCompleted.onExtraCallback);
                this.IAuthTabCallbackStubProxy = Float.valueOf(fIntBitsToFloat);
                if (u5bVarOnExtraCallback != null) {
                    onWarmupCompleted(u5bVarOnExtraCallback);
                    onExtraCallbackWithResult(onNavigationEvent(this, IAuthTabCallbackDefault() - fIntBitsToFloat, u5bVarOnExtraCallback, null, 2, null));
                    int i4 = isEngagementSignalsApiAvailable + 73;
                    ICustomTabsCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                }
                return j2;
            }
        }
        return setUseCaseAttached.Companion.IAuthTabCallback();
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        Object L$0;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = v1.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 70 / 0;
            }
            int i5 = IAuthTabCallback + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 80 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r1
          0x0045: PHI (r1v13 java.lang.Object) = (r1v4 java.lang.Object), (r1v16 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r4
          0x0025: PHI (r4v1 int) = (r4v0 int), (r4v7 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 3;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 45 / 0;
                if (i != 0) {
                    int i5 = IAuthTabCallback + 65;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0 ? i != 1 : i != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    if (v1.onNavigationEvent(v1.this) != null) {
                        int i6 = onExtraCallback + 31;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            v1.this.IAuthTabCallback().onExtraCallbackWithResult(v1.this.IAuthTabCallbackDefault(), v1.IAuthTabCallback(v1.this));
                            throw null;
                        }
                        u5b u5bVarOnExtraCallbackWithResult = v1.this.IAuthTabCallback().onExtraCallbackWithResult(v1.this.IAuthTabCallbackDefault(), v1.IAuthTabCallback(v1.this));
                        if (u5bVarOnExtraCallbackWithResult != null) {
                            v1 v1Var = v1.this;
                            float fOnExtraCallbackWithResult = v1Var.IAuthTabCallback().onExtraCallbackWithResult(u5bVarOnExtraCallbackWithResult);
                            this.L$0 = access15400.onNavigationEvent(u5bVarOnExtraCallbackWithResult);
                            this.label = 1;
                            if (v1.onNavigationEvent(v1Var, fOnExtraCallbackWithResult, true, (access13800) this) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        }
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            v1.onWarmupCompleted(v1.this, (Float) null);
            Object[] objArr = {v1.this, null};
            v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1583380084, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1583380085);
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 25;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        float fIAuthTabCallback;
        v1 v1Var = (v1) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        Object obj = null;
        if (v1Var.onExtraCallback()) {
            int i2 = isEngagementSignalsApiAvailable + 13;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return Long.valueOf(RequestOptionConfig1.Companion.onExtraCallback());
            }
            RequestOptionConfig1.Companion.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        if (v1Var.readTypedObject() != null) {
            int i3 = isEngagementSignalsApiAvailable + 11;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            fIAuthTabCallback = RequestOptionConfig1.IAuthTabCallback(jLongValue);
        } else {
            int i5 = isEngagementSignalsApiAvailable + 115;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            fIAuthTabCallback = 0.0f;
        }
        maybeUpdateAnimatable.onNavigationEvent(v1Var.onNavigationEvent, (CoroutineContext) null, (setRandomHost) null, v1Var.new IAuthTabCallbackStubProxy(null), 3, (Object) null);
        return Long.valueOf(RequestOptionConfigBuilder.onNavigationEvent(RequestOptionConfig1.onWarmupCompleted(jLongValue), fIAuthTabCallback));
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        HandlerScheduledExecutorService2 handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
        v1Var.asBinder = handlerScheduledExecutorService2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(v1Var.onNavigationEvent, (CoroutineContext) null, (setRandomHost) null, v1Var.new IAuthTabCallbackDefault(null), 3, (Object) null);
        int i2 = ICustomTabsCallbackStub + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = v1.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onExtraCallbackWithResult + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = v1.this;
                Object obj2 = null;
                getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null);
                this.label = 1;
                if (v1.onExtraCallback(v1Var, 0.98f, getthumbpositionOnExtraCallback, 0.0f, this, 4, null) == objOnWarmupCompleted) {
                    int i3 = onExtraCallback;
                    int i4 = i3 + 91;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    int i5 = i3 + 105;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 51 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = onExtraCallback + 83;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(@NotNull HandlerScheduledExecutorService2 handlerScheduledExecutorService2) {
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
        HandlerScheduledExecutorService2 handlerScheduledExecutorService22 = this.asBinder;
        if (handlerScheduledExecutorService22 == null) {
            return;
        }
        this.ICustomTabsCallbackStubProxy.IAuthTabCallback(handlerScheduledExecutorService2.IAuthTabCallbackStubProxy(), handlerScheduledExecutorService2.IAuthTabCallback());
        long jIAuthTabCallback = DirectExecutor.IAuthTabCallback(handlerScheduledExecutorService2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jIAuthTabCallback >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jIAuthTabCallback);
        long jLongValue = ((Long) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1920793799, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue();
        int i2 = (int) jLongValue;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        long jIAuthTabCallback2 = handlerScheduledExecutorService2.IAuthTabCallback();
        if (fIntBitsToFloat3 < 0.0f) {
            jIAuthTabCallback2 = setUseCaseAttached.onExtraCallbackWithResult(jIAuthTabCallback2, jLongValue);
            int i3 = ICustomTabsCallbackStub + 89;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
        }
        float fFloatValue = ((Float) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 2090623178, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -2090623173)).floatValue();
        float fIAuthTabCallbackDefault = IAuthTabCallbackDefault() * 0.1f;
        if (fIntBitsToFloat2 < 0.0f) {
            int i5 = ICustomTabsCallbackStub + 49;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 == 0) {
                Math.abs(Float.intBitsToFloat(i2));
                throw null;
            }
            if (Math.abs(Float.intBitsToFloat(i2)) < fIAuthTabCallbackDefault) {
                fIntBitsToFloat2 *= RangesKt.coerceIn((Float.intBitsToFloat(i2) / Math.min(fIAuthTabCallbackDefault, this.IAuthTabCallbackDefault.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f)))) + 1.0f, 0.1f, 1.0f);
                float fCoerceIn = RangesKt.coerceIn(Float.intBitsToFloat((int) (jLongValue >> 32)) + (fIntBitsToFloat * 0.1f), -fFloatValue, fFloatValue);
                onWarmupCompleted(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat(i2) + fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fCoerceIn) << 32)));
                handlerScheduledExecutorService2.onExtraCallback();
            }
            f = 0.0f;
        } else {
            f = 0.0f;
        }
        if ((fIntBitsToFloat2 <= f || Float.intBitsToFloat((int) jIAuthTabCallback2) <= Float.intBitsToFloat((int) handlerScheduledExecutorService22.IAuthTabCallback())) && (fIntBitsToFloat2 >= 0.0f || Float.intBitsToFloat(i2) <= 0.0f)) {
            fIntBitsToFloat2 *= 0.1f;
        }
        float fCoerceIn2 = RangesKt.coerceIn(Float.intBitsToFloat((int) (jLongValue >> 32)) + (fIntBitsToFloat * 0.1f), -fFloatValue, fFloatValue);
        onWarmupCompleted(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat(i2) + fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fCoerceIn2) << 32)));
        handlerScheduledExecutorService2.onExtraCallback();
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ long $tv;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(long j, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$tv = j;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = v1.this.new IAuthTabCallbackStub(this.$tv, access13800Var);
            iAuthTabCallbackStub.L$0 = obj;
            int i2 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
        
            if (java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) ((java.lang.Long) o.v1.IAuthTabCallback(im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1920793799, new java.lang.Object[]{r11.this$0}, im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue())) <= o.v1.onExtraCallback(r11.this$0).onExtraCallback(r11.this$0.onTransact())) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
        
            r12 = o.v1.IAuthTabCallbackStub.onNavigationEvent + 39;
            o.v1.IAuthTabCallbackStub.onExtraCallbackWithResult = r12 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
        
            if ((r12 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
        
            if (java.lang.Float.intBitsToFloat((int) r11.$tv) <= 0.0f) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
        
            if (java.lang.Float.intBitsToFloat((int) r11.$tv) <= 0.0f) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
        
            r12 = r11.this$0;
            r12 = o.v1.onExtraCallback(r12, r12.onNavigationEvent(), true, (o.x1) o.x1.onWarmupCompleted.onExtraCallback);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
        
            r12 = r11.this$0;
            r12 = o.v1.onWarmupCompleted(r12, r12.onNavigationEvent(), o.x1.onWarmupCompleted.onExtraCallback);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
        
            r12 = o.v1.IAuthTabCallbackStub.onNavigationEvent + 75;
            o.v1.IAuthTabCallbackStub.onExtraCallbackWithResult = r12 % 128;
            r12 = r12 % 2;
            r12 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
        
            if (r12 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
        
            o.maybeUpdateAnimatable.onNavigationEvent(r1, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.v1.IAuthTabCallbackStub.AnonymousClass4(r11.this$0, r12, null), 3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
        
            o.maybeUpdateAnimatable.onNavigationEvent(r1, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.v1.IAuthTabCallbackStub.AnonymousClass1(r11.this$0, null), 3, (java.lang.Object) null);
            r2 = o.v1.IAuthTabCallbackStub.onNavigationEvent + 13;
            o.v1.IAuthTabCallbackStub.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
        
            if (r12 == o.u5b.Hidden) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
        
            o.maybeUpdateAnimatable.onNavigationEvent(r1, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.v1.IAuthTabCallbackStub.AnonymousClass3(r11.this$0, null), 3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00fe, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r11.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            if (r11.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r12);
            o.maybeUpdateAnimatable.onNavigationEvent(r1, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.v1.IAuthTabCallbackStub.AnonymousClass5(r11.this$0, null), 3, (java.lang.Object) null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            findResAndMsg findresandmsg;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                int i3 = 1 / 0;
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
            }
        }

        /* renamed from: o.v1$IAuthTabCallbackStub$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            int label;
            final /* synthetic */ v1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(v1 v1Var, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = v1Var;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 17;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass5;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                IAuthTabCallback = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = onExtraCallback + 29;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return objOnExtraCallback;
                }
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 31;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = IAuthTabCallback;
                    int i4 = i3 + 61;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 125;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    v1 v1Var = this.this$0;
                    getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
                    this.label = 1;
                    if (v1.onExtraCallback(v1Var, 1.0f, getthumbpositionOnExtraCallback, 0.0f, this, 4, null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: o.v1$IAuthTabCallbackStub$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ u5b $targetValue;
            int label;
            final /* synthetic */ v1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(v1 v1Var, u5b u5bVar, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = v1Var;
                this.$targetValue = u5bVar;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass4Create.invokeSuspend(unit);
                }
                anonymousClass4Create.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$targetValue, access13800Var);
                int i2 = onNavigationEvent + 101;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass4;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 89;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 83;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    v1 v1Var = this.this$0;
                    u5b u5bVar = this.$targetValue;
                    x1.onWarmupCompleted onwarmupcompleted = x1.onWarmupCompleted.onExtraCallback;
                    this.label = 1;
                    if (v1.onExtraCallbackWithResult(v1Var, u5bVar, onwarmupcompleted, this) == objOnWarmupCompleted) {
                        int i3 = onWarmupCompleted + 115;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onWarmupCompleted + 29;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i6 = 13 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: o.v1$IAuthTabCallbackStub$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            int label;
            final /* synthetic */ v1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(v1 v1Var, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = v1Var;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                int i2 = onNavigationEvent + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 121;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return anonymousClass1Create.invokeSuspend(unit);
                }
                anonymousClass1Create.invokeSuspend(unit);
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onNavigationEvent = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    access14300.onWarmupCompleted();
                    obj2.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 != 0) {
                    int i4 = IAuthTabCallback;
                    int i5 = i4 + 85;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0 ? i3 != 1 : i3 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 69;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i7 = 84 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                } else {
                    ResultKt.onNavigationEvent(obj);
                    v1 v1Var = this.this$0;
                    u5b u5bVarOnNavigationEvent = v1Var.onNavigationEvent();
                    this.label = 1;
                    if (v1.onExtraCallbackWithResult(v1Var, u5bVarOnNavigationEvent, null, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: o.v1$IAuthTabCallbackStub$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            int label;
            final /* synthetic */ v1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(v1 v1Var, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.this$0 = v1Var;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, access13800Var);
                int i2 = onNavigationEvent + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onNavigationEvent = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                    int i3 = 5 / 0;
                } else {
                    objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                }
                int i4 = onNavigationEvent + 97;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 3;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 68 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    v1 v1Var = this.this$0;
                    long jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
                    Object obj2 = null;
                    getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
                    this.label = 1;
                    if (v1.onExtraCallbackWithResult(v1Var, jIAuthTabCallback, getthumbpositionOnExtraCallback, 0L, this, 4, null) == objOnWarmupCompleted) {
                        int i5 = onNavigationEvent + 45;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
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
    }

    static /* synthetic */ float onNavigationEvent(v1 v1Var, float f, u5b u5bVar, u5b u5bVar2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = ICustomTabsCallbackStub + 37;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
                u5bVar2 = v1Var.onNavigationEvent();
                int i4 = 76 / 0;
            } else {
                u5bVar2 = v1Var.onNavigationEvent();
            }
        }
        float fOnExtraCallbackWithResult = v1Var.onExtraCallbackWithResult(f, u5bVar, u5bVar2);
        int i5 = ICustomTabsCallbackStub + 79;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            return fOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final float onExtraCallbackWithResult(float f, u5b u5bVar, u5b u5bVar2) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 123;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = IAuthTabCallback().onExtraCallbackWithResult(u5bVar);
        float fOnExtraCallbackWithResult2 = IAuthTabCallback().onExtraCallbackWithResult(u5bVar2);
        float fCoerceIn = RangesKt.coerceIn(f, Math.min(fOnExtraCallbackWithResult, fOnExtraCallbackWithResult2), Math.max(fOnExtraCallbackWithResult, fOnExtraCallbackWithResult2));
        int i4 = ICustomTabsCallbackStub + 87;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return fCoerceIn;
    }

    private static final void onNavigationEvent(v1 v1Var, u5b u5bVar) {
        float f;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            v1Var.onNavigationEvent(u5bVar);
            f = 2.0f;
        } else {
            v1Var.onNavigationEvent(u5bVar);
            f = 0.0f;
        }
        v1Var.onExtraCallbackWithResult(f);
        v1Var.onWarmupCompleted(setUseCaseAttached.Companion.IAuthTabCallback());
        int i3 = isEngagementSignalsApiAvailable + 59;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
    
        if (IAuthTabCallback(im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -24660039, new java.lang.Object[]{r21, java.lang.Float.valueOf(r2), false, r6}, im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 24660049) != r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0190, code lost:
    
        if (onExtraCallbackWithResult(r21, r7, r4, 0, r6, 4, null) != r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d0, code lost:
    
        if (IAuthTabCallback(im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -24660039, new java.lang.Object[]{r21, java.lang.Float.valueOf(r2), false, r6}, im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 24660049) != r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020a, code lost:
    
        if (o.findRes.onExtraCallbackWithResult(r7, r6) == r10) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(u5b u5bVar, x1 x1Var, access13800<? super Unit> access13800Var) {
        onTransact ontransact;
        u5b u5bVar2 = u5bVar;
        int i = 2 % 2;
        if (!(access13800Var instanceof onTransact)) {
            ontransact = new onTransact(access13800Var);
        } else {
            ontransact = (onTransact) access13800Var;
            int i2 = ontransact.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ontransact.label = i2 - 2147483648;
                int i3 = ICustomTabsCallbackStub + 49;
                isEngagementSignalsApiAvailable = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        onTransact ontransact2 = ontransact;
        Object obj = ontransact2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = ontransact2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (x1Var != null) {
                int i6 = ICustomTabsCallbackStub + 21;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
                if (!((Boolean) this.onExtraCallbackWithResult.invoke(u5bVar2, x1Var)).booleanValue()) {
                    ICustomTabsCallback();
                    return Unit.INSTANCE;
                }
            }
            int i8 = onNavigationEvent.onNavigationEvent[u5bVar.ordinal()];
            if (i8 == 1) {
                float fOnExtraCallback = this.IAuthTabCallbackDefault.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f));
                float fIAuthTabCallbackDefault = IAuthTabCallbackDefault() + fOnExtraCallback;
                if (IAuthTabCallbackDefault() > 0.0f) {
                    asBinder asbinder = new asBinder(fIAuthTabCallbackDefault, u5bVar2, null);
                    ontransact2.L$0 = access15400.onNavigationEvent(u5bVar);
                    ontransact2.L$1 = access15400.onNavigationEvent(x1Var);
                    ontransact2.F$0 = fOnExtraCallback;
                    ontransact2.F$1 = fIAuthTabCallbackDefault;
                    ontransact2.label = 1;
                } else {
                    onNavigationEvent(this, u5bVar);
                }
            } else if (i8 != 2) {
                float fOnExtraCallbackWithResult = IAuthTabCallback().onExtraCallbackWithResult(u5bVar2);
                ontransact2.L$0 = u5bVar2;
                ontransact2.L$1 = access15400.onNavigationEvent(x1Var);
                ontransact2.label = 4;
            } else if (onNavigationEvent() == u5b.Hidden) {
                onNavigationEvent(u5bVar);
                onExtraCallbackWithResult(IAuthTabCallback().onExtraCallbackWithResult(u5bVar2));
                float fOnExtraCallback2 = this.IAuthTabCallbackDefault.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f));
                onWarmupCompleted(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fOnExtraCallback2) & 4294967295L)));
                long jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
                updateFocusedState updatefocusedstateOnNavigationEvent = r8lambdaFP1Wedqhw_3GpPb7HzEjaomLQYM.onNavigationEvent(AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, null, 24, null), 0, 1, null);
                ontransact2.L$0 = access15400.onNavigationEvent(u5bVar);
                ontransact2.L$1 = access15400.onNavigationEvent(x1Var);
                ontransact2.label = 2;
            } else {
                float fOnExtraCallbackWithResult2 = IAuthTabCallback().onExtraCallbackWithResult(u5bVar2);
                ontransact2.L$0 = u5bVar2;
                ontransact2.L$1 = access15400.onNavigationEvent(x1Var);
                ontransact2.label = 3;
            }
            return objOnWarmupCompleted;
        }
        int i9 = isEngagementSignalsApiAvailable + 45;
        int i10 = i9 % 128;
        ICustomTabsCallbackStub = i10;
        if (i9 % 2 == 0 ? i5 == 1 : i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        if (i5 == 2) {
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        int i11 = i10 + 55;
        int i12 = i11 % 128;
        isEngagementSignalsApiAvailable = i12;
        int i13 = i11 % 2;
        if (i5 == 3) {
            u5bVar2 = (u5b) ontransact2.L$0;
            ResultKt.onNavigationEvent(obj);
            onNavigationEvent(u5bVar2);
        } else {
            if (i5 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = i12 + 71;
            ICustomTabsCallbackStub = i14 % 128;
            int i15 = i14 % 2;
            u5bVar2 = (u5b) ontransact2.L$0;
            ResultKt.onNavigationEvent(obj);
            int i16 = ICustomTabsCallbackStub + 41;
            isEngagementSignalsApiAvailable = i16 % 128;
            int i17 = i16 % 2;
            onNavigationEvent(u5bVar2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws NoWhenBranchMatchedException {
        onExtraCallbackWithResult onextracallbackwithresult;
        final v1 v1Var = (v1) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        onExtraCallbackWithResult onextracallbackwithresult2 = (access13800) objArr[3];
        int i = 2 % 2;
        if (onextracallbackwithresult2 instanceof onExtraCallbackWithResult) {
            int i2 = ICustomTabsCallbackStub + 57;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult = onextracallbackwithresult2;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = isEngagementSignalsApiAvailable + 47;
                ICustomTabsCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    onextracallbackwithresult.label = i4 * Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i4 - 2147483648;
                }
            } else {
                onextracallbackwithresult = v1Var.new onExtraCallbackWithResult(onextracallbackwithresult2);
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult;
        Object obj = onextracallbackwithresult3.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onextracallbackwithresult3.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (v1Var.onExtraCallback(fFloatValue)) {
                int i7 = isEngagementSignalsApiAvailable + 85;
                ICustomTabsCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    return Unit.INSTANCE;
                }
                int i8 = 5 / 0;
                return Unit.INSTANCE;
            }
            v1Var.onNavigationEvent(true);
            float fIAuthTabCallbackDefault = v1Var.IAuthTabCallbackDefault();
            Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 13;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        v1.IAuthTabCallback(zBooleanValue, v1Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = v1.IAuthTabCallback(zBooleanValue, v1Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    int i11 = onExtraCallback + 43;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    return unitIAuthTabCallback;
                }
            };
            onextracallbackwithresult3.F$0 = fFloatValue;
            onextracallbackwithresult3.Z$0 = zBooleanValue;
            onextracallbackwithresult3.label = 1;
            if (getShowText.onWarmupCompleted(fIAuthTabCallbackDefault, fFloatValue, 0.0f, (onItemClicked) null, function2, onextracallbackwithresult3, 12, (Object) null) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = ICustomTabsCallbackStub + 111;
            isEngagementSignalsApiAvailable = i9 % 128;
            int i10 = i9 % 2;
            ResultKt.onNavigationEvent(obj);
        }
        if (v1Var.ICustomTabsCallback + (v1Var.IAuthTabCallbackDefault.onExtraCallbackWithResult(v1Var.onMinimized) * 2.0f) < v1Var.IAuthTabCallbackDefault()) {
            int i11 = ICustomTabsCallbackStub + 101;
            isEngagementSignalsApiAvailable = i11 % 128;
            int i12 = i11 % 2;
            u5b u5bVarOnExtraCallback = v1Var.onExtraCallback(v1Var.onNavigationEvent(), x1.onWarmupCompleted.onExtraCallback);
            if (u5bVarOnExtraCallback != null && v1Var.IAuthTabCallback().IAuthTabCallback(u5bVarOnExtraCallback)) {
                int i13 = isEngagementSignalsApiAvailable + 41;
                ICustomTabsCallbackStub = i13 % 128;
                int i14 = i13 % 2;
                v1Var.IAuthTabCallback_Parcel = u5b.PartiallyExpanded;
            }
        } else {
            v1Var.IAuthTabCallback_Parcel = null;
        }
        v1Var.onNavigationEvent(false);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object onExtraCallback(v1 v1Var, float f, onItemClicked onitemclicked, float f2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 125;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 4) != 0) {
            f2 = v1Var.IAuthTabCallbackStub();
            int i4 = isEngagementSignalsApiAvailable + 17;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 5;
            }
        }
        return v1Var.onNavigationEvent(f, (onItemClicked<Float>) onitemclicked, f2, (access13800<? super Unit>) access13800Var);
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ onItemClicked<Float> $animationSpec;
        final /* synthetic */ float $initialScale;
        final /* synthetic */ float $targetScale;
        int label;
        final /* synthetic */ v1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(float f, float f2, onItemClicked<Float> onitemclicked, v1 v1Var, access13800<? super IAuthTabCallback> access13800Var) {
            super(1, access13800Var);
            this.$initialScale = f;
            this.$targetScale = f2;
            this.$animationSpec = onitemclicked;
            this.this$0 = v1Var;
        }

        public static /* synthetic */ Unit onNavigationEvent(v1 v1Var, float f, float f2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(v1Var, f, f2);
            int i4 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$initialScale, this.$targetScale, this.$animationSpec, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                return onExtraCallback(access13800Var);
            }
            onExtraCallback(access13800Var);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onExtraCallbackWithResult(v1 v1Var, float f, float f2) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                v1.onExtraCallbackWithResult(v1Var, f);
                unit = Unit.INSTANCE;
                int i3 = 86 / 0;
            } else {
                v1.onExtraCallbackWithResult(v1Var, f);
                unit = Unit.INSTANCE;
            }
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                float f = this.$initialScale;
                float f2 = this.$targetScale;
                onItemClicked<Float> onitemclicked = this.$animationSpec;
                final v1 v1Var = this.this$0;
                Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$animateScaleTo$2$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 71;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnNavigationEvent = v1.IAuthTabCallback.onNavigationEvent(v1Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        int i7 = onExtraCallbackWithResult + 71;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 82 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                this.label = 1;
                if (getShowText.onWarmupCompleted(f, f2, 0.0f, onitemclicked, function2, this, 4, (Object) null) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 107;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final Object onNavigationEvent(float f, onItemClicked<Float> onitemclicked, float f2, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objIAuthTabCallback = inflateMenu.IAuthTabCallback(this.onActivityResized, (isOverflowMenuShowing) null, new IAuthTabCallback(f2, f, onitemclicked, this, null), access13800Var, 1, (Object) null);
        if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 113;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return objIAuthTabCallback;
    }

    static /* synthetic */ Object onExtraCallbackWithResult(v1 v1Var, long j, onItemClicked onitemclicked, long j2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = ICustomTabsCallbackStub + 9;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
                int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                ((Long) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -1920793799, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue();
                throw null;
            }
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            j2 = ((Long) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent4, -1920793799, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue();
        }
        Object objOnExtraCallback = v1Var.onExtraCallback(j, (onItemClicked<setUseCaseAttached>) onitemclicked, j2, (access13800<? super Unit>) access13800Var);
        int i4 = isEngagementSignalsApiAvailable + 89;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ onItemClicked<setUseCaseAttached> $animationSpec;
        final /* synthetic */ long $initialOffset;
        final /* synthetic */ long $targetOffset;
        int label;
        final /* synthetic */ v1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(long j, long j2, onItemClicked<setUseCaseAttached> onitemclicked, v1 v1Var, access13800<? super onWarmupCompleted> access13800Var) {
            super(1, access13800Var);
            this.$initialOffset = j;
            this.$targetOffset = j2;
            this.$animationSpec = onitemclicked;
            this.this$0 = v1Var;
        }

        public static /* synthetic */ Unit onNavigationEvent(v1 v1Var, setUseCaseAttached setusecaseattached, setUseCaseAttached setusecaseattached2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(v1Var, setusecaseattached, setusecaseattached2);
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$initialOffset, this.$targetOffset, this.$animationSpec, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
            int i5 = onWarmupCompleted + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objIAuthTabCallback;
        }

        private static final Unit IAuthTabCallback(v1 v1Var, setUseCaseAttached setusecaseattached, setUseCaseAttached setusecaseattached2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            v1.onWarmupCompleted(v1Var, setusecaseattached.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(setUseCaseAttached.Companion);
                setUseCaseAttached setusecaseattachedOnNavigationEvent = setUseCaseAttached.onNavigationEvent(this.$initialOffset);
                setUseCaseAttached setusecaseattachedOnNavigationEvent2 = setUseCaseAttached.onNavigationEvent(this.$targetOffset);
                onItemClicked<setUseCaseAttached> onitemclicked = this.$animationSpec;
                final v1 v1Var = this.this$0;
                Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$animateOffsetTo$2$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallback + 59;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnNavigationEvent = v1.onWarmupCompleted.onNavigationEvent(v1Var, (setUseCaseAttached) obj2, (setUseCaseAttached) obj3);
                        int i6 = onExtraCallback + 77;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                };
                this.label = 1;
                if (getShowText.onExtraCallbackWithResult(getthumbtintlistIAuthTabCallback, setusecaseattachedOnNavigationEvent, setusecaseattachedOnNavigationEvent2, (Object) null, onitemclicked, function2, this, 8, (Object) null) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 1;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 81;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final Object onExtraCallback(long j, onItemClicked<setUseCaseAttached> onitemclicked, long j2, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objIAuthTabCallback = inflateMenu.IAuthTabCallback(this.extraCallbackWithResult, (isOverflowMenuShowing) null, new onWarmupCompleted(j2, j, onitemclicked, this, null), access13800Var, 1, (Object) null);
        if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i2 = ICustomTabsCallbackStub + 93;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 3;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return objIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(u5b u5bVar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 35;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        if (onNavigationEvent() != u5bVar) {
            int i4 = ICustomTabsCallbackStub + 55;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 == 0) {
                int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 33231657, new Object[]{this, u5bVar}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -33231657);
                throw null;
            }
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent4, 33231657, new Object[]{this, u5bVar}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -33231657);
            int i5 = ICustomTabsCallbackStub + 99;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final u5b onExtraCallback(u5b u5bVar, x1 x1Var) throws NoWhenBranchMatchedException {
        u5b u5bVar2;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent.onNavigationEvent[u5bVar.ordinal()];
        if (i4 == 1) {
            u5bVar2 = u5b.PartiallyExpanded;
        } else if (i4 == 2) {
            u5bVar2 = u5b.Expanded;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = isEngagementSignalsApiAvailable + 89;
            int i6 = i5 % 128;
            ICustomTabsCallbackStub = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 69;
            isEngagementSignalsApiAvailable = i8 % 128;
            int i9 = i8 % 2;
            u5bVar2 = null;
        }
        return IAuthTabCallback(u5bVar2, x1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final u5b onWarmupCompleted(u5b u5bVar, boolean z, x1 x1Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.onNavigationEvent[u5bVar.ordinal()];
        u5b u5bVar2 = null;
        if (i2 != 1) {
            int i3 = isEngagementSignalsApiAvailable;
            int i4 = i3 + 109;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = i3 + 7;
                ICustomTabsCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    u5b u5bVar3 = u5b.PartiallyExpanded;
                    throw null;
                }
                u5bVar2 = u5b.PartiallyExpanded;
            } else if (z) {
                u5bVar2 = u5b.Hidden;
            }
        }
        u5b u5bVarIAuthTabCallback = IAuthTabCallback(u5bVar2, x1Var);
        int i7 = isEngagementSignalsApiAvailable + 33;
        ICustomTabsCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 78 / 0;
        }
        return u5bVarIAuthTabCallback;
    }

    private final u5b IAuthTabCallback(u5b u5bVar, x1 x1Var) {
        boolean zIAuthTabCallback;
        int i = 2 % 2;
        if (u5bVar == null) {
            return null;
        }
        u5b u5bVar2 = this.IAuthTabCallback_Parcel;
        if (u5bVar2 != null) {
            Intrinsics.checkNotNull(u5bVar2);
            zIAuthTabCallback = u5bVar.compareTo(u5bVar2) <= 0;
        } else {
            zIAuthTabCallback = IAuthTabCallback().IAuthTabCallback(u5bVar);
        }
        if (zIAuthTabCallback) {
            int i2 = isEngagementSignalsApiAvailable + 21;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!(!(x1Var != null ? ((Boolean) this.onExtraCallbackWithResult.invoke(u5bVar, x1Var)).booleanValue() : true))) {
                int i3 = isEngagementSignalsApiAvailable + 117;
                ICustomTabsCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    return u5bVar;
                }
                throw null;
            }
        }
        return null;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 113;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            if (this.access000 != z) {
                this.access000 = z;
                return;
            }
            int i4 = i2 + 101;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            return Float.isNaN(f);
        }
        Float.isNaN(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean onNavigationEvent(u5b u5bVar, x1 x1Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(u5bVar, x1Var);
            }
            onWarmupCompleted(u5bVar, x1Var);
            throw null;
        }

        public static /* synthetic */ Pair onWarmupCompleted(InternalCameraPresenceListener internalCameraPresenceListener, v1 v1Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Pair pairOnNavigationEvent = onNavigationEvent(internalCameraPresenceListener, v1Var);
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return pairOnNavigationEvent;
        }

        public static /* synthetic */ v1 onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Function2 function2, float f, float f2, float f3, float f4, float f5, Function0 function0, findResAndMsg findresandmsg, Pair pair) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            v1 v1VarOnExtraCallback = onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, function2, f, f2, f3, f4, f5, function0, findresandmsg, pair);
            int i4 = onExtraCallback + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return v1VarOnExtraCallback;
            }
            throw null;
        }

        private static final boolean onWarmupCompleted(u5b u5bVar, x1 x1Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(u5bVar, "");
            Intrinsics.checkNotNullParameter(x1Var, "");
            int i4 = onNavigationEvent + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        private onExtraCallback() {
        }

        public final getCaptureIds<v1, Pair<u5b, Boolean>> onExtraCallbackWithResult(@NotNull final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull final Function2<? super u5b, ? super x1, Boolean> function2, final float f, final float f2, final float f3, final float f4, final float f5, @NotNull final Function0<Unit> function0, @NotNull final findResAndMsg findresandmsg) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            getCaptureIds<v1, Pair<u5b, Boolean>> getcaptureidsOnWarmupCompleted = ImmediateSurface.onWarmupCompleted(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$Companion$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 81;
                    onExtraCallbackWithResult = i3 % 128;
                    InternalCameraPresenceListener internalCameraPresenceListener = (InternalCameraPresenceListener) obj;
                    v1 v1Var = (v1) obj2;
                    if (i3 % 2 == 0) {
                        v1.onExtraCallback.onWarmupCompleted(internalCameraPresenceListener, v1Var);
                        throw null;
                    }
                    Pair pairOnWarmupCompleted = v1.onExtraCallback.onWarmupCompleted(internalCameraPresenceListener, v1Var);
                    int i4 = IAuthTabCallback + 121;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return pairOnWarmupCompleted;
                }
            }, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2State$Companion$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 19;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    v1 v1VarOnWarmupCompleted = v1.onExtraCallback.onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, function2, f, f2, f3, f4, f5, function0, findresandmsg, (Pair) obj);
                    int i5 = onExtraCallback + 85;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return v1VarOnWarmupCompleted;
                    }
                    throw null;
                }
            });
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return getcaptureidsOnWarmupCompleted;
        }

        private static final Pair onNavigationEvent(InternalCameraPresenceListener internalCameraPresenceListener, v1 v1Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
                Intrinsics.checkNotNullParameter(v1Var, "");
                return getWrite.IAuthTabCallback(v1Var.onNavigationEvent(), Boolean.valueOf(v1Var.access100()));
            }
            Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
            Intrinsics.checkNotNullParameter(v1Var, "");
            getWrite.IAuthTabCallback(v1Var.onNavigationEvent(), Boolean.valueOf(v1Var.access100()));
            throw null;
        }

        private static final v1 onExtraCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Function2 function2, float f, float f2, float f3, float f4, float f5, Function0 function0, findResAndMsg findresandmsg, Pair pair) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(pair, "");
            v1 v1Var = new v1((u5b) pair.onExtraCallbackWithResult(), ((Boolean) pair.IAuthTabCallback()).booleanValue(), r8lambdanm9dm2eewl4vrptnjmesfjqky4, function2, f, f2, f3, f4, f5, function0, findresandmsg, null);
            int i2 = onExtraCallback + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 70 / 0;
            }
            return v1Var;
        }
    }

    static {
        int i = ICustomTabsService + 103;
        mayLaunchUrl = i % 128;
        int i2 = i % 2;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.access100.onExtraCallbackWithResult()).booleanValue();
        int i4 = isEngagementSignalsApiAvailable + 113;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return zBooleanValue;
    }

    public final u5b onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 91;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        u5b u5bVar = (u5b) this.onTransact.onExtraCallbackWithResult();
        int i4 = ICustomTabsCallbackStub + 89;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return u5bVar;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        u5b u5bVar = (u5b) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 31;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            v1Var.onTransact.IAuthTabCallback(u5bVar);
            return null;
        }
        v1Var.onTransact.IAuthTabCallback(u5bVar);
        throw null;
    }

    public final boolean access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 49;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean zBooleanValue = ((Boolean) this.onRelationshipValidationResult.onExtraCallbackWithResult()).booleanValue();
            int i3 = isEngagementSignalsApiAvailable + 47;
            ICustomTabsCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                return zBooleanValue;
            }
            obj.hashCode();
            throw null;
        }
        ((Boolean) this.onRelationshipValidationResult.onExtraCallbackWithResult()).booleanValue();
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onRelationshipValidationResult.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = isEngagementSignalsApiAvailable + 105;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onRelationshipValidationResult.IAuthTabCallback(Boolean.valueOf(z));
        throw null;
    }

    public final u7ExternalSyntheticLambda0<u5b> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 57;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            u7ExternalSyntheticLambda0<u5b> u7externalsyntheticlambda0 = (u7ExternalSyntheticLambda0) this.IAuthTabCallback.onExtraCallbackWithResult();
            int i3 = isEngagementSignalsApiAvailable + 95;
            ICustomTabsCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
            }
            return u7externalsyntheticlambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        long jOnExtraCallback;
        v1 v1Var = (v1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 49;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            jOnExtraCallback = ((VirtualCameraCaptureResult) v1Var.onPostMessage.onExtraCallbackWithResult()).onExtraCallback();
            int i3 = 1 / 0;
        } else {
            jOnExtraCallback = ((VirtualCameraCaptureResult) v1Var.onPostMessage.onExtraCallbackWithResult()).onExtraCallback();
        }
        int i4 = isEngagementSignalsApiAvailable + 81;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(jOnExtraCallback);
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = v1Var.onUnminimized.onNavigationEvent();
        int i4 = isEngagementSignalsApiAvailable + 87;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(fOnNavigationEvent);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            this.onUnminimized.onNavigationEvent(f);
        } else {
            this.onUnminimized.onNavigationEvent(f);
            throw null;
        }
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            float fOnNavigationEvent = this.onMessageChannelReady.onNavigationEvent();
            int i3 = isEngagementSignalsApiAvailable + 91;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return fOnNavigationEvent;
        }
        this.onMessageChannelReady.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onMessageChannelReady.onNavigationEvent(f);
        int i4 = isEngagementSignalsApiAvailable + 5;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 13;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            float fOnNavigationEvent = this.extraCallback.onNavigationEvent();
            int i3 = ICustomTabsCallbackStub + 27;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 != 0) {
                return fOnNavigationEvent;
            }
            throw null;
        }
        this.extraCallback.onNavigationEvent();
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 71;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback.onNavigationEvent(f);
        int i4 = ICustomTabsCallbackStub + 31;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.getInterfaceDescriptor.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(j));
        int i4 = isEngagementSignalsApiAvailable + 1;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            boolean zBooleanValue = ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
            int i3 = isEngagementSignalsApiAvailable + 53;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return zBooleanValue;
        }
        ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = isEngagementSignalsApiAvailable + 39;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final u5b readTypedObject() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        u5b u5bVar = (u5b) this.asInterface.onExtraCallbackWithResult();
        int i4 = isEngagementSignalsApiAvailable + 97;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return u5bVar;
        }
        throw null;
    }

    private final void onWarmupCompleted(u5b u5bVar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 51;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.IAuthTabCallback(u5bVar);
        int i4 = ICustomTabsCallbackStub + 67;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    private static final boolean onNavigationEvent(u5b u5bVar, x1 x1Var) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Boolean) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1794805771, new Object[]{u5bVar, x1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1794805768)).booleanValue();
    }

    public static final /* synthetic */ void onWarmupCompleted(v1 v1Var, u5b u5bVar) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -1583380084, new Object[]{v1Var, u5bVar}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1583380085);
    }

    public static final /* synthetic */ void IAuthTabCallback(v1 v1Var, boolean z) {
        Object[] objArr = {v1Var, Boolean.valueOf(z)};
        IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -245379002, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 245379010);
    }

    private final Object onNavigationEvent(float f, boolean z, access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, Float.valueOf(f), Boolean.valueOf(z), access13800Var};
        return IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -24660039, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 24660049);
    }

    private static final Unit onNavigationEvent(boolean z, v1 v1Var, float f, float f2) {
        Object[] objArr = {Boolean.valueOf(z), v1Var, Float.valueOf(f), Float.valueOf(f2)};
        return (Unit) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 305841504, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -305841502);
    }

    public static /* synthetic */ Object onWarmupCompleted(v1 v1Var, x1 x1Var, access13800 access13800Var, int i, Object obj) {
        Object[] objArr = {v1Var, x1Var, access13800Var, Integer.valueOf(i), obj};
        return IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 31988466, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -31988451);
    }

    private final void onExtraCallback(u7ExternalSyntheticLambda0<u5b> u7externalsyntheticlambda0) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1256701932, new Object[]{this, u7externalsyntheticlambda0}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1256701925);
    }

    private final void IAuthTabCallback(u5b u5bVar) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 33231657, new Object[]{this, u5bVar}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -33231657);
    }

    public final long onExtraCallbackWithResult() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -1920793799, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue();
    }

    public final long asBinder() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -686488743, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 686488755)).longValue();
    }

    public final float IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Float) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 824688114, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -824688103)).floatValue();
    }

    public final float access000() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Float) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 2090623178, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -2090623173)).floatValue();
    }

    public final boolean getInterfaceDescriptor() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Boolean) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1825017447, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1825017433)).booleanValue();
    }

    public final void extraCallback() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -348646617, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 348646630);
    }

    public final void onNavigationEvent(@NotNull HandlerScheduledExecutorService2 handlerScheduledExecutorService2) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 103405104, new Object[]{this, handlerScheduledExecutorService2}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -103405098);
    }

    public final long onExtraCallbackWithResult(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        return ((Long) IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 881506872, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -881506863)).longValue();
    }
}
