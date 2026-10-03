package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getVersionOverride implements Parcelable {
    public static final Parcelable.Creator<getVersionOverride> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("registerRequired")
    private final boolean _registerRequired;

    @SerializedName("cardCode")
    private final int cardCode;

    @SerializedName("cardVendorName")
    private final String cardVendorName;

    @SerializedName("fillIconUrl")
    private final String fillIconUrl;

    @SerializedName("inquiryMessage")
    private final String inquiryMessage;

    @SerializedName("inquirySuccess")
    private final boolean inquirySuccess;

    @SerializedName("inquiryTitle")
    private final String inquiryTitle;

    @SerializedName("reasonMessage")
    private final String reasonMessage;

    @SerializedName("reasonTitle")
    private final String reasonTitle;

    @SerializedName("registered")
    private final boolean registered;

    @SerializedName("responseCode")
    private final onWarmupCompleted responseCode;

    @SerializedName("squareImgUrl")
    private final String squareImgUrl;

    @SerializedName("status")
    private DefaultMediaViewVideoRendererApi status;

    @SerializedName("subscriptionTip")
    private final boolean subscriptionTip;

    @SerializedName("success")
    private final boolean success;

    @SerializedName("vendorPhoneNumber")
    private final String vendorPhoneNumber;

    @SerializedName("vendorResponseCode")
    private final String vendorResponseCode;

    public static final class onExtraCallback implements Parcelable.Creator<getVersionOverride> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getVersionOverride createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getVersionOverride getversionoverrideOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onWarmupCompleted + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getversionoverrideOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getVersionOverride[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getVersionOverride[] getversionoverrideArrOnExtraCallback = onExtraCallback(i);
            int i5 = onWarmupCompleted + 53;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return getversionoverrideArrOnExtraCallback;
            }
            throw null;
        }

        public final getVersionOverride[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 23;
            IAuthTabCallback = i3 % 128;
            getVersionOverride[] getversionoverrideArr = new getVersionOverride[i];
            if (i3 % 2 == 0) {
                return getversionoverrideArr;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.getVersionOverride onExtraCallbackWithResult(android.os.Parcel r23) {
            /*
                r22 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.String r1 = ""
                r2 = r23
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                int r4 = r23.readInt()
                java.lang.String r5 = r23.readString()
                int r1 = r23.readInt()
                r3 = 1
                r6 = 0
                if (r1 == 0) goto L1c
                r1 = r3
                goto L1d
            L1c:
                r1 = r6
            L1d:
                int r7 = r23.readInt()
                if (r7 != 0) goto L25
                r7 = r6
                goto L26
            L25:
                r7 = r3
            L26:
                int r8 = r23.readInt()
                r9 = 0
                if (r8 != 0) goto L2f
                r8 = r9
                goto L40
            L2f:
                java.lang.String r8 = r23.readString()
                o.DefaultMediaViewVideoRendererApi r8 = o.DefaultMediaViewVideoRendererApi.valueOf(r8)
                int r10 = o.getVersionOverride.onExtraCallback.IAuthTabCallback
                int r10 = r10 + 105
                int r11 = r10 % 128
                o.getVersionOverride.onExtraCallback.onWarmupCompleted = r11
                int r10 = r10 % r0
            L40:
                int r10 = r23.readInt()
                if (r10 == 0) goto L54
                int r10 = o.getVersionOverride.onExtraCallback.IAuthTabCallback
                int r10 = r10 + 125
                int r11 = r10 % 128
                o.getVersionOverride.onExtraCallback.onWarmupCompleted = r11
                int r10 = r10 % r0
                if (r10 != 0) goto L52
                goto L54
            L52:
                r10 = r3
                goto L55
            L54:
                r10 = r6
            L55:
                int r11 = r23.readInt()
                if (r11 == 0) goto L66
                int r11 = o.getVersionOverride.onExtraCallback.IAuthTabCallback
                int r11 = r11 + 53
                int r12 = r11 % 128
                o.getVersionOverride.onExtraCallback.onWarmupCompleted = r12
                int r11 = r11 % r0
                r11 = r3
                goto L67
            L66:
                r11 = r6
            L67:
                java.lang.String r12 = r23.readString()
                java.lang.String r13 = r23.readString()
                java.lang.String r14 = r23.readString()
                java.lang.String r15 = r23.readString()
                java.lang.String r16 = r23.readString()
                int r17 = r23.readInt()
                if (r17 == 0) goto L89
                java.lang.String r9 = r23.readString()
                o.getVersionOverride$onWarmupCompleted r9 = o.getVersionOverride.onWarmupCompleted.valueOf(r9)
            L89:
                r17 = r9
                java.lang.String r18 = r23.readString()
                int r9 = r23.readInt()
                if (r9 != 0) goto La0
                int r3 = o.getVersionOverride.onExtraCallback.IAuthTabCallback
                int r3 = r3 + 115
                int r9 = r3 % 128
                o.getVersionOverride.onExtraCallback.onWarmupCompleted = r9
                int r3 = r3 % r0
                r0 = r6
                goto La1
            La0:
                r0 = r3
            La1:
                o.getVersionOverride r21 = new o.getVersionOverride
                r3 = r21
                java.lang.String r19 = r23.readString()
                java.lang.String r20 = r23.readString()
                r6 = r1
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r21
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getVersionOverride.onExtraCallback.onExtraCallbackWithResult(android.os.Parcel):o.getVersionOverride");
        }
    }

    static {
        int i = IAuthTabCallback + 39;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getVersionOverride() {
        this(0, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, null, 131071, null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(getversionoverride.cardCode);
        parcel.writeString(getversionoverride.cardVendorName);
        parcel.writeInt(getversionoverride.registered ? 1 : 0);
        parcel.writeInt(getversionoverride._registerRequired ? 1 : 0);
        DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApi = getversionoverride.status;
        if (defaultMediaViewVideoRendererApi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(defaultMediaViewVideoRendererApi.name());
        }
        parcel.writeInt(getversionoverride.success ? 1 : 0);
        parcel.writeInt(getversionoverride.inquirySuccess ? 1 : 0);
        parcel.writeString(getversionoverride.inquiryTitle);
        parcel.writeString(getversionoverride.inquiryMessage);
        parcel.writeString(getversionoverride.reasonTitle);
        parcel.writeString(getversionoverride.reasonMessage);
        parcel.writeString(getversionoverride.squareImgUrl);
        onWarmupCompleted onwarmupcompleted = getversionoverride.responseCode;
        if (onwarmupcompleted == null) {
            int i4 = onNavigationEvent + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(onwarmupcompleted.name());
        }
        parcel.writeString(getversionoverride.vendorPhoneNumber);
        parcel.writeInt(getversionoverride.subscriptionTip ? 1 : 0);
        parcel.writeString(getversionoverride.vendorResponseCode);
        parcel.writeString(getversionoverride.fillIconUrl);
        int i6 = onExtraCallback + 103;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 78 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i3));
        int i10 = ~(i | i3);
        int i11 = ~i3;
        int i12 = (~(i5 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i + i3 + i6 + ((-1570926368) * i2) + ((-1409401439) * i4);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i) - 657981440) + (821186744 * i3) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i6) + (1124073472 * i2) + ((-332922880) * i4) + ((-1182662656) * i15);
        int i17 = (i * 1410161459) + 847508490 + (i3 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i6 * 1410159841) + (i2 * 1126552800) + (i4 * (-1948647807)) + (i15 * (-1287520256));
        int i18 = i16 + (i17 * i17 * (-1577189376));
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getVersionOverride)) {
            return false;
        }
        getVersionOverride getversionoverride = (getVersionOverride) obj;
        if (this.cardCode != getversionoverride.cardCode || !Intrinsics.areEqual(this.cardVendorName, getversionoverride.cardVendorName) || this.registered != getversionoverride.registered || this._registerRequired != getversionoverride._registerRequired || this.status != getversionoverride.status) {
            return false;
        }
        if (this.success != getversionoverride.success) {
            int i4 = onExtraCallback;
            int i5 = i4 + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 93;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.inquirySuccess != getversionoverride.inquirySuccess || !Intrinsics.areEqual(this.inquiryTitle, getversionoverride.inquiryTitle) || !Intrinsics.areEqual(this.inquiryMessage, getversionoverride.inquiryMessage) || !Intrinsics.areEqual(this.reasonTitle, getversionoverride.reasonTitle)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.reasonMessage, getversionoverride.reasonMessage)) {
            int i9 = onExtraCallback + 59;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.squareImgUrl, getversionoverride.squareImgUrl)) {
            int i11 = onExtraCallback + 57;
            onNavigationEvent = i11 % 128;
            return i11 % 2 != 0;
        }
        if (this.responseCode != getversionoverride.responseCode) {
            return false;
        }
        if (!Intrinsics.areEqual(this.vendorPhoneNumber, getversionoverride.vendorPhoneNumber)) {
            int i12 = onExtraCallback + 53;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.subscriptionTip != getversionoverride.subscriptionTip || !Intrinsics.areEqual(this.vendorResponseCode, getversionoverride.vendorResponseCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.fillIconUrl, getversionoverride.fillIconUrl)) {
            return true;
        }
        int i14 = onNavigationEvent + 51;
        onExtraCallback = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[PHI: r2 r4 r5 r6 r7
      0x004b: PHI (r2v40 int) = (r2v5 int), (r2v42 int) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r5v4 int) = (r5v1 int), (r5v6 int) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r6v4 int) = (r6v1 int), (r6v6 int) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r7v3 o.DefaultMediaViewVideoRendererApi) = (r7v0 o.DefaultMediaViewVideoRendererApi), (r7v5 o.DefaultMediaViewVideoRendererApi) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r2 r4 r5 r6
      0x0049: PHI (r2v6 int) = (r2v5 int), (r2v42 int) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r5v2 int) = (r5v1 int), (r5v6 int) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r6v2 int) = (r6v1 int), (r6v6 int) binds: [B:8:0x0047, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getVersionOverride.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationSubscription(cardCode=" + this.cardCode + ", cardVendorName=" + this.cardVendorName + ", registered=" + this.registered + ", _registerRequired=" + this._registerRequired + ", status=" + this.status + ", success=" + this.success + ", inquirySuccess=" + this.inquirySuccess + ", inquiryTitle=" + this.inquiryTitle + ", inquiryMessage=" + this.inquiryMessage + ", reasonTitle=" + this.reasonTitle + ", reasonMessage=" + this.reasonMessage + ", squareImgUrl=" + this.squareImgUrl + ", responseCode=" + this.responseCode + ", vendorPhoneNumber=" + this.vendorPhoneNumber + ", subscriptionTip=" + this.subscriptionTip + ", vendorResponseCode=" + this.vendorResponseCode + ", fillIconUrl=" + this.fillIconUrl + ")";
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public getVersionOverride(int i, @NotNull String str, boolean z, boolean z2, @Nullable DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApi, boolean z3, boolean z4, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6, @Nullable onWarmupCompleted onwarmupcompleted, @Nullable String str7, boolean z5, @Nullable String str8, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.cardCode = i;
        this.cardVendorName = str;
        this.registered = z;
        this._registerRequired = z2;
        this.status = defaultMediaViewVideoRendererApi;
        this.success = z3;
        this.inquirySuccess = z4;
        this.inquiryTitle = str2;
        this.inquiryMessage = str3;
        this.reasonTitle = str4;
        this.reasonMessage = str5;
        this.squareImgUrl = str6;
        this.responseCode = onwarmupcompleted;
        this.vendorPhoneNumber = str7;
        this.subscriptionTip = z5;
        this.vendorResponseCode = str8;
        this.fillIconUrl = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getVersionOverride(int i, String str, boolean z, boolean z2, DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApi, boolean z3, boolean z4, String str2, String str3, String str4, String str5, String str6, onWarmupCompleted onwarmupcompleted, String str7, boolean z5, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApi2;
        String str10;
        String str11;
        onWarmupCompleted onwarmupcompleted2;
        boolean z6;
        String str12;
        if ((i2 & 1) != 0) {
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        String str13 = "";
        String str14 = (i2 & 2) != 0 ? "" : str;
        boolean z7 = (i2 & 4) != 0 ? false : z;
        boolean z8 = (i2 & 8) != 0 ? false : z2;
        if ((i2 & 16) != 0) {
            int i6 = 2 % 2;
            defaultMediaViewVideoRendererApi2 = null;
        } else {
            defaultMediaViewVideoRendererApi2 = defaultMediaViewVideoRendererApi;
        }
        boolean z9 = (i2 & 32) != 0 ? false : z3;
        boolean z10 = (i2 & 64) != 0 ? false : z4;
        if ((i2 & 128) != 0) {
            int i7 = onExtraCallback + 125;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str10 = null;
        } else {
            str10 = str2;
        }
        if ((i2 & 256) != 0) {
            int i10 = 2 % 2;
            str11 = null;
        } else {
            str11 = str3;
        }
        String str15 = (i2 & 512) != 0 ? null : str4;
        String str16 = (i2 & 1024) != 0 ? null : str5;
        if ((i2 & 2048) != 0) {
            int i11 = onNavigationEvent + 113;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            onwarmupcompleted2 = null;
        } else {
            onwarmupcompleted2 = null;
            str13 = str6;
        }
        onWarmupCompleted onwarmupcompleted3 = (i2 & 4096) != 0 ? onwarmupcompleted2 : onwarmupcompleted;
        String str17 = (i2 & 8192) != 0 ? null : str7;
        if ((i2 & 16384) != 0) {
            int i12 = 2 % 2;
            z6 = false;
        } else {
            z6 = z5;
        }
        String str18 = (i2 & 32768) != 0 ? null : str8;
        if ((i2 & 65536) != 0) {
            int i13 = 2 % 2;
            str12 = null;
        } else {
            str12 = str9;
        }
        this(i3, str14, z7, z8, defaultMediaViewVideoRendererApi2, z9, z10, str10, str11, str15, str16, str13, onwarmupcompleted3, str17, z6, str18, str12);
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.cardCode;
        int i6 = i2 + 17;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return i5;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.cardVendorName;
        int i5 = i3 + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final DefaultMediaViewVideoRendererApi getInterfaceDescriptor() {
        DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApi;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            defaultMediaViewVideoRendererApi = this.status;
            int i4 = 79 / 0;
        } else {
            defaultMediaViewVideoRendererApi = this.status;
        }
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return defaultMediaViewVideoRendererApi;
    }

    public final void onWarmupCompleted(@Nullable DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApi) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.status = defaultMediaViewVideoRendererApi;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.inquirySuccess;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.inquiryTitle;
        int i4 = i3 + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.inquiryMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.reasonTitle;
        int i4 = i2 + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.reasonMessage;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = getversionoverride.squareImgUrl;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.vendorPhoneNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.subscriptionTip;
        int i4 = i2 + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.vendorResponseCode;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.fillIconUrl;
        int i5 = i3 + 11;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (!this._registerRequired || !(!this.registered)) {
            return false;
        }
        int i5 = i3 + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this.status != DefaultMediaViewVideoRendererApi.NOT_SUPPORT) {
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!IAuthTabCallbackDefault() && this.inquirySuccess) {
                int i6 = onExtraCallback;
                int i7 = i6 + 119;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 109;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 5 / 0;
                }
                return true;
            }
        }
        int i11 = onExtraCallback + 29;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 0 / 0;
        }
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted ALREADY_REGISTERED;
        public static final onWarmupCompleted ALREADY_WITHDRAW;
        public static final onWarmupCompleted OTHER;
        public static final onWarmupCompleted OWN_OTHERS_CARD;
        public static final onWarmupCompleted SUCCESS;
        public static final onWarmupCompleted USING_FREE_SMS;
        public static final onWarmupCompleted USING_OTHER_SERVICE;
        public static final onWarmupCompleted WITHDREW_VENDOR;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        private static final byte[] $$a = {51, -113, 92, 4};
        private static final int $$b = 91;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r5, int r6, int r7) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 4
                int r5 = r5 * 3
                int r5 = 105 - r5
                byte[] r0 = o.getVersionOverride.onWarmupCompleted.$$a
                int r6 = r6 * 3
                int r1 = 1 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L28
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L24:
                int r3 = r3 + 1
                r4 = r0[r7]
            L28:
                int r5 = r5 + r4
                int r7 = r7 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getVersionOverride.onWarmupCompleted.$$c(int, int, int):java.lang.String");
        }

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {SUCCESS, WITHDREW_VENDOR, ALREADY_REGISTERED, ALREADY_WITHDRAW, OWN_OTHERS_CARD, USING_OTHER_SERVICE, USING_FREE_SMS, OTHER};
            int i5 = i3 + 63;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 33 / 0;
            }
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 31;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
            }
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 == 0) {
                int i4 = 21 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallback + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted = 1;
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a(7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 5, new char[]{65527, 65527, 65529, 7, 7, 7, '\t'}, false, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 128, objArr);
            SUCCESS = new onWarmupCompleted(((String) objArr[0]).intern(), 0);
            WITHDREW_VENDOR = new onWarmupCompleted("WITHDREW_VENDOR", 1);
            ALREADY_REGISTERED = new onWarmupCompleted("ALREADY_REGISTERED", 2);
            ALREADY_WITHDRAW = new onWarmupCompleted("ALREADY_WITHDRAW", 3);
            OWN_OTHERS_CARD = new onWarmupCompleted("OWN_OTHERS_CARD", 4);
            USING_OTHER_SERVICE = new onWarmupCompleted("USING_OTHER_SERVICE", 5);
            USING_FREE_SMS = new onWarmupCompleted("USING_FREE_SMS", 6);
            OTHER = new onWarmupCompleted("OTHER", 7);
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 41;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getVersionOverride.onWarmupCompleted.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        static void onNavigationEvent() {
            onExtraCallbackWithResult = 478308893;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(635055909, zzmr.onExtraCallbackWithResult(), new Object[]{this}, -635055909, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2)).intValue();
    }

    public final String IAuthTabCallbackStubProxy() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(642069778, zzmr.onExtraCallbackWithResult(), new Object[]{this}, -642069776, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        onWarmupCompleted(-944000829, zzmr.onExtraCallbackWithResult(), new Object[]{this, parcel, Integer.valueOf(i)}, 944000830, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
    }
}
