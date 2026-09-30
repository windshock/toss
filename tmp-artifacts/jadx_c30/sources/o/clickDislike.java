package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class clickDislike {
    int IAuthTabCallback;
    private int asInterface;
    final boolean onExtraCallback;
    final int[] onExtraCallbackWithResult;
    int onNavigationEvent;
    private char[] onWarmupCompleted;

    interface onWarmupCompleted {
        char IAuthTabCallback();

        boolean IAuthTabCallbackDefault();

        boolean IAuthTabCallbackStub();

        boolean asBinder();

        boolean asInterface();

        char[] onExtraCallback();

        char onExtraCallbackWithResult();

        char onNavigationEvent();

        char[] onWarmupCompleted();
    }

    private static int IAuthTabCallback(char c) {
        return c - '0';
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static clickDislike onExtraCallback(double d) {
        if (!Double.isFinite(d)) {
            throw new IllegalArgumentException("Double is not finite");
        }
        char[] charArray = Double.toString(d).toCharArray();
        ?? r0 = charArray[0] == '-' ? 1 : 0;
        int[] iArr = new int[(charArray.length - r0) - 1];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = r0;
        while (i4 < charArray.length) {
            char c = charArray[i4];
            if (c != '.') {
                if (c == 'E') {
                    break;
                }
                if (c != '0' || i > 0) {
                    int iIAuthTabCallback = IAuthTabCallback(c);
                    int i5 = i + 1;
                    iArr[i] = iIAuthTabCallback;
                    if (iIAuthTabCallback > 0) {
                        i2 = i5;
                    }
                    i = i5;
                } else if (z) {
                    i3--;
                }
            } else {
                z = true;
                i3 = i;
            }
            i4++;
        }
        if (i > 0) {
            return new clickDislike(r0, iArr, i2, ((i4 < charArray.length ? onWarmupCompleted(charArray, i4 + 1) : 0) + i3) - i2);
        }
        return new clickDislike(r0, new int[]{0}, 1, 0);
    }

    private static int onWarmupCompleted(char[] cArr, int i) {
        int iIAuthTabCallback = 0;
        boolean z = cArr[i] == '-';
        if (z) {
            z = true;
            i++;
        }
        while (i < cArr.length) {
            iIAuthTabCallback = (iIAuthTabCallback * 10) + IAuthTabCallback(cArr[i]);
            i++;
        }
        return z ? -iIAuthTabCallback : iIAuthTabCallback;
    }

    private clickDislike(boolean z, int[] iArr, int i, int i2) {
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = iArr;
        this.onNavigationEvent = i;
        this.IAuthTabCallback = i2;
    }

    private void onExtraCallback(char c) {
        char[] cArr = this.onWarmupCompleted;
        int i = this.asInterface;
        this.asInterface = i + 1;
        cArr[i] = c;
    }

    private void onExtraCallbackWithResult(char[] cArr) {
        for (char c : cArr) {
            onExtraCallback(c);
        }
    }

    private void onWarmupCompleted(int i, int i2, onWarmupCompleted onwarmupcompleted) {
        char[] cArrOnExtraCallback = onwarmupcompleted.onExtraCallback();
        char c = cArrOnExtraCallback[0];
        if (i2 < this.onNavigationEvent) {
            onExtraCallback(onwarmupcompleted.onNavigationEvent());
            for (int i3 = 0; i3 < i; i3++) {
                onExtraCallback(c);
            }
            while (i2 < this.onNavigationEvent) {
                onWarmupCompleted(this.onExtraCallbackWithResult[i2], cArrOnExtraCallback);
                i2++;
            }
            return;
        }
        if (onwarmupcompleted.asInterface()) {
            onExtraCallback(onwarmupcompleted.onNavigationEvent());
            onExtraCallback(c);
        }
    }

    private void onWarmupCompleted(int i, char[] cArr) {
        onExtraCallback(cArr[i]);
    }

    private int onNavigationEvent(int i, onWarmupCompleted onwarmupcompleted) {
        if (onNavigationEvent(onwarmupcompleted)) {
            onExtraCallback(onwarmupcompleted.IAuthTabCallback());
        }
        char[] cArrOnExtraCallback = onwarmupcompleted.onExtraCallback();
        int i2 = 0;
        char c = cArrOnExtraCallback[0];
        int iMax = Math.max(0, Math.min(i, this.onNavigationEvent));
        if (iMax <= 0) {
            onExtraCallback(c);
            return iMax;
        }
        while (i2 < iMax) {
            onWarmupCompleted(this.onExtraCallbackWithResult[i2], cArrOnExtraCallback);
            i2++;
        }
        while (i2 < i) {
            onExtraCallback(c);
            i2++;
        }
        return iMax;
    }

    private int onExtraCallback(int i, onWarmupCompleted onwarmupcompleted) {
        if (onNavigationEvent(onwarmupcompleted)) {
            onExtraCallback(onwarmupcompleted.IAuthTabCallback());
        }
        char[] cArrOnExtraCallback = onwarmupcompleted.onExtraCallback();
        int i2 = 0;
        char c = cArrOnExtraCallback[0];
        char cOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
        int iMax = Math.max(0, Math.min(i, this.onNavigationEvent));
        if (iMax <= 0) {
            onExtraCallback(c);
            return iMax;
        }
        int i3 = i;
        while (i2 < iMax) {
            onWarmupCompleted(this.onExtraCallbackWithResult[i2], cArrOnExtraCallback);
            if (IAuthTabCallback(i3)) {
                onExtraCallback(cOnExtraCallbackWithResult);
            }
            i2++;
            i3--;
        }
        while (i2 < i) {
            onExtraCallback(c);
            if (IAuthTabCallback(i3)) {
                onExtraCallback(cOnExtraCallbackWithResult);
            }
            i2++;
            i3--;
        }
        return iMax;
    }

    private int onWarmupCompleted(int i, onWarmupCompleted onwarmupcompleted) {
        int i2 = this.onNavigationEvent;
        if (onNavigationEvent(onwarmupcompleted)) {
            i2++;
        }
        if (i <= 0) {
            return i2 + Math.abs(i) + 2;
        }
        int i3 = this.onNavigationEvent;
        if (i < i3) {
            return i2 + 1;
        }
        int i4 = i2 + (i - i3);
        return onwarmupcompleted.asInterface() ? i4 + 2 : i4;
    }

    public int onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    private int IAuthTabCallback(int i, onWarmupCompleted onwarmupcompleted) {
        int iOnWarmupCompleted = onWarmupCompleted(i, onwarmupcompleted);
        return (!onwarmupcompleted.IAuthTabCallbackStub() || i <= 0) ? iOnWarmupCompleted : iOnWarmupCompleted + ((i - 1) / 3);
    }

    public int onWarmupCompleted() {
        return (this.onNavigationEvent + this.IAuthTabCallback) - 1;
    }

    boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult[0] == 0;
    }

    public void onExtraCallbackWithResult(int i) {
        if (i <= 0 || i >= this.onNavigationEvent) {
            return;
        }
        if (onTransact(i)) {
            onWarmupCompleted(i);
        } else {
            asInterface(i);
        }
    }

    private String onExtraCallback() {
        String strValueOf = String.valueOf(this.onWarmupCompleted);
        this.onWarmupCompleted = null;
        return strValueOf;
    }

    private void onExtraCallback(int i) {
        this.onWarmupCompleted = new char[i];
        this.asInterface = 0;
    }

    private boolean IAuthTabCallback(int i) {
        return i > 1 && i % 3 == 1;
    }

    public void onNavigationEvent(int i) {
        int i2 = this.IAuthTabCallback;
        if (i > i2) {
            int i3 = this.onNavigationEvent + i2;
            if (i < i3) {
                onExtraCallbackWithResult(i3 - i);
            } else if (i == i3 && onTransact(0)) {
                onWarmupCompleted(1, i);
            } else {
                onWarmupCompleted(0, 0);
            }
        }
    }

    private void onWarmupCompleted(int i) {
        int i2 = this.onNavigationEvent - i;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            int[] iArr = this.onExtraCallbackWithResult;
            int i3 = iArr[i] + 1;
            if (i3 < 10) {
                iArr[i] = i3;
                break;
            }
            i2++;
        }
        if (i < 0) {
            onWarmupCompleted(1, this.IAuthTabCallback + i2);
        } else {
            asInterface(this.onNavigationEvent - i2);
        }
    }

    private void onWarmupCompleted(int i, int i2) {
        this.onExtraCallbackWithResult[0] = i;
        this.onNavigationEvent = 1;
        this.IAuthTabCallback = i2;
    }

    private boolean onExtraCallbackWithResult(int i, onWarmupCompleted onwarmupcompleted) {
        return i != 0 || onwarmupcompleted.asBinder();
    }

    private boolean onNavigationEvent(onWarmupCompleted onwarmupcompleted) {
        if (this.onExtraCallback) {
            return onwarmupcompleted.IAuthTabCallbackDefault() || !onExtraCallbackWithResult();
        }
        return false;
    }

    private boolean onTransact(int i) {
        int[] iArr = this.onExtraCallbackWithResult;
        int i2 = iArr[i];
        if (i2 <= 5) {
            if (i2 != 5) {
                return false;
            }
            if (i >= this.onNavigationEvent - 1 && iArr[i - 1] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public String onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        return IAuthTabCallbackStub(Math.floorMod(onWarmupCompleted(), 3) + 1, onwarmupcompleted);
    }

    public String IAuthTabCallback(onWarmupCompleted onwarmupcompleted) {
        int iOnNavigationEvent;
        int i = this.onNavigationEvent + this.IAuthTabCallback;
        int iAbs = i <= 0 ? Math.abs(i) : 0;
        onExtraCallback(IAuthTabCallback(i, onwarmupcompleted));
        if (onwarmupcompleted.IAuthTabCallbackStub()) {
            iOnNavigationEvent = onExtraCallback(i, onwarmupcompleted);
        } else {
            iOnNavigationEvent = onNavigationEvent(i, onwarmupcompleted);
        }
        onWarmupCompleted(iAbs, iOnNavigationEvent, onwarmupcompleted);
        return onExtraCallback();
    }

    public String onExtraCallback(onWarmupCompleted onwarmupcompleted) {
        return IAuthTabCallbackStub(1, onwarmupcompleted);
    }

    private String IAuthTabCallbackStub(int i, onWarmupCompleted onwarmupcompleted) {
        int i2 = (this.onNavigationEvent + this.IAuthTabCallback) - i;
        int iAbs = Math.abs(i2);
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onwarmupcompleted);
        boolean z = i2 < 0;
        int iOnWarmupCompleted = onWarmupCompleted(i, onwarmupcompleted);
        if (zOnExtraCallbackWithResult) {
            iOnWarmupCompleted += onwarmupcompleted.onWarmupCompleted().length + (iAbs > 0 ? 1 + ((int) Math.floor(Math.log10(iAbs))) : 1);
            if (z) {
                iOnWarmupCompleted++;
            }
        }
        onExtraCallback(iOnWarmupCompleted);
        onWarmupCompleted(0, onNavigationEvent(i, onwarmupcompleted), onwarmupcompleted);
        if (zOnExtraCallbackWithResult) {
            onExtraCallbackWithResult(onwarmupcompleted.onWarmupCompleted());
            if (z) {
                onExtraCallback(onwarmupcompleted.IAuthTabCallback());
            }
            char[] cArrOnExtraCallback = onwarmupcompleted.onExtraCallback();
            for (int i3 = iOnWarmupCompleted - 1; i3 >= this.asInterface; i3--) {
                this.onWarmupCompleted[i3] = cArrOnExtraCallback[iAbs % 10];
                iAbs /= 10;
            }
            this.asInterface = iOnWarmupCompleted;
        }
        return onExtraCallback();
    }

    private void asInterface(int i) {
        for (int i2 = i - 1; i2 > 0 && this.onExtraCallbackWithResult[i2] == 0; i2--) {
            i--;
        }
        this.IAuthTabCallback += this.onNavigationEvent - i;
        this.onNavigationEvent = i;
    }
}
