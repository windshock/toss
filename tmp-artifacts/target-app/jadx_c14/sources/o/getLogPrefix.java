package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getLogPrefix {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final List<CppSystemErrorException> termsList;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getLogPrefix)) {
            return false;
        }
        if (Intrinsics.areEqual(this.termsList, ((getLogPrefix) obj).termsList)) {
            return true;
        }
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.termsList.hashCode();
        int i4 = onNavigationEvent + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserTermsListResponse(termsList=" + this.termsList + ")";
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<CppSystemErrorException> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<CppSystemErrorException> list = this.termsList;
        int i5 = i2 + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
