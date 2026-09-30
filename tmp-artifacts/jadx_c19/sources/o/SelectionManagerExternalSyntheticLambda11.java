package o;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.Objects;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManagerExternalSyntheticLambda11 {
    private SelectionManagerExternalSyntheticLambda13 IAuthTabCallback;
    private SelectionManagerExternalSyntheticLambda4 IAuthTabCallbackDefault;
    private final BroadcastReceiver IAuthTabCallbackStub;
    private final IAuthTabCallback asBinder;
    private boolean asInterface;
    private final onExtraCallbackWithResult onExtraCallback;
    private final onNavigationEvent onExtraCallbackWithResult;
    private TextContextMenuHelperApi28ExternalSyntheticLambda5 onNavigationEvent;
    private final Handler onTransact;
    private final Context onWarmupCompleted;

    public interface IAuthTabCallback {
        void onAudioCapabilitiesChanged(SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    SelectionManagerExternalSyntheticLambda11(Context context, IAuthTabCallback iAuthTabCallback, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, @Nullable SelectionManagerExternalSyntheticLambda4 selectionManagerExternalSyntheticLambda4) {
        Context applicationContext = context.getApplicationContext();
        this.onWarmupCompleted = applicationContext;
        this.asBinder = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallback);
        this.onNavigationEvent = textContextMenuHelperApi28ExternalSyntheticLambda5;
        this.IAuthTabCallbackDefault = selectionManagerExternalSyntheticLambda4;
        Handler handlerOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted();
        this.onTransact = handlerOnWarmupCompleted;
        this.onExtraCallbackWithResult = new onNavigationEvent();
        this.IAuthTabCallbackStub = new onExtraCallback();
        Uri uriOnExtraCallback = SelectionManagerExternalSyntheticLambda13.onExtraCallback();
        this.onExtraCallback = uriOnExtraCallback != null ? new onExtraCallbackWithResult(handlerOnWarmupCompleted, applicationContext.getContentResolver(), uriOnExtraCallback) : null;
    }

    public void onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda13) {
        onNavigationEvent(selectionManagerExternalSyntheticLambda13);
    }

    public void onWarmupCompleted(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
        this.onNavigationEvent = textContextMenuHelperApi28ExternalSyntheticLambda5;
        onNavigationEvent(SelectionManagerExternalSyntheticLambda13.onExtraCallbackWithResult(this.onWarmupCompleted, textContextMenuHelperApi28ExternalSyntheticLambda5, this.IAuthTabCallbackDefault));
    }

    public void onNavigationEvent(@Nullable AudioDeviceInfo audioDeviceInfo) {
        SelectionManagerExternalSyntheticLambda4 selectionManagerExternalSyntheticLambda4 = this.IAuthTabCallbackDefault;
        if (Objects.equals(audioDeviceInfo, selectionManagerExternalSyntheticLambda4 == null ? null : selectionManagerExternalSyntheticLambda4.onExtraCallback)) {
            return;
        }
        SelectionManagerExternalSyntheticLambda4 selectionManagerExternalSyntheticLambda42 = audioDeviceInfo != null ? new SelectionManagerExternalSyntheticLambda4(audioDeviceInfo) : null;
        this.IAuthTabCallbackDefault = selectionManagerExternalSyntheticLambda42;
        onNavigationEvent(SelectionManagerExternalSyntheticLambda13.onExtraCallbackWithResult(this.onWarmupCompleted, this.onNavigationEvent, selectionManagerExternalSyntheticLambda42));
    }

    public SelectionManagerExternalSyntheticLambda13 onNavigationEvent() {
        if (this.asInterface) {
            return (SelectionManagerExternalSyntheticLambda13) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback);
        }
        this.asInterface = true;
        onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onWarmupCompleted();
        }
        onNavigationEvent onnavigationevent = this.onExtraCallbackWithResult;
        if (onnavigationevent != null) {
            onWarmupCompleted.onExtraCallbackWithResult(this.onWarmupCompleted, onnavigationevent, this.onTransact);
        }
        SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda13OnNavigationEvent = SelectionManagerExternalSyntheticLambda13.onNavigationEvent(this.onWarmupCompleted, this.onWarmupCompleted.registerReceiver(this.IAuthTabCallbackStub, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.onTransact), this.onNavigationEvent, this.IAuthTabCallbackDefault);
        this.IAuthTabCallback = selectionManagerExternalSyntheticLambda13OnNavigationEvent;
        return selectionManagerExternalSyntheticLambda13OnNavigationEvent;
    }

    public void onExtraCallback() {
        if (this.asInterface) {
            this.IAuthTabCallback = null;
            onNavigationEvent onnavigationevent = this.onExtraCallbackWithResult;
            if (onnavigationevent != null) {
                onWarmupCompleted.onNavigationEvent(this.onWarmupCompleted, onnavigationevent);
            }
            this.onWarmupCompleted.unregisterReceiver(this.IAuthTabCallbackStub);
            onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onExtraCallback();
            }
            this.asInterface = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNavigationEvent(SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda13) {
        if (!this.asInterface || selectionManagerExternalSyntheticLambda13.equals(this.IAuthTabCallback)) {
            return;
        }
        this.IAuthTabCallback = selectionManagerExternalSyntheticLambda13;
        this.asBinder.onAudioCapabilitiesChanged(selectionManagerExternalSyntheticLambda13);
    }

    final class onExtraCallback extends BroadcastReceiver {
        private onExtraCallback() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = SelectionManagerExternalSyntheticLambda11.this;
            selectionManagerExternalSyntheticLambda11.onNavigationEvent(SelectionManagerExternalSyntheticLambda13.onNavigationEvent(context, intent, selectionManagerExternalSyntheticLambda11.onNavigationEvent, SelectionManagerExternalSyntheticLambda11.this.IAuthTabCallbackDefault));
        }
    }

    final class onExtraCallbackWithResult extends ContentObserver {
        private final ContentResolver onExtraCallback;
        private final Uri onWarmupCompleted;

        public onExtraCallbackWithResult(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.onExtraCallback = contentResolver;
            this.onWarmupCompleted = uri;
        }

        public void onWarmupCompleted() {
            this.onExtraCallback.registerContentObserver(this.onWarmupCompleted, false, this);
        }

        public void onExtraCallback() {
            this.onExtraCallback.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = SelectionManagerExternalSyntheticLambda11.this;
            selectionManagerExternalSyntheticLambda11.onNavigationEvent(SelectionManagerExternalSyntheticLambda13.onExtraCallbackWithResult(selectionManagerExternalSyntheticLambda11.onWarmupCompleted, SelectionManagerExternalSyntheticLambda11.this.onNavigationEvent, SelectionManagerExternalSyntheticLambda11.this.IAuthTabCallbackDefault));
        }
    }

    final class onNavigationEvent extends AudioDeviceCallback {
        private onNavigationEvent() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = SelectionManagerExternalSyntheticLambda11.this;
            selectionManagerExternalSyntheticLambda11.onNavigationEvent(SelectionManagerExternalSyntheticLambda13.onExtraCallbackWithResult(selectionManagerExternalSyntheticLambda11.onWarmupCompleted, SelectionManagerExternalSyntheticLambda11.this.onNavigationEvent, SelectionManagerExternalSyntheticLambda11.this.IAuthTabCallbackDefault));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            Object[] objArr = {audioDeviceInfoArr, SelectionManagerExternalSyntheticLambda11.this.IAuthTabCallbackDefault};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            if (((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1347411989, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 1347412007)).booleanValue()) {
                SelectionManagerExternalSyntheticLambda11.this.IAuthTabCallbackDefault = null;
            }
            SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = SelectionManagerExternalSyntheticLambda11.this;
            selectionManagerExternalSyntheticLambda11.onNavigationEvent(SelectionManagerExternalSyntheticLambda13.onExtraCallbackWithResult(selectionManagerExternalSyntheticLambda11.onWarmupCompleted, SelectionManagerExternalSyntheticLambda11.this.onNavigationEvent, SelectionManagerExternalSyntheticLambda11.this.IAuthTabCallbackDefault));
        }
    }

    static final class onWarmupCompleted {
        public static void onExtraCallbackWithResult(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onNavigationEvent(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void onNavigationEvent(Context context, AudioDeviceCallback audioDeviceCallback) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onNavigationEvent(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }
}
