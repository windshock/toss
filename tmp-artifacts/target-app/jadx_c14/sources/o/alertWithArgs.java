package o;

import android.os.Process;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class alertWithArgs {
    private static int onExtraCallback = 1;
    public static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static int onWarmupCompleted;

    @SerializedName("juminNo")
    private final String juminNo;

    @SerializedName("scrapingSeqNoList")
    private final ArrayList<String> scrapingSeqNoList;

    /* JADX WARN: Multi-variable type inference failed */
    public alertWithArgs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alertWithArgs)) {
            return false;
        }
        alertWithArgs alertwithargs = (alertWithArgs) obj;
        if (!Intrinsics.areEqual(this.juminNo, alertwithargs.juminNo)) {
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.scrapingSeqNoList, alertwithargs.scrapingSeqNoList)) {
            return true;
        }
        int i4 = onExtraCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.juminNo.hashCode() * 31) + this.scrapingSeqNoList.hashCode();
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubmitRespModel(juminNo=" + this.juminNo + ", scrapingSeqNoList=" + this.scrapingSeqNoList + ")";
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public alertWithArgs(@NotNull String str, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.juminNo = str;
        this.scrapingSeqNoList = arrayList;
    }

    public /* synthetic */ alertWithArgs(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
            int i3 = onNavigationEvent + 105;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 4;
            } else {
                int i5 = 2 % 2;
            }
        }
        this(str, arrayList);
    }

    public static int onExtraCallbackWithResult() {
        int i = onWarmupCompleted;
        int i2 = i % 6624718;
        onWarmupCompleted = i + 1;
        if (i2 != 0) {
            return onExtraCallbackWithResult;
        }
        int iMyPid = Process.myPid();
        onExtraCallbackWithResult = iMyPid;
        return iMyPid;
    }
}
