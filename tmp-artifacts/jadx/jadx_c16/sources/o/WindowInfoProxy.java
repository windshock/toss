package o;

import com.google.firebase.messaging.FcmBroadcastProcessor$;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WindowInfoProxy {
    private static int ICustomTabsCallback = 1;
    private static int extraCallbackWithResult;
    private final String IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final String access000;
    private final String access100;
    private final String asBinder;
    private final long asInterface;
    private final String getInterfaceDescriptor;
    private final String onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final long onTransact;
    private final String onWarmupCompleted;

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i3 | i8 | i4)) | (~(i7 | i6)) | (~(i10 | i7));
        int i14 = i4 + i6 + i5 + ((-1336646162) * i2) + (1706069763 * i);
        int i15 = i14 * i14;
        int i16 = ((i4 * (-1709230891)) - 203685888) + ((-1709230891) * i6) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i5) + ((-602931200) * i2) + ((-1331167232) * i) + ((-1604583424) * i15);
        int i17 = ((i4 * 112646815) - 831444653) + (i6 * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (i5 * 112647075) + (i2 * (-2078048118)) + (i * (-2015059991)) + (i15 * (-829161472));
        int i18 = i16 + (i17 * i17 * (-1266417664));
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        WindowInfoProxy windowInfoProxy = (WindowInfoProxy) objArr[0];
        int i19 = 2 % 2;
        int i20 = extraCallbackWithResult;
        int i21 = i20 + 37;
        ICustomTabsCallback = i21 % 128;
        int i22 = i21 % 2;
        long j = windowInfoProxy.asInterface;
        int i23 = i20 + 7;
        ICustomTabsCallback = i23 % 128;
        int i24 = i23 % 2;
        return Long.valueOf(j);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        extraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInfoProxy)) {
            return false;
        }
        WindowInfoProxy windowInfoProxy = (WindowInfoProxy) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, windowInfoProxy.IAuthTabCallbackStubProxy)) {
            int i3 = extraCallbackWithResult + 25;
            ICustomTabsCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, windowInfoProxy.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.asBinder, windowInfoProxy.asBinder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, windowInfoProxy.onWarmupCompleted)) {
            int i4 = ICustomTabsCallback + 57;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.access100, windowInfoProxy.access100)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, windowInfoProxy.onExtraCallback)) {
            int i5 = ICustomTabsCallback + 103;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, windowInfoProxy.IAuthTabCallback)) {
            int i7 = ICustomTabsCallback + 1;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.access000, windowInfoProxy.access000)) {
            int i9 = ICustomTabsCallback + 5;
            extraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback_Parcel, windowInfoProxy.IAuthTabCallback_Parcel)) {
            int i11 = ICustomTabsCallback + 59;
            extraCallbackWithResult = i11 % 128;
            return i11 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.getInterfaceDescriptor, windowInfoProxy.getInterfaceDescriptor)) {
            int i12 = ICustomTabsCallback + 29;
            extraCallbackWithResult = i12 % 128;
            return i12 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, windowInfoProxy.onNavigationEvent) || this.onExtraCallbackWithResult != windowInfoProxy.onExtraCallbackWithResult || this.asInterface != windowInfoProxy.asInterface) {
            return false;
        }
        if (this.onTransact == windowInfoProxy.onTransact) {
            return this.IAuthTabCallbackDefault == windowInfoProxy.IAuthTabCallbackDefault;
        }
        int i13 = extraCallbackWithResult + 105;
        ICustomTabsCallback = i13 % 128;
        return i13 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.IAuthTabCallbackStubProxy;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = ICustomTabsCallback + 103;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = ICustomTabsCallback + 49;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode4 = this.IAuthTabCallbackStub.hashCode();
        int iHashCode5 = this.asBinder.hashCode();
        int iHashCode6 = this.onWarmupCompleted.hashCode();
        String str2 = this.access100;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.onExtraCallback.hashCode();
        String str3 = this.IAuthTabCallback;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        int iHashCode10 = this.access000.hashCode();
        String str4 = this.IAuthTabCallback_Parcel;
        if (str4 == null) {
            int i6 = extraCallbackWithResult + 99;
            ICustomTabsCallback = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.getInterfaceDescriptor;
        if (str5 != null) {
            int i7 = ICustomTabsCallback + 13;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                str5.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode3 = str5.hashCode();
        }
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.onNavigationEvent.hashCode()) * 31) + Long.hashCode(this.onExtraCallbackWithResult)) * 31) + Long.hashCode(this.asInterface)) * 31) + Long.hashCode(this.onTransact)) * 31) + Long.hashCode(this.IAuthTabCallbackDefault);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountStateCheckResult(tossAccountId=" + this.IAuthTabCallbackStubProxy + ", bankCode=" + this.IAuthTabCallbackStub + ", orgCode=" + this.asBinder + ", accountNumber=" + this.onWarmupCompleted + ", sequenceNo=" + this.access100 + ", accountName=" + this.onExtraCallback + ", assetImgUrl=" + this.IAuthTabCallback + ", resultCode=" + this.access000 + ", resultMessage=" + this.IAuthTabCallback_Parcel + ", terminationId=" + this.getInterfaceDescriptor + ", accountType=" + this.onNavigationEvent + ", accountBalance=" + this.onExtraCallbackWithResult + ", paymentAmount=" + this.asInterface + ", interest=" + this.onTransact + ", minusAmount=" + this.IAuthTabCallbackDefault + ")";
        int i2 = ICustomTabsCallback + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public WindowInfoProxy(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @Nullable String str7, @NotNull String str8, @Nullable String str9, @Nullable String str10, @NotNull String str11, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.IAuthTabCallbackStubProxy = str;
        this.IAuthTabCallbackStub = str2;
        this.asBinder = str3;
        this.onWarmupCompleted = str4;
        this.access100 = str5;
        this.onExtraCallback = str6;
        this.IAuthTabCallback = str7;
        this.access000 = str8;
        this.IAuthTabCallback_Parcel = str9;
        this.getInterfaceDescriptor = str10;
        this.onNavigationEvent = str11;
        this.onExtraCallbackWithResult = j;
        this.asInterface = j2;
        this.onTransact = j3;
        this.IAuthTabCallbackDefault = j4;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 77;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 41;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallbackStub;
        int i5 = i3 + 3;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 49;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.asBinder;
            int i4 = 81 / 0;
        } else {
            str = this.asBinder;
        }
        int i5 = i2 + 113;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 101;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 109;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.access100;
        int i4 = i2 + 75;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        WindowInfoProxy windowInfoProxy = (WindowInfoProxy) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = windowInfoProxy.onExtraCallback;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i3 + 93;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 109;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.access000;
        int i5 = i2 + 65;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback_Parcel;
        int i5 = i3 + 49;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        String str = this.getInterfaceDescriptor;
        int i5 = i3 + 19;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        WindowInfoProxy windowInfoProxy = (WindowInfoProxy) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(windowInfoProxy.onTransact);
        }
        long j = windowInfoProxy.onTransact;
        throw null;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallbackWithResult IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult > 0) {
            int i2 = extraCallbackWithResult + 101;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return onExtraCallbackWithResult.TRANSFER;
        }
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.TERMINATE;
        int i4 = ICustomTabsCallback + 81;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return onextracallbackwithresult;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        String str = this.IAuthTabCallbackStubProxy;
        if (str == null) {
            int i2 = extraCallbackWithResult + 31;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            str = "0000000";
        }
        int i4 = ICustomTabsCallback + 107;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onExtraCallbackWithResult TERMINATE = new onExtraCallbackWithResult("TERMINATE", 0, "C");
        public static final onExtraCallbackWithResult TRANSFER = new onExtraCallbackWithResult("TRANSFER", 1, "T");
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String requestString;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 43;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult onextracallbackwithresult = TERMINATE;
                onExtraCallbackWithResult onextracallbackwithresult2 = TRANSFER;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[3];
                onextracallbackwithresultArr[0] = onextracallbackwithresult;
                onextracallbackwithresultArr[1] = onextracallbackwithresult2;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{TERMINATE, TRANSFER};
            }
            int i4 = i2 + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 99;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i, String str2) {
            this.requestString = str2;
        }

        public final String getRequestString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.requestString;
            int i5 = i3 + 83;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallback + 99;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    public final String onExtraCallbackWithResult() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (String) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, iOnExtraCallback3, iOnExtraCallback, 1365288762, iOnExtraCallback2, -1365288761);
    }

    public final long asInterface() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Long) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, iOnExtraCallback3, iOnExtraCallback, 691346681, iOnExtraCallback2, -691346679)).longValue();
    }

    public final long access000() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Long) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, iOnExtraCallback3, iOnExtraCallback, 1142699074, iOnExtraCallback2, -1142699074)).longValue();
    }
}
