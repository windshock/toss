package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda1 implements RippleKtExternalSyntheticLambda0 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        return 2;
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        this.onWarmupCompleted.onExtraCallback(bArr, i3 + i2);
        this.onWarmupCompleted.asBinder(i2);
        ArrayList arrayList = new ArrayList();
        while (this.onWarmupCompleted.onNavigationEvent() > 0) {
            RecordingInputConnection_androidKt.onExtraCallback(this.onWarmupCompleted.onNavigationEvent() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iAsBinder = this.onWarmupCompleted.asBinder();
            if (this.onWarmupCompleted.asBinder() == 1987343459) {
                arrayList.add(IAuthTabCallback(this.onWarmupCompleted, iAsBinder - 8));
            } else {
                this.onWarmupCompleted.IAuthTabCallbackDefault(iAsBinder - 8);
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(new RadioButtonDefaults(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    private static ImeEditCommand_androidKtExternalSyntheticLambda1 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        CharSequence charSequenceOnWarmupCompleted = null;
        ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = null;
        while (i2 > 0) {
            RecordingInputConnection_androidKt.onExtraCallback(i2 >= 8, "Incomplete vtt cue box header found.");
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            int i3 = iAsBinder - 8;
            String strOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(), i3);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(i3);
            i2 = (i2 - 8) - i3;
            if (iAsBinder2 == 1937011815) {
                onextracallbackwithresultOnNavigationEvent = SliderKtExternalSyntheticLambda15.onNavigationEvent(strOnExtraCallback);
            } else if (iAsBinder2 == 1885436268) {
                charSequenceOnWarmupCompleted = SliderKtExternalSyntheticLambda15.onWarmupCompleted((String) null, strOnExtraCallback.trim(), (List<ShapesKtExternalSyntheticLambda0>) Collections.EMPTY_LIST);
            }
        }
        if (charSequenceOnWarmupCompleted == null) {
            charSequenceOnWarmupCompleted = "";
        }
        if (onextracallbackwithresultOnNavigationEvent != null) {
            return onextracallbackwithresultOnNavigationEvent.onNavigationEvent(charSequenceOnWarmupCompleted).IAuthTabCallback();
        }
        return SliderKtExternalSyntheticLambda15.onExtraCallback(charSequenceOnWarmupCompleted);
    }
}
