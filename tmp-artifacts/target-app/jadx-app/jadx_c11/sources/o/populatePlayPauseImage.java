package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.tds.compose.component.token.RatingSizingTokens;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.populatePlayPauseImage;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class populatePlayPauseImage {
    private static int IAuthTabCallback = 0;
    public static final populatePlayPauseImage onExtraCallback = new populatePlayPauseImage();
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 73;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private populatePlayPauseImage() {
    }

    public static final class onWarmupCompleted {
        public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
        private static final onWarmupCompleted IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;
        private static final onWarmupCompleted onExtraCallback;
        private static final onWarmupCompleted onExtraCallbackWithResult;
        private static int onTransact = 1;
        private final float asInterface;
        private final float onNavigationEvent;
        private final DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted;

        public /* synthetic */ onWarmupCompleted(float f, float f2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, deviceQuirksExternalSyntheticLambda0);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackDefault + 107;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asInterface, onwarmupcompleted.asInterface)) {
                return false;
            }
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted);
            }
            int i3 = IAuthTabCallbackDefault + 3;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 115;
            onTransact = i2 % 128;
            int iOnWarmupCompleted = i2 % 2 == 0 ? (((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asInterface) * 49) >>> VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent)) >> 107) / this.onWarmupCompleted.hashCode() : (((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asInterface) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent)) * 31) + this.onWarmupCompleted.hashCode();
            int i3 = onTransact + 107;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return iOnWarmupCompleted;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ControlSize(iconSize=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asInterface) + ", iconGap=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ", contentPadding=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallbackDefault + 41;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
            }
            return str;
        }

        private onWarmupCompleted(float f, float f2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            this.asInterface = f;
            this.onNavigationEvent = f2;
            this.onWarmupCompleted = deviceQuirksExternalSyntheticLambda0;
        }

        public static final /* synthetic */ onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 25;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            onWarmupCompleted onwarmupcompleted = IAuthTabCallback;
            int i4 = i2 + 63;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public static final /* synthetic */ onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 19;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = onExtraCallback;
            int i5 = i2 + 21;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(float f, float f2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                int i2 = onTransact + 3;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                deviceQuirksExternalSyntheticLambda0 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                int i4 = IAuthTabCallbackDefault + 45;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this(f, f2, deviceQuirksExternalSyntheticLambda0, null);
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 57;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.asInterface;
            }
            throw null;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 93;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 79;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.onWarmupCompleted;
            int i5 = i2 + 21;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return deviceQuirksExternalSyntheticLambda0;
        }

        public static final class onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }

            public final onWarmupCompleted onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedOnExtraCallback = onWarmupCompleted.onExtraCallback();
                int i4 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompletedOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onWarmupCompleted onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onWarmupCompleted = onWarmupCompleted.onWarmupCompleted();
                if (i3 == 0) {
                    int i4 = 1 / 0;
                }
                return onWarmupCompleted;
            }
        }

        static {
            RatingSizingTokens ratingSizingTokens = RatingSizingTokens.onExtraCallback;
            IAuthTabCallback = new onWarmupCompleted(ratingSizingTokens.onExtraCallbackWithResult(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), null, 4, null);
            onExtraCallbackWithResult = new onWarmupCompleted(ratingSizingTokens.onNavigationEvent(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), null, 4, null);
            onExtraCallback = new onWarmupCompleted(ratingSizingTokens.onWarmupCompleted(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), null, 4, null);
            int i = IAuthTabCallbackStub + 85;
            asBinder = i % 128;
            int i2 = i % 2;
        }
    }

    public static abstract class onExtraCallbackWithResult {
        public static final IAuthTabCallback Companion;
        private static final onExtraCallbackWithResult IAuthTabCallback;
        private static int IAuthTabCallbackStubProxy = 1;
        private static int access100 = 0;
        private static int asInterface = 0;
        private static int getInterfaceDescriptor = 1;
        private static final onExtraCallbackWithResult onExtraCallback;
        private static final onExtraCallbackWithResult onExtraCallbackWithResult;
        private static final onExtraCallbackWithResult onNavigationEvent;
        private static final onExtraCallbackWithResult onWarmupCompleted;
        private final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallbackDefault;
        private final float IAuthTabCallbackStub;
        private final float asBinder;
        private final float onTransact;

        public /* synthetic */ onExtraCallbackWithResult(float f, float f2, float f3, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, deviceQuirksExternalSyntheticLambda0);
        }

        public abstract getHumanReadableName onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        private onExtraCallbackWithResult(float f, float f2, float f3, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            this.IAuthTabCallbackStub = f;
            this.asBinder = f2;
            this.onTransact = f3;
            this.IAuthTabCallbackDefault = deviceQuirksExternalSyntheticLambda0;
        }

        public static final /* synthetic */ onExtraCallbackWithResult IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 91;
            access100 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            onExtraCallbackWithResult onextracallbackwithresult = IAuthTabCallback;
            int i4 = i2 + 37;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresult;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(float f, float f2, float f3, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = getInterfaceDescriptor + 75;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            }
            float f4 = f2;
            float fIAuthTabCallback = (i & 4) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f) : f3;
            if ((i & 8) != 0) {
                int i4 = access100 + 97;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                deviceQuirksExternalSyntheticLambda0 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                int i6 = 2 % 2;
            }
            this(f, f4, fIAuthTabCallback, deviceQuirksExternalSyntheticLambda0, null);
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 5;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallbackStub;
            }
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 19;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            float f = this.asBinder;
            int i5 = i2 + 59;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return f;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100 + 59;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onTransact;
            if (i3 == 0) {
                int i4 = 96 / 0;
            }
            return f;
        }

        public final DeviceQuirksExternalSyntheticLambda0 onExtraCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 91;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallbackDefault;
            }
            throw null;
        }

        public static final class IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final onExtraCallbackWithResult onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = onExtraCallbackWithResult.IAuthTabCallback();
                int i4 = IAuthTabCallback + 9;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackwithresultIAuthTabCallback;
            }
        }

        public static final class onWarmupCompleted extends onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            onWarmupCompleted(float f) {
                super(f, 0.0f, 0.0f, null, 14, null);
            }

            @Override // o.populatePlayPauseImage.onExtraCallbackWithResult
            public getHumanReadableName onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 75;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1578229242);
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1578229242);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = onExtraCallbackWithResult + 29;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1578229242, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlySize.Companion.Big.<no name provided>.textStyle (TdsRatingV1.kt:146)");
                }
                getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.asInterface(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameOnNavigationEvent;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new IAuthTabCallback(defaultConstructorMarker);
            RatingSizingTokens ratingSizingTokens = RatingSizingTokens.onExtraCallback;
            onExtraCallback = new onWarmupCompleted(ratingSizingTokens.onExtraCallbackWithResult());
            IAuthTabCallback = new onNavigationEvent(ratingSizingTokens.onNavigationEvent());
            onNavigationEvent = new C0050onExtraCallbackWithResult(ratingSizingTokens.onWarmupCompleted());
            onExtraCallbackWithResult = new onExtraCallback(ratingSizingTokens.IAuthTabCallback());
            onWarmupCompleted = new asInterface(ratingSizingTokens.onExtraCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f));
            int i = IAuthTabCallbackStubProxy + 61;
            asInterface = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            onNavigationEvent(float f) {
                super(f, 0.0f, 0.0f, null, 14, null);
            }

            @Override // o.populatePlayPauseImage.onExtraCallbackWithResult
            public getHumanReadableName onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1465981409);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = onWarmupCompleted + 87;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1465981409, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlySize.Companion.Large.<no name provided>.textStyle (TdsRatingV1.kt:158)");
                }
                Object[] objArr = {AppLovinPostbackService.onExtraCallbackWithResult};
                getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onWarmupCompleted + 15;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameOnNavigationEvent;
            }
        }

        /* renamed from: o.populatePlayPauseImage$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0050onExtraCallbackWithResult extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            C0050onExtraCallbackWithResult(float f) {
                super(f, 0.0f, 0.0f, null, 14, null);
            }

            @Override // o.populatePlayPauseImage.onExtraCallbackWithResult
            public getHumanReadableName onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1955748917);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1955748917, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlySize.Companion.Medium.<no name provided>.textStyle (TdsRatingV1.kt:170)");
                    }
                    getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.access100(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i4 = onExtraCallbackWithResult + 109;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i6 = onExtraCallbackWithResult + 99;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return gethumanreadablenameOnNavigationEvent;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1955748917);
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            onExtraCallback(float f) {
                super(f, 0.0f, 0.0f, null, 14, null);
            }

            @Override // o.populatePlayPauseImage.onExtraCallbackWithResult
            public getHumanReadableName onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 77;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1778297133);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1778297133, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlySize.Companion.Small.<no name provided>.textStyle (TdsRatingV1.kt:182)");
                }
                getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i5 = onWarmupCompleted + 67;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return gethumanreadablenameOnNavigationEvent;
            }
        }

        public static final class asInterface extends onExtraCallbackWithResult {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            asInterface(float f, float f2) {
                super(f, 0.0f, f2, null, 10, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
            @Override // o.populatePlayPauseImage.onExtraCallbackWithResult
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public getHumanReadableName onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 49;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-822520672);
                    int i4 = 68 / 0;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i5 = onWarmupCompleted + 77;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-822520672, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlySize.Companion.Tiny.<no name provided>.textStyle (TdsRatingV1.kt:195)");
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-822520672);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
                getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onWarmupCompleted + 13;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = onWarmupCompleted + 59;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameOnNavigationEvent;
            }
        }
    }

    public interface onNavigationEvent {
        public static final IAuthTabCallback Companion = IAuthTabCallback.IAuthTabCallback;

        int onNavigationEvent();

        default onExtraCallback onExtraCallback() {
            int i = 2 % 2;
            return onExtraCallback.Companion.onExtraCallback();
        }

        default void onWarmupCompleted(float f, float f2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1462021526);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1462021526, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlyType.Left (TdsRatingV1.kt:214)");
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }

        default void onNavigationEvent(float f, float f2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-587652125);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-587652125, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlyType.Right (TdsRatingV1.kt:218)");
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }

        public static final class IAuthTabCallback {
            private static int IAuthTabCallbackDefault = 1;
            private static int IAuthTabCallbackStub = 0;
            private static int asInterface = 1;
            private static int onExtraCallback;
            static final /* synthetic */ IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
            private static final onNavigationEvent onNavigationEvent = new C0051onNavigationEvent();
            private static final onNavigationEvent onExtraCallbackWithResult = new onExtraCallbackWithResult();
            private static final onNavigationEvent onWarmupCompleted = new onExtraCallback();

            private static final Unit onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
                int i3 = 2 % 2;
                int i4 = asInterface + 117;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iAuthTabCallback.IAuthTabCallback(f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
                Unit unit = Unit.INSTANCE;
                int i6 = onExtraCallback + 125;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            public static /* synthetic */ Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
                int i3 = 2 % 2;
                int i4 = asInterface + 117;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
                int i6 = asInterface + 107;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return unitOnExtraCallbackWithResult;
            }

            public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
                int i = 2 % 2;
                int i2 = asInterface + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(useandconfigureprogramwithtexture);
                if (i3 != 0) {
                    int i4 = 89 / 0;
                }
                int i5 = onExtraCallback + 53;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallback() {
            }

            public static final /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 109;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback.IAuthTabCallback(f, cameraCaptureResultEmptyCameraCaptureResult, i);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* renamed from: o.populatePlayPauseImage$onNavigationEvent$IAuthTabCallback$onNavigationEvent, reason: collision with other inner class name */
            public static final class C0051onNavigationEvent implements onNavigationEvent {
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                private final int onExtraCallbackWithResult = 5;

                C0051onNavigationEvent() {
                }

                @Override // o.populatePlayPauseImage.onNavigationEvent
                public int onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 95;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    int i5 = this.onExtraCallbackWithResult;
                    int i6 = i3 + 83;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return i5;
                }

                @Override // o.populatePlayPauseImage.onNavigationEvent
                public void onNavigationEvent(float f, float f2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                    int i2 = 2 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(348238332);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i3 = onWarmupCompleted + 87;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(348238332, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlyType.Companion.Full.<no name provided>.Right (TdsRatingV1.kt:229)");
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(348238332, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlyType.Companion.Full.<no name provided>.Right (TdsRatingV1.kt:229)");
                    }
                    IAuthTabCallback.IAuthTabCallback(IAuthTabCallback.IAuthTabCallback, f, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 48);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i4 = onWarmupCompleted + 91;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i6 = onNavigationEvent + 103;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }

            static {
                int i = IAuthTabCallbackDefault + 107;
                IAuthTabCallbackStub = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public final onNavigationEvent onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onnavigationevent = onNavigationEvent;
                if (i3 == 0) {
                    int i4 = 10 / 0;
                }
                return onnavigationevent;
            }

            public static final class onExtraCallbackWithResult implements onNavigationEvent {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;
                private final onExtraCallback IAuthTabCallback;
                private final int onExtraCallbackWithResult;

                onExtraCallbackWithResult() {
                    Object[] objArr = {onExtraCallback.Companion};
                    this.IAuthTabCallback = (onExtraCallback) onExtraCallback.IAuthTabCallback.onWarmupCompleted(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1837878941, -1837878939, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr);
                    this.onExtraCallbackWithResult = 1;
                }

                @Override // o.populatePlayPauseImage.onNavigationEvent
                public onExtraCallback onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 9;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onExtraCallback onextracallback = this.IAuthTabCallback;
                    if (i3 != 0) {
                        int i4 = 51 / 0;
                    }
                    return onextracallback;
                }

                @Override // o.populatePlayPauseImage.onNavigationEvent
                public int onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 99;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    int i5 = this.onExtraCallbackWithResult;
                    int i6 = i3 + 59;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        return i5;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // o.populatePlayPauseImage.onNavigationEvent
                public void onNavigationEvent(float f, float f2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 99;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(918498398);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i4 = onWarmupCompleted + 13;
                            onExtraCallback = i4 % 128;
                            if (i4 % 2 == 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(918498398, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlyType.Companion.Compact.<no name provided>.Right (TdsRatingV1.kt:242)");
                            } else {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(918498398, i, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlyType.Companion.Compact.<no name provided>.Right (TdsRatingV1.kt:242)");
                                int i5 = 56 / 0;
                            }
                        }
                        IAuthTabCallback.IAuthTabCallback(IAuthTabCallback.IAuthTabCallback, f, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        return;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(918498398);
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public final onNavigationEvent IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 33;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                onNavigationEvent onnavigationevent = onExtraCallbackWithResult;
                int i5 = i3 + 57;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }

            public static final class onExtraCallback implements onNavigationEvent {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private final int onExtraCallbackWithResult = 5;

                onExtraCallback() {
                }

                @Override // o.populatePlayPauseImage.onNavigationEvent
                public int onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 117;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = this.onExtraCallbackWithResult;
                    int i6 = i2 + 33;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        return i5;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public final onNavigationEvent onExtraCallback() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                onNavigationEvent onnavigationevent = onWarmupCompleted;
                int i5 = i2 + 107;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return onnavigationevent;
                }
                throw null;
            }

            private static final Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
                int i = 2 % 2;
                int i2 = asInterface + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallback + 27;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private final void IAuthTabCallback(final float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
                int i2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
                int i3;
                int i4 = 2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1723496715);
                if ((i & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                        int i5 = onExtraCallback + 101;
                        asInterface = i5 % 128;
                        int i6 = i5 % 2;
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i2 = i3 | i;
                } else {
                    i2 = i;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                } else {
                    int i7 = onExtraCallback + 53;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1723496715, i2, -1, "im.toss.tds.compose.component.atom.rating.TdsRatingV1.ReadOnlyType.Companion.RatingText (TdsRatingV1.kt:254)");
                    }
                    String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1$ReadOnlyType$Companion$$ExternalSyntheticLambda0
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i9 = 2 % 2;
                                int i10 = onExtraCallbackWithResult + 43;
                                onWarmupCompleted = i10 % 128;
                                int i11 = i10 % 2;
                                Unit unitOnNavigationEvent = populatePlayPauseImage.onNavigationEvent.IAuthTabCallback.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
                                int i12 = onExtraCallbackWithResult + 35;
                                onWarmupCompleted = i12 % 128;
                                if (i12 % 2 == 0) {
                                    int i13 = 11 / 0;
                                }
                                return unitOnNavigationEvent;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, (Function1) objOnMinimized), null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 131068}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i9 = asInterface + 125;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1$ReadOnlyType$Companion$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                            int i11 = 2 % 2;
                            int i12 = onWarmupCompleted + 53;
                            onExtraCallbackWithResult = i12 % 128;
                            if (i12 % 2 != 0) {
                                populatePlayPauseImage.onNavigationEvent.IAuthTabCallback.onNavigationEvent(this.f$0, f, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            Unit unitOnNavigationEvent = populatePlayPauseImage.onNavigationEvent.IAuthTabCallback.onNavigationEvent(this.f$0, f, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i13 = onExtraCallbackWithResult + 31;
                            onWarmupCompleted = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i14 = 33 / 0;
                            }
                            return unitOnNavigationEvent;
                        }
                    });
                }
            }
        }
    }

    public interface onExtraCallback {
        public static final IAuthTabCallback Companion = IAuthTabCallback.onNavigationEvent;

        float transform(float f);

        public static final class IAuthTabCallback {
            private static int IAuthTabCallbackDefault = 1;
            private static int IAuthTabCallbackStub = 0;
            private static int asInterface = 0;
            private static int getInterfaceDescriptor = 1;
            static final /* synthetic */ IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
            private static final onExtraCallback onTransact = new onExtraCallback() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1$ValueTransformer$Companion$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.populatePlayPauseImage.onExtraCallback
                public final float transform(float f) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 11;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onExtraCallback(f);
                        throw null;
                    }
                    float fOnExtraCallback = populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onExtraCallback(f);
                    int i3 = onWarmupCompleted + 11;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return fOnExtraCallback;
                }
            };
            private static final onExtraCallback onWarmupCompleted = new onExtraCallback() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1$ValueTransformer$Companion$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.populatePlayPauseImage.onExtraCallback
                public final float transform(float f) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 25;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr = {Float.valueOf(f)};
                    float fFloatValue = ((Float) populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onWarmupCompleted(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 2001798796, -2001798795, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr)).floatValue();
                    int i4 = onNavigationEvent + 59;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return fFloatValue;
                    }
                    throw null;
                }
            };
            private static final onExtraCallback asBinder = new onExtraCallback() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1$ValueTransformer$Companion$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // o.populatePlayPauseImage.onExtraCallback
                public final float transform(float f) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 121;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onNavigationEvent(f);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    float fOnNavigationEvent = populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onNavigationEvent(f);
                    int i3 = onExtraCallback + 101;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return fOnNavigationEvent;
                }
            };
            private static final onExtraCallback IAuthTabCallback = new onExtraCallback() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1$ValueTransformer$Companion$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.populatePlayPauseImage.onExtraCallback
                public final float transform(float f) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 105;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    float fIAuthTabCallback = populatePlayPauseImage.onExtraCallback.IAuthTabCallback.IAuthTabCallback(f);
                    int i4 = onNavigationEvent + 21;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return fIAuthTabCallback;
                }
            };
            private static final onExtraCallback onExtraCallback = new onExtraCallback() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1$ValueTransformer$Companion$$ExternalSyntheticLambda4
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.populatePlayPauseImage.onExtraCallback
                public final float transform(float f) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 95;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    float fOnExtraCallbackWithResult = populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onExtraCallbackWithResult(f);
                    if (i3 == 0) {
                        int i4 = 9 / 0;
                    }
                    int i5 = onExtraCallbackWithResult + 11;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return fOnExtraCallbackWithResult;
                }
            };
            private static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback() { // from class: im.toss.tds.compose.component.atom.rating.TdsRatingV1$ValueTransformer$Companion$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.populatePlayPauseImage.onExtraCallback
                public final float transform(float f) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 115;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onTransact(f);
                        throw null;
                    }
                    float fOnTransact = populatePlayPauseImage.onExtraCallback.IAuthTabCallback.onTransact(f);
                    int i3 = onExtraCallback + 79;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        return fOnTransact;
                    }
                    throw null;
                }
            };

            public static /* synthetic */ float IAuthTabCallback(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 47;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                float fIAuthTabCallbackDefault = IAuthTabCallbackDefault(f);
                if (i3 != 0) {
                    int i4 = 12 / 0;
                }
                int i5 = asInterface + 23;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return fIAuthTabCallbackDefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final float IAuthTabCallback_Parcel(float f) {
                float f2;
                int i = 2 % 2;
                float f3 = (int) f;
                float f4 = f - f3;
                if (f4 < 0.25f) {
                    int i2 = asInterface + 89;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    f2 = 0.0f;
                } else if (f4 < 0.75f) {
                    int i4 = IAuthTabCallbackDefault + 87;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                return f3 + f2;
            }

            private static final float asBinder(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 27;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 63;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 44 / 0;
                }
                return Float.MAX_VALUE;
            }

            private static final float asInterface(float f) {
                int i = 2 % 2;
                int i2 = asInterface + 57;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return f;
                }
                throw null;
            }

            public static /* synthetic */ float onExtraCallback(float f) {
                int i = 2 % 2;
                int i2 = asInterface + 105;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return IAuthTabCallback_Parcel(f);
                }
                IAuthTabCallback_Parcel(f);
                throw null;
            }

            private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                float fFloatValue = ((Number) objArr[0]).floatValue();
                int i = 2 % 2;
                int i2 = asInterface + 103;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                float fAsInterface = asInterface(fFloatValue);
                int i4 = IAuthTabCallbackDefault + 7;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return Float.valueOf(fAsInterface);
            }

            public static /* synthetic */ float onExtraCallbackWithResult(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 61;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                float fIAuthTabCallbackStub = IAuthTabCallbackStub(f);
                int i4 = IAuthTabCallbackDefault + 13;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return fIAuthTabCallbackStub;
            }

            public static /* synthetic */ float onNavigationEvent(float f) {
                int i = 2 % 2;
                int i2 = asInterface + 119;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    access100(f);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                float fAccess100 = access100(f);
                int i3 = IAuthTabCallbackDefault + 123;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 51 / 0;
                }
                return fAccess100;
            }

            public static /* synthetic */ float onTransact(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 15;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return asBinder(f);
                }
                asBinder(f);
                throw null;
            }

            public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
                int i7 = ~i5;
                int i8 = ~i4;
                int i9 = ~(i7 | i8);
                int i10 = (~((~i) | i7)) | i9;
                int i11 = (~(i | i7)) | i9;
                int i12 = ~(i8 | i5);
                int i13 = i5 + i4 + i3 + (104229478 * i2) + ((-1414784667) * i6);
                int i14 = i13 * i13;
                int i15 = ((i5 * (-393484327)) - 513802240) + ((-393484327) * i4) + (i10 * 23337000) + (i11 * 23337000) + (23337000 * i12) + ((-370147328) * i3) + ((-1784676352) * i2) + ((-1146093568) * i6) + ((-1043988480) * i14);
                int i16 = ((i5 * 256725217) - 1927268364) + (i4 * 256725217) + (i10 * 872) + (i11 * 872) + (i12 * 872) + (i3 * 256726089) + (i2 * (-1692676330)) + (i6 * (-87465523)) + (i14 * 964034560);
                int i17 = i15 + (i16 * i16 * (-1055260672));
                return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
            }

            private IAuthTabCallback() {
            }

            static {
                int i = IAuthTabCallbackStub + 49;
                getInterfaceDescriptor = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public final onExtraCallback onExtraCallback() {
                onExtraCallback onextracallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 93;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    onextracallback = onTransact;
                    int i4 = 38 / 0;
                } else {
                    onextracallback = onTransact;
                }
                int i5 = i2 + 35;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    return onextracallback;
                }
                throw null;
            }

            private static final float access100(float f) {
                int i = 2 % 2;
                int i2 = asInterface + 21;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Math.rint(f);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                float fRint = (float) Math.rint(f);
                int i3 = asInterface + 25;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                return fRint;
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 39;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                onExtraCallback onextracallback = asBinder;
                int i5 = i3 + 97;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return onextracallback;
                }
                throw null;
            }

            private static final float IAuthTabCallbackDefault(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 1;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                float fCeil = (float) Math.ceil(f);
                int i4 = asInterface + 49;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return fCeil;
            }

            public final onExtraCallback onNavigationEvent() {
                onExtraCallback onextracallback;
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 79;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    onextracallback = IAuthTabCallback;
                    int i4 = 26 / 0;
                } else {
                    onextracallback = IAuthTabCallback;
                }
                int i5 = i2 + 123;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return onextracallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final float IAuthTabCallbackStub(float f) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 99;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                float fFloor = (float) Math.floor(f);
                int i4 = asInterface + 9;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return fFloor;
                }
                throw null;
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 95;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                onExtraCallback onextracallback = onExtraCallbackWithResult;
                int i5 = i3 + 93;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return onextracallback;
            }

            public static /* synthetic */ float onWarmupCompleted(float f) {
                Object[] objArr = {Float.valueOf(f)};
                return ((Float) onWarmupCompleted(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 2001798796, -2001798795, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr)).floatValue();
            }

            public final onExtraCallback onWarmupCompleted() {
                int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                return (onExtraCallback) onWarmupCompleted(iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2, 1837878941, -1837878939, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{this});
            }

            public final onExtraCallback IAuthTabCallback() {
                int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                return (onExtraCallback) onWarmupCompleted(iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2, -855871671, 855871671, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{this});
            }
        }
    }
}
