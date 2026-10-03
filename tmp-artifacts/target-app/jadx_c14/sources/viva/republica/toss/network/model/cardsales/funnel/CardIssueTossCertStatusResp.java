package viva.republica.toss.network.model.cardsales.funnel;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatusResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueTossCertStatusResp {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final CardIssueTossCertStatus status;
    private final String txId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatusResp$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = CardIssueTossCertStatusResp.onWarmupCompleted();
            int i4 = onWarmupCompleted + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<CardIssueTossCertStatus> kSerializerSerializer = CardIssueTossCertStatus.Companion.serializer();
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 53;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof CardIssueTossCertStatusResp) {
            CardIssueTossCertStatusResp cardIssueTossCertStatusResp = (CardIssueTossCertStatusResp) obj;
            if (Intrinsics.areEqual(this.txId, cardIssueTossCertStatusResp.txId)) {
                return this.status == cardIssueTossCertStatusResp.status;
            }
            int i8 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = i2 + 81;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.txId.hashCode();
        CardIssueTossCertStatus cardIssueTossCertStatus = this.status;
        if (cardIssueTossCertStatus == null) {
            i = 0;
        } else {
            int iHashCode2 = cardIssueTossCertStatus.hashCode();
            int i5 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueTossCertStatusResp(txId=" + this.txId + ", status=" + this.status + ")";
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardIssueTossCertStatusResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CardIssueTossCertStatusResp$.serializer serializerVar = CardIssueTossCertStatusResp$.serializer.INSTANCE;
            int i4 = onExtraCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 75;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ CardIssueTossCertStatusResp(int i, String str, CardIssueTossCertStatus cardIssueTossCertStatus, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, CardIssueTossCertStatusResp$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.txId = str;
        this.status = cardIssueTossCertStatus;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(CardIssueTossCertStatusResp cardIssueTossCertStatusResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, cardIssueTossCertStatusResp.txId);
            lazy = lazyArr[1];
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, cardIssueTossCertStatusResp.txId);
            lazy = lazyArr2[1];
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazy.getValue(), cardIssueTossCertStatusResp.status);
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public final CardIssueTossCertStatus onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
