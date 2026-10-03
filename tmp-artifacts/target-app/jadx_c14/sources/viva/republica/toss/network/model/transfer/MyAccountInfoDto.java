package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.MyAccountInfoDto$;
import viva.republica.toss.network.model.transfer.MyAccountInfoDto$RecommendedAccountInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MyAccountInfoDto {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final MyAccountInfo myAccount;
    private final RecommendedAccountInfo recommendedAccount;
    private final List<MyAccountInfo> registeredAccounts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.MyAccountInfoDto$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = MyAccountInfoDto.onNavigationEvent();
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    }), null};

    public MyAccountInfoDto() {
        this((RecommendedAccountInfo) null, (List) null, (MyAccountInfo) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(MyAccountInfo$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = onNavigationEvent + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyAccountInfoDto)) {
            return false;
        }
        MyAccountInfoDto myAccountInfoDto = (MyAccountInfoDto) obj;
        if (!Intrinsics.areEqual(this.recommendedAccount, myAccountInfoDto.recommendedAccount)) {
            int i3 = onNavigationEvent + 1;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.registeredAccounts, myAccountInfoDto.registeredAccounts)) {
            return false;
        }
        if (Intrinsics.areEqual(this.myAccount, myAccountInfoDto.myAccount)) {
            return true;
        }
        int i5 = onNavigationEvent + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        RecommendedAccountInfo recommendedAccountInfo;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            recommendedAccountInfo = this.recommendedAccount;
            iHashCode = 1;
            if (recommendedAccountInfo != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = recommendedAccountInfo.hashCode();
            }
        } else {
            recommendedAccountInfo = this.recommendedAccount;
            if (recommendedAccountInfo == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = recommendedAccountInfo.hashCode();
            }
        }
        int iHashCode3 = this.registeredAccounts.hashCode();
        MyAccountInfo myAccountInfo = this.myAccount;
        if (myAccountInfo != null) {
            int i3 = IAuthTabCallback + 35;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = myAccountInfo.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyAccountInfoDto(recommendedAccount=" + this.recommendedAccount + ", registeredAccounts=" + this.registeredAccounts + ", myAccount=" + this.myAccount + ")";
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MyAccountInfoDto> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            MyAccountInfoDto$.serializer serializerVar = MyAccountInfoDto$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 97 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ MyAccountInfoDto(int i, RecommendedAccountInfo recommendedAccountInfo, List list, MyAccountInfo myAccountInfo, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.recommendedAccount = null;
        } else {
            this.recommendedAccount = recommendedAccountInfo;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i3 = IAuthTabCallback + 65;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                this.registeredAccounts = CollectionsKt.emptyList();
                int i4 = 5 / 0;
            } else {
                this.registeredAccounts = CollectionsKt.emptyList();
            }
        } else {
            this.registeredAccounts = list;
            int i5 = 2 % 2;
        }
        if ((i & 4) != 0) {
            this.myAccount = myAccountInfo;
            return;
        }
        int i6 = IAuthTabCallback + 57;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        this.myAccount = null;
    }

    public MyAccountInfoDto(@Nullable RecommendedAccountInfo recommendedAccountInfo, @NotNull List<MyAccountInfo> list, @Nullable MyAccountInfo myAccountInfo) {
        Intrinsics.checkNotNullParameter(list, "");
        this.recommendedAccount = recommendedAccountInfo;
        this.registeredAccounts = list;
        this.myAccount = myAccountInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[PHI: r1
      0x0026: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:10:0x0024, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.MyAccountInfoDto r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.MyAccountInfoDto.IAuthTabCallback
            int r1 = r1 + 13
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfoDto.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.MyAccountInfoDto.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r2)
            r4 = r4 ^ r3
            if (r4 == r3) goto L22
            goto L26
        L1a:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.MyAccountInfoDto.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r2)
            if (r4 != 0) goto L26
        L22:
            viva.republica.toss.network.model.transfer.MyAccountInfoDto$RecommendedAccountInfo r4 = r6.recommendedAccount
            if (r4 == 0) goto L2d
        L26:
            viva.republica.toss.network.model.transfer.MyAccountInfoDto$RecommendedAccountInfo$$serializer r4 = viva.republica.toss.network.model.transfer.MyAccountInfoDto$RecommendedAccountInfo$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.MyAccountInfoDto$RecommendedAccountInfo r5 = r6.recommendedAccount
            r7.onExtraCallbackWithResult(r8, r2, r4, r5)
        L2d:
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L3f
            java.util.List<viva.republica.toss.network.model.transfer.MyAccountInfo> r4 = r6.registeredAccounts
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L4c
        L3f:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.transfer.MyAccountInfo> r4 = r6.registeredAccounts
            r7.onNavigationEvent(r8, r3, r1, r4)
        L4c:
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            if (r1 != 0) goto L5f
            int r1 = viva.republica.toss.network.model.transfer.MyAccountInfoDto.onNavigationEvent
            int r1 = r1 + 85
            int r3 = r1 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfoDto.IAuthTabCallback = r3
            int r1 = r1 % r0
            viva.republica.toss.network.model.transfer.MyAccountInfo r1 = r6.myAccount
            if (r1 == 0) goto L6f
        L5f:
            viva.republica.toss.network.model.transfer.MyAccountInfo$$serializer r1 = viva.republica.toss.network.model.transfer.MyAccountInfo$$serializer.INSTANCE
            viva.republica.toss.network.model.transfer.MyAccountInfo r6 = r6.myAccount
            r7.onExtraCallbackWithResult(r8, r0, r1, r6)
            int r6 = viva.republica.toss.network.model.transfer.MyAccountInfoDto.IAuthTabCallback
            int r6 = r6 + 47
            int r7 = r6 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfoDto.onNavigationEvent = r7
            int r6 = r6 % r0
        L6f:
            int r6 = viva.republica.toss.network.model.transfer.MyAccountInfoDto.IAuthTabCallback
            int r6 = r6 + 45
            int r7 = r6 % 128
            viva.republica.toss.network.model.transfer.MyAccountInfoDto.onNavigationEvent = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L7d
            r6 = 72
            int r6 = r6 / r2
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.MyAccountInfoDto.onExtraCallback(viva.republica.toss.network.model.transfer.MyAccountInfoDto, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MyAccountInfoDto(RecommendedAccountInfo recommendedAccountInfo, List list, MyAccountInfo myAccountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 33 / 0;
            }
            recommendedAccountInfo = null;
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
            int i4 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 7 / 0;
            }
            myAccountInfo = null;
        }
        this(recommendedAccountInfo, list, myAccountInfo);
    }

    public final RecommendedAccountInfo IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        RecommendedAccountInfo recommendedAccountInfo = this.recommendedAccount;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return recommendedAccountInfo;
    }

    public final List<MyAccountInfo> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<MyAccountInfo> list = this.registeredAccounts;
        int i5 = i3 + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @liq
    public static final class RecommendedAccountInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String key;

        static {
            int i = onExtraCallback + 121;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RecommendedAccountInfo() {
            String str = null;
            this(str, 1, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 59;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof RecommendedAccountInfo)) {
                return false;
            }
            if (Intrinsics.areEqual(this.key, ((RecommendedAccountInfo) obj).key)) {
                return true;
            }
            int i4 = IAuthTabCallback + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.key.hashCode();
            int i4 = onNavigationEvent + 51;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RecommendedAccountInfo(key=" + this.key + ")";
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RecommendedAccountInfo> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 7;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                MyAccountInfoDto$RecommendedAccountInfo$.serializer serializerVar = MyAccountInfoDto$RecommendedAccountInfo$.serializer.INSTANCE;
                if (i3 != 0) {
                    int i4 = 53 / 0;
                }
                return serializerVar;
            }
        }

        public /* synthetic */ RecommendedAccountInfo(int i, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.key = "";
                int i2 = IAuthTabCallback + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.key = str;
            int i4 = onNavigationEvent + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public RecommendedAccountInfo(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.key = str;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(RecommendedAccountInfo recommendedAccountInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onNavigationEvent + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (Intrinsics.areEqual(recommendedAccountInfo.key, "")) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 0, recommendedAccountInfo.key);
            int i4 = IAuthTabCallback + 47;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RecommendedAccountInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 111;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 101;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                str = "";
            }
            this(str);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 107;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.key;
            int i4 = i2 + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return str;
        }
    }

    public final MyAccountInfo onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        MyAccountInfo myAccountInfo = this.myAccount;
        int i5 = i2 + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return myAccountInfo;
    }
}
