package o;

import java.util.Arrays;
import javax.security.auth.Destroyable;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class serialiseFieldsbugsnag_android_core_release implements CharSequence, Destroyable {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private final char[] onExtraCallbackWithResult;
    private boolean onWarmupCompleted;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final serialiseFieldsbugsnag_android_core_release onNavigationEvent = new serialiseFieldsbugsnag_android_core_release(_UrlKt.FRAGMENT_ENCODE_SET);

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        char cOnWarmupCompleted = onWarmupCompleted(i);
        int i5 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return cOnWarmupCompleted;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            throw null;
        }
        int iOnExtraCallback = onExtraCallback();
        int i3 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallback;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final serialiseFieldsbugsnag_android_core_release onExtraCallbackWithResult(@NotNull CharSequence... charSequenceArr) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequenceArr, "");
            int i2 = 0;
            int length = charSequenceArr.length;
            char[] cArr = new char[0];
            int i3 = 0;
            while (i3 < length) {
                CharSequence charSequence = charSequenceArr[i3];
                int length2 = charSequence.length();
                char[] cArr2 = new char[length2];
                for (int i4 = 0; i4 < length2; i4++) {
                    int i5 = onNavigationEvent + 55;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    cArr2[i4] = charSequence.charAt(i4);
                }
                char[] cArrOnWarmupCompleted = serialiseFieldsbugsnag_android_core_release.Companion.onWarmupCompleted(cArr, Arrays.copyOf(cArr2, length2));
                if (cArrOnWarmupCompleted == null) {
                    cArrOnWarmupCompleted = new char[0];
                }
                char[] cArr3 = cArrOnWarmupCompleted;
                ArraysKt___ArraysJvmKt.fill$default(cArr2, (char) 0, 0, 0, 6, (Object) null);
                if (cArr.length != 0) {
                    ArraysKt___ArraysJvmKt.fill$default(cArr, (char) 0, 0, 0, 6, (Object) null);
                }
                i3++;
                cArr = cArr3;
            }
            int length3 = charSequenceArr.length;
            while (i2 < length3) {
                CharSequence charSequence2 = charSequenceArr[i2];
                if (charSequence2 instanceof serialiseFieldsbugsnag_android_core_release) {
                    int i7 = onNavigationEvent + 69;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    ((serialiseFieldsbugsnag_android_core_release) charSequence2).destroy();
                }
                i2++;
                int i9 = IAuthTabCallback + 63;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            return new serialiseFieldsbugsnag_android_core_release(cArr);
        }

        private final char[] onWarmupCompleted(char[] cArr, char... cArr2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (cArr == null) {
                return null;
            }
            char[] cArr3 = new char[cArr.length + cArr2.length];
            System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
            System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
            int i3 = IAuthTabCallback + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return cArr3;
        }
    }

    static {
        int i = onExtraCallback + 59;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return r6.onExtraCallbackWithResult.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r6.onWarmupCompleted != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!r6.onWarmupCompleted) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = r1 + 51;
        o.serialiseFieldsbugsnag_android_core_release.IAuthTabCallbackStub = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 85;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
    }

    public char onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 61;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        char c = this.onExtraCallbackWithResult[i];
        int i6 = i3 + 83;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 80 / 0;
        }
        return c;
    }

    public serialiseFieldsbugsnag_android_core_release(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        char[] cArr2 = new char[cArr.length];
        this.onExtraCallbackWithResult = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public serialiseFieldsbugsnag_android_core_release(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onExtraCallbackWithResult = new char[charSequence.length()];
        int i = 2 % 2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            int i4 = IAuthTabCallbackDefault + 99;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallbackWithResult[i3] = charSequence.charAt(i2);
            i2++;
            i3++;
        }
        int i6 = IAuthTabCallbackDefault + 71;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 60 / 0;
        }
    }

    public serialiseFieldsbugsnag_android_core_release(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        int i3 = i2 - i;
        char[] cArr2 = new char[i3];
        this.onExtraCallbackWithResult = cArr2;
        System.arraycopy(cArr, i, cArr2, 0, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        int i3 = 2 % 2;
        serialiseFieldsbugsnag_android_core_release serialisefieldsbugsnag_android_core_release = new serialiseFieldsbugsnag_android_core_release(this.onExtraCallbackWithResult, i, i2);
        int i4 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return serialisefieldsbugsnag_android_core_release;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return z;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        synchronized (this) {
            Arrays.fill(this.onExtraCallbackWithResult, (char) 0);
            this.onWarmupCompleted = true;
        }
    }

    public final void finalize() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        destroy();
        int i4 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int i = 2 % 2;
        String str = new String(this.onExtraCallbackWithResult);
        int i2 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult(@NotNull char[] cArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cArr, "");
            return Arrays.equals(cArr, this.onExtraCallbackWithResult);
        }
        Intrinsics.checkNotNullParameter(cArr, "");
        Arrays.equals(cArr, this.onExtraCallbackWithResult);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof o.serialiseFieldsbugsnag_android_core_release) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r3 = r3 + 63;
        o.serialiseFieldsbugsnag_android_core_release.IAuthTabCallbackStub = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return ((o.serialiseFieldsbugsnag_android_core_release) r6).onExtraCallbackWithResult(r5.onExtraCallbackWithResult);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 33;
        o.serialiseFieldsbugsnag_android_core_release.IAuthTabCallbackDefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 111;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        if (i3 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            return Arrays.hashCode(cArr);
        }
        Arrays.hashCode(cArr);
        throw null;
    }
}
