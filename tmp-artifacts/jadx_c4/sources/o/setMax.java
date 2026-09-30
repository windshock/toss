package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import javax.security.auth.Destroyable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class setMax implements CharSequence, Destroyable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = {64926, 64912, 64907, 64998, 65013, 64915, 64913, 64999, 64914};
    private static char onWarmupCompleted = 51242;
    private byte[] onNavigationEvent;

    protected abstract setupStyleable IAuthTabCallback();

    protected abstract BaseRoundCornerProgressBarOnProgressChangedListener onNavigationEvent();

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        char cOnWarmupCompleted = onWarmupCompleted(i);
        int i5 = IAuthTabCallback + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return cOnWarmupCompleted;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        throw null;
    }

    protected final void onExtraCallback(@Nullable byte[] bArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = bArr;
        if (i3 != 0) {
            throw null;
        }
    }

    protected final byte[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return onNavigationEvent().onExtraCallbackWithResult(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r2 = r2 + 115;
        o.setMax.IAuthTabCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] onExtraCallbackWithResult() {
        byte[] bArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            bArr = this.onNavigationEvent;
            int i4 = 54 / 0;
        } else {
            bArr = this.onNavigationEvent;
        }
    }

    public final void onExtraCallback(@Nullable CharSequence charSequence) throws BaseRoundCornerProgressBarSavedState {
        int i = 2 % 2;
        byte[] bArrOnWarmupCompleted = null;
        if (charSequence != null) {
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            bArrOnWarmupCompleted = PageKey.onWarmupCompleted(charSequence, null, 1, null);
            int i4 = onExtraCallback + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        onWarmupCompleted(bArrOnWarmupCompleted);
        int i6 = onExtraCallback + 45;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@Nullable byte[] bArr) throws BaseRoundCornerProgressBarSavedState {
        byte[] bArrA_;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
            if (bArr != null) {
                int i5 = i2 + 37;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                bArrA_ = IAuthTabCallback().a_(bArr);
                if (i6 != 0) {
                    int i7 = 19 / 0;
                }
            } else {
                bArrA_ = null;
            }
        } else if (bArr != null) {
        }
        this.onNavigationEvent = bArrA_;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return new o.GraniteBrownfieldModule_closeView(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = o.setMax.onExtraCallback + 93;
        o.setMax.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence asInterface() {
        byte[] bArrOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            bArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 14 / 0;
        } else {
            bArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = null;
        if (i3 != 0) {
            throw null;
        }
    }

    public int IAuthTabCallbackDefault() {
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView;
        int i = 2 % 2;
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeViewAsInterface = asInterface();
        int length = 0;
        if (graniteBrownfieldModule_closeViewAsInterface != null) {
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 81 / 0;
                length = graniteBrownfieldModule_closeViewAsInterface.length();
            } else {
                length = graniteBrownfieldModule_closeViewAsInterface.length();
            }
        }
        if (graniteBrownfieldModule_closeViewAsInterface instanceof GraniteBrownfieldModule_closeView) {
            int i4 = IAuthTabCallback + 23;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            graniteBrownfieldModule_closeView = graniteBrownfieldModule_closeViewAsInterface;
            int i7 = i5 + 31;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            graniteBrownfieldModule_closeView = null;
        }
        if (graniteBrownfieldModule_closeView != null) {
            int i9 = onExtraCallback + 53;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            graniteBrownfieldModule_closeView.destroy();
            if (i10 != 0) {
                throw null;
            }
        }
        return length;
    }

    public char onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        char cCharAt = toString().charAt(i);
        int i5 = onExtraCallback + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return cCharAt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence subSequence(int i, int i2) {
        CharSequence charSequenceIAuthTabCallback;
        int i3 = 2 % 2;
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeViewAsInterface = asInterface();
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = null;
        if (graniteBrownfieldModule_closeViewAsInterface != null) {
            int i4 = onExtraCallback + 77;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                graniteBrownfieldModule_closeViewAsInterface.subSequence(i, i2);
                graniteBrownfieldModule_closeView.hashCode();
                throw null;
            }
            charSequenceIAuthTabCallback = graniteBrownfieldModule_closeViewAsInterface.subSequence(i, i2);
            if (charSequenceIAuthTabCallback == null) {
                charSequenceIAuthTabCallback = GraniteBrownfieldModule_closeView.Companion.IAuthTabCallback();
            }
        }
        if (graniteBrownfieldModule_closeViewAsInterface instanceof GraniteBrownfieldModule_closeView) {
            int i5 = IAuthTabCallback + 111;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            graniteBrownfieldModule_closeView = graniteBrownfieldModule_closeViewAsInterface;
        }
        if (graniteBrownfieldModule_closeView != null) {
            graniteBrownfieldModule_closeView.destroy();
        }
        return charSequenceIAuthTabCallback;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        byte[] bArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (bArrOnExtraCallbackWithResult != null) {
            Object[] objArr = new Object[1];
            a(new char[]{4, 6, 3, 1, 13783}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 53), View.resolveSizeAndState(0, 0, 0) + 5, objArr);
            Charset charsetForName = Charset.forName(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(charsetForName, "");
            return new String(bArrOnExtraCallbackWithResult, charsetForName);
        }
        int i3 = IAuthTabCallback + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // javax.security.auth.Destroyable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDestroyed() {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.onNavigationEvent;
        boolean z2 = false;
        if (bArr != null) {
            int i5 = i2 + 15;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            if (i5 % 2 != 0) {
                int length = bArr.length;
                int i7 = 21 / 0;
                z = length == 0;
            } else if (bArr.length == 0) {
            }
            if (!z) {
                int i8 = i6 + 95;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                z2 = true;
            }
        }
        boolean z3 = !z2;
        int i10 = IAuthTabCallback + 59;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return z3;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback();
        int i4 = IAuthTabCallback + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            int i4 = IAuthTabCallback + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        boolean zAreEqual = Intrinsics.areEqual(toString(), ((setMax) obj).toString());
        int i6 = IAuthTabCallback + 77;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return zAreEqual;
    }

    public int hashCode() {
        int i = 2 % 2;
        byte[] bArr = this.onNavigationEvent;
        if (bArr != null) {
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return bArr.hashCode();
        }
        int i4 = IAuthTabCallback + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 26 - View.getDefaultSize(0, 0), 23139 - TextUtils.getTrimmedLength(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 25 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionType(0L) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 5;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback != defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 24823), 74 - (ViewConfiguration.getFadingEdgeLength() >> 16), 8088 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Process.getGidForName("") + 31, 19488 - ((Process.getThreadPriority(0) + 20) >> 6), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                    }
                } else {
                    int i14 = $11 + 69;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback << b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent >>> 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback + b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                j = 0;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            int i16 = $10 + 107;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
