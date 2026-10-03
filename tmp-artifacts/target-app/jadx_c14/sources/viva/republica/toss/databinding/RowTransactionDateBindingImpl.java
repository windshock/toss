package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.atom.text.Typography7;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowTransactionDateBindingImpl extends RowTransactionDateBinding {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallback = null;
    private static final SparseIntArray asInterface;
    private long IAuthTabCallbackDefault;
    private final ConstraintLayout asBinder;

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        return false;
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        asInterface = sparseIntArray;
        sparseIntArray.put(R.id.dateTitle, 1);
    }

    public RowTransactionDateBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 2, IAuthTabCallback, asInterface));
    }

    private RowTransactionDateBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 0, (Typography7) objArr[1]);
        this.IAuthTabCallbackDefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.asBinder = constraintLayout;
        constraintLayout.setTag(null);
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
