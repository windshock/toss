package o;

import java.util.ArrayList;
import java.util.zip.Inflater;
import o.DrawerKtExternalSyntheticLambda2;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DrawerKtExternalSyntheticLambda18 {
    private static int onWarmupCompleted(int i2) {
        return (i2 >> 1) ^ (-(i2 & 1));
    }

    public static DrawerKtExternalSyntheticLambda2 onNavigationEvent(byte[] bArr, int i2) {
        ArrayList<DrawerKtExternalSyntheticLambda2.onExtraCallback> arrayListOnNavigationEvent;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr);
        try {
            arrayListOnNavigationEvent = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20) ? onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20) : IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListOnNavigationEvent = null;
        }
        if (arrayListOnNavigationEvent == null) {
            return null;
        }
        int size = arrayListOnNavigationEvent.size();
        if (size == 1) {
            return new DrawerKtExternalSyntheticLambda2(arrayListOnNavigationEvent.get(0), i2);
        }
        if (size != 2) {
            return null;
        }
        return new DrawerKtExternalSyntheticLambda2(arrayListOnNavigationEvent.get(0), arrayListOnNavigationEvent.get(1), i2);
    }

    private static boolean onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
        return iAsBinder == 1886547818;
    }

    private static ArrayList<DrawerKtExternalSyntheticLambda2.onExtraCallback> onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        while (iOnWarmupCompleted < iOnExtraCallbackWithResult) {
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() + iOnWarmupCompleted;
            if (iAsBinder <= iOnWarmupCompleted || iAsBinder > iOnExtraCallbackWithResult) {
                return null;
            }
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder2 == 2037673328 || iAsBinder2 == 1836279920) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(iAsBinder);
                return IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iAsBinder);
            iOnWarmupCompleted = iAsBinder;
        }
        return null;
    }

    private static ArrayList<DrawerKtExternalSyntheticLambda2.onExtraCallback> IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() != 0) {
            return null;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(7);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (iAsBinder == 1684433976) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
            Inflater inflater = new Inflater(true);
            try {
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                if (!((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1002761033, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{textFieldDecoratorModifierNodeExternalSyntheticLambda20, textFieldDecoratorModifierNodeExternalSyntheticLambda202, inflater}, -1002761009)).booleanValue()) {
                    return null;
                }
                inflater.end();
                textFieldDecoratorModifierNodeExternalSyntheticLambda20 = textFieldDecoratorModifierNodeExternalSyntheticLambda202;
            } finally {
                inflater.end();
            }
        } else if (iAsBinder != 1918990112) {
            return null;
        }
        return onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
    }

    private static ArrayList<DrawerKtExternalSyntheticLambda2.onExtraCallback> onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        ArrayList<DrawerKtExternalSyntheticLambda2.onExtraCallback> arrayList = new ArrayList<>();
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        while (iOnWarmupCompleted < iOnExtraCallbackWithResult) {
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() + iOnWarmupCompleted;
            if (iAsBinder <= iOnWarmupCompleted || iAsBinder > iOnExtraCallbackWithResult) {
                return null;
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1835365224) {
                DrawerKtExternalSyntheticLambda2.onExtraCallback onExtraCallback = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                if (onExtraCallback == null) {
                    return null;
                }
                arrayList.add(onExtraCallback);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iAsBinder);
            iOnWarmupCompleted = iAsBinder;
        }
        return arrayList;
    }

    private static DrawerKtExternalSyntheticLambda2.onExtraCallback onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        DrawerKtExternalSyntheticLambda2.onExtraCallback onextracallback = null;
        if (iAsBinder > 10000) {
            return null;
        }
        float[] fArr = new float[iAsBinder];
        for (int i2 = 0; i2 < iAsBinder; i2++) {
            fArr[i2] = textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackStub();
        }
        int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (iAsBinder2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(iAsBinder * 2.0d) / dLog);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback());
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() << 3);
        float[] fArr2 = new float[iAsBinder2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < iAsBinder2) {
            int i6 = 0;
            while (i6 < i3) {
                int iOnWarmupCompleted = iArr[i6] + onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(iCeil));
                if (iOnWarmupCompleted >= iAsBinder || iOnWarmupCompleted < 0) {
                    return null;
                }
                fArr2[i5] = fArr[iOnWarmupCompleted];
                iArr[i6] = iOnWarmupCompleted;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted((textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult() + 7) & (-8));
        int i7 = 32;
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(32);
        DrawerKtExternalSyntheticLambda2.IAuthTabCallback[] iAuthTabCallbackArr = new DrawerKtExternalSyntheticLambda2.IAuthTabCallback[iOnNavigationEvent];
        int i8 = 0;
        while (i8 < iOnNavigationEvent) {
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i7);
            if (iOnNavigationEvent4 > 128000) {
                return onextracallback;
            }
            int i9 = iOnNavigationEvent;
            int iCeil2 = (int) Math.ceil(Math.log(iAsBinder2 * d) / dLog);
            float[] fArr3 = new float[iOnNavigationEvent4 * 3];
            float[] fArr4 = new float[iOnNavigationEvent4 << 1];
            int i10 = 0;
            int i11 = 0;
            while (i10 < iOnNavigationEvent4) {
                int iOnWarmupCompleted2 = i11 + onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(iCeil2));
                if (iOnWarmupCompleted2 < 0 || iOnWarmupCompleted2 >= iAsBinder2) {
                    return null;
                }
                int i12 = i10 * 3;
                int i13 = iOnWarmupCompleted2 * 5;
                fArr3[i12] = fArr2[i13];
                fArr3[i12 + 1] = fArr2[i13 + 1];
                fArr3[i12 + 2] = fArr2[i13 + 2];
                int i14 = i10 << 1;
                fArr4[i14] = fArr2[i13 + 3];
                fArr4[i14 + 1] = fArr2[i13 + 4];
                i10++;
                i11 = iOnWarmupCompleted2;
                onextracallback = null;
            }
            iAuthTabCallbackArr[i8] = new DrawerKtExternalSyntheticLambda2.IAuthTabCallback(iOnNavigationEvent2, fArr3, fArr4, iOnNavigationEvent3);
            i8++;
            onextracallback = onextracallback;
            iOnNavigationEvent = i9;
            i7 = 32;
            d = 2.0d;
        }
        return new DrawerKtExternalSyntheticLambda2.onExtraCallback(iAuthTabCallbackArr);
    }
}
