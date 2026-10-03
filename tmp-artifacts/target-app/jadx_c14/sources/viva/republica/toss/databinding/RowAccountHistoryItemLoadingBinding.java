package viva.republica.toss.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import o.runSystemCommand;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class RowAccountHistoryItemLoadingBinding extends ViewDataBinding {
    public final ProgressBar IAuthTabCallback;
    protected runSystemCommand onExtraCallbackWithResult;

    protected RowAccountHistoryItemLoadingBinding(Object obj, View view, int i, ProgressBar progressBar) {
        super(obj, view, i);
        this.IAuthTabCallback = progressBar;
    }
}
