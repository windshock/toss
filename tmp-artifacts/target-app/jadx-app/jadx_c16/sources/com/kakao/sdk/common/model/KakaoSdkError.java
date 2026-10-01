package com.kakao.sdk.common.model;

import com.kakao.sdk.common.model.ApiError$;
import com.kakao.sdk.common.model.AppsError$;
import com.kakao.sdk.common.model.AuthError$;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.kt;
import o.liq;
import o.vyl;
import org.jetbrains.annotations.NotNull;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class KakaoSdkError extends RuntimeException {
    private final String msg;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.kakao.sdk.common.model.KakaoSdkError$Companion$$cachedSerializer$delegate$1
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final KSerializer<Object> invoke() {
            return new kt("com.kakao.sdk.common.model.KakaoSdkError", Reflection.getOrCreateKotlinClass(KakaoSdkError.class), new KClass[]{Reflection.getOrCreateKotlinClass(ApiError.class), Reflection.getOrCreateKotlinClass(AppsError.class), Reflection.getOrCreateKotlinClass(AuthError.class)}, new KSerializer[]{ApiError$.serializer.INSTANCE, AppsError$.serializer.INSTANCE, AuthError$.serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ KakaoSdkError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @JvmStatic
    public static final void onWarmupCompleted(@NotNull KakaoSdkError kakaoSdkError, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(kakaoSdkError, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onExtraCallback(serialDescriptor, 0, kakaoSdkError.am_());
    }

    private KakaoSdkError(String str) {
        super(str);
        this.msg = str;
    }

    public String am_() {
        return this.msg;
    }
}
