package o;

import androidx.media3.common.ParserException;
import java.io.IOException;
import o.DrawerStateExternalSyntheticLambda0;
import o.ProgressIndicatorKtExternalSyntheticLambda16;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda16 implements DrawerStateExternalSyntheticLambda0 {
    public static final DrawerStateExternalSyntheticLambda2 onWarmupCompleted = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.ogg.OggExtractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return ProgressIndicatorKtExternalSyntheticLambda16.onNavigationEvent();
        }
    };
    private boolean IAuthTabCallback;
    private ProgressIndicatorKtExternalSyntheticLambda6 onExtraCallback;
    private DrawerStateExternalSyntheticLambda1 onNavigationEvent;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new ProgressIndicatorKtExternalSyntheticLambda16()};
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        try {
            return IAuthTabCallback(drawerKtExternalSyntheticLambda9);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.onNavigationEvent = drawerStateExternalSyntheticLambda1;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        ProgressIndicatorKtExternalSyntheticLambda6 progressIndicatorKtExternalSyntheticLambda6 = this.onExtraCallback;
        if (progressIndicatorKtExternalSyntheticLambda6 != null) {
            progressIndicatorKtExternalSyntheticLambda6.onExtraCallback(j, j2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onNavigationEvent);
        if (this.onExtraCallback == null) {
            if (!IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
                throw ParserException.onNavigationEvent("Failed to determine bitstream type", (Throwable) null);
            }
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        }
        if (!this.IAuthTabCallback) {
            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(0, 1);
            this.onNavigationEvent.onExtraCallbackWithResult();
            this.onExtraCallback.onNavigationEvent(this.onNavigationEvent, exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult);
            this.IAuthTabCallback = true;
        }
        return this.onExtraCallback.onExtraCallback(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
    }

    @EnsuresNonNullIf
    private boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda2 = new ProgressIndicatorKtExternalSyntheticLambda2();
        if (progressIndicatorKtExternalSyntheticLambda2.onExtraCallback(drawerKtExternalSyntheticLambda9, true) && (progressIndicatorKtExternalSyntheticLambda2.onTransact & 2) == 2) {
            int iMin = Math.min(progressIndicatorKtExternalSyntheticLambda2.IAuthTabCallback, 8);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(iMin);
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, iMin);
            if (ProgressIndicatorKtExternalSyntheticLambda17.onNavigationEvent(onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20))) {
                this.onExtraCallback = new ProgressIndicatorKtExternalSyntheticLambda17();
            } else if (ProgressIndicatorKtExternalSyntheticLambda3.onNavigationEvent(onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20))) {
                this.onExtraCallback = new ProgressIndicatorKtExternalSyntheticLambda3();
            } else if (ProgressIndicatorKtExternalSyntheticLambda4.onExtraCallback(onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20))) {
                this.onExtraCallback = new ProgressIndicatorKtExternalSyntheticLambda4();
            }
            return true;
        }
        return false;
    }

    private static TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20;
    }
}
