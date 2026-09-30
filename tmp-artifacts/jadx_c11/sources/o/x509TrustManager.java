package o;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.initSDK;
import o.setCallToAction;
import o.x509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x509TrustManager implements pingIntervalMillis, getConnectionPoolokhttp {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000;
    private final getSupportedHighSpeedResolutionsFor<Function1<initSDK.onNavigationEvent, Unit>> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor<Camera2CapturePipelineTorchTaskExternalSyntheticLambda2> IAuthTabCallbackDefault;
    private final hasProvider IAuthTabCallbackStub;
    private final getSupportedHighSpeedResolutionsFor<setCallToAction.IAuthTabCallback> IAuthTabCallback_Parcel;
    private final getSupportedHighSpeedResolutionsFor<Function0<Unit>> access100;
    private final getSupportedHighSpeedResolutionsFor<Boolean> asBinder;
    private final getSupportedHighSpeedResolutionsFor<Set<String>> asInterface;
    private final getSupportedHighSpeedResolutionsFor<setCallToAction.onExtraCallback> getInterfaceDescriptor;
    private final getSupportedHighSpeedResolutionsFor<setCallToAction.onNavigationEvent> onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor<setCallToAction.onWarmupCompleted> onExtraCallbackWithResult;
    private final /* synthetic */ getCallTimeoutokhttp onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor<Boolean> onTransact;
    private final /* synthetic */ addNetworkInterceptor onWarmupCompleted;

    public x509TrustManager() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        x509TrustManager x509trustmanager = (x509TrustManager) objArr[0];
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult = (setCallToAction.onExtraCallbackWithResult) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(x509trustmanager, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = access000 + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(onnavigationevent);
            throw null;
        }
        Unit unitAsInterface = asInterface(onnavigationevent);
        int i3 = access000 + 71;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(x509TrustManager x509trustmanager, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 57;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(x509trustmanager, obj, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(x509trustmanager, obj, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStubProxy + 101;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onnavigationevent);
        int i4 = IAuthTabCallbackStubProxy + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i4;
        int i11 = (~i10) | i9;
        int i12 = ~i4;
        int i13 = (~(i6 | i10)) | (~(i8 | i12)) | (~(i12 | i3));
        int i14 = i3 + i4 + i5 + ((-1017789379) * i) + (461141949 * i2);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i3) + 431816704 + ((-1613042074) * i4) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i5) + ((-1727660032) * i) + (1912995840 * i2) + ((-1005256704) * i15);
        int i17 = ((i3 * (-1063000396)) - 360994079) + (i4 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i5 * (-1063000885)) + (i * (-90181537)) + (i2 * (-1548859681)) + (i15 * 816250880);
        int i18 = i16 + (i17 * i17 * 1493368832);
        if (i18 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 2) {
            return IAuthTabCallback(objArr);
        }
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[0];
        int i19 = 2 % 2;
        int i20 = IAuthTabCallbackStubProxy + 71;
        access000 = i20 % 128;
        int i21 = i20 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onnavigationevent);
        int i22 = access000 + 27;
        IAuthTabCallbackStubProxy = i22 % 128;
        int i23 = i22 % 2;
        return unitOnWarmupCompleted;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<hasProvider> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        getSupportedHighSpeedResolutionsFor<hasProvider> getsupportedhighspeedresolutionsforOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
        int i3 = IAuthTabCallbackStubProxy + 117;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return getsupportedhighspeedresolutionsforOnWarmupCompleted;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStubProxy + 25;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof x509TrustManager)) {
            return false;
        }
        x509TrustManager x509trustmanager = (x509TrustManager) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, x509trustmanager.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, x509trustmanager.IAuthTabCallback_Parcel)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, x509trustmanager.onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallbackStubProxy + 5;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getInterfaceDescriptor, x509trustmanager.getInterfaceDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, x509trustmanager.onExtraCallback)) {
            int i6 = IAuthTabCallbackStubProxy + 3;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, x509trustmanager.IAuthTabCallbackDefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, x509trustmanager.onTransact)) {
            int i8 = access000 + 97;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, x509trustmanager.asBinder)) {
            int i10 = access000 + 111;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, x509trustmanager.access100)) {
            int i12 = access000 + 45;
            IAuthTabCallbackStubProxy = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.IAuthTabCallback, x509trustmanager.IAuthTabCallback))) {
            return !(Intrinsics.areEqual(this.asInterface, x509trustmanager.asInterface) ^ true);
        }
        int i14 = access000 + 13;
        IAuthTabCallbackStubProxy = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 29;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasProvider hasprovider = this.IAuthTabCallbackStub;
        if (hasprovider == null) {
            int i4 = i2 + 45;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = hasprovider.hashCode();
        }
        return (((((((((((((((((((iHashCode * 31) + this.IAuthTabCallback_Parcel.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.getInterfaceDescriptor.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.access100.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.asInterface.hashCode();
    }

    public void onExtraCallbackWithResult(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onExtraCallback(function0);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getFollowSslRedirectsokhttp
    public void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent(str);
        int i4 = IAuthTabCallbackStubProxy + 105;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getFollowSslRedirectsokhttp
    public void onNavigationEvent(@Nullable hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent(hasprovider);
        int i4 = access000 + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<Function0<Unit>> getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 63;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnExtraCallbackWithResult;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ButtonState(initialText=" + this.IAuthTabCallbackStub + ", size=" + this.IAuthTabCallback_Parcel + ", color=" + this.onExtraCallbackWithResult + ", style=" + this.getInterfaceDescriptor + ", display=" + this.onExtraCallback + ", interactionSource=" + this.IAuthTabCallbackDefault + ", isEnabled=" + this.onTransact + ", isLoading=" + this.asBinder + ", onClickWhenDisabled=" + this.access100 + ", customParams=" + this.IAuthTabCallback + ", maskingWords=" + this.asInterface + ")";
        int i2 = IAuthTabCallbackStubProxy + 31;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public x509TrustManager(@Nullable hasProvider hasprovider, @NotNull getSupportedHighSpeedResolutionsFor<setCallToAction.IAuthTabCallback> getsupportedhighspeedresolutionsfor, @NotNull getSupportedHighSpeedResolutionsFor<setCallToAction.onWarmupCompleted> getsupportedhighspeedresolutionsfor2, @NotNull getSupportedHighSpeedResolutionsFor<setCallToAction.onExtraCallback> getsupportedhighspeedresolutionsfor3, @NotNull getSupportedHighSpeedResolutionsFor<setCallToAction.onNavigationEvent> getsupportedhighspeedresolutionsfor4, @NotNull getSupportedHighSpeedResolutionsFor<Camera2CapturePipelineTorchTaskExternalSyntheticLambda2> getsupportedhighspeedresolutionsfor5, @NotNull getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor6, @NotNull getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor7, @NotNull getSupportedHighSpeedResolutionsFor<Function0<Unit>> getsupportedhighspeedresolutionsfor8, @NotNull getSupportedHighSpeedResolutionsFor<Function1<initSDK.onNavigationEvent, Unit>> getsupportedhighspeedresolutionsfor9, @NotNull getSupportedHighSpeedResolutionsFor<Set<String>> getsupportedhighspeedresolutionsfor10) {
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor2, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor3, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor4, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor5, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor6, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor7, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor8, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor9, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor10, "");
        this.onNavigationEvent = new getCallTimeoutokhttp(hasprovider);
        this.onWarmupCompleted = new addNetworkInterceptor();
        this.IAuthTabCallbackStub = hasprovider;
        this.IAuthTabCallback_Parcel = getsupportedhighspeedresolutionsfor;
        this.onExtraCallbackWithResult = getsupportedhighspeedresolutionsfor2;
        this.getInterfaceDescriptor = getsupportedhighspeedresolutionsfor3;
        this.onExtraCallback = getsupportedhighspeedresolutionsfor4;
        this.IAuthTabCallbackDefault = getsupportedhighspeedresolutionsfor5;
        this.onTransact = getsupportedhighspeedresolutionsfor6;
        this.asBinder = getsupportedhighspeedresolutionsfor7;
        this.access100 = getsupportedhighspeedresolutionsfor8;
        this.IAuthTabCallback = getsupportedhighspeedresolutionsfor9;
        this.asInterface = getsupportedhighspeedresolutionsfor10;
    }

    public final getSupportedHighSpeedResolutionsFor<setCallToAction.IAuthTabCallback> asBinder() {
        getSupportedHighSpeedResolutionsFor<setCallToAction.IAuthTabCallback> getsupportedhighspeedresolutionsfor;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 != 0) {
            getsupportedhighspeedresolutionsfor = this.IAuthTabCallback_Parcel;
            int i4 = 46 / 0;
        } else {
            getsupportedhighspeedresolutionsfor = this.IAuthTabCallback_Parcel;
        }
        int i5 = i3 + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return getsupportedhighspeedresolutionsfor;
    }

    public final getSupportedHighSpeedResolutionsFor<setCallToAction.onWarmupCompleted> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<setCallToAction.onWarmupCompleted> getsupportedhighspeedresolutionsfor = this.onExtraCallbackWithResult;
        int i5 = i3 + 23;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return getsupportedhighspeedresolutionsfor;
        }
        throw null;
    }

    public final getSupportedHighSpeedResolutionsFor<setCallToAction.onExtraCallback> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getInterfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getSupportedHighSpeedResolutionsFor<setCallToAction.onNavigationEvent> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getSupportedHighSpeedResolutionsFor<setCallToAction.onNavigationEvent> getsupportedhighspeedresolutionsfor = this.onExtraCallback;
        int i4 = i3 + 15;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x509TrustManager(hasProvider hasprovider, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted4;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted5;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted6;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted7;
        hasProvider hasprovider2 = (i & 1) != 0 ? null : hasprovider;
        if ((i & 2) != 0) {
            int i2 = access000 + 109;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            int i4 = 2 % 2;
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted = getsupportedhighspeedresolutionsfor;
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted8 = (i & 4) != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null) : getsupportedhighspeedresolutionsfor2;
        if ((i & 8) != 0) {
            getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            int i5 = 2 % 2;
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted2 = getsupportedhighspeedresolutionsfor3;
        }
        if ((i & 16) != 0) {
            int i6 = access000 + 59;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            getsupportedhighspeedresolutionsforOnWarmupCompleted3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted3 = getsupportedhighspeedresolutionsfor4;
        }
        if ((i & 32) != 0) {
            int i8 = access000 + 79;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            getsupportedhighspeedresolutionsforOnWarmupCompleted4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted4 = getsupportedhighspeedresolutionsfor5;
        }
        if ((i & 64) != 0) {
            getsupportedhighspeedresolutionsforOnWarmupCompleted5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            int i10 = IAuthTabCallbackStubProxy + 113;
            access000 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted5 = getsupportedhighspeedresolutionsfor6;
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted9 = (i & 128) != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null) : getsupportedhighspeedresolutionsfor7;
        if ((i & 256) != 0) {
            int i13 = IAuthTabCallbackStubProxy + 109;
            access000 = i13 % 128;
            int i14 = i13 % 2;
            getsupportedhighspeedresolutionsforOnWarmupCompleted6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            int i15 = 2 % 2;
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted6 = getsupportedhighspeedresolutionsfor8;
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted10 = (i & 512) != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function1() { // from class: im.toss.tds.view.compat.component.state.ButtonState$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i16 = 2 % 2;
                int i17 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                Unit unit = (Unit) x509TrustManager.onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{(initSDK.onNavigationEvent) obj}, 1337433717, -1337433717, iOnExtraCallback2, iOnExtraCallback);
                int i19 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            }
        }, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null) : getsupportedhighspeedresolutionsfor9;
        if ((i & 1024) != 0) {
            int i16 = IAuthTabCallbackStubProxy + 87;
            access000 = i16 % 128;
            int i17 = i16 % 2;
            getsupportedhighspeedresolutionsforOnWarmupCompleted7 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(clearFaultAdjacentMetadata.onExtraCallback(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        } else {
            getsupportedhighspeedresolutionsforOnWarmupCompleted7 = getsupportedhighspeedresolutionsfor10;
        }
        this(hasprovider2, getsupportedhighspeedresolutionsforOnWarmupCompleted, getsupportedhighspeedresolutionsforOnWarmupCompleted8, getsupportedhighspeedresolutionsforOnWarmupCompleted2, getsupportedhighspeedresolutionsforOnWarmupCompleted3, getsupportedhighspeedresolutionsforOnWarmupCompleted4, getsupportedhighspeedresolutionsforOnWarmupCompleted5, getsupportedhighspeedresolutionsforOnWarmupCompleted9, getsupportedhighspeedresolutionsforOnWarmupCompleted6, getsupportedhighspeedresolutionsforOnWarmupCompleted10, getsupportedhighspeedresolutionsforOnWarmupCompleted7);
    }

    public final getSupportedHighSpeedResolutionsFor<Camera2CapturePipelineTorchTaskExternalSyntheticLambda2> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<Camera2CapturePipelineTorchTaskExternalSyntheticLambda2> getsupportedhighspeedresolutionsfor = this.IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return getsupportedhighspeedresolutionsfor;
    }

    public final getSupportedHighSpeedResolutionsFor<Boolean> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 87;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.onTransact;
        int i5 = i2 + 69;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    public final getSupportedHighSpeedResolutionsFor<Boolean> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = access000 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        x509TrustManager x509trustmanager = (x509TrustManager) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 59;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<Function0<Unit>> getsupportedhighspeedresolutionsfor = x509trustmanager.access100;
        int i5 = i2 + 75;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return getsupportedhighspeedresolutionsfor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = access000 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 59;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.pingIntervalMillis
    public getSupportedHighSpeedResolutionsFor<Function1<initSDK.onNavigationEvent, Unit>> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 71;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<Function1<initSDK.onNavigationEvent, Unit>> getsupportedhighspeedresolutionsfor = this.IAuthTabCallback;
        int i5 = i2 + 73;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return getsupportedhighspeedresolutionsfor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.pingIntervalMillis
    public getSupportedHighSpeedResolutionsFor<Set<String>> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 117;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getSupportedHighSpeedResolutionsFor<Set<String>> getsupportedhighspeedresolutionsfor = this.asInterface;
        int i4 = i2 + 109;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    private static final Unit onExtraCallback(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = access000 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int i3 = 67 / 0;
        return Unit.INSTANCE;
    }

    @Override // o.eventListener
    public <T> getBacktraceNote<T, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(72744972, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.state.ButtonState$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 15;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = x509TrustManager.IAuthTabCallback(this.f$0, obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = onExtraCallback + 17;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStubProxy + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(x509TrustManager x509trustmanager, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        String strOnTransact;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 45;
        access000 = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 3) != 4, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1500082616, i, -1, "im.toss.tds.view.compat.component.state.ButtonState.toComposable.<anonymous>.<anonymous> (ButtonState.kt:80)");
            }
            hasProvider hasprovider = (hasProvider) x509trustmanager.IAuthTabCallback_Parcel().onExtraCallbackWithResult();
            if (hasprovider == null || (strOnTransact = hasprovider.onTransact()) == null) {
                strOnTransact = "";
            }
            String str = strOnTransact;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallback = (setCallToAction.IAuthTabCallback) x509trustmanager.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
            if (iAuthTabCallbackOnExtraCallback == null) {
                iAuthTabCallbackOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            }
            setCallToAction.IAuthTabCallback iAuthTabCallback = iAuthTabCallbackOnExtraCallback;
            setCallToAction.onWarmupCompleted onwarmupcompletedIAuthTabCallback = (setCallToAction.onWarmupCompleted) x509trustmanager.onExtraCallbackWithResult.onExtraCallbackWithResult();
            if (onwarmupcompletedIAuthTabCallback == null) {
                onwarmupcompletedIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            }
            setCallToAction.onWarmupCompleted onwarmupcompleted = onwarmupcompletedIAuthTabCallback;
            setCallToAction.onExtraCallback onextracallbackOnWarmupCompleted = (setCallToAction.onExtraCallback) x509trustmanager.getInterfaceDescriptor.onExtraCallbackWithResult();
            if (onextracallbackOnWarmupCompleted == null) {
                onextracallbackOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
            }
            setCallToAction.onExtraCallback onextracallback = onextracallbackOnWarmupCompleted;
            setCallToAction.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = (setCallToAction.onNavigationEvent) x509trustmanager.onExtraCallback.onExtraCallbackWithResult();
            if (onnavigationeventOnExtraCallbackWithResult == null) {
                int i4 = access000 + 109;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                onnavigationeventOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
            }
            setAdvertiser.onExtraCallbackWithResult(str, null, iAuthTabCallback, onwarmupcompleted, onextracallback, onnavigationeventOnExtraCallbackWithResult, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) x509trustmanager.IAuthTabCallbackDefault.onExtraCallbackWithResult(), (Function0) x509trustmanager.access100.onExtraCallbackWithResult(), (Function0) x509trustmanager.onTransact().onExtraCallbackWithResult(), ((Boolean) x509trustmanager.onTransact.onExtraCallbackWithResult()).booleanValue(), ((Boolean) x509trustmanager.asBinder.onExtraCallbackWithResult()).booleanValue(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = IAuthTabCallbackStubProxy + 107;
                access000 = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final x509TrustManager x509trustmanager, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackStubProxy + 47;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = access000 + 39;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallbackStubProxy + 73;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = access000 + 123;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(72744972, i, -1, "im.toss.tds.view.compat.component.state.ButtonState.toComposable.<anonymous> (ButtonState.kt:78)");
            }
            final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult = (setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback());
            OkHttpClientBuilder.IAuthTabCallback(x509trustmanager, ForwardingCameraControl.onExtraCallback(-1500082616, true, new Function2() { // from class: im.toss.tds.view.compat.component.state.ButtonState$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = onWarmupCompleted + 3;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        Object[] objArr = {this.f$0, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Object[] objArr2 = {this.f$0, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                    Unit unit = (Unit) x509TrustManager.onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr2, 1555005198, -1555005196, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2);
                    int i13 = onExtraCallback + 41;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(initSDK.onNavigationEvent onnavigationevent) {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Unit) onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{onnavigationevent}, 1337433717, -1337433717, iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(x509TrustManager x509trustmanager, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {x509trustmanager, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Unit) onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, 1555005198, -1555005196, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
    }

    public final getSupportedHighSpeedResolutionsFor<Function0<Unit>> IAuthTabCallbackDefault() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (getSupportedHighSpeedResolutionsFor) onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{this}, -1039469773, 1039469774, iOnExtraCallback2, iOnExtraCallback);
    }
}
