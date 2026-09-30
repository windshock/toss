package o;

import android.os.Handler;
import androidx.annotation.Nullable;
import o.SelectionManagerExternalSyntheticLambda2;
import o.SelectionManagerExternalSyntheticLambda5;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SelectionManagerExternalSyntheticLambda5 {
    default void IAuthTabCallback(Exception exc) {
    }

    default void IAuthTabCallback(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
    }

    default void IAuthTabCallback(boolean z) {
    }

    default void onExtraCallbackWithResult(long j) {
    }

    default void onExtraCallbackWithResult(String str) {
    }

    default void onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
    }

    default void onNavigationEvent(int i2) {
    }

    default void onNavigationEvent(Exception exc) {
    }

    default void onNavigationEvent(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
    }

    default void onNavigationEvent(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
    }

    default void onWarmupCompleted(int i2, long j, long j2) {
    }

    default void onWarmupCompleted(String str, long j, long j2) {
    }

    default void onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
    }

    public static final class onExtraCallbackWithResult {
        private final Handler onExtraCallbackWithResult;
        private final SelectionManagerExternalSyntheticLambda5 onNavigationEvent;

        public onExtraCallbackWithResult(@Nullable Handler handler, @Nullable SelectionManagerExternalSyntheticLambda5 selectionManagerExternalSyntheticLambda5) {
            this.onExtraCallbackWithResult = selectionManagerExternalSyntheticLambda5 != null ? (Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(handler) : null;
            this.onNavigationEvent = selectionManagerExternalSyntheticLambda5;
        }

        public void onNavigationEvent(final TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onNavigationEvent(this.f$0, textStringSimpleNodeExternalSyntheticLambda1);
                    }
                });
            }
        }

        public static /* synthetic */ void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).IAuthTabCallback(textStringSimpleNodeExternalSyntheticLambda1);
        }

        public void onExtraCallbackWithResult(final String str, final long j, final long j2) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.IAuthTabCallback(this.f$0, str, j, j2);
                    }
                });
            }
        }

        public static /* synthetic */ void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, String str, long j, long j2) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onWarmupCompleted(str, j, j2);
        }

        public void onNavigationEvent(final BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable final TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onWarmupCompleted(this.f$0, basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0);
                    }
                });
            }
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0);
        }

        public void onNavigationEvent(final long j) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onWarmupCompleted(this.f$0, j);
                    }
                });
            }
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, long j) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallbackWithResult(j);
        }

        public void onExtraCallback(final int i2, final long j, final long j2) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onExtraCallback(this.f$0, i2, j, j2);
                    }
                });
            }
        }

        public static /* synthetic */ void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, int i2, long j, long j2) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onWarmupCompleted(i2, j, j2);
        }

        public void IAuthTabCallback(final String str) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onExtraCallbackWithResult(this.f$0, str);
                    }
                });
            }
        }

        public static /* synthetic */ void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, String str) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallbackWithResult(str);
        }

        public void onExtraCallback(final TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            textStringSimpleNodeExternalSyntheticLambda1.onExtraCallback();
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onExtraCallbackWithResult(this.f$0, textStringSimpleNodeExternalSyntheticLambda1);
                    }
                });
            }
        }

        public static /* synthetic */ void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            textStringSimpleNodeExternalSyntheticLambda1.onExtraCallback();
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onNavigationEvent(textStringSimpleNodeExternalSyntheticLambda1);
        }

        public void onExtraCallbackWithResult(final boolean z) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onWarmupCompleted(this.f$0, z);
                    }
                });
            }
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).IAuthTabCallback(z);
        }

        public void onExtraCallback(final Exception exc) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onExtraCallback(this.f$0, exc);
                    }
                });
            }
        }

        public static /* synthetic */ void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, Exception exc) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).IAuthTabCallback(exc);
        }

        public void onWarmupCompleted(final Exception exc) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onWarmupCompleted(this.f$0, exc);
                    }
                });
            }
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, Exception exc) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onNavigationEvent(exc);
        }

        public void onExtraCallback(final SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onWarmupCompleted(this.f$0, iAuthTabCallback);
                    }
                });
            }
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onNavigationEvent(iAuthTabCallback);
        }

        public void onExtraCallbackWithResult(final SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onNavigationEvent(this.f$0, iAuthTabCallback);
                    }
                });
            }
        }

        public static /* synthetic */ void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallbackWithResult(iAuthTabCallback);
        }

        public void onExtraCallbackWithResult(final int i2) {
            Handler handler = this.onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult.onExtraCallbackWithResult(this.f$0, i2);
                    }
                });
            }
        }

        public static /* synthetic */ void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, int i2) {
            Object[] objArr = {onextracallbackwithresult.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((SelectionManagerExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onNavigationEvent(i2);
        }
    }
}
