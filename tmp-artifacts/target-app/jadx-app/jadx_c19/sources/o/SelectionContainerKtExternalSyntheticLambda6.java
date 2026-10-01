package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.common.base.Function;
import o.SelectionContainerKtExternalSyntheticLambda6;
import o.TextFieldCoreModifierNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda6 {
    private final onWarmupCompleted IAuthTabCallback;
    private int asInterface;
    private onExtraCallback onExtraCallback;
    private AudioManager onExtraCallbackWithResult;
    private final TextFieldCoreModifierNodeExternalSyntheticLambda0<onExtraCallbackWithResult> onNavigationEvent;
    private final Context onWarmupCompleted;

    public interface onWarmupCompleted {
        void onExtraCallback(int i2);

        void onWarmupCompleted(int i2, boolean z);
    }

    public static /* synthetic */ onExtraCallbackWithResult onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
        return onextracallbackwithresult;
    }

    public SelectionContainerKtExternalSyntheticLambda6(Context context, onWarmupCompleted onwarmupcompleted, final int i2, Looper looper, Looper looper2, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.onWarmupCompleted = context.getApplicationContext();
        this.IAuthTabCallback = onwarmupcompleted;
        TextFieldCoreModifierNodeExternalSyntheticLambda0<onExtraCallbackWithResult> textFieldCoreModifierNodeExternalSyntheticLambda0 = new TextFieldCoreModifierNodeExternalSyntheticLambda0<>(new onExtraCallbackWithResult(i2, 0, false, 0, 0), looper, looper2, textFieldDecoratorModifierNodeExternalSyntheticLambda0, new TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda0
            @Override // o.TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult
            public final void onStateChanged(Object obj, Object obj2) {
                this.f$0.onExtraCallbackWithResult((SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj2);
            }
        });
        this.onNavigationEvent = textFieldCoreModifierNodeExternalSyntheticLambda0;
        textFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallback(new Runnable() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SelectionContainerKtExternalSyntheticLambda6.onWarmupCompleted(this.f$0, i2);
            }
        });
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6, int i2) {
        selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult = (AudioManager) RecordingInputConnection_androidKt.onWarmupCompleted((AudioManager) selectionContainerKtExternalSyntheticLambda6.onWarmupCompleted.getSystemService(MediaDescription.MEDIA_TYPE_AUDIO));
        onExtraCallback onextracallback = new onExtraCallback();
        try {
            selectionContainerKtExternalSyntheticLambda6.onWarmupCompleted.registerReceiver(onextracallback, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            selectionContainerKtExternalSyntheticLambda6.onExtraCallback = onextracallback;
        } catch (RuntimeException e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
        selectionContainerKtExternalSyntheticLambda6.onNavigationEvent.onNavigationEvent(selectionContainerKtExternalSyntheticLambda6.onExtraCallback(i2));
    }

    public void onWarmupCompleted(final int i2) {
        this.onNavigationEvent.onExtraCallbackWithResult(new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda6
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.IAuthTabCallback(i2, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        }, new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda7
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.IAuthTabCallback(this.f$0, i2, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        });
    }

    public static /* synthetic */ onExtraCallbackWithResult IAuthTabCallback(int i2, onExtraCallbackWithResult onextracallbackwithresult) {
        return new onExtraCallbackWithResult(i2, onextracallbackwithresult.IAuthTabCallback, onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallback);
    }

    public static /* synthetic */ onExtraCallbackWithResult IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6, int i2, onExtraCallbackWithResult onextracallbackwithresult) {
        return onextracallbackwithresult.onNavigationEvent == i2 ? onextracallbackwithresult : selectionContainerKtExternalSyntheticLambda6.onExtraCallback(i2);
    }

    public int onExtraCallback() {
        return this.onNavigationEvent.onWarmupCompleted().onExtraCallbackWithResult;
    }

    public int onExtraCallbackWithResult() {
        return this.onNavigationEvent.onWarmupCompleted().onExtraCallback;
    }

    public int onNavigationEvent() {
        return this.onNavigationEvent.onWarmupCompleted().IAuthTabCallback;
    }

    public boolean IAuthTabCallback() {
        return this.onNavigationEvent.onWarmupCompleted().onWarmupCompleted;
    }

    public void onExtraCallbackWithResult(final int i2, final int i3) {
        this.onNavigationEvent.onExtraCallbackWithResult(new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda4
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onWarmupCompleted(i2, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        }, new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda5
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onWarmupCompleted(this.f$0, i2, i3, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        });
    }

    public static /* synthetic */ onExtraCallbackWithResult onWarmupCompleted(int i2, onExtraCallbackWithResult onextracallbackwithresult) {
        int i3 = onextracallbackwithresult.onNavigationEvent;
        int i4 = onextracallbackwithresult.onExtraCallbackWithResult;
        return new onExtraCallbackWithResult(i3, (i2 < i4 || i2 > onextracallbackwithresult.onExtraCallback) ? onextracallbackwithresult.IAuthTabCallback : i2, i2 == 0, i4, onextracallbackwithresult.onExtraCallback);
    }

    public static /* synthetic */ onExtraCallbackWithResult onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6, int i2, int i3, onExtraCallbackWithResult onextracallbackwithresult) {
        if (i2 == onextracallbackwithresult.IAuthTabCallback || i2 < onextracallbackwithresult.onExtraCallbackWithResult || i2 > onextracallbackwithresult.onExtraCallback) {
            return onextracallbackwithresult;
        }
        ((AudioManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult)).setStreamVolume(onextracallbackwithresult.onNavigationEvent, i2, i3);
        return selectionContainerKtExternalSyntheticLambda6.onExtraCallback(onextracallbackwithresult.onNavigationEvent);
    }

    public void onNavigationEvent(final int i2) {
        this.onNavigationEvent.onExtraCallbackWithResult(new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda12
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onWarmupCompleted((SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        }, new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda13
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult(this.f$0, i2, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        });
    }

    public static /* synthetic */ onExtraCallbackWithResult onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = onextracallbackwithresult.onNavigationEvent;
        int i3 = onextracallbackwithresult.IAuthTabCallback;
        int i4 = onextracallbackwithresult.onExtraCallback;
        return new onExtraCallbackWithResult(i2, i3 < i4 ? i3 + 1 : i4, false, onextracallbackwithresult.onExtraCallbackWithResult, i4);
    }

    public static /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6, int i2, onExtraCallbackWithResult onextracallbackwithresult) {
        if (onextracallbackwithresult.IAuthTabCallback >= onextracallbackwithresult.onExtraCallback) {
            return onextracallbackwithresult;
        }
        ((AudioManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult)).adjustStreamVolume(onextracallbackwithresult.onNavigationEvent, 1, i2);
        return selectionContainerKtExternalSyntheticLambda6.onExtraCallback(onextracallbackwithresult.onNavigationEvent);
    }

    public void onExtraCallbackWithResult(final int i2) {
        this.onNavigationEvent.onExtraCallbackWithResult(new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda2
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult((SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        }, new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda3
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onWarmupCompleted(this.f$0, i2, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        });
    }

    public static /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = onextracallbackwithresult.onNavigationEvent;
        int i3 = onextracallbackwithresult.IAuthTabCallback;
        int i4 = onextracallbackwithresult.onExtraCallbackWithResult;
        return new onExtraCallbackWithResult(i2, i3 > i4 ? i3 - 1 : i4, i3 <= 1, i4, onextracallbackwithresult.onExtraCallback);
    }

    public static /* synthetic */ onExtraCallbackWithResult onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6, int i2, onExtraCallbackWithResult onextracallbackwithresult) {
        if (onextracallbackwithresult.IAuthTabCallback <= onextracallbackwithresult.onExtraCallbackWithResult) {
            return onextracallbackwithresult;
        }
        ((AudioManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult)).adjustStreamVolume(onextracallbackwithresult.onNavigationEvent, -1, i2);
        return selectionContainerKtExternalSyntheticLambda6.onExtraCallback(onextracallbackwithresult.onNavigationEvent);
    }

    public void onNavigationEvent(final boolean z, final int i2) {
        this.onNavigationEvent.onExtraCallbackWithResult(new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda8
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult(this.f$0, z, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        }, new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda9
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult(this.f$0, z, i2, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        });
    }

    public static /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6, boolean z, onExtraCallbackWithResult onextracallbackwithresult) {
        return new onExtraCallbackWithResult(onextracallbackwithresult.onNavigationEvent, onextracallbackwithresult.onWarmupCompleted == z ? onextracallbackwithresult.IAuthTabCallback : z ? 0 : selectionContainerKtExternalSyntheticLambda6.asInterface, z, onextracallbackwithresult.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallback);
    }

    public static /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6, boolean z, int i2, onExtraCallbackWithResult onextracallbackwithresult) {
        if (onextracallbackwithresult.onWarmupCompleted == z) {
            return onextracallbackwithresult;
        }
        selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult.adjustStreamVolume(onextracallbackwithresult.onNavigationEvent, z ? -100 : 100, i2);
        return selectionContainerKtExternalSyntheticLambda6.onExtraCallback(onextracallbackwithresult.onNavigationEvent);
    }

    public void onWarmupCompleted() {
        this.onNavigationEvent.onExtraCallbackWithResult(new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda10
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.onNavigationEvent((SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        }, new Function() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda11
            public final Object apply(Object obj) {
                return SelectionContainerKtExternalSyntheticLambda6.IAuthTabCallback(this.f$0, (SelectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult) obj);
            }
        });
    }

    public static /* synthetic */ onExtraCallbackWithResult IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6, onExtraCallbackWithResult onextracallbackwithresult) {
        onExtraCallback onextracallback = selectionContainerKtExternalSyntheticLambda6.onExtraCallback;
        if (onextracallback != null) {
            try {
                selectionContainerKtExternalSyntheticLambda6.onWarmupCompleted.unregisterReceiver(onextracallback);
            } catch (RuntimeException e) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            selectionContainerKtExternalSyntheticLambda6.onExtraCallback = null;
        }
        return onextracallbackwithresult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, onExtraCallbackWithResult onextracallbackwithresult2) {
        boolean z = onextracallbackwithresult.onWarmupCompleted;
        if (!z && onextracallbackwithresult2.onWarmupCompleted) {
            this.asInterface = onextracallbackwithresult.IAuthTabCallback;
        }
        int i2 = onextracallbackwithresult.IAuthTabCallback;
        int i3 = onextracallbackwithresult2.IAuthTabCallback;
        if (i2 != i3 || z != onextracallbackwithresult2.onWarmupCompleted) {
            this.IAuthTabCallback.onWarmupCompleted(i3, onextracallbackwithresult2.onWarmupCompleted);
        }
        int i4 = onextracallbackwithresult.onNavigationEvent;
        int i5 = onextracallbackwithresult2.onNavigationEvent;
        if (i4 == i5 && onextracallbackwithresult.onExtraCallbackWithResult == onextracallbackwithresult2.onExtraCallbackWithResult && onextracallbackwithresult.onExtraCallback == onextracallbackwithresult2.onExtraCallback) {
            return;
        }
        this.IAuthTabCallback.onExtraCallback(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public onExtraCallbackWithResult onExtraCallback(int i2) {
        return new onExtraCallbackWithResult(i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.IAuthTabCallback(this.onExtraCallbackWithResult, i2), CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onNavigationEvent(this.onExtraCallbackWithResult, i2), CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onExtraCallback(this.onExtraCallbackWithResult, i2), CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onWarmupCompleted(this.onExtraCallbackWithResult, i2));
    }

    public static final class onExtraCallbackWithResult {
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final boolean onWarmupCompleted;

        public onExtraCallbackWithResult(int i2, int i3, boolean z, int i4, int i5) {
            this.onNavigationEvent = i2;
            this.IAuthTabCallback = i3;
            this.onWarmupCompleted = z;
            this.onExtraCallbackWithResult = i4;
            this.onExtraCallback = i5;
        }
    }

    public final class onExtraCallback extends BroadcastReceiver {
        private onExtraCallback() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SelectionContainerKtExternalSyntheticLambda6.this.onNavigationEvent.IAuthTabCallback(new Runnable() { // from class: androidx.media3.exoplayer.StreamVolumeManager$VolumeChangeReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionContainerKtExternalSyntheticLambda6.onExtraCallback.onWarmupCompleted(this.f$0);
                }
            });
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallback onextracallback) {
            if (SelectionContainerKtExternalSyntheticLambda6.this.onExtraCallback == null) {
                return;
            }
            SelectionContainerKtExternalSyntheticLambda6.this.onNavigationEvent.onNavigationEvent(SelectionContainerKtExternalSyntheticLambda6.this.onExtraCallback(((onExtraCallbackWithResult) SelectionContainerKtExternalSyntheticLambda6.this.onNavigationEvent.onWarmupCompleted()).onNavigationEvent));
        }
    }
}
