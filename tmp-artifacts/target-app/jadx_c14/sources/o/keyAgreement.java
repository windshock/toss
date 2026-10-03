package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import o.androidustk;
import o.toUpperCase;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class keyAgreement extends generateKeyPair implements toUpperCase.onNavigationEvent {
    private static final SparseIntArray IAuthTabCallbackStubProxy;
    private static final ViewDataBinding.onWarmupCompleted onTransact = null;
    private final View.OnClickListener IAuthTabCallback_Parcel;
    private final View.OnClickListener access000;
    private long access100;
    private final ConstraintLayout getInterfaceDescriptor;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        IAuthTabCallbackStubProxy = sparseIntArray;
        sparseIntArray.put(R.id.iv_icon, 5);
    }

    public keyAgreement(@Nullable ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, @NonNull View view) {
        this(contextMenuAreaKtExternalSyntheticLambda1, view, ViewDataBinding.IAuthTabCallback(contextMenuAreaKtExternalSyntheticLambda1, view, 6, onTransact, IAuthTabCallbackStubProxy));
    }

    private keyAgreement(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, Object[] objArr) {
        super(contextMenuAreaKtExternalSyntheticLambda1, view, 2, (TdsButtonV1View) objArr[1], (Typography6) objArr[3], (TdsRoundLayout) objArr[2], (TdsImageView) objArr[5], (TdsTextButtonV0View) objArr[4]);
        this.access100 = -1L;
        this.IAuthTabCallback.setTag(null);
        this.onExtraCallbackWithResult.setTag(null);
        this.asInterface.setTag(null);
        this.asBinder.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.getInterfaceDescriptor = constraintLayout;
        constraintLayout.setTag(null);
        onWarmupCompleted(view);
        this.IAuthTabCallback_Parcel = new toUpperCase(this, 1);
        this.access000 = new toUpperCase(this, 2);
        asBinder();
    }

    public void asBinder() {
        synchronized (this) {
            this.access100 = 4L;
        }
        asInterface();
    }

    public boolean onWarmupCompleted() {
        synchronized (this) {
            return this.access100 != 0;
        }
    }

    public boolean onExtraCallback(int i, @Nullable Object obj) {
        if (isGetVIDRV3.IAuthTabCallbackStub != i) {
            return false;
        }
        onWarmupCompleted((androidustk) obj);
        return true;
    }

    public void onWarmupCompleted(@Nullable androidustk androidustkVar) {
        onWarmupCompleted(1, androidustkVar);
        this.IAuthTabCallbackStub = androidustkVar;
        synchronized (this) {
            this.access100 |= 2;
        }
        onExtraCallback(isGetVIDRV3.IAuthTabCallbackStub);
        super.asInterface();
    }

    public boolean IAuthTabCallback(int i, Object obj, int i2) {
        if (i == 0) {
            return onExtraCallbackWithResult((LiveData) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return IAuthTabCallback((androidustk) obj, i2);
    }

    private boolean onExtraCallbackWithResult(LiveData<androidustk.onExtraCallback> liveData, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.access100 |= 1;
        }
        return true;
    }

    private boolean IAuthTabCallback(androidustk androidustkVar, int i) {
        if (i != isGetVIDRV3.onNavigationEvent) {
            return false;
        }
        synchronized (this) {
            this.access100 |= 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNavigationEvent() {
        /*
            r11 = this;
            monitor-enter(r11)
            long r0 = r11.access100     // Catch: java.lang.Throwable -> L78
            r2 = 0
            r11.access100 = r2     // Catch: java.lang.Throwable -> L78
            monitor-exit(r11)
            o.androidustk r4 = r11.IAuthTabCallbackStub
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L44
            if (r4 == 0) goto L1a
            androidx.lifecycle.LiveData r4 = r4.onNavigationEvent()
            goto L1b
        L1a:
            r4 = r7
        L1b:
            r11.onExtraCallbackWithResult(r6, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.getValue()
            o.androidustk$onExtraCallback r4 = (o.androidustk.onExtraCallback) r4
            goto L28
        L27:
            r4 = r7
        L28:
            if (r4 == 0) goto L44
            java.lang.String r7 = r4.onExtraCallback()
            java.lang.String r6 = r4.onNavigationEvent()
            java.lang.String r8 = r4.onWarmupCompleted()
            boolean r9 = r4.IAuthTabCallbackStub()
            boolean r4 = r4.asInterface()
            r10 = r6
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r10
            goto L47
        L44:
            r9 = r6
            r4 = r7
            r8 = r4
        L47:
            if (r5 == 0) goto L62
            im.toss.tds.view.component.atom.button.TdsButtonV1View r5 = r11.IAuthTabCallback
            o.ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(r5, r7)
            im.toss.tds.view.component.atom.text.Typography6 r5 = r11.onExtraCallbackWithResult
            o.ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(r5, r4)
            im.toss.tds.view.component.widget.TdsRoundLayout r4 = r11.asInterface
            o.enableLayoutAnimationsOnAndroid.onWarmupCompleted(r4, r6)
            im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View r4 = r11.asBinder
            o.ContextMenuUiKtExternalSyntheticLambda1.onExtraCallback(r4, r8)
            im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View r4 = r11.asBinder
            o.enableLayoutAnimationsOnAndroid.onWarmupCompleted(r4, r9)
        L62:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L77
            im.toss.tds.view.component.atom.button.TdsButtonV1View r0 = r11.IAuthTabCallback
            android.view.View$OnClickListener r1 = r11.IAuthTabCallback_Parcel
            r0.setOnClickListener(r1)
            im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View r0 = r11.asBinder
            android.view.View$OnClickListener r1 = r11.access000
            r0.setOnClickListener(r1)
        L77:
            return
        L78:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.keyAgreement.onNavigationEvent():void");
    }

    @Override // o.toUpperCase.onNavigationEvent
    public final void onExtraCallback(int i, View view) {
        LiveData<androidustk.onExtraCallback> liveDataOnNavigationEvent;
        androidustk.onExtraCallback onextracallback;
        androidustk androidustkVar;
        LiveData<androidustk.onExtraCallback> liveDataOnNavigationEvent2;
        androidustk.onExtraCallback onextracallback2;
        if (i != 1) {
            if (i != 2 || (androidustkVar = this.IAuthTabCallbackStub) == null || (liveDataOnNavigationEvent2 = androidustkVar.onNavigationEvent()) == null || (onextracallback2 = (androidustk.onExtraCallback) liveDataOnNavigationEvent2.getValue()) == null) {
                return;
            }
            androidustkVar.onExtraCallback(onextracallback2.IAuthTabCallback());
            return;
        }
        androidustk androidustkVar2 = this.IAuthTabCallbackStub;
        if (androidustkVar2 == null || (liveDataOnNavigationEvent = androidustkVar2.onNavigationEvent()) == null || (onextracallback = (androidustk.onExtraCallback) liveDataOnNavigationEvent.getValue()) == null) {
            return;
        }
        androidustkVar2.onWarmupCompleted(onextracallback.onExtraCallbackWithResult());
    }
}
