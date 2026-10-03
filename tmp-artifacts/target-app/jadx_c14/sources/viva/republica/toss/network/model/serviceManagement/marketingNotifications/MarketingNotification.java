package viva.republica.toss.network.model.serviceManagement.marketingNotifications;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.setApTextSize;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MarketingNotification {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String companyKey;
    private final String companyName;
    private final boolean isMaintenance;
    private final String note;
    private final List<Setting> settings;
    private final List<Term> terms;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[0], -1344530161, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1344530161, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Term$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer interfaceDescriptor = getInterfaceDescriptor();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return interfaceDescriptor;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (!(obj instanceof MarketingNotification)) {
            int i5 = i2 + 95;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        MarketingNotification marketingNotification = (MarketingNotification) obj;
        if (!Intrinsics.areEqual(this.companyKey, marketingNotification.companyKey) || !Intrinsics.areEqual(this.companyName, marketingNotification.companyName) || this.isMaintenance != marketingNotification.isMaintenance) {
            return false;
        }
        if (Intrinsics.areEqual(this.note, marketingNotification.note)) {
            if (!Intrinsics.areEqual(this.settings, marketingNotification.settings) || !Intrinsics.areEqual(this.terms, marketingNotification.terms)) {
                return false;
            }
            int i6 = onWarmupCompleted + 7;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        int i7 = onNavigationEvent;
        int i8 = i7 + 81;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 57;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.companyKey.hashCode();
        int iHashCode3 = this.companyName.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isMaintenance);
        String str = this.note;
        if (str == null) {
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onNavigationEvent + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 4;
            }
        }
        int iHashCode5 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + this.settings.hashCode()) * 31) + this.terms.hashCode();
        int i6 = onNavigationEvent + 95;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return iHashCode5;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MarketingNotification(companyKey=" + this.companyKey + ", companyName=" + this.companyName + ", isMaintenance=" + this.isMaintenance + ", note=" + this.note + ", settings=" + this.settings + ", terms=" + this.terms + ")";
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarketingNotification> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                MarketingNotification$.serializer serializerVar = MarketingNotification$.serializer.INSTANCE;
                throw null;
            }
            MarketingNotification$.serializer serializerVar2 = MarketingNotification$.serializer.INSTANCE;
            int i3 = onExtraCallback + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = MarketingNotification.IAuthTabCallback();
                int i4 = IAuthTabCallback + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 19 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = MarketingNotification.onWarmupCompleted();
                int i4 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 93 / 0;
                }
                return kSerializerOnWarmupCompleted;
            }
        })};
        int i = IAuthTabCallback + 93;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ MarketingNotification(int i, String str, String str2, boolean z, String str3, List list, List list2, okycx okycxVar) {
        if (55 != (i & 55)) {
            htf31.onExtraCallbackWithResult(i, 55, MarketingNotification$.serializer.INSTANCE.getDescriptor());
            int i2 = onWarmupCompleted + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.companyKey = str;
        this.companyName = str2;
        this.isMaintenance = z;
        if ((i & 8) == 0) {
            this.note = null;
            int i5 = onWarmupCompleted + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            this.note = str3;
        }
        int i7 = 2 % 2;
        this.settings = list;
        this.terms = list2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[PHI: r0
      0x0054: PHI (r0v13 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r0v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r0v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r0v14 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:13:0x0053, B:11:0x0050, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification r1 = (viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification) r1
            r2 = 1
            r3 = r9[r2]
            o.vyl r3 = (o.vyl) r3
            r4 = 2
            r9 = r9[r4]
            kotlinx.serialization.descriptors.SerialDescriptor r9 = (kotlinx.serialization.descriptors.SerialDescriptor) r9
            int r5 = r4 % r4
            int r5 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification.onNavigationEvent
            int r5 = r5 + 121
            int r6 = r5 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification.onWarmupCompleted = r6
            int r5 = r5 % r4
            r6 = 3
            r7 = 5
            if (r5 != 0) goto L36
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r0 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification.$childSerializers
            java.lang.String r5 = r1.companyKey
            r3.onExtraCallback(r9, r2, r5)
            java.lang.String r5 = r1.companyName
            r3.onExtraCallback(r9, r2, r5)
            boolean r2 = r1.isMaintenance
            r3.onNavigationEvent(r9, r7, r2)
            boolean r2 = r3.onWarmupCompleted(r9, r4)
            if (r2 != 0) goto L54
            goto L4e
        L36:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r5 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification.$childSerializers
            java.lang.String r8 = r1.companyKey
            r3.onExtraCallback(r9, r0, r8)
            java.lang.String r0 = r1.companyName
            r3.onExtraCallback(r9, r2, r0)
            boolean r0 = r1.isMaintenance
            r3.onNavigationEvent(r9, r4, r0)
            boolean r0 = r3.onWarmupCompleted(r9, r6)
            if (r0 == r2) goto L53
            r0 = r5
        L4e:
            java.lang.String r2 = r1.note
            if (r2 == 0) goto L5b
            goto L54
        L53:
            r0 = r5
        L54:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r1.note
            r3.onExtraCallbackWithResult(r9, r6, r2, r5)
        L5b:
            r2 = 4
            r5 = r0[r2]
            java.lang.Object r5 = r5.getValue()
            o.py r5 = (o.py) r5
            java.util.List<viva.republica.toss.network.model.serviceManagement.marketingNotifications.Setting> r6 = r1.settings
            r3.onNavigationEvent(r9, r2, r5, r6)
            r0 = r0[r7]
            java.lang.Object r0 = r0.getValue()
            o.py r0 = (o.py) r0
            java.util.List<viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term> r1 = r1.terms
            r3.onNavigationEvent(r9, r7, r0, r1)
            int r9 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification.onWarmupCompleted
            int r9 = r9 + 103
            int r0 = r9 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification.onNavigationEvent = r0
            int r9 = r9 % r4
            r0 = 0
            if (r9 != 0) goto L83
            return r0
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyKey;
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.companyName;
        int i5 = i3 + 97;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isMaintenance;
        int i5 = i2 + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.note;
        int i5 = i2 + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    public final List<Setting> asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<Setting> list = this.settings;
        int i5 = i3 + 69;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Term> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<Term> list = this.terms;
        int i5 = i3 + 93;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return list;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i2)) | i5;
        int i9 = ~i5;
        int i10 = ~(i9 | i2 | i);
        int i11 = (~(i | i9)) | i2 | (~(i7 | i5));
        int i12 = i2 + i5 + i4 + ((-381402339) * i6) + ((-2062754392) * i3);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i2) + 1063714816 + (1288888451 * i5) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i4) + (1454768128 * i6) + (808452096 * i3) + ((-1790509056) * i13);
        int i15 = ((i2 * (-1355236691)) - 921838429) + (i5 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i4 * (-1355236397)) + (i6 * (-1583251481)) + (i3 * 1682205048) + (i13 * (-427491328));
        if (i14 + (i15 * i15 * 844169216) == 1) {
            return onNavigationEvent(objArr);
        }
        int i16 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Setting$$serializer.INSTANCE);
        int i17 = onWarmupCompleted + 75;
        onNavigationEvent = i17 % 128;
        int i18 = i17 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        return (KSerializer) IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[0], -1344530161, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1344530161, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }
}
