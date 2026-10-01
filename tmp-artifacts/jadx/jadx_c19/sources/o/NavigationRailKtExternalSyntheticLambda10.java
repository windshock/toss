package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class NavigationRailKtExternalSyntheticLambda10 extends NavigationRailKtExternalSyntheticLambda1 {
    public final List<onWarmupCompleted> onWarmupCompleted;

    public static final class onWarmupCompleted {
        public final int IAuthTabCallback;
        public final int IAuthTabCallbackDefault;
        public final boolean IAuthTabCallbackStub;
        public final long access100;
        public final boolean asBinder;
        public final long asInterface;
        public final long onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final List<onExtraCallbackWithResult> onNavigationEvent;
        public final boolean onTransact;
        public final boolean onWarmupCompleted;

        private onWarmupCompleted(long j, boolean z, boolean z2, boolean z3, List<onExtraCallbackWithResult> list, long j2, boolean z4, long j3, int i2, int i3, int i4) {
            this.asInterface = j;
            this.onTransact = z;
            this.IAuthTabCallbackStub = z2;
            this.asBinder = z3;
            this.onNavigationEvent = Collections.unmodifiableList(list);
            this.access100 = j2;
            this.onWarmupCompleted = z4;
            this.onExtraCallback = j3;
            this.IAuthTabCallbackDefault = i2;
            this.onExtraCallbackWithResult = i3;
            this.IAuthTabCallback = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static onWarmupCompleted onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i2;
            int i3;
            int iOnMinimized;
            boolean z3;
            boolean z4;
            long jOnActivityResized;
            long jOnActivityResized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
            boolean z5 = (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i2 = 0;
                i3 = 0;
                iOnMinimized = 0;
                z3 = false;
            } else {
                int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                boolean z6 = (iOnMinimized2 & 128) != 0;
                boolean z7 = (iOnMinimized2 & 64) != 0;
                boolean z8 = (iOnMinimized2 & 32) != 0;
                long jOnActivityResized3 = z7 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() : -9223372036854775807L;
                if (!z7) {
                    int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    ArrayList arrayList3 = new ArrayList(iOnMinimized3);
                    for (int i4 = 0; i4 < iOnMinimized3; i4++) {
                        arrayList3.add(new onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    boolean z9 = (128 & jOnMinimized) != 0;
                    jOnActivityResized = ((((jOnMinimized & 1) << 32) | textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jOnActivityResized = -9223372036854775807L;
                }
                int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                int iOnMinimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                z3 = z7;
                iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                j2 = jOnActivityResized;
                arrayList = arrayList2;
                boolean z10 = z6;
                z2 = z4;
                long j3 = jOnActivityResized3;
                i2 = iOnUnminimized;
                i3 = iOnMinimized4;
                z = z10;
                j = j3;
            }
            return new onWarmupCompleted(jOnActivityResized2, z5, z, z3, arrayList, j, z2, j2, i2, i3, iOnMinimized);
        }
    }

    public static final class onExtraCallbackWithResult {
        public final long onExtraCallbackWithResult;
        public final int onWarmupCompleted;

        private onExtraCallbackWithResult(int i2, long j) {
            this.onWarmupCompleted = i2;
            this.onExtraCallbackWithResult = j;
        }
    }

    private NavigationRailKtExternalSyntheticLambda10(List<onWarmupCompleted> list) {
        this.onWarmupCompleted = Collections.unmodifiableList(list);
    }

    static NavigationRailKtExternalSyntheticLambda10 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        ArrayList arrayList = new ArrayList(iOnMinimized);
        for (int i2 = 0; i2 < iOnMinimized; i2++) {
            arrayList.add(onWarmupCompleted.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20));
        }
        return new NavigationRailKtExternalSyntheticLambda10(arrayList);
    }
}
