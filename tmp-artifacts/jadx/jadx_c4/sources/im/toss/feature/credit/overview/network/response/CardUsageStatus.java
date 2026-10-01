package im.toss.feature.credit.overview.network.response;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CardUsageStatus {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String href;
    private final List<Card> items;
    private final String referenceDate;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.CardUsageStatus$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = CardUsageStatus.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerIAuthTabCallback;
            }
            throw null;
        }
    }), null};

    public CardUsageStatus() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerAsBinder;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerAsBinder = asBinder();
            int i3 = 70 / 0;
        } else {
            kSerializerAsBinder = asBinder();
        }
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return kSerializerAsBinder;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Card$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof CardUsageStatus))) {
            CardUsageStatus cardUsageStatus = (CardUsageStatus) obj;
            if (Intrinsics.areEqual(this.referenceDate, cardUsageStatus.referenceDate)) {
                if (!Intrinsics.areEqual(this.items, cardUsageStatus.items)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.href, cardUsageStatus.href)) {
                    return true;
                }
                int i2 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0;
            }
            int i3 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int iHashCode2 = (i2 % 2 != 0 ? (str = this.referenceDate) != null : (str = this.referenceDate) != null) ? str.hashCode() : 0;
        List<Card> list = this.items;
        if (list == null) {
            int i3 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        String str2 = this.href;
        return (((iHashCode2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardUsageStatus(referenceDate=" + this.referenceDate + ", items=" + this.items + ", href=" + this.href + ")";
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardUsageStatus> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                CardUsageStatus$$serializer cardUsageStatus$$serializer = CardUsageStatus$$serializer.INSTANCE;
                throw null;
            }
            CardUsageStatus$$serializer cardUsageStatus$$serializer2 = CardUsageStatus$$serializer.INSTANCE;
            int i3 = onWarmupCompleted + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return cardUsageStatus$$serializer2;
        }
    }

    static {
        int i = IAuthTabCallback + 27;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ CardUsageStatus(int i, String str, List list, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.referenceDate = null;
            int i2 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 3;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            this.referenceDate = str;
        }
        if ((i & 2) == 0) {
            int i5 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.items = null;
        } else {
            this.items = list;
            int i7 = 2 % 2;
        }
        if ((i & 4) != 0) {
            this.href = str2;
            return;
        }
        int i8 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        this.href = null;
    }

    public CardUsageStatus(@Nullable String str, @Nullable List<Card> list, @Nullable String str2) {
        this.referenceDate = str;
        this.items = list;
        this.href = str2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(CardUsageStatus cardUsageStatus, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || cardUsageStatus.referenceDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, cardUsageStatus.referenceDate);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 97 / 0;
                if (cardUsageStatus.items != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), cardUsageStatus.items);
                    int i4 = onWarmupCompleted + 43;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else if (cardUsageStatus.items != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 65 / 0;
                if (cardUsageStatus.href != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, cardUsageStatus.href);
                }
            } else if (cardUsageStatus.href != null) {
            }
        }
        int i8 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardUsageStatus(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            list = null;
        }
        this(str, list, (i & 4) != 0 ? null : str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.referenceDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Card> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.items;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.href;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return str;
    }
}
