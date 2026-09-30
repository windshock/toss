package com.krc.pl_card.model.card;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.access8100;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum KorailTradeType {
    PREPAID_PURCHASE("01", "선불 지불"),
    PREPAID_CHARGE("02", "선불 충전"),
    PREPAID_REFUND("03", "선불 환불"),
    PREPAID_CANCEL_CHARGE("04", "선불 충전취소"),
    PREPAID_AUTO_CHARGE("05", "선불 자동충전"),
    PREPAID_CANCEL_LAST_PURCHASE("40", "선불 직전지불거래취소"),
    OTHER("__", "기타");

    public static final a Companion = new a(null);
    private static final Map<String, KorailTradeType> valueMap;
    private final String code;
    private final String description;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KorailTradeType a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            KorailTradeType korailTradeType = (KorailTradeType) KorailTradeType.valueMap.get(str);
            return korailTradeType == null ? KorailTradeType.OTHER : korailTradeType;
        }
    }

    static {
        KorailTradeType[] korailTradeTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(korailTradeTypeArrValues.length), 16));
        for (KorailTradeType korailTradeType : korailTradeTypeArrValues) {
            linkedHashMap.put(korailTradeType.code, korailTradeType);
        }
        valueMap = linkedHashMap;
    }

    KorailTradeType(String str, String str2) {
        this.code = str;
        this.description = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}
