package o;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class importCertV2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ importCertV2[] $VALUES;
    public static final onNavigationEvent Companion;
    public static final importCertV2 AUTOMATIC = new importCertV2("AUTOMATIC", 0);
    public static final importCertV2 HARDWARE = new importCertV2("HARDWARE", 1);
    public static final importCertV2 SOFTWARE = new importCertV2("SOFTWARE", 2);

    private static final /* synthetic */ importCertV2[] $values() {
        return new importCertV2[]{AUTOMATIC, HARDWARE, SOFTWARE};
    }

    public static EnumEntries<importCertV2> getEntries() {
        return $ENTRIES;
    }

    public static importCertV2 valueOf(String str) {
        return (importCertV2) Enum.valueOf(importCertV2.class, str);
    }

    public static importCertV2[] values() {
        return (importCertV2[]) $VALUES.clone();
    }

    private importCertV2(String str, int i) {
    }

    static {
        importCertV2[] importcertv2Arr$values = $values();
        $VALUES = importcertv2Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(importcertv2Arr$values);
        Companion = new onNavigationEvent(null);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final importCertV2 IAuthTabCallback(@Nullable String str) {
            String upperCase;
            if (str != null) {
                upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, BuildConfig.FLAVOR);
            } else {
                upperCase = null;
            }
            return Intrinsics.areEqual(upperCase, "HARDWARE") ? importCertV2.HARDWARE : Intrinsics.areEqual(upperCase, "SOFTWARE") ? importCertV2.SOFTWARE : importCertV2.AUTOMATIC;
        }
    }
}
