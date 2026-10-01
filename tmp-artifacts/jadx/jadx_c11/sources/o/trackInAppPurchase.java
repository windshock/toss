package o;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackInAppPurchase {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static boolean IAuthTabCallbackStubProxy = false;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static boolean asInterface = false;
    private static int getInterfaceDescriptor = 1;
    private static char[] onTransact;
    public static final int onWarmupCompleted;
    private int IAuthTabCallback;
    private String IAuthTabCallbackStub;
    private String asBinder;
    private boolean onExtraCallback;
    private String onExtraCallbackWithResult;
    private Date onNavigationEvent;

    static {
        onTransact();
        Companion = new onNavigationEvent(null);
        onWarmupCompleted = 8;
        int i = getInterfaceDescriptor + 29;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 29;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 63;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 55;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallbackStub;
        int i5 = i3 + 23;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 103;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onExtraCallbackWithResult;
            int i4 = 52 / 0;
        } else {
            str = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 53;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final boolean onNavigationEvent() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            z = this.onExtraCallback;
            int i4 = 91 / 0;
        } else {
            z = this.onExtraCallback;
        }
        int i5 = i3 + 25;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public trackInAppPurchase(@NotNull Map<String, String> map) throws Throwable {
        int i;
        Intrinsics.checkNotNullParameter(map, "");
        this.IAuthTabCallback = 10002;
        this.IAuthTabCallbackStub = "";
        this.onExtraCallbackWithResult = "";
        this.asBinder = "";
        String str = map.get("reservedId");
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                this.IAuthTabCallback = 10002;
            }
        } else {
            int i2 = IAuthTabCallback_Parcel + 31;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            i = 10002;
        }
        this.IAuthTabCallback = i;
        int i5 = access100 + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 % 2;
        }
        Object[] objArr = new Object[1];
        Date date = null;
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, ((Process.getThreadPriority(0) + 20) >> 6) + 127, objArr);
        this.IAuthTabCallbackStub = map.get(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-124, -120, -121, -122, -122, -124, -123}, 127 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        this.onExtraCallbackWithResult = map.get(((String) objArr2[0]).intern());
        this.asBinder = map.get("actionUri");
        String str2 = map.get("reservationDate");
        if (str2 != null) {
            int i7 = IAuthTabCallback_Parcel + 39;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            date = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().parse(str2);
        } else {
            int i9 = IAuthTabCallback_Parcel + 87;
            access100 = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = 2 % 2;
        this.onNavigationEvent = date;
        String str3 = map.get("mute");
        this.onExtraCallback = str3 != null ? Boolean.parseBoolean(str3) : false;
    }

    public final Long onExtraCallback() {
        Date date;
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            date = this.onNavigationEvent;
            int i3 = 10 / 0;
            if (date == null) {
                return null;
            }
        } else {
            date = this.onNavigationEvent;
            if (date == null) {
                return null;
            }
        }
        Long lValueOf = Long.valueOf(date.getTime());
        int i4 = IAuthTabCallback_Parcel + 87;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return lValueOf;
    }

    public final Uri IAuthTabCallback() {
        int i = 2 % 2;
        String str = this.asBinder;
        if (str == null) {
            int i2 = IAuthTabCallback_Parcel + 51;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Uri uri = Uri.parse(str);
        int i4 = access100 + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return uri;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        if (this.onNavigationEvent != null && this.asBinder != null) {
            int i2 = IAuthTabCallback_Parcel + 67;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            if (str != null && str.length() != 0) {
                return true;
            }
        }
        int i3 = access100 + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        return false;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onTransact;
        if (cArr3 != null) {
            int i3 = $11 + 9;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 77 - View.MeasureSpec.getMode(0), Drawable.resolveOpacity(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $11 + 25;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 4;
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 76 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i7 = 1052772399;
        if (IAuthTabCallbackStubProxy) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(0) + 63, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i7 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $11 + 87;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] >> iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), KeyEvent.getDeadChar(0, 0) + 63, (ViewConfiguration.getLongPressTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 62 - MotionEvent.axisFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onTransact() {
        onTransact = new char[]{32619, 32638, 32627, 32634, 32626, 32628, 32582, 32632};
        IAuthTabCallbackDefault = -1184333849;
        asInterface = true;
        IAuthTabCallbackStubProxy = true;
    }
}
