package o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class addAnimatedEventToView {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("juminNo")
    private final String juminNo;

    @SerializedName("scrapingSeqNoList")
    private final ArrayList<String> scrapingSeqNoList;

    /* JADX WARN: Multi-variable type inference failed */
    public addAnimatedEventToView() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof addAnimatedEventToView)) {
            return false;
        }
        addAnimatedEventToView addanimatedeventtoview = (addAnimatedEventToView) obj;
        if (!Intrinsics.areEqual(this.juminNo, addanimatedeventtoview.juminNo)) {
            return false;
        }
        if (Intrinsics.areEqual(this.scrapingSeqNoList, addanimatedeventtoview.scrapingSeqNoList)) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.juminNo.hashCode() % 0) >> this.scrapingSeqNoList.hashCode() : (this.juminNo.hashCode() * 31) + this.scrapingSeqNoList.hashCode();
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HealthCareResultForHana(juminNo=" + this.juminNo + ", scrapingSeqNoList=" + this.scrapingSeqNoList + ")";
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public addAnimatedEventToView(@NotNull String str, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(arrayList, BuildConfig.FLAVOR);
        this.juminNo = str;
        this.scrapingSeqNoList = arrayList;
    }

    public /* synthetic */ addAnimatedEventToView(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
            int i7 = 2 % 2;
        }
        this(str, arrayList);
    }
}
