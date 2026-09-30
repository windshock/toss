package o;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SelectionManagerExternalSyntheticLambda6 {
    private SelectionManagerExternalSyntheticLambda3 IAuthTabCallback;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private Method IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private int ICustomTabsCallbackDefault;
    private final long[] ICustomTabsCallbackStub;
    private long ICustomTabsCallbackStubProxy;
    private long ICustomTabsCallback_Parcel;
    private long ICustomTabsService;
    private long access000;
    private boolean access100;
    private long asBinder;
    private long asInterface;
    private long extraCallback;
    private long extraCallbackWithResult;
    private long extraCommand;
    private boolean getInterfaceDescriptor;
    private long isEngagementSignalsApiAvailable;
    private long mayLaunchUrl;
    private long onActivityLayout;
    private final onNavigationEvent onActivityResized;
    private float onExtraCallback;
    private AudioTrack onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private boolean onMinimized;
    private int onNavigationEvent;
    private boolean onPostMessage;
    private long onRelationshipValidationResult;
    private boolean onTransact;
    private int onUnminimized;
    boolean onWarmupCompleted;
    private int readTypedObject;
    private long writeTypedObject;

    public interface onNavigationEvent {
        void IAuthTabCallback(long j, long j2, long j3, long j4);

        void onExtraCallback(long j);

        void onExtraCallbackWithResult(long j);

        void onNavigationEvent(int i2, long j);

        void onWarmupCompleted(long j, long j2, long j3, long j4);
    }

    private static boolean onWarmupCompleted(int i2) {
        return false;
    }

    public SelectionManagerExternalSyntheticLambda6(onNavigationEvent onnavigationevent) {
        this.onActivityResized = (onNavigationEvent) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onnavigationevent);
        try {
            this.IAuthTabCallbackStubProxy = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.ICustomTabsCallbackStub = new long[10];
        this.writeTypedObject = -9223372036854775807L;
        this.extraCallbackWithResult = -9223372036854775807L;
        this.IAuthTabCallbackDefault = TextFieldDecoratorModifierNodeExternalSyntheticLambda0.onNavigationEvent;
    }

    public void onNavigationEvent(AudioTrack audioTrack, boolean z, int i2, int i3, int i4, boolean z2) {
        this.onExtraCallbackWithResult = audioTrack;
        this.onNavigationEvent = i4;
        this.IAuthTabCallback = new SelectionManagerExternalSyntheticLambda3(audioTrack, this.onActivityResized);
        this.onUnminimized = audioTrack.getSampleRate();
        this.onMinimized = z && onWarmupCompleted(i2);
        boolean zIAuthTabCallbackStubProxy = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStubProxy(i2);
        this.getInterfaceDescriptor = zIAuthTabCallbackStubProxy;
        this.IAuthTabCallbackStub = zIAuthTabCallbackStubProxy ? TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i4 / i3, this.onUnminimized) : -9223372036854775807L;
        this.ICustomTabsCallbackStubProxy = 0L;
        this.ICustomTabsService = 0L;
        this.onTransact = false;
        this.isEngagementSignalsApiAvailable = 0L;
        this.onRelationshipValidationResult = 0L;
        this.access100 = false;
        this.extraCommand = -9223372036854775807L;
        this.asBinder = -9223372036854775807L;
        this.access000 = 0L;
        this.ICustomTabsCallback = 0L;
        this.onExtraCallback = 1.0f;
        this.readTypedObject = 0;
        this.onActivityLayout = -9223372036854775807L;
        this.onWarmupCompleted = z2;
    }

    public void onWarmupCompleted(float f) {
        this.onExtraCallback = f;
        SelectionManagerExternalSyntheticLambda3 selectionManagerExternalSyntheticLambda3 = this.IAuthTabCallback;
        if (selectionManagerExternalSyntheticLambda3 != null) {
            selectionManagerExternalSyntheticLambda3.onExtraCallback();
        }
        IAuthTabCallback_Parcel();
    }

    public long IAuthTabCallback() {
        long jIAuthTabCallback;
        AudioTrack audioTrack = (AudioTrack) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        if (audioTrack.getPlayState() == 3) {
            access000();
        }
        long jOnNavigationEvent = this.IAuthTabCallbackDefault.onNavigationEvent() / 1000;
        SelectionManagerExternalSyntheticLambda3 selectionManagerExternalSyntheticLambda3 = (SelectionManagerExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback);
        boolean zOnWarmupCompleted = selectionManagerExternalSyntheticLambda3.onWarmupCompleted();
        if (zOnWarmupCompleted) {
            jIAuthTabCallback = selectionManagerExternalSyntheticLambda3.onExtraCallbackWithResult(jOnNavigationEvent, this.onExtraCallback);
        } else {
            jIAuthTabCallback = IAuthTabCallback(jOnNavigationEvent);
        }
        long jOnWarmupCompleted = jIAuthTabCallback;
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                IAuthTabCallbackDefault(jOnWarmupCompleted);
            }
            return jOnWarmupCompleted;
        }
        if (zOnWarmupCompleted || !selectionManagerExternalSyntheticLambda3.onExtraCallbackWithResult()) {
            IAuthTabCallbackDefault(jOnWarmupCompleted);
        }
        long j = this.writeTypedObject;
        if (j != -9223372036854775807L) {
            long j2 = this.extraCallbackWithResult;
            long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jOnNavigationEvent - j, this.onExtraCallback);
            long j3 = this.extraCallbackWithResult + jOnExtraCallback;
            long jAbs = Math.abs(j3 - jOnWarmupCompleted);
            if (jOnWarmupCompleted - j2 != 0 && jAbs < 1000000) {
                long j4 = (jOnExtraCallback * 10) / 100;
                jOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(jOnWarmupCompleted, j3 - j4, j3 + j4);
            }
        }
        if (!this.onWarmupCompleted && !this.onPostMessage) {
            long j5 = this.extraCallbackWithResult;
            if (j5 != -9223372036854775807L && jOnWarmupCompleted > j5) {
                this.onPostMessage = true;
                long jOnNavigationEvent2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jOnWarmupCompleted - j5), this.onExtraCallback);
                this.onActivityResized.onExtraCallback(this.IAuthTabCallbackDefault.onWarmupCompleted() - TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jOnNavigationEvent2));
            }
        }
        this.writeTypedObject = jOnNavigationEvent;
        this.extraCallbackWithResult = jOnWarmupCompleted;
        return jOnWarmupCompleted;
    }

    public void asBinder() {
        if (this.extraCommand != -9223372036854775807L) {
            this.extraCommand = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallbackDefault.IAuthTabCallback());
        }
        this.onActivityLayout = IAuthTabCallbackStub();
        ((SelectionManagerExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).onExtraCallback();
    }

    public boolean onExtraCallback() {
        return ((AudioTrack) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).getPlayState() == 3;
    }

    public boolean onNavigationEvent(long j) {
        int playState = ((AudioTrack) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).getPlayState();
        if (this.onMinimized) {
            if (playState == 2) {
                this.access100 = false;
                return false;
            }
            if (playState == 1 && asInterface() == 0) {
                return false;
            }
        }
        if (access100()) {
            this.onActivityResized.onNavigationEvent(this.onNavigationEvent, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallbackStub));
        }
        return true;
    }

    public boolean onWarmupCompleted(long j) {
        return this.asBinder != -9223372036854775807L && j > 0 && this.IAuthTabCallbackDefault.IAuthTabCallback() - this.asBinder >= 200;
    }

    public void onExtraCallback(long j) {
        this.ICustomTabsCallback_Parcel = asInterface();
        this.extraCommand = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallbackDefault.IAuthTabCallback());
        this.asInterface = j;
    }

    public boolean onExtraCallbackWithResult(long j) {
        return j > TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(IAuthTabCallback(), this.onUnminimized) || IAuthTabCallbackDefault();
    }

    public void onNavigationEvent() {
        IAuthTabCallback_Parcel();
        if (this.extraCommand == -9223372036854775807L) {
            ((SelectionManagerExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).onExtraCallback();
        }
        this.ICustomTabsCallback_Parcel = asInterface();
    }

    public void onWarmupCompleted() {
        this.onTransact = true;
        SelectionManagerExternalSyntheticLambda3 selectionManagerExternalSyntheticLambda3 = this.IAuthTabCallback;
        if (selectionManagerExternalSyntheticLambda3 != null) {
            selectionManagerExternalSyntheticLambda3.onNavigationEvent();
        }
    }

    public void onExtraCallbackWithResult() {
        IAuthTabCallback_Parcel();
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallback = null;
    }

    public void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.IAuthTabCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
    }

    private boolean access100() {
        int underrunCount = ((AudioTrack) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).getUnderrunCount();
        boolean z = underrunCount > this.readTypedObject;
        this.readTypedObject = underrunCount;
        return z;
    }

    private void IAuthTabCallbackDefault(long j) {
        if (this.onWarmupCompleted) {
            long j2 = this.onActivityLayout;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(j - j2, this.onExtraCallback);
            long jOnWarmupCompleted = this.IAuthTabCallbackDefault.onWarmupCompleted();
            long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jOnNavigationEvent);
            this.onActivityLayout = -9223372036854775807L;
            this.onActivityResized.onExtraCallback(jOnWarmupCompleted - jOnExtraCallback);
        }
    }

    private void access000() {
        long jOnNavigationEvent = this.IAuthTabCallbackDefault.onNavigationEvent() / 1000;
        if (jOnNavigationEvent - this.IAuthTabCallback_Parcel >= 30000) {
            long jIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (jIAuthTabCallbackStub == 0) {
                return;
            }
            this.ICustomTabsCallbackStub[this.onMessageChannelReady] = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(jIAuthTabCallbackStub, this.onExtraCallback) - jOnNavigationEvent;
            this.onMessageChannelReady = (this.onMessageChannelReady + 1) % 10;
            int i2 = this.ICustomTabsCallbackDefault;
            if (i2 < 10) {
                this.ICustomTabsCallbackDefault = i2 + 1;
            }
            this.IAuthTabCallback_Parcel = jOnNavigationEvent;
            this.mayLaunchUrl = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.ICustomTabsCallbackDefault;
                if (i3 >= i4) {
                    break;
                }
                this.mayLaunchUrl += this.ICustomTabsCallbackStub[i3] / i4;
                i3++;
            }
        }
        if (this.onMinimized) {
            return;
        }
        IAuthTabCallbackStub(jOnNavigationEvent);
        ((SelectionManagerExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).onNavigationEvent(jOnNavigationEvent, this.onExtraCallback, IAuthTabCallback(jOnNavigationEvent));
    }

    private void IAuthTabCallbackStub(long j) {
        Method method;
        if (!this.getInterfaceDescriptor || (method = this.IAuthTabCallbackStubProxy) == null || j - this.access000 < 500000) {
            return;
        }
        try {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{(Integer) method.invoke(RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult), null)}, -1084655742);
            long jIntValue = (((Integer) r0).intValue() * 1000) - this.IAuthTabCallbackStub;
            this.ICustomTabsCallback = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.ICustomTabsCallback = jMax;
            if (jMax > 5000000) {
                this.onActivityResized.onExtraCallbackWithResult(jMax);
                this.ICustomTabsCallback = 0L;
            }
        } catch (Exception unused) {
            this.IAuthTabCallbackStubProxy = null;
        }
        this.access000 = j;
    }

    private long IAuthTabCallback(long j) {
        long jOnExtraCallback;
        if (this.ICustomTabsCallbackDefault != 0) {
            jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j + this.mayLaunchUrl, this.onExtraCallback);
        } else if (this.extraCommand != -9223372036854775807L) {
            jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(onTransact(), this.onUnminimized);
        } else {
            jOnExtraCallback = IAuthTabCallbackStub();
        }
        long jMax = Math.max(0L, jOnExtraCallback - this.ICustomTabsCallback);
        return this.extraCommand != -9223372036854775807L ? Math.min(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.asInterface, this.onUnminimized), jMax) : jMax;
    }

    private void IAuthTabCallback_Parcel() {
        this.mayLaunchUrl = 0L;
        this.ICustomTabsCallbackDefault = 0;
        this.onMessageChannelReady = 0;
        this.IAuthTabCallback_Parcel = 0L;
        this.extraCallbackWithResult = -9223372036854775807L;
        this.writeTypedObject = -9223372036854775807L;
        this.onPostMessage = false;
    }

    private boolean IAuthTabCallbackDefault() {
        return this.onMinimized && ((AudioTrack) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).getPlayState() == 2 && asInterface() == 0;
    }

    private long IAuthTabCallbackStub() {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(asInterface(), this.onUnminimized);
    }

    private long asInterface() {
        if (this.extraCommand != -9223372036854775807L) {
            return Math.min(this.asInterface, onTransact());
        }
        long jIAuthTabCallback = this.IAuthTabCallbackDefault.IAuthTabCallback();
        if (jIAuthTabCallback - this.extraCallback >= 5) {
            onTransact(jIAuthTabCallback);
            this.extraCallback = jIAuthTabCallback;
        }
        return this.ICustomTabsCallbackStubProxy + this.isEngagementSignalsApiAvailable + (this.ICustomTabsService << 32);
    }

    private long onTransact() {
        if (((AudioTrack) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).getPlayState() == 2) {
            return this.ICustomTabsCallback_Parcel;
        }
        return this.ICustomTabsCallback_Parcel + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallbackDefault.IAuthTabCallback()) - this.extraCommand, this.onExtraCallback), this.onUnminimized);
    }

    private void onTransact(long j) {
        int playState = ((AudioTrack) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).getPlayState();
        if (playState != 1) {
            long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
            if (this.onMinimized) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.onRelationshipValidationResult = this.ICustomTabsCallbackStubProxy;
                }
                playbackHeadPosition += this.onRelationshipValidationResult;
            }
            if (Build.VERSION.SDK_INT <= 29) {
                if (playbackHeadPosition == 0 && this.ICustomTabsCallbackStubProxy > 0 && playState == 3) {
                    if (this.asBinder == -9223372036854775807L) {
                        this.asBinder = j;
                        return;
                    }
                    return;
                }
                this.asBinder = -9223372036854775807L;
            }
            long j2 = this.ICustomTabsCallbackStubProxy;
            if (j2 > playbackHeadPosition) {
                if (this.onTransact) {
                    this.isEngagementSignalsApiAvailable += j2;
                    this.onTransact = false;
                } else {
                    this.ICustomTabsService++;
                }
            }
            this.ICustomTabsCallbackStubProxy = playbackHeadPosition;
        }
    }
}
