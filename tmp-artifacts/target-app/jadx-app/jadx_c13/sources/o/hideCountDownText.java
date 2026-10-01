package o;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class hideCountDownText {
    static final char[] onWarmupCompleted = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public abstract int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException;

    public static String onExtraCallbackWithResult(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    public final String onExtraCallbackWithResult(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() << 1);
            onNavigationEvent(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public final void onNavigationEvent(CharSequence charSequence, Writer writer) throws IOException {
        PAGVideoMediaView1.onExtraCallback(writer != null, "The Writer must not be null", new Object[0]);
        if (charSequence != null) {
            int length = charSequence.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iIAuthTabCallback = IAuthTabCallback(charSequence, iCharCount, writer);
                if (iIAuthTabCallback == 0) {
                    char cCharAt = charSequence.charAt(iCharCount);
                    writer.write(cCharAt);
                    int i = iCharCount + 1;
                    if (Character.isHighSurrogate(cCharAt) && i < length) {
                        char cCharAt2 = charSequence.charAt(i);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            writer.write(cCharAt2);
                            iCharCount += 2;
                        }
                    }
                    iCharCount = i;
                } else {
                    for (int i2 = 0; i2 < iIAuthTabCallback; i2++) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    }
                }
            }
        }
    }
}
