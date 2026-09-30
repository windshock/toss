package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AlertDialogKtExternalSyntheticLambda6 extends AlertDialogKtExternalSyntheticLambda7 {
    public static final AlertDialogKtExternalSyntheticLambda6 onWarmupCompleted;
    public final List<Uri> IAuthTabCallback;
    public final Map<String, String> IAuthTabCallbackDefault;
    public final List<onExtraCallback> IAuthTabCallbackStub;
    public final List<IAuthTabCallback> access100;
    public final List<IAuthTabCallback> asBinder;
    public final List<BasicTextContextMenuProviderExternalSyntheticLambda0> asInterface;
    public final List<IAuthTabCallback> onExtraCallback;
    public final List<IAuthTabCallback> onExtraCallbackWithResult;
    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent;
    public final List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> onTransact;

    static {
        List list = Collections.EMPTY_LIST;
        onWarmupCompleted = new AlertDialogKtExternalSyntheticLambda6("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public static final class onExtraCallback {
        public final String IAuthTabCallback;
        public final String asBinder;
        public final Uri onExtraCallback;
        public final String onExtraCallbackWithResult;
        public final String onNavigationEvent;
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted;
        private static final byte[] $$a = {117, -24, -14, 98};
        private static final int $$b = 13;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int IAuthTabCallbackStubProxy = 1;
        private static long IAuthTabCallbackStub = -4516728353678145615L;
        private static int asInterface = -1776194565;
        private static char IAuthTabCallbackDefault = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, short s2) {
            int i2;
            int i3 = b * 3;
            byte[] bArr = $$a;
            int i4 = 110 - s2;
            int i5 = 3 - (s * 2);
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i6 = i5;
                int i7 = i3;
                int i8 = 0;
                int i9 = i5 + (-i7);
                i2 = i8;
                int i10 = i6;
                i4 = i9;
                i5 = i10;
                bArr2[i2] = (byte) i4;
                int i11 = i5 + 1;
                i8 = i2 + 1;
                if (i2 == i3) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i11];
                int i12 = i4;
                i6 = i11;
                i5 = i12;
                int i92 = i5 + (-i7);
                i2 = i8;
                int i102 = i6;
                i4 = i92;
                i5 = i102;
                bArr2[i2] = (byte) i4;
                int i112 = i5 + 1;
                i8 = i2 + 1;
                if (i2 == i3) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                int i1122 = i5 + 1;
                i8 = i2 + 1;
                if (i2 == i3) {
                }
            }
        }

        public onExtraCallback(Uri uri, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.onExtraCallback = uri;
            this.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.asBinder = str;
            this.IAuthTabCallback = str2;
            this.onNavigationEvent = str3;
            this.onExtraCallbackWithResult = str4;
        }

        public static onExtraCallback onNavigationEvent(Uri uri) throws Throwable {
            int i2 = 2 % 2;
            BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
            Object[] objArr = new Object[1];
            a((char) (View.MeasureSpec.getMode(0) + 56891), View.MeasureSpec.makeMeasureSpec(0, 0) - 157961110, new char[]{8187}, new char[]{11338, 41525, 22344, 44395}, new char[]{27151, 38324, 15350, 55262}, objArr);
            onExtraCallback onextracallback = new onExtraCallback(uri, onextracallbackwithresult.onExtraCallbackWithResult(((String) objArr[0]).intern()).onNavigationEvent("application/x-mpegURL").onNavigationEvent(), null, null, null, null);
            int i3 = onTransact + 67;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return onextracallback;
        }

        public onExtraCallback onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            int i2 = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.onExtraCallback, basicTextContextMenuProviderKtExternalSyntheticLambda4, this.asBinder, this.IAuthTabCallback, this.onNavigationEvent, this.onExtraCallbackWithResult);
            int i3 = onTransact + 29;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i3 = 2;
            int i4 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i2));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i5 = $10 + 79;
                $11 = i5 % 128;
                int i6 = i5 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 43 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.blue(0)), 43 - Process.getGidForName(""), 1494 - Drawable.resolveOpacity(0, 0), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 50, (Process.myTid() >> 22) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 45848), 29 - Drawable.resolveOpacity(0, 0), 12577 - (KeyEvent.getMaxKeyCode() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L)) ^ ((int) (asInterface ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i7 = $11 + 27;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i9 = $11 + 37;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
        }
    }

    public static final class IAuthTabCallback {
        public final String IAuthTabCallback;
        public final Uri onExtraCallback;
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;
        public final String onWarmupCompleted;

        public IAuthTabCallback(@Nullable Uri uri, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, String str, String str2) {
            this.onExtraCallback = uri;
            this.onExtraCallbackWithResult = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = str2;
        }
    }

    public AlertDialogKtExternalSyntheticLambda6(String str, List<String> list, List<onExtraCallback> list2, List<IAuthTabCallback> list3, List<IAuthTabCallback> list4, List<IAuthTabCallback> list5, List<IAuthTabCallback> list6, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list7, boolean z, Map<String, String> map, List<BasicTextContextMenuProviderExternalSyntheticLambda0> list8) {
        super(str, list, z);
        this.IAuthTabCallback = Collections.unmodifiableList(onExtraCallback(list2, list3, list4, list5, list6));
        this.IAuthTabCallbackStub = Collections.unmodifiableList(list2);
        this.access100 = Collections.unmodifiableList(list3);
        this.onExtraCallback = Collections.unmodifiableList(list4);
        this.asBinder = Collections.unmodifiableList(list5);
        this.onExtraCallbackWithResult = Collections.unmodifiableList(list6);
        this.onNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        this.onTransact = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.IAuthTabCallbackDefault = Collections.unmodifiableMap(map);
        this.asInterface = Collections.unmodifiableList(list8);
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda2
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public AlertDialogKtExternalSyntheticLambda6 onWarmupCompleted(List<AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0> list) {
        String str = this.onPostMessage;
        List<String> list2 = this.onMessageChannelReady;
        List listOnNavigationEvent = onNavigationEvent(this.IAuthTabCallbackStub, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new AlertDialogKtExternalSyntheticLambda6(str, list2, listOnNavigationEvent, list3, onNavigationEvent(this.onExtraCallback, 1, list), onNavigationEvent(this.asBinder, 2, list), list3, this.onNavigationEvent, this.onTransact, this.onActivityLayout, this.IAuthTabCallbackDefault, this.asInterface);
    }

    public static AlertDialogKtExternalSyntheticLambda6 onWarmupCompleted(String str) {
        List listSingletonList = Collections.singletonList(onExtraCallback.onNavigationEvent(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new AlertDialogKtExternalSyntheticLambda6("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List<Uri> onExtraCallback(List<onExtraCallback> list, List<IAuthTabCallback> list2, List<IAuthTabCallback> list3, List<IAuthTabCallback> list4, List<IAuthTabCallback> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).onExtraCallback;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        IAuthTabCallback(list2, arrayList);
        IAuthTabCallback(list3, arrayList);
        IAuthTabCallback(list4, arrayList);
        IAuthTabCallback(list5, arrayList);
        return arrayList;
    }

    private static void IAuthTabCallback(List<IAuthTabCallback> list, List<Uri> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).onExtraCallback;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> onNavigationEvent(List<T> list, int i2, List<AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            T t = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 < list2.size()) {
                    AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0 androidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0 = list2.get(i4);
                    if (androidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0.onExtraCallbackWithResult == i2 && androidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0.onExtraCallback == i3) {
                        arrayList.add(t);
                        break;
                    }
                    i4++;
                }
            }
        }
        return arrayList;
    }
}
