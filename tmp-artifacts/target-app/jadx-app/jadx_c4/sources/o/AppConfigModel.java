package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.facepay.log.model.ExternalLogItem;
import im.toss.facepay.log.model.LogAction;
import im.toss.facepay.log.model.LogFeature;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppConfigModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppConfigModel {
    private static int $10 = 0;
    private static int $11 = 1;
    private static volatile boolean IAuthTabCallback = false;
    private static findResAndMsg IAuthTabCallbackDefault = null;
    private static getIncludeFiles IAuthTabCallbackStub = null;
    private static final ReentrantReadWriteLock IAuthTabCallbackStubProxy;
    private static final ConcurrentHashMap<Class<? extends manualParseJson>, manualParseJson> IAuthTabCallback_Parcel;
    private static char[] ICustomTabsCallback = null;
    private static int ICustomTabsCallbackDefault = 1;
    private static char access000 = 0;
    private static final AtomicLong access100;
    private static getAppLaunchParams asBinder = null;
    private static getPermission asInterface = null;
    private static char extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static final AtomicBoolean getInterfaceDescriptor;
    private static boolean onActivityLayout = false;
    private static int onActivityResized = 1;
    private static final String onExtraCallback;
    private static StartClientBundle1 onExtraCallbackWithResult;
    private static int onMessageChannelReady;
    private static int onMinimized;
    public static final AppConfigModel onNavigationEvent;
    private static boolean onPostMessage;
    private static List<? extends parseFromJSON> onTransact;
    private static getPages onWarmupCompleted;
    private static char readTypedObject;
    private static char writeTypedObject;

    public static /* synthetic */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 59;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return access000();
        }
        int i3 = 9 / 0;
        return access000();
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i2));
        int i12 = (~(i2 | i7)) | (~(i8 | i10));
        int i13 = ~(i3 | i6);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i3 + i6 + i4 + ((-1585779005) * i) + (640148872 * i5);
        int i17 = i16 * i16;
        int i18 = (i3 * 308833806) + 153878528 + (308833806 * i6) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i4) + (1159200768 * i) + ((-734003200) * i5) + (2089549824 * i17);
        int i19 = (i3 * (-1291220770)) + 263398195 + (i6 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i4 * (-1291221671)) + (i * (-1079815989)) + (i5 * 669414472) + (i17 * 145489920);
        int i20 = i18 + (i19 * i19 * (-1699479552));
        if (i20 == 1) {
            return onExtraCallback(objArr);
        }
        if (i20 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i20 != 3) {
            return onExtraCallbackWithResult(objArr);
        }
        int i21 = 2 % 2;
        int i22 = onMessageChannelReady + 51;
        int i23 = i22 % 128;
        onActivityResized = i23;
        int i24 = i22 % 2;
        getPermission getpermission = asInterface;
        if (getpermission == null) {
            Object[] objArr2 = new Object[1];
            a(new char[]{28350, 2012, 35982, 35251, 49219, 25600, 22166, 57311, 1631, 23318, 60032, 30728, 23007, 11472, 61341, 46150, 13537, 12993, 45117, 52596, 18214, 31470, 22957, 27781, 8862, 14974, 28417, 65077, 32968, 18701, 47013, 59187, 59001, 1944, 35794, 5395, 31892, 13275, 16346, 41595, 60578, 26187, 31376, 60675, 14865, 9319, 18214, 31470, 35231, 56553, 32615, 4362, 3641, 1978, 20591, 54036, 9623, 17890}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58, objArr2);
            throw new IllegalStateException(((String) objArr2[0]).intern());
        }
        int i25 = i23 + 35;
        onMessageChannelReady = i25 % 128;
        int i26 = i25 % 2;
        return getpermission;
    }

    private AppConfigModel() {
    }

    static {
        IAuthTabCallbackStubProxy();
        Object[] objArr = new Object[1];
        a(new char[]{21520, 51113, 28412, 3202, 31579, 63091, 11141, 13118}, 8 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        onNavigationEvent = new AppConfigModel();
        getInterfaceDescriptor = new AtomicBoolean(false);
        onTransact = CollectionsKt.emptyList();
        IAuthTabCallbackStubProxy = new ReentrantReadWriteLock();
        IAuthTabCallback_Parcel = new ConcurrentHashMap<>();
        access100 = new AtomicLong(0L);
        int i = ICustomTabsCallbackDefault + 71;
        onMinimized = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 59;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getPages getpages = onWarmupCompleted;
        if (getpages == null) {
            Object[] objArr2 = new Object[1];
            a(new char[]{31579, 63091, 8346, 17805, 16010, 6657, 35512, 34057, 21901, 14327, 29708, 31006, 61435, 62622, 32289, 'A', 9026, 42132, 45117, 52596, 36449, 46753, 42157, 40011, 57116, 19122, 17525, 21132, 61547, 34101, 13529, 28265, 4314, 17118, 1549, 52650, 64917, 62827, 29070, 58636, 8862, 14974, 13264, 34057, 21520, 51113, 28412, 3202, 31579, 63091, 28903, 3916, 17525, 21132, 61547, 34101, 13922, 46465, 5810, 29371, 64287, 14615, 33896, 24913, 24708, 14870}, MotionEvent.axisFromString("") + 66, objArr2);
            throw new IllegalStateException(((String) objArr2[0]).intern());
        }
        int i4 = i2 + 85;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return getpages;
    }

    public final StartClientBundle1 onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        StartClientBundle1 startClientBundle1 = onExtraCallbackWithResult;
        if (startClientBundle1 == null) {
            Object[] objArr = new Object[1];
            b(null, new byte[]{-111, -121, -114, -123, -116, -104, -115, -105, -106, -121, -116, -113, -116, -111, -107, -118, -108, -124, -109, -126, -110, -115, -125, -125, -126, -127, -115, -111, -120, -124, -112, -116, -125, -126, -116, -121, -116, -113, -116, -115, -121, -118, -113, -115, -114, -116, -115, -123, -124, -120, -116, -117, -118, -123, -119, -126, -121, -126, -120, -126, -121, -124, -122, -123, -124, -125, -125, -126, -127}, null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i5 = i3 + 71;
        int i6 = i5 % 128;
        onActivityResized = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 103;
        onMessageChannelReady = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 40 / 0;
        }
        return startClientBundle1;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i6 = (c3 + i4) ^ ((c3 << 4) + ((char) (writeTypedObject ^ 1094535280733222934L)));
                int i7 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(extraCallback);
                    objArr2[2] = Integer.valueOf(i7);
                    objArr2[c] = Integer.valueOf(i6);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(i3));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                        int offsetAfter = 12434 - TextUtils.getOffsetAfter("", i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(bitsPerPixel, doubleTapTimeout, offsetAfter, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i8 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (access000 ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(readTypedObject)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i8 + 1;
                    int i9 = $11 + 59;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 16014), (ViewConfiguration.getLongPressTimeout() >> 16) + 14, 19901 - View.combineMeasuredStates(0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 67;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    public final getIncludeFiles IAuthTabCallbackStub() throws Throwable {
        int i = 2 % 2;
        getIncludeFiles getincludefiles = IAuthTabCallbackStub;
        if (getincludefiles == null) {
            Object[] objArr = new Object[1];
            a(new char[]{31579, 63091, 57059, 25098, 6192, 24840, 38852, 6463, 6337, 63704, 17696, 28845, 9026, 42132, 45117, 52596, 36449, 46753, 42157, 40011, 57116, 19122, 17525, 21132, 61547, 34101, 13529, 28265, 4314, 17118, 1549, 52650, 64917, 62827, 29070, 58636, 8862, 14974, 13264, 34057, 21520, 51113, 28412, 3202, 31579, 63091, 28903, 3916, 17525, 21132, 61547, 34101, 13922, 46465, 5810, 29371, 64287, 14615, 33896, 24913, 24708, 14870}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 61, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i2 = onActivityResized + 39;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return getincludefiles;
    }

    public final List<parseFromJSON> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 19;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        List list = onTransact;
        int i5 = i3 + 19;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final findResAndMsg IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 47;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        findResAndMsg findresandmsg = IAuthTabCallbackDefault;
        if (findresandmsg == null) {
            Object[] objArr = new Object[1];
            a(new char[]{31579, 63091, 31932, 59887, 17525, 21132, 8474, 2871, 51879, 908, 50865, 59339, 45117, 52596, 36449, 46753, 42157, 40011, 57116, 19122, 17525, 21132, 61547, 34101, 13529, 28265, 4314, 17118, 1549, 52650, 64917, 62827, 29070, 58636, 8862, 14974, 13264, 34057, 21520, 51113, 28412, 3202, 31579, 63091, 28903, 3916, 17525, 21132, 61547, 34101, 13922, 46465, 5810, 29371, 64287, 14615, 33896, 24913, 24708, 14870}, TextUtils.lastIndexOf("", '0', 0) + 60, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i5 = i2 + 95;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return findresandmsg;
    }

    public final getAppLaunchParams getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 83;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        ReentrantReadWriteLock.ReadLock lock = IAuthTabCallbackStubProxy.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "");
        lock.lock();
        try {
            getAppLaunchParams getapplaunchparams = asBinder;
            lock.unlock();
            int i4 = onMessageChannelReady + 69;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return getapplaunchparams;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final ConcurrentHashMap<Class<? extends manualParseJson>, manualParseJson> onTransact() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 5;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        ConcurrentHashMap<Class<? extends manualParseJson>, manualParseJson> concurrentHashMap = IAuthTabCallback_Parcel;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return concurrentHashMap;
    }

    public final AtomicLong asBinder() {
        AtomicLong atomicLong;
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 105;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            atomicLong = access100;
            int i4 = 45 / 0;
        } else {
            atomicLong = access100;
        }
        int i5 = i2 + 37;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return atomicLong;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = ICustomTabsCallback;
        if (cArr4 != null) {
            int i3 = $10 + 35;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 77, 20952 - (Process.myTid() >> 22), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(extraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (Process.myPid() >> 22) + 75, (ViewConfiguration.getTouchSlop() >> 8) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i5 = 1052772399;
            if (onActivityLayout) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 33;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 63, 12214 - (ViewConfiguration.getPressedStateDuration() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i5 = 1052772399;
                }
                String str = new String(cArr5);
                int i8 = $10 + 85;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                objArr[0] = str;
                return;
            }
            if (!onPostMessage) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i10 = $10 + 83;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i12 = $11 + 41;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 63, 12214 - (ViewConfiguration.getLongPressTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWarmupCompleted(@NotNull findResAndMsg findresandmsg, @NotNull getPermission getpermission, @NotNull getPages getpages, @NotNull StartClientBundle1 startClientBundle1, @NotNull getIncludeFiles getincludefiles, @NotNull List<? extends parseFromJSON> list, @NotNull List<? extends manualParseJson> list2) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(getpermission, "");
        Intrinsics.checkNotNullParameter(getpages, "");
        Intrinsics.checkNotNullParameter(startClientBundle1, "");
        Intrinsics.checkNotNullParameter(getincludefiles, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (!getInterfaceDescriptor.compareAndSet(false, true)) {
            TextUtils.getOffsetBefore("", 0);
            TextUtils.indexOf("", "", 0, 0);
            return;
        }
        asInterface = getpermission;
        onWarmupCompleted = getpages;
        onExtraCallbackWithResult = startClientBundle1;
        IAuthTabCallbackStub = getincludefiles;
        onTransact = list;
        IAuthTabCallbackDefault = findresandmsg;
        int i4 = onMessageChannelReady + 47;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        for (manualParseJson manualparsejson : list2) {
            if (((manualParseJson) IAuthTabCallback_Parcel.putIfAbsent(manualparsejson.getClass(), manualparsejson)) != null) {
                String simpleName = manualparsejson.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                b(null, new byte[]{-103, -115, -123, -124, -107, -107, -118, -108}, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(simpleName);
                Object[] objArr2 = new Object[1];
                b(null, new byte[]{-111, -120, -124, -123, -124, -121, -114, -116, -107, -124, -123, -115, -102, -120, -126, -124, -123, -125, -126, -115, -114, -116, -115, -103}, null, View.resolveSize(0, 0) + 127, objArr2);
                sb.append(((String) objArr2[0]).intern());
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        IAuthTabCallback = true;
        IAuthTabCallback_Parcel.size();
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{-106, -115, -111, -102, -125, -125, -99, -104, -114, -114, -124, -109, -109, -99, -114, -115, -120, -124, -121, -124, -125, -100, -101, -118, -109, -115, -113, -118, -116, -121, -126, -112, -116, -125, -126, -116, -121, -116, -113, -116, -115, -107, -118, -108, -124, -109, -126, -110}, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, objArr3);
        ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(null, new byte[]{-105, -114, -123, -124, -107, -107, -118, -125, -115}, null, AndroidCharacter.getMirror('0') + 'O', objArr4);
        ((String) objArr4[0]).intern();
        ExpandableListView.getPackedPositionForGroup(0);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        AppConfigModel appConfigModel = (AppConfigModel) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Function1<? super ExternalLogItem, Unit> function1 = (Function1) objArr[3];
        List<? extends manualParseJson> list = (List) objArr[4];
        getPages setpagelaunchparams = (getPages) objArr[5];
        StartClientBundle1 getpagelaunchparams = (StartClientBundle1) objArr[6];
        List<? extends parseFromJSON> listEmptyList = (List) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        Object obj = objArr[9];
        int i = 2 % 2;
        int i2 = onActivityResized + 33;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue & 16) != 0) {
            setpagelaunchparams = new setPageLaunchParams(context, str);
        }
        if ((iIntValue & 32) != 0) {
            getpagelaunchparams = new getPageLaunchParams();
        }
        if ((iIntValue & 64) != 0) {
            int i4 = onActivityResized + 103;
            onMessageChannelReady = i4 % 128;
            if (i4 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        appConfigModel.onNavigationEvent(context, str, function1, list, setpagelaunchparams, getpagelaunchparams, listEmptyList);
        int i5 = onActivityResized + 123;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull String str, @NotNull Function1<? super ExternalLogItem, Unit> function1, @NotNull List<? extends manualParseJson> list, @NotNull getPages getpages, @NotNull StartClientBundle1 startClientBundle1, @NotNull List<? extends parseFromJSON> list2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getpages, "");
        Intrinsics.checkNotNullParameter(startClientBundle1, "");
        Intrinsics.checkNotNullParameter(list2, "");
        onWarmupCompleted(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null))), new getPermission() { // from class: im.toss.facepay.log.FaceLog$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // o.getPermission
            public final long provide() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 125;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return AppConfigModel.IAuthTabCallback();
                }
                AppConfigModel.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, getpages, startClientBundle1, new onExtraCallbackWithResult(function1), list2, list);
        int i2 = onMessageChannelReady + 77;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final long access000() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 13;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            System.currentTimeMillis();
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i3 = onActivityResized + 43;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            return jCurrentTimeMillis;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult implements getIncludeFiles {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function1<ExternalLogItem, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Function1<? super ExternalLogItem, Unit> function1) {
            this.onWarmupCompleted = function1;
        }

        @Override // o.getIncludeFiles
        public void onWarmupCompleted(ExternalLogItem externalLogItem) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(externalLogItem, "");
                this.onWarmupCompleted.invoke(externalLogItem);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(externalLogItem, "");
            this.onWarmupCompleted.invoke(externalLogItem);
            int i3 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final getAppLaunchParams onWarmupCompleted(@NotNull String str, @NotNull LogFeature logFeature, @NotNull LogAction logAction) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logFeature, "");
        Intrinsics.checkNotNullParameter(logAction, "");
        getAppLaunchParams getapplaunchparams = new getAppLaunchParams(str, logFeature, logAction, null, null, null);
        ReentrantReadWriteLock.WriteLock writeLock = IAuthTabCallbackStubProxy.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "");
        writeLock.lock();
        try {
            asBinder = getapplaunchparams;
            Unit unit = Unit.INSTANCE;
            writeLock.unlock();
            int i2 = onActivityResized + 91;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 84 / 0;
            }
            return getapplaunchparams;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppConfigModel appConfigModel = (AppConfigModel) objArr[0];
        getAppLaunchParams getapplaunchparams = (getAppLaunchParams) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getapplaunchparams, "");
        Intrinsics.checkNotNullParameter(str, "");
        appConfigModel.onExtraCallback(str, str2);
        int i4 = onMessageChannelReady + 15;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return null;
    }

    public final void onExtraCallback(@NotNull String str, @Nullable String str2) {
        getAppLaunchParams getapplaunchparamsOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ReentrantReadWriteLock.WriteLock writeLock = IAuthTabCallbackStubProxy.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "");
        writeLock.lock();
        try {
            getAppLaunchParams getapplaunchparams = asBinder;
            if (getapplaunchparams != null) {
                int i2 = onActivityResized + 43;
                onMessageChannelReady = i2 % 128;
                getapplaunchparamsOnNavigationEvent = i2 % 2 != 0 ? getAppLaunchParams.onNavigationEvent(getapplaunchparams, null, null, null, str, str2, null, 71, null) : getAppLaunchParams.onNavigationEvent(getapplaunchparams, null, null, null, str, str2, null, 39, null);
                int i3 = onActivityResized + 49;
                onMessageChannelReady = i3 % 128;
                int i4 = i3 % 2;
            } else {
                getapplaunchparamsOnNavigationEvent = null;
            }
            asBinder = getapplaunchparamsOnNavigationEvent;
            Unit unit = Unit.INSTANCE;
            writeLock.unlock();
            int i5 = onActivityResized + 11;
            onMessageChannelReady = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[Catch: all -> 0x005b, PHI: r1 r2
      0x003b: PHI (r1v7 java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock) = 
      (r1v17 java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock)
      (r1v18 java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock)
     binds: [B:11:0x0039, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r2v3 o.getAppLaunchParams) = (r2v2 o.getAppLaunchParams), (r2v4 o.getAppLaunchParams) binds: [B:11:0x0039, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x005b, blocks: (B:5:0x001f, B:14:0x004a, B:12:0x003b, B:10:0x0037), top: B:20:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[PHI: r1
      0x0049: PHI (r1v10 java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock) = 
      (r1v13 java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock)
      (r1v14 java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock)
     binds: [B:11:0x0039, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.concurrent.locks.Lock] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str) {
        getAppLaunchParams getapplaunchparams;
        ReentrantReadWriteLock.WriteLock writeLock;
        getAppLaunchParams getapplaunchparamsOnNavigationEvent;
        ReentrantReadWriteLock.WriteLock writeLock2;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 25;
        onActivityResized = i2 % 128;
        ?? r1 = i2 % 2;
        try {
            if (r1 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                ReentrantReadWriteLock.WriteLock writeLock3 = IAuthTabCallbackStubProxy.writeLock();
                Intrinsics.checkNotNullExpressionValue(writeLock3, "");
                writeLock3.lock();
                getapplaunchparams = asBinder;
                int i3 = 36 / 0;
                writeLock2 = writeLock3;
                writeLock = writeLock3;
                if (getapplaunchparams != null) {
                    getapplaunchparamsOnNavigationEvent = getAppLaunchParams.onNavigationEvent(getapplaunchparams, null, null, null, null, str, null, 47, null);
                    r1 = writeLock;
                } else {
                    getapplaunchparamsOnNavigationEvent = null;
                    r1 = writeLock2;
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                ReentrantReadWriteLock.WriteLock writeLock4 = IAuthTabCallbackStubProxy.writeLock();
                Intrinsics.checkNotNullExpressionValue(writeLock4, "");
                writeLock4.lock();
                getapplaunchparams = asBinder;
                writeLock2 = writeLock4;
                writeLock = writeLock4;
                if (getapplaunchparams != null) {
                }
            }
            asBinder = getapplaunchparamsOnNavigationEvent;
            Unit unit = Unit.INSTANCE;
            r1.unlock();
            int i4 = onActivityResized + 25;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            r1.unlock();
            throw th;
        }
    }

    public final void onExtraCallback() {
        getAppLaunchParams getapplaunchparamsOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onActivityResized + 37;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        ReentrantReadWriteLock.WriteLock writeLock = IAuthTabCallbackStubProxy.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "");
        writeLock.lock();
        try {
            getAppLaunchParams getapplaunchparams = asBinder;
            if (getapplaunchparams != null) {
                int i4 = onActivityResized + 55;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
                getapplaunchparamsOnNavigationEvent = getAppLaunchParams.onNavigationEvent(getapplaunchparams, null, null, null, null, null, null, 39, null);
                int i6 = onActivityResized + 9;
                onMessageChannelReady = i6 % 128;
                int i7 = i6 % 2;
            } else {
                getapplaunchparamsOnNavigationEvent = null;
            }
            asBinder = getapplaunchparamsOnNavigationEvent;
            Unit unit = Unit.INSTANCE;
        } finally {
            writeLock.unlock();
        }
    }

    public final void access100() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 63;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        access100.set(0L);
        int i4 = onActivityResized + 69;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(AppConfigModel appConfigModel, Context context, String str, Function1 function1, List list, getPages getpages, StartClientBundle1 startClientBundle1, List list2, int i, Object obj) throws Throwable {
        Object[] objArr = {appConfigModel, context, str, function1, list, getpages, startClientBundle1, list2, Integer.valueOf(i), obj};
        IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 39164733, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -39164732);
    }

    public final getPages onExtraCallbackWithResult() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (getPages) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, 1463811278, iOnWarmupCompleted2, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1463811278);
    }

    public final getPermission asInterface() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (getPermission) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, -324282146, iOnWarmupCompleted2, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 324282149);
    }

    public final void onNavigationEvent(@NotNull getAppLaunchParams getapplaunchparams, @NotNull String str, @Nullable String str2) throws Throwable {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this, getapplaunchparams, str, str2}, -541353480, iOnWarmupCompleted2, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 541353482);
    }

    static void IAuthTabCallbackStubProxy() {
        access000 = (char) 43698;
        readTypedObject = (char) 51987;
        writeTypedObject = (char) 41972;
        extraCallback = (char) 17937;
        ICustomTabsCallback = new char[]{32442, 32420, 32465, 32472, 32459, 32432, 32457, 32473, 32437, 32470, 32463, 32476, 32613, 32458, 32471, 32451, 32407, 32447, 32474, 32433, 32478, 32413, 32412, 32479, 32414, 32460, 32464, 32469, 32456};
        extraCallbackWithResult = -1184334011;
        onPostMessage = true;
        onActivityLayout = true;
    }
}
