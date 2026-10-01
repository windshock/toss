package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface BottomNavigationKtExternalSyntheticLambda1 {

    public interface onNavigationEvent {
        BottomNavigationKtExternalSyntheticLambda1 createProgressiveMediaExtractor(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12);
    }

    long IAuthTabCallback();

    void onExtraCallback();

    int onExtraCallbackWithResult(ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException;

    void onNavigationEvent();

    void onWarmupCompleted(long j, long j2);

    void onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, Uri uri, Map<String, List<String>> map, long j, long j2, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) throws IOException;
}
