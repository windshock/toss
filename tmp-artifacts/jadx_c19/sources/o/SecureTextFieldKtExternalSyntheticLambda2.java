package o;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.RubySpan;
import java.util.ArrayDeque;
import java.util.Map;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SecureTextFieldKtExternalSyntheticLambda2 {
    public static SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(@Nullable SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1, @Nullable String[] strArr, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map) {
        int i2 = 0;
        if (secureTextFieldKtExternalSyntheticLambda1 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda12 = new SecureTextFieldKtExternalSyntheticLambda1();
                int length = strArr.length;
                while (i2 < length) {
                    secureTextFieldKtExternalSyntheticLambda12.onNavigationEvent(map.get(strArr[i2]));
                    i2++;
                }
                return secureTextFieldKtExternalSyntheticLambda12;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return secureTextFieldKtExternalSyntheticLambda1;
    }

    public static void IAuthTabCallback(Spannable spannable, int i2, int i3, SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1, @Nullable ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map, int i4) {
        ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8OnExtraCallback;
        SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted;
        int i5;
        if (secureTextFieldKtExternalSyntheticLambda1.access100() != -1) {
            spannable.setSpan(new StyleSpan(secureTextFieldKtExternalSyntheticLambda1.access100()), i2, i3, 33);
        }
        if (secureTextFieldKtExternalSyntheticLambda1.extraCallback()) {
            spannable.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (secureTextFieldKtExternalSyntheticLambda1.readTypedObject()) {
            spannable.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (secureTextFieldKtExternalSyntheticLambda1.writeTypedObject()) {
            InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannable, new ForegroundColorSpan(secureTextFieldKtExternalSyntheticLambda1.onWarmupCompleted()), i2, i3, 33);
        }
        if (secureTextFieldKtExternalSyntheticLambda1.ICustomTabsCallback()) {
            InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannable, new BackgroundColorSpan(secureTextFieldKtExternalSyntheticLambda1.onExtraCallback()), i2, i3, 33);
        }
        if (secureTextFieldKtExternalSyntheticLambda1.onExtraCallbackWithResult() != null) {
            InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannable, new TypefaceSpan(secureTextFieldKtExternalSyntheticLambda1.onExtraCallbackWithResult()), i2, i3, 33);
        }
        if (secureTextFieldKtExternalSyntheticLambda1.extraCallbackWithResult() != null) {
            ScaffoldKtExternalSyntheticLambda7 scaffoldKtExternalSyntheticLambda7 = (ScaffoldKtExternalSyntheticLambda7) RecordingInputConnection_androidKt.onExtraCallbackWithResult(secureTextFieldKtExternalSyntheticLambda1.extraCallbackWithResult());
            int i6 = scaffoldKtExternalSyntheticLambda7.onWarmupCompleted;
            if (i6 == -1) {
                i6 = (i4 == 2 || i4 == 1) ? 3 : 1;
                i5 = 1;
            } else {
                i5 = scaffoldKtExternalSyntheticLambda7.IAuthTabCallback;
            }
            int i7 = scaffoldKtExternalSyntheticLambda7.onExtraCallback;
            if (i7 == -2) {
                i7 = 1;
            }
            InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannable, new ImeEditCommand_androidKtExternalSyntheticLambda5(i6, i5, i7), i2, i3, 33);
        }
        int iIAuthTabCallback_Parcel = secureTextFieldKtExternalSyntheticLambda1.IAuthTabCallback_Parcel();
        if (iIAuthTabCallback_Parcel == 2) {
            ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8OnExtraCallbackWithResult = onExtraCallbackWithResult(scaffoldKtExternalSyntheticLambda8, map);
            if (scaffoldKtExternalSyntheticLambda8OnExtraCallbackWithResult != null && (scaffoldKtExternalSyntheticLambda8OnExtraCallback = onExtraCallback(scaffoldKtExternalSyntheticLambda8OnExtraCallbackWithResult, map)) != null) {
                if (scaffoldKtExternalSyntheticLambda8OnExtraCallback.onExtraCallback() == 1 && scaffoldKtExternalSyntheticLambda8OnExtraCallback.onExtraCallbackWithResult(0).IAuthTabCallbackStub != null) {
                    String str = (String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{scaffoldKtExternalSyntheticLambda8OnExtraCallback.onExtraCallbackWithResult(0).IAuthTabCallbackStub}, -1084655742);
                    SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted2 = onWarmupCompleted(scaffoldKtExternalSyntheticLambda8OnExtraCallback.onTransact, scaffoldKtExternalSyntheticLambda8OnExtraCallback.onNavigationEvent(), map);
                    int iIAuthTabCallbackStub = secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted2 != null ? secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted2.IAuthTabCallbackStub() : -1;
                    if (iIAuthTabCallbackStub == -1 && (secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(scaffoldKtExternalSyntheticLambda8OnExtraCallbackWithResult.onTransact, scaffoldKtExternalSyntheticLambda8OnExtraCallbackWithResult.onNavigationEvent(), map)) != null) {
                        iIAuthTabCallbackStub = secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallbackStub();
                    }
                    spannable.setSpan(new RubySpan(str, iIAuthTabCallbackStub), i2, i3, 33);
                } else {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (iIAuthTabCallback_Parcel == 3 || iIAuthTabCallback_Parcel == 4) {
            spannable.setSpan(new ScaffoldKtExternalSyntheticLambda6(), i2, i3, 33);
        }
        if (secureTextFieldKtExternalSyntheticLambda1.IAuthTabCallbackStubProxy()) {
            InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannable, new LegacyTextInputMethodRequestExternalSyntheticLambda1(), i2, i3, 33);
        }
        int iAsBinder = secureTextFieldKtExternalSyntheticLambda1.asBinder();
        if (iAsBinder == 1) {
            InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannable, new AbsoluteSizeSpan((int) secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent(), true), i2, i3, 33);
        } else if (iAsBinder == 2) {
            InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannable, new RelativeSizeSpan(secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent()), i2, i3, 33);
        } else {
            if (iAsBinder != 3) {
                return;
            }
            InputMethodManagerImplExternalSyntheticLambda0.onWarmupCompleted(spannable, secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent() / 100.0f, i2, i3, 33);
        }
    }

    private static ScaffoldKtExternalSyntheticLambda8 onExtraCallback(ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(scaffoldKtExternalSyntheticLambda8);
        while (!arrayDeque.isEmpty()) {
            ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda82 = (ScaffoldKtExternalSyntheticLambda8) arrayDeque.pop();
            SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(scaffoldKtExternalSyntheticLambda82.onTransact, scaffoldKtExternalSyntheticLambda82.onNavigationEvent(), map);
            if (secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted != null && secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback_Parcel() == 3) {
                return scaffoldKtExternalSyntheticLambda82;
            }
            for (int iOnExtraCallback = scaffoldKtExternalSyntheticLambda82.onExtraCallback() - 1; iOnExtraCallback >= 0; iOnExtraCallback--) {
                arrayDeque.push(scaffoldKtExternalSyntheticLambda82.onExtraCallbackWithResult(iOnExtraCallback));
            }
        }
        return null;
    }

    private static ScaffoldKtExternalSyntheticLambda8 onExtraCallbackWithResult(@Nullable ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map) {
        while (scaffoldKtExternalSyntheticLambda8 != null) {
            SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(scaffoldKtExternalSyntheticLambda8.onTransact, scaffoldKtExternalSyntheticLambda8.onNavigationEvent(), map);
            if (secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted != null && secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback_Parcel() == 1) {
                return scaffoldKtExternalSyntheticLambda8;
            }
            scaffoldKtExternalSyntheticLambda8 = scaffoldKtExternalSyntheticLambda8.onExtraCallbackWithResult;
        }
        return null;
    }

    static void IAuthTabCallback(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    static String onWarmupCompleted(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
