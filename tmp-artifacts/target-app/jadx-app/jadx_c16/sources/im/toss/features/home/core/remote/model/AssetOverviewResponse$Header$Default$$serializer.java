package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.AssetOverviewResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse$;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.widget.NumericContentResponse;
import im.toss.features.home.core.remote.model.dst.widget.NumericContentResponse$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.TBPermissionHelper;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOverviewResponse$Header$Default$$serializer implements aeu2<AssetOverviewResponse.Header.Default> {
    private static int IAuthTabCallback = 0;
    public static final AssetOverviewResponse$Header$Default$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return serialDescriptor;
    }

    static {
        AssetOverviewResponse$Header$Default$$serializer assetOverviewResponse$Header$Default$$serializer = new AssetOverviewResponse$Header$Default$$serializer();
        INSTANCE = assetOverviewResponse$Header$Default$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.AssetOverviewResponse.Header.Default", assetOverviewResponse$Header$Default$$serializer, 4);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("content", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 93;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
        }
    }

    private AssetOverviewResponse$Header$Default$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(NumericContentResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ImpressionEventLogResponse$.serializer.INSTANCE)};
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AssetOverviewResponse.Header.Default deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        HandlerResponse handlerResponse;
        NumericContentResponse numericContentResponse;
        String str;
        ImpressionEventLogResponse impressionEventLogResponse;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        HandlerResponse handlerResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            NumericContentResponse numericContentResponse2 = (NumericContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, NumericContentResponse$.serializer.INSTANCE, (Object) null);
            handlerResponse = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            str = str2;
            impressionEventLogResponse = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImpressionEventLogResponse$.serializer.INSTANCE, (Object) null);
            numericContentResponse = numericContentResponse2;
            i = 15;
        } else {
            int i5 = 0;
            boolean z = true;
            NumericContentResponse numericContentResponse3 = null;
            String str3 = null;
            ImpressionEventLogResponse impressionEventLogResponse2 = null;
            while (z) {
                int i6 = onExtraCallback + 43;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i7 = 33 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i5 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i8 = onExtraCallbackWithResult + 81;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (iOnNavigationEvent == 3) {
                                handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse2);
                                i5 |= 4;
                                int i9 = onExtraCallbackWithResult + 1;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                            } else {
                                if (iOnNavigationEvent == 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                impressionEventLogResponse2 = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImpressionEventLogResponse$.serializer.INSTANCE, impressionEventLogResponse2);
                                i5 |= 8;
                            }
                        } else if (iOnNavigationEvent == 2) {
                            handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse2);
                            i5 |= 4;
                            int i92 = onExtraCallbackWithResult + 1;
                            onExtraCallback = i92 % 128;
                            int i102 = i92 % 2;
                        } else if (iOnNavigationEvent == 3) {
                        }
                    } else {
                        numericContentResponse3 = (NumericContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, NumericContentResponse$.serializer.INSTANCE, numericContentResponse3);
                        i5 |= 2;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            i = i5;
            handlerResponse = handlerResponse2;
            numericContentResponse = numericContentResponse3;
            str = str3;
            impressionEventLogResponse = impressionEventLogResponse2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOverviewResponse.Header.Default(i, str, numericContentResponse, handlerResponse, impressionEventLogResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m526deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        AssetOverviewResponse.Header.Default defaultDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return defaultDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOverviewResponse.Header.Default r5) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(r5, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOverviewResponse.Header.Default.onExtraCallbackWithResult(r5, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOverviewResponse.Header.Default) obj);
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
