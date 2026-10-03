package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DetectFraudResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DetectFraudResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final PreSendAlert displayInfo;
    private final onWarmupCompleted fraudType;
    private final DetectFraudIconInfo iconInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.DetectFraudResponse$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = DetectFraudResponse.onWarmupCompleted();
            int i4 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null, null};

    public DetectFraudResponse() {
        this((onWarmupCompleted) null, (PreSendAlert) null, (DetectFraudIconInfo) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.DetectFraudResponse.FraudType", onWarmupCompleted.values());
        int i4 = onWarmupCompleted + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        KSerializer kSerializerAsInterface;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerAsInterface = asInterface();
            int i3 = 57 / 0;
        } else {
            kSerializerAsInterface = asInterface();
        }
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return kSerializerAsInterface;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 37;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 49;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof DetectFraudResponse) {
            DetectFraudResponse detectFraudResponse = (DetectFraudResponse) obj;
            return this.fraudType == detectFraudResponse.fraudType && !(Intrinsics.areEqual(this.displayInfo, detectFraudResponse.displayInfo) ^ true) && Intrinsics.areEqual(this.iconInfo, detectFraudResponse.iconInfo);
        }
        int i8 = i2 + 91;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.fraudType.hashCode();
        PreSendAlert preSendAlert = this.displayInfo;
        int iHashCode2 = 0;
        int iHashCode3 = preSendAlert == null ? 0 : preSendAlert.hashCode();
        DetectFraudIconInfo detectFraudIconInfo = this.iconInfo;
        if (detectFraudIconInfo != null) {
            int i4 = IAuthTabCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = detectFraudIconInfo.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DetectFraudResponse(fraudType=" + this.fraudType + ", displayInfo=" + this.displayInfo + ", iconInfo=" + this.iconInfo + ")";
        int i2 = onWarmupCompleted + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DetectFraudResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DetectFraudResponse$.serializer serializerVar = DetectFraudResponse$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 101;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ DetectFraudResponse(int i, onWarmupCompleted onwarmupcompleted, PreSendAlert preSendAlert, DetectFraudIconInfo detectFraudIconInfo, okycx okycxVar) {
        if ((i & 1) == 0) {
            onwarmupcompleted = onWarmupCompleted.FAILED;
            int i2 = 2 % 2;
        }
        this.fraudType = onwarmupcompleted;
        Object obj = null;
        if ((i & 2) == 0) {
            int i3 = onWarmupCompleted + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.displayInfo = null;
            if (i4 == 0) {
                throw null;
            }
            int i5 = 2 % 2;
        } else {
            this.displayInfo = preSendAlert;
        }
        if ((i & 4) != 0) {
            this.iconInfo = detectFraudIconInfo;
            return;
        }
        int i6 = IAuthTabCallback + 123;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        this.iconInfo = null;
        if (i7 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public DetectFraudResponse(@NotNull onWarmupCompleted onwarmupcompleted, @Nullable PreSendAlert preSendAlert, @Nullable DetectFraudIconInfo detectFraudIconInfo) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.fraudType = onwarmupcompleted;
        this.displayInfo = preSendAlert;
        this.iconInfo = detectFraudIconInfo;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.DetectFraudResponse r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.DetectFraudResponse.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L14
            viva.republica.toss.network.model.transfer.DetectFraudResponse$onWarmupCompleted r3 = r6.fraudType
            viva.republica.toss.network.model.transfer.DetectFraudResponse$onWarmupCompleted r5 = viva.republica.toss.network.model.transfer.DetectFraudResponse.onWarmupCompleted.FAILED
            if (r3 == r5) goto L21
        L14:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.transfer.DetectFraudResponse$onWarmupCompleted r3 = r6.fraudType
            r7.onNavigationEvent(r8, r2, r1, r3)
        L21:
            boolean r1 = r7.onWarmupCompleted(r8, r4)
            r2 = 0
            if (r1 != 0) goto L3b
            int r1 = viva.republica.toss.network.model.transfer.DetectFraudResponse.onWarmupCompleted
            int r1 = r1 + 121
            int r3 = r1 % 128
            viva.republica.toss.network.model.transfer.DetectFraudResponse.IAuthTabCallback = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L38
            viva.republica.toss.network.model.transfer.PreSendAlert r1 = r6.displayInfo
            if (r1 == 0) goto L42
            goto L3b
        L38:
            viva.republica.toss.network.model.transfer.PreSendAlert r6 = r6.displayInfo
            throw r2
        L3b:
            o.onHostResume r1 = o.onHostResume.INSTANCE
            viva.republica.toss.network.model.transfer.PreSendAlert r3 = r6.displayInfo
            r7.onExtraCallbackWithResult(r8, r4, r1, r3)
        L42:
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            if (r1 != 0) goto L5e
            int r1 = viva.republica.toss.network.model.transfer.DetectFraudResponse.IAuthTabCallback
            int r1 = r1 + 125
            int r3 = r1 % 128
            viva.republica.toss.network.model.transfer.DetectFraudResponse.onWarmupCompleted = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L58
            viva.republica.toss.network.model.transfer.DetectFraudIconInfo r1 = r6.iconInfo
            if (r1 == 0) goto L65
            goto L5e
        L58:
            viva.republica.toss.network.model.transfer.DetectFraudIconInfo r6 = r6.iconInfo
            r2.hashCode()
            throw r2
        L5e:
            viva.republica.toss.network.model.transfer.DetectFraudIconInfo$$serializer r1 = viva.republica.toss.network.model.transfer.DetectFraudIconInfo$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.DetectFraudIconInfo r6 = r6.iconInfo
            r7.onExtraCallbackWithResult(r8, r0, r1, r6)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DetectFraudResponse.onNavigationEvent(viva.republica.toss.network.model.transfer.DetectFraudResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DetectFraudResponse(onWarmupCompleted onwarmupcompleted, PreSendAlert preSendAlert, DetectFraudIconInfo detectFraudIconInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        onwarmupcompleted = (i & 1) != 0 ? onWarmupCompleted.FAILED : onwarmupcompleted;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback + 107;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            preSendAlert = null;
        }
        if ((i & 4) != 0) {
            int i8 = 2 % 2;
            detectFraudIconInfo = null;
        }
        this(onwarmupcompleted, preSendAlert, detectFraudIconInfo);
    }

    public final onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = this.fraudType;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }

    public final PreSendAlert IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        PreSendAlert preSendAlert = this.displayInfo;
        int i5 = i2 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return preSendAlert;
    }

    public final DetectFraudIconInfo onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        DetectFraudIconInfo detectFraudIconInfo = this.iconInfo;
        int i5 = i3 + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return detectFraudIconInfo;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onWarmupCompleted SAFE = new onWarmupCompleted("SAFE", 0);
        public static final onWarmupCompleted FRAUD = new onWarmupCompleted("FRAUD", 1);
        public static final onWarmupCompleted FAILED = new onWarmupCompleted("FAILED", 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return new onWarmupCompleted[]{SAFE, FRAUD, FAILED};
            }
            onWarmupCompleted onwarmupcompleted = SAFE;
            onWarmupCompleted onwarmupcompleted2 = FRAUD;
            onWarmupCompleted onwarmupcompleted3 = FAILED;
            onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[2];
            onwarmupcompletedArr[1] = onwarmupcompleted;
            onwarmupcompletedArr[1] = onwarmupcompleted2;
            onwarmupcompletedArr[4] = onwarmupcompleted3;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onNavigationEvent + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 62 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallback + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }
}
