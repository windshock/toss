package com.kakao.sdk.share.model;

import com.kakao.sdk.share.model.ImageInfos$;
import com.kakao.sdk.share.model.ImageUploadResult$;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ImageUploadResult {
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    private final ImageInfos infos;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageUploadResult) && Intrinsics.areEqual(this.infos, ((ImageUploadResult) obj).infos);
    }

    public int hashCode() {
        return this.infos.hashCode();
    }

    public String toString() {
        return "ImageUploadResult(infos=" + this.infos + ")";
    }

    @Deprecated
    public /* synthetic */ ImageUploadResult(int i, ImageInfos imageInfos, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, ImageUploadResult$.serializer.INSTANCE.getDescriptor());
        }
        this.infos = imageInfos;
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@NotNull ImageUploadResult imageUploadResult, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(imageUploadResult, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onNavigationEvent(serialDescriptor, 0, ImageInfos$.serializer.INSTANCE, imageUploadResult.infos);
    }
}
