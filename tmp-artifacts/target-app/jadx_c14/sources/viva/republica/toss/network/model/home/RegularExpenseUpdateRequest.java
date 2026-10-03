package viva.republica.toss.network.model.home;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RegularExpenseUpdateRequest {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final List<RegularExpenseUpdateCommand> commands;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RegularExpenseUpdateRequest)) {
            int i4 = onExtraCallbackWithResult + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.commands, ((RegularExpenseUpdateRequest) obj).commands)) {
            return true;
        }
        int i6 = onExtraCallback + 65;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.commands.hashCode();
        int i4 = onExtraCallbackWithResult + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RegularExpenseUpdateRequest(commands=" + this.commands + ")";
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return str;
    }

    public RegularExpenseUpdateRequest(@NotNull List<RegularExpenseUpdateCommand> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.commands = list;
    }
}
