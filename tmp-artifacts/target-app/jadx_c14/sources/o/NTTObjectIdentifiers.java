package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NTTObjectIdentifiers {
    public static final SigPolicyQualifiers onExtraCallback(@NotNull doCallInitialize docallinitialize) {
        Intrinsics.checkNotNullParameter(docallinitialize, "");
        if (docallinitialize instanceof getCacheCodeDirLegacy) {
            return new SPUserNotice((getCacheCodeDirLegacy) docallinitialize);
        }
        if (docallinitialize instanceof getDynamicLoader) {
            return new getSigQualifier((getDynamicLoader) docallinitialize);
        }
        if (docallinitialize instanceof getApplicationContextViaReflection) {
            return new getNoticeRef();
        }
        if (docallinitialize instanceof isFallbackMode) {
            return new getStringAt((isFallbackMode) docallinitialize);
        }
        if (docallinitialize instanceof maybeInitInternally) {
            return new SigPolicyQualifierInfo((maybeInitInternally) docallinitialize);
        }
        throw new IllegalStateException(("Unknown FaqContent type: " + Reflection.getOrCreateKotlinClass(docallinitialize.getClass())).toString());
    }
}
