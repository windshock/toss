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
public final class asymmEncryptWithCert extends asymmEncrypt implements toUpperCase.onNavigationEvent {
    private static final ViewDataBinding.onWarmupCompleted onExtraCallbackWithResult = null;
    private static final SparseIntArray onTransact = null;
    private long IAuthTabCallbackDefault;
    private final View.OnClickListener IAuthTabCallbackStub;
    private final TdsButtonV1View access000;
    private final TdsButtonV1View access100;
    private final LinearLayout asBinder;
    private final View.OnClickListener asInterface;

    public asymmEncryptWithCert(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 3, onExtraCallbackWithResult, onTransact));
    }

    private asymmEncryptWithCert(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1);
        this.IAuthTabCallbackDefault = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.asBinder = linearLayout;
        linearLayout.setTag(null);
        TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) objArr[1];
        this.access000 = tdsButtonV1View;
        tdsButtonV1View.setTag(null);
        TdsButtonV1View tdsButtonV1View2 = (TdsButtonV1View) objArr[2];
        this.access100 = tdsButtonV1View2;
        tdsButtonV1View2.setTag(null);
        onWarmupCompleted(view);
        this.IAuthTabCallbackStub = new toUpperCase(this, 2);
        this.asInterface = new toUpperCase(this, 1);
        IAuthTabCallbackDefault();
    }

    public void IAuthTabCallbackDefault() {
        synchronized (this) {
            this.IAuthTabCallbackDefault = 2L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.IAuthTabCallbackDefault != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        onWarmupCompleted((getKeyF) obj);
        return true;
    }

    public void onWarmupCompleted(@Nullable getKeyF getkeyf) {
        onWarmupCompleted(0, getkeyf);
        this.IAuthTabCallback = getkeyf;
        synchronized (this) {
            this.IAuthTabCallbackDefault |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onExtraCallbackWithResult((getKeyF) obj, i2);
    }

    private boolean onExtraCallbackWithResult(getKeyF getkeyf, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.IAuthTabCallbackDefault |= 1;
        }
        return true;
    }

    public void onNavigationEvent() {
        long j;
        synchronized (this) {
            j = this.IAuthTabCallbackDefault;
            this.IAuthTabCallbackDefault = 0L;
        }
        if ((j & 2) != 0) {
            this.access000.setOnClickListener(this.asInterface);
            this.access100.setOnClickListener(this.IAuthTabCallbackStub);
        }
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        getKeyF getkeyf;
        if (i != 1) {
            if (i == 2 && (getkeyf = this.IAuthTabCallback) != null) {
                getkeyf.IAuthTabCallback();
                return;
            }
            return;
        }
        getKeyF getkeyf2 = this.IAuthTabCallback;
        if (getkeyf2 != null) {
            getkeyf2.onNavigationEvent();
        }
    }
}
