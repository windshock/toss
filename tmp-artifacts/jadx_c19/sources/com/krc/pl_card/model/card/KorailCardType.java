package com.krc.pl_card.model.card;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ApmHelper11;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum KorailCardType {
    CARD_HOLDER_ADULT("01", "일반(성인)"),
    CARD_HOLDER_CHILD("02", "어린이"),
    CARD_HOLDER_TEENAGER("03", "청소년"),
    CARD_HOLDER_OLDMAN("04", "경로"),
    CARD_HOLDER_DISABLED("05", "장애인"),
    CARD_HOLDER_BUS("11", "버스"),
    CARD_HOLDER_TRUCK("12", "화물차");

    public static final a Companion = new a(null);
    private final String code;
    private final String description;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KorailCardType a(@Nullable String str) {
            if (str == null) {
                throw new NullPointerException("해당하는 코드가 없습니다.");
            }
            List listAsList = ArraysKt.asList(KorailCardType.values());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAsList) {
                if (Intrinsics.areEqual(((KorailCardType) obj).getCode(), str)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 0) {
                throw new NullPointerException("해당하는 코드가 없습니다.");
            }
            ApmHelper11.IAuthTabCallback("code, " + str + ", cardTypeEnum[0], " + arrayList.get(0), new Object[0]);
            return (KorailCardType) arrayList.get(0);
        }
    }

    KorailCardType(String str, String str2) {
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
