package o;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ChipKtExternalSyntheticLambda6 extends ChipKtExternalSyntheticLambda3 {
    private final Object IAuthTabCallback;
    private final int onNavigationEvent;

    @Override // o.ColorsKtExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2, long j3, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list, BottomSheetScaffoldKtExternalSyntheticLambda6[] bottomSheetScaffoldKtExternalSyntheticLambda6Arr) {
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public int onWarmupCompleted() {
        return 0;
    }

    public ChipKtExternalSyntheticLambda6(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int i2, int i3) {
        this(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i2, i3, 0, null);
    }

    public ChipKtExternalSyntheticLambda6(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int i2, int i3, int i4, @Nullable Object obj) {
        super(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, new int[]{i2}, i3);
        this.onNavigationEvent = i4;
        this.IAuthTabCallback = obj;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public int onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public Object onNavigationEvent() {
        return this.IAuthTabCallback;
    }
}
