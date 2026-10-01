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
import o.onvideoComplate;
import o.qt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onvideoComplate implements KSerializer<jni_YGNodeStyleSetFlexBasisJNI> {
    public static final onvideoComplate onExtraCallback = new onvideoComplate();
    private static final SerialDescriptor onNavigationEvent = ujb.IAuthTabCallback("kotlinx.datetime.LocalDateTime/components", new SerialDescriptor[0], new Function1() { // from class: kotlinx.datetime.serializers.LocalDateTimeComponentSerializer$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return onvideoComplate.onExtraCallbackWithResult((qt) obj);
        }
    });

    private onvideoComplate() {
    }

    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetFlexBasisJNI deserialize(@NotNull Decoder decoder) throws MissingFieldException, qn {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        Integer numValueOf = null;
        Short shValueOf = null;
        Short shValueOf2 = null;
        Short shValueOf3 = null;
        Short shValueOf4 = null;
        short sIAuthTabCallbackStub = 0;
        int iOnTransact = 0;
        while (true) {
            onvideoComplate onvideocomplate = onExtraCallback;
            int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(onvideocomplate.getDescriptor());
            switch (iOnNavigationEvent) {
                case -1:
                    if (numValueOf == null) {
                        throw new MissingFieldException("year", onvideocomplate.getDescriptor().onExtraCallbackWithResult());
                    }
                    if (shValueOf == null) {
                        throw new MissingFieldException("month", onvideocomplate.getDescriptor().onExtraCallbackWithResult());
                    }
                    if (shValueOf2 == null) {
                        throw new MissingFieldException("day", onvideocomplate.getDescriptor().onExtraCallbackWithResult());
                    }
                    if (shValueOf3 == null) {
                        throw new MissingFieldException("hour", onvideocomplate.getDescriptor().onExtraCallbackWithResult());
                    }
                    if (shValueOf4 == null) {
                        throw new MissingFieldException("minute", onvideocomplate.getDescriptor().onExtraCallbackWithResult());
                    }
                    jni_YGNodeStyleSetFlexBasisJNI jni_ygnodestylesetflexbasisjni = new jni_YGNodeStyleSetFlexBasisJNI(numValueOf.intValue(), shValueOf.shortValue(), shValueOf2.shortValue(), shValueOf3.shortValue(), shValueOf4.shortValue(), sIAuthTabCallbackStub, iOnTransact);
                    ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
                    return jni_ygnodestylesetflexbasisjni;
                case 0:
                    numValueOf = Integer.valueOf(ywVarOnWarmupCompleted.onTransact(onvideocomplate.getDescriptor(), 0));
                    break;
                case 1:
                    shValueOf = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(onvideocomplate.getDescriptor(), 1));
                    break;
                case 2:
                    shValueOf2 = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(onvideocomplate.getDescriptor(), 2));
                    break;
                case 3:
                    shValueOf3 = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(onvideocomplate.getDescriptor(), 3));
                    break;
                case 4:
                    shValueOf4 = Short.valueOf(ywVarOnWarmupCompleted.IAuthTabCallbackStub(onvideocomplate.getDescriptor(), 4));
                    break;
                case 5:
                    sIAuthTabCallbackStub = ywVarOnWarmupCompleted.IAuthTabCallbackStub(onvideocomplate.getDescriptor(), 5);
                    break;
                case 6:
                    iOnTransact = ywVarOnWarmupCompleted.onTransact(onvideocomplate.getDescriptor(), 6);
                    break;
                default:
                    throw new qn("Unexpected index: " + iOnNavigationEvent);
            }
        }
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleSetFlexBasisJNI jni_ygnodestylesetflexbasisjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetflexbasisjni, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor);
        onvideoComplate onvideocomplate = onExtraCallback;
        vylVarOnExtraCallback.onExtraCallback(onvideocomplate.getDescriptor(), 0, jni_ygnodestylesetflexbasisjni.IAuthTabCallbackDefault());
        vylVarOnExtraCallback.onWarmupCompleted(onvideocomplate.getDescriptor(), 1, (short) jni_YGNodeStyleSetFlexGrowJNI.onExtraCallback(jni_ygnodestylesetflexbasisjni.onExtraCallbackWithResult()));
        vylVarOnExtraCallback.onWarmupCompleted(onvideocomplate.getDescriptor(), 2, (short) jni_ygnodestylesetflexbasisjni.IAuthTabCallback());
        vylVarOnExtraCallback.onWarmupCompleted(onvideocomplate.getDescriptor(), 3, (short) jni_ygnodestylesetflexbasisjni.onExtraCallback());
        vylVarOnExtraCallback.onWarmupCompleted(onvideocomplate.getDescriptor(), 4, (short) jni_ygnodestylesetflexbasisjni.onWarmupCompleted());
        if (jni_ygnodestylesetflexbasisjni.onTransact() != 0 || jni_ygnodestylesetflexbasisjni.asInterface() != 0) {
            vylVarOnExtraCallback.onWarmupCompleted(onvideocomplate.getDescriptor(), 5, (short) jni_ygnodestylesetflexbasisjni.onTransact());
            if (jni_ygnodestylesetflexbasisjni.asInterface() != 0) {
                vylVarOnExtraCallback.onExtraCallback(onvideocomplate.getDescriptor(), 6, jni_ygnodestylesetflexbasisjni.asInterface());
            }
        }
        vylVarOnExtraCallback.onNavigationEvent(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, BuildConfig.FLAVOR);
        List listEmptyList = CollectionsKt.emptyList();
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        qtVar.onExtraCallback("year", getdynamicheight.getDescriptor(), listEmptyList, false);
        List listEmptyList2 = CollectionsKt.emptyList();
        getWriggleProgressIv getwriggleprogressiv = getWriggleProgressIv.onWarmupCompleted;
        qtVar.onExtraCallback("month", getwriggleprogressiv.getDescriptor(), listEmptyList2, false);
        qtVar.onExtraCallback("day", getwriggleprogressiv.getDescriptor(), CollectionsKt.emptyList(), false);
        qtVar.onExtraCallback("hour", getwriggleprogressiv.getDescriptor(), CollectionsKt.emptyList(), false);
        qtVar.onExtraCallback("minute", getwriggleprogressiv.getDescriptor(), CollectionsKt.emptyList(), false);
        qtVar.onExtraCallback("second", getwriggleprogressiv.getDescriptor(), CollectionsKt.emptyList(), true);
        qtVar.onExtraCallback("nanosecond", getdynamicheight.getDescriptor(), CollectionsKt.emptyList(), true);
        return Unit.INSTANCE;
    }
}
