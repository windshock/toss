package im.toss.appsintoss.iap.model;

import im.toss.appsintoss.data.remote.model.CreateOrderRequest;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedHistoryItem$PurchaseType$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AppsInTossPurchasedHistoryItem$PurchaseType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppsInTossPurchasedHistoryItem$PurchaseType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    public static final AppsInTossPurchasedHistoryItem$PurchaseType PURCHASED = new AppsInTossPurchasedHistoryItem$PurchaseType("PURCHASED", 0);
    public static final AppsInTossPurchasedHistoryItem$PurchaseType REFUNDED = new AppsInTossPurchasedHistoryItem$PurchaseType("REFUNDED", 1);
    public static final AppsInTossPurchasedHistoryItem$PurchaseType REQUESTED = new AppsInTossPurchasedHistoryItem$PurchaseType("REQUESTED", 2);
    public static final AppsInTossPurchasedHistoryItem$PurchaseType SUBSCRIPTION = new AppsInTossPurchasedHistoryItem$PurchaseType(CreateOrderRequest.TYPE_SUBSCRIPTION, 3);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public static /* synthetic */ KSerializer $r8$lambda$IcC3TTrQcgqcRCAYYorERivZ0DY() {
        KSerializer kSerializer_init_$_anonymous_;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = 59 / 0;
        } else {
            kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        }
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ AppsInTossPurchasedHistoryItem$PurchaseType[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AppsInTossPurchasedHistoryItem$PurchaseType appsInTossPurchasedHistoryItem$PurchaseType = PURCHASED;
        if (i3 != 0) {
            return new AppsInTossPurchasedHistoryItem$PurchaseType[]{appsInTossPurchasedHistoryItem$PurchaseType, REFUNDED, REQUESTED, SUBSCRIPTION};
        }
        AppsInTossPurchasedHistoryItem$PurchaseType[] appsInTossPurchasedHistoryItem$PurchaseTypeArr = {REFUNDED, appsInTossPurchasedHistoryItem$PurchaseType, REQUESTED};
        appsInTossPurchasedHistoryItem$PurchaseTypeArr[5] = SUBSCRIPTION;
        return appsInTossPurchasedHistoryItem$PurchaseTypeArr;
    }

    public static EnumEntries<AppsInTossPurchasedHistoryItem$PurchaseType> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static AppsInTossPurchasedHistoryItem$PurchaseType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppsInTossPurchasedHistoryItem$PurchaseType appsInTossPurchasedHistoryItem$PurchaseType = (AppsInTossPurchasedHistoryItem$PurchaseType) Enum.valueOf(AppsInTossPurchasedHistoryItem$PurchaseType.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return appsInTossPurchasedHistoryItem$PurchaseType;
        }
        throw null;
    }

    public static AppsInTossPurchasedHistoryItem$PurchaseType[] values() {
        AppsInTossPurchasedHistoryItem$PurchaseType[] appsInTossPurchasedHistoryItem$PurchaseTypeArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            appsInTossPurchasedHistoryItem$PurchaseTypeArr = (AppsInTossPurchasedHistoryItem$PurchaseType[]) $VALUES.clone();
            int i3 = 54 / 0;
        } else {
            appsInTossPurchasedHistoryItem$PurchaseTypeArr = (AppsInTossPurchasedHistoryItem$PurchaseType[]) $VALUES.clone();
        }
        int i4 = onNavigationEvent + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return appsInTossPurchasedHistoryItem$PurchaseTypeArr;
    }

    private AppsInTossPurchasedHistoryItem$PurchaseType(String str, int i) {
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return lazy;
    }

    static {
        AppsInTossPurchasedHistoryItem$PurchaseType[] appsInTossPurchasedHistoryItem$PurchaseTypeArr$values = $values();
        $VALUES = appsInTossPurchasedHistoryItem$PurchaseTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(appsInTossPurchasedHistoryItem$PurchaseTypeArr$values);
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AppsInTossPurchasedHistoryItem$PurchaseType$.ExternalSyntheticLambda0());
        int i = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.appsintoss.iap.model.AppsInTossPurchasedHistoryItem.PurchaseType", values());
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.appsintoss.iap.model.AppsInTossPurchasedHistoryItem.PurchaseType", values());
        int i3 = onExtraCallback + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }
}
