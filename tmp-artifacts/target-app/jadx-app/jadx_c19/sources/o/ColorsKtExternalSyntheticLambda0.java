package o;

import java.util.List;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ColorsKtExternalSyntheticLambda0 extends ComposableSingletonsAppBarKtExternalSyntheticLambda1 {

    public interface onExtraCallback {
        ColorsKtExternalSyntheticLambda0[] onExtraCallback(onNavigationEvent[] onnavigationeventArr, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
    }

    BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback();

    default boolean IAuthTabCallback(long j, BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list) {
        return false;
    }

    default long IAuthTabCallbackStub() {
        return -2147483647L;
    }

    int asBinder();

    void asInterface();

    void onExtraCallback(float f);

    boolean onExtraCallback(int i2, long j);

    int onExtraCallbackWithResult();

    int onExtraCallbackWithResult(long j, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list);

    Object onNavigationEvent();

    void onNavigationEvent(long j, long j2, long j3, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list, BottomSheetScaffoldKtExternalSyntheticLambda6[] bottomSheetScaffoldKtExternalSyntheticLambda6Arr);

    void onTransact();

    int onWarmupCompleted();

    default void onWarmupCompleted(boolean z) {
    }

    boolean onWarmupCompleted(int i2, long j);

    public static final class onNavigationEvent {
        public final int onExtraCallback;
        public final int[] onNavigationEvent;
        public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onWarmupCompleted;

        public onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int... iArr) {
            this(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iArr, 0);
        }

        public onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr, int i2) {
            if (iArr.length == 0) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.onWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1;
            this.onNavigationEvent = iArr;
            this.onExtraCallback = i2;
        }
    }
}
