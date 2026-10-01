package o;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda0 implements RippleKtExternalSyntheticLambda0 {
    private final int IAuthTabCallback;
    private final float IAuthTabCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 asInterface = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        return 2;
    }

    public SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda0(List<byte[]> list) {
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.onNavigationEvent = bArr[24];
            this.IAuthTabCallback = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.onExtraCallbackWithResult = "Serif".equals(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i2 = bArr[25] * 20;
            this.onWarmupCompleted = i2;
            boolean z = (bArr[0] & 32) != 0;
            this.onExtraCallback = z;
            if (z) {
                this.IAuthTabCallbackStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i2, 0.0f, 0.95f);
                return;
            } else {
                this.IAuthTabCallbackStub = 0.85f;
                return;
            }
        }
        this.onNavigationEvent = 0;
        this.IAuthTabCallback = -1;
        this.onExtraCallbackWithResult = "sans-serif";
        this.onExtraCallback = false;
        this.IAuthTabCallbackStub = 0.85f;
        this.onWarmupCompleted = -1;
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        this.asInterface.onExtraCallback(bArr, i3 + i2);
        this.asInterface.asBinder(i2);
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(this.asInterface);
        if (strOnExtraCallbackWithResult.isEmpty()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(new RadioButtonDefaults(ImmutableList.of(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOnExtraCallbackWithResult);
        IAuthTabCallback(spannableStringBuilder, this.onNavigationEvent, 0, 0, spannableStringBuilder.length(), 16711680);
        onExtraCallbackWithResult(spannableStringBuilder, this.IAuthTabCallback, -1, 0, spannableStringBuilder.length(), 16711680);
        onWarmupCompleted(spannableStringBuilder, this.onExtraCallbackWithResult, 0, spannableStringBuilder.length());
        float fOnWarmupCompleted = this.IAuthTabCallbackStub;
        while (this.asInterface.onNavigationEvent() >= 8) {
            int iOnWarmupCompleted = this.asInterface.onWarmupCompleted();
            int iAsBinder = this.asInterface.asBinder();
            int iAsBinder2 = this.asInterface.asBinder();
            if (iAsBinder2 == 1937013100) {
                RecordingInputConnection_androidKt.onNavigationEvent(this.asInterface.onNavigationEvent() >= 2);
                int iOnUnminimized = this.asInterface.onUnminimized();
                for (int i4 = 0; i4 < iOnUnminimized; i4++) {
                    onNavigationEvent(this.asInterface, spannableStringBuilder);
                }
            } else if (iAsBinder2 == 1952608120 && this.onExtraCallback) {
                RecordingInputConnection_androidKt.onNavigationEvent(this.asInterface.onNavigationEvent() >= 2);
                fOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.asInterface.onUnminimized() / this.onWarmupCompleted, 0.0f, 0.95f);
            }
            this.asInterface.asBinder(iOnWarmupCompleted + iAsBinder);
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(new RadioButtonDefaults(ImmutableList.of(new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(spannableStringBuilder).onExtraCallback(fOnWarmupCompleted, 0).onExtraCallbackWithResult(0).IAuthTabCallback()), -9223372036854775807L, -9223372036854775807L));
    }

    private static String onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        RecordingInputConnection_androidKt.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 2);
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        if (iOnUnminimized == 0) {
            return "";
        }
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        Charset charsetExtraCommand = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCommand();
        int iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        if (charsetExtraCommand == null) {
            charsetExtraCommand = StandardCharsets.UTF_8;
        }
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(iOnUnminimized - (iOnWarmupCompleted2 - iOnWarmupCompleted), charsetExtraCommand);
    }

    private void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, SpannableStringBuilder spannableStringBuilder) {
        RecordingInputConnection_androidKt.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 12);
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnUnminimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (iOnUnminimized2 > spannableStringBuilder.length()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Tx3gParser", "Truncating styl end (" + iOnUnminimized2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iOnUnminimized2 = spannableStringBuilder.length();
        }
        if (iOnUnminimized >= iOnUnminimized2) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Tx3gParser", "Ignoring styl with start (" + iOnUnminimized + ") >= end (" + iOnUnminimized2 + ").");
            return;
        }
        int i2 = iOnUnminimized2;
        IAuthTabCallback(spannableStringBuilder, iOnMinimized, this.onNavigationEvent, iOnUnminimized, i2, 0);
        onExtraCallbackWithResult(spannableStringBuilder, iAsBinder, this.IAuthTabCallback, iOnUnminimized, i2, 0);
    }

    private static void IAuthTabCallback(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            boolean z3 = (i2 & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
        }
    }

    private static void onExtraCallbackWithResult(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i2 & OggPageHeader.MAX_SEGMENT_COUNT) << 24) | (i2 >>> 8)), i4, i5, i6 | 33);
        }
    }

    private static void onWarmupCompleted(SpannableStringBuilder spannableStringBuilder, String str, int i2, int i3) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i2, i3, 16711713);
        }
    }
}
