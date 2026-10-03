package o;

import android.content.Context;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.HexTranslator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Hex {
    public static final Hex onNavigationEvent = new Hex();

    private Hex() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private final String logValue;
        public static final onExtraCallbackWithResult ONBOARDING = new onExtraCallbackWithResult("ONBOARDING", 0, "onboarding");
        public static final onExtraCallbackWithResult LOGGED_IN = new onExtraCallbackWithResult("LOGGED_IN", 1, "logged_in");

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            return new onExtraCallbackWithResult[]{ONBOARDING, LOGGED_IN};
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            return (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
        }

        public static onExtraCallbackWithResult[] values() {
            return (onExtraCallbackWithResult[]) $VALUES.clone();
        }

        private onExtraCallbackWithResult(String str, int i, String str2) {
            this.logValue = str2;
        }

        public final String getLogValue() {
            return this.logValue;
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
        }
    }

    public final void onWarmupCompleted(@NotNull Context context, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        HexTranslator.onNavigationEvent onNavigationEvent2 = HexTranslator.onNavigationEvent(HexTranslator.onWarmupCompleted, context, null, false, 2, null);
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "VisitorGmsStatus", "Visitor Google Play Service status.", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("phase", onextracallbackwithresult.getLogValue()), getWrite.IAuthTabCallback("gms_available", Boolean.valueOf(onNavigationEvent2.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("gms_status", onNavigationEvent2.onNavigationEvent().onExtraCallbackWithResult()), getWrite.IAuthTabCallback("gms_result_code", Integer.valueOf(onNavigationEvent2.onExtraCallback())), getWrite.IAuthTabCallback("gms_package_usable", Boolean.valueOf(onNavigationEvent2.onWarmupCompleted()))}), (String) null, false, (String) null, 56, (Object) null);
    }
}
