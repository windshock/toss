package o;

import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onPreviewReleased {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onPreviewReleased[] $VALUES;
    public static final onWarmupCompleted Companion;
    private final String apiValue;
    private final String code;
    private final String displayName;
    private final int displayNameResId;
    public static final onPreviewReleased OFFICE_WORKER = new onPreviewReleased("OFFICE_WORKER", 0, "01", "회사원", "OFFICE_WORKER", R.string.app_job_type_employee);
    public static final onPreviewReleased SELF_BUSINESS = new onPreviewReleased("SELF_BUSINESS", 1, "02", "개인사업자", "INDEPENDENT", R.string.app_job_type_independent);
    public static final onPreviewReleased CIVIL_OFFICER = new onPreviewReleased("CIVIL_OFFICER", 2, "03", "공무원", "PUBLIC_SERVANT", R.string.app_job_type_public_servant);
    public static final onPreviewReleased UNEMPLOYED = new onPreviewReleased("UNEMPLOYED", 3, "04", "무직 (주부 등)", "HOMEMAKER", R.string.app_job_type_no_job);
    public static final onPreviewReleased ETC = new onPreviewReleased("ETC", 4, "99", "기타 (프리랜서, 아르바이트 등)", "ETC", R.string.app_job_type_etc);

    private static final /* synthetic */ onPreviewReleased[] $values() {
        return new onPreviewReleased[]{OFFICE_WORKER, SELF_BUSINESS, CIVIL_OFFICER, UNEMPLOYED, ETC};
    }

    public static EnumEntries<onPreviewReleased> getEntries() {
        return $ENTRIES;
    }

    public static onPreviewReleased valueOf(String str) {
        return (onPreviewReleased) Enum.valueOf(onPreviewReleased.class, str);
    }

    public static onPreviewReleased[] values() {
        return (onPreviewReleased[]) $VALUES.clone();
    }

    private onPreviewReleased(String str, int i, String str2, String str3, String str4, int i2) {
        this.code = str2;
        this.displayName = str3;
        this.apiValue = str4;
        this.displayNameResId = i2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final int getDisplayNameResId() {
        return this.displayNameResId;
    }

    static {
        onPreviewReleased[] onpreviewreleasedArr$values = $values();
        $VALUES = onpreviewreleasedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(onpreviewreleasedArr$values);
        Companion = new onWarmupCompleted(null);
    }

    public final boolean isUnemployed() {
        return this == UNEMPLOYED;
    }

    public final boolean isNeedJobInfo() {
        return CollectionsKt.listOf(new onPreviewReleased[]{OFFICE_WORKER, SELF_BUSINESS, CIVIL_OFFICER}).contains(this);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final onPreviewReleased onExtraCallback(@Nullable String str) {
            if (str == null) {
                str = "";
            }
            onPreviewReleased onpreviewreleased = onPreviewReleased.OFFICE_WORKER;
            if (Intrinsics.areEqual(str, onpreviewreleased.getCode())) {
                return onpreviewreleased;
            }
            onPreviewReleased onpreviewreleased2 = onPreviewReleased.SELF_BUSINESS;
            if (Intrinsics.areEqual(str, onpreviewreleased2.getCode())) {
                return onpreviewreleased2;
            }
            onPreviewReleased onpreviewreleased3 = onPreviewReleased.CIVIL_OFFICER;
            if (Intrinsics.areEqual(str, onpreviewreleased3.getCode())) {
                return onpreviewreleased3;
            }
            onPreviewReleased onpreviewreleased4 = onPreviewReleased.UNEMPLOYED;
            return Intrinsics.areEqual(str, onpreviewreleased4.getCode()) ? onpreviewreleased4 : onPreviewReleased.ETC;
        }
    }
}
