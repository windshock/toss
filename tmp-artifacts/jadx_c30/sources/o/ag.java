package o;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.ag;
import o.qt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ag implements KSerializer<jni_YGNodeStyleSetAspectRatioJNI> {
    public static final ag onExtraCallback = new ag();
    private static final SerialDescriptor IAuthTabCallback = ujb.IAuthTabCallback("kotlinx.datetime.LocalDate/components", new SerialDescriptor[0], new Function1() { // from class: kotlinx.datetime.serializers.LocalDateComponentSerializer$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return ag.onNavigationEvent((qt) obj);
        }
    });

    private ag() {
    }

    public SerialDescriptor getDescriptor() {
        return IAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetAspectRatioJNI deserialize(@NotNull Decoder decoder) throws MissingFieldException, setWrite, qn {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        Integer numValueOf = null;
        Short shValueOf = null;
        Short shValueOf2 = null;
        while (true) {
            ag agVar = onExtraCallback;
            int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(agVar.getDescriptor());
            if (iOnNavigationEvent == -1) {
                if (numValueOf == null) {
                    throw new MissingFieldException("year", agVar.getDescriptor().onExtraCallbackWithResult());
                }
                if (shValueOf == null) {
                    throw new MissingFieldException("month", agVar.getDescriptor().onExtraCallbackWithResult());
                }
                if (shValueOf2 == null) {
                    throw new MissingFieldException("day", agVar.getDescriptor().onExtraCallbackWithResult());
                }
                jni_YGNodeStyleSetAspectRatioJNI jni_ygnodestylesetaspectratiojni = new jni_YGNodeStyleSetAspectRatioJNI(numValueOf.intValue(), shValueOf.shortValue(), shValueOf2.shortValue());
                ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
                return jni_ygnodestylesetaspectratiojni;
            }
            if (iOnNavigationEvent == 0) {
                numValueOf = Integer.valueOf(ywVarOnWarmupCompleted.onTransact(agVar.getDescriptor(), 0));
            } else if (iOnNavigationEvent == 1) {
                shValueOf = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(agVar.getDescriptor(), 1));
            } else if (iOnNavigationEvent == 2) {
                shValueOf2 = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(agVar.getDescriptor(), 2));
            } else {
                setStretchValue.onExtraCallback(iOnNavigationEvent);
                throw new setWrite();
            }
        }
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleSetAspectRatioJNI jni_ygnodestylesetaspectratiojni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetaspectratiojni, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor);
        ag agVar = onExtraCallback;
        vylVarOnExtraCallback.onExtraCallback(agVar.getDescriptor(), 0, jni_ygnodestylesetaspectratiojni.asInterface());
        vylVarOnExtraCallback.onWarmupCompleted(agVar.getDescriptor(), 1, (short) jni_YGNodeStyleSetFlexGrowJNI.onExtraCallback(jni_ygnodestylesetaspectratiojni.onWarmupCompleted()));
        vylVarOnExtraCallback.onWarmupCompleted(agVar.getDescriptor(), 2, (short) jni_ygnodestylesetaspectratiojni.IAuthTabCallback());
        vylVarOnExtraCallback.onNavigationEvent(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, BuildConfig.FLAVOR);
        qtVar.onExtraCallback("year", getDynamicHeight.onWarmupCompleted.getDescriptor(), CollectionsKt.emptyList(), false);
        List listEmptyList = CollectionsKt.emptyList();
        getWriggleProgressIv getwriggleprogressiv = getWriggleProgressIv.onWarmupCompleted;
        qtVar.onExtraCallback("month", getwriggleprogressiv.getDescriptor(), listEmptyList, false);
        qtVar.onExtraCallback("day", getwriggleprogressiv.getDescriptor(), CollectionsKt.emptyList(), false);
        return Unit.INSTANCE;
    }
}
