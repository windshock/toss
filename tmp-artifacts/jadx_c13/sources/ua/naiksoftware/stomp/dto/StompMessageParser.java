package ua.naiksoftware.stomp.dto;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StompMessageParser {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    public static final StompMessageParser INSTANCE;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        onWarmupCompleted();
        INSTANCE = new StompMessageParser();
        int i = onNavigationEvent + 59;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private StompMessageParser() {
    }

    public final StompMessage from(@Nullable String str) throws Throwable {
        Object obj;
        int i;
        int i2 = 2 % 2;
        if (str != null) {
            int length = str.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                int i4 = onExtraCallback;
                int i5 = i4 + 27;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (z) {
                    i = length;
                } else {
                    int i7 = i4 + 63;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    i = i3;
                }
                boolean z2 = Intrinsics.compare((int) str.charAt(i), 32) <= 0;
                if (!z) {
                    int i9 = onExtraCallback + 17;
                    int i10 = i9 % 128;
                    onExtraCallbackWithResult = i10;
                    if (i9 % 2 != 0) {
                        int i11 = 49 / 0;
                        if (z2) {
                            i3++;
                        } else {
                            int i12 = i10 + 55;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            z = true;
                        }
                    } else if (!z2) {
                        int i122 = i10 + 55;
                        onExtraCallback = i122 % 128;
                        int i132 = i122 % 2;
                        z = true;
                    } else {
                        i3++;
                    }
                } else {
                    if (!z2) {
                        break;
                    }
                    length--;
                }
            }
            if (str.subSequence(i3, length + 1).toString().length() != 0) {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"\n\n"}, false, 2, 2, (Object) null);
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{"\n"}, false, 0, 6, (Object) null);
                String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(listSplit$default2);
                List listDrop = CollectionsKt___CollectionsKt.drop(listSplit$default2, 1);
                String strRemoveSuffix = listSplit$default.size() > 1 ? StringsKt__StringsKt.removeSuffix((String) listSplit$default.get(1), (CharSequence) "\u0000") : null;
                List list = listDrop;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{":"}, false, 2, 2, (Object) null);
                    String str3 = (String) listSplit$default3.get(0);
                    if (1 < listSplit$default3.size()) {
                        obj = listSplit$default3.get(1);
                        int i14 = onExtraCallbackWithResult + 75;
                        onExtraCallback = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        obj = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    arrayList.add(new StompHeader(str3, (String) obj));
                }
                return new StompMessage(str2, arrayList, strRemoveSuffix);
            }
        }
        Object[] objArr = new Object[1];
        a(new int[]{0, 7, 0, 3}, false, new byte[]{1, 0, 1, 1, 1, 1, 1}, objArr);
        return new StompMessage(((String) objArr[0]).intern(), null, str);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Color.argb(0, 0, 0, 0)), View.resolveSize(0, 0) + 35, View.getDefaultSize(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
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
                int i8 = $11 + 55;
                $10 = i8 % 128;
                if (i8 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 0) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10934), 65 - (ViewConfiguration.getTapTimeout() >> 16), 16718 - (ViewConfiguration.getScrollBarSize() >> 8), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), Gravity.getAbsoluteGravity(0, 0) + 29, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49468), (ViewConfiguration.getPressedStateDuration() >> 16) + 70, 12486 - View.MeasureSpec.makeMeasureSpec(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i11, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i12 = $11 + 21;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] + iArr[4]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent - 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{27241, 27165, 27164, 27167, 27167, 27138, 27138};
    }
}
