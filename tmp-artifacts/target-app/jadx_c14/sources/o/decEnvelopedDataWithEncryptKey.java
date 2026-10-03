package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import o.toUpperCase;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class decEnvelopedDataWithEncryptKey extends genEncryptedDataWithEncryptKey implements toUpperCase.onNavigationEvent {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallbackStub = null;
    private static final SparseIntArray asBinder = null;
    private final ConstraintLayout IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private final View.OnClickListener access000;
    private final LinearLayout access100;
    private final View.OnClickListener getInterfaceDescriptor;

    public decEnvelopedDataWithEncryptKey(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 6, IAuthTabCallbackStub, asBinder));
    }

    private decEnvelopedDataWithEncryptKey(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1, (TdsButtonV1View) objArr[3], (TdsImageView) objArr[5], (LottieAnimationView) objArr[4], (Typography5) objArr[2]);
        this.IAuthTabCallback_Parcel = -1L;
        this.onExtraCallbackWithResult.setTag(null);
        this.IAuthTabCallback.setTag(null);
        this.IAuthTabCallbackDefault.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.access100 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.IAuthTabCallbackStubProxy = constraintLayout;
        constraintLayout.setTag(null);
        this.asInterface.setTag(null);
        onWarmupCompleted(view);
        this.getInterfaceDescriptor = new toUpperCase(this, 2);
        this.access000 = new toUpperCase(this, 1);
        IAuthTabCallbackStub();
    }

    public void IAuthTabCallbackStub() {
        synchronized (this) {
            this.IAuthTabCallback_Parcel = 2L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.IAuthTabCallback_Parcel != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        IAuthTabCallback((getKeyB) obj);
        return true;
    }

    public void IAuthTabCallback(@Nullable getKeyB getkeyb) {
        onWarmupCompleted(0, getkeyb);
        this.onTransact = getkeyb;
        synchronized (this) {
            this.IAuthTabCallback_Parcel |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onExtraCallbackWithResult((getKeyB) obj, i2);
    }

    private boolean onExtraCallbackWithResult(getKeyB getkeyb, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.IAuthTabCallback_Parcel |= 1;
        }
        return true;
    }

    public void onNavigationEvent() {
        long j;
        int i;
        String str;
        String strAsInterface;
        String str2;
        boolean zOnTransact;
        String strOnExtraCallback;
        synchronized (this) {
            j = this.IAuthTabCallback_Parcel;
            this.IAuthTabCallback_Parcel = 0L;
        }
        getKeyB getkeyb = this.onTransact;
        long j2 = j & 3;
        String str3 = null;
        if (j2 != 0) {
            if (getkeyb != null) {
                String strIAuthTabCallback = getkeyb.IAuthTabCallback();
                strAsInterface = getkeyb.asInterface();
                String strOnNavigationEvent = getkeyb.onNavigationEvent();
                strOnExtraCallback = getkeyb.onExtraCallback();
                zOnTransact = getkeyb.onTransact();
                str2 = strIAuthTabCallback;
                str3 = strOnNavigationEvent;
            } else {
                zOnTransact = false;
                strAsInterface = null;
                str2 = null;
                strOnExtraCallback = null;
            }
            if (j2 != 0) {
                j |= zOnTransact ? 40L : 20L;
            }
            int i2 = zOnTransact ? 4 : 0;
            i = zOnTransact ? 0 : 4;
            str = str3;
            str3 = strOnExtraCallback;
            i = i2;
        } else {
            i = 0;
            str = null;
            strAsInterface = null;
            str2 = null;
        }
        if ((2 & j) != 0) {
            this.onExtraCallbackWithResult.setOnClickListener(this.getInterfaceDescriptor);
            this.IAuthTabCallbackStubProxy.setOnClickListener(this.access000);
        }
        if ((j & 3) != 0) {
            ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(this.onExtraCallbackWithResult, str3);
            this.IAuthTabCallback.setVisibility(i);
            UST_PKCS12_MakePFX.IAuthTabCallback(this.IAuthTabCallback, str2);
            this.IAuthTabCallbackDefault.setVisibility(i);
            UST_PKCS12_MakePFX.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, str);
            ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(this.asInterface, strAsInterface);
        }
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        getKeyB getkeyb;
        if (i != 1) {
            if (i == 2 && (getkeyb = this.onTransact) != null) {
                getkeyb.IAuthTabCallbackStub();
                return;
            }
            return;
        }
        getKeyB getkeyb2 = this.onTransact;
        if (getkeyb2 != null) {
            getkeyb2.IAuthTabCallbackStub();
        }
    }
}
