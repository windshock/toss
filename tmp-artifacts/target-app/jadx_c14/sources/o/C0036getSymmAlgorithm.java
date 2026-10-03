package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import o.toUpperCase;

/* renamed from: o.getSymmAlgorithm, reason: case insensitive filesystem */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class C0036getSymmAlgorithm extends getPubEncryptKeyWithEnvelopedData implements toUpperCase.onNavigationEvent {
    private static final SparseIntArray IAuthTabCallbackDefault = null;
    private static final ViewDataBinding.onWarmupCompleted onExtraCallbackWithResult = null;
    private final TdsListRowV1View IAuthTabCallbackStub;
    private final LinearLayout asBinder;
    private long asInterface;
    private final View.OnClickListener onTransact;

    public C0036getSymmAlgorithm(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 2, onExtraCallbackWithResult, IAuthTabCallbackDefault));
    }

    private C0036getSymmAlgorithm(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1);
        this.asInterface = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.asBinder = linearLayout;
        linearLayout.setTag(null);
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[1];
        this.IAuthTabCallbackStub = tdsListRowV1View;
        tdsListRowV1View.setTag(null);
        onWarmupCompleted(view);
        this.onTransact = new toUpperCase(this, 1);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.asInterface = 2L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.asInterface != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        onExtraCallbackWithResult((CERT_GetAuthorityKeyIdentifierInfo) obj);
        return true;
    }

    public void onExtraCallbackWithResult(@Nullable CERT_GetAuthorityKeyIdentifierInfo cERT_GetAuthorityKeyIdentifierInfo) {
        onWarmupCompleted(0, cERT_GetAuthorityKeyIdentifierInfo);
        this.IAuthTabCallback = cERT_GetAuthorityKeyIdentifierInfo;
        synchronized (this) {
            this.asInterface |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return IAuthTabCallback((CERT_GetAuthorityKeyIdentifierInfo) obj, i2);
    }

    private boolean IAuthTabCallback(CERT_GetAuthorityKeyIdentifierInfo cERT_GetAuthorityKeyIdentifierInfo, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.asInterface |= 1;
        }
        return true;
    }

    public void onNavigationEvent() {
        long j;
        synchronized (this) {
            j = this.asInterface;
            this.asInterface = 0L;
        }
        CERT_GetAuthorityKeyIdentifierInfo cERT_GetAuthorityKeyIdentifierInfo = this.IAuthTabCallback;
        long j2 = 3 & j;
        String strOnNavigationEvent = (j2 == 0 || cERT_GetAuthorityKeyIdentifierInfo == null) ? null : cERT_GetAuthorityKeyIdentifierInfo.onNavigationEvent();
        if ((j & 2) != 0) {
            this.IAuthTabCallbackStub.setOnClickListener(this.onTransact);
        }
        if (j2 != 0) {
            this.IAuthTabCallbackStub.setCenterText1(strOnNavigationEvent);
        }
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        CERT_GetAuthorityKeyIdentifierInfo cERT_GetAuthorityKeyIdentifierInfo = this.IAuthTabCallback;
        if (cERT_GetAuthorityKeyIdentifierInfo != null) {
            cERT_GetAuthorityKeyIdentifierInfo.IAuthTabCallback();
        }
    }
}
