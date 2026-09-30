package o;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class CheckLivenessFromDepthImage implements TextWatcher {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char[] IAuthTabCallback = null;
    private static boolean IAuthTabCallbackDefault = false;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100 = 0;
    private static int asBinder = 1;
    private static boolean asInterface;
    private static int onTransact;
    public static final String onWarmupCompleted;
    private boolean onExtraCallback;
    private final EditText onExtraCallbackWithResult;
    private final StringBuffer onNavigationEvent;

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-123, -126, -115, -125, -118, -116, -117, -118, -119, -126, -120, -123, -126, -121, -121, -124, -122, -126, -123, -124, -125, -126, -127}, 127 - TextUtils.indexOf("", "", 0, 0), objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
        int i = asBinder + 29;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable editable) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(editable, "");
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 87;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (i6 != 0) {
            throw null;
        }
        int i7 = access100 + 35;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public CheckLivenessFromDepthImage(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "");
        this.onExtraCallbackWithResult = editText;
        this.onNavigationEvent = new StringBuffer();
        editText.setSaveEnabled(false);
        editText.addOnAttachStateChangeListener(new onExtraCallbackWithResult(this));
    }

    public static final /* synthetic */ EditText onExtraCallback(CheckLivenessFromDepthImage checkLivenessFromDepthImage) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        EditText editText = checkLivenessFromDepthImage.onExtraCallbackWithResult;
        int i5 = i3 + 55;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return editText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CharSequence onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        StringBuffer stringBuffer = this.onNavigationEvent;
        int i4 = i2 + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return stringBuffer;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
        }
        setDefaultValue.onExtraCallbackWithResult(this.onNavigationEvent, (IntRange) null, 1, (Object) null);
        this.onNavigationEvent.append(charSequence);
        this.onExtraCallback = true;
        this.onExtraCallbackWithResult.setText((CharSequence) onNavigationEvent.Companion.onExtraCallbackWithResult(charSequence));
        this.onExtraCallback = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[PHI: r7
      0x005a: PHI (r7v2 int) = (r7v1 int), (r7v4 int) binds: [B:14:0x0058, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextChanged(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            boolean r1 = r3.onExtraCallback
            if (r1 != 0) goto L96
            int r1 = o.CheckLivenessFromDepthImage.access100
            int r1 = r1 + 33
            int r2 = r1 % 128
            o.CheckLivenessFromDepthImage.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            java.lang.StringBuffer r1 = r3.onNavigationEvent
            int r1 = r1.length()
            if (r1 <= 0) goto L27
            java.lang.StringBuffer r1 = r3.onNavigationEvent
            int r6 = r6 + r5
            kotlin.ranges.IntRange r6 = kotlin.ranges.RangesKt.until(r5, r6)
            o.setDefaultValue.onWarmupCompleted(r1, r6)
        L27:
            if (r7 <= 0) goto L96
            int r6 = o.CheckLivenessFromDepthImage.IAuthTabCallbackStubProxy
            int r6 = r6 + 41
            int r1 = r6 % 128
            o.CheckLivenessFromDepthImage.access100 = r1
            int r6 = r6 % r0
            r1 = 0
            if (r6 == 0) goto L48
            java.lang.StringBuffer r6 = r3.onNavigationEvent
            int r7 = r7 + r5
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.until(r5, r7)
            java.lang.CharSequence r2 = kotlin.text.StringsKt.subSequence(r4, r2)
            r6.insert(r5, r2)
            boolean r5 = r4 instanceof android.text.Editable
            if (r5 == 0) goto L6f
            goto L5a
        L48:
            java.lang.StringBuffer r6 = r3.onNavigationEvent
            int r7 = r7 + r5
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.until(r5, r7)
            java.lang.CharSequence r2 = kotlin.text.StringsKt.subSequence(r4, r2)
            r6.insert(r5, r2)
            boolean r5 = r4 instanceof android.text.Editable
            if (r5 == 0) goto L6f
        L5a:
            int r5 = o.CheckLivenessFromDepthImage.IAuthTabCallbackStubProxy
            int r5 = r5 + 31
            int r6 = r5 % 128
            o.CheckLivenessFromDepthImage.access100 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L69
            r1 = r4
            android.text.Editable r1 = (android.text.Editable) r1
            goto L6f
        L69:
            android.text.Editable r4 = (android.text.Editable) r4
            r1.hashCode()
            throw r1
        L6f:
            if (r1 == 0) goto L96
            int r5 = o.CheckLivenessFromDepthImage.access100
            int r5 = r5 + 55
            int r6 = r5 % 128
            o.CheckLivenessFromDepthImage.IAuthTabCallbackStubProxy = r6
            int r5 = r5 % r0
            r5 = 1
            r3.onExtraCallback = r5
            android.text.Editable r4 = (android.text.Editable) r4
            int r5 = r7 + (-1)
            r6 = 0
            kotlin.ranges.IntRange r5 = kotlin.ranges.RangesKt.until(r6, r5)
            r3.onWarmupCompleted(r4, r5)
            int r5 = r1.length()
            kotlin.ranges.IntRange r5 = kotlin.ranges.RangesKt.until(r7, r5)
            r3.onWarmupCompleted(r4, r5)
            r3.onExtraCallback = r6
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CheckLivenessFromDepthImage.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    private final void onWarmupCompleted(Editable editable, IntRange intRange) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            intRange.iterator();
            throw null;
        }
        IntIterator it = intRange.iterator();
        int i3 = access100 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = access100 + 13;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                if (editable.charAt(it.nextInt()) != '.') {
                    int first = intRange.getFirst();
                    int last = intRange.getLast() + 1;
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-114}, 126 - TextUtils.lastIndexOf("", '0'), objArr);
                    editable.replace(first, last, StringsKt.repeat(((String) objArr[0]).intern(), last - first));
                    return;
                }
            } else if (editable.charAt(it.nextInt()) != '0') {
                int first2 = intRange.getFirst();
                int last2 = intRange.getLast() + 1;
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-114}, 126 - TextUtils.lastIndexOf("", '0'), objArr2);
                editable.replace(first2, last2, StringsKt.repeat(((String) objArr2[0]).intern(), last2 - first2));
                return;
            }
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int i3 = $11 + 117;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr3[i5] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i5]);
            }
            cArr2 = cArr3;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onTransact);
        if (IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $11 + 89;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    int i8 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                    int i9 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    cArr4[i7] = (char) (cArr2[bArr[0] * i] % iY);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                }
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $10 + 97;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
            Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            int i12 = $11 + 39;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        }
        String str = new String(cArr6);
        int i14 = $11 + 47;
        $10 = i14 % 128;
        if (i14 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{32635, 32617, 32619, 32409, 32612, 32596, 32616, 32634, 32414, 32410, 32639, 32629, 32622, 32550};
        onTransact = -1184334058;
        asInterface = true;
        IAuthTabCallbackDefault = true;
    }
}
