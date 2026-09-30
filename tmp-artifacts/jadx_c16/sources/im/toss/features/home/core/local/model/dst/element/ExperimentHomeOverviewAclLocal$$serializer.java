package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAclLocal;
import im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal;
import im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal$$serializer;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAclLocal$$serializer implements aeu2<ExperimentHomeOverviewAclLocal> {
    private static int IAuthTabCallback = 1;
    public static final ExperimentHomeOverviewAclLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 45;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ExperimentHomeOverviewAclLocal$$serializer experimentHomeOverviewAclLocal$$serializer = new ExperimentHomeOverviewAclLocal$$serializer();
        INSTANCE = experimentHomeOverviewAclLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAclLocal", experimentHomeOverviewAclLocal$$serializer, 4);
        setanimationsloop.onWarmupCompleted("account", false);
        setanimationsloop.onWarmupCompleted("card", false);
        setanimationsloop.onWarmupCompleted("loan", false);
        setanimationsloop.onWarmupCompleted("verticalPadding", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewAclLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAclLocal$Column$$serializer experimentHomeOverviewAclLocal$Column$$serializer = ExperimentHomeOverviewAclLocal$Column$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {experimentHomeOverviewAclLocal$Column$$serializer, experimentHomeOverviewAclLocal$Column$$serializer, experimentHomeOverviewAclLocal$Column$$serializer, VerticalPaddingLocal$$serializer.INSTANCE};
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentHomeOverviewAclLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ExperimentHomeOverviewAclLocal.Column column;
        VerticalPaddingLocal verticalPaddingLocal;
        int i;
        ExperimentHomeOverviewAclLocal.Column column2;
        ExperimentHomeOverviewAclLocal.Column column3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            ExperimentHomeOverviewAclLocal$Column$$serializer experimentHomeOverviewAclLocal$Column$$serializer = ExperimentHomeOverviewAclLocal$Column$$serializer.INSTANCE;
            ExperimentHomeOverviewAclLocal.Column column4 = (ExperimentHomeOverviewAclLocal.Column) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, experimentHomeOverviewAclLocal$Column$$serializer, (Object) null);
            ExperimentHomeOverviewAclLocal.Column column5 = (ExperimentHomeOverviewAclLocal.Column) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, experimentHomeOverviewAclLocal$Column$$serializer, (Object) null);
            column = (ExperimentHomeOverviewAclLocal.Column) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, experimentHomeOverviewAclLocal$Column$$serializer, (Object) null);
            verticalPaddingLocal = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, VerticalPaddingLocal$$serializer.INSTANCE, (Object) null);
            i = 15;
            column2 = column4;
            column3 = column5;
        } else {
            int i5 = 0;
            boolean z = true;
            ExperimentHomeOverviewAclLocal.Column column6 = null;
            VerticalPaddingLocal verticalPaddingLocal2 = null;
            ExperimentHomeOverviewAclLocal.Column column7 = null;
            ExperimentHomeOverviewAclLocal.Column column8 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 59;
                    int i7 = i6 % 128;
                    IAuthTabCallback = i7;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i8 = i7 + 31;
                        int i9 = i8 % 128;
                        onExtraCallback = i9;
                        if (i8 % 2 != 0) {
                            if (iOnNavigationEvent == 0) {
                                column8 = (ExperimentHomeOverviewAclLocal.Column) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeOverviewAclLocal$Column$$serializer.INSTANCE, column8);
                                i5 |= 2;
                            } else if (iOnNavigationEvent == 2) {
                                int i10 = i9 + 1;
                                IAuthTabCallback = i10 % 128;
                                if (i10 % 2 == 0) {
                                    if (iOnNavigationEvent != 4) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    verticalPaddingLocal2 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, VerticalPaddingLocal$$serializer.INSTANCE, verticalPaddingLocal2);
                                    i5 |= 8;
                                    int i11 = IAuthTabCallback + 87;
                                    onExtraCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                } else {
                                    if (iOnNavigationEvent != 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    verticalPaddingLocal2 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, VerticalPaddingLocal$$serializer.INSTANCE, verticalPaddingLocal2);
                                    i5 |= 8;
                                    int i112 = IAuthTabCallback + 87;
                                    onExtraCallback = i112 % 128;
                                    int i122 = i112 % 2;
                                }
                            } else {
                                column6 = (ExperimentHomeOverviewAclLocal.Column) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ExperimentHomeOverviewAclLocal$Column$$serializer.INSTANCE, column6);
                                i5 |= 4;
                            }
                        } else if (iOnNavigationEvent == 1) {
                            column8 = (ExperimentHomeOverviewAclLocal.Column) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeOverviewAclLocal$Column$$serializer.INSTANCE, column8);
                            i5 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                        }
                    } else {
                        column7 = (ExperimentHomeOverviewAclLocal.Column) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAclLocal$Column$$serializer.INSTANCE, column7);
                        i5 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            column = column6;
            verticalPaddingLocal = verticalPaddingLocal2;
            i = i5;
            column2 = column7;
            column3 = column8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAclLocal(i, column2, column3, column, verticalPaddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m349deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        ExperimentHomeOverviewAclLocal experimentHomeOverviewAclLocalDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return experimentHomeOverviewAclLocalDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAclLocal experimentHomeOverviewAclLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(experimentHomeOverviewAclLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeOverviewAclLocal.IAuthTabCallback(experimentHomeOverviewAclLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 29 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(experimentHomeOverviewAclLocal, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ExperimentHomeOverviewAclLocal.IAuthTabCallback(experimentHomeOverviewAclLocal, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAclLocal) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
