package viva.republica.toss.network.model.teens;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.GuestTossUserRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestTossUserRequest {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String appVersion;
    private final String birthdate6Digit;
    private final String deviceId;
    private final String genderCode;
    private final String name;
    private final String os;
    private final String osVersion;
    private final String phone;
    private final onExtraCallback userAction;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.teens.GuestTossUserRequest$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = GuestTossUserRequest.onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            return kSerializerOnWarmupCompleted;
        }
    })};

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.teens.GuestTossUserRequest.GuestTossUserActionType", onExtraCallback.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.teens.GuestTossUserRequest.GuestTossUserActionType", onExtraCallback.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return kSerializerOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestTossUserRequest)) {
            int i4 = i2 + 107;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        GuestTossUserRequest guestTossUserRequest = (GuestTossUserRequest) obj;
        if (!Intrinsics.areEqual(this.os, guestTossUserRequest.os)) {
            int i5 = onExtraCallback + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.osVersion, guestTossUserRequest.osVersion) || (!Intrinsics.areEqual(this.appVersion, guestTossUserRequest.appVersion))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceId, guestTossUserRequest.deviceId)) {
            int i7 = IAuthTabCallback + 109;
            onExtraCallback = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.phone, guestTossUserRequest.phone)) {
            int i8 = IAuthTabCallback + 11;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.name, guestTossUserRequest.name)) {
            int i10 = IAuthTabCallback + 77;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 89 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.birthdate6Digit, guestTossUserRequest.birthdate6Digit)) {
            int i12 = IAuthTabCallback + 15;
            onExtraCallback = i12 % 128;
            return i12 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.genderCode, guestTossUserRequest.genderCode)) {
            return this.userAction == guestTossUserRequest.userAction;
        }
        int i13 = onExtraCallback + 85;
        IAuthTabCallback = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.os.hashCode();
        int iHashCode4 = this.osVersion.hashCode();
        int iHashCode5 = this.appVersion.hashCode();
        int iHashCode6 = this.deviceId.hashCode();
        String str = this.phone;
        int iHashCode7 = 0;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        if (str2 == null) {
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.birthdate6Digit;
        if (str3 == null) {
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.genderCode;
        if (str4 != null) {
            int i5 = onExtraCallback + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode7 = str4.hashCode();
        }
        return (((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + this.userAction.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestTossUserRequest(os=" + this.os + ", osVersion=" + this.osVersion + ", appVersion=" + this.appVersion + ", deviceId=" + this.deviceId + ", phone=" + this.phone + ", name=" + this.name + ", birthdate6Digit=" + this.birthdate6Digit + ", genderCode=" + this.genderCode + ", userAction=" + this.userAction + ")";
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuestTossUserRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            GuestTossUserRequest$.serializer serializerVar = GuestTossUserRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GuestTossUserRequest(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, viva.republica.toss.network.model.teens.GuestTossUserRequest.onExtraCallback r13, o.okycx r14) {
        /*
            r3 = this;
            r14 = r4 & 271(0x10f, float:3.8E-43)
            r0 = 271(0x10f, float:3.8E-43)
            r1 = 2
            if (r0 == r14) goto L25
            int r14 = viva.republica.toss.network.model.teens.GuestTossUserRequest.onExtraCallback
            int r14 = r14 + 75
            int r2 = r14 % 128
            viva.republica.toss.network.model.teens.GuestTossUserRequest.IAuthTabCallback = r2
            int r14 = r14 % r1
            if (r14 == 0) goto L1e
            viva.republica.toss.network.model.teens.GuestTossUserRequest$$serializer r14 = viva.republica.toss.network.model.teens.GuestTossUserRequest$.serializer.INSTANCE
            kotlinx.serialization.descriptors.SerialDescriptor r14 = r14.getDescriptor()
            r0 = 23320(0x5b18, float:3.2678E-41)
        L1a:
            o.htf31.onExtraCallbackWithResult(r4, r0, r14)
            goto L25
        L1e:
            viva.republica.toss.network.model.teens.GuestTossUserRequest$$serializer r14 = viva.republica.toss.network.model.teens.GuestTossUserRequest$.serializer.INSTANCE
            kotlinx.serialization.descriptors.SerialDescriptor r14 = r14.getDescriptor()
            goto L1a
        L25:
            r3.<init>()
            r3.os = r5
            r3.osVersion = r6
            r3.appVersion = r7
            r3.deviceId = r8
            r5 = r4 & 16
            r6 = 0
            if (r5 != 0) goto L43
            r3.phone = r6
            int r5 = viva.republica.toss.network.model.teens.GuestTossUserRequest.IAuthTabCallback
            int r5 = r5 + 105
            int r7 = r5 % 128
            viva.republica.toss.network.model.teens.GuestTossUserRequest.onExtraCallback = r7
            int r5 = r5 % r1
            if (r5 != 0) goto L45
            goto L47
        L43:
            r3.phone = r9
        L45:
            int r5 = r1 % r1
        L47:
            r5 = r4 & 32
            if (r5 != 0) goto L4e
            r3.name = r6
            goto L50
        L4e:
            r3.name = r10
        L50:
            int r5 = r1 % r1
            r5 = r4 & 64
            if (r5 != 0) goto L59
            r3.birthdate6Digit = r6
            goto L5b
        L59:
            r3.birthdate6Digit = r11
        L5b:
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto L71
            int r4 = viva.republica.toss.network.model.teens.GuestTossUserRequest.onExtraCallback
            int r4 = r4 + 17
            int r5 = r4 % 128
            viva.republica.toss.network.model.teens.GuestTossUserRequest.IAuthTabCallback = r5
            int r4 = r4 % r1
            r3.genderCode = r6
            if (r4 != 0) goto L6d
            goto L73
        L6d:
            r6.hashCode()
            throw r6
        L71:
            r3.genderCode = r12
        L73:
            r3.userAction = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.teens.GuestTossUserRequest.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, viva.republica.toss.network.model.teens.GuestTossUserRequest$onExtraCallback, o.okycx):void");
    }

    public GuestTossUserRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.os = str;
        this.osVersion = str2;
        this.appVersion = str3;
        this.deviceId = str4;
        this.phone = str5;
        this.name = str6;
        this.birthdate6Digit = str7;
        this.genderCode = str8;
        this.userAction = onextracallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.teens.GuestTossUserRequest r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.teens.GuestTossUserRequest.onExtraCallback
            int r1 = r1 + 79
            int r2 = r1 % 128
            viva.republica.toss.network.model.teens.GuestTossUserRequest.IAuthTabCallback = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.teens.GuestTossUserRequest.$childSerializers
            java.lang.String r2 = r7.os
            r3 = 0
            r8.onExtraCallback(r9, r3, r2)
            r2 = 1
            java.lang.String r4 = r7.osVersion
            r8.onExtraCallback(r9, r2, r4)
            java.lang.String r2 = r7.appVersion
            r8.onExtraCallback(r9, r0, r2)
            r2 = 3
            java.lang.String r4 = r7.deviceId
            r8.onExtraCallback(r9, r2, r4)
            r2 = 4
            boolean r4 = r8.onWarmupCompleted(r9, r2)
            r5 = 8
            if (r4 != 0) goto L42
            int r4 = viva.republica.toss.network.model.teens.GuestTossUserRequest.onExtraCallback
            int r4 = r4 + 91
            int r6 = r4 % 128
            viva.republica.toss.network.model.teens.GuestTossUserRequest.IAuthTabCallback = r6
            int r4 = r4 % r0
            java.lang.String r0 = r7.phone
            if (r4 == 0) goto L40
            int r3 = r5 / 0
            if (r0 == 0) goto L49
            goto L42
        L40:
            if (r0 == 0) goto L49
        L42:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r7.phone
            r8.onExtraCallbackWithResult(r9, r2, r0, r3)
        L49:
            r0 = 5
            boolean r2 = r8.onWarmupCompleted(r9, r0)
            if (r2 != 0) goto L54
            java.lang.String r2 = r7.name
            if (r2 == 0) goto L5b
        L54:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r7.name
            r8.onExtraCallbackWithResult(r9, r0, r2, r3)
        L5b:
            r0 = 6
            boolean r2 = r8.onWarmupCompleted(r9, r0)
            if (r2 != 0) goto L66
            java.lang.String r2 = r7.birthdate6Digit
            if (r2 == 0) goto L6d
        L66:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r7.birthdate6Digit
            r8.onExtraCallbackWithResult(r9, r0, r2, r3)
        L6d:
            r0 = 7
            boolean r2 = r8.onWarmupCompleted(r9, r0)
            if (r2 != 0) goto L78
            java.lang.String r2 = r7.genderCode
            if (r2 == 0) goto L7f
        L78:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r7.genderCode
            r8.onExtraCallbackWithResult(r9, r0, r2, r3)
        L7f:
            r0 = r1[r5]
            java.lang.Object r0 = r0.getValue()
            o.py r0 = (o.py) r0
            viva.republica.toss.network.model.teens.GuestTossUserRequest$onExtraCallback r7 = r7.userAction
            r8.onNavigationEvent(r9, r5, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.teens.GuestTossUserRequest.onExtraCallbackWithResult(viva.republica.toss.network.model.teens.GuestTossUserRequest, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallback PHONE_CHANGED = new onExtraCallback("PHONE_CHANGED", 0);
        public static final onExtraCallback NAME_CHANGED = new onExtraCallback("NAME_CHANGED", 1);
        public static final onExtraCallback BIRTHDATE_6DIGIT_CHANGED = new onExtraCallback("BIRTHDATE_6DIGIT_CHANGED", 2);
        public static final onExtraCallback GENDER_CODE_CHANGED = new onExtraCallback("GENDER_CODE_CHANGED", 3);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {PHONE_CHANGED, NAME_CHANGED, BIRTHDATE_6DIGIT_CHANGED, GENDER_CODE_CHANGED};
            int i5 = i3 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 113;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 45;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 30 / 0;
            }
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallback + 107;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }
}
