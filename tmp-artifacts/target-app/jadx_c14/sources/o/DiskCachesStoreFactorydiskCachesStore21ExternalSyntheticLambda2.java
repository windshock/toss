package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2[] $VALUES;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 CREDIT_LOAN = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2("CREDIT_LOAN", 0);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 MINUS = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2("MINUS", 1);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 CARD_LOAN = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2("CARD_LOAN", 2);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 CARD_CREDIT_LOAN = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2("CARD_CREDIT_LOAN", 3);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 MORTGAGE_LOAN = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2("MORTGAGE_LOAN", 4);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 JEONSE = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2("JEONSE", 5);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 ETC = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2("ETC", 6);

    private static final /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2[] diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2Arr = {CREDIT_LOAN, MINUS, CARD_LOAN, CARD_CREDIT_LOAN, MORTGAGE_LOAN, JEONSE, ETC};
        int i5 = i3 + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2Arr;
    }

    public static EnumEntries<DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2> enumEntries = $ENTRIES;
        int i4 = i2 + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 = (DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2) Enum.valueOf(DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2;
        }
        throw null;
    }

    public static DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2[] diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2Arr = $VALUES;
        if (i3 != 0) {
            return (DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2[]) diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2Arr.clone();
        }
        int i4 = 98 / 0;
        return (DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2[]) diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2Arr.clone();
    }

    private DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2(String str, int i) {
    }

    static {
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2[] diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2Arr$values = $values();
        $VALUES = diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2Arr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 onNavigationEvent(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2ValueOf = DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2.valueOf(str);
                int i4 = onWarmupCompleted + 53;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2ValueOf;
            } catch (Exception unused) {
                return DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2.ETC;
            }
        }
    }
}
