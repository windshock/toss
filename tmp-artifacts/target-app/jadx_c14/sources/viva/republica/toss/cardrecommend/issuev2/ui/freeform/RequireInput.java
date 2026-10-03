package viva.republica.toss.cardrecommend.issuev2.ui.freeform;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface RequireInput {
    boolean IAuthTabCallback();

    void onExtraCallbackWithResult(@NotNull Function0<Unit> function0);

    Pair<String, Object> onNavigationEvent();
}
