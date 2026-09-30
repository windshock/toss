package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextStringSimpleNodeExternalSyntheticLambda0 {
    public final int IAuthTabCallback;
    public final int onExtraCallback;
    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;
    public final String onNavigationEvent;
    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted;

    public TextStringSimpleNodeExternalSyntheticLambda0(String str, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42, int i2, int i3) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 == 0 || i3 == 0);
        this.onNavigationEvent = RecordingInputConnection_androidKt.onWarmupCompleted(str);
        this.onExtraCallbackWithResult = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        this.onWarmupCompleted = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda42);
        this.IAuthTabCallback = i2;
        this.onExtraCallback = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextStringSimpleNodeExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0 = (TextStringSimpleNodeExternalSyntheticLambda0) obj;
        return this.IAuthTabCallback == textStringSimpleNodeExternalSyntheticLambda0.IAuthTabCallback && this.onExtraCallback == textStringSimpleNodeExternalSyntheticLambda0.onExtraCallback && this.onNavigationEvent.equals(textStringSimpleNodeExternalSyntheticLambda0.onNavigationEvent) && this.onExtraCallbackWithResult.equals(textStringSimpleNodeExternalSyntheticLambda0.onExtraCallbackWithResult) && this.onWarmupCompleted.equals(textStringSimpleNodeExternalSyntheticLambda0.onWarmupCompleted);
    }

    public int hashCode() {
        int i2 = this.IAuthTabCallback;
        int i3 = this.onExtraCallback;
        return ((((((((i2 + 527) * 31) + i3) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
    }
}
