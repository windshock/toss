package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import o.toUpperCase;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setAsymmetricKey extends asymmDecrypt implements toUpperCase.onNavigationEvent {
    private static final ViewDataBinding.onWarmupCompleted onExtraCallbackWithResult = null;
    private static final SparseIntArray onTransact = null;
    private final LinearLayout IAuthTabCallbackDefault;
    private final View.OnClickListener IAuthTabCallbackStub;
    private final TdsButtonV1View access000;
    private final TdsButtonV1View access100;
    private long asBinder;
    private final View.OnClickListener asInterface;

    public setAsymmetricKey(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 3, onExtraCallbackWithResult, onTransact));
    }

    private setAsymmetricKey(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1);
        this.asBinder = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.IAuthTabCallbackDefault = linearLayout;
        linearLayout.setTag(null);
        TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) objArr[1];
        this.access000 = tdsButtonV1View;
        tdsButtonV1View.setTag(null);
        TdsButtonV1View tdsButtonV1View2 = (TdsButtonV1View) objArr[2];
        this.access100 = tdsButtonV1View2;
        tdsButtonV1View2.setTag(null);
        onWarmupCompleted(view);
        this.IAuthTabCallbackStub = new toUpperCase(this, 1);
        this.asInterface = new toUpperCase(this, 2);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.asBinder = 2L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.asBinder != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        onExtraCallbackWithResult((API_GetLastError) obj);
        return true;
    }

    public void onExtraCallbackWithResult(@Nullable API_GetLastError aPI_GetLastError) {
        onWarmupCompleted(0, aPI_GetLastError);
        this.IAuthTabCallback = aPI_GetLastError;
        synchronized (this) {
            this.asBinder |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return IAuthTabCallback((API_GetLastError) obj, i2);
    }

    private boolean IAuthTabCallback(API_GetLastError aPI_GetLastError, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.asBinder |= 1;
        }
        return true;
    }

    public void onNavigationEvent() {
        long j;
        synchronized (this) {
            j = this.asBinder;
            this.asBinder = 0L;
        }
        if ((j & 2) != 0) {
            this.access000.setOnClickListener(this.IAuthTabCallbackStub);
            this.access100.setOnClickListener(this.asInterface);
        }
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        API_GetLastError aPI_GetLastError;
        if (i != 1) {
            if (i == 2 && (aPI_GetLastError = this.IAuthTabCallback) != null) {
                aPI_GetLastError.onNavigationEvent();
                return;
            }
            return;
        }
        API_GetLastError aPI_GetLastError2 = this.IAuthTabCallback;
        if (aPI_GetLastError2 != null) {
            aPI_GetLastError2.IAuthTabCallback();
        }
    }
}
