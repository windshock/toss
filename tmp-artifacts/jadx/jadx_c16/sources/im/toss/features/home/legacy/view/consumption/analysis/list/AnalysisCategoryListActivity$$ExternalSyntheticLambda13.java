package im.toss.features.home.legacy.view.consumption.analysis.list;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.setUnreadableElfFiles;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda13 implements setUnreadableElfFiles {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AnalysisCategoryListActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return AnalysisCategoryListActivity.onWarmupCompleted(this.f$0, (Rect) obj, (View) obj2, (RecyclerView) obj3, (RecyclerView.State) obj4, ((Integer) obj5).intValue());
        }
        AnalysisCategoryListActivity.onWarmupCompleted(this.f$0, (Rect) obj, (View) obj2, (RecyclerView) obj3, (RecyclerView.State) obj4, ((Integer) obj5).intValue());
        Object obj6 = null;
        obj6.hashCode();
        throw null;
    }
}
