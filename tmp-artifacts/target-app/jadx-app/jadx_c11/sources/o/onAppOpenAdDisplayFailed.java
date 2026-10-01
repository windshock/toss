package o;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.rn.toss.core.ReactNavBar;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAppOpenAdDisplayFailed {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int asInterface;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final TdsSkeletonV1View.IAuthTabCallback asBinder;
    private final String onExtraCallback;
    private final ReactNavBar onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final boolean onTransact;
    private final String onWarmupCompleted;

    static {
        int i = access100 + 85;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = access000 + 25;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof onAppOpenAdDisplayFailed)) {
            int i4 = access000 + 99;
            IAuthTabCallback_Parcel = i4 % 128;
            return i4 % 2 == 0;
        }
        onAppOpenAdDisplayFailed onappopenaddisplayfailed = (onAppOpenAdDisplayFailed) obj;
        if (this.onExtraCallbackWithResult != onappopenaddisplayfailed.onExtraCallbackWithResult) {
            int i5 = IAuthTabCallback_Parcel + 41;
            access000 = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onappopenaddisplayfailed.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.asBinder, onappopenaddisplayfailed.asBinder) || this.IAuthTabCallbackStub != onappopenaddisplayfailed.IAuthTabCallbackStub || !Intrinsics.areEqual(this.IAuthTabCallback, onappopenaddisplayfailed.IAuthTabCallback)) {
            return false;
        }
        if (this.onTransact == onappopenaddisplayfailed.onTransact) {
            return Intrinsics.areEqual(this.onNavigationEvent, onappopenaddisplayfailed.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, onappopenaddisplayfailed.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, onappopenaddisplayfailed.onExtraCallback);
        }
        int i6 = IAuthTabCallback_Parcel + 9;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = access000 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int iHashCode2 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode3 = this.asBinder.hashCode();
        int iHashCode4 = Boolean.hashCode(this.IAuthTabCallbackStub);
        String str = this.IAuthTabCallback;
        int iHashCode5 = (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.onTransact)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode();
        int i4 = IAuthTabCallback_Parcel + 101;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PortalServiceIntentParams(navBar=" + this.onExtraCallbackWithResult + ", theme=" + this.IAuthTabCallbackDefault + ", skeletonType=" + this.asBinder + ", shouldZeroSafeAreaInsets=" + this.IAuthTabCallbackStub + ", redirectUrl=" + this.IAuthTabCallback + ", skipLockScreen=" + this.onTransact + ", originScheme=" + this.onNavigationEvent + ", company=" + this.onWarmupCompleted + ", bundlePath=" + this.onExtraCallback + ")";
        int i2 = access000 + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
        return str;
    }

    public onAppOpenAdDisplayFailed(@NotNull ReactNavBar reactNavBar, @NotNull String str, @NotNull TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback, boolean z, @Nullable String str2, boolean z2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(reactNavBar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.onExtraCallbackWithResult = reactNavBar;
        this.IAuthTabCallbackDefault = str;
        this.asBinder = iAuthTabCallback;
        this.IAuthTabCallbackStub = z;
        this.IAuthTabCallback = str2;
        this.onTransact = z2;
        this.onNavigationEvent = str3;
        this.onWarmupCompleted = str4;
        this.onExtraCallback = str5;
    }

    public final ReactNavBar onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 55;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        ReactNavBar reactNavBar = this.onExtraCallbackWithResult;
        int i5 = i2 + 7;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return reactNavBar;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 != 0) {
            str = this.IAuthTabCallbackDefault;
            int i4 = 35 / 0;
        } else {
            str = this.IAuthTabCallbackDefault;
        }
        int i5 = i3 + 13;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return str;
    }

    public final TdsSkeletonV1View.IAuthTabCallback asBinder() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 87;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback = this.asBinder;
        int i5 = i2 + 91;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallback;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallbackStub;
        int i5 = i3 + 83;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 69;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onTransact;
        int i5 = i2 + 125;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 77;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onNavigationEvent;
            int i4 = 70 / 0;
        } else {
            str = this.onNavigationEvent;
        }
        int i5 = i2 + 83;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 121;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 65;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback;
        private static char[] IAuthTabCallback = {32748, 32756, 32758, 32751, 32715, 32744, 32764, 32716, 32749, 32754, 32745};
        private static int onExtraCallbackWithResult = -1184333921;
        private static boolean onNavigationEvent = true;
        private static boolean onWarmupCompleted = true;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final onAppOpenAdDisplayFailed onExtraCallback(@NotNull Intent intent) throws Throwable {
            boolean z;
            String queryParameter;
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(intent, "");
            ReactNavBar.Companion companion = ReactNavBar.Companion;
            String stringExtra = intent.getStringExtra("_navBar");
            if (stringExtra == null) {
                int i4 = IAuthTabCallbackStub + 37;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 3;
                }
                stringExtra = "";
            }
            ReactNavBar reactNavBarOnNavigationEvent = companion.onNavigationEvent(stringExtra);
            String stringExtra2 = intent.getStringExtra("_theme");
            if (stringExtra2 == null) {
                int i6 = IAuthTabCallbackStub + 47;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                stringExtra2 = "adaptive";
            }
            String str2 = stringExtra2;
            TdsSkeletonV1View.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = o5.onNavigationEvent(intent.getStringExtra("_skeletonType"));
            String stringExtra3 = intent.getStringExtra("_zeroSafeAreaInsets");
            if (stringExtra3 != null) {
                int i8 = IAuthTabCallbackStub + 85;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(stringExtra3);
                if (booleanStrictOrNull != null) {
                    boolean zBooleanValue = booleanStrictOrNull.booleanValue();
                    int i10 = onExtraCallback + 93;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    z = zBooleanValue;
                } else {
                    z = false;
                }
            }
            String stringExtra4 = intent.getStringExtra("redirect");
            Object obj = null;
            String str3 = (stringExtra4 == null || StringsKt.isBlank(stringExtra4)) ? null : stringExtra4;
            Uri data = intent.getData();
            if (data != null) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-117, -118, -118, -119, -121, -120, -126, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                queryParameter = data.getQueryParameter(((String) objArr[0]).intern());
                if (queryParameter == null) {
                    queryParameter = "false";
                }
            }
            boolean z2 = Boolean.parseBoolean(queryParameter);
            String stringExtra5 = intent.getStringExtra("__originScheme");
            if (stringExtra5 == null) {
                int i12 = onExtraCallback + 59;
                IAuthTabCallbackStub = i12 % 128;
                int i13 = i12 % 2;
                stringExtra5 = "";
            }
            String stringExtra6 = intent.getStringExtra("_company");
            if (stringExtra6 == null) {
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-118, -119, -122, -121}, 127 - View.combineMeasuredStates(0, 0), objArr2);
                stringExtra6 = ((String) objArr2[0]).intern();
            }
            String stringExtra7 = intent.getStringExtra("bundlePath");
            if (stringExtra7 == null) {
                int i14 = IAuthTabCallbackStub + 113;
                onExtraCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str = "";
            } else {
                str = stringExtra7;
            }
            return new onAppOpenAdDisplayFailed(reactNavBarOnNavigationEvent, str2, iAuthTabCallbackOnNavigationEvent, z, str3, z2, stringExtra5, stringExtra6, str);
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            if (cArr2 != null) {
                int i4 = $10;
                int i5 = i4 + 93;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = i4 + 15;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $10 + 31;
                    $11 = i10 % 128;
                    int i11 = i10 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 78, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i9++;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i12 = $10 + 3;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 4 / 5;
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 75 - Drawable.resolveOpacity(0, 0), 16036 - Process.getGidForName(""), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i14 = 1052772399;
            if (onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i14);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 63 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i14 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
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
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12214 - (ViewConfiguration.getPressedStateDuration() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }
    }
}
