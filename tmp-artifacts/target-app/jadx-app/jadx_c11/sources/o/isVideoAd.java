package o;

import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.entity.Necessity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isVideoAd implements getRawFullResponse {
    private static int getInterfaceDescriptor = 0;
    private static int readTypedObject = 1;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback;
    private getAdZone IAuthTabCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    private final boolean IAuthTabCallback_Parcel;
    private final boolean access000;
    private final boolean access100;
    private final getSupportedHighSpeedResolutionsFor asBinder;
    private final getSupportedHighSpeedResolutionsFor asInterface;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onTransact;
    private final isHighSpeedSupported onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i4));
        int i12 = (~(i4 | i7)) | (~(i8 | i10));
        int i13 = ~(i5 | i3);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i5 + i3 + i + ((-1585779005) * i6) + (640148872 * i2);
        int i17 = i16 * i16;
        int i18 = (i5 * 308833806) + 153878528 + (308833806 * i3) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i) + (1159200768 * i6) + ((-734003200) * i2) + (2089549824 * i17);
        int i19 = (i5 * (-1291220770)) + 263398195 + (i3 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i * (-1291221671)) + (i6 * (-1079815989)) + (i2 * 669414472) + (i17 * 145489920);
        int i20 = i18 + (i19 * i19 * (-1699479552));
        if (i20 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i20 == 2) {
            return onWarmupCompleted(objArr);
        }
        isVideoAd isvideoad = (isVideoAd) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i21 = 2 % 2;
        int i22 = getInterfaceDescriptor + 117;
        readTypedObject = i22 % 128;
        int i23 = i22 % 2;
        isvideoad.onExtraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i24 = getInterfaceDescriptor + 35;
        readTypedObject = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    public isVideoAd(boolean z, @NotNull Function1<? super Necessity, Unit> function1, @NotNull Function1<? super getMediationServeId, Unit> function12, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.IAuthTabCallback_Parcel = z2;
        this.IAuthTabCallbackStubProxy = z3;
        this.access000 = z4;
        this.access100 = z5;
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(onExtraCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(IAuthTabCallbackStubProxy()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(onWarmupCompleted()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(IAuthTabCallbackDefault()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = removeCameraStateObserver.IAuthTabCallback(System.currentTimeMillis());
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(function12, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(function1, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return z;
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 71;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.access000;
        int i5 = i2 + 119;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return z;
    }

    public boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 9;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.access100;
        int i5 = i2 + 79;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // o.getRawFullResponse
    public boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zWriteTypedObject = writeTypedObject();
        int i4 = readTypedObject + 39;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return zWriteTypedObject;
        }
        throw null;
    }

    @Override // o.getRawFullResponse
    public float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return access000();
        }
        access000();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getRawFullResponse
    public CameraPresenceProviderExternalSyntheticLambda6<Long> onExtraCallbackWithResult() {
        isHighSpeedSupported ishighspeedsupportedIAuthTabCallback;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            ishighspeedsupportedIAuthTabCallback = removeCameraStateObserver.IAuthTabCallback(extraCallbackWithResult());
            int i3 = 19 / 0;
        } else {
            ishighspeedsupportedIAuthTabCallback = removeCameraStateObserver.IAuthTabCallback(extraCallbackWithResult());
        }
        int i4 = getInterfaceDescriptor + 59;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return ishighspeedsupportedIAuthTabCallback;
        }
        throw null;
    }

    @Override // o.getRawFullResponse
    public Function1<getMediationServeId, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Function1<getMediationServeId, Unit> function1ExtraCallback = extraCallback();
        int i4 = readTypedObject + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return function1ExtraCallback;
    }

    @Override // o.getRawFullResponse
    public void onNavigationEvent(@NotNull Necessity necessity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(necessity, "");
            ICustomTabsCallback().invoke(necessity);
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(necessity, "");
            ICustomTabsCallback().invoke(necessity);
        }
        int i4 = readTypedObject + 125;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.getRawFullResponse
    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asInterface(z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getRawFullResponse
    public void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            onExtraCallback(iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1973387209, objArr, iOnExtraCallback, 1973387210, iOnExtraCallback3);
            return;
        }
        onExtraCallback(iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1973387209, objArr, iOnExtraCallback, 1973387210, iOnExtraCallback3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getRawFullResponse
    public void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        asBinder(z);
        int i4 = getInterfaceDescriptor + 93;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getRawFullResponse
    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onTransact(z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 83;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(f);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 95;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getRawFullResponse
    public boolean asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        boolean zBooleanValue = ((Boolean) onExtraCallback(iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 917572544, new Object[]{this}, iOnExtraCallback, -917572542, iOnExtraCallback3)).booleanValue();
        int i4 = getInterfaceDescriptor + 1;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getRawFullResponse
    public boolean asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onMessageChannelReady();
            throw null;
        }
        boolean zOnMessageChannelReady = onMessageChannelReady();
        int i3 = getInterfaceDescriptor + 57;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return zOnMessageChannelReady;
    }

    @Override // o.getRawFullResponse
    public void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 111331381, new Object[]{this, false}, iOnExtraCallback, -111331381, iOnExtraCallback3);
        int i4 = readTypedObject + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getRawFullResponse
    public void onExtraCallback(@NotNull getAdZone getadzone) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getadzone, "");
            this.IAuthTabCallbackDefault = getadzone;
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            onExtraCallback(iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 111331381, new Object[]{this, false}, iOnExtraCallback, -111331381, iOnExtraCallback3);
        } else {
            Intrinsics.checkNotNullParameter(getadzone, "");
            this.IAuthTabCallbackDefault = getadzone;
            int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            onExtraCallback(iOnExtraCallback5, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 111331381, new Object[]{this, false}, iOnExtraCallback4, -111331381, iOnExtraCallback6);
        }
        int i3 = readTypedObject + 23;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    public final getAdZone IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getAdZone getadzone = this.IAuthTabCallbackDefault;
            this.IAuthTabCallbackDefault = null;
            return getadzone;
        }
        this.IAuthTabCallbackDefault = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getRawFullResponse
    public void access100() {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 111331381, new Object[]{this, true}, iOnExtraCallback, -111331381, iOnExtraCallback3);
        int i4 = readTypedObject + 27;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.getRawFullResponse
    public void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(System.currentTimeMillis());
        int i4 = readTypedObject + 27;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean zBooleanValue;
        isVideoAd isvideoad = (isVideoAd) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            zBooleanValue = ((Boolean) isvideoad.asInterface.onExtraCallbackWithResult()).booleanValue();
            int i3 = 36 / 0;
        } else {
            zBooleanValue = ((Boolean) isvideoad.asInterface.onExtraCallbackWithResult()).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    private final void asInterface(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.asInterface.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = readTypedObject + 97;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.asInterface.IAuthTabCallback(Boolean.valueOf(z));
        obj.hashCode();
        throw null;
    }

    private final boolean onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return ((Boolean) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).booleanValue();
        }
        ((Boolean) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        isVideoAd isvideoad = (isVideoAd) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        isvideoad.IAuthTabCallbackStub.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = getInterfaceDescriptor + 63;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void asBinder(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
            return;
        }
        this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onTransact(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            this.asBinder.IAuthTabCallback(Boolean.valueOf(z));
        } else {
            this.asBinder.IAuthTabCallback(Boolean.valueOf(z));
            throw null;
        }
    }

    private final boolean writeTypedObject() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).booleanValue();
            int i3 = 26 / 0;
        } else {
            zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).booleanValue();
        }
        int i4 = getInterfaceDescriptor + 7;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final float access000() {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) this.onNavigationEvent.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = readTypedObject + 59;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return fIAuthTabCallback;
        }
        throw null;
    }

    private final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
            int i3 = getInterfaceDescriptor + 27;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
        throw null;
    }

    private final long extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            long jOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
            int i3 = getInterfaceDescriptor + 37;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                return jOnWarmupCompleted;
            }
            throw null;
        }
        this.onWarmupCompleted.onWarmupCompleted();
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(j);
        int i4 = getInterfaceDescriptor + 91;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Function1<getMediationServeId, Unit> extraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Function1<getMediationServeId, Unit> function1 = (Function1) this.IAuthTabCallback.onExtraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 77;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return function1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Function1<Necessity, Unit> ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Function1<Necessity, Unit> function1 = (Function1) this.onTransact.onExtraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 121;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return function1;
    }

    private final boolean readTypedObject() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return ((Boolean) onExtraCallback(iOnExtraCallback2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 917572544, new Object[]{this}, iOnExtraCallback, -917572542, iOnExtraCallback3)).booleanValue();
    }

    private final void onNavigationEvent(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 111331381, objArr, iOnExtraCallback, -111331381, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private final void IAuthTabCallbackDefault(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1973387209, objArr, iOnExtraCallback, 1973387210, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }
}
