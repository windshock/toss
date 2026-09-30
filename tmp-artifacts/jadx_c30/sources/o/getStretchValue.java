package o;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.getStretchValue;
import o.qt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getStretchValue implements KSerializer<jni_YGNodeStyleGetPaddingJNI> {
    public static final getStretchValue onExtraCallback = new getStretchValue();
    private static final SerialDescriptor onWarmupCompleted = ujb.IAuthTabCallback("kotlinx.datetime.DateTimePeriod/components", new SerialDescriptor[0], new Function1() { // from class: kotlinx.datetime.serializers.DateTimePeriodComponentSerializer$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return getStretchValue.onNavigationEvent((qt) obj);
        }
    });

    private getStretchValue() {
    }

    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleGetPaddingJNI deserialize(@NotNull Decoder decoder) throws qn {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        int iOnTransact = 0;
        int iOnTransact2 = 0;
        int iOnTransact3 = 0;
        int iOnTransact4 = 0;
        int iOnTransact5 = 0;
        int iOnTransact6 = 0;
        long jIAuthTabCallbackDefault = 0;
        while (true) {
            getStretchValue getstretchvalue = onExtraCallback;
            int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(getstretchvalue.getDescriptor());
            switch (iOnNavigationEvent) {
                case -1:
                    jni_YGNodeStyleGetPaddingJNI jni_ygnodestylegetpaddingjniOnExtraCallbackWithResult = jni_YGNodeStyleGetWidthJNI.onExtraCallbackWithResult(iOnTransact, iOnTransact2, iOnTransact3, iOnTransact4, iOnTransact5, iOnTransact6, jIAuthTabCallbackDefault);
                    ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
                    return jni_ygnodestylegetpaddingjniOnExtraCallbackWithResult;
                case 0:
                    iOnTransact = ywVarOnWarmupCompleted.onTransact(getstretchvalue.getDescriptor(), 0);
                    break;
                case 1:
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(getstretchvalue.getDescriptor(), 1);
                    break;
                case 2:
                    iOnTransact3 = ywVarOnWarmupCompleted.onTransact(getstretchvalue.getDescriptor(), 2);
                    break;
                case 3:
                    iOnTransact4 = ywVarOnWarmupCompleted.onTransact(getstretchvalue.getDescriptor(), 3);
                    break;
                case 4:
                    iOnTransact5 = ywVarOnWarmupCompleted.onTransact(getstretchvalue.getDescriptor(), 4);
                    break;
                case 5:
                    iOnTransact6 = ywVarOnWarmupCompleted.onTransact(getstretchvalue.getDescriptor(), 5);
                    break;
                case 6:
                    jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(getstretchvalue.getDescriptor(), 6);
                    break;
                default:
                    throw new qn("Unexpected index: " + iOnNavigationEvent);
            }
        }
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleGetPaddingJNI jni_ygnodestylegetpaddingjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylegetpaddingjni, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor);
        if (jni_ygnodestylegetpaddingjni.onTransact() != 0) {
            vylVarOnExtraCallback.onExtraCallback(onExtraCallback.getDescriptor(), 0, jni_ygnodestylegetpaddingjni.onTransact());
        }
        if (jni_ygnodestylegetpaddingjni.asInterface() != 0) {
            vylVarOnExtraCallback.onExtraCallback(onExtraCallback.getDescriptor(), 1, jni_ygnodestylegetpaddingjni.asInterface());
        }
        if (jni_ygnodestylegetpaddingjni.onNavigationEvent() != 0) {
            vylVarOnExtraCallback.onExtraCallback(onExtraCallback.getDescriptor(), 2, jni_ygnodestylegetpaddingjni.onNavigationEvent());
        }
        if (jni_ygnodestylegetpaddingjni.onWarmupCompleted() != 0) {
            vylVarOnExtraCallback.onExtraCallback(onExtraCallback.getDescriptor(), 3, jni_ygnodestylegetpaddingjni.onWarmupCompleted());
        }
        if (jni_ygnodestylegetpaddingjni.IAuthTabCallback() != 0) {
            vylVarOnExtraCallback.onExtraCallback(onExtraCallback.getDescriptor(), 4, jni_ygnodestylegetpaddingjni.IAuthTabCallback());
        }
        if (jni_ygnodestylegetpaddingjni.onExtraCallback() != 0) {
            vylVarOnExtraCallback.onExtraCallback(onExtraCallback.getDescriptor(), 5, jni_ygnodestylegetpaddingjni.onExtraCallback());
        }
        if (jni_ygnodestylegetpaddingjni.onExtraCallbackWithResult() != 0) {
            vylVarOnExtraCallback.onExtraCallback(onExtraCallback.getDescriptor(), 6, jni_ygnodestylegetpaddingjni.onExtraCallbackWithResult());
        }
        vylVarOnExtraCallback.onNavigationEvent(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, BuildConfig.FLAVOR);
        List listEmptyList = CollectionsKt.emptyList();
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        qtVar.onExtraCallback("years", getdynamicheight.getDescriptor(), listEmptyList, true);
        qtVar.onExtraCallback("months", getdynamicheight.getDescriptor(), CollectionsKt.emptyList(), true);
        qtVar.onExtraCallback("days", getdynamicheight.getDescriptor(), CollectionsKt.emptyList(), true);
        qtVar.onExtraCallback("hours", getdynamicheight.getDescriptor(), CollectionsKt.emptyList(), true);
        qtVar.onExtraCallback("minutes", getdynamicheight.getDescriptor(), CollectionsKt.emptyList(), true);
        qtVar.onExtraCallback("seconds", getdynamicheight.getDescriptor(), CollectionsKt.emptyList(), true);
        qtVar.onExtraCallback("nanoseconds", oty1.onExtraCallback.getDescriptor(), CollectionsKt.emptyList(), true);
        return Unit.INSTANCE;
    }
}
