package com.kakao.sdk.share.model;

import com.kakao.sdk.share.model.ValidationResult$;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.encryptType4;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ValidationResult {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    private final JsonObject argumentMsg;
    private final JsonObject schemeParams;
    private final JsonObject templateArgs;
    private final long templateId;
    private final JsonObject templateMsg;
    private final JsonObject warningMsg;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationResult)) {
            return false;
        }
        ValidationResult validationResult = (ValidationResult) obj;
        return this.templateId == validationResult.templateId && Intrinsics.areEqual(this.templateArgs, validationResult.templateArgs) && Intrinsics.areEqual(this.templateMsg, validationResult.templateMsg) && Intrinsics.areEqual(this.warningMsg, validationResult.warningMsg) && Intrinsics.areEqual(this.argumentMsg, validationResult.argumentMsg) && Intrinsics.areEqual(this.schemeParams, validationResult.schemeParams);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.templateId);
        JsonObject jsonObject = this.templateArgs;
        int iHashCode2 = jsonObject == null ? 0 : jsonObject.hashCode();
        int iHashCode3 = this.templateMsg.hashCode();
        JsonObject jsonObject2 = this.warningMsg;
        int iHashCode4 = jsonObject2 == null ? 0 : jsonObject2.hashCode();
        JsonObject jsonObject3 = this.argumentMsg;
        int iHashCode5 = jsonObject3 == null ? 0 : jsonObject3.hashCode();
        JsonObject jsonObject4 = this.schemeParams;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (jsonObject4 != null ? jsonObject4.hashCode() : 0);
    }

    public String toString() {
        return "ValidationResult(templateId=" + this.templateId + ", templateArgs=" + this.templateArgs + ", templateMsg=" + this.templateMsg + ", warningMsg=" + this.warningMsg + ", argumentMsg=" + this.argumentMsg + ", schemeParams=" + this.schemeParams + ")";
    }

    @Deprecated
    public /* synthetic */ ValidationResult(int i, @nc(IAuthTabCallback = "template_id") long j, @nc(IAuthTabCallback = "template_args") JsonObject jsonObject, @nc(IAuthTabCallback = "template_msg") JsonObject jsonObject2, @nc(IAuthTabCallback = "warning_msg") JsonObject jsonObject3, @nc(IAuthTabCallback = "argument_msg") JsonObject jsonObject4, @nc(IAuthTabCallback = "scheme_params") JsonObject jsonObject5, okycx okycxVar) {
        if (63 != (i & 63)) {
            htf31.onExtraCallbackWithResult(i, 63, ValidationResult$.serializer.INSTANCE.getDescriptor());
        }
        this.templateId = j;
        this.templateArgs = jsonObject;
        this.templateMsg = jsonObject2;
        this.warningMsg = jsonObject3;
        this.argumentMsg = jsonObject4;
        this.schemeParams = jsonObject5;
    }

    @JvmStatic
    public static final void onExtraCallback(@NotNull ValidationResult validationResult, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(validationResult, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onExtraCallback(serialDescriptor, 0, validationResult.templateId);
        encryptType4 encrypttype4 = encryptType4.IAuthTabCallback;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, encrypttype4, validationResult.templateArgs);
        vylVar.onNavigationEvent(serialDescriptor, 2, encrypttype4, validationResult.templateMsg);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, encrypttype4, validationResult.warningMsg);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, encrypttype4, validationResult.argumentMsg);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, encrypttype4, validationResult.schemeParams);
    }

    public final long IAuthTabCallback() {
        return this.templateId;
    }

    public final JsonObject onWarmupCompleted() {
        return this.templateArgs;
    }

    public final JsonObject onExtraCallbackWithResult() {
        return this.templateMsg;
    }

    public final JsonObject onTransact() {
        return this.warningMsg;
    }

    public final JsonObject onNavigationEvent() {
        return this.argumentMsg;
    }

    public final JsonObject onExtraCallback() {
        return this.schemeParams;
    }
}
