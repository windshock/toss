package o;

import com.alibaba.ariver.kernel.RVParams;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import o.getReturnTransition;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setSharedElementEnterTransition {
    protected IAuthTabCallback[] IAuthTabCallback;
    protected int IAuthTabCallbackDefault;
    protected int IAuthTabCallbackStub;
    protected final isDetached IAuthTabCallbackStubProxy;
    protected int IAuthTabCallback_Parcel;
    protected String[] access100;
    protected BitSet asBinder;
    protected final setSharedElementEnterTransition asInterface;
    protected final AtomicReference<onWarmupCompleted> getInterfaceDescriptor;
    protected int onExtraCallback;
    protected boolean onExtraCallbackWithResult;
    protected final int onNavigationEvent;
    protected final int onTransact;
    protected boolean onWarmupCompleted;

    private static int IAuthTabCallback(int i2) {
        return i2 - (i2 >> 2);
    }

    private setSharedElementEnterTransition(isDetached isdetached, int i2, int i3) {
        this.asInterface = null;
        this.onTransact = i3;
        this.IAuthTabCallbackStubProxy = isdetached;
        this.onExtraCallbackWithResult = true;
        this.onNavigationEvent = i2;
        this.onWarmupCompleted = false;
        this.IAuthTabCallbackStub = 0;
        this.getInterfaceDescriptor = new AtomicReference<>(onWarmupCompleted.onExtraCallback(64));
    }

    private setSharedElementEnterTransition(setSharedElementEnterTransition setsharedelemententertransition, isDetached isdetached, int i2, int i3, onWarmupCompleted onwarmupcompleted) {
        this.asInterface = setsharedelemententertransition;
        this.IAuthTabCallbackStubProxy = isdetached;
        this.onTransact = i3;
        this.getInterfaceDescriptor = null;
        this.onNavigationEvent = i2;
        this.onExtraCallbackWithResult = getReturnTransition.onWarmupCompleted.CANONICALIZE_FIELD_NAMES.enabledIn(i2);
        String[] strArr = onwarmupcompleted.IAuthTabCallback;
        this.access100 = strArr;
        this.IAuthTabCallback = onwarmupcompleted.onWarmupCompleted;
        this.IAuthTabCallbackDefault = onwarmupcompleted.onNavigationEvent;
        this.IAuthTabCallbackStub = onwarmupcompleted.onExtraCallback;
        int length = strArr.length;
        this.IAuthTabCallback_Parcel = IAuthTabCallback(length);
        this.onExtraCallback = length - 1;
        this.onWarmupCompleted = true;
    }

    public static setSharedElementEnterTransition onExtraCallback(isMenuVisible ismenuvisible) {
        return onExtraCallback(ismenuvisible, 0);
    }

    public static setSharedElementEnterTransition onExtraCallback(isMenuVisible ismenuvisible, int i2) {
        int iOnExtraCallback;
        isDetached isdetachedIAuthTabCallback;
        if (i2 == 0) {
            i2 = System.identityHashCode(ismenuvisible);
        }
        if (ismenuvisible == null) {
            isdetachedIAuthTabCallback = isDetached.IAuthTabCallback();
            iOnExtraCallback = 0;
        } else {
            isDetached isdetachedIAuthTabCallbackStub = ismenuvisible.IAuthTabCallbackStub();
            iOnExtraCallback = ismenuvisible.onExtraCallback();
            isdetachedIAuthTabCallback = isdetachedIAuthTabCallbackStub;
        }
        return new setSharedElementEnterTransition(isdetachedIAuthTabCallback, iOnExtraCallback, i2);
    }

    public setSharedElementEnterTransition onExtraCallbackWithResult() {
        return new setSharedElementEnterTransition(this, this.IAuthTabCallbackStubProxy, this.onNavigationEvent, this.onTransact, this.getInterfaceDescriptor.get());
    }

    public void IAuthTabCallback() {
        setSharedElementEnterTransition setsharedelemententertransition;
        if (onWarmupCompleted() && (setsharedelemententertransition = this.asInterface) != null && this.onExtraCallbackWithResult) {
            setsharedelemententertransition.onNavigationEvent(new onWarmupCompleted(this));
            this.onWarmupCompleted = true;
        }
    }

    private void onNavigationEvent(onWarmupCompleted onwarmupcompleted) {
        int i2 = onwarmupcompleted.onNavigationEvent;
        onWarmupCompleted onwarmupcompleted2 = this.getInterfaceDescriptor.get();
        if (i2 == onwarmupcompleted2.onNavigationEvent) {
            return;
        }
        if (i2 > 12000) {
            onwarmupcompleted = onWarmupCompleted.onExtraCallback(64);
        }
        setSupportImageTintList.onNavigationEvent(this.getInterfaceDescriptor, onwarmupcompleted2, onwarmupcompleted);
    }

    public boolean onWarmupCompleted() {
        return !this.onWarmupCompleted;
    }

    public int onExtraCallback() {
        return this.onTransact;
    }

    public String IAuthTabCallback(char[] cArr, int i2, int i3, int i4) throws IOException {
        if (i3 <= 0) {
            return "";
        }
        if (!this.onExtraCallbackWithResult) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(i3);
            return new String(cArr, i2, i3);
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i4);
        String str = this.access100[iOnExtraCallbackWithResult];
        if (str != null) {
            if (str.length() == i3) {
                int i5 = 0;
                while (str.charAt(i5) == cArr[i2 + i5]) {
                    i5++;
                    if (i5 == i3) {
                        return str;
                    }
                }
            }
            IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback[iOnExtraCallbackWithResult >> 1];
            if (iAuthTabCallback != null) {
                String strOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted(cArr, i2, i3);
                if (strOnWarmupCompleted != null) {
                    return strOnWarmupCompleted;
                }
                String strOnNavigationEvent = onNavigationEvent(cArr, i2, i3, iAuthTabCallback.onExtraCallbackWithResult);
                if (strOnNavigationEvent != null) {
                    return strOnNavigationEvent;
                }
            }
        }
        this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(i3);
        return onWarmupCompleted(cArr, i2, i3, i4, iOnExtraCallbackWithResult);
    }

    private String onNavigationEvent(char[] cArr, int i2, int i3, IAuthTabCallback iAuthTabCallback) {
        while (iAuthTabCallback != null) {
            String strOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted(cArr, i2, i3);
            if (strOnWarmupCompleted != null) {
                return strOnWarmupCompleted;
            }
            iAuthTabCallback = iAuthTabCallback.onExtraCallbackWithResult;
        }
        return null;
    }

    private String onWarmupCompleted(char[] cArr, int i2, int i3, int i4, int i5) throws IOException {
        if (this.onWarmupCompleted) {
            onNavigationEvent();
            this.onWarmupCompleted = false;
        } else if (this.IAuthTabCallbackDefault >= this.IAuthTabCallback_Parcel) {
            asBinder();
            i5 = onExtraCallbackWithResult(IAuthTabCallback(cArr, i2, i3));
        }
        String str = new String(cArr, i2, i3);
        if (getReturnTransition.onWarmupCompleted.INTERN_FIELD_NAMES.enabledIn(this.onNavigationEvent)) {
            str = setTargetFragment.onExtraCallbackWithResult.onNavigationEvent(str);
        }
        this.IAuthTabCallbackDefault++;
        String[] strArr = this.access100;
        if (strArr[i5] == null) {
            strArr[i5] = str;
            return str;
        }
        int i6 = i5 >> 1;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(str, this.IAuthTabCallback[i6]);
        int i7 = iAuthTabCallback.onWarmupCompleted;
        if (i7 > 150) {
            IAuthTabCallback(i6, iAuthTabCallback, i5);
            return str;
        }
        this.IAuthTabCallback[i6] = iAuthTabCallback;
        this.IAuthTabCallbackStub = Math.max(i7, this.IAuthTabCallbackStub);
        return str;
    }

    private void IAuthTabCallback(int i2, IAuthTabCallback iAuthTabCallback, int i3) throws IOException {
        BitSet bitSet = this.asBinder;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.asBinder = bitSet2;
            bitSet2.set(i2);
        } else if (bitSet.get(i2)) {
            if (getReturnTransition.onWarmupCompleted.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.onNavigationEvent)) {
                onExtraCallback(RVParams.WEBVIEW_FONT_SIZE_LARGER);
            }
            this.onExtraCallbackWithResult = false;
        } else {
            this.asBinder.set(i2);
        }
        this.access100[i3] = iAuthTabCallback.onExtraCallback;
        this.IAuthTabCallback[i2] = null;
        this.IAuthTabCallbackDefault -= iAuthTabCallback.onWarmupCompleted;
        this.IAuthTabCallbackStub = -1;
    }

    public int onExtraCallbackWithResult(int i2) {
        int i3 = i2 + (i2 >>> 15);
        int i4 = i3 ^ (i3 << 7);
        return (i4 + (i4 >>> 3)) & this.onExtraCallback;
    }

    public int IAuthTabCallback(char[] cArr, int i2, int i3) {
        int i4 = this.onTransact;
        for (int i5 = i2; i5 < i3 + i2; i5++) {
            i4 = (i4 * 33) + cArr[i5];
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public int onNavigationEvent(String str) {
        int length = str.length();
        int iCharAt = this.onTransact;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt * 33) + str.charAt(i2);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    private void onNavigationEvent() {
        String[] strArr = this.access100;
        this.access100 = (String[]) Arrays.copyOf(strArr, strArr.length);
        IAuthTabCallback[] iAuthTabCallbackArr = this.IAuthTabCallback;
        this.IAuthTabCallback = (IAuthTabCallback[]) Arrays.copyOf(iAuthTabCallbackArr, iAuthTabCallbackArr.length);
    }

    private void asBinder() throws IOException {
        String[] strArr = this.access100;
        int length = strArr.length;
        int i2 = length + length;
        if (i2 > 65536) {
            this.IAuthTabCallbackDefault = 0;
            this.onExtraCallbackWithResult = false;
            this.access100 = new String[64];
            this.IAuthTabCallback = new IAuthTabCallback[32];
            this.onExtraCallback = 63;
            this.onWarmupCompleted = false;
            return;
        }
        IAuthTabCallback[] iAuthTabCallbackArr = this.IAuthTabCallback;
        this.access100 = new String[i2];
        this.IAuthTabCallback = new IAuthTabCallback[i2 >> 1];
        this.onExtraCallback = i2 - 1;
        this.IAuthTabCallback_Parcel = IAuthTabCallback(i2);
        int iMax = 0;
        int i3 = 0;
        for (String str : strArr) {
            if (str != null) {
                i3++;
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(onNavigationEvent(str));
                String[] strArr2 = this.access100;
                if (strArr2[iOnExtraCallbackWithResult] == null) {
                    strArr2[iOnExtraCallbackWithResult] = str;
                } else {
                    int i4 = iOnExtraCallbackWithResult >> 1;
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(str, this.IAuthTabCallback[i4]);
                    this.IAuthTabCallback[i4] = iAuthTabCallback;
                    iMax = Math.max(iMax, iAuthTabCallback.onWarmupCompleted);
                }
            }
        }
        for (int i5 = 0; i5 < (length >> 1); i5++) {
            for (IAuthTabCallback iAuthTabCallback2 = iAuthTabCallbackArr[i5]; iAuthTabCallback2 != null; iAuthTabCallback2 = iAuthTabCallback2.onExtraCallbackWithResult) {
                i3++;
                String str2 = iAuthTabCallback2.onExtraCallback;
                int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(onNavigationEvent(str2));
                String[] strArr3 = this.access100;
                if (strArr3[iOnExtraCallbackWithResult2] == null) {
                    strArr3[iOnExtraCallbackWithResult2] = str2;
                } else {
                    int i6 = iOnExtraCallbackWithResult2 >> 1;
                    IAuthTabCallback iAuthTabCallback3 = new IAuthTabCallback(str2, this.IAuthTabCallback[i6]);
                    this.IAuthTabCallback[i6] = iAuthTabCallback3;
                    iMax = Math.max(iMax, iAuthTabCallback3.onWarmupCompleted);
                }
            }
        }
        this.IAuthTabCallbackStub = iMax;
        this.asBinder = null;
        int i7 = this.IAuthTabCallbackDefault;
        if (i3 != i7) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(i7), Integer.valueOf(i3)));
        }
    }

    protected void onExtraCallback(int i2) throws StreamConstraintsException {
        throw new StreamConstraintsException("Longest collision chain in symbol table (of size " + this.IAuthTabCallbackDefault + ") now exceeds maximum, " + i2 + " -- suspect a DoS attack based on hash collisions");
    }

    static final class IAuthTabCallback {
        public final String onExtraCallback;
        public final IAuthTabCallback onExtraCallbackWithResult;
        public final int onWarmupCompleted;

        public IAuthTabCallback(String str, IAuthTabCallback iAuthTabCallback) {
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = iAuthTabCallback;
            this.onWarmupCompleted = iAuthTabCallback != null ? 1 + iAuthTabCallback.onWarmupCompleted : 1;
        }

        public String onWarmupCompleted(char[] cArr, int i2, int i3) {
            if (this.onExtraCallback.length() != i3) {
                return null;
            }
            int i4 = 0;
            while (this.onExtraCallback.charAt(i4) == cArr[i2 + i4]) {
                i4++;
                if (i4 >= i3) {
                    return this.onExtraCallback;
                }
            }
            return null;
        }
    }

    static final class onWarmupCompleted {
        final String[] IAuthTabCallback;
        final int onExtraCallback;
        final int onNavigationEvent;
        final IAuthTabCallback[] onWarmupCompleted;

        public onWarmupCompleted(int i2, int i3, String[] strArr, IAuthTabCallback[] iAuthTabCallbackArr) {
            this.onNavigationEvent = i2;
            this.onExtraCallback = i3;
            this.IAuthTabCallback = strArr;
            this.onWarmupCompleted = iAuthTabCallbackArr;
        }

        public onWarmupCompleted(setSharedElementEnterTransition setsharedelemententertransition) {
            this.onNavigationEvent = setsharedelemententertransition.IAuthTabCallbackDefault;
            this.onExtraCallback = setsharedelemententertransition.IAuthTabCallbackStub;
            this.IAuthTabCallback = setsharedelemententertransition.access100;
            this.onWarmupCompleted = setsharedelemententertransition.IAuthTabCallback;
        }

        public static onWarmupCompleted onExtraCallback(int i2) {
            return new onWarmupCompleted(0, 0, new String[i2], new IAuthTabCallback[i2 >> 1]);
        }
    }
}
