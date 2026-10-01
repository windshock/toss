package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setMediationProvider implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<setMediationProvider> CREATOR;
    public static final onWarmupCompleted Companion;
    public static final String IAuthTabCallback;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100;
    private static char[] getInterfaceDescriptor;
    public static final int onExtraCallback = 0;
    private final long IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final String asBinder;
    private final int asInterface;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<setMediationProvider> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setMediationProvider createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback(parcel);
                throw null;
            }
            setMediationProvider setmediationproviderOnExtraCallback = onExtraCallback(parcel);
            int i3 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return setmediationproviderOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setMediationProvider[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            setMediationProvider[] setmediationproviderArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 95 / 0;
            }
            return setmediationproviderArrOnNavigationEvent;
        }

        public final setMediationProvider onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            setMediationProvider setmediationprovider = new setMediationProvider(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return setmediationprovider;
        }

        public final setMediationProvider[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 9;
            onNavigationEvent = i4 % 128;
            setMediationProvider[] setmediationproviderArr = new setMediationProvider[i];
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            int i6 = i3 + 5;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 29 / 0;
            }
            return setmediationproviderArr;
        }
    }

    static {
        asBinder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 54, 161, 0}, true, new byte[]{1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        CREATOR = new onNavigationEvent();
        int i = IAuthTabCallback_Parcel + 61;
        access000 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public setMediationProvider() {
        this(0, 0, null, null, null, null, null, 0L, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 115;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 101;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMediationProvider)) {
            return false;
        }
        setMediationProvider setmediationprovider = (setMediationProvider) obj;
        if (this.asInterface != setmediationprovider.asInterface) {
            int i4 = i2 + 77;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.IAuthTabCallbackStub != setmediationprovider.IAuthTabCallbackStub || !Intrinsics.areEqual(this.onNavigationEvent, setmediationprovider.onNavigationEvent) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, setmediationprovider.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, setmediationprovider.asBinder)) {
            int i6 = IAuthTabCallbackStubProxy + 15;
            access100 = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onTransact, setmediationprovider.onTransact)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, setmediationprovider.onWarmupCompleted)) {
            int i7 = access100 + 27;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.IAuthTabCallbackDefault != setmediationprovider.IAuthTabCallbackDefault) {
            return false;
        }
        int i9 = access100 + 31;
        IAuthTabCallbackStubProxy = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((Integer.hashCode(this.asInterface) * 31) + Integer.hashCode(this.IAuthTabCallbackStub)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + Long.hashCode(this.IAuthTabCallbackDefault);
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckVersionResult(result=" + this.asInterface + ", update=" + this.IAuthTabCallbackStub + ", link=" + this.onNavigationEvent + ", latestAppVersion=" + this.onExtraCallbackWithResult + ", title=" + this.asBinder + ", message=" + this.onTransact + ", imageUrl=" + this.onWarmupCompleted + ", periodHour=" + this.IAuthTabCallbackDefault + ")";
        int i2 = access100 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 5;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.asInterface);
        parcel.writeInt(this.IAuthTabCallbackStub);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.asBinder);
        parcel.writeString(this.onTransact);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeLong(this.IAuthTabCallbackDefault);
        int i5 = IAuthTabCallbackStubProxy + 49;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public setMediationProvider(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.asInterface = i;
        this.IAuthTabCallbackStub = i2;
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = str2;
        this.asBinder = str3;
        this.onTransact = str4;
        this.onWarmupCompleted = str5;
        this.IAuthTabCallbackDefault = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setMediationProvider(int i, int i2, String str, String str2, String str3, String str4, String str5, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        int i5;
        String str6;
        String str7;
        if ((i3 & 1) != 0) {
            int i6 = IAuthTabCallbackStubProxy + 51;
            access100 = i6 % 128;
            i4 = i6 % 2 != 0 ? 1 : 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            int i7 = IAuthTabCallbackStubProxy + 123;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i3 & 4) != 0) {
            int i10 = access100 + 55;
            IAuthTabCallbackStubProxy = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 46 / 0;
            }
            int i12 = 2 % 2;
            str6 = "";
        } else {
            str6 = str;
        }
        String str8 = (i3 & 8) != 0 ? "" : str2;
        String str9 = (i3 & 16) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            int i13 = access100 + 1;
            IAuthTabCallbackStubProxy = i13 % 128;
            int i14 = i13 % 2;
            str7 = "";
        } else {
            str7 = str4;
        }
        this(i4, i5, str6, str8, str9, str7, (i3 & 64) == 0 ? str5 : "", (i3 & 128) != 0 ? 0L : j);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 13;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 29;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = this.asBinder;
        int i5 = i3 + 31;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 105;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onTransact;
        int i4 = i3 + 69;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            str = this.onWarmupCompleted;
            int i4 = 80 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i3 + 13;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final IAuthTabCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 25;
        access100 = i3 % 128;
        if (i3 % 2 == 0 ? this.IAuthTabCallbackStub != 2 : this.IAuthTabCallbackStub != 3) {
            return IAuthTabCallback.NORMAL;
        }
        int i4 = i2 + 89;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return IAuthTabCallback.FORCE;
        }
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.FORCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = {1905410392, 1496238356, 1134767813, 227971656, 372502873, -912604654, 1595302365, 810758790, -1875761195, -1175897963, -1711143956, 665030204, 2076158018, -1958801526, 2085258401, -192293298, 1065987382, -1193437950};
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final setMediationProvider onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Object[] objArr = new Object[1];
            a(new int[]{-860553831, -148601437, -1889485668, 942382498, 2040349382, -1097806642, 1725525236, -1368220682, -1842202095, 2048554741, -592577057, 1683867346, -645783162, 1562538066, 1442272369, 2007765596, -1408901530, 1786234860, 369604194, 78943034, -1823948500, -1502257391, -2059847137, 1930933164, -677325051, 1187619679, -1238109003, 2010693704}, View.combineMeasuredStates(0, 0) + 54, objArr);
            setMediationProvider setmediationprovider = new setMediationProvider(0, 2, "market://details?id=viva.republica.toss", null, str, str2, ((String) objArr[0]).intern(), 0L, 137, null);
            int i2 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return setmediationprovider;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = IAuthTabCallback;
            int i4 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $11 + 57;
                    $10 = i6 % 128;
                    if (i6 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 72 - (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i5--;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i5])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 72, 8848 - Color.blue(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i5] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i5++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = IAuthTabCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i7 = $10 + 5;
                $11 = i7 % 128;
                int i8 = 2;
                int i9 = i7 % 2;
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $10 + 81;
                    $11 = i11 % 128;
                    if (i11 % i8 == 0) {
                        try {
                            Object[] objArr4 = new Object[1];
                            objArr4[i4] = Integer.valueOf(iArr5[i10]);
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, View.resolveSize(i4, i4) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                            i10 >>= 1;
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } else {
                        Object[] objArr5 = {Integer.valueOf(iArr5[i10])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 72, 8848 - TextUtils.getOffsetAfter("", 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        i10++;
                    }
                    i4 = 0;
                    i8 = 2;
                }
                iArr5 = iArr6;
            }
            int i12 = i4;
            System.arraycopy(iArr5, i12, iArr4, i12, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i13 = $11 + 17;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i15 = 0;
                for (int i16 = 16; i15 < i16; i16 = 16) {
                    int i17 = $11 + 55;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                        Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 22253), 39 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 10301 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i15 += 106;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                        Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback6 == null) {
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 22252), ExpandableListView.getPackedPositionType(0L) + 39, KeyEvent.getDeadChar(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback6).invoke(null, objArr7)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i15++;
                    }
                }
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr8 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback7 == null) {
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - ExpandableListView.getPackedPositionChild(0L)), Color.blue(0) + 78, 7397 - ((byte) KeyEvent.getModifierMetaStateMask()), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getInterfaceDescriptor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35, 14238 - MotionEvent.axisFromString(""), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $11 + 5;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10935), 65 - (ViewConfiguration.getJumpTapTimeout() >> 16), AndroidCharacter.getMirror('0') + 16670, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), Color.green(0) + 29, View.getDefaultSize(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 69 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf("", "", 0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i13 = $10 + 113;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 << trackGroupExternalSyntheticLambda0.onNavigationEvent) % 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void asBinder() {
        getInterfaceDescriptor = new char[]{27337, 27457, 27484, 27457, 27299, 27298, 27461, 27459, 27463, 27459, 27484, 27458, 27298, 27296, 27458, 27459, 27460, 27303, 27300, 27465, 27457, 27458, 27467, 27298, 27324, 27459, 27462, 27457, 27483, 27484, 27456, 27296, 27297, 27458, 27298, 27327, 27482, 27484, 27484, 27324, 27303, 27465, 27457, 27461, 27461, 27482, 27324, 27294, 27291, 27321, 27484, 27485, 27483, 27457};
    }
}
