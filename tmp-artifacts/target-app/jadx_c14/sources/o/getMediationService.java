package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.R;
import im.toss.featurescommon.contacts.library.realm.model.ProfilePhoto;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getMediationService {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 1;
    private static char asInterface;
    private static int getInterfaceDescriptor;
    private static final int onExtraCallbackWithResult;
    private static char[] onTransact;
    public static final int onWarmupCompleted;
    private final Context IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private final Plugin asBinder;
    private onSwitchToDarkTheme onExtraCallback;
    private String onNavigationEvent;

    public getMediationService(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = context;
        this.onNavigationEvent = "";
        this.IAuthTabCallbackDefault = -1L;
        this.asBinder = new Plugin(0.0f, 0.0f, 0.0f, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    public final getMediationService onExtraCallback(@NotNull onSwitchToDarkTheme onswitchtodarktheme) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onswitchtodarktheme, "");
        this.onExtraCallback = onswitchtodarktheme;
        onExtraCallback(onswitchtodarktheme.IAuthTabCallbackStub());
        onNavigationEvent(onswitchtodarktheme.IAuthTabCallbackDefault());
        int i4 = getInterfaceDescriptor + 37;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final getMediationService onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            int i4 = i3 + 69;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        this.onNavigationEvent = str;
        return this;
    }

    public final getMediationService onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 105;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = j;
        int i5 = i2 + 5;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public static /* synthetic */ RecomposerawaitIdle2.onNavigationEvent onExtraCallback(getMediationService getmediationservice, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 37;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        Object obj2 = null;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 69;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            str = null;
        }
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = getmediationservice.onExtraCallbackWithResult(str);
        int i6 = IAuthTabCallback_Parcel + 33;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        obj2.hashCode();
        throw null;
    }

    public final RecomposerawaitIdle2.onNavigationEvent onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = TitleBarRightButtonView.onExtraCallback.onExtraCallbackWithResult(onNavigationEvent());
        if (strOnExtraCallbackWithResult != null) {
            int i2 = getInterfaceDescriptor + 65;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 39;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            str = strOnExtraCallbackWithResult;
        }
        return onNavigationEvent(str);
    }

    public final RecomposerawaitIdle2.onNavigationEvent onWarmupCompleted(@NotNull ProfilePhoto profilePhoto) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(profilePhoto, "");
            return onNavigationEvent(profilePhoto.cc_());
        }
        Intrinsics.checkNotNullParameter(profilePhoto, "");
        int i3 = 85 / 0;
        return onNavigationEvent(profilePhoto.cc_());
    }

    private final RecomposerawaitIdle2.onNavigationEvent onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawable = this.IAuthTabCallback.getDrawable(onExtraCallbackWithResult);
        CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnNavigationEvent = drawable != null ? CarouselPagerStateExternalSyntheticLambda1.onNavigationEvent(drawable) : null;
        String string = "";
        if (str != null && str.length() != 0) {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{20, 7, 6, '\b', 11, '\f', 13823, 13823, 7, 20, 19, 14, 14, 23, '\t', 15, 13875, 13875, 20, 21, '\b', 24, 11, 17, 15, 0, 1, 19, 3, 21, 6, 23, 16, '\b', 23, 3}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 75), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strEncode);
            string = sb.toString();
            int i4 = getInterfaceDescriptor + 87;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        return RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(this.IAuthTabCallback).onExtraCallback(string).onNavigationEvent(carouselKtExternalSyntheticLambda7OnNavigationEvent).onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7OnNavigationEvent), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{this.asBinder});
    }

    public final Drawable onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Drawable drawableOnExtraCallbackWithResult = ITrustedWebActivityServiceStub.onExtraCallbackWithResult(context, onExtraCallbackWithResult);
        Intrinsics.checkNotNull(drawableOnExtraCallbackWithResult);
        int i4 = getInterfaceDescriptor + 125;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return drawableOnExtraCallbackWithResult;
    }

    private final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            long j = this.IAuthTabCallbackDefault;
            if (j >= 0) {
                return j;
            }
        } else {
            long j2 = this.IAuthTabCallbackDefault;
            if (j2 >= 0) {
                return j2;
            }
        }
        int i4 = i3 + 119;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        dismissBadgeView dismissbadgeview = dismissBadgeView.IAuthTabCallback;
        String str = this.onNavigationEvent;
        if (i5 == 0) {
            return dismissbadgeview.onNavigationEvent(str);
        }
        dismissbadgeview.onNavigationEvent(str);
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

    static {
        onExtraCallbackWithResult();
        Companion = new onExtraCallbackWithResult(null);
        onWarmupCompleted = 8;
        onExtraCallbackWithResult = R.drawable.img_profile_default_user_1;
        int i = IAuthTabCallbackStub + 53;
        access100 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onTransact;
        int i4 = -1310771303;
        char c2 = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $11 + 83;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23138 - TextUtils.indexOf("", c2, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $11 + 107;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = -1310771303;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $11 + 97;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 % 3;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asInterface)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            char c3 = '\b';
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 26 - TextUtils.indexOf("", "", 0), 23139 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i12 = $10 + 83;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        int i14 = $11 + 65;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        obj = obj2;
                        c = c3;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[9] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[c3] = Integer.valueOf(cCharValue);
                        objArr4[7] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[6] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[3] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[0] = defaultGainProviderExternalSyntheticLambda0;
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 75, AndroidCharacter.getMirror('0') + 8040, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i16 = $11 + 115;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                c = '\b';
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 30 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-16757728) - Color.rgb(0, 0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '\b';
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        } else {
                            obj = null;
                            c = '\b';
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i19 = $10 + 17;
                                $11 = i19 % 128;
                                int i20 = i19 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i21 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i22 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i21];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i22];
                            } else {
                                int i23 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i24 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i23];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i24];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                    c3 = c;
                }
            }
            for (int i25 = 0; i25 < i; i25++) {
                cArr4[i25] = (char) (cArr4[i25] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallbackWithResult() {
        onTransact = new char[]{51243, 64983, 51245, 51240, 64969, 64967, 64971, 64963, 64898, 64990, 64960, 64905, 64961, 64977, 64966, 51242, 64982, 51244, 64899, 64988, 64986, 64901, 64987, 64924, 64925};
        asInterface = (char) 51244;
    }
}
