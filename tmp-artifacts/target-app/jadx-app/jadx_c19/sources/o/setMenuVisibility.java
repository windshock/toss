package o;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import o.getReturnTransition;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setMenuVisibility {
    protected int[] IAuthTabCallback;
    protected final setTargetFragment IAuthTabCallbackDefault;
    protected int IAuthTabCallbackStub;
    protected int IAuthTabCallbackStubProxy;
    protected int IAuthTabCallback_Parcel;
    protected final int access000;
    protected int access100;
    protected String[] asBinder;
    protected int asInterface;
    protected final AtomicReference<onWarmupCompleted> getInterfaceDescriptor;
    protected boolean onExtraCallback;
    protected int onExtraCallbackWithResult;
    protected final boolean onNavigationEvent;
    protected final setMenuVisibility onTransact;
    protected int onWarmupCompleted;

    static int IAuthTabCallback(int i2) {
        int i3 = i2 >> 2;
        if (i3 < 64) {
            return 4;
        }
        if (i3 <= 256) {
            return 5;
        }
        return i3 <= 1024 ? 6 : 7;
    }

    static int onWarmupCompleted(int i2) {
        return (int) ((i2 * 3435973837L) >>> 32);
    }

    private setMenuVisibility(int i2, int i3) {
        this.onTransact = null;
        this.onExtraCallbackWithResult = 0;
        this.onExtraCallback = true;
        this.access000 = i3;
        this.IAuthTabCallbackDefault = null;
        this.onNavigationEvent = true;
        int i4 = 16;
        if (i2 < 16) {
            i2 = i4;
        } else if (((i2 - 1) & i2) != 0) {
            while (i4 < i2) {
                i4 += i4;
            }
            i2 = i4;
        }
        this.getInterfaceDescriptor = new AtomicReference<>(onWarmupCompleted.onNavigationEvent(i2));
    }

    private setMenuVisibility(setMenuVisibility setmenuvisibility, int i2, onWarmupCompleted onwarmupcompleted, boolean z, boolean z2) {
        this.onTransact = setmenuvisibility;
        this.access000 = i2;
        this.IAuthTabCallbackDefault = z ? setTargetFragment.onExtraCallbackWithResult : null;
        this.onNavigationEvent = z2;
        this.getInterfaceDescriptor = null;
        this.onExtraCallbackWithResult = onwarmupcompleted.onExtraCallback;
        int i3 = onwarmupcompleted.onNavigationEvent;
        this.onWarmupCompleted = i3;
        int i4 = i3 << 2;
        this.asInterface = i4;
        this.IAuthTabCallback_Parcel = i4 + (i4 >> 1);
        this.IAuthTabCallbackStubProxy = onwarmupcompleted.onTransact;
        this.IAuthTabCallback = onwarmupcompleted.onWarmupCompleted;
        this.asBinder = onwarmupcompleted.onExtraCallbackWithResult;
        this.access100 = onwarmupcompleted.asBinder;
        this.IAuthTabCallbackStub = onwarmupcompleted.IAuthTabCallback;
        this.onExtraCallback = true;
    }

    public static setMenuVisibility onExtraCallbackWithResult() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return onExtraCallback((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static setMenuVisibility onExtraCallback(int i2) {
        return new setMenuVisibility(64, i2);
    }

    public setMenuVisibility asBinder(int i2) {
        return new setMenuVisibility(this, this.access000, this.getInterfaceDescriptor.get(), getReturnTransition.onWarmupCompleted.INTERN_FIELD_NAMES.enabledIn(i2), getReturnTransition.onWarmupCompleted.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i2));
    }

    public void onNavigationEvent() {
        if (this.onTransact == null || !IAuthTabCallback()) {
            return;
        }
        this.onTransact.onExtraCallbackWithResult(new onWarmupCompleted(this));
        this.onExtraCallback = true;
    }

    private void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        int i2 = onwarmupcompleted.onExtraCallback;
        onWarmupCompleted onwarmupcompleted2 = this.getInterfaceDescriptor.get();
        if (i2 == onwarmupcompleted2.onExtraCallback) {
            return;
        }
        if (i2 > 6000) {
            onwarmupcompleted = onWarmupCompleted.onNavigationEvent(64);
        }
        setSupportImageTintList.onNavigationEvent(this.getInterfaceDescriptor, onwarmupcompleted2, onwarmupcompleted);
    }

    public boolean IAuthTabCallback() {
        return !this.onExtraCallback;
    }

    public int onExtraCallback() {
        int i2 = this.asInterface;
        int i3 = 0;
        for (int i4 = 3; i4 < i2; i4 += 4) {
            if (this.IAuthTabCallback[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int asInterface() {
        int i2 = this.IAuthTabCallback_Parcel;
        int i3 = 0;
        for (int i4 = this.asInterface + 3; i4 < i2; i4 += 4) {
            if (this.IAuthTabCallback[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int IAuthTabCallbackStub() {
        int i2 = this.IAuthTabCallback_Parcel + 3;
        int i3 = this.onWarmupCompleted;
        int i4 = 0;
        for (int i5 = i2; i5 < i3 + i2; i5 += 4) {
            if (this.IAuthTabCallback[i5] != 0) {
                i4++;
            }
        }
        return i4;
    }

    public int asBinder() {
        return (this.access100 - IAuthTabCallback_Parcel()) >> 2;
    }

    public int onTransact() {
        int i2 = this.onWarmupCompleted;
        int i3 = 0;
        for (int i4 = 3; i4 < (i2 << 3); i4 += 4) {
            if (this.IAuthTabCallback[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public String toString() {
        int iOnExtraCallback = onExtraCallback();
        int iAsInterface = asInterface();
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        int iAsBinder = asBinder();
        int iOnTransact = onTransact();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", setMenuVisibility.class.getName(), Integer.valueOf(this.onExtraCallbackWithResult), Integer.valueOf(this.onWarmupCompleted), Integer.valueOf(iOnExtraCallback), Integer.valueOf(iAsInterface), Integer.valueOf(iIAuthTabCallbackStub), Integer.valueOf(iAsBinder), Integer.valueOf(iOnExtraCallback + iAsInterface + iIAuthTabCallbackStub + iAsBinder), Integer.valueOf(iOnTransact));
    }

    public String onNavigationEvent(int i2) {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(onExtraCallbackWithResult(i2));
        int[] iArr = this.IAuthTabCallback;
        int i3 = iArr[iIAuthTabCallbackStub + 3];
        if (i3 == 1) {
            if (iArr[iIAuthTabCallbackStub] == i2) {
                return this.asBinder[iIAuthTabCallbackStub >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.asInterface + ((iIAuthTabCallbackStub >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 1) {
            if (iArr[i4] == i2) {
                return this.asBinder[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return onNavigationEvent(iIAuthTabCallbackStub, i2);
    }

    public String onExtraCallback(int i2, int i3) {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(IAuthTabCallback(i2, i3));
        int[] iArr = this.IAuthTabCallback;
        int i4 = iArr[iIAuthTabCallbackStub + 3];
        if (i4 == 2) {
            if (i2 == iArr[iIAuthTabCallbackStub] && i3 == iArr[iIAuthTabCallbackStub + 1]) {
                return this.asBinder[iIAuthTabCallbackStub >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.asInterface + ((iIAuthTabCallbackStub >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 2) {
            if (i2 == iArr[i5] && i3 == iArr[i5 + 1]) {
                return this.asBinder[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return onWarmupCompleted(iIAuthTabCallbackStub, i2, i3);
    }

    public String onExtraCallbackWithResult(int i2, int i3, int i4) {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(onExtraCallback(i2, i3, i4));
        int[] iArr = this.IAuthTabCallback;
        int i5 = iArr[iIAuthTabCallbackStub + 3];
        if (i5 == 3) {
            if (i2 == iArr[iIAuthTabCallbackStub] && iArr[iIAuthTabCallbackStub + 1] == i3 && iArr[iIAuthTabCallbackStub + 2] == i4) {
                return this.asBinder[iIAuthTabCallbackStub >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.asInterface + ((iIAuthTabCallbackStub >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 3) {
            if (i2 == iArr[i6] && iArr[i6 + 1] == i3 && iArr[i6 + 2] == i4) {
                return this.asBinder[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        return onWarmupCompleted(iIAuthTabCallbackStub, i2, i3, i4);
    }

    public String onNavigationEvent(int[] iArr, int i2) {
        if (i2 < 4) {
            if (i2 == 1) {
                return onNavigationEvent(iArr[0]);
            }
            if (i2 == 2) {
                return onExtraCallback(iArr[0], iArr[1]);
            }
            if (i2 == 3) {
                return onExtraCallbackWithResult(iArr[0], iArr[1], iArr[2]);
            }
            return "";
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iArr, i2);
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(iOnExtraCallbackWithResult);
        int[] iArr2 = this.IAuthTabCallback;
        int i3 = iArr2[iIAuthTabCallbackStub + 3];
        if (iOnExtraCallbackWithResult == iArr2[iIAuthTabCallbackStub] && i3 == i2 && onExtraCallbackWithResult(iArr, i2, iArr2[iIAuthTabCallbackStub + 1])) {
            return this.asBinder[iIAuthTabCallbackStub >> 2];
        }
        if (i3 == 0) {
            return null;
        }
        int i4 = this.asInterface + ((iIAuthTabCallbackStub >> 3) << 2);
        int i5 = iArr2[i4 + 3];
        if (iOnExtraCallbackWithResult == iArr2[i4] && i5 == i2 && onExtraCallbackWithResult(iArr, i2, iArr2[i4 + 1])) {
            return this.asBinder[i4 >> 2];
        }
        return onWarmupCompleted(iIAuthTabCallbackStub, iOnExtraCallbackWithResult, iArr, i2);
    }

    private final int IAuthTabCallbackStub(int i2) {
        return (i2 & (this.onWarmupCompleted - 1)) << 2;
    }

    private String onNavigationEvent(int i2, int i3) {
        int i4 = this.IAuthTabCallback_Parcel;
        int i5 = this.IAuthTabCallbackStubProxy;
        int i6 = i4 + ((i2 >> (i5 + 2)) << i5);
        int[] iArr = this.IAuthTabCallback;
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i3 == iArr[i7] && 1 == i8) {
                return this.asBinder[i7 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
        }
        for (int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(); iIAuthTabCallback_Parcel < this.access100; iIAuthTabCallback_Parcel += 4) {
            if (i3 == iArr[iIAuthTabCallback_Parcel] && 1 == iArr[iIAuthTabCallback_Parcel + 3]) {
                return this.asBinder[iIAuthTabCallback_Parcel >> 2];
            }
        }
        return null;
    }

    private String onWarmupCompleted(int i2, int i3, int i4) {
        int i5 = this.IAuthTabCallback_Parcel;
        int i6 = this.IAuthTabCallbackStubProxy;
        int i7 = i5 + ((i2 >> (i6 + 2)) << i6);
        int[] iArr = this.IAuthTabCallback;
        for (int i8 = i7; i8 < (1 << i6) + i7; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i3 == iArr[i8] && i4 == iArr[i8 + 1] && 2 == i9) {
                return this.asBinder[i8 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
        }
        for (int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(); iIAuthTabCallback_Parcel < this.access100; iIAuthTabCallback_Parcel += 4) {
            if (i3 == iArr[iIAuthTabCallback_Parcel] && i4 == iArr[iIAuthTabCallback_Parcel + 1] && 2 == iArr[iIAuthTabCallback_Parcel + 3]) {
                return this.asBinder[iIAuthTabCallback_Parcel >> 2];
            }
        }
        return null;
    }

    private String onWarmupCompleted(int i2, int i3, int i4, int i5) {
        int i6 = this.IAuthTabCallback_Parcel;
        int i7 = this.IAuthTabCallbackStubProxy;
        int i8 = i6 + ((i2 >> (i7 + 2)) << i7);
        int[] iArr = this.IAuthTabCallback;
        for (int i9 = i8; i9 < (1 << i7) + i8; i9 += 4) {
            int i10 = iArr[i9 + 3];
            if (i3 == iArr[i9] && i4 == iArr[i9 + 1] && i5 == iArr[i9 + 2] && 3 == i10) {
                return this.asBinder[i9 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
        }
        for (int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(); iIAuthTabCallback_Parcel < this.access100; iIAuthTabCallback_Parcel += 4) {
            if (i3 == iArr[iIAuthTabCallback_Parcel] && i4 == iArr[iIAuthTabCallback_Parcel + 1] && i5 == iArr[iIAuthTabCallback_Parcel + 2] && 3 == iArr[iIAuthTabCallback_Parcel + 3]) {
                return this.asBinder[iIAuthTabCallback_Parcel >> 2];
            }
        }
        return null;
    }

    private String onWarmupCompleted(int i2, int i3, int[] iArr, int i4) {
        int i5 = this.IAuthTabCallback_Parcel;
        int i6 = this.IAuthTabCallbackStubProxy;
        int i7 = i5 + ((i2 >> (i6 + 2)) << i6);
        int[] iArr2 = this.IAuthTabCallback;
        for (int i8 = i7; i8 < (1 << i6) + i7; i8 += 4) {
            int i9 = iArr2[i8 + 3];
            if (i3 == iArr2[i8] && i4 == i9 && onExtraCallbackWithResult(iArr, i4, iArr2[i8 + 1])) {
                return this.asBinder[i8 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
        }
        for (int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(); iIAuthTabCallback_Parcel < this.access100; iIAuthTabCallback_Parcel += 4) {
            if (i3 == iArr2[iIAuthTabCallback_Parcel] && i4 == iArr2[iIAuthTabCallback_Parcel + 3] && onExtraCallbackWithResult(iArr, i4, iArr2[iIAuthTabCallback_Parcel + 1])) {
                return this.asBinder[iIAuthTabCallback_Parcel >> 2];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onExtraCallbackWithResult(int[] iArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr2 = this.IAuthTabCallback;
        switch (i2) {
            case 4:
                i4 = 0;
                return iArr[i4] != iArr2[i3] && iArr[i4 + 1] == iArr2[i3 + 1] && iArr[i4 + 2] == iArr2[i3 + 2] && iArr[i4 + 3] == iArr2[i3 + 3];
            case 5:
                i5 = 0;
                i4 = i5 + 1;
                if (iArr[i5] == iArr2[i3]) {
                    return false;
                }
                i3++;
                if (iArr[i4] != iArr2[i3]) {
                    return false;
                }
            case 6:
                i6 = 0;
                i5 = i6 + 1;
                if (iArr[i6] == iArr2[i3]) {
                    return false;
                }
                i3++;
                i4 = i5 + 1;
                if (iArr[i5] == iArr2[i3]) {
                }
                break;
            case 7:
                i7 = 0;
                i6 = i7 + 1;
                if (iArr[i7] == iArr2[i3]) {
                    return false;
                }
                i3++;
                i5 = i6 + 1;
                if (iArr[i6] == iArr2[i3]) {
                }
                break;
            case 8:
                if (iArr[0] != iArr2[i3]) {
                    return false;
                }
                i3++;
                i7 = 1;
                i6 = i7 + 1;
                if (iArr[i7] == iArr2[i3]) {
                }
                break;
            default:
                return IAuthTabCallback(iArr, i2, i3);
        }
    }

    private boolean IAuthTabCallback(int[] iArr, int i2, int i3) {
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (iArr[i4] != this.IAuthTabCallback[i3]) {
                return false;
            }
            if (i5 >= i2) {
                return true;
            }
            i3++;
            i4 = i5;
        }
    }

    public String onWarmupCompleted(String str, int[] iArr, int i2) throws StreamConstraintsException {
        int iAsInterface;
        IAuthTabCallbackStubProxy();
        setTargetFragment settargetfragment = this.IAuthTabCallbackDefault;
        if (settargetfragment != null) {
            str = settargetfragment.onNavigationEvent(str);
        }
        if (i2 == 1) {
            iAsInterface = asInterface(onExtraCallbackWithResult(iArr[0]));
            int[] iArr2 = this.IAuthTabCallback;
            iArr2[iAsInterface] = iArr[0];
            iArr2[iAsInterface + 3] = 1;
        } else if (i2 == 2) {
            iAsInterface = asInterface(IAuthTabCallback(iArr[0], iArr[1]));
            int[] iArr3 = this.IAuthTabCallback;
            iArr3[iAsInterface] = iArr[0];
            iArr3[iAsInterface + 1] = iArr[1];
            iArr3[iAsInterface + 3] = 2;
        } else if (i2 == 3) {
            int iAsInterface2 = asInterface(onExtraCallback(iArr[0], iArr[1], iArr[2]));
            int[] iArr4 = this.IAuthTabCallback;
            iArr4[iAsInterface2] = iArr[0];
            iArr4[iAsInterface2 + 1] = iArr[1];
            iArr4[iAsInterface2 + 2] = iArr[2];
            iArr4[iAsInterface2 + 3] = 3;
            iAsInterface = iAsInterface2;
        } else {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iArr, i2);
            iAsInterface = asInterface(iOnExtraCallbackWithResult);
            this.IAuthTabCallback[iAsInterface] = iOnExtraCallbackWithResult;
            int iIAuthTabCallback = IAuthTabCallback(iArr, i2);
            int[] iArr5 = this.IAuthTabCallback;
            iArr5[iAsInterface + 1] = iIAuthTabCallback;
            iArr5[iAsInterface + 3] = i2;
        }
        this.asBinder[iAsInterface >> 2] = str;
        this.onExtraCallbackWithResult++;
        return str;
    }

    private void IAuthTabCallbackStubProxy() {
        if (this.onExtraCallback) {
            if (this.onTransact == null) {
                if (this.onExtraCallbackWithResult == 0) {
                    throw new IllegalStateException("Internal error: Cannot add names to Root symbol table");
                }
                throw new IllegalStateException("Internal error: Cannot add names to Placeholder symbol table");
            }
            int[] iArr = this.IAuthTabCallback;
            this.IAuthTabCallback = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.asBinder;
            this.asBinder = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.onExtraCallback = false;
        }
    }

    private int asInterface(int i2) throws StreamConstraintsException {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(i2);
        int[] iArr = this.IAuthTabCallback;
        if (iArr[iIAuthTabCallbackStub + 3] == 0) {
            return iIAuthTabCallbackStub;
        }
        if (IAuthTabCallbackDefault()) {
            return onTransact(i2);
        }
        int i3 = this.asInterface + ((iIAuthTabCallbackStub >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this.IAuthTabCallback_Parcel;
        int i5 = this.IAuthTabCallbackStubProxy;
        int i6 = i4 + ((iIAuthTabCallbackStub >> (i5 + 2)) << i5);
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            if (iArr[i7 + 3] == 0) {
                return i7;
            }
        }
        int i8 = this.access100;
        int i9 = i8 + 4;
        this.access100 = i9;
        if (i9 < (this.onWarmupCompleted << 3)) {
            return i8;
        }
        if (this.onNavigationEvent) {
            onWarmupCompleted();
        }
        return onTransact(i2);
    }

    private int onTransact(int i2) throws StreamConstraintsException {
        access100();
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(i2);
        int[] iArr = this.IAuthTabCallback;
        if (iArr[iIAuthTabCallbackStub + 3] == 0) {
            return iIAuthTabCallbackStub;
        }
        int i3 = this.asInterface + ((iIAuthTabCallbackStub >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this.IAuthTabCallback_Parcel;
        int i5 = this.IAuthTabCallbackStubProxy;
        int i6 = i4 + ((iIAuthTabCallbackStub >> (i5 + 2)) << i5);
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            if (iArr[i7 + 3] == 0) {
                return i7;
            }
        }
        int i8 = this.access100;
        this.access100 = i8 + 4;
        return i8;
    }

    private boolean IAuthTabCallbackDefault() {
        if (this.onExtraCallbackWithResult <= (this.onWarmupCompleted >> 1)) {
            return false;
        }
        int i2 = this.access100;
        int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i3 = this.onExtraCallbackWithResult;
        return ((i2 - iIAuthTabCallback_Parcel) >> 2) > ((i3 + 1) >> 7) || i3 > onWarmupCompleted(this.onWarmupCompleted);
    }

    private int IAuthTabCallback(int[] iArr, int i2) {
        int i3 = this.IAuthTabCallbackStub;
        int i4 = i3 + i2;
        int[] iArr2 = this.IAuthTabCallback;
        if (i4 > iArr2.length) {
            int length = iArr2.length;
            this.IAuthTabCallback = Arrays.copyOf(this.IAuthTabCallback, this.IAuthTabCallback.length + Math.max(i4 - length, Math.min(4096, this.onWarmupCompleted)));
        }
        System.arraycopy(iArr, 0, this.IAuthTabCallback, i3, i2);
        this.IAuthTabCallbackStub += i2;
        return i3;
    }

    public int onExtraCallbackWithResult(int i2) {
        int i3 = i2 ^ this.access000;
        int i4 = i3 + (i3 >>> 16);
        int i5 = i4 ^ (i4 << 3);
        return i5 + (i5 >>> 12);
    }

    public int IAuthTabCallback(int i2, int i3) {
        int i4 = i2 + (i2 >>> 15);
        int i5 = ((i4 ^ (i4 >>> 9)) + (i3 * 33)) ^ this.access000;
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 >>> 4);
        return i7 + (i7 << 3);
    }

    public int onExtraCallback(int i2, int i3, int i4) {
        int i5 = i2 ^ this.access000;
        int i6 = (((i5 + (i5 >>> 9)) * 31) + i3) * 33;
        int i7 = (i6 + (i6 >>> 15)) ^ i4;
        int i8 = i7 + (i7 >>> 4);
        int i9 = i8 + (i8 >>> 15);
        return i9 ^ (i9 << 9);
    }

    public int onExtraCallbackWithResult(int[] iArr, int i2) {
        if (i2 < 4) {
            throw new IllegalArgumentException("qlen is too short, needs to be at least 4");
        }
        int i3 = iArr[0] ^ this.access000;
        int i4 = i3 + (i3 >>> 9) + iArr[1];
        int i5 = ((i4 + (i4 >>> 15)) * 33) ^ iArr[2];
        int i6 = i5 + (i5 >>> 4);
        for (int i7 = 3; i7 < i2; i7++) {
            int i8 = iArr[i7];
            i6 += i8 ^ (i8 >> 21);
        }
        int i9 = i6 * 65599;
        int i10 = i9 + (i9 >>> 19);
        return (i10 << 5) ^ i10;
    }

    private void access100() throws StreamConstraintsException {
        this.onExtraCallback = false;
        int[] iArr = this.IAuthTabCallback;
        String[] strArr = this.asBinder;
        int i2 = this.onWarmupCompleted;
        int i3 = this.onExtraCallbackWithResult;
        int i4 = i2 + i2;
        int i5 = this.access100;
        if (i4 > 65536) {
            onExtraCallbackWithResult(true);
            return;
        }
        this.IAuthTabCallback = new int[iArr.length + (i2 << 3)];
        this.onWarmupCompleted = i4;
        int i6 = i4 << 2;
        this.asInterface = i6;
        this.IAuthTabCallback_Parcel = i6 + (i6 >> 1);
        this.IAuthTabCallbackStubProxy = IAuthTabCallback(i4);
        this.asBinder = new String[strArr.length << 1];
        onExtraCallbackWithResult(false);
        int[] iArr2 = new int[16];
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i9 != 0) {
                i7++;
                String str = strArr[i8 >> 2];
                if (i9 == 1) {
                    iArr2[0] = iArr[i8];
                    onWarmupCompleted(str, iArr2, 1);
                } else if (i9 == 2) {
                    iArr2[0] = iArr[i8];
                    iArr2[1] = iArr[i8 + 1];
                    onWarmupCompleted(str, iArr2, 2);
                } else if (i9 == 3) {
                    iArr2[0] = iArr[i8];
                    iArr2[1] = iArr[i8 + 1];
                    iArr2[2] = iArr[i8 + 2];
                    onWarmupCompleted(str, iArr2, 3);
                } else {
                    if (i9 > iArr2.length) {
                        iArr2 = new int[i9];
                    }
                    System.arraycopy(iArr, iArr[i8 + 1], iArr2, 0, i9);
                    onWarmupCompleted(str, iArr2, i9);
                }
            }
        }
        if (i7 == i3) {
            return;
        }
        throw new IllegalStateException("Internal error: Failed rehash(), old count=" + i3 + ", copyCount=" + i7);
    }

    private void onExtraCallbackWithResult(boolean z) {
        this.onExtraCallbackWithResult = 0;
        this.access100 = IAuthTabCallback_Parcel();
        this.IAuthTabCallbackStub = this.onWarmupCompleted << 3;
        if (z) {
            Arrays.fill(this.IAuthTabCallback, 0);
            Arrays.fill(this.asBinder, (Object) null);
        }
    }

    private final int IAuthTabCallback_Parcel() {
        int i2 = this.onWarmupCompleted;
        return (i2 << 3) - i2;
    }

    protected void onWarmupCompleted() throws StreamConstraintsException {
        if (this.onWarmupCompleted <= 1024) {
            return;
        }
        throw new StreamConstraintsException("Spill-over slots in symbol table with " + this.onExtraCallbackWithResult + " entries, hash area of " + this.onWarmupCompleted + " slots is now full (all " + (this.onWarmupCompleted >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    static final class onWarmupCompleted {
        public final int IAuthTabCallback;
        public final int asBinder;
        public final int onExtraCallback;
        public final String[] onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onTransact;
        public final int[] onWarmupCompleted;

        public onWarmupCompleted(int i2, int i3, int i4, int[] iArr, String[] strArr, int i5, int i6) {
            this.onNavigationEvent = i2;
            this.onExtraCallback = i3;
            this.onTransact = i4;
            this.onWarmupCompleted = iArr;
            this.onExtraCallbackWithResult = strArr;
            this.asBinder = i5;
            this.IAuthTabCallback = i6;
        }

        public onWarmupCompleted(setMenuVisibility setmenuvisibility) {
            this.onNavigationEvent = setmenuvisibility.onWarmupCompleted;
            this.onExtraCallback = setmenuvisibility.onExtraCallbackWithResult;
            this.onTransact = setmenuvisibility.IAuthTabCallbackStubProxy;
            this.onWarmupCompleted = setmenuvisibility.IAuthTabCallback;
            this.onExtraCallbackWithResult = setmenuvisibility.asBinder;
            this.asBinder = setmenuvisibility.access100;
            this.IAuthTabCallback = setmenuvisibility.IAuthTabCallbackStub;
        }

        public static onWarmupCompleted onNavigationEvent(int i2) {
            int i3 = i2 << 3;
            return new onWarmupCompleted(i2, 0, setMenuVisibility.IAuthTabCallback(i2), new int[i3], new String[i2 << 1], i3 - i2, i3);
        }
    }
}
