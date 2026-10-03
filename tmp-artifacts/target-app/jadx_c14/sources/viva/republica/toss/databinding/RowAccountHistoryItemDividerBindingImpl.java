package viva.republica.toss.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.UST_PKCS12_MakePFX;
import o.enableLayoutAnimationsOnAndroid;
import o.isGetVIDRV3;
import o.line;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class RowAccountHistoryItemDividerBindingImpl extends RowAccountHistoryItemDividerBinding {
    private static final ViewDataBinding.onWarmupCompleted IAuthTabCallback = null;
    private static final SparseIntArray IAuthTabCallbackStub = null;
    private long IAuthTabCallbackDefault;
    private final RelativeLayout asBinder;
    private final View asInterface;
    private final View onTransact;

    public RowAccountHistoryItemDividerBindingImpl(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 3, IAuthTabCallback, IAuthTabCallbackStub));
    }

    private RowAccountHistoryItemDividerBindingImpl(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 1);
        this.IAuthTabCallbackDefault = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.asBinder = relativeLayout;
        relativeLayout.setTag(null);
        View view2 = (View) objArr[1];
        this.asInterface = view2;
        view2.setTag(null);
        View view3 = (View) objArr[2];
        this.onTransact = view3;
        view3.setTag(null);
        onWarmupCompleted(view);
        IAuthTabCallbackStub();
    }

    public void IAuthTabCallbackStub() {
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
        onExtraCallbackWithResult((line) obj);
        return true;
    }

    public void onExtraCallbackWithResult(@Nullable line lineVar) {
        onWarmupCompleted(0, lineVar);
        this.onExtraCallbackWithResult = lineVar;
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
        return IAuthTabCallback((line) obj, i2);
    }

    private boolean IAuthTabCallback(line lineVar, int i) {
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
        int i;
        boolean zIAuthTabCallback;
        int iOnNavigationEvent;
        int iOnExtraCallback;
        synchronized (this) {
            j = this.IAuthTabCallbackDefault;
            this.IAuthTabCallbackDefault = 0L;
        }
        line lineVar = this.onExtraCallbackWithResult;
        long j2 = j & 3;
        if (j2 != 0) {
            if (lineVar != null) {
                zIAuthTabCallback = lineVar.IAuthTabCallback();
                iOnNavigationEvent = lineVar.onNavigationEvent();
                iOnExtraCallback = lineVar.onExtraCallback();
            } else {
                iOnExtraCallback = 0;
                zIAuthTabCallback = false;
                iOnNavigationEvent = 0;
            }
            if (j2 != 0) {
                j |= zIAuthTabCallback ? 8L : 4L;
            }
            i = iOnExtraCallback;
            i = zIAuthTabCallback ? 8 : 0;
        } else {
            i = 0;
            zIAuthTabCallback = false;
            iOnNavigationEvent = 0;
        }
        if ((j & 3) != 0) {
            UST_PKCS12_MakePFX.onWarmupCompleted(this.asBinder, i);
            UST_PKCS12_MakePFX.onNavigationEvent(this.asInterface, iOnNavigationEvent);
            enableLayoutAnimationsOnAndroid.onWarmupCompleted(this.asInterface, zIAuthTabCallback);
            UST_PKCS12_MakePFX.onNavigationEvent(this.onTransact, iOnNavigationEvent);
            this.onTransact.setVisibility(i);
        }
    }
}
