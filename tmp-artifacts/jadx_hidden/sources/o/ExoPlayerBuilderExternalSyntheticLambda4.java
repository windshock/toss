package o;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda4 {
    private static char IAuthTabCallback = 0;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static char IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static boolean asBinder = false;
    private static char asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static boolean onTransact;
    private static long onWarmupCompleted;

    public static List<List<String>> onExtraCallback() throws Throwable {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            char c = 0;
            Object[] objArr = new Object[1];
            int i2 = 1;
            onWarmupCompleted("㋷㏹尿Ꮛ龜侇蔄\uffd1ᕨ烹萜쐍٩\ue3f8쿹㊯ತ灗䕇៦ﺝ朗ꟕ\ue88c咂瓦", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16778), "鶳\uf648謧ቁ", TextUtils.getOffsetAfter("", 0), "\u0000\u0000\u0000\u0000", objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            onWarmupCompleted("㉶\udf8b朖ṗ\uea9d큚㿂뒅彋䏸뤇녇낃\udb99퓴鉜\ue267\uf579", (char) (31841 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "⽈⋢懔詼", TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", objArr2);
            Object objInvoke = cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = access000;
            int i4 = i3 + 53;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 101;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr3 = new Object[1];
                onExtraCallback(127 - ExpandableListView.getPackedPositionGroup(0L), null, null, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                onExtraCallback(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0084\u008a\u008d\u0081\u0082\u0081\u0090\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0089\u008a\u008d", objArr4);
                PackageManager packageManager = (PackageManager) cls2.getMethod((String) objArr4[0], null).invoke(objInvoke, null);
                try {
                    Object[] objArr5 = new Object[1];
                    onExtraCallback((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, "\u0084\u008a\u008d\u0081\u0082\u0081\u0090\u008a\u008d\u0081\u008f\u0088\u0081\u008e\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                    Class<?> cls3 = Class.forName((String) objArr5[0]);
                    Object[] objArr6 = new Object[1];
                    onExtraCallback("\uebaeᚎ洛豁ﶠ뢃ﮄᙇ즐ꫛ㵿喧쏸枅鹘枃싕﵃᧾啄긓\uf4bdﶠ뢃", 24 - View.MeasureSpec.getSize(0), objArr6);
                    List list = (List) cls3.getMethod((String) objArr6[0], Integer.TYPE).invoke(packageManager, 0);
                    if (list.size() > 0) {
                        int i8 = access000 + 57;
                        access100 = i8 % 128;
                        if (i8 % 2 != 0) {
                            list.iterator();
                            throw new ArithmeticException();
                        }
                        for (Object obj : list) {
                            Object[] objArr7 = new Object[1];
                            onExtraCallback(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, null, null, "\u008a\u0092\u0081\u0093\u008a\u008d\u0081\u008f\u0088\u0081\u0091", objArr7);
                            Object obj2 = PackageItemInfo.class.getField((String) objArr7[0]).get(obj);
                            if (obj2 != null) {
                                arrayList.add(obj2);
                            }
                            Object[] objArr8 = new Object[1];
                            onExtraCallback(127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, "\u0085\u0097\u0082\u0096\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0095\u0091\u0091\u0094\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr8);
                            Class<?> cls4 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            onExtraCallback(127 - View.resolveSizeAndState(0, 0, 0), null, null, "\u008a\u0092\u0081\u0093\u0098\u0098\u0081\u0095\u0088", objArr9);
                            Object obj3 = cls4.getField((String) objArr9[0]).get(obj);
                            if (obj3 != null) {
                                arrayList2.add(obj3);
                            }
                        }
                    } else {
                        Object[] objArr10 = new Object[1];
                        onWarmupCompleted("래嗌ꈧ״\u0bc9鲤\ue14f䂉崔⥳\uda5aㄈ့叶뉺ꖩ颢垕\ue186䪕\uebd2\uec97鱺ㅳ壵箄", (char) (View.resolveSizeAndState(0, 0, 0) + 26717), "鬱\ued63崋\ue668", View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", objArr10);
                        try {
                            Object[] objArr11 = {(String) objArr10[0]};
                            Object[] objArr12 = new Object[1];
                            onExtraCallback("䇧맱នࡃ쮾ộ缀銭症\udb01\uee72\u09bb绵긏板䝂\uf740㏠\uf371ᮔ\uee72\u09bb", (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, objArr12);
                            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities((Intent) Class.forName((String) objArr12[0]).getDeclaredConstructor(String.class).newInstance(objArr11), 0)) {
                                int i9 = access100 + 5;
                                access000 = i9 % 128;
                                int i10 = i9 % 2;
                                Object[] objArr13 = new Object[i2];
                                onExtraCallback(AndroidCharacter.getMirror('0') + 'O', null, null, "\u0085\u0097\u0082\u0096\u008a\u009a\u0095\u0085\u0098\u008a\u0099\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr13);
                                Class<?> cls5 = Class.forName((String) objArr13[c]);
                                Object[] objArr14 = new Object[i2];
                                onExtraCallback("庯༶巨⾎淼ꃒ･墂\uf740㏠叛朳", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, objArr14);
                                ApplicationInfo applicationInfo = ((ComponentInfo) cls5.getField((String) objArr14[c]).get(resolveInfo)).applicationInfo;
                                Object[] objArr15 = new Object[i2];
                                onExtraCallback(128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0085\u0097\u0082\u0096\u008a\u009a\u0095\u0085\u0098\u008a\u0099\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr15);
                                Class<?> cls6 = Class.forName((String) objArr15[c]);
                                Object[] objArr16 = new Object[1];
                                onExtraCallback("庯༶巨⾎淼ꃒ･墂\uf740㏠叛朳", 11 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr16);
                                Object obj4 = cls6.getField((String) objArr16[0]).get(resolveInfo);
                                Object[] objArr17 = new Object[1];
                                onExtraCallback(Color.blue(0) + 127, null, null, "\u008a\u0092\u0081\u0093\u008a\u008d\u0081\u008f\u0088\u0081\u0091", objArr17);
                                Object obj5 = PackageItemInfo.class.getField((String) objArr17[0]).get(obj4);
                                if (obj5 != null) {
                                    int i11 = access000 + 55;
                                    access100 = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        arrayList.add(obj5);
                                        throw new ArithmeticException();
                                    }
                                    arrayList.add(obj5);
                                }
                                Object[] objArr18 = new Object[1];
                                onExtraCallback(127 - (Process.myTid() >> 22), null, null, "\u0085\u0097\u0082\u0096\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0095\u0091\u0091\u0094\u0087\u0092\u0091\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr18);
                                Class<?> cls7 = Class.forName((String) objArr18[0]);
                                Object[] objArr19 = new Object[1];
                                onExtraCallback(TextUtils.lastIndexOf("", '0') + 128, null, null, "\u008a\u0092\u0081\u0093\u0098\u0098\u0081\u0095\u0088", objArr19);
                                Object obj6 = cls7.getField((String) objArr19[0]).get(applicationInfo);
                                if (obj6 != null) {
                                    arrayList2.add(obj6);
                                }
                                c = 0;
                                i2 = 1;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (Exception unused) {
        }
        arrayList3.add(arrayList);
        arrayList3.add(arrayList2);
        return arrayList3;
    }

    private static void onExtraCallback(String str, int i, Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        AssetDataSourceAssetDataSourceException assetDataSourceAssetDataSourceException = new AssetDataSourceAssetDataSourceException();
        char[] cArr = new char[charArray.length];
        assetDataSourceAssetDataSourceException.onExtraCallback = 0;
        char[] cArr2 = new char[2];
        while (assetDataSourceAssetDataSourceException.onExtraCallback < charArray.length) {
            cArr2[0] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback];
            cArr2[1] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStub - 3974139103868117988L)))) ^ ((c2 >>> 5) + ((char) (IAuthTabCallbackStubProxy - 3974139103868117988L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - (((c3 >>> 5) + ((char) (IAuthTabCallbackDefault - 3974139103868117988L))) ^ ((c3 + i2) ^ ((c3 << 4) + ((char) (asInterface - 3974139103868117988L))))));
                i2 -= 40503;
            }
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback] = cArr2[0];
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback + 1] = cArr2[1];
            assetDataSourceAssetDataSourceException.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr, 0, i);
    }

    private static void onWarmupCompleted(String str, char c, String str2, int i, String str3, Object[] objArr) {
        char[] charArray;
        int i2 = 2 % 2;
        char[] charArray2 = str3 == null ? str3 : str3.toCharArray();
        char[] charArray3 = str2 == null ? str2 : str2.toCharArray();
        if (str != null) {
            charArray = str.toCharArray();
            int i3 = getInterfaceDescriptor + 113;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            charArray = str;
        }
        NetworkTypeObserverReceiverExternalSyntheticLambda0 networkTypeObserverReceiverExternalSyntheticLambda0 = new NetworkTypeObserverReceiverExternalSyntheticLambda0();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent = 0;
        int i5 = getInterfaceDescriptor + 19;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        while (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent < length3) {
            int i7 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 2) % 4;
            int i8 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 3) % 4;
            networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted = (char) (((cArr[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent % 4] * 32718) + cArr2[i7]) % 65535);
            cArr2[i8] = (char) (((cArr[i8] * 32718) + cArr2[i7]) / 65535);
            cArr[i8] = networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted;
            cArr3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent] = (char) ((((cArr[i8] ^ r3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent]) ^ (onWarmupCompleted ^ 5161337353776785399L)) ^ ((int) (onNavigationEvent ^ 5161337353776785399L))) ^ ((char) (IAuthTabCallback ^ 5161337353776785399L)));
            networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent++;
        }
        objArr[0] = new String(cArr3);
    }

    private static void onExtraCallback(int i, String str, int[] iArr, String str2, Object[] objArr) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda1 utilExternalSyntheticLambda1 = new UtilExternalSyntheticLambda1();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (cArr2[i2] - 3038365681431118716L);
            }
            cArr2 = cArr3;
        }
        int i3 = (int) (onExtraCallback - 3038365681431118716L);
        if (onTransact) {
            utilExternalSyntheticLambda1.onNavigationEvent = bArr.length;
            char[] cArr4 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
            utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
            while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                cArr4[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[bArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] + i] - i3);
                utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (asBinder) {
            utilExternalSyntheticLambda1.onNavigationEvent = cArr.length;
            char[] cArr5 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
            utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
            while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                cArr5[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[cArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i] - i3);
                utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        utilExternalSyntheticLambda1.onNavigationEvent = iArr.length;
        char[] cArr6 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
        utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
        while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
            cArr6[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[iArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i] - i3);
            utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
        }
        objArr[0] = new String(cArr6);
    }

    static {
        onExtraCallbackWithResult();
        onWarmupCompleted = 5161337353776785399L;
        onNavigationEvent = -472400288;
        IAuthTabCallback = (char) 59383;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{33783, 33796, 33786, 33800, 33797, 33791, 33732, 33785, 33802, 33787, 33753, 33806, 33789, 33766, 33793, 33763, 33798, 33795, 33764, 33751, 33794, 33759, 33788, 33801, 33768, 33804};
        onExtraCallback = 1131447190;
        asBinder = true;
        onTransact = true;
        asInterface = (char) 4350;
        IAuthTabCallbackDefault = (char) 49940;
        IAuthTabCallbackStub = (char) 48312;
        IAuthTabCallbackStubProxy = (char) 50058;
    }
}
