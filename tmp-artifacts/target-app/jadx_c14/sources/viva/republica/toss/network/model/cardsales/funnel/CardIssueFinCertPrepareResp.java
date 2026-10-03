package viva.republica.toss.network.model.cardsales.funnel;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueFinCertPrepareResp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String algorithms;
    private final String encoding;
    private final long finCertSignId;
    private final String format;
    private final List<String> plainTexts;
    private final String signType;
    private final Boolean withoutContent;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = CardIssueFinCertPrepareResp.onExtraCallback();
            int i4 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    }), null, null, null, null, null};

    public CardIssueFinCertPrepareResp() {
        this(0L, (List) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 127, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CardIssueFinCertPrepareResp)) {
            return false;
        }
        CardIssueFinCertPrepareResp cardIssueFinCertPrepareResp = (CardIssueFinCertPrepareResp) obj;
        if (this.finCertSignId == cardIssueFinCertPrepareResp.finCertSignId && Intrinsics.areEqual(this.plainTexts, cardIssueFinCertPrepareResp.plainTexts) && Intrinsics.areEqual(this.format, cardIssueFinCertPrepareResp.format) && Intrinsics.areEqual(this.algorithms, cardIssueFinCertPrepareResp.algorithms) && Intrinsics.areEqual(this.encoding, cardIssueFinCertPrepareResp.encoding) && Intrinsics.areEqual(this.signType, cardIssueFinCertPrepareResp.signType)) {
            if (!(!Intrinsics.areEqual(this.withoutContent, cardIssueFinCertPrepareResp.withoutContent))) {
                return true;
            }
            int i4 = IAuthTabCallback + 101;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 47;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = Long.hashCode(this.finCertSignId);
        int iHashCode6 = this.plainTexts.hashCode();
        String str = this.format;
        int iHashCode7 = 0;
        if (str == null) {
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.algorithms;
        if (str2 == null) {
            int i4 = onExtraCallback + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.encoding;
        if (str3 == null) {
            int i6 = IAuthTabCallback + 83;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.signType;
        if (str4 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
            int i8 = IAuthTabCallback + 81;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        Boolean bool = this.withoutContent;
        if (bool != null) {
            int i10 = IAuthTabCallback + 27;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                bool.hashCode();
                throw null;
            }
            iHashCode7 = bool.hashCode();
        }
        return (((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueFinCertPrepareResp(finCertSignId=" + this.finCertSignId + ", plainTexts=" + this.plainTexts + ", format=" + this.format + ", algorithms=" + this.algorithms + ", encoding=" + this.encoding + ", signType=" + this.signType + ", withoutContent=" + this.withoutContent + ")";
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardIssueFinCertPrepareResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            CardIssueFinCertPrepareResp$.serializer serializerVar = CardIssueFinCertPrepareResp$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    public /* synthetic */ CardIssueFinCertPrepareResp(int i, long j, List list, String str, String str2, String str3, String str4, Boolean bool, okycx okycxVar) {
        this.finCertSignId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            int i2 = IAuthTabCallback + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.plainTexts = list;
        Object obj = null;
        if ((i & 4) == 0) {
            this.format = null;
        } else {
            this.format = str;
        }
        if ((i & 8) == 0) {
            this.algorithms = null;
        } else {
            this.algorithms = str2;
        }
        if ((i & 16) == 0) {
            int i6 = onExtraCallback + 113;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.encoding = null;
            if (i7 == 0) {
                int i8 = 32 / 0;
            }
        } else {
            this.encoding = str3;
        }
        int i9 = 2 % 2;
        if ((i & 32) == 0) {
            int i10 = onExtraCallback + 21;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            this.signType = null;
            if (i11 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.signType = str4;
        }
        if ((i & 64) == 0) {
            this.withoutContent = null;
            int i12 = onExtraCallback + 113;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        this.withoutContent = bool;
        int i14 = onExtraCallback + 73;
        IAuthTabCallback = i14 % 128;
        int i15 = i14 % 2;
    }

    public CardIssueFinCertPrepareResp(long j, @NotNull List<String> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.finCertSignId = j;
        this.plainTexts = list;
        this.format = str;
        this.algorithms = str2;
        this.encoding = str3;
        this.signType = str4;
        this.withoutContent = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp.$childSerializers
            r2 = 0
            boolean r3 = r8.onWarmupCompleted(r9, r2)
            if (r3 != 0) goto L1d
            int r3 = viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp.onExtraCallback
            int r3 = r3 + 75
            int r4 = r3 % 128
            viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp.IAuthTabCallback = r4
            int r3 = r3 % r0
            long r3 = r7.finCertSignId
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L22
        L1d:
            long r3 = r7.finCertSignId
            r8.onExtraCallback(r9, r2, r3)
        L22:
            r2 = 1
            boolean r3 = r8.onWarmupCompleted(r9, r2)
            if (r3 != 0) goto L35
            java.util.List<java.lang.String> r3 = r7.plainTexts
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L42
        L35:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<java.lang.String> r3 = r7.plainTexts
            r8.onNavigationEvent(r9, r2, r1, r3)
        L42:
            boolean r1 = r8.onWarmupCompleted(r9, r0)
            if (r1 != 0) goto L4c
            java.lang.String r1 = r7.format
            if (r1 == 0) goto L53
        L4c:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r2 = r7.format
            r8.onExtraCallbackWithResult(r9, r0, r1, r2)
        L53:
            r1 = 3
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto L5e
            java.lang.String r2 = r7.algorithms
            if (r2 == 0) goto L65
        L5e:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r7.algorithms
            r8.onExtraCallbackWithResult(r9, r1, r2, r3)
        L65:
            r1 = 4
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto L79
            int r2 = viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp.onExtraCallback
            int r2 = r2 + 61
            int r3 = r2 % 128
            viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp.IAuthTabCallback = r3
            int r2 = r2 % r0
            java.lang.String r2 = r7.encoding
            if (r2 == 0) goto L80
        L79:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r7.encoding
            r8.onExtraCallbackWithResult(r9, r1, r2, r3)
        L80:
            r1 = 5
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto L8b
            java.lang.String r2 = r7.signType
            if (r2 == 0) goto L92
        L8b:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r7.signType
            r8.onExtraCallbackWithResult(r9, r1, r2, r3)
        L92:
            r1 = 6
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 == 0) goto L9a
            goto La7
        L9a:
            int r2 = viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp.onExtraCallback
            int r2 = r2 + 15
            int r3 = r2 % 128
            viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp.IAuthTabCallback = r3
            int r2 = r2 % r0
            java.lang.Boolean r0 = r7.withoutContent
            if (r0 == 0) goto Lae
        La7:
            o.getBgColor r0 = o.getBgColor.IAuthTabCallback
            java.lang.Boolean r7 = r7.withoutContent
            r8.onExtraCallbackWithResult(r9, r1, r0, r7)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp.onExtraCallback(viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardIssueFinCertPrepareResp(long j, List list, String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        List listEmptyList;
        String str5;
        String str6;
        String str7;
        String str8;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 9;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 111;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i & 8) != 0) {
            int i10 = IAuthTabCallback + 93;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 16) != 0) {
            int i12 = onExtraCallback + 17;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 32) != 0) {
            int i15 = 2 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        this(j2, listEmptyList, str5, str6, str7, str8, (i & 64) == 0 ? bool : null);
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.finCertSignId;
        int i5 = i2 + 43;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return j;
    }

    public final List<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.plainTexts;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.signType;
        int i5 = i2 + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
        return str;
    }

    public final Boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.withoutContent;
        int i5 = i2 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
