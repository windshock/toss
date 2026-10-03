package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import o.ContextMenuAreaKtExternalSyntheticLambda1;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowTransactionItemBindingImpl extends RowTransactionItemBinding {
    private static final SparseIntArray IAuthTabCallbackStub = null;
    private static final ViewDataBinding.onWarmupCompleted onExtraCallbackWithResult = null;
    private long IAuthTabCallbackDefault;

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        return false;
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        return true;
    }

    public RowTransactionItemBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 1, onExtraCallbackWithResult, IAuthTabCallbackStub));
    }

    private RowTransactionItemBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 0, (TdsListRowV1View) objArr[0]);
        this.IAuthTabCallbackDefault = -1L;
        this.IAuthTabCallback.setTag(null);
        onWarmupCompleted(view);
        asBinder();
    }

    public void asBinder() {
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
