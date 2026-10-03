package viva.republica.toss.network.model.notification.group;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getKekid;
import o.getWriggleLayout;
import o.liq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RecentMessageGroupDto {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String company;
    private final List<RecentMessagesDto> contents;
    private final boolean isAllBlocked;
    private final boolean isFold;
    private final boolean isMore;
    private final List<String> serviceCorporationCodes;
    private final String serviceIcon;
    private final long serviceId;
    private final String serviceName;
    private final long totalMessageCount;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i3 = onExtraCallback + 123;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ RecentMessageGroupDto IAuthTabCallback(RecentMessageGroupDto recentMessageGroupDto, long j, String str, String str2, long j2, List list, List list2, boolean z, boolean z2, String str3, boolean z3, int i, Object obj) {
        long j3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        long j4 = (i & 1) != 0 ? recentMessageGroupDto.serviceId : j;
        String str4 = (i & 2) != 0 ? recentMessageGroupDto.serviceName : str;
        String str5 = (i & 4) != 0 ? recentMessageGroupDto.serviceIcon : str2;
        if ((i & 8) != 0) {
            int i6 = i4 + 113;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                j3 = recentMessageGroupDto.totalMessageCount;
                int i7 = 57 / 0;
            } else {
                j3 = recentMessageGroupDto.totalMessageCount;
            }
        } else {
            j3 = j2;
        }
        List list3 = (i & 16) != 0 ? recentMessageGroupDto.serviceCorporationCodes : list;
        List list4 = (i & 32) != 0 ? recentMessageGroupDto.contents : list2;
        Object obj2 = null;
        if ((i & 64) != 0) {
            int i8 = i4 + 45;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                boolean z7 = recentMessageGroupDto.isAllBlocked;
                obj2.hashCode();
                throw null;
            }
            z4 = recentMessageGroupDto.isAllBlocked;
        } else {
            z4 = z;
        }
        if ((i & 128) != 0) {
            int i9 = IAuthTabCallback + 27;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                boolean z8 = recentMessageGroupDto.isMore;
                obj2.hashCode();
                throw null;
            }
            z5 = recentMessageGroupDto.isMore;
        } else {
            z5 = z2;
        }
        String str6 = (i & 256) != 0 ? recentMessageGroupDto.company : str3;
        if ((i & 512) != 0) {
            z6 = recentMessageGroupDto.isFold;
            int i10 = onExtraCallback + 115;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        } else {
            z6 = z3;
        }
        return recentMessageGroupDto.IAuthTabCallback(j4, str4, str5, j3, list3, list4, z4, z5, str6, z6);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RecentMessagesDto$$serializer.INSTANCE);
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i2 | i5);
        int i8 = (~i3) | (~i5);
        int i9 = (~i8) | i2;
        int i10 = (~(i5 | i3)) | (~((~i2) | i3)) | (~(i8 | i2));
        int i11 = i3 + i2 + i6 + ((-101282902) * i4) + ((-829309908) * i);
        int i12 = i11 * i11;
        int i13 = ((i3 * 42798203) - 224002048) + (42798203 * i2) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i6) + (1710751744 * i4) + ((-1643118592) * i) + ((-1134166016) * i12);
        int i14 = (i3 * 1745018779) + 1790267665 + (i2 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i6 * 1745018721) + (i4 * (-1587019414)) + (i * (-1871011668)) + (i12 * 1017511936);
        int i15 = i13 + (i14 * i14 * (-1139146752));
        return i15 != 1 ? i15 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = new Object[0];
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        if (i3 != 0) {
            throw null;
        }
        KSerializer kSerializer = (KSerializer) onExtraCallbackWithResult(objArr, iOnExtraCallback4, -1836880286, 1836880287, iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback2);
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializer;
        }
        obj.hashCode();
        throw null;
    }

    public final RecentMessageGroupDto IAuthTabCallback(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull List<String> list, @NotNull List<RecentMessagesDto> list2, boolean z, boolean z2, @Nullable String str3, boolean z3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        RecentMessageGroupDto recentMessageGroupDto = new RecentMessageGroupDto(j, str, str2, j2, list, list2, z, z2, str3, z3);
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return recentMessageGroupDto;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof RecentMessageGroupDto))) {
            RecentMessageGroupDto recentMessageGroupDto = (RecentMessageGroupDto) obj;
            if (this.serviceId != recentMessageGroupDto.serviceId) {
                return false;
            }
            if (!Intrinsics.areEqual(this.serviceName, recentMessageGroupDto.serviceName)) {
                int i2 = onExtraCallback + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.serviceIcon, recentMessageGroupDto.serviceIcon)) {
                int i4 = onExtraCallback + 69;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.totalMessageCount != recentMessageGroupDto.totalMessageCount) {
                int i6 = onExtraCallback + 29;
                IAuthTabCallback = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.serviceCorporationCodes, recentMessageGroupDto.serviceCorporationCodes) || !Intrinsics.areEqual(this.contents, recentMessageGroupDto.contents)) {
                return false;
            }
            if (this.isAllBlocked != recentMessageGroupDto.isAllBlocked) {
                int i7 = onExtraCallback + 61;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.isMore != recentMessageGroupDto.isMore) {
                int i9 = IAuthTabCallback + 13;
                onExtraCallback = i9 % 128;
                return i9 % 2 == 0;
            }
            if (!(!Intrinsics.areEqual(this.company, recentMessageGroupDto.company))) {
                if (this.isFold == recentMessageGroupDto.isFold) {
                    return true;
                }
                int i10 = IAuthTabCallback + 51;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 24 / 0;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.serviceId);
        int iHashCode3 = this.serviceName.hashCode();
        int iHashCode4 = this.serviceIcon.hashCode();
        int iHashCode5 = Long.hashCode(this.totalMessageCount);
        int iHashCode6 = this.serviceCorporationCodes.hashCode();
        int iHashCode7 = this.contents.hashCode();
        int iHashCode8 = Boolean.hashCode(this.isAllBlocked);
        int iHashCode9 = Boolean.hashCode(this.isMore);
        String str = this.company;
        if (str == null) {
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode10 = (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + Boolean.hashCode(this.isFold);
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode10;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecentMessageGroupDto(serviceId=" + this.serviceId + ", serviceName=" + this.serviceName + ", serviceIcon=" + this.serviceIcon + ", totalMessageCount=" + this.totalMessageCount + ", serviceCorporationCodes=" + this.serviceCorporationCodes + ", contents=" + this.contents + ", isAllBlocked=" + this.isAllBlocked + ", isMore=" + this.isMore + ", company=" + this.company + ", isFold=" + this.isFold + ")";
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecentMessageGroupDto> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RecentMessageGroupDto$$serializer recentMessageGroupDto$$serializer = RecentMessageGroupDto$$serializer.INSTANCE;
            int i4 = onExtraCallback + 55;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return recentMessageGroupDto$$serializer;
            }
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.notification.group.RecentMessageGroupDto$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 103;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = RecentMessageGroupDto.IAuthTabCallback();
                int i4 = onExtraCallback + 11;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.notification.group.RecentMessageGroupDto$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 101;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = RecentMessageGroupDto.onNavigationEvent();
                int i4 = onExtraCallback + 59;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), null, null, null, null};
        int i = onNavigationEvent + 123;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 66 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RecentMessageGroupDto(int r6, long r7, java.lang.String r9, java.lang.String r10, long r11, java.util.List r13, java.util.List r14, boolean r15, boolean r16, java.lang.String r17, boolean r18, o.okycx r19) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r1 & 39
            r3 = 39
            r4 = 2
            if (r3 == r2) goto L1d
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto$$serializer r2 = viva.republica.toss.network.model.notification.group.RecentMessageGroupDto$$serializer.INSTANCE
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.getDescriptor()
            o.htf31.onExtraCallbackWithResult(r6, r3, r2)
            int r2 = viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.IAuthTabCallback
            int r2 = r2 + 5
            int r3 = r2 % 128
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.onExtraCallback = r3
            int r2 = r2 % r4
            int r2 = r4 % r4
        L1d:
            r5.<init>()
            r2 = r7
            r0.serviceId = r2
            r2 = r9
            r0.serviceName = r2
            r2 = r10
            r0.serviceIcon = r2
            r2 = r1 & 8
            if (r2 != 0) goto L32
            r2 = 0
            r0.totalMessageCount = r2
            goto L37
        L32:
            r2 = r11
            r0.totalMessageCount = r2
            int r2 = r4 % r4
        L37:
            r2 = r1 & 16
            if (r2 != 0) goto L56
            int r2 = viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.onExtraCallback
            int r2 = r2 + 97
            int r3 = r2 % 128
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.IAuthTabCallback = r3
            int r2 = r2 % r4
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r0.serviceCorporationCodes = r2
            int r2 = viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.onExtraCallback
            int r2 = r2 + 3
            int r3 = r2 % 128
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.IAuthTabCallback = r3
            int r2 = r2 % r4
            if (r2 == 0) goto L59
            goto L5b
        L56:
            r2 = r13
            r0.serviceCorporationCodes = r2
        L59:
            int r2 = r4 % r4
        L5b:
            r2 = r14
            r0.contents = r2
            r2 = r1 & 64
            r3 = 0
            if (r2 != 0) goto L66
            r0.isAllBlocked = r3
            goto L69
        L66:
            r2 = r15
            r0.isAllBlocked = r2
        L69:
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 != 0) goto L71
            r0.isMore = r3
            int r4 = r4 % r4
            goto L75
        L71:
            r2 = r16
            r0.isMore = r2
        L75:
            r2 = r1 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L7b
            r2 = 0
            goto L7d
        L7b:
            r2 = r17
        L7d:
            r0.company = r2
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 != 0) goto L87
            r1 = 1
        L84:
            r0.isFold = r1
            return
        L87:
            r1 = r18
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.<init>(int, long, java.lang.String, java.lang.String, long, java.util.List, java.util.List, boolean, boolean, java.lang.String, boolean, o.okycx):void");
    }

    public RecentMessageGroupDto(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull List<String> list, @NotNull List<RecentMessagesDto> list2, boolean z, boolean z2, @Nullable String str3, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.serviceId = j;
        this.serviceName = str;
        this.serviceIcon = str2;
        this.totalMessageCount = j2;
        this.serviceCorporationCodes = list;
        this.contents = list2;
        this.isAllBlocked = z;
        this.isMore = z2;
        this.company = str3;
        this.isFold = z3;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.notification.group.RecentMessageGroupDto r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.$childSerializers
            r2 = 0
            long r3 = r8.serviceId
            r9.onExtraCallback(r10, r2, r3)
            java.lang.String r2 = r8.serviceName
            r3 = 1
            r9.onExtraCallback(r10, r3, r2)
            java.lang.String r2 = r8.serviceIcon
            r9.onExtraCallback(r10, r0, r2)
            r2 = 3
            boolean r4 = r9.onWarmupCompleted(r10, r2)
            if (r4 == r3) goto L25
            long r4 = r8.totalMessageCount
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2a
        L25:
            long r4 = r8.totalMessageCount
            r9.onExtraCallback(r10, r2, r4)
        L2a:
            r2 = 4
            boolean r4 = r9.onWarmupCompleted(r10, r2)
            if (r4 != 0) goto L3d
            java.util.List<java.lang.String> r4 = r8.serviceCorporationCodes
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L4a
        L3d:
            r4 = r1[r2]
            java.lang.Object r4 = r4.getValue()
            o.py r4 = (o.py) r4
            java.util.List<java.lang.String> r5 = r8.serviceCorporationCodes
            r9.onNavigationEvent(r10, r2, r4, r5)
        L4a:
            r2 = 5
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.notification.group.RecentMessagesDto> r4 = r8.contents
            r9.onNavigationEvent(r10, r2, r1, r4)
            r1 = 6
            boolean r2 = r9.onWarmupCompleted(r10, r1)
            if (r2 != 0) goto L63
            boolean r2 = r8.isAllBlocked
            if (r2 == 0) goto L68
        L63:
            boolean r2 = r8.isAllBlocked
            r9.onNavigationEvent(r10, r1, r2)
        L68:
            r1 = 7
            boolean r2 = r9.onWarmupCompleted(r10, r1)
            if (r2 != 0) goto L75
            boolean r2 = r8.isMore
            r2 = r2 ^ r3
            if (r2 == 0) goto L75
            goto L83
        L75:
            boolean r2 = r8.isMore
            r9.onNavigationEvent(r10, r1, r2)
            int r1 = viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.onExtraCallback
            int r1 = r1 + 29
            int r2 = r1 % 128
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.IAuthTabCallback = r2
            int r1 = r1 % r0
        L83:
            r1 = 8
            boolean r2 = r9.onWarmupCompleted(r10, r1)
            if (r2 != 0) goto L98
            int r2 = viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.onExtraCallback
            int r2 = r2 + 97
            int r4 = r2 % 128
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.IAuthTabCallback = r4
            int r2 = r2 % r0
            java.lang.String r0 = r8.company
            if (r0 == 0) goto L9f
        L98:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r2 = r8.company
            r9.onExtraCallbackWithResult(r10, r1, r0, r2)
        L9f:
            r0 = 9
            boolean r1 = r9.onWarmupCompleted(r10, r0)
            if (r1 == r3) goto Lab
            boolean r1 = r8.isFold
            if (r1 == r3) goto Lb0
        Lab:
            boolean r8 = r8.isFold
            r9.onNavigationEvent(r10, r0, r8)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.notification.group.RecentMessageGroupDto.onExtraCallbackWithResult(viva.republica.toss.network.model.notification.group.RecentMessageGroupDto, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long j;
        RecentMessageGroupDto recentMessageGroupDto = (RecentMessageGroupDto) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            j = recentMessageGroupDto.serviceId;
            int i3 = 84 / 0;
        } else {
            j = recentMessageGroupDto.serviceId;
        }
        return Long.valueOf(j);
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.serviceName;
        int i4 = i2 + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RecentMessageGroupDto recentMessageGroupDto = (RecentMessageGroupDto) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = recentMessageGroupDto.serviceIcon;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final List<String> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<String> list = this.serviceCorporationCodes;
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<RecentMessagesDto> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<RecentMessagesDto> list = this.contents;
        int i5 = i3 + 95;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isAllBlocked;
        int i4 = i3 + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.company;
        int i5 = i3 + 39;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer access000() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (KSerializer) onExtraCallbackWithResult(new Object[0], getKekid.onExtraCallback(), -1836880286, 1836880287, getKekid.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2);
    }

    public final String IAuthTabCallbackStub() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return (String) onExtraCallbackWithResult(new Object[]{this}, getKekid.onExtraCallback(), -254311465, 254311467, getKekid.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2);
    }

    public final long asInterface() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return ((Long) onExtraCallbackWithResult(new Object[]{this}, getKekid.onExtraCallback(), -363721980, 363721980, getKekid.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2)).longValue();
    }
}
