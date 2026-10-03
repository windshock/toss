package o;

import android.app.Activity;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface withOrigin {
    Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var);

    Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var);

    void onExtraCallbackWithResult(@NotNull Activity activity, @NotNull IntentSenderForResultStarter intentSenderForResultStarter);

    Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var);

    void onNavigationEvent(@NotNull Activity activity, @NotNull IntentSenderForResultStarter intentSenderForResultStarter);

    setRubIn<withOnAnimationEventListener> onWarmupCompleted();
}
