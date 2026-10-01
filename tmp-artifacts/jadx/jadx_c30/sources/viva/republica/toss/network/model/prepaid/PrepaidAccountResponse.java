package viva.republica.toss.network.model.prepaid;

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
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.prepaid.PrepaidAccountResponse;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PrepaidAccountResponse {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Long balance;
    private final Category category;
    private final Long id;
    private final String name;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.prepaid.PrepaidAccountResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            KSerializer kSerializerOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerOnExtraCallback = PrepaidAccountResponse.onExtraCallback();
                int i3 = 27 / 0;
            } else {
                kSerializerOnExtraCallback = PrepaidAccountResponse.onExtraCallback();
            }
            int i4 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null, null, null, null};

    public PrepaidAccountResponse() {
        this((Category) null, (String) null, (Long) null, (Long) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnWarmupCompleted;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Category.Companion.serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<Category> kSerializerSerializer = Category.Companion.serializer();
        int i3 = onExtraCallback + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerSerializer;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 13;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof PrepaidAccountResponse)) {
            return false;
        }
        PrepaidAccountResponse prepaidAccountResponse = (PrepaidAccountResponse) obj;
        if (this.category != prepaidAccountResponse.category || !Intrinsics.areEqual(this.type, prepaidAccountResponse.type) || !Intrinsics.areEqual(this.id, prepaidAccountResponse.id) || !Intrinsics.areEqual(this.balance, prepaidAccountResponse.balance)) {
            return false;
        }
        if (Intrinsics.areEqual(this.name, prepaidAccountResponse.name)) {
            return true;
        }
        int i5 = onExtraCallback + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Category category = this.category;
        int iHashCode3 = category == null ? 0 : category.hashCode();
        String str = this.type;
        if (str == null) {
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Long l = this.id;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Long l2 = this.balance;
        if (l2 == null) {
            int i4 = onNavigationEvent + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l2.hashCode();
        }
        String str2 = this.name;
        return (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepaidAccountResponse(category=" + this.category + ", type=" + this.type + ", id=" + this.id + ", balance=" + this.balance + ", name=" + this.name + ")";
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PrepaidAccountResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            PrepaidAccountResponse$$serializer prepaidAccountResponse$$serializer = PrepaidAccountResponse$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return prepaidAccountResponse$$serializer;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ PrepaidAccountResponse(int i, Category category, String str, Long l, Long l2, String str2, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.category = null;
            int i2 = 2 % 2;
        } else {
            this.category = category;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str;
            int i3 = onExtraCallback + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i6 = onExtraCallback + 65;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            this.id = null;
            if (i7 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.id = l;
        }
        if ((i & 8) == 0) {
            this.balance = null;
        } else {
            this.balance = l2;
        }
        if ((i & 16) != 0) {
            this.name = str2;
            return;
        }
        int i8 = onExtraCallback + 99;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        this.name = null;
        if (i9 == 0) {
            int i10 = 3 / 0;
        }
    }

    public PrepaidAccountResponse(@Nullable Category category, @Nullable String str, @Nullable Long l, @Nullable Long l2, @Nullable String str2) {
        this.category = category;
        this.type = str;
        this.id = l;
        this.balance = l2;
        this.name = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(PrepaidAccountResponse prepaidAccountResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (prepaidAccountResponse.category != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), prepaidAccountResponse.category);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || prepaidAccountResponse.type != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, prepaidAccountResponse.type);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || prepaidAccountResponse.id != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, prepaidAccountResponse.id);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || prepaidAccountResponse.balance != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, prepaidAccountResponse.balance);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i4 = onExtraCallback + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                String str = prepaidAccountResponse.name;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (prepaidAccountResponse.name == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, prepaidAccountResponse.name);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PrepaidAccountResponse(Category category, String str, Long l, Long l2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        Long l3;
        String str4;
        Category category2 = (i & 1) != 0 ? null : category;
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            l3 = null;
        } else {
            l3 = l;
        }
        Long l4 = (i & 8) != 0 ? null : l2;
        if ((i & 16) != 0) {
            int i6 = 2 % 2;
            str4 = null;
        } else {
            str4 = str2;
        }
        this(category2, str3, l3, l4, str4);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class Category {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Category[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final Category TOSSPAY_MONEY = new Category("TOSSPAY_MONEY", 0);
        public static final Category TOSS_MONEY = new Category("TOSS_MONEY", 1);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public static /* synthetic */ KSerializer $r8$lambda$8ka6t2nl7KyrINxkWG3KnWMPzVw() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = onExtraCallback + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ Category[] $values() {
            Category[] categoryArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                Category category = TOSSPAY_MONEY;
                Category category2 = TOSS_MONEY;
                categoryArr = new Category[5];
                categoryArr[0] = category;
                categoryArr[1] = category2;
            } else {
                categoryArr = new Category[]{TOSSPAY_MONEY, TOSS_MONEY};
            }
            int i4 = i3 + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 55 / 0;
            }
            return categoryArr;
        }

        public static EnumEntries<Category> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static Category valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Category category = (Category) Enum.valueOf(Category.class, str);
            if (i3 != 0) {
                int i4 = 38 / 0;
            }
            return category;
        }

        public static Category[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Category[] categoryArr = (Category[]) $VALUES.clone();
            int i4 = onExtraCallback + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return categoryArr;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) Category.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = IAuthTabCallback + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }

            public final KSerializer<Category> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<Category> kSerializerOnNavigationEvent = onNavigationEvent();
                int i4 = onNavigationEvent + 41;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        }

        private Category(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.prepaid.PrepaidAccountResponse.Category", values());
            int i4 = onWarmupCompleted + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i5 = i3 + 65;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return lazy;
            }
            throw null;
        }

        static {
            Category[] categoryArr$values = $values();
            $VALUES = categoryArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(categoryArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.prepaid.PrepaidAccountResponse$Category$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 125;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer$r8$lambda$8ka6t2nl7KyrINxkWG3KnWMPzVw = PrepaidAccountResponse.Category.$r8$lambda$8ka6t2nl7KyrINxkWG3KnWMPzVw();
                    int i4 = onNavigationEvent + 125;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer$r8$lambda$8ka6t2nl7KyrINxkWG3KnWMPzVw;
                }
            });
            int i = onExtraCallbackWithResult + 35;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 16 / 0;
            }
        }
    }
}
