package im.toss.features.home.core.model.consumption.transaction;

import im.toss.features.home.core.model.consumption.transaction.ConsumptionCardBenefitCalculationByTransactionDto$;
import im.toss.features.home.core.model.consumption.transaction.ConsumptionCardBenefitCalculationByTransactionDto$Transaction$;
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
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.setApTextSize;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ConsumptionCardBenefitCalculationByTransactionDto {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long benefitAmount;
    private final String descriptionRow1;
    private final String descriptionRow2;
    private final String schemeUrl;
    private final String subTitle;
    private final String title;
    private final List<Transaction> transactions;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new ConsumptionCardBenefitCalculationByTransactionDto$.ExternalSyntheticLambda0())};

    public ConsumptionCardBenefitCalculationByTransactionDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0L, (List) null, 127, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(ConsumptionCardBenefitCalculationByTransactionDto$Transaction$.serializer.INSTANCE);
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~i5;
        int i11 = (~(i7 | i10)) | (~(i8 | i6 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = i6 + i3 + i + ((-1255669517) * i2) + (533247121 * i4);
        int i14 = i13 * i13;
        int i15 = ((i6 * (-1895547823)) - 858849280) + ((-1895547823) * i3) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i) + (760610816 * i2) + ((-1057882112) * i4) + (1344208896 * i14);
        int i16 = ((i6 * (-122328301)) - 2132886715) + (i3 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i * (-122328029)) + (i2 * (-1196579527)) + (i4 * 656595923) + (i14 * 138215424);
        return i15 + ((i16 * i16) * (-833028096)) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumptionCardBenefitCalculationByTransactionDto)) {
            return false;
        }
        ConsumptionCardBenefitCalculationByTransactionDto consumptionCardBenefitCalculationByTransactionDto = (ConsumptionCardBenefitCalculationByTransactionDto) obj;
        if (!Intrinsics.areEqual(this.title, consumptionCardBenefitCalculationByTransactionDto.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.descriptionRow1, consumptionCardBenefitCalculationByTransactionDto.descriptionRow1)) {
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.descriptionRow2, consumptionCardBenefitCalculationByTransactionDto.descriptionRow2)) {
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.subTitle, consumptionCardBenefitCalculationByTransactionDto.subTitle)) {
            int i5 = onNavigationEvent + 27;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.schemeUrl, consumptionCardBenefitCalculationByTransactionDto.schemeUrl)) {
            int i6 = onNavigationEvent + 67;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.benefitAmount == consumptionCardBenefitCalculationByTransactionDto.benefitAmount) {
            return Intrinsics.areEqual(this.transactions, consumptionCardBenefitCalculationByTransactionDto.transactions);
        }
        int i8 = onNavigationEvent + 107;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r1 r3 r4 r5
      0x003e: PHI (r1v20 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r1 r3 r4
      0x003c: PHI (r1v6 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String str;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int iHashCode5 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.title.hashCode();
            iHashCode2 = this.descriptionRow1.hashCode();
            iHashCode3 = this.descriptionRow2.hashCode();
            str = this.subTitle;
            iHashCode4 = str == null ? 0 : str.hashCode();
        } else {
            iHashCode = this.title.hashCode();
            iHashCode2 = this.descriptionRow1.hashCode();
            iHashCode3 = this.descriptionRow2.hashCode();
            str = this.subTitle;
            if (str == null) {
            }
        }
        String str2 = this.schemeUrl;
        if (str2 != null) {
            int i3 = onExtraCallback + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode5 = str2.hashCode();
        }
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + Long.hashCode(this.benefitAmount)) * 31) + this.transactions.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCardBenefitCalculationByTransactionDto(title=" + this.title + ", descriptionRow1=" + this.descriptionRow1 + ", descriptionRow2=" + this.descriptionRow2 + ", subTitle=" + this.subTitle + ", schemeUrl=" + this.schemeUrl + ", benefitAmount=" + this.benefitAmount + ", transactions=" + this.transactions + ")";
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onWarmupCompleted + 43;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ ConsumptionCardBenefitCalculationByTransactionDto(int i, String str, String str2, String str3, String str4, String str5, long j, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
            int i2 = 2 % 2;
        } else {
            this.title = str;
        }
        Object obj = null;
        if ((i & 2) == 0) {
            int i3 = onExtraCallback + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.descriptionRow1 = "";
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.descriptionRow1 = str2;
        }
        if ((i & 4) == 0) {
            this.descriptionRow2 = "";
        } else {
            this.descriptionRow2 = str3;
            int i5 = onExtraCallback + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            this.subTitle = null;
        } else {
            this.subTitle = str4;
        }
        if ((i & 16) == 0) {
            this.schemeUrl = null;
            int i7 = onNavigationEvent + 9;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            this.schemeUrl = str5;
        }
        if ((i & 32) == 0) {
            this.benefitAmount = 0L;
        } else {
            this.benefitAmount = j;
        }
        if ((i & 64) != 0) {
            this.transactions = list;
            int i9 = onExtraCallback + 49;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i10 = onExtraCallback + 93;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 != 0) {
            this.transactions = CollectionsKt.emptyList();
            int i11 = 99 / 0;
        } else {
            this.transactions = CollectionsKt.emptyList();
        }
    }

    public ConsumptionCardBenefitCalculationByTransactionDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, long j, @NotNull List<Transaction> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.descriptionRow1 = str2;
        this.descriptionRow2 = str3;
        this.subTitle = str4;
        this.schemeUrl = str5;
        this.benefitAmount = j;
        this.transactions = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[PHI: r5
      0x0040: PHI (r5v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r5v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002d, B:10:0x003e, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r5
      0x002f: PHI (r5v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r5v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002d, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Lazy<KSerializer<Object>>[] lazyArr;
        ConsumptionCardBenefitCalculationByTransactionDto consumptionCardBenefitCalculationByTransactionDto = (ConsumptionCardBenefitCalculationByTransactionDto) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i3 = onExtraCallback + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (!Intrinsics.areEqual(consumptionCardBenefitCalculationByTransactionDto.title, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, consumptionCardBenefitCalculationByTransactionDto.title);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(consumptionCardBenefitCalculationByTransactionDto.descriptionRow1, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, consumptionCardBenefitCalculationByTransactionDto.descriptionRow1);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(consumptionCardBenefitCalculationByTransactionDto.descriptionRow2, "")) {
            vylVar.onExtraCallback(serialDescriptor, 2, consumptionCardBenefitCalculationByTransactionDto.descriptionRow2);
            int i5 = onExtraCallback + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || consumptionCardBenefitCalculationByTransactionDto.subTitle != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, consumptionCardBenefitCalculationByTransactionDto.subTitle);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i7 = onExtraCallback + 113;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (consumptionCardBenefitCalculationByTransactionDto.schemeUrl != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, consumptionCardBenefitCalculationByTransactionDto.schemeUrl);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 5)) || consumptionCardBenefitCalculationByTransactionDto.benefitAmount != 0) {
            vylVar.onExtraCallback(serialDescriptor, 5, consumptionCardBenefitCalculationByTransactionDto.benefitAmount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6) && Intrinsics.areEqual(consumptionCardBenefitCalculationByTransactionDto.transactions, CollectionsKt.emptyList())) {
            return null;
        }
        vylVar.onNavigationEvent(serialDescriptor, 6, (py) lazyArr[6].getValue(), consumptionCardBenefitCalculationByTransactionDto.transactions);
        return null;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConsumptionCardBenefitCalculationByTransactionDto(String str, String str2, String str3, String str4, String str5, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        long j2;
        List listEmptyList;
        String str8 = "";
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str6 = "";
        } else {
            str6 = str;
        }
        String str9 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i3 = 2 % 2;
        } else {
            str8 = str3;
        }
        String str10 = null;
        if ((i & 8) != 0) {
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i6 = onExtraCallback + 119;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str10 = str5;
        }
        if ((i & 32) != 0) {
            int i8 = onNavigationEvent + 73;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i & 64) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i10 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        this(str6, str9, str8, str7, str10, j2, listEmptyList);
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.descriptionRow1;
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.descriptionRow2;
        int i4 = i2 + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.subTitle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ConsumptionCardBenefitCalculationByTransactionDto consumptionCardBenefitCalculationByTransactionDto = (ConsumptionCardBenefitCalculationByTransactionDto) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = consumptionCardBenefitCalculationByTransactionDto.schemeUrl;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.benefitAmount;
        int i5 = i2 + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final List<Transaction> asBinder() {
        List<Transaction> list;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.transactions;
            int i4 = 74 / 0;
        } else {
            list = this.transactions;
        }
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(ConsumptionCardBenefitCalculationByTransactionDto consumptionCardBenefitCalculationByTransactionDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallbackWithResult(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1355365685, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 1355365685, new Object[]{consumptionCardBenefitCalculationByTransactionDto, vylVar, serialDescriptor});
    }

    public final String onTransact() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (String) onExtraCallbackWithResult(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1474556229, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -1474556228, new Object[]{this});
    }
}
