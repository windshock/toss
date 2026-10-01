package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.tmoney.a;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.tds.compose.component.compound.bottominfo.TdsBottomInfoV1Kt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.r8lambdaL3YVedIYrkax5fojVMcLJQJpM;
import o.readFully;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaL3YVedIYrkax5fojVMcLJQJpM {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit IAuthTabCallback(long j, long j2, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(j, j2, f, setorientationdegrees);
        }
        onExtraCallbackWithResult(j, j2, f, setorientationdegrees);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i2) | i3);
        int i8 = ~((~i3) | i);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i) | i3));
        int i11 = i3 + i + i6 + (762724209 * i5) + (1201824936 * i4);
        int i12 = i11 * i11;
        int i13 = ((i3 * 162561953) - 555857873) + (i * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (162560975 * i6) + (701011807 * i5) + (237771736 * i4) + (i12 * (-223608832));
        boolean z = true;
        if (((-126223985) * i3) + 43253760 + (1339426419 * i) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i6) + (1302855680 * i5) + (1514143744 * i4) + (1905524736 * i12) + (i13 * i13 * 703332352) == 1) {
            return onExtraCallback(objArr);
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i14 = 2 % 2;
        int i15 = onNavigationEvent + 33;
        int i16 = i15 % 128;
        onExtraCallback = i16;
        int i17 = i15 % 2;
        if ((iIntValue & 3) != 2) {
            int i18 = i16 + 67;
            onNavigationEvent = i18 % 128;
            int i19 = i18 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i20 = onNavigationEvent + 115;
                onExtraCallback = i20 % 128;
                int i21 = i20 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1968404914, iIntValue, -1, "im.toss.tds.compose.component.compound.bottominfo.TdsBottomInfoV1.<anonymous>.<anonymous>.<anonymous> (TdsBottomInfoV1.kt:65)");
            }
            getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 0.0f, 0.0f, fFloatValue, 7, (Object) null), 0L, 0L, null, null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 0, 30}, -1636332773);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i22 = onExtraCallback + 65;
                onNavigationEvent = i22 % 128;
                int i23 = i22 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 109;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 57;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Object[] objArr = {deviceQuirksExternalSyntheticLambda0, Float.valueOf(f), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {deviceQuirksExternalSyntheticLambda0, Float.valueOf(f), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallback(-452451577, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr2, 452451577, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = onExtraCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 97;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            onNavigationEvent(quirksExternalSyntheticBackport0, j, f, deviceQuirksExternalSyntheticLambda0, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, j, f, deviceQuirksExternalSyntheticLambda0, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 105;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(1461071866, iIAuthTabCallback, objArr, -1461071865, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 91;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, j, f, deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 92 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(long j, long j2, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j), setByteOrder.onNavigationEvent(j2)}), Float.intBitsToFloat((int) setorientationdegrees.onTransact()) - f, Float.intBitsToFloat((int) (setorientationdegrees.onTransact() & 4294967295L)), 0, 8, (Object) null), 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 ??, still in use, count: 1, list:
          (r2v7 ?? I:java.lang.Object) from 0x0066: INVOKE (r19v0 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r2v7 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:156)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static final kotlin.Unit onExtraCallback(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 ??, still in use, count: 1, list:
          (r2v7 ?? I:java.lang.Object) from 0x0066: INVOKE (r19v0 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r2v7 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:156)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i5;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        final long j;
        final float f;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = (DeviceQuirksExternalSyntheticLambda0) objArr[3];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        final int iIntValue2 = ((Number) objArr[7]).intValue();
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1897170184);
        int i8 = iIntValue2 & 1;
        if (i8 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i9 = onExtraCallback + 121;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 69 / 0;
                i2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2;
            } else if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02))) {
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((iIntValue2 & 2) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) ? 32 : 16;
        }
        int i11 = iIntValue2 & 4;
        if (i11 == 0) {
            if ((iIntValue & 384) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 256 : 128) | i;
                int i12 = onExtraCallback + 11;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
            }
            i4 = iIntValue2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((iIntValue & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0IAuthTabCallback) ? 2048 : 1024;
            }
            if ((iIntValue & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                    i6 = 16384;
                } else {
                    int i14 = onExtraCallback + 121;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((iIntValue & 1) != 0) {
                    int i16 = onNavigationEvent + 3;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        if (i8 != 0) {
                            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                            int i18 = onExtraCallback + 27;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                        }
                        if ((iIntValue2 & 2) != 0) {
                            int i20 = onNavigationEvent + 85;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 != 0) {
                                jLongValue = u5ExternalSyntheticLambda0.onNavigationEvent.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 18);
                                i3 &= 119;
                            } else {
                                jLongValue = u5ExternalSyntheticLambda0.onNavigationEvent.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                i3 &= -113;
                            }
                        }
                        if (i11 != 0) {
                            int i21 = onExtraCallback + 5;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            fFloatValue = u5ExternalSyntheticLambda0.onNavigationEvent.onExtraCallback();
                        }
                        if (i4 != 0) {
                            deviceQuirksExternalSyntheticLambda0IAuthTabCallback = u5ExternalSyntheticLambda0.IAuthTabCallback(u5ExternalSyntheticLambda0.onNavigationEvent, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((iIntValue2 & 2) != 0) {
                            int i23 = onExtraCallback + 93;
                            onNavigationEvent = i23 % 128;
                            i3 = i23 % 2 == 0 ? i3 & 28 : i3 & (-113);
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1897170184, i3, -1, "im.toss.tds.compose.component.compound.bottominfo.TdsBottomInfoV1 (TdsBottomInfoV1.kt:48)");
                    }
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    final long j2 = jLongValue;
                    i5 = iIntValue;
                    final float f2 = fFloatValue;
                    final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                    putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.IAuthTabCallbackStub(), null, null, ForwardingCameraControl.onExtraCallback(1098538955, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottominfo.TdsBottomInfoV1Kt$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj, Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = onExtraCallback + 111;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                            Unit unitOnWarmupCompleted = r8lambdaL3YVedIYrkax5fojVMcLJQJpM.onWarmupCompleted(quirksExternalSyntheticBackport03, j2, f2, deviceQuirksExternalSyntheticLambda02, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i27 = onExtraCallbackWithResult + 19;
                            onExtraCallback = i27 % 128;
                            if (i27 % 2 == 0) {
                                int i28 = 70 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                    j = jLongValue;
                    f = fFloatValue;
                    deviceQuirksExternalSyntheticLambda0 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                j = jLongValue;
                deviceQuirksExternalSyntheticLambda0 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i5 = iIntValue;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                f = fFloatValue;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            final int i24 = i5;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottominfo.TdsBottomInfoV1Kt$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i25 = 2 % 2;
                    int i26 = onWarmupCompleted + 91;
                    onNavigationEvent = i26 % 128;
                    int i27 = i26 % 2;
                    Unit unitOnExtraCallbackWithResult = r8lambdaL3YVedIYrkax5fojVMcLJQJpM.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, j, f, deviceQuirksExternalSyntheticLambda0, getbacktracenote, i24, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i28 = onNavigationEvent + 37;
                    onWarmupCompleted = i28 % 128;
                    if (i28 % 2 == 0) {
                        int i29 = 19 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
            return null;
        }
        int i25 = onNavigationEvent + 33;
        onExtraCallback = i25 % 128;
        int i26 = i25 % 2;
        i |= 384;
        i3 = i;
        i4 = iIntValue2 & 8;
        if (i4 == 0) {
        }
        if ((iIntValue & 24576) == 0) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(488049701);
        if (i != 0) {
            z = true;
        } else {
            int i3 = onExtraCallback + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(488049701, i, -1, "im.toss.tds.compose.component.compound.bottominfo.Container (TdsBottomInfoV1.kt:78)");
                int i7 = onExtraCallback + 125;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 5;
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdamp6XhYAV5OsiYO0Qb49KzFMJOc.onWarmupCompleted.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsBottomInfoV1Kt$.ExternalSyntheticLambda4(i));
        }
    }

    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull getBacktraceNote<? super roundUpToNearestHalfInt, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(1461071866, iIAuthTabCallback, objArr, -1461071865, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2);
    }

    private static final Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {deviceQuirksExternalSyntheticLambda0, Float.valueOf(f), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(-452451577, iIAuthTabCallback, objArr, 452451577, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2);
    }
}
