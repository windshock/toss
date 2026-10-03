package viva.republica.toss.network.model.transfer.periodic;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.fromArray;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDeleteParam$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferDeleteParam {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final fromArray dueDateType;
    private final String uniqueId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDeleteParam$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                PeriodicTransferDeleteParam.onNavigationEvent();
                throw null;
            }
            KSerializer kSerializerOnNavigationEvent = PeriodicTransferDeleteParam.onNavigationEvent();
            int i3 = onExtraCallback + 99;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnNavigationEvent;
        }
    })};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.DueDateType", fromArray.values());
        int i4 = onExtraCallbackWithResult + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return kSerializerIAuthTabCallback;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferDeleteParam> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferDeleteParam$.serializer serializerVar = PeriodicTransferDeleteParam$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 20 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 75;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    public /* synthetic */ PeriodicTransferDeleteParam(int i, String str, fromArray fromarray, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, PeriodicTransferDeleteParam$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.uniqueId = str;
        this.dueDateType = fromarray;
    }

    public PeriodicTransferDeleteParam(@NotNull String str, @Nullable fromArray fromarray) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uniqueId = str;
        this.dueDateType = fromarray;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(PeriodicTransferDeleteParam periodicTransferDeleteParam, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 1, periodicTransferDeleteParam.uniqueId);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[1].getValue(), periodicTransferDeleteParam.dueDateType);
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, periodicTransferDeleteParam.uniqueId);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr2[1].getValue(), periodicTransferDeleteParam.dueDateType);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }
}
