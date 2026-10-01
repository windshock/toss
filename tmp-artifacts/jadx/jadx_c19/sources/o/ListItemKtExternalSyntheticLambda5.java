package o;

import java.io.IOException;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ListItemKtExternalSyntheticLambda5 implements DrawerStateExternalSyntheticLambda0 {
    private int IAuthTabCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallbackDefault = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(2);
    private long IAuthTabCallbackStub = -1;
    private int asBinder;
    private MenuKtExternalSyntheticLambda1 asInterface;
    private OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0 onExtraCallback;
    private DrawerKtExternalSyntheticLambda9 onExtraCallbackWithResult;
    private DrawerStateExternalSyntheticLambda1 onNavigationEvent;
    private int onTransact;
    private ModalBottomSheetStateExternalSyntheticLambda2 onWarmupCompleted;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (IAuthTabCallback(drawerKtExternalSyntheticLambda9) != 65496) {
            return false;
        }
        int iIAuthTabCallback = IAuthTabCallback(drawerKtExternalSyntheticLambda9);
        this.IAuthTabCallback = iIAuthTabCallback;
        if (iIAuthTabCallback == 65504) {
            onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
            this.IAuthTabCallback = IAuthTabCallback(drawerKtExternalSyntheticLambda9);
        }
        return this.IAuthTabCallback == 65505;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.onNavigationEvent = drawerStateExternalSyntheticLambda1;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        int i2 = this.asBinder;
        if (i2 == 0) {
            onWarmupCompleted(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 1) {
            asInterface(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 2) {
            onNavigationEvent(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 4) {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            long j = this.IAuthTabCallbackStub;
            if (jIAuthTabCallback != j) {
                exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = j;
                return 1;
            }
            onTransact(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 != 5) {
            if (i2 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.asInterface == null || drawerKtExternalSyntheticLambda9 != this.onExtraCallbackWithResult) {
            this.onExtraCallbackWithResult = drawerKtExternalSyntheticLambda9;
            this.asInterface = new MenuKtExternalSyntheticLambda1(drawerKtExternalSyntheticLambda9, this.IAuthTabCallbackStub);
        }
        int iOnWarmupCompleted = ((OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onWarmupCompleted(this.asInterface, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        if (iOnWarmupCompleted == 1) {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted += this.IAuthTabCallbackStub;
        }
        return iOnWarmupCompleted;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        if (j == 0) {
            this.asBinder = 0;
            this.onExtraCallback = null;
        } else if (this.asBinder == 5) {
            ((OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onNavigationEvent(j, j2);
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
        OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0 outlinedTextFieldMeasurePolicyExternalSyntheticLambda0 = this.onExtraCallback;
        if (outlinedTextFieldMeasurePolicyExternalSyntheticLambda0 != null) {
            outlinedTextFieldMeasurePolicyExternalSyntheticLambda0.onWarmupCompleted();
        }
    }

    private int IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.IAuthTabCallbackDefault.onExtraCallback(2);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallbackDefault.onExtraCallback(), 0, 2);
        return this.IAuthTabCallbackDefault.onUnminimized();
    }

    private void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.IAuthTabCallbackDefault.onExtraCallback(2);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallbackDefault.onExtraCallback(), 0, 2);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallbackDefault.onUnminimized() - 2);
    }

    private void onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.IAuthTabCallbackDefault.onExtraCallback(2);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(this.IAuthTabCallbackDefault.onExtraCallback(), 0, 2);
        int iOnUnminimized = this.IAuthTabCallbackDefault.onUnminimized();
        this.IAuthTabCallback = iOnUnminimized;
        if (iOnUnminimized == 65498) {
            if (this.IAuthTabCallbackStub != -1) {
                this.asBinder = 4;
                return;
            } else {
                onExtraCallback();
                return;
            }
        }
        if ((iOnUnminimized < 65488 || iOnUnminimized > 65497) && iOnUnminimized != 65281) {
            this.asBinder = 1;
        }
    }

    private void asInterface(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.IAuthTabCallbackDefault.onExtraCallback(2);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(this.IAuthTabCallbackDefault.onExtraCallback(), 0, 2);
        this.onTransact = this.IAuthTabCallbackDefault.onUnminimized() - 2;
        this.asBinder = 2;
    }

    private void onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        String strExtraCallbackWithResult;
        if (this.IAuthTabCallback == 65505) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(this.onTransact);
            drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, this.onTransact);
            if (this.onWarmupCompleted == null && "http://ns.adobe.com/xap/1.0/".equals(textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult()) && (strExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult()) != null) {
                ModalBottomSheetStateExternalSyntheticLambda2 modalBottomSheetStateExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback(strExtraCallbackWithResult, drawerKtExternalSyntheticLambda9.onExtraCallback());
                this.onWarmupCompleted = modalBottomSheetStateExternalSyntheticLambda2IAuthTabCallback;
                if (modalBottomSheetStateExternalSyntheticLambda2IAuthTabCallback != null) {
                    this.IAuthTabCallbackStub = modalBottomSheetStateExternalSyntheticLambda2IAuthTabCallback.onExtraCallback;
                }
            }
        } else {
            drawerKtExternalSyntheticLambda9.onExtraCallback(this.onTransact);
        }
        this.asBinder = 0;
    }

    private void onTransact(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (!drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(this.IAuthTabCallbackDefault.onExtraCallback(), 0, 1, true)) {
            onExtraCallback();
            return;
        }
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        if (this.onExtraCallback == null) {
            this.onExtraCallback = new OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback, 8);
        }
        MenuKtExternalSyntheticLambda1 menuKtExternalSyntheticLambda1 = new MenuKtExternalSyntheticLambda1(drawerKtExternalSyntheticLambda9, this.IAuthTabCallbackStub);
        this.asInterface = menuKtExternalSyntheticLambda1;
        if (this.onExtraCallback.onExtraCallback(menuKtExternalSyntheticLambda1)) {
            this.onExtraCallback.onNavigationEvent(new MenuKtExternalSyntheticLambda0(this.IAuthTabCallbackStub, (DrawerStateExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)));
            onNavigationEvent();
        } else {
            onExtraCallback();
        }
    }

    private void onNavigationEvent() {
        IAuthTabCallback((ModalBottomSheetStateExternalSyntheticLambda2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted));
        this.asBinder = 5;
    }

    private void onExtraCallback() {
        ((DrawerStateExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).onExtraCallbackWithResult();
        this.onNavigationEvent.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L));
        this.asBinder = 6;
    }

    private void IAuthTabCallback(ModalBottomSheetStateExternalSyntheticLambda2 modalBottomSheetStateExternalSyntheticLambda2) {
        ((DrawerStateExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).onExtraCallbackWithResult(1024, 4).onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("image/jpeg").onExtraCallbackWithResult(new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{modalBottomSheetStateExternalSyntheticLambda2})).onNavigationEvent());
    }

    private static ModalBottomSheetStateExternalSyntheticLambda2 IAuthTabCallback(String str, long j) throws IOException {
        MaterialThemeKtExternalSyntheticLambda1 materialThemeKtExternalSyntheticLambda1OnExtraCallbackWithResult;
        if (j == -1 || (materialThemeKtExternalSyntheticLambda1OnExtraCallbackWithResult = MaterialTheme_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(str)) == null) {
            return null;
        }
        return materialThemeKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback(j);
    }
}
