package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accessgetCodep {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("docList")
    private final List<WebDialog3> docList;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessgetCodep) {
            if (!Intrinsics.areEqual(this.docList, ((accessgetCodep) obj).docList)) {
                return false;
            }
            int i5 = onExtraCallback + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 85;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.docList.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.docList.hashCode();
        int i3 = onExtraCallback + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserDocumentList(docList=" + this.docList + ")";
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
        return str;
    }

    public final List<WebDialog3> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<WebDialog3> list = this.docList;
        int i4 = i2 + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
