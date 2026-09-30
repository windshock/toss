package o;

import android.text.TextUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.util.RRNUtils;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackNativeAdCustomTabsNavigationAborted implements AppLovinSdkInitializationConfigurationImplBuilderImpl {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @Inject
    public trackNativeAdCustomTabsNavigationAborted() {
    }

    @Override // o.AppLovinSdkInitializationConfigurationImplBuilderImpl
    public boolean onNavigationEvent(@NotNull String str) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() != 1) {
            return false;
        }
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (!TextUtils.isDigitsOnly(str) || (i = Integer.parseInt(str)) <= 0 || i >= 9) {
            return false;
        }
        int i5 = onNavigationEvent + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // o.AppLovinSdkInitializationConfigurationImplBuilderImpl
    public boolean onNavigationEvent(@NotNull String str, @NotNull String str2) throws NumberFormatException {
        int i;
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean z = false;
        if (str.length() == 6 && str2.length() == 1 && TextUtils.isDigitsOnly(str) && TextUtils.isDigitsOnly(str2) && (i = Integer.parseInt(StringsKt.substring(str, new IntRange(2, 3)))) > 0) {
            int i3 = IAuthTabCallback + 87;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0 ? i <= 12 : i <= 85) {
                int i4 = Integer.parseInt(StringsKt.substring(str, new IntRange(4, 5)));
                RRNUtils rRNUtils = RRNUtils.onExtraCallback;
                int actualMaximum = new GregorianCalendar(Integer.parseInt(rRNUtils.onNavigationEvent(str2) + StringsKt.substring(str, new IntRange(0, 1))), i - 1, 1).getActualMaximum(5);
                if (i4 > 0) {
                    int i5 = onNavigationEvent + 55;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (i4 <= actualMaximum) {
                        try {
                            Result.Companion companion = Result.Companion;
                            Date date = CommonModule_closeView.onNavigationEvent.parse(rRNUtils.onNavigationEvent(str, str2));
                            if (date != null && date.after(Calendar.getInstance().getTime())) {
                                z = true;
                            }
                            obj = Result.constructor-impl(Boolean.valueOf(!z));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        Boolean bool = Boolean.FALSE;
                        if (Result.onExtraCallback(obj)) {
                            obj = bool;
                        }
                        return ((Boolean) obj).booleanValue();
                    }
                }
            }
        }
        return false;
    }
}
