package o;

import android.content.Context;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9 {

    public interface onExtraCallbackWithResult {
    }

    public interface onNavigationEvent {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9 IAuthTabCallback(Context context, TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1, BasicTextContextMenuProviderExternalSyntheticLambda1 basicTextContextMenuProviderExternalSyntheticLambda1, onExtraCallbackWithResult onextracallbackwithresult, Executor executor, long j, boolean z);
    }

    int onExtraCallback(int i2);

    boolean onExtraCallbackWithResult(int i2);

    Surface onWarmupCompleted(int i2);
}
