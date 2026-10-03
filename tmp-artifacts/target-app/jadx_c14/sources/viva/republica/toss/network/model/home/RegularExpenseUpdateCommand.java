package viva.republica.toss.network.model.home;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RegularExpenseUpdateCommand {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String brandName;
    private final String category;
    private final String categorySmall;
    private final long expenseAmount;
    private final String expenseDate;
    private final String imageUrl;
    private final String itemType;
    private final RegularExpenseUpdateOperation operation;
    private final String title;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RegularExpenseUpdateCommand)) {
            return false;
        }
        RegularExpenseUpdateCommand regularExpenseUpdateCommand = (RegularExpenseUpdateCommand) obj;
        if (this.operation != regularExpenseUpdateCommand.operation) {
            int i4 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.category, regularExpenseUpdateCommand.category) || !Intrinsics.areEqual(this.brandName, regularExpenseUpdateCommand.brandName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.expenseDate, regularExpenseUpdateCommand.expenseDate)) {
            int i6 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.expenseAmount != regularExpenseUpdateCommand.expenseAmount) {
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, regularExpenseUpdateCommand.imageUrl)) {
            int i8 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i8 % 128;
            return i8 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.itemType, regularExpenseUpdateCommand.itemType)) {
            return Intrinsics.areEqual(this.categorySmall, regularExpenseUpdateCommand.categorySmall) && Intrinsics.areEqual(this.title, regularExpenseUpdateCommand.title);
        }
        int i9 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.operation.hashCode();
        int iHashCode3 = this.category.hashCode();
        int iHashCode4 = this.brandName.hashCode();
        int iHashCode5 = this.expenseDate.hashCode();
        int iHashCode6 = Long.hashCode(this.expenseAmount);
        int iHashCode7 = this.imageUrl.hashCode();
        int iHashCode8 = this.itemType.hashCode();
        String str = this.categorySmall;
        int iHashCode9 = 0;
        if (str == null) {
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.title;
        if (str2 != null) {
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode9 = str2.hashCode();
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RegularExpenseUpdateCommand(operation=" + this.operation + ", category=" + this.category + ", brandName=" + this.brandName + ", expenseDate=" + this.expenseDate + ", expenseAmount=" + this.expenseAmount + ", imageUrl=" + this.imageUrl + ", itemType=" + this.itemType + ", categorySmall=" + this.categorySmall + ", title=" + this.title + ")";
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RegularExpenseUpdateCommand(@NotNull RegularExpenseUpdateOperation regularExpenseUpdateOperation, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(regularExpenseUpdateOperation, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.operation = regularExpenseUpdateOperation;
        this.category = str;
        this.brandName = str2;
        this.expenseDate = str3;
        this.expenseAmount = j;
        this.imageUrl = str4;
        this.itemType = str5;
        this.categorySmall = str6;
        this.title = str7;
    }
}
