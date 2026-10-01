package o;

import im.toss.features.credit.data.response.CreditConsultingTime;
import java.util.Calendar;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class priorityUploadRate {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ priorityUploadRate[] $VALUES;
    public static final onExtraCallback Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final priorityUploadRate AM = new priorityUploadRate("AM", 0);
    public static final priorityUploadRate PM = new priorityUploadRate("PM", 1);

    private static final /* synthetic */ priorityUploadRate[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        priorityUploadRate priorityuploadrate = AM;
        if (i3 == 0) {
            return new priorityUploadRate[]{priorityuploadrate, PM};
        }
        priorityUploadRate priorityuploadrate2 = PM;
        priorityUploadRate[] priorityuploadrateArr = new priorityUploadRate[4];
        priorityuploadrateArr[1] = priorityuploadrate;
        priorityuploadrateArr[1] = priorityuploadrate2;
        return priorityuploadrateArr;
    }

    public static EnumEntries<priorityUploadRate> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static priorityUploadRate valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        priorityUploadRate priorityuploadrate = (priorityUploadRate) Enum.valueOf(priorityUploadRate.class, str);
        if (i3 != 0) {
            return priorityuploadrate;
        }
        throw null;
    }

    public static priorityUploadRate[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        priorityUploadRate[] priorityuploadrateArr = (priorityUploadRate[]) $VALUES.clone();
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return priorityuploadrateArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private priorityUploadRate(String str, int i) {
    }

    static {
        priorityUploadRate[] priorityuploadrateArr$values = $values();
        $VALUES = priorityuploadrateArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(priorityuploadrateArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 103;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final priorityUploadRate onExtraCallbackWithResult(@NotNull CreditConsultingTime creditConsultingTime) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(creditConsultingTime, "");
            priorityUploadRate priorityuploadrateOnWarmupCompleted = onWarmupCompleted(creditConsultingTime.onExtraCallback());
            int i4 = onExtraCallback + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return priorityuploadrateOnWarmupCompleted;
            }
            throw null;
        }

        public final priorityUploadRate onWarmupCompleted(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                commonTestFlag.onExtraCallback.onWarmupCompleted("HH:mm", str);
                numValueOf.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Calendar calendarOnWarmupCompleted = commonTestFlag.onExtraCallback.onWarmupCompleted("HH:mm", str);
            numValueOf = calendarOnWarmupCompleted != null ? Integer.valueOf(calendarOnWarmupCompleted.get(11)) : null;
            if (numValueOf != null) {
                int i3 = onExtraCallback + 31;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (numValueOf.intValue() < 12) {
                    int i5 = onExtraCallback + 87;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return priorityUploadRate.AM;
                }
            }
            return priorityUploadRate.PM;
        }
    }
}
