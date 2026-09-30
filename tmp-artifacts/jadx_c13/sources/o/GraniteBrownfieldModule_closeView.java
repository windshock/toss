package o;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.security.auth.Destroyable;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GraniteBrownfieldModule_closeView implements CharSequence, Destroyable {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private boolean IAuthTabCallback;
    private final char[] onExtraCallbackWithResult;
    private static final boolean onNavigationEvent = false;
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onExtraCallbackWithResult("SecureString");
    private static final GraniteBrownfieldModule_closeView onExtraCallback = new GraniteBrownfieldModule_closeView(_UrlKt.FRAGMENT_ENCODE_SET);

    public static final /* synthetic */ char[] onExtraCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 51;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = graniteBrownfieldModule_closeView.onExtraCallbackWithResult;
        int i5 = i2 + 39;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return cArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ GraniteBrownfieldModule_closeView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 25;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char cOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
        int i4 = asBinder + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cOnExtraCallbackWithResult;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent();
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return iOnNavigationEvent;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final GraniteBrownfieldModule_closeView onNavigationEvent(@NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView2, "");
            char[] cArrOnExtraCallback = GraniteBrownfieldModule_closeView.onExtraCallback(graniteBrownfieldModule_closeView);
            char[] cArrOnExtraCallback2 = GraniteBrownfieldModule_closeView.onExtraCallback(graniteBrownfieldModule_closeView2);
            char[] cArrIAuthTabCallback = IAuthTabCallback(cArrOnExtraCallback, Arrays.copyOf(cArrOnExtraCallback2, cArrOnExtraCallback2.length));
            Intrinsics.checkNotNull(cArrIAuthTabCallback);
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView3 = new GraniteBrownfieldModule_closeView(cArrIAuthTabCallback);
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return graniteBrownfieldModule_closeView3;
        }

        public final GraniteBrownfieldModule_closeView onExtraCallback(@NotNull CharSequence... charSequenceArr) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequenceArr, "");
            int length = charSequenceArr.length;
            char[] cArr = new char[0];
            int i2 = 0;
            while (i2 < length) {
                CharSequence charSequence = charSequenceArr[i2];
                int length2 = charSequence.length();
                char[] cArr2 = new char[length2];
                int i3 = 0;
                while (i3 < length2) {
                    cArr2[i3] = charSequence.charAt(i3);
                    i3++;
                    int i4 = onExtraCallbackWithResult + 3;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
                char[] cArrIAuthTabCallback = GraniteBrownfieldModule_closeView.Companion.IAuthTabCallback(cArr, Arrays.copyOf(cArr2, length2));
                if (cArrIAuthTabCallback == null) {
                    cArrIAuthTabCallback = new char[0];
                }
                char[] cArr3 = cArrIAuthTabCallback;
                ArraysKt___ArraysJvmKt.fill$default(cArr2, (char) 0, 0, 0, 6, (Object) null);
                if (!(!(cArr.length != 0))) {
                    int i6 = onExtraCallbackWithResult + 59;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    ArraysKt___ArraysJvmKt.fill$default(cArr, (char) 0, 0, 0, 6, (Object) null);
                }
                i2++;
                cArr = cArr3;
            }
            for (CharSequence charSequence2 : charSequenceArr) {
                int i8 = IAuthTabCallback;
                int i9 = i8 + 1;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                if (charSequence2 instanceof GraniteBrownfieldModule_closeView) {
                    int i11 = i8 + 97;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        ((GraniteBrownfieldModule_closeView) charSequence2).destroy();
                        throw null;
                    }
                    ((GraniteBrownfieldModule_closeView) charSequence2).destroy();
                }
            }
            return new GraniteBrownfieldModule_closeView(cArr);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            r0 = new char[r5.length + r6.length];
            java.lang.System.arraycopy(r5, 0, r0, 0, r5.length);
            java.lang.System.arraycopy(r6, 0, r0, r5.length, r6.length);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r5 = r2 + 81;
            o.GraniteBrownfieldModule_closeView.onNavigationEvent.IAuthTabCallback = r5 % 128;
            r5 = r5 % 2;
            r2 = r2 + 49;
            o.GraniteBrownfieldModule_closeView.onNavigationEvent.IAuthTabCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final char[] IAuthTabCallback(char[] cArr, char... cArr2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                int i4 = 51 / 0;
            }
        }

        public final GraniteBrownfieldModule_closeView IAuthTabCallback() {
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeViewOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                graniteBrownfieldModule_closeViewOnExtraCallbackWithResult = GraniteBrownfieldModule_closeView.onExtraCallbackWithResult();
                int i3 = 0 / 0;
            } else {
                graniteBrownfieldModule_closeViewOnExtraCallbackWithResult = GraniteBrownfieldModule_closeView.onExtraCallbackWithResult();
            }
            int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return graniteBrownfieldModule_closeViewOnExtraCallbackWithResult;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = asInterface + 87;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.IAuthTabCallback) {
            int length = this.onExtraCallbackWithResult.length;
            int i4 = i3 + 27;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return length;
        }
        int i6 = i3 + 71;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2 == 0 ? 1 : 0;
        int i8 = i3 + 7;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public char onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 21;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = this.onExtraCallbackWithResult;
        if (i4 != 0) {
            return cArr[i];
        }
        char c = cArr[i];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GraniteBrownfieldModule_closeView(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        CharBuffer charBufferDecode = Charset.forName("UTF-8").decode(ByteBuffer.wrap(bArr));
        char[] cArrCopyOfRange = Arrays.copyOfRange(charBufferDecode.array(), charBufferDecode.position(), charBufferDecode.limit());
        int length = cArrCopyOfRange.length;
        char[] cArr = new char[length];
        this.onExtraCallbackWithResult = cArr;
        System.arraycopy(cArrCopyOfRange, 0, cArr, 0, length);
        toString();
    }

    public GraniteBrownfieldModule_closeView(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        char[] cArr2 = new char[cArr.length];
        this.onExtraCallbackWithResult = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GraniteBrownfieldModule_closeView(char[] cArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = asBinder;
            int i3 = i2 + 57;
            IAuthTabCallbackDefault = i3 % 128;
            char[] cArr2 = i3 % 2 == 0 ? new char[1] : new char[0];
            int i4 = i2 + 71;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            cArr = cArr2;
        }
        this(cArr);
    }

    public GraniteBrownfieldModule_closeView(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onExtraCallbackWithResult = new char[charSequence.length()];
        int i = 2 % 2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            int i4 = asBinder + 53;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                this.onExtraCallbackWithResult[i3] = charSequence.charAt(i2);
                i2 += 15;
                i3 += 52;
            } else {
                this.onExtraCallbackWithResult[i3] = charSequence.charAt(i2);
                i2++;
                i3++;
            }
            int i5 = asBinder + 77;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        toString();
    }

    public GraniteBrownfieldModule_closeView(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        int i3 = i2 - i;
        char[] cArr2 = new char[i3];
        this.onExtraCallbackWithResult = cArr2;
        System.arraycopy(cArr, i, cArr2, 0, i3);
        toString();
    }

    public final byte[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(CharBuffer.wrap(this.onExtraCallbackWithResult));
        byte[] bArrCopyOfRange = Arrays.copyOfRange(byteBufferEncode.array(), byteBufferEncode.position(), byteBufferEncode.limit());
        Arrays.fill(byteBufferEncode.array(), (byte) 0);
        Intrinsics.checkNotNull(bArrCopyOfRange);
        int i4 = asBinder + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return bArrCopyOfRange;
    }

    public final char[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] cArr = this.onExtraCallbackWithResult;
        int i4 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cArr;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        int i3 = 2 % 2;
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = new GraniteBrownfieldModule_closeView(this.onExtraCallbackWithResult, i, i2);
        int i4 = IAuthTabCallbackDefault + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return graniteBrownfieldModule_closeView;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        synchronized (this) {
            toString();
            Arrays.fill(this.onExtraCallbackWithResult, (char) 0);
            this.IAuthTabCallback = true;
        }
    }

    public final void finalize() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        destroy();
        int i4 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int i = 2 % 2;
        String str = new String(this.onExtraCallbackWithResult);
        int i2 = asBinder + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback(@NotNull char[] cArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cArr, "");
        boolean zEquals = Arrays.equals(cArr, this.onExtraCallbackWithResult);
        int i4 = asBinder + 111;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraniteBrownfieldModule_closeView) {
            return ((GraniteBrownfieldModule_closeView) obj).onExtraCallback(this.onExtraCallbackWithResult);
        }
        int i5 = i3 + 47;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Arrays.hashCode(this.onExtraCallbackWithResult);
        int i4 = asBinder + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }
}
