package o;

import androidx.annotation.Nullable;
import o.ExposedDropdownMenuDefaultsExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda4 {
    public final long IAuthTabCallback;
    public final long[] asInterface;
    public final int onExtraCallback;
    public final long onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback onWarmupCompleted;

    private OutlinedTextFieldKtExternalSyntheticLambda4(ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, long j, long j2, @Nullable long[] jArr, int i2, int i3) {
        this.onWarmupCompleted = new ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback(iAuthTabCallback);
        this.IAuthTabCallback = j;
        this.onExtraCallbackWithResult = j2;
        this.asInterface = jArr;
        this.onExtraCallback = i2;
        this.onNavigationEvent = i3;
    }

    public static OutlinedTextFieldKtExternalSyntheticLambda4 onExtraCallback(ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        long[] jArr;
        int i2;
        int i3;
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iICustomTabsCallbackDefault = (iAsBinder & 1) != 0 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault() : -1;
        long jOnActivityResized = (iAsBinder & 2) != 0 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() : -1L;
        if ((iAsBinder & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr2[i4] = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iAsBinder & 8) != 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 24) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(21);
            int iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
            i2 = (iOnMessageChannelReady & 16773120) >> 12;
            i3 = iOnMessageChannelReady & 4095;
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new OutlinedTextFieldKtExternalSyntheticLambda4(iAuthTabCallback, iICustomTabsCallbackDefault, jOnActivityResized, jArr, i2, i3);
    }

    public long onExtraCallback() {
        long j = this.IAuthTabCallback;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((j * r2.IAuthTabCallbackStub) - 1, this.onWarmupCompleted.onNavigationEvent);
    }
}
