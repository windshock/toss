package o;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda13 implements RippleKtExternalSyntheticLambda0 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final SliderKtExternalSyntheticLambda10 onNavigationEvent = new SliderKtExternalSyntheticLambda10();

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        return 1;
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0 secureTextFieldKtSecureTextField1ExternalSyntheticLambda0OnWarmupCompleted;
        this.onWarmupCompleted.onExtraCallback(bArr, i3 + i2);
        this.onWarmupCompleted.asBinder(i2);
        ArrayList arrayList = new ArrayList();
        try {
            SliderKtExternalSyntheticLambda12.onNavigationEvent(this.onWarmupCompleted);
            while (!TextUtils.isEmpty(this.onWarmupCompleted.access000())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iOnNavigationEvent = onNavigationEvent(this.onWarmupCompleted);
                if (iOnNavigationEvent == 0) {
                    RangeSliderLogic.onNavigationEvent(new SliderKtExternalSyntheticLambda14(arrayList2), onnavigationevent, textFieldDecoratorModifierNodeExternalSyntheticLambda10);
                    return;
                }
                if (iOnNavigationEvent == 1) {
                    onExtraCallback(this.onWarmupCompleted);
                } else if (iOnNavigationEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.onWarmupCompleted.access000();
                    arrayList.addAll(this.onNavigationEvent.IAuthTabCallback(this.onWarmupCompleted));
                } else if (iOnNavigationEvent == 3 && (secureTextFieldKtSecureTextField1ExternalSyntheticLambda0OnWarmupCompleted = SliderKtExternalSyntheticLambda15.onWarmupCompleted(this.onWarmupCompleted, arrayList)) != null) {
                    arrayList2.add(secureTextFieldKtSecureTextField1ExternalSyntheticLambda0OnWarmupCompleted);
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }

    private static int onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int i2 = -1;
        int iOnWarmupCompleted = 0;
        while (i2 == -1) {
            iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            String strAccess000 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000();
            if (strAccess000 == null) {
                i2 = 0;
            } else if ("STYLE".equals(strAccess000)) {
                i2 = 2;
            } else {
                i2 = strAccess000.startsWith("NOTE") ? 1 : 3;
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        return i2;
    }

    private static void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        while (!TextUtils.isEmpty(textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000())) {
        }
    }
}
