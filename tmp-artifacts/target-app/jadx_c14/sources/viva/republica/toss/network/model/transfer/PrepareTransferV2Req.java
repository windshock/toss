package viva.republica.toss.network.model.transfer;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import o.ReactIgnorableMountingException;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTarget;
import viva.republica.toss.network.model.transfer.PrepareTransferV2Req$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PrepareTransferV2Req {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private long amount;
    private String depositAccountHolderName;
    private DepositTarget depositTarget;
    private String reserveKey;
    private String sessionKey;
    private TransferAccountDto withdrawAccount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.PrepareTransferV2Req$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            KSerializer kSerializerIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerIAuthTabCallback = PrepareTransferV2Req.IAuthTabCallback();
                int i3 = 28 / 0;
            } else {
                kSerializerIAuthTabCallback = PrepareTransferV2Req.IAuthTabCallback();
            }
            int i4 = onWarmupCompleted + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    }), null, null, null};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<DepositTarget> kSerializerSerializer = DepositTarget.Companion.serializer();
        int i4 = onExtraCallback + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return kSerializerSerializer;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~i;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i2 + i5 + i6 + ((-112346298) * i4) + (505796074 * i3);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i2) - 1525940224) + (1734765094 * i5) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i6) + (859308032 * i4) + (310902784 * i3) + (417529856 * i13);
        int i15 = (i2 * (-1233303660)) + 1670658458 + (i5 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i6 * (-1233302909)) + (i4 * 1075253458) + (i3 * 745806526) + (i13 * 1512636416);
        return i14 + ((i15 * i15) * (-1737162752)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public PrepareTransferV2Req() {
    }

    public /* synthetic */ PrepareTransferV2Req(int i, long j, TransferAccountDto transferAccountDto, DepositTarget depositTarget, String str, String str2, String str3, okycx okycxVar) {
        this.amount = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.withdrawAccount = null;
        } else {
            this.withdrawAccount = transferAccountDto;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.depositTarget = null;
        } else {
            this.depositTarget = depositTarget;
        }
        if ((i & 8) == 0) {
            this.depositAccountHolderName = null;
        } else {
            this.depositAccountHolderName = str;
        }
        if ((i & 16) == 0) {
            int i5 = IAuthTabCallback + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.sessionKey = null;
        } else {
            this.sessionKey = str2;
            int i7 = 2 % 2;
        }
        if ((i & 32) == 0) {
            int i8 = onExtraCallback + 93;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            this.reserveKey = null;
            return;
        }
        this.reserveKey = str3;
        int i10 = onExtraCallback + 33;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallback(PrepareTransferV2Req prepareTransferV2Req, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        prepareTransferV2Req.amount = j;
        int i5 = i2 + 103;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PrepareTransferV2Req prepareTransferV2Req, DepositTarget depositTarget) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        prepareTransferV2Req.depositTarget = depositTarget;
        int i5 = i2 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 95;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r1
      0x0029: PHI (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:10:0x0027, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.PrepareTransferV2Req r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.PrepareTransferV2Req.onExtraCallback
            int r1 = r1 + 43
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.PrepareTransferV2Req.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 5
            if (r1 == 0) goto L19
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.PrepareTransferV2Req.$childSerializers
            boolean r4 = r9.onWarmupCompleted(r10, r2)
            if (r4 != 0) goto L29
            goto L21
        L19:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.PrepareTransferV2Req.$childSerializers
            boolean r4 = r9.onWarmupCompleted(r10, r2)
            if (r4 != 0) goto L29
        L21:
            long r4 = r8.amount
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L36
        L29:
            long r4 = r8.amount
            r9.onExtraCallback(r10, r2, r4)
            int r2 = viva.republica.toss.network.model.transfer.PrepareTransferV2Req.IAuthTabCallback
            int r2 = r2 + r3
            int r4 = r2 % 128
            viva.republica.toss.network.model.transfer.PrepareTransferV2Req.onExtraCallback = r4
            int r2 = r2 % r0
        L36:
            r2 = 1
            boolean r4 = r9.onWarmupCompleted(r10, r2)
            if (r4 != 0) goto L49
            int r4 = viva.republica.toss.network.model.transfer.PrepareTransferV2Req.IAuthTabCallback
            int r4 = r4 + r3
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.PrepareTransferV2Req.onExtraCallback = r5
            int r4 = r4 % r0
            viva.republica.toss.network.model.transfer.TransferAccountDto r4 = r8.withdrawAccount
            if (r4 == 0) goto L59
        L49:
            viva.republica.toss.network.model.transfer.TransferAccountDto$$serializer r4 = viva.republica.toss.network.model.transfer.TransferAccountDto$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.TransferAccountDto r5 = r8.withdrawAccount
            r9.onExtraCallbackWithResult(r10, r2, r4, r5)
            int r2 = viva.republica.toss.network.model.transfer.PrepareTransferV2Req.IAuthTabCallback
            int r2 = r2 + 103
            int r4 = r2 % 128
            viva.republica.toss.network.model.transfer.PrepareTransferV2Req.onExtraCallback = r4
            int r2 = r2 % r0
        L59:
            boolean r2 = r9.onWarmupCompleted(r10, r0)
            if (r2 != 0) goto L63
            viva.republica.toss.network.model.transfer.DepositTarget r2 = r8.depositTarget
            if (r2 == 0) goto L70
        L63:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.transfer.DepositTarget r2 = r8.depositTarget
            r9.onExtraCallbackWithResult(r10, r0, r1, r2)
        L70:
            r1 = 3
            boolean r2 = r9.onWarmupCompleted(r10, r1)
            if (r2 != 0) goto L7b
            java.lang.String r2 = r8.depositAccountHolderName
            if (r2 == 0) goto L82
        L7b:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r8.depositAccountHolderName
            r9.onExtraCallbackWithResult(r10, r1, r2, r4)
        L82:
            r1 = 4
            boolean r2 = r9.onWarmupCompleted(r10, r1)
            if (r2 != 0) goto L8d
            java.lang.String r2 = r8.sessionKey
            if (r2 == 0) goto L94
        L8d:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r8.sessionKey
            r9.onExtraCallbackWithResult(r10, r1, r2, r4)
        L94:
            boolean r1 = r9.onWarmupCompleted(r10, r3)
            if (r1 != 0) goto Lb1
            int r1 = viva.republica.toss.network.model.transfer.PrepareTransferV2Req.IAuthTabCallback
            int r1 = r1 + 89
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.PrepareTransferV2Req.onExtraCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Laa
            java.lang.String r0 = r8.reserveKey
            if (r0 == 0) goto Lb8
            goto Lb1
        Laa:
            java.lang.String r8 = r8.reserveKey
            r8 = 0
            r8.hashCode()
            throw r8
        Lb1:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r8 = r8.reserveKey
            r9.onExtraCallbackWithResult(r10, r3, r0, r8)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PrepareTransferV2Req.onNavigationEvent(viva.republica.toss.network.model.transfer.PrepareTransferV2Req, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PrepareTransferV2Req prepareTransferV2Req = (PrepareTransferV2Req) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        prepareTransferV2Req.depositAccountHolderName = str;
        int i5 = i2 + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return null;
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.sessionKey = str;
        int i5 = i2 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PrepareTransferV2Req prepareTransferV2Req = (PrepareTransferV2Req) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        prepareTransferV2Req.reserveKey = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void onWarmupCompleted(@NotNull ReactIgnorableMountingException reactIgnorableMountingException) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactIgnorableMountingException, "");
        this.withdrawAccount = reactIgnorableMountingException.readTypedObject();
        int i4 = IAuthTabCallback + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PrepareTransferV2Req> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            PrepareTransferV2Req$.serializer serializerVar = PrepareTransferV2Req$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }

        public final PrepareTransferV2Req onWarmupCompleted(@NotNull String str, @NotNull String str2, @Nullable String str3, long j, @Nullable String str4) {
            int iIntValue;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            PrepareTransferV2Req prepareTransferV2Req = new PrepareTransferV2Req();
            Integer intOrNull = StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
                int i2 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            } else {
                iIntValue = 0;
            }
            PrepareTransferV2Req.onExtraCallbackWithResult(prepareTransferV2Req, new DepositTarget.Account(iIntValue, str, str4));
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            PrepareTransferV2Req.onWarmupCompleted(iOnExtraCallback, 1971394529, PushInfo.Companion.onExtraCallback(), iOnExtraCallback3, -1971394529, new Object[]{prepareTransferV2Req, str3}, iOnExtraCallback2);
            PrepareTransferV2Req.onExtraCallback(prepareTransferV2Req, j);
            int i4 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return prepareTransferV2Req;
        }

        public final PrepareTransferV2Req onWarmupCompleted(@NotNull String str, long j, @Nullable String str2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            PrepareTransferV2Req prepareTransferV2Req = new PrepareTransferV2Req();
            PrepareTransferV2Req.onExtraCallbackWithResult(prepareTransferV2Req, new DepositTarget.Phone(str, str2));
            PrepareTransferV2Req.onExtraCallback(prepareTransferV2Req, j);
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return prepareTransferV2Req;
        }

        public final PrepareTransferV2Req onExtraCallbackWithResult(@NotNull String str, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            PrepareTransferV2Req prepareTransferV2Req = new PrepareTransferV2Req();
            PrepareTransferV2Req.onExtraCallbackWithResult(prepareTransferV2Req, new DepositTarget.Reserve(str));
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            PrepareTransferV2Req.onWarmupCompleted(iOnExtraCallback, 1994847357, PushInfo.Companion.onExtraCallback(), iOnExtraCallback3, -1994847356, new Object[]{prepareTransferV2Req, str}, iOnExtraCallback2);
            PrepareTransferV2Req.onExtraCallback(prepareTransferV2Req, j);
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return prepareTransferV2Req;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final PrepareTransferV2Req onWarmupCompleted(long j, boolean z, long j2, @Nullable String str) {
            int i = 2 % 2;
            PrepareTransferV2Req prepareTransferV2Req = new PrepareTransferV2Req();
            PrepareTransferV2Req.onExtraCallbackWithResult(prepareTransferV2Req, new DepositTarget.User(j, z, str));
            PrepareTransferV2Req.onExtraCallback(prepareTransferV2Req, j2);
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return prepareTransferV2Req;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final PrepareTransferV2Req IAuthTabCallback(@NotNull String str, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            PrepareTransferV2Req prepareTransferV2Req = new PrepareTransferV2Req();
            PrepareTransferV2Req.onExtraCallbackWithResult(prepareTransferV2Req, new DepositTarget.Share(str, (String) null, 2, (DefaultConstructorMarker) null));
            PrepareTransferV2Req.onExtraCallback(prepareTransferV2Req, j);
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 64 / 0;
            }
            return prepareTransferV2Req;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void onExtraCallback(PrepareTransferV2Req prepareTransferV2Req, String str) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        onWarmupCompleted(iOnExtraCallback, 1971394529, PushInfo.Companion.onExtraCallback(), iOnExtraCallback3, -1971394529, new Object[]{prepareTransferV2Req, str}, iOnExtraCallback2);
    }

    public final void onNavigationEvent(@Nullable String str) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        onWarmupCompleted(iOnExtraCallback, 1994847357, PushInfo.Companion.onExtraCallback(), iOnExtraCallback3, -1994847356, new Object[]{this, str}, iOnExtraCallback2);
    }
}
