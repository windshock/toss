package viva.republica.toss.network.model.verify.guest;

import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.verify.login.model.network.AuthPolicy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.AndroidUnicodeUtils;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.SignReadyResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignReadyResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final AuthPolicy authPolicy;
    private final nativeReadByte currentPasswordFormat;
    private final boolean enableTossplore;
    private final int passwordFailCount;
    private final int passwordFailCountLimit;
    private final String pauseRequesterName;
    private final String salt;
    private final String userName;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i4 | i3 | i2);
        int i8 = ~i3;
        int i9 = (~(i8 | i2)) | (~((~i2) | i4));
        int i10 = (~(i2 | (~i4))) | i8;
        int i11 = i4 + i3 + i + ((-2044576983) * i5) + (1743660113 * i6);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i4) - 713031680) + (164951516 * i3) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i) + (689963008 * i5) + ((-299892736) * i6) + ((-1081737216) * i12);
        int i14 = ((i4 * 2048727874) - 782056376) + (i3 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i * 2048728315) + (i5 * 2142076211) + (i6 * (-1448904853)) + (i12 * 1885470720);
        return i13 + ((i14 * i14) * (-1618345984)) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i4 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        KSerializer kSerializer = (KSerializer) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 777029402, -777029402, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[0], BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        int i4 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return kSerializer;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.verify.login.model.network.AuthPolicy", AuthPolicy.values());
            int i3 = 25 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.verify.login.model.network.AuthPolicy", AuthPolicy.values());
        }
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact();
        }
        onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SignReadyResponse)) {
            return false;
        }
        SignReadyResponse signReadyResponse = (SignReadyResponse) obj;
        if (this.authPolicy != signReadyResponse.authPolicy) {
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.userName, signReadyResponse.userName) || this.currentPasswordFormat != signReadyResponse.currentPasswordFormat || (!Intrinsics.areEqual(this.salt, signReadyResponse.salt)) || this.passwordFailCount != signReadyResponse.passwordFailCount || this.passwordFailCountLimit != signReadyResponse.passwordFailCountLimit) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.pauseRequesterName, signReadyResponse.pauseRequesterName))) {
            return this.enableTossplore == signReadyResponse.enableTossplore;
        }
        int i6 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.authPolicy.hashCode();
        int iHashCode3 = this.userName.hashCode();
        int iHashCode4 = this.currentPasswordFormat.hashCode();
        int iHashCode5 = this.salt.hashCode();
        int iHashCode6 = Integer.hashCode(this.passwordFailCount);
        int iHashCode7 = Integer.hashCode(this.passwordFailCountLimit);
        String str = this.pauseRequesterName;
        if (str == null) {
            int i4 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + Boolean.hashCode(this.enableTossplore);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SignReadyResponse(authPolicy=" + this.authPolicy + ", userName=" + this.userName + ", currentPasswordFormat=" + this.currentPasswordFormat + ", salt=" + this.salt + ", passwordFailCount=" + this.passwordFailCount + ", passwordFailCountLimit=" + this.passwordFailCountLimit + ", pauseRequesterName=" + this.pauseRequesterName + ", enableTossplore=" + this.enableTossplore + ")";
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignReadyResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SignReadyResponse$.serializer serializerVar = SignReadyResponse$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.SignReadyResponse$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = SignReadyResponse.onWarmupCompleted();
                int i4 = onExtraCallback + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnWarmupCompleted;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.SignReadyResponse$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = SignReadyResponse.onNavigationEvent();
                int i4 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnNavigationEvent;
                }
                throw null;
            }
        }), null, null, null, null, null};
        int i = onExtraCallback + 15;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SignReadyResponse(int i, AuthPolicy authPolicy, String str, nativeReadByte nativereadbyte, String str2, int i2, int i3, String str3, boolean z, okycx okycxVar) {
        if (11 != (i & 11)) {
            int i4 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            htf31.onExtraCallbackWithResult(i, 11, SignReadyResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.authPolicy = authPolicy;
        this.userName = str;
        if ((i & 4) == 0) {
            this.currentPasswordFormat = AndroidUnicodeUtils.onExtraCallbackWithResult().onExtraCallbackWithResult();
        } else {
            this.currentPasswordFormat = nativereadbyte;
        }
        this.salt = str2;
        if ((i & 16) == 0) {
            int i6 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                this.passwordFailCount = 1;
            } else {
                this.passwordFailCount = 0;
            }
        } else {
            this.passwordFailCount = i2;
        }
        if ((i & 32) == 0) {
            int i7 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            this.passwordFailCountLimit = 5;
        } else {
            this.passwordFailCountLimit = i3;
            int i9 = 2 % 2;
        }
        Object obj = null;
        if ((i & 64) == 0) {
            int i10 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            this.pauseRequesterName = null;
            if (i11 != 0) {
                int i12 = 57 / 0;
            }
        } else {
            this.pauseRequesterName = str3;
            int i13 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 % 4;
            } else {
                int i15 = 2 % 2;
            }
        }
        if ((i & 128) != 0) {
            this.enableTossplore = z;
            return;
        }
        this.enableTossplore = false;
        int i16 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.verify.guest.SignReadyResponse r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.verify.guest.SignReadyResponse.$childSerializers
            r2 = 0
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            im.toss.features.verify.login.model.network.AuthPolicy r4 = r7.authPolicy
            r8.onNavigationEvent(r9, r2, r3, r4)
            java.lang.String r3 = r7.userName
            r4 = 1
            r8.onExtraCallback(r9, r4, r3)
            boolean r3 = r8.onWarmupCompleted(r9, r0)
            r5 = 0
            if (r3 != 0) goto L45
            int r3 = viva.republica.toss.network.model.verify.guest.SignReadyResponse.onWarmupCompleted
            int r3 = r3 + 91
            int r6 = r3 % 128
            viva.republica.toss.network.model.verify.guest.SignReadyResponse.onExtraCallbackWithResult = r6
            int r3 = r3 % r0
            if (r3 == 0) goto L38
            o.nativeReadByte r3 = r7.currentPasswordFormat
            o.nativeFree r6 = o.AndroidUnicodeUtils.onExtraCallbackWithResult()
            o.nativeReadByte r6 = r6.onExtraCallbackWithResult()
            if (r3 == r6) goto L5b
            goto L45
        L38:
            o.nativeReadByte r7 = r7.currentPasswordFormat
            o.nativeFree r7 = o.AndroidUnicodeUtils.onExtraCallbackWithResult()
            r7.onExtraCallbackWithResult()
            r5.hashCode()
            throw r5
        L45:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.nativeReadByte r3 = r7.currentPasswordFormat
            r8.onNavigationEvent(r9, r0, r1, r3)
            int r1 = viva.republica.toss.network.model.verify.guest.SignReadyResponse.onWarmupCompleted
            int r1 = r1 + 33
            int r3 = r1 % 128
            viva.republica.toss.network.model.verify.guest.SignReadyResponse.onExtraCallbackWithResult = r3
            int r1 = r1 % r0
        L5b:
            r1 = 3
            java.lang.String r3 = r7.salt
            r8.onExtraCallback(r9, r1, r3)
            r1 = 4
            boolean r3 = r8.onWarmupCompleted(r9, r1)
            if (r3 != 0) goto L7b
            int r3 = viva.republica.toss.network.model.verify.guest.SignReadyResponse.onExtraCallbackWithResult
            int r3 = r3 + 35
            int r6 = r3 % 128
            viva.republica.toss.network.model.verify.guest.SignReadyResponse.onWarmupCompleted = r6
            int r3 = r3 % r0
            if (r3 != 0) goto L78
            int r3 = r7.passwordFailCount
            if (r3 == 0) goto L80
            goto L7b
        L78:
            int r7 = r7.passwordFailCount
            throw r5
        L7b:
            int r3 = r7.passwordFailCount
            r8.onExtraCallback(r9, r1, r3)
        L80:
            r1 = 5
            boolean r3 = r8.onWarmupCompleted(r9, r1)
            if (r3 != 0) goto L8b
            int r3 = r7.passwordFailCountLimit
            if (r3 == r1) goto L90
        L8b:
            int r3 = r7.passwordFailCountLimit
            r8.onExtraCallback(r9, r1, r3)
        L90:
            r1 = 6
            boolean r3 = r8.onWarmupCompleted(r9, r1)
            if (r3 != 0) goto Lae
            int r3 = viva.republica.toss.network.model.verify.guest.SignReadyResponse.onWarmupCompleted
            int r3 = r3 + 109
            int r5 = r3 % 128
            viva.republica.toss.network.model.verify.guest.SignReadyResponse.onExtraCallbackWithResult = r5
            int r3 = r3 % r0
            if (r3 != 0) goto Laa
            java.lang.String r0 = r7.pauseRequesterName
            r3 = 38
            int r3 = r3 / r2
            if (r0 == 0) goto Lb5
            goto Lae
        Laa:
            java.lang.String r0 = r7.pauseRequesterName
            if (r0 == 0) goto Lb5
        Lae:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r2 = r7.pauseRequesterName
            r8.onExtraCallbackWithResult(r9, r1, r0, r2)
        Lb5:
            r0 = 7
            boolean r1 = r8.onWarmupCompleted(r9, r0)
            if (r1 != 0) goto Lc1
            boolean r1 = r7.enableTossplore
            if (r1 == r4) goto Lc1
            goto Lc6
        Lc1:
            boolean r7 = r7.enableTossplore
            r8.onNavigationEvent(r9, r0, r7)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.guest.SignReadyResponse.onExtraCallbackWithResult(viva.republica.toss.network.model.verify.guest.SignReadyResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SignReadyResponse signReadyResponse = (SignReadyResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        AuthPolicy authPolicy = signReadyResponse.authPolicy;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return authPolicy;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.userName;
        int i4 = i2 + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final nativeReadByte onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nativeReadByte nativereadbyte = this.currentPasswordFormat;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return nativereadbyte;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.salt;
        int i5 = i2 + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = this.passwordFailCount;
        int i6 = i3 + 105;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (KSerializer) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 777029402, -777029402, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[0], BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }

    public final AuthPolicy onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (AuthPolicy) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1596647955, 1596647956, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }
}
