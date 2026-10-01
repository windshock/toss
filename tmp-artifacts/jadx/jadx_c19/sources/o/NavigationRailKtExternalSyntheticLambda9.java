package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class NavigationRailKtExternalSyntheticLambda9 extends NavigationRailKtExternalSyntheticLambda1 {
    public final long IAuthTabCallback;
    public final long onNavigationEvent;

    private NavigationRailKtExternalSyntheticLambda9(long j, long j2) {
        this.onNavigationEvent = j;
        this.IAuthTabCallback = j2;
    }

    static NavigationRailKtExternalSyntheticLambda9 onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24) {
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, j);
        return new NavigationRailKtExternalSyntheticLambda9(jOnExtraCallbackWithResult, textFieldDecoratorModifierNodeExternalSyntheticLambda24.IAuthTabCallback(jOnExtraCallbackWithResult));
    }

    static long onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j) {
        long jOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        if ((128 & jOnMinimized) != 0) {
            return 8589934591L & ((((jOnMinimized & 1) << 32) | textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // o.NavigationRailKtExternalSyntheticLambda1
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.onNavigationEvent + ", playbackPositionUs= " + this.IAuthTabCallback + " }";
    }
}
