package o;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class registerSegment extends BaseApiResponse<onExtraCallback> {

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @SerializedName("companyAddress")
        private final onNavigationEvent companyAddress;

        @SerializedName("email")
        private final onExtraCallbackWithResult email;

        @SerializedName("homeAddress")
        private final onNavigationEvent homeAddress;

        @SerializedName(PKCS12.KEY_PHONE)
        private final onExtraCallbackWithResult phone;

        @SerializedName("residenceAddress")
        private final onNavigationEvent residenceAddress;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.registerSegment.onExtraCallback) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r6 = r1 + 107;
            o.registerSegment.onExtraCallback.IAuthTabCallback = r6 % 128;
            r6 = r6 % 2;
            r1 = r1 + 101;
            o.registerSegment.onExtraCallback.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            r6 = (o.registerSegment.onExtraCallback) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.email, r6.email) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.phone, r6.phone) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.homeAddress, r6.homeAddress) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            r6 = o.registerSegment.onExtraCallback.IAuthTabCallback + 7;
            o.registerSegment.onExtraCallback.onExtraCallback = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        
            if ((r6 % 2) != 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.residenceAddress, r6.residenceAddress) != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.companyAddress, r6.companyAddress) != false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        
            r6 = o.registerSegment.onExtraCallback.onExtraCallback + 89;
            o.registerSegment.onExtraCallback.IAuthTabCallback = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 45;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 74 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.email;
            if (onextracallbackwithresult == null) {
                int i2 = IAuthTabCallback + 71;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = onextracallbackwithresult.hashCode();
                int i4 = onExtraCallback + 67;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            onExtraCallbackWithResult onextracallbackwithresult2 = this.phone;
            if (onextracallbackwithresult2 == null) {
                int i6 = onExtraCallback + 55;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = onextracallbackwithresult2.hashCode();
            }
            onNavigationEvent onnavigationevent = this.homeAddress;
            int iHashCode3 = onnavigationevent == null ? 0 : onnavigationevent.hashCode();
            onNavigationEvent onnavigationevent2 = this.residenceAddress;
            int iHashCode4 = onnavigationevent2 == null ? 0 : onnavigationevent2.hashCode();
            onNavigationEvent onnavigationevent3 = this.companyAddress;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (onnavigationevent3 != null ? onnavigationevent3.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PersonalProfile(email=" + this.email + ", phone=" + this.phone + ", homeAddress=" + this.homeAddress + ", residenceAddress=" + this.residenceAddress + ", companyAddress=" + this.companyAddress + ")";
            int i2 = onExtraCallback + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @SerializedName("date")
        private final String date;

        @SerializedName("value")
        private final String value;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i4 = onWarmupCompleted + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.value, onextracallbackwithresult.value) || !Intrinsics.areEqual(this.date, onextracallbackwithresult.date)) {
                return false;
            }
            int i6 = onWarmupCompleted + 115;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            String str;
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int iHashCode2 = 0;
            if (i2 % 2 != 0 ? (str = this.value) != null : (str = this.value) != null) {
                iHashCode = str.hashCode();
                int i3 = onWarmupCompleted + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iHashCode = 0;
            }
            String str2 = this.date;
            if (str2 != null) {
                iHashCode2 = str2.hashCode();
                int i5 = onWarmupCompleted + 19;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ContactData(value=" + this.value + ", date=" + this.date + ")";
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public static final class onNavigationEvent {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @SerializedName("address")
        private final String address;

        @SerializedName("addressParts")
        private final List<String> addressParts;

        @SerializedName("addressType")
        private final IAuthTabCallback addressType;

        @SerializedName("date")
        private final String date;

        @SerializedName(PKCS12.KEY_PHONE)
        private final String phone;

        @SerializedName("postalCode")
        private final String postalCode;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i4 = onNavigationEvent + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!(!Intrinsics.areEqual(this.address, onnavigationevent.address))) {
                if (Intrinsics.areEqual(this.addressParts, onnavigationevent.addressParts)) {
                    return this.addressType == onnavigationevent.addressType && Intrinsics.areEqual(this.date, onnavigationevent.date) && Intrinsics.areEqual(this.phone, onnavigationevent.phone) && Intrinsics.areEqual(this.postalCode, onnavigationevent.postalCode);
                }
                int i6 = onNavigationEvent + 81;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 == 0;
            }
            int i7 = onNavigationEvent + 69;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 34 / 0;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            String str = this.address;
            int iHashCode4 = 0;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            List<String> list = this.addressParts;
            if (list == null) {
                int i2 = onNavigationEvent + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = list.hashCode();
            }
            IAuthTabCallback iAuthTabCallback = this.addressType;
            if (iAuthTabCallback == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = iAuthTabCallback.hashCode();
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            String str2 = this.date;
            if (str2 == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = str2.hashCode();
                int i6 = onNavigationEvent + 49;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            String str3 = this.phone;
            int iHashCode6 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.postalCode;
            if (str4 != null) {
                int i8 = onWarmupCompleted + 123;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                iHashCode4 = str4.hashCode();
            }
            return (((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AddressData(address=" + this.address + ", addressParts=" + this.addressParts + ", addressType=" + this.addressType + ", date=" + this.date + ", phone=" + this.phone + ", postalCode=" + this.postalCode + ")";
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallback LOCAL_ADDRESS = new IAuthTabCallback("LOCAL_ADDRESS", 0);
        public static final IAuthTabCallback PATH_ADDRESS = new IAuthTabCallback("PATH_ADDRESS", 1);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {LOCAL_ADDRESS, PATH_ADDRESS};
            int i5 = i3 + 17;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                int i4 = 99 / 0;
            }
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onNavigationEvent + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 115;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }
}
