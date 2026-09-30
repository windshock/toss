package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinVastMediaViewb {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int getInterfaceDescriptor;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long asBinder;
    private final long asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ AppLovinVastMediaViewb(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    private AppLovinVastMediaViewb(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.onWarmupCompleted = j;
        this.onNavigationEvent = j2;
        this.onExtraCallback = j3;
        this.asBinder = j4;
        this.asInterface = j5;
        this.onTransact = j6;
        this.onExtraCallbackWithResult = j7;
        this.IAuthTabCallback = j8;
        this.IAuthTabCallbackDefault = j9;
        this.IAuthTabCallbackStub = j10;
    }

    public final long onWarmupCompleted(boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        int i2 = 2 % 2;
        Object obj = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallbackStubProxy + 39;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-743493084, i, -1, "im.toss.tds.compose.component.atom.switches.TdsSwitchV1Colors.thumbColor (TdsSwitchV1.kt:197)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-743493084, i, -1, "im.toss.tds.compose.component.atom.switches.TdsSwitchV1Colors.thumbColor (TdsSwitchV1.kt:197)");
        }
        if (z) {
            int i4 = IAuthTabCallbackStubProxy + 5;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            j = z2 ? this.onWarmupCompleted : this.asBinder;
        } else if (z2) {
            j = this.onExtraCallbackWithResult;
            int i5 = IAuthTabCallbackStubProxy + 1;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 4;
            }
        } else {
            j = this.IAuthTabCallbackDefault;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = getInterfaceDescriptor + 23;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return j;
    }

    public final long onNavigationEvent(boolean z, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(639671403, i, -1, "im.toss.tds.compose.component.atom.switches.TdsSwitchV1Colors.trackColor (TdsSwitchV1.kt:206)");
        }
        if (z) {
            if (z2) {
                j = !(z3 ^ true) ? this.onExtraCallback : this.onNavigationEvent;
            } else {
                j = z3 ? this.onTransact : this.asInterface;
            }
        } else if (z2) {
            int i3 = getInterfaceDescriptor + 73;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            j = this.IAuthTabCallback;
        } else {
            j = this.IAuthTabCallbackStub;
            int i5 = IAuthTabCallbackStubProxy + 65;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 4;
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return j;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AppLovinVastMediaViewb.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AppLovinVastMediaViewb appLovinVastMediaViewb = (AppLovinVastMediaViewb) obj;
        if (!setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, appLovinVastMediaViewb.onWarmupCompleted) || !setByteOrder.onExtraCallbackWithResult(this.onNavigationEvent, appLovinVastMediaViewb.onNavigationEvent) || !setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, appLovinVastMediaViewb.onExtraCallback) || !setByteOrder.onExtraCallbackWithResult(this.asBinder, appLovinVastMediaViewb.asBinder)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.asInterface, appLovinVastMediaViewb.asInterface)) {
            int i2 = getInterfaceDescriptor + 67;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onTransact, appLovinVastMediaViewb.onTransact)) {
            int i4 = IAuthTabCallbackStubProxy + 23;
            getInterfaceDescriptor = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, appLovinVastMediaViewb.onExtraCallbackWithResult) || !setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback, appLovinVastMediaViewb.IAuthTabCallback)) {
            return false;
        }
        if (setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, appLovinVastMediaViewb.IAuthTabCallbackDefault)) {
            if (setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallbackStub, appLovinVastMediaViewb.IAuthTabCallbackStub)) {
                return true;
            }
            int i5 = IAuthTabCallbackStubProxy + 47;
            getInterfaceDescriptor = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = getInterfaceDescriptor + 101;
        int i7 = i6 % 128;
        IAuthTabCallbackStubProxy = i7;
        boolean z = i6 % 2 == 0;
        int i8 = i7 + 83;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = setByteOrder.onTransact(this.onWarmupCompleted);
        int iOnTransact2 = setByteOrder.onTransact(this.onNavigationEvent);
        int iOnTransact3 = setByteOrder.onTransact(this.onExtraCallback);
        int iOnTransact4 = setByteOrder.onTransact(this.asBinder);
        int iOnTransact5 = setByteOrder.onTransact(this.asInterface);
        int iOnTransact6 = setByteOrder.onTransact(this.onTransact);
        int iOnTransact7 = setByteOrder.onTransact(this.onExtraCallbackWithResult);
        int iOnTransact8 = (((((((((((((((((iOnTransact * 31) + iOnTransact2) * 31) + iOnTransact3) * 31) + iOnTransact4) * 31) + iOnTransact5) * 31) + iOnTransact6) * 31) + iOnTransact7) * 31) + setByteOrder.onTransact(this.IAuthTabCallback)) * 31) + setByteOrder.onTransact(this.IAuthTabCallbackDefault)) * 31) + setByteOrder.onTransact(this.IAuthTabCallbackStub);
        int i4 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return iOnTransact8;
    }
}
