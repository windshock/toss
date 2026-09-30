package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class x2ExternalSyntheticLambda10 extends SupportedOutputSizesSorterLegacy<r8lambdaxGM4_NjGtBUq4bEBv5FwTqaR6_U> {
    private static int IAuthTabCallback_Parcel = 0;
    private static int getInterfaceDescriptor = 1;
    private final int IAuthTabCallback;
    private final float IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final float IAuthTabCallbackStubProxy;
    private final float asBinder;
    private final float asInterface;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final MappingRedirectableLiveDataExternalSyntheticLambda1 onNavigationEvent;
    private final r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M onTransact;
    private final r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI onWarmupCompleted;

    public /* synthetic */ x2ExternalSyntheticLambda10(int i, int i2, float f, float f2, r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f3, float f4, float f5, float f6, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, f2, r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawxvv9xwdigsnld64xj_ruham57m, f3, f4, f5, f6, mappingRedirectableLiveDataExternalSyntheticLambda1);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback_Parcel + 33;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof x2ExternalSyntheticLambda10)) {
            return false;
        }
        x2ExternalSyntheticLambda10 x2externalsyntheticlambda10 = (x2ExternalSyntheticLambda10) obj;
        if (this.IAuthTabCallback != x2externalsyntheticlambda10.IAuthTabCallback) {
            return false;
        }
        if (this.IAuthTabCallbackStub != x2externalsyntheticlambda10.IAuthTabCallbackStub) {
            int i4 = IAuthTabCallback_Parcel + 83;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackStubProxy, x2externalsyntheticlambda10.IAuthTabCallbackStubProxy)) {
            return false;
        }
        if (Float.compare(this.IAuthTabCallbackDefault, x2externalsyntheticlambda10.IAuthTabCallbackDefault) != 0) {
            int i6 = getInterfaceDescriptor + 115;
            IAuthTabCallback_Parcel = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, x2externalsyntheticlambda10.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, x2externalsyntheticlambda10.onTransact)) {
            int i7 = getInterfaceDescriptor + 115;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Float.compare(this.onExtraCallback, x2externalsyntheticlambda10.onExtraCallback) != 0) {
            int i9 = getInterfaceDescriptor + 35;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Float.compare(this.onExtraCallbackWithResult, x2externalsyntheticlambda10.onExtraCallbackWithResult) != 0) {
            int i11 = IAuthTabCallback_Parcel + 85;
            getInterfaceDescriptor = i11 % 128;
            return i11 % 2 == 0;
        }
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asInterface, x2externalsyntheticlambda10.asInterface) || !VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asBinder, x2externalsyntheticlambda10.asBinder)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, x2externalsyntheticlambda10.onNavigationEvent)) {
            return true;
        }
        int i12 = getInterfaceDescriptor + 1;
        IAuthTabCallback_Parcel = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((Integer.hashCode(this.IAuthTabCallback) * 31) + Integer.hashCode(this.IAuthTabCallbackStub)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackStubProxy)) * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asInterface)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asBinder)) * 31) + this.onNavigationEvent.hashCode();
        int i4 = getInterfaceDescriptor + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerticalProgressTrackElement(activeStep=" + this.IAuthTabCallback + ", totalSteps=" + this.IAuthTabCallbackStub + ", trackWidth=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy) + ", trackCenterX=" + this.IAuthTabCallbackDefault + ", colors=" + this.onWarmupCompleted + ", trackState=" + this.onTransact + ", indicatorRadius=" + this.onExtraCallback + ", progressIndicatorRadius=" + this.onExtraCallbackWithResult + ", trackCornerRadius=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asInterface) + ", trackBorderWidth=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder) + ", progressShadow=" + this.onNavigationEvent + ")";
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return str;
    }

    private x2ExternalSyntheticLambda10(int i, int i2, float f, float f2, r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f3, float f4, float f5, float f6, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(r8lambdacvbgljs0ksxut8zctwblscbeixi, "");
        Intrinsics.checkNotNullParameter(r8lambdawxvv9xwdigsnld64xj_ruham57m, "");
        Intrinsics.checkNotNullParameter(mappingRedirectableLiveDataExternalSyntheticLambda1, "");
        this.IAuthTabCallback = i;
        this.IAuthTabCallbackStub = i2;
        this.IAuthTabCallbackStubProxy = f;
        this.IAuthTabCallbackDefault = f2;
        this.onWarmupCompleted = r8lambdacvbgljs0ksxut8zctwblscbeixi;
        this.onTransact = r8lambdawxvv9xwdigsnld64xj_ruham57m;
        this.onExtraCallback = f3;
        this.onExtraCallbackWithResult = f4;
        this.asInterface = f5;
        this.asBinder = f6;
        this.onNavigationEvent = mappingRedirectableLiveDataExternalSyntheticLambda1;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((r8lambdaxGM4_NjGtBUq4bEBv5FwTqaR6_U) onwarmupcompleted);
        int i4 = getInterfaceDescriptor + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public r8lambdaxGM4_NjGtBUq4bEBv5FwTqaR6_U onExtraCallback() {
        int i = 2 % 2;
        r8lambdaxGM4_NjGtBUq4bEBv5FwTqaR6_U r8lambdaxgm4_njgtbuq4bebv5fwtqar6_u = new r8lambdaxGM4_NjGtBUq4bEBv5FwTqaR6_U(this.IAuthTabCallback, this.IAuthTabCallbackStub, this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackDefault, this.onWarmupCompleted, this.onTransact, this.onExtraCallback, this.onExtraCallbackWithResult, this.asInterface, this.asBinder, this.onNavigationEvent, null);
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return r8lambdaxgm4_njgtbuq4bebv5fwtqar6_u;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdaxGM4_NjGtBUq4bEBv5FwTqaR6_U r8lambdaxgm4_njgtbuq4bebv5fwtqar6_u) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaxgm4_njgtbuq4bebv5fwtqar6_u, "");
        r8lambdaxgm4_njgtbuq4bebv5fwtqar6_u.onExtraCallbackWithResult(this.IAuthTabCallback, this.IAuthTabCallbackStub, this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackDefault, this.onWarmupCompleted, this.onTransact, this.onExtraCallback, this.onExtraCallbackWithResult, this.asInterface, this.asBinder, this.onNavigationEvent);
        int i4 = getInterfaceDescriptor + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
