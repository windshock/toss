package o;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ShaderBrushSpanExternalSyntheticLambda0<Model, Data> {
    onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull Model model, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30);

    boolean onNavigationEvent(@NonNull Model model);

    public static class onExtraCallbackWithResult<Data> {
        public final SaversKtExternalSyntheticLambda26 IAuthTabCallback;
        public final SaversKtExternalSyntheticLambda35<Data> onExtraCallback;
        public final List<SaversKtExternalSyntheticLambda26> onWarmupCompleted;

        public onExtraCallbackWithResult(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, @NonNull SaversKtExternalSyntheticLambda35<Data> saversKtExternalSyntheticLambda35) {
            this(saversKtExternalSyntheticLambda26, Collections.EMPTY_LIST, saversKtExternalSyntheticLambda35);
        }

        public onExtraCallbackWithResult(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, @NonNull List<SaversKtExternalSyntheticLambda26> list, @NonNull SaversKtExternalSyntheticLambda35<Data> saversKtExternalSyntheticLambda35) {
            this.IAuthTabCallback = (SaversKtExternalSyntheticLambda26) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda26);
            this.onWarmupCompleted = (List) markHierarchyDirty.onExtraCallbackWithResult(list);
            this.onExtraCallback = (SaversKtExternalSyntheticLambda35) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda35);
        }
    }
}
