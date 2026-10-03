package viva.republica.toss.network.model.electronicdocument.wallet;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocIssuableListResp {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final EDocBannerInfo bannerInfo;
    private final EDocTitleInfo guideInfo;
    private final List<EDocIssuable> scrollCategory;
    private final List<EDocIssuable> tabCategory;

    public EDocIssuableListResp() {
        this((List) null, (List) null, (EDocTitleInfo) null, (EDocBannerInfo) null, 15, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(EDocIssuable$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(EDocIssuable$$serializer.INSTANCE);
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return kSerializerAsInterface;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDocIssuableListResp)) {
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        EDocIssuableListResp eDocIssuableListResp = (EDocIssuableListResp) obj;
        if (!Intrinsics.areEqual(this.scrollCategory, eDocIssuableListResp.scrollCategory)) {
            int i4 = IAuthTabCallback + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tabCategory, eDocIssuableListResp.tabCategory)) {
            int i6 = onExtraCallback + 83;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.guideInfo, eDocIssuableListResp.guideInfo)) {
            return !(Intrinsics.areEqual(this.bannerInfo, eDocIssuableListResp.bannerInfo) ^ true);
        }
        int i8 = IAuthTabCallback + 105;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
      0x001c: PHI (r1v13 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable>) = 
      (r1v4 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable>)
      (r1v15 java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable>)
     binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.onExtraCallback
            int r1 = r1 + 41
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable> r1 = r7.scrollCategory
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable> r1 = r7.scrollCategory
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable> r4 = r7.tabCategory
            if (r4 != 0) goto L26
            r4 = r2
            goto L2a
        L26:
            int r4 = r4.hashCode()
        L2a:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo r5 = r7.guideInfo
            if (r5 != 0) goto L2f
            goto L33
        L2f:
            int r2 = r5.hashCode()
        L33:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo r5 = r7.bannerInfo
            if (r5 == 0) goto L44
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.IAuthTabCallback
            int r3 = r3 + 59
            int r6 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.onExtraCallback = r6
            int r3 = r3 % r0
            int r3 = r5.hashCode()
        L44:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocIssuableListResp(scrollCategory=" + this.scrollCategory + ", tabCategory=" + this.tabCategory + ", guideInfo=" + this.guideInfo + ", bannerInfo=" + this.bannerInfo + ")";
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocIssuableListResp> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            EDocIssuableListResp$.serializer serializerVar = EDocIssuableListResp$.serializer.INSTANCE;
            int i4 = onExtraCallback + 101;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallbackWithResult = EDocIssuableListResp.onExtraCallbackWithResult();
                    int i3 = 48 / 0;
                } else {
                    kSerializerOnExtraCallbackWithResult = EDocIssuableListResp.onExtraCallbackWithResult();
                }
                int i4 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = EDocIssuableListResp.onWarmupCompleted();
                int i4 = onNavigationEvent + 117;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        }), null, null};
        int i = onNavigationEvent + 69;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ EDocIssuableListResp(int i, List list, List list2, EDocTitleInfo eDocTitleInfo, EDocBannerInfo eDocBannerInfo, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.scrollCategory = null;
        } else {
            this.scrollCategory = list;
        }
        if ((i & 2) == 0) {
            this.tabCategory = null;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.tabCategory = list2;
        }
        if ((i & 4) == 0) {
            this.guideInfo = null;
        } else {
            this.guideInfo = eDocTitleInfo;
            int i5 = onExtraCallback + 39;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        if ((i & 8) != 0) {
            this.bannerInfo = eDocBannerInfo;
            return;
        }
        this.bannerInfo = null;
        int i7 = IAuthTabCallback + 117;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 22 / 0;
        }
    }

    public EDocIssuableListResp(@Nullable List<EDocIssuable> list, @Nullable List<EDocIssuable> list2, @Nullable EDocTitleInfo eDocTitleInfo, @Nullable EDocBannerInfo eDocBannerInfo) {
        this.scrollCategory = list;
        this.tabCategory = list2;
        this.guideInfo = eDocTitleInfo;
        this.bannerInfo = eDocBannerInfo;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 117;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L10
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable> r3 = r5.scrollCategory
            if (r3 == 0) goto L1d
        L10:
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable> r4 = r5.scrollCategory
            r6.onExtraCallbackWithResult(r7, r2, r3, r4)
        L1d:
            r3 = 1
            boolean r4 = r6.onWarmupCompleted(r7, r3)
            if (r4 != 0) goto L28
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable> r4 = r5.tabCategory
            if (r4 == 0) goto L3e
        L28:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable> r4 = r5.tabCategory
            r6.onExtraCallbackWithResult(r7, r3, r1, r4)
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.onExtraCallback
            int r1 = r1 + 11
            int r3 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.IAuthTabCallback = r3
            int r1 = r1 % r0
        L3e:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L51
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.onExtraCallback
            int r1 = r1 + 117
            int r3 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.IAuthTabCallback = r3
            int r1 = r1 % r0
            viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo r1 = r5.guideInfo
            if (r1 == 0) goto L58
        L51:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo$$serializer r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo$.serializer.INSTANCE
            viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo r3 = r5.guideInfo
            r6.onExtraCallbackWithResult(r7, r0, r1, r3)
        L58:
            r1 = 3
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            if (r3 != 0) goto L73
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.IAuthTabCallback
            int r3 = r3 + 97
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.onExtraCallback = r4
            int r3 = r3 % r0
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo r0 = r5.bannerInfo
            if (r3 != 0) goto L71
            r3 = 6
            int r3 = r3 / r2
            if (r0 == 0) goto L7a
            goto L73
        L71:
            if (r0 == 0) goto L7a
        L73:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo$$serializer r0 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo$.serializer.INSTANCE
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBannerInfo r5 = r5.bannerInfo
            r6.onExtraCallbackWithResult(r7, r1, r0, r5)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp.onWarmupCompleted(viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocIssuableListResp(List list, List list2, EDocTitleInfo eDocTitleInfo, EDocBannerInfo eDocBannerInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 107;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list2 = null;
        }
        if ((i & 4) != 0) {
            int i8 = IAuthTabCallback + 125;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            eDocTitleInfo = null;
        }
        if ((i & 8) != 0) {
            int i9 = IAuthTabCallback + 115;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 28 / 0;
            }
            eDocBannerInfo = null;
        }
        this(list, list2, eDocTitleInfo, eDocBannerInfo);
    }

    public final List<EDocIssuable> onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<EDocIssuable> list = this.scrollCategory;
        int i4 = i3 + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final EDocTitleInfo onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        EDocTitleInfo eDocTitleInfo = this.guideInfo;
        int i4 = i2 + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return eDocTitleInfo;
    }

    public final EDocBannerInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EDocBannerInfo eDocBannerInfo = this.bannerInfo;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return eDocBannerInfo;
    }
}
