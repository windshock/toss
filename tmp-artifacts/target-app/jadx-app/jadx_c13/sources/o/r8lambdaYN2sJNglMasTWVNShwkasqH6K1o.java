package o;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.core.tracker.entry.TrackState;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class r8lambdaYN2sJNglMasTWVNShwkasqH6K1o extends Dialog implements L_ {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static boolean IAuthTabCallbackStub = false;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private static int asBinder;
    private static int asInterface;
    private static char[] onNavigationEvent;
    private static boolean onTransact;
    private Long onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private CharSequence onWarmupCompleted;

    static {
        IAuthTabCallback_Parcel();
        Companion = new onExtraCallbackWithResult(null);
        IAuthTabCallback = 8;
        int i = IAuthTabCallbackDefault + 5;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // o.L_
    public /* bridge */ AFj1nSDK4 getLogVersion() {
        int i = 2 % 2;
        int i2 = access000 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AFj1nSDK4 logVersion = super.getLogVersion();
        int i4 = access000 + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return logVersion;
    }

    @Override // o.L_
    public /* bridge */ String getReferrerParam() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String referrerParam = super.getReferrerParam();
        int i4 = IAuthTabCallbackStubProxy + 71;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return referrerParam;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ String getScreenHash() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String screenHash = super.getScreenHash();
        int i4 = access000 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return screenHash;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getScreenParams();
            throw null;
        }
        Map<String, Object> screenParams = super.getScreenParams();
        int i3 = IAuthTabCallbackStubProxy + 73;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return screenParams;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackBottomSheetView() {
        int i = 2 % 2;
        int i2 = access000 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackBottomSheetView = super.onTrackBottomSheetView();
        int i4 = access000 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTrackBottomSheetView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackView() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackView = super.onTrackView();
        int i4 = IAuthTabCallbackStubProxy + 23;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnTrackView;
        }
        throw null;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackView(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackView = super.onTrackView(z);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 43;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return zOnTrackView;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackViewInternal(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = access000 + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackViewInternal = super.onTrackViewInternal(z, z2);
        int i4 = access000 + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTrackViewInternal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AFj1oSDKAFa1ySDK
    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 7;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.onExtraCallback;
        if (l != null) {
            int i5 = i2 + 85;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return l.longValue();
        }
        int i7 = i2 + 99;
        access000 = i7 % 128;
        if (i7 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 55;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback = l;
        int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaYN2sJNglMasTWVNShwkasqH6K1o(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = context;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaYN2sJNglMasTWVNShwkasqH6K1o(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStubProxy;
            int i4 = i3 + 53;
            access000 = i4 % 128;
            int i5 = i4 % 2 == 0 ? 0 : 1;
            int i6 = i3 + 87;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = i5 ^ 1;
        }
        this(context, i);
    }

    @Override // android.app.Dialog
    public void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.setTitle(charSequence);
        this.onWarmupCompleted = charSequence;
        int i4 = IAuthTabCallbackStubProxy + 65;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPrepareTrackViewParams(@NotNull Map<String, Object> map) throws Throwable {
        String screenName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        super.onPrepareTrackViewParams(map);
        Object[] objArr = new Object[1];
        String interfaceDescriptor = null;
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, KeyEvent.normalizeMetaState(0) + 127, objArr);
        map.put(((String) objArr[0]).intern(), this.onWarmupCompleted);
        Object obj = this.onExtraCallbackWithResult;
        L_ l_ = obj instanceof L_ ? (L_) obj : null;
        if (l_ != null && (screenName = l_.getScreenName()) != null) {
            int i2 = access000 + 29;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 72 / 0;
                if (screenName.length() == 0) {
                    TrackState trackStateOnExtraCallbackWithResult = TrackState.Companion.onExtraCallbackWithResult();
                    if (trackStateOnExtraCallbackWithResult != null) {
                        int i4 = access000 + 123;
                        IAuthTabCallbackStubProxy = i4 % 128;
                        int i5 = i4 % 2;
                        interfaceDescriptor = trackStateOnExtraCallbackWithResult.getInterfaceDescriptor();
                        int i6 = IAuthTabCallbackStubProxy + 27;
                        access000 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                } else {
                    interfaceDescriptor = screenName;
                }
            } else if (screenName.length() == 0) {
            }
        }
        map.put("parent_screen", interfaceDescriptor);
    }

    @Override // android.app.Dialog
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        onTrackView(true);
        int i4 = access000 + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        char c = '0';
        if (cArr3 != null) {
            int i3 = $11 + 9;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0)), View.MeasureSpec.getMode(0) + 77, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asBinder)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 75 - (ViewConfiguration.getTouchSlop() >> 8), 16037 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i6 = 1052772399;
            if (IAuthTabCallbackStub) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i7 = $10 + 11;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 64, 12213 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i6 = 1052772399;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!onTransact) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i9 = $10 + 35;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
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
            String str = new String(cArr2);
            int i10 = $10 + 57;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void IAuthTabCallback_Parcel() {
        onNavigationEvent = new char[]{32739, 32758, 32747, 32754};
        asBinder = -1184333921;
        onTransact = true;
        IAuthTabCallbackStub = true;
    }
}
