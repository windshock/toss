package o;

import j$.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access4402 {
    public static final access4402 onExtraCallbackWithResult = new access4402();
    private static final Map<String, DayOfWeek> onExtraCallback = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("월", DayOfWeek.MONDAY), getWrite.IAuthTabCallback("화", DayOfWeek.TUESDAY), getWrite.IAuthTabCallback("수", DayOfWeek.WEDNESDAY), getWrite.IAuthTabCallback("목", DayOfWeek.THURSDAY), getWrite.IAuthTabCallback("금", DayOfWeek.FRIDAY), getWrite.IAuthTabCallback("토", DayOfWeek.SATURDAY), getWrite.IAuthTabCallback("일", DayOfWeek.SUNDAY)});

    private access4402() {
    }

    public final boolean IAuthTabCallback(@Nullable String str, @NotNull DayOfWeek dayOfWeek) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "");
        List listSplit$default = StringsKt.split$default(str == null ? "" : str, new char[]{','}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            DayOfWeek dayOfWeek2 = onExtraCallback.get(StringsKt.trim((String) it.next()).toString());
            if (dayOfWeek2 != null) {
                arrayList.add(dayOfWeek2);
            }
        }
        return arrayList.isEmpty() || arrayList.contains(dayOfWeek);
    }
}
