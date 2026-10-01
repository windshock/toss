package o;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SliderKtExternalSyntheticLambda10 {
    private static final Pattern onWarmupCompleted = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern onNavigationEvent = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final StringBuilder IAuthTabCallback = new StringBuilder();

    public List<ShapesKtExternalSyntheticLambda0> IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        this.IAuthTabCallback.setLength(0);
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        this.onExtraCallback.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted());
        this.onExtraCallback.asBinder(iOnWarmupCompleted);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strOnExtraCallback = onExtraCallback(this.onExtraCallback, this.IAuthTabCallback);
            if (strOnExtraCallback == null || !"{".equals(IAuthTabCallback(this.onExtraCallback, this.IAuthTabCallback))) {
                break;
            }
            ShapesKtExternalSyntheticLambda0 shapesKtExternalSyntheticLambda0 = new ShapesKtExternalSyntheticLambda0();
            onExtraCallback(shapesKtExternalSyntheticLambda0, strOnExtraCallback);
            String str = null;
            boolean z = false;
            while (!z) {
                int iOnWarmupCompleted2 = this.onExtraCallback.onWarmupCompleted();
                String strIAuthTabCallback = IAuthTabCallback(this.onExtraCallback, this.IAuthTabCallback);
                boolean z2 = strIAuthTabCallback == null || "}".equals(strIAuthTabCallback);
                if (!z2) {
                    this.onExtraCallback.asBinder(iOnWarmupCompleted2);
                    onNavigationEvent(this.onExtraCallback, shapesKtExternalSyntheticLambda0, this.IAuthTabCallback);
                }
                str = strIAuthTabCallback;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(shapesKtExternalSyntheticLambda0);
            }
        }
        return arrayList;
    }

    private static String onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, StringBuilder sb) {
        onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 5 || !"::cue".equals(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(5))) {
            return null;
        }
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        String strIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, sb);
        if (strIAuthTabCallback == null) {
            return null;
        }
        if ("{".equals(strIAuthTabCallback)) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            return "";
        }
        String strIAuthTabCallbackStub = "(".equals(strIAuthTabCallback) ? IAuthTabCallbackStub(textFieldDecoratorModifierNodeExternalSyntheticLambda20) : null;
        if (")".equals(IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, sb))) {
            return strIAuthTabCallbackStub;
        }
        return null;
    }

    private static String IAuthTabCallbackStub(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        boolean z = false;
        while (iOnWarmupCompleted < iOnExtraCallbackWithResult && !z) {
            z = ((char) textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[iOnWarmupCompleted]) == ')';
            iOnWarmupCompleted++;
        }
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted((iOnWarmupCompleted - 1) - textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted()).trim();
    }

    private static void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, ShapesKtExternalSyntheticLambda0 shapesKtExternalSyntheticLambda0, StringBuilder sb) {
        onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        String strOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, sb);
        if (strOnWarmupCompleted.isEmpty() || !":".equals(IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, sb))) {
            return;
        }
        onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, sb);
        if (strOnExtraCallbackWithResult == null || strOnExtraCallbackWithResult.isEmpty()) {
            return;
        }
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        String strIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, sb);
        if (!";".equals(strIAuthTabCallback)) {
            if (!"}".equals(strIAuthTabCallback)) {
                return;
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            }
        }
        if (TtmlNode.ATTR_TTS_COLOR.equals(strOnWarmupCompleted)) {
            shapesKtExternalSyntheticLambda0.onWarmupCompleted(TextFieldCoreModifierNodestartCursorJob1ExternalSyntheticLambda0.onWarmupCompleted(strOnExtraCallbackWithResult));
            return;
        }
        if ("background-color".equals(strOnWarmupCompleted)) {
            shapesKtExternalSyntheticLambda0.IAuthTabCallback(TextFieldCoreModifierNodestartCursorJob1ExternalSyntheticLambda0.onWarmupCompleted(strOnExtraCallbackWithResult));
            return;
        }
        boolean z = true;
        if ("ruby-position".equals(strOnWarmupCompleted)) {
            if ("over".equals(strOnExtraCallbackWithResult)) {
                shapesKtExternalSyntheticLambda0.onExtraCallbackWithResult(1);
                return;
            } else {
                if ("under".equals(strOnExtraCallbackWithResult)) {
                    shapesKtExternalSyntheticLambda0.onExtraCallbackWithResult(2);
                    return;
                }
                return;
            }
        }
        if ("text-combine-upright".equals(strOnWarmupCompleted)) {
            if (!TtmlNode.COMBINE_ALL.equals(strOnExtraCallbackWithResult) && !strOnExtraCallbackWithResult.startsWith("digits")) {
                z = false;
            }
            shapesKtExternalSyntheticLambda0.IAuthTabCallback(z);
            return;
        }
        if ("text-decoration".equals(strOnWarmupCompleted)) {
            if (TtmlNode.UNDERLINE.equals(strOnExtraCallbackWithResult)) {
                shapesKtExternalSyntheticLambda0.onNavigationEvent(true);
                return;
            }
            return;
        }
        if ("font-family".equals(strOnWarmupCompleted)) {
            shapesKtExternalSyntheticLambda0.onExtraCallback(strOnExtraCallbackWithResult);
            return;
        }
        if ("font-weight".equals(strOnWarmupCompleted)) {
            if (TtmlNode.BOLD.equals(strOnExtraCallbackWithResult)) {
                shapesKtExternalSyntheticLambda0.onExtraCallbackWithResult(true);
            }
        } else if ("font-style".equals(strOnWarmupCompleted)) {
            if (TtmlNode.ITALIC.equals(strOnExtraCallbackWithResult)) {
                shapesKtExternalSyntheticLambda0.onWarmupCompleted(true);
            }
        } else if ("font-size".equals(strOnWarmupCompleted)) {
            onExtraCallback(strOnExtraCallbackWithResult, shapesKtExternalSyntheticLambda0);
        }
    }

    static void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        while (true) {
            for (boolean z = true; textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0 && z; z = false) {
                if (onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20) || onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                    break;
                }
            }
            return;
        }
    }

    static String IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, StringBuilder sb) {
        onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() == 0) {
            return null;
        }
        String strOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, sb);
        if (!strOnWarmupCompleted.isEmpty()) {
            return strOnWarmupCompleted;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized());
        return sb2.toString();
    }

    private static boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        char cOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted());
        if (cOnNavigationEvent != '\t' && cOnNavigationEvent != '\n' && cOnNavigationEvent != '\f' && cOnNavigationEvent != '\r' && cOnNavigationEvent != ' ') {
            return false;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        return true;
    }

    static void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        while (!TextUtils.isEmpty(textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000())) {
        }
    }

    private static char onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        return (char) textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[i2];
    }

    private static String onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            String strIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, sb);
            if (strIAuthTabCallback == null) {
                return null;
            }
            if ("}".equals(strIAuthTabCallback) || ";".equals(strIAuthTabCallback)) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                z = true;
            } else {
                sb2.append(strIAuthTabCallback);
            }
        }
        return sb2.toString();
    }

    private static boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        int i2 = iOnWarmupCompleted + 2;
        if (i2 > iOnExtraCallbackWithResult || bArrOnExtraCallback[iOnWarmupCompleted] != 47 || bArrOnExtraCallback[iOnWarmupCompleted + 1] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 < iOnExtraCallbackWithResult) {
                if (((char) bArrOnExtraCallback[i2]) == '*' && ((char) bArrOnExtraCallback[i3]) == '/') {
                    i2 += 2;
                    iOnExtraCallbackWithResult = i2;
                } else {
                    i2 = i3;
                }
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnExtraCallbackWithResult - textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted());
                return true;
            }
        }
    }

    private static String onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        while (iOnWarmupCompleted < iOnExtraCallbackWithResult && !z) {
            char c = (char) textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[iOnWarmupCompleted];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                iOnWarmupCompleted++;
                sb.append(c);
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnWarmupCompleted - textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onExtraCallback(String str, ShapesKtExternalSyntheticLambda0 shapesKtExternalSyntheticLambda0) {
        char c;
        Matcher matcher = onNavigationEvent.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2));
        int iHashCode = str2.hashCode();
        if (iHashCode != 37) {
            if (iHashCode != 3240) {
                c = (iHashCode == 3592 && str2.equals("px")) ? (char) 2 : (char) 65535;
            } else if (str2.equals("em")) {
                c = 1;
            }
        } else if (str2.equals("%")) {
            c = 0;
        }
        if (c == 0) {
            shapesKtExternalSyntheticLambda0.onNavigationEvent(3);
        } else if (c == 1) {
            shapesKtExternalSyntheticLambda0.onNavigationEvent(2);
        } else if (c == 2) {
            shapesKtExternalSyntheticLambda0.onNavigationEvent(1);
        } else {
            throw new IllegalStateException();
        }
        shapesKtExternalSyntheticLambda0.onWarmupCompleted(Float.parseFloat((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1))));
    }

    private void onExtraCallback(ShapesKtExternalSyntheticLambda0 shapesKtExternalSyntheticLambda0, String str) {
        if (str.isEmpty()) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = onWarmupCompleted.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                shapesKtExternalSyntheticLambda0.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(str, "\\.");
        String str2 = strArrOnNavigationEvent[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            shapesKtExternalSyntheticLambda0.onExtraCallbackWithResult(str2.substring(0, iIndexOf2));
            shapesKtExternalSyntheticLambda0.onWarmupCompleted(str2.substring(iIndexOf2 + 1));
        } else {
            shapesKtExternalSyntheticLambda0.onExtraCallbackWithResult(str2);
        }
        if (strArrOnNavigationEvent.length > 1) {
            shapesKtExternalSyntheticLambda0.onWarmupCompleted((String[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(strArrOnNavigationEvent, 1, strArrOnNavigationEvent.length));
        }
    }
}
