package o;

import im.toss.observability.instrumentation.memory.PssReader$;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.Tensor;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class event implements InterfaceC0060error<Pair<? extends float[], ? extends float[]>> {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private float[] IAuthTabCallback;
    private float[] asBinder;
    private TensorBuffer onExtraCallback;
    private float[] onExtraCallbackWithResult;
    private TensorBuffer onNavigationEvent;
    private TensorBuffer onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023f A[PHI: r1
      0x023f: PHI (r1v11 float[]) = (r1v10 float[]), (r1v58 float[]) binds: [B:71:0x023d, B:68:0x0236] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // o.InterfaceC0060error
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(@Nullable Interpreter interpreter) {
        DataType dataType;
        int[] iArrShape;
        DataType dataType2;
        int[] iArrShape2;
        DataType dataType3;
        int[] iArrShape3;
        float[] fArr;
        Tensor outputTensor;
        Tensor outputTensor2;
        Tensor outputTensor3;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = ((i2 | 71) << 1) - (((~i2) & 71) | (i2 & (-72)));
        asInterface = i3 % 128;
        TensorBuffer tensorBuffer = null;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
            if (interpreter != null) {
                Tensor inputTensor = interpreter.getInputTensor(0);
                if (inputTensor != null) {
                    int i5 = asInterface;
                    int i6 = ((i5 ^ 43) | (i5 & 43)) << 1;
                    int i7 = -(((~i5) & 43) | (i5 & (-44)));
                    int i8 = (i6 & i7) + (i7 | i6);
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    dataType = inputTensor.dataType();
                    int i10 = IAuthTabCallbackStub;
                    int i11 = i10 & 117;
                    int i12 = i11 + ((i10 ^ 117) | i11);
                    asInterface = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    int i14 = asInterface;
                    int i15 = i14 & 83;
                    int i16 = (i15 - (~(-(-((i14 ^ 83) | i15))))) - 1;
                    IAuthTabCallbackStub = i16 % 128;
                    int i17 = i16 % 2;
                    dataType = null;
                }
            }
        } else if (interpreter != null) {
        }
        if (interpreter != null) {
            int i18 = IAuthTabCallbackStub;
            int i19 = (i18 & 111) + (i18 | 111);
            asInterface = i19 % 128;
            int i20 = i19 % 2;
            Tensor inputTensor2 = interpreter.getInputTensor(0);
            if (inputTensor2 != null) {
                int i21 = asInterface;
                int i22 = (i21 ^ 117) + ((i21 & 117) << 1);
                IAuthTabCallbackStub = i22 % 128;
                int i23 = i22 % 2;
                iArrShape = inputTensor2.shape();
                int i24 = IAuthTabCallbackStub;
                int i25 = i24 & 51;
                int i26 = -(-((i24 ^ 51) | i25));
                int i27 = (i25 & i26) + (i26 | i25);
                asInterface = i27 % 128;
                if (i27 % 2 != 0) {
                    int i28 = 5 / 4;
                }
            } else {
                int i29 = IAuthTabCallbackStub;
                int i30 = (-2) - (((i29 ^ 16) + ((i29 & 16) << 1)) ^ (-1));
                asInterface = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 5 % 2;
                }
                iArrShape = null;
            }
        }
        if (interpreter != null) {
            int i32 = asInterface;
            int i33 = ((i32 ^ 73) | (i32 & 73)) << 1;
            int i34 = -(((~i32) & 73) | (i32 & (-74)));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            IAuthTabCallbackStub = i35 % 128;
            int i36 = i35 % 2;
            Tensor outputTensor4 = interpreter.getOutputTensor(0);
            if (outputTensor4 != null) {
                int i37 = IAuthTabCallbackStub;
                int i38 = i37 & 33;
                int i39 = i38 + ((i37 ^ 33) | i38);
                asInterface = i39 % 128;
                if (i39 % 2 != 0) {
                    outputTensor4.dataType();
                    tensorBuffer.hashCode();
                    throw null;
                }
                dataType2 = outputTensor4.dataType();
                int i40 = IAuthTabCallbackStub;
                int i41 = i40 & 111;
                int i42 = -(-((i40 ^ 111) | i41));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                asInterface = i43 % 128;
                int i44 = i43 % 2;
            } else {
                int i45 = IAuthTabCallbackStub;
                int i46 = ((i45 ^ 60) + ((i45 & 60) << 1)) - 1;
                asInterface = i46 % 128;
                int i47 = i46 % 2;
                dataType2 = null;
            }
        }
        if (interpreter != null) {
            int i48 = asInterface;
            int i49 = (i48 & 53) + (i48 | 53);
            IAuthTabCallbackStub = i49 % 128;
            if (i49 % 2 != 0 ? (outputTensor3 = interpreter.getOutputTensor(0)) == null : (outputTensor3 = interpreter.getOutputTensor(1)) == null) {
                int i50 = IAuthTabCallbackStub;
                int i51 = (((i50 | 54) << 1) - (i50 ^ 54)) - 1;
                asInterface = i51 % 128;
                int i52 = i51 % 2;
                iArrShape2 = null;
            } else {
                iArrShape2 = outputTensor3.shape();
                int i53 = asInterface + 119;
                IAuthTabCallbackStub = i53 % 128;
                int i54 = i53 % 2;
            }
        }
        if (interpreter != null) {
            int i55 = asInterface;
            int i56 = i55 & 73;
            int i57 = ((i55 | 73) & (~i56)) + (i56 << 1);
            IAuthTabCallbackStub = i57 % 128;
            if (i57 % 2 != 0 ? (outputTensor2 = interpreter.getOutputTensor(1)) == null : (outputTensor2 = interpreter.getOutputTensor(1)) == null) {
                int i58 = asInterface;
                int i59 = (i58 ^ 109) + ((i58 & 109) << 1);
                IAuthTabCallbackStub = i59 % 128;
                int i60 = i59 % 2;
                dataType3 = null;
            } else {
                int i61 = asInterface;
                int i62 = (i61 & 55) + (i61 | 55);
                IAuthTabCallbackStub = i62 % 128;
                int i63 = i62 % 2;
                dataType3 = outputTensor2.dataType();
                int i64 = IAuthTabCallbackStub;
                int i65 = i64 ^ 77;
                int i66 = ((i64 & 77) | i65) << 1;
                int i67 = -i65;
                int i68 = (i66 ^ i67) + ((i66 & i67) << 1);
                asInterface = i68 % 128;
                int i69 = i68 % 2;
            }
        }
        if (interpreter != null) {
            int i70 = asInterface;
            int i71 = (i70 & 102) + (i70 | 102);
            int i72 = (i71 ^ (-1)) + (i71 << 1);
            IAuthTabCallbackStub = i72 % 128;
            if (i72 % 2 != 0 ? (outputTensor = interpreter.getOutputTensor(1)) == null : (outputTensor = interpreter.getOutputTensor(0)) == null) {
                int i73 = asInterface;
                int i74 = (i73 & (-110)) | ((~i73) & 109);
                int i75 = (i73 & 109) << 1;
                int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                IAuthTabCallbackStub = i76 % 128;
                int i77 = i76 % 2;
                iArrShape3 = null;
            } else {
                int i78 = IAuthTabCallbackStub;
                int i79 = ((((i78 ^ 65) | (i78 & 65)) << 1) - (~(-((65 & (~i78)) | (i78 & (-66)))))) - 1;
                asInterface = i79 % 128;
                if (i79 % 2 != 0) {
                    iArrShape3 = outputTensor.shape();
                    int i80 = 35 / 0;
                } else {
                    iArrShape3 = outputTensor.shape();
                }
            }
        }
        this.onExtraCallback = TensorBuffer.createFixedSize(iArrShape, dataType);
        PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        System.identityHashCode(this);
        this.onWarmupCompleted = TensorBuffer.createFixedSize(iArrShape2, dataType2);
        TensorBuffer tensorBufferCreateFixedSize = TensorBuffer.createFixedSize(iArrShape3, dataType3);
        int i81 = IAuthTabCallbackStub;
        int i82 = i81 & 5;
        int i83 = (i81 ^ 5) | i82;
        int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
        int i85 = i84 % 128;
        asInterface = i85;
        if (i84 % 2 != 0) {
            this.onNavigationEvent = tensorBufferCreateFixedSize;
            fArr = this.onExtraCallbackWithResult;
            int i86 = 32 / 0;
            if (fArr != null) {
                int length = fArr.length;
                TensorBuffer tensorBuffer2 = this.onWarmupCompleted;
                if (tensorBuffer2 == null) {
                    int i87 = i85 & 13;
                    int i88 = i87 + ((i85 ^ 13) | i87);
                    IAuthTabCallbackStub = i88 % 128;
                    int i89 = i88 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i90 = IAuthTabCallbackStub;
                    int i91 = (i90 | 83) << 1;
                    int i92 = -((83 & (~i90)) | (i90 & (-84)));
                    int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                    asInterface = i93 % 128;
                    int i94 = i93 % 2;
                    tensorBuffer2 = null;
                }
                if (length != tensorBuffer2.getFlatSize()) {
                    TensorBuffer tensorBuffer3 = this.onWarmupCompleted;
                    if (tensorBuffer3 == null) {
                        int i95 = IAuthTabCallbackStub;
                        int i96 = ((i95 ^ 77) | (i95 & 77)) << 1;
                        int i97 = -(((~i95) & 77) | (i95 & (-78)));
                        int i98 = (i96 & i97) + (i97 | i96);
                        asInterface = i98 % 128;
                        int i99 = i98 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i100 = asInterface;
                        int i101 = i100 ^ 117;
                        int i102 = ((i100 & 117) | i101) << 1;
                        int i103 = -i101;
                        int i104 = (i102 ^ i103) + ((i102 & i103) << 1);
                        IAuthTabCallbackStub = i104 % 128;
                        int i105 = i104 % 2;
                        tensorBuffer3 = null;
                    }
                    this.onExtraCallbackWithResult = new float[tensorBuffer3.getFlatSize()];
                    int i106 = asInterface + 121;
                    IAuthTabCallbackStub = i106 % 128;
                    if (i106 % 2 == 0) {
                        int i107 = 2 % 3;
                    }
                }
            }
        } else {
            this.onNavigationEvent = tensorBufferCreateFixedSize;
            fArr = this.onExtraCallbackWithResult;
            if (fArr != null) {
            }
        }
        float[] fArr2 = this.asBinder;
        if (fArr2 != null) {
            int i108 = IAuthTabCallbackStub;
            int i109 = (i108 ^ 117) + ((i108 & 117) << 1);
            asInterface = i109 % 128;
            if (i109 % 2 != 0) {
                int length2 = fArr2.length;
                throw null;
            }
            int length3 = fArr2.length;
            TensorBuffer tensorBuffer4 = this.onNavigationEvent;
            if (tensorBuffer4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i110 = asInterface;
                int i111 = (i110 ^ 50) + ((i110 & 50) << 1);
                int i112 = (i111 ^ (-1)) + (i111 << 1);
                IAuthTabCallbackStub = i112 % 128;
                int i113 = i112 % 2;
                tensorBuffer4 = null;
            }
            if (length3 == tensorBuffer4.getFlatSize()) {
                int i114 = IAuthTabCallbackStub;
                int i115 = (i114 ^ 52) + ((i114 & 52) << 1);
                int i116 = (i115 ^ (-1)) + (i115 << 1);
                asInterface = i116 % 128;
                if (i116 % 2 == 0) {
                    return;
                }
                tensorBuffer.hashCode();
                throw null;
            }
        }
        TensorBuffer tensorBuffer5 = this.onNavigationEvent;
        if (tensorBuffer5 == null) {
            int i117 = IAuthTabCallbackStub + 17;
            asInterface = i117 % 128;
            if (i117 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                tensorBuffer.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i118 = asInterface;
            int i119 = i118 & 37;
            int i120 = i119 + ((i118 ^ 37) | i119);
            IAuthTabCallbackStub = i120 % 128;
            int i121 = i120 % 2;
        } else {
            tensorBuffer = tensorBuffer5;
        }
        this.asBinder = new float[tensorBuffer.getFlatSize()];
        int i122 = IAuthTabCallbackStub;
        int i123 = (i122 & 61) + (i122 | 61);
        asInterface = i123 % 128;
        int i124 = i123 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0023, B:9:0x004e, B:13:0x0072, B:18:0x0096, B:16:0x0081, B:7:0x0031), top: B:112:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0289 A[PHI: r1
      0x0289: PHI (r1v28 java.util.Map) = (r1v27 java.util.Map), (r1v69 java.util.Map) binds: [B:58:0x0287, B:55:0x027e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d9  */
    @Override // o.InterfaceC0060error
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@Nullable Interpreter interpreter, @NotNull Mat mat, @NotNull access13800<? super Pair<? extends float[], ? extends float[]>> access13800Var) {
        long j;
        Integer numOnNavigationEvent;
        Map mapIAuthTabCallback;
        int i = 2 % 2;
        Size size = mat.size();
        int i2 = CvType.CV_32FC3;
        Mat mat2 = new Mat(size, i2);
        int i3 = asInterface;
        int i4 = i3 & 69;
        int i5 = (i4 - (~(-(-((i3 ^ 69) | i4))))) - 1;
        IAuthTabCallbackStub = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                mat.convertTo(mat2, i2);
                j = mat2.total();
                int i6 = 85 / 0;
            } else {
                mat.convertTo(mat2, i2);
                j = mat2.total();
            }
            int i7 = IAuthTabCallbackStub;
            int i8 = i7 & 85;
            int i9 = (i7 | 85) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            int iChannels = ((int) j) * mat2.channels();
            float[] fArr = this.IAuthTabCallback;
            int i13 = IAuthTabCallbackStub;
            int i14 = ((i13 | 93) << 1) - (i13 ^ 93);
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            if (fArr != null) {
                int i16 = i13 & 31;
                int i17 = (i13 ^ 31) | i16;
                int i18 = (i16 & i17) + (i16 | i17);
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                if (fArr.length == iChannels) {
                    int i20 = ((i13 & 66) + (i13 | 66)) - 1;
                    asInterface = i20 % 128;
                    int i21 = i20 % 2;
                } else {
                    this.IAuthTabCallback = new float[iChannels];
                    int i22 = i13 & 41;
                    int i23 = -(-((i13 ^ 41) | i22));
                    int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                    asInterface = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            mat2.get(0, 0, this.IAuthTabCallback);
            int i26 = IAuthTabCallbackStub;
            int i27 = ((i26 ^ 113) | (i26 & 113)) << 1;
            int i28 = -(((~i26) & 113) | (i26 & (-114)));
            int i29 = (i27 & i28) + (i28 | i27);
            asInterface = i29 % 128;
            TensorBuffer tensorBuffer = null;
            if (i29 % 2 != 0) {
                mat2.release();
                throw null;
            }
            mat2.release();
            TensorBuffer tensorBuffer2 = this.onExtraCallback;
            int i30 = asInterface + 45;
            int i31 = i30 % 128;
            IAuthTabCallbackStub = i31;
            if (i30 % 2 == 0) {
                tensorBuffer.hashCode();
                throw null;
            }
            if (tensorBuffer2 == null) {
                int i32 = i31 + 117;
                asInterface = i32 % 128;
                if (i32 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                tensorBuffer2 = null;
            }
            tensorBuffer2.loadArray(this.IAuthTabCallback);
            TensorBuffer tensorBuffer3 = this.onExtraCallback;
            int i33 = asInterface;
            int i34 = i33 ^ 55;
            int i35 = (((i33 & 55) | i34) << 1) - i34;
            IAuthTabCallbackStub = i35 % 128;
            if (i35 % 2 == 0) {
                tensorBuffer.hashCode();
                throw null;
            }
            if (tensorBuffer3 == null) {
                PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                System.identityHashCode(this);
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i36 = asInterface;
                int i37 = (i36 & (-64)) | ((~i36) & 63);
                int i38 = (i36 & 63) << 1;
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                IAuthTabCallbackStub = i39 % 128;
                int i40 = i39 % 2;
                tensorBuffer3 = null;
            }
            ByteBuffer buffer = tensorBuffer3.getBuffer();
            ByteBuffer[] byteBufferArr = new ByteBuffer[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i41 = (-61971) & iIdentityHashCode;
            int i42 = ((-61971) | iIdentityHashCode) & (~i41);
            int i43 = ~iIdentityHashCode;
            int i44 = ~((i42 & i41) | (i42 ^ i41));
            int i45 = ((~i44) & (-461963199)) | (461963198 & i44);
            int i46 = i44 & (-461963199);
            int i47 = ((i46 & i45) | (i45 ^ i46)) * 501;
            int i48 = ((~i47) & 2121671172) | ((-2121671173) & i47);
            int i49 = (i47 & 2121671172) << 1;
            int i50 = (((i48 | i49) << 1) - (i49 ^ i48)) - (-1498715705);
            int i51 = (i50 ^ (-1)) + (i50 << 1);
            int i52 = (i43 & (-151581503)) | ((~i43) & (-151581503)) | (151581502 & i43) | (-310443667);
            int i53 = -(-(((i52 | (~i52)) & (~i52)) * 501));
            int i54 = i51 & i53;
            int i55 = -(-((i53 ^ i51) | i54));
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            int i57 = ~System.identityHashCode(this);
            int i58 = 355183004 ^ i57;
            int i59 = 355183004 & i57;
            int i60 = ~((i59 & i58) | (i58 ^ i59));
            int i61 = 1102833794 & i60;
            int i62 = (i60 | 1102833794) & (~i61);
            int i63 = -(-(((i62 & i61) | (i62 ^ i61)) * (-933)));
            int i64 = 315468318 & i63;
            int i65 = i64 + ((i63 ^ 315468318) | i64);
            int i66 = 1102833794 & i57;
            int i67 = ((i57 | 1102833794) & (~i66)) | i66;
            int i68 = (i67 | (~i67)) & (~i67);
            int i69 = ((-335544605) & i68) | ((~i68) & 335544604);
            int i70 = i68 & 335544604;
            int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * 933));
            int i72 = i65 ^ i71;
            int i73 = ((i71 & i65) | i72) << 1;
            int i74 = -i72;
            if (i56 <= (i73 & i74) + (i73 | i74) + 1142758016) {
                byteBufferArr[1] = buffer;
                numOnNavigationEvent = access14000.onNavigationEvent(1);
            } else {
                byteBufferArr[0] = buffer;
                numOnNavigationEvent = access14000.onNavigationEvent(0);
            }
            TensorBuffer tensorBuffer4 = this.onWarmupCompleted;
            int i75 = IAuthTabCallbackStub;
            int i76 = ((i75 | 69) << 1) - (i75 ^ 69);
            asInterface = i76 % 128;
            int i77 = i76 % 2;
            if (tensorBuffer4 == null) {
                int i78 = i75 & 25;
                int i79 = ((((i75 ^ 25) | i78) << 1) - (~(-((i75 | 25) & (~i78))))) - 1;
                asInterface = i79 % 128;
                if (i79 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    tensorBuffer.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                tensorBuffer4 = null;
            }
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(numOnNavigationEvent, tensorBuffer4.getBuffer().rewind());
            Integer numOnNavigationEvent2 = access14000.onNavigationEvent(1);
            int i80 = asInterface;
            int i81 = i80 & 75;
            int i82 = ((i80 ^ 75) | i81) << 1;
            int i83 = -((~i81) & (i80 | 75));
            int i84 = ((i82 | i83) << 1) - (i82 ^ i83);
            IAuthTabCallbackStub = i84 % 128;
            int i85 = i84 % 2;
            TensorBuffer tensorBuffer5 = this.onNavigationEvent;
            if (tensorBuffer5 == null) {
                int i86 = i80 + 107;
                IAuthTabCallbackStub = i86 % 128;
                if (i86 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                tensorBuffer5 = null;
            }
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(numOnNavigationEvent2, tensorBuffer5.getBuffer().rewind());
            PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            System.identityHashCode(this);
            Pair[] pairArr = new Pair[2];
            pairArr[0] = pairIAuthTabCallback;
            int i87 = asInterface;
            int i88 = i87 & 27;
            int i89 = (i87 | 27) & (~i88);
            int i90 = -(-(i88 << 1));
            int i91 = (i89 & i90) + (i89 | i90);
            IAuthTabCallbackStub = i91 % 128;
            if (i91 % 2 == 0) {
                pairArr[0] = pairIAuthTabCallback2;
                mapIAuthTabCallback = access8100.IAuthTabCallback(pairArr);
                if (interpreter != null) {
                    interpreter.runForMultipleInputsOutputs(byteBufferArr, mapIAuthTabCallback);
                    int i92 = asInterface + 17;
                    IAuthTabCallbackStub = i92 % 128;
                    if (i92 % 2 == 0) {
                        int i93 = 5 % 4;
                    }
                }
            } else {
                pairArr[1] = pairIAuthTabCallback2;
                mapIAuthTabCallback = access8100.IAuthTabCallback(pairArr);
                if (interpreter != null) {
                }
            }
            TensorBuffer tensorBuffer6 = this.onWarmupCompleted;
            if (tensorBuffer6 == null) {
                int i94 = asInterface;
                int i95 = (i94 | 59) << 1;
                int i96 = -(i94 ^ 59);
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                IAuthTabCallbackStub = i97 % 128;
                int i98 = i97 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i99 = asInterface + 71;
                IAuthTabCallbackStub = i99 % 128;
                int i100 = i99 % 2;
                tensorBuffer6 = null;
            }
            tensorBuffer6.getBuffer().rewind();
            TensorBuffer tensorBuffer7 = this.onWarmupCompleted;
            int i101 = asInterface + 123;
            int i102 = i101 % 128;
            IAuthTabCallbackStub = i102;
            if (i101 % 2 == 0) {
                int i103 = 29 / 0;
                if (tensorBuffer7 == null) {
                    int i104 = (i102 & 1) + (i102 | 1);
                    asInterface = i104 % 128;
                    int i105 = i104 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i106 = asInterface + 7;
                    IAuthTabCallbackStub = i106 % 128;
                    if (i106 % 2 == 0) {
                        int i107 = 4 % 2;
                    }
                    tensorBuffer7 = null;
                }
            } else if (tensorBuffer7 == null) {
            }
            tensorBuffer7.getBuffer().asFloatBuffer().get(this.onExtraCallbackWithResult);
            int i108 = asInterface;
            int i109 = ((i108 ^ 65) | (i108 & 65)) << 1;
            int i110 = -((i108 & (-66)) | ((~i108) & 65));
            int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
            IAuthTabCallbackStub = i111 % 128;
            int i112 = i111 % 2;
            TensorBuffer tensorBuffer8 = this.onNavigationEvent;
            if (tensorBuffer8 == null) {
                int i113 = (((i108 | 30) << 1) - (i108 ^ 30)) - 1;
                IAuthTabCallbackStub = i113 % 128;
                if (i113 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i114 = 59 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                int i115 = IAuthTabCallbackStub;
                int i116 = i115 ^ 53;
                int i117 = -(-((i115 & 53) << 1));
                int i118 = (i116 & i117) + (i117 | i116);
                asInterface = i118 % 128;
                if (i118 % 2 != 0) {
                    int i119 = 4 / 2;
                }
                tensorBuffer8 = null;
            }
            tensorBuffer8.getBuffer().rewind();
            TensorBuffer tensorBuffer9 = this.onNavigationEvent;
            if (tensorBuffer9 == null) {
                int i120 = IAuthTabCallbackStub;
                int i121 = i120 ^ 51;
                int i122 = ((i120 & 51) | i121) << 1;
                int i123 = -i121;
                int i124 = ((i122 | i123) << 1) - (i122 ^ i123);
                asInterface = i124 % 128;
                int i125 = i124 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i126 = asInterface;
                int i127 = (-2) - (((i126 ^ 90) + ((i126 & 90) << 1)) ^ (-1));
                IAuthTabCallbackStub = i127 % 128;
                int i128 = i127 % 2;
            } else {
                tensorBuffer = tensorBuffer9;
            }
            tensorBuffer.getBuffer().asFloatBuffer().get(this.asBinder);
            int i129 = asInterface;
            int i130 = i129 + 125;
            IAuthTabCallbackStub = i130 % 128;
            int i131 = i130 % 2;
            float[] fArr2 = this.onExtraCallbackWithResult;
            if (fArr2 == null) {
                int i132 = ((i129 | 43) << 1) - (((~i129) & 43) | (i129 & (-44)));
                int i133 = i132 % 128;
                IAuthTabCallbackStub = i133;
                fArr2 = i132 % 2 == 0 ? new float[1] : new float[0];
                int i134 = (i133 & 27) + (i133 | 27);
                asInterface = i134 % 128;
                int i135 = i134 % 2;
            }
            float[] fArr3 = this.asBinder;
            if (fArr3 == null) {
                int i136 = asInterface;
                int i137 = i136 & 21;
                int i138 = i136 | 21;
                int i139 = (i137 ^ i138) + ((i138 & i137) << 1);
                IAuthTabCallbackStub = i139 % 128;
                fArr3 = i139 % 2 == 0 ? new float[1] : new float[0];
            }
            Pair pair = new Pair(fArr2, fArr3);
            int i140 = IAuthTabCallbackStub + 52;
            int i141 = (i140 ^ (-1)) + (i140 << 1);
            asInterface = i141 % 128;
            int i142 = i141 % 2;
            return pair;
        } catch (Throwable th) {
            mat2.release();
            throw th;
        }
    }
}
