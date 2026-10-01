package o;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getAdTitleTextView {
    static final char[] onWarmupCompleted = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public abstract int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException;

    public final String onExtraCallback(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() << 1);
            onNavigationEvent(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onNavigationEvent(CharSequence charSequence, Writer writer) throws IOException {
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        }
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

    public final getAdTitleTextView onExtraCallback(getAdTitleTextView... getadtitletextviewArr) {
        getAdTitleTextView[] getadtitletextviewArr2 = new getAdTitleTextView[getadtitletextviewArr.length + 1];
        getadtitletextviewArr2[0] = this;
        System.arraycopy(getadtitletextviewArr, 0, getadtitletextviewArr2, 1, getadtitletextviewArr.length);
        return new wwx9(getadtitletextviewArr2);
    }

    public static String onNavigationEvent(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }
}
