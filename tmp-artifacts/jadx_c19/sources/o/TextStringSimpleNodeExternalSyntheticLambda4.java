package o;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.SelectionGesturesKtExternalSyntheticLambda0;
import o.TextFieldCoreModifierNodeExternalSyntheticLambda0;
import o.TextStringSimpleNodeExternalSyntheticLambda4;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextStringSimpleNodeExternalSyntheticLambda4 implements SelectionGesturesKtExternalSyntheticLambda0 {
    private final SelectionGesturesKtExternalSyntheticLambda0 onWarmupCompleted;

    public TextStringSimpleNodeExternalSyntheticLambda4() {
        if (Build.VERSION.SDK_INT >= 35) {
            this.onWarmupCompleted = new onNavigationEvent();
        } else {
            this.onWarmupCompleted = new onExtraCallback();
        }
    }

    @Override // o.SelectionGesturesKtExternalSyntheticLambda0
    public void onWarmupCompleted(SelectionGesturesKtExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, Context context, Looper looper, Looper looper2, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        SelectionGesturesKtExternalSyntheticLambda0 selectionGesturesKtExternalSyntheticLambda0 = this.onWarmupCompleted;
        if (selectionGesturesKtExternalSyntheticLambda0 != null) {
            selectionGesturesKtExternalSyntheticLambda0.onWarmupCompleted(onextracallbackwithresult, context, looper, looper2, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
        }
    }

    @Override // o.SelectionGesturesKtExternalSyntheticLambda0
    public void IAuthTabCallback() {
        SelectionGesturesKtExternalSyntheticLambda0 selectionGesturesKtExternalSyntheticLambda0 = this.onWarmupCompleted;
        if (selectionGesturesKtExternalSyntheticLambda0 != null) {
            selectionGesturesKtExternalSyntheticLambda0.IAuthTabCallback();
        }
    }

    @Override // o.SelectionGesturesKtExternalSyntheticLambda0
    public boolean onNavigationEvent() {
        SelectionGesturesKtExternalSyntheticLambda0 selectionGesturesKtExternalSyntheticLambda0 = this.onWarmupCompleted;
        return selectionGesturesKtExternalSyntheticLambda0 == null || selectionGesturesKtExternalSyntheticLambda0.onNavigationEvent();
    }

    public static final class onNavigationEvent implements SelectionGesturesKtExternalSyntheticLambda0 {
        private static final RouteDiscoveryPreference IAuthTabCallback;
        private TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> onExtraCallback;
        private MediaRouter2 onExtraCallbackWithResult;
        private MediaRouter2.RouteCallback onNavigationEvent;
        private MediaRouter2.ControllerCallback onWarmupCompleted;

        private onNavigationEvent() {
        }

        static {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda10.onNavigationEvent();
            IAuthTabCallback = AndroidSelectionHandles_androidKtExternalSyntheticLambda3.nB_(ImmutableList.of(), false).build();
        }

        @Override // o.SelectionGesturesKtExternalSyntheticLambda0
        public void onWarmupCompleted(final SelectionGesturesKtExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, final Context context, Looper looper, Looper looper2, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
            TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> textFieldCoreModifierNodeExternalSyntheticLambda0 = new TextFieldCoreModifierNodeExternalSyntheticLambda0<>(Boolean.TRUE, looper2, looper, textFieldDecoratorModifierNodeExternalSyntheticLambda0, new TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda6
                @Override // o.TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult
                public final void onStateChanged(Object obj, Object obj2) {
                    onextracallbackwithresult.onSelectedOutputSuitabilityChanged(((Boolean) obj2).booleanValue());
                }
            });
            this.onExtraCallback = textFieldCoreModifierNodeExternalSyntheticLambda0;
            textFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallback(new Runnable() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    TextStringSimpleNodeExternalSyntheticLambda4.onNavigationEvent.onNavigationEvent(this.f$0, context);
                }
            });
        }

        public static /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, Context context) {
            TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> textFieldCoreModifierNodeExternalSyntheticLambda0 = onnavigationevent.onExtraCallback;
            onnavigationevent.onExtraCallbackWithResult = MediaRouter2.getInstance(context);
            onnavigationevent.onNavigationEvent = new MediaRouter2.RouteCallback() { // from class: o.TextStringSimpleNodeExternalSyntheticLambda4.onNavigationEvent.2
            };
            final TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> textFieldCoreModifierNodeExternalSyntheticLambda02 = onnavigationevent.onExtraCallback;
            Objects.requireNonNull(textFieldCoreModifierNodeExternalSyntheticLambda02);
            Executor executor = new Executor() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda4
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    textFieldCoreModifierNodeExternalSyntheticLambda02.IAuthTabCallback(runnable);
                }
            };
            onnavigationevent.onExtraCallbackWithResult.registerRouteCallback(executor, onnavigationevent.onNavigationEvent, IAuthTabCallback);
            MediaRouter2.ControllerCallback controllerCallback = new MediaRouter2.ControllerCallback() { // from class: o.TextStringSimpleNodeExternalSyntheticLambda4.onNavigationEvent.5
                @Override // android.media.MediaRouter2.ControllerCallback
                public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                    onNavigationEvent.this.onExtraCallback.onNavigationEvent(Boolean.valueOf(onNavigationEvent.ny_(onNavigationEvent.this.onExtraCallbackWithResult)));
                }
            };
            onnavigationevent.onWarmupCompleted = controllerCallback;
            onnavigationevent.onExtraCallbackWithResult.registerControllerCallback(executor, controllerCallback);
            onnavigationevent.onExtraCallback.onNavigationEvent(Boolean.valueOf(ny_(onnavigationevent.onExtraCallbackWithResult)));
        }

        @Override // o.SelectionGesturesKtExternalSyntheticLambda0
        public void IAuthTabCallback() {
            ((TextFieldCoreModifierNodeExternalSyntheticLambda0) RecordingInputConnection_androidKt.onWarmupCompleted(this.onExtraCallback)).IAuthTabCallback(new Runnable() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    TextStringSimpleNodeExternalSyntheticLambda4.onNavigationEvent.onWarmupCompleted(this.f$0);
                }
            });
        }

        public static /* synthetic */ void onWarmupCompleted(onNavigationEvent onnavigationevent) {
            ((MediaRouter2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onnavigationevent.onExtraCallbackWithResult)).unregisterControllerCallback((MediaRouter2.ControllerCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted));
            onnavigationevent.onWarmupCompleted = null;
            onnavigationevent.onExtraCallbackWithResult.unregisterRouteCallback((MediaRouter2.RouteCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onnavigationevent.onNavigationEvent));
        }

        @Override // o.SelectionGesturesKtExternalSyntheticLambda0
        public boolean onNavigationEvent() {
            TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> textFieldCoreModifierNodeExternalSyntheticLambda0 = this.onExtraCallback;
            if (textFieldCoreModifierNodeExternalSyntheticLambda0 == null) {
                return true;
            }
            return textFieldCoreModifierNodeExternalSyntheticLambda0.onWarmupCompleted().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean ny_(MediaRouter2 mediaRouter2) {
            int transferReason = AndroidSelectionHandles_androidKtExternalSyntheticLambda5.nz_(RecordingInputConnection_androidKt.onExtraCallbackWithResult(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator<MediaRoute2Info> it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (nx_(AndroidSelectionHandles_androidKtExternalSyntheticLambda2.nA_(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean nx_(MediaRoute2Info mediaRoute2Info, int i2, boolean z) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i2 == 1 || i2 == 2) && z : suitabilityStatus == 0;
        }
    }

    public static final class onExtraCallback implements SelectionGesturesKtExternalSyntheticLambda0 {
        private AudioManager IAuthTabCallback;
        private TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> onExtraCallbackWithResult;
        private AudioDeviceCallback onWarmupCompleted;

        private onExtraCallback() {
        }

        @Override // o.SelectionGesturesKtExternalSyntheticLambda0
        public void onWarmupCompleted(final SelectionGesturesKtExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, final Context context, Looper looper, Looper looper2, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
            TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> textFieldCoreModifierNodeExternalSyntheticLambda0 = new TextFieldCoreModifierNodeExternalSyntheticLambda0<>(Boolean.TRUE, looper2, looper, textFieldDecoratorModifierNodeExternalSyntheticLambda0, new TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda1
                @Override // o.TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult
                public final void onStateChanged(Object obj, Object obj2) {
                    onextracallbackwithresult.onSelectedOutputSuitabilityChanged(((Boolean) obj2).booleanValue());
                }
            });
            this.onExtraCallbackWithResult = textFieldCoreModifierNodeExternalSyntheticLambda0;
            textFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallback(new Runnable() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    TextStringSimpleNodeExternalSyntheticLambda4.onExtraCallback.onWarmupCompleted(this.f$0, context);
                }
            });
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallback onextracallback, Context context) {
            AudioManager audioManager;
            TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> textFieldCoreModifierNodeExternalSyntheticLambda0 = onextracallback.onExtraCallbackWithResult;
            if (!TextFieldDecoratorModifierNodeExternalSyntheticLambda6.asBinder(context) || (audioManager = (AudioManager) context.getSystemService(MediaDescription.MEDIA_TYPE_AUDIO)) == null) {
                return;
            }
            onextracallback.IAuthTabCallback = audioManager;
            AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: o.TextStringSimpleNodeExternalSyntheticLambda4.onExtraCallback.5
                @Override // android.media.AudioDeviceCallback
                public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                    onExtraCallback.this.onExtraCallbackWithResult.onNavigationEvent(Boolean.valueOf(onExtraCallback.this.onExtraCallbackWithResult()));
                }

                @Override // android.media.AudioDeviceCallback
                public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                    onExtraCallback.this.onExtraCallbackWithResult.onNavigationEvent(Boolean.valueOf(onExtraCallback.this.onExtraCallbackWithResult()));
                }
            };
            onextracallback.onWarmupCompleted = audioDeviceCallback;
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler((Looper) RecordingInputConnection_androidKt.onExtraCallbackWithResult(Looper.myLooper())));
            onextracallback.onExtraCallbackWithResult.onNavigationEvent(Boolean.valueOf(onextracallback.onExtraCallbackWithResult()));
        }

        @Override // o.SelectionGesturesKtExternalSyntheticLambda0
        public void IAuthTabCallback() {
            ((TextFieldCoreModifierNodeExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).IAuthTabCallback(new Runnable() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TextStringSimpleNodeExternalSyntheticLambda4.onExtraCallback.IAuthTabCallback(this.f$0);
                }
            });
        }

        public static /* synthetic */ void IAuthTabCallback(onExtraCallback onextracallback) {
            AudioManager audioManager = onextracallback.IAuthTabCallback;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onWarmupCompleted));
            }
        }

        @Override // o.SelectionGesturesKtExternalSyntheticLambda0
        public boolean onNavigationEvent() {
            TextFieldCoreModifierNodeExternalSyntheticLambda0<Boolean> textFieldCoreModifierNodeExternalSyntheticLambda0 = this.onExtraCallbackWithResult;
            if (textFieldCoreModifierNodeExternalSyntheticLambda0 == null) {
                return true;
            }
            return textFieldCoreModifierNodeExternalSyntheticLambda0.onWarmupCompleted().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean onExtraCallbackWithResult() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallback)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i2 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i2 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i2 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }
    }
}
