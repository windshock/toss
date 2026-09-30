package o;

import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdakSJKa4RMkEAGCUl5MvtfoJNzSuU {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static boolean IAuthTabCallbackStub = false;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final r8lambdakSJKa4RMkEAGCUl5MvtfoJNzSuU onExtraCallback;
    private static final List<String> onExtraCallbackWithResult;
    private static final Set<String> onNavigationEvent;
    private static boolean onTransact;
    private static int onWarmupCompleted;

    private r8lambdakSJKa4RMkEAGCUl5MvtfoJNzSuU() {
    }

    static {
        onWarmupCompleted();
        onExtraCallback = new r8lambdakSJKa4RMkEAGCUl5MvtfoJNzSuU();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -127, -121, -122, -123, -124, -125, -126, -127}, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-127, -127, -121, -122, -124, -118, -119, -120, -123, -124, -127}, 127 - View.resolveSize(0, 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-127, -127, -121, -122, -127, -124, -119, -122, -119, -123, -126, -118, -124, -127}, TextUtils.lastIndexOf("", '0', 0, 0) + 128, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-127, -127, -121, -122, -114, -115, -116, -117}, TextUtils.lastIndexOf("", '0', 0, 0) + 128, objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-127, -127, -121, -122, -115, -119}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-124, -122, -116, -120, -119, -123, -125, -113, -127, -127, -121, -122, -115, -119}, 127 - ((Process.getThreadPriority(0) + 20) >> 6), objArr6);
        String strIntern6 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-127, -127, -121, -122, -113, -110, -119, -124, -111, -119, -117, -121, -112}, ExpandableListView.getPackedPositionGroup(0L) + 127, objArr7);
        onNavigationEvent = clearFaultAdjacentMetadata.onExtraCallback(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, ((String) objArr7[0]).intern()});
        onExtraCallbackWithResult = CollectionsKt.listOf(new String[]{"supertoss-", "servicetoss-", "securitiestoss-", "banktoss-", "intoss-", "mobileid-toss-"});
        int i = IAuthTabCallbackDefault + 51;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final boolean IAuthTabCallback(@Nullable Uri uri) {
        String scheme;
        int i = 2 % 2;
        if (uri != null && (scheme = uri.getScheme()) != null) {
            if (onNavigationEvent.contains(scheme)) {
                int i2 = IAuthTabCallbackStubProxy + 121;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            List<String> list = onExtraCallbackWithResult;
            Object obj = null;
            if (list instanceof Collection) {
                int i4 = IAuthTabCallbackStubProxy + 3;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    list.isEmpty();
                    obj.hashCode();
                    throw null;
                }
                if (list.isEmpty()) {
                    return false;
                }
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(scheme, (String) it.next(), false, 2, (Object) null)) {
                    int i5 = IAuthTabCallbackStubProxy + 67;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 77 - Color.alpha(0), ExpandableListView.getPackedPositionChild(0L) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 75 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i4 = 1052772399;
        if (IAuthTabCallbackStub) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $10 + 77;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, 12214 - KeyEvent.normalizeMetaState(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 55;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] + iIntValue);
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i10 = $11 + 65;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 117;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.alpha(0) + 63, 12214 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{32570, 32568, 32517, 32520, 32571, 32569, 32518, 32575, 32524, 32522, 32523, 32532, 32519, 32514, 32704, 32512, 32513, 32521};
        onWarmupCompleted = -1184333899;
        onTransact = true;
        IAuthTabCallbackStub = true;
    }
}
