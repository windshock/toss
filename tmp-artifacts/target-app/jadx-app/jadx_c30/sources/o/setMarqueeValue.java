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
import o.qt;
import o.setMarqueeValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setMarqueeValue implements KSerializer<jni_YGNodeStyleGetMinHeightJNI> {
    public static final setMarqueeValue IAuthTabCallback = new setMarqueeValue();
    private static final SerialDescriptor onExtraCallback = ujb.IAuthTabCallback("kotlinx.datetime.DatePeriod/components", new SerialDescriptor[0], new Function1() { // from class: kotlinx.datetime.serializers.DatePeriodComponentSerializer$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return setMarqueeValue.onWarmupCompleted((qt) obj);
        }
    });

    private setMarqueeValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    public final void IAuthTabCallback(String str, long j) throws qn {
        if (j == 0) {
            return;
        }
        throw new qn("DatePeriod should have non-date components be zero, but got " + j + " in '" + str + '\'');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallbackWithResult(String str, int i) throws qn {
        IAuthTabCallback(str, i);
    }

    public SerialDescriptor getDescriptor() {
        return onExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleGetMinHeightJNI deserialize(@NotNull Decoder decoder) throws qn {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        int iOnTransact = 0;
        int iOnTransact2 = 0;
        int iOnTransact3 = 0;
        while (true) {
            setMarqueeValue setmarqueevalue = IAuthTabCallback;
            int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(setmarqueevalue.getDescriptor());
            switch (iOnNavigationEvent) {
                case -1:
                    jni_YGNodeStyleGetMinHeightJNI jni_ygnodestylegetminheightjni = new jni_YGNodeStyleGetMinHeightJNI(iOnTransact, iOnTransact2, iOnTransact3);
                    ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
                    return jni_ygnodestylegetminheightjni;
                case 0:
                    iOnTransact = ywVarOnWarmupCompleted.onTransact(setmarqueevalue.getDescriptor(), 0);
                    break;
                case 1:
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(setmarqueevalue.getDescriptor(), 1);
                    break;
                case 2:
                    iOnTransact3 = ywVarOnWarmupCompleted.onTransact(setmarqueevalue.getDescriptor(), 2);
                    break;
                case 3:
                    setmarqueevalue.onExtraCallbackWithResult("hours", ywVarOnWarmupCompleted.onTransact(setmarqueevalue.getDescriptor(), 3));
                    break;
                case 4:
                    setmarqueevalue.onExtraCallbackWithResult("minutes", ywVarOnWarmupCompleted.onTransact(setmarqueevalue.getDescriptor(), 4));
                    break;
                case 5:
                    setmarqueevalue.onExtraCallbackWithResult("seconds", ywVarOnWarmupCompleted.onTransact(setmarqueevalue.getDescriptor(), 5));
                    break;
                case 6:
                    setmarqueevalue.IAuthTabCallback("nanoseconds", ywVarOnWarmupCompleted.IAuthTabCallbackDefault(setmarqueevalue.getDescriptor(), 6));
                    break;
                default:
                    throw new qn("Unexpected index: " + iOnNavigationEvent);
            }
        }
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleGetMinHeightJNI jni_ygnodestylegetminheightjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylegetminheightjni, BuildConfig.FLAVOR);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor);
        if (jni_ygnodestylegetminheightjni.onTransact() != 0) {
            vylVarOnExtraCallback.onExtraCallback(getStretchValue.onExtraCallback.getDescriptor(), 0, jni_ygnodestylegetminheightjni.onTransact());
        }
        if (jni_ygnodestylegetminheightjni.asInterface() != 0) {
            vylVarOnExtraCallback.onExtraCallback(getStretchValue.onExtraCallback.getDescriptor(), 1, jni_ygnodestylegetminheightjni.asInterface());
        }
        if (jni_ygnodestylegetminheightjni.onNavigationEvent() != 0) {
            vylVarOnExtraCallback.onExtraCallback(getStretchValue.onExtraCallback.getDescriptor(), 2, jni_ygnodestylegetminheightjni.onNavigationEvent());
        }
        vylVarOnExtraCallback.onNavigationEvent(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(qt qtVar) {
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
