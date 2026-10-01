package o;

import j$.time.DateTimeException;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final /* synthetic */ class jni_YGNodeStyleSetHeightJNI {
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.jni_YGNodeStyleGetMarginJNI */
    public static final jni_YGNodeStyleSetFlexBasisJNI onWarmupCompleted(@NotNull setRevisionBytes setrevisionbytes, @NotNull jni_YGNodeStyleSetMarginAutoJNI jni_ygnodestylesetmarginautojni) throws jni_YGNodeStyleGetMarginJNI {
        Intrinsics.checkNotNullParameter(setrevisionbytes, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetmarginautojni, BuildConfig.FLAVOR);
        try {
            return new jni_YGNodeStyleSetFlexBasisJNI(LocalDateTime.ofInstant(getBuildFingerprintBytes.onExtraCallbackWithResult(setrevisionbytes), jni_ygnodestylesetmarginautojni.onExtraCallbackWithResult()));
        } catch (DateTimeException e) {
            throw new jni_YGNodeStyleGetMarginJNI(e);
        }
    }
}
