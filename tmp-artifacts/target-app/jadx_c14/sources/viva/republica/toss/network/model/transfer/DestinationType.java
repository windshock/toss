package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DestinationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DestinationType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final DestinationType TRANSFER_INPUT_AMOUNT = new DestinationType("TRANSFER_INPUT_AMOUNT", 0);
    public static final DestinationType TRANSFER_CONFIRM = new DestinationType("TRANSFER_CONFIRM", 1);

    public static /* synthetic */ KSerializer $r8$lambda$C_oOWCcrYHq4oFsV5GKpc_ero70() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ DestinationType[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        DestinationType[] destinationTypeArr = {TRANSFER_INPUT_AMOUNT, TRANSFER_CONFIRM};
        int i5 = i2 + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return destinationTypeArr;
    }

    public static EnumEntries<DestinationType> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<DestinationType> enumEntries = $ENTRIES;
        int i5 = i2 + 43;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static DestinationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DestinationType destinationType = (DestinationType) Enum.valueOf(DestinationType.class, str);
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return destinationType;
    }

    public static DestinationType[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DestinationType[] destinationTypeArr = (DestinationType[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return destinationTypeArr;
        }
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

        private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            KSerializer kSerializer = (KSerializer) DestinationType.access$get$cachedSerializer$delegate$cp().getValue();
            int i3 = onExtraCallback + 107;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 52 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<DestinationType> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<DestinationType> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (i3 != 0) {
                int i4 = 11 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }
    }

    private DestinationType(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.DestinationType", values());
        int i4 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            lazy = $cachedSerializer$delegate;
            int i4 = 6 / 0;
        } else {
            lazy = $cachedSerializer$delegate;
        }
        int i5 = i2 + 95;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        DestinationType[] destinationTypeArr$values = $values();
        $VALUES = destinationTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(destinationTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.DestinationType$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    DestinationType.$r8$lambda$C_oOWCcrYHq4oFsV5GKpc_ero70();
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializer$r8$lambda$C_oOWCcrYHq4oFsV5GKpc_ero70 = DestinationType.$r8$lambda$C_oOWCcrYHq4oFsV5GKpc_ero70();
                int i3 = IAuthTabCallback + 37;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return kSerializer$r8$lambda$C_oOWCcrYHq4oFsV5GKpc_ero70;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i = onNavigationEvent + 113;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
    }
}
