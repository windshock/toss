package viva.republica.toss.network.model.verify.guest;

import im.toss.features.applock.model.AppProfile;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.init.v2.CheckoutResult;
import viva.republica.toss.network.model.verify.guest.SignInResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignInResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final AppProfile appProfile;
    private final CheckoutResult checkoutResult;
    private final nativeReadByte currentPasswordFormat;
    private final String internalCert;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.SignInResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            KSerializer kSerializerOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerOnNavigationEvent = SignInResponse.onNavigationEvent();
                int i3 = 37 / 0;
            } else {
                kSerializerOnNavigationEvent = SignInResponse.onNavigationEvent();
            }
            int i4 = onNavigationEvent + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    }), null, null};

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface();
        }
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInResponse)) {
            int i5 = i3 + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 34 / 0;
            }
            return false;
        }
        SignInResponse signInResponse = (SignInResponse) obj;
        if (Intrinsics.areEqual(this.internalCert, signInResponse.internalCert)) {
            if (this.currentPasswordFormat == signInResponse.currentPasswordFormat) {
                return Intrinsics.areEqual(this.appProfile, signInResponse.appProfile) && Intrinsics.areEqual(this.checkoutResult, signInResponse.checkoutResult);
            }
            int i7 = onExtraCallback + 27;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = onWarmupCompleted;
        int i10 = i9 + 35;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 31;
        onExtraCallback = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            this.internalCert.hashCode();
            this.currentPasswordFormat.hashCode();
            throw null;
        }
        int iHashCode2 = this.internalCert.hashCode();
        int iHashCode3 = this.currentPasswordFormat.hashCode();
        AppProfile appProfile = this.appProfile;
        if (appProfile == null) {
            int i3 = onWarmupCompleted + 17;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = appProfile.hashCode();
        }
        int iHashCode4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.checkoutResult.hashCode();
        int i5 = onExtraCallback + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SignInResponse(internalCert=" + this.internalCert + ", currentPasswordFormat=" + this.currentPasswordFormat + ", appProfile=" + this.appProfile + ", checkoutResult=" + this.checkoutResult + ")";
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignInResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                SignInResponse$.serializer serializerVar = SignInResponse$.serializer.INSTANCE;
                throw null;
            }
            SignInResponse$.serializer serializerVar2 = SignInResponse$.serializer.INSTANCE;
            int i3 = onNavigationEvent + 113;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return serializerVar2;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
    }

    public /* synthetic */ SignInResponse(int i, String str, nativeReadByte nativereadbyte, AppProfile appProfile, CheckoutResult checkoutResult, okycx okycxVar) {
        if (11 != (i & 11)) {
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 11, SignInResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.internalCert = str;
        this.currentPasswordFormat = nativereadbyte;
        if ((i & 4) == 0) {
            this.appProfile = null;
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
            this.checkoutResult = checkoutResult;
            int i6 = onWarmupCompleted + 103;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        this.appProfile = appProfile;
        int i8 = 2 % 2;
        this.checkoutResult = checkoutResult;
        int i62 = onWarmupCompleted + 103;
        onExtraCallback = i62 % 128;
        int i72 = i62 % 2;
    }

    public SignInResponse(@NotNull String str, @NotNull nativeReadByte nativereadbyte, @Nullable AppProfile appProfile, @NotNull CheckoutResult checkoutResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        Intrinsics.checkNotNullParameter(checkoutResult, "");
        this.internalCert = str;
        this.currentPasswordFormat = nativereadbyte;
        this.appProfile = appProfile;
        this.checkoutResult = checkoutResult;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 22 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 53;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.verify.guest.SignInResponse r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.verify.guest.SignInResponse.$childSerializers
            java.lang.String r2 = r4.internalCert
            r3 = 0
            r5.onExtraCallback(r6, r3, r2)
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.nativeReadByte r3 = r4.currentPasswordFormat
            r5.onNavigationEvent(r6, r2, r1, r3)
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            r1 = r1 ^ r2
            if (r1 == 0) goto L2d
            int r1 = viva.republica.toss.network.model.verify.guest.SignInResponse.onExtraCallback
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.guest.SignInResponse.onWarmupCompleted = r2
            int r1 = r1 % r0
            im.toss.features.applock.model.AppProfile r1 = r4.appProfile
            if (r1 == 0) goto L3d
        L2d:
            im.toss.features.applock.model.AppProfile$$serializer r1 = im.toss.features.applock.model.AppProfile$.serializer.INSTANCE
            im.toss.features.applock.model.AppProfile r2 = r4.appProfile
            r5.onExtraCallbackWithResult(r6, r0, r1, r2)
            int r1 = viva.republica.toss.network.model.verify.guest.SignInResponse.onExtraCallback
            int r1 = r1 + 111
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.guest.SignInResponse.onWarmupCompleted = r2
            int r1 = r1 % r0
        L3d:
            viva.republica.toss.network.model.init.v2.CheckoutResult$$serializer r0 = viva.republica.toss.network.model.init.v2.CheckoutResult$.serializer.INSTANCE
            viva.republica.toss.network.model.init.v2.CheckoutResult r4 = r4.checkoutResult
            r1 = 3
            r5.onNavigationEvent(r6, r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.guest.SignInResponse.onNavigationEvent(viva.republica.toss.network.model.verify.guest.SignInResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.internalCert;
        }
        throw null;
    }

    public final nativeReadByte onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        nativeReadByte nativereadbyte = this.currentPasswordFormat;
        int i5 = i3 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return nativereadbyte;
    }

    public final AppProfile onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        AppProfile appProfile = this.appProfile;
        int i5 = i3 + 111;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return appProfile;
    }

    public final CheckoutResult IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        CheckoutResult checkoutResult = this.checkoutResult;
        int i5 = i3 + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return checkoutResult;
    }
}
