package o;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DismissStateExternalSyntheticLambda0;
import o.DrawerKtExternalSyntheticLambda13;
import o.DrawerKtExternalSyntheticLambda14;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DismissStateExternalSyntheticLambda0 implements DrawerKtExternalSyntheticLambda14 {
    private Surface IAuthTabCallback;
    private final Queue<DrawerKtExternalSyntheticLambda14.IAuthTabCallback> IAuthTabCallbackDefault;
    private final DrawerKtExternalSyntheticLambda13 IAuthTabCallbackStub;
    private final DrawerKtExternalSyntheticLambda10 asBinder;
    private long onExtraCallback;
    private DrawerKtExternalSyntheticLambda14.onExtraCallback onExtraCallbackWithResult;
    private Executor onNavigationEvent;
    private DrawerKtExternalSyntheticLambda0 onTransact;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted;

    public static /* synthetic */ void onExtraCallback(Runnable runnable) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(long j, long j2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, MediaFormat mediaFormat) {
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void IAuthTabCallbackDefault() {
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public boolean onExtraCallback() {
        return true;
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return true;
    }

    public DismissStateExternalSyntheticLambda0(DrawerKtExternalSyntheticLambda10 drawerKtExternalSyntheticLambda10, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.asBinder = drawerKtExternalSyntheticLambda10;
        drawerKtExternalSyntheticLambda10.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda0);
        this.IAuthTabCallbackStub = new DrawerKtExternalSyntheticLambda13(new onExtraCallbackWithResult(), drawerKtExternalSyntheticLambda10);
        this.IAuthTabCallbackDefault = new ArrayDeque();
        this.onWarmupCompleted = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent();
        this.onExtraCallback = -9223372036854775807L;
        this.onExtraCallbackWithResult = DrawerKtExternalSyntheticLambda14.onExtraCallback.onWarmupCompleted;
        this.onNavigationEvent = new Executor() { // from class: androidx.media3.exoplayer.video.DefaultVideoSink$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                DismissStateExternalSyntheticLambda0.onExtraCallback(runnable);
            }
        };
        this.onTransact = new DrawerKtExternalSyntheticLambda0() { // from class: androidx.media3.exoplayer.video.DefaultVideoSink$$ExternalSyntheticLambda1
            @Override // o.DrawerKtExternalSyntheticLambda0
            public final void onVideoFrameAboutToBeRendered(long j, long j2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, MediaFormat mediaFormat) {
                DismissStateExternalSyntheticLambda0.onExtraCallbackWithResult(j, j2, basicTextContextMenuProviderKtExternalSyntheticLambda4, mediaFormat);
            }
        };
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onTransact() {
        this.asBinder.onExtraCallbackWithResult();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void asBinder() {
        this.asBinder.onExtraCallback();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onNavigationEvent(DrawerKtExternalSyntheticLambda14.onExtraCallback onextracallback, Executor executor) {
        this.onExtraCallbackWithResult = onextracallback;
        this.onNavigationEvent = executor;
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void IAuthTabCallbackStub() {
        throw new UnsupportedOperationException();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onNavigationEvent(boolean z) {
        if (z) {
            this.asBinder.IAuthTabCallback();
        }
        this.IAuthTabCallbackStub.IAuthTabCallback();
        this.IAuthTabCallbackDefault.clear();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public boolean onExtraCallback(boolean z) {
        return this.asBinder.onWarmupCompleted(z);
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void asInterface() {
        this.IAuthTabCallbackStub.onExtraCallback();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public boolean onWarmupCompleted() {
        return this.IAuthTabCallbackStub.onWarmupCompleted();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public Surface IAuthTabCallback() {
        return (Surface) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallback);
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onNavigationEvent(DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0) {
        this.onTransact = drawerKtExternalSyntheticLambda0;
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onWarmupCompleted(float f) {
        this.asBinder.onExtraCallbackWithResult(f);
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void IAuthTabCallback(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onNavigationEvent(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void IAuthTabCallback(Surface surface, TextFieldDecoratorModifierNodeExternalSyntheticLambda25 textFieldDecoratorModifierNodeExternalSyntheticLambda25) {
        this.IAuthTabCallback = surface;
        this.asBinder.onExtraCallbackWithResult(surface);
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onNavigationEvent() {
        this.IAuthTabCallback = null;
        this.asBinder.onExtraCallbackWithResult((Surface) null);
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onExtraCallbackWithResult(int i2) {
        this.asBinder.onExtraCallback(i2);
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void IAuthTabCallback(int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, long j, int i3, List<Object> list) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(list.isEmpty());
        int i4 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.onWarmupCompleted;
        if (i4 != basicTextContextMenuProviderKtExternalSyntheticLambda42.prefetchWithMultipleUrls || basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback != basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsCallback) {
            this.IAuthTabCallbackStub.onExtraCallbackWithResult(i4, basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback);
        }
        float f = basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject;
        if (f != this.onWarmupCompleted.writeTypedObject) {
            this.asBinder.onExtraCallback(f);
        }
        this.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        if (j != this.onExtraCallback) {
            this.IAuthTabCallbackStub.onExtraCallbackWithResult(i3, j);
            this.onExtraCallback = j;
        }
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onExtraCallbackWithResult() {
        this.asBinder.onWarmupCompleted();
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public boolean IAuthTabCallback(long j, DrawerKtExternalSyntheticLambda14.IAuthTabCallback iAuthTabCallback) {
        this.IAuthTabCallbackDefault.add(iAuthTabCallback);
        this.IAuthTabCallbackStub.onWarmupCompleted(j);
        this.onNavigationEvent.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.DefaultVideoSink$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onExtraCallbackWithResult.onExtraCallback();
            }
        });
        return true;
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void onWarmupCompleted(long j, long j2) throws DrawerKtExternalSyntheticLambda14.onNavigationEvent {
        try {
            this.IAuthTabCallbackStub.onWarmupCompleted(j, j2);
        } catch (AndroidSelectionHandles_androidKtExternalSyntheticLambda4 e) {
            throw new DrawerKtExternalSyntheticLambda14.onNavigationEvent(e, this.onWarmupCompleted);
        }
    }

    @Override // o.DrawerKtExternalSyntheticLambda14
    public void IAuthTabCallback(boolean z) {
        this.asBinder.onExtraCallback(z);
    }

    public final class onExtraCallbackWithResult implements DrawerKtExternalSyntheticLambda13.onNavigationEvent {
        private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;

        private onExtraCallbackWithResult() {
        }

        @Override // o.DrawerKtExternalSyntheticLambda13.onNavigationEvent
        public void onNavigationEvent(final CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
            this.onExtraCallbackWithResult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onActivityLayout(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onWarmupCompleted).access100(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.IAuthTabCallback).IAuthTabCallbackDefault("video/raw").onNavigationEvent();
            DismissStateExternalSyntheticLambda0.this.onNavigationEvent.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.DefaultVideoSink$FrameRendererImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DismissStateExternalSyntheticLambda0.this.onExtraCallbackWithResult.IAuthTabCallback(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
                }
            });
        }

        @Override // o.DrawerKtExternalSyntheticLambda13.onNavigationEvent
        public void onExtraCallback(long j, long j2, boolean z) {
            if (z && DismissStateExternalSyntheticLambda0.this.IAuthTabCallback != null) {
                DismissStateExternalSyntheticLambda0.this.onNavigationEvent.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.DefaultVideoSink$FrameRendererImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DismissStateExternalSyntheticLambda0.this.onExtraCallbackWithResult.onNavigationEvent();
                    }
                });
            }
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = this.onExtraCallbackWithResult;
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent == null) {
                basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent();
            }
            DismissStateExternalSyntheticLambda0.this.onTransact.onVideoFrameAboutToBeRendered(j2, j, basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent, null);
            ((DrawerKtExternalSyntheticLambda14.IAuthTabCallback) DismissStateExternalSyntheticLambda0.this.IAuthTabCallbackDefault.remove()).onExtraCallback(j);
        }

        @Override // o.DrawerKtExternalSyntheticLambda13.onNavigationEvent
        public void onExtraCallback() {
            DismissStateExternalSyntheticLambda0.this.onNavigationEvent.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.DefaultVideoSink$FrameRendererImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DismissStateExternalSyntheticLambda0.this.onExtraCallbackWithResult.onWarmupCompleted();
                }
            });
            ((DrawerKtExternalSyntheticLambda14.IAuthTabCallback) DismissStateExternalSyntheticLambda0.this.IAuthTabCallbackDefault.remove()).IAuthTabCallback();
        }
    }
}
