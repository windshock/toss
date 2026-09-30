package im.toss.features.home.presentation.legacy_transaction_list;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import o.setUnreadableElfFiles;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda42 implements setUnreadableElfFiles {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = LegacyTransactionListActivity.onExtraCallback(this.f$0, (Rect) obj, (View) obj2, (RecyclerView) obj3, (RecyclerView.State) obj4, ((Integer) obj5).intValue());
        int i4 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
