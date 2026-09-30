package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetStateCompanionExternalSyntheticLambda0 extends NavigationRailKtExternalSyntheticLambda1 {
    public final byte[] IAuthTabCallback;
    public final long onExtraCallback;
    public final long onNavigationEvent;

    private ModalBottomSheetStateCompanionExternalSyntheticLambda0(long j, byte[] bArr, long j2) {
        this.onExtraCallback = j2;
        this.onNavigationEvent = j;
        this.IAuthTabCallback = bArr;
    }

    static ModalBottomSheetStateCompanionExternalSyntheticLambda0 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, long j) {
        long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        int i3 = i2 - 4;
        byte[] bArr = new byte[i3];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i3);
        return new ModalBottomSheetStateCompanionExternalSyntheticLambda0(jOnActivityResized, bArr, j);
    }

    @Override // o.NavigationRailKtExternalSyntheticLambda1
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.onExtraCallback + ", identifier= " + this.onNavigationEvent + " }";
    }
}
