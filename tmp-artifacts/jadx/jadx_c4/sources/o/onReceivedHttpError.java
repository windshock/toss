package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onReceivedHttpError {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final onReceivedHttpError onNavigationEvent = new onReceivedHttpError();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 1;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private onReceivedHttpError() {
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private final float IAuthTabCallback;
        private final float IAuthTabCallbackDefault;
        private final float asBinder;
        private final float asInterface;
        private final setByteOrder onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final onNavigationEvent onNavigationEvent;
        private final boolean onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(boolean z, setByteOrder setbyteorder, float f, float f2, float f3, float f4, float f5, onNavigationEvent onnavigationevent, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, setbyteorder, f, f2, f3, f4, f5, onnavigationevent);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 65;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.onWarmupCompleted != iAuthTabCallback.onWarmupCompleted) {
                int i5 = i3 + 119;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback)) {
                int i6 = IAuthTabCallbackStub + 13;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asBinder, iAuthTabCallback.asBinder)) {
                int i8 = onTransact + 21;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult) || !VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackDefault, iAuthTabCallback.IAuthTabCallbackDefault) || !VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asInterface, iAuthTabCallback.asInterface)) {
                return false;
            }
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback)) {
                int i10 = onTransact + 53;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                return false;
            }
            int i12 = IAuthTabCallbackStub + 105;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }

        public int hashCode() {
            int iOnTransact;
            int i = 2 % 2;
            int iHashCode = Boolean.hashCode(this.onWarmupCompleted);
            setByteOrder setbyteorder = this.onExtraCallback;
            int iHashCode2 = 0;
            if (setbyteorder == null) {
                int i2 = IAuthTabCallbackStub + 117;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                iOnTransact = 0;
            } else {
                iOnTransact = setByteOrder.onTransact(setbyteorder.access100());
                int i4 = IAuthTabCallbackStub + 15;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            int iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asBinder);
            int iOnWarmupCompleted2 = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult);
            int iOnWarmupCompleted3 = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackDefault);
            int iOnWarmupCompleted4 = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asInterface);
            int iOnWarmupCompleted5 = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback);
            onNavigationEvent onnavigationevent = this.onNavigationEvent;
            if (onnavigationevent != null) {
                int i6 = onTransact + 5;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = onnavigationevent.hashCode();
            }
            return (((((((((((((iHashCode * 31) + iOnTransact) * 31) + iOnWarmupCompleted) * 31) + iOnWarmupCompleted2) * 31) + iOnWarmupCompleted3) * 31) + iOnWarmupCompleted4) * 31) + iOnWarmupCompleted5) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LayoutOptions(isNormalCardType=" + this.onWarmupCompleted + ", backgroundColor=" + this.onExtraCallback + ", radius=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder) + ", marginLeft=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallbackWithResult) + ", marginTop=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackDefault) + ", marginRight=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asInterface) + ", marginBottom=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ", border=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallbackStub + 7;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        private IAuthTabCallback(boolean z, setByteOrder setbyteorder, float f, float f2, float f3, float f4, float f5, onNavigationEvent onnavigationevent) {
            this.onWarmupCompleted = z;
            this.onExtraCallback = setbyteorder;
            this.asBinder = f;
            this.onExtraCallbackWithResult = f2;
            this.IAuthTabCallbackDefault = f3;
            this.asInterface = f4;
            this.IAuthTabCallback = f5;
            this.onNavigationEvent = onnavigationevent;
        }

        public final boolean asBinder() {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 81;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                z = this.onWarmupCompleted;
                int i4 = 66 / 0;
            } else {
                z = this.onWarmupCompleted;
            }
            int i5 = i3 + 19;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final float IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 43;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            float f = this.asBinder;
            int i5 = i2 + 81;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 103;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                int i4 = 13 / 0;
            }
            return f;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 125;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackDefault;
            int i5 = i3 + 61;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 75;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            float f = this.asInterface;
            int i5 = i2 + 47;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 24 / 0;
            }
            return f;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 23;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f = this.IAuthTabCallback;
            int i4 = i3 + 95;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final onNavigationEvent onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 35;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            return onnavigationevent;
        }

        public static final class onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private final long onExtraCallback;
            private final float onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    int i2 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i2 % 128;
                    return i2 % 2 == 0;
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                    int i3 = IAuthTabCallback + 49;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                    int i5 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                int i7 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted);
                return i3 == 0 ? (iOnWarmupCompleted - 101) % setByteOrder.onTransact(this.onExtraCallback) : (iOnWarmupCompleted * 31) + setByteOrder.onTransact(this.onExtraCallback);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Border(width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onWarmupCompleted) + ", color=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallback) + ")";
                int i2 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 0;
                }
                return str;
            }

            public final float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                float f = this.onWarmupCompleted;
                int i5 = i3 + 53;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public final long IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                long j = this.onExtraCallback;
                int i5 = i2 + 113;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return j;
            }
        }
    }

    public final IAuthTabCallback onExtraCallbackWithResult(boolean z, @Nullable setByteOrder setbyteorder, float f, float f2, float f3, float f4, float f5, @Nullable IAuthTabCallback.onNavigationEvent onnavigationevent, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        int i3 = 2 % 2;
        boolean z2 = (i2 & 1) != 0 ? false : z;
        setByteOrder setbyteorder2 = (i2 & 2) != 0 ? null : setbyteorder;
        float fIAuthTabCallback3 = (i2 & 4) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
        if ((i2 & 8) != 0) {
            int i4 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        } else {
            fIAuthTabCallback = f2;
        }
        float fIAuthTabCallback4 = (i2 & 16) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f3;
        float fIAuthTabCallback5 = (i2 & 32) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f4;
        if ((i2 & 64) != 0) {
            int i6 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        } else {
            fIAuthTabCallback2 = f5;
        }
        IAuthTabCallback.onNavigationEvent onnavigationevent2 = (i2 & 128) == 0 ? onnavigationevent : null;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i8 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-85494189, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsDefaults.layoutOptions (NativeAdsDefaults.kt:36)");
            int i10 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(z2, setbyteorder2, fIAuthTabCallback3, fIAuthTabCallback, fIAuthTabCallback4, fIAuthTabCallback5, fIAuthTabCallback2, onnavigationevent2, null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i12 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
        }
        return iAuthTabCallback;
    }
}
