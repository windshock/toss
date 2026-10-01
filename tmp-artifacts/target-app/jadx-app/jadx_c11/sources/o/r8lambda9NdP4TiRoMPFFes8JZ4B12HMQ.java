package o;

import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getPackageType;
import o.getSurfaceSize;
import o.r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ implements r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 {
    private static int extraCallback = 1;
    private static int readTypedObject;
    private final getSupportedHighSpeedResolutions IAuthTabCallback;
    private final findResAndMsg IAuthTabCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub;
    private final Function0<Unit> IAuthTabCallbackStubProxy;
    private final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 IAuthTabCallback_Parcel;
    private final SurfaceProcessorWithExecutorExternalSyntheticLambda1 access000;
    private final DeviceQuirksExternalSyntheticLambda0 access100;
    private final getSupportedHighSpeedResolutionsFor asBinder;
    private final getSupportedHighSpeedResolutionsFor asInterface;
    private final float getInterfaceDescriptor;
    private final getTimebase onExtraCallback;
    private final r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getHumanReadableName onTransact;
    private final isHighSpeedSupported onWarmupCompleted;
    private getPackageType writeTypedObject;

    public /* synthetic */ r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, findResAndMsg findresandmsg, r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onwarmupcompleted, getHumanReadableName gethumanreadablename, long j, Function0 function0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdanm9dm2eewl4vrptnjmesfjqky4, surfaceProcessorWithExecutorExternalSyntheticLambda1, findresandmsg, onwarmupcompleted, gethumanreadablename, j, function0, deviceQuirksExternalSyntheticLambda0, f);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i6);
        int i11 = ~i3;
        int i12 = (~(i8 | i11 | i4)) | i10;
        int i13 = (~(i6 | i11)) | (~(i7 | i11));
        int i14 = i4 + i3 + i2 + (1941422536 * i5) + ((-555707305) * i);
        int i15 = i14 * i14;
        int i16 = (i4 * (-2131549542)) + 177471488 + ((-2131549542) * i3) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i2) + ((-1363148800) * i5) + (2141716480 * i) + ((-573308928) * i15);
        int i17 = ((i4 * 487360618) - 1291405921) + (i3 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i2 * 487361161) + (i5 * (-1188264952)) + (i * 624576655) + (i15 * (-25952256));
        return i16 + ((i17 * i17) * 74186752) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, findResAndMsg findresandmsg, r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onwarmupcompleted, getHumanReadableName gethumanreadablename, long j, Function0<Unit> function0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f) {
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(surfaceProcessorWithExecutorExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        this.IAuthTabCallback_Parcel = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.access000 = surfaceProcessorWithExecutorExternalSyntheticLambda1;
        this.IAuthTabCallbackDefault = findresandmsg;
        this.onExtraCallbackWithResult = onwarmupcompleted;
        this.onTransact = gethumanreadablename;
        this.IAuthTabCallbackStubProxy = function0;
        this.access100 = deviceQuirksExternalSyntheticLambda0;
        this.getInterfaceDescriptor = f;
        Boolean bool = Boolean.FALSE;
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(j), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = removeCameraStateObserver.IAuthTabCallback(3000L);
        this.onExtraCallback = notifyPublicListeners.onWarmupCompleted(1);
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 101;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.access100;
        int i5 = i2 + 13;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return deviceQuirksExternalSyntheticLambda0;
        }
        throw null;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        int i3 = i2 % 128;
        readTypedObject = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.getInterfaceDescriptor;
        int i4 = i3 + 51;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public boolean access000() {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean typedObject = readTypedObject();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return typedObject;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        long jExtraCallback = extraCallback();
        int i4 = extraCallback + 51;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return jExtraCallback;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted asBinder() {
        r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            onwarmupcompleted = this.onExtraCallbackWithResult;
            int i4 = 65 / 0;
        } else {
            onwarmupcompleted = this.onExtraCallbackWithResult;
        }
        int i5 = i3 + 89;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = access100();
        int i4 = readTypedObject + 125;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jAccess100;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public long asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback();
        }
        ICustomTabsCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i3 = extraCallback + 67;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return iIAuthTabCallback_Parcel;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public getHumanReadableName onTransact() {
        int i = 2 % 2;
        int i2 = readTypedObject + 41;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zWriteTypedObject = writeTypedObject();
        int i4 = readTypedObject + 113;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zWriteTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public float onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float interfaceDescriptor = getInterfaceDescriptor();
        int i4 = readTypedObject + 81;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public void onExtraCallbackWithResult(long j, float f, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(f);
        onNavigationEvent(true);
        onExtraCallbackWithResult(z);
        onExtraCallbackWithResult(j);
        getPackageType getpackagetype = this.writeTypedObject;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i4 = extraCallback + 27;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        this.writeTypedObject = maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackDefault, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(j, this, null), 3, (Object) null);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ long $duration;
        int label;
        final /* synthetic */ r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(long j, r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ r8lambda9ndp4tirompffes8jz4b12hmq, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$duration = j;
            this.this$0 = r8lambda9ndp4tirompffes8jz4b12hmq;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$duration, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 11;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 37;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                long j = this.$duration;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 67;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 27 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4.IAuthTabCallback(this.this$0, false, false, 3, null);
            return Unit.INSTANCE;
        }
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public void onExtraCallbackWithResult(boolean z, boolean z2) {
        int i = 2 % 2;
        onExtraCallbackWithResult(z2);
        onNavigationEvent(false);
        getPackageType getpackagetype = this.writeTypedObject;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i2 = readTypedObject + 25;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        this.writeTypedObject = null;
        Function0<Unit> function0 = this.IAuthTabCallbackStubProxy;
        if (function0 != null) {
            function0.invoke();
        }
        int i4 = extraCallback + 59;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        Object obj = null;
        if (z) {
            int i2 = readTypedObject;
            int i3 = i2 + 15;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            getPackageType getpackagetype = this.writeTypedObject;
            if (getpackagetype != null) {
                int i5 = i2 + 91;
                extraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                    return;
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                    return;
                }
            }
            return;
        }
        IAuthTabCallbackStubProxy();
        int i6 = readTypedObject + 55;
        extraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 123;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (i4 == 0) {
            onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1631606110, 1631606110, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr);
        } else {
            onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1631606110, 1631606110, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr);
            int i5 = 90 / 0;
        }
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public void onWarmupCompleted(@NotNull String str, long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback(((int) (((int) (SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(this.access000, str, onTransact(), 0, false, 0, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1020, (Object) null).asBinder() >> 32)) / Float.intBitsToFloat((int) (j >> 32)))) + 1);
        int i4 = extraCallback + 123;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, Float.valueOf(f)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1599290371, -1599290370, iOnExtraCallback3, iOnExtraCallback, objArr);
            int i4 = 43 / 0;
        } else {
            onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1599290371, -1599290370, iOnExtraCallback3, iOnExtraCallback, objArr);
        }
        int i5 = extraCallback + 45;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(j);
        int i4 = readTypedObject + 61;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    @Override // o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4
    public void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(j);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 67;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean readTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
            return ((Boolean) this.asBinder.onExtraCallbackWithResult()).booleanValue();
        }
        return ((Boolean) this.asBinder.onExtraCallbackWithResult()).booleanValue();
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.asBinder.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = readTypedObject + 103;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.asBinder.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final long extraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallbackWithResult = ((ExtensionsManager1) this.asInterface.onExtraCallbackWithResult()).onExtraCallbackWithResult();
        int i4 = extraCallback + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return jOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub(long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            this.asInterface.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
            int i3 = 32 / 0;
        } else {
            this.asInterface.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        }
        int i4 = extraCallback + 47;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final long access100() {
        int i = 2 % 2;
        int i2 = extraCallback + 25;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) this.onNavigationEvent.onExtraCallbackWithResult()).access100();
        int i4 = readTypedObject + 103;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jAccess100;
    }

    private final void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(setByteOrder.onNavigationEvent(j));
        } else {
            this.onNavigationEvent.IAuthTabCallback(setByteOrder.onNavigationEvent(j));
            throw null;
        }
    }

    private final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted.onWarmupCompleted();
        }
        this.onWarmupCompleted.onWarmupCompleted();
        throw null;
    }

    private final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(j);
        int i4 = readTypedObject + 79;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
    }

    private final int IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = readTypedObject + 59;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
            return this.onExtraCallback.onWarmupCompleted();
        }
        return this.onExtraCallback.onWarmupCompleted();
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ r8lambda9ndp4tirompffes8jz4b12hmq = (r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        r8lambda9ndp4tirompffes8jz4b12hmq.onExtraCallback.onExtraCallback(iIntValue);
        int i4 = readTypedObject + 15;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return null;
    }

    private final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallback + 99;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return ((Boolean) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).booleanValue();
        }
        ((Boolean) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }

    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = extraCallback + 109;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback.onNavigationEvent();
        }
        this.IAuthTabCallback.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ r8lambda9ndp4tirompffes8jz4b12hmq = (r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambda9ndp4tirompffes8jz4b12hmq.IAuthTabCallback.onNavigationEvent(fFloatValue);
        int i4 = extraCallback + 83;
        readTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1631606110, 1631606110, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr);
    }

    private final void onExtraCallback(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1599290371, -1599290370, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr);
    }
}
