package o;

import o.DrawerKtExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DrawerKtExternalSyntheticLambda13 {
    private final DrawerKtExternalSyntheticLambda10 IAuthTabCallbackDefault;
    private final onNavigationEvent onExtraCallback;
    private long onNavigationEvent;
    private final DrawerKtExternalSyntheticLambda10.onNavigationEvent IAuthTabCallbackStub = new DrawerKtExternalSyntheticLambda10.onNavigationEvent();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda26<CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0> getInterfaceDescriptor = new TextFieldDecoratorModifierNodeExternalSyntheticLambda26<>();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda26<Long> asBinder = new TextFieldDecoratorModifierNodeExternalSyntheticLambda26<>();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda15 onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda15();
    private long onExtraCallbackWithResult = -9223372036854775807L;
    private CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 asInterface = CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onExtraCallbackWithResult;
    private long onWarmupCompleted = -9223372036854775807L;
    private long IAuthTabCallback = -9223372036854775807L;

    interface onNavigationEvent {
        void onExtraCallback();

        void onExtraCallback(long j, long j2, boolean z);

        void onNavigationEvent(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
    }

    public DrawerKtExternalSyntheticLambda13(onNavigationEvent onnavigationevent, DrawerKtExternalSyntheticLambda10 drawerKtExternalSyntheticLambda10) {
        this.onExtraCallback = onnavigationevent;
        this.IAuthTabCallbackDefault = drawerKtExternalSyntheticLambda10;
    }

    public void IAuthTabCallback() {
        this.onTransact.onNavigationEvent();
        this.onExtraCallbackWithResult = -9223372036854775807L;
        this.onWarmupCompleted = -9223372036854775807L;
        this.IAuthTabCallback = -9223372036854775807L;
        if (this.asBinder.onWarmupCompleted() > 0) {
            this.onNavigationEvent = ((Long) onExtraCallbackWithResult(this.asBinder)).longValue();
        }
        if (this.getInterfaceDescriptor.onWarmupCompleted() > 0) {
            this.getInterfaceDescriptor.onWarmupCompleted(0L, (CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) onExtraCallbackWithResult(this.getInterfaceDescriptor));
        }
    }

    public void onWarmupCompleted(long j, long j2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        DrawerKtExternalSyntheticLambda13 drawerKtExternalSyntheticLambda13 = this;
        while (!drawerKtExternalSyntheticLambda13.onTransact.onExtraCallbackWithResult()) {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda13.onTransact.IAuthTabCallback();
            if (drawerKtExternalSyntheticLambda13.onExtraCallback(jIAuthTabCallback)) {
                drawerKtExternalSyntheticLambda13.IAuthTabCallbackDefault.IAuthTabCallback(2);
            }
            int iIAuthTabCallback = drawerKtExternalSyntheticLambda13.IAuthTabCallbackDefault.IAuthTabCallback(jIAuthTabCallback, j, j2, drawerKtExternalSyntheticLambda13.onNavigationEvent, false, false, drawerKtExternalSyntheticLambda13.IAuthTabCallbackStub);
            if (iIAuthTabCallback == 0 || iIAuthTabCallback == 1) {
                drawerKtExternalSyntheticLambda13 = this;
                drawerKtExternalSyntheticLambda13.onWarmupCompleted = jIAuthTabCallback;
                drawerKtExternalSyntheticLambda13.IAuthTabCallback(iIAuthTabCallback == 0);
            } else if (iIAuthTabCallback == 2 || iIAuthTabCallback == 3) {
                drawerKtExternalSyntheticLambda13 = this;
                drawerKtExternalSyntheticLambda13.onWarmupCompleted = jIAuthTabCallback;
                onNavigationEvent();
            } else if (iIAuthTabCallback != 4) {
                if (iIAuthTabCallback != 5) {
                    throw new IllegalStateException(String.valueOf(iIAuthTabCallback));
                }
                return;
            } else {
                drawerKtExternalSyntheticLambda13 = this;
                drawerKtExternalSyntheticLambda13.onWarmupCompleted = jIAuthTabCallback;
            }
        }
    }

    public void onExtraCallbackWithResult(int i2, int i3) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda26<CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0> textFieldDecoratorModifierNodeExternalSyntheticLambda26 = this.getInterfaceDescriptor;
        long j = this.onExtraCallbackWithResult;
        textFieldDecoratorModifierNodeExternalSyntheticLambda26.onWarmupCompleted(j == -9223372036854775807L ? 0L : j + 1, new CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0(i2, i3));
    }

    public void onExtraCallbackWithResult(int i2, long j) {
        if (this.onTransact.onExtraCallbackWithResult()) {
            this.IAuthTabCallbackDefault.IAuthTabCallback(i2);
            this.onNavigationEvent = j;
        } else {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda26<Long> textFieldDecoratorModifierNodeExternalSyntheticLambda26 = this.asBinder;
            long j2 = this.onExtraCallbackWithResult;
            textFieldDecoratorModifierNodeExternalSyntheticLambda26.onWarmupCompleted(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    public void onWarmupCompleted(long j) {
        this.onTransact.onWarmupCompleted(j);
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = -9223372036854775807L;
    }

    public void onExtraCallback() {
        if (this.onExtraCallbackWithResult == -9223372036854775807L) {
            this.onExtraCallbackWithResult = Long.MIN_VALUE;
            this.onWarmupCompleted = Long.MIN_VALUE;
        }
        this.IAuthTabCallback = this.onExtraCallbackWithResult;
    }

    public boolean onWarmupCompleted() {
        long j = this.IAuthTabCallback;
        return j != -9223372036854775807L && this.onWarmupCompleted == j;
    }

    private void onNavigationEvent() {
        this.onTransact.onExtraCallback();
        this.onExtraCallback.onExtraCallback();
    }

    private void IAuthTabCallback(boolean z) {
        long jOnNavigationEvent;
        long jOnExtraCallback = this.onTransact.onExtraCallback();
        if (onExtraCallbackWithResult(jOnExtraCallback)) {
            this.onExtraCallback.onNavigationEvent(this.asInterface);
        }
        if (z) {
            jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda0.onNavigationEvent.onNavigationEvent();
        } else {
            jOnNavigationEvent = this.IAuthTabCallbackStub.onNavigationEvent();
        }
        this.onExtraCallback.onExtraCallback(jOnNavigationEvent, jOnExtraCallback, this.IAuthTabCallbackDefault.onNavigationEvent());
    }

    private boolean onExtraCallback(long j) {
        Long lOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult(j);
        if (lOnExtraCallbackWithResult == null || lOnExtraCallbackWithResult.longValue() == this.onNavigationEvent) {
            return false;
        }
        this.onNavigationEvent = lOnExtraCallbackWithResult.longValue();
        return true;
    }

    private boolean onExtraCallbackWithResult(long j) {
        CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0OnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(j);
        if (cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0OnExtraCallbackWithResult == null || cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0OnExtraCallbackWithResult.equals(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onExtraCallbackWithResult) || cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0OnExtraCallbackWithResult.equals(this.asInterface)) {
            return false;
        }
        this.asInterface = cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0OnExtraCallbackWithResult;
        return true;
    }

    private static <T> T onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda26<T> textFieldDecoratorModifierNodeExternalSyntheticLambda26) {
        RecordingInputConnection_androidKt.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda26.onWarmupCompleted() > 0);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda26.onWarmupCompleted() > 1) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda26.onExtraCallback();
        }
        return (T) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda26.onExtraCallback());
    }
}
