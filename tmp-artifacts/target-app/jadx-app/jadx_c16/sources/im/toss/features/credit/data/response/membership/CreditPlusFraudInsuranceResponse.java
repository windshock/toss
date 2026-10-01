package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.Disclaimer;
import im.toss.features.credit.data.response.Disclaimer$$serializer;
import im.toss.features.credit.data.response.membership.CreditPlusFraudInsuranceResponse$ReportChannel$;
import im.toss.features.credit.data.response.membership.CreditPlusFraudInsuranceResponse$ReportChannel$KakaoTalk$;
import im.toss.features.credit.data.response.membership.CreditPlusFraudInsuranceResponse$ReportChannel$Phone$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getBgColor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusFraudInsuranceResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String coverage;
    private final String description;
    private final Disclaimer disclaimer;
    private final ReportChannel reportChannel;
    private final String title;

    static {
        int i = onExtraCallback + 35;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public CreditPlusFraudInsuranceResponse() {
        this((String) null, (String) null, (String) null, (Disclaimer) null, (ReportChannel) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreditPlusFraudInsuranceResponse) {
            CreditPlusFraudInsuranceResponse creditPlusFraudInsuranceResponse = (CreditPlusFraudInsuranceResponse) obj;
            if (!Intrinsics.areEqual(this.title, creditPlusFraudInsuranceResponse.title) || !Intrinsics.areEqual(this.description, creditPlusFraudInsuranceResponse.description) || (!Intrinsics.areEqual(this.coverage, creditPlusFraudInsuranceResponse.coverage)) || !Intrinsics.areEqual(this.disclaimer, creditPlusFraudInsuranceResponse.disclaimer)) {
                return false;
            }
            if (Intrinsics.areEqual(this.reportChannel, creditPlusFraudInsuranceResponse.reportChannel)) {
                return true;
            }
            int i3 = IAuthTabCallback + 65;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 121;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.description.hashCode();
        int iHashCode4 = this.coverage.hashCode();
        Disclaimer disclaimer = this.disclaimer;
        int iHashCode5 = 0;
        if (disclaimer == null) {
            iHashCode = 0;
        } else {
            iHashCode = disclaimer.hashCode();
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        ReportChannel reportChannel = this.reportChannel;
        if (reportChannel != null) {
            int i4 = IAuthTabCallback + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode5 = reportChannel.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditPlusFraudInsuranceResponse(title=" + this.title + ", description=" + this.description + ", coverage=" + this.coverage + ", disclaimer=" + this.disclaimer + ", reportChannel=" + this.reportChannel + ")";
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ CreditPlusFraudInsuranceResponse(int i, String str, String str2, String str3, Disclaimer disclaimer, ReportChannel reportChannel, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.description = "";
            int i4 = 2 % 2;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            int i5 = IAuthTabCallback + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.coverage = "";
        } else {
            this.coverage = str3;
            int i7 = onNavigationEvent + 37;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 4;
            } else {
                int i9 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            this.disclaimer = null;
            int i10 = 2 % 2;
        } else {
            this.disclaimer = disclaimer;
        }
        if ((i & 16) != 0) {
            this.reportChannel = reportChannel;
            return;
        }
        this.reportChannel = null;
        int i11 = IAuthTabCallback + 13;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
    }

    public CreditPlusFraudInsuranceResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Disclaimer disclaimer, @Nullable ReportChannel reportChannel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.description = str2;
        this.coverage = str3;
        this.disclaimer = disclaimer;
        this.reportChannel = reportChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(CreditPlusFraudInsuranceResponse creditPlusFraudInsuranceResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
            vylVar.onExtraCallback(serialDescriptor, 0, creditPlusFraudInsuranceResponse.title);
        } else {
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(creditPlusFraudInsuranceResponse.title, "")) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = IAuthTabCallback + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 29 / 0;
                if (!Intrinsics.areEqual(creditPlusFraudInsuranceResponse.description, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, creditPlusFraudInsuranceResponse.description);
                }
            } else if (!Intrinsics.areEqual(creditPlusFraudInsuranceResponse.description, "")) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = onNavigationEvent + 117;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 14 / 0;
                if (!Intrinsics.areEqual(creditPlusFraudInsuranceResponse.coverage, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 2, creditPlusFraudInsuranceResponse.coverage);
                    int i8 = IAuthTabCallback + 13;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (!Intrinsics.areEqual(creditPlusFraudInsuranceResponse.coverage, "")) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i10 = onNavigationEvent + 35;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            if (creditPlusFraudInsuranceResponse.disclaimer != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, Disclaimer$$serializer.INSTANCE, creditPlusFraudInsuranceResponse.disclaimer);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || creditPlusFraudInsuranceResponse.reportChannel != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, CreditPlusFraudInsuranceResponse$ReportChannel$.serializer.INSTANCE, creditPlusFraudInsuranceResponse.reportChannel);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusFraudInsuranceResponse(String str, String str2, String str3, Disclaimer disclaimer, ReportChannel reportChannel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Disclaimer disclaimer2;
        ReportChannel reportChannel2;
        String str4 = "";
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 33;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 59;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "";
        }
        String str5 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i8 = onNavigationEvent + 95;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 0;
            }
        } else {
            str4 = str3;
        }
        if ((i & 8) != 0) {
            int i10 = onNavigationEvent + 3;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 70 / 0;
            }
            int i12 = 2 % 2;
            disclaimer2 = null;
        } else {
            disclaimer2 = disclaimer;
        }
        if ((i & 16) != 0) {
            int i13 = IAuthTabCallback + 21;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 99 / 0;
            }
            reportChannel2 = null;
        } else {
            reportChannel2 = reportChannel;
        }
        this(str, str5, str4, disclaimer2, reportChannel2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i3 + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.coverage;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    public final Disclaimer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Disclaimer disclaimer = this.disclaimer;
        int i5 = i2 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return disclaimer;
    }

    public final ReportChannel onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ReportChannel reportChannel = this.reportChannel;
        int i5 = i2 + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return reportChannel;
    }

    @liq
    public static final class ReportChannel {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final KakaoTalk kakaoTalk;
        private final Phone phone;
        private final String referenceTime;

        static {
            int i = onNavigationEvent + 87;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public ReportChannel() {
            this((KakaoTalk) null, (Phone) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 61;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof ReportChannel)) {
                return false;
            }
            ReportChannel reportChannel = (ReportChannel) obj;
            if (!Intrinsics.areEqual(this.kakaoTalk, reportChannel.kakaoTalk)) {
                return false;
            }
            if (Intrinsics.areEqual(this.phone, reportChannel.phone)) {
                return !(Intrinsics.areEqual(this.referenceTime, reportChannel.referenceTime) ^ true);
            }
            int i7 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            KakaoTalk kakaoTalk = this.kakaoTalk;
            if (kakaoTalk == null) {
                int i2 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = kakaoTalk.hashCode();
            }
            Phone phone = this.phone;
            if (phone == null) {
                int i4 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i4 % 128;
                iHashCode2 = i4 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode2 = phone.hashCode();
            }
            String str = this.referenceTime;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ReportChannel(kakaoTalk=" + this.kakaoTalk + ", phone=" + this.phone + ", referenceTime=" + this.referenceTime + ")";
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public /* synthetic */ ReportChannel(int i, KakaoTalk kakaoTalk, Phone phone, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.kakaoTalk = null;
            } else {
                this.kakaoTalk = kakaoTalk;
                int i2 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) == 0) {
                int i5 = IAuthTabCallback + 121;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                this.phone = null;
                if (i6 == 0) {
                    throw null;
                }
            } else {
                this.phone = phone;
                int i7 = 2 % 2;
            }
            if ((i & 4) != 0) {
                this.referenceTime = str;
                return;
            }
            int i8 = IAuthTabCallback + 107;
            int i9 = i8 % 128;
            onExtraCallbackWithResult = i9;
            int i10 = i8 % 2;
            this.referenceTime = null;
            int i11 = i9 + 47;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        }

        public ReportChannel(@Nullable KakaoTalk kakaoTalk, @Nullable Phone phone, @Nullable String str) {
            this.kakaoTalk = kakaoTalk;
            this.phone = phone;
            this.referenceTime = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(ReportChannel reportChannel, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, CreditPlusFraudInsuranceResponse$ReportChannel$KakaoTalk$.serializer.INSTANCE, reportChannel.kakaoTalk);
            } else {
                int i2 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 50 / 0;
                    if (reportChannel.kakaoTalk != null) {
                    }
                } else if (reportChannel.kakaoTalk != null) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || reportChannel.phone != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, CreditPlusFraudInsuranceResponse$ReportChannel$Phone$.serializer.INSTANCE, reportChannel.phone);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i4 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    String str = reportChannel.referenceTime;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (reportChannel.referenceTime == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, reportChannel.referenceTime);
            int i5 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ReportChannel(KakaoTalk kakaoTalk, Phone phone, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                kakaoTalk = null;
            }
            if ((i & 2) != 0) {
                int i5 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 66 / 0;
                }
                int i7 = 2 % 2;
                phone = null;
            }
            if ((i & 4) != 0) {
                int i8 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 / 3;
                } else {
                    int i10 = 2 % 2;
                }
                str = null;
            }
            this(kakaoTalk, phone, str);
        }

        public final KakaoTalk IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            KakaoTalk kakaoTalk = this.kakaoTalk;
            int i5 = i2 + 7;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return kakaoTalk;
        }

        public final Phone onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Phone phone = this.phone;
            int i5 = i3 + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return phone;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @liq
        public static final class KakaoTalk {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            private final Boolean available;
            private final String availableHours;
            private final String description;
            private final String title;
            private final String url;

            static {
                int i = onWarmupCompleted + 1;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 76 / 0;
                }
            }

            public KakaoTalk() {
                this((String) null, (String) null, (String) null, (Boolean) null, (String) null, 31, (DefaultConstructorMarker) null);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    int i4 = i3 + 35;
                    IAuthTabCallback = i4 % 128;
                    return i4 % 2 != 0;
                }
                if (!(obj instanceof KakaoTalk)) {
                    return false;
                }
                KakaoTalk kakaoTalk = (KakaoTalk) obj;
                if (!Intrinsics.areEqual(this.availableHours, kakaoTalk.availableHours)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.url, kakaoTalk.url)) {
                    int i5 = onNavigationEvent + 117;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.description, kakaoTalk.description)) {
                    int i7 = onNavigationEvent + 79;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.available, kakaoTalk.available)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.title, kakaoTalk.title)) {
                    return true;
                }
                int i9 = IAuthTabCallback + 99;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
              0x001c: PHI (r1v15 java.lang.String) = (r1v4 java.lang.String), (r1v17 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
              0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
              0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int hashCode() {
                String str;
                int iHashCode;
                int iHashCode2;
                int iHashCode3;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                IAuthTabCallback = i2 % 128;
                int iHashCode4 = 0;
                if (i2 % 2 == 0) {
                    str = this.availableHours;
                    iHashCode = 1;
                    iHashCode2 = str == null ? 0 : str.hashCode();
                } else {
                    str = this.availableHours;
                    iHashCode = 0;
                    if (str == null) {
                    }
                }
                String str2 = this.url;
                int iHashCode5 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.description;
                if (str3 == null) {
                    int i3 = onNavigationEvent + 73;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = str3.hashCode();
                    int i5 = onNavigationEvent + 113;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                Boolean bool = this.available;
                if (bool == null) {
                    int i7 = onNavigationEvent + 37;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    iHashCode4 = bool.hashCode();
                }
                String str4 = this.title;
                if (str4 != null) {
                    int i9 = IAuthTabCallback + 33;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    iHashCode = str4.hashCode();
                }
                return (((((((iHashCode2 * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "KakaoTalk(availableHours=" + this.availableHours + ", url=" + this.url + ", description=" + this.description + ", available=" + this.available + ", title=" + this.title + ")";
                int i2 = onNavigationEvent + 59;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public /* synthetic */ KakaoTalk(int i, String str, String str2, String str3, Boolean bool, String str4, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.availableHours = null;
                } else {
                    this.availableHours = str;
                }
                if ((i & 2) == 0) {
                    int i2 = IAuthTabCallback + 1;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    this.url = null;
                } else {
                    this.url = str2;
                }
                if ((i & 4) == 0) {
                    int i4 = onNavigationEvent + 69;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    this.description = null;
                    if (i5 == 0) {
                        int i6 = 58 / 0;
                    }
                } else {
                    this.description = str3;
                    int i7 = IAuthTabCallback + 23;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 % 2;
                    }
                }
                if ((i & 8) == 0) {
                    this.available = null;
                } else {
                    this.available = bool;
                }
                if ((i & 16) != 0) {
                    this.title = str4;
                    return;
                }
                this.title = null;
                int i9 = onNavigationEvent + 79;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }

            public KakaoTalk(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4) {
                this.availableHours = str;
                this.url = str2;
                this.description = str3;
                this.available = bool;
                this.title = str4;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallback(KakaoTalk kakaoTalk, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, kakaoTalk.availableHours);
                } else if (kakaoTalk.availableHours != null) {
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || kakaoTalk.url != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, kakaoTalk.url);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i3 = onNavigationEvent + 103;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (kakaoTalk.description != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, kakaoTalk.description);
                        int i5 = onNavigationEvent + 115;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || kakaoTalk.available != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, kakaoTalk.available);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || kakaoTalk.title != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, kakaoTalk.title);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ KakaoTalk(String str, String str2, String str3, Boolean bool, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str5;
                Boolean bool2;
                String str6 = null;
                if ((i & 1) != 0) {
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 65;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 23;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    str = null;
                }
                if ((i & 2) != 0) {
                    int i8 = IAuthTabCallback + 117;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 2 % 2;
                    str5 = null;
                } else {
                    str5 = str2;
                }
                String str7 = (i & 4) != 0 ? null : str3;
                if ((i & 8) != 0) {
                    int i11 = onNavigationEvent + 53;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    bool2 = null;
                } else {
                    bool2 = bool;
                }
                if ((i & 16) != 0) {
                    int i13 = onNavigationEvent + 59;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = 2 % 2;
                } else {
                    str6 = str4;
                }
                this(str, str5, str7, bool2, str6);
            }

            public final String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.availableHours;
                int i5 = i3 + 81;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 67 / 0;
                }
                return str;
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 49;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.url;
                int i5 = i2 + 25;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 7;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.description;
                int i5 = i2 + 79;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public final Boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                Boolean bool = this.available;
                int i4 = i3 + 13;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return bool;
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 95;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.title;
                int i5 = i2 + 105;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }

        @liq
        public static final class Phone {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final boolean available;
            private final String availableHours;
            private final String description;
            private final String title;
            private final String unavailabilityReason;
            private final String url;

            static {
                int i = onExtraCallbackWithResult + 25;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                onWarmupCompleted = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Phone)) {
                    return false;
                }
                Phone phone = (Phone) obj;
                if (this.available != phone.available || !Intrinsics.areEqual(this.title, phone.title) || !Intrinsics.areEqual(this.description, phone.description) || !Intrinsics.areEqual(this.url, phone.url)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.availableHours, phone.availableHours)) {
                    if (Intrinsics.areEqual(this.unavailabilityReason, phone.unavailabilityReason)) {
                        return true;
                    }
                    int i3 = onWarmupCompleted + 29;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return false;
                    }
                    obj2.hashCode();
                    throw null;
                }
                int i4 = IAuthTabCallback + 27;
                int i5 = i4 % 128;
                onWarmupCompleted = i5;
                boolean z = i4 % 2 != 0;
                int i6 = i5 + 61;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return z;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 119;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode3 = Boolean.hashCode(this.available);
                String str = this.title;
                int iHashCode4 = 0;
                if (str == null) {
                    int i4 = IAuthTabCallback + 111;
                    onWarmupCompleted = i4 % 128;
                    iHashCode = i4 % 2 != 0 ? 1 : 0;
                } else {
                    iHashCode = str.hashCode();
                }
                String str2 = this.description;
                int iHashCode5 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.url;
                int iHashCode6 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.availableHours;
                if (str4 == null) {
                    int i5 = onWarmupCompleted + 121;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = str4.hashCode();
                }
                String str5 = this.unavailabilityReason;
                if (str5 != null) {
                    iHashCode4 = str5.hashCode();
                    int i7 = IAuthTabCallback + 21;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                }
                return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode4;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Phone(available=" + this.available + ", title=" + this.title + ", description=" + this.description + ", url=" + this.url + ", availableHours=" + this.availableHours + ", unavailabilityReason=" + this.unavailabilityReason + ")";
                int i2 = onWarmupCompleted + 67;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ Phone(int i, boolean z, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
                if (1 != (i & 1)) {
                    int i2 = onWarmupCompleted + 55;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    htf31.onExtraCallbackWithResult(i, 1, CreditPlusFraudInsuranceResponse$ReportChannel$Phone$.serializer.INSTANCE.getDescriptor());
                    int i4 = 2 % 2;
                }
                this.available = z;
                Object obj = null;
                if ((i & 2) == 0) {
                    this.title = null;
                    int i5 = 2 % 2;
                } else {
                    this.title = str;
                }
                if ((i & 4) == 0) {
                    int i6 = onWarmupCompleted + 53;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    this.description = null;
                } else {
                    this.description = str2;
                }
                if ((i & 8) == 0) {
                    this.url = null;
                } else {
                    this.url = str3;
                }
                if ((i & 16) == 0) {
                    this.availableHours = null;
                } else {
                    this.availableHours = str4;
                    int i8 = 2 % 2;
                }
                if ((i & 32) != 0) {
                    this.unavailabilityReason = str5;
                    return;
                }
                this.unavailabilityReason = null;
                int i9 = onWarmupCompleted + 109;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallback(Phone phone, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                vylVar.onNavigationEvent(serialDescriptor, 0, phone.available);
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || phone.title != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, phone.title);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || phone.description != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, phone.description);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i2 = onWarmupCompleted + 79;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (phone.url != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, phone.url);
                    }
                }
                if (true ^ vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                    int i4 = IAuthTabCallback + 115;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    if (phone.availableHours != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, phone.availableHours);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 5) || phone.unavailabilityReason != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, phone.unavailabilityReason);
                }
            }

            public final boolean onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 93;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                boolean z = this.available;
                int i5 = i3 + 123;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return z;
            }

            public final String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.title;
                int i5 = i2 + 123;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 6 / 0;
                }
                return str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 67;
                IAuthTabCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    throw null;
                }
                String str = this.description;
                int i4 = i2 + 41;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                String str = this.url;
                int i5 = i3 + 23;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.availableHours;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }
}
