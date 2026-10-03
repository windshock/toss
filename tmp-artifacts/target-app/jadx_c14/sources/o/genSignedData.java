package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import o.toUpperCase;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class genSignedData extends getSymmIV implements toUpperCase.onNavigationEvent {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallback = null;
    private static final SparseIntArray IAuthTabCallbackStub = null;
    private final LinearLayout IAuthTabCallbackDefault;
    private final View.OnClickListener asBinder;
    private final TdsListRowV1View asInterface;
    private long onTransact;

    public genSignedData(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 2, IAuthTabCallback, IAuthTabCallbackStub));
    }

    private genSignedData(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1);
        this.onTransact = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.IAuthTabCallbackDefault = linearLayout;
        linearLayout.setTag(null);
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[1];
        this.asInterface = tdsListRowV1View;
        tdsListRowV1View.setTag(null);
        onWarmupCompleted(view);
        this.asBinder = new toUpperCase(this, 1);
        IAuthTabCallbackStub();
    }

    public void IAuthTabCallbackStub() {
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
        onNavigationEvent((CERT_GetAuthorityInformationAccess) obj);
        return true;
    }

    public void onNavigationEvent(@Nullable CERT_GetAuthorityInformationAccess cERT_GetAuthorityInformationAccess) {
        onWarmupCompleted(0, cERT_GetAuthorityInformationAccess);
        this.onExtraCallbackWithResult = cERT_GetAuthorityInformationAccess;
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
        return onNavigationEvent((CERT_GetAuthorityInformationAccess) obj, i2);
    }

    private boolean onNavigationEvent(CERT_GetAuthorityInformationAccess cERT_GetAuthorityInformationAccess, int i) {
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
        CERT_GetAuthorityInformationAccess cERT_GetAuthorityInformationAccess = this.onExtraCallbackWithResult;
        long j2 = 3 & j;
        String strIAuthTabCallback = (j2 == 0 || cERT_GetAuthorityInformationAccess == null) ? null : cERT_GetAuthorityInformationAccess.IAuthTabCallback();
        if ((j & 2) != 0) {
            this.asInterface.setOnClickListener(this.asBinder);
        }
        if (j2 != 0) {
            this.asInterface.setCenterText1(strIAuthTabCallback);
        }
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        CERT_GetAuthorityInformationAccess cERT_GetAuthorityInformationAccess = this.onExtraCallbackWithResult;
        if (cERT_GetAuthorityInformationAccess != null) {
            cERT_GetAuthorityInformationAccess.onExtraCallback();
        }
    }
}
