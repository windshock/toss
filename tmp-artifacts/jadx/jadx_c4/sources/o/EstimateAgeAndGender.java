package o;

import android.icu.text.DateTimePatternGenerator;
import androidx.collection.LruCache;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EstimateAgeAndGender {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final EstimateAgeAndGender onWarmupCompleted = new EstimateAgeAndGender();
    private static final LruCache<String, String> onNavigationEvent = new LruCache<>(64);

    private EstimateAgeAndGender() {
    }

    static {
        int i = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final String IAuthTabCallback(@NotNull String str, @NotNull Locale locale) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String str2 = str + "|" + locale.toLanguageTag();
        LruCache<String, String> lruCache = onNavigationEvent;
        String str3 = (String) lruCache.get(str2);
        if (str3 == null) {
            String bestPattern = DateTimePatternGenerator.getInstance(locale).getBestPattern(str);
            Intrinsics.checkNotNull(bestPattern);
            lruCache.put(str2, bestPattern);
            int i2 = asInterface + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return bestPattern;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = asInterface + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return str3;
    }
}
