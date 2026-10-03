package o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class parseOptions {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("funnelId")
    private final long funnelId;

    @SerializedName("termsConsentStatesList")
    private final List<List<ResourcesUtil>> termsConsentStatesList;

    static {
        int i = onExtraCallback + 35;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseOptions)) {
            return false;
        }
        if (this.funnelId == ((parseOptions) obj).funnelId) {
            if (!(!Intrinsics.areEqual(this.termsConsentStatesList, r10.termsConsentStatesList))) {
                return true;
            }
            int i5 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 27;
        int i8 = i7 % 128;
        onExtraCallbackWithResult = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 51;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.funnelId) * 31) + this.termsConsentStatesList.hashCode();
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserPrepareListRequest(funnelId=" + this.funnelId + ", termsConsentStatesList=" + this.termsConsentStatesList + ")";
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public parseOptions(long j, @NotNull List<? extends List<ResourcesUtil>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.funnelId = j;
        this.termsConsentStatesList = list;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final List<ResourcesUtil> onNavigationEvent(@NotNull List<Long> list) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Number) obj).longValue() > 0) {
                    int i2 = onNavigationEvent + 93;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        arrayList.add(obj);
                        throw null;
                    }
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ResourcesUtil(((Number) it.next()).longValue(), "ACTIVE"));
            }
            int i3 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return arrayList2;
            }
            throw null;
        }
    }
}
