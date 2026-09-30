package o;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class useTurboModuleInterop {
    public static final String onExtraCallback(@NotNull String str, @NotNull String str2, int i) {
        String str3;
        String str4;
        List groupValues;
        List list;
        Object next;
        List groupValues2;
        List list2;
        Object next2;
        String str5 = BuildConfig.FLAVOR;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        if (!StringsKt.startsWith$default(str, str2, false, 2, (Object) null) && !StringsKt.endsWith$default(str, str2, false, 2, (Object) null)) {
            return null;
        }
        MatchResult matchResultFind$default = Regex.find$default(new Regex("((" + str2 + ")*[0-9]{" + i + "})|([0-9]{" + i + "}.*(" + str2 + "))"), StringsKt.trim(mergeParams.IAuthTabCallbackDefault(str)).toString(), 0, 2, (Object) null);
        if (matchResultFind$default == null || (groupValues2 = matchResultFind$default.getGroupValues()) == null || (list2 = CollectionsKt.toList(groupValues2)) == null) {
            str3 = null;
        } else {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (!StringsKt.isBlank((String) next2)) {
                    break;
                }
            }
            str3 = (String) next2;
        }
        Regex regex = new Regex("[0-9]{" + i + "}");
        if (str3 != null) {
            str5 = str3;
        }
        MatchResult matchResultFind$default2 = Regex.find$default(regex, str5, 0, 2, (Object) null);
        if (matchResultFind$default2 == null || (groupValues = matchResultFind$default2.getGroupValues()) == null || (list = CollectionsKt.toList(groupValues)) == null) {
            str4 = null;
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (!StringsKt.isBlank((String) next)) {
                    break;
                }
            }
            str4 = (String) next;
        }
        if (str4 == null || StringsKt.isBlank(str4)) {
            return null;
        }
        return str4;
    }
}
