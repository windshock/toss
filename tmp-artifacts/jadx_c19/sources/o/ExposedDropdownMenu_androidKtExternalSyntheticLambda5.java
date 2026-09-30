package o;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ExposedDropdownMenu_androidKtExternalSyntheticLambda5 {
    int IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, int i2, boolean z, int i3) throws IOException;

    void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3);

    void onExtraCallback(long j, int i2, int i3, int i4, @Nullable IAuthTabCallback iAuthTabCallback);

    void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

    public static final class IAuthTabCallback {
        public final int IAuthTabCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final byte[] onWarmupCompleted;

        public IAuthTabCallback(int i2, byte[] bArr, int i3, int i4) {
            this.IAuthTabCallback = i2;
            this.onWarmupCompleted = bArr;
            this.onExtraCallbackWithResult = i3;
            this.onNavigationEvent = i4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || IAuthTabCallback.class != obj.getClass()) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return this.IAuthTabCallback == iAuthTabCallback.IAuthTabCallback && this.onExtraCallbackWithResult == iAuthTabCallback.onExtraCallbackWithResult && this.onNavigationEvent == iAuthTabCallback.onNavigationEvent && Arrays.equals(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted);
        }

        public int hashCode() {
            int i2 = this.IAuthTabCallback;
            return (((((i2 * 31) + Arrays.hashCode(this.onWarmupCompleted)) * 31) + this.onExtraCallbackWithResult) * 31) + this.onNavigationEvent;
        }
    }

    default int onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, int i2, boolean z) throws IOException {
        return IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda0, i2, z, 0);
    }

    default void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i2, 0);
    }
}
