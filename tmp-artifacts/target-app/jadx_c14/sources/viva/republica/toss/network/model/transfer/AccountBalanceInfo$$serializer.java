package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class AccountBalanceInfo$$serializer implements aeu2<AccountBalanceInfo> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final AccountBalanceInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AccountBalanceInfo$$serializer accountBalanceInfo$$serializer = new AccountBalanceInfo$$serializer();
        INSTANCE = accountBalanceInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.AccountBalanceInfo", accountBalanceInfo$$serializer, 3);
        setanimationsloop.onWarmupCompleted("bankCode", false);
        setanimationsloop.onWarmupCompleted("accountNo", false);
        setanimationsloop.onWarmupCompleted("balanceDto", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 27;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AccountBalanceInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, getWriggleLayout.onNavigationEvent, TransferBalance$$serializer.INSTANCE};
        int i4 = onExtraCallback + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            m74deserialize(decoder);
            throw null;
        }
        AccountBalanceInfo accountBalanceInfoM74deserialize = m74deserialize(decoder);
        int i3 = IAuthTabCallback + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return accountBalanceInfoM74deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.AccountBalanceInfo m74deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r17) throws kotlinx.serialization.UnknownFieldException {
        /*
            r16 = this;
            r0 = r17
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.IAuthTabCallback
            int r2 = r2 + 75
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.onExtraCallback = r3
            int r2 = r2 % r1
            java.lang.String r3 = ""
            r4 = 0
            if (r2 != 0) goto L9f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r3 = r0.extraCallbackWithResult()
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L3b
            int r3 = r0.onTransact(r2, r5)
            java.lang.String r5 = r0.asInterface(r2, r6)
            viva.republica.toss.network.model.transfer.TransferBalance$$serializer r6 = viva.republica.toss.network.model.transfer.TransferBalance$$serializer.INSTANCE
            java.lang.Object r1 = r0.onNavigationEvent(r2, r1, r6, r4)
            viva.republica.toss.network.model.transfer.TransferBalance r1 = (viva.republica.toss.network.model.transfer.TransferBalance) r1
            r4 = 7
            r14 = r1
            r12 = r3
            r11 = r4
            r13 = r5
            goto L94
        L3b:
            r7 = r4
            r3 = r5
            r8 = r3
            r9 = r6
        L3f:
            if (r9 == 0) goto L90
            int r10 = r0.onNavigationEvent(r2)
            r11 = -1
            if (r10 == r11) goto L8e
            if (r10 == 0) goto L87
            int r11 = viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.IAuthTabCallback
            int r11 = r11 + 11
            int r12 = r11 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.onExtraCallback = r12
            int r11 = r11 % r1
            if (r11 == 0) goto L58
            if (r10 == 0) goto L80
            goto L5a
        L58:
            if (r10 == r6) goto L80
        L5a:
            int r11 = r12 + 75
            int r13 = r11 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.IAuthTabCallback = r13
            int r11 = r11 % r1
            if (r11 != 0) goto L66
            if (r10 != r1) goto L7a
            goto L68
        L66:
            if (r10 != r1) goto L7a
        L68:
            int r12 = r12 + 45
            int r10 = r12 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.IAuthTabCallback = r10
            int r12 = r12 % r1
            viva.republica.toss.network.model.transfer.TransferBalance$$serializer r10 = viva.republica.toss.network.model.transfer.TransferBalance$$serializer.INSTANCE
            java.lang.Object r4 = r0.onNavigationEvent(r2, r1, r10, r4)
            viva.republica.toss.network.model.transfer.TransferBalance r4 = (viva.republica.toss.network.model.transfer.TransferBalance) r4
            r8 = r8 | 4
            goto L3f
        L7a:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r10)
            throw r0
        L80:
            java.lang.String r7 = r0.asInterface(r2, r6)
            r8 = r8 | 2
            goto L3f
        L87:
            int r3 = r0.onTransact(r2, r5)
            r8 = r8 | 1
            goto L3f
        L8e:
            r9 = r5
            goto L3f
        L90:
            r12 = r3
            r14 = r4
            r13 = r7
            r11 = r8
        L94:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.transfer.AccountBalanceInfo r0 = new viva.republica.toss.network.model.transfer.AccountBalanceInfo
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L9f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r1)
            r0.extraCallbackWithResult()
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.AccountBalanceInfo$$serializer.m74deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.AccountBalanceInfo");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AccountBalanceInfo) obj);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = onExtraCallback + 45;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AccountBalanceInfo accountBalanceInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(accountBalanceInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AccountBalanceInfo.onExtraCallback(accountBalanceInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(accountBalanceInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AccountBalanceInfo.onExtraCallback(accountBalanceInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
