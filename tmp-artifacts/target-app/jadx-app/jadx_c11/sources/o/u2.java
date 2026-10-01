package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.t7ExternalSyntheticLambda0;
import o.u2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u2 {
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private final getSupportedHighSpeedResolutions IAuthTabCallback;
    private final findResAndMsg IAuthTabCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub;
    private final inflateMenu IAuthTabCallbackStubProxy;
    private final CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> IAuthTabCallback_Parcel;
    private t7ExternalSyntheticLambda0.onExtraCallback access000;
    private t7ExternalSyntheticLambda0.onExtraCallback access100;
    private final boolean asBinder;
    private final getSupportedHighSpeedResolutions asInterface;
    private final CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> getInterfaceDescriptor;
    private final getSupportedHighSpeedResolutions onExtraCallback;
    private final getSupportedHighSpeedResolutions onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutions onNavigationEvent;
    private final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onTransact;
    private final getSupportedHighSpeedResolutions onWarmupCompleted;

    public /* synthetic */ u2(boolean z, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f, onextracallback, z2);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = (~(i | i4)) | i6;
        int i8 = ~i;
        int i9 = ~((~i6) | i8 | i4);
        int i10 = (~(i4 | i6)) | (~(i8 | (~i4)));
        int i11 = i + i6 + i2 + (1616745821 * i5) + (2077170981 * i3);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i) + 1587019776 + (806482222 * i6) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i2) + ((-395313152) * i5) + (904921088 * i3) + (345505792 * i12);
        int i14 = (i * (-1558553916)) + 318941677 + (i6 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i2 * (-1558553459)) + (i5 * 397062201) + (i3 * 609114465) + (i12 * (-138936320));
        switch (i13 + (i14 * i14 * 1630011392)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                u2 u2Var = (u2) objArr[0];
                int i15 = 2 % 2;
                int i16 = readTypedObject + 81;
                writeTypedObject = i16 % 128;
                int i17 = i16 % 2;
                float fAccess100 = u2Var.access100();
                int i18 = readTypedObject + 115;
                writeTypedObject = i18 % 128;
                int i19 = i18 % 2;
                return Float.valueOf(fAccess100);
            case 7:
                return asInterface(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private u2(boolean z, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda62, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z2) {
        float f2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda62, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.IAuthTabCallbackDefault = findresandmsg;
        this.IAuthTabCallback_Parcel = cameraPresenceProviderExternalSyntheticLambda6;
        this.getInterfaceDescriptor = cameraPresenceProviderExternalSyntheticLambda62;
        this.onTransact = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.asBinder = z2;
        this.onNavigationEvent = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.onExtraCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.onWarmupCompleted = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        if (z) {
            f2 = 1.0f;
        } else {
            int i = readTypedObject + 75;
            writeTypedObject = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            f2 = 0.0f;
        }
        this.onExtraCallbackWithResult = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f2);
        this.access000 = onextracallback;
        this.access100 = onextracallback;
        this.asInterface = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        if (Intrinsics.areEqual(onextracallback, t7ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback.onWarmupCompleted)) {
            if (IAuthTabCallbackStubProxy() >= 1.0f) {
                onExtraCallback(1.0f, onextracallback);
                int i4 = writeTypedObject + 9;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
            } else {
                onExtraCallback(0.0f, onextracallback);
            }
            int i6 = 2 % 2;
        } else {
            int i7 = writeTypedObject + 23;
            readTypedObject = i7 % 128;
            if (i7 % 2 != 0) {
                onTransact(1.0f);
                onExtraCallback(0.0f, onextracallback);
                if (z2) {
                    int i8 = readTypedObject + 35;
                    writeTypedObject = i8 % 128;
                    int i9 = i8 % 2;
                    onExtraCallback(onextracallback);
                }
            } else {
                onTransact(0.0f);
                onExtraCallback(0.0f, onextracallback);
                if (z2) {
                }
            }
        }
        this.IAuthTabCallbackStubProxy = new inflateMenu();
        int i10 = readTypedObject + 95;
        writeTypedObject = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(u2 u2Var, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        u2Var.onTransact(f);
        int i4 = writeTypedObject + 61;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        u2 u2Var = (u2) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            u2Var.IAuthTabCallbackStubProxy();
            throw null;
        }
        float fIAuthTabCallbackStubProxy = u2Var.IAuthTabCallbackStubProxy();
        int i3 = readTypedObject + 107;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return Float.valueOf(fIAuthTabCallbackStubProxy);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        u2 u2Var = (u2) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        u2Var.IAuthTabCallback(fFloatValue);
        int i4 = readTypedObject + 75;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(u2 u2Var, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        u2Var.asInterface(f);
        int i4 = readTypedObject + 59;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ inflateMenu onWarmupCompleted(u2 u2Var) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        inflateMenu inflatemenu = u2Var.IAuthTabCallbackStubProxy;
        int i5 = i3 + 57;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return inflatemenu;
    }

    public static final /* synthetic */ void onWarmupCompleted(u2 u2Var, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        u2Var.IAuthTabCallbackDefault(f);
        int i4 = readTypedObject + 79;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 35;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.onTransact;
        int i4 = i2 + 49;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdanm9dm2eewl4vrptnjmesfjqky4;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.asBinder;
        int i4 = i3 + 25;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        u2 u2Var = (u2) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fAccess000 = u2Var.access000();
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = writeTypedObject + 5;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return Float.valueOf(fAccess000);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        u2 u2Var = (u2) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return Float.valueOf(u2Var.ICustomTabsCallback());
        }
        u2Var.ICustomTabsCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = writeTypedObject + 1;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback_Parcel;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        u2 u2Var = (u2) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float interfaceDescriptor = u2Var.getInterfaceDescriptor();
        int i4 = writeTypedObject + 37;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(interfaceDescriptor);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float asBinder() {
        float fIAuthTabCallbackStubProxy;
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            fIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            int i3 = 35 / 0;
        } else {
            fIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        }
        int i4 = writeTypedObject + 13;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return fIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ void IAuthTabCallback(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = writeTypedObject;
            int i4 = i3 + 109;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            t7ExternalSyntheticLambda0.onExtraCallback onextracallback2 = u2Var.access000;
            int i6 = i3 + 45;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            onextracallback = onextracallback2;
        }
        u2Var.onExtraCallback(onextracallback);
    }

    public final void onExtraCallback(@NotNull t7ExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onExtraCallback(onextracallback, 0);
        int i4 = writeTypedObject + 51;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = readTypedObject + 17;
        int i5 = i4 % 128;
        writeTypedObject = i5;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            onextracallback = u2Var.access000;
            int i6 = i5 + 125;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        u2Var.onExtraCallback(onextracallback, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int $delayMillis;
        final /* synthetic */ t7ExternalSyntheticLambda0.onExtraCallback $transition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$transition = onextracallback;
            this.$delayMillis = i;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = u2.this.new IAuthTabCallback(this.$transition, this.$delayMillis, access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 89 / 0;
            }
            int i5 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objIAuthTabCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.u2$IAuthTabCallback$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ findResAndMsg $$this$launch;
            final /* synthetic */ int $delayMillis;
            final /* synthetic */ t7ExternalSyntheticLambda0.onExtraCallback $transition;
            int I$0;
            int label;
            final /* synthetic */ u2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i, findResAndMsg findresandmsg, u2 u2Var, access13800<? super AnonymousClass1> access13800Var) {
                super(1, access13800Var);
                this.$transition = onextracallback;
                this.$delayMillis = i;
                this.$$this$launch = findresandmsg;
                this.this$0 = u2Var;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transition, this.$delayMillis, this.$$this$launch, this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 91;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass1;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                IAuthTabCallback = i2 % 128;
                access13800<? super Unit> access13800Var = (access13800) obj;
                if (i2 % 2 != 0) {
                    onWarmupCompleted(access13800Var);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = onWarmupCompleted(access13800Var);
                int i3 = onNavigationEvent + 119;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 77;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* renamed from: o.u2$IAuthTabCallback$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00681 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ t7ExternalSyntheticLambda0.onExtraCallback $transition;
                int label;
                final /* synthetic */ u2 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00681(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, access13800<? super C00681> access13800Var) {
                    super(2, access13800Var);
                    this.this$0 = u2Var;
                    this.$transition = onextracallback;
                }

                public static /* synthetic */ Unit onWarmupCompleted(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, float f, float f2) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 21;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnExtraCallback = onExtraCallback(u2Var, onextracallback, f, f2);
                    int i4 = onWarmupCompleted + 79;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C00681 c00681 = new C00681(this.this$0, this.$transition, access13800Var);
                    int i2 = onWarmupCompleted + 105;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return c00681;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 97;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                    int i4 = onWarmupCompleted + 45;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }

                public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 57;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    C00681 c00681Create = create(findresandmsg, access13800Var);
                    if (i3 == 0) {
                        return c00681Create.invokeSuspend(Unit.INSTANCE);
                    }
                    c00681Create.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }

                private static final Unit onExtraCallback(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, float f, float f2) {
                    Unit unit;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 9;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        u2.onExtraCallback(u2Var, f);
                        t6 t6VarOnWarmupCompleted = onextracallback.onWarmupCompleted(u2Var, f);
                        u2.onWarmupCompleted(u2Var, t6VarOnWarmupCompleted.onWarmupCompleted());
                        Object[] objArr = {u2Var, Float.valueOf(t6VarOnWarmupCompleted.IAuthTabCallback())};
                        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                        u2.onWarmupCompleted(1915903953, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), -1915903950);
                        u2.onNavigationEvent(u2Var, t6VarOnWarmupCompleted.onNavigationEvent());
                        unit = Unit.INSTANCE;
                        int i3 = 54 / 0;
                    } else {
                        u2.onExtraCallback(u2Var, f);
                        t6 t6VarOnWarmupCompleted2 = onextracallback.onWarmupCompleted(u2Var, f);
                        u2.onWarmupCompleted(u2Var, t6VarOnWarmupCompleted2.onWarmupCompleted());
                        Object[] objArr2 = {u2Var, Float.valueOf(t6VarOnWarmupCompleted2.IAuthTabCallback())};
                        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
                        u2.onWarmupCompleted(1915903953, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), -1915903950);
                        u2.onNavigationEvent(u2Var, t6VarOnWarmupCompleted2.onNavigationEvent());
                        unit = Unit.INSTANCE;
                    }
                    int i4 = onWarmupCompleted + 53;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 != 0) {
                        int i3 = onWarmupCompleted;
                        int i4 = i3 + 71;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = i3 + 117;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            ResultKt.onNavigationEvent(obj);
                            int i7 = 24 / 0;
                        } else {
                            ResultKt.onNavigationEvent(obj);
                        }
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        Object[] objArr = {this.this$0};
                        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                        float fFloatValue = ((Float) u2.onWarmupCompleted(-1966700591, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), 1966700591)).floatValue();
                        updateFocusedState updatefocusedstateOnExtraCallback = this.$transition.onExtraCallback(0);
                        final u2 u2Var = this.this$0;
                        final t7ExternalSyntheticLambda0.onExtraCallback onextracallback = this.$transition;
                        Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1State$showAfterDelay$1$1$1$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i8 = 2 % 2;
                                int i9 = onExtraCallbackWithResult + 15;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                Unit unitOnWarmupCompleted = u2.IAuthTabCallback.AnonymousClass1.C00681.onWarmupCompleted(u2Var, onextracallback, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                                int i11 = onExtraCallbackWithResult + 5;
                                IAuthTabCallback = i11 % 128;
                                int i12 = i11 % 2;
                                return unitOnWarmupCompleted;
                            }
                        };
                        this.label = 1;
                        if (getShowText.onWarmupCompleted(fFloatValue, 1.0f, 0.0f, updatefocusedstateOnExtraCallback, function2, this, 4, (Object) null) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    int i8 = onExtraCallback + 59;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 9 / 0;
                    }
                    return unit;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
            
                if (o.formatMsgs.onWarmupCompleted(r9, r8) == r1) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
            
                if (o.formatMsgs.onWarmupCompleted(r9, r8) == r1) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
            
                return r1;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 23;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(this.$transition.onExtraCallbackWithResult() + this.$delayMillis, 0);
                    if (iCoerceAtLeast > 0) {
                        int i5 = onNavigationEvent + 23;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            this.I$0 = iCoerceAtLeast;
                            this.label = 0;
                        } else {
                            this.I$0 = iCoerceAtLeast;
                            this.label = 1;
                        }
                    }
                }
                maybeUpdateAnimatable.onNavigationEvent(this.$$this$launch, (CoroutineContext) null, (setRandomHost) null, new C00681(this.this$0, this.$transition, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r1 r3
          0x0048: PHI (r1v9 o.findResAndMsg) = (r1v5 o.findResAndMsg), (r1v12 o.findResAndMsg) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0048: PHI (r3v2 java.lang.Object) = (r3v0 java.lang.Object), (r3v5 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r4
          0x002c: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            findResAndMsg findresandmsg;
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 32 / 0;
                if (i != 0) {
                    int i5 = onNavigationEvent + 77;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0 ? i != 1 : i != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    Object obj2 = objOnWarmupCompleted;
                    ResultKt.onNavigationEvent(obj);
                    inflateMenu inflatemenuOnWarmupCompleted = u2.onWarmupCompleted(u2.this);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transition, this.$delayMillis, findresandmsg, u2.this, null);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.label = 1;
                    if (inflateMenu.IAuthTabCallback(inflatemenuOnWarmupCompleted, (isOverflowMenuShowing) null, anonymousClass1, this, 1, (Object) null) == obj2) {
                        return obj2;
                    }
                }
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(@NotNull t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.access100 = onextracallback;
        maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackDefault, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(onextracallback, i, null), 3, (Object) null);
        ((Function0) this.IAuthTabCallback_Parcel.onExtraCallbackWithResult()).invoke();
        int i3 = readTypedObject + 113;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = readTypedObject;
        int i4 = i3 + 29;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            onextracallback = u2Var.access100;
            int i6 = i3 + 27;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        onWarmupCompleted(-1274455836, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var, onextracallback}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1274455837);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        u2 u2Var = (u2) objArr[0];
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback = (t7ExternalSyntheticLambda0.onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
        }
        u2Var.onExtraCallbackWithResult(onextracallback, 0);
        int i3 = readTypedObject + 65;
        writeTypedObject = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ int $delayMillis;
        final /* synthetic */ t7ExternalSyntheticLambda0.onExtraCallback $transition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$transition = onextracallback;
            this.$delayMillis = i;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 56 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = u2.this.new onNavigationEvent(this.$transition, this.$delayMillis, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.u2$onNavigationEvent$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ findResAndMsg $$this$launch;
            final /* synthetic */ int $delayMillis;
            final /* synthetic */ t7ExternalSyntheticLambda0.onExtraCallback $transition;
            int I$0;
            int label;
            final /* synthetic */ u2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i, findResAndMsg findresandmsg, u2 u2Var, access13800<? super AnonymousClass3> access13800Var) {
                super(1, access13800Var);
                this.$transition = onextracallback;
                this.$delayMillis = i;
                this.$$this$launch = findresandmsg;
                this.this$0 = u2Var;
            }

            public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 1;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$transition, this.$delayMillis, this.$$this$launch, this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
                int i4 = onExtraCallback + 87;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 32 / 0;
                }
                return objIAuthTabCallback;
            }

            /* renamed from: o.u2$onNavigationEvent$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                final /* synthetic */ t7ExternalSyntheticLambda0.onExtraCallback $transition;
                int label;
                final /* synthetic */ u2 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, access13800<? super AnonymousClass2> access13800Var) {
                    super(2, access13800Var);
                    this.this$0 = u2Var;
                    this.$transition = onextracallback;
                }

                public static /* synthetic */ Unit onExtraCallback(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, float f, float f2) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 59;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnNavigationEvent = onNavigationEvent(u2Var, onextracallback, f, f2);
                    if (i3 == 0) {
                        int i4 = 38 / 0;
                    }
                    return unitOnNavigationEvent;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$transition, access13800Var);
                    int i2 = onExtraCallbackWithResult + 125;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass2;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 15;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                    int i4 = onExtraCallback + 13;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnNavigationEvent;
                    }
                    throw null;
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 101;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallbackWithResult + 63;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }

                private static final Unit onNavigationEvent(u2 u2Var, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, float f, float f2) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 89;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    u2.onExtraCallback(u2Var, f);
                    t6 t6VarOnWarmupCompleted = onextracallback.onWarmupCompleted(u2Var, f);
                    u2.onWarmupCompleted(u2Var, t6VarOnWarmupCompleted.onWarmupCompleted());
                    Object[] objArr = {u2Var, Float.valueOf(t6VarOnWarmupCompleted.IAuthTabCallback())};
                    int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                    u2.onWarmupCompleted(1915903953, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), -1915903950);
                    u2.onNavigationEvent(u2Var, t6VarOnWarmupCompleted.onNavigationEvent());
                    Unit unit = Unit.INSTANCE;
                    int i4 = onExtraCallbackWithResult + 65;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 != 0) {
                        int i3 = onExtraCallbackWithResult + 39;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        Object[] objArr = {this.this$0};
                        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                        float fFloatValue = ((Float) u2.onWarmupCompleted(-1966700591, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), 1966700591)).floatValue();
                        updateFocusedState updatefocusedstateOnExtraCallback = this.$transition.onExtraCallback(0);
                        final u2 u2Var = this.this$0;
                        final t7ExternalSyntheticLambda0.onExtraCallback onextracallback = this.$transition;
                        Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1State$hideAfterDelay$1$1$1$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i4 = 2 % 2;
                                int i5 = onWarmupCompleted + 81;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                Unit unitOnExtraCallback = u2.onNavigationEvent.AnonymousClass3.AnonymousClass2.onExtraCallback(u2Var, onextracallback, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                                int i7 = IAuthTabCallback + 43;
                                onWarmupCompleted = i7 % 128;
                                int i8 = i7 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        this.label = 1;
                        if (getShowText.onWarmupCompleted(fFloatValue, 0.0f, 0.0f, updatefocusedstateOnExtraCallback, function2, this, 4, (Object) null) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    int i4 = onExtraCallback + 97;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 47;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallback + 123;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(this.$transition.onExtraCallbackWithResult() + this.$delayMillis, 0);
                    if (iCoerceAtLeast > 0) {
                        this.I$0 = iCoerceAtLeast;
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(iCoerceAtLeast, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                }
                maybeUpdateAnimatable.onNavigationEvent(this.$$this$launch, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass2(this.this$0, this.$transition, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[PHI: r4
          0x002e: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:9:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[PHI: r1 r3
          0x0020: PHI (r1v9 o.findResAndMsg) = (r1v5 o.findResAndMsg), (r1v12 o.findResAndMsg) binds: [B:9:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0020: PHI (r3v1 java.lang.Object) = (r3v0 java.lang.Object), (r3v4 java.lang.Object) binds: [B:9:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            findResAndMsg findresandmsg;
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 41;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 77 / 0;
                if (i == 0) {
                    Object obj2 = objOnWarmupCompleted;
                    ResultKt.onNavigationEvent(obj);
                    inflateMenu inflatemenuOnWarmupCompleted = u2.onWarmupCompleted(u2.this);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$transition, this.$delayMillis, findresandmsg, u2.this, null);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.label = 1;
                    if (inflateMenu.IAuthTabCallback(inflatemenuOnWarmupCompleted, (isOverflowMenuShowing) null, anonymousClass3, this, 1, (Object) null) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onExtraCallback + 93;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i6 != 0) {
                        int i7 = 99 / 0;
                    }
                }
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull t7ExternalSyntheticLambda0.onExtraCallback onextracallback, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackDefault, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(onextracallback, i, null), 3, (Object) null);
        ((Function0) this.getInterfaceDescriptor.onExtraCallbackWithResult()).invoke();
        int i3 = writeTypedObject + 1;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(f);
        int i4 = readTypedObject + 123;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    public final void IAuthTabCallback(@NotNull t7ExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.access000 = onextracallback;
        int i4 = writeTypedObject + 31;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    public final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asBinder(f);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 55;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted(float f, @NotNull t7ExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.access100 = onextracallback;
        onExtraCallback(f, onextracallback);
        onTransact(f);
        int i4 = readTypedObject + 21;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            if (Float.isNaN(((Float) onWarmupCompleted(-885106954, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 885106959)).floatValue())) {
                return 0.0f;
            }
            int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = alertWithArgs.onExtraCallbackWithResult();
            onNavigationEvent(((Float) onWarmupCompleted(678381487, iOnExtraCallbackWithResult5, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult6, -678381480)).floatValue() + f);
            int iOnExtraCallbackWithResult7 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult8 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult9 = alertWithArgs.onExtraCallbackWithResult();
            float fAbs = Math.abs(((Float) onWarmupCompleted(678381487, iOnExtraCallbackWithResult8, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult7, iOnExtraCallbackWithResult9, -678381480)).floatValue());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.onTransact;
            int iOnExtraCallbackWithResult10 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult11 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult12 = alertWithArgs.onExtraCallbackWithResult();
            if (fAbs > Math.abs(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(((Float) onWarmupCompleted(-885106954, iOnExtraCallbackWithResult11, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult10, iOnExtraCallbackWithResult12, 885106959)).floatValue()))) {
                if (f > 0.0f) {
                    onExtraCallback(new t7ExternalSyntheticLambda0.onExtraCallback.C0066onExtraCallback(false, null, 0, 7, null));
                    int i3 = readTypedObject + 55;
                    writeTypedObject = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    Object[] objArr = {this, new t7ExternalSyntheticLambda0.onExtraCallback.C0066onExtraCallback(false, null, 0, 7, null)};
                    int iOnExtraCallbackWithResult13 = alertWithArgs.onExtraCallbackWithResult();
                    onWarmupCompleted(-1274455836, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult13, alertWithArgs.onExtraCallbackWithResult(), 1274455837);
                }
            }
            return 0.0f;
        }
        int iOnExtraCallbackWithResult14 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult15 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult16 = alertWithArgs.onExtraCallbackWithResult();
        Float.isNaN(((Float) onWarmupCompleted(-885106954, iOnExtraCallbackWithResult15, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult14, iOnExtraCallbackWithResult16, 885106959)).floatValue());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(1.0f);
        } else {
            onNavigationEvent(0.0f);
        }
        int i3 = readTypedObject + 123;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
        return 0.0f;
    }

    private final void onExtraCallback(float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        t6 t6VarOnWarmupCompleted = onextracallback.onWarmupCompleted(this, f);
        IAuthTabCallbackDefault(t6VarOnWarmupCompleted.onWarmupCompleted());
        IAuthTabCallback(t6VarOnWarmupCompleted.IAuthTabCallback());
        asInterface(t6VarOnWarmupCompleted.onNavigationEvent());
        int i4 = writeTypedObject + 9;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final float access000() {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        int i4 = writeTypedObject + 83;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void asBinder(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.onNavigationEvent(f);
            int i3 = 16 / 0;
        } else {
            this.onNavigationEvent.onNavigationEvent(f);
        }
        int i4 = writeTypedObject + 23;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final float ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).IAuthTabCallback();
            int i3 = writeTypedObject + 103;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                return fIAuthTabCallback;
            }
            throw null;
        }
        ((VirtualCameraControlExternalSyntheticLambda1) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).IAuthTabCallback();
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
        int i4 = writeTypedObject + 7;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
        int i4 = writeTypedObject + 17;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void IAuthTabCallbackDefault(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.IAuthTabCallback.onNavigationEvent(f);
            int i3 = readTypedObject + 5;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.IAuthTabCallback.onNavigationEvent(f);
        throw null;
    }

    private final float access100() {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
        int i4 = readTypedObject + 27;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.onNavigationEvent(f);
            int i3 = readTypedObject + 45;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onExtraCallback.onNavigationEvent(f);
        throw null;
    }

    private final float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
        int i4 = writeTypedObject + 81;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void asInterface(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(f);
        int i4 = readTypedObject + 29;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
            return this.onExtraCallbackWithResult.onNavigationEvent();
        }
        return this.onExtraCallbackWithResult.onNavigationEvent();
    }

    private final void onTransact(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onNavigationEvent(f);
        int i4 = readTypedObject + 83;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        u2 u2Var = (u2) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = u2Var.asInterface.onNavigationEvent();
        int i4 = readTypedObject + 23;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fOnNavigationEvent);
    }

    private final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.onNavigationEvent(f);
        int i4 = writeTypedObject + 125;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ float onExtraCallbackWithResult(u2 u2Var) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(-1966700591, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1966700591)).floatValue();
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(u2 u2Var, float f) {
        Object[] objArr = {u2Var, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        onWarmupCompleted(1915903953, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), -1915903950);
    }

    private final float asInterface() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(678381487, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -678381480)).floatValue();
    }

    public final float onExtraCallback() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(-865984870, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 865984876)).floatValue();
    }

    public final float onNavigationEvent() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(-576215392, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 576215396)).floatValue();
    }

    public final float IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(-1424808820, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1424808822)).floatValue();
    }

    public final float IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(-885106954, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 885106959)).floatValue();
    }

    public final void onWarmupCompleted(@NotNull t7ExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        onWarmupCompleted(-1274455836, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{this, onextracallback}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1274455837);
    }
}
