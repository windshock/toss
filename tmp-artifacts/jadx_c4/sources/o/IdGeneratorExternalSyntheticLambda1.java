package o;

import java.text.AttributedCharacterIterator;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IdGeneratorExternalSyntheticLambda1 extends SimpleDateFormat {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 0;
    private static final long serialVersionUID = 1;
    private volatile Date cached2DigitYearStart;
    private volatile Boolean cachedLenient;
    private volatile NumberFormat cachedNumberFormat;
    private volatile TimeZone cachedTimeZone;
    private DateFormatSymbols formatSymbols;
    private final ThreadLocal<SimpleDateFormat> localSimpleDateFormat;
    private Locale locale;
    private String pattern;

    static {
        int i = onNavigationEvent + 101;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ Boolean IAuthTabCallback(IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = idGeneratorExternalSyntheticLambda1.cachedLenient;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public static final /* synthetic */ Locale IAuthTabCallbackStub(IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Locale locale = idGeneratorExternalSyntheticLambda1.locale;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return locale;
    }

    public static final /* synthetic */ Date onExtraCallback(IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Date date = idGeneratorExternalSyntheticLambda1.cached2DigitYearStart;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = onExtraCallback + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return date;
        }
        throw null;
    }

    public static final /* synthetic */ TimeZone onExtraCallbackWithResult(IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TimeZone timeZone = idGeneratorExternalSyntheticLambda1.cachedTimeZone;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = IAuthTabCallback + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return timeZone;
    }

    public static final /* synthetic */ NumberFormat onNavigationEvent(IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        NumberFormat numberFormat = idGeneratorExternalSyntheticLambda1.cachedNumberFormat;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return numberFormat;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onTransact(IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = idGeneratorExternalSyntheticLambda1.pattern;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ DateFormatSymbols onWarmupCompleted(IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        DateFormatSymbols dateFormatSymbols = idGeneratorExternalSyntheticLambda1.formatSymbols;
        int i5 = i3 + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return dateFormatSymbols;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        @JvmStatic
        public final IdGeneratorExternalSyntheticLambda1 onExtraCallback(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = new IdGeneratorExternalSyntheticLambda1(str);
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 97 / 0;
            }
            return idGeneratorExternalSyntheticLambda1;
        }

        @JvmStatic
        public final IdGeneratorExternalSyntheticLambda1 onNavigationEvent(@NotNull String str, @NotNull Locale locale) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(locale, "");
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = new IdGeneratorExternalSyntheticLambda1(str, locale);
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return idGeneratorExternalSyntheticLambda1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent extends ThreadLocal<SimpleDateFormat> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        onNavigationEvent() {
        }

        @Override // java.lang.ThreadLocal
        public /* synthetic */ SimpleDateFormat initialValue() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SimpleDateFormat simpleDateFormatOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onExtraCallbackWithResult + 109;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 83 / 0;
            }
            return simpleDateFormatOnExtraCallbackWithResult;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected SimpleDateFormat onExtraCallbackWithResult() {
            SimpleDateFormat simpleDateFormat;
            int i = 2 % 2;
            if (IdGeneratorExternalSyntheticLambda1.onTransact(IdGeneratorExternalSyntheticLambda1.this) != null) {
                int i2 = onExtraCallbackWithResult + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                simpleDateFormat = IdGeneratorExternalSyntheticLambda1.onWarmupCompleted(IdGeneratorExternalSyntheticLambda1.this) != null ? new SimpleDateFormat(IdGeneratorExternalSyntheticLambda1.onTransact(IdGeneratorExternalSyntheticLambda1.this), IdGeneratorExternalSyntheticLambda1.onWarmupCompleted(IdGeneratorExternalSyntheticLambda1.this)) : (IdGeneratorExternalSyntheticLambda1.onTransact(IdGeneratorExternalSyntheticLambda1.this) == null || IdGeneratorExternalSyntheticLambda1.IAuthTabCallbackStub(IdGeneratorExternalSyntheticLambda1.this) == null) ? IdGeneratorExternalSyntheticLambda1.onTransact(IdGeneratorExternalSyntheticLambda1.this) != null ? new SimpleDateFormat(IdGeneratorExternalSyntheticLambda1.onTransact(IdGeneratorExternalSyntheticLambda1.this)) : new SimpleDateFormat() : new SimpleDateFormat(IdGeneratorExternalSyntheticLambda1.onTransact(IdGeneratorExternalSyntheticLambda1.this), IdGeneratorExternalSyntheticLambda1.IAuthTabCallbackStub(IdGeneratorExternalSyntheticLambda1.this));
            }
            TimeZone timeZoneOnExtraCallbackWithResult = IdGeneratorExternalSyntheticLambda1.onExtraCallbackWithResult(IdGeneratorExternalSyntheticLambda1.this);
            if (timeZoneOnExtraCallbackWithResult != null) {
                simpleDateFormat.setTimeZone(timeZoneOnExtraCallbackWithResult);
            }
            Boolean boolIAuthTabCallback = IdGeneratorExternalSyntheticLambda1.IAuthTabCallback(IdGeneratorExternalSyntheticLambda1.this);
            if (boolIAuthTabCallback != null) {
                int i4 = onExtraCallbackWithResult + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                simpleDateFormat.setLenient(boolIAuthTabCallback.booleanValue());
            }
            NumberFormat numberFormatOnNavigationEvent = IdGeneratorExternalSyntheticLambda1.onNavigationEvent(IdGeneratorExternalSyntheticLambda1.this);
            if (numberFormatOnNavigationEvent != null) {
                int i6 = onExtraCallback + 37;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                Object objClone = numberFormatOnNavigationEvent.clone();
                Intrinsics.checkNotNull(objClone, "");
                simpleDateFormat.setNumberFormat((NumberFormat) objClone);
            }
            Date dateOnExtraCallback = IdGeneratorExternalSyntheticLambda1.onExtraCallback(IdGeneratorExternalSyntheticLambda1.this);
            if (dateOnExtraCallback != null) {
                int i8 = onExtraCallbackWithResult + 121;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                simpleDateFormat.set2DigitYearStart(dateOnExtraCallback);
            }
            return simpleDateFormat;
        }
    }

    public IdGeneratorExternalSyntheticLambda1() {
        this.localSimpleDateFormat = new onNavigationEvent();
        onExtraCallback();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdGeneratorExternalSyntheticLambda1(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.localSimpleDateFormat = new onNavigationEvent();
        this.pattern = str;
        onExtraCallback();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdGeneratorExternalSyntheticLambda1(@NotNull String str, @NotNull DateFormatSymbols dateFormatSymbols) {
        super(str, dateFormatSymbols);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dateFormatSymbols, "");
        this.localSimpleDateFormat = new onNavigationEvent();
        this.pattern = str;
        this.formatSymbols = dateFormatSymbols;
        onExtraCallback();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdGeneratorExternalSyntheticLambda1(@NotNull String str, @NotNull Locale locale) {
        super(str, locale);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        this.localSimpleDateFormat = new onNavigationEvent();
        this.pattern = str;
        this.locale = locale;
        onExtraCallback();
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.cachedTimeZone = super.getTimeZone();
        this.cachedLenient = Boolean.valueOf(super.isLenient());
        this.cachedNumberFormat = super.getNumberFormat();
        this.cached2DigitYearStart = super.get2DigitYearStart();
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final SimpleDateFormat onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormat = this.localSimpleDateFormat.get();
        if (i3 != 0) {
            Intrinsics.checkNotNull(simpleDateFormat);
            return simpleDateFormat;
        }
        Intrinsics.checkNotNull(simpleDateFormat);
        throw null;
    }

    @Override // java.text.Format
    public Object parseObject(@NotNull String str) throws ParseException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object object = onWarmupCompleted().parseObject(str);
        Intrinsics.checkNotNullExpressionValue(object, "");
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return object;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String string = onWarmupCompleted().toString();
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return string;
    }

    @Override // java.text.DateFormat
    public Date parse(@NotNull String str) throws ParseException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Date date = onWarmupCompleted().parse(str);
        if (date == null) {
            throw new ParseException(str, 0);
        }
        int i4 = onExtraCallback + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return date;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.text.DateFormat, java.text.Format
    public Object parseObject(@NotNull String str, @NotNull ParsePosition parsePosition) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(parsePosition, "");
        Object object = onWarmupCompleted().parseObject(str, parsePosition);
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return object;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.text.DateFormat
    public Calendar getCalendar() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = onWarmupCompleted().getCalendar();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        int i4 = IAuthTabCallback + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return calendar;
    }

    @Override // java.text.DateFormat
    public void setCalendar(@NotNull Calendar calendar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(calendar, "");
        onWarmupCompleted().setCalendar(calendar);
        int i4 = onExtraCallback + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
    }

    @Override // java.text.DateFormat
    public NumberFormat getNumberFormat() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            NumberFormat numberFormat = onWarmupCompleted().getNumberFormat();
            Intrinsics.checkNotNullExpressionValue(numberFormat, "");
            return numberFormat;
        }
        Intrinsics.checkNotNullExpressionValue(onWarmupCompleted().getNumberFormat(), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.text.DateFormat
    public void setNumberFormat(@NotNull NumberFormat numberFormat) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(numberFormat, "");
            this.cachedNumberFormat = numberFormat;
            onWarmupCompleted().setNumberFormat(numberFormat);
        } else {
            Intrinsics.checkNotNullParameter(numberFormat, "");
            this.cachedNumberFormat = numberFormat;
            onWarmupCompleted().setNumberFormat(numberFormat);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TimeZone timeZone = onWarmupCompleted().getTimeZone();
        Intrinsics.checkNotNullExpressionValue(timeZone, "");
        int i4 = onExtraCallback + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return timeZone;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.text.DateFormat
    public void setTimeZone(@NotNull TimeZone timeZone) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(timeZone, "");
            this.cachedTimeZone = timeZone;
            onWarmupCompleted().setTimeZone(timeZone);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(timeZone, "");
        this.cachedTimeZone = timeZone;
        onWarmupCompleted().setTimeZone(timeZone);
        int i3 = IAuthTabCallback + 13;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormatOnWarmupCompleted = onWarmupCompleted();
        if (i3 == 0) {
            return simpleDateFormatOnWarmupCompleted.isLenient();
        }
        simpleDateFormatOnWarmupCompleted.isLenient();
        throw null;
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.cachedLenient = Boolean.valueOf(z);
            onWarmupCompleted().setLenient(z);
        } else {
            this.cachedLenient = Boolean.valueOf(z);
            onWarmupCompleted().setLenient(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // java.text.SimpleDateFormat
    public Date get2DigitYearStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Date date = onWarmupCompleted().get2DigitYearStart();
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return date;
        }
        throw null;
    }

    @Override // java.text.SimpleDateFormat
    public void set2DigitYearStart(@NotNull Date date) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        this.cached2DigitYearStart = date;
        onWarmupCompleted().set2DigitYearStart(date);
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public StringBuffer format(@NotNull Date date, @NotNull StringBuffer stringBuffer, @NotNull FieldPosition fieldPosition) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(date, "");
            Intrinsics.checkNotNullParameter(stringBuffer, "");
            Intrinsics.checkNotNullParameter(fieldPosition, "");
            StringBuffer stringBuffer2 = onWarmupCompleted().format(date, stringBuffer, fieldPosition);
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "");
            return stringBuffer2;
        }
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(stringBuffer, "");
        Intrinsics.checkNotNullParameter(fieldPosition, "");
        StringBuffer stringBuffer3 = onWarmupCompleted().format(date, stringBuffer, fieldPosition);
        Intrinsics.checkNotNullExpressionValue(stringBuffer3, "");
        int i3 = 12 / 0;
        return stringBuffer3;
    }

    @Override // java.text.SimpleDateFormat, java.text.Format
    public AttributedCharacterIterator formatToCharacterIterator(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        AttributedCharacterIterator toCharacterIterator = onWarmupCompleted().formatToCharacterIterator(obj);
        Intrinsics.checkNotNullExpressionValue(toCharacterIterator, "");
        int i4 = onExtraCallback + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return toCharacterIterator;
        }
        throw null;
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public Date parse(@NotNull String str, @NotNull ParsePosition parsePosition) throws ParseException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(parsePosition, "");
            onWarmupCompleted().parse(str, parsePosition);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(parsePosition, "");
        Date date = onWarmupCompleted().parse(str, parsePosition);
        if (date == null) {
            throw new ParseException(str, 0);
        }
        int i3 = IAuthTabCallback;
        int i4 = i3 + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 61;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return date;
    }

    @Override // java.text.SimpleDateFormat
    public String toPattern() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String pattern = onWarmupCompleted().toPattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "");
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return pattern;
    }

    @Override // java.text.SimpleDateFormat
    public String toLocalizedPattern() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String localizedPattern = onWarmupCompleted().toLocalizedPattern();
        Intrinsics.checkNotNullExpressionValue(localizedPattern, "");
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return localizedPattern;
        }
        throw null;
    }

    @Override // java.text.SimpleDateFormat
    public void applyPattern(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted().applyPattern(str);
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // java.text.SimpleDateFormat
    public void applyLocalizedPattern(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted().applyLocalizedPattern(str);
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.text.SimpleDateFormat
    public DateFormatSymbols getDateFormatSymbols() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            DateFormatSymbols dateFormatSymbols = onWarmupCompleted().getDateFormatSymbols();
            Intrinsics.checkNotNullExpressionValue(dateFormatSymbols, "");
            return dateFormatSymbols;
        }
        Intrinsics.checkNotNullExpressionValue(onWarmupCompleted().getDateFormatSymbols(), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.text.SimpleDateFormat
    public void setDateFormatSymbols(@NotNull DateFormatSymbols dateFormatSymbols) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dateFormatSymbols, "");
            onWarmupCompleted().setDateFormatSymbols(dateFormatSymbols);
        } else {
            Intrinsics.checkNotNullParameter(dateFormatSymbols, "");
            onWarmupCompleted().setDateFormatSymbols(dateFormatSymbols);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat, java.text.Format
    public Object clone() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objClone = onWarmupCompleted().clone();
        Intrinsics.checkNotNullExpressionValue(objClone, "");
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objClone;
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormatOnWarmupCompleted = onWarmupCompleted();
        if (i3 == 0) {
            return simpleDateFormatOnWarmupCompleted.hashCode();
        }
        simpleDateFormatOnWarmupCompleted.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(onWarmupCompleted(), obj);
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }
}
