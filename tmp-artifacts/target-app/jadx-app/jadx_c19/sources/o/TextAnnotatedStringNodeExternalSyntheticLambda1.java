package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import o.TextAnnotatedStringNodeExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextAnnotatedStringNodeExternalSyntheticLambda1 {
    private final Context IAuthTabCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final onNavigationEvent onNavigationEvent;

    public interface IAuthTabCallback {
        void onExtraCallbackWithResult();
    }

    public TextAnnotatedStringNodeExternalSyntheticLambda1(Context context, Looper looper, Looper looper2, IAuthTabCallback iAuthTabCallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.IAuthTabCallback = context.getApplicationContext();
        this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looper, (Handler.Callback) null);
        this.onNavigationEvent = new onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looper2, (Handler.Callback) null), iAuthTabCallback);
    }

    public void onNavigationEvent(boolean z) {
        if (z == this.onExtraCallbackWithResult) {
            return;
        }
        if (z) {
            this.onExtraCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.AudioBecomingNoisyManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TextAnnotatedStringNodeExternalSyntheticLambda1 textAnnotatedStringNodeExternalSyntheticLambda1 = this.f$0;
                    textAnnotatedStringNodeExternalSyntheticLambda1.IAuthTabCallback.registerReceiver(textAnnotatedStringNodeExternalSyntheticLambda1.onNavigationEvent, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.onExtraCallbackWithResult = true;
        } else {
            this.onExtraCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.AudioBecomingNoisyManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    TextAnnotatedStringNodeExternalSyntheticLambda1 textAnnotatedStringNodeExternalSyntheticLambda1 = this.f$0;
                    textAnnotatedStringNodeExternalSyntheticLambda1.IAuthTabCallback.unregisterReceiver(textAnnotatedStringNodeExternalSyntheticLambda1.onNavigationEvent);
                }
            });
            this.onExtraCallbackWithResult = false;
        }
    }

    public final class onNavigationEvent extends BroadcastReceiver {
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onExtraCallback;
        private final IAuthTabCallback onNavigationEvent;

        public onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16, IAuthTabCallback iAuthTabCallback) {
            this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda16;
            this.onNavigationEvent = iAuthTabCallback;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.onExtraCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.onExtraCallbackWithResult();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onExtraCallbackWithResult() {
            if (TextAnnotatedStringNodeExternalSyntheticLambda1.this.onExtraCallbackWithResult) {
                this.onNavigationEvent.onExtraCallbackWithResult();
            }
        }
    }
}
