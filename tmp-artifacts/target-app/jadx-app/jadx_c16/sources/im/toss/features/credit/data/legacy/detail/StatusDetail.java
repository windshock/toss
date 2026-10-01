package im.toss.features.credit.data.legacy.detail;

import im.toss.features.credit.data.legacy.detail.StatusDetail$;
import im.toss.features.credit.data.legacy.detail.StatusDetailSection$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class StatusDetail {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final Integer cardProviderCode;
    private final String headerText;
    private final String organizationName;
    private final List<StatusDetailSection> sections;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new StatusDetail$.ExternalSyntheticLambda0())};

    public StatusDetail() {
        this((String) null, (String) null, (Integer) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(StatusDetailSection$.serializer.INSTANCE);
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface();
        }
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusDetail)) {
            return false;
        }
        StatusDetail statusDetail = (StatusDetail) obj;
        if (!Intrinsics.areEqual(this.headerText, statusDetail.headerText) || !Intrinsics.areEqual(this.organizationName, statusDetail.organizationName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cardProviderCode, statusDetail.cardProviderCode)) {
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.sections, statusDetail.sections)) {
            return true;
        }
        int i5 = onExtraCallback + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? (str = this.headerText) != null : (str = this.headerText) != null) ? str.hashCode() : 0;
        int iHashCode2 = this.organizationName.hashCode();
        Integer num = this.cardProviderCode;
        int iHashCode3 = (((((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.sections.hashCode();
        int i3 = onWarmupCompleted + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatusDetail(headerText=" + this.headerText + ", organizationName=" + this.organizationName + ", cardProviderCode=" + this.cardProviderCode + ", sections=" + this.sections + ")";
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallback + 27;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
    }

    public /* synthetic */ StatusDetail(int i, String str, String str2, Integer num, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            str = null;
        }
        this.headerText = str;
        if ((i & 2) == 0) {
            int i3 = onExtraCallback + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.organizationName = "";
            if (i4 == 0) {
                throw null;
            }
            int i5 = 2 % 2;
        } else {
            this.organizationName = str2;
        }
        if ((i & 4) == 0) {
            this.cardProviderCode = 0;
        } else {
            this.cardProviderCode = num;
        }
        if ((i & 8) != 0) {
            this.sections = list;
            return;
        }
        this.sections = CollectionsKt.emptyList();
        int i6 = onExtraCallback + 17;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public StatusDetail(@Nullable String str, @NotNull String str2, @Nullable Integer num, @NotNull List<StatusDetailSection> list) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.headerText = str;
        this.organizationName = str2;
        this.cardProviderCode = num;
        this.sections = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(StatusDetail statusDetail, vyl vylVar, SerialDescriptor serialDescriptor) {
        Integer num;
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                String str = statusDetail.headerText;
                throw null;
            }
            if (statusDetail.headerText != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, statusDetail.headerText);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onWarmupCompleted + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(statusDetail.organizationName, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, statusDetail.organizationName);
                int i5 = onWarmupCompleted + 45;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (num = statusDetail.cardProviderCode) == null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, statusDetail.cardProviderCode);
        } else {
            int i7 = onExtraCallback + 13;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (num.intValue() != 0) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(statusDetail.sections, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), statusDetail.sections);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StatusDetail(String str, String str2, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str2 = "";
        }
        num = (i & 4) != 0 ? 0 : num;
        if ((i & 8) != 0) {
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            list = CollectionsKt.emptyList();
            int i5 = 2 % 2;
        }
        this(str, str2, num, list);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.headerText;
        int i5 = i3 + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.organizationName;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.cardProviderCode;
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return num;
    }

    public final List<StatusDetailSection> onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<StatusDetailSection> list = this.sections;
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
