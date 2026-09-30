package o;

import java.io.IOException;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.SliderKtExternalSyntheticLambda18;
import o.SnackbarKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda18 implements DrawerStateExternalSyntheticLambda0 {
    public static final DrawerStateExternalSyntheticLambda2 onExtraCallbackWithResult = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.ts.Ac4Extractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return SliderKtExternalSyntheticLambda18.onNavigationEvent();
        }
    };
    private boolean onExtraCallback;
    private final SliderKtExternalSyntheticLambda2 IAuthTabCallback = new SliderKtExternalSyntheticLambda2("audio/ac4");
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(16384);

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new SliderKtExternalSyntheticLambda18()};
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(10);
        int i2 = 0;
        while (true) {
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 10);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady() != 4801587) {
                break;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(3);
            int iOnPostMessage = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onPostMessage();
            i2 += iOnPostMessage + 10;
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(iOnPostMessage);
        }
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 7);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
            int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            if (iOnUnminimized == 44096 || iOnUnminimized == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iOnExtraCallbackWithResult = DrawerKtExternalSyntheticLambda3.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnUnminimized);
                if (iOnExtraCallbackWithResult == -1) {
                    return false;
                }
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(iOnExtraCallbackWithResult - 7);
            } else {
                drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(i4);
                i3 = 0;
            }
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallback.onNavigationEvent(drawerStateExternalSyntheticLambda1, new SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult(0, 1));
        drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult();
        drawerStateExternalSyntheticLambda1.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L));
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.onExtraCallback = false;
        this.IAuthTabCallback.onWarmupCompleted();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        int iOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted(this.onWarmupCompleted.onExtraCallback(), 0, 16384);
        if (iOnWarmupCompleted == -1) {
            return -1;
        }
        this.onWarmupCompleted.asBinder(0);
        this.onWarmupCompleted.onNavigationEvent(iOnWarmupCompleted);
        if (!this.onExtraCallback) {
            this.IAuthTabCallback.onNavigationEvent(0L, 4);
            this.onExtraCallback = true;
        }
        this.IAuthTabCallback.IAuthTabCallback(this.onWarmupCompleted);
        return 0;
    }
}
