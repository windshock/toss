package im.toss.features.home.core.model;

import im.toss.features.home.core.model.CardBillAccount$;
import im.toss.features.home.core.model.CardPaymentSelectionDto$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CardPaymentSelectionDto {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final List<CardBillAccount> accounts;
    private final String registerAccountUrl;
    private final String title;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new CardPaymentSelectionDto$.ExternalSyntheticLambda0()), null};

    public CardPaymentSelectionDto() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CardBillAccount$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub();
        }
        IAuthTabCallbackStub();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardPaymentSelectionDto)) {
            return false;
        }
        CardPaymentSelectionDto cardPaymentSelectionDto = (CardPaymentSelectionDto) obj;
        if (Intrinsics.areEqual(this.title, cardPaymentSelectionDto.title)) {
            return !(Intrinsics.areEqual(this.accounts, cardPaymentSelectionDto.accounts) ^ true) && Intrinsics.areEqual(this.registerAccountUrl, cardPaymentSelectionDto.registerAccountUrl);
        }
        int i4 = IAuthTabCallback + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        return i3 == 0 ? (((iHashCode >> 105) % this.accounts.hashCode()) / 122) % this.registerAccountUrl.hashCode() : (((iHashCode * 31) + this.accounts.hashCode()) * 31) + this.registerAccountUrl.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardPaymentSelectionDto(title=" + this.title + ", accounts=" + this.accounts + ", registerAccountUrl=" + this.registerAccountUrl + ")";
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 13;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ CardPaymentSelectionDto(int i, String str, List list, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.accounts = CollectionsKt.emptyList();
            int i3 = onExtraCallback + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } else {
            this.accounts = list;
        }
        if ((i & 4) != 0) {
            this.registerAccountUrl = str2;
            return;
        }
        int i5 = onExtraCallback;
        int i6 = i5 + 69;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        this.registerAccountUrl = "";
        int i8 = i5 + 59;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 87 / 0;
        }
    }

    public CardPaymentSelectionDto(@NotNull String str, @NotNull List<CardBillAccount> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.accounts = list;
        this.registerAccountUrl = str2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(CardPaymentSelectionDto cardPaymentSelectionDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(cardPaymentSelectionDto.title, "");
                throw null;
            }
            if (!Intrinsics.areEqual(cardPaymentSelectionDto.title, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, cardPaymentSelectionDto.title);
                int i3 = IAuthTabCallback + 123;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 % 2;
                }
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(cardPaymentSelectionDto.accounts, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), cardPaymentSelectionDto.accounts);
            int i5 = onExtraCallback + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(cardPaymentSelectionDto.registerAccountUrl, "")) {
            vylVar.onExtraCallback(serialDescriptor, 2, cardPaymentSelectionDto.registerAccountUrl);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardPaymentSelectionDto(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i6 = 29 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
            int i7 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i8 = onExtraCallback + 119;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            str2 = "";
        }
        this(str, list, str2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return str;
    }

    public final List<CardBillAccount> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<CardBillAccount> list = this.accounts;
        int i5 = i2 + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.registerAccountUrl;
        int i5 = i2 + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
