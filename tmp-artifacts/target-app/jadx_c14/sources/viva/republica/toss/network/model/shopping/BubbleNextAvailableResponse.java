package viva.republica.toss.network.model.shopping;

import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
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
import viva.republica.toss.network.model.shopping.BubbleNextAvailableResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BubbleNextAvailableResponse {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final boolean availableNow;
    private final List<String> blockedBy;
    private final String closeCooldownUntil;
    private final Integer globalCapCount;
    private final Integer globalCapLimit;
    private final String globalCapResetAt;
    private final String timeCooldownUntil;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.shopping.BubbleNextAvailableResponse$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = BubbleNextAvailableResponse.onExtraCallback();
            int i4 = onWarmupCompleted + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    }), null, null, null, null, null};

    public BubbleNextAvailableResponse() {
        this(false, (List) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i2 | i4));
        int i11 = ~(i7 | i9);
        int i12 = (~i4) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i2);
        int i15 = i2 + i6 + i3 + ((-1261570137) * i) + (2040842291 * i5);
        int i16 = i15 * i15;
        int i17 = ((i2 * (-750812765)) - 1471086592) + ((-750812765) * i6) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i3) + ((-1928462336) * i) + (1629880320 * i5) + (2096168960 * i16);
        int i18 = ((i2 * 1408203179) - 1033136887) + (i6 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i3 * 1408202841) + (i * (-1046847217)) + (i5 * (-121732677)) + (i16 * 1741225984);
        return i17 + ((i18 * i18) * 838795264) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        KSerializer kSerializerOnTransact;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnTransact = onTransact();
            int i3 = 85 / 0;
        } else {
            kSerializerOnTransact = onTransact();
        }
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleNextAvailableResponse)) {
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        BubbleNextAvailableResponse bubbleNextAvailableResponse = (BubbleNextAvailableResponse) obj;
        if (this.availableNow != bubbleNextAvailableResponse.availableNow) {
            return false;
        }
        if (!Intrinsics.areEqual(this.blockedBy, bubbleNextAvailableResponse.blockedBy)) {
            int i4 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.timeCooldownUntil, bubbleNextAvailableResponse.timeCooldownUntil) || !Intrinsics.areEqual(this.closeCooldownUntil, bubbleNextAvailableResponse.closeCooldownUntil)) {
            return false;
        }
        if (Intrinsics.areEqual(this.globalCapCount, bubbleNextAvailableResponse.globalCapCount)) {
            return Intrinsics.areEqual(this.globalCapLimit, bubbleNextAvailableResponse.globalCapLimit) && Intrinsics.areEqual(this.globalCapResetAt, bubbleNextAvailableResponse.globalCapResetAt);
        }
        int i6 = onExtraCallbackWithResult + 7;
        int i7 = i6 % 128;
        onWarmupCompleted = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 15;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.availableNow);
        int iHashCode4 = this.blockedBy.hashCode();
        String str = this.timeCooldownUntil;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.closeCooldownUntil;
        if (str2 == null) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 25;
            onExtraCallbackWithResult = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
            int i4 = i2 + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 3;
            }
        } else {
            iHashCode = str2.hashCode();
        }
        Integer num = this.globalCapCount;
        if (num == null) {
            int i6 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 3;
            }
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        Integer num2 = this.globalCapLimit;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.globalCapResetAt;
        return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BubbleNextAvailableResponse(availableNow=" + this.availableNow + ", blockedBy=" + this.blockedBy + ", timeCooldownUntil=" + this.timeCooldownUntil + ", closeCooldownUntil=" + this.closeCooldownUntil + ", globalCapCount=" + this.globalCapCount + ", globalCapLimit=" + this.globalCapLimit + ", globalCapResetAt=" + this.globalCapResetAt + ")";
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BubbleNextAvailableResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BubbleNextAvailableResponse$.serializer serializerVar = BubbleNextAvailableResponse$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 81;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ BubbleNextAvailableResponse(int i, boolean z, List list, String str, String str2, Integer num, Integer num2, String str3, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            z = false;
        }
        this.availableNow = z;
        if ((i & 2) == 0) {
            list = CollectionsKt.emptyList();
            int i3 = 2 % 2;
        }
        this.blockedBy = list;
        if ((i & 4) == 0) {
            int i4 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.timeCooldownUntil = null;
        } else {
            this.timeCooldownUntil = str;
        }
        if ((i & 8) == 0) {
            int i6 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            this.closeCooldownUntil = null;
        } else {
            this.closeCooldownUntil = str2;
            int i8 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 3;
            } else {
                int i10 = 2 % 2;
            }
        }
        if ((i & 16) == 0) {
            int i11 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            this.globalCapCount = null;
            if (i12 == 0) {
                throw null;
            }
        } else {
            this.globalCapCount = num;
        }
        if ((i & 32) == 0) {
            int i13 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            this.globalCapLimit = null;
            if (i14 == 0) {
                throw null;
            }
        } else {
            this.globalCapLimit = num2;
        }
        int i15 = 2 % 2;
        if ((i & 64) == 0) {
            this.globalCapResetAt = null;
        } else {
            this.globalCapResetAt = str3;
        }
    }

    public BubbleNextAvailableResponse(boolean z, @NotNull List<String> list, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.availableNow = z;
        this.blockedBy = list;
        this.timeCooldownUntil = str;
        this.closeCooldownUntil = str2;
        this.globalCapCount = num;
        this.globalCapLimit = num2;
        this.globalCapResetAt = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.shopping.BubbleNextAvailableResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.shopping.BubbleNextAvailableResponse.onExtraCallbackWithResult(viva.republica.toss.network.model.shopping.BubbleNextAvailableResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BubbleNextAvailableResponse(boolean z, List list, String str, String str2, Integer num, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        List listEmptyList;
        String str4;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 2) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i3 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        String str5 = null;
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            str4 = null;
        } else {
            str4 = str;
        }
        String str6 = (i & 8) != 0 ? null : str2;
        Integer num3 = (i & 16) != 0 ? null : num;
        Integer num4 = (i & 32) != 0 ? null : num2;
        if ((i & 64) != 0) {
            int i7 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 19 / 0;
            }
        } else {
            str5 = str3;
        }
        this(z2, listEmptyList, str4, str6, num3, num4, str5);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.availableNow;
        int i5 = i3 + 103;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return z;
    }

    public final List<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<String> list = this.blockedBy;
        int i5 = i3 + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.timeCooldownUntil;
        int i5 = i3 + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BubbleNextAvailableResponse bubbleNextAvailableResponse = (BubbleNextAvailableResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = bubbleNextAvailableResponse.closeCooldownUntil;
        int i5 = i3 + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.globalCapCount;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return num;
    }

    public final Integer asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Integer num = this.globalCapLimit;
        int i5 = i3 + 43;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BubbleNextAvailableResponse bubbleNextAvailableResponse = (BubbleNextAvailableResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = bubbleNextAvailableResponse.globalCapResetAt;
        int i5 = i3 + 125;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (String) onExtraCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1373695033, iIAuthTabCallback2, iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, 1373695034);
    }

    public final String IAuthTabCallbackDefault() {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (String) onExtraCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -381060859, iIAuthTabCallback2, iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this}, 381060859);
    }
}
