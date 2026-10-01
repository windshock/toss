package com.kakao.sdk.share.model;

import com.kakao.sdk.share.model.KakaoTalkSharingAttachment$;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.encryptType4;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class KakaoTalkSharingAttachment {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final JsonObject C;
    private final JsonObject P;
    private final String ak;
    private final String av;
    private final JsonObject extras;
    private final String lv;
    private final JsonObject ta;
    private final long ti;

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final KSerializer<KakaoTalkSharingAttachment> serializer() {
            return KakaoTalkSharingAttachment$.serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ KakaoTalkSharingAttachment(int i, String str, String str2, String str3, JsonObject jsonObject, JsonObject jsonObject2, long j, JsonObject jsonObject3, JsonObject jsonObject4, okycx okycxVar) {
        if (164 != (i & 164)) {
            htf31.onExtraCallbackWithResult(i, 164, KakaoTalkSharingAttachment$.serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.lv = "4.0";
        } else {
            this.lv = str;
        }
        if ((i & 2) == 0) {
            this.av = "4.0";
        } else {
            this.av = str2;
        }
        this.ak = str3;
        if ((i & 8) == 0) {
            this.P = null;
        } else {
            this.P = jsonObject;
        }
        if ((i & 16) == 0) {
            this.C = null;
        } else {
            this.C = jsonObject2;
        }
        this.ti = j;
        if ((i & 64) == 0) {
            this.ta = null;
        } else {
            this.ta = jsonObject3;
        }
        this.extras = jsonObject4;
    }

    public KakaoTalkSharingAttachment(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable JsonObject jsonObject, @Nullable JsonObject jsonObject2, long j, @Nullable JsonObject jsonObject3, @NotNull JsonObject jsonObject4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(jsonObject4, "");
        this.lv = str;
        this.av = str2;
        this.ak = str3;
        this.P = jsonObject;
        this.C = jsonObject2;
        this.ti = j;
        this.ta = jsonObject3;
        this.extras = jsonObject4;
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@NotNull KakaoTalkSharingAttachment kakaoTalkSharingAttachment, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(kakaoTalkSharingAttachment, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(kakaoTalkSharingAttachment.lv, "4.0")) {
            vylVar.onExtraCallback(serialDescriptor, 0, kakaoTalkSharingAttachment.lv);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(kakaoTalkSharingAttachment.av, "4.0")) {
            vylVar.onExtraCallback(serialDescriptor, 1, kakaoTalkSharingAttachment.av);
        }
        vylVar.onExtraCallback(serialDescriptor, 2, kakaoTalkSharingAttachment.ak);
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || kakaoTalkSharingAttachment.P != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, encryptType4.IAuthTabCallback, kakaoTalkSharingAttachment.P);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || kakaoTalkSharingAttachment.C != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, encryptType4.IAuthTabCallback, kakaoTalkSharingAttachment.C);
        }
        vylVar.onExtraCallback(serialDescriptor, 5, kakaoTalkSharingAttachment.ti);
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || kakaoTalkSharingAttachment.ta != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, encryptType4.IAuthTabCallback, kakaoTalkSharingAttachment.ta);
        }
        vylVar.onNavigationEvent(serialDescriptor, 7, encryptType4.IAuthTabCallback, kakaoTalkSharingAttachment.extras);
    }

    public /* synthetic */ KakaoTalkSharingAttachment(String str, String str2, String str3, JsonObject jsonObject, JsonObject jsonObject2, long j, JsonObject jsonObject3, JsonObject jsonObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "4.0" : str, (i & 2) != 0 ? "4.0" : str2, str3, (i & 8) != 0 ? null : jsonObject, (i & 16) != 0 ? null : jsonObject2, j, (i & 64) != 0 ? null : jsonObject3, jsonObject4);
    }
}
