package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda12 {
    public final int IAuthTabCallback;
    public final long IAuthTabCallbackDefault;
    public final long IAuthTabCallbackStub;
    public final int IAuthTabCallback_Parcel;
    public final int asBinder;
    public final long asInterface;
    private final ProgressIndicatorKtExternalSyntheticLambda11[] getInterfaceDescriptor;
    public final long[] onExtraCallback;
    public final long[] onExtraCallbackWithResult;
    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent;
    public final int onTransact;
    public final long onWarmupCompleted;

    public ProgressIndicatorKtExternalSyntheticLambda12(int i2, int i3, long j, long j2, long j3, long j4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i4, @Nullable ProgressIndicatorKtExternalSyntheticLambda11[] progressIndicatorKtExternalSyntheticLambda11Arr, int i5, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.IAuthTabCallback = i2;
        this.IAuthTabCallback_Parcel = i3;
        this.IAuthTabCallbackStub = j;
        this.IAuthTabCallbackDefault = j2;
        this.onWarmupCompleted = j3;
        this.asInterface = j4;
        this.onNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        this.asBinder = i4;
        this.getInterfaceDescriptor = progressIndicatorKtExternalSyntheticLambda11Arr;
        this.onTransact = i5;
        this.onExtraCallback = jArr;
        this.onExtraCallbackWithResult = jArr2;
    }

    public ProgressIndicatorKtExternalSyntheticLambda11 IAuthTabCallback(int i2) {
        ProgressIndicatorKtExternalSyntheticLambda11[] progressIndicatorKtExternalSyntheticLambda11Arr = this.getInterfaceDescriptor;
        if (progressIndicatorKtExternalSyntheticLambda11Arr == null) {
            return null;
        }
        return progressIndicatorKtExternalSyntheticLambda11Arr[i2];
    }

    public ProgressIndicatorKtExternalSyntheticLambda12 onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return new ProgressIndicatorKtExternalSyntheticLambda12(this.IAuthTabCallback, this.IAuthTabCallback_Parcel, this.IAuthTabCallbackStub, this.IAuthTabCallbackDefault, this.onWarmupCompleted, this.asInterface, basicTextContextMenuProviderKtExternalSyntheticLambda4, this.asBinder, this.getInterfaceDescriptor, this.onTransact, this.onExtraCallback, this.onExtraCallbackWithResult);
    }
}
