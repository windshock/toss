package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import kotlin.Pair;
import o.toUpperCase;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class asymmDecryptWithCert extends destroyKey implements toUpperCase.onNavigationEvent {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallbackStubProxy = null;
    private static final SparseIntArray writeTypedObject;
    private final View.OnClickListener ICustomTabsCallback;
    private final View.OnClickListener extraCallback;
    private final View.OnClickListener extraCallbackWithResult;
    private final TdsRoundLayout onActivityLayout;
    private final View.OnClickListener onActivityResized;
    private long onMinimized;
    private final LinearLayout onPostMessage;
    private final View.OnClickListener readTypedObject;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        writeTypedObject = sparseIntArray;
        sparseIntArray.put(R.id.balance_container, 9);
        sparseIntArray.put(R.id.space_charge, 10);
        sparseIntArray.put(R.id.barrier_1, 11);
    }

    public asymmDecryptWithCert(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 12, IAuthTabCallbackStubProxy, writeTypedObject));
    }

    private asymmDecryptWithCert(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1, (SubTypography11) objArr[1], (TdsRollingNumberV1View) objArr[2], (ConstraintLayout) objArr[9], (Barrier) objArr[11], (LinearLayout) objArr[7], (TdsButtonV1View) objArr[8], (Space) objArr[10], (TdsButtonV1View) objArr[5], (TdsButtonV1View) objArr[6], (TdsImageView) objArr[4]);
        this.onMinimized = -1L;
        this.IAuthTabCallback.setTag(null);
        this.onExtraCallbackWithResult.setTag(null);
        this.onTransact.setTag(null);
        this.IAuthTabCallbackStub.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.onPostMessage = linearLayout;
        linearLayout.setTag(null);
        TdsRoundLayout tdsRoundLayout = (TdsRoundLayout) objArr[3];
        this.onActivityLayout = tdsRoundLayout;
        tdsRoundLayout.setTag(null);
        this.access000.setTag(null);
        this.getInterfaceDescriptor.setTag(null);
        this.IAuthTabCallback_Parcel.setTag(null);
        onWarmupCompleted(view);
        this.extraCallback = new toUpperCase(this, 4);
        this.readTypedObject = new toUpperCase(this, 2);
        this.ICustomTabsCallback = new toUpperCase(this, 3);
        this.extraCallbackWithResult = new toUpperCase(this, 1);
        this.onActivityResized = new toUpperCase(this, 5);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.onMinimized = 256L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.onMinimized != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        onWarmupCompleted((CERT_DecryptPrikey) obj);
        return true;
    }

    public void onWarmupCompleted(@Nullable CERT_DecryptPrikey cERT_DecryptPrikey) {
        onWarmupCompleted(0, cERT_DecryptPrikey);
        this.asBinder = cERT_DecryptPrikey;
        synchronized (this) {
            this.onMinimized |= 1;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return IAuthTabCallback((CERT_DecryptPrikey) obj, i2);
    }

    private boolean IAuthTabCallback(CERT_DecryptPrikey cERT_DecryptPrikey, int i) {
        if (i == isGetVIDRV3.onNavigationEvent) {
            synchronized (this) {
                this.onMinimized |= 1;
            }
            return true;
        }
        if (i == isGetVIDRV3.onExtraCallback) {
            synchronized (this) {
                this.onMinimized |= 2;
            }
            return true;
        }
        if (i == isGetVIDRV3.onWarmupCompleted) {
            synchronized (this) {
                this.onMinimized |= 4;
            }
            return true;
        }
        if (i == isGetVIDRV3.access100) {
            synchronized (this) {
                this.onMinimized |= 8;
            }
            return true;
        }
        if (i == isGetVIDRV3.onTransact) {
            synchronized (this) {
                this.onMinimized |= 16;
            }
            return true;
        }
        if (i == isGetVIDRV3.onExtraCallbackWithResult) {
            synchronized (this) {
                this.onMinimized |= 32;
            }
            return true;
        }
        if (i == isGetVIDRV3.IAuthTabCallback) {
            synchronized (this) {
                this.onMinimized |= 64;
            }
            return true;
        }
        if (i != isGetVIDRV3.getInterfaceDescriptor) {
            return false;
        }
        synchronized (this) {
            this.onMinimized |= 128;
        }
        return true;
    }

    public void onNavigationEvent() {
        long j;
        Pair<Long, Boolean> pair;
        CharSequence charSequenceIAuthTabCallback;
        TdsButtonV1View.asInterface asinterface;
        String str;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean zAccess000;
        boolean zIAuthTabCallbackStub;
        synchronized (this) {
            j = this.onMinimized;
            this.onMinimized = 0L;
        }
        CERT_DecryptPrikey cERT_DecryptPrikey = this.asBinder;
        Pair<Long, Boolean> pairOnExtraCallback = null;
        boolean zAccess100 = false;
        if ((511 & j) != 0) {
            charSequenceIAuthTabCallback = ((j & 259) == 0 || cERT_DecryptPrikey == null) ? null : cERT_DecryptPrikey.IAuthTabCallback();
            boolean zAsBinder = ((j & 265) == 0 || cERT_DecryptPrikey == null) ? false : cERT_DecryptPrikey.asBinder();
            String strIAuthTabCallbackDefault = ((j & 273) == 0 || cERT_DecryptPrikey == null) ? null : cERT_DecryptPrikey.IAuthTabCallbackDefault();
            TdsButtonV1View.asInterface asinterfaceOnNavigationEvent = ((j & 321) == 0 || cERT_DecryptPrikey == null) ? null : cERT_DecryptPrikey.onNavigationEvent();
            if ((j & 261) != 0 && cERT_DecryptPrikey != null) {
                pairOnExtraCallback = cERT_DecryptPrikey.onExtraCallback();
            }
            boolean interfaceDescriptor = ((j & 385) == 0 || cERT_DecryptPrikey == null) ? false : cERT_DecryptPrikey.getInterfaceDescriptor();
            long j2 = j & 257;
            if (j2 != 0) {
                if (cERT_DecryptPrikey != null) {
                    zAccess000 = cERT_DecryptPrikey.access000();
                    zIAuthTabCallbackStub = cERT_DecryptPrikey.IAuthTabCallbackStub();
                } else {
                    zAccess000 = false;
                    zIAuthTabCallbackStub = false;
                }
                if (j2 != 0) {
                    j |= zIAuthTabCallbackStub ? 1024L : 512L;
                }
                i2 = zIAuthTabCallbackStub ? 0 : 8;
            } else {
                i2 = 0;
                zAccess000 = false;
            }
            if ((j & 289) != 0 && cERT_DecryptPrikey != null) {
                zAccess100 = cERT_DecryptPrikey.access100();
            }
            pair = pairOnExtraCallback;
            z2 = zAccess100;
            z4 = zAsBinder;
            str = strIAuthTabCallbackDefault;
            asinterface = asinterfaceOnNavigationEvent;
            z3 = interfaceDescriptor;
            i = i2;
            z = zAccess000;
        } else {
            pair = null;
            charSequenceIAuthTabCallback = null;
            asinterface = null;
            str = null;
            i = 0;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if ((j & 259) != 0) {
            ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(this.IAuthTabCallback, charSequenceIAuthTabCallback);
        }
        if ((j & 261) != 0) {
            enableLayoutAnimationsOnAndroid.onNavigationEvent(this.onExtraCallbackWithResult, pair);
        }
        if ((256 & j) != 0) {
            this.onTransact.setOnClickListener(this.extraCallback);
            this.IAuthTabCallbackStub.setOnClickListener(this.onActivityResized);
            this.onActivityLayout.setOnClickListener(this.extraCallbackWithResult);
            this.access000.setOnClickListener(this.readTypedObject);
            this.getInterfaceDescriptor.setOnClickListener(this.ICustomTabsCallback);
        }
        if ((j & 257) != 0) {
            this.onTransact.setVisibility(i);
            enableLayoutAnimationsOnAndroid.onWarmupCompleted(this.access000, z);
            enableLayoutAnimationsOnAndroid.onWarmupCompleted(this.getInterfaceDescriptor, z);
        }
        if ((289 & j) != 0) {
            this.IAuthTabCallbackStub.setEnabled(z2);
        }
        if ((321 & j) != 0) {
            this.IAuthTabCallbackStub.setTheme(asinterface);
        }
        if ((385 & j) != 0) {
            enableLayoutAnimationsOnAndroid.onWarmupCompleted(this.IAuthTabCallbackStub, z3);
        }
        if ((j & 265) != 0) {
            enableLayoutAnimationsOnAndroid.onWarmupCompleted(this.onActivityLayout, z4);
        }
        if ((j & 273) != 0) {
            enableLayoutAnimationsOnAndroid.onNavigationEvent(this.IAuthTabCallback_Parcel, str);
        }
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        CERT_DecryptPrikey cERT_DecryptPrikey;
        if (i == 1) {
            CERT_DecryptPrikey cERT_DecryptPrikey2 = this.asBinder;
            if (cERT_DecryptPrikey2 != null) {
                cERT_DecryptPrikey2.ICustomTabsCallback();
                return;
            }
            return;
        }
        if (i == 2) {
            CERT_DecryptPrikey cERT_DecryptPrikey3 = this.asBinder;
            if (cERT_DecryptPrikey3 != null) {
                cERT_DecryptPrikey3.extraCallback();
                return;
            }
            return;
        }
        if (i == 3) {
            CERT_DecryptPrikey cERT_DecryptPrikey4 = this.asBinder;
            if (cERT_DecryptPrikey4 != null) {
                cERT_DecryptPrikey4.readTypedObject();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 5 && (cERT_DecryptPrikey = this.asBinder) != null) {
                cERT_DecryptPrikey.readTypedObject();
                return;
            }
            return;
        }
        CERT_DecryptPrikey cERT_DecryptPrikey5 = this.asBinder;
        if (cERT_DecryptPrikey5 != null) {
            cERT_DecryptPrikey5.extraCallbackWithResult();
        }
    }
}
