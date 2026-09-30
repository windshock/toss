package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressIndicatorKtExternalSyntheticLambda19 {
    private int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final ProgressIndicatorKtExternalSyntheticLambda2 onNavigationEvent = new ProgressIndicatorKtExternalSyntheticLambda2();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int IAuthTabCallback = -1;

    ProgressIndicatorKtExternalSyntheticLambda19() {
    }

    public void onExtraCallbackWithResult() {
        this.onNavigationEvent.onExtraCallbackWithResult();
        this.onWarmupCompleted.onExtraCallback(0);
        this.IAuthTabCallback = -1;
        this.onExtraCallbackWithResult = false;
    }

    public boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        int i2;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9 != null);
        if (this.onExtraCallbackWithResult) {
            this.onExtraCallbackWithResult = false;
            this.onWarmupCompleted.onExtraCallback(0);
        }
        while (!this.onExtraCallbackWithResult) {
            if (this.IAuthTabCallback < 0) {
                if (!this.onNavigationEvent.IAuthTabCallback(drawerKtExternalSyntheticLambda9) || !this.onNavigationEvent.onExtraCallback(drawerKtExternalSyntheticLambda9, true)) {
                    return false;
                }
                ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda2 = this.onNavigationEvent;
                int iIAuthTabCallback = progressIndicatorKtExternalSyntheticLambda2.onNavigationEvent;
                if ((progressIndicatorKtExternalSyntheticLambda2.onTransact & 1) == 1 && this.onWarmupCompleted.onExtraCallbackWithResult() == 0) {
                    iIAuthTabCallback += IAuthTabCallback(0);
                    i2 = this.onExtraCallback;
                } else {
                    i2 = 0;
                }
                if (!DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.IAuthTabCallback(drawerKtExternalSyntheticLambda9, iIAuthTabCallback)) {
                    return false;
                }
                this.IAuthTabCallback = i2;
            }
            int iIAuthTabCallback2 = IAuthTabCallback(this.IAuthTabCallback);
            int i3 = this.IAuthTabCallback + this.onExtraCallback;
            if (iIAuthTabCallback2 > 0) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.onWarmupCompleted;
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() + iIAuthTabCallback2);
                if (!DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onWarmupCompleted(drawerKtExternalSyntheticLambda9, this.onWarmupCompleted.onExtraCallback(), this.onWarmupCompleted.onExtraCallbackWithResult(), iIAuthTabCallback2)) {
                    return false;
                }
                TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = this.onWarmupCompleted;
                textFieldDecoratorModifierNodeExternalSyntheticLambda202.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda202.onExtraCallbackWithResult() + iIAuthTabCallback2);
                this.onExtraCallbackWithResult = this.onNavigationEvent.onExtraCallback[i3 + (-1)] != 255;
            }
            if (i3 == this.onNavigationEvent.asBinder) {
                i3 = -1;
            }
            this.IAuthTabCallback = i3;
        }
        return true;
    }

    public ProgressIndicatorKtExternalSyntheticLambda2 IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public void onNavigationEvent() {
        if (this.onWarmupCompleted.onExtraCallback().length == 65025) {
            return;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.onWarmupCompleted;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(Arrays.copyOf(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.onWarmupCompleted.onExtraCallbackWithResult())), this.onWarmupCompleted.onExtraCallbackWithResult());
    }

    private int IAuthTabCallback(int i2) {
        int i3;
        int i4 = 0;
        this.onExtraCallback = 0;
        do {
            int i5 = this.onExtraCallback;
            ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda2 = this.onNavigationEvent;
            int i6 = i2 + i5;
            if (i6 >= progressIndicatorKtExternalSyntheticLambda2.asBinder) {
                break;
            }
            int[] iArr = progressIndicatorKtExternalSyntheticLambda2.onExtraCallback;
            this.onExtraCallback = i5 + 1;
            i3 = iArr[i6];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }
}
