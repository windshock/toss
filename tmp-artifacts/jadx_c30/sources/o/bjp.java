package o;

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
import o.bjp;
import o.qt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class bjp implements KSerializer<jni_YGNodeStyleSetHeightPercentJNI> {
    public static final bjp onExtraCallback = new bjp();
    private static final SerialDescriptor onWarmupCompleted = ujb.IAuthTabCallback("kotlinx.datetime.YearMonth/components", new SerialDescriptor[0], new Function1() { // from class: kotlinx.datetime.serializers.YearMonthComponentSerializer$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return bjp.onWarmupCompleted((qt) obj);
        }
    });

    private bjp() {
    }

    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetHeightPercentJNI deserialize(@NotNull Decoder decoder) throws MissingFieldException, setWrite, qn {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        Integer numValueOf = null;
        Short shValueOf = null;
        while (true) {
            bjp bjpVar = onExtraCallback;
            int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(bjpVar.getDescriptor());
            if (iOnNavigationEvent == -1) {
                if (numValueOf == null) {
                    throw new MissingFieldException("year", bjpVar.getDescriptor().onExtraCallbackWithResult());
                }
                if (shValueOf == null) {
                    throw new MissingFieldException("month", bjpVar.getDescriptor().onExtraCallbackWithResult());
                }
                jni_YGNodeStyleSetHeightPercentJNI jni_ygnodestylesetheightpercentjni = new jni_YGNodeStyleSetHeightPercentJNI(numValueOf.intValue(), shValueOf.shortValue());
                ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
                return jni_ygnodestylesetheightpercentjni;
            }
            if (iOnNavigationEvent == 0) {
                numValueOf = Integer.valueOf(ywVarOnWarmupCompleted.onTransact(bjpVar.getDescriptor(), 0));
            } else if (iOnNavigationEvent == 1) {
                shValueOf = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(bjpVar.getDescriptor(), 1));
            } else {
                setStretchValue.onExtraCallback(iOnNavigationEvent);
                throw new setWrite();
            }
        }
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleSetHeightPercentJNI jni_ygnodestylesetheightpercentjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetheightpercentjni, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor);
        bjp bjpVar = onExtraCallback;
        vylVarOnExtraCallback.onExtraCallback(bjpVar.getDescriptor(), 0, jni_ygnodestylesetheightpercentjni.onWarmupCompleted());
        vylVarOnExtraCallback.onWarmupCompleted(bjpVar.getDescriptor(), 1, (short) jni_YGNodeStyleSetFlexGrowJNI.onExtraCallback(jni_ygnodestylesetheightpercentjni.IAuthTabCallback()));
        vylVarOnExtraCallback.onNavigationEvent(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, BuildConfig.FLAVOR);
        qtVar.onExtraCallback("year", getDynamicHeight.onWarmupCompleted.getDescriptor(), CollectionsKt.emptyList(), false);
        qtVar.onExtraCallback("month", getWriggleProgressIv.onWarmupCompleted.getDescriptor(), CollectionsKt.emptyList(), false);
        return Unit.INSTANCE;
    }
}
