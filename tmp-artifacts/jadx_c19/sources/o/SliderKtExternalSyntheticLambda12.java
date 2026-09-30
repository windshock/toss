package o;

import androidx.media3.common.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda12 {
    private static final Pattern onNavigationEvent = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        if (onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
            return;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        throw ParserException.onNavigationEvent("Expected WEBVTT. Got " + textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000(), (Throwable) null);
    }

    public static boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        String strAccess000 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000();
        return strAccess000 != null && strAccess000.startsWith("WEBVTT");
    }

    public static long onNavigationEvent(String str) {
        String[] strArrIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(str, "\\.");
        long j = 0;
        for (String str2 : TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(strArrIAuthTabCallback[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrIAuthTabCallback.length == 2) {
            String strTrim = strArrIAuthTabCallback[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static float IAuthTabCallback(String str) throws NumberFormatException {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static Matcher onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        String strAccess000;
        while (true) {
            String strAccess0002 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000();
            if (strAccess0002 == null) {
                return null;
            }
            if (onNavigationEvent.matcher(strAccess0002).matches()) {
                do {
                    strAccess000 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000();
                    if (strAccess000 != null) {
                    }
                } while (!strAccess000.isEmpty());
            } else {
                Matcher matcher = SliderKtExternalSyntheticLambda15.onExtraCallbackWithResult.matcher(strAccess0002);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
