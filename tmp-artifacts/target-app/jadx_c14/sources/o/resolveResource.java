package o;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IdGeneratorExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class resolveResource implements TypeUtils2 {
    public static final Parcelable.Creator<resolveResource> CREATOR;
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int asInterface;
    private static long onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    public static final int onWarmupCompleted;
    private final TypeUtils3 IAuthTabCallback;
    private final isJSONTypeIgnore onExtraCallback;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 185;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int onTransact = 1;

    public static final class onWarmupCompleted implements Parcelable.Creator<resolveResource> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final resolveResource[] newArray(int i) {
            return new resolveResource[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final resolveResource createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new resolveResource(parcel.readParcelable(resolveResource.class.getClassLoader()), parcel.readParcelable(resolveResource.class.getClassLoader()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            byte[] r0 = o.resolveResource.$$a
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = 110 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveResource.$$c(int, int, short):java.lang.String");
    }

    static {
        IAuthTabCallbackStub = 0;
        IAuthTabCallbackStub();
        Object[] objArr = new Object[1];
        a((char) (52367 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-732526442) - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{45038, 29064, 43524, 60123, 19126, 16106, 56943, 1686, 41757, 47776, 34770, 14087, 5428, 62019, 28146, 9085, 53528, 23322, 2665}, new char[]{0, 0, 0, 0}, new char[]{38651, 22152, 36564, 8140}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new IAuthTabCallback(null);
        onWarmupCompleted = 8;
        CREATOR = new onWarmupCompleted();
        int i = onTransact + 29;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final int describeContents() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 123;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resolveResource)) {
            return false;
        }
        resolveResource resolveresource = (resolveResource) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, resolveresource.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, resolveresource.IAuthTabCallback)) {
            int i4 = IAuthTabCallback_Parcel + 55;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = asBinder + 91;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode();
        int i4 = asBinder + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        isJSONTypeIgnore isjsontypeignore = this.onExtraCallback;
        TypeUtils3 typeUtils3 = this.IAuthTabCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (Process.getGidForName("") + 27724), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{58805, 58041, 15735, 1071, 44141, 1, 24359, 21212, 16865, 34015, 19883, 4647, 51519, 20564, 32792, 12064, 51738, 43155, 24878, 48825, 36266, 25343, 4602, 10161, 50985, 16137, 13946, 64002}, new char[]{0, 0, 0, 0}, new char[]{7218, 46575, 19361, 60268}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(isjsontypeignore);
        Object[] objArr2 = new Object[1];
        a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (-1199685630) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{41590, 51597, 47626, 14758, 738, 55972, 20260, 48191, 34124, 45414, 64188}, new char[]{0, 0, 0, 0}, new char[]{956, 32320, 60088, 44276}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(typeUtils3);
        Object[] objArr3 = new Object[1];
        a((char) (KeyEvent.keyCodeFromString("") + 53773), (-1948454579) - ExpandableListView.getPackedPositionType(0L), new char[]{48556}, new char[]{0, 0, 0, 0}, new char[]{19848, 56561, 3467, 34002}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeParcelable(this.onExtraCallback, i);
            parcel.writeParcelable(this.IAuthTabCallback, i);
            int i5 = 60 / 0;
        } else {
            parcel.writeParcelable(this.onExtraCallback, i);
            parcel.writeParcelable(this.IAuthTabCallback, i);
        }
        int i6 = asBinder + 111;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public resolveResource(@NotNull isJSONTypeIgnore isjsontypeignore, @NotNull TypeUtils3 typeUtils3) {
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        Intrinsics.checkNotNullParameter(typeUtils3, "");
        this.onExtraCallback = isjsontypeignore;
        this.IAuthTabCallback = typeUtils3;
    }

    public TypeUtils3 asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        TypeUtils3 typeUtils3 = this.IAuthTabCallback;
        int i5 = i3 + 51;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return typeUtils3;
    }

    public isNumber IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        isNumber isnumberIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return isnumberIAuthTabCallback;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return strOnNavigationEvent;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = this.onExtraCallback.onExtraCallback();
        int i4 = asBinder + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return strOnExtraCallback;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        isJSONTypeIgnore isjsontypeignore = this.onExtraCallback;
        if (i3 == 0) {
            return isjsontypeignore.IAuthTabCallbackDefault();
        }
        isjsontypeignore.IAuthTabCallbackDefault();
        throw null;
    }

    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.onExtraCallbackWithResult();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        int i3 = asBinder + 79;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = this.onExtraCallback.asBinder();
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return zAsBinder;
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted();
        int i4 = IAuthTabCallback_Parcel + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public isMalformed2 onExtraCallback(@NotNull Function1<? super String, String> function1) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        IdGeneratorExternalSyntheticLambda1.onExtraCallback onextracallback = IdGeneratorExternalSyntheticLambda1.Companion;
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 52366), (-732526442) - TextUtils.indexOf("", "", 0), new char[]{45038, 29064, 43524, 60123, 19126, 16106, 56943, 1686, 41757, 47776, 34770, 14087, 5428, 62019, 28146, 9085, 53528, 23322, 2665}, new char[]{0, 0, 0, 0}, new char[]{38651, 22152, 36564, 8140}, objArr);
        String str = onextracallback.onNavigationEvent(((String) objArr[0]).intern(), locale).format(zzaj.onWarmupCompleted().asBinder());
        Intrinsics.checkNotNull(str);
        String str2 = (String) function1.invoke(str);
        isMalformed2 ismalformed2 = new isMalformed2(str2, supportWideGamut.onNavigationEvent(asInterface(), str2, this.onExtraCallback), str);
        int i2 = IAuthTabCallback_Parcel + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return ismalformed2;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 19;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iIndexOf = 42 - TextUtils.indexOf((CharSequence) "", '0');
                    int iGreen = 1451 - Color.green(i3);
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, iIndexOf, iGreen, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (-b3);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 49124), 44 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 23972), TextUtils.indexOf("", "", 0, 0) + 50, TextUtils.lastIndexOf("", '0') + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.blue(0) + 29, TextUtils.indexOf("", "", 0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (asInterface ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallbackStub() {
        onExtraCallbackWithResult = 7798559133331975163L;
        asInterface = -1776194565;
        IAuthTabCallbackDefault = (char) 20105;
    }
}
