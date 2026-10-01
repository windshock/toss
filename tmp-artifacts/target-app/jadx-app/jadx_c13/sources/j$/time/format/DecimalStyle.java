package j$.time.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DecimalStyle {
    public static final DecimalStyle d = new DecimalStyle('0', '-', '.');
    public static final ConcurrentMap e = new ConcurrentHashMap(16, 0.75f, 2);
    public final char a;
    public final char b;
    public final char c;

    public static DecimalStyle of(Locale locale) {
        DecimalStyle decimalStyle;
        Objects.requireNonNull(locale, "locale");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e;
        DecimalStyle decimalStyle2 = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle2 != null) {
            return decimalStyle2;
        }
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        if (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') {
            decimalStyle = d;
        } else {
            decimalStyle = new DecimalStyle(zeroDigit, minusSign, decimalSeparator);
        }
        concurrentHashMap.putIfAbsent(locale, decimalStyle);
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    public DecimalStyle(char c, char c2, char c3) {
        this.a = c;
        this.b = c2;
        this.c = c3;
    }

    public final String a(String str) {
        char c = this.a;
        if (c == '0') {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + (c - '0'));
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.a == decimalStyle.a && this.b == decimalStyle.b && this.c == decimalStyle.c;
    }

    public final int hashCode() {
        return this.a + '+' + this.b + this.c;
    }

    public final String toString() {
        return "DecimalStyle[" + this.a + '+' + this.b + this.c + "]";
    }
}
