package o;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import im.toss.inventory_sdk.ui.view.InventoryAdView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class decEnvelopedData extends ViewDataBinding {
    public final InventoryAdView IAuthTabCallback;
    public final View onExtraCallbackWithResult;

    protected decEnvelopedData(Object obj, View view, int i, InventoryAdView inventoryAdView, View view2) {
        super(obj, view, i);
        this.IAuthTabCallback = inventoryAdView;
        this.onExtraCallbackWithResult = view2;
    }
}
