package o;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MenuKtExternalSyntheticLambda2 extends MenuKtExternalSyntheticLambda6 {
    @Override // o.MenuKtExternalSyntheticLambda6
    public HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallbackWithResult(MenuKtExternalSyntheticLambda5 menuKtExternalSyntheticLambda5, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return IAuthTabCallback(new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static HandwritingHandlerNodeExternalSyntheticLambda0 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(12);
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(12);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(44);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(12));
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strOnNavigationEvent = null;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent() >= (iOnNavigationEvent2 + iOnNavigationEvent) - 4) {
                break;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(48);
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
            int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent() + textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(12);
            String strOnNavigationEvent2 = null;
            while (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent() < iOnNavigationEvent4) {
                int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                int iOnNavigationEvent7 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent() + iOnNavigationEvent6;
                if (iOnNavigationEvent5 == 2) {
                    int iOnNavigationEvent8 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
                    if (iOnNavigationEvent8 == 3) {
                        while (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent() < iOnNavigationEvent7) {
                            strOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8), StandardCharsets.US_ASCII);
                            int iOnNavigationEvent9 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                            for (int i2 = 0; i2 < iOnNavigationEvent9; i2++) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8));
                            }
                        }
                    }
                } else if (iOnNavigationEvent5 == 21) {
                    strOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(iOnNavigationEvent6, StandardCharsets.US_ASCII);
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(iOnNavigationEvent7 << 3);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(iOnNavigationEvent4 << 3);
            if (strOnNavigationEvent != null && strOnNavigationEvent2 != null) {
                arrayList.add(new MenuKtExternalSyntheticLambda4(iOnNavigationEvent3, strOnNavigationEvent + strOnNavigationEvent2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new HandwritingHandlerNodeExternalSyntheticLambda0(arrayList);
    }
}
