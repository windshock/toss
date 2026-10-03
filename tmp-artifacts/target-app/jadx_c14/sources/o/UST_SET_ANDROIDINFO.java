package o;

import im.toss.inventory_sdk.model.InventoryAdDto;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_SET_ANDROIDINFO extends toRealPath {
    private final onExtraCallback IAuthTabCallback;
    private InventoryAdDto onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_SET_ANDROIDINFO)) {
            return false;
        }
        UST_SET_ANDROIDINFO ust_set_androidinfo = (UST_SET_ANDROIDINFO) obj;
        return this.IAuthTabCallback == ust_set_androidinfo.IAuthTabCallback && Intrinsics.areEqual(this.onExtraCallbackWithResult, ust_set_androidinfo.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        InventoryAdDto inventoryAdDto = this.onExtraCallbackWithResult;
        return (iHashCode * 31) + (inventoryAdDto == null ? 0 : inventoryAdDto.hashCode());
    }

    public String toString() {
        return "InventorySdkViewModel(spaceType=" + this.IAuthTabCallback + ", inventoryAdDto=" + this.onExtraCallbackWithResult + ")";
    }

    public final onExtraCallback onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final void onExtraCallback(@Nullable InventoryAdDto inventoryAdDto) {
        this.onExtraCallbackWithResult = inventoryAdDto;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_SET_ANDROIDINFO(@NotNull onExtraCallback onextracallback, @Nullable InventoryAdDto inventoryAdDto) {
        super(toRealPath.onNavigationEvent.INVENTORY_SDK);
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.IAuthTabCallback = onextracallback;
        this.onExtraCallbackWithResult = inventoryAdDto;
    }

    public long onWarmupCompleted() {
        onExtraCallback onextracallback = this.IAuthTabCallback;
        return ("inventory-sdk-" + onextracallback).hashCode();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private final zzdt spaceId;
        public static final onExtraCallback TOSS_MONEY_DETAIL_20240527 = new onExtraCallback("TOSS_MONEY_DETAIL_20240527", 0, zzdt.TEENS_TOSS_MONEY_HISTORY);
        public static final onExtraCallback USS_HOME_20240718 = new onExtraCallback("USS_HOME_20240718", 1, zzdt.USS_HOME_20240718);
        public static final onExtraCallback SAVING_BOX_DETAIL = new onExtraCallback("SAVING_BOX_DETAIL", 2, zzdt.SAVING_BOX_DETAIL);
        public static final onExtraCallback FANGIRL_BOX_DETAIL = new onExtraCallback("FANGIRL_BOX_DETAIL", 3, zzdt.FANGIRL_BOX_DETAIL);
        public static final onExtraCallback SCHOOL_MEAL = new onExtraCallback("SCHOOL_MEAL", 4, zzdt.SCHOOL_MEAL);
        public static final onExtraCallback HENEM_BOX_DETAIL = new onExtraCallback("HENEM_BOX_DETAIL", 5, zzdt.HENEM_BOX_DETAIL);

        private static final /* synthetic */ onExtraCallback[] $values() {
            return new onExtraCallback[]{TOSS_MONEY_DETAIL_20240527, USS_HOME_20240718, SAVING_BOX_DETAIL, FANGIRL_BOX_DETAIL, SCHOOL_MEAL, HENEM_BOX_DETAIL};
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallback valueOf(String str) {
            return (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
        }

        public static onExtraCallback[] values() {
            return (onExtraCallback[]) $VALUES.clone();
        }

        private onExtraCallback(String str, int i, zzdt zzdtVar) {
            this.spaceId = zzdtVar;
        }

        public final zzdt getSpaceId() {
            return this.spaceId;
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
        }
    }
}
