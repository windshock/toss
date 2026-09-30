package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class NativeAdBaseNativeLoadAdConfig {
    public double IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final Object[] IAuthTabCallbackStubProxy;
    private int asInterface;
    public int onExtraCallback;
    public long onExtraCallbackWithResult;
    public int onNavigationEvent;
    public Object onTransact;
    public Object onWarmupCompleted;
    private final int[] asBinder = new int[16];
    private final long[] IAuthTabCallbackStub = new long[16];
    private final float[] IAuthTabCallback_Parcel = new float[16];
    private final double[] access100 = new double[16];

    public NativeAdBaseNativeLoadAdConfig(Object obj, Object obj2) {
        Object[] objArr = new Object[16];
        this.IAuthTabCallbackStubProxy = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        this.asInterface = 0;
        this.IAuthTabCallbackDefault = -1;
    }

    public int onWarmupCompleted(int i) {
        switch (i) {
            case 1:
                int i2 = this.asInterface - this.onExtraCallback;
                this.asInterface = i2;
                this.IAuthTabCallbackDefault = i2;
                return 0;
            case 2:
                Object[] objArr = this.IAuthTabCallbackStubProxy;
                int i3 = this.IAuthTabCallbackDefault;
                this.IAuthTabCallbackDefault = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.onTransact = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.IAuthTabCallbackStubProxy;
                int i4 = this.asInterface;
                this.asInterface = i4 + 1;
                objArr2[i4] = this.onWarmupCompleted;
                return 0;
            case 4:
                Object[] objArr3 = this.IAuthTabCallbackStubProxy;
                int i5 = this.asInterface;
                this.asInterface = i5 + 1;
                objArr3[i5] = objArr3[12];
                return 0;
            case 5:
                Object[] objArr4 = this.IAuthTabCallbackStubProxy;
                int i6 = this.asInterface;
                this.asInterface = i6 + 1;
                objArr4[i6] = objArr4[i6 - 1];
                return 0;
            case 6:
                int i7 = this.asInterface - 1;
                this.asInterface = i7;
                Object[] objArr5 = this.IAuthTabCallbackStubProxy;
                Object obj2 = objArr5[i7];
                objArr5[i7] = null;
                objArr5[12] = obj2;
                return 0;
            case 7:
                int i8 = this.asInterface - 1;
                this.asInterface = i8;
                Object[] objArr6 = this.IAuthTabCallbackStubProxy;
                Object obj3 = objArr6[i8];
                objArr6[i8] = null;
                this.onNavigationEvent = obj3 != null ? 0 : 1;
                return 0;
            case 8:
                int[] iArr = this.asBinder;
                int i9 = this.asInterface;
                this.asInterface = i9 + 1;
                iArr[i9] = 0;
                return 0;
            case 9:
                int[] iArr2 = this.asBinder;
                int i10 = this.asInterface;
                this.asInterface = i10 + 1;
                iArr2[i10] = this.onExtraCallback;
                return 0;
            case 10:
                int i11 = this.asInterface - 1;
                this.asInterface = i11;
                this.onNavigationEvent = this.asBinder[i11] != 0 ? 0 : 1;
                return 0;
            case 11:
                int[] iArr3 = this.asBinder;
                int i12 = this.asInterface;
                this.asInterface = i12 + 1;
                iArr3[i12] = 1;
                return 0;
            case 12:
                int[] iArr4 = this.asBinder;
                int i13 = this.IAuthTabCallbackDefault;
                this.IAuthTabCallbackDefault = i13 + 1;
                this.onNavigationEvent = iArr4[i13];
                return 0;
            case 13:
                Object[] objArr7 = this.IAuthTabCallbackStubProxy;
                int i14 = this.asInterface;
                objArr7[i14] = objArr7[i14 - 1];
                Object obj4 = objArr7[i14];
                objArr7[i14] = null;
                objArr7[13] = obj4;
                int[] iArr5 = this.asBinder;
                this.asInterface = i14 + 1;
                iArr5[i14] = 0;
                return 0;
            case 14:
                int[] iArr6 = this.asBinder;
                int i15 = this.asInterface;
                this.asInterface = i15 + 1;
                iArr6[i15] = 34;
                return 0;
            case 15:
                int i16 = this.asInterface;
                int i17 = i16 - 1;
                this.asInterface = i17;
                int[] iArr7 = this.asBinder;
                iArr7[i16 - 2] = iArr7[i16 - 2] - iArr7[i17];
                return 0;
            case 16:
                int[] iArr8 = this.asBinder;
                int i18 = this.asInterface;
                this.asInterface = i18 + 1;
                iArr8[i18] = 7;
                return 0;
            case 17:
                int[] iArr9 = this.asBinder;
                int i19 = this.asInterface;
                iArr9[i19] = 0;
                this.asInterface = i19 + 2;
                iArr9[i19 + 1] = 0;
                return 0;
            case 18:
                long[] jArr = this.IAuthTabCallbackStub;
                int i20 = this.asInterface;
                this.asInterface = i20 + 1;
                jArr[i20] = this.onExtraCallbackWithResult;
                return 0;
            case 19:
                long[] jArr2 = this.IAuthTabCallbackStub;
                int i21 = this.asInterface;
                jArr2[i21] = 0;
                this.asInterface = i21;
                this.asBinder[i21 - 1] = (jArr2[i21 - 1] > jArr2[i21] ? 1 : (jArr2[i21 - 1] == jArr2[i21] ? 0 : -1));
                return 0;
            case 20:
                int i22 = this.asInterface;
                int i23 = i22 - 1;
                this.asInterface = i23;
                int[] iArr10 = this.asBinder;
                iArr10[i22 - 2] = iArr10[i22 - 2] - iArr10[i23];
                iArr10[i22 - 2] = (char) iArr10[i22 - 2];
                return 0;
            case 21:
                int i24 = this.asInterface;
                int i25 = i24 - 3;
                this.asInterface = i25;
                Object[] objArr8 = this.IAuthTabCallbackStubProxy;
                Object obj5 = objArr8[i25];
                objArr8[i25] = null;
                int i26 = this.asBinder[i24 - 2];
                Object obj6 = objArr8[i24 - 1];
                objArr8[i24 - 1] = null;
                ((Object[]) obj5)[i26] = obj6;
                return 0;
            case 22:
                Object[] objArr9 = this.IAuthTabCallbackStubProxy;
                int i27 = this.asInterface;
                this.asInterface = i27 + 1;
                objArr9[i27] = objArr9[13];
                return 0;
            case 23:
                this.onNavigationEvent = this.asBinder[this.asInterface - 1];
                return 0;
            case 24:
                int[] iArr11 = this.asBinder;
                int i28 = this.asInterface;
                iArr11[i28] = 2;
                this.asInterface = i28 + 2;
                iArr11[i28 + 1] = 2;
                return 0;
            case 25:
                int i29 = this.asInterface;
                int i30 = i29 - 1;
                this.asInterface = i30;
                int[] iArr12 = this.asBinder;
                iArr12[i29 - 2] = iArr12[i29 - 2] % iArr12[i30];
                return 0;
            case 26:
                int i31 = this.asInterface - 1;
                this.asInterface = i31;
                this.IAuthTabCallbackStubProxy[i31] = null;
                return 0;
            case 28:
                int[] iArr13 = this.asBinder;
                int i32 = this.asInterface;
                iArr13[i32] = 31;
                iArr13[i32 - 1] = iArr13[i32 - 1] + iArr13[i32];
                this.asInterface = i32 + 1;
                iArr13[i32] = iArr13[i32 - 1];
            case 27:
                return 0;
            case 29:
                int[] iArr14 = this.asBinder;
                int i33 = this.asInterface;
                iArr14[i33] = 128;
                this.asInterface = i33;
                iArr14[i33 - 1] = iArr14[i33 - 1] % iArr14[i33];
                return 0;
            case 30:
                int[] iArr15 = this.asBinder;
                int i34 = this.asInterface;
                this.asInterface = i34 + 1;
                iArr15[i34] = 2;
                return 0;
            case 31:
                int i35 = this.asInterface - 1;
                this.asInterface = i35;
                this.onNavigationEvent = this.asBinder[i35] == 0 ? 0 : 1;
                return 0;
            case 32:
                int[] iArr16 = this.asBinder;
                int i36 = this.asInterface;
                iArr16[i36] = 75;
                iArr16[i36 - 1] = iArr16[i36 - 1] + iArr16[i36];
                this.asInterface = i36 + 1;
                iArr16[i36] = iArr16[i36 - 1];
                return 0;
            case 33:
                int[] iArr17 = this.asBinder;
                int i37 = this.asInterface;
                this.asInterface = i37 + 1;
                iArr17[i37] = 128;
                return 0;
            case 34:
                int[] iArr18 = this.asBinder;
                int i38 = this.asInterface;
                iArr18[i38] = 2;
                this.asInterface = i38;
                iArr18[i38 - 1] = iArr18[i38 - 1] % iArr18[i38];
                return 0;
            case 35:
                Object[] objArr10 = this.IAuthTabCallbackStubProxy;
                int i39 = this.asInterface;
                Object obj7 = objArr10[i39 - 1];
                objArr10[i39 - 1] = null;
                this.onTransact = obj7;
                return 0;
            case 36:
                Object[] objArr11 = this.IAuthTabCallbackStubProxy;
                int i40 = this.asInterface;
                this.asInterface = i40 + 1;
                objArr11[i40] = null;
                return 0;
            case 37:
                int[] iArr19 = this.asBinder;
                int i41 = this.asInterface;
                iArr19[i41] = 41;
                iArr19[i41 - 1] = iArr19[i41 - 1] + iArr19[i41];
                this.asInterface = i41 + 1;
                iArr19[i41] = iArr19[i41 - 1];
                return 0;
            case 38:
                Object[] objArr12 = this.IAuthTabCallbackStubProxy;
                int i42 = this.asInterface;
                this.asInterface = i42 + 1;
                objArr12[i42] = null;
                int[] iArr20 = this.asBinder;
                Object obj8 = objArr12[i42];
                objArr12[i42] = null;
                iArr20[i42] = ((int[]) obj8).length;
                this.asInterface = i42;
                objArr12[i42] = null;
                return 0;
            case 39:
                int[] iArr21 = this.asBinder;
                int i43 = this.asInterface;
                this.asInterface = i43 + 1;
                iArr21[i43] = 33;
                return 0;
            case 40:
                int i44 = this.asInterface;
                int i45 = i44 - 1;
                this.asInterface = i45;
                int[] iArr22 = this.asBinder;
                iArr22[i44 - 2] = iArr22[i44 - 2] + iArr22[i45];
                return 0;
            case 41:
                int[] iArr23 = this.asBinder;
                int i46 = this.asInterface;
                this.asInterface = i46 + 1;
                iArr23[i46] = iArr23[i46 - 1];
                return 0;
            case 42:
                int[] iArr24 = this.asBinder;
                int i47 = this.asInterface - 1;
                this.asInterface = i47;
                this.onNavigationEvent = iArr24[i47];
                return 0;
            case 43:
                int[] iArr25 = this.asBinder;
                int i48 = this.asInterface;
                this.asInterface = i48 + 1;
                iArr25[i48] = 4;
                return 0;
            case 44:
                int[] iArr26 = this.asBinder;
                int i49 = this.asInterface;
                this.asInterface = i49 + 1;
                iArr26[i49] = 98;
                return 0;
            case 45:
                for (int i50 = this.asInterface - 1; i50 >= 0; i50--) {
                    this.IAuthTabCallbackStubProxy[i50] = null;
                }
                Object[] objArr13 = this.IAuthTabCallbackStubProxy;
                this.asInterface = 1;
                objArr13[0] = this.onWarmupCompleted;
                return 0;
            case 46:
                int i51 = this.asInterface - 1;
                this.asInterface = i51;
                Object[] objArr14 = this.IAuthTabCallbackStubProxy;
                Object obj9 = objArr14[i51];
                objArr14[i51] = null;
                objArr14[13] = obj9;
                return 0;
            case 47:
                Object[] objArr15 = this.IAuthTabCallbackStubProxy;
                int i52 = this.asInterface;
                this.asInterface = i52 + 1;
                objArr15[i52] = objArr15[11];
                return 0;
            case 48:
                int i53 = this.asInterface - 1;
                this.asInterface = i53;
                Object[] objArr16 = this.IAuthTabCallbackStubProxy;
                Object obj10 = objArr16[i53];
                objArr16[i53] = null;
                objArr16[14] = obj10;
                return 0;
            case 49:
                int i54 = this.asInterface - 1;
                this.asInterface = i54;
                Object[] objArr17 = this.IAuthTabCallbackStubProxy;
                Object obj11 = objArr17[i54];
                objArr17[i54] = null;
                objArr17[15] = obj11;
                return 0;
            case 50:
                Object[] objArr18 = this.IAuthTabCallbackStubProxy;
                int i55 = this.asInterface;
                this.asInterface = i55 + 1;
                objArr18[i55] = objArr18[14];
                return 0;
            case 51:
                double[] dArr = this.access100;
                int i56 = this.asInterface;
                this.asInterface = i56 + 1;
                dArr[i56] = this.IAuthTabCallback;
                return 0;
            case 52:
                int[] iArr27 = this.asBinder;
                int i57 = this.asInterface;
                iArr27[i57] = 41;
                this.asInterface = i57 + 2;
                iArr27[i57 + 1] = 0;
                return 0;
            case 53:
                double[] dArr2 = this.access100;
                int i58 = this.asInterface;
                this.asInterface = i58 + 1;
                dArr2[i58] = 0.0d;
                return 0;
            case 54:
                int i59 = this.asInterface;
                int i60 = i59 - 1;
                this.asInterface = i60;
                double[] dArr3 = this.access100;
                this.asBinder[i59 - 2] = (dArr3[i59 - 2] > dArr3[i60] ? 1 : (dArr3[i59 - 2] == dArr3[i60] ? 0 : -1));
                return 0;
            case 55:
                int[] iArr28 = this.asBinder;
                int i61 = this.asInterface;
                this.asInterface = i61 + 1;
                iArr28[i61] = 18;
                return 0;
            case 56:
                int[] iArr29 = this.asBinder;
                int i62 = this.asInterface;
                this.asInterface = i62 + 1;
                iArr29[i62] = 16;
                return 0;
            case 57:
                int i63 = this.asInterface;
                int[] iArr30 = this.asBinder;
                iArr30[i63 - 2] = iArr30[i63 - 2] >> iArr30[i63 - 1];
                int i64 = i63 - 2;
                this.asInterface = i64;
                iArr30[i63 - 3] = iArr30[i63 - 3] - iArr30[i64];
                return 0;
            case 58:
                int[] iArr31 = this.asBinder;
                int i65 = this.asInterface;
                this.asInterface = i65 + 1;
                iArr31[i65] = 30062;
                return 0;
            case 59:
                int i66 = this.asInterface;
                int i67 = i66 - 1;
                this.asInterface = i67;
                int[] iArr32 = this.asBinder;
                iArr32[i66 - 2] = iArr32[i66 - 2] + iArr32[i67];
                iArr32[i66 - 2] = (char) iArr32[i66 - 2];
                return 0;
            case 60:
                Object[] objArr19 = this.IAuthTabCallbackStubProxy;
                int i68 = this.asInterface;
                this.asInterface = i68 + 1;
                objArr19[i68] = objArr19[15];
                return 0;
            case 61:
                Object[] objArr20 = this.IAuthTabCallbackStubProxy;
                int i69 = this.asInterface;
                objArr20[i69] = objArr20[12];
                this.asInterface = i69 + 2;
                objArr20[i69 + 1] = objArr20[13];
                return 0;
            case 62:
                int i70 = this.asInterface - 1;
                this.asInterface = i70;
                Object[] objArr21 = this.IAuthTabCallbackStubProxy;
                Object obj12 = objArr21[i70];
                objArr21[i70] = null;
                this.onNavigationEvent = obj12 == null ? 0 : 1;
                return 0;
            case 63:
                int i71 = this.asInterface;
                int i72 = i71 - 2;
                this.asInterface = i72;
                int[] iArr33 = this.asBinder;
                this.onNavigationEvent = iArr33[i72] != iArr33[i71 - 1] ? 0 : 1;
                return 0;
            case 64:
                Object[] objArr22 = this.IAuthTabCallbackStubProxy;
                int i73 = this.asInterface;
                objArr22[i73] = objArr22[i73 - 1];
                this.asInterface = i73;
                Object obj13 = objArr22[i73];
                objArr22[i73] = null;
                objArr22[15] = obj13;
                return 0;
            case 65:
                int[] iArr34 = this.asBinder;
                int i74 = this.asInterface;
                this.asInterface = i74 + 1;
                iArr34[i74] = 59;
                return 0;
            case 66:
                int i75 = this.asInterface;
                int i76 = i75 - 1;
                this.asInterface = i76;
                int[] iArr35 = this.asBinder;
                iArr35[i75 - 2] = iArr35[i75 - 2] >> iArr35[i76];
                return 0;
            case 67:
                int i77 = this.asInterface;
                int i78 = i77 - 1;
                int[] iArr36 = this.asBinder;
                iArr36[i77 - 2] = iArr36[i77 - 2] - iArr36[i78];
                iArr36[i78] = 53;
                this.asInterface = i77 + 1;
                iArr36[i77] = 0;
                return 0;
            case 68:
                int i79 = this.asInterface;
                int i80 = i79 - 1;
                int[] iArr37 = this.asBinder;
                iArr37[i79 - 2] = iArr37[i79 - 2] - iArr37[i80];
                this.asInterface = i79;
                iArr37[i80] = 1;
                return 0;
            case 69:
                int[] iArr38 = this.asBinder;
                int i81 = this.asInterface;
                this.asInterface = i81 + 1;
                iArr38[i81] = 48;
                return 0;
            case 70:
                Object[] objArr23 = this.IAuthTabCallbackStubProxy;
                int i82 = this.asInterface;
                objArr23[i82] = objArr23[15];
                this.asInterface = i82 + 2;
                objArr23[i82 + 1] = objArr23[14];
                return 0;
            case 71:
                int[] iArr39 = this.asBinder;
                int i83 = this.asInterface;
                iArr39[i83] = 48;
                this.asInterface = i83 + 2;
                iArr39[i83 + 1] = 0;
                return 0;
            case 72:
                int[] iArr40 = this.asBinder;
                int i84 = this.asInterface;
                this.asInterface = i84 + 1;
                iArr40[i84] = 503;
                return 0;
            case 73:
                int[] iArr41 = this.asBinder;
                int i85 = this.asInterface;
                iArr41[i85] = 112;
                iArr41[i85 + 1] = 0;
                this.asInterface = i85 + 3;
                iArr41[i85 + 2] = 0;
                return 0;
            case 74:
                int i86 = this.asInterface;
                int i87 = i86 - 1;
                int[] iArr42 = this.asBinder;
                iArr42[i86 - 2] = iArr42[i86 - 2] + iArr42[i87];
                iArr42[i87] = 18;
                this.asInterface = i86 + 1;
                iArr42[i86] = 0;
                return 0;
            case 75:
                int[] iArr43 = this.asBinder;
                int i88 = this.asInterface;
                iArr43[i88] = 16;
                this.asInterface = i88;
                iArr43[i88 - 1] = iArr43[i88 - 1] >> iArr43[i88];
                return 0;
            case 76:
                int[] iArr44 = this.asBinder;
                int i89 = this.asInterface;
                iArr44[i89 - 1] = (char) iArr44[i89 - 1];
                return 0;
            case 77:
                int[] iArr45 = this.asBinder;
                int i90 = this.asInterface;
                this.asInterface = i90 + 1;
                iArr45[i90] = 131;
                return 0;
            case 78:
                int[] iArr46 = this.asBinder;
                int i91 = this.asInterface;
                this.asInterface = i91 + 1;
                iArr46[i91] = 17;
                return 0;
            case 79:
                int[] iArr47 = this.asBinder;
                int i92 = this.asInterface;
                iArr47[i92 - 1] = (byte) iArr47[i92 - 1];
                int i93 = i92 - 1;
                this.asInterface = i93;
                iArr47[i92 - 2] = iArr47[i92 - 2] + iArr47[i93];
                return 0;
            case 80:
                int[] iArr48 = this.asBinder;
                int i94 = this.asInterface;
                this.asInterface = i94 + 1;
                iArr48[i94] = -1;
                return 0;
            case 81:
                long[] jArr3 = this.IAuthTabCallbackStub;
                int i95 = this.asInterface;
                this.asInterface = i95 + 1;
                jArr3[i95] = 0;
                return 0;
            case 82:
                int i96 = this.asInterface;
                int[] iArr49 = this.asBinder;
                long[] jArr4 = this.IAuthTabCallbackStub;
                iArr49[i96 - 2] = (jArr4[i96 - 2] > jArr4[i96 - 1] ? 1 : (jArr4[i96 - 2] == jArr4[i96 - 1] ? 0 : -1));
                int i97 = i96 - 2;
                this.asInterface = i97;
                iArr49[i96 - 3] = iArr49[i96 - 3] + iArr49[i97];
                return 0;
            case 83:
                int[] iArr50 = this.asBinder;
                int i98 = this.asInterface;
                iArr50[i98] = 73;
                this.asInterface = i98;
                iArr50[i98 - 1] = iArr50[i98 - 1] + iArr50[i98];
                return 0;
            case 84:
                int[] iArr51 = this.asBinder;
                int i99 = this.asInterface;
                iArr51[i99] = iArr51[i99 - 1];
                this.asInterface = i99 + 2;
                iArr51[i99 + 1] = 128;
                return 0;
            case 85:
                int[] iArr52 = this.asBinder;
                int i100 = this.asInterface;
                iArr52[i100] = 36;
                this.asInterface = i100 + 2;
                iArr52[i100 + 1] = 0;
                return 0;
            case 86:
                int i101 = this.asInterface;
                int i102 = i101 - 1;
                this.asInterface = i102;
                int[] iArr53 = this.asBinder;
                iArr53[i101 - 2] = iArr53[i101 - 2] / iArr53[i102];
                int i103 = i101 - 2;
                this.asInterface = i103;
                this.IAuthTabCallbackStubProxy[i103] = null;
                return 0;
            case 87:
                int[] iArr54 = this.asBinder;
                int i104 = this.asInterface;
                iArr54[i104] = 43;
                this.asInterface = i104;
                iArr54[i104 - 1] = iArr54[i104 - 1] + iArr54[i104];
                return 0;
            case 88:
                int[] iArr55 = this.asBinder;
                int i105 = this.asInterface;
                iArr55[i105] = iArr55[i105 - 1];
                iArr55[i105 + 1] = 128;
                int i106 = i105 + 1;
                this.asInterface = i106;
                iArr55[i105] = iArr55[i105] % iArr55[i106];
                return 0;
            case 89:
                int[] iArr56 = this.asBinder;
                int i107 = this.asInterface;
                iArr56[i107] = 53;
                iArr56[i107 - 1] = iArr56[i107 - 1] + iArr56[i107];
                this.asInterface = i107 + 1;
                iArr56[i107] = iArr56[i107 - 1];
                return 0;
            case 90:
                int[] iArr57 = this.asBinder;
                int i108 = this.asInterface;
                this.asInterface = i108 + 1;
                iArr57[i108] = 67;
                return 0;
            case 91:
                int[] iArr58 = this.asBinder;
                int i109 = this.asInterface;
                this.asInterface = i109 + 1;
                iArr58[i109] = 76;
                return 0;
            default:
                return i;
        }
    }
}
