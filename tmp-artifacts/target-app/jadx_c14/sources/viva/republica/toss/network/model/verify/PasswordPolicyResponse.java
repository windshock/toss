package viva.republica.toss.network.model.verify;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TimeoutCompanionNONE1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.PasswordPolicyResponse;
import viva.republica.toss.network.model.verify.PasswordPolicyResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordPolicyResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final nativeReadByte newPasswordFormat;
    private final List<UnavailablePasswordPolicy> unavailablePasswordPolicies;
    private final List<String> unavailablePasswordSet;

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PasswordPolicyResponse$UnavailablePasswordPolicy$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsInterface = asInterface();
        int i3 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsBinder = asBinder();
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PasswordPolicyResponse)) {
            return false;
        }
        PasswordPolicyResponse passwordPolicyResponse = (PasswordPolicyResponse) obj;
        if (!Intrinsics.areEqual(this.unavailablePasswordPolicies, passwordPolicyResponse.unavailablePasswordPolicies)) {
            int i4 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.unavailablePasswordSet, passwordPolicyResponse.unavailablePasswordSet)) {
            return false;
        }
        if (this.newPasswordFormat == passwordPolicyResponse.newPasswordFormat) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.unavailablePasswordPolicies.hashCode() * 31) + this.unavailablePasswordSet.hashCode()) * 31) + this.newPasswordFormat.hashCode();
        int i4 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PasswordPolicyResponse(unavailablePasswordPolicies=" + this.unavailablePasswordPolicies + ", unavailablePasswordSet=" + this.unavailablePasswordSet + ", newPasswordFormat=" + this.newPasswordFormat + ")";
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PasswordPolicyResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                PasswordPolicyResponse$.serializer serializerVar = PasswordPolicyResponse$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PasswordPolicyResponse$.serializer serializerVar2 = PasswordPolicyResponse$.serializer.INSTANCE;
            int i3 = onExtraCallback + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.PasswordPolicyResponse$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return PasswordPolicyResponse.onExtraCallback();
                }
                PasswordPolicyResponse.onExtraCallback();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.PasswordPolicyResponse$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                KSerializer kSerializer = (KSerializer) PasswordPolicyResponse.IAuthTabCallback(-624986069, iOnWarmupCompleted, iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 624986069, new Object[0], iOnWarmupCompleted3);
                int i4 = onExtraCallback + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.PasswordPolicyResponse$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = PasswordPolicyResponse.onExtraCallbackWithResult();
                int i4 = IAuthTabCallback + 23;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        })};
        int i = onWarmupCompleted + 63;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ PasswordPolicyResponse(int i, List list, List list2, nativeReadByte nativereadbyte, okycx okycxVar) {
        if (4 != (i & 4)) {
            htf31.onExtraCallbackWithResult(i, 4, PasswordPolicyResponse$.serializer.INSTANCE.getDescriptor());
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        this.unavailablePasswordPolicies = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            int i4 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.unavailablePasswordSet = CollectionsKt.emptyList();
            int i6 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            this.unavailablePasswordSet = list2;
        }
        int i8 = 2 % 2;
        this.newPasswordFormat = nativereadbyte;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.verify.PasswordPolicyResponse r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.IAuthTabCallback
            int r1 = r1 + 89
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.PasswordPolicyResponse.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            if (r3 != 0) goto L38
            int r3 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.IAuthTabCallback
            int r3 = r3 + 19
            int r4 = r3 % 128
            viva.republica.toss.network.model.verify.PasswordPolicyResponse.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L2d
            java.util.List<viva.republica.toss.network.model.verify.PasswordPolicyResponse$UnavailablePasswordPolicy> r3 = r6.unavailablePasswordPolicies
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L45
            goto L38
        L2d:
            java.util.List<viva.republica.toss.network.model.verify.PasswordPolicyResponse$UnavailablePasswordPolicy> r6 = r6.unavailablePasswordPolicies
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            r6 = 0
            throw r6
        L38:
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            java.util.List<viva.republica.toss.network.model.verify.PasswordPolicyResponse$UnavailablePasswordPolicy> r4 = r6.unavailablePasswordPolicies
            r7.onNavigationEvent(r8, r2, r3, r4)
        L45:
            r3 = 1
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L58
            java.util.List<java.lang.String> r4 = r6.unavailablePasswordSet
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L65
        L58:
            r4 = r1[r3]
            java.lang.Object r4 = r4.getValue()
            o.py r4 = (o.py) r4
            java.util.List<java.lang.String> r5 = r6.unavailablePasswordSet
            r7.onNavigationEvent(r8, r3, r4, r5)
        L65:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.nativeReadByte r6 = r6.newPasswordFormat
            r7.onNavigationEvent(r8, r0, r1, r6)
            int r6 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.onExtraCallbackWithResult
            int r6 = r6 + 11
            int r7 = r6 % 128
            viva.republica.toss.network.model.verify.PasswordPolicyResponse.IAuthTabCallback = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L80
            r6 = 90
            int r6 = r6 / r2
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.PasswordPolicyResponse.IAuthTabCallback(viva.republica.toss.network.model.verify.PasswordPolicyResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public final List<UnavailablePasswordPolicy> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<UnavailablePasswordPolicy> list = this.unavailablePasswordPolicies;
        int i4 = i3 + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return list;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PasswordPolicyResponse passwordPolicyResponse = (PasswordPolicyResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<String> list = passwordPolicyResponse.unavailablePasswordSet;
        if (i4 != 0) {
            int i5 = 97 / 0;
        }
        int i6 = i3 + 113;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @liq
    public static final class UnavailablePasswordPolicy {
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.PasswordPolicyResponse$UnavailablePasswordPolicy$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnExtraCallback = PasswordPolicyResponse.UnavailablePasswordPolicy.onExtraCallback();
                    int i3 = 40 / 0;
                } else {
                    kSerializerOnExtraCallback = PasswordPolicyResponse.UnavailablePasswordPolicy.onExtraCallback();
                }
                int i4 = onWarmupCompleted + 45;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null};
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final String errorMessage;
        private final List<String> passwordSet;

        /* JADX WARN: Multi-variable type inference failed */
        public UnavailablePasswordPolicy() {
            this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }

        private static final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 87;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof UnavailablePasswordPolicy)) {
                int i4 = onExtraCallbackWithResult + 53;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            UnavailablePasswordPolicy unavailablePasswordPolicy = (UnavailablePasswordPolicy) obj;
            if (!Intrinsics.areEqual(this.passwordSet, unavailablePasswordPolicy.passwordSet)) {
                return false;
            }
            if (Intrinsics.areEqual(this.errorMessage, unavailablePasswordPolicy.errorMessage)) {
                return true;
            }
            int i6 = onExtraCallback + 65;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode = (i2 % 2 == 0 ? this.passwordSet.hashCode() - 27 : this.passwordSet.hashCode() * 31) + this.errorMessage.hashCode();
            int i3 = onExtraCallback + 93;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 22 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UnavailablePasswordPolicy(passwordSet=" + this.passwordSet + ", errorMessage=" + this.errorMessage + ")";
            int i2 = onExtraCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
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

            public final KSerializer<UnavailablePasswordPolicy> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                PasswordPolicyResponse$UnavailablePasswordPolicy$$serializer passwordPolicyResponse$UnavailablePasswordPolicy$$serializer = PasswordPolicyResponse$UnavailablePasswordPolicy$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return passwordPolicyResponse$UnavailablePasswordPolicy$$serializer;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onWarmupCompleted + 37;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ UnavailablePasswordPolicy(int i, List list, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                list = CollectionsKt.emptyList();
                int i2 = onExtraCallback + 119;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.passwordSet = list;
            if ((i & 2) == 0) {
                int i5 = onExtraCallback + 57;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                this.errorMessage = "";
                if (i6 == 0) {
                    int i7 = 96 / 0;
                    return;
                }
                return;
            }
            this.errorMessage = str;
            int i8 = onExtraCallbackWithResult + 83;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public UnavailablePasswordPolicy(@NotNull List<String> list, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.passwordSet = list;
            this.errorMessage = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r1
          0x0036: PHI (r1v9 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v13 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001f, B:10:0x0034, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
          0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v13 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.onExtraCallbackWithResult
                int r1 = r1 + 61
                int r2 = r1 % 128
                viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L19
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.$childSerializers
                boolean r4 = r7.onWarmupCompleted(r8, r2)
                if (r4 != 0) goto L36
                goto L21
            L19:
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.$childSerializers
                boolean r4 = r7.onWarmupCompleted(r8, r3)
                if (r4 != 0) goto L36
            L21:
                int r4 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.onExtraCallback
                int r4 = r4 + 99
                int r5 = r4 % 128
                viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.onExtraCallbackWithResult = r5
                int r4 = r4 % r0
                java.util.List<java.lang.String> r4 = r6.passwordSet
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                if (r4 != 0) goto L43
            L36:
                r1 = r1[r3]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                java.util.List<java.lang.String> r4 = r6.passwordSet
                r7.onNavigationEvent(r8, r3, r1, r4)
            L43:
                boolean r1 = r7.onWarmupCompleted(r8, r2)
                if (r1 != 0) goto L54
                java.lang.String r1 = r6.errorMessage
                java.lang.String r3 = ""
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 == 0) goto L54
                goto L59
            L54:
                java.lang.String r6 = r6.errorMessage
                r7.onExtraCallback(r8, r2, r6)
            L59:
                int r6 = viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.onExtraCallbackWithResult
                int r6 = r6 + 13
                int r7 = r6 % 128
                viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.onExtraCallback = r7
                int r6 = r6 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy.IAuthTabCallback(viva.republica.toss.network.model.verify.PasswordPolicyResponse$UnavailablePasswordPolicy, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i2 + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ UnavailablePasswordPolicy(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 41;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    list = CollectionsKt.emptyList();
                    int i3 = 2 % 2;
                } else {
                    CollectionsKt.emptyList();
                    obj.hashCode();
                    throw null;
                }
            }
            if ((i & 2) != 0) {
                int i4 = onExtraCallbackWithResult + 55;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                str = "";
            }
            this(list, str);
        }

        public final List<String> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 41;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            List<String> list = this.passwordSet;
            int i4 = i2 + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return list;
            }
            obj.hashCode();
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.errorMessage;
            int i5 = i3 + 3;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 12 / 0;
            }
            return str;
        }
    }

    public final nativeReadByte IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nativeReadByte nativereadbyte = this.newPasswordFormat;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return nativereadbyte;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = i8 | i5;
        int i11 = (~((~i5) | i)) | (~i10);
        int i12 = (~(i2 | i7 | i5)) | (~(i10 | i));
        int i13 = i5 + i + i3 + (528639218 * i6) + ((-532493036) * i4);
        int i14 = i13 * i13;
        int i15 = ((i5 * 873666089) - 1460666368) + (873666089 * i) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i3) + (1819279360 * i6) + ((-1621098496) * i4) + (586088448 * i14);
        int i16 = (i5 * (-1573143961)) + 2078511484 + (i * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i3 * (-1573143025)) + (i6 * 123045422) + (i4 * (-1548035028)) + (i14 * 1845559296);
        if (i15 + (i16 * i16 * 1848705024) == 1) {
            return onExtraCallback(objArr);
        }
        int i17 = 2 % 2;
        int i18 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i18 % 128;
        int i19 = i18 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i20 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (KSerializer) IAuthTabCallback(-624986069, iOnWarmupCompleted, iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 624986069, new Object[0], iOnWarmupCompleted3);
    }

    public final List<String> onTransact() {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (List) IAuthTabCallback(35058852, iOnWarmupCompleted, iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -35058851, new Object[]{this}, iOnWarmupCompleted3);
    }
}
