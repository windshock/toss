package viva.republica.toss.network.model.transfer.periodic;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Banner$;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Recommendations$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferBannerResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final Banner banner;
    private final Recommendations recommendations;

    static {
        int i = onExtraCallback + 27;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PeriodicTransferBannerResponse() {
        this((Banner) null, (Recommendations) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 57;
            onWarmupCompleted = i3 % 128;
            boolean z = i3 % 2 == 0;
            int i4 = i2 + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            throw null;
        }
        if (!(obj instanceof PeriodicTransferBannerResponse)) {
            int i5 = IAuthTabCallback + 87;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        PeriodicTransferBannerResponse periodicTransferBannerResponse = (PeriodicTransferBannerResponse) obj;
        if (!Intrinsics.areEqual(this.banner, periodicTransferBannerResponse.banner)) {
            return false;
        }
        if (Intrinsics.areEqual(this.recommendations, periodicTransferBannerResponse.recommendations)) {
            return true;
        }
        int i7 = IAuthTabCallback + 73;
        onWarmupCompleted = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        Banner banner;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onWarmupCompleted = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 == 0 ? (banner = this.banner) != null : (banner = this.banner) != null) ? banner.hashCode() : 0;
        Recommendations recommendations = this.recommendations;
        if (recommendations != null) {
            int i3 = IAuthTabCallback + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = recommendations.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferBannerResponse(banner=" + this.banner + ", recommendations=" + this.recommendations + ")";
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferBannerResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferBannerResponse$.serializer serializerVar = PeriodicTransferBannerResponse$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ PeriodicTransferBannerResponse(int i, Banner banner, Recommendations recommendations, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.banner = null;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.banner = banner;
        }
        if ((i & 2) != 0) {
            this.recommendations = recommendations;
            return;
        }
        this.recommendations = null;
        int i5 = IAuthTabCallback + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public PeriodicTransferBannerResponse(@Nullable Banner banner, @Nullable Recommendations recommendations) {
        this.banner = banner;
        this.recommendations = recommendations;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L1e
            int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.onWarmupCompleted
            int r2 = r2 + 61
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L1a
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Banner r2 = r4.banner
            if (r2 == 0) goto L25
            goto L1e
        L1a:
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Banner r4 = r4.banner
            r4 = 0
            throw r4
        L1e:
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Banner$$serializer r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Banner$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Banner r3 = r4.banner
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
        L25:
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            r2 = r2 ^ r1
            if (r2 == r1) goto L2e
            goto L3b
        L2e:
            int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.onWarmupCompleted
            int r2 = r2 + 121
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.IAuthTabCallback = r3
            int r2 = r2 % r0
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Recommendations r0 = r4.recommendations
            if (r0 == 0) goto L42
        L3b:
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Recommendations$$serializer r0 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Recommendations$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Recommendations r4 = r4.recommendations
            r5.onExtraCallbackWithResult(r6, r1, r0, r4)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.IAuthTabCallback(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PeriodicTransferBannerResponse(Banner banner, Recommendations recommendations, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            banner = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            recommendations = null;
        }
        this(banner, recommendations);
    }

    public final Banner onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 37;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Banner banner = this.banner;
        int i5 = i2 + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return banner;
    }

    @liq
    public static final class Banner {
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String row1;
        private final String row2;
        private final String url;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 71;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public Banner() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            if (!Intrinsics.areEqual(this.row1, banner.row1)) {
                int i4 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (!Intrinsics.areEqual(this.row2, banner.row2)) {
                int i5 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.url, banner.url)) {
                return true;
            }
            int i7 = onWarmupCompleted;
            int i8 = i7 + 111;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 75;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.row1.hashCode();
            int iHashCode3 = this.row2.hashCode();
            String str = this.url;
            if (str == null) {
                int i4 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int i6 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
            int i7 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                return i6;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Banner(row1=" + this.row1 + ", row2=" + this.row2 + ", url=" + this.url + ")";
            int i2 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Banner> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                PeriodicTransferBannerResponse$Banner$.serializer serializerVar = PeriodicTransferBannerResponse$Banner$.serializer.INSTANCE;
                int i4 = onExtraCallback + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return serializerVar;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Banner(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, o.okycx r7) {
            /*
                r2 = this;
                r2.<init>()
                r7 = r3 & 1
                java.lang.String r0 = ""
                r1 = 2
                if (r7 != 0) goto L1a
                r2.row1 = r0
                int r4 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onWarmupCompleted
                int r4 = r4 + 65
                int r7 = r4 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onExtraCallbackWithResult = r7
                int r4 = r4 % r1
                if (r4 == 0) goto L1c
                r4 = 3
                int r4 = r4 / r4
                goto L1e
            L1a:
                r2.row1 = r4
            L1c:
                int r4 = r1 % r1
            L1e:
                r4 = r3 & 2
                r7 = 0
                if (r4 != 0) goto L32
                int r4 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onExtraCallbackWithResult
                int r4 = r4 + 75
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onWarmupCompleted = r5
                int r4 = r4 % r1
                r2.row2 = r0
                if (r4 == 0) goto L31
                goto L34
            L31:
                throw r7
            L32:
                r2.row2 = r5
            L34:
                int r1 = r1 % r1
                r3 = r3 & 4
                if (r3 != 0) goto L3c
                r2.url = r7
                return
            L3c:
                r2.url = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.<init>(int, java.lang.String, java.lang.String, java.lang.String, o.okycx):void");
        }

        public Banner(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.row1 = str;
            this.row2 = str2;
            this.url = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onWarmupCompleted
                int r1 = r1 + 85
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L19
                boolean r1 = r6.onWarmupCompleted(r7, r4)
                if (r1 != 0) goto L27
                goto L1f
            L19:
                boolean r1 = r6.onWarmupCompleted(r7, r3)
                if (r1 != 0) goto L27
            L1f:
                java.lang.String r1 = r5.row1
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L2c
            L27:
                java.lang.String r1 = r5.row1
                r6.onExtraCallback(r7, r3, r1)
            L2c:
                boolean r1 = r6.onWarmupCompleted(r7, r4)
                if (r1 != 0) goto L3a
                java.lang.String r1 = r5.row2
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L48
            L3a:
                java.lang.String r1 = r5.row2
                r6.onExtraCallback(r7, r4, r1)
                int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onWarmupCompleted
                int r1 = r1 + 35
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
            L48:
                boolean r1 = r6.onWarmupCompleted(r7, r0)
                if (r1 == 0) goto L4f
                goto L66
            L4f:
                int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onWarmupCompleted
                int r1 = r1 + 45
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L62
                java.lang.String r1 = r5.url
                r2 = 17
                int r2 = r2 / r3
                if (r1 == 0) goto L6d
                goto L66
            L62:
                java.lang.String r1 = r5.url
                if (r1 == 0) goto L6d
            L66:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r5.url
                r6.onExtraCallbackWithResult(r7, r0, r1, r5)
            L6d:
                int r5 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onWarmupCompleted
                int r5 = r5 + 7
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onExtraCallbackWithResult = r6
                int r5 = r5 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Banner.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Banner, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Banner(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i3 = 2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i4 = 2 % 2;
                str2 = "";
            }
            if ((i & 4) != 0) {
                int i5 = onExtraCallbackWithResult + 15;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                str3 = null;
            }
            this(str, str2, str3);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.row1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.row2;
            int i4 = i3 + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.url;
            int i4 = i3 + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    public final Recommendations onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Recommendations recommendations = this.recommendations;
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return recommendations;
    }

    @liq
    public static final class Recommendations {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final List<RecommendationBanner> banners;
        private final String title;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Recommendations$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return PeriodicTransferBannerResponse.Recommendations.onWarmupCompleted();
                }
                PeriodicTransferBannerResponse.Recommendations.onWarmupCompleted();
                throw null;
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public Recommendations() {
            this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        private static final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PeriodicTransferBannerResponse$RecommendationBanner$$serializer.INSTANCE);
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = onExtraCallback();
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
            return kSerializerOnExtraCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 49 / 0;
                }
                return true;
            }
            if (!(obj instanceof Recommendations)) {
                int i4 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            Recommendations recommendations = (Recommendations) obj;
            if (!Intrinsics.areEqual(this.title, recommendations.title) || !Intrinsics.areEqual(this.banners, recommendations.banners)) {
                return false;
            }
            int i6 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.title.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode2 = this.title.hashCode();
            List<RecommendationBanner> list = this.banners;
            if (list == null) {
                int i3 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i3 % 128;
                iHashCode = i3 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = list.hashCode();
            }
            int i4 = (iHashCode2 * 31) + iHashCode;
            int i5 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 69 / 0;
            }
            return i4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Recommendations(title=" + this.title + ", banners=" + this.banners + ")";
            int i2 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Recommendations> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PeriodicTransferBannerResponse$Recommendations$.serializer serializerVar = PeriodicTransferBannerResponse$Recommendations$.serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return serializerVar;
                }
                throw null;
            }
        }

        static {
            int i = onExtraCallback + 79;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Recommendations(int i, String str, List list, okycx okycxVar) {
            if ((i & 1) == 0) {
                str = "";
                int i2 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.title = str;
            if ((i & 2) != 0) {
                this.banners = list;
                int i5 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i6 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            this.banners = null;
            if (i7 != 0) {
                throw null;
            }
        }

        public Recommendations(@NotNull String str, @Nullable List<RecommendationBanner> list) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
            this.banners = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations.IAuthTabCallback
                r2 = 1
                int r1 = r1 + r2
                int r3 = r1 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations.onExtraCallbackWithResult = r3
                int r1 = r1 % r0
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations.$childSerializers
                r3 = 0
                boolean r4 = r7.onWarmupCompleted(r8, r3)
                if (r4 != 0) goto L29
                int r4 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations.onExtraCallbackWithResult
                int r4 = r4 + 41
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations.IAuthTabCallback = r5
                int r4 = r4 % r0
                java.lang.String r4 = r6.title
                java.lang.String r5 = ""
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                r4 = r4 ^ r2
                if (r4 == 0) goto L2e
            L29:
                java.lang.String r4 = r6.title
                r7.onExtraCallback(r8, r3, r4)
            L2e:
                boolean r4 = r7.onWarmupCompleted(r8, r2)
                if (r4 != 0) goto L49
                int r4 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations.IAuthTabCallback
                int r4 = r4 + 107
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations.onExtraCallbackWithResult = r5
                int r4 = r4 % r0
                java.util.List<viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner> r0 = r6.banners
                if (r4 == 0) goto L47
                r4 = 9
                int r4 = r4 / r3
                if (r0 == 0) goto L56
                goto L49
            L47:
                if (r0 == 0) goto L56
            L49:
                r0 = r1[r2]
                java.lang.Object r0 = r0.getValue()
                o.py r0 = (o.py) r0
                java.util.List<viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner> r6 = r6.banners
                r7.onExtraCallbackWithResult(r8, r2, r0, r6)
            L56:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Recommendations.IAuthTabCallback(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Recommendations, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $childSerializers;
            }
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Recommendations(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i5 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                int i6 = 2 % 2;
                list = null;
            }
            this(str, list);
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 115;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final List<RecommendationBanner> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            List<RecommendationBanner> list = this.banners;
            int i5 = i2 + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class RecommendationBanner {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final Button button;
        private final String description;
        private final String iconUrl;
        private final String title;

        static {
            int i = onWarmupCompleted + 97;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public RecommendationBanner() {
            this((String) null, (String) null, (String) null, (Button) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendationBanner)) {
                int i2 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 == 0;
            }
            RecommendationBanner recommendationBanner = (RecommendationBanner) obj;
            if (!Intrinsics.areEqual(this.title, recommendationBanner.title)) {
                int i3 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.description, recommendationBanner.description)) {
                int i4 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.iconUrl, recommendationBanner.iconUrl)) {
                int i6 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.button, recommendationBanner.button)) {
                return true;
            }
            int i8 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.title.hashCode();
            int iHashCode3 = this.description.hashCode();
            int iHashCode4 = this.iconUrl.hashCode();
            Button button = this.button;
            if (button == null) {
                int i2 = onExtraCallbackWithResult + 63;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 97;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 2;
                }
                iHashCode = 0;
            } else {
                iHashCode = button.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RecommendationBanner(title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", button=" + this.button + ")";
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RecommendationBanner> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    PeriodicTransferBannerResponse$RecommendationBanner$$serializer periodicTransferBannerResponse$RecommendationBanner$$serializer = PeriodicTransferBannerResponse$RecommendationBanner$$serializer.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                PeriodicTransferBannerResponse$RecommendationBanner$$serializer periodicTransferBannerResponse$RecommendationBanner$$serializer2 = PeriodicTransferBannerResponse$RecommendationBanner$$serializer.INSTANCE;
                int i3 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return periodicTransferBannerResponse$RecommendationBanner$$serializer2;
                }
                throw null;
            }
        }

        public /* synthetic */ RecommendationBanner(int i, String str, String str2, String str3, Button button, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                int i2 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                this.description = "";
            } else {
                this.description = str2;
            }
            int i4 = 2 % 2;
            if ((i & 4) == 0) {
                int i5 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                this.iconUrl = "";
            } else {
                this.iconUrl = str3;
            }
            if ((i & 8) == 0) {
                this.button = null;
            } else {
                this.button = button;
            }
        }

        public RecommendationBanner(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Button button) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.title = str;
            this.description = str2;
            this.iconUrl = str3;
            this.button = button;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner.IAuthTabCallback
                int r1 = r1 + 69
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L19
                boolean r1 = r6.onWarmupCompleted(r7, r3)
                if (r1 == 0) goto L21
                goto L29
            L19:
                boolean r1 = r6.onWarmupCompleted(r7, r3)
                r1 = r1 ^ r4
                if (r1 == r4) goto L21
                goto L29
            L21:
                java.lang.String r1 = r5.title
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L2e
            L29:
                java.lang.String r1 = r5.title
                r6.onExtraCallback(r7, r3, r1)
            L2e:
                boolean r1 = r6.onWarmupCompleted(r7, r4)
                if (r1 != 0) goto L3c
                java.lang.String r1 = r5.description
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L41
            L3c:
                java.lang.String r1 = r5.description
                r6.onExtraCallback(r7, r4, r1)
            L41:
                boolean r1 = r6.onWarmupCompleted(r7, r0)
                if (r1 != 0) goto L58
                int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner.IAuthTabCallback
                int r1 = r1 + 59
                int r3 = r1 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner.onExtraCallbackWithResult = r3
                int r1 = r1 % r0
                java.lang.String r1 = r5.iconUrl
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L5d
            L58:
                java.lang.String r1 = r5.iconUrl
                r6.onExtraCallback(r7, r0, r1)
            L5d:
                r1 = 3
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                r2 = r2 ^ r4
                if (r2 == r4) goto L66
                goto L75
            L66:
                int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner.IAuthTabCallback
                int r2 = r2 + 117
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner.onExtraCallbackWithResult = r3
                int r2 = r2 % r0
                if (r2 == 0) goto L7d
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button r0 = r5.button
                if (r0 == 0) goto L7c
            L75:
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button$$serializer r0 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button r5 = r5.button
                r6.onExtraCallbackWithResult(r7, r1, r0, r5)
            L7c:
                return
            L7d:
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button r5 = r5.button
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner.onWarmupCompleted(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RecommendationBanner(String str, String str2, String str3, Button button, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i4 = 2 % 2;
                str2 = "";
            }
            if ((i & 4) != 0) {
                int i5 = IAuthTabCallback + 43;
                int i6 = i5 % 128;
                onExtraCallbackWithResult = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 115;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
                str3 = "";
            }
            if ((i & 8) != 0) {
                int i11 = onExtraCallbackWithResult;
                int i12 = i11 + 95;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 + 67;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                int i16 = 2 % 2;
                button = null;
            }
            this(str, str2, str3, button);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 95;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.description;
            int i5 = i3 + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 123;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.iconUrl;
            int i4 = i2 + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final Button IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Button button = this.button;
            int i4 = i2 + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return button;
        }
    }

    @liq
    public static final class Button {
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final String redirectUrl;
        private final String text;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Button() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 77;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof Button)) {
                int i4 = onExtraCallback + 113;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 != 0;
            }
            Button button = (Button) obj;
            if (Intrinsics.areEqual(this.text, button.text)) {
                return Intrinsics.areEqual(this.redirectUrl, button.redirectUrl);
            }
            int i5 = onWarmupCompleted + 31;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.text.hashCode() * 31) + this.redirectUrl.hashCode();
            int i4 = onExtraCallback + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Button(text=" + this.text + ", redirectUrl=" + this.redirectUrl + ")";
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Button> serializer() {
                PeriodicTransferBannerResponse$Button$$serializer periodicTransferBannerResponse$Button$$serializer;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    periodicTransferBannerResponse$Button$$serializer = PeriodicTransferBannerResponse$Button$$serializer.INSTANCE;
                    int i3 = 86 / 0;
                } else {
                    periodicTransferBannerResponse$Button$$serializer = PeriodicTransferBannerResponse$Button$$serializer.INSTANCE;
                }
                int i4 = onExtraCallback + 75;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return periodicTransferBannerResponse$Button$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ Button(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.text = "";
                int i2 = onWarmupCompleted + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.text = str;
            }
            if ((i & 2) != 0) {
                this.redirectUrl = str2;
                return;
            }
            int i5 = onExtraCallback;
            int i6 = i5 + 105;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            this.redirectUrl = "";
            int i8 = i5 + 45;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }

        public Button(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.text = str;
            this.redirectUrl = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                java.lang.String r3 = ""
                if (r2 != 0) goto L1d
                int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button.onWarmupCompleted
                int r2 = r2 + 81
                int r4 = r2 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button.onExtraCallback = r4
                int r2 = r2 % r0
                java.lang.String r2 = r5.text
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L22
            L1d:
                java.lang.String r2 = r5.text
                r6.onExtraCallback(r7, r1, r2)
            L22:
                r1 = 1
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 != 0) goto L47
                int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button.onExtraCallback
                int r2 = r2 + 63
                int r4 = r2 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button.onWarmupCompleted = r4
                int r2 = r2 % r0
                if (r2 != 0) goto L3d
                java.lang.String r2 = r5.redirectUrl
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L55
                goto L47
            L3d:
                java.lang.String r5 = r5.redirectUrl
                kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
                r5 = 0
                r5.hashCode()
                throw r5
            L47:
                java.lang.String r5 = r5.redirectUrl
                r6.onExtraCallback(r7, r1, r5)
                int r5 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button.onWarmupCompleted
                int r5 = r5 + 29
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button.onExtraCallback = r6
                int r5 = r5 % r0
            L55:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Button(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 33;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 65;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                str = "";
            }
            if ((i & 2) != 0) {
                int i7 = onWarmupCompleted + 69;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                str2 = "";
            }
            this(str, str2);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.text;
            int i5 = i3 + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 105;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.redirectUrl;
            int i4 = i2 + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }
}
