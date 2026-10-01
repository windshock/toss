package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.AssetOverviewResponse;
import im.toss.features.home.core.remote.model.dst.element.AttentionAmountTopResponse;
import im.toss.features.home.core.remote.model.dst.element.AttentionAmountTopResponse$;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
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
public final /* synthetic */ class AssetOverviewResponse$Header$AttentionAmountTop$$serializer implements aeu2<AssetOverviewResponse.Header.AttentionAmountTop> {
    private static int IAuthTabCallback = 1;
    public static final AssetOverviewResponse$Header$AttentionAmountTop$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 3;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AssetOverviewResponse$Header$AttentionAmountTop$$serializer assetOverviewResponse$Header$AttentionAmountTop$$serializer = new AssetOverviewResponse$Header$AttentionAmountTop$$serializer();
        INSTANCE = assetOverviewResponse$Header$AttentionAmountTop$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.AssetOverviewResponse.Header.AttentionAmountTop", assetOverviewResponse$Header$AttentionAmountTop$$serializer, 4);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("attentionAmountTop", false);
        setanimationsloop.onWarmupCompleted("attentionFloatingButton", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 89;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }

    private AssetOverviewResponse$Header$AttentionAmountTop$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(ImpressionEventLogResponse$.serializer.INSTANCE), sp.IAuthTabCallback(AttentionAmountTopResponse$.serializer.INSTANCE), sp.IAuthTabCallback(AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AssetOverviewResponse.Header.AttentionAmountTop deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImpressionEventLogResponse impressionEventLogResponse;
        AttentionAmountTopResponse attentionAmountTopResponse;
        String str;
        AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton attentionFloatingButton;
        int i;
        int iOnNavigationEvent;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        AttentionAmountTopResponse attentionAmountTopResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            ImpressionEventLogResponse impressionEventLogResponse2 = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogResponse$.serializer.INSTANCE, (Object) null);
            AttentionAmountTopResponse attentionAmountTopResponse3 = (AttentionAmountTopResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, AttentionAmountTopResponse$.serializer.INSTANCE, (Object) null);
            str = str2;
            attentionFloatingButton = (AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer.INSTANCE, (Object) null);
            impressionEventLogResponse = impressionEventLogResponse2;
            i = 15;
            attentionAmountTopResponse = attentionAmountTopResponse3;
        } else {
            int i4 = onWarmupCompleted + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            boolean z = true;
            int i6 = 0;
            ImpressionEventLogResponse impressionEventLogResponse3 = null;
            String str3 = null;
            AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton attentionFloatingButton2 = null;
            while (z) {
                int i7 = IAuthTabCallback + 115;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i8 = 9 / 0;
                    if (iOnNavigationEvent != -1) {
                        if (iOnNavigationEvent == 0) {
                            int i9 = onWarmupCompleted + 61;
                            int i10 = i9 % 128;
                            IAuthTabCallback = i10;
                            if (i9 % 2 == 0) {
                                if (iOnNavigationEvent == 0) {
                                    impressionEventLogResponse3 = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogResponse$.serializer.INSTANCE, impressionEventLogResponse3);
                                    i6 |= 2;
                                } else if (iOnNavigationEvent == 2) {
                                    int i11 = i10 + 107;
                                    onWarmupCompleted = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        if (iOnNavigationEvent != 4) {
                                            throw new UnknownFieldException(iOnNavigationEvent);
                                        }
                                        attentionFloatingButton2 = (AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer.INSTANCE, attentionFloatingButton2);
                                        i6 |= 8;
                                        i2 = onWarmupCompleted + 53;
                                    } else {
                                        if (iOnNavigationEvent != 3) {
                                            throw new UnknownFieldException(iOnNavigationEvent);
                                        }
                                        attentionFloatingButton2 = (AssetOverviewResponse.Header.AttentionAmountTop.AttentionFloatingButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, AssetOverviewResponse$Header$AttentionAmountTop$AttentionFloatingButton$$serializer.INSTANCE, attentionFloatingButton2);
                                        i6 |= 8;
                                        i2 = onWarmupCompleted + 53;
                                    }
                                } else {
                                    attentionAmountTopResponse2 = (AttentionAmountTopResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, AttentionAmountTopResponse$.serializer.INSTANCE, attentionAmountTopResponse2);
                                    i6 |= 4;
                                }
                            } else if (iOnNavigationEvent == 1) {
                                impressionEventLogResponse3 = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogResponse$.serializer.INSTANCE, impressionEventLogResponse3);
                                i6 |= 2;
                            } else if (iOnNavigationEvent == 2) {
                            }
                        } else {
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                            i6 |= 1;
                            i2 = onWarmupCompleted + 119;
                        }
                        IAuthTabCallback = i2 % 128;
                        int i12 = i2 % 2;
                    } else {
                        z = false;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        if (iOnNavigationEvent == 0) {
                        }
                        IAuthTabCallback = i2 % 128;
                        int i122 = i2 % 2;
                    } else {
                        z = false;
                    }
                }
            }
            impressionEventLogResponse = impressionEventLogResponse3;
            attentionAmountTopResponse = attentionAmountTopResponse2;
            str = str3;
            attentionFloatingButton = attentionFloatingButton2;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        AssetOverviewResponse.Header.AttentionAmountTop attentionAmountTop = new AssetOverviewResponse.Header.AttentionAmountTop(i, str, impressionEventLogResponse, attentionAmountTopResponse, attentionFloatingButton, (okycx) null);
        int i13 = IAuthTabCallback + 49;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 59 / 0;
        }
        return attentionAmountTop;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m524deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AssetOverviewResponse.Header.AttentionAmountTop attentionAmountTopDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return attentionAmountTopDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOverviewResponse.Header.AttentionAmountTop attentionAmountTop) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(attentionAmountTop, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOverviewResponse.Header.AttentionAmountTop.onExtraCallback(attentionAmountTop, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOverviewResponse.Header.AttentionAmountTop) obj);
        int i4 = IAuthTabCallback + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
