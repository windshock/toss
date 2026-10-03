package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import o.toUpperCase;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class genEncryptedData extends makeTbsKurProtectionWithVIDR implements toUpperCase.onNavigationEvent {
    private static final SparseIntArray IAuthTabCallbackStubProxy;
    private static final ViewDataBinding.onWarmupCompleted getInterfaceDescriptor = null;
    private final View.OnClickListener IAuthTabCallback_Parcel;
    private final FrameLayout ICustomTabsCallback;
    private final View.OnClickListener access000;
    private long extraCallbackWithResult;
    private final RelativeLayout readTypedObject;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        IAuthTabCallbackStubProxy = sparseIntArray;
        sparseIntArray.put(R.id.lastSyncTimeIcon, 5);
        sparseIntArray.put(R.id.taskStatusTextLayout, 6);
        sparseIntArray.put(R.id.taskStatusText, 7);
        sparseIntArray.put(R.id.taskStatusIcon, 8);
    }

    public genEncryptedData(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 9, getInterfaceDescriptor, IAuthTabCallbackStubProxy));
    }

    private genEncryptedData(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1, (Typography5) objArr[1], (TdsImageView) objArr[5], (ConstraintLayout) objArr[3], (Typography7) objArr[4], (TdsImageView) objArr[8], (Typography7) objArr[7], (ConstraintLayout) objArr[6]);
        this.extraCallbackWithResult = -1L;
        this.onExtraCallbackWithResult.setTag(null);
        this.IAuthTabCallbackStub.setTag(null);
        this.onTransact.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.readTypedObject = relativeLayout;
        relativeLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[2];
        this.ICustomTabsCallback = frameLayout;
        frameLayout.setTag(null);
        onWarmupCompleted(view);
        this.IAuthTabCallback_Parcel = new toUpperCase(this, 1);
        this.access000 = new toUpperCase(this, 2);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.extraCallbackWithResult = 16L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.extraCallbackWithResult != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        onWarmupCompleted((getIv6) obj);
        return true;
    }

    public void onWarmupCompleted(@Nullable getIv6 getiv6) {
        onWarmupCompleted(0, getiv6);
        this.asInterface = getiv6;
        synchronized (this) {
            this.extraCallbackWithResult |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return IAuthTabCallback((getIv6) obj, i2);
    }

    private boolean IAuthTabCallback(getIv6 getiv6, int i) {
        if (i == isGetVIDRV3.onNavigationEvent) {
            synchronized (this) {
                this.extraCallbackWithResult |= 1;
            }
            return true;
        }
        if (i == isGetVIDRV3.IAuthTabCallbackDefault) {
            synchronized (this) {
                this.extraCallbackWithResult |= 2;
            }
            return true;
        }
        if (i == isGetVIDRV3.asInterface) {
            synchronized (this) {
                this.extraCallbackWithResult |= 4;
            }
            return true;
        }
        if (i != isGetVIDRV3.asBinder) {
            return false;
        }
        synchronized (this) {
            this.extraCallbackWithResult |= 8;
        }
        return true;
    }

    public void onNavigationEvent() {
        long j;
        String str;
        String strIAuthTabCallback;
        setSignatureKey setsignaturekey;
        synchronized (this) {
            j = this.extraCallbackWithResult;
            this.extraCallbackWithResult = 0L;
        }
        getIv6 getiv6 = this.asInterface;
        boolean zOnTransact = false;
        String strOnNavigationEvent = null;
        if ((31 & j) != 0) {
            if ((j & 17) != 0 && getiv6 != null) {
                zOnTransact = getiv6.onTransact();
            }
            strIAuthTabCallback = ((j & 19) == 0 || getiv6 == null) ? null : getiv6.IAuthTabCallback();
            setSignatureKey setsignaturekeyOnExtraCallback = ((j & 21) == 0 || getiv6 == null) ? null : getiv6.onExtraCallback();
            if ((j & 25) != 0 && getiv6 != null) {
                strOnNavigationEvent = getiv6.onNavigationEvent();
            }
            str = strOnNavigationEvent;
            setsignaturekey = setsignaturekeyOnExtraCallback;
        } else {
            str = null;
            strIAuthTabCallback = null;
            setsignaturekey = null;
        }
        if ((j & 16) != 0) {
            this.onExtraCallbackWithResult.setOnClickListener(this.IAuthTabCallback_Parcel);
            this.IAuthTabCallbackStub.setOnClickListener(this.access000);
        }
        if ((j & 19) != 0) {
            ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(this.onExtraCallbackWithResult, strIAuthTabCallback);
        }
        if ((j & 25) != 0) {
            ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(this.onTransact, str);
        }
        if ((21 & j) != 0) {
            UST_PKCS12_MakePFX.onExtraCallback(this.ICustomTabsCallback, setsignaturekey);
        }
        if ((j & 17) != 0) {
            enableLayoutAnimationsOnAndroid.onWarmupCompleted(this.ICustomTabsCallback, zOnTransact);
        }
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        getIv6 getiv6;
        if (i != 1) {
            if (i == 2 && (getiv6 = this.asInterface) != null) {
                getiv6.asBinder();
                return;
            }
            return;
        }
        getIv6 getiv62 = this.asInterface;
        if (getiv62 != null) {
            getiv62.asInterface();
        }
    }
}
