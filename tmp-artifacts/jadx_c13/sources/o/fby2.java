package o;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.format.UtcOffsetFormatKt$;
import o.fby2;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fby2 {
    private static final Lazy onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return fby2.asBinder();
        }
    });
    private static final Lazy onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return fby2.asInterface();
        }
    });
    private static final Lazy onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return fby2.onTransact();
        }
    });
    private static final bba onNavigationEvent = new bba(null, null, null, null, 15, null);

    public static final <T extends jni_YGNodeStyleSetWidthJNI> void onNavigationEvent(@NotNull T t, @NotNull fby6 fby6Var, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(fby6Var, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int i = onExtraCallback.onExtraCallbackWithResult[fby6Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                YogaNodeJNIBase.onExtraCallbackWithResult(t, null, new UtcOffsetFormatKt$.ExternalSyntheticLambda0(function1), 1, null);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                function1.invoke(t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Function1 function1, jni_YGNodeStyleSetWidthJNI jni_ygnodestylesetwidthjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetwidthjni, "");
        function1.invoke(jni_ygnodestylesetwidthjni);
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback, fby6 fby6Var, boolean z, fby6 fby6Var2) {
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.onExtraCallback(iAuthTabCallback, null, 1, null);
        onNavigationEvent(iAuthTabCallback, fby6Var, new UtcOffsetFormatKt$.ExternalSyntheticLambda19(z, fby6Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(boolean z, fby6 fby6Var, jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (z) {
            YogaNodeJNIBase.onWarmupCompleted(iAuthTabCallback, ':');
        }
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, null, 1, null);
        onNavigationEvent(iAuthTabCallback, fby6Var, new UtcOffsetFormatKt$.ExternalSyntheticLambda5(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(boolean z, jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (z) {
            YogaNodeJNIBase.onWarmupCompleted(iAuthTabCallback, ':');
        }
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(fby6 fby6Var, boolean z, fby6 fby6Var2, jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        YogaNodeJNIBase.onExtraCallback(iAuthTabCallback, new Function1[]{new UtcOffsetFormatKt$.ExternalSyntheticLambda12()}, new UtcOffsetFormatKt$.ExternalSyntheticLambda13(fby6Var, z, fby6Var2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ICustomTabsCallbackDefault(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        YogaNodeJNIBase.onWarmupCompleted(iAuthTabCallback, 'z');
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(fby6 fby6Var, boolean z, fby6 fby6Var2, jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        onNavigationEvent(iAuthTabCallback, fby6Var, z, fby6Var2);
        return Unit.INSTANCE;
    }

    public static final jwExternalSyntheticBackportWithForwarding0 IAuthTabCallbackStub() {
        return (jwExternalSyntheticBackportWithForwarding0) onExtraCallbackWithResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jwExternalSyntheticBackportWithForwarding0 asBinder() {
        return jwExternalSyntheticBackportWithForwarding0.Companion.onExtraCallback(new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.onActivityLayout((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityLayout(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        YogaNodeJNIBase.onExtraCallback(iAuthTabCallback, new Function1[]{new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.onActivityResized((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        }}, new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.onMessageChannelReady((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResized(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        iAuthTabCallback.onWarmupCompleted("z");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMessageChannelReady(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        YogaNodeJNIBase.IAuthTabCallback(iAuthTabCallback, "Z", new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.onPostMessage((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPostMessage(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.onExtraCallback(iAuthTabCallback, null, 1, null);
        YogaNodeJNIBase.onWarmupCompleted(iAuthTabCallback, ':');
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, null, 1, null);
        YogaNodeJNIBase.onExtraCallbackWithResult(iAuthTabCallback, null, new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.onMinimized((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMinimized(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        YogaNodeJNIBase.onWarmupCompleted(iAuthTabCallback, ':');
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final jwExternalSyntheticBackportWithForwarding0 IAuthTabCallbackDefault() {
        return (jwExternalSyntheticBackportWithForwarding0) onWarmupCompleted.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jwExternalSyntheticBackportWithForwarding0 asInterface() {
        return jwExternalSyntheticBackportWithForwarding0.Companion.onExtraCallback(new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.IAuthTabCallback_Parcel((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback_Parcel(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        YogaNodeJNIBase.onExtraCallback(iAuthTabCallback, new Function1[]{new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.ICustomTabsCallback((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        }}, new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.readTypedObject((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ICustomTabsCallback(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        iAuthTabCallback.onWarmupCompleted("z");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readTypedObject(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        YogaNodeJNIBase.IAuthTabCallback(iAuthTabCallback, "Z", new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.extraCallback((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit extraCallback(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.onExtraCallback(iAuthTabCallback, null, 1, null);
        YogaNodeJNIBase.onExtraCallbackWithResult(iAuthTabCallback, null, new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.extraCallbackWithResult((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit extraCallbackWithResult(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, null, 1, null);
        YogaNodeJNIBase.onExtraCallbackWithResult(iAuthTabCallback, null, new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.writeTypedObject((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeTypedObject(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final jwExternalSyntheticBackportWithForwarding0 onExtraCallbackWithResult() {
        return (jwExternalSyntheticBackportWithForwarding0) onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jwExternalSyntheticBackportWithForwarding0 onTransact() {
        return jwExternalSyntheticBackportWithForwarding0.Companion.onExtraCallback(new Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fby2.access100((jni_YGNodeStyleSetWidthJNI.IAuthTabCallback) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit access100(jni_YGNodeStyleSetWidthJNI.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.onExtraCallback(iAuthTabCallback, null, 1, null);
        jni_YGNodeStyleSetWidthJNI.IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, null, 1, null);
        return Unit.INSTANCE;
    }
}
