package im.toss.features.cardrecommend.home.model.suggest;

import im.toss.features.cardrecommend.home.model.suggest.CardSuggestionHeaderModel$;
import im.toss.features.cardrecommend.home.model.suggest.CardSuggestionResp$;
import im.toss.features.cardrecommend.home.model.suggest.CardSuggestionThemeModel$;
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
public final class CardSuggestionResp {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final CardSuggestionHeaderModel header;
    private final List<CardSuggestionThemeModel> themes;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new CardSuggestionResp$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public CardSuggestionResp() {
        CardSuggestionHeaderModel cardSuggestionHeaderModel = null;
        this(cardSuggestionHeaderModel, (List) cardSuggestionHeaderModel, 3, (DefaultConstructorMarker) cardSuggestionHeaderModel);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return kSerializerOnExtraCallback;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CardSuggestionThemeModel$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSuggestionResp)) {
            return false;
        }
        CardSuggestionResp cardSuggestionResp = (CardSuggestionResp) obj;
        if (!Intrinsics.areEqual(this.header, cardSuggestionResp.header)) {
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.themes, cardSuggestionResp.themes)) {
            return true;
        }
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.header.hashCode() % 53) >>> this.themes.hashCode() : (this.header.hashCode() * 31) + this.themes.hashCode();
        int i3 = onWarmupCompleted + 47;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardSuggestionResp(header=" + this.header + ", themes=" + this.themes + ")";
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onExtraCallback + 15;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ CardSuggestionResp(int i, CardSuggestionHeaderModel cardSuggestionHeaderModel, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            cardSuggestionHeaderModel = new CardSuggestionHeaderModel((String) null, (String) null, 3, (DefaultConstructorMarker) null);
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 2;
            } else {
                int i4 = 2 % 2;
            }
        }
        this.header = cardSuggestionHeaderModel;
        if ((i & 2) != 0) {
            this.themes = list;
            return;
        }
        int i5 = onWarmupCompleted + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.themes = CollectionsKt.emptyList();
    }

    public CardSuggestionResp(@NotNull CardSuggestionHeaderModel cardSuggestionHeaderModel, @NotNull List<CardSuggestionThemeModel> list) {
        Intrinsics.checkNotNullParameter(cardSuggestionHeaderModel, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.header = cardSuggestionHeaderModel;
        this.themes = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(CardSuggestionResp cardSuggestionResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(cardSuggestionResp.header, new CardSuggestionHeaderModel((String) null, (String) null, 3, (DefaultConstructorMarker) null)))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, CardSuggestionHeaderModel$.serializer.INSTANCE, cardSuggestionResp.header);
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(cardSuggestionResp.themes, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), cardSuggestionResp.themes);
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return lazyArr;
    }

    public /* synthetic */ CardSuggestionResp(CardSuggestionHeaderModel cardSuggestionHeaderModel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            cardSuggestionHeaderModel = new CardSuggestionHeaderModel((String) null, (String) null, 3, (DefaultConstructorMarker) null);
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i6 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        this(cardSuggestionHeaderModel, list);
    }

    public final CardSuggestionHeaderModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.header;
        }
        throw null;
    }

    public final List<CardSuggestionThemeModel> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.themes;
        }
        throw null;
    }
}
