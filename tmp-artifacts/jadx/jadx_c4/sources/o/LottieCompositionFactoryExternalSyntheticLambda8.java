package o;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieCompositionFactoryExternalSyntheticLambda8 implements LottieDrawableExternalSyntheticLambda1 {
    private static int extraCallback = 0;
    private static int readTypedObject = 1;
    private final boolean IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub;
    private getPackageType IAuthTabCallbackStubProxy;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback_Parcel;
    private final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 access000;
    private final findResAndMsg access100;
    private final getSupportedHighSpeedResolutionsFor asBinder;
    private final isHighSpeedSupported asInterface;
    private final Function0<Unit> getInterfaceDescriptor;
    private final LottieCompositionFactoryExternalSyntheticLambda7 onExtraCallback;
    private final getTimebase onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutions onNavigationEvent;
    private final isHighSpeedSupported onTransact;
    private final isHighSpeedSupported onWarmupCompleted;
    private getPackageType writeTypedObject;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | (~i4) | i5)) | (~(i5 | i6 | i4));
        int i10 = ~i5;
        int i11 = (~(i4 | i6)) | (~(i10 | i4)) | (~(i10 | i6));
        int i12 = i5 + i6 + i + (1698977638 * i3) + (1466394737 * i2);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i5) - 490274816) + ((-1116082190) * i6) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i) + (1553727488 * i3) + (1859780608 * i2) + (925827072 * i13);
        int i15 = ((i5 * (-1787956080)) - 1478154965) + (i6 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i * (-1787955639)) + (i3 * 552005654) + (i2 * (-2013897159)) + (i13 * (-429457408));
        int i16 = i14 + (i15 * i15 * (-402587648));
        if (i16 != 1) {
            return i16 != 2 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
        }
        LottieCompositionFactoryExternalSyntheticLambda8 lottieCompositionFactoryExternalSyntheticLambda8 = (LottieCompositionFactoryExternalSyntheticLambda8) objArr[0];
        int i17 = 2 % 2;
        int i18 = extraCallback + 61;
        readTypedObject = i18 % 128;
        int i19 = i18 % 2;
        boolean zBooleanValue = ((Boolean) lottieCompositionFactoryExternalSyntheticLambda8.IAuthTabCallback_Parcel.onExtraCallbackWithResult()).booleanValue();
        int i20 = extraCallback + 53;
        readTypedObject = i20 % 128;
        int i21 = i20 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return 500;
    }

    public LottieCompositionFactoryExternalSyntheticLambda8(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, boolean z, @NotNull findResAndMsg findresandmsg, int i, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.access000 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.onExtraCallback = lottieCompositionFactoryExternalSyntheticLambda7;
        this.IAuthTabCallback = z;
        this.access100 = findresandmsg;
        this.getInterfaceDescriptor = function0;
        Boolean bool = Boolean.FALSE;
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = notifyPublicListeners.onWarmupCompleted(i);
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asInterface = removeCameraStateObserver.IAuthTabCallback(3000L);
        this.onTransact = removeCameraStateObserver.IAuthTabCallback(1000L);
        this.onWarmupCompleted = removeCameraStateObserver.IAuthTabCallback(1000L);
        this.onNavigationEvent = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(88.0f)));
    }

    public static final /* synthetic */ void onWarmupCompleted(LottieCompositionFactoryExternalSyntheticLambda8 lottieCompositionFactoryExternalSyntheticLambda8, boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        lottieCompositionFactoryExternalSyntheticLambda8.onWarmupCompleted(z);
        int i4 = extraCallback + 67;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public findResAndMsg asInterface() {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsg = this.access100;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return findresandmsg;
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iAccess000 = access000();
        int i4 = readTypedObject + 33;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iAccess000;
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public long asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallback();
        }
        ICustomTabsCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return readTypedObject();
        }
        int i3 = 81 / 0;
        return readTypedObject();
    }

    public boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = readTypedObject + 89;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return zExtraCallbackWithResult;
    }

    public long access100() {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        long jLongValue = ((Long) IAuthTabCallback(iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, 309384123, -309384123)).longValue();
        int i4 = extraCallback + 7;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return jLongValue;
        }
        throw null;
    }

    public long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject();
        }
        writeTypedObject();
        throw null;
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public LottieCompositionFactoryExternalSyntheticLambda7 onTransact() {
        LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7;
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            lottieCompositionFactoryExternalSyntheticLambda7 = this.onExtraCallback;
            int i4 = 20 / 0;
        } else {
            lottieCompositionFactoryExternalSyntheticLambda7 = this.onExtraCallback;
        }
        int i5 = i3 + 49;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lottieCompositionFactoryExternalSyntheticLambda7;
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 93;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i2 + 95;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return z;
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        asInterface(j);
        int i4 = extraCallback + 65;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(j);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(j);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.LottieDrawableExternalSyntheticLambda1
    public void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(j);
        int i4 = extraCallback + 85;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.LottieCompositionFactoryExternalSyntheticLambda13
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -1746280630, 1746280631)).booleanValue();
        int i4 = extraCallback + 97;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.LottieCompositionFactoryExternalSyntheticLambda13
    public float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback_Parcel();
            obj.hashCode();
            throw null;
        }
        float fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i3 = extraCallback + 3;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return fIAuthTabCallback_Parcel;
        }
        throw null;
    }

    @Override // o.LottieCompositionFactoryExternalSyntheticLambda13
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(access100(), IAuthTabCallback_Parcel());
            throw null;
        }
        IAuthTabCallback(access100(), IAuthTabCallback_Parcel());
        int i3 = readTypedObject + 53;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.LottieCompositionFactoryExternalSyntheticLambda13
    public void onExtraCallback(long j, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 71;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.access000;
        float f = i;
        if (i4 == 0) {
            IAuthTabCallback(j, r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f)));
        } else {
            IAuthTabCallback(j, r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f)));
            throw null;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ long $duration;
        int label;
        final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda8 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(long j, LottieCompositionFactoryExternalSyntheticLambda8 lottieCompositionFactoryExternalSyntheticLambda8, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$duration = j;
            this.this$0 = lottieCompositionFactoryExternalSyntheticLambda8;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$duration, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 101;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    long j = this.$duration;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                        int i4 = onWarmupCompleted + 19;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                LottieCompositionFactoryExternalSyntheticLambda13.IAuthTabCallback(this.this$0, false, 1, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                LottieCompositionFactoryExternalSyntheticLambda13.IAuthTabCallback(this.this$0, false, 1, null);
                throw th;
            }
        }
    }

    private final void IAuthTabCallback(long j, float f) {
        int i = 2 % 2;
        Object obj = null;
        if (onNavigationEvent()) {
            int i2 = readTypedObject + 119;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        IAuthTabCallback(f);
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this, true}, iOnExtraCallbackWithResult, 1151086334, -1151086332);
        onWarmupCompleted(false);
        getPackageType getpackagetype = this.writeTypedObject;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i3 = extraCallback + 51;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        this.writeTypedObject = maybeUpdateAnimatable.onNavigationEvent(asInterface(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(j, this, null), 3, (Object) null);
        getPackageType getpackagetype2 = this.IAuthTabCallbackStubProxy;
        if (getpackagetype2 != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
        }
        this.IAuthTabCallbackStubProxy = maybeUpdateAnimatable.onNavigationEvent(asInterface(), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = LottieCompositionFactoryExternalSyntheticLambda8.this.new onNavigationEvent(access13800Var);
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onWarmupCompleted + 113;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                long jIAuthTabCallbackStubProxy = LottieCompositionFactoryExternalSyntheticLambda8.this.IAuthTabCallbackStubProxy();
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(jIAuthTabCallbackStubProxy, this) == objOnWarmupCompleted) {
                    int i5 = onWarmupCompleted + 55;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            LottieCompositionFactoryExternalSyntheticLambda8.onWarmupCompleted(LottieCompositionFactoryExternalSyntheticLambda8.this, true);
            return Unit.INSTANCE;
        }
    }

    @Override // o.LottieCompositionFactoryExternalSyntheticLambda13
    public void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (onNavigationEvent()) {
                if (z) {
                    int i3 = readTypedObject + 109;
                    extraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        getInterfaceDescriptor();
                        throw null;
                    }
                    if (!getInterfaceDescriptor()) {
                        return;
                    }
                }
                getPackageType getpackagetype = this.writeTypedObject;
                if (getpackagetype != null) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
                this.writeTypedObject = null;
                getPackageType getpackagetype2 = this.IAuthTabCallbackStubProxy;
                if (getpackagetype2 != null) {
                    int i4 = extraCallback + 103;
                    readTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
                }
                this.IAuthTabCallbackStubProxy = null;
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                IAuthTabCallback(iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this, false}, iOnExtraCallbackWithResult, 1151086334, -1151086332);
                onWarmupCompleted(false);
                Function0<Unit> function0 = this.getInterfaceDescriptor;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            return;
        }
        onNavigationEvent();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LottieCompositionFactoryExternalSyntheticLambda8 lottieCompositionFactoryExternalSyntheticLambda8 = (LottieCompositionFactoryExternalSyntheticLambda8) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        lottieCompositionFactoryExternalSyntheticLambda8.IAuthTabCallback_Parcel.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = extraCallback + 15;
        readTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final int access000() {
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
            int i3 = readTypedObject + 115;
            extraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iOnWarmupCompleted;
            }
            throw null;
        }
        this.onExtraCallbackWithResult.onWarmupCompleted();
        throw null;
    }

    private final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return ((setUseCaseAttached) this.IAuthTabCallbackDefault.onExtraCallbackWithResult()).onExtraCallback();
        }
        ((setUseCaseAttached) this.IAuthTabCallbackDefault.onExtraCallbackWithResult()).onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void asBinder(long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackDefault.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(j));
            int i3 = extraCallback + 111;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.IAuthTabCallbackDefault.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(j));
        throw null;
    }

    private final long readTypedObject() {
        int i = 2 % 2;
        int i2 = readTypedObject + 55;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            long jOnExtraCallbackWithResult = ((ExtensionsManager1) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).onExtraCallbackWithResult();
            int i3 = extraCallback + 67;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                return jOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
        ((ExtensionsManager1) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).onExtraCallbackWithResult();
        throw null;
    }

    private final void asInterface(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        int i4 = readTypedObject + 65;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.asBinder.onExtraCallbackWithResult()).booleanValue();
        int i4 = readTypedObject + 27;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = extraCallback + 25;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jOnWarmupCompleted;
        LottieCompositionFactoryExternalSyntheticLambda8 lottieCompositionFactoryExternalSyntheticLambda8 = (LottieCompositionFactoryExternalSyntheticLambda8) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            jOnWarmupCompleted = lottieCompositionFactoryExternalSyntheticLambda8.asInterface.onWarmupCompleted();
            int i3 = 70 / 0;
        } else {
            jOnWarmupCompleted = lottieCompositionFactoryExternalSyntheticLambda8.asInterface.onWarmupCompleted();
        }
        return Long.valueOf(jOnWarmupCompleted);
    }

    private final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.onNavigationEvent(j);
        int i4 = extraCallback + 71;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final long writeTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallback + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        long jOnWarmupCompleted = this.onTransact.onWarmupCompleted();
        int i4 = readTypedObject + 13;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jOnWarmupCompleted;
        }
        throw null;
    }

    private final void IAuthTabCallbackDefault(long j) {
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onTransact.onNavigationEvent(j);
        } else {
            this.onTransact.onNavigationEvent(j);
            throw null;
        }
    }

    private final float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            float fOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
            int i3 = extraCallback + 69;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 67 / 0;
            }
            return fOnNavigationEvent;
        }
        this.onNavigationEvent.onNavigationEvent();
        throw null;
    }

    private final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent(f);
        int i4 = extraCallback + 25;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final long extraCallback() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Long) IAuthTabCallback(iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, 309384123, -309384123)).longValue();
    }

    private final boolean onMinimized() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -1746280630, 1746280631)).booleanValue();
    }

    private final void IAuthTabCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1151086334, -1151086332);
    }
}
