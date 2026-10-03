package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import o.ContextMenuAreaKtExternalSyntheticLambda1;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowTransactionTitleBindingImpl extends RowTransactionTitleBinding {
    private static final SparseIntArray IAuthTabCallback = null;
    private static final ViewDataBinding.onWarmupCompleted onExtraCallbackWithResult = null;
    private final LinearLayout IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        return false;
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        return true;
    }

    public RowTransactionTitleBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 1, onExtraCallbackWithResult, IAuthTabCallback));
    }

    private RowTransactionTitleBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 0);
        this.IAuthTabCallbackStub = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.IAuthTabCallbackDefault = linearLayout;
        linearLayout.setTag(null);
        onWarmupCompleted(view);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.IAuthTabCallbackStub = 1L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.IAuthTabCallbackStub != 0;
        }
    }

    public void onNavigationEvent() {
        synchronized (this) {
            this.IAuthTabCallbackStub = 0L;
        }
    }
}
