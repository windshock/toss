package o;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeDialogManagerAndroidSpec {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("dialog")
    private final NativeAppearanceSpec dialog;

    @SerializedName("docCode")
    private final long docCode;

    @SerializedName("docId")
    private final long docId;

    @SerializedName("docName")
    private final String docName;

    @SerializedName("printable")
    private final boolean printable;
    private int rank;

    @SerializedName("status")
    private final onWarmupCompleted status;

    public NativeDialogManagerAndroidSpec() {
        this(0L, 0L, null, null, null, false, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof NativeDialogManagerAndroidSpec)) {
            int i7 = i2 + 1;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        NativeDialogManagerAndroidSpec nativeDialogManagerAndroidSpec = (NativeDialogManagerAndroidSpec) obj;
        if (this.docCode != nativeDialogManagerAndroidSpec.docCode) {
            int i9 = i2 + 125;
            onNavigationEvent = i9 % 128;
            return i9 % 2 == 0;
        }
        if (this.docId != nativeDialogManagerAndroidSpec.docId || !Intrinsics.areEqual(this.docName, nativeDialogManagerAndroidSpec.docName) || this.status != nativeDialogManagerAndroidSpec.status) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.dialog, nativeDialogManagerAndroidSpec.dialog))) {
            return this.printable == nativeDialogManagerAndroidSpec.printable;
        }
        int i10 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1 r3 r4 r5
      0x003b: PHI (r1v17 int) = (r1v4 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r3v6 int) = (r3v2 int), (r3v8 int) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r4v6 java.lang.String) = (r4v0 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r5v8 int) = (r5v0 int), (r5v9 int) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3 r5
      0x0030: PHI (r1v5 int) = (r1v4 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v3 int) = (r3v2 int), (r3v8 int) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r5v1 int) = (r5v0 int), (r5v9 int) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.NativeDialogManagerAndroidSpec.onNavigationEvent
            int r1 = r1 + 115
            int r2 = r1 % 128
            o.NativeDialogManagerAndroidSpec.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            long r3 = r8.docCode
            if (r1 == 0) goto L21
            int r1 = java.lang.Long.hashCode(r3)
            long r3 = r8.docId
            int r3 = java.lang.Long.hashCode(r3)
            java.lang.String r4 = r8.docName
            r5 = 1
            if (r4 != 0) goto L3b
            goto L30
        L21:
            int r1 = java.lang.Long.hashCode(r3)
            long r3 = r8.docId
            int r3 = java.lang.Long.hashCode(r3)
            java.lang.String r4 = r8.docName
            r5 = r2
            if (r4 != 0) goto L3b
        L30:
            int r4 = o.NativeDialogManagerAndroidSpec.onNavigationEvent
            int r4 = r4 + 105
            int r6 = r4 % 128
            o.NativeDialogManagerAndroidSpec.onExtraCallbackWithResult = r6
            int r4 = r4 % r0
            r4 = r2
            goto L3f
        L3b:
            int r4 = r4.hashCode()
        L3f:
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r6 = r8.status
            if (r6 != 0) goto L44
            goto L48
        L44:
            int r2 = r6.hashCode()
        L48:
            o.NativeAppearanceSpec r6 = r8.dialog
            if (r6 == 0) goto L59
            int r5 = o.NativeDialogManagerAndroidSpec.onNavigationEvent
            int r5 = r5 + 105
            int r7 = r5 % 128
            o.NativeDialogManagerAndroidSpec.onExtraCallbackWithResult = r7
            int r5 = r5 % r0
            int r5 = r6.hashCode()
        L59:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            boolean r2 = r8.printable
            int r2 = java.lang.Boolean.hashCode(r2)
            int r1 = r1 + r2
            int r2 = o.NativeDialogManagerAndroidSpec.onExtraCallbackWithResult
            int r2 = r2 + 103
            int r3 = r2 % 128
            o.NativeDialogManagerAndroidSpec.onNavigationEvent = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L7a
            return r1
        L7a:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeDialogManagerAndroidSpec.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletIssuedDoc(docCode=" + this.docCode + ", docId=" + this.docId + ", docName=" + this.docName + ", status=" + this.status + ", dialog=" + this.dialog + ", printable=" + this.printable + ")";
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NativeDialogManagerAndroidSpec(long j, long j2, @Nullable String str, @Nullable onWarmupCompleted onwarmupcompleted, @Nullable NativeAppearanceSpec nativeAppearanceSpec, boolean z) {
        this.docCode = j;
        this.docId = j2;
        this.docName = str;
        this.status = onwarmupcompleted;
        this.dialog = nativeAppearanceSpec;
        this.printable = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeDialogManagerAndroidSpec(long j, long j2, String str, onWarmupCompleted onwarmupcompleted, NativeAppearanceSpec nativeAppearanceSpec, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        String str2;
        onWarmupCompleted onwarmupcompleted2;
        boolean z2;
        long j4 = 0;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            j4 = j2;
        }
        NativeAppearanceSpec nativeAppearanceSpec2 = null;
        if ((i & 4) != 0) {
            int i7 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 8) != 0) {
            int i10 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                nativeAppearanceSpec2.hashCode();
                throw null;
            }
            onwarmupcompleted2 = null;
        } else {
            onwarmupcompleted2 = onwarmupcompleted;
        }
        if ((i & 16) != 0) {
            int i11 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        } else {
            nativeAppearanceSpec2 = nativeAppearanceSpec;
        }
        if ((i & 32) != 0) {
            int i13 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(j3, j4, str2, onwarmupcompleted2, nativeAppearanceSpec2, z2);
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.docCode;
        int i5 = i2 + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.docId;
        int i5 = i2 + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return j;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.docName;
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final onWarmupCompleted asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted onwarmupcompleted = this.status;
        int i5 = i2 + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }

    public final NativeAppearanceSpec onWarmupCompleted() {
        NativeAppearanceSpec nativeAppearanceSpec;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            nativeAppearanceSpec = this.dialog;
            int i4 = 75 / 0;
        } else {
            nativeAppearanceSpec = this.dialog;
        }
        int i5 = i2 + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return nativeAppearanceSpec;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.printable;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return z;
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.rank = i;
        int i6 = i3 + 23;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted FAIL;
        private static boolean IAuthTabCallback = false;
        public static final onWarmupCompleted IN_PROCESS;
        public static final onWarmupCompleted RESERVED;
        public static final onWarmupCompleted SUCCESS;
        private static int asBinder = 1;
        private static int asInterface = 1;
        private static int onExtraCallback;
        private static boolean onExtraCallbackWithResult;
        private static char[] onNavigationEvent;
        private static int onTransact;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return new onWarmupCompleted[]{SUCCESS, FAIL, IN_PROCESS, RESERVED};
            }
            onWarmupCompleted onwarmupcompleted = SUCCESS;
            onWarmupCompleted onwarmupcompleted2 = FAIL;
            onWarmupCompleted onwarmupcompleted3 = IN_PROCESS;
            onWarmupCompleted onwarmupcompleted4 = RESERVED;
            onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[2];
            onwarmupcompletedArr[0] = onwarmupcompleted;
            onwarmupcompletedArr[0] = onwarmupcompleted2;
            onwarmupcompletedArr[3] = onwarmupcompleted3;
            onwarmupcompletedArr[2] = onwarmupcompleted4;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 86 / 0;
            }
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onWarmupCompleted + 115;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i3 = 25 / 0;
            } else {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            }
            int i4 = asBinder + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onExtraCallbackWithResult();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127, -127, -124, -125, -125, -126, -127}, 127 - Drawable.resolveOpacity(0, 0), objArr);
            SUCCESS = new onWarmupCompleted(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-120, -121, -122, -123}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, objArr2);
            FAIL = new onWarmupCompleted(((String) objArr2[0]).intern(), 1);
            IN_PROCESS = new onWarmupCompleted("IN_PROCESS", 2);
            RESERVED = new onWarmupCompleted("RESERVED", 3);
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = asInterface + 85;
            onTransact = i % 128;
            int i2 = i % 2;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onNavigationEvent;
            long j = 0;
            if (cArr2 != null) {
                int i4 = $10 + 83;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 76, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        int i7 = $11 + 91;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        j = 0;
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 75, 16037 - TextUtils.indexOf("", "", 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onExtraCallbackWithResult) {
                int i9 = $11 + 107;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $11 + 47;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i13 = $10 + 63;
            $11 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i16 = $11 + 47;
                $10 = i16 % 128;
                if (i16 % i14 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] + iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 64 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 12214 - Drawable.resolveOpacity(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    i2 = 2;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        i2 = 2;
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 63 - Drawable.resolveOpacity(0, 0), View.combineMeasuredStates(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    } else {
                        i2 = 2;
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                i14 = i2;
            }
            objArr[0] = new String(cArr6);
        }

        static void onExtraCallbackWithResult() {
            onNavigationEvent = new char[]{32579, 32577, 32595, 32593, 32592, 32605, 32597, 32586};
            onExtraCallback = -1184334050;
            IAuthTabCallback = true;
            onExtraCallbackWithResult = true;
        }
    }
}
