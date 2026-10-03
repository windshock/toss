package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.appInfo;
import o.checkNavigationBarByWindowManagerService;
import o.getWriggleLayout;
import o.htf31;
import o.kt;
import o.liq;
import o.makeAlignFaceBitmap;
import o.nc;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer;

@appInfo(IAuthTabCallback = "type")
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class DepositTarget implements Parcelable {
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = viva.republica.toss.network.model.transfer.DepositTarget.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = 105 - r8
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget.$$c(byte, byte, int):java.lang.String");
    }

    public /* synthetic */ DepositTarget(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer onExtraCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public abstract String onWarmupCompleted();

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            KSerializer kSerializer;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializer = (KSerializer) DepositTarget.onExtraCallbackWithResult().getValue();
                int i3 = 72 / 0;
            } else {
                kSerializer = (KSerializer) DepositTarget.onExtraCallbackWithResult().getValue();
            }
            int i4 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        public final KSerializer<DepositTarget> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<DepositTarget> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    static {
        onExtraCallback = 0;
        onNavigationEvent();
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.DepositTarget$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() throws Throwable {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallback = DepositTarget.onExtraCallback();
                    int i3 = 48 / 0;
                } else {
                    kSerializerOnExtraCallback = DepositTarget.onExtraCallback();
                }
                int i4 = onExtraCallback + 87;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnExtraCallback;
                }
                throw null;
            }
        });
        int i = onWarmupCompleted + 27;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private DepositTarget() {
    }

    public /* synthetic */ DepositTarget(int i, okycx okycxVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ KSerializer IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositTarget.class);
        KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(Account.class), Reflection.getOrCreateKotlinClass(Phone.class), Reflection.getOrCreateKotlinClass(Reserve.class), Reflection.getOrCreateKotlinClass(Share.class), Reflection.getOrCreateKotlinClass(User.class)};
        KSerializer[] kSerializerArr = {DepositTarget$Account$$serializer.INSTANCE, DepositTarget$Phone$$serializer.INSTANCE, DepositTarget$Reserve$$serializer.INSTANCE, DepositTarget$Share$$serializer.INSTANCE, DepositTarget$User$$serializer.INSTANCE};
        Object[] objArr = new Object[1];
        a(4 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getTouchSlop() >> 8) + 4, new char[]{65525, 0, '\t', 4}, true, 218 - MotionEvent.axisFromString(""), objArr);
        kt ktVar = new kt("viva.republica.toss.network.model.transfer.DepositTarget", orCreateKotlinClass, kClassArr, kSerializerArr, new Annotation[]{new DepositTarget$Account$$serializer.IAuthTabCallback(((String) objArr[0]).intern())});
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return ktVar;
    }

    public static final /* synthetic */ Lazy onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i2 + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @nc(IAuthTabCallback = "ACCOUNT")
    @liq
    public static final class Account extends DepositTarget {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String accountNo;
        private final int bankCode;
        private final String reserveKey;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Account> CREATOR = new onNavigationEvent();

        public static final class onNavigationEvent implements Parcelable.Creator<Account> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Account IAuthTabCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Account account = new Account(parcel.readInt(), parcel.readString(), parcel.readString());
                int i2 = onNavigationEvent + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return account;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Account createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Account accountIAuthTabCallback = IAuthTabCallback(parcel);
                int i4 = onNavigationEvent + 83;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return accountIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Account[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 49;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Account[] accountArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onWarmupCompleted + 107;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return accountArrOnNavigationEvent;
            }

            public final Account[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 3;
                onNavigationEvent = i3 % 128;
                Account[] accountArr = new Account[i];
                if (i3 % 2 != 0) {
                    int i4 = 69 / 0;
                }
                return accountArr;
            }
        }

        static {
            int i = IAuthTabCallback + 107;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 101;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account account = (Account) obj;
            if (this.bankCode != account.bankCode) {
                return false;
            }
            if (!Intrinsics.areEqual(this.accountNo, account.accountNo)) {
                int i2 = onExtraCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.reserveKey, account.reserveKey)) {
                return true;
            }
            int i3 = onExtraCallbackWithResult + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Integer.hashCode(this.bankCode);
                this.accountNo.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode2 = Integer.hashCode(this.bankCode);
            int iHashCode3 = this.accountNo.hashCode();
            String str = this.reserveKey;
            if (str == null) {
                int i3 = onExtraCallback + 121;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int i5 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
            int i6 = onExtraCallbackWithResult + 81;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Account(bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ", reserveKey=" + this.reserveKey + ")";
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeInt(this.bankCode);
                parcel.writeString(this.accountNo);
                parcel.writeString(this.reserveKey);
                throw null;
            }
            parcel.writeInt(this.bankCode);
            parcel.writeString(this.accountNo);
            parcel.writeString(this.reserveKey);
            int i5 = onExtraCallbackWithResult + 105;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 73 / 0;
            }
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Account> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    DepositTarget$Account$$serializer depositTarget$Account$$serializer = DepositTarget$Account$$serializer.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                DepositTarget$Account$$serializer depositTarget$Account$$serializer2 = DepositTarget$Account$$serializer.INSTANCE;
                int i3 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return depositTarget$Account$$serializer2;
                }
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Account(int i, int i2, String str, String str2, okycx okycxVar) {
            super(i, okycxVar);
            if (3 != (i & 3)) {
                htf31.onExtraCallbackWithResult(i, 3, DepositTarget$Account$$serializer.INSTANCE.getDescriptor());
            }
            this.bankCode = i2;
            this.accountNo = str;
            if ((i & 4) == 0) {
                this.reserveKey = null;
                int i3 = onExtraCallback + 15;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.reserveKey = str2;
            int i5 = onExtraCallbackWithResult + 23;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Account(int i, @NotNull String str, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.bankCode = i;
            this.accountNo = str;
            this.reserveKey = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.DepositTarget.Account r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.DepositTarget.Account.onExtraCallbackWithResult
                int r1 = r1 + 75
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.Account.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L21
                int r1 = r4.bankCode
                r5.onExtraCallback(r6, r2, r1)
                java.lang.String r1 = r4.accountNo
                r5.onExtraCallback(r6, r2, r1)
                r1 = 5
                boolean r1 = r5.onWarmupCompleted(r6, r1)
                if (r1 != 0) goto L4d
                goto L32
            L21:
                int r1 = r4.bankCode
                r5.onExtraCallback(r6, r2, r1)
                r1 = 1
                java.lang.String r3 = r4.accountNo
                r5.onExtraCallback(r6, r1, r3)
                boolean r1 = r5.onWarmupCompleted(r6, r0)
                if (r1 != 0) goto L4d
            L32:
                int r1 = viva.republica.toss.network.model.transfer.DepositTarget.Account.onExtraCallbackWithResult
                int r1 = r1 + 93
                int r3 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.Account.onExtraCallback = r3
                int r1 = r1 % r0
                if (r1 != 0) goto L47
                java.lang.String r1 = r4.onTransact()
                r3 = 76
                int r3 = r3 / r2
                if (r1 == 0) goto L56
                goto L4d
            L47:
                java.lang.String r1 = r4.onTransact()
                if (r1 == 0) goto L56
            L4d:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r4.onTransact()
                r5.onExtraCallbackWithResult(r6, r0, r1, r4)
            L56:
                int r4 = viva.republica.toss.network.model.transfer.DepositTarget.Account.onExtraCallback
                int r4 = r4 + 23
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.Account.onExtraCallbackWithResult = r5
                int r4 = r4 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget.Account.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.DepositTarget$Account, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Account(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 4) != 0) {
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 19;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 33;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                str2 = null;
            }
            this(i, str, str2);
        }

        public final int asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = this.bankCode;
            int i6 = i3 + 65;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 123;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.accountNo;
            int i5 = i2 + 59;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public String onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.reserveKey;
            int i4 = i3 + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(String.valueOf(this.bankCode), checkNavigationBarByWindowManagerService.TOSS.getCode());
                obj.hashCode();
                throw null;
            }
            boolean zAreEqual = Intrinsics.areEqual(String.valueOf(this.bankCode), checkNavigationBarByWindowManagerService.TOSS.getCode());
            int i3 = onExtraCallback + 79;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return zAreEqual;
            }
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.DepositTarget
        public String onWarmupCompleted() {
            int i = 2 % 2;
            String str = "Account(bankCode=" + this.bankCode + ", accountNo=" + makeAlignFaceBitmap.onExtraCallbackWithResult(this.accountNo) + ")";
            int i2 = onExtraCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 31 / 0;
            }
            return str;
        }
    }

    @nc(IAuthTabCallback = "PHONE")
    @liq
    public static final class Phone extends DepositTarget {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String phone;
        private final String reserveKey;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Phone> CREATOR = new onNavigationEvent();

        public static final class onNavigationEvent implements Parcelable.Creator<Phone> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Phone createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Phone phoneOnNavigationEvent = onNavigationEvent(parcel);
                int i4 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return phoneOnNavigationEvent;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Phone[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Phone[] phoneArrOnWarmupCompleted = onWarmupCompleted(i);
                if (i4 != 0) {
                    int i5 = 76 / 0;
                }
                int i6 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return phoneArrOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Phone onNavigationEvent(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Phone phone = new Phone(parcel.readString(), parcel.readString());
                int i2 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return phone;
                }
                throw null;
            }

            public final Phone[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent;
                int i4 = i3 + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Phone[] phoneArr = new Phone[i];
                int i6 = i3 + 9;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return phoneArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onWarmupCompleted + 103;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = (i2 % 2 == 0 ? 0 : 1) ^ 1;
            int i5 = i3 + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Phone)) {
                int i2 = onExtraCallbackWithResult + 13;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 121;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            Phone phone = (Phone) obj;
            if (!Intrinsics.areEqual(this.phone, phone.phone)) {
                return false;
            }
            if (Intrinsics.areEqual(this.reserveKey, phone.reserveKey)) {
                return true;
            }
            int i7 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3
          0x0028: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0028: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.DepositTarget.Phone.onNavigationEvent
                int r1 = r1 + 99
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.Phone.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L1d
                java.lang.String r1 = r5.phone
                int r1 = r1.hashCode()
                java.lang.String r3 = r5.reserveKey
                r4 = 31
                int r4 = r4 / r2
                if (r3 != 0) goto L28
                goto L2c
            L1d:
                java.lang.String r1 = r5.phone
                int r1 = r1.hashCode()
                java.lang.String r3 = r5.reserveKey
                if (r3 != 0) goto L28
                goto L2c
            L28:
                int r2 = r3.hashCode()
            L2c:
                int r1 = r1 * 31
                int r1 = r1 + r2
                int r2 = viva.republica.toss.network.model.transfer.DepositTarget.Phone.onExtraCallbackWithResult
                int r2 = r2 + 29
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.Phone.onNavigationEvent = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L3b
                return r1
            L3b:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget.Phone.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Phone(phone=" + this.phone + ", reserveKey=" + this.reserveKey + ")";
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String str = this.phone;
            if (i4 != 0) {
                parcel.writeString(str);
                parcel.writeString(this.reserveKey);
            } else {
                parcel.writeString(str);
                parcel.writeString(this.reserveKey);
                throw null;
            }
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Phone> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                DepositTarget$Phone$$serializer depositTarget$Phone$$serializer = DepositTarget$Phone$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return depositTarget$Phone$$serializer;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Phone(int i, String str, String str2, okycx okycxVar) {
            SerialDescriptor descriptor;
            super(i, okycxVar);
            int i2 = 1;
            if (1 != (i & 1)) {
                int i3 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    descriptor = DepositTarget$Phone$$serializer.INSTANCE.getDescriptor();
                    i2 = 0;
                } else {
                    descriptor = DepositTarget$Phone$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = 2 % 2;
            }
            this.phone = str;
            if ((i & 2) != 0) {
                this.reserveKey = str2;
                return;
            }
            this.reserveKey = null;
            int i5 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(@NotNull String str, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.phone = str;
            this.reserveKey = str2;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(Phone phone, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, phone.phone);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (phone.IAuthTabCallbackDefault() == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, phone.IAuthTabCallbackDefault());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Phone(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 113;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 89;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str2 = null;
            }
            this(str, str2);
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                str = this.phone;
                int i4 = 43 / 0;
            } else {
                str = this.phone;
            }
            int i5 = i3 + 63;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.reserveKey;
            int i5 = i2 + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.DepositTarget
        public String onWarmupCompleted() {
            int i = 2 % 2;
            String str = "Phone(phone=" + makeAlignFaceBitmap.onExtraCallback(this.phone) + ")";
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @nc(IAuthTabCallback = "RESERVE")
    @liq
    public static final class Reserve extends DepositTarget {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String reserveKey;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Reserve> CREATOR = new IAuthTabCallback();

        public static final class IAuthTabCallback implements Parcelable.Creator<Reserve> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Reserve IAuthTabCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Reserve reserve = new Reserve(parcel.readString());
                int i2 = IAuthTabCallback + 11;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return reserve;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Reserve createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return IAuthTabCallback(parcel);
                }
                IAuthTabCallback(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Reserve[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 5;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    onExtraCallbackWithResult(i);
                    throw null;
                }
                Reserve[] reserveArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = onNavigationEvent + 27;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return reserveArrOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }

            public final Reserve[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 93;
                IAuthTabCallback = i3 % 128;
                Reserve[] reserveArr = new Reserve[i];
                if (i3 % 2 == 0) {
                    return reserveArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reserve)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.reserveKey, ((Reserve) obj).reserveKey))) {
                int i3 = onNavigationEvent + 107;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            int i5 = onWarmupCompleted + 109;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.reserveKey.hashCode();
            int i4 = onWarmupCompleted + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Reserve(reserveKey=" + this.reserveKey + ")";
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeString(this.reserveKey);
                int i5 = 1 / 0;
            } else {
                parcel.writeString(this.reserveKey);
            }
            int i6 = onWarmupCompleted + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Reserve> serializer() {
                DepositTarget$Reserve$$serializer depositTarget$Reserve$$serializer;
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    depositTarget$Reserve$$serializer = DepositTarget$Reserve$$serializer.INSTANCE;
                    int i3 = 77 / 0;
                } else {
                    depositTarget$Reserve$$serializer = DepositTarget$Reserve$$serializer.INSTANCE;
                }
                int i4 = onNavigationEvent + 69;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return depositTarget$Reserve$$serializer;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Reserve(int i, String str, okycx okycxVar) {
            SerialDescriptor descriptor;
            super(i, okycxVar);
            int i2 = 1;
            if (1 != (i & 1)) {
                int i3 = onWarmupCompleted + 105;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    descriptor = DepositTarget$Reserve$$serializer.INSTANCE.getDescriptor();
                    i2 = 0;
                } else {
                    descriptor = DepositTarget$Reserve$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = 2 % 2;
            }
            this.reserveKey = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reserve(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reserveKey = str;
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(Reserve reserve, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, reserve.IAuthTabCallback());
            int i4 = onWarmupCompleted + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.reserveKey;
            }
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.DepositTarget
        public String onWarmupCompleted() {
            int i = 2 % 2;
            String str = "Reserve(reserveKey=" + IAuthTabCallback() + ")";
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @nc(IAuthTabCallback = "USER")
    @liq
    public static final class User extends DepositTarget {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final boolean maskRealName;
        private final String reserveKey;
        private final long userNo;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<User> CREATOR = new onWarmupCompleted();

        public static final class onWarmupCompleted implements Parcelable.Creator<User> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final User IAuthTabCallback(Parcel parcel) {
                boolean z;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                long j = parcel.readLong();
                if (parcel.readInt() != 0) {
                    int i2 = onExtraCallbackWithResult + 51;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    int i4 = onExtraCallbackWithResult + 41;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
                return new User(j, z, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ User createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                User userIAuthTabCallback = IAuthTabCallback(parcel);
                int i4 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return userIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ User[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    onNavigationEvent(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                User[] userArrOnNavigationEvent = onNavigationEvent(i);
                int i4 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return userArrOnNavigationEvent;
            }

            public final User[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i3 % 128;
                User[] userArr = new User[i];
                if (i3 % 2 == 0) {
                    int i4 = 47 / 0;
                }
                return userArr;
            }
        }

        static {
            int i = onWarmupCompleted + 73;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            if (this.userNo == user.userNo) {
                return this.maskRealName == user.maskRealName && Intrinsics.areEqual(this.reserveKey, user.reserveKey);
            }
            int i4 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = Long.hashCode(this.userNo);
            int iHashCode2 = Boolean.hashCode(this.maskRealName);
            String str = this.reserveKey;
            if (str == null) {
                int i3 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode3 = str.hashCode();
                int i5 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode3;
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + i;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "User(userNo=" + this.userNo + ", maskRealName=" + this.maskRealName + ", reserveKey=" + this.reserveKey + ")";
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.userNo);
            parcel.writeInt(this.maskRealName ? 1 : 0);
            parcel.writeString(this.reserveKey);
            int i5 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<User> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 109;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                DepositTarget$User$$serializer depositTarget$User$$serializer = DepositTarget$User$$serializer.INSTANCE;
                if (i3 == 0) {
                    return depositTarget$User$$serializer;
                }
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ User(int i, long j, boolean z, String str, okycx okycxVar) {
            super(i, okycxVar);
            if (1 != (i & 1)) {
                int i2 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, DepositTarget$User$$serializer.INSTANCE.getDescriptor());
                int i4 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this.userNo = j;
            if ((i & 2) == 0) {
                this.maskRealName = false;
            } else {
                this.maskRealName = z;
                int i7 = 2 % 2;
            }
            if ((i & 4) == 0) {
                this.reserveKey = null;
            } else {
                this.reserveKey = str;
            }
        }

        public User(long j, boolean z, @Nullable String str) {
            super(null);
            this.userNo = j;
            this.maskRealName = z;
            this.reserveKey = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.DepositTarget.User r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.DepositTarget.User.IAuthTabCallback
                int r1 = r1 + 13
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.User.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                long r4 = r6.userNo
                r7.onExtraCallback(r8, r3, r4)
                if (r1 == 0) goto L1c
                boolean r1 = r7.onWarmupCompleted(r8, r3)
                if (r1 != 0) goto L27
                goto L22
            L1c:
                boolean r1 = r7.onWarmupCompleted(r8, r2)
                if (r1 != 0) goto L27
            L22:
                boolean r1 = r6.maskRealName
                r1 = r1 ^ r2
                if (r1 == r2) goto L35
            L27:
                boolean r1 = r6.maskRealName
                r7.onNavigationEvent(r8, r2, r1)
                int r1 = viva.republica.toss.network.model.transfer.DepositTarget.User.IAuthTabCallback
                int r1 = r1 + 95
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.User.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
            L35:
                boolean r1 = r7.onWarmupCompleted(r8, r0)
                if (r1 != 0) goto L56
                int r1 = viva.republica.toss.network.model.transfer.DepositTarget.User.IAuthTabCallback
                int r1 = r1 + 41
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.User.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L50
                java.lang.String r1 = r6.asInterface()
                r2 = 58
                int r2 = r2 / r3
                if (r1 == 0) goto L5f
                goto L56
            L50:
                java.lang.String r1 = r6.asInterface()
                if (r1 == 0) goto L5f
            L56:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r6 = r6.asInterface()
                r7.onExtraCallbackWithResult(r8, r0, r1, r6)
            L5f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget.User.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.DepositTarget$User, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ User(long j, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i2 % 128;
                z = i2 % 2 == 0;
            }
            if ((i & 4) != 0) {
                int i3 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                str = null;
            }
            this(j, z, str);
        }

        public final long onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.userNo;
            }
            throw null;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.maskRealName;
            if (i3 != 0) {
                int i4 = 93 / 0;
            }
            return z;
        }

        public String asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.reserveKey;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.DepositTarget
        public String onWarmupCompleted() {
            int i = 2 % 2;
            String str = "User(UserNo=" + this.userNo + ")";
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @nc(IAuthTabCallback = "SHARE")
    @liq
    public static final class Share extends DepositTarget {
        public static final int $stable = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String receiverName;
        private final String reserveKey;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Share> CREATOR = new IAuthTabCallback();

        public static final class IAuthTabCallback implements Parcelable.Creator<Share> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Share createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Share shareOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                int i4 = IAuthTabCallback + 17;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return shareOnExtraCallbackWithResult;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Share[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 27;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Share[] shareArrOnExtraCallback = onExtraCallback(i);
                int i5 = IAuthTabCallback + 17;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return shareArrOnExtraCallback;
            }

            public final Share[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 125;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                Share[] shareArr = new Share[i];
                if (i3 % 2 != 0) {
                    int i5 = 44 / 0;
                }
                int i6 = i4 + 113;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return shareArr;
            }

            public final Share onExtraCallbackWithResult(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Share share = new Share(parcel.readString(), parcel.readString());
                int i2 = IAuthTabCallback + 41;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 31 / 0;
                }
                return share;
            }
        }

        static {
            int i = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 33;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Share)) {
                int i5 = i3 + 23;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            Share share = (Share) obj;
            if (!Intrinsics.areEqual(this.receiverName, share.receiverName)) {
                int i7 = onNavigationEvent + 37;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.reserveKey, share.reserveKey)) {
                return true;
            }
            int i9 = onExtraCallback + 63;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.receiverName.hashCode();
            String str = this.reserveKey;
            if (str == null) {
                int i4 = onNavigationEvent + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Share(receiverName=" + this.receiverName + ", reserveKey=" + this.reserveKey + ")";
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String str = this.receiverName;
            if (i4 != 0) {
                parcel.writeString(str);
                parcel.writeString(this.reserveKey);
            } else {
                parcel.writeString(str);
                parcel.writeString(this.reserveKey);
                throw null;
            }
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Share> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                DepositTarget$Share$$serializer depositTarget$Share$$serializer = DepositTarget$Share$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return depositTarget$Share$$serializer;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Share(int i, String str, String str2, okycx okycxVar) {
            SerialDescriptor descriptor;
            super(i, okycxVar);
            int i2 = 1;
            if (1 != (i & 1)) {
                int i3 = onExtraCallback + 51;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    descriptor = DepositTarget$Share$$serializer.INSTANCE.getDescriptor();
                    i2 = 0;
                } else {
                    descriptor = DepositTarget$Share$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = 2 % 2;
            }
            this.receiverName = str;
            if ((i & 2) != 0) {
                this.reserveKey = str2;
                return;
            }
            this.reserveKey = null;
            int i5 = onExtraCallback + 65;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Share(@NotNull String str, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.receiverName = str;
            this.reserveKey = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.DepositTarget.Share r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.DepositTarget.Share.onExtraCallback
                int r1 = r1 + 31
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.Share.onNavigationEvent = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                r4 = 0
                if (r1 != 0) goto L1d
                java.lang.String r1 = r5.receiverName
                r6.onExtraCallback(r7, r4, r1)
                boolean r1 = r6.onWarmupCompleted(r7, r4)
                if (r1 != 0) goto L3e
                goto L28
            L1d:
                java.lang.String r1 = r5.receiverName
                r6.onExtraCallback(r7, r4, r1)
                boolean r1 = r6.onWarmupCompleted(r7, r2)
                if (r1 != 0) goto L3e
            L28:
                int r1 = viva.republica.toss.network.model.transfer.DepositTarget.Share.onExtraCallback
                int r1 = r1 + 11
                int r4 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.Share.onNavigationEvent = r4
                int r1 = r1 % r0
                if (r1 == 0) goto L3a
                java.lang.String r1 = r5.IAuthTabCallbackDefault()
                if (r1 == 0) goto L47
                goto L3e
            L3a:
                r5.IAuthTabCallbackDefault()
                throw r3
            L3e:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r5.IAuthTabCallbackDefault()
                r6.onExtraCallbackWithResult(r7, r2, r1, r5)
            L47:
                int r5 = viva.republica.toss.network.model.transfer.DepositTarget.Share.onExtraCallback
                int r5 = r5 + 117
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.DepositTarget.Share.onNavigationEvent = r6
                int r5 = r5 % r0
                if (r5 == 0) goto L53
                return
            L53:
                r3.hashCode()
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget.Share.onExtraCallback(viva.republica.toss.network.model.transfer.DepositTarget$Share, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Share(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onNavigationEvent + 61;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                str2 = null;
            }
            this(str, str2);
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                str = this.receiverName;
                int i4 = 28 / 0;
            } else {
                str = this.receiverName;
            }
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.reserveKey;
            int i4 = i2 + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.DepositTarget
        public String onWarmupCompleted() {
            int i = 2 % 2;
            String str = "Share(receiverName=" + makeAlignFaceBitmap.IAuthTabCallback(this.receiverName) + ")";
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void onNavigationEvent() {
        onNavigationEvent = 478308930;
    }
}
