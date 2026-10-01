package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.core.Mat;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RVMonitor implements InterfaceC0060error<float[]> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char[] IAuthTabCallback_Parcel = null;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private static final Pair<Integer, Integer>[] onExtraCallback;
    private static final int[] onExtraCallbackWithResult;
    private static final errorLog[] onWarmupCompleted;
    private TensorBuffer IAuthTabCallback;
    private Map<Integer, ? extends ByteBuffer> IAuthTabCallbackDefault;
    private ByteBuffer[] IAuthTabCallbackStub;
    private float[] asBinder;
    private FloatBuffer[] asInterface;
    private TensorBuffer[] onNavigationEvent;
    private float[] onTransact;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r12 >= r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r14 = o.RVMonitor.access100 + 23;
        o.RVMonitor.access000 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if ((r14 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        r14 = r17.getOutputTensor(r12);
        r14 = org.tensorflow.lite.support.tensorbuffer.TensorBuffer.createFixedSize(r14.shape(), r14.dataType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "");
        r11[r12] = r14;
        r12 = r12 + 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        r14 = r17.getOutputTensor(r12);
        r14 = org.tensorflow.lite.support.tensorbuffer.TensorBuffer.createFixedSize(r14.shape(), r14.dataType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "");
        r11[r12] = r14;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        r16.onNavigationEvent = r11;
        r1 = new java.nio.ByteBuffer[r10];
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r11 >= r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        r14 = o.RVMonitor.access000;
        r15 = r14 + 107;
        o.RVMonitor.access100 = r15 % 128;
        r15 = r15 % 2;
        r12 = r16.onNavigationEvent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (r12 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        r14 = r14 + 71;
        o.RVMonitor.access100 = r14 % 128;
        r14 = r14 % 2;
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        r12 = r12[r11].getBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "");
        r12.order(java.nio.ByteOrder.nativeOrder());
        r1[r11] = r12;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c7, code lost:
    
        r16.IAuthTabCallbackStub = r1;
        r1 = kotlin.collections.ArraysKt.getIndices(r1);
        r11 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(o.access8100.IAuthTabCallback(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, 10)), 16));
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e8, code lost:
    
        if (r1.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ea, code lost:
    
        r4 = r1.next();
        r12 = ((java.lang.Number) r4).intValue();
        r14 = r16.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f7, code lost:
    
        if (r14 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f9, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fd, code lost:
    
        r11.put(r4, r14[r12]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0103, code lost:
    
        r16.IAuthTabCallbackDefault = r11;
        r1 = new java.nio.FloatBuffer[r10];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
    
        if (r4 >= r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010a, code lost:
    
        r11 = r16.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010c, code lost:
    
        if (r11 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010e, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0112, code lost:
    
        r11 = r11[r4].asFloatBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "");
        r1[r4] = r11;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0120, code lost:
    
        r16.asInterface = r1;
        r8 = new kotlin.Pair[]{o.getWrite.IAuthTabCallback(r7, r7), o.getWrite.IAuthTabCallback(r8, r8), o.getWrite.IAuthTabCallback(r3, r3)};
        r1 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0139, code lost:
    
        if (r1 >= 3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013b, code lost:
    
        r4 = r8[r1];
        r3 = r3 + (((java.lang.Number) r4.onExtraCallbackWithResult()).intValue() * ((java.lang.Number) r4.IAuthTabCallback()).intValue());
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0156, code lost:
    
        r16.onTransact = new float[r3 << 4];
        r1 = r9.shape();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r3 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0164, code lost:
    
        if (r6 >= r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0166, code lost:
    
        r5 = r5 * r1[r6];
        r6 = r6 + 1;
        r4 = o.RVMonitor.access000 + 105;
        o.RVMonitor.access100 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0175, code lost:
    
        r16.asBinder = new float[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0179, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017a, code lost:
    
        r4 = new java.lang.Object[1];
        a(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0}, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0197, code lost:
    
        throw new java.lang.IllegalStateException(((java.lang.String) r4[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r17 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r17 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        r9 = r17.getInputTensor(0);
        r16.IAuthTabCallback = org.tensorflow.lite.support.tensorbuffer.TensorBuffer.createFixedSize(r9.shape(), r9.dataType());
        r10 = r17.getOutputTensorCount();
        r11 = new org.tensorflow.lite.support.tensorbuffer.TensorBuffer[r10];
        r12 = 0;
     */
    @Override // o.InterfaceC0060error
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(@Nullable Interpreter interpreter) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = access100 + 101;
        access000 = i5 % 128;
        int i6 = 1;
        int i7 = 0;
        if (i5 % 2 != 0) {
            i = 18;
            i2 = 45;
            i3 = 1;
        } else {
            i = 8;
            i2 = 32;
            i3 = 16;
        }
    }

    @Override // o.InterfaceC0060error
    public Object onNavigationEvent(@Nullable Interpreter interpreter, @NotNull Mat mat, @NotNull access13800<? super float[]> access13800Var) throws Throwable {
        Mat mat2;
        float[] fArr;
        int i = 2 % 2;
        if (interpreter == null) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0}, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int iChannels = ((int) mat.total()) * mat.channels();
        float[] fArr2 = this.asBinder;
        float[] fArr3 = null;
        if (fArr2 == null) {
            int i2 = access100 + 81;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fArr2 = null;
        }
        if (fArr2.length < iChannels) {
            this.asBinder = new float[iChannels];
        }
        int iCols = mat.cols();
        float[] fArr4 = this.asBinder;
        if (fArr4 == null) {
            int i4 = access100 + 99;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            mat2 = mat;
            fArr4 = null;
        } else {
            mat2 = mat;
        }
        mat2.get(0, 0, fArr4);
        mat.release();
        TensorBuffer tensorBuffer = this.IAuthTabCallback;
        if (tensorBuffer == null) {
            int i5 = access000 + 53;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            tensorBuffer = null;
        }
        float[] fArr5 = this.asBinder;
        if (fArr5 == null) {
            int i6 = access000 + 83;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fArr5 = null;
        }
        tensorBuffer.loadArray(fArr5);
        TensorBuffer tensorBuffer2 = this.IAuthTabCallback;
        if (tensorBuffer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tensorBuffer2 = null;
        }
        tensorBuffer2.getBuffer().rewind();
        ByteBuffer[] byteBufferArr = this.IAuthTabCallbackStub;
        if (byteBufferArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            byteBufferArr = null;
        }
        int length = byteBufferArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            ByteBuffer[] byteBufferArr2 = this.IAuthTabCallbackStub;
            if (byteBufferArr2 == null) {
                int i9 = access100 + 91;
                access000 = i9 % 128;
                if (i9 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fArr3.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                byteBufferArr2 = null;
            }
            byteBufferArr2[i8].clear();
            ByteBuffer[] byteBufferArr3 = this.IAuthTabCallbackStub;
            if (byteBufferArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                byteBufferArr3 = null;
            }
            byteBufferArr3[i8].position(0);
        }
        TensorBuffer tensorBuffer3 = this.IAuthTabCallback;
        if (tensorBuffer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tensorBuffer3 = null;
        }
        ByteBuffer[] byteBufferArr4 = {tensorBuffer3.getBuffer()};
        Map<Integer, ? extends ByteBuffer> map = this.IAuthTabCallbackDefault;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            map = null;
        }
        interpreter.runForMultipleInputsOutputs(byteBufferArr4, map);
        int iIAuthTabCallback = 0;
        int i10 = 0;
        for (int length2 = onExtraCallback.length; i10 < length2; length2 = length2) {
            Pair<Integer, Integer> pair = onExtraCallback[i10];
            errorLog errorlog = onWarmupCompleted[i10];
            int i11 = onExtraCallbackWithResult[i10];
            FloatBuffer[] floatBufferArr = this.asInterface;
            if (floatBufferArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                floatBufferArr = null;
            }
            FloatBuffer floatBuffer = floatBufferArr[errorlog.onExtraCallbackWithResult()];
            FloatBuffer[] floatBufferArr2 = this.asInterface;
            if (floatBufferArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                floatBufferArr2 = null;
            }
            FloatBuffer floatBuffer2 = floatBufferArr2[errorlog.onWarmupCompleted()];
            FloatBuffer[] floatBufferArr3 = this.asInterface;
            if (floatBufferArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                floatBufferArr3 = null;
            }
            FloatBuffer floatBuffer3 = floatBufferArr3[errorlog.IAuthTabCallback()];
            FloatBuffer[] floatBufferArr4 = this.asInterface;
            if (floatBufferArr4 == null) {
                int i12 = access100 + 115;
                access000 = i12 % 128;
                int i13 = i12 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                floatBufferArr4 = null;
            }
            FloatBuffer floatBuffer4 = floatBufferArr4[errorlog.onNavigationEvent()];
            flowLog flowlogOnWarmupCompleted = onWarmupCompleted(pair);
            float[] fArr6 = this.onTransact;
            if (fArr6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fArr = null;
            } else {
                fArr = fArr6;
            }
            int i14 = iIAuthTabCallback;
            iIAuthTabCallback = i14 + IAuthTabCallback(floatBuffer, floatBuffer2, floatBuffer3, floatBuffer4, i11, iCols, pair, flowlogOnWarmupCompleted, fArr, i14);
            i10++;
        }
        int i15 = iIAuthTabCallback;
        float[] fArr7 = this.onTransact;
        if (fArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fArr7 = null;
        }
        if (i15 == fArr7.length) {
            float[] fArr8 = this.onTransact;
            if (fArr8 != null) {
                return fArr8;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        float[] fArr9 = this.onTransact;
        if (fArr9 == null) {
            int i16 = access000 + 85;
            access100 = i16 % 128;
            if (i16 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fArr3.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fArr3 = fArr9;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr3, i15);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
        return fArrCopyOf;
    }

    private final int IAuthTabCallback(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, FloatBuffer floatBuffer3, FloatBuffer floatBuffer4, int i, int i2, Pair<Integer, Integer> pair, flowLog flowlog, float[] fArr, int i3) {
        RVMonitor rVMonitor = this;
        int i4 = 2 % 2;
        int i5 = access100 + 91;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        int iIntValue = ((Number) pair.onExtraCallbackWithResult()).intValue() * ((Number) pair.IAuthTabCallback()).intValue();
        float f = i;
        float f2 = 1.0f / i2;
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < iIntValue) {
            float f3 = ((float[]) flowLog.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 568905279, -568905278, new Object[]{flowlog}))[i8];
            float f4 = ((float[]) flowLog.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1659346317, -1659346317, new Object[]{flowlog}))[i8];
            float fIAuthTabCallback = rVMonitor.IAuthTabCallback(floatBuffer.get(i8));
            float fIAuthTabCallback2 = rVMonitor.IAuthTabCallback(floatBuffer2.get(i8));
            float f5 = (f3 + floatBuffer3.get(i9)) * f;
            float f6 = (f4 + floatBuffer3.get(i9 + 1)) * f;
            int i11 = iIntValue;
            float fExp = (float) Math.exp(floatBuffer3.get(i9 + 2));
            float fExp2 = (float) Math.exp(floatBuffer3.get(i9 + 3));
            i9 += 4;
            float f7 = fExp * f * 0.5f;
            float f8 = fExp2 * f * 0.5f;
            fArr[i7] = (f5 - f7) * f2;
            fArr[i7 + 1] = (f6 - f8) * f2;
            fArr[i7 + 2] = (f5 + f7) * f2;
            int i12 = i7 + 4;
            fArr[i7 + 3] = (f6 + f8) * f2;
            float f9 = f * f2;
            int i13 = 0;
            while (i13 < 5) {
                int i14 = (i13 << 1) + i10;
                fArr[i12] = (((float[]) flowLog.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 568905279, -568905278, new Object[]{flowlog}))[i8] + floatBuffer4.get(i14)) * f9;
                int i15 = i12 + 2;
                fArr[i12 + 1] = (((float[]) flowLog.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1659346317, -1659346317, new Object[]{flowlog}))[i8] + floatBuffer4.get(i14 + 1)) * f9;
                i13++;
                int i16 = access000 + 99;
                access100 = i16 % 128;
                int i17 = i16 % 2;
                i12 = i15;
            }
            i10 += 10;
            fArr[i12] = 0.0f;
            i7 = i12 + 2;
            fArr[i12 + 1] = fIAuthTabCallback * fIAuthTabCallback2;
            i8++;
            rVMonitor = this;
            iIntValue = i11;
        }
        int i18 = iIntValue << 4;
        int i19 = access000 + 45;
        access100 = i19 % 128;
        int i20 = i19 % 2;
        return i18;
    }

    private final flowLog onWarmupCompleted(Pair<Integer, Integer> pair) {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        flowLog flowlog = (flowLog) ((Map) getStartupParams.onNavigationEvent(iOnExtraCallbackWithResult, 1966299112, -1966299111, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[0], iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).get(pair);
        if (flowlog != null) {
            int i2 = access000 + 59;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return flowlog;
            }
            throw null;
        }
        int i3 = access000 + 111;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return (flowLog) getStartupParams.onNavigationEvent(iOnExtraCallbackWithResult3, -221950282, 221950282, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{pair}, iOnExtraCallbackWithResult4, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult5 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int i4 = 98 / 0;
        return (flowLog) getStartupParams.onNavigationEvent(iOnExtraCallbackWithResult5, -221950282, 221950282, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{pair}, iOnExtraCallbackWithResult6, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = IAuthTabCallback_Parcel;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = $10 + 9;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - ((byte) KeyEvent.getModifierMetaStateMask())), 35 - View.combineMeasuredStates(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 91;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i10 = $11 + 75;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.alpha(0)), 66 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 16718 - Color.red(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionChild(0L) + 30, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49467), 70 - TextUtils.getOffsetAfter("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i14, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i14);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i15 = $11 + 103;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private final float IAuthTabCallback(float f) {
        float f2;
        int i;
        int i2 = 2 % 2;
        int i3 = access100 + 25;
        int i4 = i3 % 128;
        access000 = i4;
        if (i3 % 2 == 0 ? (i = (int) (f2 = (f * 100.0f) + 1024.0f)) < 0 : (i = (int) (f2 = f + 100.0f + 1024.0f)) < 0) {
            int i5 = i4 + 89;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return 0.0f;
        }
        if (i < ((float[]) getStartupParams.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1186940992, -1186940990, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[0], TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).length - 1) {
            float f3 = ((float[]) getStartupParams.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1186940992, -1186940990, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[0], TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()))[i];
            return f3 + ((f2 - i) * (((float[]) getStartupParams.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1186940992, -1186940990, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[0], TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()))[i + 1] - f3));
        }
        int i7 = access000 + 111;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return 1.0f;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        onExtraCallback();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallback = new Pair[]{getWrite.IAuthTabCallback(32, 32), getWrite.IAuthTabCallback(16, 16), getWrite.IAuthTabCallback(8, 8)};
        onExtraCallbackWithResult = new int[]{8, 16, 32};
        errorLog errorlog = new errorLog(0, 1, 2, 3);
        errorLog errorlog2 = new errorLog(4, 5, 6, 7);
        errorLog errorlog3 = new errorLog(8, 9, 10, 11);
        errorLog[] errorlogArr = (errorLog[]) Array.newInstance(Class.forName("o.errorLog"), 3);
        errorlogArr[0] = errorlog;
        errorlogArr[1] = errorlog2;
        errorlogArr[2] = errorlog3;
        onWarmupCompleted = errorlogArr;
        int i = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            int i2 = 17 / 0;
        }
    }

    static void onExtraCallback() {
        IAuthTabCallback_Parcel = new char[]{27239, 27157, 27173, 27197, 27169, 27171, 27173, 27178, 27148, 27141, 27173, 27176, 27198, 27171, 27148, 27141, 27170, 27172, 27143, 27145, 27199, 27198, 27170, 27139};
    }
}
