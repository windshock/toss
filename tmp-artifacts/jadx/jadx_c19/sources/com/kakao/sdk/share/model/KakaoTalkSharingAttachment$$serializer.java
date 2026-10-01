package com.kakao.sdk.share.model;

import com.alibaba.ariver.kernel.RVParams;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import o.aeu2;
import o.encryptType4;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class KakaoTalkSharingAttachment$$serializer implements aeu2<KakaoTalkSharingAttachment> {
    public static final KakaoTalkSharingAttachment$$serializer INSTANCE;
    private static final /* synthetic */ setAnimationsLoop descriptor;

    static {
        KakaoTalkSharingAttachment$$serializer kakaoTalkSharingAttachment$$serializer = new KakaoTalkSharingAttachment$$serializer();
        INSTANCE = kakaoTalkSharingAttachment$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("com.kakao.sdk.share.model.KakaoTalkSharingAttachment", kakaoTalkSharingAttachment$$serializer, 8);
        setanimationsloop.onWarmupCompleted("lv", true);
        setanimationsloop.onWarmupCompleted("av", true);
        setanimationsloop.onWarmupCompleted("ak", false);
        setanimationsloop.onWarmupCompleted("P", true);
        setanimationsloop.onWarmupCompleted("C", true);
        setanimationsloop.onWarmupCompleted(RVParams.TITLE_IMAGE, false);
        setanimationsloop.onWarmupCompleted("ta", true);
        setanimationsloop.onWarmupCompleted("extras", false);
        descriptor = setanimationsloop;
    }

    private KakaoTalkSharingAttachment$$serializer() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public KakaoTalkSharingAttachment deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Object objOnExtraCallbackWithResult;
        Object objOnNavigationEvent;
        Object objOnExtraCallbackWithResult2;
        Object objOnExtraCallbackWithResult3;
        long j;
        int i2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor2);
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(descriptor2, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(descriptor2, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(descriptor2, 2);
            encryptType4 encrypttype4 = encryptType4.IAuthTabCallback;
            objOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 3, encrypttype4, (Object) null);
            objOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 4, encrypttype4, (Object) null);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(descriptor2, 5);
            objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 6, encrypttype4, (Object) null);
            objOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2, 7, encrypttype4, (Object) null);
            strAsInterface = strAsInterface2;
            i2 = 255;
            j = jIAuthTabCallbackDefault;
            str = strAsInterface4;
            str2 = strAsInterface3;
        } else {
            int i3 = 0;
            boolean z = true;
            Object objOnExtraCallbackWithResult4 = null;
            Object objOnNavigationEvent2 = null;
            Object objOnExtraCallbackWithResult5 = null;
            String strAsInterface5 = null;
            long jIAuthTabCallbackDefault2 = 0;
            String strAsInterface6 = null;
            Object objOnExtraCallbackWithResult6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i3 |= 1;
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(descriptor2, 0);
                        continue;
                    case 1:
                        i3 |= 2;
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(descriptor2, 1);
                        continue;
                    case 2:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(descriptor2, 2);
                        i3 |= 4;
                        continue;
                    case 3:
                        objOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 3, encryptType4.IAuthTabCallback, objOnExtraCallbackWithResult6);
                        i3 |= 8;
                        break;
                    case 4:
                        objOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 4, encryptType4.IAuthTabCallback, objOnExtraCallbackWithResult5);
                        i3 |= 16;
                        break;
                    case 5:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(descriptor2, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        objOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2, 6, encryptType4.IAuthTabCallback, objOnExtraCallbackWithResult4);
                        i3 |= 64;
                        break;
                    case 7:
                        objOnNavigationEvent2 = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2, 7, encryptType4.IAuthTabCallback, objOnNavigationEvent2);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            objOnExtraCallbackWithResult = objOnExtraCallbackWithResult4;
            objOnNavigationEvent = objOnNavigationEvent2;
            objOnExtraCallbackWithResult2 = objOnExtraCallbackWithResult6;
            objOnExtraCallbackWithResult3 = objOnExtraCallbackWithResult5;
            j = jIAuthTabCallbackDefault2;
            i2 = i3;
            str = strAsInterface6;
            str2 = strAsInterface5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2);
        return new KakaoTalkSharingAttachment(i2, strAsInterface, str2, str, (JsonObject) objOnExtraCallbackWithResult2, (JsonObject) objOnExtraCallbackWithResult3, j, (JsonObject) objOnExtraCallbackWithResult, (JsonObject) objOnNavigationEvent, (okycx) null);
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull KakaoTalkSharingAttachment kakaoTalkSharingAttachment) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(kakaoTalkSharingAttachment, "");
        SerialDescriptor descriptor2 = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor2);
        KakaoTalkSharingAttachment.onExtraCallbackWithResult(kakaoTalkSharingAttachment, vylVarOnExtraCallback, descriptor2);
        vylVarOnExtraCallback.onNavigationEvent(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = encryptType4.IAuthTabCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, oty1.onExtraCallback, kSerializerIAuthTabCallback3, kSerializer};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return aeu2.onWarmupCompleted.onWarmupCompleted(this);
    }
}
