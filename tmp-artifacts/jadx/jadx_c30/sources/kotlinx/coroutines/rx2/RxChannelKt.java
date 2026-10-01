package kotlinx.coroutines.rx2;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.channels.ReceiveChannel;
import o.access13800;
import o.access14300;
import o.av;
import o.jni_YGNodeCopyStyleJNI;
import o.nUnlockFile;
import o.serializeRaw;
import o.writeAscii;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RxChannelKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:26:0x0064, B:28:0x006c, B:29:0x0076), top: B:42:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:26:0x0064, B:28:0x006c, B:29:0x0076), top: B:42:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object IAuthTabCallback(@NotNull writeAscii<T> writeascii, @NotNull Function1<? super T, Unit> function1, @NotNull access13800<? super Unit> access13800Var) {
        RxChannelKt$collect$1 rxChannelKt$collect$1;
        ReceiveChannel receiveChannel;
        Throwable th;
        ReceiveChannel receiveChannel2;
        nUnlockFile nunlockfileWriteTypedObject;
        Object objOnWarmupCompleted;
        if (access13800Var instanceof RxChannelKt$collect$1) {
            rxChannelKt$collect$1 = (RxChannelKt$collect$1) access13800Var;
            int i = rxChannelKt$collect$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                rxChannelKt$collect$1.label = i + PKIFailureInfo.systemUnavail;
            } else {
                rxChannelKt$collect$1 = new RxChannelKt$collect$1(access13800Var);
            }
        }
        Object obj = rxChannelKt$collect$1.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i2 = rxChannelKt$collect$1.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            ReceiveChannel receiveChannelOnExtraCallback = onExtraCallback(writeascii);
            try {
                receiveChannel2 = receiveChannelOnExtraCallback;
                nunlockfileWriteTypedObject = receiveChannelOnExtraCallback.writeTypedObject();
                rxChannelKt$collect$1.L$0 = function1;
                rxChannelKt$collect$1.L$1 = receiveChannel2;
                rxChannelKt$collect$1.L$2 = nunlockfileWriteTypedObject;
                rxChannelKt$collect$1.label = 1;
                objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(rxChannelKt$collect$1);
                if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                }
            } catch (Throwable th2) {
                receiveChannel = receiveChannelOnExtraCallback;
                th = th2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nunlockfileWriteTypedObject = (nUnlockFile) rxChannelKt$collect$1.L$2;
            receiveChannel = (ReceiveChannel) rxChannelKt$collect$1.L$1;
            Function1<? super T, Unit> function12 = (Function1) rxChannelKt$collect$1.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                RxChannelKt$collect$1 rxChannelKt$collect$12 = rxChannelKt$collect$1;
                ReceiveChannel receiveChannel3 = receiveChannel;
                function1 = function12;
                RxChannelKt$collect$1 rxChannelKt$collect$13 = rxChannelKt$collect$12;
                try {
                    if (!((Boolean) obj).booleanValue()) {
                        function1.invoke(nunlockfileWriteTypedObject.onNavigationEvent());
                        receiveChannel2 = receiveChannel3;
                        rxChannelKt$collect$1 = rxChannelKt$collect$13;
                        try {
                            rxChannelKt$collect$1.L$0 = function1;
                            rxChannelKt$collect$1.L$1 = receiveChannel2;
                            rxChannelKt$collect$1.L$2 = nunlockfileWriteTypedObject;
                            rxChannelKt$collect$1.label = 1;
                            objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(rxChannelKt$collect$1);
                            if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                                return objOnWarmupCompleted2;
                            }
                            rxChannelKt$collect$12 = rxChannelKt$collect$1;
                            receiveChannel3 = receiveChannel2;
                            obj = objOnWarmupCompleted;
                            RxChannelKt$collect$1 rxChannelKt$collect$132 = rxChannelKt$collect$12;
                            if (!((Boolean) obj).booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                InlineMarker.finallyStart(1);
                                av.onExtraCallback(receiveChannel3, (Throwable) null);
                                InlineMarker.finallyEnd(1);
                                return unit;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            receiveChannel = receiveChannel2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    receiveChannel = receiveChannel3;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        try {
            throw th;
        } catch (Throwable th6) {
            InlineMarker.finallyStart(1);
            av.onExtraCallback(receiveChannel, th);
            InlineMarker.finallyEnd(1);
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:26:0x0064, B:28:0x006c, B:29:0x0076), top: B:42:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:26:0x0064, B:28:0x006c, B:29:0x0076), top: B:42:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onWarmupCompleted(@NotNull serializeRaw<T> serializeraw, @NotNull Function1<? super T, Unit> function1, @NotNull access13800<? super Unit> access13800Var) {
        RxChannelKt$collect$2 rxChannelKt$collect$2;
        ReceiveChannel receiveChannel;
        Throwable th;
        ReceiveChannel receiveChannel2;
        nUnlockFile nunlockfileWriteTypedObject;
        Object objOnWarmupCompleted;
        if (access13800Var instanceof RxChannelKt$collect$2) {
            rxChannelKt$collect$2 = (RxChannelKt$collect$2) access13800Var;
            int i = rxChannelKt$collect$2.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                rxChannelKt$collect$2.label = i + PKIFailureInfo.systemUnavail;
            } else {
                rxChannelKt$collect$2 = new RxChannelKt$collect$2(access13800Var);
            }
        }
        Object obj = rxChannelKt$collect$2.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i2 = rxChannelKt$collect$2.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            ReceiveChannel receiveChannelOnExtraCallback = onExtraCallback(serializeraw);
            try {
                receiveChannel2 = receiveChannelOnExtraCallback;
                nunlockfileWriteTypedObject = receiveChannelOnExtraCallback.writeTypedObject();
                rxChannelKt$collect$2.L$0 = function1;
                rxChannelKt$collect$2.L$1 = receiveChannel2;
                rxChannelKt$collect$2.L$2 = nunlockfileWriteTypedObject;
                rxChannelKt$collect$2.label = 1;
                objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(rxChannelKt$collect$2);
                if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                }
            } catch (Throwable th2) {
                receiveChannel = receiveChannelOnExtraCallback;
                th = th2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nunlockfileWriteTypedObject = (nUnlockFile) rxChannelKt$collect$2.L$2;
            receiveChannel = (ReceiveChannel) rxChannelKt$collect$2.L$1;
            Function1<? super T, Unit> function12 = (Function1) rxChannelKt$collect$2.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                RxChannelKt$collect$2 rxChannelKt$collect$22 = rxChannelKt$collect$2;
                ReceiveChannel receiveChannel3 = receiveChannel;
                function1 = function12;
                RxChannelKt$collect$2 rxChannelKt$collect$23 = rxChannelKt$collect$22;
                try {
                    if (!((Boolean) obj).booleanValue()) {
                        function1.invoke(nunlockfileWriteTypedObject.onNavigationEvent());
                        receiveChannel2 = receiveChannel3;
                        rxChannelKt$collect$2 = rxChannelKt$collect$23;
                        try {
                            rxChannelKt$collect$2.L$0 = function1;
                            rxChannelKt$collect$2.L$1 = receiveChannel2;
                            rxChannelKt$collect$2.L$2 = nunlockfileWriteTypedObject;
                            rxChannelKt$collect$2.label = 1;
                            objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(rxChannelKt$collect$2);
                            if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                                return objOnWarmupCompleted2;
                            }
                            rxChannelKt$collect$22 = rxChannelKt$collect$2;
                            receiveChannel3 = receiveChannel2;
                            obj = objOnWarmupCompleted;
                            RxChannelKt$collect$2 rxChannelKt$collect$232 = rxChannelKt$collect$22;
                            if (!((Boolean) obj).booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                InlineMarker.finallyStart(1);
                                av.onExtraCallback(receiveChannel3, (Throwable) null);
                                InlineMarker.finallyEnd(1);
                                return unit;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            receiveChannel = receiveChannel2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    receiveChannel = receiveChannel3;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        try {
            throw th;
        } catch (Throwable th6) {
            InlineMarker.finallyStart(1);
            av.onExtraCallback(receiveChannel, th);
            InlineMarker.finallyEnd(1);
            throw th6;
        }
    }

    public static final <T> ReceiveChannel<T> onExtraCallback(@NotNull writeAscii<T> writeascii) {
        jni_YGNodeCopyStyleJNI jni_ygnodecopystylejni = new jni_YGNodeCopyStyleJNI();
        writeascii.onExtraCallback(jni_ygnodecopystylejni);
        return jni_ygnodecopystylejni;
    }

    public static final <T> ReceiveChannel<T> onExtraCallback(@NotNull serializeRaw<T> serializeraw) {
        jni_YGNodeCopyStyleJNI jni_ygnodecopystylejni = new jni_YGNodeCopyStyleJNI();
        serializeraw.subscribe(jni_ygnodecopystylejni);
        return jni_ygnodecopystylejni;
    }
}
