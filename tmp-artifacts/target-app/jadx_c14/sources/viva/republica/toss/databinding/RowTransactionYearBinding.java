package viva.republica.toss.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class RowTransactionYearBinding extends ViewDataBinding {
    public final TdsListHeaderV2View onExtraCallbackWithResult;

    protected RowTransactionYearBinding(Object obj, View view, int i, TdsListHeaderV2View tdsListHeaderV2View) {
        super(obj, view, i);
        this.onExtraCallbackWithResult = tdsListHeaderV2View;
    }
}
