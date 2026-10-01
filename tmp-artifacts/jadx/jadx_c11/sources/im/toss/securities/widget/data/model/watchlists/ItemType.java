package im.toss.securities.widget.data.model.watchlists;

import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final ItemType STOCK = new ItemType("STOCK", 0);
    public static final ItemType BOND = new ItemType("BOND", 1);
    public static final ItemType OPTION = new ItemType("OPTION", 2);
    public static final ItemType INDEX = new ItemType("INDEX", 3);
    public static final ItemType CURRENCY = new ItemType("CURRENCY", 4);
    public static final ItemType COMMODITY = new ItemType("COMMODITY", 5);
    public static final ItemType CRYPTO = new ItemType("CRYPTO", 6);
    public static final ItemType TREASURY = new ItemType("TREASURY", 7);

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[ItemType.values().length];
            try {
                iArr[ItemType.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemType.CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemType.COMMODITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ItemType.CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ItemType.TREASURY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ItemType.STOCK.ordinal()] = 6;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ItemType.BOND.ordinal()] = 7;
                int i2 = onNavigationEvent + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ItemType.OPTION.ordinal()] = 8;
                int i5 = onWarmupCompleted + 97;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static /* synthetic */ KSerializer $r8$lambda$gWLx8CgBGjETTlB3utWOJf2G8Rs() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializer_init_$_anonymous_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ ItemType[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ItemType[] itemTypeArr = {STOCK, BOND, OPTION, INDEX, CURRENCY, COMMODITY, CRYPTO, TREASURY};
        int i5 = i2 + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return itemTypeArr;
    }

    public static EnumEntries<ItemType> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<ItemType> enumEntries = $ENTRIES;
        int i4 = i2 + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static ItemType valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ItemType itemType = (ItemType) Enum.valueOf(ItemType.class, str);
        if (i3 != 0) {
            return itemType;
        }
        throw null;
    }

    public static ItemType[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ItemType[] itemTypeArr = (ItemType[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return itemTypeArr;
    }

    private ItemType(String str, int i) {
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i3 + 93;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ItemType[] itemTypeArr$values = $values();
        $VALUES = itemTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(itemTypeArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.ItemType$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 29;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$gWLx8CgBGjETTlB3utWOJf2G8Rs = ItemType.$r8$lambda$gWLx8CgBGjETTlB3utWOJf2G8Rs();
                int i4 = onWarmupCompleted + 105;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer$r8$lambda$gWLx8CgBGjETTlB3utWOJf2G8Rs;
            }
        });
        int i = onExtraCallback + 79;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean isIndexItem() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        switch (onNavigationEvent.onExtraCallbackWithResult[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                int i4 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 6:
            case 7:
            case 8:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) ItemType.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<ItemType> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<ItemType> kSerializerOnNavigationEvent = onNavigationEvent();
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return kSerializerOnNavigationEvent;
        }

        public final ItemType onNavigationEvent(@Nullable String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
                if (str == null) {
                    return null;
                }
            } else if (str == null) {
                return null;
            }
            Iterator it = ItemType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((ItemType) next).name(), str)) {
                    obj = next;
                    break;
                }
            }
            ItemType itemType = (ItemType) obj;
            int i4 = onNavigationEvent + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return itemType;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.watchlists.ItemType", values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.watchlists.ItemType", values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
