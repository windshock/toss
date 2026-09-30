package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class setHorizonWorldUrlLauncher {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("issuers")
    private List<? extends AudienceNetworkExportedActivityApi> issuers;

    @SerializedName("version")
    private String version;

    /* JADX WARN: Multi-variable type inference failed */
    public setHorizonWorldUrlLauncher() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public setHorizonWorldUrlLauncher(@NotNull List<? extends AudienceNetworkExportedActivityApi> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.issuers = list;
        this.version = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setHorizonWorldUrlLauncher(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 99;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 69;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        this(list, str);
    }
}
