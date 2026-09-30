package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.TossbankJoinBridgeResponse$;
import im.toss.features.credit.data.response.TossbankJoinBridgeResponse$Cta$;
import im.toss.features.credit.data.response.TossbankJoinBridgeResponse$ListRowItem$;
import im.toss.features.credit.data.response.TossbankJoinBridgeResponse$Top$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
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
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TossbankJoinBridgeResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Cta cta;
    private final String deliberationText;
    private final List<String> disclaimers;
    private final List<ListRowItem> items;
    private final Top top;

    public TossbankJoinBridgeResponse() {
        this((String) null, (List) null, (Top) null, (Cta) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(TossbankJoinBridgeResponse$ListRowItem$.serializer.INSTANCE);
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = onExtraCallback + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsBinder;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsInterface;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = (~(i7 | i8 | i3)) | (~(i | i4 | i3));
        int i10 = ~i3;
        int i11 = (~(i8 | i)) | (~(i8 | i10));
        int i12 = (~(i3 | i4)) | (~(i7 | i10));
        int i13 = i + i4 + i6 + ((-564018846) * i5) + (483938512 * i2);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i) + 752877568 + ((-1516524009) * i4) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i6) + (1390411776 * i5) + (452984832 * i2) + ((-1135738880) * i14);
        int i16 = ((i * 1456092922) - 824780772) + (i4 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i6 * 1456093799) + (i5 * 578355822) + (i2 * 1098359728) + (i14 * 1868693504);
        return i15 + ((i16 * i16) * 2110914560) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TossbankJoinBridgeResponse)) {
            int i4 = onWarmupCompleted + 65;
            onExtraCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        TossbankJoinBridgeResponse tossbankJoinBridgeResponse = (TossbankJoinBridgeResponse) obj;
        if (!Intrinsics.areEqual(this.deliberationText, tossbankJoinBridgeResponse.deliberationText)) {
            int i5 = onWarmupCompleted;
            int i6 = i5 + 41;
            onExtraCallback = i6 % 128;
            boolean z = i6 % 2 != 0;
            int i7 = i5 + 69;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }
        if (!Intrinsics.areEqual(this.items, tossbankJoinBridgeResponse.items) || (!Intrinsics.areEqual(this.top, tossbankJoinBridgeResponse.top)) || !Intrinsics.areEqual(this.cta, tossbankJoinBridgeResponse.cta)) {
            return false;
        }
        if (Intrinsics.areEqual(this.disclaimers, tossbankJoinBridgeResponse.disclaimers)) {
            return true;
        }
        int i9 = onWarmupCompleted + 47;
        onExtraCallback = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.deliberationText.hashCode() * 31) + this.items.hashCode()) * 31) + this.top.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.disclaimers.hashCode();
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossbankJoinBridgeResponse(deliberationText=" + this.deliberationText + ", items=" + this.items + ", top=" + this.top + ", cta=" + this.cta + ", disclaimers=" + this.disclaimers + ")";
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new TossbankJoinBridgeResponse$.ExternalSyntheticLambda0()), null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new TossbankJoinBridgeResponse$.ExternalSyntheticLambda1())};
        int i = onExtraCallbackWithResult + 75;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TossbankJoinBridgeResponse(int i, String str, List list, Top top, Cta cta, List list2, okycx okycxVar) {
        this.deliberationText = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.items = CollectionsKt.emptyList();
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.items = list;
            int i4 = onExtraCallback + 55;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
            }
        }
        int i5 = 3;
        String str2 = null;
        if ((i & 4) == 0) {
            this.top = new Top((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.top = top;
        }
        if ((i & 8) == 0) {
            this.cta = new Cta(str2, str2, i5, (DefaultConstructorMarker) str2);
        } else {
            this.cta = cta;
            int i6 = onWarmupCompleted + 81;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        if ((i & 16) != 0) {
            this.disclaimers = list2;
            return;
        }
        int i8 = onExtraCallback + 63;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            this.disclaimers = CollectionsKt.emptyList();
        } else {
            this.disclaimers = CollectionsKt.emptyList();
            str2.hashCode();
            throw null;
        }
    }

    public TossbankJoinBridgeResponse(@NotNull String str, @NotNull List<ListRowItem> list, @NotNull Top top, @NotNull Cta cta, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(top, "");
        Intrinsics.checkNotNullParameter(cta, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.deliberationText = str;
        this.items = list;
        this.top = top;
        this.cta = cta;
        this.disclaimers = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
                if (!Intrinsics.areEqual(tossbankJoinBridgeResponse.deliberationText, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, tossbankJoinBridgeResponse.deliberationText);
                }
            } else if (!Intrinsics.areEqual(tossbankJoinBridgeResponse.deliberationText, "")) {
            }
        }
        String str = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallback + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(tossbankJoinBridgeResponse.items, CollectionsKt.emptyList());
                str.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(tossbankJoinBridgeResponse.items, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), tossbankJoinBridgeResponse.items);
            }
        }
        int i5 = 3;
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (!Intrinsics.areEqual(tossbankJoinBridgeResponse.top, new Top((String) null, (String) null, 3, (DefaultConstructorMarker) null)))) {
            vylVar.onNavigationEvent(serialDescriptor, 2, TossbankJoinBridgeResponse$Top$.serializer.INSTANCE, tossbankJoinBridgeResponse.top);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(tossbankJoinBridgeResponse.cta, new Cta(str, str, i5, (DefaultConstructorMarker) str))) {
            vylVar.onNavigationEvent(serialDescriptor, 3, TossbankJoinBridgeResponse$Cta$.serializer.INSTANCE, tossbankJoinBridgeResponse.cta);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i6 = onExtraCallback + 13;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.areEqual(tossbankJoinBridgeResponse.disclaimers, CollectionsKt.emptyList());
                throw null;
            }
            if (Intrinsics.areEqual(tossbankJoinBridgeResponse.disclaimers, CollectionsKt.emptyList())) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), tossbankJoinBridgeResponse.disclaimers);
        int i7 = onWarmupCompleted + 23;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    public /* synthetic */ TossbankJoinBridgeResponse(String str, List list, Top top, Cta cta, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        List listEmptyList = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        int i2 = 3;
        String str2 = null;
        if ((i & 4) != 0) {
            top = new Top((String) null, (String) null, 3, (DefaultConstructorMarker) null);
            int i3 = 2 % 2;
        }
        Top top2 = top;
        if ((i & 8) != 0) {
            cta = new Cta(str2, str2, i2, (DefaultConstructorMarker) str2);
            int i4 = onWarmupCompleted + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        Cta cta2 = cta;
        if ((i & 16) != 0) {
            int i7 = onExtraCallback + 95;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            list2 = CollectionsKt.emptyList();
        }
        this(str, listEmptyList, top2, cta2, list2);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.deliberationText;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossbankJoinBridgeResponse tossbankJoinBridgeResponse = (TossbankJoinBridgeResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<ListRowItem> list = tossbankJoinBridgeResponse.items;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Top onTransact() {
        Top top;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            top = this.top;
            int i4 = 61 / 0;
        } else {
            top = this.top;
        }
        int i5 = i2 + 107;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return top;
    }

    public final Cta onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Cta cta = this.cta;
        int i5 = i2 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return cta;
    }

    public final List<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<String> list = this.disclaimers;
        int i5 = i3 + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (KSerializer) onNavigationEvent(new Object[0], 1137140970, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted, -1137140970, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    public final List<ListRowItem> IAuthTabCallbackDefault() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (List) onNavigationEvent(new Object[]{this}, -1415856106, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted, 1415856107, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    @liq
    public static final class Cta {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String linkUrl;
        private final String title;

        static {
            int i = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Cta() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                int i5 = i2 + 85;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 69 / 0;
                }
                return false;
            }
            Cta cta = (Cta) obj;
            if (!Intrinsics.areEqual(this.linkUrl, cta.linkUrl) || !Intrinsics.areEqual(this.title, cta.title)) {
                return false;
            }
            int i7 = onNavigationEvent + 51;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i;
            String str;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.linkUrl.hashCode();
            if (i4 == 0) {
                i = iHashCode >> 45;
                str = this.title;
            } else {
                i = iHashCode * 31;
                str = this.title;
            }
            return i + str.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Cta(linkUrl=" + this.linkUrl + ", title=" + this.title + ")";
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 45 / 0;
            }
            return str;
        }

        public /* synthetic */ Cta(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.linkUrl = "";
            } else {
                this.linkUrl = str;
                int i2 = onWarmupCompleted + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                this.title = str2;
                int i5 = onWarmupCompleted + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            int i7 = onWarmupCompleted + 83;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            this.title = "";
            if (i8 != 0) {
                throw null;
            }
        }

        public Cta(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.linkUrl = str;
            this.title = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(Cta cta, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onNavigationEvent + 59;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.areEqual(cta.linkUrl, "");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(cta.linkUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, cta.linkUrl);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onNavigationEvent + 103;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                boolean zAreEqual = Intrinsics.areEqual(cta.title, "");
                if (i4 == 0) {
                    int i5 = 34 / 0;
                    if (zAreEqual) {
                        return;
                    }
                } else if (zAreEqual) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, cta.title);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Cta(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 79;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i5 = onNavigationEvent + 75;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = "";
            }
            this(str, str2);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.linkUrl;
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 43;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
