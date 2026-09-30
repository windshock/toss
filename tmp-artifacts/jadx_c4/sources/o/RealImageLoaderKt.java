package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.components.compose.extensions.TrackScreenKt$TrackScreen$1$1$observer$1;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ConvertFloatArrayToByteArray;
import o.RealImageLoaderKt;
import o.SetDetectableSize;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.access8100;
import o.onMenuItemClick;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderKt {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i6));
        int i11 = ~(i9 | i4);
        int i12 = i10 | i11;
        int i13 = ~i6;
        int i14 = i11 | (~(i13 | i4));
        int i15 = (~(i5 | i7 | i13)) | (~(i13 | i9 | i4));
        int i16 = i6 + i4 + i2 + ((-1369571145) * i3) + ((-720088171) * i);
        int i17 = i16 * i16;
        int i18 = (((-954023988) * i6) - 252706816) + ((-260227018) * i4) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i2) + (565182464 * i3) + (1611661312 * i) + ((-409206784) * i17);
        int i19 = ((i6 * (-1931095572)) - 2087550970) + (i4 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + (i2 * (-1931095207)) + (i3 * (-789048161)) + (i * 356376013) + (i17 * 423362560);
        int i20 = i18 + (i19 * i19 * (-1901854720));
        return i20 != 1 ? i20 != 2 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, Map map, Map map2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallback(j, map, map2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(j, map, map2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 19;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 3 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, long j, Map map, Map map2, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, j, map, map2, isinvideousage);
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Unit unitOnExtraCallbackWithResult;
        long jLongValue = ((Number) objArr[0]).longValue();
        Function1 function1 = (Function1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallbackWithResult = onExtraCallbackWithResult(jLongValue, function1, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            int i3 = 0 / 0;
        } else {
            unitOnExtraCallbackWithResult = onExtraCallbackWithResult(jLongValue, function1, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        int i4 = onExtraCallback + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallback(long j, Map map, Map map2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult(j, (Map<String, ? extends Object>) map, (Map<String, ? extends Object>) map2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallbackWithResult(j, (Map<String, ? extends Object>) map, (Map<String, ? extends Object>) map2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 93;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(long j, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onNavigationEvent(j, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onNavigationEvent(j, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 49;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 80 / 0;
        }
        return unit;
    }

    public static /* synthetic */ AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, onMenuItemClick onmenuitemclick) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, onmenuitemclick);
        }
        onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, onmenuitemclick);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        onMenuItemClick onmenuitemclick = (onMenuItemClick) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(jLongValue, cameraPresenceProviderExternalSyntheticLambda6, onmenuitemclick);
        int i4 = onExtraCallback + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        if (i5 != 0) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            IAuthTabCallback(new Object[]{function0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, iOnNavigationEvent, -1641337169);
        } else {
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            IAuthTabCallback(new Object[]{function0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, iOnNavigationEvent2, -1641337169);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(setDetectableSize);
        }
        onExtraCallback(setDetectableSize);
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 ??, still in use, count: 1, list:
          (r0v6 ?? I:java.lang.Object) from 0x00e6: INVOKE (r2v1 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:65)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void onExtraCallbackWithResult(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 ??, still in use, count: 1, list:
          (r0v6 ?? I:java.lang.Object) from 0x00e6: INVOKE (r2v1 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:65)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[PHI: r3
      0x0050: PHI (r3v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r3v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r3v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003a, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r3
      0x003c: PHI (r3v3 o.CameraCaptureResultEmptyCameraCaptureResult) = (r3v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r3v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003a, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i;
        boolean zOnNavigationEvent;
        final Function0 function0 = (Function0) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1791198515);
            if ((iIntValue & 5) == 0) {
                int i4 = onExtraCallback + 43;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1791198515);
            if ((iIntValue & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i6 = IAuthTabCallback + 11;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 36 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = IAuthTabCallback + 125;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1791198515, i, -1, "im.toss.components.compose.extensions.ScreenLogEffect (TrackScreen.kt:40)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1791198515, i, -1, "im.toss.components.compose.extensions.ScreenLogEffect (TrackScreen.kt:40)");
                }
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i & 14);
                Unit unit = Unit.INSTANCE;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function1 = new Function1() { // from class: im.toss.components.compose.extensions.TrackScreenKt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2) {
                                int i9 = 2 % 2;
                                int i10 = onNavigationEvent + 51;
                                IAuthTabCallback = i10 % 128;
                                int i11 = i10 % 2;
                                AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0OnExtraCallbackWithResult = RealImageLoaderKt.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (onMenuItemClick) obj2);
                                int i12 = onNavigationEvent + 37;
                                IAuthTabCallback = i12 % 128;
                                if (i12 % 2 != 0) {
                                    return androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0OnExtraCallbackWithResult;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                        obj = function1;
                    }
                    AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.onExtraCallbackWithResult(unit, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i9 = onExtraCallback + 111;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i & 14);
                Unit unit2 = Unit.INSTANCE;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.TrackScreenKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = IAuthTabCallback + 125;
                    onNavigationEvent = i12 % 128;
                    Object obj4 = null;
                    if (i12 % 2 == 0) {
                        RealImageLoaderKt.IAuthTabCallback(function0, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = RealImageLoaderKt.IAuthTabCallback(function0, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = IAuthTabCallback + 115;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    obj4.hashCode();
                    throw null;
                }
            });
        }
        return null;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(final long j, @Nullable Function1<? super SetDetectableSize, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(84445096);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i7 = IAuthTabCallback + 101;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i9 = onExtraCallback + 17;
                IAuthTabCallback = i9 % 128;
                i4 = i9 % 2 != 0 ? 117 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
            int i10 = onExtraCallback + 105;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        if ((i3 & 19) != 18) {
            int i12 = IAuthTabCallback + 1;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            int i14 = onExtraCallback + 57;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            if (i6 != 0) {
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.components.compose.extensions.TrackScreenKt$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i15 = 2 % 2;
                            int i16 = onExtraCallbackWithResult + 51;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            Unit unitOnWarmupCompleted = RealImageLoaderKt.onWarmupCompleted((SetDetectableSize) obj);
                            int i18 = onExtraCallbackWithResult + 35;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                function1 = (Function1) objOnMinimized;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(84445096, i3, -1, "im.toss.components.compose.extensions.ScreenLogEffect (TrackScreen.kt:52)");
            }
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 14);
            Unit unit = Unit.INSTANCE;
            boolean z2 = (i3 & 14) == 4;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnNavigationEvent | z2)) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function1 function12 = new Function1() { // from class: im.toss.components.compose.extensions.TrackScreenKt$$ExternalSyntheticLambda3
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i15 = 2 % 2;
                            int i16 = onWarmupCompleted + 121;
                            onExtraCallback = i16 % 128;
                            if (i16 % 2 == 0) {
                                return (AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0) RealImageLoaderKt.IAuthTabCallback(new Object[]{Long.valueOf(j), cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (onMenuItemClick) obj2}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -113150665, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 113150665);
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                    obj = function12;
                }
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.onExtraCallbackWithResult(unit, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = IAuthTabCallback + 53;
                    onExtraCallback = i15 % 128;
                    if (i15 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i16 = onExtraCallback + 115;
            IAuthTabCallback = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 4 % 5;
            }
        }
        final Function1<? super SetDetectableSize, Unit> function13 = function1;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.TrackScreenKt$$ExternalSyntheticLambda4
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = 2 % 2;
                    int i19 = onWarmupCompleted + 21;
                    onNavigationEvent = i19 % 128;
                    int i20 = i19 % 2;
                    long j2 = j;
                    Function1 function14 = function13;
                    int i21 = i;
                    int i22 = i2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr = {Long.valueOf(j2), function14, Integer.valueOf(i21), Integer.valueOf(i22), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    Unit unit2 = (Unit) RealImageLoaderKt.IAuthTabCallback(objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1344760139, iOnNavigationEvent, 1344760141);
                    int i23 = onNavigationEvent + 93;
                    onWarmupCompleted = i23 % 128;
                    int i24 = i23 % 2;
                    return unit2;
                }
            });
        }
    }

    public static final class onExtraCallback implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TrackScreenKt$TrackScreen$1$1$observer$1 onExtraCallback;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onExtraCallbackWithResult;

        public onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TrackScreenKt$TrackScreen$1$1$observer$1 trackScreenKt$TrackScreen$1$1$observer$1) {
            this.onExtraCallbackWithResult = textFieldScrollKtExternalSyntheticLambda0;
            this.onExtraCallback = trackScreenKt$TrackScreen$1$1$observer$1;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.getLifecycle().onExtraCallbackWithResult(this.onExtraCallback);
            int i4 = onWarmupCompleted + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, final long j, final Map map, final Map map2, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = new DefaultLifecycleObserver() { // from class: im.toss.components.compose.extensions.TrackScreenKt$TrackScreen$1$1$observer$1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 15;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda02);
                if (i4 == 0) {
                    int i5 = 45 / 0;
                }
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 95;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = onExtraCallback + 43;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 82 / 0;
                }
            }

            public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 11;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onPause(textFieldScrollKtExternalSyntheticLambda02);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 35;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onResume(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = IAuthTabCallback + 115;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 34 / 0;
                }
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 45;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = IAuthTabCallback + 105;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 57;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                long j2 = j;
                Map<String, Object> mapOnNavigationEvent = map;
                if (mapOnNavigationEvent == null) {
                    int i5 = onExtraCallback + 23;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        access8100.onNavigationEvent();
                        throw null;
                    }
                    mapOnNavigationEvent = access8100.onNavigationEvent();
                }
                Map<String, Object> mapOnNavigationEvent2 = map2;
                if (mapOnNavigationEvent2 == null) {
                    mapOnNavigationEvent2 = access8100.onNavigationEvent();
                }
                ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{convertFloatArrayToByteArray, Long.valueOf(j2), false, null, access8100.onWarmupCompleted(mapOnNavigationEvent, mapOnNavigationEvent2), null, 22, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        onExtraCallback onextracallback = new onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    private static final AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, onMenuItemClick onmenuitemclick) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onmenuitemclick, "");
        onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>>) cameraPresenceProviderExternalSyntheticLambda6).invoke();
        onNavigationEvent onnavigationevent = new onNavigationEvent(onmenuitemclick);
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return onnavigationevent;
    }

    private static final Function0<Unit> onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = (Function0) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return function0;
        }
        throw null;
    }

    private static final AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 IAuthTabCallback(long j, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, onMenuItemClick onmenuitemclick) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onmenuitemclick, "");
        ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, Long.valueOf(j), false, null, null, IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<? extends Function1<? super SetDetectableSize, Unit>>) cameraPresenceProviderExternalSyntheticLambda6), 14, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(onmenuitemclick);
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return onextracallbackwithresult;
    }

    private static final Function1<SetDetectableSize, Unit> IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends Function1<? super SetDetectableSize, Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<SetDetectableSize, Unit> function1 = (Function1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return function1;
    }

    public static /* synthetic */ AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 onExtraCallbackWithResult(long j, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, onMenuItemClick onmenuitemclick) {
        Object[] objArr = {Long.valueOf(j), cameraPresenceProviderExternalSyntheticLambda6, onmenuitemclick};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0) IAuthTabCallback(objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -113150665, iOnNavigationEvent, 113150665);
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Long.valueOf(j), function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) IAuthTabCallback(objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1344760139, iOnNavigationEvent, 1344760141);
    }

    public static final void onWarmupCompleted(@NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        IAuthTabCallback(objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, iOnNavigationEvent, -1641337169);
    }

    public static final class onExtraCallbackWithResult implements AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ onMenuItemClick onWarmupCompleted;

        public void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public onExtraCallbackWithResult(onMenuItemClick onmenuitemclick) {
            this.onWarmupCompleted = onmenuitemclick;
        }
    }

    public static final class onNavigationEvent implements AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ onMenuItemClick onExtraCallbackWithResult;

        public void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 36 / 0;
            }
        }

        public onNavigationEvent(onMenuItemClick onmenuitemclick) {
            this.onExtraCallbackWithResult = onmenuitemclick;
        }
    }
}
