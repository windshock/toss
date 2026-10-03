package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.uikit.widget.list.TdsListHeaderV1T02View;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.isGetVIDRV3;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowAccountHistoryItemStickyYearBindingImpl extends RowAccountHistoryItemStickyYearBinding {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallbackStub = null;
    private static final SparseIntArray asInterface = null;
    private final TdsListHeaderV1T02View IAuthTabCallbackDefault;
    private final View IAuthTabCallbackStubProxy;
    private final LinearLayout asBinder;
    private long onTransact;

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        return false;
    }

    public RowAccountHistoryItemStickyYearBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 3, IAuthTabCallbackStub, asInterface));
    }

    private RowAccountHistoryItemStickyYearBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 0);
        this.onTransact = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.asBinder = linearLayout;
        linearLayout.setTag(null);
        TdsListHeaderV1T02View tdsListHeaderV1T02View = (TdsListHeaderV1T02View) objArr[1];
        this.IAuthTabCallbackDefault = tdsListHeaderV1T02View;
        tdsListHeaderV1T02View.setTag(null);
        View view2 = (View) objArr[2];
        this.IAuthTabCallbackStubProxy = view2;
        view2.setTag(null);
        onWarmupCompleted(view);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.onTransact = 4L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.onTransact != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallback_Parcel == i) {
            onWarmupCompleted(((Boolean) obj).booleanValue());
            return true;
        }
        if (isGetVIDRV3.access000 != i) {
            return false;
        }
        onExtraCallbackWithResult((String) obj);
        return true;
    }

    @Override // viva.republica.toss.databinding.RowAccountHistoryItemStickyYearBinding
    public void onWarmupCompleted(boolean z) {
        this.IAuthTabCallback = z;
        synchronized (this) {
            this.onTransact |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallback_Parcel);
        super.asInterface();
    }

    @Override // viva.republica.toss.databinding.RowAccountHistoryItemStickyYearBinding
    public void onExtraCallbackWithResult(@Nullable String str) {
        this.onExtraCallbackWithResult = str;
        synchronized (this) {
            this.onTransact |= 2;
        }
        onExtraCallback(isGetVIDRV3.access000);
        super.asInterface();
    }

    public void onNavigationEvent() {
        long j;
        synchronized (this) {
            j = this.onTransact;
            this.onTransact = 0L;
        }
        boolean z = this.IAuthTabCallback;
        String str = this.onExtraCallbackWithResult;
        long j2 = j & 5;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            if (!z) {
                i = 8;
            }
        }
        if ((6 & j) != 0) {
            this.IAuthTabCallbackDefault.setTitle(str);
        }
        if ((j & 5) != 0) {
            this.IAuthTabCallbackDefault.setVisibility(i);
            this.IAuthTabCallbackStubProxy.setVisibility(i);
        }
    }
}
