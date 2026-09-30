package im.toss.features.home.legacy.view.consumption.analysis;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import o.setUnreadableElfFiles;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryActivity$$ExternalSyntheticLambda11 implements setUnreadableElfFiles {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AnalysisCategoryActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = AnalysisCategoryActivity.onExtraCallbackWithResult(this.f$0, (Rect) obj, (View) obj2, (RecyclerView) obj3, (RecyclerView.State) obj4, ((Integer) obj5).intValue());
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
