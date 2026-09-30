package o;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.jni_YGNodeStyleSetWidthJNI;
import o.zbdj;
import o.zbsya;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class zbdj {
    private static final List<Character> onExtraCallback = CollectionsKt.plus(CollectionsKt.plus(new getUnreadableElfFiles('a', 'z'), new getUnreadableElfFiles('A', 'Z')), CollectionsKt.listOf(new Character[]{'[', ']', '\''}));

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void IAuthTabCallback(jni_YGNodeStyleSetWidthJNI jni_ygnodestylesetwidthjni, final zbsya zbsyaVar) throws NoWhenBranchMatchedException {
        if (zbsyaVar instanceof zbsya.onExtraCallback) {
            jni_ygnodestylesetwidthjni.onWarmupCompleted(((zbsya.onExtraCallback) zbsyaVar).onNavigationEvent());
            return;
        }
        if (!(zbsyaVar instanceof zbsya.onWarmupCompleted)) {
            if (zbsyaVar instanceof zbsya.IAuthTabCallback) {
                YogaNodeJNIBase.onExtraCallback(jni_ygnodestylesetwidthjni, new Function1[]{new Function1() { // from class: kotlinx.datetime.format.UnicodeKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return zbdj.IAuthTabCallback((jni_YGNodeStyleSetWidthJNI) obj);
                    }
                }}, new Function1() { // from class: kotlinx.datetime.format.UnicodeKt$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return zbdj.onExtraCallback(zbsyaVar, (jni_YGNodeStyleSetWidthJNI) obj);
                    }
                });
                return;
            }
            if (!(zbsyaVar instanceof zbsya.onNavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            zbsya.onNavigationEvent onnavigationevent = (zbsya.onNavigationEvent) zbsyaVar;
            if (onnavigationevent instanceof zbsya.onNavigationEvent.IAuthTabCallback) {
                if (!(jni_ygnodestylesetwidthjni instanceof jni_YGNodeStyleSetWidthJNI.onWarmupCompleted)) {
                    throw new IllegalArgumentException(("A time-based directive " + zbsyaVar + " was used in a format builder that doesn't support time components").toString());
                }
                return;
            }
            if (onnavigationevent instanceof zbsya.onNavigationEvent.onExtraCallback) {
                if (!(jni_ygnodestylesetwidthjni instanceof jni_YGNodeStyleSetWidthJNI.asBinder)) {
                    throw new IllegalArgumentException(("A year-month-based directive " + zbsyaVar + " was used in a format builder that doesn't support year-month components").toString());
                }
                return;
            }
            if (onnavigationevent instanceof zbsya.onNavigationEvent.onWarmupCompleted) {
                if (!(jni_ygnodestylesetwidthjni instanceof jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult)) {
                    throw new IllegalArgumentException(("A date-based directive " + zbsyaVar + " was used in a format builder that doesn't support date components").toString());
                }
                return;
            }
            if (onnavigationevent instanceof zbsya.onNavigationEvent.onExtraCallbackWithResult) {
                if (!(jni_ygnodestylesetwidthjni instanceof jni_YGNodeStyleSetWidthJNI.onExtraCallback)) {
                    throw new IllegalArgumentException(("A time-zone-based directive " + zbsyaVar + " was used in a format builder that doesn't support time-zone components").toString());
                }
                return;
            }
            if (onnavigationevent instanceof zbsya.onNavigationEvent.AbstractC0006onNavigationEvent) {
                if (!(jni_ygnodestylesetwidthjni instanceof jni_YGNodeStyleSetWidthJNI.IAuthTabCallback)) {
                    throw new IllegalArgumentException(("A UTC-offset-based directive " + zbsyaVar + " was used in a format builder that doesn't support UTC offset components").toString());
                }
                return;
            }
            if (!(onnavigationevent instanceof sya42)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("The meaning of the directive '" + zbsyaVar + "' is unknown");
        }
        Iterator<T> it = ((zbsya.onWarmupCompleted) zbsyaVar).onExtraCallbackWithResult().iterator();
        while (it.hasNext()) {
            IAuthTabCallback(jni_ygnodestylesetwidthjni, (zbsya) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(jni_YGNodeStyleSetWidthJNI jni_ygnodestylesetwidthjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetwidthjni, BuildConfig.FLAVOR);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(zbsya zbsyaVar, jni_YGNodeStyleSetWidthJNI jni_ygnodestylesetwidthjni) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetwidthjni, BuildConfig.FLAVOR);
        IAuthTabCallback(jni_ygnodestylesetwidthjni, ((zbsya.IAuthTabCallback) zbsyaVar).onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }
}
