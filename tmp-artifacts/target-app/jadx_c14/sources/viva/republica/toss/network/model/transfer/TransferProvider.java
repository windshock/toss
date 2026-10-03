package viva.republica.toss.network.model.transfer;

import com.google.gson.annotations.SerializedName;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.clearFaultAdjacentMetadata;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferProvider {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferProvider[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;

    @SerializedName("TOSS_BANK_FROM_ANY")
    public static final TransferProvider TOSS_BANK_FROM_ANY;

    @SerializedName("TOSS_BANK_FROM_ANY_TO_ANY")
    public static final TransferProvider TOSS_BANK_FROM_ANY_TO_ANY;
    private static final Set<TransferProvider> TOSS_BANK_SET;

    @SerializedName("TOSS_BANK_TO_ANY")
    public static final TransferProvider TOSS_BANK_TO_ANY;

    @SerializedName("TOSS_CORE")
    public static final TransferProvider TOSS_CORE = new TransferProvider("TOSS_CORE", 0);
    private static final Set<TransferProvider> TOSS_SECURITIES_SET;

    @SerializedName("TOSS_SECURITIES_TO_ANY")
    public static final TransferProvider TOSS_SECURITIES_TO_ANY;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ KSerializer $r8$lambda$2x1MAmKz5cj_5myyB5QstrSroB0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$_anonymous_();
        }
        _init_$_anonymous_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ TransferProvider[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        TransferProvider[] transferProviderArr = {TOSS_CORE, TOSS_BANK_TO_ANY, TOSS_BANK_FROM_ANY, TOSS_BANK_FROM_ANY_TO_ANY, TOSS_SECURITIES_TO_ANY};
        int i5 = i2 + 29;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return transferProviderArr;
    }

    public static EnumEntries<TransferProvider> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<TransferProvider> enumEntries = $ENTRIES;
        int i5 = i3 + 31;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static TransferProvider valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferProvider transferProvider = (TransferProvider) Enum.valueOf(TransferProvider.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return transferProvider;
    }

    public static TransferProvider[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TransferProvider[] transferProviderArr = (TransferProvider[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return transferProviderArr;
    }

    private TransferProvider(String str, int i) {
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return $cachedSerializer$delegate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TransferProvider transferProvider = new TransferProvider("TOSS_BANK_TO_ANY", 1);
        TOSS_BANK_TO_ANY = transferProvider;
        TransferProvider transferProvider2 = new TransferProvider("TOSS_BANK_FROM_ANY", 2);
        TOSS_BANK_FROM_ANY = transferProvider2;
        TransferProvider transferProvider3 = new TransferProvider("TOSS_BANK_FROM_ANY_TO_ANY", 3);
        TOSS_BANK_FROM_ANY_TO_ANY = transferProvider3;
        TransferProvider transferProvider4 = new TransferProvider("TOSS_SECURITIES_TO_ANY", 4);
        TOSS_SECURITIES_TO_ANY = transferProvider4;
        TransferProvider[] transferProviderArr$values = $values();
        $VALUES = transferProviderArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(transferProviderArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TOSS_BANK_SET = clearFaultAdjacentMetadata.onExtraCallback(new TransferProvider[]{transferProvider, transferProvider2, transferProvider3});
        TOSS_SECURITIES_SET = clearFaultAdjacentMetadata.onExtraCallback(transferProvider4);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferProvider$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 123;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    TransferProvider.$r8$lambda$2x1MAmKz5cj_5myyB5QstrSroB0();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializer$r8$lambda$2x1MAmKz5cj_5myyB5QstrSroB0 = TransferProvider.$r8$lambda$2x1MAmKz5cj_5myyB5QstrSroB0();
                int i3 = onExtraCallbackWithResult + 107;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 77 / 0;
                }
                return kSerializer$r8$lambda$2x1MAmKz5cj_5myyB5QstrSroB0;
            }
        });
        int i = IAuthTabCallback + 101;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public final boolean isTossBank() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = TOSS_BANK_SET.contains(this);
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return zContains;
    }

    public final boolean isTossSecurities() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            TOSS_SECURITIES_SET.contains(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zContains = TOSS_SECURITIES_SET.contains(this);
        int i3 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zContains;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializer = (KSerializer) TransferProvider.access$get$cachedSerializer$delegate$cp().getValue();
            int i3 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializer;
            }
            throw null;
        }

        public final KSerializer<TransferProvider> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback();
                throw null;
            }
            KSerializer<TransferProvider> kSerializerOnExtraCallback = onExtraCallback();
            int i3 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallback;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferProvider", values());
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferProvider", values());
        int i3 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }
}
