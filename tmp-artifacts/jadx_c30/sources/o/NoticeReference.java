package o;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
final class NoticeReference {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NoticeReference[] $VALUES;
    public static final onExtraCallback Companion;
    private static char IAuthTabCallback = 0;
    public static final NoticeReference JPEG;
    public static final NoticeReference JPG;
    public static final NoticeReference PNG;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;
    private final Bitmap.CompressFormat format;
    private final String type;

    private static final /* synthetic */ NoticeReference[] $values() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NoticeReference noticeReference = JPG;
        if (i3 == 0) {
            return new NoticeReference[]{noticeReference, JPEG, PNG};
        }
        NoticeReference noticeReference2 = JPEG;
        NoticeReference noticeReference3 = PNG;
        NoticeReference[] noticeReferenceArr = new NoticeReference[4];
        noticeReferenceArr[0] = noticeReference;
        noticeReferenceArr[1] = noticeReference2;
        noticeReferenceArr[5] = noticeReference3;
        return noticeReferenceArr;
    }

    public static EnumEntries<NoticeReference> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        EnumEntries<NoticeReference> enumEntries = $ENTRIES;
        int i5 = i3 + 57;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static NoticeReference valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        NoticeReference noticeReference = (NoticeReference) Enum.valueOf(NoticeReference.class, str);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = onExtraCallback + 73;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return noticeReference;
    }

    public static NoticeReference[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NoticeReference[] noticeReferenceArr = $VALUES;
        if (i3 == 0) {
            return (NoticeReference[]) noticeReferenceArr.clone();
        }
        int i4 = 9 / 0;
        return (NoticeReference[]) noticeReferenceArr.clone();
    }

    private NoticeReference(String str, int i, String str2, Bitmap.CompressFormat compressFormat) {
        this.type = str2;
        this.format = compressFormat;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Bitmap.CompressFormat getFormat() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Bitmap.CompressFormat compressFormat = this.format;
        int i5 = i3 + 9;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return compressFormat;
    }

    static {
        onNavigationEvent();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        Object[] objArr = new Object[1];
        a(new char[]{48428, 25290, 41642, 17177}, 3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{17926, 25481, 14915, 40419}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, objArr2);
        JPG = new NoticeReference(strIntern, 0, ((String) objArr2[0]).intern(), compressFormat);
        Object[] objArr3 = new Object[1];
        a(new char[]{48428, 25290, 43102, 39765}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{17926, 25481, 42319, 38698}, '4' - AndroidCharacter.getMirror('0'), objArr4);
        JPEG = new NoticeReference(strIntern2, 1, ((String) objArr4[0]).intern(), compressFormat);
        Object[] objArr5 = new Object[1];
        a(new char[]{39512, 29204, 41642, 17177}, View.MeasureSpec.makeMeasureSpec(0, 0) + 3, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{65021, 497, 14915, 40419}, View.getDefaultSize(0, 0) + 3, objArr6);
        PNG = new NoticeReference(strIntern3, 2, ((String) objArr6[0]).intern(), Bitmap.CompressFormat.PNG);
        NoticeReference[] noticeReferenceArr$values = $values();
        $VALUES = noticeReferenceArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(noticeReferenceArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = onTransact + 73;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static final byte[] $$a = {80, -19, -87, -22};
        private static final int $$b = 159;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 478308911;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, short s3) {
            int i;
            int i2;
            int i3 = 105 - (s3 * 3);
            int i4 = (s * 3) + 4;
            int i5 = (s2 * 2) + 1;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                i3 = i4;
                int i6 = i5;
                i2 = 0;
                i4++;
                i3 += -i6;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i4];
                i4++;
                i3 += -i6;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                }
            }
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Bitmap.CompressFormat onWarmupCompleted(@NotNull String str) throws Throwable {
            Object next;
            Bitmap.CompressFormat format;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            Iterator it = NoticeReference.getEntries().iterator();
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i4 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                next = it.next();
                if (StringsKt.equals(((NoticeReference) next).getType(), str, true)) {
                    int i6 = onExtraCallbackWithResult + 1;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    break;
                }
            }
            NoticeReference noticeReference = (NoticeReference) next;
            if (noticeReference != null && (format = noticeReference.getFormat()) != null) {
                return format;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(35 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 8 - Process.getGidForName(BuildConfig.FLAVOR), new char[]{2, 14, '\n', 65473, '\b', 15, 16, 19, 65528, 65473, 65499, 15, 16, '\n', 20, 15, 6, 21, 25, 6, 65473, 65487, 15, 16, '\n', 20, 15, 6, 21, 25, 6, 65473, 6, '\b'}, true, 101 - ExpandableListView.getPackedPositionGroup(0L), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.MeasureSpec.makeMeasureSpec(0, 0)), 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 10278 - (ViewConfiguration.getScrollBarSize() >> 8), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 12843), 55 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2166, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        int i7 = $11 + 25;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            if (i2 > 0) {
                int i9 = $11 + 3;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i11 = $11 + 7;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getSize(0)), 55 - View.combineMeasuredStates(0, 0), 2167 - (ViewConfiguration.getScrollBarSize() >> 8), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = 2083011369;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 107;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 61;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $10 + 29;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int threadPriority = 12434 - ((Process.getThreadPriority(i3) + 20) >> 6);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, keyRepeatTimeout, threadPriority, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), Color.alpha(0) + 10, 12434 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16014), 14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 19901 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = (char) 54289;
        IAuthTabCallback = (char) 23899;
        onNavigationEvent = (char) 26154;
        onWarmupCompleted = (char) 63346;
    }
}
