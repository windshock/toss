package com.kakao.sdk.auth.model;

import com.kakao.sdk.auth.model.AgtResponse$;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AgtResponse {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private final String agt;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AgtResponse) && Intrinsics.areEqual(this.agt, ((AgtResponse) obj).agt);
    }

    public int hashCode() {
        return this.agt.hashCode();
    }

    public String toString() {
        return "AgtResponse(agt=" + this.agt + ")";
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final KSerializer<AgtResponse> serializer() {
            return AgtResponse$.serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ AgtResponse(int i2, String str, okycx okycxVar) {
        if (1 != (i2 & 1)) {
            htf31.onExtraCallbackWithResult(i2, 1, AgtResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.agt = str;
    }

    @JvmStatic
    public static final void onExtraCallback(@NotNull AgtResponse agtResponse, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(agtResponse, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onExtraCallback(serialDescriptor, 0, agtResponse.agt);
    }

    public final String IAuthTabCallback() {
        return this.agt;
    }
}
