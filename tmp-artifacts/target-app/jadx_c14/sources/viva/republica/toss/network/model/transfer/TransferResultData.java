package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.htf31;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferResultData;
import viva.republica.toss.network.model.transfer.TransferResultData$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferResultData {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String id;
    private final Status status;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultData$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                TransferResultData.IAuthTabCallback();
                throw null;
            }
            KSerializer kSerializerIAuthTabCallback = TransferResultData.IAuthTabCallback();
            int i3 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerIAuthTabCallback;
        }
    })};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asInterface();
            throw null;
        }
        KSerializer kSerializerAsInterface = asInterface();
        int i3 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<Status> kSerializerSerializer = Status.Companion.serializer();
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 43;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 49;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof TransferResultData)) {
            return false;
        }
        TransferResultData transferResultData = (TransferResultData) obj;
        if (!Intrinsics.areEqual(this.id, transferResultData.id) || this.status != transferResultData.status) {
            return false;
        }
        int i8 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.id;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode;
        }
        return (i * 31) + this.status.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferResultData(id=" + this.id + ", status=" + this.status + ")";
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferResultData> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferResultData$.serializer serializerVar = TransferResultData$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 77;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ TransferResultData(int i, String str, Status status, okycx okycxVar) {
        if (2 != (i & 2)) {
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 2, TransferResultData$.serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } else {
            this.id = str;
        }
        this.status = status;
        int i6 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 46 / 0;
        }
    }

    public TransferResultData(@Nullable String str, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "");
        this.id = str;
        this.status = status;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[PHI: r1
      0x002d: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:10:0x002b, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultData r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.TransferResultData.onExtraCallbackWithResult
            int r1 = r1 + 17
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferResultData.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.TransferResultData.$childSerializers
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L2d
            goto L20
        L18:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.TransferResultData.$childSerializers
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L2d
        L20:
            int r3 = viva.republica.toss.network.model.transfer.TransferResultData.IAuthTabCallback
            int r3 = r3 + 123
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.TransferResultData.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            java.lang.String r0 = r5.id
            if (r0 == 0) goto L34
        L2d:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.id
            r6.onExtraCallbackWithResult(r7, r2, r0, r3)
        L34:
            r0 = 1
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.transfer.TransferResultData$Status r5 = r5.status
            r6.onNavigationEvent(r7, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultData.onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultData, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final Status onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Status status = this.status;
        int i5 = i2 + 103;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class Status {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final Status FAILED;
        private static char IAuthTabCallback = 0;
        public static final Status PENDING;
        public static final Status SUCCESS;
        public static final Status UNKNOWN;
        private static int asInterface = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static char[] onWarmupCompleted;

        public static /* synthetic */ KSerializer $r8$lambda$9WqiCjqAfqy_kvO7BC3v_B3woFs() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ Status[] $values() {
            Status[] statusArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 41;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Status status = SUCCESS;
                Status status2 = FAILED;
                Status status3 = PENDING;
                Status status4 = UNKNOWN;
                statusArr = new Status[2];
                statusArr[1] = status;
                statusArr[1] = status2;
                statusArr[2] = status3;
                statusArr[4] = status4;
            } else {
                statusArr = new Status[]{SUCCESS, FAILED, PENDING, UNKNOWN};
            }
            int i4 = i2 + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return statusArr;
            }
            throw null;
        }

        public static EnumEntries<Status> getEntries() {
            EnumEntries<Status> enumEntries;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 55 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static Status valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Status status = (Status) Enum.valueOf(Status.class, str);
            int i4 = onExtraCallback + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return status;
        }

        public static Status[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Status[] statusArr = $VALUES;
            if (i3 == 0) {
                return (Status[]) statusArr.clone();
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) Status.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = onNavigationEvent + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }

            public final KSerializer<Status> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<Status> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i4 = IAuthTabCallback + 75;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }

        private Status(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultData.Status", values());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultData.Status", values());
            int i3 = onNavigationEvent + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return $cachedSerializer$delegate;
            }
            throw null;
        }

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a(new char[]{3, 1, 13874, 13874, 3, 5, 13858}, (byte) (Color.rgb(0, 0, 0) + 16777305), View.MeasureSpec.getMode(0) + 7, objArr);
            SUCCESS = new Status(((String) objArr[0]).intern(), 0);
            FAILED = new Status("FAILED", 1);
            PENDING = new Status("PENDING", 2);
            Object[] objArr2 = new Object[1];
            a(new char[]{1, 0, 2, 0, 7, '\b', 13829}, (byte) (48 - Process.getGidForName("")), 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            UNKNOWN = new Status(((String) objArr2[0]).intern(), 3);
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(statusArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultData$Status$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 107;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        TransferResultData.Status.$r8$lambda$9WqiCjqAfqy_kvO7BC3v_B3woFs();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializer$r8$lambda$9WqiCjqAfqy_kvO7BC3v_B3woFs = TransferResultData.Status.$r8$lambda$9WqiCjqAfqy_kvO7BC3v_B3woFs();
                    int i3 = onExtraCallback + 125;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializer$r8$lambda$9WqiCjqAfqy_kvO7BC3v_B3woFs;
                }
            });
            int i = onExtraCallbackWithResult + 3;
            asInterface = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(char[] r34, byte r35, int r36, java.lang.Object[] r37) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 794
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultData.Status.a(char[], byte, int, java.lang.Object[]):void");
        }

        static void onNavigationEvent() {
            onWarmupCompleted = new char[]{64998, 65016, 65021, 65008, 64992, 65014, 65020, 64996, 65017};
            IAuthTabCallback = (char) 51242;
        }
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.status != Status.SUCCESS) {
            return false;
        }
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }
}
