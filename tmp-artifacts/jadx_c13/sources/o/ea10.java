package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import o.access;
import o.ea10;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ea10 {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String IAuthTabCallback;
    static final String IAuthTabCallbackDefault;
    static final String IAuthTabCallbackStub;
    static final ycx14 IAuthTabCallbackStubProxy;
    static final String IAuthTabCallback_Parcel;
    private static char ICustomTabsCallback = 0;
    static final String access000;
    static final String access100;
    static final ycx13 asBinder;
    static final String asInterface;
    private static final String[] extraCallback;
    private static char extraCallbackWithResult = 0;
    static volatile ycx18 getInterfaceDescriptor = null;
    private static int onActivityLayout = 1;
    private static int onActivityResized = 0;
    static final String onExtraCallback;
    static volatile int onExtraCallbackWithResult = 0;
    private static int onMessageChannelReady = 0;
    private static long onMinimized = 0;
    static boolean onNavigationEvent = false;
    private static char onPostMessage = 0;
    private static int onRelationshipValidationResult = 1;
    static final String onTransact;
    static final String onWarmupCompleted;
    static final String readTypedObject;
    private static char writeTypedObject;

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i | i3);
        int i12 = (~(i3 | i)) | (~(i7 | i9)) | i8;
        int i13 = i2 + i + i4 + (62936680 * i5) + ((-2032430997) * i6);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i2) + 797966336 + (1756943451 * i) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i4) + ((-264241152) * i5) + ((-222822400) * i6) + (2040594432 * i14);
        int i16 = ((i2 * 1175661207) - 43826732) + (i * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i4 * 1175660433) + (i5 * 1188219112) + (i6 * (-816965221)) + (i14 * 1798373376);
        int i17 = i15 + (i16 * i16 * 914292736);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onMinimized ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 93;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onMinimized)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 45812), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 84, TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - KeyEvent.getDeadChar(0, 0)), 20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 8760, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 113;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{47817, 3328, 31306, 19907, 14892, 55034, 26813, 36065, 52106, 12597, 50867, 63212, 44736, 47617, 60480, 49851, 35233, 26407, 23843, 65286, 9031, 52811, 51438, 14638, 12823, 55728, 23057, 60166, 47817, 3328, 64147, 13846, 170, 7595, 31407, 10222, 61623, 30784, 21937, 45026, 40344, 47768, 39387, 31325, 57758, 60101, 48347, 38742, 59648, 49804}, 50 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        readTypedObject = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new char[]{63672, 11456, 39483, 13693, 63696, 45099, 41841, 57552, 35511, 9185, 12718, 32011, 7223, 44320, 33914, 36742, 44991, 55487, 2799, 6168, 12578, 19041, 39290, 43714, 50355, 62948, 61426, 10075, 22068, 26402, 29294, 45462, 55732, 37559, 49396, 49744, 27515, 7370, 22347, 23731, 65169, 36440, 42434, 59681, 32787, 14788, 10315, 31677, 4992, 43898, 48839, 62501, 42268}, (Process.myTid() >> 22) + 1, objArr2);
        access000 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{47817, 3328, 31306, 19907, 14892, 55034, 26813, 36065, 52106, 12597, 50867, 63212, 44736, 47617, 60480, 49851, 35233, 26407, 23843, 65286, 9031, 52811, 51438, 14638, 12823, 55728, 23057, 60166, 47817, 3328, 64147, 13846, 63007, 52722, 49015, 10798, 33491, 939, 33667, 6944, 3524, 42631, 37379, 12820, 23389, 36530, 38063, 31718, 46226, 11273}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49, objArr3);
        IAuthTabCallback_Parcel = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{47817, 3328, 31306, 19907, 14892, 55034, 26813, 36065, 52106, 12597, 50867, 63212, 44736, 47617, 60480, 49851, 35233, 26407, 23843, 65286, 9031, 52811, 51438, 14638, 12823, 55728, 23057, 60166, 47817, 3328, 64147, 13846, 43766, 9068, 37816, 60691, 5957, 64528, 63033, 16}, View.combineMeasuredStates(0, 0) + 39, objArr4);
        access100 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new char[]{47817, 3328, 31306, 19907, 14892, 55034, 26813, 36065, 52106, 12597, 50867, 63212, 44736, 47617, 60480, 49851, 35233, 26407, 23843, 65286, 9031, 52811, 51438, 14638, 12823, 55728, 23057, 60166, 47817, 3328, 64147, 13846, 48515, 10194, 1478, 59888, 16959, 48317, 23959, 23337}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 39, objArr5);
        asInterface = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b(new char[]{47699, 5991, 35804, 34111, 47675, 35724, 45718, 20626, 51292, 6214, 8265, 52553, 24284, 38535, 38301, 16324, 60756, 58136, 6920, 43098, 29641, 29126, 34973, 6784, 34392, 52803, 65045, 38681, 5343, 23685, 25481, 468, 39775, 43280, 53523, 29202, 10640, 10059, 18102, 60643, 48251, 46581, 46117, 22858, 49892, 631, 14765, 52207, 20853, 37078, 44839, 17504, 59367, 60781, 7328}, View.combineMeasuredStates(0, 0) + 1, objArr6);
        IAuthTabCallbackDefault = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b(new char[]{56302, 39729, 43499, 17603, 56198, 2010, 37025, 37230, 43489, 37904, 638, 3253, 16225, 6865, 47018, 65080, 36073, 28494, 14655, 27046, 4724, 64912, 43690, 56188, 59365, 16917, 56354, 22245, 30050, 53459, 16830, 49192, 64226, 9542, 62244, 46062, 18477, 43808, 25754, 11566, 56768, 14757, 38407, 39059, 41810, 36387, 7055, 2565}, 1 - Color.alpha(0), objArr7);
        IAuthTabCallbackStub = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b(new char[]{9556, 34592, 364, 38138, 9532, 7115, 14374, 16727, 22363, 34817, 43769, 56460, 49627, 1728, 7981, 11777, 29267, 29535, 37304, 47519, 60622, 57729, 557, 2885, 6495, 24068, 29861, 34524, 35800, 52418, 59705, 4113, 1112, 14679, 23459, 25559, 46743, 46898, 52231, 64811, 9084, 9650, 16006, 18607, 24041, 37384, 45848, 55846, 52846, 183, 9623, 21925, 30947, 32060}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr8);
        onTransact = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a(new char[]{47817, 3328, 31306, 19907, 14892, 55034, 26813, 36065, 52106, 12597, 50867, 63212, 44736, 47617, 60480, 49851, 35233, 26407, 23843, 65286, 9031, 52811, 51438, 14638, 12823, 55728, 23057, 60166, 47817, 3328, 64147, 13846, 35995, 27763, 23389, 36530, 38063, 31718, 53458, 15196, 51490, 6945, 54881, 51871, 39387, 31325, 57758, 60101, 48347, 38742, 59648, 49804}, 51 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
        IAuthTabCallback = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(new char[]{47817, 3328, 31306, 19907, 14892, 55034, 26813, 36065, 52106, 12597, 50867, 63212, 44736, 47617, 60480, 49851, 35233, 26407, 23843, 65286, 9031, 52811, 51438, 14638, 12823, 55728, 23057, 60166, 47817, 3328, 64147, 13846, 39128, 47164, 41639, 58813, 23843, 65286, 44445, 10862, 34695, 32893, 57452, 48629, 53963, 52963, 39448, 10369}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47, objArr10);
        onExtraCallback = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a(new char[]{47817, 3328, 31306, 19907, 14892, 55034, 26813, 36065, 52106, 12597, 50867, 63212, 44736, 47617, 60480, 49851, 35233, 26407, 23843, 65286, 9031, 52811, 51438, 14638, 12823, 55728, 23057, 60166, 47817, 3328, 64147, 13846}, KeyEvent.normalizeMetaState(0) + 32, objArr11);
        onWarmupCompleted = ((String) objArr11[0]).intern();
        IAuthTabCallbackStubProxy = new ycx14();
        asBinder = new ycx13();
        onNavigationEvent = ycx19.onWarmupCompleted("slf4j.detectLoggerNameMismatch");
        extraCallback = new String[]{"2.0"};
        int i = onRelationshipValidationResult + 47;
        onMessageChannelReady = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 33;
            $10 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >> 1];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $11 + 11;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (writeTypedObject ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onPostMessage);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char defaultSize = (char) View.getDefaultSize(i3, i3);
                        int iLastIndexOf = TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', i3, i3) + 11;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, iLastIndexOf, scrollBarSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (extraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ICustomTabsCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16014), ExpandableListView.getPackedPositionChild(0L) + 15, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static List<ycx18> onWarmupCompleted() {
        int i = 2 % 2;
        ServiceLoader serviceLoader = (ServiceLoader) onExtraCallbackWithResult(new Object[]{ea10.class.getClassLoader()}, -1299761871, 1299761874, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        ArrayList arrayList = new ArrayList();
        Iterator it = serviceLoader.iterator();
        int i2 = onActivityResized + 59;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onActivityLayout + 53;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted(arrayList, it);
        }
        return arrayList;
    }

    public static /* synthetic */ ServiceLoader IAuthTabCallback(ClassLoader classLoader) {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(ycx18.class, classLoader);
        int i4 = onActivityResized + 73;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return serviceLoaderLoad;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final ClassLoader classLoader = (ClassLoader) objArr[0];
        int i = 2 % 2;
        if (System.getSecurityManager() != null) {
            return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.slf4j.LoggerFactory$$ExternalSyntheticLambda0
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return ea10.IAuthTabCallback(classLoader);
                }
            });
        }
        int i2 = onActivityLayout + 107;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(ycx18.class, classLoader);
        int i4 = onActivityLayout + 5;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return serviceLoaderLoad;
    }

    private static void onWarmupCompleted(List<ycx18> list, Iterator<ycx18> it) {
        int i = 2 % 2;
        int i2 = onActivityResized + 15;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        try {
            list.add(it.next());
            int i4 = onActivityLayout + 83;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (ServiceConfigurationError e) {
            ycx19.IAuthTabCallback("A SLF4J service provider failed to instantiate:\n" + e.getMessage());
        }
    }

    private ea10() {
    }

    private static final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 33;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(new Object[0], 2073787529, -2073787525, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            if (onExtraCallbackWithResult != 2) {
                return;
            }
        } else {
            onExtraCallbackWithResult(new Object[0], 2073787529, -2073787525, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            if (onExtraCallbackWithResult != 3) {
                return;
            }
        }
        access000();
        int i3 = onActivityLayout + 77;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onActivityLayout = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                List<ycx18> listOnWarmupCompleted = onWarmupCompleted();
                IAuthTabCallback(listOnWarmupCompleted);
                if (listOnWarmupCompleted != null && !listOnWarmupCompleted.isEmpty()) {
                    int i3 = onActivityResized + 37;
                    onActivityLayout = i3 % 128;
                    if (i3 % 2 == 0) {
                        getInterfaceDescriptor = listOnWarmupCompleted.get(0);
                        onExtraCallbackWithResult = 2;
                    } else {
                        getInterfaceDescriptor = listOnWarmupCompleted.get(0);
                        onExtraCallbackWithResult = 3;
                    }
                    onWarmupCompleted(listOnWarmupCompleted);
                } else {
                    onExtraCallbackWithResult = 4;
                    ycx19.IAuthTabCallback("No SLF4J providers were found.");
                    ycx19.IAuthTabCallback("Defaulting to no-operation (NOP) logger implementation");
                    ycx19.IAuthTabCallback("See https://www.slf4j.org/codes.html#noProviders for further details.");
                    IAuthTabCallback((Set<URL>) onExtraCallbackWithResult(new Object[0], -1484470089, 1484470089, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback()));
                    int i4 = onActivityResized + 119;
                    onActivityLayout = i4 % 128;
                    int i5 = i4 % 2;
                }
                asBinder();
                return null;
            }
            IAuthTabCallback(onWarmupCompleted());
            throw null;
        } catch (Exception e) {
            IAuthTabCallback(e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        }
    }

    private static void IAuthTabCallback(Set<URL> set) {
        int i = 2 % 2;
        int i2 = onActivityResized + 55;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
            if (set.isEmpty()) {
                return;
            }
        } else if (set.isEmpty()) {
            return;
        }
        ycx19.IAuthTabCallback("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator<URL> it = set.iterator();
        while (it.hasNext()) {
            ycx19.IAuthTabCallback("Ignoring binding found at [" + it.next() + "]");
            int i4 = onActivityLayout + 77;
            onActivityResized = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
        }
        ycx19.IAuthTabCallback("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws IOException {
        Enumeration<URL> resources;
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = ea10.class.getClassLoader();
            if (classLoader == null) {
                int i2 = onActivityLayout + 75;
                onActivityResized = i2 % 128;
                int i3 = i2 % 2;
                resources = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
            } else {
                resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            }
            while (resources.hasMoreElements()) {
                int i4 = onActivityLayout + 113;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                linkedHashSet.add(resources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e) {
            ycx19.onWarmupCompleted("Error getting resources from path", e);
            return linkedHashSet;
        }
    }

    private static void asBinder() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 81;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact();
            IAuthTabCallback_Parcel();
            IAuthTabCallbackStubProxy.onExtraCallbackWithResult().onExtraCallback();
        } else {
            onTransact();
            IAuthTabCallback_Parcel();
            IAuthTabCallbackStubProxy.onExtraCallbackWithResult().onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void onTransact() {
        ycx14 ycx14Var = IAuthTabCallbackStubProxy;
        synchronized (ycx14Var) {
            ycx14Var.onExtraCallbackWithResult().onNavigationEvent();
            for (ycx161 ycx161Var : ycx14Var.onExtraCallbackWithResult().onWarmupCompleted()) {
                ycx161Var.onWarmupCompleted(onExtraCallbackWithResult(ycx161Var.onExtraCallbackWithResult()));
            }
        }
    }

    static void IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 119;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult = 2;
        ycx19.onWarmupCompleted("Failed to instantiate SLF4J LoggerFactory", th);
        int i4 = onActivityResized + 59;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    private static void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        LinkedBlockingQueue<ea9> linkedBlockingQueueOnExtraCallbackWithResult = IAuthTabCallbackStubProxy.onExtraCallbackWithResult().onExtraCallbackWithResult();
        int size = linkedBlockingQueueOnExtraCallbackWithResult.size();
        ArrayList<ea9> arrayList = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueueOnExtraCallbackWithResult.drainTo(arrayList, 128) != 0) {
            for (ea9 ea9Var : arrayList) {
                int i3 = onActivityResized + Imgproc.COLOR_YUV2RGB_YVYU;
                onActivityLayout = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback(ea9Var);
                if (i2 == 0) {
                    onExtraCallbackWithResult(new Object[]{ea9Var, Integer.valueOf(size)}, 2126101805, -2126101803, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                    int i5 = onActivityLayout + 113;
                    onActivityResized = i5 % 128;
                    int i6 = i5 % 2;
                }
                i2++;
                int i7 = onActivityResized + 111;
                onActivityLayout = i7 % 128;
                int i8 = i7 % 2;
            }
            arrayList.clear();
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ea9 ea9Var = (ea9) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 25;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (ea9Var.onExtraCallbackWithResult().IAuthTabCallbackDefault()) {
            onExtraCallbackWithResult(new Object[]{Integer.valueOf(iIntValue)}, -1639769180, 1639769181, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            return null;
        }
        if (!ea9Var.onExtraCallbackWithResult().asBinder()) {
            asInterface();
            return null;
        }
        int i4 = onActivityLayout + 75;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r1.IAuthTabCallbackDefault() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r1.IAuthTabCallbackDefault() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r1.onWarmupCompleted(r5.onExtraCallback()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r1.onWarmupCompleted(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        o.ycx19.IAuthTabCallback(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void IAuthTabCallback(ea9 ea9Var) {
        int i = 2 % 2;
        if (ea9Var != null) {
            ycx161 ycx161VarOnExtraCallbackWithResult = ea9Var.onExtraCallbackWithResult();
            String strOnExtraCallbackWithResult = ycx161VarOnExtraCallbackWithResult.onExtraCallbackWithResult();
            if (ycx161VarOnExtraCallbackWithResult.IAuthTabCallbackStub()) {
                throw new IllegalStateException("Delegate logger cannot be null at this state.");
            }
            int i2 = onActivityLayout + 21;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                if (!ycx161VarOnExtraCallbackWithResult.asBinder()) {
                    int i3 = onActivityLayout + Imgproc.COLOR_YUV2RGBA_YVYU;
                    onActivityResized = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 34 / 0;
                    }
                }
            } else {
                ycx161VarOnExtraCallbackWithResult.asBinder();
                throw null;
            }
        }
        int i5 = onActivityLayout + 53;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void asInterface() {
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            ycx19.IAuthTabCallback("The following set of substitute loggers may have been accessed");
            ycx19.IAuthTabCallback("during the initialization phase. Logging calls during this");
            ycx19.IAuthTabCallback("phase were not honored. However, subsequent logging calls to these");
            ycx19.IAuthTabCallback("loggers will work as normally expected.");
            ycx19.IAuthTabCallback("See also https://www.slf4j.org/codes.html#substituteLogger");
            int i3 = 25 / 0;
        } else {
            ycx19.IAuthTabCallback("The following set of substitute loggers may have been accessed");
            ycx19.IAuthTabCallback("during the initialization phase. Logging calls during this");
            ycx19.IAuthTabCallback("phase were not honored. However, subsequent logging calls to these");
            ycx19.IAuthTabCallback("loggers will work as normally expected.");
            ycx19.IAuthTabCallback("See also https://www.slf4j.org/codes.html#substituteLogger");
        }
        int i4 = onActivityLayout + 21;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        ycx19.IAuthTabCallback("A number (" + ((Number) objArr[0]).intValue() + ") of logging calls during the initialization phase have been intercepted and are");
        ycx19.IAuthTabCallback("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        ycx19.IAuthTabCallback("See also https://www.slf4j.org/codes.html#replay");
        int i2 = onActivityLayout + 115;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final void access000() {
        String strOnNavigationEvent;
        String[] strArr;
        int length;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 83;
        onActivityLayout = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                strOnNavigationEvent = getInterfaceDescriptor.onNavigationEvent();
                strArr = extraCallback;
                length = strArr.length;
                i = 1;
                z = false;
            } else {
                strOnNavigationEvent = getInterfaceDescriptor.onNavigationEvent();
                strArr = extraCallback;
                length = strArr.length;
                i = 0;
                z = false;
            }
            while (i < length) {
                if (strOnNavigationEvent.startsWith(strArr[i])) {
                    int i4 = onActivityLayout + 113;
                    int i5 = i4 % 128;
                    onActivityResized = i5;
                    z = i4 % 2 == 0;
                    int i6 = i5 + 65;
                    onActivityLayout = i6 % 128;
                    int i7 = i6 % 2;
                }
                i++;
            }
            if (z) {
                return;
            }
            ycx19.IAuthTabCallback("The requested version " + strOnNavigationEvent + " by your slf4j binding is not compatible with " + Arrays.asList(extraCallback).toString());
            ycx19.IAuthTabCallback("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            ycx19.onWarmupCompleted("Unexpected problem occured during version sanity check", th);
        }
    }

    private static boolean onExtraCallback(List<ycx18> list) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        if (list.size() > 1) {
            int i4 = onActivityLayout + 3;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onActivityLayout + 59;
        onActivityResized = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return false;
    }

    private static void IAuthTabCallback(List<ycx18> list) {
        int i = 2 % 2;
        if (onExtraCallback(list)) {
            int i2 = onActivityResized + 21;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            ycx19.IAuthTabCallback("Class path contains multiple SLF4J providers.");
            Iterator<ycx18> it = list.iterator();
            while (it.hasNext()) {
                ycx19.IAuthTabCallback("Found provider [" + it.next() + "]");
                int i4 = onActivityLayout + 65;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
            }
            ycx19.IAuthTabCallback("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
            int i6 = onActivityResized + 35;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static void onWarmupCompleted(List<ycx18> list) {
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (list.isEmpty()) {
            return;
        }
        int i4 = onActivityLayout + 83;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        if (onExtraCallback(list)) {
            ycx19.IAuthTabCallback("Actual provider is of type [" + list.get(0) + "]");
        }
    }

    public static AppSetIdAndScope1 onExtraCallbackWithResult(String str) {
        AppSetIdAndScope1 appSetIdAndScope1OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onActivityLayout + 103;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            appSetIdAndScope1OnWarmupCompleted = onNavigationEvent().onWarmupCompleted(str);
            int i3 = 59 / 0;
        } else {
            appSetIdAndScope1OnWarmupCompleted = onNavigationEvent().onWarmupCompleted(str);
        }
        int i4 = onActivityLayout + 61;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return appSetIdAndScope1OnWarmupCompleted;
    }

    public static AppSetIdAndScope1 onWarmupCompleted(Class<?> cls) {
        Class<?> clsOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = onExtraCallbackWithResult(cls.getName());
        if (onNavigationEvent && (clsOnWarmupCompleted = ycx19.onWarmupCompleted()) != null) {
            int i4 = onActivityResized + 23;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                if (onNavigationEvent(cls, clsOnWarmupCompleted)) {
                    ycx19.IAuthTabCallback(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", appSetIdAndScope1OnExtraCallbackWithResult.onExtraCallbackWithResult(), clsOnWarmupCompleted.getName()));
                    ycx19.IAuthTabCallback("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
                }
            } else {
                onNavigationEvent(cls, clsOnWarmupCompleted);
                throw null;
            }
        }
        int i5 = onActivityResized + 123;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return appSetIdAndScope1OnExtraCallbackWithResult;
    }

    private static boolean onNavigationEvent(Class<?> cls, Class<?> cls2) {
        int i = 2 % 2;
        int i2 = onActivityResized + 61;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !cls2.isAssignableFrom(cls);
        int i4 = onActivityResized + Imgproc.COLOR_YUV2RGBA_YVYU;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static ea61 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityResized + 49;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        ea61 ea61VarIAuthTabCallback = IAuthTabCallback().IAuthTabCallback();
        int i4 = onActivityLayout + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return ea61VarIAuthTabCallback;
    }

    static ycx18 IAuthTabCallback() {
        if (onExtraCallbackWithResult == 0) {
            synchronized (ea10.class) {
                if (onExtraCallbackWithResult == 0) {
                    onExtraCallbackWithResult = 1;
                    IAuthTabCallbackStub();
                }
            }
        }
        int i = onExtraCallbackWithResult;
        if (i == 1) {
            return IAuthTabCallbackStubProxy;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return getInterfaceDescriptor;
        }
        if (i == 4) {
            return asBinder;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static final void IAuthTabCallbackDefault() {
        onExtraCallbackWithResult(new Object[0], 2073787529, -2073787525, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static void onExtraCallbackWithResult(ea9 ea9Var, int i) {
        onExtraCallbackWithResult(new Object[]{ea9Var, Integer.valueOf(i)}, 2126101805, -2126101803, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static void onExtraCallbackWithResult(int i) {
        onExtraCallbackWithResult(new Object[]{Integer.valueOf(i)}, -1639769180, 1639769181, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    static Set<URL> onExtraCallbackWithResult() {
        return (Set) onExtraCallbackWithResult(new Object[0], -1484470089, 1484470089, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static ServiceLoader<ycx18> onNavigationEvent(ClassLoader classLoader) {
        return (ServiceLoader) onExtraCallbackWithResult(new Object[]{classLoader}, -1299761871, 1299761874, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    static void onExtraCallback() {
        extraCallbackWithResult = (char) 53069;
        ICustomTabsCallback = (char) 32385;
        writeTypedObject = (char) 25773;
        onPostMessage = (char) 6951;
        onMinimized = -2643490108921354349L;
    }
}
