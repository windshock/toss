package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class FloatingActionButtonKtExternalSyntheticLambda4 implements FloatingActionButtonKtExternalSyntheticLambda1 {
    public final int IAuthTabCallback;
    public final int IAuthTabCallbackDefault;
    public final int onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final int onTransact;
    public final int onWarmupCompleted;

    @Override // o.FloatingActionButtonKtExternalSyntheticLambda1
    public int onExtraCallbackWithResult() {
        return 1752331379;
    }

    public static FloatingActionButtonKtExternalSyntheticLambda4 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(12);
        int interfaceDescriptor2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        int interfaceDescriptor3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        int interfaceDescriptor4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int interfaceDescriptor5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        int interfaceDescriptor6 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        return new FloatingActionButtonKtExternalSyntheticLambda4(interfaceDescriptor, interfaceDescriptor2, interfaceDescriptor3, interfaceDescriptor4, interfaceDescriptor5, interfaceDescriptor6, textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor());
    }

    private FloatingActionButtonKtExternalSyntheticLambda4(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.IAuthTabCallbackDefault = i2;
        this.onNavigationEvent = i3;
        this.onExtraCallbackWithResult = i4;
        this.IAuthTabCallback = i5;
        this.onWarmupCompleted = i6;
        this.onTransact = i7;
        this.onExtraCallback = i8;
    }

    public int onWarmupCompleted() {
        int i2 = this.IAuthTabCallbackDefault;
        if (i2 == 1935960438) {
            return 2;
        }
        if (i2 == 1935963489) {
            return 1;
        }
        if (i2 == 1937012852) {
            return 3;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.IAuthTabCallbackDefault));
        return -1;
    }

    public long onExtraCallback() {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(this.onWarmupCompleted, this.onExtraCallbackWithResult * 1000000, this.IAuthTabCallback);
    }
}
