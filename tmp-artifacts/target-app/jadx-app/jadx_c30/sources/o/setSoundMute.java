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
import o.qt;
import o.setSoundMute;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setSoundMute implements KSerializer<jni_YGNodeStyleSetFlexBasisPercentJNI> {
    public static final setSoundMute IAuthTabCallback = new setSoundMute();
    private static final SerialDescriptor onExtraCallbackWithResult = ujb.IAuthTabCallback("kotlinx.datetime.LocalTime/components", new SerialDescriptor[0], new Function1() { // from class: kotlinx.datetime.serializers.LocalTimeComponentSerializer$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return setSoundMute.onExtraCallbackWithResult((qt) obj);
        }
    });

    private setSoundMute() {
    }

    public SerialDescriptor getDescriptor() {
        return onExtraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetFlexBasisPercentJNI deserialize(@NotNull Decoder decoder) throws MissingFieldException, qn {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        Short shValueOf = null;
        Short shValueOf2 = null;
        short sIAuthTabCallbackStub = 0;
        int iOnTransact = 0;
        while (true) {
            setSoundMute setsoundmute = IAuthTabCallback;
            int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(setsoundmute.getDescriptor());
            if (iOnNavigationEvent == -1) {
                if (shValueOf == null) {
                    throw new MissingFieldException("hour", setsoundmute.getDescriptor().onExtraCallbackWithResult());
                }
                if (shValueOf2 == null) {
                    throw new MissingFieldException("minute", setsoundmute.getDescriptor().onExtraCallbackWithResult());
                }
                jni_YGNodeStyleSetFlexBasisPercentJNI jni_ygnodestylesetflexbasispercentjni = new jni_YGNodeStyleSetFlexBasisPercentJNI(shValueOf.shortValue(), shValueOf2.shortValue(), sIAuthTabCallbackStub, iOnTransact);
                ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
                return jni_ygnodestylesetflexbasispercentjni;
            }
            if (iOnNavigationEvent == 0) {
                shValueOf = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(setsoundmute.getDescriptor(), 0));
            } else if (iOnNavigationEvent == 1) {
                shValueOf2 = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(setsoundmute.getDescriptor(), 1));
            } else if (iOnNavigationEvent == 2) {
                sIAuthTabCallbackStub = ywVarOnWarmupCompleted.IAuthTabCallbackStub(setsoundmute.getDescriptor(), 2);
            } else if (iOnNavigationEvent == 3) {
                iOnTransact = ywVarOnWarmupCompleted.onTransact(setsoundmute.getDescriptor(), 3);
            } else {
                throw new qn("Unexpected index: " + iOnNavigationEvent);
            }
        }
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleSetFlexBasisPercentJNI jni_ygnodestylesetflexbasispercentjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetflexbasispercentjni, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor);
        setSoundMute setsoundmute = IAuthTabCallback;
        vylVarOnExtraCallback.onWarmupCompleted(setsoundmute.getDescriptor(), 0, (short) jni_ygnodestylesetflexbasispercentjni.onWarmupCompleted());
        vylVarOnExtraCallback.onWarmupCompleted(setsoundmute.getDescriptor(), 1, (short) jni_ygnodestylesetflexbasispercentjni.IAuthTabCallback());
        if (jni_ygnodestylesetflexbasispercentjni.onExtraCallback() != 0 || jni_ygnodestylesetflexbasispercentjni.onExtraCallbackWithResult() != 0) {
            vylVarOnExtraCallback.onWarmupCompleted(setsoundmute.getDescriptor(), 2, (short) jni_ygnodestylesetflexbasispercentjni.onExtraCallback());
            if (jni_ygnodestylesetflexbasispercentjni.onExtraCallbackWithResult() != 0) {
                vylVarOnExtraCallback.onExtraCallback(setsoundmute.getDescriptor(), 3, jni_ygnodestylesetflexbasispercentjni.onExtraCallbackWithResult());
            }
        }
        vylVarOnExtraCallback.onNavigationEvent(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, BuildConfig.FLAVOR);
        List listEmptyList = CollectionsKt.emptyList();
        getWriggleProgressIv getwriggleprogressiv = getWriggleProgressIv.onWarmupCompleted;
        qtVar.onExtraCallback("hour", getwriggleprogressiv.getDescriptor(), listEmptyList, false);
        qtVar.onExtraCallback("minute", getwriggleprogressiv.getDescriptor(), CollectionsKt.emptyList(), false);
        qtVar.onExtraCallback("second", getwriggleprogressiv.getDescriptor(), CollectionsKt.emptyList(), true);
        qtVar.onExtraCallback("nanosecond", getDynamicHeight.onWarmupCompleted.getDescriptor(), CollectionsKt.emptyList(), true);
        return Unit.INSTANCE;
    }
}
