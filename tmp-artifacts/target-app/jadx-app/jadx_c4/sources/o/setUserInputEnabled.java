package o;

import im.toss.ads_sdk.remote.model.SdkTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.qt;
import o.setUserInputEnabled;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setUserInputEnabled implements KSerializer<SdkTemplate> {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public static final setUserInputEnabled onExtraCallbackWithResult = new setUserInputEnabled();
    private static final SerialDescriptor onNavigationEvent = ujb.IAuthTabCallback("SdkTemplate", new SerialDescriptor[0], new Function1() { // from class: im.toss.ads_sdk.remote.model.SdkTemplateSerializer$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = setUserInputEnabled.onExtraCallbackWithResult((qt) obj);
            int i4 = onExtraCallback + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 42 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }
    });
    public static final int IAuthTabCallback = 8;

    public static /* synthetic */ Unit onExtraCallbackWithResult(qt qtVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(qtVar);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return unitOnNavigationEvent;
    }

    private setUserInputEnabled() {
    }

    public /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SdkTemplate sdkTemplateOnWarmupCompleted = onWarmupCompleted(decoder);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        int i5 = onWarmupCompleted + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return sdkTemplateOnWarmupCompleted;
    }

    public /* synthetic */ void serialize(Encoder encoder, Object obj) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(encoder, (SdkTemplate) obj);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        int i5 = onExtraCallback + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = asBinder + 57;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = onNavigationEvent;
        int i5 = i2 + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static final Unit onNavigationEvent(qt qtVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(qtVar, "");
        } else {
            Intrinsics.checkNotNullParameter(qtVar, "");
        }
        qtVar.onExtraCallback("sdkTemplateId", getWriggleLayout.onNavigationEvent.getDescriptor(), CollectionsKt.emptyList(), false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public SdkTemplate onWarmupCompleted(@NotNull Decoder decoder) {
        JsonObject jsonObject;
        String strOnNavigationEvent;
        Object iAuthTabCallback;
        Object iAuthTabCallback2;
        Object iAuthTabCallback3;
        Object iAuthTabCallback4;
        SdkTemplate sdkTemplate;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        Object obj = null;
        setAnimationType setanimationtype = decoder instanceof setAnimationType ? (setAnimationType) decoder : null;
        if (setanimationtype == null) {
            throw new IllegalStateException("SdkTemplateSerializer only supports Json");
        }
        JsonObject jsonObjectOnWarmupCompleted = setanimationtype.onWarmupCompleted();
        if (jsonObjectOnWarmupCompleted instanceof JsonObject) {
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            jsonObject = jsonObjectOnWarmupCompleted;
        } else {
            jsonObject = null;
        }
        if (jsonObject == null) {
            return new SdkTemplate.IAuthTabCallback("");
        }
        Object obj2 = jsonObject.get("sdkTemplateId");
        JsonPrimitive jsonPrimitive = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
        if (jsonPrimitive != null) {
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitive);
        } else {
            strOnNavigationEvent = null;
        }
        String str = strOnNavigationEvent != null ? strOnNavigationEvent : "";
        switch (str.hashCode()) {
            case -496079158:
                if (str.equals("nana-image-pat")) {
                    try {
                        Result.Companion companion = kotlin.Result.Companion;
                        wie2 wie2VarAccess000 = setanimationtype.access000();
                        wie2VarAccess000.onExtraCallback();
                        iAuthTabCallback = kotlin.Result.constructor-impl((SdkTemplate) wie2VarAccess000.onExtraCallbackWithResult(SdkTemplate.NanaImagePat.Companion.serializer(), jsonObject));
                    } catch (Throwable th) {
                        Result.Companion companion2 = kotlin.Result.Companion;
                        iAuthTabCallback = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (kotlin.Result.exceptionOrNull-impl(iAuthTabCallback) != null) {
                        iAuthTabCallback = new SdkTemplate.IAuthTabCallback(str);
                    }
                    return (SdkTemplate) iAuthTabCallback;
                }
                break;
            case -496076275:
                if (str.equals("nana-image-sat")) {
                    int i6 = onExtraCallback + 73;
                    onWarmupCompleted = i6 % 128;
                    try {
                    } catch (Throwable th2) {
                        Result.Companion companion3 = kotlin.Result.Companion;
                        iAuthTabCallback2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
                    }
                    if (i6 % 2 == 0) {
                        Result.Companion companion4 = kotlin.Result.Companion;
                        wie2 wie2VarAccess0002 = setanimationtype.access000();
                        wie2VarAccess0002.onExtraCallback();
                        kotlin.Result.constructor-impl((SdkTemplate) wie2VarAccess0002.onExtraCallbackWithResult(SdkTemplate.NanaImageSat.Companion.serializer(), jsonObject));
                        obj.hashCode();
                        throw null;
                    }
                    Result.Companion companion5 = kotlin.Result.Companion;
                    wie2 wie2VarAccess0003 = setanimationtype.access000();
                    wie2VarAccess0003.onExtraCallback();
                    iAuthTabCallback2 = kotlin.Result.constructor-impl((SdkTemplate) wie2VarAccess0003.onExtraCallbackWithResult(SdkTemplate.NanaImageSat.Companion.serializer(), jsonObject));
                    if (kotlin.Result.exceptionOrNull-impl(iAuthTabCallback2) != null) {
                        iAuthTabCallback2 = new SdkTemplate.IAuthTabCallback(str);
                    }
                    return (SdkTemplate) iAuthTabCallback2;
                }
                break;
            case 138154935:
                if (str.equals("nana-survey-button-sat")) {
                    try {
                        Result.Companion companion6 = kotlin.Result.Companion;
                        wie2 wie2VarAccess0004 = setanimationtype.access000();
                        wie2VarAccess0004.onExtraCallback();
                        iAuthTabCallback3 = kotlin.Result.constructor-impl((SdkTemplate) wie2VarAccess0004.onExtraCallbackWithResult(SdkTemplate.NanaSurveyButtonSat.Companion.serializer(), jsonObject));
                    } catch (Throwable th3) {
                        Result.Companion companion7 = kotlin.Result.Companion;
                        iAuthTabCallback3 = kotlin.Result.constructor-impl(ResultKt.createFailure(th3));
                    }
                    if (kotlin.Result.exceptionOrNull-impl(iAuthTabCallback3) != null) {
                        iAuthTabCallback3 = new SdkTemplate.IAuthTabCallback(str);
                    }
                    return (SdkTemplate) iAuthTabCallback3;
                }
                break;
            case 315128486:
                if (!(!str.equals("nana-survey-choice-sat"))) {
                    int i7 = onWarmupCompleted + 125;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        Result.Companion companion8 = kotlin.Result.Companion;
                        wie2 wie2VarAccess0005 = setanimationtype.access000();
                        wie2VarAccess0005.onExtraCallback();
                        iAuthTabCallback4 = kotlin.Result.constructor-impl((SdkTemplate) wie2VarAccess0005.onExtraCallbackWithResult(SdkTemplate.NanaSurveyChoiceSat.Companion.serializer(), jsonObject));
                    } catch (Throwable th4) {
                        Result.Companion companion9 = kotlin.Result.Companion;
                        iAuthTabCallback4 = kotlin.Result.constructor-impl(ResultKt.createFailure(th4));
                    }
                    if (kotlin.Result.exceptionOrNull-impl(iAuthTabCallback4) != null) {
                        iAuthTabCallback4 = new SdkTemplate.IAuthTabCallback(str);
                    }
                    return (SdkTemplate) iAuthTabCallback4;
                }
                break;
            case 1356842413:
                if (str.equals("nana-list-bat")) {
                    wie2 wie2VarAccess0006 = setanimationtype.access000();
                    wie2VarAccess0006.onExtraCallback();
                    return (SdkTemplate) wie2VarAccess0006.onExtraCallbackWithResult(SdkTemplate.NanaListBat.Companion.serializer(), jsonObject);
                }
                break;
            case 1356855867:
                if (str.equals("nana-list-pat")) {
                    wie2 wie2VarAccess0007 = setanimationtype.access000();
                    wie2VarAccess0007.onExtraCallback();
                    return (SdkTemplate) wie2VarAccess0007.onExtraCallbackWithResult(SdkTemplate.NanaListPat.Companion.serializer(), jsonObject);
                }
                break;
            case 1356858750:
                if (str.equals("nana-list-sat")) {
                    int i9 = onExtraCallback + 71;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        wie2 wie2VarAccess0008 = setanimationtype.access000();
                        wie2VarAccess0008.onExtraCallback();
                        sdkTemplate = (SdkTemplate) wie2VarAccess0008.onExtraCallbackWithResult(SdkTemplate.NanaListSat.Companion.serializer(), jsonObject);
                        int i10 = 28 / 0;
                    } else {
                        wie2 wie2VarAccess0009 = setanimationtype.access000();
                        wie2VarAccess0009.onExtraCallback();
                        sdkTemplate = (SdkTemplate) wie2VarAccess0009.onExtraCallbackWithResult(SdkTemplate.NanaListSat.Companion.serializer(), jsonObject);
                    }
                    int i11 = onExtraCallback + 67;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        return sdkTemplate;
                    }
                    obj.hashCode();
                    throw null;
                }
                break;
        }
        return new SdkTemplate.IAuthTabCallback(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onWarmupCompleted(@NotNull Encoder encoder, @NotNull SdkTemplate sdkTemplate) throws NoWhenBranchMatchedException {
        JsonElement jsonElementIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sdkTemplate, "");
        skipVideo skipvideo = null;
        if (encoder instanceof skipVideo) {
            int i4 = onExtraCallback + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                skipvideo.hashCode();
                throw null;
            }
            skipvideo = (skipVideo) encoder;
        }
        if (skipvideo == null) {
            throw new IllegalStateException("SdkTemplateSerializer only supports Json");
        }
        if (sdkTemplate instanceof SdkTemplate.NanaListBat) {
            int i5 = onWarmupCompleted + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            wie2 wie2VarOnExtraCallback = skipvideo.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(SdkTemplate.NanaListBat.Companion.serializer(), sdkTemplate);
        } else if (sdkTemplate instanceof SdkTemplate.NanaListSat) {
            wie2 wie2VarOnExtraCallback2 = skipvideo.onExtraCallback();
            wie2VarOnExtraCallback2.onExtraCallback();
            jsonElementIAuthTabCallback = wie2VarOnExtraCallback2.IAuthTabCallback(SdkTemplate.NanaListSat.Companion.serializer(), sdkTemplate);
        } else if (sdkTemplate instanceof SdkTemplate.NanaListPat) {
            wie2 wie2VarOnExtraCallback3 = skipvideo.onExtraCallback();
            wie2VarOnExtraCallback3.onExtraCallback();
            jsonElementIAuthTabCallback = wie2VarOnExtraCallback3.IAuthTabCallback(SdkTemplate.NanaListPat.Companion.serializer(), sdkTemplate);
        } else if (sdkTemplate instanceof SdkTemplate.NanaImagePat) {
            wie2 wie2VarOnExtraCallback4 = skipvideo.onExtraCallback();
            wie2VarOnExtraCallback4.onExtraCallback();
            jsonElementIAuthTabCallback = wie2VarOnExtraCallback4.IAuthTabCallback(SdkTemplate.NanaImagePat.Companion.serializer(), sdkTemplate);
        } else if (sdkTemplate instanceof SdkTemplate.NanaImageSat) {
            wie2 wie2VarOnExtraCallback5 = skipvideo.onExtraCallback();
            wie2VarOnExtraCallback5.onExtraCallback();
            jsonElementIAuthTabCallback = wie2VarOnExtraCallback5.IAuthTabCallback(SdkTemplate.NanaImageSat.Companion.serializer(), sdkTemplate);
        } else if (sdkTemplate instanceof SdkTemplate.NanaSurveyChoiceSat) {
            wie2 wie2VarOnExtraCallback6 = skipvideo.onExtraCallback();
            wie2VarOnExtraCallback6.onExtraCallback();
            jsonElementIAuthTabCallback = wie2VarOnExtraCallback6.IAuthTabCallback(SdkTemplate.NanaSurveyChoiceSat.Companion.serializer(), sdkTemplate);
        } else if (sdkTemplate instanceof SdkTemplate.NanaSurveyButtonSat) {
            int i7 = onWarmupCompleted + 67;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            wie2 wie2VarOnExtraCallback7 = skipvideo.onExtraCallback();
            wie2VarOnExtraCallback7.onExtraCallback();
            jsonElementIAuthTabCallback = wie2VarOnExtraCallback7.IAuthTabCallback(SdkTemplate.NanaSurveyButtonSat.Companion.serializer(), sdkTemplate);
        } else {
            if (!(sdkTemplate instanceof SdkTemplate.IAuthTabCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            jsonElementIAuthTabCallback = new JsonObject(access8100.onNavigationEvent(getWrite.IAuthTabCallback("sdkTemplateId", initRenderFinish.onNavigationEvent(((SdkTemplate.IAuthTabCallback) sdkTemplate).onExtraCallback()))));
        }
        skipvideo.onExtraCallbackWithResult(jsonElementIAuthTabCallback);
    }
}
