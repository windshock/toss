package j$.time.format;

import j$.time.DateTimeException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;

    public DateTimeParseException(String str, CharSequence charSequence, Throwable th) {
        super(str, th);
        charSequence.toString();
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i) {
        super(str);
        charSequence.toString();
    }
}
