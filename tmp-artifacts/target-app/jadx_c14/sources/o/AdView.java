package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdView {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdView[] $VALUES;
    public static final onWarmupCompleted Companion;
    private final int bitValue;
    public static final AdView LOGCAT = new AdView("LOGCAT", 0, 2);
    public static final AdView FLIPPER = new AdView("FLIPPER", 1, 4);
    public static final AdView CHUCKER = new AdView("CHUCKER", 2, 8);

    private static final /* synthetic */ AdView[] $values() {
        return new AdView[]{LOGCAT, FLIPPER, CHUCKER};
    }

    public static EnumEntries<AdView> getEntries() {
        return $ENTRIES;
    }

    public static AdView valueOf(String str) {
        return (AdView) Enum.valueOf(AdView.class, str);
    }

    public static AdView[] values() {
        return (AdView[]) $VALUES.clone();
    }

    private AdView(String str, int i, int i2) {
        this.bitValue = i2;
    }

    public final int getBitValue() {
        return this.bitValue;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final List<AdView> onWarmupCompleted(int i) {
            AdView[] adViewArrValues = AdView.values();
            ArrayList arrayList = new ArrayList();
            for (AdView adView : adViewArrValues) {
                if ((adView.getBitValue() & i) != 0) {
                    arrayList.add(adView);
                }
            }
            return arrayList;
        }
    }

    static {
        AdView[] adViewArr$values = $values();
        $VALUES = adViewArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(adViewArr$values);
        Companion = new onWarmupCompleted(null);
    }
}
