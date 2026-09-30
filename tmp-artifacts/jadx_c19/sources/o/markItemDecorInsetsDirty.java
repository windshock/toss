package o;

import android.os.Build;
import android.util.Range;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class markItemDecorInsetsDirty {
    private static final Map<String, List<Range<Integer>>> onExtraCallback;
    private static final addFocusables onExtraCallbackWithResult = addFocusables.onExtraCallback("FpsRangeValidator");

    static {
        HashMap map = new HashMap();
        onExtraCallback = map;
        map.put("Google Pixel 4", Arrays.asList(new Range(15, 60)));
        map.put("Google Pixel 4a", Arrays.asList(new Range(15, 60)));
    }

    public static boolean onNavigationEvent(Range<Integer> range) {
        addFocusables addfocusables = onExtraCallbackWithResult;
        String str = Build.MODEL;
        String str2 = Build.BRAND;
        String str3 = Build.MANUFACTURER;
        addfocusables.onExtraCallbackWithResult(new Object[]{"Build.MODEL:", str, "Build.BRAND:", str2, "Build.MANUFACTURER:", str3});
        List<Range<Integer>> list = onExtraCallback.get(str3 + " " + str);
        if (list == null || !list.contains(range)) {
            return true;
        }
        addfocusables.onExtraCallbackWithResult(new Object[]{"Dropping range:", range});
        return false;
    }
}
