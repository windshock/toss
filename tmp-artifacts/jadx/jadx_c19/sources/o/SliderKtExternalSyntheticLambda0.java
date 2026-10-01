package o;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda0 implements RippleKtExternalSyntheticLambda0 {
    private final onWarmupCompleted onExtraCallbackWithResult;
    private Inflater onNavigationEvent;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        return 2;
    }

    public SliderKtExternalSyntheticLambda0(List<byte[]> list) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        this.onExtraCallbackWithResult = onwarmupcompleted;
        onwarmupcompleted.onWarmupCompleted(new String(list.get(0), StandardCharsets.UTF_8));
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        this.IAuthTabCallback.onExtraCallback(bArr, i3 + i2);
        this.IAuthTabCallback.asBinder(i2);
        ImeEditCommand_androidKtExternalSyntheticLambda1 imeEditCommand_androidKtExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
        textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(new RadioButtonDefaults(imeEditCommand_androidKtExternalSyntheticLambda1IAuthTabCallback != null ? ImmutableList.of(imeEditCommand_androidKtExternalSyntheticLambda1IAuthTabCallback) : ImmutableList.of(), -9223372036854775807L, 5000000L));
    }

    private ImeEditCommand_androidKtExternalSyntheticLambda1 IAuthTabCallback() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = new Inflater();
        }
        if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(this.IAuthTabCallback, this.onWarmupCompleted, this.onNavigationEvent)) {
            this.IAuthTabCallback.onExtraCallback(this.onWarmupCompleted.onExtraCallback(), this.onWarmupCompleted.onExtraCallbackWithResult());
        }
        this.onExtraCallbackWithResult.onExtraCallback();
        int iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
        if (iOnNavigationEvent < 2 || this.IAuthTabCallback.onUnminimized() != iOnNavigationEvent) {
            return null;
        }
        this.onExtraCallbackWithResult.onNavigationEvent(this.IAuthTabCallback);
        return this.onExtraCallbackWithResult.onWarmupCompleted(this.IAuthTabCallback);
    }

    static final class onWarmupCompleted {
        private int[] IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private boolean asInterface;
        private boolean onExtraCallbackWithResult;
        private int onTransact;
        private Rect onWarmupCompleted;
        private final int[] IAuthTabCallback = new int[4];
        private int onNavigationEvent = -1;
        private int onExtraCallback = -1;

        private static int IAuthTabCallback(int i2, int i3) {
            return (i2 & 16777215) | ((i3 * 17) << 24);
        }

        public void onWarmupCompleted(String str) {
            for (String str2 : TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(str2.substring(9), ",");
                    this.IAuthTabCallbackDefault = new int[strArrOnNavigationEvent.length];
                    for (int i2 = 0; i2 < strArrOnNavigationEvent.length; i2++) {
                        this.IAuthTabCallbackDefault[i2] = IAuthTabCallback(strArrOnNavigationEvent[i2].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrOnNavigationEvent2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(str2.substring(6).trim(), "x");
                    if (strArrOnNavigationEvent2.length == 2) {
                        try {
                            this.onTransact = Integer.parseInt(strArrOnNavigationEvent2[0]);
                            this.IAuthTabCallbackStub = Integer.parseInt(strArrOnNavigationEvent2[1]);
                            this.asInterface = true;
                        } catch (RuntimeException e) {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("VobsubParser", "Parsing IDX failed", e);
                        }
                    }
                }
            }
        }

        private static int IAuthTabCallback(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        public void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            int[] iArr = this.IAuthTabCallbackDefault;
            if (iArr == null || !this.asInterface) {
                return;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized() - 2);
            onExtraCallbackWithResult(iArr, textFieldDecoratorModifierNodeExternalSyntheticLambda20, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized());
        }

        private void onExtraCallbackWithResult(int[] iArr, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
            while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < i2 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
                switch (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (IAuthTabCallback(iArr, textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                            break;
                        } else {
                            return;
                        }
                    case 5:
                        if (onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        private boolean IAuthTabCallback(int[] iArr, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 2) {
                return false;
            }
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            this.IAuthTabCallback[3] = onExtraCallback(iArr, iOnMinimized >> 4);
            this.IAuthTabCallback[2] = onExtraCallback(iArr, iOnMinimized & 15);
            this.IAuthTabCallback[1] = onExtraCallback(iArr, iOnMinimized2 >> 4);
            this.IAuthTabCallback[0] = onExtraCallback(iArr, iOnMinimized2 & 15);
            this.onExtraCallbackWithResult = true;
            return true;
        }

        private static int onExtraCallback(int[] iArr, int i2) {
            return (i2 < 0 || i2 >= iArr.length) ? iArr[0] : iArr[i2];
        }

        private boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 2 || !this.onExtraCallbackWithResult) {
                return false;
            }
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int[] iArr = this.IAuthTabCallback;
            iArr[3] = IAuthTabCallback(iArr[3], iOnMinimized >> 4);
            int[] iArr2 = this.IAuthTabCallback;
            iArr2[2] = IAuthTabCallback(iArr2[2], iOnMinimized & 15);
            int[] iArr3 = this.IAuthTabCallback;
            iArr3[1] = IAuthTabCallback(iArr3[1], iOnMinimized2 >> 4);
            int[] iArr4 = this.IAuthTabCallback;
            iArr4[0] = IAuthTabCallback(iArr4[0], iOnMinimized2 & 15);
            return true;
        }

        private boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 6) {
                return false;
            }
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnMinimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnMinimized5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            this.onWarmupCompleted = new Rect((iOnMinimized << 4) | (iOnMinimized2 >> 4), (iOnMinimized4 << 4) | (iOnMinimized5 >> 4), (((iOnMinimized2 & 15) << 8) | iOnMinimized3) + 1, (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() | ((iOnMinimized5 & 15) << 8)) + 1);
            return true;
        }

        private boolean IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 4) {
                return false;
            }
            this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            return true;
        }

        public ImeEditCommand_androidKtExternalSyntheticLambda1 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            Rect rect;
            if (this.IAuthTabCallbackDefault == null || !this.asInterface || !this.onExtraCallbackWithResult || (rect = this.onWarmupCompleted) == null || this.onNavigationEvent == -1 || this.onExtraCallback == -1 || rect.width() < 2 || this.onWarmupCompleted.height() < 2) {
                return null;
            }
            Rect rect2 = this.onWarmupCompleted;
            int[] iArr = new int[rect2.width() * rect2.height()];
            TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(this.onNavigationEvent);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21, true, rect2, iArr);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(this.onExtraCallback);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21, false, rect2, iArr);
            return new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).onExtraCallbackWithResult(rect2.left / this.onTransact).onExtraCallback(0).onExtraCallback(rect2.top / this.IAuthTabCallbackStub, 0).onExtraCallbackWithResult(0).IAuthTabCallback(rect2.width() / this.onTransact).onNavigationEvent(rect2.height() / this.IAuthTabCallbackStub).IAuthTabCallback();
        }

        private void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, boolean z, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i2 = !z ? 1 : 0;
            int i3 = i2 * iWidth;
            C0042onWarmupCompleted c0042onWarmupCompleted = new C0042onWarmupCompleted();
            while (true) {
                int i4 = 0;
                do {
                    onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iWidth, c0042onWarmupCompleted);
                    int iMin = Math.min(c0042onWarmupCompleted.onWarmupCompleted, iWidth - i4);
                    if (iMin > 0) {
                        int i5 = i3 + iMin;
                        Arrays.fill(iArr, i3, i5, this.IAuthTabCallback[c0042onWarmupCompleted.IAuthTabCallback]);
                        i4 += iMin;
                        i3 = i5;
                    }
                } while (i4 < iWidth);
                i2 += 2;
                if (i2 >= iHeight) {
                    return;
                }
                i3 = i2 * iWidth;
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
            }
        }

        private static void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2, C0042onWarmupCompleted c0042onWarmupCompleted) {
            int iOnNavigationEvent = 0;
            for (int i3 = 1; iOnNavigationEvent < i3 && i3 <= 64; i3 <<= 2) {
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() < 4) {
                    c0042onWarmupCompleted.IAuthTabCallback = -1;
                    c0042onWarmupCompleted.onWarmupCompleted = 0;
                    return;
                }
                iOnNavigationEvent = (iOnNavigationEvent << 4) | textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
            }
            c0042onWarmupCompleted.IAuthTabCallback = iOnNavigationEvent & 3;
            if (iOnNavigationEvent >= 4) {
                i2 = iOnNavigationEvent >> 2;
            }
            c0042onWarmupCompleted.onWarmupCompleted = i2;
        }

        public void onExtraCallback() {
            this.onExtraCallbackWithResult = false;
            this.onWarmupCompleted = null;
            this.onNavigationEvent = -1;
            this.onExtraCallback = -1;
        }

        /* renamed from: o.SliderKtExternalSyntheticLambda0$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        static final class C0042onWarmupCompleted {
            public int IAuthTabCallback;
            public int onWarmupCompleted;

            private C0042onWarmupCompleted() {
            }
        }
    }
}
