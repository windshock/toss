package o;

import java.nio.ByteBuffer;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class NavigationRailKtExternalSyntheticLambda4 extends MenuKtExternalSyntheticLambda6 {
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda24 IAuthTabCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();

    @Override // o.MenuKtExternalSyntheticLambda6
    public HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallbackWithResult(MenuKtExternalSyntheticLambda5 menuKtExternalSyntheticLambda5, ByteBuffer byteBuffer) {
        HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback navigationRailKtExternalSyntheticLambda3;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24 = this.IAuthTabCallback;
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda24 == null || menuKtExternalSyntheticLambda5.onTransact != textFieldDecoratorModifierNodeExternalSyntheticLambda24.onExtraCallbackWithResult()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda242 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(((SelectionControllerExternalSyntheticLambda2) menuKtExternalSyntheticLambda5).onWarmupCompleted);
            this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda242;
            textFieldDecoratorModifierNodeExternalSyntheticLambda242.onExtraCallback(((SelectionControllerExternalSyntheticLambda2) menuKtExternalSyntheticLambda5).onWarmupCompleted - menuKtExternalSyntheticLambda5.onTransact);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.onExtraCallback.onExtraCallback(bArrArray, iLimit);
        this.onWarmupCompleted.onExtraCallback(bArrArray, iLimit);
        this.onWarmupCompleted.IAuthTabCallback(39);
        long jOnNavigationEvent = (this.onWarmupCompleted.onNavigationEvent(1) << 32) | this.onWarmupCompleted.onNavigationEvent(32);
        this.onWarmupCompleted.IAuthTabCallback(20);
        int iOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(12);
        int iOnNavigationEvent2 = this.onWarmupCompleted.onNavigationEvent(8);
        this.onExtraCallback.IAuthTabCallbackDefault(14);
        if (iOnNavigationEvent2 == 0) {
            navigationRailKtExternalSyntheticLambda3 = new NavigationRailKtExternalSyntheticLambda3();
        } else if (iOnNavigationEvent2 == 255) {
            navigationRailKtExternalSyntheticLambda3 = ModalBottomSheetStateCompanionExternalSyntheticLambda0.onNavigationEvent(this.onExtraCallback, iOnNavigationEvent, jOnNavigationEvent);
        } else if (iOnNavigationEvent2 == 4) {
            navigationRailKtExternalSyntheticLambda3 = NavigationRailKtExternalSyntheticLambda10.IAuthTabCallback(this.onExtraCallback);
        } else if (iOnNavigationEvent2 == 5) {
            navigationRailKtExternalSyntheticLambda3 = NavigationRailKtExternalSyntheticLambda2.onNavigationEvent(this.onExtraCallback, jOnNavigationEvent, this.IAuthTabCallback);
        } else {
            navigationRailKtExternalSyntheticLambda3 = iOnNavigationEvent2 != 6 ? null : NavigationRailKtExternalSyntheticLambda9.onExtraCallbackWithResult(this.onExtraCallback, jOnNavigationEvent, this.IAuthTabCallback);
        }
        return navigationRailKtExternalSyntheticLambda3 == null ? new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[0]) : new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{navigationRailKtExternalSyntheticLambda3});
    }
}
