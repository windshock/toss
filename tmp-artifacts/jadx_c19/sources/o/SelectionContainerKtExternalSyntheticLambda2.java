package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda2 {
    public static final SelectionContainerKtExternalSyntheticLambda2 IAuthTabCallback;
    public static final SelectionContainerKtExternalSyntheticLambda2 onExtraCallback;
    public static final SelectionContainerKtExternalSyntheticLambda2 onExtraCallbackWithResult;
    public static final SelectionContainerKtExternalSyntheticLambda2 onNavigationEvent;
    public static final SelectionContainerKtExternalSyntheticLambda2 onWarmupCompleted;
    public final long IAuthTabCallbackDefault;
    public final long asInterface;

    static {
        SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2 = new SelectionContainerKtExternalSyntheticLambda2(0L, 0L);
        onExtraCallback = selectionContainerKtExternalSyntheticLambda2;
        onWarmupCompleted = new SelectionContainerKtExternalSyntheticLambda2(Long.MAX_VALUE, Long.MAX_VALUE);
        onExtraCallbackWithResult = new SelectionContainerKtExternalSyntheticLambda2(Long.MAX_VALUE, 0L);
        IAuthTabCallback = new SelectionContainerKtExternalSyntheticLambda2(0L, Long.MAX_VALUE);
        onNavigationEvent = selectionContainerKtExternalSyntheticLambda2;
    }

    public SelectionContainerKtExternalSyntheticLambda2(long j, long j2) {
        RecordingInputConnection_androidKt.onNavigationEvent(j >= 0);
        RecordingInputConnection_androidKt.onNavigationEvent(j2 >= 0);
        this.IAuthTabCallbackDefault = j;
        this.asInterface = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long onExtraCallbackWithResult(long j, long j2, long j3) {
        long j4 = this.IAuthTabCallbackDefault;
        if (j4 == 0 && this.asInterface == 0) {
            return j;
        }
        long jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(j, j4, Long.MIN_VALUE);
        long jOnExtraCallbackWithResult = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(j, this.asInterface, Long.MAX_VALUE);
        boolean z = jOnNavigationEvent <= j2 && j2 <= jOnExtraCallbackWithResult;
        boolean z2 = jOnNavigationEvent <= j3 && j3 <= jOnExtraCallbackWithResult;
        if (!z || !z2) {
            if (!z) {
                return z2 ? j3 : jOnNavigationEvent;
            }
            return j2;
        }
        if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectionContainerKtExternalSyntheticLambda2.class != obj.getClass()) {
            return false;
        }
        SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2 = (SelectionContainerKtExternalSyntheticLambda2) obj;
        return this.IAuthTabCallbackDefault == selectionContainerKtExternalSyntheticLambda2.IAuthTabCallbackDefault && this.asInterface == selectionContainerKtExternalSyntheticLambda2.asInterface;
    }

    public int hashCode() {
        return (((int) this.IAuthTabCallbackDefault) * 31) + ((int) this.asInterface);
    }
}
