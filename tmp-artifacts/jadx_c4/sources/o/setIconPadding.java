package o;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setIconPadding {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final List<String> IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[setIconImageResource.values().length];
            try {
                iArr[setIconImageResource.KR.ordinal()] = 1;
                int i = onNavigationEvent + 69;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setIconImageResource.AU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setIconImageResource.EU.ordinal()] = 3;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            int i5 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r5 != 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r5 = o.setIconPadding.onTransact + 109;
        o.setIconPadding.IAuthTabCallbackStub = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r4 = onExtraCallback(r4);
        r5 = o.setIconPadding.onTransact + 15;
        o.setIconPadding.IAuthTabCallbackStub = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return IAuthTabCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r5 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onExtraCallbackWithResult(@Nullable String str, @NotNull setIconImageResource seticonimageresource) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(seticonimageresource, "");
            i = onExtraCallback.onWarmupCompleted[seticonimageresource.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(seticonimageresource, "");
            i = onExtraCallback.onWarmupCompleted[seticonimageresource.ordinal()];
        }
    }

    static {
        onExtraCallback();
        IAuthTabCallback = CollectionsKt.listOf(new String[]{"010", "011", "016", "017", "018", "019"});
        int i = asInterface + 105;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String IAuthTabCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (str == null) {
            int i5 = i3 + 95;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (!(true ^ Character.isDigit(cCharAt))) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (StringsKt.startsWith$default(string, "82", false, 2, (Object) null)) {
            string = StringsKt.drop(string, 2);
        }
        Object[] objArr = new Object[1];
        a(new char[]{48444, 6261}, -ImageFormat.getBitsPerPixel(0), objArr);
        if (StringsKt.startsWith$default(string, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(new char[]{9274, 9108}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(string);
            string = sb2.toString();
        }
        int length2 = string.length();
        if (10 > length2 || length2 >= 12) {
            return null;
        }
        int i7 = onTransact + 125;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        if (IAuthTabCallback.contains(StringsKt.take(string, 3))) {
            return string;
        }
        int i9 = onTransact + 95;
        IAuthTabCallbackStub = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final String onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (str == null) {
            int i2 = IAuthTabCallbackStub + 111;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = IAuthTabCallbackStub + 17;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                Character.isDigit(str.charAt(i4));
                obj.hashCode();
                throw null;
            }
            char cCharAt = str.charAt(i4);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (StringsKt.startsWith$default(string, "61", false, 2, (Object) null)) {
            int i6 = onTransact + 81;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            string = StringsKt.drop(string, 2);
        }
        Object[] objArr = new Object[1];
        a(new char[]{9274, 9108}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        if (StringsKt.startsWith$default(string, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
            string = StringsKt.drop(string, 1);
        }
        if (string.length() != 9) {
            int i8 = IAuthTabCallbackStub + 53;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        if (!StringsKt.startsWith$default(string, "4", false, 2, (Object) null)) {
            int i10 = IAuthTabCallbackStub + 119;
            onTransact = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(new char[]{9274, 9108}, -TextUtils.lastIndexOf("", '0', 0), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(string);
        String string2 = sb2.toString();
        int i11 = IAuthTabCallbackStub + 71;
        onTransact = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 85 / 0;
        }
        return string2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r1 = o.setIconPadding.IAuthTabCallbackStub + 61;
        o.setIconPadding.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r13 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r13 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r12, "+61", false, 2, (java.lang.Object) null) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r13 = o.setIconPadding.IAuthTabCallbackStub + 41;
        o.setIconPadding.onTransact = r13 % 128;
        r13 = r13 % 2;
        r1 = new java.lang.Object[1];
        a(new char[]{9274, 9108}, android.text.TextUtils.getCapsMode("", 0, 0) + 1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        return kotlin.text.StringsKt.replace$default(r12, "+61", ((java.lang.String) r1[0]).intern(), false, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r12, "+821", false, 2, (java.lang.Object) null) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        r1 = new java.lang.Object[1];
        a(new char[]{9274, 9108}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        return kotlin.text.StringsKt.replace$default(r12, "+82", ((java.lang.String) r1[0]).intern(), false, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r12, "+82", false, 2, (java.lang.Object) null) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        return kotlin.text.StringsKt.replace$default(r12, "+82", "", false, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r13 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r13 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r13 == 2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String IAuthTabCallback(@NotNull String str, @NotNull setIconImageResource seticonimageresource) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(seticonimageresource, "");
            i = onExtraCallback.onWarmupCompleted[seticonimageresource.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(seticonimageresource, "");
            i = onExtraCallback.onWarmupCompleted[seticonimageresource.ordinal()];
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final boolean onExtraCallback(@Nullable String str, @NotNull setIconImageResource seticonimageresource) throws Throwable {
        int length;
        int length2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(seticonimageresource, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(seticonimageresource, "");
        if (str == null) {
            return false;
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, seticonimageresource);
        String str2 = strOnExtraCallbackWithResult != null ? strOnExtraCallbackWithResult : "";
        int i3 = onExtraCallback.onWarmupCompleted[seticonimageresource.ordinal()];
        if (i3 == 1) {
            if (!TextUtils.isDigitsOnly(str2) || !StringsKt.startsWith$default(str2, "01", false, 2, (Object) null) || 10 > (length = str2.length()) || length >= 12) {
                return false;
            }
            int i4 = IAuthTabCallbackStub + 53;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IAuthTabCallbackStub + 83;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        if (i3 == 2) {
            if (!TextUtils.isDigitsOnly(str2) || (!StringsKt.startsWith$default(str2, "04", false, 2, (Object) null)) || str2.length() != 10) {
                return false;
            }
            int i8 = onTransact + 105;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (TextUtils.isDigitsOnly(str2) && 9 <= (length2 = str2.length())) {
            int i10 = onTransact + 91;
            int i11 = i10 % 128;
            IAuthTabCallbackStub = i11;
            if (i10 % 2 != 0 ? length2 < 13 : length2 < 108) {
                int i12 = i11 + 125;
                int i13 = i12 % 128;
                onTransact = i13;
                int i14 = i12 % 2;
                int i15 = i13 + 119;
                IAuthTabCallbackStub = i15 % 128;
                int i16 = i15 % 2;
                return true;
            }
        }
        return false;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 75;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 121;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 13;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i3);
                        int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, touchSlop, iKeyCodeFromString, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 10 - TextUtils.getCapsMode("", 0, 0), 12435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, Process.getGidForName("") + 19902, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onExtraCallback = (char) 28736;
        onWarmupCompleted = (char) 21558;
        onNavigationEvent = (char) 1577;
        onExtraCallbackWithResult = (char) 28326;
    }
}
