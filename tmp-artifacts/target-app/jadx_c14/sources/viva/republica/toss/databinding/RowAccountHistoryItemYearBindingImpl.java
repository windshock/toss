package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.uikit.widget.list.TdsListHeaderV1T02View;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.UST_GET_LIBLICENSEINFO;
import o.isGetVIDRV3;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowAccountHistoryItemYearBindingImpl extends RowAccountHistoryItemYearBinding {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallback = null;
    private static final SparseIntArray onTransact = null;
    private final LinearLayout IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private final TdsListHeaderV1T02View asBinder;

    public RowAccountHistoryItemYearBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 2, IAuthTabCallback, onTransact));
    }

    private RowAccountHistoryItemYearBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1);
        this.IAuthTabCallbackStub = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.IAuthTabCallbackDefault = linearLayout;
        linearLayout.setTag(null);
        TdsListHeaderV1T02View tdsListHeaderV1T02View = (TdsListHeaderV1T02View) objArr[1];
        this.asBinder = tdsListHeaderV1T02View;
        tdsListHeaderV1T02View.setTag(null);
        onWarmupCompleted(view);
        onTransact();
    }

    public void onTransact() {
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
        IAuthTabCallback((UST_GET_LIBLICENSEINFO) obj);
        return true;
    }

    public void IAuthTabCallback(@Nullable UST_GET_LIBLICENSEINFO ust_get_liblicenseinfo) {
        onWarmupCompleted(0, ust_get_liblicenseinfo);
        this.onExtraCallbackWithResult = ust_get_liblicenseinfo;
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
        return onExtraCallback((UST_GET_LIBLICENSEINFO) obj, i2);
    }

    private boolean onExtraCallback(UST_GET_LIBLICENSEINFO ust_get_liblicenseinfo, int i) {
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
        synchronized (this) {
            j = this.IAuthTabCallbackStub;
            this.IAuthTabCallbackStub = 0L;
        }
        UST_GET_LIBLICENSEINFO ust_get_liblicenseinfo = this.onExtraCallbackWithResult;
        long j2 = j & 3;
        String strOnExtraCallback = (j2 == 0 || ust_get_liblicenseinfo == null) ? null : ust_get_liblicenseinfo.onExtraCallback();
        if (j2 != 0) {
            this.asBinder.setTitle(strOnExtraCallback);
        }
    }
}
