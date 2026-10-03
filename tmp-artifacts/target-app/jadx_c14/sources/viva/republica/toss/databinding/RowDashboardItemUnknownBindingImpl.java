package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import o.ContextMenuAreaKtExternalSyntheticLambda1;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowDashboardItemUnknownBindingImpl extends RowDashboardItemUnknownBinding {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallback = null;
    private static final SparseIntArray onExtraCallbackWithResult = null;
    private final View asBinder;
    private long onTransact;

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        return false;
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        return true;
    }

    public RowDashboardItemUnknownBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 1, IAuthTabCallback, onExtraCallbackWithResult));
    }

    private RowDashboardItemUnknownBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 0);
        this.onTransact = -1L;
        View view2 = (View) objArr[0];
        this.asBinder = view2;
        view2.setTag(null);
        onWarmupCompleted(view);
        IAuthTabCallbackStub();
    }

    public void IAuthTabCallbackStub() {
        synchronized (this) {
            this.onTransact = 1L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.onTransact != 0;
        }
    }

    public void onNavigationEvent() {
        synchronized (this) {
            this.onTransact = 0L;
        }
    }
}
