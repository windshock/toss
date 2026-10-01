package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignedData {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getSignedData[] $VALUES;
    public static final onExtraCallback Companion;
    public static final getSignedData PAYMENT = new getSignedData("PAYMENT", 0);
    public static final getSignedData DEFAULT = new getSignedData("DEFAULT", 1);

    private static final /* synthetic */ getSignedData[] $values() {
        return new getSignedData[]{PAYMENT, DEFAULT};
    }

    public static EnumEntries<getSignedData> getEntries() {
        return $ENTRIES;
    }

    public static getSignedData valueOf(String str) {
        return (getSignedData) Enum.valueOf(getSignedData.class, str);
    }

    public static getSignedData[] values() {
        return (getSignedData[]) $VALUES.clone();
    }

    private getSignedData(String str, int i) {
    }

    static {
        getSignedData[] getsigneddataArr$values = $values();
        $VALUES = getsigneddataArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getsigneddataArr$values);
        Companion = new onExtraCallback(null);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final getSignedData IAuthTabCallback(@Nullable String str) {
            Object objM31constructorimpl;
            try {
                Result.Companion companion = Result.Companion;
                if (str == null) {
                    str = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                objM31constructorimpl = Result.m31constructorimpl(getSignedData.valueOf(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            getSignedData getsigneddata = getSignedData.DEFAULT;
            if (Result.onExtraCallback(objM31constructorimpl)) {
                objM31constructorimpl = getsigneddata;
            }
            return (getSignedData) objM31constructorimpl;
        }
    }
}
