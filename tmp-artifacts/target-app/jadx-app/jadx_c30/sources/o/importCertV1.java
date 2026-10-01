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
public final class importCertV1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ importCertV1[] $VALUES;
    public static final onWarmupCompleted Companion;
    public static final importCertV1 COVER = new importCertV1("COVER", 0);
    public static final importCertV1 CONTAIN = new importCertV1("CONTAIN", 1);
    public static final importCertV1 CENTER = new importCertV1("CENTER", 2);

    private static final /* synthetic */ importCertV1[] $values() {
        return new importCertV1[]{COVER, CONTAIN, CENTER};
    }

    public static EnumEntries<importCertV1> getEntries() {
        return $ENTRIES;
    }

    public static importCertV1 valueOf(String str) {
        return (importCertV1) Enum.valueOf(importCertV1.class, str);
    }

    public static importCertV1[] values() {
        return (importCertV1[]) $VALUES.clone();
    }

    private importCertV1(String str, int i) {
    }

    static {
        importCertV1[] importcertv1Arr$values = $values();
        $VALUES = importcertv1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(importcertv1Arr$values);
        Companion = new onWarmupCompleted(null);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final importCertV1 onExtraCallback(@Nullable String str) {
            String lowerCase;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, BuildConfig.FLAVOR);
            } else {
                lowerCase = null;
            }
            return Intrinsics.areEqual(lowerCase, "cover") ? importCertV1.COVER : Intrinsics.areEqual(lowerCase, "center") ? importCertV1.CENTER : importCertV1.CONTAIN;
        }
    }
}
