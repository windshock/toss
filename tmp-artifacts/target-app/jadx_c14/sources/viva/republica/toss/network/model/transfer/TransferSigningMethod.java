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
public final class TransferSigningMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferSigningMethod[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final TransferSigningMethod TOSS_FACE = new TransferSigningMethod("TOSS_FACE", 0);
    public static final TransferSigningMethod BIOMETRIC = new TransferSigningMethod("BIOMETRIC", 1);
    public static final TransferSigningMethod PIN = new TransferSigningMethod("PIN", 2);
    public static final TransferSigningMethod SKIP = new TransferSigningMethod("SKIP", 3);

    public static /* synthetic */ KSerializer $r8$lambda$8pJylousgPUv2KpiBLf1wDd2Sww() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$_anonymous_();
        }
        _init_$_anonymous_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ TransferSigningMethod[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferSigningMethod transferSigningMethod = TOSS_FACE;
        if (i3 != 0) {
            return new TransferSigningMethod[]{transferSigningMethod, BIOMETRIC, PIN, SKIP};
        }
        TransferSigningMethod transferSigningMethod2 = BIOMETRIC;
        TransferSigningMethod transferSigningMethod3 = PIN;
        TransferSigningMethod transferSigningMethod4 = SKIP;
        TransferSigningMethod[] transferSigningMethodArr = new TransferSigningMethod[5];
        transferSigningMethodArr[0] = transferSigningMethod;
        transferSigningMethodArr[1] = transferSigningMethod2;
        transferSigningMethodArr[5] = transferSigningMethod3;
        transferSigningMethodArr[3] = transferSigningMethod4;
        return transferSigningMethodArr;
    }

    public static EnumEntries<TransferSigningMethod> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransferSigningMethod valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferSigningMethod transferSigningMethod = (TransferSigningMethod) Enum.valueOf(TransferSigningMethod.class, str);
        int i4 = onExtraCallbackWithResult + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return transferSigningMethod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransferSigningMethod[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferSigningMethod[] transferSigningMethodArr = $VALUES;
        if (i3 != 0) {
            return (TransferSigningMethod[]) transferSigningMethodArr.clone();
        }
        int i4 = 11 / 0;
        return (TransferSigningMethod[]) transferSigningMethodArr.clone();
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            KSerializer kSerializer = (KSerializer) TransferSigningMethod.access$get$cachedSerializer$delegate$cp().getValue();
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return kSerializer;
        }

        public final KSerializer<TransferSigningMethod> serializer() {
            KSerializer<TransferSigningMethod> kSerializerOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerOnWarmupCompleted = onWarmupCompleted();
                int i3 = 68 / 0;
            } else {
                kSerializerOnWarmupCompleted = onWarmupCompleted();
            }
            int i4 = onWarmupCompleted + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnWarmupCompleted;
            }
            throw null;
        }
    }

    private TransferSigningMethod(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferSigningMethod", values());
        int i4 = onExtraCallbackWithResult + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i4 = i3 + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return lazy;
        }
        obj.hashCode();
        throw null;
    }

    static {
        TransferSigningMethod[] transferSigningMethodArr$values = $values();
        $VALUES = transferSigningMethodArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(transferSigningMethodArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferSigningMethod$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$8pJylousgPUv2KpiBLf1wDd2Sww = TransferSigningMethod.$r8$lambda$8pJylousgPUv2KpiBLf1wDd2Sww();
                int i4 = onWarmupCompleted + 13;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer$r8$lambda$8pJylousgPUv2KpiBLf1wDd2Sww;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i = onWarmupCompleted + 89;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
