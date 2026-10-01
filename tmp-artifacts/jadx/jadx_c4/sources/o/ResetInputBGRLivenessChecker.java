package o;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResetInputBGRLivenessChecker {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final String onExtraCallbackWithResult;

    public ResetInputBGRLivenessChecker(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
    }

    public static /* synthetic */ String onExtraCallback(ResetInputBGRLivenessChecker resetInputBGRLivenessChecker, long j, Resources resources, TimeZone timeZone, int i, Object obj) {
        TimeZone timeZone2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 93;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 23;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                timeZone2 = TimeZone.getDefault();
                Intrinsics.checkNotNullExpressionValue(timeZone2, "");
                int i7 = 51 / 0;
            } else {
                timeZone2 = TimeZone.getDefault();
                Intrinsics.checkNotNullExpressionValue(timeZone2, "");
            }
            timeZone = timeZone2;
            int i8 = IAuthTabCallback + 109;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        return resetInputBGRLivenessChecker.IAuthTabCallback(j, resources, timeZone);
    }

    public final String IAuthTabCallback(long j, @NotNull Resources resources, @NotNull TimeZone timeZone) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resources, "");
            Intrinsics.checkNotNullParameter(timeZone, "");
            return IAuthTabCallback(j, PageExitListener.onExtraCallbackWithResult(resources), timeZone);
        }
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        IAuthTabCallback(j, PageExitListener.onExtraCallbackWithResult(resources), timeZone);
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(ResetInputBGRLivenessChecker resetInputBGRLivenessChecker, Date date, Resources resources, TimeZone timeZone, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "");
            int i5 = IAuthTabCallback + 53;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return resetInputBGRLivenessChecker.onNavigationEvent(date, resources, timeZone);
    }

    public final String onNavigationEvent(@NotNull Date date, @NotNull Resources resources, @NotNull TimeZone timeZone) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(date, "");
            Intrinsics.checkNotNullParameter(resources, "");
            Intrinsics.checkNotNullParameter(timeZone, "");
            IAuthTabCallback(date.getTime(), resources, timeZone);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        String strIAuthTabCallback = IAuthTabCallback(date.getTime(), resources, timeZone);
        int i3 = onNavigationEvent + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    public static /* synthetic */ String onExtraCallback(ResetInputBGRLivenessChecker resetInputBGRLivenessChecker, Date date, Context context, TimeZone timeZone, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i & 4) != 0 : (i & 4) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "");
            int i4 = IAuthTabCallback + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 4;
            }
        }
        return resetInputBGRLivenessChecker.onExtraCallback(date, context, timeZone);
    }

    public final String onExtraCallback(@NotNull Date date, @NotNull Context context, @NotNull TimeZone timeZone) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(date, "");
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(timeZone, "");
            long time = date.getTime();
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return IAuthTabCallback(time, resources, timeZone);
        }
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        long time2 = date.getTime();
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        IAuthTabCallback(time2, resources2, timeZone);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback(long j, @NotNull Locale locale, @NotNull TimeZone timeZone) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(EstimateAgeAndGender.onWarmupCompleted.IAuthTabCallback(this.onExtraCallbackWithResult, locale), locale);
        simpleDateFormat.setCalendar(Calendar.getInstance(android.icu.util.TimeZone.getTimeZone(timeZone.getID()), locale));
        String str = simpleDateFormat.format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
