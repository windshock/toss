package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class AudienceNetworkExportedActivityApi {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("availableServices")
    private List<String> availableServices;

    @SerializedName("chPhoneNumber")
    private String chPhoneNumber;

    @SerializedName("code")
    private int code;

    @SerializedName("displayName")
    private String displayName;

    @SerializedName("fields")
    private List<? extends setMessageHandler> fields;

    @SerializedName("findIdUrl")
    private String findIdUrl;

    @SerializedName("issuer")
    private String issuer;

    @SerializedName("largeLogoImageUrl")
    private String largeLogoImageUrl;

    @SerializedName("loginMethods")
    private List<String> loginMethods;

    @SerializedName("logoUrl")
    private String logoUrl;

    @SerializedName("smallLogoImageUrl")
    private String smallLogoImageUrl;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int $stable = 8;
    private static final AudienceNetworkExportedActivityApi EMPTY = new AudienceNetworkExportedActivityApi(null, 0, null, null, null, null, null, null, null, null, null, 2047, null);

    public AudienceNetworkExportedActivityApi() {
        this(null, 0, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public AudienceNetworkExportedActivityApi(@NotNull String str, int i, @NotNull String str2, @Nullable String str3, @NotNull List<? extends setMessageHandler> list, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull List<String> list2, @NotNull List<String> list3, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list3, BuildConfig.FLAVOR);
        this.issuer = str;
        this.code = i;
        this.displayName = str2;
        this.findIdUrl = str3;
        this.fields = list;
        this.logoUrl = str4;
        this.largeLogoImageUrl = str5;
        this.smallLogoImageUrl = str6;
        this.availableServices = list2;
        this.loginMethods = list3;
        this.chPhoneNumber = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AudienceNetworkExportedActivityApi(String str, int i, String str2, String str3, List list, String str4, String str5, String str6, List list2, List list3, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        int i3;
        List listEmptyList;
        String str9;
        List listEmptyList2;
        List listEmptyList3;
        int i4 = i2 & 1;
        String str10 = BuildConfig.FLAVOR;
        if (i4 != 0) {
            int i5 = onExtraCallback + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
            } else {
                int i7 = 2 % 2;
            }
            str8 = BuildConfig.FLAVOR;
        } else {
            str8 = str;
        }
        if ((i2 & 2) != 0) {
            int i8 = onExtraCallback + 7;
            onWarmupCompleted = i8 % 128;
            i3 = i8 % 2 != 0 ? 1 : 0;
            int i9 = 2 % 2;
        } else {
            i3 = i;
        }
        String str11 = (i2 & 4) != 0 ? BuildConfig.FLAVOR : str2;
        String str12 = (i2 & 8) != 0 ? BuildConfig.FLAVOR : str3;
        Object obj = null;
        if ((i2 & 16) != 0) {
            int i10 = onWarmupCompleted + 107;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        if ((i2 & 32) != 0) {
            int i11 = onExtraCallback + 105;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str9 = BuildConfig.FLAVOR;
        } else {
            str9 = str4;
        }
        String str13 = (i2 & 64) != 0 ? BuildConfig.FLAVOR : str5;
        String str14 = (i2 & 128) != 0 ? BuildConfig.FLAVOR : str6;
        if ((i2 & 256) != 0) {
            int i12 = onExtraCallback + 29;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList2 = CollectionsKt.emptyList();
            int i13 = 2 % 2;
        } else {
            listEmptyList2 = list2;
        }
        if ((i2 & 512) != 0) {
            int i14 = onWarmupCompleted + 39;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            listEmptyList3 = CollectionsKt.emptyList();
        } else {
            listEmptyList3 = list3;
        }
        if ((i2 & 1024) != 0) {
            int i16 = onExtraCallback + 59;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
        } else {
            str10 = str7;
        }
        this(str8, i3, str11, str12, listEmptyList, str9, str13, str14, listEmptyList2, listEmptyList3, str10);
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.displayName;
        int i5 = i3 + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return str;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        int i = onNavigationEvent + 47;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
