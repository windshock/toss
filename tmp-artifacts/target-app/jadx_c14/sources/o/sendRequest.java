package o;

import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class sendRequest {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final boolean includeAccountExpense;
    private final String lastYearMonth;
    private ArrayList<NativeReactDevToolsRuntimeSettingsModuleSpec> yearMonthList;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof sendRequest)) {
            int i3 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 != 0;
        }
        sendRequest sendrequest = (sendRequest) obj;
        if (!Intrinsics.areEqual(this.lastYearMonth, sendrequest.lastYearMonth)) {
            int i4 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.includeAccountExpense == sendrequest.includeAccountExpense) {
            return Intrinsics.areEqual(this.yearMonthList, sendrequest.yearMonthList);
        }
        int i5 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.lastYearMonth.hashCode();
        return i3 == 0 ? (((iHashCode << 29) << Boolean.hashCode(this.includeAccountExpense)) * 109) >> this.yearMonthList.hashCode() : (((iHashCode * 31) + Boolean.hashCode(this.includeAccountExpense)) * 31) + this.yearMonthList.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionInfo(lastYearMonth=" + this.lastYearMonth + ", includeAccountExpense=" + this.includeAccountExpense + ", yearMonthList=" + this.yearMonthList + ")";
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        return str;
    }

    public final ArrayList<NativeReactDevToolsRuntimeSettingsModuleSpec> onExtraCallbackWithResult() {
        ArrayList<NativeReactDevToolsRuntimeSettingsModuleSpec> arrayList;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            arrayList = this.yearMonthList;
            int i4 = 94 / 0;
        } else {
            arrayList = this.yearMonthList;
        }
        int i5 = i3 + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return arrayList;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        this.yearMonthList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        calendar.setTime(CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult().parse(this.lastYearMonth));
        while ((calendar.get(1) * 12) + calendar.get(2) <= (i2 * 12) + i3) {
            ArrayList<NativeReactDevToolsRuntimeSettingsModuleSpec> arrayList = this.yearMonthList;
            String str = CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult().format(calendar.getTime());
            Intrinsics.checkNotNullExpressionValue(str, "");
            arrayList.add(0, new NativeReactDevToolsRuntimeSettingsModuleSpec(str));
            calendar.add(2, 1);
        }
        int i4 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
