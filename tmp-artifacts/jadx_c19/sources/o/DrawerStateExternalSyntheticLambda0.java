package o;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface DrawerStateExternalSyntheticLambda0 {
    @SideEffectFree
    default DrawerStateExternalSyntheticLambda0 IAuthTabCallback() {
        return this;
    }

    boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException;

    void onNavigationEvent(long j, long j2);

    void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1);

    int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException;

    void onWarmupCompleted();

    default List<ExposedDropdownMenu_androidKtExternalSyntheticLambda1> onExtraCallbackWithResult() {
        return ImmutableList.of();
    }
}
