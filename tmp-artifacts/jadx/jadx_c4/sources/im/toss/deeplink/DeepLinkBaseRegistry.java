package im.toss.deeplink;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class DeepLinkBaseRegistry {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final Map<String, DeeplinkEntry> entries;

    public DeepLinkBaseRegistry(@NotNull Map<String, DeeplinkEntry> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.entries = map;
    }

    public DeeplinkEntry findEntry(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DeeplinkEntry deeplinkEntry = this.entries.get(parseBaseUrl(str));
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return deeplinkEntry;
    }

    public boolean supportsUri(@Nullable String str) {
        int i = 2 % 2;
        if (findEntry(str) != null) {
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static final Integer parseBaseUrl$takeIfValid(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            return null;
        }
        int i5 = onNavigationEvent + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return numValueOf;
    }

    public final String parseBaseUrl(@Nullable String str) {
        int iIntValue;
        int i = 2 % 2;
        if (str == null) {
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        Integer baseUrl$takeIfValid = parseBaseUrl$takeIfValid(StringsKt.indexOf$default(str, "?", 0, false, 6, (Object) null));
        if (baseUrl$takeIfValid == null && (baseUrl$takeIfValid = parseBaseUrl$takeIfValid(StringsKt.indexOf$default(str, "#", 0, false, 6, (Object) null))) == null) {
            int i4 = onExtraCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                str.length();
                throw null;
            }
            iIntValue = str.length();
        } else {
            iIntValue = baseUrl$takeIfValid.intValue();
        }
        String strSubstring = str.substring(0, iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return StringsKt.trimEnd(strSubstring, new char[]{'/'});
    }
}
