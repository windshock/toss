package o;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.RawMessageInfo;
import androidx.glance.appwidget.protobuf.Reader;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.material.button.MaterialButton;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.LazyLayoutKtExternalSyntheticLambda3;
import o.LazySaveableStateHolderExternalSyntheticLambda2;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;
import o.LazyStaggeredGridItemProviderImplExternalSyntheticLambda1;
import o.PagerKtExternalSyntheticLambda6;
import o.PagerMeasureKtExternalSyntheticLambda3;
import sun.misc.Unsafe;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridStateExternalSyntheticLambda0<T> implements PagerDefaultsExternalSyntheticLambda0<T> {
    private static final int[] IAuthTabCallback = new int[0];
    private static final Unsafe onNavigationEvent = PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult();
    private final LazyStaggeredGridIntervalContentExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private final LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> IAuthTabCallbackStub;
    private final LazyStaggeredGridIntervalContentExternalSyntheticLambda3 IAuthTabCallbackStubProxy;
    private final LazyStaggeredGridStateExternalSyntheticLambda1 IAuthTabCallback_Parcel;
    private final int access000;
    private final int access100;
    private final int[] asBinder;
    private final boolean asInterface;
    private final int extraCallback;
    private final LazyLayoutPagerKtExternalSyntheticLambda1 extraCallbackWithResult;
    private final Object[] getInterfaceDescriptor;
    private final int[] onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final boolean onTransact;
    private final LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onWarmupCompleted;
    private final PagerKtExternalSyntheticLambda2<?, ?> readTypedObject;
    private final boolean writeTypedObject;

    private static boolean IAuthTabCallback(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static long asBinder(int i2) {
        return i2 & 1048575;
    }

    private static int asInterface(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    private static boolean onExtraCallbackWithResult(int i2) {
        return (i2 & 268435456) != 0;
    }

    private LazyStaggeredGridStateExternalSyntheticLambda0(int[] iArr, Object[] objArr, int i2, int i3, LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1, LazyLayoutPagerKtExternalSyntheticLambda1 lazyLayoutPagerKtExternalSyntheticLambda1, boolean z, int[] iArr2, int i4, int i5, LazyStaggeredGridStateExternalSyntheticLambda1 lazyStaggeredGridStateExternalSyntheticLambda1, LazyStaggeredGridIntervalContentExternalSyntheticLambda0 lazyStaggeredGridIntervalContentExternalSyntheticLambda0, PagerKtExternalSyntheticLambda2<?, ?> pagerKtExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, LazyStaggeredGridIntervalContentExternalSyntheticLambda3 lazyStaggeredGridIntervalContentExternalSyntheticLambda3) {
        this.onExtraCallback = iArr;
        this.getInterfaceDescriptor = objArr;
        this.access100 = i2;
        this.access000 = i3;
        this.asInterface = lazyStaggeredGridMeasureKtExternalSyntheticLambda1 instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0;
        this.extraCallbackWithResult = lazyLayoutPagerKtExternalSyntheticLambda1;
        this.onTransact = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4 != null && lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onWarmupCompleted(lazyStaggeredGridMeasureKtExternalSyntheticLambda1);
        this.writeTypedObject = z;
        this.asBinder = iArr2;
        this.onExtraCallbackWithResult = i4;
        this.extraCallback = i5;
        this.IAuthTabCallback_Parcel = lazyStaggeredGridStateExternalSyntheticLambda1;
        this.IAuthTabCallbackDefault = lazyStaggeredGridIntervalContentExternalSyntheticLambda0;
        this.readTypedObject = pagerKtExternalSyntheticLambda2;
        this.IAuthTabCallbackStub = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4;
        this.onWarmupCompleted = lazyStaggeredGridMeasureKtExternalSyntheticLambda1;
        this.IAuthTabCallbackStubProxy = lazyStaggeredGridIntervalContentExternalSyntheticLambda3;
    }

    static <T> LazyStaggeredGridStateExternalSyntheticLambda0<T> onExtraCallback(Class<T> cls, LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 lazyStaggeredGridItemProviderKtExternalSyntheticLambda1, LazyStaggeredGridStateExternalSyntheticLambda1 lazyStaggeredGridStateExternalSyntheticLambda1, LazyStaggeredGridIntervalContentExternalSyntheticLambda0 lazyStaggeredGridIntervalContentExternalSyntheticLambda0, PagerKtExternalSyntheticLambda2<?, ?> pagerKtExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, LazyStaggeredGridIntervalContentExternalSyntheticLambda3 lazyStaggeredGridIntervalContentExternalSyntheticLambda3) {
        if (lazyStaggeredGridItemProviderKtExternalSyntheticLambda1 instanceof RawMessageInfo) {
            return onExtraCallbackWithResult((RawMessageInfo) lazyStaggeredGridItemProviderKtExternalSyntheticLambda1, lazyStaggeredGridStateExternalSyntheticLambda1, lazyStaggeredGridIntervalContentExternalSyntheticLambda0, pagerKtExternalSyntheticLambda2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, lazyStaggeredGridIntervalContentExternalSyntheticLambda3);
        }
        return onExtraCallbackWithResult((PagerKtExternalSyntheticLambda4) lazyStaggeredGridItemProviderKtExternalSyntheticLambda1, lazyStaggeredGridStateExternalSyntheticLambda1, lazyStaggeredGridIntervalContentExternalSyntheticLambda0, pagerKtExternalSyntheticLambda2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, lazyStaggeredGridIntervalContentExternalSyntheticLambda3);
    }

    static <T> LazyStaggeredGridStateExternalSyntheticLambda0<T> onExtraCallbackWithResult(RawMessageInfo rawMessageInfo, LazyStaggeredGridStateExternalSyntheticLambda1 lazyStaggeredGridStateExternalSyntheticLambda1, LazyStaggeredGridIntervalContentExternalSyntheticLambda0 lazyStaggeredGridIntervalContentExternalSyntheticLambda0, PagerKtExternalSyntheticLambda2<?, ?> pagerKtExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, LazyStaggeredGridIntervalContentExternalSyntheticLambda3 lazyStaggeredGridIntervalContentExternalSyntheticLambda3) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int[] iArr2;
        String str;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int i21;
        int i22;
        int iObjectFieldOffset2;
        Field fieldOnNavigationEvent;
        int i23;
        char cCharAt9;
        int i24;
        Field fieldOnNavigationEvent2;
        Field fieldOnNavigationEvent3;
        int i25;
        char cCharAt10;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        String strIAuthTabCallback = rawMessageInfo.IAuthTabCallback();
        int length = strIAuthTabCallback.length();
        char c = 55296;
        if (strIAuthTabCallback.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i2 = i29 + 1;
                if (strIAuthTabCallback.charAt(i29) < 55296) {
                    break;
                }
                i29 = i2;
            }
        } else {
            i2 = 1;
        }
        int i30 = i2 + 1;
        int iCharAt3 = strIAuthTabCallback.charAt(i2);
        if (iCharAt3 >= 55296) {
            int i31 = iCharAt3 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                cCharAt13 = strIAuthTabCallback.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            iCharAt3 = i31 | (cCharAt13 << i32);
            i30 = i28;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i6 = 0;
            i7 = 0;
            i3 = 0;
            i5 = 0;
            iArr = IAuthTabCallback;
            i4 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt4 = strIAuthTabCallback.charAt(i30);
            if (iCharAt4 >= 55296) {
                int i34 = iCharAt4 & 8191;
                int i35 = 13;
                while (true) {
                    i15 = i33 + 1;
                    cCharAt8 = strIAuthTabCallback.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i15;
                }
                iCharAt4 = i34 | (cCharAt8 << i35);
                i33 = i15;
            }
            int i36 = i33 + 1;
            int iCharAt5 = strIAuthTabCallback.charAt(i33);
            if (iCharAt5 >= 55296) {
                int i37 = iCharAt5 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    cCharAt7 = strIAuthTabCallback.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                iCharAt5 = i37 | (cCharAt7 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int iCharAt6 = strIAuthTabCallback.charAt(i36);
            if (iCharAt6 >= 55296) {
                int i40 = iCharAt6 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    cCharAt6 = strIAuthTabCallback.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                iCharAt6 = i40 | (cCharAt6 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int iCharAt7 = strIAuthTabCallback.charAt(i39);
            if (iCharAt7 >= 55296) {
                int i43 = iCharAt7 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    cCharAt5 = strIAuthTabCallback.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                iCharAt7 = i43 | (cCharAt5 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            iCharAt = strIAuthTabCallback.charAt(i42);
            if (iCharAt >= 55296) {
                int i46 = iCharAt & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    cCharAt4 = strIAuthTabCallback.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                iCharAt = i46 | (cCharAt4 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            iCharAt2 = strIAuthTabCallback.charAt(i45);
            if (iCharAt2 >= 55296) {
                int i49 = iCharAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    cCharAt3 = strIAuthTabCallback.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                iCharAt2 = i49 | (cCharAt3 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            int iCharAt8 = strIAuthTabCallback.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    cCharAt2 = strIAuthTabCallback.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                iCharAt8 = i52 | (cCharAt2 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int iCharAt9 = strIAuthTabCallback.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i55 = iCharAt9 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    cCharAt = strIAuthTabCallback.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                iCharAt9 = i55 | (cCharAt << i56);
                i54 = i8;
            }
            i3 = (iCharAt4 << 1) + iCharAt5;
            i4 = iCharAt4;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i5 = iCharAt9;
            i30 = i54;
            i6 = iCharAt6;
            i7 = iCharAt7;
        }
        Unsafe unsafe = onNavigationEvent;
        Object[] objArrOnNavigationEvent = rawMessageInfo.onNavigationEvent();
        Class<?> cls = rawMessageInfo.onWarmupCompleted().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt << 1];
        int i57 = i5 + iCharAt2;
        int i58 = i5;
        int i59 = i57;
        int i60 = 0;
        int i61 = 0;
        while (i30 < length) {
            int i62 = i30 + 1;
            int iCharAt10 = strIAuthTabCallback.charAt(i30);
            if (iCharAt10 >= c) {
                int i63 = iCharAt10 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i27 = i64 + 1;
                    cCharAt12 = strIAuthTabCallback.charAt(i64);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i63 |= (cCharAt12 & 8191) << i65;
                    i65 += 13;
                    i64 = i27;
                }
                iCharAt10 = i63 | (cCharAt12 << i65);
                i16 = i27;
            } else {
                i16 = i62;
            }
            int i66 = i16 + 1;
            int iCharAt11 = strIAuthTabCallback.charAt(i16);
            if (iCharAt11 >= c) {
                int i67 = iCharAt11 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    cCharAt11 = strIAuthTabCallback.charAt(i68);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i67 |= (cCharAt11 & 8191) << i69;
                    i69 += 13;
                    i68 = i26;
                }
                iCharAt11 = i67 | (cCharAt11 << i69);
                i17 = i26;
            } else {
                i17 = i66;
            }
            int i70 = iCharAt11 & OggPageHeader.MAX_SEGMENT_COUNT;
            int i71 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i61] = i60;
                i61++;
            }
            int i72 = i7;
            if (i70 >= 51) {
                int i73 = i17 + 1;
                int iCharAt12 = strIAuthTabCallback.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i74 = iCharAt12 & 8191;
                    int i75 = 13;
                    while (true) {
                        i25 = i73 + 1;
                        cCharAt10 = strIAuthTabCallback.charAt(i73);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i74 |= (cCharAt10 & 8191) << i75;
                        i75 += 13;
                        i73 = i25;
                        c2 = 55296;
                    }
                    iCharAt12 = i74 | (cCharAt10 << i75);
                    i73 = i25;
                }
                int i76 = i70 - 51;
                int i77 = i73;
                if (i76 == 9 || i76 == 17) {
                    objArr[((i60 / 3) << 1) + 1] = objArrOnNavigationEvent[i3];
                    i3++;
                } else if (i76 == 12 && (rawMessageInfo.onExtraCallback().equals(LazyLayoutPagerKtExternalSyntheticLambda1.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr[((i60 / 3) << 1) + 1] = objArrOnNavigationEvent[i3];
                    i3++;
                }
                int i78 = iCharAt12 << 1;
                Object obj = objArrOnNavigationEvent[i78];
                if (obj instanceof Field) {
                    fieldOnNavigationEvent2 = (Field) obj;
                } else {
                    fieldOnNavigationEvent2 = onNavigationEvent(cls, (String) obj);
                    objArrOnNavigationEvent[i78] = fieldOnNavigationEvent2;
                }
                i18 = i6;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOnNavigationEvent2);
                int i79 = i78 + 1;
                Object obj2 = objArrOnNavigationEvent[i79];
                if (obj2 instanceof Field) {
                    fieldOnNavigationEvent3 = (Field) obj2;
                } else {
                    fieldOnNavigationEvent3 = onNavigationEvent(cls, (String) obj2);
                    objArrOnNavigationEvent[i79] = fieldOnNavigationEvent3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOnNavigationEvent3);
                iArr2 = iArr3;
                i19 = i3;
                i20 = i77;
                str = strIAuthTabCallback;
                i22 = 0;
            } else {
                i18 = i6;
                int i80 = i3 + 1;
                Field fieldOnNavigationEvent4 = onNavigationEvent(cls, (String) objArrOnNavigationEvent[i3]);
                if (i70 == 9 || i70 == 17) {
                    iArr2 = iArr3;
                    objArr[((i60 / 3) << 1) + 1] = fieldOnNavigationEvent4.getType();
                } else {
                    if (i70 == 27 || i70 == 49) {
                        iArr2 = iArr3;
                        i24 = i3 + 2;
                        objArr[((i60 / 3) << 1) + 1] = objArrOnNavigationEvent[i80];
                    } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                        iArr2 = iArr3;
                        if (rawMessageInfo.onExtraCallback() == LazyLayoutPagerKtExternalSyntheticLambda1.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i24 = i3 + 2;
                            objArr[((i60 / 3) << 1) + 1] = objArrOnNavigationEvent[i80];
                        }
                    } else if (i70 == 50) {
                        int i81 = i58 + 1;
                        iArr[i58] = i60;
                        int i82 = (i60 / 3) << 1;
                        int i83 = i3 + 2;
                        objArr[i82] = objArrOnNavigationEvent[i80];
                        if ((iCharAt11 & 2048) != 0) {
                            i80 = i3 + 3;
                            objArr[i82 + 1] = objArrOnNavigationEvent[i83];
                            iArr2 = iArr3;
                            i58 = i81;
                        } else {
                            i58 = i81;
                            i80 = i83;
                            iArr2 = iArr3;
                        }
                    } else {
                        iArr2 = iArr3;
                    }
                    i80 = i24;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldOnNavigationEvent4);
                if ((iCharAt11 & 4096) == 0 || i70 > 17) {
                    str = strIAuthTabCallback;
                    i19 = i80;
                    iObjectFieldOffset = 1048575;
                    i20 = i17;
                    i21 = 0;
                } else {
                    i20 = i17 + 1;
                    int iCharAt13 = strIAuthTabCallback.charAt(i17);
                    if (iCharAt13 >= 55296) {
                        int i84 = iCharAt13 & 8191;
                        int i85 = 13;
                        while (true) {
                            i23 = i20 + 1;
                            cCharAt9 = strIAuthTabCallback.charAt(i20);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i84 |= (cCharAt9 & 8191) << i85;
                            i85 += 13;
                            i20 = i23;
                        }
                        iCharAt13 = i84 | (cCharAt9 << i85);
                        i20 = i23;
                    }
                    int i86 = (i4 << 1) + (iCharAt13 / 32);
                    Object obj3 = objArrOnNavigationEvent[i86];
                    if (obj3 instanceof Field) {
                        fieldOnNavigationEvent = (Field) obj3;
                    } else {
                        fieldOnNavigationEvent = onNavigationEvent(cls, (String) obj3);
                        objArrOnNavigationEvent[i86] = fieldOnNavigationEvent;
                    }
                    str = strIAuthTabCallback;
                    i19 = i80;
                    i21 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOnNavigationEvent);
                }
                if (i70 >= 18 && i70 <= 49) {
                    iArr[i59] = iObjectFieldOffset3;
                    i59++;
                }
                i22 = i21;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            iArr2[i60] = iCharAt10;
            iArr2[i60 + 1] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i70 << 20) | iObjectFieldOffset2;
            iArr2[i60 + 2] = (i22 << 20) | iObjectFieldOffset;
            i60 += 3;
            i30 = i20;
            strIAuthTabCallback = str;
            i3 = i19;
            length = i71;
            iArr3 = iArr2;
            i7 = i72;
            i6 = i18;
            c = 55296;
        }
        return new LazyStaggeredGridStateExternalSyntheticLambda0<>(iArr3, objArr, i6, i7, rawMessageInfo.onWarmupCompleted(), rawMessageInfo.onExtraCallback(), false, iArr, i5, i57, lazyStaggeredGridStateExternalSyntheticLambda1, lazyStaggeredGridIntervalContentExternalSyntheticLambda0, pagerKtExternalSyntheticLambda2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, lazyStaggeredGridIntervalContentExternalSyntheticLambda3);
    }

    private static Field onNavigationEvent(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    static <T> LazyStaggeredGridStateExternalSyntheticLambda0<T> onExtraCallbackWithResult(PagerKtExternalSyntheticLambda4 pagerKtExternalSyntheticLambda4, LazyStaggeredGridStateExternalSyntheticLambda1 lazyStaggeredGridStateExternalSyntheticLambda1, LazyStaggeredGridIntervalContentExternalSyntheticLambda0 lazyStaggeredGridIntervalContentExternalSyntheticLambda0, PagerKtExternalSyntheticLambda2<?, ?> pagerKtExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, LazyStaggeredGridIntervalContentExternalSyntheticLambda3 lazyStaggeredGridIntervalContentExternalSyntheticLambda3) {
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        int i2;
        LazySaveableStateHolderCompanionExternalSyntheticLambda1[] lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback = pagerKtExternalSyntheticLambda4.IAuthTabCallback();
        if (lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback.length == 0) {
            iOnNavigationEvent = 0;
            iOnNavigationEvent2 = 0;
        } else {
            iOnNavigationEvent = lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback[0].onNavigationEvent();
            iOnNavigationEvent2 = lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback[lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback.length - 1].onNavigationEvent();
        }
        int length = lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length << 1];
        int i3 = 0;
        int i4 = 0;
        for (LazySaveableStateHolderCompanionExternalSyntheticLambda1 lazySaveableStateHolderCompanionExternalSyntheticLambda1 : lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback) {
            if (lazySaveableStateHolderCompanionExternalSyntheticLambda1.asBinder() == LazySaveableStateHolderExternalSyntheticLambda0.MAP) {
                i3++;
            } else if (lazySaveableStateHolderCompanionExternalSyntheticLambda1.asBinder().id() >= 18 && lazySaveableStateHolderCompanionExternalSyntheticLambda1.asBinder().id() <= 49) {
                i4++;
            }
        }
        int[] iArr2 = i3 > 0 ? new int[i3] : null;
        int[] iArr3 = i4 > 0 ? new int[i4] : null;
        int[] iArrOnNavigationEvent = pagerKtExternalSyntheticLambda4.onNavigationEvent();
        if (iArrOnNavigationEvent == null) {
            iArrOnNavigationEvent = IAuthTabCallback;
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i5 < lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback.length) {
            LazySaveableStateHolderCompanionExternalSyntheticLambda1 lazySaveableStateHolderCompanionExternalSyntheticLambda12 = lazySaveableStateHolderCompanionExternalSyntheticLambda1ArrIAuthTabCallback[i5];
            int iOnNavigationEvent3 = lazySaveableStateHolderCompanionExternalSyntheticLambda12.onNavigationEvent();
            onExtraCallback(lazySaveableStateHolderCompanionExternalSyntheticLambda12, iArr, i6, objArr);
            if (i7 < iArrOnNavigationEvent.length && iArrOnNavigationEvent[i7] == iOnNavigationEvent3) {
                iArrOnNavigationEvent[i7] = i6;
                i7++;
            }
            if (lazySaveableStateHolderCompanionExternalSyntheticLambda12.asBinder() == LazySaveableStateHolderExternalSyntheticLambda0.MAP) {
                iArr2[i8] = i6;
                i8++;
            } else {
                if (lazySaveableStateHolderCompanionExternalSyntheticLambda12.asBinder().id() >= 18 && lazySaveableStateHolderCompanionExternalSyntheticLambda12.asBinder().id() <= 49) {
                    i2 = i6;
                    iArr3[i9] = (int) PagerKtExternalSyntheticLambda5.onWarmupCompleted(lazySaveableStateHolderCompanionExternalSyntheticLambda12.IAuthTabCallback());
                    i9++;
                }
                i5++;
                i6 = i2 + 3;
            }
            i2 = i6;
            i5++;
            i6 = i2 + 3;
        }
        if (iArr2 == null) {
            iArr2 = IAuthTabCallback;
        }
        if (iArr3 == null) {
            iArr3 = IAuthTabCallback;
        }
        int[] iArr4 = new int[iArrOnNavigationEvent.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrOnNavigationEvent, 0, iArr4, 0, iArrOnNavigationEvent.length);
        System.arraycopy(iArr2, 0, iArr4, iArrOnNavigationEvent.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrOnNavigationEvent.length + iArr2.length, iArr3.length);
        return new LazyStaggeredGridStateExternalSyntheticLambda0<>(iArr, objArr, iOnNavigationEvent, iOnNavigationEvent2, pagerKtExternalSyntheticLambda4.onWarmupCompleted(), pagerKtExternalSyntheticLambda4.onExtraCallback(), true, iArr4, iArrOnNavigationEvent.length, iArrOnNavigationEvent.length + iArr2.length, lazyStaggeredGridStateExternalSyntheticLambda1, lazyStaggeredGridIntervalContentExternalSyntheticLambda0, pagerKtExternalSyntheticLambda2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, lazyStaggeredGridIntervalContentExternalSyntheticLambda3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onExtraCallback(LazySaveableStateHolderCompanionExternalSyntheticLambda1 lazySaveableStateHolderCompanionExternalSyntheticLambda1, int[] iArr, int i2, Object[] objArr) {
        int iOnWarmupCompleted;
        int iId;
        long jOnWarmupCompleted;
        int iOnWarmupCompleted2;
        int iNumberOfTrailingZeros;
        DefaultPagerStateExternalSyntheticLambda1 defaultPagerStateExternalSyntheticLambda1OnTransact = lazySaveableStateHolderCompanionExternalSyntheticLambda1.onTransact();
        if (defaultPagerStateExternalSyntheticLambda1OnTransact != null) {
            iId = lazySaveableStateHolderCompanionExternalSyntheticLambda1.asBinder().id() + 51;
            iOnWarmupCompleted = (int) PagerKtExternalSyntheticLambda5.onWarmupCompleted(defaultPagerStateExternalSyntheticLambda1OnTransact.onExtraCallbackWithResult());
            jOnWarmupCompleted = PagerKtExternalSyntheticLambda5.onWarmupCompleted(defaultPagerStateExternalSyntheticLambda1OnTransact.onWarmupCompleted());
        } else {
            LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda0AsBinder = lazySaveableStateHolderCompanionExternalSyntheticLambda1.asBinder();
            iOnWarmupCompleted = (int) PagerKtExternalSyntheticLambda5.onWarmupCompleted(lazySaveableStateHolderCompanionExternalSyntheticLambda1.IAuthTabCallback());
            iId = lazySaveableStateHolderExternalSyntheticLambda0AsBinder.id();
            if (!lazySaveableStateHolderExternalSyntheticLambda0AsBinder.isList() && !lazySaveableStateHolderExternalSyntheticLambda0AsBinder.isMap()) {
                Field fieldAsInterface = lazySaveableStateHolderCompanionExternalSyntheticLambda1.asInterface();
                iOnWarmupCompleted2 = fieldAsInterface == null ? 1048575 : (int) PagerKtExternalSyntheticLambda5.onWarmupCompleted(fieldAsInterface);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(lazySaveableStateHolderCompanionExternalSyntheticLambda1.IAuthTabCallbackStub());
            } else if (lazySaveableStateHolderCompanionExternalSyntheticLambda1.onWarmupCompleted() == null) {
                iOnWarmupCompleted2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jOnWarmupCompleted = PagerKtExternalSyntheticLambda5.onWarmupCompleted(lazySaveableStateHolderCompanionExternalSyntheticLambda1.onWarmupCompleted());
            }
            iArr[i2] = lazySaveableStateHolderCompanionExternalSyntheticLambda1.onNavigationEvent();
            iArr[i2 + 1] = (lazySaveableStateHolderCompanionExternalSyntheticLambda1.getInterfaceDescriptor() ? 268435456 : 0) | (!lazySaveableStateHolderCompanionExternalSyntheticLambda1.access000() ? 536870912 : 0) | (iId << 20) | iOnWarmupCompleted;
            iArr[i2 + 2] = iOnWarmupCompleted2 | (iNumberOfTrailingZeros << 20);
            Class<?> clsIAuthTabCallbackDefault = lazySaveableStateHolderCompanionExternalSyntheticLambda1.IAuthTabCallbackDefault();
            if (lazySaveableStateHolderCompanionExternalSyntheticLambda1.onExtraCallbackWithResult() != null) {
                if (clsIAuthTabCallbackDefault != null) {
                    objArr[((i2 / 3) << 1) + 1] = clsIAuthTabCallbackDefault;
                    return;
                } else {
                    if (lazySaveableStateHolderCompanionExternalSyntheticLambda1.onExtraCallback() != null) {
                        objArr[((i2 / 3) << 1) + 1] = lazySaveableStateHolderCompanionExternalSyntheticLambda1.onExtraCallback();
                        return;
                    }
                    return;
                }
            }
            int i3 = (i2 / 3) << 1;
            objArr[i3] = lazySaveableStateHolderCompanionExternalSyntheticLambda1.onExtraCallbackWithResult();
            if (clsIAuthTabCallbackDefault != null) {
                objArr[i3 + 1] = clsIAuthTabCallbackDefault;
                return;
            } else {
                if (lazySaveableStateHolderCompanionExternalSyntheticLambda1.onExtraCallback() != null) {
                    objArr[i3 + 1] = lazySaveableStateHolderCompanionExternalSyntheticLambda1.onExtraCallback();
                    return;
                }
                return;
            }
        }
        iOnWarmupCompleted2 = (int) jOnWarmupCompleted;
        iNumberOfTrailingZeros = 0;
        iArr[i2] = lazySaveableStateHolderCompanionExternalSyntheticLambda1.onNavigationEvent();
        if (!lazySaveableStateHolderCompanionExternalSyntheticLambda1.access000()) {
        }
        iArr[i2 + 1] = (lazySaveableStateHolderCompanionExternalSyntheticLambda1.getInterfaceDescriptor() ? 268435456 : 0) | (!lazySaveableStateHolderCompanionExternalSyntheticLambda1.access000() ? 536870912 : 0) | (iId << 20) | iOnWarmupCompleted;
        iArr[i2 + 2] = iOnWarmupCompleted2 | (iNumberOfTrailingZeros << 20);
        Class<?> clsIAuthTabCallbackDefault2 = lazySaveableStateHolderCompanionExternalSyntheticLambda1.IAuthTabCallbackDefault();
        if (lazySaveableStateHolderCompanionExternalSyntheticLambda1.onExtraCallbackWithResult() != null) {
        }
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public T onExtraCallback() {
        return (T) this.IAuthTabCallback_Parcel.onNavigationEvent(this.onWarmupCompleted);
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public boolean onExtraCallback(T t, T t2) {
        int length = this.onExtraCallback.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!onWarmupCompleted(t, t2, i2)) {
                return false;
            }
        }
        if (!this.readTypedObject.onWarmupCompleted(t).equals(this.readTypedObject.onWarmupCompleted(t2))) {
            return false;
        }
        if (this.onTransact) {
            return this.IAuthTabCallbackStub.IAuthTabCallback(t).equals(this.IAuthTabCallbackStub.IAuthTabCallback(t2));
        }
        return true;
    }

    private boolean onWarmupCompleted(T t, T t2, int i2) {
        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i2);
        long jAsBinder = asBinder(iIAuthTabCallbackStubProxy);
        switch (asInterface(iIAuthTabCallbackStubProxy)) {
            case 0:
                if (!onExtraCallback(t, t2, i2) || Double.doubleToLongBits(PagerKtExternalSyntheticLambda5.onExtraCallback(t, jAsBinder)) != Double.doubleToLongBits(PagerKtExternalSyntheticLambda5.onExtraCallback(t2, jAsBinder))) {
                }
                break;
            case 1:
                if (!onExtraCallback(t, t2, i2) || Float.floatToIntBits(PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, jAsBinder)) != Float.floatToIntBits(PagerKtExternalSyntheticLambda5.IAuthTabCallback(t2, jAsBinder))) {
                }
                break;
            case 2:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder)) {
                }
                break;
            case 3:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder)) {
                }
                break;
            case 4:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder)) {
                }
                break;
            case 5:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder)) {
                }
                break;
            case 6:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder)) {
                }
                break;
            case 7:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, jAsBinder) != PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, jAsBinder)) {
                }
                break;
            case 8:
                if (!onExtraCallback(t, t2, i2) || !LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder), PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder))) {
                }
                break;
            case 9:
                if (!onExtraCallback(t, t2, i2) || !LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder), PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder))) {
                }
                break;
            case 10:
                if (!onExtraCallback(t, t2, i2) || !LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder), PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder))) {
                }
                break;
            case 11:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder)) {
                }
                break;
            case 12:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder)) {
                }
                break;
            case 13:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder)) {
                }
                break;
            case 14:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder)) {
                }
                break;
            case 15:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder)) {
                }
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                if (!onExtraCallback(t, t2, i2) || PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder)) {
                }
                break;
            case 17:
                if (!onExtraCallback(t, t2, i2) || !LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder), PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!onExtraCallbackWithResult(t, t2, i2) || !LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder), PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder))) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0  */
    @Override // o.PagerDefaultsExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int IAuthTabCallback(T t) {
        int i2;
        int iIAuthTabCallback;
        int length = this.onExtraCallback.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i4);
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(i4);
            long jAsBinder = asBinder(iIAuthTabCallbackStubProxy);
            switch (asInterface(iIAuthTabCallbackStubProxy)) {
                case 0:
                    i2 = i3 * 53;
                    iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(Double.doubleToLongBits(PagerKtExternalSyntheticLambda5.onExtraCallback(t, jAsBinder)));
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iIAuthTabCallback = Float.floatToIntBits(PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, jAsBinder));
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder));
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder));
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder);
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder));
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder);
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.onExtraCallback(PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, jAsBinder));
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iIAuthTabCallback = ((String) PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder)).hashCode();
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 9:
                    Object objAsBinder = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder);
                    iIAuthTabCallback = objAsBinder != null ? objAsBinder.hashCode() : 37;
                    i2 = i3 * 53;
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder).hashCode();
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder);
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder);
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder);
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder));
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder);
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    i2 = i3 * 53;
                    iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder));
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 17:
                    Object objAsBinder2 = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder);
                    if (objAsBinder2 != null) {
                        iIAuthTabCallback = objAsBinder2.hashCode();
                    }
                    i2 = i3 * 53;
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                case 28:
                case 29:
                case 30:
                case 31:
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder).hashCode();
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iIAuthTabCallback = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder).hashCode();
                    i3 = i2 + iIAuthTabCallback;
                    break;
                case 51:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(Double.doubleToLongBits(IAuthTabCallbackDefault(t, jAsBinder)));
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = Float.floatToIntBits(asInterface(t, jAsBinder));
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(IAuthTabCallbackStub(t, jAsBinder));
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(IAuthTabCallbackStub(t, jAsBinder));
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = asBinder(t, jAsBinder);
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(IAuthTabCallbackStub(t, jAsBinder));
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = asBinder(t, jAsBinder);
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.onExtraCallback(onTransact(t, jAsBinder));
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = ((String) PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder)).hashCode();
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder).hashCode();
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder).hashCode();
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = asBinder(t, jAsBinder);
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = asBinder(t, jAsBinder);
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = asBinder(t, jAsBinder);
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(IAuthTabCallbackStub(t, jAsBinder));
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = asBinder(t, jAsBinder);
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(IAuthTabCallbackStub(t, jAsBinder));
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i4)) {
                        i2 = i3 * 53;
                        iIAuthTabCallback = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder).hashCode();
                        i3 = i2 + iIAuthTabCallback;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode = (i3 * 53) + this.readTypedObject.onWarmupCompleted(t).hashCode();
        return this.onTransact ? (iHashCode * 53) + this.IAuthTabCallbackStub.IAuthTabCallback(t).hashCode() : iHashCode;
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public void onExtraCallbackWithResult(T t, T t2) {
        onNavigationEvent(t);
        for (int i2 = 0; i2 < this.onExtraCallback.length; i2 += 3) {
            asInterface(t, t2, i2);
        }
        LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(this.readTypedObject, t, t2);
        if (this.onTransact) {
            LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(this.IAuthTabCallbackStub, t, t2);
        }
    }

    private void asInterface(T t, T t2, int i2) {
        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i2);
        long jAsBinder = asBinder(iIAuthTabCallbackStubProxy);
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(i2);
        switch (asInterface(iIAuthTabCallbackStubProxy)) {
            case 0:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallback(t, jAsBinder, PagerKtExternalSyntheticLambda5.onExtraCallback(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 1:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, jAsBinder, PagerKtExternalSyntheticLambda5.IAuthTabCallback(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 2:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, jAsBinder, PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 3:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, jAsBinder, PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 4:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t, jAsBinder, PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 5:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, jAsBinder, PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 6:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t, jAsBinder, PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 7:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallback(t, jAsBinder, PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 8:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, jAsBinder, PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 9:
                IAuthTabCallback(t, t2, i2);
                break;
            case 10:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, jAsBinder, PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 11:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t, jAsBinder, PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 12:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t, jAsBinder, PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 13:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t, jAsBinder, PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 14:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, jAsBinder, PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 15:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t, jAsBinder, PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
                    PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, jAsBinder, PagerKtExternalSyntheticLambda5.asInterface(t2, jAsBinder));
                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                    break;
                }
                break;
            case 17:
                IAuthTabCallback(t, t2, i2);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
            case 28:
            case 29:
            case 30:
            case 31:
            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.IAuthTabCallbackDefault.onNavigationEvent(t, t2, jAsBinder);
                break;
            case 50:
                LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(this.IAuthTabCallbackStubProxy, t, t2, jAsBinder);
                break;
            case 51:
            case 52:
            case 53:
            case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackStub, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, jAsBinder, PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder));
                    onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i2);
                    break;
                }
                break;
            case 60:
                onNavigationEvent(t, t2, i2);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackStub, i2)) {
                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, jAsBinder, PagerKtExternalSyntheticLambda5.asBinder(t2, jAsBinder));
                    onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i2);
                    break;
                }
                break;
            case 68:
                onNavigationEvent(t, t2, i2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void IAuthTabCallback(T t, T t2, int i2) {
        if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2)) {
            long jAsBinder = asBinder(IAuthTabCallbackStubProxy(i2));
            Unsafe unsafe = onNavigationEvent;
            Object object = unsafe.getObject(t2, jAsBinder);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + IAuthTabCallbackStub(i2) + " is present but null: " + t2);
            }
            PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(i2);
            if (!onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2)) {
                if (!IAuthTabCallbackStub(object)) {
                    unsafe.putObject(t, jAsBinder, object);
                } else {
                    Object objOnExtraCallback = pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
                    pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(objOnExtraCallback, object);
                    unsafe.putObject(t, jAsBinder, objOnExtraCallback);
                }
                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
                return;
            }
            Object object2 = unsafe.getObject(t, jAsBinder);
            if (!IAuthTabCallbackStub(object2)) {
                Object objOnExtraCallback2 = pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
                pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(objOnExtraCallback2, object2);
                unsafe.putObject(t, jAsBinder, objOnExtraCallback2);
                object2 = objOnExtraCallback2;
            }
            pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onNavigationEvent(T t, T t2, int i2) {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(i2);
        if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackStub, i2)) {
            long jAsBinder = asBinder(IAuthTabCallbackStubProxy(i2));
            Unsafe unsafe = onNavigationEvent;
            Object object = unsafe.getObject(t2, jAsBinder);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + IAuthTabCallbackStub(i2) + " is present but null: " + t2);
            }
            PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(i2);
            if (!IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i2)) {
                if (!IAuthTabCallbackStub(object)) {
                    unsafe.putObject(t, jAsBinder, object);
                } else {
                    Object objOnExtraCallback = pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
                    pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(objOnExtraCallback, object);
                    unsafe.putObject(t, jAsBinder, objOnExtraCallback);
                }
                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i2);
                return;
            }
            Object object2 = unsafe.getObject(t, jAsBinder);
            if (!IAuthTabCallbackStub(object2)) {
                Object objOnExtraCallback2 = pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
                pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(objOnExtraCallback2, object2);
                unsafe.putObject(t, jAsBinder, objOnExtraCallback2);
                object2 = objOnExtraCallback2;
            }
            pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public int onExtraCallback(T t) {
        int i2;
        int i3;
        int i4;
        boolean z;
        int iOnExtraCallback;
        int iOnWarmupCompleted;
        int iAsInterface;
        int iOnTransact;
        Unsafe unsafe = onNavigationEvent;
        ?? r9 = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i7 < this.onExtraCallback.length) {
            int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i7);
            int iAsInterface2 = asInterface(iIAuthTabCallbackStubProxy);
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(i7);
            int i10 = this.onExtraCallback[i7 + 2];
            int i11 = i10 & i5;
            if (iAsInterface2 <= 17) {
                if (i11 != i9) {
                    i6 = i11 == i5 ? r9 : unsafe.getInt(t, i11);
                    i9 = i11;
                }
                i2 = i9;
                i3 = i6;
                i4 = 1 << (i10 >>> 20);
            } else {
                i2 = i9;
                i3 = i6;
                i4 = r9;
            }
            long jAsBinder = asBinder(iIAuthTabCallbackStubProxy);
            if (iAsInterface2 < LazySaveableStateHolderExternalSyntheticLambda0.DOUBLE_LIST_PACKED.id() || iAsInterface2 > LazySaveableStateHolderExternalSyntheticLambda0.SINT64_LIST_PACKED.id()) {
                i11 = r9;
            }
            int i12 = i11;
            switch (iAsInterface2) {
                case 0:
                    z = r9;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        break;
                    } else {
                        iOnExtraCallback = CodedOutputStream.onExtraCallback(iIAuthTabCallbackStub, 0.0d);
                        i8 += iOnExtraCallback;
                        break;
                    }
                case 1:
                    z = r9;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        break;
                    } else {
                        iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, 0.0f);
                        i8 += iOnExtraCallback;
                        break;
                    }
                case 2:
                    z = r9;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        break;
                    } else {
                        iOnExtraCallback = CodedOutputStream.onExtraCallbackWithResult(iIAuthTabCallbackStub, unsafe.getLong(t, jAsBinder));
                        i8 += iOnExtraCallback;
                        break;
                    }
                case 3:
                    z = r9;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        break;
                    } else {
                        iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, unsafe.getLong(t, jAsBinder));
                        i8 += iOnExtraCallback;
                        break;
                    }
                case 4:
                    z = r9;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        break;
                    } else {
                        iOnExtraCallback = CodedOutputStream.IAuthTabCallback(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        i8 += iOnExtraCallback;
                        break;
                    }
                case 5:
                    z = r9;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        break;
                    } else {
                        iOnExtraCallback = CodedOutputStream.onExtraCallback(iIAuthTabCallbackStub, 0L);
                        i8 += iOnExtraCallback;
                        break;
                    }
                case 6:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        z = false;
                        iOnExtraCallback = CodedOutputStream.onExtraCallback(iIAuthTabCallbackStub, 0);
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = CodedOutputStream.IAuthTabCallback(iIAuthTabCallbackStub, true);
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        Object object = unsafe.getObject(t, jAsBinder);
                        if (object instanceof LazyLayoutKtExternalSyntheticLambda3) {
                            iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, (LazyLayoutKtExternalSyntheticLambda3) object);
                        } else {
                            iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, (String) object);
                        }
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), onNavigationEvent(i7));
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, (LazyLayoutKtExternalSyntheticLambda3) unsafe.getObject(t, jAsBinder));
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = CodedOutputStream.IAuthTabCallbackStub(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = CodedOutputStream.onWarmupCompleted(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        z = false;
                        iOnExtraCallback = CodedOutputStream.onExtraCallbackWithResult(iIAuthTabCallbackStub, 0);
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = CodedOutputStream.onWarmupCompleted(iIAuthTabCallbackStub, 0L);
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = CodedOutputStream.IAuthTabCallback(iIAuthTabCallbackStub, unsafe.getLong(t, jAsBinder));
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i4)) {
                        iOnExtraCallback = CodedOutputStream.onExtraCallbackWithResult(iIAuthTabCallbackStub, (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) unsafe.getObject(t, jAsBinder), onNavigationEvent(i7));
                        z = false;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = false;
                    break;
                case 18:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, (List<?>) unsafe.getObject(t, jAsBinder), (boolean) r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 19:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 20:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStub(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 21:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackDefault(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 22:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, (List<Integer>) unsafe.getObject(t, jAsBinder), (boolean) r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 23:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, (List<?>) unsafe.getObject(t, jAsBinder), (boolean) r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 24:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 25:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 26:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder));
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, (List<?>) unsafe.getObject(t, jAsBinder), onNavigationEvent(i7));
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 28:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, (List<LazyLayoutKtExternalSyntheticLambda3>) unsafe.getObject(t, jAsBinder));
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 29:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.asBinder(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 30:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, (List<Integer>) unsafe.getObject(t, jAsBinder), (boolean) r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 31:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, (List<?>) unsafe.getObject(t, jAsBinder), (boolean) r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onTransact(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 34:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.asInterface(iIAuthTabCallbackStub, (List) unsafe.getObject(t, jAsBinder), r9);
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 35:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 36:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 37:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStub((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 38:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.asInterface((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 39:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 40:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 41:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 42:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 43:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.asBinder((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 44:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult((List<Integer>) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 45:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 46:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 47:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackDefault((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 48:
                    iOnWarmupCompleted = LazyLayoutPagerKtExternalSyntheticLambda3.onTransact((List) unsafe.getObject(t, jAsBinder));
                    if (iOnWarmupCompleted > 0) {
                        if (this.writeTypedObject) {
                            unsafe.putInt(t, i12, iOnWarmupCompleted);
                        }
                        iAsInterface = CodedOutputStream.asInterface(iIAuthTabCallbackStub);
                        iOnTransact = CodedOutputStream.onTransact(iOnWarmupCompleted);
                        i8 += iAsInterface + iOnTransact + iOnWarmupCompleted;
                    }
                    z = r9;
                    break;
                case 49:
                    iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, (List<LazyStaggeredGridMeasureKtExternalSyntheticLambda1>) unsafe.getObject(t, jAsBinder), onNavigationEvent(i7));
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 50:
                    iOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), onExtraCallback(i7));
                    z = r9;
                    i8 += iOnExtraCallback;
                    break;
                case 51:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onExtraCallback(iIAuthTabCallbackStub, 0.0d);
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 52:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, 0.0f);
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 53:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onExtraCallbackWithResult(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, jAsBinder));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, jAsBinder));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 55:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.IAuthTabCallback(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 56:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onExtraCallback(iIAuthTabCallbackStub, 0L);
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 57:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onExtraCallback(iIAuthTabCallbackStub, (int) r9);
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 58:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.IAuthTabCallback(iIAuthTabCallbackStub, true);
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 59:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        Object object2 = unsafe.getObject(t, jAsBinder);
                        if (object2 instanceof LazyLayoutKtExternalSyntheticLambda3) {
                            iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, (LazyLayoutKtExternalSyntheticLambda3) object2);
                        } else {
                            iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, (String) object2);
                        }
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 60:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), onNavigationEvent(i7));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 61:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, (LazyLayoutKtExternalSyntheticLambda3) unsafe.getObject(t, jAsBinder));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 62:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.IAuthTabCallbackStub(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 63:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onWarmupCompleted(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 64:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onExtraCallbackWithResult(iIAuthTabCallbackStub, (int) r9);
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 65:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onWarmupCompleted(iIAuthTabCallbackStub, 0L);
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 66:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onNavigationEvent(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 67:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.IAuthTabCallback(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, jAsBinder));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                case 68:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7)) {
                        iOnExtraCallback = CodedOutputStream.onExtraCallbackWithResult(iIAuthTabCallbackStub, (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) unsafe.getObject(t, jAsBinder), onNavigationEvent(i7));
                        z = r9;
                        i8 += iOnExtraCallback;
                        break;
                    }
                    z = r9;
                    break;
                default:
                    z = r9;
                    break;
            }
            i7 += 3;
            i9 = i2;
            r9 = z;
            i6 = i3;
            i5 = 1048575;
        }
        int iOnExtraCallbackWithResult = i8 + onExtraCallbackWithResult(this.readTypedObject, (PagerKtExternalSyntheticLambda2) t);
        return this.onTransact ? iOnExtraCallbackWithResult + this.IAuthTabCallbackStub.IAuthTabCallback(t).onTransact() : iOnExtraCallbackWithResult;
    }

    private <UT, UB> int onExtraCallbackWithResult(PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, T t) {
        return pagerKtExternalSyntheticLambda2.IAuthTabCallback(pagerKtExternalSyntheticLambda2.onWarmupCompleted(t));
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public void onNavigationEvent(T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        if (pagerMeasureKtExternalSyntheticLambda3.onExtraCallback() == PagerMeasureKtExternalSyntheticLambda3.onNavigationEvent.DESCENDING) {
            IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, pagerMeasureKtExternalSyntheticLambda3);
        } else {
            onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, pagerMeasureKtExternalSyntheticLambda3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onWarmupCompleted(T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i2;
        Map.Entry<?, ?> entry2;
        int i3;
        int i4;
        Map.Entry<?, ?> entry3;
        boolean z;
        if (this.onTransact) {
            LazySaveableStateHolderExternalSyntheticLambda2<T> lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback(t);
            if (lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback.asInterface()) {
                entry = null;
                it = null;
            } else {
                Iterator itAsBinder = lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback.asBinder();
                entry = (Map.Entry) itAsBinder.next();
                it = itAsBinder;
            }
        }
        int length = this.onExtraCallback.length;
        Unsafe unsafe = onNavigationEvent;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < length) {
            int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i8);
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(i8);
            int iAsInterface = asInterface(iIAuthTabCallbackStubProxy);
            if (iAsInterface <= 17) {
                int i9 = this.onExtraCallback[i8 + 2];
                int i10 = i9 & i5;
                Map.Entry<?, ?> entry4 = entry;
                if (i10 != i6) {
                    i7 = i10 == i5 ? 0 : unsafe.getInt(t, i10);
                    i6 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = i6;
                i3 = i11;
                entry2 = entry4;
            } else {
                i2 = i6;
                entry2 = entry;
                i3 = 0;
            }
            int i12 = i7;
            while (entry2 != null && this.IAuthTabCallbackStub.IAuthTabCallback(entry2) <= iIAuthTabCallbackStub) {
                this.IAuthTabCallbackStub.onExtraCallback(pagerMeasureKtExternalSyntheticLambda3, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jAsBinder = asBinder(iIAuthTabCallbackStubProxy);
            switch (iAsInterface) {
                case 0:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, IAuthTabCallback(t, jAsBinder));
                        break;
                    }
                case 1:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, onWarmupCompleted(t, jAsBinder));
                        break;
                    }
                case 2:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, unsafe.getLong(t, jAsBinder));
                        break;
                    }
                case 3:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, unsafe.getLong(t, jAsBinder));
                        break;
                    }
                case 4:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        break;
                    }
                case 5:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, unsafe.getLong(t, jAsBinder));
                        break;
                    }
                case 6:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        break;
                    }
                case 7:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, onNavigationEvent(t, jAsBinder));
                        break;
                    }
                case 8:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        onExtraCallback(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3);
                        break;
                    }
                case 9:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), onNavigationEvent(i8));
                        break;
                    }
                case 10:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, (LazyLayoutKtExternalSyntheticLambda3) unsafe.getObject(t, jAsBinder));
                        break;
                    }
                case 11:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.asBinder(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        break;
                    }
                case 12:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        break;
                    }
                case 13:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        break;
                    }
                case 14:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, unsafe.getLong(t, jAsBinder));
                        break;
                    }
                case 15:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, unsafe.getInt(t, jAsBinder));
                        break;
                    }
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    i4 = length;
                    entry3 = entry2;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, unsafe.getLong(t, jAsBinder));
                        break;
                    }
                case 17:
                    entry3 = entry2;
                    i4 = length;
                    if (!onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i8, i2, i12, i3)) {
                        break;
                    } else {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), onNavigationEvent(i8));
                        break;
                    }
                case 18:
                    z = false;
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 19:
                    z = false;
                    LazyLayoutPagerKtExternalSyntheticLambda3.asBinder(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 20:
                    z = false;
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStub(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 21:
                    z = false;
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStubProxy(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 22:
                    z = false;
                    LazyLayoutPagerKtExternalSyntheticLambda3.asInterface(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 23:
                    z = false;
                    LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 24:
                    z = false;
                    LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 25:
                    z = false;
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(IAuthTabCallbackStub(i8), (List<Boolean>) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 26:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(IAuthTabCallbackStub(i8), (List<String>) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(IAuthTabCallbackStub(i8), (List<?>) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, onNavigationEvent(i8));
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 28:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallbackStub(i8), (List<LazyLayoutKtExternalSyntheticLambda3>) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 29:
                    LazyLayoutPagerKtExternalSyntheticLambda3.getInterfaceDescriptor(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 30:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(IAuthTabCallbackStub(i8), (List<Integer>) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 31:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackDefault(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onTransact(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback_Parcel(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 34:
                    LazyLayoutPagerKtExternalSyntheticLambda3.access100(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, false);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 35:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 36:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asBinder(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 37:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStub(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 38:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStubProxy(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 39:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asInterface(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 40:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 41:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 42:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(IAuthTabCallbackStub(i8), (List<Boolean>) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 43:
                    LazyLayoutPagerKtExternalSyntheticLambda3.getInterfaceDescriptor(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 44:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(IAuthTabCallbackStub(i8), (List<Integer>) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 45:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackDefault(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 46:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onTransact(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 47:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback_Parcel(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 48:
                    LazyLayoutPagerKtExternalSyntheticLambda3.access100(IAuthTabCallbackStub(i8), (List) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, true);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 49:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(IAuthTabCallbackStub(i8), (List<?>) unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3, onNavigationEvent(i8));
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 50:
                    onExtraCallbackWithResult(pagerMeasureKtExternalSyntheticLambda3, iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), i8);
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 51:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, IAuthTabCallbackDefault(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 52:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, asInterface(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 53:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 55:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 56:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 57:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 58:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, onTransact(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 59:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        onExtraCallback(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), pagerMeasureKtExternalSyntheticLambda3);
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 60:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), onNavigationEvent(i8));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 61:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, (LazyLayoutKtExternalSyntheticLambda3) unsafe.getObject(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 62:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.asBinder(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 63:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 64:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 65:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 66:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, asBinder(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 67:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, jAsBinder));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                case 68:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i8)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, unsafe.getObject(t, jAsBinder), onNavigationEvent(i8));
                    }
                    i4 = length;
                    entry3 = entry2;
                    break;
                default:
                    i4 = length;
                    entry3 = entry2;
                    break;
            }
            i8 += 3;
            i6 = i2;
            entry = entry3;
            i7 = i12;
            length = i4;
            i5 = 1048575;
        }
        while (entry != null) {
            this.IAuthTabCallbackStub.onExtraCallback(pagerMeasureKtExternalSyntheticLambda3, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        onWarmupCompleted(this.readTypedObject, (PagerKtExternalSyntheticLambda2) t, pagerMeasureKtExternalSyntheticLambda3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void IAuthTabCallback(T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        Iterator itOnNavigationEvent;
        Map.Entry<?, ?> entry;
        onWarmupCompleted(this.readTypedObject, (PagerKtExternalSyntheticLambda2) t, pagerMeasureKtExternalSyntheticLambda3);
        if (this.onTransact) {
            LazySaveableStateHolderExternalSyntheticLambda2<T> lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback(t);
            if (lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback.asInterface()) {
                itOnNavigationEvent = null;
                entry = null;
            } else {
                itOnNavigationEvent = lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback.onNavigationEvent();
                entry = (Map.Entry) itOnNavigationEvent.next();
            }
        }
        for (int length = this.onExtraCallback.length - 3; length >= 0; length -= 3) {
            int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(length);
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(length);
            while (entry != null && this.IAuthTabCallbackStub.IAuthTabCallback(entry) > iIAuthTabCallbackStub) {
                this.IAuthTabCallbackStub.onExtraCallback(pagerMeasureKtExternalSyntheticLambda3, entry);
                entry = itOnNavigationEvent.hasNext() ? (Map.Entry) itOnNavigationEvent.next() : null;
            }
            switch (asInterface(iIAuthTabCallbackStubProxy)) {
                case 0:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, IAuthTabCallback(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, onWarmupCompleted(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, onExtraCallback(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, onExtraCallback(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, onExtraCallbackWithResult(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, onExtraCallback(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, onExtraCallbackWithResult(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, onNavigationEvent(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        onExtraCallback(iIAuthTabCallbackStub, PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), onNavigationEvent(length));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, (LazyLayoutKtExternalSyntheticLambda3) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.asBinder(iIAuthTabCallbackStub, onExtraCallbackWithResult(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, onExtraCallbackWithResult(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, onExtraCallbackWithResult(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, onExtraCallback(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, onExtraCallbackWithResult(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, onExtraCallback(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), onNavigationEvent(length));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 19:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asBinder(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 20:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStub(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 21:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStubProxy(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 22:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asInterface(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 23:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 24:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 25:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(IAuthTabCallbackStub(length), (List<Boolean>) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 26:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(IAuthTabCallbackStub(length), (List<String>) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3);
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(IAuthTabCallbackStub(length), (List<?>) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, onNavigationEvent(length));
                    break;
                case 28:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallbackStub(length), (List<LazyLayoutKtExternalSyntheticLambda3>) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3);
                    break;
                case 29:
                    LazyLayoutPagerKtExternalSyntheticLambda3.getInterfaceDescriptor(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 30:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(IAuthTabCallbackStub(length), (List<Integer>) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 31:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackDefault(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onTransact(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback_Parcel(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 34:
                    LazyLayoutPagerKtExternalSyntheticLambda3.access100(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, false);
                    break;
                case 35:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 36:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asBinder(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 37:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStub(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 38:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStubProxy(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 39:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asInterface(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 40:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 41:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 42:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(IAuthTabCallbackStub(length), (List<Boolean>) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 43:
                    LazyLayoutPagerKtExternalSyntheticLambda3.getInterfaceDescriptor(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 44:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(IAuthTabCallbackStub(length), (List<Integer>) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 45:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackDefault(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 46:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onTransact(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 47:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback_Parcel(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 48:
                    LazyLayoutPagerKtExternalSyntheticLambda3.access100(IAuthTabCallbackStub(length), (List) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, true);
                    break;
                case 49:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(IAuthTabCallbackStub(length), (List<?>) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3, onNavigationEvent(length));
                    break;
                case 50:
                    onExtraCallbackWithResult(pagerMeasureKtExternalSyntheticLambda3, iIAuthTabCallbackStub, PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), length);
                    break;
                case 51:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, IAuthTabCallbackDefault(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, asInterface(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iIAuthTabCallbackStub, asBinder(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, asBinder(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, onTransact(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        onExtraCallback(iIAuthTabCallbackStub, PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), pagerMeasureKtExternalSyntheticLambda3);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), onNavigationEvent(length));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, (LazyLayoutKtExternalSyntheticLambda3) PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.asBinder(iIAuthTabCallbackStub, asBinder(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, asBinder(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, asBinder(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iIAuthTabCallbackStub, asBinder(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iIAuthTabCallbackStub, IAuthTabCallbackStub(t, asBinder(iIAuthTabCallbackStubProxy)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, length)) {
                        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iIAuthTabCallbackStub, PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(iIAuthTabCallbackStubProxy)), onNavigationEvent(length));
                        break;
                    } else {
                        break;
                    }
            }
        }
        while (entry != null) {
            this.IAuthTabCallbackStub.onExtraCallback(pagerMeasureKtExternalSyntheticLambda3, entry);
            entry = itOnNavigationEvent.hasNext() ? (Map.Entry) itOnNavigationEvent.next() : null;
        }
    }

    private <K, V> void onExtraCallbackWithResult(PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(i2, this.IAuthTabCallbackStubProxy.onExtraCallback(onExtraCallback(i3)), this.IAuthTabCallbackStubProxy.IAuthTabCallback(obj));
        }
    }

    private <UT, UB> void onWarmupCompleted(PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        pagerKtExternalSyntheticLambda2.IAuthTabCallback(pagerKtExternalSyntheticLambda2.onWarmupCompleted(t), pagerMeasureKtExternalSyntheticLambda3);
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public void onExtraCallback(T t, Reader reader, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws Throwable {
        onNavigationEvent(t);
        onWarmupCompleted(this.readTypedObject, this.IAuthTabCallbackStub, (LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4) t, reader, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x06a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        r0 = r18.onExtraCallbackWithResult;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        if (r0 >= r18.extraCallback) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        r4 = IAuthTabCallback(r21, r18.asBinder[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
    
        if (r4 == null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        r7.onNavigationEvent(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0658 A[Catch: all -> 0x06ad, TRY_LEAVE, TryCatch #5 {all -> 0x06ad, blocks: (B:174:0x0628, B:184:0x0652, B:186:0x0658, B:195:0x067d, B:196:0x0681), top: B:224:0x0628 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06c1 A[LOOP:4: B:215:0x06bd->B:217:0x06c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <UT, UB, ET extends LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult<ET>> void onWarmupCompleted(PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<ET> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, T t, Reader reader, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws Throwable {
        Object obj;
        T t2;
        PagerKtExternalSyntheticLambda2 pagerKtExternalSyntheticLambda22;
        int i2;
        Object objIAuthTabCallback;
        T t3;
        LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
        Object objIAuthTabCallback2;
        Object objIAuthTabCallback3;
        PagerKtExternalSyntheticLambda2 pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda2;
        T t4 = t;
        LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2;
        Object objOnNavigationEvent = null;
        Object objOnExtraCallback = null;
        while (true) {
            try {
                int iOnWarmupCompleted = reader.onWarmupCompleted();
                int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(iOnWarmupCompleted);
                if (iIAuthTabCallbackDefault >= 0) {
                    t2 = t4;
                    try {
                        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(iIAuthTabCallbackDefault);
                        try {
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            obj = objOnNavigationEvent;
                            lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                        }
                        switch (asInterface(iIAuthTabCallbackStubProxy)) {
                            case 0:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallback(t2, asBinder(iIAuthTabCallbackStubProxy), reader.IAuthTabCallback());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 1:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), reader.asInterface());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 2:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.IAuthTabCallback(t2, asBinder(iIAuthTabCallbackStubProxy), reader.IAuthTabCallback_Parcel());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 3:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.IAuthTabCallback(t2, asBinder(iIAuthTabCallbackStubProxy), reader.writeTypedObject());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 4:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t2, asBinder(iIAuthTabCallbackStubProxy), reader.IAuthTabCallbackDefault());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 5:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.IAuthTabCallback(t2, asBinder(iIAuthTabCallbackStubProxy), reader.asBinder());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 6:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t2, asBinder(iIAuthTabCallbackStubProxy), reader.onTransact());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 7:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallback(t2, asBinder(iIAuthTabCallbackStubProxy), reader.onExtraCallback());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 8:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                onWarmupCompleted((Object) t2, iIAuthTabCallbackStubProxy, reader);
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 9:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1 = (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                reader.onExtraCallbackWithResult((Reader) lazyStaggeredGridMeasureKtExternalSyntheticLambda1, (PagerDefaultsExternalSyntheticLambda0<Reader>) onNavigationEvent(iIAuthTabCallbackDefault), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22);
                                onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault, lazyStaggeredGridMeasureKtExternalSyntheticLambda1);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 10:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), reader.onNavigationEvent());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 11:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t2, asBinder(iIAuthTabCallbackStubProxy), reader.extraCallback());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 12:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                int iIAuthTabCallbackStub = reader.IAuthTabCallbackStub();
                                LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(iIAuthTabCallbackDefault);
                                if (onnavigationeventOnWarmupCompleted != null && !onnavigationeventOnWarmupCompleted.onExtraCallbackWithResult(iIAuthTabCallbackStub)) {
                                    objIAuthTabCallback3 = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(t2, iOnWarmupCompleted, iIAuthTabCallbackStub, obj, pagerKtExternalSyntheticLambda22);
                                    objOnNavigationEvent = objIAuthTabCallback3;
                                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                    pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                    t4 = t2;
                                }
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t2, asBinder(iIAuthTabCallbackStubProxy), iIAuthTabCallbackStub);
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                                break;
                            case 13:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t2, asBinder(iIAuthTabCallbackStubProxy), reader.IAuthTabCallbackStubProxy());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 14:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.IAuthTabCallback(t2, asBinder(iIAuthTabCallbackStubProxy), reader.access000());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 15:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t2, asBinder(iIAuthTabCallbackStubProxy), reader.access100());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                PagerKtExternalSyntheticLambda5.IAuthTabCallback(t2, asBinder(iIAuthTabCallbackStubProxy), reader.getInterfaceDescriptor());
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 17:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda12 = (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault);
                                reader.IAuthTabCallback(lazyStaggeredGridMeasureKtExternalSyntheticLambda12, onNavigationEvent(iIAuthTabCallbackDefault), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22);
                                onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iIAuthTabCallbackDefault, lazyStaggeredGridMeasureKtExternalSyntheticLambda12);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 18:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.onWarmupCompleted(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 19:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallbackStub(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 20:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.onTransact(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 21:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.extraCallback(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 22:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallbackDefault(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 23:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.asBinder(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 24:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallback(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 25:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.onNavigationEvent(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 26:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                onExtraCallbackWithResult(t2, iIAuthTabCallbackStubProxy, reader);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                onExtraCallbackWithResult(t, iIAuthTabCallbackStubProxy, reader, onNavigationEvent(iIAuthTabCallbackDefault), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 28:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.onExtraCallbackWithResult(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 29:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.extraCallbackWithResult(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 30:
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                List<Integer> listOnExtraCallbackWithResult = this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy));
                                reader.onExtraCallback(listOnExtraCallbackWithResult);
                                objIAuthTabCallback3 = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(t, iOnWarmupCompleted, listOnExtraCallbackWithResult, onWarmupCompleted(iIAuthTabCallbackDefault), objOnNavigationEvent, pagerKtExternalSyntheticLambda2);
                                objOnNavigationEvent = objIAuthTabCallback3;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 31:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.asInterface(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallback_Parcel(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.access000(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 34:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallbackStubProxy(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 35:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.onWarmupCompleted(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 36:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallbackStub(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 37:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.onTransact(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 38:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.extraCallback(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 39:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallbackDefault(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 40:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.asBinder(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 41:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallback(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 42:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.onNavigationEvent(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 43:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.extraCallbackWithResult(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 44:
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                List<Integer> listOnExtraCallbackWithResult2 = this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy));
                                reader.onExtraCallback(listOnExtraCallbackWithResult2);
                                objIAuthTabCallback3 = LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(t, iOnWarmupCompleted, listOnExtraCallbackWithResult2, onWarmupCompleted(iIAuthTabCallbackDefault), objOnNavigationEvent, pagerKtExternalSyntheticLambda2);
                                objOnNavigationEvent = objIAuthTabCallback3;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 45:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.asInterface(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 46:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallback_Parcel(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 47:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.access000(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 48:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                reader.IAuthTabCallbackStubProxy(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy)));
                                objOnNavigationEvent = obj;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 49:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                try {
                                    pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                    onWarmupCompleted(t, asBinder(iIAuthTabCallbackStubProxy), reader, onNavigationEvent(iIAuthTabCallbackDefault), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
                                    objOnNavigationEvent = obj;
                                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                    pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                    t4 = t2;
                                } catch (Throwable th) {
                                    th = th;
                                    pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                    objOnNavigationEvent = obj;
                                    objIAuthTabCallback = objOnNavigationEvent;
                                    while (i2 < this.extraCallback) {
                                    }
                                    if (objIAuthTabCallback != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                try {
                                    obj = objOnNavigationEvent;
                                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                    try {
                                        try {
                                            onWarmupCompleted(t, iIAuthTabCallbackDefault, onExtraCallback(iIAuthTabCallbackDefault), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, reader);
                                            pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                            objOnNavigationEvent = obj;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                            pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                            objOnNavigationEvent = obj;
                                            if (pagerKtExternalSyntheticLambda22.onExtraCallback(reader)) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                        objOnNavigationEvent = obj;
                                        objIAuthTabCallback = objOnNavigationEvent;
                                        while (i2 < this.extraCallback) {
                                        }
                                        if (objIAuthTabCallback != null) {
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    obj = objOnNavigationEvent;
                                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = objOnNavigationEvent;
                                }
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                                break;
                            case 51:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Double.valueOf(reader.IAuthTabCallback()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 52:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Float.valueOf(reader.asInterface()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 53:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Long.valueOf(reader.IAuthTabCallback_Parcel()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Long.valueOf(reader.writeTypedObject()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 55:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Integer.valueOf(reader.IAuthTabCallbackDefault()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 56:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Long.valueOf(reader.asBinder()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 57:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Integer.valueOf(reader.onTransact()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 58:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Boolean.valueOf(reader.onExtraCallback()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 59:
                                onWarmupCompleted((Object) t2, iIAuthTabCallbackStubProxy, reader);
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 60:
                                LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda13 = (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) onExtraCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                reader.onExtraCallbackWithResult((Reader) lazyStaggeredGridMeasureKtExternalSyntheticLambda13, (PagerDefaultsExternalSyntheticLambda0<Reader>) onNavigationEvent(iIAuthTabCallbackDefault), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23);
                                onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault, lazyStaggeredGridMeasureKtExternalSyntheticLambda13);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 61:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), reader.onNavigationEvent());
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 62:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Integer.valueOf(reader.extraCallback()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 63:
                                int iIAuthTabCallbackStub2 = reader.IAuthTabCallbackStub();
                                LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent onnavigationeventOnWarmupCompleted2 = onWarmupCompleted(iIAuthTabCallbackDefault);
                                if (onnavigationeventOnWarmupCompleted2 == null || onnavigationeventOnWarmupCompleted2.onExtraCallbackWithResult(iIAuthTabCallbackStub2)) {
                                    PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Integer.valueOf(iIAuthTabCallbackStub2));
                                    onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                } else {
                                    objOnNavigationEvent = LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(t2, iOnWarmupCompleted, iIAuthTabCallbackStub2, objOnNavigationEvent, pagerKtExternalSyntheticLambda23);
                                }
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                                break;
                            case 64:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Integer.valueOf(reader.IAuthTabCallbackStubProxy()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 65:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Long.valueOf(reader.access000()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 66:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Integer.valueOf(reader.access100()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 67:
                                PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t2, asBinder(iIAuthTabCallbackStubProxy), Long.valueOf(reader.getInterfaceDescriptor()));
                                onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                            case 68:
                                try {
                                    LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda14 = (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) onExtraCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault);
                                    reader.IAuthTabCallback(lazyStaggeredGridMeasureKtExternalSyntheticLambda14, onNavigationEvent(iIAuthTabCallbackDefault), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23);
                                    onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, iOnWarmupCompleted, iIAuthTabCallbackDefault, lazyStaggeredGridMeasureKtExternalSyntheticLambda14);
                                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                    pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                    pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                    if (pagerKtExternalSyntheticLambda22.onExtraCallback(reader)) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                    objIAuthTabCallback = objOnNavigationEvent;
                                    while (i2 < this.extraCallback) {
                                    }
                                    if (objIAuthTabCallback != null) {
                                    }
                                    throw th;
                                }
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                t4 = t2;
                                break;
                            default:
                                obj = objOnNavigationEvent;
                                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                if (obj == null) {
                                    try {
                                        objOnNavigationEvent = pagerKtExternalSyntheticLambda22.onNavigationEvent(t2);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        objOnNavigationEvent = obj;
                                        if (pagerKtExternalSyntheticLambda22.onExtraCallback(reader)) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        objOnNavigationEvent = obj;
                                        objIAuthTabCallback = objOnNavigationEvent;
                                        while (i2 < this.extraCallback) {
                                        }
                                        if (objIAuthTabCallback != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    objOnNavigationEvent = obj;
                                }
                                try {
                                    try {
                                        if (!pagerKtExternalSyntheticLambda22.onNavigationEvent(objOnNavigationEvent, reader, 0)) {
                                            Object objIAuthTabCallback4 = objOnNavigationEvent;
                                            for (int i3 = this.onExtraCallbackWithResult; i3 < this.extraCallback; i3++) {
                                                objIAuthTabCallback4 = IAuthTabCallback(t, this.asBinder[i3], objIAuthTabCallback4, pagerKtExternalSyntheticLambda2, t);
                                            }
                                            if (objIAuthTabCallback4 != null) {
                                                pagerKtExternalSyntheticLambda22.onNavigationEvent(t2, objIAuthTabCallback4);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                        if (pagerKtExternalSyntheticLambda22.onExtraCallback(reader)) {
                                            if (objOnNavigationEvent == null) {
                                                objOnNavigationEvent = pagerKtExternalSyntheticLambda22.onNavigationEvent(t2);
                                            }
                                            if (!pagerKtExternalSyntheticLambda22.onNavigationEvent(objOnNavigationEvent, reader, 0)) {
                                                objIAuthTabCallback2 = objOnNavigationEvent;
                                                for (int i4 = this.onExtraCallbackWithResult; i4 < this.extraCallback; i4++) {
                                                    objIAuthTabCallback2 = IAuthTabCallback(t, this.asBinder[i4], objIAuthTabCallback2, pagerKtExternalSyntheticLambda2, t);
                                                }
                                                if (objIAuthTabCallback2 == null) {
                                                    return;
                                                }
                                                pagerKtExternalSyntheticLambda22.onNavigationEvent(t2, objIAuthTabCallback2);
                                            }
                                            lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                            pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                            t4 = t2;
                                        } else {
                                            if (!reader.readTypedObject()) {
                                                objIAuthTabCallback2 = objOnNavigationEvent;
                                                for (int i5 = this.onExtraCallbackWithResult; i5 < this.extraCallback; i5++) {
                                                    objIAuthTabCallback2 = IAuthTabCallback(t, this.asBinder[i5], objIAuthTabCallback2, pagerKtExternalSyntheticLambda2, t);
                                                }
                                                if (objIAuthTabCallback2 == null) {
                                                    return;
                                                }
                                                pagerKtExternalSyntheticLambda22.onNavigationEvent(t2, objIAuthTabCallback2);
                                            }
                                            lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                            pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                            t4 = t2;
                                        }
                                    }
                                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda22;
                                    pagerKtExternalSyntheticLambda23 = pagerKtExternalSyntheticLambda22;
                                    t4 = t2;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } else {
                    if (iOnWarmupCompleted == Integer.MAX_VALUE) {
                        Object objIAuthTabCallback5 = objOnNavigationEvent;
                        for (int i6 = this.onExtraCallbackWithResult; i6 < this.extraCallback; i6++) {
                            objIAuthTabCallback5 = IAuthTabCallback(t, this.asBinder[i6], objIAuthTabCallback5, pagerKtExternalSyntheticLambda2, t);
                        }
                        if (objIAuthTabCallback5 != null) {
                            pagerKtExternalSyntheticLambda23.onNavigationEvent(t4, objIAuthTabCallback5);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objOnWarmupCompleted = !this.onTransact ? null : lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onWarmupCompleted(lazyLayoutSemanticsModifierNodeExternalSyntheticLambda23, this.onWarmupCompleted, iOnWarmupCompleted);
                        if (objOnWarmupCompleted != null) {
                            if (objOnExtraCallback == null) {
                                try {
                                    objOnExtraCallback = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onExtraCallback(t);
                                } catch (Throwable th8) {
                                    th = th8;
                                    t2 = t4;
                                    pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                    objIAuthTabCallback = objOnNavigationEvent;
                                    while (i2 < this.extraCallback) {
                                    }
                                    if (objIAuthTabCallback != null) {
                                    }
                                    throw th;
                                }
                            }
                            LazySaveableStateHolderExternalSyntheticLambda2<T> lazySaveableStateHolderExternalSyntheticLambda2 = objOnExtraCallback;
                            t3 = t4;
                            try {
                                objOnNavigationEvent = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onExtraCallback(t, reader, objOnWarmupCompleted, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, lazySaveableStateHolderExternalSyntheticLambda2, objOnNavigationEvent, pagerKtExternalSyntheticLambda2);
                                objOnExtraCallback = lazySaveableStateHolderExternalSyntheticLambda2;
                                t4 = t3;
                            } catch (Throwable th9) {
                                th = th9;
                                t2 = t3;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                objIAuthTabCallback = objOnNavigationEvent;
                                while (i2 < this.extraCallback) {
                                }
                                if (objIAuthTabCallback != null) {
                                }
                                throw th;
                            }
                        } else {
                            t3 = t4;
                            try {
                                if (!pagerKtExternalSyntheticLambda23.onExtraCallback(reader)) {
                                    if (objOnNavigationEvent == null) {
                                        objOnNavigationEvent = pagerKtExternalSyntheticLambda23.onNavigationEvent(t3);
                                    }
                                    if (!pagerKtExternalSyntheticLambda23.onNavigationEvent(objOnNavigationEvent, reader, 0)) {
                                    }
                                    t4 = t3;
                                } else if (reader.readTypedObject()) {
                                    t4 = t3;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                t2 = t3;
                                pagerKtExternalSyntheticLambda22 = pagerKtExternalSyntheticLambda23;
                                objIAuthTabCallback = objOnNavigationEvent;
                                while (i2 < this.extraCallback) {
                                }
                                if (objIAuthTabCallback != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                obj = objOnNavigationEvent;
                t2 = t4;
            }
            objIAuthTabCallback = objOnNavigationEvent;
            for (i2 = this.onExtraCallbackWithResult; i2 < this.extraCallback; i2++) {
                objIAuthTabCallback = IAuthTabCallback(t, this.asBinder[i2], objIAuthTabCallback, pagerKtExternalSyntheticLambda2, t);
            }
            if (objIAuthTabCallback != null) {
                pagerKtExternalSyntheticLambda22.onNavigationEvent(t2, objIAuthTabCallback);
            }
            throw th;
        }
        pagerKtExternalSyntheticLambda22.onNavigationEvent(t2, objIAuthTabCallback2);
    }

    private PagerDefaultsExternalSyntheticLambda0 onNavigationEvent(int i2) {
        int i3 = (i2 / 3) << 1;
        PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0 = (PagerDefaultsExternalSyntheticLambda0) this.getInterfaceDescriptor[i3];
        if (pagerDefaultsExternalSyntheticLambda0 != null) {
            return pagerDefaultsExternalSyntheticLambda0;
        }
        PagerDefaultsExternalSyntheticLambda0<T> pagerDefaultsExternalSyntheticLambda0IAuthTabCallback = DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().IAuthTabCallback((Class) this.getInterfaceDescriptor[i3 + 1]);
        this.getInterfaceDescriptor[i3] = pagerDefaultsExternalSyntheticLambda0IAuthTabCallback;
        return pagerDefaultsExternalSyntheticLambda0IAuthTabCallback;
    }

    private Object onExtraCallback(int i2) {
        return this.getInterfaceDescriptor[(i2 / 3) << 1];
    }

    private LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent onWarmupCompleted(int i2) {
        return (LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent) this.getInterfaceDescriptor[((i2 / 3) << 1) + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object IAuthTabCallback(T t, int i2) {
        PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(i2);
        long jAsBinder = asBinder(IAuthTabCallbackStubProxy(i2));
        if (!onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2)) {
            return pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
        }
        Object object = onNavigationEvent.getObject(t, jAsBinder);
        if (IAuthTabCallbackStub(object)) {
            return object;
        }
        Object objOnExtraCallback = pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
        if (object != null) {
            pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(objOnExtraCallback, object);
        }
        return objOnExtraCallback;
    }

    private void onWarmupCompleted(T t, int i2, Object obj) {
        onNavigationEvent.putObject(t, asBinder(IAuthTabCallbackStubProxy(i2)), obj);
        onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object onExtraCallback(T t, int i2, int i3) {
        PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(i3);
        if (!IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2, i3)) {
            return pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
        }
        Object object = onNavigationEvent.getObject(t, asBinder(IAuthTabCallbackStubProxy(i3)));
        if (IAuthTabCallbackStub(object)) {
            return object;
        }
        Object objOnExtraCallback = pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
        if (object != null) {
            pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(objOnExtraCallback, object);
        }
        return objOnExtraCallback;
    }

    private void onExtraCallbackWithResult(T t, int i2, int i3, Object obj) {
        onNavigationEvent.putObject(t, asBinder(IAuthTabCallbackStubProxy(i3)), obj);
        onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // o.PagerDefaultsExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(T t) {
        if (IAuthTabCallbackStub(t)) {
            if (t instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) {
                PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0 prefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0 = (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) t;
                prefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.getInterfaceDescriptor();
                prefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.access100();
                prefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onPostMessage();
            }
            int length = this.onExtraCallback.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i2);
                long jAsBinder = asBinder(iIAuthTabCallbackStubProxy);
                int iAsInterface = asInterface(iIAuthTabCallbackStubProxy);
                if (iAsInterface != 9) {
                    if (iAsInterface == 60 || iAsInterface == 68) {
                        if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, IAuthTabCallbackStub(i2), i2)) {
                            onNavigationEvent(i2).onExtraCallbackWithResult(onNavigationEvent.getObject(t, jAsBinder));
                        }
                    } else {
                        switch (iAsInterface) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.IAuthTabCallbackDefault.IAuthTabCallback(t, jAsBinder);
                                break;
                            case 50:
                                Unsafe unsafe = onNavigationEvent;
                                Object object = unsafe.getObject(t, jAsBinder);
                                if (object != null) {
                                    unsafe.putObject(t, jAsBinder, this.IAuthTabCallbackStubProxy.onTransact(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                } else if (onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2)) {
                    onNavigationEvent(i2).onExtraCallbackWithResult(onNavigationEvent.getObject(t, jAsBinder));
                }
            }
            this.readTypedObject.onExtraCallbackWithResult(t);
            if (this.onTransact) {
                this.IAuthTabCallbackStub.onNavigationEvent(t);
            }
        }
    }

    private final <K, V> void onWarmupCompleted(Object obj, int i2, Object obj2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, Reader reader) throws IOException {
        long jAsBinder = asBinder(IAuthTabCallbackStubProxy(i2));
        Object objAsBinder = PagerKtExternalSyntheticLambda5.asBinder(obj, jAsBinder);
        if (objAsBinder == null) {
            objAsBinder = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(obj2);
            PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(obj, jAsBinder, objAsBinder);
        } else if (this.IAuthTabCallbackStubProxy.onNavigationEvent(objAsBinder)) {
            Object objOnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(obj2);
            this.IAuthTabCallbackStubProxy.IAuthTabCallback(objOnExtraCallbackWithResult, objAsBinder);
            PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(obj, jAsBinder, objOnExtraCallbackWithResult);
            objAsBinder = objOnExtraCallbackWithResult;
        }
        reader.onExtraCallback(this.IAuthTabCallbackStubProxy.onWarmupCompleted(objAsBinder), this.IAuthTabCallbackStubProxy.onExtraCallback(obj2), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
    }

    private <UT, UB> UB IAuthTabCallback(Object obj, int i2, UB ub, PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, Object obj2) {
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(i2);
        Object objAsBinder = PagerKtExternalSyntheticLambda5.asBinder(obj, asBinder(IAuthTabCallbackStubProxy(i2)));
        return (objAsBinder == null || (onnavigationeventOnWarmupCompleted = onWarmupCompleted(i2)) == null) ? ub : (UB) onNavigationEvent(i2, iIAuthTabCallbackStub, this.IAuthTabCallbackStubProxy.onWarmupCompleted(objAsBinder), onnavigationeventOnWarmupCompleted, ub, pagerKtExternalSyntheticLambda2, obj2);
    }

    private <K, V, UT, UB> UB onNavigationEvent(int i2, int i3, Map<K, V> map, LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent onnavigationevent, UB ub, PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, Object obj) {
        LazyStaggeredGridItemProviderImplExternalSyntheticLambda1.IAuthTabCallback<?, ?> iAuthTabCallbackOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(onExtraCallback(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!onnavigationevent.onExtraCallbackWithResult(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = pagerKtExternalSyntheticLambda2.onNavigationEvent(obj);
                }
                LazyLayoutKtExternalSyntheticLambda3.asBinder asbinderOnNavigationEvent = LazyLayoutKtExternalSyntheticLambda3.onNavigationEvent(LazyStaggeredGridItemProviderImplExternalSyntheticLambda1.onWarmupCompleted(iAuthTabCallbackOnExtraCallback, next.getKey(), next.getValue()));
                try {
                    LazyStaggeredGridItemProviderImplExternalSyntheticLambda1.onWarmupCompleted(asbinderOnNavigationEvent.onWarmupCompleted(), iAuthTabCallbackOnExtraCallback, next.getKey(), next.getValue());
                    pagerKtExternalSyntheticLambda2.onExtraCallbackWithResult(ub, i3, asbinderOnNavigationEvent.IAuthTabCallback());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    @Override // o.PagerDefaultsExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.onExtraCallbackWithResult) {
            int i7 = this.asBinder[i6];
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(i7);
            int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i7);
            int i8 = this.onExtraCallback[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i4) {
                if (i9 != 1048575) {
                    i5 = onNavigationEvent.getInt(t, i9);
                }
                i3 = i5;
                i2 = i9;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if (onExtraCallbackWithResult(iIAuthTabCallbackStubProxy) && !onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i10)) {
                return false;
            }
            int iAsInterface = asInterface(iIAuthTabCallbackStubProxy);
            if (iAsInterface == 9 || iAsInterface == 17) {
                if (onWarmupCompleted((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i7, i2, i3, i10) && !onExtraCallback(t, iIAuthTabCallbackStubProxy, onNavigationEvent(i7))) {
                    return false;
                }
            } else if (iAsInterface == 27) {
                if (!onWarmupCompleted(t, iIAuthTabCallbackStubProxy, i7)) {
                    return false;
                }
            } else if (iAsInterface == 60 || iAsInterface == 68) {
                if (IAuthTabCallback((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStub, i7) && !onExtraCallback(t, iIAuthTabCallbackStubProxy, onNavigationEvent(i7))) {
                    return false;
                }
            } else if (iAsInterface != 49) {
                if (iAsInterface == 50 && !onExtraCallbackWithResult((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, iIAuthTabCallbackStubProxy, i7)) {
                    return false;
                }
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        return !this.onTransact || this.IAuthTabCallbackStub.IAuthTabCallback(t).IAuthTabCallbackStub();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean onExtraCallback(Object obj, int i2, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) {
        return pagerDefaultsExternalSyntheticLambda0.onWarmupCompleted(PagerKtExternalSyntheticLambda5.asBinder(obj, asBinder(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean onWarmupCompleted(Object obj, int i2, int i3) {
        List list = (List) PagerKtExternalSyntheticLambda5.asBinder(obj, asBinder(i2));
        if (list.isEmpty()) {
            return true;
        }
        PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!pagerDefaultsExternalSyntheticLambda0OnNavigationEvent.onWarmupCompleted(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [o.PagerDefaultsExternalSyntheticLambda0] */
    private boolean onExtraCallbackWithResult(T t, int i2, int i3) {
        Map<?, ?> mapIAuthTabCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(PagerKtExternalSyntheticLambda5.asBinder(t, asBinder(i2)));
        if (mapIAuthTabCallback.isEmpty()) {
            return true;
        }
        if (this.IAuthTabCallbackStubProxy.onExtraCallback(onExtraCallback(i3)).onWarmupCompleted.getJavaType() != PagerKtExternalSyntheticLambda6.onExtraCallback.MESSAGE) {
            return true;
        }
        ?? IAuthTabCallback2 = 0;
        for (Object obj : mapIAuthTabCallback.values()) {
            IAuthTabCallback2 = IAuthTabCallback2;
            if (IAuthTabCallback2 == 0) {
                IAuthTabCallback2 = DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().IAuthTabCallback(obj.getClass());
            }
            if (!IAuthTabCallback2.onWarmupCompleted(obj)) {
                return false;
            }
        }
        return true;
    }

    private void onExtraCallback(int i2, Object obj, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        if (obj instanceof String) {
            pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(i2, (String) obj);
        } else {
            pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(i2, (LazyLayoutKtExternalSyntheticLambda3) obj);
        }
    }

    private void onWarmupCompleted(Object obj, int i2, Reader reader) throws IOException {
        if (IAuthTabCallback(i2)) {
            PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(obj, asBinder(i2), reader.ICustomTabsCallback());
        } else if (this.asInterface) {
            PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(obj, asBinder(i2), reader.extraCallbackWithResult());
        } else {
            PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(obj, asBinder(i2), reader.onNavigationEvent());
        }
    }

    private void onExtraCallbackWithResult(Object obj, int i2, Reader reader) throws IOException {
        if (IAuthTabCallback(i2)) {
            reader.access100(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(obj, asBinder(i2)));
        } else {
            reader.getInterfaceDescriptor(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(obj, asBinder(i2)));
        }
    }

    private <E> void onExtraCallbackWithResult(Object obj, int i2, Reader reader, PagerDefaultsExternalSyntheticLambda0<E> pagerDefaultsExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException {
        reader.onNavigationEvent(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(obj, asBinder(i2)), pagerDefaultsExternalSyntheticLambda0, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
    }

    private <E> void onWarmupCompleted(Object obj, long j, Reader reader, PagerDefaultsExternalSyntheticLambda0<E> pagerDefaultsExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException {
        reader.onExtraCallbackWithResult((List) this.IAuthTabCallbackDefault.onExtraCallbackWithResult(obj, j), (PagerDefaultsExternalSyntheticLambda0) pagerDefaultsExternalSyntheticLambda0, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
    }

    private int IAuthTabCallbackStub(int i2) {
        return this.onExtraCallback[i2];
    }

    private int IAuthTabCallbackStubProxy(int i2) {
        return this.onExtraCallback[i2 + 1];
    }

    private int onTransact(int i2) {
        return this.onExtraCallback[i2 + 2];
    }

    private static boolean IAuthTabCallbackStub(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) {
            return ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) obj).onMessageChannelReady();
        }
        return true;
    }

    private static void onNavigationEvent(Object obj) {
        if (IAuthTabCallbackStub(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private static <T> double IAuthTabCallback(T t, long j) {
        return PagerKtExternalSyntheticLambda5.onExtraCallback(t, j);
    }

    private static <T> float onWarmupCompleted(T t, long j) {
        return PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, j);
    }

    private static <T> int onExtraCallbackWithResult(T t, long j) {
        return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, j);
    }

    private static <T> long onExtraCallback(T t, long j) {
        return PagerKtExternalSyntheticLambda5.asInterface(t, j);
    }

    private static <T> boolean onNavigationEvent(T t, long j) {
        return PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, j);
    }

    private static <T> double IAuthTabCallbackDefault(T t, long j) {
        return ((Double) PagerKtExternalSyntheticLambda5.asBinder(t, j)).doubleValue();
    }

    private static <T> float asInterface(T t, long j) {
        return ((Float) PagerKtExternalSyntheticLambda5.asBinder(t, j)).floatValue();
    }

    private static <T> int asBinder(T t, long j) {
        return ((Integer) PagerKtExternalSyntheticLambda5.asBinder(t, j)).intValue();
    }

    private static <T> long IAuthTabCallbackStub(T t, long j) {
        return ((Long) PagerKtExternalSyntheticLambda5.asBinder(t, j)).longValue();
    }

    private static <T> boolean onTransact(T t, long j) {
        return ((Boolean) PagerKtExternalSyntheticLambda5.asBinder(t, j)).booleanValue();
    }

    private boolean onExtraCallback(T t, T t2, int i2) {
        return onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2) == onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t2, i2);
    }

    private boolean onWarmupCompleted(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return onNavigationEvent((LazyStaggeredGridStateExternalSyntheticLambda0<T>) t, i2);
        }
        return (i4 & i5) != 0;
    }

    private boolean onNavigationEvent(T t, int i2) {
        boolean zEquals;
        int iOnTransact = onTransact(i2);
        long j = 1048575 & iOnTransact;
        if (j != 1048575) {
            return (PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, j) & (1 << (iOnTransact >>> 20))) != 0;
        }
        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i2);
        long jAsBinder = asBinder(iIAuthTabCallbackStubProxy);
        switch (asInterface(iIAuthTabCallbackStubProxy)) {
            case 0:
                return Double.doubleToRawLongBits(PagerKtExternalSyntheticLambda5.onExtraCallback(t, jAsBinder)) != 0;
            case 1:
                return Float.floatToRawIntBits(PagerKtExternalSyntheticLambda5.IAuthTabCallback(t, jAsBinder)) != 0;
            case 2:
                return PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != 0;
            case 3:
                return PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != 0;
            case 4:
                return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != 0;
            case 5:
                return PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != 0;
            case 6:
                return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != 0;
            case 7:
                return PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, jAsBinder);
            case 8:
                Object objAsBinder = PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder);
                if (objAsBinder instanceof String) {
                    zEquals = ((String) objAsBinder).isEmpty();
                    break;
                } else if (objAsBinder instanceof LazyLayoutKtExternalSyntheticLambda3) {
                    zEquals = LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult.equals(objAsBinder);
                    break;
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder) != null;
            case 10:
                zEquals = LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult.equals(PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder));
                break;
            case 11:
                return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != 0;
            case 12:
                return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != 0;
            case 13:
                return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != 0;
            case 14:
                return PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != 0;
            case 15:
                return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jAsBinder) != 0;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                return PagerKtExternalSyntheticLambda5.asInterface(t, jAsBinder) != 0;
            case 17:
                return PagerKtExternalSyntheticLambda5.asBinder(t, jAsBinder) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private void onExtraCallbackWithResult(T t, int i2) {
        int iOnTransact = onTransact(i2);
        long j = 1048575 & iOnTransact;
        if (j == 1048575) {
            return;
        }
        PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t, j, (1 << (iOnTransact >>> 20)) | PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, j));
    }

    private boolean IAuthTabCallback(T t, int i2, int i3) {
        return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, (long) (onTransact(i3) & 1048575)) == i2;
    }

    private boolean onExtraCallbackWithResult(T t, T t2, int i2) {
        long jOnTransact = onTransact(i2) & 1048575;
        return PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t, jOnTransact) == PagerKtExternalSyntheticLambda5.IAuthTabCallbackDefault(t2, jOnTransact);
    }

    private void onNavigationEvent(T t, int i2, int i3) {
        PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult((Object) t, onTransact(i3) & 1048575, i2);
    }

    private int IAuthTabCallbackDefault(int i2) {
        if (i2 < this.access100 || i2 > this.access000) {
            return -1;
        }
        return onWarmupCompleted(i2, 0);
    }

    private int onWarmupCompleted(int i2, int i3) {
        int length = (this.onExtraCallback.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(i5);
            if (i2 == iIAuthTabCallbackStub) {
                return i5;
            }
            if (i2 < iIAuthTabCallbackStub) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }
}
