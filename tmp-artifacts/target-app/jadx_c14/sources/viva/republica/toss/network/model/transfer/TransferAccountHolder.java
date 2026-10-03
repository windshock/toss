package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferAccountHolder$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferAccountHolder {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String additionalBankName;
    private final String name;
    private final TransferProvider transferProvider;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferAccountHolder$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = TransferAccountHolder.onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }
    }), null};

    public TransferAccountHolder() {
        this((String) null, (TransferProvider) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        KSerializer<TransferProvider> kSerializerSerializer;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerSerializer = TransferProvider.Companion.serializer();
            int i3 = 48 / 0;
        } else {
            kSerializerSerializer = TransferProvider.Companion.serializer();
        }
        int i4 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TransferAccountHolder)) {
            return false;
        }
        TransferAccountHolder transferAccountHolder = (TransferAccountHolder) obj;
        if (!Intrinsics.areEqual(this.name, transferAccountHolder.name)) {
            int i4 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.transferProvider != transferAccountHolder.transferProvider) {
            int i5 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.additionalBankName, transferAccountHolder.additionalBankName)) {
            return true;
        }
        int i7 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.name.hashCode();
        TransferProvider transferProvider = this.transferProvider;
        int iHashCode3 = 0;
        if (transferProvider == null) {
            iHashCode = 0;
        } else {
            iHashCode = transferProvider.hashCode();
            int i2 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 3;
            }
        }
        String str = this.additionalBankName;
        if (str != null) {
            iHashCode3 = str.hashCode();
            int i4 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferAccountHolder(name=" + this.name + ", transferProvider=" + this.transferProvider + ", additionalBankName=" + this.additionalBankName + ")";
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferAccountHolder> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TransferAccountHolder$.serializer serializerVar = TransferAccountHolder$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 51;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ TransferAccountHolder(int i, String str, TransferProvider transferProvider, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            str = "";
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.transferProvider = null;
        } else {
            this.transferProvider = transferProvider;
            int i5 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i8 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            this.additionalBankName = null;
            if (i9 == 0) {
                throw null;
            }
            return;
        }
        this.additionalBankName = str2;
        int i10 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 54 / 0;
        }
    }

    public TransferAccountHolder(@NotNull String str, @Nullable TransferProvider transferProvider, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.transferProvider = transferProvider;
        this.additionalBankName = str2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.TransferAccountHolder r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.TransferAccountHolder.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L2c
            int r3 = viva.republica.toss.network.model.transfer.TransferAccountHolder.onExtraCallbackWithResult
            int r3 = r3 + 39
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.TransferAccountHolder.onNavigationEvent = r4
            int r3 = r3 % r0
            java.lang.String r4 = ""
            if (r3 == 0) goto L22
            java.lang.String r3 = r5.name
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L31
            goto L2c
        L22:
            java.lang.String r5 = r5.name
            kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)
            r5 = 0
            r5.hashCode()
            throw r5
        L2c:
            java.lang.String r3 = r5.name
            r6.onExtraCallback(r7, r2, r3)
        L31:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L45
            int r3 = viva.republica.toss.network.model.transfer.TransferAccountHolder.onNavigationEvent
            int r3 = r3 + 27
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.TransferAccountHolder.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            viva.republica.toss.network.model.transfer.TransferProvider r3 = r5.transferProvider
            if (r3 == 0) goto L52
        L45:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.transfer.TransferProvider r3 = r5.transferProvider
            r6.onExtraCallbackWithResult(r7, r2, r1, r3)
        L52:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L5c
            java.lang.String r1 = r5.additionalBankName
            if (r1 == 0) goto L63
        L5c:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.additionalBankName
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferAccountHolder.onNavigationEvent(viva.republica.toss.network.model.transfer.TransferAccountHolder, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransferAccountHolder(String str, TransferProvider transferProvider, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            transferProvider = null;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        this(str, transferProvider, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransferProvider onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        TransferProvider transferProvider = this.transferProvider;
        int i5 = i3 + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return transferProvider;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.additionalBankName;
        int i5 = i2 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
