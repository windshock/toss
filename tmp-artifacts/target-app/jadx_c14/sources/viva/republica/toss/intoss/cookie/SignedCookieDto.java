package viva.republica.toss.intoss.cookie;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.access8100;
import o.appInfo;
import o.encryptType4;
import o.getWrite;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.intoss.cookie.SignedCookieDto$Failure$;
import viva.republica.toss.intoss.cookie.SignedCookieDto$Failure$ErrorData$;
import viva.republica.toss.intoss.cookie.SignedCookieDto$Success$;
import viva.republica.toss.intoss.cookie.SignedCookieDto$Success$BundleCookie$;
import viva.republica.toss.intoss.cookie.SignedCookieDto$Success$Policy$;

@appInfo(IAuthTabCallback = "resultType")
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface SignedCookieDto {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<SignedCookieDto> serializer() {
            return new kt("viva.republica.toss.intoss.cookie.SignedCookieDto", Reflection.getOrCreateKotlinClass(SignedCookieDto.class), new KClass[]{Reflection.getOrCreateKotlinClass(Failure.class), Reflection.getOrCreateKotlinClass(Success.class)}, new KSerializer[]{SignedCookieDto$Failure$.serializer.INSTANCE, SignedCookieDto$Success$.serializer.INSTANCE}, new Annotation[]{new SignedCookieDto$Success$.serializer.onExtraCallback("resultType")});
        }
    }

    @nc(IAuthTabCallback = "SUCCESS")
    @liq
    public static final class Success implements SignedCookieDto {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final BundleCookie success;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.success, ((Success) obj).success);
        }

        public int hashCode() {
            return this.success.hashCode();
        }

        public String toString() {
            return "Success(success=" + this.success + ")";
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Success> serializer() {
                return SignedCookieDto$Success$.serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, BundleCookie bundleCookie, okycx okycxVar) {
            if (1 != (i & 1)) {
                htf31.onExtraCallbackWithResult(i, 1, SignedCookieDto$Success$.serializer.INSTANCE.getDescriptor());
            }
            this.success = bundleCookie;
        }

        public final BundleCookie onExtraCallbackWithResult() {
            return this.success;
        }

        @liq
        public static final class BundleCookie {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final Policy bundle;
            private final Policy web;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BundleCookie)) {
                    return false;
                }
                BundleCookie bundleCookie = (BundleCookie) obj;
                return Intrinsics.areEqual(this.bundle, bundleCookie.bundle) && Intrinsics.areEqual(this.web, bundleCookie.web);
            }

            public int hashCode() {
                int iHashCode = this.bundle.hashCode();
                Policy policy = this.web;
                return (iHashCode * 31) + (policy == null ? 0 : policy.hashCode());
            }

            public String toString() {
                return "BundleCookie(bundle=" + this.bundle + ", web=" + this.web + ")";
            }

            public /* synthetic */ BundleCookie(int i, Policy policy, Policy policy2, okycx okycxVar) {
                if (1 != (i & 1)) {
                    htf31.onExtraCallbackWithResult(i, 1, SignedCookieDto$Success$BundleCookie$.serializer.INSTANCE.getDescriptor());
                }
                this.bundle = policy;
                if ((i & 2) == 0) {
                    this.web = null;
                } else {
                    this.web = policy2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void IAuthTabCallback(BundleCookie bundleCookie, vyl vylVar, SerialDescriptor serialDescriptor) {
                SignedCookieDto$Success$Policy$.serializer serializerVar = SignedCookieDto$Success$Policy$.serializer.INSTANCE;
                vylVar.onNavigationEvent(serialDescriptor, 0, serializerVar, bundleCookie.bundle);
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || bundleCookie.web != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, bundleCookie.web);
                }
            }

            public final Policy onNavigationEvent() {
                return this.bundle;
            }

            public final HashMap<String, HashMap<String, String>> onWarmupCompleted() {
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("bundle", this.bundle.onWarmupCompleted());
                Policy policy = this.web;
                return access8100.onExtraCallbackWithResult(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("web", policy != null ? policy.onWarmupCompleted() : null)});
            }

            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<BundleCookie> serializer() {
                    return SignedCookieDto$Success$BundleCookie$.serializer.INSTANCE;
                }
            }
        }

        @liq
        public static final class Policy {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String cloudFrontKeyPairId;
            private final String cloudFrontPolicy;
            private final String cloudFrontSignature;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Policy)) {
                    return false;
                }
                Policy policy = (Policy) obj;
                return Intrinsics.areEqual(this.cloudFrontPolicy, policy.cloudFrontPolicy) && Intrinsics.areEqual(this.cloudFrontSignature, policy.cloudFrontSignature) && Intrinsics.areEqual(this.cloudFrontKeyPairId, policy.cloudFrontKeyPairId);
            }

            public int hashCode() {
                return (((this.cloudFrontPolicy.hashCode() * 31) + this.cloudFrontSignature.hashCode()) * 31) + this.cloudFrontKeyPairId.hashCode();
            }

            public String toString() {
                return "Policy(cloudFrontPolicy=" + this.cloudFrontPolicy + ", cloudFrontSignature=" + this.cloudFrontSignature + ", cloudFrontKeyPairId=" + this.cloudFrontKeyPairId + ")";
            }

            public /* synthetic */ Policy(int i, String str, String str2, String str3, okycx okycxVar) {
                if (7 != (i & 7)) {
                    htf31.onExtraCallbackWithResult(i, 7, SignedCookieDto$Success$Policy$.serializer.INSTANCE.getDescriptor());
                }
                this.cloudFrontPolicy = str;
                this.cloudFrontSignature = str2;
                this.cloudFrontKeyPairId = str3;
            }

            @JvmStatic
            public static final /* synthetic */ void IAuthTabCallback(Policy policy, vyl vylVar, SerialDescriptor serialDescriptor) {
                vylVar.onExtraCallback(serialDescriptor, 0, policy.cloudFrontPolicy);
                vylVar.onExtraCallback(serialDescriptor, 1, policy.cloudFrontSignature);
                vylVar.onExtraCallback(serialDescriptor, 2, policy.cloudFrontKeyPairId);
            }

            public final HashMap<String, String> onWarmupCompleted() {
                return access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("CloudFront-Policy", this.cloudFrontPolicy), getWrite.IAuthTabCallback("CloudFront-Signature", this.cloudFrontSignature), getWrite.IAuthTabCallback("CloudFront-Key-Pair-Id", this.cloudFrontKeyPairId)});
            }

            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Policy> serializer() {
                    return SignedCookieDto$Success$Policy$.serializer.INSTANCE;
                }
            }
        }
    }

    @nc(IAuthTabCallback = "FAIL")
    @liq
    public static final class Failure implements SignedCookieDto {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final ErrorData error;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) obj).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ")";
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Failure> serializer() {
                return SignedCookieDto$Failure$.serializer.INSTANCE;
            }
        }

        public /* synthetic */ Failure(int i, ErrorData errorData, okycx okycxVar) {
            if (1 != (i & 1)) {
                htf31.onExtraCallbackWithResult(i, 1, SignedCookieDto$Failure$.serializer.INSTANCE.getDescriptor());
            }
            this.error = errorData;
        }

        @liq
        public static final class ErrorData {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final JsonObject data;
            private final String errorCode;
            private final int errorType;
            private final String reason;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorData)) {
                    return false;
                }
                ErrorData errorData = (ErrorData) obj;
                return this.errorType == errorData.errorType && Intrinsics.areEqual(this.errorCode, errorData.errorCode) && Intrinsics.areEqual(this.reason, errorData.reason) && Intrinsics.areEqual(this.data, errorData.data);
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.errorType) * 31) + this.errorCode.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.data.hashCode();
            }

            public String toString() {
                return "ErrorData(errorType=" + this.errorType + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ", data=" + this.data + ")";
            }

            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ErrorData> serializer() {
                    return SignedCookieDto$Failure$ErrorData$.serializer.INSTANCE;
                }
            }

            public /* synthetic */ ErrorData(int i, int i2, String str, String str2, JsonObject jsonObject, okycx okycxVar) {
                if (15 != (i & 15)) {
                    htf31.onExtraCallbackWithResult(i, 15, SignedCookieDto$Failure$ErrorData$.serializer.INSTANCE.getDescriptor());
                }
                this.errorType = i2;
                this.errorCode = str;
                this.reason = str2;
                this.data = jsonObject;
            }

            @JvmStatic
            public static final /* synthetic */ void onNavigationEvent(ErrorData errorData, vyl vylVar, SerialDescriptor serialDescriptor) {
                vylVar.onExtraCallback(serialDescriptor, 0, errorData.errorType);
                vylVar.onExtraCallback(serialDescriptor, 1, errorData.errorCode);
                vylVar.onExtraCallback(serialDescriptor, 2, errorData.reason);
                vylVar.onNavigationEvent(serialDescriptor, 3, encryptType4.IAuthTabCallback, errorData.data);
            }

            public final int onExtraCallback() {
                return this.errorType;
            }

            public final String onNavigationEvent() {
                return this.errorCode;
            }

            public final String onExtraCallbackWithResult() {
                return this.reason;
            }
        }

        public final ErrorData onWarmupCompleted() {
            return this.error;
        }
    }
}
