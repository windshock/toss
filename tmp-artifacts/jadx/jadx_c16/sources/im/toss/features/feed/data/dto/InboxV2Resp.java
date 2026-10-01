package im.toss.features.feed.data.dto;

import im.toss.features.feed.data.dto.InboxMessageV2GroupDto$;
import im.toss.features.feed.data.dto.InboxMessageV2SubCategoryInfoDto$;
import im.toss.features.feed.data.dto.InboxMessageV2TabInfoDto$;
import im.toss.features.feed.data.dto.InboxV2Resp$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getDynamicHeight;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class InboxV2Resp {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<InboxMessageV2GroupDto> contents;
    private final Integer daysAgo;
    private final Integer prevMessageIndex;
    private final List<InboxMessageV2SubCategoryInfoDto> subCategoryInfos;
    private final List<InboxMessageV2TabInfoDto> tabInfo;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int $stable = 8;

    public InboxV2Resp() {
        this((List) null, (Integer) null, (List) null, (List) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i3) | i7);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i3)) | (~(i5 | i3));
        int i11 = i7 | i3;
        int i12 = i9 | i11;
        int i13 = i5 + i3 + i6 + ((-1542968645) * i) + (1789173782 * i2);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i5) + 752877568 + ((-368479342) * i3) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i6) + (1802502144 * i) + (148897792 * i2) + (289275904 * i14);
        int i16 = (i5 * (-930071408)) + 1959937684 + (i3 * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i6 * (-930070801)) + (i * 1059663509) + (i2 * (-1428764534)) + (i14 * 484573184);
        return i15 + ((i16 * i16) * 411172864) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            access100();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAccess100 = access100();
        int i3 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAccess100;
    }

    private static final /* synthetic */ KSerializer access000() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(InboxMessageV2TabInfoDto$.serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer access100() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(InboxMessageV2SubCategoryInfoDto$.serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return (KSerializer) IAuthTabCallback(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 2053045120, iOnWarmupCompleted, -2053045120, new Object[0], iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        KSerializer kSerializerAccess000;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerAccess000 = access000();
            int i3 = 40 / 0;
        } else {
            kSerializerAccess000 = access000();
        }
        int i4 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAccess000;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(InboxMessageV2GroupDto$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InboxV2Resp) {
            InboxV2Resp inboxV2Resp = (InboxV2Resp) obj;
            if (!Intrinsics.areEqual(this.contents, inboxV2Resp.contents)) {
                int i2 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.prevMessageIndex, inboxV2Resp.prevMessageIndex)) {
                int i4 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 80 / 0;
                }
                return false;
            }
            if (Intrinsics.areEqual(this.subCategoryInfos, inboxV2Resp.subCategoryInfos)) {
                if (!Intrinsics.areEqual(this.tabInfo, inboxV2Resp.tabInfo)) {
                    int i6 = onExtraCallbackWithResult + 21;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.daysAgo, inboxV2Resp.daysAgo)) {
                    int i8 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i8 % 128;
                    return i8 % 2 != 0;
                }
                int i9 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 95 / 0;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        List<InboxMessageV2GroupDto> list = this.contents;
        int iHashCode4 = 0;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        Integer num = this.prevMessageIndex;
        if (num == null) {
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        List<InboxMessageV2SubCategoryInfoDto> list2 = this.subCategoryInfos;
        if (list2 == null) {
            int i4 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list2.hashCode();
        }
        List<InboxMessageV2TabInfoDto> list3 = this.tabInfo;
        if (list3 == null) {
            int i6 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = list3.hashCode();
        }
        Integer num2 = this.daysAgo;
        if (num2 != null) {
            int i8 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                num2.hashCode();
                throw null;
            }
            iHashCode4 = num2.hashCode();
        }
        return (((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InboxV2Resp(contents=" + this.contents + ", prevMessageIndex=" + this.prevMessageIndex + ", subCategoryInfos=" + this.subCategoryInfos + ", tabInfo=" + this.tabInfo + ", daysAgo=" + this.daysAgo + ")";
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new InboxV2Resp$.ExternalSyntheticLambda0()), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new InboxV2Resp$.ExternalSyntheticLambda1()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new InboxV2Resp$.ExternalSyntheticLambda2()), null};
        int i = onExtraCallback + 55;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ InboxV2Resp(int i, List list, Integer num, List list2, List list3, Integer num2, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.contents = null;
        } else {
            this.contents = list;
        }
        if ((i & 2) == 0) {
            this.prevMessageIndex = null;
        } else {
            this.prevMessageIndex = num;
        }
        if ((i & 4) == 0) {
            this.subCategoryInfos = null;
        } else {
            this.subCategoryInfos = list2;
        }
        if ((i & 8) == 0) {
            this.tabInfo = null;
            int i2 = 2 % 2;
        } else {
            this.tabInfo = list3;
        }
        if ((i & 16) == 0) {
            this.daysAgo = null;
            int i3 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.daysAgo = num2;
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public InboxV2Resp(@Nullable List<InboxMessageV2GroupDto> list, @Nullable Integer num, @Nullable List<InboxMessageV2SubCategoryInfoDto> list2, @Nullable List<InboxMessageV2TabInfoDto> list3, @Nullable Integer num2) {
        this.contents = list;
        this.prevMessageIndex = num;
        this.subCategoryInfos = list2;
        this.tabInfo = list3;
        this.daysAgo = num2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r1
      0x0025: PHI (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:10:0x0023, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(InboxV2Resp inboxV2Resp, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                if (inboxV2Resp.contents != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), inboxV2Resp.contents);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || inboxV2Resp.prevMessageIndex != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, inboxV2Resp.prevMessageIndex);
        }
        if (true ^ vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i3 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (inboxV2Resp.subCategoryInfos != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), inboxV2Resp.subCategoryInfos);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || inboxV2Resp.tabInfo != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, (py) lazyArr[3].getValue(), inboxV2Resp.tabInfo);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i5 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            Integer num = inboxV2Resp.daysAgo;
            if (i6 == 0) {
                int i7 = 85 / 0;
                if (num == null) {
                    return;
                }
            } else if (num == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, inboxV2Resp.daysAgo);
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InboxV2Resp(List list, Integer num, List list2, List list3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num3;
        List list4;
        Integer num4 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            list4 = null;
        } else {
            list4 = list2;
        }
        List list5 = (i & 8) != 0 ? null : list3;
        if ((i & 16) != 0) {
            int i6 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 73 / 0;
            }
        } else {
            num4 = num2;
        }
        this(list, num3, list4, list5, num4);
    }

    public final List<InboxMessageV2GroupDto> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<InboxMessageV2GroupDto> list = this.contents;
        int i5 = i2 + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final Integer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.prevMessageIndex;
        int i4 = i2 + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        InboxV2Resp inboxV2Resp = (InboxV2Resp) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<InboxMessageV2SubCategoryInfoDto> list = inboxV2Resp.subCategoryInfos;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return list;
    }

    public final List<InboxMessageV2TabInfoDto> asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<InboxMessageV2TabInfoDto> list = this.tabInfo;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Integer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Integer num = this.daysAgo;
        int i5 = i3 + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (KSerializer) IAuthTabCallback(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 2053045120, iOnWarmupCompleted, -2053045120, new Object[0], iOnWarmupCompleted2);
    }

    public final List<InboxMessageV2SubCategoryInfoDto> onTransact() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (List) IAuthTabCallback(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -917682152, iOnWarmupCompleted, 917682153, new Object[]{this}, iOnWarmupCompleted2);
    }
}
