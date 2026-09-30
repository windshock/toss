package o;

import java.io.IOException;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.SliderKtExternalSyntheticLambda11;
import o.SnackbarKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda11 implements DrawerStateExternalSyntheticLambda0 {
    public static final DrawerStateExternalSyntheticLambda2 IAuthTabCallback = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.ts.Ac3Extractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return SliderKtExternalSyntheticLambda11.onNavigationEvent();
        }
    };
    private boolean onNavigationEvent;
    private final SliderKtExternalSyntheticLambda16 onExtraCallbackWithResult = new SliderKtExternalSyntheticLambda16("audio/ac3");
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(2786);

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new SliderKtExternalSyntheticLambda11()};
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
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 6);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized() != 2935) {
                drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(i4);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iOnWarmupCompleted = DrawerKtExternalSyntheticLambda25.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback());
                if (iOnWarmupCompleted == -1) {
                    return false;
                }
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(iOnWarmupCompleted - 6);
            }
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult.onNavigationEvent(drawerStateExternalSyntheticLambda1, new SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult(0, 1));
        drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult();
        drawerStateExternalSyntheticLambda1.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L));
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.onNavigationEvent = false;
        this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        int iOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted(this.onExtraCallback.onExtraCallback(), 0, 2786);
        if (iOnWarmupCompleted == -1) {
            return -1;
        }
        this.onExtraCallback.asBinder(0);
        this.onExtraCallback.onNavigationEvent(iOnWarmupCompleted);
        if (!this.onNavigationEvent) {
            this.onExtraCallbackWithResult.onNavigationEvent(0L, 4);
            this.onNavigationEvent = true;
        }
        this.onExtraCallbackWithResult.IAuthTabCallback(this.onExtraCallback);
        return 0;
    }
}
