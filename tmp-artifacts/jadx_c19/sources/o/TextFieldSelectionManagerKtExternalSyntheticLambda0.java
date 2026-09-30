package o;

import java.io.IOException;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionManagerKtExternalSyntheticLambda0 implements TextFieldSelectionManager_androidKtExternalSyntheticLambda10 {
    private static final ExposedDropdownMenuDefaultsExternalSyntheticLambda3 onExtraCallbackWithResult = new ExposedDropdownMenuDefaultsExternalSyntheticLambda3();
    final DrawerStateExternalSyntheticLambda0 IAuthTabCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 IAuthTabCallbackDefault;
    private final RippleKtExternalSyntheticLambda0.onExtraCallback onExtraCallback;
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent;
    private final boolean onWarmupCompleted;

    public TextFieldSelectionManagerKtExternalSyntheticLambda0(DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24) {
        this(drawerStateExternalSyntheticLambda0, basicTextContextMenuProviderKtExternalSyntheticLambda4, textFieldDecoratorModifierNodeExternalSyntheticLambda24, RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback, false);
    }

    TextFieldSelectionManagerKtExternalSyntheticLambda0(DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z) {
        this.IAuthTabCallback = drawerStateExternalSyntheticLambda0;
        this.onNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        this.IAuthTabCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        this.onExtraCallback = onextracallback;
        this.onWarmupCompleted = z;
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda10
    public void onWarmupCompleted(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallback.onNavigationEvent(drawerStateExternalSyntheticLambda1);
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda10
    public boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return this.IAuthTabCallback.onWarmupCompleted(drawerKtExternalSyntheticLambda9, onExtraCallbackWithResult) == 0;
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda10
    public boolean onWarmupCompleted() {
        DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0IAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback();
        return (drawerStateExternalSyntheticLambda0IAuthTabCallback instanceof SliderKtExternalSyntheticLambda19) || (drawerStateExternalSyntheticLambda0IAuthTabCallback instanceof SliderKtExternalSyntheticLambda11) || (drawerStateExternalSyntheticLambda0IAuthTabCallback instanceof SliderKtExternalSyntheticLambda18) || (drawerStateExternalSyntheticLambda0IAuthTabCallback instanceof OutlinedTextFieldKtExternalSyntheticLambda13);
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda10
    public boolean onExtraCallback() {
        DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0IAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback();
        return (drawerStateExternalSyntheticLambda0IAuthTabCallback instanceof SnackbarHostKtExternalSyntheticLambda8) || (drawerStateExternalSyntheticLambda0IAuthTabCallback instanceof OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0);
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda10
    public TextFieldSelectionManager_androidKtExternalSyntheticLambda10 onNavigationEvent() {
        DrawerStateExternalSyntheticLambda0 outlinedTextFieldKtExternalSyntheticLambda13;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!onExtraCallback());
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback.IAuthTabCallback() == this.IAuthTabCallback, "Can't recreate wrapped extractors. Outer type: " + this.IAuthTabCallback.getClass());
        DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0 = this.IAuthTabCallback;
        if (drawerStateExternalSyntheticLambda0 instanceof AlertDialogKtExternalSyntheticLambda0) {
            outlinedTextFieldKtExternalSyntheticLambda13 = new AlertDialogKtExternalSyntheticLambda0(this.onNavigationEvent.onActivityLayout, this.IAuthTabCallbackDefault, this.onExtraCallback, this.onWarmupCompleted);
        } else if (drawerStateExternalSyntheticLambda0 instanceof SliderKtExternalSyntheticLambda19) {
            outlinedTextFieldKtExternalSyntheticLambda13 = new SliderKtExternalSyntheticLambda19();
        } else if (drawerStateExternalSyntheticLambda0 instanceof SliderKtExternalSyntheticLambda11) {
            outlinedTextFieldKtExternalSyntheticLambda13 = new SliderKtExternalSyntheticLambda11();
        } else if (drawerStateExternalSyntheticLambda0 instanceof SliderKtExternalSyntheticLambda18) {
            outlinedTextFieldKtExternalSyntheticLambda13 = new SliderKtExternalSyntheticLambda18();
        } else if (drawerStateExternalSyntheticLambda0 instanceof OutlinedTextFieldKtExternalSyntheticLambda13) {
            outlinedTextFieldKtExternalSyntheticLambda13 = new OutlinedTextFieldKtExternalSyntheticLambda13();
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.IAuthTabCallback.getClass().getSimpleName());
        }
        return new TextFieldSelectionManagerKtExternalSyntheticLambda0(outlinedTextFieldKtExternalSyntheticLambda13, this.onNavigationEvent, this.IAuthTabCallbackDefault, this.onExtraCallback, this.onWarmupCompleted);
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda10
    public void onExtraCallbackWithResult() {
        this.IAuthTabCallback.onNavigationEvent(0L, 0L);
    }
}
