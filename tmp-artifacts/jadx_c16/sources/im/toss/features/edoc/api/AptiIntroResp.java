package im.toss.features.edoc.api;

import im.toss.features.edoc.api.AptiDescription$;
import im.toss.features.edoc.api.AptiIntroResp$;
import im.toss.features.edoc.api.AptiMenu$;
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
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AptiIntroResp {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<AptiDescription> descriptions;
    private final String logoImageUrl;
    private final AptiMenu menu;
    private final String subTitle;
    private final String title;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AptiIntroResp$.ExternalSyntheticLambda0()), null};

    public AptiIntroResp() {
        this((String) null, (String) null, (String) null, (List) null, (AptiMenu) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AptiDescription$.serializer.INSTANCE);
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptiIntroResp)) {
            int i5 = i2 + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        AptiIntroResp aptiIntroResp = (AptiIntroResp) obj;
        if (!Intrinsics.areEqual(this.title, aptiIntroResp.title) || !Intrinsics.areEqual(this.subTitle, aptiIntroResp.subTitle) || !Intrinsics.areEqual(this.logoImageUrl, aptiIntroResp.logoImageUrl) || !Intrinsics.areEqual(this.descriptions, aptiIntroResp.descriptions)) {
            return false;
        }
        if (Intrinsics.areEqual(this.menu, aptiIntroResp.menu)) {
            return true;
        }
        int i7 = onNavigationEvent + 37;
        onExtraCallback = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.subTitle.hashCode();
        int iHashCode3 = this.logoImageUrl.hashCode();
        int iHashCode4 = this.descriptions.hashCode();
        AptiMenu aptiMenu = this.menu;
        if (aptiMenu == null) {
            int i5 = onExtraCallback;
            int i6 = i5 + 33;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 11;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        } else {
            int iHashCode5 = aptiMenu.hashCode();
            int i10 = onExtraCallback + 59;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            i = iHashCode5;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AptiIntroResp(title=" + this.title + ", subTitle=" + this.subTitle + ", logoImageUrl=" + this.logoImageUrl + ", descriptions=" + this.descriptions + ", menu=" + this.menu + ")";
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }

    public /* synthetic */ AptiIntroResp(int i, String str, String str2, String str3, List list, AptiMenu aptiMenu, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i3 = onNavigationEvent + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.subTitle = "";
        } else {
            this.subTitle = str2;
            int i5 = onNavigationEvent + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        Object obj = null;
        if ((i & 4) == 0) {
            int i8 = onExtraCallback + 41;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            this.logoImageUrl = "";
            if (i9 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.logoImageUrl = str3;
            int i10 = onNavigationEvent + 51;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            this.descriptions = CollectionsKt.emptyList();
            int i12 = 2 % 2;
        } else {
            this.descriptions = list;
        }
        if ((i & 16) == 0) {
            this.menu = null;
        } else {
            this.menu = aptiMenu;
        }
    }

    public AptiIntroResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<AptiDescription> list, @Nullable AptiMenu aptiMenu) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.subTitle = str2;
        this.logoImageUrl = str3;
        this.descriptions = list;
        this.menu = aptiMenu;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 72 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i2 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r1
      0x0033: PHI (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:10:0x0031, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(AptiIntroResp aptiIntroResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i3 = onExtraCallback + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (!Intrinsics.areEqual(aptiIntroResp.title, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, aptiIntroResp.title);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1)) || !Intrinsics.areEqual(aptiIntroResp.subTitle, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, aptiIntroResp.subTitle);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(aptiIntroResp.logoImageUrl, "")) {
            vylVar.onExtraCallback(serialDescriptor, 2, aptiIntroResp.logoImageUrl);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i5 = onExtraCallback + 45;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                if (!Intrinsics.areEqual(aptiIntroResp.descriptions, CollectionsKt.emptyList())) {
                    vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), aptiIntroResp.descriptions);
                }
            } else {
                Intrinsics.areEqual(aptiIntroResp.descriptions, CollectionsKt.emptyList());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i6 = onNavigationEvent + 11;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (aptiIntroResp.menu != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, AptiMenu$.serializer.INSTANCE, aptiIntroResp.menu);
            }
        }
        int i8 = onExtraCallback + 123;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 0 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AptiIntroResp(String str, String str2, String str3, List list, AptiMenu aptiMenu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = "";
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 94 / 0;
            }
            int i4 = 2 % 2;
        } else {
            str4 = str3;
        }
        if ((i & 8) != 0) {
            int i5 = onNavigationEvent + 15;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        if ((i & 16) != 0) {
            int i7 = onExtraCallback + 31;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            aptiMenu = null;
        }
        this(str5, str6, str4, list2, aptiMenu);
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.subTitle;
            int i4 = 98 / 0;
        } else {
            str = this.subTitle;
        }
        int i5 = i2 + 31;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logoImageUrl;
        int i5 = i2 + 103;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<AptiDescription> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<AptiDescription> list = this.descriptions;
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AptiMenu onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.menu;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
