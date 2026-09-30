package o;

import com.google.android.material.datepicker.DateFormatTextWatcher$;
import kotlin.jvm.internal.Intrinsics;
import o.addObjectIfExists;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putBooleanIfValid implements toStringMap {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback;
    private final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private final Object asBinder;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onTransact;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = (~(i8 | i2)) | i7;
        int i10 = (~(i7 | (~i2) | i4)) | (~(i8 | i7 | i2));
        int i11 = (~(i2 | i4)) | (~(i5 | i4));
        int i12 = i5 + i4 + i3 + ((-1520811122) * i6) + (1880343047 * i);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i5) - 1254686720) + (875799021 * i4) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i3) + ((-206831616) * i6) + (408289280 * i) + ((-683737088) * i13);
        int i15 = ((i5 * (-660833811)) - 1995073173) + (i4 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i3 * (-660833671)) + (i6 * 644061726) + (i * (-2012083377)) + (i13 * (-1027145728));
        if (i14 + (i15 * i15 * 814809088) != 1) {
            return onNavigationEvent(objArr);
        }
        putBooleanIfValid putbooleanifvalid = (putBooleanIfValid) objArr[0];
        Float f = (Float) objArr[1];
        int i16 = 2 % 2;
        int i17 = IAuthTabCallbackStub + 37;
        asInterface = i17 % 128;
        int i18 = i17 % 2;
        putbooleanifvalid.onWarmupCompleted.IAuthTabCallback(f);
        int i19 = asInterface + 101;
        IAuthTabCallbackStub = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public putBooleanIfValid(@Nullable Object obj, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull addObjectIfExists addobjectifexists, boolean z, @Nullable String str, boolean z2) {
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(addobjectifexists, "");
        this.asBinder = obj;
        this.IAuthTabCallbackDefault = deviceQuirksExternalSyntheticLambda0;
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(addobjectifexists, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z2), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(str, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.toStringMap
    public Object onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Object obj = this.asBinder;
        int i5 = i3 + 113;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    @Override // o.toStringMap
    public DeviceQuirksExternalSyntheticLambda0 asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.IAuthTabCallbackDefault;
        int i5 = i3 + 55;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return deviceQuirksExternalSyntheticLambda0;
    }

    @Override // o.toStringMap
    public addObjectIfExists IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (!onWarmupCompleted()) {
            return access000();
        }
        int i2 = IAuthTabCallbackStub + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!onNavigationEvent()) {
            addObjectIfExists.onExtraCallbackWithResult onextracallbackwithresult = addObjectIfExists.onExtraCallbackWithResult.onExtraCallback;
            int i3 = asInterface + 51;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresult;
        }
        addObjectIfExists.IAuthTabCallback iAuthTabCallback = addObjectIfExists.IAuthTabCallback.onExtraCallbackWithResult;
        int i5 = asInterface + 71;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallback;
    }

    @Override // o.toStringMap
    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnTransact = onTransact();
        int i3 = asInterface + 49;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return zOnTransact;
    }

    @Override // o.toStringMap
    public boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = IAuthTabCallbackStub + 49;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.toStringMap
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean interfaceDescriptor = getInterfaceDescriptor();
        int i4 = IAuthTabCallbackStub + 37;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    @Override // o.toStringMap
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        boolean z = i2 % 2 != 0 ? IAuthTabCallbackDefault() instanceof addObjectIfExists.onExtraCallback : !(IAuthTabCallbackDefault() instanceof addObjectIfExists.onExtraCallback);
        int i3 = asInterface + 87;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.toStringMap
    public Float asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Float fIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackStub + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallbackStubProxy;
    }

    @Override // o.toStringMap
    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strAccess100 = access100();
        int i4 = asInterface + 63;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return strAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull addObjectIfExists addobjectifexists) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(addobjectifexists, "");
            onExtraCallbackWithResult(addobjectifexists);
            throw null;
        }
        Intrinsics.checkNotNullParameter(addobjectifexists, "");
        onExtraCallbackWithResult(addobjectifexists);
        int i3 = asInterface + 115;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(z);
        int i4 = asInterface + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{this, Boolean.valueOf(z)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1291951743, -1291951743, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = IAuthTabCallbackStub + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.toStringMap
    public void onNavigationEvent(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{this, f}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 499606906, -499606905, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = IAuthTabCallbackStub + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final addObjectIfExists access000() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        addObjectIfExists addobjectifexists = (addObjectIfExists) this.onTransact.onExtraCallbackWithResult();
        int i4 = asInterface + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return addobjectifexists;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(addObjectIfExists addobjectifexists) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            this.onTransact.IAuthTabCallback(addobjectifexists);
            int i3 = 15 / 0;
        } else {
            this.onTransact.IAuthTabCallback(addobjectifexists);
        }
    }

    private final boolean onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
        int i4 = asInterface + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = 71 / 0;
        } else {
            this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
        }
        int i4 = IAuthTabCallbackStub + 21;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue();
        }
        ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).booleanValue();
        int i4 = asInterface + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        putBooleanIfValid putbooleanifvalid = (putBooleanIfValid) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        putbooleanifvalid.onExtraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = asInterface + 109;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final Float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Float f = (Float) this.onWarmupCompleted.onExtraCallbackWithResult();
            int i3 = IAuthTabCallbackStub + 91;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 69 / 0;
            }
            return f;
        }
        throw null;
    }

    private final String access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onExtraCallback.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final void onWarmupCompleted(boolean z) {
        onExtraCallbackWithResult(new Object[]{this, Boolean.valueOf(z)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1291951743, -1291951743, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private final void onExtraCallbackWithResult(Float f) {
        onExtraCallbackWithResult(new Object[]{this, f}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 499606906, -499606905, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }
}
