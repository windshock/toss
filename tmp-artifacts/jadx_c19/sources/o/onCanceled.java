package o;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onCanceled extends DateFormat {
    protected static final Calendar IAuthTabCallback;
    protected static final Pattern IAuthTabCallbackDefault = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    protected static final Pattern IAuthTabCallbackStub;
    public static final onCanceled asBinder;
    protected static final String[] onExtraCallback;
    protected static final TimeZone onExtraCallbackWithResult;
    protected static final DateFormat onNavigationEvent;
    protected static final Locale onWarmupCompleted;
    private transient DateFormat IAuthTabCallback_Parcel;
    protected Boolean _lenient;
    protected final Locale _locale;
    private boolean _tzSerializedWithColon;
    protected transient TimeZone asInterface;
    private transient Calendar onTransact;

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    static {
        try {
            IAuthTabCallbackStub = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            onExtraCallback = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            onExtraCallbackWithResult = timeZone;
            Locale locale = Locale.US;
            onWarmupCompleted = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            onNavigationEvent = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            asBinder = new onCanceled();
            IAuthTabCallback = new GregorianCalendar(timeZone, locale);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public onCanceled() {
        this._tzSerializedWithColon = true;
        this._locale = onWarmupCompleted;
    }

    @Deprecated
    public onCanceled(TimeZone timeZone, Locale locale) {
        this._tzSerializedWithColon = true;
        this.asInterface = timeZone;
        this._locale = locale;
    }

    protected onCanceled(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this.asInterface = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this._tzSerializedWithColon = z;
    }

    public onCanceled onExtraCallbackWithResult(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = onExtraCallbackWithResult;
        }
        TimeZone timeZone2 = this.asInterface;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new onCanceled(timeZone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    public onCanceled onWarmupCompleted(Locale locale) {
        return locale.equals(this._locale) ? this : new onCanceled(this.asInterface, locale, this._lenient, this._tzSerializedWithColon);
    }

    public onCanceled onExtraCallbackWithResult(Boolean bool) {
        return onNavigationEvent(bool, this._lenient) ? this : new onCanceled(this.asInterface, this._locale, bool, this._tzSerializedWithColon);
    }

    @Override // java.text.DateFormat, java.text.Format
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public onCanceled clone() {
        return new onCanceled(this.asInterface, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.asInterface;
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.asInterface)) {
            return;
        }
        onExtraCallbackWithResult();
        this.asInterface = timeZone;
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        if (onNavigationEvent(boolValueOf, this._lenient)) {
            return;
        }
        this._lenient = boolValueOf;
        onExtraCallbackWithResult();
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this._lenient;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateIAuthTabCallback = IAuthTabCallback(strTrim, parsePosition);
        if (dateIAuthTabCallback != null) {
            return dateIAuthTabCallback;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : onExtraCallback) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", strTrim, sb.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return IAuthTabCallback(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }

    protected Date IAuthTabCallback(String str, ParsePosition parsePosition) throws ParseException {
        if (IAuthTabCallback(str)) {
            return onExtraCallbackWithResult(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (length > 0 || cCharAt != '-') {
                    break;
                }
            }
        }
        if (length < 0 && (str.charAt(0) == '-' || requestPermissions.onNavigationEvent(str, false))) {
            return onWarmupCompleted(str, parsePosition);
        }
        return onNavigationEvent(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.asInterface;
        if (timeZone == null) {
            timeZone = onExtraCallbackWithResult;
        }
        onExtraCallbackWithResult(timeZone, this._locale, date, stringBuffer);
        return stringBuffer;
    }

    protected void onExtraCallbackWithResult(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar calendarOnNavigationEvent = onNavigationEvent(timeZone);
        calendarOnNavigationEvent.setTime(date);
        int i2 = calendarOnNavigationEvent.get(1);
        if (calendarOnNavigationEvent.get(0) == 0) {
            IAuthTabCallback(stringBuffer, i2);
        } else {
            if (i2 > 9999) {
                stringBuffer.append('+');
            }
            onExtraCallback(stringBuffer, i2);
        }
        stringBuffer.append('-');
        onNavigationEvent(stringBuffer, calendarOnNavigationEvent.get(2) + 1);
        stringBuffer.append('-');
        onNavigationEvent(stringBuffer, calendarOnNavigationEvent.get(5));
        stringBuffer.append('T');
        onNavigationEvent(stringBuffer, calendarOnNavigationEvent.get(11));
        stringBuffer.append(':');
        onNavigationEvent(stringBuffer, calendarOnNavigationEvent.get(12));
        stringBuffer.append(':');
        onNavigationEvent(stringBuffer, calendarOnNavigationEvent.get(13));
        stringBuffer.append('.');
        onExtraCallbackWithResult(stringBuffer, calendarOnNavigationEvent.get(14));
        int offset = timeZone.getOffset(calendarOnNavigationEvent.getTimeInMillis());
        if (offset != 0) {
            int i3 = offset / 60000;
            int iAbs = Math.abs(i3 / 60);
            int iAbs2 = Math.abs(i3 % 60);
            stringBuffer.append(offset < 0 ? '-' : '+');
            onNavigationEvent(stringBuffer, iAbs);
            if (this._tzSerializedWithColon) {
                stringBuffer.append(':');
            }
            onNavigationEvent(stringBuffer, iAbs2);
            return;
        }
        if (this._tzSerializedWithColon) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
    }

    protected void IAuthTabCallback(StringBuffer stringBuffer, int i2) {
        if (i2 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            onExtraCallback(stringBuffer, i2 - 1);
        }
    }

    private static void onNavigationEvent(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 10;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 10;
        }
        stringBuffer.append((char) (i2 + 48));
    }

    private static void onExtraCallbackWithResult(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 100;
        }
        onNavigationEvent(stringBuffer, i2);
    }

    private static void onExtraCallback(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i3 > 99) {
                stringBuffer.append(i3);
            } else {
                onNavigationEvent(stringBuffer, i3);
            }
            i2 -= i3 * 100;
        }
        onNavigationEvent(stringBuffer, i2);
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.asInterface, this._locale, this._lenient);
    }

    public String onExtraCallback() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[one of: '");
        sb.append("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        sb.append("', '");
        sb.append("EEE, dd MMM yyyy HH:mm:ss zzz");
        sb.append("' (");
        sb.append(Boolean.FALSE.equals(this._lenient) ? "strict" : "lenient");
        sb.append(")]");
        return sb.toString();
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    protected boolean IAuthTabCallback(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    private Date onWarmupCompleted(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(requestPermissions.onExtraCallback(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    protected Date onExtraCallbackWithResult(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return onExtraCallback(str, parsePosition);
        } catch (IllegalArgumentException e) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e.getMessage()), parsePosition.getErrorIndex());
        }
    }

    protected Date onExtraCallback(String str, ParsePosition parsePosition) throws ParseException, IllegalArgumentException {
        String str2;
        int length = str.length();
        TimeZone timeZone = onExtraCallbackWithResult;
        if (this.asInterface != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this.asInterface;
        }
        Calendar calendarOnNavigationEvent = onNavigationEvent(timeZone);
        calendarOnNavigationEvent.clear();
        int iCharAt = 0;
        if (length <= 10) {
            if (IAuthTabCallbackDefault.matcher(str).matches()) {
                calendarOnNavigationEvent.set(onWarmupCompleted(str, 0), onExtraCallbackWithResult(str, 5) - 1, onExtraCallbackWithResult(str, 8), 0, 0, 0);
                calendarOnNavigationEvent.set(14, 0);
                return calendarOnNavigationEvent.getTime();
            }
            str2 = "yyyy-MM-dd";
        } else {
            Matcher matcher = IAuthTabCallbackStub.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i2 = iEnd - iStart;
                if (i2 > 1) {
                    int iOnExtraCallbackWithResult = onExtraCallbackWithResult(str, iStart + 1) * 3600;
                    if (i2 >= 5) {
                        iOnExtraCallbackWithResult += onExtraCallbackWithResult(str, iEnd - 2) * 60;
                    }
                    calendarOnNavigationEvent.set(15, str.charAt(iStart) == '-' ? iOnExtraCallbackWithResult * (-1000) : iOnExtraCallbackWithResult * 1000);
                    calendarOnNavigationEvent.set(16, 0);
                }
                calendarOnNavigationEvent.set(onWarmupCompleted(str, 0), onExtraCallbackWithResult(str, 5) - 1, onExtraCallbackWithResult(str, 8), onExtraCallbackWithResult(str, 11), onExtraCallbackWithResult(str, 14), (length <= 16 || str.charAt(16) != ':') ? 0 : onExtraCallbackWithResult(str, 17));
                int iStart2 = matcher.start(1);
                int i3 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i3 >= iEnd2) {
                    calendarOnNavigationEvent.set(14, 0);
                } else {
                    int i4 = iEnd2 - i3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3 && i4 > 9) {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", str, matcher.group(1).substring(1)), i3);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i3) - '0') * 100;
                    }
                    calendarOnNavigationEvent.set(14, iCharAt);
                }
                return calendarOnNavigationEvent.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        }
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", str, str2, this._lenient), 0);
    }

    private static int onWarmupCompleted(String str, int i2) {
        return ((str.charAt(i2) - '0') * 1000) + ((str.charAt(i2 + 1) - '0') * 100) + ((str.charAt(i2 + 2) - '0') * 10) + (str.charAt(i2 + 3) - '0');
    }

    private static int onExtraCallbackWithResult(String str, int i2) {
        return ((str.charAt(i2) - '0') * 10) + (str.charAt(i2 + 1) - '0');
    }

    protected Date onNavigationEvent(String str, ParsePosition parsePosition) {
        if (this.IAuthTabCallback_Parcel == null) {
            this.IAuthTabCallback_Parcel = onWarmupCompleted(onNavigationEvent, "EEE, dd MMM yyyy HH:mm:ss zzz", this.asInterface, this._locale, this._lenient);
        }
        return this.IAuthTabCallback_Parcel.parse(str, parsePosition);
    }

    private static final DateFormat onWarmupCompleted(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat simpleDateFormat;
        if (!locale.equals(onWarmupCompleted)) {
            simpleDateFormat = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = onExtraCallbackWithResult;
            }
            simpleDateFormat.setTimeZone(timeZone);
        } else {
            simpleDateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
        }
        if (bool != null) {
            simpleDateFormat.setLenient(bool.booleanValue());
        }
        return simpleDateFormat;
    }

    protected void onExtraCallbackWithResult() {
        this.IAuthTabCallback_Parcel = null;
    }

    protected Calendar onNavigationEvent(TimeZone timeZone) {
        Calendar calendar = this.onTransact;
        if (calendar == null) {
            calendar = (Calendar) IAuthTabCallback.clone();
            this.onTransact = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    protected static <T> boolean onNavigationEvent(T t, T t2) {
        if (t == t2) {
            return true;
        }
        return t != null && t.equals(t2);
    }
}
