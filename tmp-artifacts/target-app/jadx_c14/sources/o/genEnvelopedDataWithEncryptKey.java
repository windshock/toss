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
public final class genEnvelopedDataWithEncryptKey extends SignedAndEnvelopedData implements toUpperCase.onNavigationEvent {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallback = null;
    private static final SparseIntArray onTransact = null;
    private final LinearLayout IAuthTabCallbackDefault;
    private final TdsListRowV1View IAuthTabCallbackStub;
    private long asBinder;
    private final View.OnClickListener asInterface;

    public genEnvelopedDataWithEncryptKey(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 2, IAuthTabCallback, onTransact));
    }

    private genEnvelopedDataWithEncryptKey(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1);
        this.asBinder = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.IAuthTabCallbackDefault = linearLayout;
        linearLayout.setTag(null);
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[1];
        this.IAuthTabCallbackStub = tdsListRowV1View;
        tdsListRowV1View.setTag(null);
        onWarmupCompleted(view);
        this.asInterface = new toUpperCase(this, 1);
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
        onExtraCallback((packageName) obj);
        return true;
    }

    public void onExtraCallback(@Nullable packageName packagename) {
        onWarmupCompleted(0, packagename);
        this.onExtraCallbackWithResult = packagename;
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
        return onExtraCallbackWithResult((packageName) obj, i2);
    }

    private boolean onExtraCallbackWithResult(packageName packagename, int i) {
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
        String strIAuthTabCallback;
        String strOnNavigationEvent;
        synchronized (this) {
            j = this.asBinder;
            this.asBinder = 0L;
        }
        packageName packagename = this.onExtraCallbackWithResult;
        long j2 = 3 & j;
        if (j2 == 0 || packagename == null) {
            strIAuthTabCallback = null;
            strOnNavigationEvent = null;
        } else {
            strIAuthTabCallback = packagename.IAuthTabCallback();
            strOnNavigationEvent = packagename.onNavigationEvent();
        }
        if ((j & 2) != 0) {
            this.IAuthTabCallbackStub.setOnClickListener(this.asInterface);
        }
        if (j2 != 0) {
            this.IAuthTabCallbackStub.setCenterText1(strOnNavigationEvent);
            UST_PKCS12_MakePFX.IAuthTabCallback(this.IAuthTabCallbackStub, strIAuthTabCallback);
        }
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        packageName packagename = this.onExtraCallbackWithResult;
        if (packagename != null) {
            packagename.onExtraCallback();
        }
    }
}
