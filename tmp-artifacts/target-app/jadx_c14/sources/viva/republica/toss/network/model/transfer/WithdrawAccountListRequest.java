package viva.republica.toss.network.model.transfer;

import im.toss.features.benefit.ui.BenefitItemAdapter$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.accesssetValueMapcp;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.WithdrawAccountListRequest;
import viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$;
import viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$SelectedWithdrawalAccountModel$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WithdrawAccountListRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final accesssetValueMapcp context;
    private final DepositTarget depositTarget;
    private final boolean forceRefresh;
    private final SelectedWithdrawalAccountModel selectedWithdrawalAccount;
    private final String sessionKey;

    public WithdrawAccountListRequest() {
        this((SelectedWithdrawalAccountModel) null, (DepositTarget) null, false, (accesssetValueMapcp) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        KSerializer<DepositTarget> kSerializerSerializer;
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerSerializer = DepositTarget.Companion.serializer();
            int i3 = 53 / 0;
        } else {
            kSerializerSerializer = DepositTarget.Companion.serializer();
        }
        int i4 = onExtraCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerSerializer;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i8 | i6));
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i3 | i5));
        int i12 = i8 | i3;
        int i13 = (~(i6 | i3)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i3 + i5 + i + ((-1468046718) * i4) + (327422179 * i2);
        int i16 = i15 * i15;
        int i17 = (677926197 * i3) + 1810235392 + (1154460365 * i5) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i) + (1933049856 * i4) + (743702528 * i2) + (286654464 * i16);
        int i18 = (i3 * (-645773371)) + 280972133 + (i5 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i * (-645772719)) + (i4 * 1523302178) + (i2 * 1475409363) + (i16 * (-1007288320));
        return i17 + ((i18 * i18) * (-492175360)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        KSerializer kSerializer = (KSerializer) onExtraCallback(iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1968464597, iOnExtraCallbackWithResult3, -1968464597, new Object[0], iOnExtraCallbackWithResult);
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WithdrawAccountListRequest onNavigationEvent(WithdrawAccountListRequest withdrawAccountListRequest, SelectedWithdrawalAccountModel selectedWithdrawalAccountModel, DepositTarget depositTarget, boolean z, accesssetValueMapcp accesssetvaluemapcp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            selectedWithdrawalAccountModel = withdrawAccountListRequest.selectedWithdrawalAccount;
        }
        SelectedWithdrawalAccountModel selectedWithdrawalAccountModel2 = selectedWithdrawalAccountModel;
        if ((i & 2) != 0) {
            depositTarget = withdrawAccountListRequest.depositTarget;
        }
        DepositTarget depositTarget2 = depositTarget;
        if ((i & 4) != 0) {
            z = withdrawAccountListRequest.forceRefresh;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            int i3 = onWarmupCompleted + 23;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            if (i3 % 2 == 0) {
                accesssetValueMapcp accesssetvaluemapcp2 = withdrawAccountListRequest.context;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            accesssetvaluemapcp = withdrawAccountListRequest.context;
            int i5 = i4 + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        accesssetValueMapcp accesssetvaluemapcp3 = accesssetvaluemapcp;
        if ((i & 16) != 0) {
            str = withdrawAccountListRequest.sessionKey;
        }
        return withdrawAccountListRequest.onWarmupCompleted(selectedWithdrawalAccountModel2, depositTarget2, z2, accesssetvaluemapcp3, str);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.WithdrawContextType", accesssetValueMapcp.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.WithdrawContextType", accesssetValueMapcp.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof WithdrawAccountListRequest)) {
            return false;
        }
        WithdrawAccountListRequest withdrawAccountListRequest = (WithdrawAccountListRequest) obj;
        if (!Intrinsics.areEqual(this.selectedWithdrawalAccount, withdrawAccountListRequest.selectedWithdrawalAccount) || !Intrinsics.areEqual(this.depositTarget, withdrawAccountListRequest.depositTarget)) {
            return false;
        }
        if (this.forceRefresh == withdrawAccountListRequest.forceRefresh) {
            return this.context == withdrawAccountListRequest.context && Intrinsics.areEqual(this.sessionKey, withdrawAccountListRequest.sessionKey);
        }
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        SelectedWithdrawalAccountModel selectedWithdrawalAccountModel;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int iHashCode3 = 0;
        int iHashCode4 = (i2 % 2 != 0 ? (selectedWithdrawalAccountModel = this.selectedWithdrawalAccount) != null : (selectedWithdrawalAccountModel = this.selectedWithdrawalAccount) != null) ? selectedWithdrawalAccountModel.hashCode() : 0;
        DepositTarget depositTarget = this.depositTarget;
        if (depositTarget == null) {
            int i3 = onWarmupCompleted + 57;
            onExtraCallback = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = depositTarget.hashCode();
        }
        int iHashCode5 = Boolean.hashCode(this.forceRefresh);
        accesssetValueMapcp accesssetvaluemapcp = this.context;
        if (accesssetvaluemapcp == null) {
            int i4 = onExtraCallback + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = accesssetvaluemapcp.hashCode();
        }
        String str = this.sessionKey;
        if (str != null) {
            iHashCode3 = str.hashCode();
            int i6 = onWarmupCompleted + 27;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public final WithdrawAccountListRequest onWarmupCompleted(@Nullable SelectedWithdrawalAccountModel selectedWithdrawalAccountModel, @Nullable DepositTarget depositTarget, boolean z, @Nullable accesssetValueMapcp accesssetvaluemapcp, @Nullable String str) {
        int i = 2 % 2;
        WithdrawAccountListRequest withdrawAccountListRequest = new WithdrawAccountListRequest(selectedWithdrawalAccountModel, depositTarget, z, accesssetvaluemapcp, str);
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return withdrawAccountListRequest;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithdrawAccountListRequest(selectedWithdrawalAccount=" + this.selectedWithdrawalAccount + ", depositTarget=" + this.depositTarget + ", forceRefresh=" + this.forceRefresh + ", context=" + this.context + ", sessionKey=" + this.sessionKey + ")";
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WithdrawAccountListRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            WithdrawAccountListRequest$.serializer serializerVar = WithdrawAccountListRequest$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                KSerializer kSerializer = (KSerializer) WithdrawAccountListRequest.onExtraCallback(iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 872563708, iOnExtraCallbackWithResult3, -872563707, new Object[0], iOnExtraCallbackWithResult);
                int i4 = onNavigationEvent + 37;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = WithdrawAccountListRequest.onExtraCallback();
                int i4 = IAuthTabCallback + 121;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                throw null;
            }
        }), null};
        int i = onNavigationEvent + 61;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WithdrawAccountListRequest(int r2, viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.SelectedWithdrawalAccountModel r3, viva.republica.toss.network.model.transfer.DepositTarget r4, boolean r5, o.accesssetValueMapcp r6, java.lang.String r7, o.okycx r8) {
        /*
            r1 = this;
            r1.<init>()
            r8 = r2 & 1
            r0 = 0
            if (r8 != 0) goto Lb
            r1.selectedWithdrawalAccount = r0
            goto Ld
        Lb:
            r1.selectedWithdrawalAccount = r3
        Ld:
            r3 = r2 & 2
            r8 = 2
            if (r3 != 0) goto L20
            r1.depositTarget = r0
            int r3 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onExtraCallback
            int r3 = r3 + 55
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onWarmupCompleted = r4
            int r3 = r3 % r8
            if (r3 == 0) goto L22
            goto L24
        L20:
            r1.depositTarget = r4
        L22:
            int r3 = r8 % r8
        L24:
            r3 = r2 & 4
            r4 = 0
            if (r3 != 0) goto L2e
            r1.forceRefresh = r4
            int r3 = r8 % r8
            goto L30
        L2e:
            r1.forceRefresh = r5
        L30:
            r3 = r2 & 8
            if (r3 != 0) goto L42
            r1.context = r0
            int r3 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onExtraCallback
            int r3 = r3 + 23
            int r5 = r3 % 128
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onWarmupCompleted = r5
            int r3 = r3 % r8
            int r3 = r8 % r8
            goto L44
        L42:
            r1.context = r6
        L44:
            r2 = r2 & 16
            if (r2 != 0) goto L58
            r1.sessionKey = r0
            int r2 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onExtraCallback
            r3 = 21
            int r2 = r2 + r3
            int r5 = r2 % 128
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onWarmupCompleted = r5
            int r2 = r2 % r8
            if (r2 == 0) goto L57
            int r3 = r3 / r4
        L57:
            return
        L58:
            r1.sessionKey = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.<init>(int, viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$SelectedWithdrawalAccountModel, viva.republica.toss.network.model.transfer.DepositTarget, boolean, o.accesssetValueMapcp, java.lang.String, o.okycx):void");
    }

    public WithdrawAccountListRequest(@Nullable SelectedWithdrawalAccountModel selectedWithdrawalAccountModel, @Nullable DepositTarget depositTarget, boolean z, @Nullable accesssetValueMapcp accesssetvaluemapcp, @Nullable String str) {
        this.selectedWithdrawalAccount = selectedWithdrawalAccountModel;
        this.depositTarget = depositTarget;
        this.forceRefresh = z;
        this.context = accesssetvaluemapcp;
        this.sessionKey = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.WithdrawAccountListRequest r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onWarmupCompleted
            int r1 = r1 + 29
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onExtraCallback = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            if (r3 != 0) goto L19
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$SelectedWithdrawalAccountModel r3 = r6.selectedWithdrawalAccount
            if (r3 == 0) goto L29
        L19:
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$SelectedWithdrawalAccountModel$$serializer r3 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$SelectedWithdrawalAccountModel$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$SelectedWithdrawalAccountModel r4 = r6.selectedWithdrawalAccount
            r7.onExtraCallbackWithResult(r8, r2, r3, r4)
            int r3 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onExtraCallback
            int r3 = r3 + 19
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onWarmupCompleted = r4
            int r3 = r3 % r0
        L29:
            r3 = 1
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L34
            viva.republica.toss.network.model.transfer.DepositTarget r4 = r6.depositTarget
            if (r4 == 0) goto L41
        L34:
            r4 = r1[r3]
            java.lang.Object r4 = r4.getValue()
            o.py r4 = (o.py) r4
            viva.republica.toss.network.model.transfer.DepositTarget r5 = r6.depositTarget
            r7.onExtraCallbackWithResult(r8, r3, r4, r5)
        L41:
            boolean r4 = r7.onWarmupCompleted(r8, r0)
            if (r4 != 0) goto L5e
            int r4 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onExtraCallback
            int r4 = r4 + 113
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onWarmupCompleted = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L5a
            boolean r4 = r6.forceRefresh
            r5 = 25
            int r5 = r5 / r2
            if (r4 == 0) goto L63
            goto L5e
        L5a:
            boolean r4 = r6.forceRefresh
            if (r4 == 0) goto L63
        L5e:
            boolean r4 = r6.forceRefresh
            r7.onNavigationEvent(r8, r0, r4)
        L63:
            r4 = 3
            boolean r5 = r7.onWarmupCompleted(r8, r4)
            if (r5 != 0) goto L6e
            o.accesssetValueMapcp r5 = r6.context
            if (r5 == 0) goto L7b
        L6e:
            r1 = r1[r4]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.accesssetValueMapcp r5 = r6.context
            r7.onExtraCallbackWithResult(r8, r4, r1, r5)
        L7b:
            r1 = 4
            boolean r4 = r7.onWarmupCompleted(r8, r1)
            r4 = r4 ^ r3
            if (r4 == r3) goto L84
            goto L88
        L84:
            java.lang.String r3 = r6.sessionKey
            if (r3 == 0) goto L8f
        L88:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r6 = r6.sessionKey
            r7.onExtraCallbackWithResult(r8, r1, r3, r6)
        L8f:
            int r6 = viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onExtraCallback
            int r6 = r6 + 59
            int r7 = r6 % 128
            viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.onWarmupCompleted = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L9d
            r6 = 57
            int r6 = r6 / r2
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.IAuthTabCallback(viva.republica.toss.network.model.transfer.WithdrawAccountListRequest, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WithdrawAccountListRequest(SelectedWithdrawalAccountModel selectedWithdrawalAccountModel, DepositTarget depositTarget, boolean z, accesssetValueMapcp accesssetvaluemapcp, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        accesssetValueMapcp accesssetvaluemapcp2;
        String str2 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            selectedWithdrawalAccountModel = null;
        }
        DepositTarget depositTarget2 = (i & 2) != 0 ? null : depositTarget;
        if ((i & 4) != 0) {
            int i3 = onWarmupCompleted + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            int i5 = 2 % 2;
            accesssetvaluemapcp2 = null;
        } else {
            accesssetvaluemapcp2 = accesssetvaluemapcp;
        }
        if ((i & 16) != 0) {
            int i6 = onExtraCallback + 75;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str2 = str;
        }
        this(selectedWithdrawalAccountModel, depositTarget2, z2, accesssetvaluemapcp2, str2);
    }

    public final SelectedWithdrawalAccountModel onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SelectedWithdrawalAccountModel selectedWithdrawalAccountModel = this.selectedWithdrawalAccount;
        int i5 = i3 + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return selectedWithdrawalAccountModel;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.forceRefresh;
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @liq
    public static final class SelectedWithdrawalAccountModel {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String accountNo;
        private final int bankCode;
        private final onNavigationEvent invalidType;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.WithdrawAccountListRequest$SelectedWithdrawalAccountModel$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    WithdrawAccountListRequest.SelectedWithdrawalAccountModel.onExtraCallbackWithResult();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallbackWithResult = WithdrawAccountListRequest.SelectedWithdrawalAccountModel.onExtraCallbackWithResult();
                int i3 = IAuthTabCallback + 55;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        })};

        private static final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.WithdrawAccountListRequest.WithdrawAccountType", onNavigationEvent.values());
            int i4 = onExtraCallback + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedWithdrawalAccountModel)) {
                int i2 = onNavigationEvent + 41;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            SelectedWithdrawalAccountModel selectedWithdrawalAccountModel = (SelectedWithdrawalAccountModel) obj;
            if (this.bankCode != selectedWithdrawalAccountModel.bankCode || !Intrinsics.areEqual(this.accountNo, selectedWithdrawalAccountModel.accountNo)) {
                return false;
            }
            if (this.invalidType == selectedWithdrawalAccountModel.invalidType) {
                return true;
            }
            int i3 = onExtraCallback;
            int i4 = i3 + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 17;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Integer.hashCode(this.bankCode);
                this.accountNo.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode2 = Integer.hashCode(this.bankCode);
            int iHashCode3 = this.accountNo.hashCode();
            onNavigationEvent onnavigationevent = this.invalidType;
            if (onnavigationevent == null) {
                int i3 = onNavigationEvent + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = onnavigationevent.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SelectedWithdrawalAccountModel(bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ", invalidType=" + this.invalidType + ")";
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 92 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SelectedWithdrawalAccountModel> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                WithdrawAccountListRequest$SelectedWithdrawalAccountModel$.serializer serializerVar = WithdrawAccountListRequest$SelectedWithdrawalAccountModel$.serializer.INSTANCE;
                if (i3 == 0) {
                    return serializerVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = IAuthTabCallback + 73;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ SelectedWithdrawalAccountModel(int i, int i2, String str, onNavigationEvent onnavigationevent, okycx okycxVar) {
            if (7 != (i & 7)) {
                int i3 = onExtraCallback + 93;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                htf31.onExtraCallbackWithResult(i, 7, WithdrawAccountListRequest$SelectedWithdrawalAccountModel$.serializer.INSTANCE.getDescriptor());
                int i5 = onExtraCallback + 75;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
            this.bankCode = i2;
            this.accountNo = str;
            this.invalidType = onnavigationevent;
        }

        public SelectedWithdrawalAccountModel(int i, @NotNull String str, @Nullable onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bankCode = i;
            this.accountNo = str;
            this.invalidType = onnavigationevent;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 9;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(SelectedWithdrawalAccountModel selectedWithdrawalAccountModel, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, selectedWithdrawalAccountModel.bankCode);
            vylVar.onExtraCallback(serialDescriptor, 1, selectedWithdrawalAccountModel.accountNo);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), selectedWithdrawalAccountModel.invalidType);
            int i4 = onNavigationEvent + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 65;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.bankCode;
            int i6 = i2 + 35;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.accountNo;
            }
            throw null;
        }
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (KSerializer) onExtraCallback(iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 872563708, iOnExtraCallbackWithResult3, -872563707, new Object[0], iOnExtraCallbackWithResult);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (KSerializer) onExtraCallback(iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1968464597, iOnExtraCallbackWithResult3, -1968464597, new Object[0], iOnExtraCallbackWithResult);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent NOT_ENOUGH_BALANCE = new onNavigationEvent("NOT_ENOUGH_BALANCE", 0);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {NOT_ENOUGH_BALANCE};
            int i5 = i3 + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = IAuthTabCallback + 87;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }
}
