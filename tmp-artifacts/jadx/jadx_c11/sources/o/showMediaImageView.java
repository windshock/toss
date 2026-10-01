package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class showMediaImageView {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final float IAuthTabCallback;
    private final long asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final long onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ showMediaImageView(long j, long j2, long j3, long j4, long j5, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, f, f2);
    }

    private showMediaImageView(long j, long j2, long j3, long j4, long j5, float f, float f2) {
        this.onTransact = j;
        this.asInterface = j2;
        this.onWarmupCompleted = j3;
        this.onExtraCallback = j4;
        this.onExtraCallbackWithResult = j5;
        this.onNavigationEvent = f;
        this.IAuthTabCallback = f2;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(boolean z, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jOnExtraCallbackWithResult;
        float f;
        int i2 = 2 % 2;
        int i3 = asBinder + 111;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(663755432, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1Colors.tintColor (TdsRatingV1.kt:330)");
        }
        if (z2) {
            int i4 = asBinder + 19;
            int i5 = i4 % 128;
            IAuthTabCallbackStub = i5;
            int i6 = i4 % 2;
            if (z) {
                int i7 = i5 + 95;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    jOnExtraCallbackWithResult = this.onTransact;
                    int i8 = 9 / 0;
                } else {
                    jOnExtraCallbackWithResult = this.onTransact;
                }
            } else {
                jOnExtraCallbackWithResult = this.asInterface;
            }
        } else {
            jOnExtraCallbackWithResult = z ? this.onWarmupCompleted : this.onExtraCallback;
        }
        if (!z) {
            f = 0.0f;
        } else if (z3) {
            f = this.IAuthTabCallback;
        } else {
            f = this.onNavigationEvent;
            int i9 = IAuthTabCallbackStub + 33;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        }
        if (f > 0.0f) {
            jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(getMaxAdCount.onExtraCallbackWithResult(this.onExtraCallbackWithResult, f), jOnExtraCallbackWithResult);
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(jOnExtraCallbackWithResult, getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null), "TintColor", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 432, 8);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 95;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!Intrinsics.areEqual(showMediaImageView.class, obj != null ? obj.getClass() : null)) {
            int i4 = IAuthTabCallbackStub + 61;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        showMediaImageView showmediaimageview = (showMediaImageView) obj;
        if (this.onNavigationEvent != showmediaimageview.onNavigationEvent || this.IAuthTabCallback != showmediaimageview.IAuthTabCallback) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onTransact, showmediaimageview.onTransact)) {
            int i6 = asBinder + 65;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.asInterface, showmediaimageview.asInterface)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, showmediaimageview.onWarmupCompleted)) {
            int i8 = asBinder + 55;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, showmediaimageview.onExtraCallback)) {
            return setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, showmediaimageview.onExtraCallbackWithResult);
        }
        int i10 = asBinder + 61;
        IAuthTabCallbackStub = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.onNavigationEvent);
        int iHashCode2 = Float.hashCode(this.IAuthTabCallback);
        int iOnTransact = setByteOrder.onTransact(this.onTransact);
        int iOnTransact2 = setByteOrder.onTransact(this.asInterface);
        int iOnTransact3 = (((((((((((iHashCode * 31) + iHashCode2) * 31) + iOnTransact) * 31) + iOnTransact2) * 31) + setByteOrder.onTransact(this.onWarmupCompleted)) * 31) + setByteOrder.onTransact(this.onExtraCallback)) * 31) + setByteOrder.onTransact(this.onExtraCallbackWithResult);
        int i4 = IAuthTabCallbackStub + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iOnTransact3;
    }
}
