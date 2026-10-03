package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class FileUtilsRenameException extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<FileUtilsRenameException> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final boolean driverLicenseSerialRequired;
    private final AdvertisingId idVerificationInput;
    private final isLimitAdTracking issueDateScrapingInfo;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String rrn;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<FileUtilsRenameException> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final FileUtilsRenameException[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 53;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            FileUtilsRenameException[] fileUtilsRenameExceptionArr = new FileUtilsRenameException[i];
            int i6 = i4 + 59;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return fileUtilsRenameExceptionArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FileUtilsRenameException createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback(parcel);
            }
            onExtraCallback(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FileUtilsRenameException[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 123;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return IAuthTabCallback(i);
            }
            IAuthTabCallback(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final FileUtilsRenameException onExtraCallback(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(FileUtilsRenameException.class.getClassLoader());
            isLimitAdTracking islimitadtrackingCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 113;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DynamicLoader dynamicLoaderCreateFromParcel = parcel.readInt() == 0 ? null : DynamicLoader.CREATOR.createFromParcel(parcel);
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            AdvertisingId advertisingIdCreateFromParcel = AdvertisingId.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                int i3 = onWarmupCompleted + 71;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            } else {
                islimitadtrackingCreateFromParcel = isLimitAdTracking.CREATOR.createFromParcel(parcel);
            }
            return new FileUtilsRenameException(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, mapOnNavigationEvent, z, string3, advertisingIdCreateFromParcel, islimitadtrackingCreateFromParcel);
        }
    }

    static {
        int i = onExtraCallback + 67;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = r5.key
            r6.writeString(r1)
            java.lang.String r1 = r5.type
            r6.writeString(r1)
            o.RCTCodelessLoggingEventListener r1 = r5.onBack
            r6.writeParcelable(r1, r7)
            java.lang.Boolean r1 = r5.clearPreviousLayouts
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L2a
            int r1 = o.FileUtilsRenameException.onWarmupCompleted
            int r1 = r1 + 73
            int r4 = r1 % 128
            o.FileUtilsRenameException.onNavigationEvent = r4
            int r1 = r1 % r0
            r6.writeInt(r3)
            goto L34
        L2a:
            r6.writeInt(r2)
            boolean r1 = r1.booleanValue()
            r6.writeInt(r1)
        L34:
            o.DynamicLoader r1 = r5.navigationRightButton
            if (r1 != 0) goto L56
            int r1 = o.FileUtilsRenameException.onWarmupCompleted
            int r1 = r1 + 105
            int r4 = r1 % 128
            o.FileUtilsRenameException.onNavigationEvent = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L47
            r6.writeInt(r3)
            goto L4a
        L47:
            r6.writeInt(r3)
        L4a:
            int r1 = o.FileUtilsRenameException.onNavigationEvent
            int r1 = r1 + 5
            int r4 = r1 % 128
            o.FileUtilsRenameException.onWarmupCompleted = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L69
            goto L67
        L56:
            r6.writeInt(r2)
            r1.writeToParcel(r6, r7)
            int r1 = o.FileUtilsRenameException.onNavigationEvent
            int r1 = r1 + 45
            int r4 = r1 % 128
            o.FileUtilsRenameException.onWarmupCompleted = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L69
        L67:
            int r1 = r0 % 5
        L69:
            o.Preconditions r1 = o.Preconditions.INSTANCE
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.logParam
            r1.onExtraCallbackWithResult(r4, r6, r7)
            boolean r1 = r5.driverLicenseSerialRequired
            r6.writeInt(r1)
            java.lang.String r1 = r5.rrn
            r6.writeString(r1)
            o.AdvertisingId r1 = r5.idVerificationInput
            r1.writeToParcel(r6, r7)
            o.isLimitAdTracking r1 = r5.issueDateScrapingInfo
            if (r1 != 0) goto L94
            r6.writeInt(r3)
            int r6 = o.FileUtilsRenameException.onNavigationEvent
            int r6 = r6 + 19
            int r7 = r6 % 128
            o.FileUtilsRenameException.onWarmupCompleted = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L92
            return
        L92:
            r6 = 0
            throw r6
        L94:
            r6.writeInt(r2)
            r1.writeToParcel(r6, r7)
            int r6 = o.FileUtilsRenameException.onNavigationEvent
            int r6 = r6 + 9
            int r7 = r6 % 128
            o.FileUtilsRenameException.onWarmupCompleted = r7
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FileUtilsRenameException.writeToParcel(android.os.Parcel, int):void");
    }

    public FileUtilsRenameException(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, boolean z, @Nullable String str3, @NotNull AdvertisingId advertisingId, @Nullable isLimitAdTracking islimitadtracking) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(advertisingId, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.driverLicenseSerialRequired = z;
        this.rrn = str3;
        this.idVerificationInput = advertisingId;
        this.issueDateScrapingInfo = islimitadtracking;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onBack;
        }
        throw null;
    }

    public Boolean onNavigationEvent() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.clearPreviousLayouts;
            int i4 = 29 / 0;
        } else {
            bool = this.clearPreviousLayouts;
        }
        int i5 = i2 + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader IAuthTabCallbackStub() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            dynamicLoader = this.navigationRightButton;
            int i4 = 91 / 0;
        } else {
            dynamicLoader = this.navigationRightButton;
        }
        int i5 = i2 + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.driverLicenseSerialRequired;
        int i5 = i2 + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.rrn;
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    public final AdvertisingId onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        AdvertisingId advertisingId = this.idVerificationInput;
        int i5 = i2 + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return advertisingId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final isLimitAdTracking IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        isLimitAdTracking islimitadtracking = this.issueDateScrapingInfo;
        int i4 = i3 + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return islimitadtracking;
    }
}
