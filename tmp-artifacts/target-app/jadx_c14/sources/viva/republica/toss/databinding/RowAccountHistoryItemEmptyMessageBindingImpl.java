package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.atom.text.Typography6;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.ContextMenuUiKtExternalSyntheticLambda1;
import o.ZLog;
import o.isGetVIDRV3;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowAccountHistoryItemEmptyMessageBindingImpl extends RowAccountHistoryItemEmptyMessageBinding {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallbackStub = null;
    private static final SparseIntArray asBinder = null;
    private final RelativeLayout asInterface;
    private long onTransact;

    public RowAccountHistoryItemEmptyMessageBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 2, IAuthTabCallbackStub, asBinder));
    }

    private RowAccountHistoryItemEmptyMessageBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1, (Typography6) objArr[1]);
        this.onTransact = -1L;
        this.onExtraCallbackWithResult.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.asInterface = relativeLayout;
        relativeLayout.setTag(null);
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
        IAuthTabCallback((ZLog) obj);
        return true;
    }

    public void IAuthTabCallback(@Nullable ZLog zLog) {
        onWarmupCompleted(0, zLog);
        this.IAuthTabCallback = zLog;
        synchronized (this) {
            this.onTransact |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return IAuthTabCallback((ZLog) obj, i2);
    }

    private boolean IAuthTabCallback(ZLog zLog, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.onTransact |= 1;
        }
        return true;
    }

    public void onNavigationEvent() {
        long j;
        synchronized (this) {
            j = this.onTransact;
            this.onTransact = 0L;
        }
        ZLog zLog = this.IAuthTabCallback;
        long j2 = j & 3;
        String strOnNavigationEvent = (j2 == 0 || zLog == null) ? null : zLog.onNavigationEvent();
        if (j2 != 0) {
            ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(this.onExtraCallbackWithResult, strOnNavigationEvent);
        }
    }
}
