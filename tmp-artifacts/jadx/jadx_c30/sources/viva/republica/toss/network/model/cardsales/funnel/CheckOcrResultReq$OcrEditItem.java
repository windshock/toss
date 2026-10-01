package viva.republica.toss.network.model.cardsales.funnel;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CheckOcrResultReq$OcrEditItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CheckOcrResultReq$OcrEditItem[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<String> items;
    public static final CheckOcrResultReq$OcrEditItem NAME = new CheckOcrResultReq$OcrEditItem("NAME", 0, CollectionsKt.listOf("이름"));
    public static final CheckOcrResultReq$OcrEditItem LICENSE_DETAIL = new CheckOcrResultReq$OcrEditItem("LICENSE_DETAIL", 1, CollectionsKt.listOf(new String[]{"발급일자", "면허증번호"}));
    public static final CheckOcrResultReq$OcrEditItem RRN = new CheckOcrResultReq$OcrEditItem("RRN", 2, CollectionsKt.listOf("고객고유번호"));

    public static /* synthetic */ KSerializer $r8$lambda$k0q1Ev411z1wWzpuh16eUeKId2M() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ CheckOcrResultReq$OcrEditItem[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        CheckOcrResultReq$OcrEditItem[] checkOcrResultReq$OcrEditItemArr = {NAME, LICENSE_DETAIL, RRN};
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return checkOcrResultReq$OcrEditItemArr;
    }

    public static EnumEntries<CheckOcrResultReq$OcrEditItem> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CheckOcrResultReq$OcrEditItem valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CheckOcrResultReq$OcrEditItem checkOcrResultReq$OcrEditItem = (CheckOcrResultReq$OcrEditItem) Enum.valueOf(CheckOcrResultReq$OcrEditItem.class, str);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return checkOcrResultReq$OcrEditItem;
    }

    public static CheckOcrResultReq$OcrEditItem[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CheckOcrResultReq$OcrEditItem[] checkOcrResultReq$OcrEditItemArr = (CheckOcrResultReq$OcrEditItem[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return checkOcrResultReq$OcrEditItemArr;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) CheckOcrResultReq$OcrEditItem.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = onWarmupCompleted + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        public final KSerializer<CheckOcrResultReq$OcrEditItem> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<CheckOcrResultReq$OcrEditItem> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }
    }

    private CheckOcrResultReq$OcrEditItem(String str, int i, List list) {
        this.items = list;
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.cardsales.funnel.CheckOcrResultReq.OcrEditItem", values());
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return lazy;
    }

    public final List<String> getItems() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.items;
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return list;
    }

    static {
        CheckOcrResultReq$OcrEditItem[] checkOcrResultReq$OcrEditItemArr$values = $values();
        $VALUES = checkOcrResultReq$OcrEditItemArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(checkOcrResultReq$OcrEditItemArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.cardsales.funnel.CheckOcrResultReq$OcrEditItem$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                KSerializer kSerializer$r8$lambda$k0q1Ev411z1wWzpuh16eUeKId2M;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializer$r8$lambda$k0q1Ev411z1wWzpuh16eUeKId2M = CheckOcrResultReq$OcrEditItem.$r8$lambda$k0q1Ev411z1wWzpuh16eUeKId2M();
                    int i3 = 82 / 0;
                } else {
                    kSerializer$r8$lambda$k0q1Ev411z1wWzpuh16eUeKId2M = CheckOcrResultReq$OcrEditItem.$r8$lambda$k0q1Ev411z1wWzpuh16eUeKId2M();
                }
                int i4 = onExtraCallback + 99;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer$r8$lambda$k0q1Ev411z1wWzpuh16eUeKId2M;
            }
        });
        int i = onExtraCallback + 93;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
