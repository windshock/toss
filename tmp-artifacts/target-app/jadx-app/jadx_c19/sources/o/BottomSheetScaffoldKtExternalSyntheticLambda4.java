package o;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BottomSheetScaffoldKtExternalSyntheticLambda4 extends BottomSheetScaffoldKtExternalSyntheticLambda8 {
    private byte[] onExtraCallback;
    private volatile boolean onNavigationEvent;

    protected abstract void onExtraCallbackWithResult(byte[] bArr, int i2) throws IOException;

    public BottomSheetScaffoldKtExternalSyntheticLambda4(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i3, @Nullable Object obj, @Nullable byte[] bArr) {
        BottomSheetScaffoldKtExternalSyntheticLambda4 bottomSheetScaffoldKtExternalSyntheticLambda4;
        byte[] bArr2;
        super(textFieldSelectionStateExternalSyntheticLambda0, textFieldSelectionStateExternalSyntheticLambda12, i2, basicTextContextMenuProviderKtExternalSyntheticLambda4, i3, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
            bottomSheetScaffoldKtExternalSyntheticLambda4 = this;
        } else {
            bottomSheetScaffoldKtExternalSyntheticLambda4 = this;
            bArr2 = bArr;
        }
        bottomSheetScaffoldKtExternalSyntheticLambda4.onExtraCallback = bArr2;
    }

    public byte[] onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onNavigationEvent
    public final void IAuthTabCallback() {
        this.onNavigationEvent = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onNavigationEvent
    public final void IAuthTabCallbackDefault() throws IOException {
        try {
            this.onTransact.onNavigationEvent(this.asBinder);
            int iOnWarmupCompleted = 0;
            int i2 = 0;
            while (iOnWarmupCompleted != -1 && !this.onNavigationEvent) {
                onExtraCallbackWithResult(i2);
                iOnWarmupCompleted = this.onTransact.onWarmupCompleted(this.onExtraCallback, i2, 16384);
                if (iOnWarmupCompleted != -1) {
                    i2 += iOnWarmupCompleted;
                }
            }
            if (!this.onNavigationEvent) {
                onExtraCallbackWithResult(this.onExtraCallback, i2);
            }
        } finally {
            TextFieldSelectionStateExternalSyntheticLambda5.IAuthTabCallback(this.onTransact);
        }
    }

    private void onExtraCallbackWithResult(int i2) {
        byte[] bArr = this.onExtraCallback;
        if (bArr.length < i2 + 16384) {
            this.onExtraCallback = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
