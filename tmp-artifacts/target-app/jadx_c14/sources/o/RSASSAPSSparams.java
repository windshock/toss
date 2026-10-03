package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.DetectOcclusion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RSASSAPSSparams implements Serializable {
    private final String certPath;
    private final String certType;
    private final String expireDate;
    private final int hashId;
    private final String issuerName;
    private final String keyPath;
    private final String name;
    private final String oid;
    private static final byte[] $$a = {11, -55, -20, -91};
    private static final int $$b = 216;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onExtraCallback = {27247, 27167, 27172, 27170, 27162, 27162, 27173, 27197, 27168, 27177, 27177, 27176, 27180, 27172, 27170, 27144, 27142, 27178, 27172, 27171, 27158, 27160, 27166, 27256, 27175, 27167, 27258, 27240, 27145, 27177, 27224, 27240, 27151, 27178, 27173, 27197, 27178, 27176, 27194, 27172, 27167, 27224, 27240, 27147, 27174, 27169, 27178, 27158, 27172, 27168, 27164, 27336, 27486, 27456, 27321, 27323, 27459, 27457, 27322, 27289, 27271, 27307, 27487, 27481, 27216, 27166, 27176, 27170, 27145, 27240, 27193};
    private static int IAuthTabCallback = 478309007;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 * 4
            int r6 = r6 + 105
            byte[] r1 = o.RSASSAPSSparams.$$a
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RSASSAPSSparams.$$c(byte, int, int):java.lang.String");
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~i;
        int i10 = (~(i7 | i8 | i9)) | (~(i5 | i));
        int i11 = ~(i7 | i9);
        int i12 = i5 | i11;
        int i13 = (~(i | i3)) | i11 | (~(i8 | i3));
        int i14 = i3 + i5 + i2 + (296844165 * i4) + (1729652556 * i6);
        int i15 = i14 * i14;
        int i16 = ((i3 * 599922083) - 580124672) + (599922083 * i5) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i2) + ((-279707648) * i4) + ((-265289728) * i6) + (2117271552 * i15);
        int i17 = (i3 * (-1181628991)) + 1322814002 + (i5 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i2 * (-1181629109)) + (i4 * (-698251017)) + (i6 * 1773125444) + (i15 * 938541056);
        return i16 + ((i17 * i17) * (-109772800)) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof RSASSAPSSparams)) {
            return false;
        }
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) obj;
        if (this.hashId != rSASSAPSSparams.hashId) {
            int i3 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 68 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.name, rSASSAPSSparams.name) || !Intrinsics.areEqual(this.certType, rSASSAPSSparams.certType) || !Intrinsics.areEqual(this.issuerName, rSASSAPSSparams.issuerName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.certPath, rSASSAPSSparams.certPath)) {
            return Intrinsics.areEqual(this.keyPath, rSASSAPSSparams.keyPath) && Intrinsics.areEqual(this.expireDate, rSASSAPSSparams.expireDate) && Intrinsics.areEqual(this.oid, rSASSAPSSparams.oid);
        }
        int i5 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((Integer.hashCode(this.hashId) * 31) + this.name.hashCode()) * 31) + this.certType.hashCode()) * 31) + this.issuerName.hashCode()) * 31) + this.certPath.hashCode()) * 31) + this.keyPath.hashCode()) * 31) + this.expireDate.hashCode()) * 31) + this.oid.hashCode();
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.hashId;
        String str = this.name;
        String str2 = this.certType;
        String str3 = this.issuerName;
        String str4 = this.certPath;
        String str5 = this.keyPath;
        String str6 = this.expireDate;
        String str7 = this.oid;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 23, 0, 0}, false, new byte[]{0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(new int[]{23, 7, 0, 3}, false, new byte[]{1, 0, 0, 1, 0, 0, 1}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a(new int[]{30, 11, 0, 0}, false, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str2);
        Object[] objArr4 = new Object[1];
        b(5 - (ViewConfiguration.getLongPressTimeout() >> 16), 12 - MotionEvent.axisFromString(""), new char[]{24, 24, 14, 65477, 65489, 65506, '\n', 18, 6, 65523, 23, '\n', 26}, 257 - ExpandableListView.getPackedPositionType(0L), true, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str3);
        Object[] objArr5 = new Object[1];
        b(7 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 11, new char[]{29, 65529, '\n', 29, 17, 65510, 65493, 65481, '\f', 14, 27}, 253 - (Process.myTid() >> 22), false, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(str4);
        Object[] objArr6 = new Object[1];
        a(new int[]{41, 10, 0, 0}, false, new byte[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 1}, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(str5);
        Object[] objArr7 = new Object[1];
        a(new int[]{51, 13, 163, 8}, false, new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0}, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(str6);
        Object[] objArr8 = new Object[1];
        a(new int[]{64, 6, 0, 6}, true, new byte[]{1, 1, 1, 0, 1, 0}, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(str7);
        Object[] objArr9 = new Object[1];
        a(new int[]{70, 1, 197, 0}, true, new byte[]{0}, objArr9);
        sb.append(((String) objArr9[0]).intern());
        String string = sb.toString();
        int i3 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public RSASSAPSSparams(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.hashId = i;
        this.name = str;
        this.certType = str2;
        this.issuerName = str3;
        this.certPath = str4;
        this.keyPath = str5;
        this.expireDate = str6;
        this.oid = str7;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.hashId;
        if (i3 == 0) {
            int i5 = 43 / 0;
        }
        return i4;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.certType;
        int i4 = i3 + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.issuerName;
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.certPath;
        int i5 = i3 + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.keyPath;
        int i4 = i3 + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = rSASSAPSSparams.expireDate;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = rSASSAPSSparams.oid;
        int i5 = i2 + 119;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Date onExtraCallback(RSASSAPSSparams rSASSAPSSparams, Context context, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            Object[] objArr = {followRedirects.onExtraCallbackWithResult};
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            context = (Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
        Date dateOnExtraCallbackWithResult = rSASSAPSSparams.onExtraCallbackWithResult(context);
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return dateOnExtraCallbackWithResult;
    }

    public final Date onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Calendar calendar = Calendar.getInstance();
            Date date = DetectOcclusion.onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent(context).parse(this.expireDate);
            Intrinsics.checkNotNull(date);
            calendar.setTime(date);
            calendar.add(5, 1);
            calendar.add(13, -1);
            Date time = calendar.getTime();
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
            return time;
        } catch (Exception unused) {
            return null;
        }
    }

    public final onNavigationEvent onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            Date dateOnExtraCallback = onExtraCallback(this, null, 1, null);
            Intrinsics.checkNotNull(dateOnExtraCallback);
            Date dateAsBinder = zzaj.onWarmupCompleted().asBinder();
            if (!dateOnExtraCallback.before(dateAsBinder)) {
                if (dateOnExtraCallback.before(zzan.onExtraCallbackWithResult(dateAsBinder, 30))) {
                    return onNavigationEvent.SOON_EXPIRED;
                }
                return onNavigationEvent.NOT_EXPIRED;
            }
            onNavigationEvent onnavigationevent = onNavigationEvent.EXPIRED;
            int i4 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        } catch (Exception unused) {
            return onNavigationEvent.NOT_EXPIRED;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent EXPIRED;
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent NOT_EXPIRED;
        public static final onNavigationEvent SOON_EXPIRED;
        private static long onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 107;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                onnavigationeventArr = new onNavigationEvent[]{NOT_EXPIRED, SOON_EXPIRED};
                onnavigationeventArr[2] = EXPIRED;
            } else {
                onnavigationeventArr = new onNavigationEvent[]{NOT_EXPIRED, SOON_EXPIRED, EXPIRED};
            }
            int i4 = i2 + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 == 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, 16796843 + Color.rgb(0, 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 59 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 6383 - Color.argb(0, 0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i4 = $10 + 105;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $11 + 53;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.getDefaultSize(0, 0) + 59, 6382 - Process.getGidForName(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            a(new char[]{34482, 36206, 37138, 42292, 43469, 48629, 49538, 54718, 55366, 60540, 61466}, TextUtils.lastIndexOf("", '0', 0) + 3038, objArr);
            NOT_EXPIRED = new onNavigationEvent(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(new char[]{34479, 36952, 43877, 49779, 56591, 62510, 3878, 9921, 12781, 18669, 25495, 31393}, 5867 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            SOON_EXPIRED = new onNavigationEvent(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            a(new char[]{34489, 19911, 4202, 58524, 43810, 32342, 17130}, Drawable.resolveOpacity(0, 0) + 52067, objArr3);
            EXPIRED = new onNavigationEvent(((String) objArr3[0]).intern(), 2);
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onWarmupCompleted + 99;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 95 / 0;
            }
        }

        static void IAuthTabCallback() {
            onExtraCallback = -1268791829623143477L;
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = getTrailerField.Companion.onExtraCallback(this.certPath);
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r21, int r22, char[] r23, int r24, boolean r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RSASSAPSSparams.b(int, int, char[], int, boolean, java.lang.Object[]):void");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int i6 = $10 + 19;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 33;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16741933) - Color.rgb(0, 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35, TextUtils.lastIndexOf("", '0', 0, 0) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Color.blue(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35, (KeyEvent.getMaxKeyCode() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.blue(0)), 65 - (KeyEvent.getMaxKeyCode() >> 16), 16718 - ExpandableListView.getPackedPositionGroup(0L), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 29, View.MeasureSpec.makeMeasureSpec(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 70 - View.getDefaultSize(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            int i12 = $10 + 45;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i14 = $10 + 95;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i16 = $11 + 97;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        String str = new String(cArr3);
        int i18 = $11 + 69;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        objArr[0] = str;
    }

    public final String onNavigationEvent() {
        return (String) onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1054676118, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1054676117, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final String asInterface() {
        return (String) onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1650898923, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1650898923, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }
}
