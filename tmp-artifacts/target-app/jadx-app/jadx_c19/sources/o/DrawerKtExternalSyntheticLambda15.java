package o;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import o.DrawerKtExternalSyntheticLambda15;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface DrawerKtExternalSyntheticLambda15 {
    default void IAuthTabCallback(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
    }

    default void onExtraCallback(String str) {
    }

    default void onExtraCallback(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
    }

    default void onExtraCallbackWithResult(long j, int i2) {
    }

    default void onExtraCallbackWithResult(String str, long j, long j2) {
    }

    default void onExtraCallbackWithResult(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
    }

    default void onNavigationEvent(int i2, long j) {
    }

    default void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
    }

    default void onWarmupCompleted(Exception exc) {
    }

    default void onWarmupCompleted(Object obj, long j) {
    }

    public static final class IAuthTabCallback {
        private final Handler onExtraCallbackWithResult;
        private final DrawerKtExternalSyntheticLambda15 onWarmupCompleted;

        public IAuthTabCallback(@Nullable Handler handler, @Nullable DrawerKtExternalSyntheticLambda15 drawerKtExternalSyntheticLambda15) {
            this.onExtraCallbackWithResult = drawerKtExternalSyntheticLambda15 != null ? (Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(handler) : null;
            this.onWarmupCompleted = drawerKtExternalSyntheticLambda15;
        }

        public void onExtraCallbackWithResult(final TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.onExtraCallback(this.f$0, textStringSimpleNodeExternalSyntheticLambda1);
                    }
                });
            }
        }

        public static /* synthetic */ void onExtraCallback(IAuthTabCallback iAuthTabCallback, TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallbackWithResult(textStringSimpleNodeExternalSyntheticLambda1);
        }

        public void onNavigationEvent(final String str, final long j, final long j2) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.IAuthTabCallback(this.f$0, str, j, j2);
                    }
                });
            }
        }

        public static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, String str, long j, long j2) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallbackWithResult(str, j, j2);
        }

        public void onExtraCallback(final BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable final TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.IAuthTabCallback(this.f$0, basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0);
                    }
                });
            }
        }

        public static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0);
        }

        public void onNavigationEvent(final int i2, final long j) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.onWarmupCompleted(this.f$0, i2, j);
                    }
                });
            }
        }

        public static /* synthetic */ void onWarmupCompleted(IAuthTabCallback iAuthTabCallback, int i2, long j) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onNavigationEvent(i2, j);
        }

        public void onExtraCallback(final long j, final int i2) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.onWarmupCompleted(this.f$0, j, i2);
                    }
                });
            }
        }

        public static /* synthetic */ void onWarmupCompleted(IAuthTabCallback iAuthTabCallback, long j, int i2) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallbackWithResult(j, i2);
        }

        public void onWarmupCompleted(final CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.onExtraCallbackWithResult(this.f$0, cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
                    }
                });
            }
        }

        public static /* synthetic */ void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).IAuthTabCallback(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
        }

        public void IAuthTabCallback(final Object obj) {
            if (this.onExtraCallbackWithResult != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.onExtraCallbackWithResult.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.onExtraCallback(this.f$0, obj, jElapsedRealtime);
                    }
                });
            }
        }

        public static /* synthetic */ void onExtraCallback(IAuthTabCallback iAuthTabCallback, Object obj, long j) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onWarmupCompleted(obj, j);
        }

        public void onWarmupCompleted(final String str) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.IAuthTabCallback(this.f$0, str);
                    }
                });
            }
        }

        public static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, String str) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallback(str);
        }

        public void onExtraCallback(final TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            textStringSimpleNodeExternalSyntheticLambda1.onExtraCallback();
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.onNavigationEvent(this.f$0, textStringSimpleNodeExternalSyntheticLambda1);
                    }
                });
            }
        }

        public static /* synthetic */ void onNavigationEvent(IAuthTabCallback iAuthTabCallback, TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            textStringSimpleNodeExternalSyntheticLambda1.onExtraCallback();
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallback(textStringSimpleNodeExternalSyntheticLambda1);
        }

        public void onExtraCallback(final Exception exc) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawerKtExternalSyntheticLambda15.IAuthTabCallback.onWarmupCompleted(this.f$0, exc);
                    }
                });
            }
        }

        public static /* synthetic */ void onWarmupCompleted(IAuthTabCallback iAuthTabCallback, Exception exc) {
            Object[] objArr = {iAuthTabCallback.onWarmupCompleted};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((DrawerKtExternalSyntheticLambda15) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onWarmupCompleted(exc);
        }
    }
}
