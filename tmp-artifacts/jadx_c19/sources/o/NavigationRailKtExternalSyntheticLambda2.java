package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class NavigationRailKtExternalSyntheticLambda2 extends NavigationRailKtExternalSyntheticLambda1 {
    public final int IAuthTabCallback;
    public final long IAuthTabCallbackDefault;
    public final boolean IAuthTabCallbackStub;
    public final int access000;
    public final long access100;
    public final long asBinder;
    public final boolean asInterface;
    public final boolean getInterfaceDescriptor;
    public final List<onWarmupCompleted> onExtraCallback;
    public final boolean onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final boolean onTransact;
    public final long onWarmupCompleted;

    private NavigationRailKtExternalSyntheticLambda2(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<onWarmupCompleted> list, boolean z5, long j4, int i2, int i3, int i4) {
        this.access100 = j;
        this.IAuthTabCallbackStub = z;
        this.onTransact = z2;
        this.asInterface = z3;
        this.getInterfaceDescriptor = z4;
        this.asBinder = j2;
        this.IAuthTabCallbackDefault = j3;
        this.onExtraCallback = Collections.unmodifiableList(list);
        this.onExtraCallbackWithResult = z5;
        this.onWarmupCompleted = j4;
        this.access000 = i2;
        this.IAuthTabCallback = i3;
        this.onNavigationEvent = i4;
    }

    static NavigationRailKtExternalSyntheticLambda2 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int iOnUnminimized;
        int iOnMinimized;
        int iOnMinimized2;
        boolean z4;
        boolean z5;
        long jOnActivityResized;
        long jOnActivityResized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        boolean z6 = (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        if (z6) {
            list = list2;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            iOnUnminimized = 0;
            iOnMinimized = 0;
            iOnMinimized2 = 0;
            z4 = false;
        } else {
            int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            boolean z7 = (iOnMinimized3 & 128) != 0;
            boolean z8 = (iOnMinimized3 & 64) != 0;
            boolean z9 = (iOnMinimized3 & 32) != 0;
            boolean z10 = (iOnMinimized3 & 16) != 0;
            long jOnExtraCallbackWithResult = (!z8 || z10) ? -9223372036854775807L : NavigationRailKtExternalSyntheticLambda9.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, j);
            if (!z8) {
                int iOnMinimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                ArrayList arrayList = new ArrayList(iOnMinimized4);
                for (int i2 = 0; i2 < iOnMinimized4; i2++) {
                    int iOnMinimized5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    long jOnExtraCallbackWithResult2 = !z10 ? NavigationRailKtExternalSyntheticLambda9.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, j) : -9223372036854775807L;
                    arrayList.add(new onWarmupCompleted(iOnMinimized5, jOnExtraCallbackWithResult2, textFieldDecoratorModifierNodeExternalSyntheticLambda24.IAuthTabCallback(jOnExtraCallbackWithResult2)));
                }
                list2 = arrayList;
            }
            if (z9) {
                long jOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                boolean z11 = (128 & jOnMinimized) != 0;
                jOnActivityResized = ((((jOnMinimized & 1) << 32) | textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jOnActivityResized = -9223372036854775807L;
            }
            iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            z4 = z8;
            iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            list = list2;
            long j4 = jOnExtraCallbackWithResult;
            z3 = z5;
            j3 = jOnActivityResized;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new NavigationRailKtExternalSyntheticLambda2(jOnActivityResized2, z6, z, z4, z2, j2, textFieldDecoratorModifierNodeExternalSyntheticLambda24.IAuthTabCallback(j2), list, z3, j3, iOnUnminimized, iOnMinimized, iOnMinimized2);
    }

    public static final class onWarmupCompleted {
        public final long onExtraCallback;
        public final long onNavigationEvent;
        public final int onWarmupCompleted;

        private onWarmupCompleted(int i2, long j, long j2) {
            this.onWarmupCompleted = i2;
            this.onNavigationEvent = j;
            this.onExtraCallback = j2;
        }
    }

    @Override // o.NavigationRailKtExternalSyntheticLambda1
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.asBinder + ", programSplicePlaybackPositionUs= " + this.IAuthTabCallbackDefault + " }";
    }
}
