package o;

import java.io.IOException;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class ProgressIndicatorKtExternalSyntheticLambda6 {
    private long IAuthTabCallback;
    private ProgressIndicatorKtExternalSyntheticLambda20 IAuthTabCallbackStub;
    private int access000;
    private long access100;
    private int asBinder;
    private long asInterface;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 getInterfaceDescriptor;
    private boolean onExtraCallback;
    private DrawerStateExternalSyntheticLambda1 onNavigationEvent;
    private boolean onTransact;
    private long onWarmupCompleted;
    private final ProgressIndicatorKtExternalSyntheticLambda19 onExtraCallbackWithResult = new ProgressIndicatorKtExternalSyntheticLambda19();
    private onExtraCallbackWithResult IAuthTabCallbackDefault = new onExtraCallbackWithResult();

    protected abstract long onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20);

    @EnsuresNonNullIf
    protected abstract boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j, onExtraCallbackWithResult onextracallbackwithresult) throws IOException;

    static class onExtraCallbackWithResult {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent;
        ProgressIndicatorKtExternalSyntheticLambda20 onWarmupCompleted;

        onExtraCallbackWithResult() {
        }
    }

    void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
        this.onNavigationEvent = drawerStateExternalSyntheticLambda1;
        this.getInterfaceDescriptor = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
        onExtraCallbackWithResult(true);
    }

    protected void onExtraCallbackWithResult(boolean z) {
        if (z) {
            this.IAuthTabCallbackDefault = new onExtraCallbackWithResult();
            this.asInterface = 0L;
            this.access000 = 0;
        } else {
            this.access000 = 1;
        }
        this.access100 = -1L;
        this.onWarmupCompleted = 0L;
    }

    final void onExtraCallback(long j, long j2) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        if (j == 0) {
            onExtraCallbackWithResult(!this.onTransact);
            return;
        }
        if (this.access000 != 0) {
            this.access100 = IAuthTabCallback(j2);
            Object[] objArr = {this.IAuthTabCallbackStub};
            ((ProgressIndicatorKtExternalSyntheticLambda20) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742)).IAuthTabCallback(this.access100);
            this.access000 = 2;
        }
    }

    final int onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        onExtraCallback();
        int i2 = this.access000;
        if (i2 == 0) {
            return onExtraCallback(drawerKtExternalSyntheticLambda9);
        }
        if (i2 == 1) {
            drawerKtExternalSyntheticLambda9.onExtraCallback((int) this.asInterface);
            this.access000 = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        Object[] objArr = {this.IAuthTabCallbackStub};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
        return onNavigationEvent(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
    }

    @EnsuresNonNull
    private void onExtraCallback() {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.getInterfaceDescriptor);
        Object[] objArr = {this.onNavigationEvent};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
    }

    @EnsuresNonNullIf
    private boolean onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        while (this.onExtraCallbackWithResult.IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
            this.IAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback() - this.asInterface;
            if (!onExtraCallbackWithResult(this.onExtraCallbackWithResult.onWarmupCompleted(), this.asInterface, this.IAuthTabCallbackDefault)) {
                return true;
            }
            this.asInterface = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        }
        this.access000 = 3;
        return false;
    }

    @RequiresNonNull
    private int onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (!onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9)) {
            return -1;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.IAuthTabCallbackDefault.onNavigationEvent;
        this.asBinder = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch;
        if (!this.onExtraCallback) {
            this.getInterfaceDescriptor.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            this.onExtraCallback = true;
        }
        ProgressIndicatorKtExternalSyntheticLambda20 progressIndicatorKtExternalSyntheticLambda20 = this.IAuthTabCallbackDefault.onWarmupCompleted;
        if (progressIndicatorKtExternalSyntheticLambda20 != null) {
            this.IAuthTabCallbackStub = progressIndicatorKtExternalSyntheticLambda20;
        } else if (drawerKtExternalSyntheticLambda9.onExtraCallback() == -1) {
            this.IAuthTabCallbackStub = new onExtraCallback();
        } else {
            ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda2IAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback();
            this.IAuthTabCallbackStub = new ProgressIndicatorKtExternalSyntheticLambda18(this, this.asInterface, drawerKtExternalSyntheticLambda9.onExtraCallback(), progressIndicatorKtExternalSyntheticLambda2IAuthTabCallback.onNavigationEvent + progressIndicatorKtExternalSyntheticLambda2IAuthTabCallback.IAuthTabCallback, progressIndicatorKtExternalSyntheticLambda2IAuthTabCallback.onWarmupCompleted, (progressIndicatorKtExternalSyntheticLambda2IAuthTabCallback.onTransact & 4) != 0);
        }
        this.access000 = 2;
        this.onExtraCallbackWithResult.onNavigationEvent();
        return 0;
    }

    @RequiresNonNull
    private int onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        long jOnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
        if (jOnExtraCallbackWithResult >= 0) {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = jOnExtraCallbackWithResult;
            return 1;
        }
        if (jOnExtraCallbackWithResult < -1) {
            onNavigationEvent(-(jOnExtraCallbackWithResult + 2));
        }
        if (!this.onTransact) {
            ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4 = (ExposedDropdownMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub.onWarmupCompleted());
            this.onNavigationEvent.IAuthTabCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda4);
            exposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallback();
            this.onTransact = true;
        }
        if (this.IAuthTabCallback > 0 || this.onExtraCallbackWithResult.IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
            this.IAuthTabCallback = 0L;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20OnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
            long jOnExtraCallbackWithResult2 = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20OnWarmupCompleted);
            if (jOnExtraCallbackWithResult2 >= 0) {
                long j = this.onWarmupCompleted;
                if (j + jOnExtraCallbackWithResult2 >= this.access100) {
                    long jOnWarmupCompleted = onWarmupCompleted(j);
                    this.getInterfaceDescriptor.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20OnWarmupCompleted, textFieldDecoratorModifierNodeExternalSyntheticLambda20OnWarmupCompleted.onExtraCallbackWithResult());
                    this.getInterfaceDescriptor.onExtraCallback(jOnWarmupCompleted, 1, textFieldDecoratorModifierNodeExternalSyntheticLambda20OnWarmupCompleted.onExtraCallbackWithResult(), 0, null);
                    this.access100 = -1L;
                }
            }
            this.onWarmupCompleted += jOnExtraCallbackWithResult2;
            return 0;
        }
        this.access000 = 3;
        return -1;
    }

    protected long onWarmupCompleted(long j) {
        return (j * 1000000) / this.asBinder;
    }

    protected long IAuthTabCallback(long j) {
        return (this.asBinder * j) / 1000000;
    }

    protected void onNavigationEvent(long j) {
        this.onWarmupCompleted = j;
    }

    static final class onExtraCallback implements ProgressIndicatorKtExternalSyntheticLambda20 {
        @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
        public void IAuthTabCallback(long j) {
        }

        @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
        public long onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) {
            return -1L;
        }

        private onExtraCallback() {
        }

        @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda4 onWarmupCompleted() {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L);
        }
    }
}
