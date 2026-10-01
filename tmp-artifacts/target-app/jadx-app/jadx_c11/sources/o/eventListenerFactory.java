package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.eventListener;
import o.eventListenerFactory;
import o.getPrivacyDestinationUri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class eventListenerFactory {
    private static int IAuthTabCallback = 0;
    private static final accessisMonitoringp<QuirksExternalSyntheticBackport0> onExtraCallback = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.tds.view.compat.component.atom.asset.AssetsKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = eventListenerFactory.IAuthTabCallback();
            int i4 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return quirksExternalSyntheticBackport0IAuthTabCallback;
        }
    }, 1, (Object) null);
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ QuirksExternalSyntheticBackport0 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, eventListener eventlistener, getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda1, eventlistener, onextracallbackwithresult, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda1, eventlistener, onextracallbackwithresult, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(eventListener eventlistener, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(eventlistener, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 22 / 0;
        }
        int i6 = IAuthTabCallback + 15;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, eventListener eventlistener, getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(appLovinNativeAdImplExternalSyntheticLambda1, eventlistener, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 79;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(eventListener eventlistener, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        getBacktraceNote getbacktracenoteOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i4 + 37;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1735629288, i, -1, "im.toss.tds.view.compat.component.atom.asset.ProvideAssetModifier.<anonymous> (Assets.kt:30)");
            }
            if (eventlistener != null) {
                getbacktracenoteOnNavigationEvent = eventlistener.onNavigationEvent();
                int i8 = onNavigationEvent + 59;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                getbacktracenoteOnNavigationEvent = null;
            }
            if (getbacktracenoteOnNavigationEvent == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-979110739);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1492436436);
                getbacktracenoteOnNavigationEvent.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[PHI: r9
      0x0037: PHI (r9v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r9v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r9v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r9
      0x002b: PHI (r9v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r9v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r9v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, @Nullable final eventListener eventlistener, @Nullable final getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        getBacktraceNote getbacktracenoteOnNavigationEvent;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 33;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-475110067);
            if ((i & 20) == 0) {
                i2 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ^ true) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-475110067);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(eventlistener) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(eventlistener)) {
                int i7 = IAuthTabCallback + 113;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i9 = onNavigationEvent + 117;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult)) {
                int i11 = IAuthTabCallback + 109;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-475110067, i2, -1, "im.toss.tds.view.compat.component.atom.asset.ProvideAssetModifier (Assets.kt:22)");
            }
            if (onextracallbackwithresult != null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2086632809);
                setPostviewFormatSelector.onNavigationEvent(onExtraCallback.onExtraCallback(onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, onextracallbackwithresult, appLovinNativeAdImplExternalSyntheticLambda1)), ForwardingCameraControl.onExtraCallback(1735629288, true, new Function2() { // from class: im.toss.tds.view.compat.component.atom.asset.AssetsKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i13 = 2 % 2;
                        int i14 = IAuthTabCallback + 21;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        eventListener eventlistener2 = eventlistener;
                        if (i15 != 0) {
                            return eventListenerFactory.onNavigationEvent(eventlistener2, appLovinNativeAdImplExternalSyntheticLambda1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        eventListenerFactory.onNavigationEvent(eventlistener2, appLovinNativeAdImplExternalSyntheticLambda1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2086339735);
                if (eventlistener != null) {
                    getbacktracenoteOnNavigationEvent = eventlistener.onNavigationEvent();
                } else {
                    int i13 = onNavigationEvent + 19;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    getbacktracenoteOnNavigationEvent = null;
                }
                if (getbacktracenoteOnNavigationEvent == null) {
                    int i15 = IAuthTabCallback + 57;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2086339736);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2086339736);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1314227271);
                    getbacktracenoteOnNavigationEvent.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 14));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    Unit unit = Unit.INSTANCE;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.atom.asset.AssetsKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = IAuthTabCallback + 125;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitOnNavigationEvent = eventListenerFactory.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1, eventlistener, onextracallbackwithresult, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i19 = IAuthTabCallback + 121;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        int i = 2 % 2;
        Object obj = null;
        if (Float.isNaN(onextracallbackwithresult.IAuthTabCallback()) && !Float.isNaN(onextracallbackwithresult.onExtraCallbackWithResult())) {
            int i2 = onNavigationEvent + 123;
            IAuthTabCallback = i2 % 128;
            quirksExternalSyntheticBackport0OnWarmupCompleted = i2 % 2 != 0 ? ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, 1.0f, 0, (Object) null), (QuirkSettingsLoader.onNavigationEvent) null, false, 5, (Object) null) : ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onNavigationEvent) null, false, 3, (Object) null);
        } else if (!Float.isNaN(onextracallbackwithresult.IAuthTabCallback())) {
            int i3 = IAuthTabCallback + 91;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Float.isNaN(onextracallbackwithresult.onExtraCallbackWithResult());
                obj.hashCode();
                throw null;
            }
            quirksExternalSyntheticBackport0OnWarmupCompleted = Float.isNaN(onextracallbackwithresult.onExtraCallbackWithResult()) ? ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null) : ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted).onExtraCallback(highSpeedResolverExternalSyntheticLambda2 != null ? highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, QuirkSettingsLoader.Companion.onExtraCallback()) : QuirksExternalSyntheticBackport0.Companion);
    }

    static {
        int i = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static final accessisMonitoringp<QuirksExternalSyntheticBackport0> onExtraCallback() {
        accessisMonitoringp<QuirksExternalSyntheticBackport0> accessismonitoringp;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            accessismonitoringp = onExtraCallback;
            int i4 = 1 / 0;
        } else {
            accessismonitoringp = onExtraCallback;
        }
        int i5 = i2 + 73;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return accessismonitoringp;
        }
        throw null;
    }

    private static final QuirksExternalSyntheticBackport0 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onextracallback;
    }
}
