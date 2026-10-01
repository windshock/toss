package o;

import java.io.IOException;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenu_androidKtExternalSyntheticLambda2 implements DrawerStateExternalSyntheticLambda0 {
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallback;
    private int asBinder;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 asInterface;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private int onWarmupCompleted;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public ExposedDropdownMenu_androidKtExternalSyntheticLambda2(int i2, int i3, String str) {
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = i3;
        this.onNavigationEvent = str;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult((this.onExtraCallback == -1 || this.onExtraCallbackWithResult == -1) ? false : true);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(this.onExtraCallbackWithResult);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, this.onExtraCallbackWithResult);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized() == this.onExtraCallback;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallback = drawerStateExternalSyntheticLambda1;
        onNavigationEvent(this.onNavigationEvent);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        int i2 = this.asBinder;
        if (i2 == 1) {
            onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        if (j == 0 || this.asBinder == 1) {
            this.asBinder = 1;
            this.onWarmupCompleted = 0;
        }
    }

    private void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        int iOnExtraCallback = ((ExposedDropdownMenu_androidKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asInterface)).onExtraCallback(drawerKtExternalSyntheticLambda9, 1024, true);
        if (iOnExtraCallback == -1) {
            this.asBinder = 2;
            this.asInterface.onExtraCallback(0L, 1, this.onWarmupCompleted, 0, null);
            this.onWarmupCompleted = 0;
            return;
        }
        this.onWarmupCompleted += iOnExtraCallback;
    }

    @RequiresNonNull
    private void onNavigationEvent(String str) {
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(1024, 4);
        this.asInterface = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent(str).IAuthTabCallbackDefault(str).onNavigationEvent());
        this.IAuthTabCallback.onExtraCallbackWithResult();
        this.IAuthTabCallback.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda0(-9223372036854775807L));
        this.asBinder = 1;
    }
}
