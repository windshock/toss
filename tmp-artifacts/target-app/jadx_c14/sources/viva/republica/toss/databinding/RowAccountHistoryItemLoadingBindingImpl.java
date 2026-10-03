package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.atom.text.SubTypography11;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.ContextMenuUiKtExternalSyntheticLambda1;
import o.isGetVIDRV3;
import o.runSystemCommand;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowAccountHistoryItemLoadingBindingImpl extends RowAccountHistoryItemLoadingBinding {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallbackDefault = null;
    private static final SparseIntArray asBinder;
    private long IAuthTabCallbackStub;
    private final SubTypography11 asInterface;
    private final RelativeLayout onTransact;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        asBinder = sparseIntArray;
        sparseIntArray.put(R.id.progress_bar, 2);
    }

    public RowAccountHistoryItemLoadingBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 3, IAuthTabCallbackDefault, asBinder));
    }

    private RowAccountHistoryItemLoadingBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1, (ProgressBar) objArr[2]);
        this.IAuthTabCallbackStub = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.onTransact = relativeLayout;
        relativeLayout.setTag(null);
        SubTypography11 subTypography11 = (SubTypography11) objArr[1];
        this.asInterface = subTypography11;
        subTypography11.setTag(null);
        onWarmupCompleted(view);
        IAuthTabCallbackDefault();
    }

    public void IAuthTabCallbackDefault() {
        synchronized (this) {
            this.IAuthTabCallbackStub = 2L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.IAuthTabCallbackStub != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        onNavigationEvent((runSystemCommand) obj);
        return true;
    }

    public void onNavigationEvent(@Nullable runSystemCommand runsystemcommand) {
        onWarmupCompleted(0, runsystemcommand);
        this.onExtraCallbackWithResult = runsystemcommand;
        synchronized (this) {
            this.IAuthTabCallbackStub |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onExtraCallbackWithResult((runSystemCommand) obj, i2);
    }

    private boolean onExtraCallbackWithResult(runSystemCommand runsystemcommand, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.IAuthTabCallbackStub |= 1;
        }
        return true;
    }

    public void onNavigationEvent() {
        long j;
        boolean zOnNavigationEvent;
        synchronized (this) {
            j = this.IAuthTabCallbackStub;
            this.IAuthTabCallbackStub = 0L;
        }
        runSystemCommand runsystemcommand = this.onExtraCallbackWithResult;
        long j2 = j & 3;
        String strOnExtraCallback = null;
        int i = 0;
        if (j2 != 0) {
            if (runsystemcommand != null) {
                strOnExtraCallback = runsystemcommand.onExtraCallback();
                zOnNavigationEvent = runsystemcommand.onNavigationEvent();
            } else {
                zOnNavigationEvent = false;
            }
            if (j2 != 0) {
                j |= zOnNavigationEvent ? 8L : 4L;
            }
            if (!zOnNavigationEvent) {
                i = 4;
            }
        }
        if ((j & 3) != 0) {
            ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(this.asInterface, strOnExtraCallback);
            this.asInterface.setVisibility(i);
        }
    }
}
