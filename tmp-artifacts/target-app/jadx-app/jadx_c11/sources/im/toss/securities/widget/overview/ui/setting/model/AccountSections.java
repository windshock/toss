package im.toss.securities.widget.overview.ui.setting.model;

import im.toss.securities.widget.overview.ui.setting.model.AccountSections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.asFactorylambda8;
import o.handleRemoveKey;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AccountSections {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final onExtraCallback IAuthTabCallback;
    private final onExtraCallback onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSections)) {
            return false;
        }
        AccountSections accountSections = (AccountSections) obj;
        if (Intrinsics.areEqual(this.IAuthTabCallback, accountSections.IAuthTabCallback)) {
            return Intrinsics.areEqual(this.onExtraCallback, accountSections.onExtraCallback);
        }
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        onExtraCallback onextracallback = this.onExtraCallback;
        if (onextracallback == null) {
            int i4 = onWarmupCompleted + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = onextracallback.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountSections(myAccountSection=" + this.IAuthTabCallback + ", childAccountSection=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public AccountSections(@NotNull onExtraCallback onextracallback, @Nullable onExtraCallback onextracallback2) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.IAuthTabCallback = onextracallback;
        this.onExtraCallback = onextracallback2;
    }

    public final onExtraCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onExtraCallback onextracallback = this.IAuthTabCallback;
        int i4 = i2 + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onextracallback;
    }

    public final onExtraCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.onExtraCallback;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallback;
        }
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final onExtraCallbackWithResult onExtraCallback;
        private final onNavigationEvent onExtraCallbackWithResult;
        private final List<Account> onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = onWarmupCompleted + 95;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.onExtraCallback != onextracallback.onExtraCallback) {
                int i5 = IAuthTabCallback;
                int i6 = i5 + 9;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 25;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 28 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent))) {
                return true;
            }
            int i10 = IAuthTabCallback + 29;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onNavigationEvent.hashCode();
            int i4 = onWarmupCompleted + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AccountSection(type=" + this.onExtraCallback + ", assetInfo=" + this.onExtraCallbackWithResult + ", accounts=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull onNavigationEvent onnavigationevent, @NotNull List<Account> list) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.onExtraCallback = onextracallbackwithresult;
            this.onExtraCallbackWithResult = onnavigationevent;
            this.onNavigationEvent = list;
        }

        public final List<Account> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            List<Account> list = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 40 / 0;
            }
            return list;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onExtraCallbackWithResult {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            public static final onExtraCallbackWithResult My = new onExtraCallbackWithResult("My", 0);
            public static final onExtraCallbackWithResult Child = new onExtraCallbackWithResult("Child", 1);

            private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 55;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = My;
                if (i3 != 0) {
                    return new onExtraCallbackWithResult[]{onextracallbackwithresult, Child};
                }
                onExtraCallbackWithResult onextracallbackwithresult2 = Child;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[4];
                onextracallbackwithresultArr[1] = onextracallbackwithresult;
                onextracallbackwithresultArr[0] = onextracallbackwithresult2;
                return onextracallbackwithresultArr;
            }

            public static EnumEntries<onExtraCallbackWithResult> getEntries() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 65;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
                int i5 = i3 + 11;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return enumEntries;
            }

            public static onExtraCallbackWithResult valueOf(String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
                if (i3 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = onWarmupCompleted + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackwithresult;
            }

            public static onExtraCallbackWithResult[] values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackwithresultArr;
            }

            private onExtraCallbackWithResult(String str, int i) {
            }

            static {
                onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
                $VALUES = onextracallbackwithresultArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
                int i = onExtraCallback + 65;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final int onExtraCallbackWithResult;
        private final Long onNavigationEvent;
        private final IAuthTabCallback onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 53;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 123;
                onExtraCallback = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (this.onWarmupCompleted == onnavigationevent.onWarmupCompleted) {
                return Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent) && this.onExtraCallbackWithResult == onnavigationevent.onExtraCallbackWithResult;
            }
            int i6 = i2 + 85;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onWarmupCompleted.hashCode();
            Long l = this.onNavigationEvent;
            if (l == null) {
                int i4 = IAuthTabCallback + 7;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = l.hashCode();
            }
            int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
            int i6 = onExtraCallback + 103;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return iHashCode3;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AssetInfo(type=" + this.onWarmupCompleted + ", totalAmount=" + this.onNavigationEvent + ", fadeInIndex=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onNavigationEvent(@NotNull IAuthTabCallback iAuthTabCallback, @Nullable Long l, int i) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onWarmupCompleted = iAuthTabCallback;
            this.onNavigationEvent = l;
            this.onExtraCallbackWithResult = i;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class IAuthTabCallback {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IAuthTabCallback[] $VALUES;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final IAuthTabCallback My = new IAuthTabCallback("My", 0);
            public static final IAuthTabCallback Child = new IAuthTabCallback("Child", 1);

            private static final /* synthetic */ IAuthTabCallback[] $values() {
                IAuthTabCallback[] iAuthTabCallbackArr;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 71;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 != 0) {
                    IAuthTabCallback iAuthTabCallback = My;
                    IAuthTabCallback iAuthTabCallback2 = Child;
                    iAuthTabCallbackArr = new IAuthTabCallback[3];
                    iAuthTabCallbackArr[0] = iAuthTabCallback;
                    iAuthTabCallbackArr[0] = iAuthTabCallback2;
                } else {
                    iAuthTabCallbackArr = new IAuthTabCallback[]{My, Child};
                }
                int i4 = i3 + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return iAuthTabCallbackArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static EnumEntries<IAuthTabCallback> getEntries() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return $ENTRIES;
                }
                throw null;
            }

            public static IAuthTabCallback valueOf(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                if (i3 != 0) {
                    return iAuthTabCallback;
                }
                throw null;
            }

            public static IAuthTabCallback[] values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i4 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return iAuthTabCallbackArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallback(String str, int i) {
            }

            static {
                IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                $VALUES = iAuthTabCallbackArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                int i = onExtraCallback + 43;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }
    }

    @liq
    public static final class Account {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String accountNo;
        private final String displayName;
        private final String icon;
        private final boolean isPrimaryAccount;
        private final String key;
        private final String name;
        private final Long totalAmount;
        private final asFactorylambda8 type;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.setting.model.AccountSections$Account$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 45;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    AccountSections.Account.onExtraCallback();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallback = AccountSections.Account.onExtraCallback();
                int i3 = onExtraCallbackWithResult + 19;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                obj.hashCode();
                throw null;
            }
        }), null, null, null};

        private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.tosssecurities.core.account.domain.model.AccountType", asFactorylambda8.values());
            int i4 = IAuthTabCallback + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i4 = IAuthTabCallback + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallbackStub;
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = i | i7 | (~i4);
            int i9 = ~i;
            int i10 = (~(i4 | i7)) | (~(i7 | i9));
            int i11 = i2 + i + i3 + ((-92689393) * i6) + (1942122663 * i5);
            int i12 = i11 * i11;
            int i13 = (((-665130586) * i2) - 357761024) + ((-674687396) * i) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i3) + ((-1056047104) * i6) + ((-742522880) * i5) + ((-592117760) * i12);
            int i14 = (i2 * 1048061654) + 1366922925 + (i * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i3 * 1048061961) + (i6 * 439444615) + (i5 * (-1279783457)) + (i12 * 173867008);
            return i13 + ((i14 * i14) * (-1898250240)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r7 instanceof im.toss.securities.widget.overview.ui.setting.model.AccountSections.Account) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r3 = r3 + 13;
            im.toss.securities.widget.overview.ui.setting.model.AccountSections.Account.onExtraCallback = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            if ((r3 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            r7 = (im.toss.securities.widget.overview.ui.setting.model.AccountSections.Account) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r6.isPrimaryAccount == r7.isPrimaryAccount) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        
            r1 = r1 + 111;
            im.toss.securities.widget.overview.ui.setting.model.AccountSections.Account.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.key, r7.key) != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        
            r7 = im.toss.securities.widget.overview.ui.setting.model.AccountSections.Account.onExtraCallback + 71;
            im.toss.securities.widget.overview.ui.setting.model.AccountSections.Account.IAuthTabCallback = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        
            if ((r7 % 2) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        
            r7 = 74 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.name, r7.name) == true) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.displayName, r7.displayName) != false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        
            if (r6.type == r7.type) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.icon, r7.icon) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.accountNo, r7.accountNo) != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
        
            r7 = im.toss.securities.widget.overview.ui.setting.model.AccountSections.Account.onExtraCallback + 69;
            im.toss.securities.widget.overview.ui.setting.model.AccountSections.Account.IAuthTabCallback = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.totalAmount, r7.totalAmount) == true) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
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
            int i3 = i2 + 25;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 == 0) {
                int i5 = 99 / 0;
            }
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = Boolean.hashCode(this.isPrimaryAccount);
            int iHashCode2 = this.key.hashCode();
            int iHashCode3 = this.name.hashCode();
            int iHashCode4 = this.displayName.hashCode();
            int iHashCode5 = this.type.hashCode();
            int iHashCode6 = this.icon.hashCode();
            int iHashCode7 = this.accountNo.hashCode();
            Long l = this.totalAmount;
            if (l == null) {
                int i3 = onExtraCallback + 49;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode8 = l.hashCode();
                int i5 = onExtraCallback + 125;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode8;
            }
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + i;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Account(isPrimaryAccount=" + this.isPrimaryAccount + ", key=" + this.key + ", name=" + this.name + ", displayName=" + this.displayName + ", type=" + this.type + ", icon=" + this.icon + ", accountNo=" + this.accountNo + ", totalAmount=" + this.totalAmount + ")";
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
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
                int i2 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AccountSections$Account$$serializer accountSections$Account$$serializer = AccountSections$Account$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 77;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return accountSections$Account$$serializer;
            }
        }

        static {
            int i = onWarmupCompleted + 35;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Account(int i, boolean z, String str, String str2, String str3, asFactorylambda8 asfactorylambda8, String str4, String str5, Long l, okycx okycxVar) {
            if (255 != (i & 255)) {
                int i2 = onExtraCallback + 115;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 255, AccountSections$Account$$serializer.INSTANCE.getDescriptor());
                int i4 = IAuthTabCallback + 55;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this.isPrimaryAccount = z;
            this.key = str;
            this.name = str2;
            this.displayName = str3;
            this.type = asfactorylambda8;
            this.icon = str4;
            this.accountNo = str5;
            this.totalAmount = l;
        }

        public Account(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull asFactorylambda8 asfactorylambda8, @NotNull String str4, @NotNull String str5, @Nullable Long l) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(asfactorylambda8, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.isPrimaryAccount = z;
            this.key = str;
            this.name = str2;
            this.displayName = str3;
            this.type = asfactorylambda8;
            this.icon = str4;
            this.accountNo = str5;
            this.totalAmount = l;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(Account account, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onNavigationEvent(serialDescriptor, 0, account.isPrimaryAccount);
            vylVar.onExtraCallback(serialDescriptor, 1, account.key);
            vylVar.onExtraCallback(serialDescriptor, 2, account.name);
            vylVar.onExtraCallback(serialDescriptor, 3, account.displayName);
            vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), account.type);
            vylVar.onExtraCallback(serialDescriptor, 5, account.icon);
            vylVar.onExtraCallback(serialDescriptor, 6, account.accountNo);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, account.totalAmount);
            int i4 = onExtraCallback + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 115;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        public final boolean asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.isPrimaryAccount;
            int i5 = i3 + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.key;
            }
            throw null;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.name;
            if (i3 != 0) {
                int i4 = 24 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Account account = (Account) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 5;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = account.displayName;
            int i5 = i2 + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final asFactorylambda8 onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            asFactorylambda8 asfactorylambda8 = this.type;
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return asfactorylambda8;
        }

        public final String onNavigationEvent() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.icon;
                int i4 = 0 / 0;
            } else {
                str = this.icon;
            }
            int i5 = i2 + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Long IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 105;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Long l = this.totalAmount;
            int i5 = i2 + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return l;
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            return (Lazy[]) onExtraCallbackWithResult(new Object[0], 712474783, -712474782, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult());
        }

        public final String IAuthTabCallback() {
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            return (String) onExtraCallbackWithResult(new Object[]{this}, -918076441, 918076441, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult());
        }
    }
}
