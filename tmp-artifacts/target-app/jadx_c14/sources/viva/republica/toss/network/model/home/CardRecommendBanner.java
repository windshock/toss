package viva.republica.toss.network.model.home;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.NativeKeyboardObserverSpec;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.home.CardRecommendBanner$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardRecommendBanner implements NativeKeyboardObserverSpec {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String iconUrl;
    private final String itemId;
    private final Map<String, String> logParams;
    private final String row1;
    private final String row2;
    private final String schemeUrl;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.home.CardRecommendBanner$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = CardRecommendBanner.onExtraCallback();
            int i4 = onExtraCallback + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    }), null};

    public CardRecommendBanner() {
        this((String) null, (String) null, (String) null, (String) null, (Map) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CardRecommendBanner)) {
            return false;
        }
        CardRecommendBanner cardRecommendBanner = (CardRecommendBanner) obj;
        if (!Intrinsics.areEqual(this.iconUrl, cardRecommendBanner.iconUrl)) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 33;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.row1, cardRecommendBanner.row1)) {
            int i9 = onExtraCallbackWithResult + 69;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.row2, cardRecommendBanner.row2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.schemeUrl, cardRecommendBanner.schemeUrl)) {
            int i11 = onExtraCallback + 91;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 93 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.logParams, cardRecommendBanner.logParams)) {
            return false;
        }
        if (Intrinsics.areEqual(this.itemId, cardRecommendBanner.itemId)) {
            return true;
        }
        int i13 = onExtraCallback + 63;
        onExtraCallbackWithResult = i13 % 128;
        return i13 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.iconUrl.hashCode() * 31) + this.row1.hashCode()) * 31) + this.row2.hashCode()) * 31) + this.schemeUrl.hashCode()) * 31) + this.logParams.hashCode()) * 31) + this.itemId.hashCode();
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardRecommendBanner(iconUrl=" + this.iconUrl + ", row1=" + this.row1 + ", row2=" + this.row2 + ", schemeUrl=" + this.schemeUrl + ", logParams=" + this.logParams + ", itemId=" + this.itemId + ")";
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardRecommendBanner> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CardRecommendBanner$.serializer serializerVar = CardRecommendBanner$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 25;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ CardRecommendBanner(int i, String str, String str2, String str3, String str4, Map map, String str5, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.row1 = "";
            int i3 = 2 % 2;
        } else {
            this.row1 = str2;
        }
        if ((i & 4) == 0) {
            int i4 = onExtraCallbackWithResult + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.row2 = "";
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            this.row2 = str3;
            int i6 = onExtraCallback + 95;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = 2 % 2;
        if ((i & 8) == 0) {
            int i9 = onExtraCallback + 23;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            this.schemeUrl = "";
        } else {
            this.schemeUrl = str4;
        }
        if ((i & 16) == 0) {
            this.logParams = access8100.onNavigationEvent();
        } else {
            this.logParams = map;
        }
        if ((i & 32) != 0) {
            this.itemId = str5;
            return;
        }
        this.itemId = "card_recommend_banner:" + this.iconUrl;
    }

    public CardRecommendBanner(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.iconUrl = str;
        this.row1 = str2;
        this.row2 = str3;
        this.schemeUrl = str4;
        this.logParams = map;
        this.itemId = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[PHI: r1
      0x003e: PHI (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0021, B:12:0x0034, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.home.CardRecommendBanner r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.home.CardRecommendBanner.IAuthTabCallback(viva.republica.toss.network.model.home.CardRecommendBanner, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return lazyArr;
    }

    @Override // o.NativeKeyboardObserverSpec
    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = super.IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return jIAuthTabCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardRecommendBanner(String str, String str2, String str3, String str4, Map map, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7 = "";
        String str8 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str6 = "";
        } else {
            str6 = str2;
        }
        String str9 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i4 = onExtraCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            int i6 = 2 % 2;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = onExtraCallbackWithResult + 63;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            map = access8100.onNavigationEvent();
            int i9 = 2 % 2;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            str5 = "card_recommend_banner:" + str8;
        }
        this(str8, str6, str9, str7, map2, str5);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iconUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.row1;
        int i5 = i2 + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.row2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.schemeUrl;
        int i5 = i3 + 117;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Map<String, String> onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.logParams;
        int i5 = i3 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.NativeKeyboardObserverSpec
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.itemId;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
