package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.isGetVIDRV3;
import o.setMaxLength;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowAccountHistoryItemEndBindingImpl extends RowAccountHistoryItemEndBinding {
    private static final SparseIntArray IAuthTabCallbackStub = null;
    private static final ViewDataBinding.onWarmupCompleted onExtraCallbackWithResult = null;
    private final Space asInterface;
    private long onTransact;

    public RowAccountHistoryItemEndBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 1, onExtraCallbackWithResult, IAuthTabCallbackStub));
    }

    private RowAccountHistoryItemEndBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1);
        this.onTransact = -1L;
        Space space = (Space) objArr[0];
        this.asInterface = space;
        space.setTag(null);
        onWarmupCompleted(view);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.onTransact = 2L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.onTransact != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        onWarmupCompleted((setMaxLength) obj);
        return true;
    }

    public void onWarmupCompleted(@Nullable setMaxLength setmaxlength) {
        this.IAuthTabCallback = setmaxlength;
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onExtraCallback((setMaxLength) obj, i2);
    }

    private boolean onExtraCallback(setMaxLength setmaxlength, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.onTransact |= 1;
        }
        return true;
    }

    public void onNavigationEvent() {
        synchronized (this) {
            this.onTransact = 0L;
        }
    }
}
