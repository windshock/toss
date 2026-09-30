package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class FloatingActionButtonKtExternalSyntheticLambda5 implements FloatingActionButtonKtExternalSyntheticLambda1 {
    public final int onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final int onWarmupCompleted;

    @Override // o.FloatingActionButtonKtExternalSyntheticLambda1
    public int onExtraCallbackWithResult() {
        return 1751742049;
    }

    public static FloatingActionButtonKtExternalSyntheticLambda5 onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
        int interfaceDescriptor2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        int interfaceDescriptor3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int interfaceDescriptor4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(12);
        return new FloatingActionButtonKtExternalSyntheticLambda5(interfaceDescriptor, interfaceDescriptor2, interfaceDescriptor3, interfaceDescriptor4);
    }

    private FloatingActionButtonKtExternalSyntheticLambda5(int i2, int i3, int i4, int i5) {
        this.onExtraCallback = i2;
        this.onNavigationEvent = i3;
        this.onExtraCallbackWithResult = i4;
        this.onWarmupCompleted = i5;
    }

    public boolean onWarmupCompleted() {
        return (this.onNavigationEvent & 16) == 16;
    }
}
