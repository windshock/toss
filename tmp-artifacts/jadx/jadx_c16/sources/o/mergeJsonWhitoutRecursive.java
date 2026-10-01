package o;

import im.toss.inventory_sdk.model.InventoryAdDto;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class mergeJsonWhitoutRecursive {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    public static final int onExtraCallbackWithResult = InventoryAdDto.$stable;
    private static int onTransact;
    private final String onNavigationEvent;
    private final InventoryAdDto onWarmupCompleted;

    static {
        int i = onExtraCallback + 77;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 49;
            onTransact = i2 % 128;
            return i2 % 2 == 0;
        }
        if (obj instanceof mergeJsonWhitoutRecursive) {
            mergeJsonWhitoutRecursive mergejsonwhitoutrecursive = (mergeJsonWhitoutRecursive) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, mergejsonwhitoutrecursive.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, mergejsonwhitoutrecursive.onWarmupCompleted);
        }
        int i3 = onTransact + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        int i4 = onTransact + 13;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CashflowInventoryAdState(itemId=" + this.onNavigationEvent + ", inventoryAd=" + this.onWarmupCompleted + ")";
        int i2 = onTransact + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public mergeJsonWhitoutRecursive(@NotNull String str, @NotNull InventoryAdDto inventoryAdDto) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(inventoryAdDto, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = inventoryAdDto;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final InventoryAdDto onExtraCallbackWithResult() {
        InventoryAdDto inventoryAdDto;
        int i = 2 % 2;
        int i2 = asBinder + 63;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            inventoryAdDto = this.onWarmupCompleted;
            int i4 = 31 / 0;
        } else {
            inventoryAdDto = this.onWarmupCompleted;
        }
        int i5 = i3 + 67;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return inventoryAdDto;
    }
}
