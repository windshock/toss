package o;

import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda10 {
    private static final int[] IAuthTabCallback = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static ExposedDropdownMenu_androidKtExternalSyntheticLambda1 onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return onWarmupCompleted(drawerKtExternalSyntheticLambda9, true, false);
    }

    public static ExposedDropdownMenu_androidKtExternalSyntheticLambda1 IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, boolean z) throws IOException {
        return onWarmupCompleted(drawerKtExternalSyntheticLambda9, false, z);
    }

    private static ExposedDropdownMenu_androidKtExternalSyntheticLambda1 onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, boolean z, boolean z2) throws IOException {
        int i2;
        int i3;
        int i4;
        boolean z3;
        int[] iArr;
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        long j = -1;
        long j2 = 4096;
        if (jOnExtraCallback != -1 && jOnExtraCallback <= 4096) {
            j2 = jOnExtraCallback;
        }
        int i5 = (int) j2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(64);
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (i7 < i5) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(8);
            if (!drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), i6, 8, true)) {
                break;
            }
            long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (jOnActivityResized == 1) {
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 8, 8);
                i3 = 16;
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(16);
                jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject();
            } else {
                if (jOnActivityResized == 0) {
                    long jOnExtraCallback2 = drawerKtExternalSyntheticLambda9.onExtraCallback();
                    if (jOnExtraCallback2 != j) {
                        jOnActivityResized = (jOnExtraCallback2 - drawerKtExternalSyntheticLambda9.onWarmupCompleted()) + 8;
                    }
                }
                i3 = 8;
            }
            long j3 = jOnActivityResized;
            long j4 = i3;
            if (j3 < j4) {
                return new OutlinedTextFieldKtExternalSyntheticLambda6(iAsBinder, j3, i3);
            }
            i7 += i3;
            if (iAsBinder == 1836019574) {
                i5 += (int) j3;
                if (jOnExtraCallback != -1 && i5 > jOnExtraCallback) {
                    i5 = (int) jOnExtraCallback;
                }
            } else {
                if (iAsBinder == 1836019558 || iAsBinder == 1836475768) {
                    i2 = 1;
                    break;
                }
                long j5 = jOnExtraCallback;
                if (iAsBinder == 1835295092) {
                    z4 = true;
                }
                if ((i7 + j3) - j4 >= i5) {
                    i2 = 0;
                    break;
                }
                int i8 = (int) (j3 - j4);
                i7 += i8;
                if (iAsBinder != 1718909296) {
                    i4 = 0;
                    if (i8 != 0) {
                        drawerKtExternalSyntheticLambda9.IAuthTabCallback(i8);
                    }
                } else {
                    if (i8 < 8) {
                        return new OutlinedTextFieldKtExternalSyntheticLambda6(iAsBinder, i8, 8);
                    }
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(i8);
                    i4 = 0;
                    drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, i8);
                    int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                    if (onWarmupCompleted(iAsBinder2, z2)) {
                        z4 = true;
                    }
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
                    int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() / 4;
                    if (!z4 && iOnNavigationEvent > 0) {
                        iArr = new int[iOnNavigationEvent];
                        int i9 = 0;
                        while (true) {
                            if (i9 >= iOnNavigationEvent) {
                                z3 = z4;
                                break;
                            }
                            int iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                            iArr[i9] = iAsBinder3;
                            if (onWarmupCompleted(iAsBinder3, z2)) {
                                z3 = true;
                                break;
                            }
                            i9++;
                        }
                    } else {
                        z3 = z4;
                        iArr = null;
                    }
                    if (!z3) {
                        return new ProgressIndicatorKtExternalSyntheticLambda13(iAsBinder2, iArr);
                    }
                    z4 = z3;
                }
                i6 = i4;
                jOnExtraCallback = j5;
            }
            j = -1;
        }
        i2 = i6;
        if (!z4) {
            return ProgressIndicatorKtExternalSyntheticLambda1.IAuthTabCallback;
        }
        if (z == i2) {
            return null;
        }
        if (i2 != 0) {
            return OutlinedTextFieldMeasurePolicyExternalSyntheticLambda2.onExtraCallback;
        }
        return OutlinedTextFieldMeasurePolicyExternalSyntheticLambda2.IAuthTabCallback;
    }

    private static boolean onWarmupCompleted(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        for (int i3 : IAuthTabCallback) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }
}
