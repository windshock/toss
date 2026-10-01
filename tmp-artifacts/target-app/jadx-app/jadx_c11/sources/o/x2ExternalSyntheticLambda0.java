package o;

import com.bytedance.sdk.openadsdk.wwx.lt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class x2ExternalSyntheticLambda0 {
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private final float IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final float IAuthTabCallbackStubProxy;
    private final float IAuthTabCallback_Parcel;
    private final float access000;
    private final float asBinder;
    private final int asInterface;
    private final float onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI onNavigationEvent;
    private final MappingRedirectableLiveDataExternalSyntheticLambda1 onTransact;
    private final float onWarmupCompleted;

    public /* synthetic */ x2ExternalSyntheticLambda0(long j, float f, int i, int i2, int i3, float f2, float f3, r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, float f4, float f5, float f6, float f7, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, i, i2, i3, f2, f3, r8lambdacvbgljs0ksxut8zctwblscbeixi, f4, f5, f6, f7, mappingRedirectableLiveDataExternalSyntheticLambda1);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i3)) | i2;
        int i9 = i3 | i2 | i7;
        int i10 = i2 + i4 + i + (1159740906 * i5) + ((-617157175) * i6);
        int i11 = i10 * i10;
        int i12 = ((i2 * 934236018) - 2089811968) + (934236018 * i4) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i) + (1488977920 * i5) + (2111832064 * i6) + (2070937600 * i11);
        int i13 = (i2 * (-824977050)) + 1921657099 + (i4 * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i * (-824977973)) + (i5 * (-135083378)) + (i6 * 1125239651) + (i11 * 298844160);
        return i12 + ((i13 * i13) * 2098200576) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 49;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2ExternalSyntheticLambda0)) {
            int i4 = i2 + 69;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        x2ExternalSyntheticLambda0 x2externalsyntheticlambda0 = (x2ExternalSyntheticLambda0) obj;
        if (!setUseCaseDetached.onExtraCallback(this.IAuthTabCallbackDefault, x2externalsyntheticlambda0.IAuthTabCallbackDefault) || Float.compare(this.onExtraCallback, x2externalsyntheticlambda0.onExtraCallback) != 0 || this.IAuthTabCallbackStub != x2externalsyntheticlambda0.IAuthTabCallbackStub || this.onExtraCallbackWithResult != x2externalsyntheticlambda0.onExtraCallbackWithResult) {
            return false;
        }
        if (this.asInterface == x2externalsyntheticlambda0.asInterface) {
            return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.access000, x2externalsyntheticlambda0.access000) && Float.compare(this.IAuthTabCallback_Parcel, x2externalsyntheticlambda0.IAuthTabCallback_Parcel) == 0 && Intrinsics.areEqual(this.onNavigationEvent, x2externalsyntheticlambda0.onNavigationEvent) && Float.compare(this.IAuthTabCallback, x2externalsyntheticlambda0.IAuthTabCallback) == 0 && Float.compare(this.onWarmupCompleted, x2externalsyntheticlambda0.onWarmupCompleted) == 0 && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackStubProxy, x2externalsyntheticlambda0.IAuthTabCallbackStubProxy) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asBinder, x2externalsyntheticlambda0.asBinder) && Intrinsics.areEqual(this.onTransact, x2externalsyntheticlambda0.onTransact);
        }
        int i5 = getInterfaceDescriptor + 49;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = (((((((((((((((((((((((setUseCaseDetached.asInterface(this.IAuthTabCallbackDefault) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.IAuthTabCallbackStub)) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.asInterface)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.access000)) * 31) + Float.hashCode(this.IAuthTabCallback_Parcel)) * 31) + this.onNavigationEvent.hashCode()) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackStubProxy)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asBinder)) * 31) + this.onTransact.hashCode();
        int i4 = getInterfaceDescriptor + 27;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return iAsInterface;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerticalProgressTrackCacheKey(size=" + setUseCaseDetached.asBinder(this.IAuthTabCallbackDefault) + ", density=" + this.onExtraCallback + ", stepCentersVersion=" + this.IAuthTabCallbackStub + ", activeStep=" + this.onExtraCallbackWithResult + ", totalSteps=" + this.asInterface + ", trackWidth=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.access000) + ", trackCenterX=" + this.IAuthTabCallback_Parcel + ", colors=" + this.onNavigationEvent + ", indicatorRadius=" + this.IAuthTabCallback + ", progressIndicatorRadius=" + this.onWarmupCompleted + ", trackCornerRadius=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy) + ", trackBorderWidth=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder) + ", progressShadow=" + this.onTransact + ")";
        int i2 = getInterfaceDescriptor + 27;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private x2ExternalSyntheticLambda0(long j, float f, int i, int i2, int i3, float f2, float f3, r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, float f4, float f5, float f6, float f7, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(r8lambdacvbgljs0ksxut8zctwblscbeixi, "");
        Intrinsics.checkNotNullParameter(mappingRedirectableLiveDataExternalSyntheticLambda1, "");
        this.IAuthTabCallbackDefault = j;
        this.onExtraCallback = f;
        this.IAuthTabCallbackStub = i;
        this.onExtraCallbackWithResult = i2;
        this.asInterface = i3;
        this.access000 = f2;
        this.IAuthTabCallback_Parcel = f3;
        this.onNavigationEvent = r8lambdacvbgljs0ksxut8zctwblscbeixi;
        this.IAuthTabCallback = f4;
        this.onWarmupCompleted = f5;
        this.IAuthTabCallbackStubProxy = f6;
        this.asBinder = f7;
        this.onTransact = mappingRedirectableLiveDataExternalSyntheticLambda1;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 43;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i2 + 43;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 47;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = this.access000;
        int i4 = i2 + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 7;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback_Parcel;
        }
        throw null;
    }

    public final r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        x2ExternalSyntheticLambda0 x2externalsyntheticlambda0 = (x2ExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 71;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float f = x2externalsyntheticlambda0.IAuthTabCallback;
        int i5 = i2 + 89;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 115;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 107;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onTransact() {
        float f;
        int i = 2 % 2;
        int i2 = access100 + 75;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            f = this.asBinder;
            int i4 = 51 / 0;
        } else {
            f = this.asBinder;
        }
        int i5 = i3 + 17;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        x2ExternalSyntheticLambda0 x2externalsyntheticlambda0 = (x2ExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 5;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1 = x2externalsyntheticlambda0.onTransact;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 63;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return mappingRedirectableLiveDataExternalSyntheticLambda1;
        }
        throw null;
    }

    public final float onExtraCallback() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{this}, 1412967982, iOnExtraCallbackWithResult, -1412967982, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).floatValue();
    }

    public final MappingRedirectableLiveDataExternalSyntheticLambda1 IAuthTabCallback() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (MappingRedirectableLiveDataExternalSyntheticLambda1) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{this}, -1147261274, iOnExtraCallbackWithResult, 1147261275, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
    }
}
