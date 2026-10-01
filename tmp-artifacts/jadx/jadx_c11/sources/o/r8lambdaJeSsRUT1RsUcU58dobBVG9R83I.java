package o;

import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.setByteOrder;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaJeSsRUT1RsUcU58dobBVG9R83I {
    private static final float IAuthTabCallback;
    private static final float IAuthTabCallbackDefault;
    private static final float IAuthTabCallbackStub;
    private static final float IAuthTabCallbackStubProxy;
    private static final float IAuthTabCallback_Parcel;
    private static final float ICustomTabsCallback;
    private static final float ICustomTabsCallbackDefault;
    private static final float ICustomTabsCallbackStub;
    private static final float ICustomTabsCallbackStubProxy;
    private static int ICustomTabsCallback_Parcel = 0;
    private static final float ICustomTabsService;
    private static final float access000;
    private static final float asInterface;
    private static final float extraCallback;
    private static final float extraCallbackWithResult;
    private static int extraCommand = 0;
    private static final float getInterfaceDescriptor;
    private static int isEngagementSignalsApiAvailable = 1;
    private static final float mayLaunchUrl;
    private static final float onActivityLayout;
    private static final float onActivityResized;
    private static final float onMessageChannelReady;
    private static final float onMinimized;
    private static final float onNavigationEvent;
    private static final float onPostMessage;
    private static final float onRelationshipValidationResult;
    private static final float onUnminimized;
    private static int prefetch = 1;
    private static final float readTypedObject;
    private static final float writeTypedObject;
    public static final r8lambdaJeSsRUT1RsUcU58dobBVG9R83I onWarmupCompleted = new r8lambdaJeSsRUT1RsUcU58dobBVG9R83I();
    private static final float access100 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
    private static final float asBinder = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
    private static final float onTransact = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f);

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i4 | i6);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i6)) | (~(i7 | i9)) | (~(i9 | i6));
        int i14 = i6 + i + i3 + (669352129 * i5) + (266941808 * i2);
        int i15 = i14 * i14;
        int i16 = (720661947 * i6) + 1572077568 + ((-1243901369) * i) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i3) + ((-1100480512) * i5) + ((-1249902592) * i2) + ((-491520000) * i15);
        int i17 = (i6 * 1617402437) + 56426783 + (i * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i3 * 1617401855) + (i5 * 1244927807) + (i2 * (-404665712)) + (i15 * (-45350912));
        switch (i16 + (i17 * i17 * 1565261824)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return onTransact(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private r8lambdaJeSsRUT1RsUcU58dobBVG9R83I() {
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 89;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        float f = access100;
        int i5 = i2 + 45;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 23;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallback;
        int i5 = i2 + 117;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCommand + 47;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder;
        }
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = prefetch + 93;
        int i3 = i2 % 128;
        extraCommand = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        float f = onExtraCallbackWithResult;
        int i4 = i3 + 19;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 105;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        float f = onTransact;
        int i5 = i2 + 3;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float asBinder() {
        int i = 2 % 2;
        int i2 = extraCommand + 43;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        float f = asInterface;
        int i5 = i3 + 7;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float extraCallback() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 63;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        float f = ICustomTabsCallback;
        int i5 = i2 + 23;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return f;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCommand + 81;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return Float.valueOf(writeTypedObject);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float readTypedObject() {
        float f;
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 117;
        prefetch = i3 % 128;
        if (i3 % 2 == 0) {
            f = readTypedObject;
            int i4 = 61 / 0;
        } else {
            f = readTypedObject;
        }
        int i5 = i2 + 7;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = prefetch + 9;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        float f = onMessageChannelReady;
        int i5 = i3 + 21;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 125;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        float f = onPostMessage;
        int i5 = i2 + 53;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(f);
    }

    public final float onMinimized() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 17;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        float f = onActivityLayout;
        int i5 = i2 + 57;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 53;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        float f = ICustomTabsCallbackStub;
        int i5 = i2 + 95;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetch + 59;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        float f = onUnminimized;
        int i5 = i3 + 117;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return Float.valueOf(f);
        }
        throw null;
    }

    public final float isEngagementSignalsApiAvailable() {
        float f;
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 45;
        prefetch = i3 % 128;
        if (i3 % 2 == 0) {
            f = ICustomTabsService;
            int i4 = 33 / 0;
        } else {
            f = ICustomTabsService;
        }
        int i5 = i2 + 111;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCommand + 115;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return onRelationshipValidationResult;
        }
        throw null;
    }

    public final float onActivityLayout() {
        float f;
        int i = 2 % 2;
        int i2 = prefetch + 65;
        int i3 = i2 % 128;
        extraCommand = i3;
        if (i2 % 2 != 0) {
            f = onActivityResized;
            int i4 = 91 / 0;
        } else {
            f = onActivityResized;
        }
        int i5 = i3 + 85;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 109;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = ICustomTabsCallbackStubProxy;
        int i4 = i2 + 53;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetch + 79;
        int i3 = i2 % 128;
        extraCommand = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        float f = onNavigationEvent;
        int i4 = i3 + 25;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(f);
        }
        int i5 = 55 / 0;
        return Float.valueOf(f);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 83;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = IAuthTabCallbackStub;
        int i4 = i2 + 99;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(f);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 61;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        float f = IAuthTabCallback;
        int i5 = i2 + 15;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = prefetch + 47;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallbackWithResult;
        }
        throw null;
    }

    public final float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        int i3 = i2 % 128;
        prefetch = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        float f = access000;
        int i4 = i3 + 5;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float access100() {
        int i = 2 % 2;
        int i2 = prefetch + 107;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        float f = IAuthTabCallbackStubProxy;
        int i5 = i3 + 117;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = prefetch + 121;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        float f = IAuthTabCallback_Parcel;
        int i5 = i3 + 45;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return Float.valueOf(mayLaunchUrl);
        }
        throw null;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 107;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        float f = IAuthTabCallbackDefault;
        int i5 = i2 + 77;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float access000() {
        int i = 2 % 2;
        int i2 = prefetch + 107;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor;
        }
        throw null;
    }

    public final float extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCommand + 101;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        float f = extraCallback;
        int i5 = i3 + 77;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float ICustomTabsCallback() {
        float f;
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 25;
        prefetch = i3 % 128;
        if (i3 % 2 == 0) {
            f = onMinimized;
            int i4 = 20 / 0;
        } else {
            f = onMinimized;
        }
        int i5 = i2 + 3;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return f;
    }

    public final float ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 51;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        float f = ICustomTabsCallbackDefault;
        int i5 = i2 + 121;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return f;
    }

    public final MappingRedirectableLiveDataExternalSyntheticLambda1 onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = extraCommand + 121;
            prefetch = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1780443465, i, -1, "im.toss.tds.compose.component.compound.progressstepper.TdsProgressStepperV1Defaults.<get-CompactProgressShadow> (TdsProgressStepperV1Defaults.kt:100)");
        }
        MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1OnNavigationEvent = MaxSegmentCollection.onExtraCallbackWithResult.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = extraCommand + 75;
            prefetch = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return mappingRedirectableLiveDataExternalSyntheticLambda1OnNavigationEvent;
    }

    public final MappingRedirectableLiveDataExternalSyntheticLambda1 onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCommand + 119;
        prefetch = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1686187713, i, -1, "im.toss.tds.compose.component.compound.progressstepper.TdsProgressStepperV1Defaults.<get-IconProgressShadow> (TdsProgressStepperV1Defaults.kt:105)");
        }
        MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1OnNavigationEvent = MaxSegmentCollection.onExtraCallbackWithResult.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = extraCommand + 37;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        return mappingRedirectableLiveDataExternalSyntheticLambda1OnNavigationEvent;
    }

    public final r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = prefetch + 41;
        extraCommand = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1524436838, i, -1, "im.toss.tds.compose.component.compound.progressstepper.TdsProgressStepperV1Defaults.trackColors (TdsProgressStepperV1Defaults.kt:111)");
            int i4 = prefetch + 103;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
        }
        r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixiOnExtraCallback = onExtraCallback(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = extraCommand + 97;
            prefetch = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i8 = prefetch + 109;
        extraCommand = i8 % 128;
        if (i8 % 2 == 0) {
            return r8lambdacvbgljs0ksxut8zctwblscbeixiOnExtraCallback;
        }
        throw null;
    }

    private final r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI onExtraCallback(y2 y2Var) {
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        prefetch = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            y2Var.ICustomTabsCallbackStub();
            throw null;
        }
        r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixiICustomTabsCallbackStub = y2Var.ICustomTabsCallbackStub();
        if (r8lambdacvbgljs0ksxut8zctwblscbeixiICustomTabsCallbackStub == null) {
            r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi = new r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ProgressStepperTrackFill), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ProgressStepperTrackBorder), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ProgressStepperProgressGradientStart), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ProgressStepperProgressGradientEnd), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ProgressStepperProgressShadow), null);
            y2Var.onWarmupCompleted(r8lambdacvbgljs0ksxut8zctwblscbeixi);
            return r8lambdacvbgljs0ksxut8zctwblscbeixi;
        }
        int i3 = extraCommand + 15;
        prefetch = i3 % 128;
        if (i3 % 2 != 0) {
            return r8lambdacvbgljs0ksxut8zctwblscbeixiICustomTabsCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public final r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = prefetch + 53;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1024625952, i, -1, "im.toss.tds.compose.component.compound.progressstepper.TdsProgressStepperV1Defaults.compactIndicatorColors (TdsProgressStepperV1Defaults.kt:126)");
            if (i4 != 0) {
                throw null;
            }
        }
        r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsmIAuthTabCallback = IAuthTabCallback(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = extraCommand + 115;
            prefetch = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return r8lambdabh8wf1u761uxgmlbmuxj2edovsmIAuthTabCallback;
    }

    private final r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM IAuthTabCallback(y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = prefetch + 89;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsm = (r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -1610667208, iOnWarmupCompleted, iOnWarmupCompleted2, 1610667214, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        if (r8lambdabh8wf1u761uxgmlbmuxj2edovsm != null) {
            return r8lambdabh8wf1u761uxgmlbmuxj2edovsm;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ProgressStepperCompactIndicatorActiveOuterFill);
        Object[] objArr = {y2Var, authParams.FillBrand};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr, -1868498688, iOnWarmupCompleted4)).longValue();
        authParams authparams = authParams.BackgroundDefault;
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted7 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted7, iOnWarmupCompleted5, new Object[]{y2Var, authparams}, -1868498688, iOnWarmupCompleted6)).longValue();
        int iOnWarmupCompleted8 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted9 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted10 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsm2 = new r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM(jOnExtraCallback, jLongValue, jLongValue2, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted10, iOnWarmupCompleted8, new Object[]{y2Var, authparams}, -1868498688, iOnWarmupCompleted9)).longValue(), null);
        y2Var.onExtraCallback(r8lambdabh8wf1u761uxgmlbmuxj2edovsm2);
        int i4 = extraCommand + 19;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdabh8wf1u761uxgmlbmuxj2edovsm2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = extraCommand + 97;
        prefetch = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = prefetch + 67;
                extraCommand = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1467310010, i, -1, "im.toss.tds.compose.component.compound.progressstepper.TdsProgressStepperV1Defaults.iconIndicatorColors (TdsProgressStepperV1Defaults.kt:140)");
                if (i6 != 0) {
                    int i7 = 7 / 0;
                }
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U r8lambdacpfbr3f4ri0phzl8v6jqniitg7uOnNavigationEvent = onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = extraCommand + 59;
            prefetch = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = prefetch + 49;
        extraCommand = i10 % 128;
        int i11 = i10 % 2;
        return r8lambdacpfbr3f4ri0phzl8v6jqniitg7uOnNavigationEvent;
    }

    private final r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U onNavigationEvent(y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = extraCommand + 61;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U r8lambdacpfbr3f4ri0phzl8v6jqniitg7uICustomTabsCallbackStubProxy = y2Var.ICustomTabsCallbackStubProxy();
        if (r8lambdacpfbr3f4ri0phzl8v6jqniitg7uICustomTabsCallbackStubProxy != null) {
            int i4 = prefetch + 79;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            return r8lambdacpfbr3f4ri0phzl8v6jqniitg7uICustomTabsCallbackStubProxy;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ProgressStepperFullIndicatorActiveOuterFill);
        Object[] objArr = {y2Var, authParams.FillBrand};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue();
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        long jIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
        authParams authparams = authParams.BackgroundDefault;
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5, iOnWarmupCompleted3, new Object[]{y2Var, authparams}, -1868498688, iOnWarmupCompleted4)).longValue();
        long jIAuthTabCallbackDefault2 = onextracallbackwithresult.IAuthTabCallbackDefault();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted7 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted8 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue3 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted8, iOnWarmupCompleted6, new Object[]{y2Var, authparams}, -1868498688, iOnWarmupCompleted7)).longValue();
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ProgressStepperFullIndicatorActiveIconFill);
        Object[] objArr2 = {y2Var, authParams.IconBrand};
        int iOnWarmupCompleted9 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted10 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue4 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted9, objArr2, -1868498688, iOnWarmupCompleted10)).longValue();
        Object[] objArr3 = {y2Var, authParams.IconSecondary};
        int iOnWarmupCompleted11 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted12 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U r8lambdacpfbr3f4ri0phzl8v6jqniitg7u = new r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U(jOnExtraCallback, jLongValue, jIAuthTabCallbackDefault, jLongValue2, jIAuthTabCallbackDefault2, jLongValue3, jOnExtraCallback2, jLongValue4, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted11, objArr3, -1868498688, iOnWarmupCompleted12)).longValue(), (DefaultConstructorMarker) null);
        y2Var.onExtraCallbackWithResult(r8lambdacpfbr3f4ri0phzl8v6jqniitg7u);
        return r8lambdacpfbr3f4ri0phzl8v6jqniitg7u;
    }

    static {
        AppLovinAdSize appLovinAdSize = AppLovinAdSize.onWarmupCompleted;
        asInterface = appLovinAdSize.IAuthTabCallback();
        ICustomTabsCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
        writeTypedObject = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f);
        readTypedObject = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
        onMessageChannelReady = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
        onPostMessage = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f);
        onActivityLayout = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f);
        ICustomTabsCallbackStub = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
        onUnminimized = appLovinAdSize.IAuthTabCallback();
        ICustomTabsService = AppLovinAdLoadListener.onExtraCallbackWithResult.onNavigationEvent();
        onRelationshipValidationResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
        onActivityResized = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f);
        ICustomTabsCallbackStubProxy = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f);
        onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
        IAuthTabCallbackStub = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
        IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
        extraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
        access000 = appLovinAdSize.IAuthTabCallback();
        IAuthTabCallbackStubProxy = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(34.0f);
        IAuthTabCallback_Parcel = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
        mayLaunchUrl = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(38.0f);
        IAuthTabCallbackDefault = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
        getInterfaceDescriptor = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
        extraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
        onMinimized = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
        ICustomTabsCallbackDefault = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
        int i = ICustomTabsCallback_Parcel + 115;
        isEngagementSignalsApiAvailable = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallback() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Float) onExtraCallback(113861328, new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -113861328)).floatValue();
    }

    public final float onExtraCallback() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Float) onExtraCallback(-1142032812, new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1142032818)).floatValue();
    }

    public final float IAuthTabCallbackStub() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Float) onExtraCallback(1981600378, new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1981600376)).floatValue();
    }

    public final float writeTypedObject() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Float) onExtraCallback(-842940930, new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 842940931)).floatValue();
    }

    public final float onActivityResized() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Float) onExtraCallback(1266903489, new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1266903484)).floatValue();
    }

    public final float onPostMessage() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Float) onExtraCallback(-615122917, new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 615122921)).floatValue();
    }

    public final float onUnminimized() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Float) onExtraCallback(-1779559709, new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1779559712)).floatValue();
    }
}
