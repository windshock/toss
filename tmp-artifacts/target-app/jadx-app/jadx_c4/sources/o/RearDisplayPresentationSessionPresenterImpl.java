package o;

import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface RearDisplayPresentationSessionPresenterImpl {

    public static final class onTransact {
        private static int asInterface = 1;
        private static int onTransact;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final String asBinder;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 17;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onTransact)) {
                int i5 = i2 + 115;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onTransact ontransact = (onTransact) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, ontransact.onExtraCallback)) {
                int i7 = asInterface + 37;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, ontransact.onNavigationEvent)) {
                int i9 = asInterface + 69;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.asBinder, ontransact.asBinder)) {
                int i11 = onTransact + 121;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if ((!Intrinsics.areEqual(this.onWarmupCompleted, ontransact.onWarmupCompleted)) || !Intrinsics.areEqual(this.IAuthTabCallback, ontransact.IAuthTabCallback) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, ontransact.IAuthTabCallbackStub)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ontransact.onExtraCallbackWithResult)) {
                return true;
            }
            int i13 = asInterface + 45;
            onTransact = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = onTransact + 55;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode3 = this.onExtraCallback.hashCode();
            int iHashCode4 = this.onNavigationEvent.hashCode();
            int iHashCode5 = this.asBinder.hashCode();
            int iHashCode6 = this.onWarmupCompleted.hashCode();
            String str = this.IAuthTabCallback;
            if (str == null) {
                int i4 = onTransact + 95;
                asInterface = i4 % 128;
                iHashCode = i4 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.IAuthTabCallbackStub;
            if (str2 == null) {
                int i5 = asInterface + 121;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
            }
            String str3 = this.onExtraCallbackWithResult;
            return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProductItem(imageUrl=" + this.onExtraCallback + ", productName=" + this.onNavigationEvent + ", salePrice=" + this.asBinder + ", ctaText=" + this.onWarmupCompleted + ", originalPrice=" + this.IAuthTabCallback + ", slotId=" + this.IAuthTabCallbackStub + ", landingUrl=" + this.onExtraCallbackWithResult + ")";
            int i2 = asInterface + 119;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onTransact(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.onExtraCallback = str;
            this.onNavigationEvent = str2;
            this.asBinder = str3;
            this.onWarmupCompleted = str4;
            this.IAuthTabCallback = str5;
            this.IAuthTabCallbackStub = str6;
            this.onExtraCallbackWithResult = str7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onTransact(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str8;
            String str9;
            String str10;
            if ((i & 16) != 0) {
                int i2 = onTransact + 125;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str8 = null;
            } else {
                str8 = str5;
            }
            if ((i & 32) != 0) {
                int i5 = onTransact + 3;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str9 = null;
            } else {
                str9 = str6;
            }
            if ((i & 64) != 0) {
                int i8 = onTransact + 125;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
                str10 = null;
            } else {
                str10 = str7;
            }
            this(str, str2, str3, str4, str8, str9, str10);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 21;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 47;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 111;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i3 + 5;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 109;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            String str = this.asBinder;
            int i5 = i3 + 1;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 69;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 71;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 53;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = asInterface + 43;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.IAuthTabCallbackStub;
            int i4 = i3 + 101;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 3;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i4 = i2 + 61;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback) || !Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                return false;
            }
            int i6 = IAuthTabCallback + 97;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 89 / 0;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1 r3 r4
          0x003b: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r4v5 java.lang.String) = (r4v0 java.lang.String), (r4v6 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
          0x0030: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            String str;
            int iHashCode3;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.onExtraCallback.hashCode();
                iHashCode2 = this.onNavigationEvent.hashCode();
                str = this.onExtraCallbackWithResult;
                if (str == null) {
                    int i3 = IAuthTabCallbackStub + 95;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = str.hashCode();
                }
            } else {
                iHashCode = this.onExtraCallback.hashCode();
                iHashCode2 = this.onNavigationEvent.hashCode();
                str = this.onExtraCallbackWithResult;
                if (str == null) {
                }
            }
            String str2 = this.onWarmupCompleted;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ImageItem(imageUrl=" + this.onExtraCallback + ", productName=" + this.onNavigationEvent + ", badgeText=" + this.onExtraCallbackWithResult + ", slotId=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 39;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallback = str;
            this.onNavigationEvent = str2;
            this.onExtraCallbackWithResult = str3;
            this.onWarmupCompleted = str4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                int i2 = IAuthTabCallback + 73;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 % 5;
                } else {
                    int i4 = 2 % 2;
                }
                str3 = null;
            }
            if ((i & 8) != 0) {
                int i5 = IAuthTabCallbackStub + 73;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str4 = null;
            }
            this(str, str2, str3, str4);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 71;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i3 + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 45;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            int i4 = i3 + 63;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 109;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 101;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback SQUIRCLE = new IAuthTabCallback("SQUIRCLE", 0);
        public static final IAuthTabCallback SQUARE = new IAuthTabCallback("SQUARE", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {SQUIRCLE, SQUARE};
            int i5 = i3 + 45;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onExtraCallback + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallback + 1;
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
            int i = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallbackDefault {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallbackDefault[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallbackDefault PRODUCT = new IAuthTabCallbackDefault("PRODUCT", 0);
        public static final IAuthTabCallbackDefault SERVICE = new IAuthTabCallbackDefault("SERVICE", 1);
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ IAuthTabCallbackDefault[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = PRODUCT;
            if (i3 == 0) {
                return new IAuthTabCallbackDefault[]{iAuthTabCallbackDefault, SERVICE};
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault2 = SERVICE;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = new IAuthTabCallbackDefault[5];
            iAuthTabCallbackDefaultArr[1] = iAuthTabCallbackDefault;
            iAuthTabCallbackDefaultArr[1] = iAuthTabCallbackDefault2;
            return iAuthTabCallbackDefaultArr;
        }

        public static EnumEntries<IAuthTabCallbackDefault> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 103;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<IAuthTabCallbackDefault> enumEntries = $ENTRIES;
            int i5 = i2 + 9;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallbackDefault valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) Enum.valueOf(IAuthTabCallbackDefault.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public static IAuthTabCallbackDefault[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = (IAuthTabCallbackDefault[]) $VALUES.clone();
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackDefaultArr;
        }

        private IAuthTabCallbackDefault(String str, int i) {
        }

        static {
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr$values = $values();
            $VALUES = iAuthTabCallbackDefaultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackDefaultArr$values);
            int i = onWarmupCompleted + 123;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class IAuthTabCallbackStub implements RearDisplayPresentationSessionPresenterImpl {
        private static int extraCallback = 1;
        private static int getInterfaceDescriptor;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final String IAuthTabCallbackStubProxy;
        private final String IAuthTabCallback_Parcel;
        private final IAuthTabCallbackDefault access000;
        private final String access100;
        private final String asBinder;
        private final String asInterface;
        private final IAuthTabCallback onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        public static /* synthetic */ IAuthTabCallbackStub onExtraCallback(IAuthTabCallbackStub iAuthTabCallbackStub, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, IAuthTabCallbackDefault iAuthTabCallbackDefault, IAuthTabCallback iAuthTabCallback, String str9, String str10, String str11, String str12, int i, Object obj) {
            String str13;
            IAuthTabCallbackDefault iAuthTabCallbackDefault2;
            String str14;
            String str15;
            String str16;
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor;
            int i4 = i3 + 61;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            String str17 = (i & 1) != 0 ? iAuthTabCallbackStub.asInterface : str;
            String str18 = (i & 2) != 0 ? iAuthTabCallbackStub.IAuthTabCallbackStub : str2;
            String str19 = (i & 4) != 0 ? iAuthTabCallbackStub.IAuthTabCallbackStubProxy : str3;
            String str20 = (i & 8) != 0 ? iAuthTabCallbackStub.IAuthTabCallback_Parcel : str4;
            String str21 = (i & 16) != 0 ? iAuthTabCallbackStub.onExtraCallbackWithResult : str5;
            if ((i & 32) != 0) {
                str13 = iAuthTabCallbackStub.IAuthTabCallbackDefault;
                int i6 = i3 + 83;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str13 = str6;
            }
            String str22 = (i & 64) != 0 ? iAuthTabCallbackStub.onWarmupCompleted : str7;
            String str23 = (i & 128) != 0 ? iAuthTabCallbackStub.access100 : str8;
            if ((i & 256) != 0) {
                iAuthTabCallbackDefault2 = iAuthTabCallbackStub.access000;
                int i8 = i3 + 45;
                extraCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
            }
            IAuthTabCallback iAuthTabCallback2 = (i & 512) != 0 ? iAuthTabCallbackStub.onExtraCallback : iAuthTabCallback;
            if ((i & 1024) != 0) {
                int i10 = i3 + 67;
                extraCallback = i10 % 128;
                int i11 = i10 % 2;
                str14 = iAuthTabCallbackStub.onTransact;
            } else {
                str14 = str9;
            }
            if ((i & 2048) != 0) {
                int i12 = i3 + 79;
                str15 = str14;
                extraCallback = i12 % 128;
                int i13 = i12 % 2;
                str16 = iAuthTabCallbackStub.asBinder;
                int i14 = i3 + 51;
                extraCallback = i14 % 128;
                int i15 = i14 % 2;
            } else {
                str15 = str14;
                str16 = str10;
            }
            return iAuthTabCallbackStub.onNavigationEvent(str17, str18, str19, str20, str21, str13, str22, str23, iAuthTabCallbackDefault2, iAuthTabCallback2, str15, str16, (i & 4096) != 0 ? iAuthTabCallbackStub.onNavigationEvent : str11, (i & 8192) != 0 ? iAuthTabCallbackStub.IAuthTabCallback : str12);
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = ~(i7 | i5);
            int i9 = ~(i5 | i2);
            int i10 = i7 | (~i5);
            int i11 = i9 | (~(i10 | i6));
            int i12 = (~i6) | i10;
            int i13 = i5 + i2 + i + (1134938392 * i3) + ((-1730424158) * i4);
            int i14 = i13 * i13;
            int i15 = (1345404558 * i5) + 1061748736 + ((-382549644) * i2) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i) + (1924136960 * i3) + (748945408 * i4) + (912850944 * i14);
            int i16 = (i5 * 1914917686) + 639827133 + (i2 * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i * 1914918157) + (i3 * (-1451741640)) + (i4 * (-1338016710)) + (i14 * (-1605042176));
            if (i15 + (i16 * i16 * (-230752256)) != 1) {
                return onNavigationEvent(objArr);
            }
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) objArr[0];
            int i17 = 2 % 2;
            int i18 = getInterfaceDescriptor + 43;
            int i19 = i18 % 128;
            extraCallback = i19;
            int i20 = i18 % 2;
            String str = iAuthTabCallbackStub.onExtraCallbackWithResult;
            int i21 = i19 + 85;
            getInterfaceDescriptor = i21 % 128;
            int i22 = i21 % 2;
            return str;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = getInterfaceDescriptor + 111;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallbackStub)) {
                return false;
            }
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) obj;
            if (!Intrinsics.areEqual(this.asInterface, iAuthTabCallbackStub.asInterface) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, iAuthTabCallbackStub.IAuthTabCallbackStub)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, iAuthTabCallbackStub.IAuthTabCallbackStubProxy)) {
                int i4 = getInterfaceDescriptor + 111;
                extraCallback = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback_Parcel, iAuthTabCallbackStub.IAuthTabCallback_Parcel)) {
                int i5 = extraCallback + 87;
                getInterfaceDescriptor = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallbackStub.onExtraCallbackWithResult)) {
                int i6 = extraCallback + 51;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, iAuthTabCallbackStub.IAuthTabCallbackDefault)) {
                int i8 = extraCallback + 115;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallbackStub.onWarmupCompleted) || !Intrinsics.areEqual(this.access100, iAuthTabCallbackStub.access100)) {
                return false;
            }
            if (this.access000 != iAuthTabCallbackStub.access000) {
                int i10 = extraCallback;
                int i11 = i10 + 3;
                getInterfaceDescriptor = i11 % 128;
                int i12 = i11 % 2;
                int i13 = i10 + 35;
                getInterfaceDescriptor = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (this.onExtraCallback != iAuthTabCallbackStub.onExtraCallback) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onTransact, iAuthTabCallbackStub.onTransact)) {
                int i15 = getInterfaceDescriptor + 107;
                extraCallback = i15 % 128;
                return i15 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.asBinder, iAuthTabCallbackStub.asBinder)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallbackStub.onNavigationEvent))) {
                return Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallbackStub.IAuthTabCallback);
            }
            int i16 = extraCallback + 125;
            getInterfaceDescriptor = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            int i2 = extraCallback + 3;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode4 = this.asInterface.hashCode();
            int iHashCode5 = this.IAuthTabCallbackStub.hashCode();
            int iHashCode6 = this.IAuthTabCallbackStubProxy.hashCode();
            int iHashCode7 = this.IAuthTabCallback_Parcel.hashCode();
            int iHashCode8 = this.onExtraCallbackWithResult.hashCode();
            String str = this.IAuthTabCallbackDefault;
            int iHashCode9 = str == null ? 0 : str.hashCode();
            String str2 = this.onWarmupCompleted;
            int iHashCode10 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.access100;
            if (str3 == null) {
                int i4 = getInterfaceDescriptor + 5;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str3.hashCode();
            }
            int iHashCode11 = this.access000.hashCode();
            int iHashCode12 = this.onExtraCallback.hashCode();
            String str4 = this.onTransact;
            if (str4 == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = str4.hashCode();
                int i6 = extraCallback + 37;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
            }
            String str5 = this.asBinder;
            int iHashCode13 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.onNavigationEvent;
            if (str6 == null) {
                int i8 = getInterfaceDescriptor + 49;
                extraCallback = i8 % 128;
                int i9 = i8 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str6.hashCode();
            }
            String str7 = this.IAuthTabCallback;
            return (((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode13) * 31) + iHashCode3) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        public final IAuthTabCallbackStub onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(str, str2, str3, str4, str5, str6, str7, str8, iAuthTabCallbackDefault, iAuthTabCallback, str9, str10, str11, str12);
            int i2 = getInterfaceDescriptor + 5;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SingleList(headerTitle=" + this.asInterface + ", imageUrl=" + this.IAuthTabCallbackStub + ", productName=" + this.IAuthTabCallbackStubProxy + ", price=" + this.IAuthTabCallback_Parcel + ", ctaText=" + this.onExtraCallbackWithResult + ", originalPrice=" + this.IAuthTabCallbackDefault + ", clearanceText=" + this.onWarmupCompleted + ", slotId=" + this.access100 + ", style=" + this.access000 + ", assetStyle=" + this.onExtraCallback + ", headerSubtitle=" + this.onTransact + ", landingUrl=" + this.asBinder + ", footerText=" + this.onNavigationEvent + ", footerLandingUrl=" + this.IAuthTabCallback + ")";
            int i2 = extraCallback + 115;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallbackStub(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.asInterface = str;
            this.IAuthTabCallbackStub = str2;
            this.IAuthTabCallbackStubProxy = str3;
            this.IAuthTabCallback_Parcel = str4;
            this.onExtraCallbackWithResult = str5;
            this.IAuthTabCallbackDefault = str6;
            this.onWarmupCompleted = str7;
            this.access100 = str8;
            this.access000 = iAuthTabCallbackDefault;
            this.onExtraCallback = iAuthTabCallback;
            this.onTransact = str9;
            this.asBinder = str10;
            this.onNavigationEvent = str11;
            this.IAuthTabCallback = str12;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallbackStub(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, IAuthTabCallbackDefault iAuthTabCallbackDefault, IAuthTabCallback iAuthTabCallback, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str13;
            String str14;
            IAuthTabCallback iAuthTabCallback2;
            String str15;
            String str16;
            String str17;
            Object obj = null;
            if ((i & 32) != 0) {
                int i2 = extraCallback + 5;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str13 = null;
            } else {
                str13 = str6;
            }
            String str18 = (i & 64) != 0 ? null : str7;
            if ((i & 128) != 0) {
                int i3 = 2 % 2;
                str14 = null;
            } else {
                str14 = str8;
            }
            if ((i & 512) != 0) {
                int i4 = getInterfaceDescriptor + 111;
                extraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    IAuthTabCallback iAuthTabCallback3 = IAuthTabCallback.SQUARE;
                    obj.hashCode();
                    throw null;
                }
                iAuthTabCallback2 = IAuthTabCallback.SQUARE;
            } else {
                iAuthTabCallback2 = iAuthTabCallback;
            }
            if ((i & 1024) != 0) {
                int i5 = 2 % 2;
                str15 = null;
            } else {
                str15 = str9;
            }
            if ((i & 2048) != 0) {
                int i6 = 2 % 2;
                str16 = null;
            } else {
                str16 = str10;
            }
            String str19 = (i & 4096) != 0 ? null : str11;
            if ((i & 8192) != 0) {
                int i7 = extraCallback + 107;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                str17 = null;
            } else {
                str17 = str12;
            }
            this(str, str2, str3, str4, str5, str13, str18, str14, iAuthTabCallbackDefault, iAuthTabCallback2, str15, str16, str19, str17);
        }

        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = extraCallback;
            int i3 = i2 + 39;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            String str = this.asInterface;
            int i5 = i2 + 57;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = extraCallback + 31;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            String str = this.IAuthTabCallbackStub;
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
            return str;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 51;
            int i3 = i2 % 128;
            extraCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.IAuthTabCallbackStubProxy;
            int i4 = i3 + 37;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = extraCallback;
            int i3 = i2 + 73;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.IAuthTabCallback_Parcel;
            int i4 = i2 + 79;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return str;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = extraCallback + 125;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallbackDefault;
            int i5 = i3 + 21;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = extraCallback + 107;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 61;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) objArr[0];
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 89;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = iAuthTabCallbackStub.access100;
            if (i3 == 0) {
                int i4 = 57 / 0;
            }
            return str;
        }

        public final IAuthTabCallbackDefault access100() {
            IAuthTabCallbackDefault iAuthTabCallbackDefault;
            int i = 2 % 2;
            int i2 = extraCallback;
            int i3 = i2 + 123;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                iAuthTabCallbackDefault = this.access000;
                int i4 = 39 / 0;
            } else {
                iAuthTabCallbackDefault = this.access000;
            }
            int i5 = i2 + 105;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackDefault;
        }

        public final IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 81;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
            int i5 = i2 + 65;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 87;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onTransact;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = extraCallback + 93;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 17;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            return (String) onExtraCallbackWithResult(new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), 1848105013, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1848105012, alertWithArgs.onExtraCallbackWithResult());
        }

        public final String getInterfaceDescriptor() {
            return (String) onExtraCallbackWithResult(new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), 711978474, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -711978474, alertWithArgs.onExtraCallbackWithResult());
        }
    }

    public static final class asBinder implements RearDisplayPresentationSessionPresenterImpl {
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface;
        private final String IAuthTabCallback;
        private final List<onTransact> IAuthTabCallbackStub;
        private final IAuthTabCallback onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof o.RearDisplayPresentationSessionPresenterImpl.asBinder) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (o.RearDisplayPresentationSessionPresenterImpl.asBinder) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onTransact, r6.onTransact) == true) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            r6 = o.RearDisplayPresentationSessionPresenterImpl.asBinder.IAuthTabCallbackDefault + 23;
            o.RearDisplayPresentationSessionPresenterImpl.asBinder.asInterface = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallbackStub, r6.IAuthTabCallbackStub) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        
            if (r5.onExtraCallback == r6.onExtraCallback) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            r6 = o.RearDisplayPresentationSessionPresenterImpl.asBinder.asInterface + 47;
            o.RearDisplayPresentationSessionPresenterImpl.asBinder.IAuthTabCallbackDefault = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        
            if ((r6 % 2) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        
            r6 = o.RearDisplayPresentationSessionPresenterImpl.asBinder.IAuthTabCallbackDefault + 31;
            o.RearDisplayPresentationSessionPresenterImpl.asBinder.asInterface = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 5;
            o.RearDisplayPresentationSessionPresenterImpl.asBinder.asInterface = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 83;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 68 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.onTransact.hashCode();
            int iHashCode4 = this.IAuthTabCallbackStub.hashCode();
            int iHashCode5 = this.onExtraCallback.hashCode();
            String str = this.onNavigationEvent;
            int iHashCode6 = 0;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i2 = IAuthTabCallbackDefault + 111;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
            }
            String str2 = this.IAuthTabCallback;
            if (str2 == null) {
                int i4 = asInterface + 7;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 % 2;
                }
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
            }
            String str3 = this.onWarmupCompleted;
            int iHashCode7 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.onExtraCallbackWithResult;
            if (str4 != null) {
                int i6 = IAuthTabCallbackDefault + 39;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                iHashCode6 = str4.hashCode();
            }
            int i8 = (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode6;
            int i9 = IAuthTabCallbackDefault + 97;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            return i8;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MultiList(headerTitle=" + this.onTransact + ", items=" + this.IAuthTabCallbackStub + ", assetStyle=" + this.onExtraCallback + ", footerText=" + this.onNavigationEvent + ", clearanceText=" + this.IAuthTabCallback + ", headerSubtitle=" + this.onWarmupCompleted + ", footerLandingUrl=" + this.onExtraCallbackWithResult + ")";
            int i2 = asInterface + 83;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public asBinder(@NotNull String str, @NotNull List<onTransact> list, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onTransact = str;
            this.IAuthTabCallbackStub = list;
            this.onExtraCallback = iAuthTabCallback;
            this.onNavigationEvent = str2;
            this.IAuthTabCallback = str3;
            this.onWarmupCompleted = str4;
            this.onExtraCallbackWithResult = str5;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 15;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            String str = this.onTransact;
            int i5 = i3 + 91;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<onTransact> asBinder() {
            List<onTransact> list;
            int i = 2 % 2;
            int i2 = asInterface + 21;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 == 0) {
                list = this.IAuthTabCallbackStub;
                int i4 = 51 / 0;
            } else {
                list = this.IAuthTabCallbackStub;
            }
            int i5 = i3 + 47;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 33 / 0;
            }
            return list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ asBinder(String str, List list, IAuthTabCallback iAuthTabCallback, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            IAuthTabCallback iAuthTabCallback2;
            String str6;
            String str7;
            String str8;
            if ((i & 4) != 0) {
                int i2 = 2 % 2;
                iAuthTabCallback2 = IAuthTabCallback.SQUARE;
            } else {
                iAuthTabCallback2 = iAuthTabCallback;
            }
            Object obj = null;
            if ((i & 8) != 0) {
                int i3 = asInterface + 81;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                str6 = null;
            } else {
                str6 = str2;
            }
            String str9 = (i & 16) != 0 ? null : str3;
            if ((i & 32) != 0) {
                int i5 = asInterface + 71;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                str7 = null;
            } else {
                str7 = str4;
            }
            if ((i & 64) != 0) {
                int i7 = IAuthTabCallbackDefault + 19;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str8 = null;
            } else {
                str8 = str5;
            }
            this(str, list, iAuthTabCallback2, str6, str9, str7, str8);
        }

        public final IAuthTabCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 1;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
            int i5 = i2 + 29;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 73;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 63;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            String str = this.IAuthTabCallback;
            if (i3 != 0) {
                int i4 = 83 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 19;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements RearDisplayPresentationSessionPresenterImpl {
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallbackWithResult;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final List<onNavigationEvent> onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackDefault + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = IAuthTabCallbackDefault + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) || !Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback)) {
                int i6 = IAuthTabCallbackDefault + 51;
                onExtraCallbackWithResult = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!(!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback))) {
                return true;
            }
            int i7 = onExtraCallbackWithResult + 101;
            IAuthTabCallbackDefault = i7 % 128;
            return i7 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int iHashCode2 = this.onNavigationEvent.hashCode();
            String str = this.onExtraCallback;
            int i4 = 0;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.IAuthTabCallback;
            if (str2 != null) {
                int i5 = IAuthTabCallbackDefault + 93;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int iHashCode4 = str2.hashCode();
                if (i6 != 0) {
                    int i7 = 73 / 0;
                }
                i4 = iHashCode4;
            }
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MultiImage(headerTitle=" + this.onWarmupCompleted + ", items=" + this.onNavigationEvent + ", clearanceText=" + this.onExtraCallback + ", headerSubtitle=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallbackWithResult + 43;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
            }
            return str;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull List<onNavigationEvent> list, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.onWarmupCompleted = str;
            this.onNavigationEvent = list;
            this.onExtraCallback = str2;
            this.IAuthTabCallback = str3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            str2 = (i & 4) != 0 ? null : str2;
            if ((i & 8) != 0) {
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 27;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 39;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str3 = null;
            }
            this(str, list, str2, str3);
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 47;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 125;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final List<onNavigationEvent> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 69;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            List<onNavigationEvent> list = this.onNavigationEvent;
            int i5 = i3 + 125;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 73;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            String str = this.IAuthTabCallback;
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return str;
        }
    }

    public interface onExtraCallback extends RearDisplayPresentationSessionPresenterImpl {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onWarmupCompleted {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onWarmupCompleted[] $VALUES;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final onWarmupCompleted SINGLE = new onWarmupCompleted("SINGLE", 0);
            public static final onWarmupCompleted MULTIPLE = new onWarmupCompleted("MULTIPLE", 1);

            private static final /* synthetic */ onWarmupCompleted[] $values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                onWarmupCompleted[] onwarmupcompletedArr = {SINGLE, MULTIPLE};
                int i5 = i3 + 111;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onwarmupcompletedArr;
            }

            public static EnumEntries<onWarmupCompleted> getEntries() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 7;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                int i5 = i2 + 119;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return enumEntries;
            }

            public static onWarmupCompleted valueOf(String str) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                if (i3 != 0) {
                    int i4 = 13 / 0;
                }
                return onwarmupcompleted;
            }

            public static onWarmupCompleted[] values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i4 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompletedArr;
                }
                throw null;
            }

            private onWarmupCompleted(String str, int i) {
            }

            static {
                onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                $VALUES = onwarmupcompletedArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                int i = onExtraCallback + 121;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }
        }

        /* renamed from: o.RearDisplayPresentationSessionPresenterImpl$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0018onExtraCallback implements onExtraCallback {
            private static int IAuthTabCallbackStub = 0;
            private static int asBinder = 1;
            private final String IAuthTabCallback;
            private final String IAuthTabCallbackDefault;
            private final Integer asInterface;
            private final List<String> onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onNavigationEvent;
            private final String onTransact;
            private final onWarmupCompleted onWarmupCompleted;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
            
                if ((r6 instanceof o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback) != false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
            
                r6 = (o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback) r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onTransact, r6.onTransact) != false) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
            
                r6 = o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.IAuthTabCallbackStub + 37;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.asBinder = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
            
                if ((r6 % 2) != 0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallbackDefault, r6.IAuthTabCallbackDefault) != false) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
            
                if (r5.onWarmupCompleted == r6.onWarmupCompleted) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
            
                r6 = o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.IAuthTabCallbackStub + 31;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.asBinder = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
            
                if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback)) == false) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
            
                r6 = o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.IAuthTabCallbackStub + 117;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.asBinder = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
            
                if ((r6 % 2) != 0) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
            
                r6 = o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.asBinder + 49;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.IAuthTabCallbackStub = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
            
                if ((r6 % 2) == 0) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.asInterface, r6.asInterface) != false) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r2 = r2 + 109;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback.asBinder = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                if ((r2 % 2) != 0) goto L52;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = asBinder + 81;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                if (i2 % 2 != 0) {
                    int i4 = 42 / 0;
                }
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = asBinder + 33;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode2 = this.onTransact.hashCode();
                int iHashCode3 = this.onExtraCallback.hashCode();
                int iHashCode4 = this.IAuthTabCallbackDefault.hashCode();
                int iHashCode5 = this.onWarmupCompleted.hashCode();
                int iHashCode6 = this.onNavigationEvent.hashCode();
                String str = this.IAuthTabCallback;
                int iHashCode7 = str == null ? 0 : str.hashCode();
                String str2 = this.onExtraCallbackWithResult;
                if (str2 == null) {
                    int i4 = asBinder + 109;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str2.hashCode();
                }
                Integer num = this.asInterface;
                return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Selection(headerTitle=" + this.onTransact + ", choices=" + this.onExtraCallback + ", ctaText=" + this.IAuthTabCallbackDefault + ", choiceType=" + this.onWarmupCompleted + ", brandName=" + this.onNavigationEvent + ", clearanceText=" + this.IAuthTabCallback + ", bodyText=" + this.onExtraCallbackWithResult + ", preCheckedIndex=" + this.asInterface + ")";
                int i2 = asBinder + 59;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public C0018onExtraCallback(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                Intrinsics.checkNotNullParameter(str3, "");
                this.onTransact = str;
                this.onExtraCallback = list;
                this.IAuthTabCallbackDefault = str2;
                this.onWarmupCompleted = onwarmupcompleted;
                this.onNavigationEvent = str3;
                this.IAuthTabCallback = str4;
                this.onExtraCallbackWithResult = str5;
                this.asInterface = num;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ C0018onExtraCallback(String str, List list, String str2, onWarmupCompleted onwarmupcompleted, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str6;
                Integer num2;
                String str7 = (i & 32) != 0 ? null : str4;
                if ((i & 64) != 0) {
                    int i2 = IAuthTabCallbackStub + 51;
                    asBinder = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str6 = null;
                } else {
                    str6 = str5;
                }
                if ((i & 128) != 0) {
                    int i5 = asBinder + 9;
                    IAuthTabCallbackStub = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 60 / 0;
                    }
                    num2 = null;
                } else {
                    num2 = num;
                }
                this(str, list, str2, onwarmupcompleted, str3, str7, str6, num2);
            }

            public String onTransact() {
                String str;
                int i = 2 % 2;
                int i2 = asBinder;
                int i3 = i2 + 17;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    str = this.onTransact;
                    int i4 = 23 / 0;
                } else {
                    str = this.onTransact;
                }
                int i5 = i2 + 17;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final List<String> onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = asBinder + 61;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                List<String> list = this.onExtraCallback;
                int i5 = i3 + 97;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return list;
            }

            public String asBinder() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 93;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                String str = this.IAuthTabCallbackDefault;
                int i5 = i2 + 53;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onWarmupCompleted onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 43;
                asBinder = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
                int i4 = i2 + 23;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = asBinder;
                int i3 = i2 + 47;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onNavigationEvent;
                int i5 = i2 + 9;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asBinder + 75;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                String str = this.IAuthTabCallback;
                int i5 = i3 + 73;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 101;
                int i3 = i2 % 128;
                asBinder = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.onExtraCallbackWithResult;
                int i4 = i3 + 55;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            public final Integer IAuthTabCallbackStub() {
                Integer num;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 77;
                int i3 = i2 % 128;
                asBinder = i3;
                if (i2 % 2 == 0) {
                    num = this.asInterface;
                    int i4 = 34 / 0;
                } else {
                    num = this.asInterface;
                }
                int i5 = i3 + 115;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return num;
            }
        }

        public static final class onExtraCallbackWithResult implements onExtraCallback {
            private static int IAuthTabCallbackDefault = 1;
            private static int asInterface;
            private final String IAuthTabCallback;
            private final String onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onNavigationEvent;
            private final String onWarmupCompleted;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
            
                if ((r6 instanceof o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult) != false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
            
                r2 = r2 + 97;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallbackDefault = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                if ((r2 % 2) != 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
            
                r6 = (o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult) r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
            
                r6 = o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallbackDefault + 23;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult.asInterface = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
            
                r6 = o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult.asInterface + 103;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallbackDefault = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
            
                r6 = o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallbackDefault + 125;
                o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult.asInterface = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
            
                if ((r6 % 2) == 0) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
            
                if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted)) == true) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
            
                return false;
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
                int i2 = IAuthTabCallbackDefault + 27;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 != 0) {
                    int i4 = 66 / 0;
                }
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = this.IAuthTabCallback.hashCode();
                int iHashCode3 = this.onNavigationEvent.hashCode();
                int iHashCode4 = this.onExtraCallbackWithResult.hashCode();
                String str = this.onExtraCallback;
                int iHashCode5 = 0;
                if (str == null) {
                    int i2 = asInterface + 89;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                String str2 = this.onWarmupCompleted;
                if (str2 != null) {
                    int i4 = IAuthTabCallbackDefault + 75;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode5 = str2.hashCode();
                }
                return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Field(headerTitle=" + this.IAuthTabCallback + ", ctaText=" + this.onNavigationEvent + ", brandName=" + this.onExtraCallbackWithResult + ", clearanceText=" + this.onExtraCallback + ", bodyText=" + this.onWarmupCompleted + ")";
                int i2 = IAuthTabCallbackDefault + 69;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                this.IAuthTabCallback = str;
                this.onNavigationEvent = str2;
                this.onExtraCallbackWithResult = str3;
                this.onExtraCallback = str4;
                this.onWarmupCompleted = str5;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str6;
                String str7;
                if ((i & 8) != 0) {
                    int i2 = asInterface + 121;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if ((i & 16) != 0) {
                    int i4 = IAuthTabCallbackDefault;
                    int i5 = i4 + 115;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 31;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 2 % 2;
                    str7 = null;
                } else {
                    str7 = str5;
                }
                this(str, str2, str3, str6, str7);
            }

            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 41;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                String str = this.IAuthTabCallback;
                int i5 = i2 + 107;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 99;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onNavigationEvent;
                int i5 = i2 + 53;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String onExtraCallback() {
                String str;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 111;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 != 0) {
                    str = this.onExtraCallbackWithResult;
                    int i4 = 13 / 0;
                } else {
                    str = this.onExtraCallbackWithResult;
                }
                int i5 = i3 + 113;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 48 / 0;
                }
                return str;
            }

            public String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 27;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.onExtraCallback;
                int i4 = i2 + 21;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = asInterface + 69;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                String str = this.onWarmupCompleted;
                int i5 = i3 + 9;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }
    }

    public static final class onExtraCallbackWithResult implements RearDisplayPresentationSessionPresenterImpl {
        private static int asBinder = 0;
        private static int onTransact = 1;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asBinder + 33;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i4 = asBinder + 83;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                return Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent);
            }
            int i6 = asBinder + 21;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = asBinder + 81;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onExtraCallback.hashCode();
            int iHashCode3 = this.onWarmupCompleted.hashCode();
            int iHashCode4 = this.onExtraCallbackWithResult.hashCode();
            String str = this.IAuthTabCallback;
            if (str == null) {
                int i4 = asBinder + 47;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i6 = asBinder + 71;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
            String str2 = this.onNavigationEvent;
            int iHashCode5 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
            int i8 = asBinder + 83;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return iHashCode5;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ImageBanner(headerTitle=" + this.onExtraCallback + ", imageUrl=" + this.onWarmupCompleted + ", ctaText=" + this.onExtraCallbackWithResult + ", overline=" + this.IAuthTabCallback + ", subtitle=" + this.onNavigationEvent + ")";
            int i2 = asBinder + 121;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onExtraCallback = str;
            this.onWarmupCompleted = str2;
            this.onExtraCallbackWithResult = str3;
            this.IAuthTabCallback = str4;
            this.onNavigationEvent = str5;
        }

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 61;
            int i3 = i2 % 128;
            asBinder = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.onExtraCallback;
            int i4 = i3 + 45;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 5;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 19;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 109;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.onExtraCallbackWithResult;
                int i4 = 8 / 0;
            } else {
                str = this.onExtraCallbackWithResult;
            }
            int i5 = i2 + 13;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 17;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 19;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 45;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onNavigationEvent;
            if (i3 == 0) {
                int i4 = 52 / 0;
            }
            return str;
        }
    }
}
