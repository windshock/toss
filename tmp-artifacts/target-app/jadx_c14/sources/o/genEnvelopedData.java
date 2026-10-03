package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.inventory_sdk.ui.view.InventoryAdView;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class genEnvelopedData extends decEnvelopedData {
    private static final SparseIntArray IAuthTabCallbackStub;
    private static final ViewDataBinding.onWarmupCompleted asInterface = null;
    private long IAuthTabCallbackDefault;

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        return false;
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        IAuthTabCallbackStub = sparseIntArray;
        sparseIntArray.put(R.id.divider, 1);
    }

    public genEnvelopedData(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 2, asInterface, IAuthTabCallbackStub));
    }

    private genEnvelopedData(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 0, (InventoryAdView) objArr[0], (View) objArr[1]);
        this.IAuthTabCallbackDefault = -1L;
        this.IAuthTabCallback.setTag(null);
        onWarmupCompleted(view);
        IAuthTabCallbackDefault();
    }

    public void IAuthTabCallbackDefault() {
        synchronized (this) {
            this.IAuthTabCallbackDefault = 1L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.IAuthTabCallbackDefault != 0;
        }
    }

    public void onNavigationEvent() {
        synchronized (this) {
            this.IAuthTabCallbackDefault = 0L;
        }
    }
}
