package o;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ScaffoldKtExternalSyntheticLambda3 implements RippleKtExternalSyntheticLambda0 {
    private Inflater onExtraCallbackWithResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onNavigationEvent = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final onExtraCallback onExtraCallback = new onExtraCallback();

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        return 2;
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        this.onWarmupCompleted.onExtraCallback(bArr, i3 + i2);
        this.onWarmupCompleted.asBinder(i2);
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = new Inflater();
        }
        if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(this.onWarmupCompleted, this.onNavigationEvent, this.onExtraCallbackWithResult)) {
            this.onWarmupCompleted.onExtraCallback(this.onNavigationEvent.onExtraCallback(), this.onNavigationEvent.onExtraCallbackWithResult());
        }
        this.onExtraCallback.onExtraCallback();
        ArrayList arrayList = new ArrayList();
        while (this.onWarmupCompleted.onNavigationEvent() >= 3) {
            ImeEditCommand_androidKtExternalSyntheticLambda1 imeEditCommand_androidKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallback);
            if (imeEditCommand_androidKtExternalSyntheticLambda1OnWarmupCompleted != null) {
                arrayList.add(imeEditCommand_androidKtExternalSyntheticLambda1OnWarmupCompleted);
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(new RadioButtonDefaults(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    private static ImeEditCommand_androidKtExternalSyntheticLambda1 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, onExtraCallback onextracallback) {
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + iOnUnminimized;
        ImeEditCommand_androidKtExternalSyntheticLambda1 imeEditCommand_androidKtExternalSyntheticLambda1OnExtraCallbackWithResult = null;
        if (iOnWarmupCompleted > iOnExtraCallbackWithResult) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult);
            return null;
        }
        if (iOnMinimized == 128) {
            imeEditCommand_androidKtExternalSyntheticLambda1OnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
            onextracallback.onExtraCallback();
        } else {
            switch (iOnMinimized) {
                case 20:
                    onextracallback.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnUnminimized);
                    break;
                case 21:
                    onextracallback.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnUnminimized);
                    break;
                case 22:
                    onextracallback.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnUnminimized);
                    break;
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        return imeEditCommand_androidKtExternalSyntheticLambda1OnExtraCallbackWithResult;
    }

    static final class onExtraCallback {
        private int IAuthTabCallback;
        private int IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private boolean asInterface;
        private int onExtraCallback;
        private int onExtraCallbackWithResult;
        private int onNavigationEvent;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        private final int[] onTransact = new int[256];

        /* JADX INFO: Access modifiers changed from: private */
        public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
            if (i2 % 5 != 2) {
                return;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
            Arrays.fill(this.onTransact, 0);
            int i3 = i2 / 5;
            for (int i4 = 0; i4 < i3; i4++) {
                int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                int iOnMinimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                double d = iOnMinimized2;
                double d2 = iOnMinimized3 - 128;
                double d3 = iOnMinimized4 - 128;
                int[] iArr = this.onTransact;
                iArr[iOnMinimized] = (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, OggPageHeader.MAX_SEGMENT_COUNT) << 8) | (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() << 24) | (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((int) ((1.402d * d2) + d), 0, OggPageHeader.MAX_SEGMENT_COUNT) << 16) | TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((int) (d + (d3 * 1.772d)), 0, OggPageHeader.MAX_SEGMENT_COUNT);
            }
            this.asInterface = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
            int iOnMessageChannelReady;
            if (i2 >= 4) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(3);
                int i3 = i2 - 4;
                if ((textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 128) != 0) {
                    if (i3 < 7 || (iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady()) < 4) {
                        return;
                    }
                    this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                    this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                    this.onWarmupCompleted.onExtraCallback(iOnMessageChannelReady - 4);
                    i3 = i2 - 11;
                }
                int iOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
                int iOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
                if (iOnWarmupCompleted >= iOnExtraCallbackWithResult || i3 <= 0) {
                    return;
                }
                int iMin = Math.min(i3, iOnExtraCallbackWithResult - iOnWarmupCompleted);
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onWarmupCompleted.onExtraCallback(), iOnWarmupCompleted, iMin);
                this.onWarmupCompleted.asBinder(iOnWarmupCompleted + iMin);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
            if (i2 < 19) {
                return;
            }
            this.IAuthTabCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            this.IAuthTabCallbackStub = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(11);
            this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        }

        public ImeEditCommand_androidKtExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int iOnMinimized;
            if (this.IAuthTabCallbackDefault == 0 || this.IAuthTabCallbackStub == 0 || this.onExtraCallbackWithResult == 0 || this.onNavigationEvent == 0 || this.onWarmupCompleted.onExtraCallbackWithResult() == 0 || this.onWarmupCompleted.onWarmupCompleted() != this.onWarmupCompleted.onExtraCallbackWithResult() || !this.asInterface) {
                return null;
            }
            this.onWarmupCompleted.asBinder(0);
            int i2 = this.onExtraCallbackWithResult * this.onNavigationEvent;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int iOnMinimized2 = this.onWarmupCompleted.onMinimized();
                if (iOnMinimized2 != 0) {
                    iOnMinimized = i3 + 1;
                    iArr[i3] = this.onTransact[iOnMinimized2];
                } else {
                    int iOnMinimized3 = this.onWarmupCompleted.onMinimized();
                    if (iOnMinimized3 != 0) {
                        iOnMinimized = ((iOnMinimized3 & 64) == 0 ? iOnMinimized3 & 63 : ((iOnMinimized3 & 63) << 8) | this.onWarmupCompleted.onMinimized()) + i3;
                        Arrays.fill(iArr, i3, iOnMinimized, (iOnMinimized3 & 128) == 0 ? this.onTransact[0] : this.onTransact[this.onWarmupCompleted.onMinimized()]);
                    }
                }
                i3 = iOnMinimized;
            }
            return new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(Bitmap.createBitmap(iArr, this.onExtraCallbackWithResult, this.onNavigationEvent, Bitmap.Config.ARGB_8888)).onExtraCallbackWithResult(this.onExtraCallback / this.IAuthTabCallbackDefault).onExtraCallback(0).onExtraCallback(this.IAuthTabCallback / this.IAuthTabCallbackStub, 0).onExtraCallbackWithResult(0).IAuthTabCallback(this.onExtraCallbackWithResult / this.IAuthTabCallbackDefault).onNavigationEvent(this.onNavigationEvent / this.IAuthTabCallbackStub).IAuthTabCallback();
        }

        public void onExtraCallback() {
            this.IAuthTabCallbackDefault = 0;
            this.IAuthTabCallbackStub = 0;
            this.onExtraCallback = 0;
            this.IAuthTabCallback = 0;
            this.onExtraCallbackWithResult = 0;
            this.onNavigationEvent = 0;
            this.onWarmupCompleted.onExtraCallback(0);
            this.asInterface = false;
        }
    }
}
